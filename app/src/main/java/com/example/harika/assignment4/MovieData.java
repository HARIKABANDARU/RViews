package com.example.harika.assignment4;


import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Harika on 9/23/2017.
 */

public class MovieData {
    List<Map<String, ?>> moviesList;

    public List<Map<String, ?>> getMoviesList() {
        return moviesList;
    }
    public int getSize() {
        return moviesList.size();
    }

    public HashMap getItem(int i) {
        if (i >= 0 && i < moviesList.size()) {
            return (HashMap) moviesList.get(i);
        } else
            return null;

    }

    public MovieData() {

        moviesList = new ArrayList<Map<String, ?>>();
        moviesList.add(createMovie(321612,5185,R.drawable.beauty_and_the_beast,6.8,326.689681,"Beauty and the Beast","/tWqifoYuwLETmmasnGHO7xBjEtt.jpg","/6aUWe0GSl69wMTSWWexsorMIvwU.jpg","A live-action adaptation of Disney's version of the classic 'Beauty and the Beast' tale of a cursed prince and a beautiful young woman who helps him break the spell.","2017-03-16",false));
        moviesList.add(createMovie(211672,4450,R.drawable.minions,6.4,326.689681,"Minions","/q0R4crx2SehcEEQEkYObktdeFy.jpg","/uX7LXnsC7bZJZjn048UCOwkPXWJ.jpg","Minions Stuart, Kevin and Bob are recruited by Scarlet Overkill, a super-villain who, alongside her inventor husband Herb, hatches a plot to take over the world.","2015-06-17",false));
        moviesList.add(createMovie(396422,788,R.drawable.annabelle,6.4,412.968591,"Annabelle: Creation","/tb86j8jVCVsdZnzf8I6cIi65IeM.jpg","/o8u0NyEigCEaZHBdCYTRfXR8U4i.jpg","Several years after the tragic death of their little girl, a dollmaker and his wife welcome a nun and several girls from a shuttered orphanage into their home, soon becoming the target of the dollmaker's possessed creation, Annabelle.","2017-08-03",false));
        moviesList.add(createMovie(346364,464,R.drawable.it,7.6,386.850382,"It","/9E2y5Q7WlCVNEhP5GiVTjhEhx1o.jpg","/tcheoA2nPATCm2vvXw2hVQoaEFD.jpg","In a small town in Maine, seven children known as The Losers Club come face to face with life problems, bullies and a monster that takes the shape of a clown called Pennywise.","2017-09-06",false));
        moviesList.add(createMovie(118340,9398,R.drawable.guardians_of_galaxy_large,7.9,233.959732,"Guardians of the Galaxy","/y31QB9kn3XSudA15tV7UWQ9XLuW.jpg","/bHarw8xrmQeqf3t8HpuMY7zoK4x.jpg", "Light years from Earth, 26 years after being abducted, Peter Quill finds himself the prime target of a manhunt after discovering an orb wanted by Ronan the Accuser.","2014-07-30",false));
        moviesList.add(createMovie(339404,44,R.drawable.layover,4.7,227.764619,"The Layover","/kb9osnqanXRpkpm1bnSqAhKoq5T.jpg","/ibianpvL865w7rBPAg3sPlEXUyh.jpg", "When their plane is rerouted due to a hurricane warning, two single female best friends find themselves competing for the same guy during an extended layover in St. Louis.","2017-09-01",false));
        moviesList.add(createMovie(324852,1704,R.drawable.dispicableme,6.2,221.087572,"Despicable Me 3","/5qcUGqWoWhEsoQwNUrtf3y3fcWn.jpg","/ftRkFtAGuHngHnLiOxktq0aCVMF.jpg", "Gru and his wife Lucy must stop former '80s child star Balthazar Bratt from achieving world domination.","2017-06-15",false));
        moviesList.add(createMovie(324852,4309,R.drawable.wonderwoman,7.2,218.489336,"Wonder Woman","/imekS7f1OuHyUP2LAiTEM0zBzUz.jpg","/6iUNJZymJBMXXriQyFZfLAKnjO6.jpg", "An Amazon princess comes to the world of Man to become the greatest of the female superheroes.","2017-05-30",false));
        moviesList.add(createMovie(315635,3058,R.drawable.spiderman,7.3,211.914907,"Spider-Man: Homecoming","/c24sv2weTHPsmDa7jEMN0m2P3RT.jpg","/vc8bCGjdVp0UbMNLzHnHSLRbBWQ.jpg", "Following the events of Captain America: Civil War, Peter Parker, with the help of his mentor Tony Stark, tries to balance his life as an ordinary high school student in Queens, New York City, with fighting crime as his superhero alter ego Spider-Man as a new threat, the Vulture, emerges.","2017-07-05",false));
        moviesList.add(createMovie(166426,2265,R.drawable.pirates,6.6,193.019351,"Pirates of the Caribbean: Dead Men Tell No Tales","/xbpSDU3p7YUGlu9Mr6Egg2Vweto.jpg","/tZvdyLP2F6x2TTuh292ceH87qZT.jpg", "Thrust into an all-new adventure, a down-on-his-luck Capt. Jack Sparrow feels the winds of ill-fortune blowing even more strongly when deadly ghost sailors led by his old nemesis, the evil Capt. Salazar, escape from the Devil's Triangle. Jack's only hope of survival lies in seeking out the legendary Trident of Poseidon, but to find it, he must forge an uneasy alliance with a brilliant and beautiful astronomer and a headstrong young man in the British navy, emerges.","2017-05-23",false));
        moviesList.add(createMovie(135397,8443,R.drawable.jurassicworld,6.5,167.818631,"Jurassic World","/jjBgi2r5cRt36xF6iNUEhzscEcb.jpg","/dkMD5qlogeRMiEixC4YNPUvax2T.jpg", "Twenty-two years after the events of Jurassic Park, Isla Nublar now features a fully functioning dinosaur theme park, Jurassic World, as originally envisioned by John Hammond.","2015-06-09",false));
        moviesList.add(createMovie(157336,10592,R.drawable.interstellar,8.1, 189.527641,"Interstellar","/nBNZadXqJSdt05SHLqgT0HuC5Gm.jpg","/xu9zaAevzQ5nnrsXN6JcahLnG4i.jpg","Interstellar chronicles the adventures of a group of explorers who make use of a newly discovered wormhole to surpass the limitations on human space travel and conquer the vast distances involved in an interstellar voyage.","2014-11-05",false));
        moviesList.add(createMovie(263115,5856,R.drawable.logan,7.5,141.619996,"Logan","/gGBu0hKw9BGddG8RkRAMX7B6NDB.jpg","/5pAGnkFYSsFJ99ZxDIYnhQbQFXs.jpg",  "In the near future, a weary Logan cares for an ailing Professor X in a hideout on the Mexican border. But Logan's attempts to hide from the world and his legacy are upended when a young mutant arrives, pursued by dark forces.","2017-02-28",false));
        moviesList.add(createMovie(293660,10828,R.drawable.deadpool,7.3,139.124286,"Deadpool","/inVq3FRqcYIRl2la8iZikYYxFNR.jpg","/n1y094tVDFATSzkTnFxoGZ1qNsG.jpg","Deadpool tells the origin story of former Special Forces operative turned mercenary Wade Wilson, who after being subjected to a rogue experiment that leaves him with accelerated healing powers, adopts the alter ego Deadpool. Armed with his new abilities and a dark, twisted sense of humor, Deadpool hunts down the man who nearly destroyed his life","2016-02-09",false));
        moviesList.add(createMovie(76341,9289,R.drawable.madmax,7.2,134.988249,"Mad Max: Fury Road","/kqjL17yufvn9OVLyXYpvtyrFfak.jpg","/phszHPFVhPHhMZgo0fWTKBDQsJA.jpg", "An apocalyptic story set in the furthest reaches of our planet, in a stark desert landscape where humanity is broken, and most everyone is crazed fighting for the necessities of life. Within this world exist two rebels on the run who just might be able to restore order. There's Max, a man of action and a man of few words, who seeks peace of mind following the loss of his wife and child in the aftermath of the chaos. And Furiosa, a woman of action and a woman who believes her path to survival may be achieved if she can make it across the desert back to her childhood homeland.","2015-05-13",false));
        moviesList.add(createMovie(283995,4290,R.drawable.ggv2,7.6,132.321316,"Guardians of the Galaxy Vol. 2","/y4MBh0EjBlMuOzv9axM4qJlmhzz.jpg","/aJn9XeesqsrSLKcHfHP4u5985hn.jpg","The Guardians must fight to keep their newfound family together as they unravel the mysteries of Peter Quill's true parentage.","2017-04-19",false));
        moviesList.add(createMovie(374720,2214,R.drawable.dunkirk,7.5,131.050944,"Dunkirk","/bOXBV303Fgkzn2K4FeKDc0O31q4.jpg","/fudEG1VUWuOqleXv6NwCExK0VLy.jpg", "The miraculous evacuation of Allied soldiers from Belgium, Britain, Canada and France, who were cut off and surrounded by the German army from the beaches and harbor of Dunkirk, France, between May 26th and June 4th 1940, during the Battle of France in World War II.","2017-07-19",false));
        moviesList.add(createMovie(126889,2400,R.drawable.alien,5.7,130.44985,"Alien: Covenant","/zecMELPbU5YMQpC81Z8ImaaXuf9.jpg","/kMU8trT43p5LFoJ4plIySMOsZ1T.jpg",  "Bound for a remote planet on the far side of the galaxy, the crew of the colony ship 'Covenant' discovers what is thought to be an uncharted paradise, but is actually a dark, dangerous world – which has its sole inhabitant the 'synthetic', David, survivor of the doomed Prometheus expedition.","2017-05-09",false));
        moviesList.add(createMovie(381283,18,R.drawable.mother,6.5,109.800059,"Mother!","/qmi2dsuoyzZdJ0WFZYQazbX8ILj.jpg","/rTi26DGOfFRAp7NMwzlvhO9UMm1.jpg", "A couple's relationship is tested when uninvited guests arrive at their home, disrupting their tranquil existence.","2017-09-13",false));
        moviesList.add(createMovie(353491,555,R.drawable.tower,5.6,211.914907,"The Dark Tower","/i9GUSgddIqrroubiLsvvMRYyRy0.jpg","/vc8bCGjdVp0UbMNLzHnHSLRbBWQ.jpg", "The last Gunslinger, Roland Deschain, has been locked in an eternal battle with Walter O’Dim, also known as the Man in Black, determined to prevent him from toppling the Dark Tower, which holds the universe together. With the fate of the worlds at stake, good and evil will collide in the ultimate battle as only Roland can defend the Tower from the Man in Black.","2017-08-03",false));
        moviesList.add(createMovie(342473,364,R.drawable.ballerina,7.3,211.914907,"Ballerina","/60ZhK1FstSkC9Ms8lRWaTPm55kD.jpg","/vc8bCGjdVp0UbMNLzHnHSLRbBWQ.jpg", "Set in 1879 Paris. An orphan girl dreams of becoming a ballerina and flees her rural Brittany for Paris, where she passes for someone else and accedes to the position of pupil at the Grand Opera house.","2017-07-05",false));
        moviesList.add(createMovie(399170,83,R.drawable.lucky,6.6,211.914907,"Logan Lucky","/mQrhrBaaHvRfBQq0Px3HtVbH9iE.jpg","/vc8bCGjdVp0UbMNLzHnHSLRbBWQ.jpg", "Trying to reverse a family curse, brothers Jimmy and Clyde Logan set out to execute an elaborate robbery during the legendary Coca-Cola 600 race at the Charlotte Motor Speedway.","2017-07-05",false));
        moviesList.add(createMovie(395814,32,R.drawable.rememory,7.3,211.914907,"Rememory","/sGQ4kix7bIT35ePpJzA2rNNaxPY.jpg","/vc8bCGjdVp0UbMNLzHnHSLRbBWQ.jpg", "The widow of a wise professor stumbles upon one of his inventions that's able to record and play a person's memory.","2017-07-05",false));
        moviesList.add(createMovie(315635,3058,R.drawable.home,7.3,211.914907,"Spider-Man: Homecoming","/c24sv2weTHPsmDa7jEMN0m2P3RT.jpg","/vc8bCGjdVp0UbMNLzHnHSLRbBWQ.jpg", "Life for a single mom in Los Angeles takes an unexpected turn when she allows three young guys to move in with her.","2017-07-05",false));
        moviesList.add(createMovie(396422,788,R.drawable.annabelle,6.4,412.968591,"Annabelle: Creation","/tb86j8jVCVsdZnzf8I6cIi65IeM.jpg","/o8u0NyEigCEaZHBdCYTRfXR8U4i.jpg","Several years after the tragic death of their little girl, a dollmaker and his wife welcome a nun and several girls from a shuttered orphanage into their home, soon becoming the target of the dollmaker's possessed creation, Annabelle.","2017-08-03",false));

    }
    private HashMap createMovie ( Integer id , Integer vCount , int image , Double vAvg , Double pop , String title , String poster , String backdrop , String overview , String release,boolean selection) {
        HashMap movie = new HashMap();
        movie.put("image", image);
        movie.put("id", id);
        movie.put("voteCount", vCount);
        movie.put("voteAverage", vAvg);
        movie.put("popularity", pop);
        movie.put("title", title);
        movie.put("poster", poster);
        movie.put("backdrop", backdrop);
        movie.put("overview", overview);

        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date date = new Date(dateFormat.parse(release).getTime());
            movie.put("release",date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        movie.put("selection",selection);
        return movie;
    }

}
