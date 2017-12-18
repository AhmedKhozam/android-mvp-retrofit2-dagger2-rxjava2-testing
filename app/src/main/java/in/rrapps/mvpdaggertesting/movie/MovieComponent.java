package in.rrapps.mvpdaggertesting.movie;

import dagger.Component;

/**
 * Created by abhishek
 * on 14/12/17.
 */

//@Component(modules = {MovieModule.class})
public interface MovieComponent {
    void inject(MovieListFragment movieListFragment);
}
