package in.rrapps.mvpdaggertesting;

import in.rrapps.mvpdaggertesting.api.ApiModule;
import in.rrapps.mvpdaggertesting.movie.MovieListFragment;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {ApiModule.class})
public interface ApiComponent {
    void inject(MovieListFragment baseActivity);
}
