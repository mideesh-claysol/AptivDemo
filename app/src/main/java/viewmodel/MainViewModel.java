package viewmodel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.aptiv.demo.Movie;
import com.aptiv.demo.MovieList;

import java.util.List;

/**
 * @author Mideesh
 * @created on 12/11/21
 */
public class MainViewModel extends ViewModel {
    private MutableLiveData<List<List<Movie>>> movies;

    public LiveData<List<List<Movie>>> getMovies() {
        if (movies == null) {
            movies = new MutableLiveData<>();
            movies.setValue(MovieList.loadRows());
        }
        return movies;
    }
}
