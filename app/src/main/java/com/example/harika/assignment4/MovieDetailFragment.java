package com.example.harika.assignment4;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.facebook.common.util.UriUtil;
import com.facebook.drawee.view.SimpleDraweeView;

public class MovieDetailFragment extends Fragment {
    private static final String ARG_MOVIE = "movie";
    private HashMap<String, ?> m1;
    TextView movieTitle;
    TextView movieRating;
    TextView movieReleaseDate;
    TextView movieSynopsis;
    TextView movieId;
    SimpleDraweeView moviePosterImage;
    List<Map<String, ?>> moviesList;
    MovieData movieBean;
    public static MovieDetailFragment newInstance(HashMap<String,?> m1)
    {
        MovieDetailFragment fragment = new MovieDetailFragment();
        Bundle args = new Bundle();
        args.putSerializable(ARG_MOVIE,m1);
        fragment.setArguments(args);
        return fragment;
    }

    public MovieDetailFragment() {
        // Required empty public constructor
    }
   @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            m1 = ((HashMap<String,?>)getArguments().getSerializable(ARG_MOVIE));}
    }
    @Override
    public void onSaveInstanceState(Bundle outState)
    {
        super.onSaveInstanceState(outState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Log.d("inside movie detail","Came");
//        Log.d("moviwe",String.valueOf(movie.size()));
        if(m1 == null)
        {
            movieBean = new MovieData();
            moviesList = movieBean.getMoviesList();
        }
       // HashMap<String,?> m1 = (HashMap) moviesList.get(0);

        Log.d("Container",String.valueOf(container));

      //  movie = (HashMap<String, ?>)moviesList;
        View detailView = inflater.inflate(R.layout.fragment_movie_detail, container, false);
      movieTitle = (TextView)detailView.findViewById(R.id.movieTitle);
      movieReleaseDate = (TextView)detailView.findViewById(R.id.movieReleaseDate);
     movieRating = (TextView) detailView.findViewById(R.id.movieRating);
        movieSynopsis = (TextView) detailView.findViewById(R.id.movieSynopsis);
        moviePosterImage = detailView.findViewById(R.id.movieImage);
       movieId = (TextView)detailView.findViewById(R.id.movieId);
       // movieTitle.setText((CharSequence) m1.get("title"));
        StringBuffer voteAverage = new StringBuffer(String.valueOf(m1.get("voteAverage")));
        movieRating.setText(voteAverage.append("/10"));
        StringBuffer idvalue = new StringBuffer(String.valueOf(m1.get("id")));
        String idText = "MOVIE ID : ";
       movieId.setText(idText.concat(idvalue.toString()));
        movieReleaseDate.setText((CharSequence) m1.get("release").toString());
        movieSynopsis.setText((CharSequence) m1.get("overview"));

     Uri poster_uri = new Uri.Builder()
                .scheme(UriUtil.LOCAL_RESOURCE_SCHEME) // "res"
                .path(String.valueOf(m1.get("image")))
                .build();

        Log.d("poster_uri",String.valueOf(poster_uri));
        moviePosterImage.setImageURI(poster_uri);

        movieTitle.setText((CharSequence) m1.get("title"));

        return detailView;
    }


}
