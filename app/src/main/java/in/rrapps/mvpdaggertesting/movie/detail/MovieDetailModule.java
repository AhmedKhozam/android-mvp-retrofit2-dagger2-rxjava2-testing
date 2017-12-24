package in.rrapps.mvpdaggertesting.movie.detail;

import dagger.Module;
import dagger.Provides;
import in.rrapps.mvpdaggertesting.dao.DatabaseInteractor;
import in.rrapps.mvpdaggertesting.movie.MovieScope;

/**
 * Created by abhishek
 * on 24/12/17.
 */

@Module
public class MovieDetailModule {

    private final Contracts.View movieDetailView;

    public MovieDetailModule(Contracts.View movieDetailView) {
        this.movieDetailView = movieDetailView;
    }

    @Provides
    @MovieScope
    MovieDetailPresenter provideMovieDetailPresenter(DatabaseInteractor databaseInteractor) {
        return new MovieDetailPresenter(movieDetailView, databaseInteractor);
    }
}
