package com.example.harika.assignment4;

import android.content.Context;
import android.support.annotation.BoolRes;
import android.support.annotation.StringDef;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Harika on 9/24/2017.
 */

public class MyRecyclerViewAdapter extends RecyclerView.Adapter<MyRecyclerViewAdapter.ViewHolder> {
    private List<Map<String,?>> mDataset;
    private Context mContext;
    public OnItemClickListener mitemClickListener;
    public CheckBox cSelected;

    public MyRecyclerViewAdapter(Context myContext,List<Map<String,?>> myDataset)
    {
        mContext = myContext;
        mDataset = myDataset;
    }
    public interface OnItemClickListener{
         public void onItemClick(View view,int position);
        public void onItemLongClick(View view,int position);

    }


    public void setOnItemClickListener(final OnItemClickListener mitemClickListener){
       this.mitemClickListener = mitemClickListener;
    }


    @Override
    public int getItemViewType(int position)
    {
        return position%3;
    }

    @Override
    public MyRecyclerViewAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v ;

        switch (viewType) {
            case 0:
                v = LayoutInflater.from(parent.getContext()).
                        inflate(R.layout.cardview, parent, false);

                return new ViewHolder(v);
            case 1:
                v = LayoutInflater.from(parent.getContext()).
                        inflate(R.layout.cardview_one, parent, false);

                return new ViewHolder(v);
            case 2:
                v = LayoutInflater.from(parent.getContext()).
                        inflate(R.layout.cardview_two, parent, false);

                return new ViewHolder(v);

        }

        return null;

    }

    @Override
    public void onBindViewHolder(final MyRecyclerViewAdapter.ViewHolder holder, int position) {
        final Map<String,?> movie=mDataset.get(position);
        holder.bindMovieData(movie);

        holder.vCheckbox.setOnCheckedChangeListener(null);
        boolean b = (Boolean)movie.get("selection");
        holder.vCheckbox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(){
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked){
               HashMap<String,Boolean> hb = (HashMap)movie.get("selction");
                hb.put("selection",isChecked);
            }
        });


    }

    @Override
    public int getItemCount() {
        Log.d("Size",String.valueOf(mDataset.size()));
        return mDataset.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {


        public ImageView vIcon;
        public TextView vTitle;
        public TextView vDescription;
        public CheckBox vCheckbox;
        public ViewHolder(View v) {
            super(v);
            vIcon = (ImageView) v.findViewById(R.id.icon);
            vTitle = (TextView) v.findViewById(R.id.title);
            vDescription = (TextView) v.findViewById(R.id.description);
            vCheckbox = (CheckBox)v.findViewById(R.id.selection);

            Log.d("cjhecked status",String.valueOf(vCheckbox.isChecked()));
            v.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v){
                    if(mitemClickListener!=null){
                        /*In order to make code reusable write allow the user to take decission what to do after  had been occured
                        This done by introducing an interface "mitemClickListener is called eventhandler object and onItem is called API
                         */
                        if(getAdapterPosition() != RecyclerView.NO_POSITION)
                           mitemClickListener.onItemClick(v,getAdapterPosition());
                    }
                }
            }
            );
            v.setOnLongClickListener(new View.OnLongClickListener(){
                @Override
                public boolean onLongClick(View v){
                    if(mitemClickListener!=null){
                        if(getAdapterPosition()!=RecyclerView.NO_POSITION)
                            mitemClickListener.onItemLongClick(v,getAdapterPosition());
                    }
                    return true;
                }

            });

            Log.d("print check box status",String.valueOf(vCheckbox.isActivated()));
        }
        public void bindMovieData(Map<String,?> movie)
        {
            vIcon.setImageResource((Integer)movie.get("image"));
            vTitle.setText((String)movie.get("title"));
            vDescription.setText((String)movie.get("overview"));
            vCheckbox.setChecked((Boolean)movie.get("selection"));
        }

    }

}
