package in.rrapps.mvpdaggertesting.movie.detail;

import dagger.Subcomponent;
import in.rrapps.mvpdaggertesting.movie.MovieListFragment;
import in.rrapps.mvpdaggertesting.movie.MovieModule;
import in.rrapps.mvpdaggertesting.movie.MovieScope;

/**
 * Created by abhishek
 * on 14/12/17.
 *
 * Custom component for movie detail screen, this is a child component of App Component
 * and needs to be smaller in size
 */
@MovieScope
@Subcomponent(modules = {MovieDetailModule.class})
public interface MovieDetailComponent {
    void inject(MovieDetailFragment movieDetailFragment);
}
