package com.aptiv.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
/**
 * @author Mideesh
 * @created on 12/11/21
 */
public final class MovieList {
    private static int NUM_ROWS = 5;
    private static int NUM_COLS = 20;
    public static final String MOVIE_CATEGORY[] = {
            "Continue watching",
            "Recently added movies",
            "Recommended movies",
            "Coming soon movies",
            "Hollywood movies",
            "Bollywood movies",

    };
    static String[] cardImageUrl = {
            "http://www.cs.cmu.edu/afs/andrew/scs/cs/15-463/f07/proj2/www/amichals/Photos/Photo17.jpg",
            "http://www.cs.cmu.edu/afs/andrew/scs/cs/15-463/f07/proj2/www/amichals/Photos/Photo05.jpg",
            "http://www.cs.cmu.edu/afs/andrew/scs/cs/15-463/f07/proj2/www/amichals/Photos/Photo08.jpg",
            "http://www.cs.cmu.edu/afs/andrew/scs/cs/15-463/f07/proj2/www/amichals/Photos/Photo09.jpg",
            "http://www.cs.cmu.edu/afs/andrew/scs/cs/15-463/f07/proj2/www/amichals/Photos/Photo10.jpg"
    };

    public static List<List<Movie>> loadRows() {
        List<List<Movie>> rows = new ArrayList<>();
        List<Movie> row;
        for (int i = 0; i < NUM_ROWS; i++) {
            row = new ArrayList<>();
            for (int j = 0; j < NUM_COLS; ++j) {
                row.add(
                        buildMovieInfo(
                                "Title" + (j + 1),
                                "description" + (j + 1),
                                "studio" + (j + 1),
                                "https://commondatastorage.googleapis.com/android-tv/Sample%20videos/Zeitgeist/Zeitgeist%202010_%20Year%20in%20Review.mp4",
                                cardImageUrl[new Random().nextInt(cardImageUrl.length)],
                                "https://commondatastorage.googleapis.com/android-tv/Sample%20videos/Zeitgeist/Zeitgeist%202010_%20Year%20in%20Review/card.jpg",
                                10 * i + j + 1
                        ));
            }
            //Collections.shuffle(row);
            rows.add(row);
        }
        return rows;
    }

    private static Movie buildMovieInfo(
            String title,
            String description,
            String studio,
            String videoUrl,
            String cardImageUrl,
            String backgroundImageUrl,
            int count) {
        Movie movie = new Movie();
        movie.setId(count++);
        movie.setTitle(title);
        movie.setDescription(description);
        movie.setStudio(studio);
        movie.setCardImageUrl(cardImageUrl);
        movie.setBackgroundImageUrl(backgroundImageUrl);
        movie.setVideoUrl(videoUrl);
        return movie;
    }
}