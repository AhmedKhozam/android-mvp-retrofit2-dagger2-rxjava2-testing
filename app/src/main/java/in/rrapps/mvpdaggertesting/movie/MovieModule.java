package in.rrapps.mvpdaggertesting.movie;

import dagger.Module;
import dagger.Provides;
import in.rrapps.mvpdaggertesting.api.ApiService;

/**
 * Created by abhishek
 * on 14/12/17.
 */

@Module
public class MovieModule {

    private final Contracts.View movieView;
    private final ApiService apiService;

    public MovieModule(Contracts.View movieView, ApiService apiService) {
        this.movieView = movieView;
        this.apiService = apiService;
    }

    @Provides
    MovieListPresenter provideMovieListPresenter() {
        return new MovieListPresenter(movieView, apiService);
    }
}
