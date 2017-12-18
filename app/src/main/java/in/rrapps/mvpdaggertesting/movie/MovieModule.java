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

    @Provides
    MovieListPresenter provideMovieListPresenter(Contracts.View movieView,  ApiService apiService) {
        return new MovieListPresenter(movieView, apiService);
    }
}
