package in.rrapps.mvpdaggertesting;

import in.rrapps.mvpdaggertesting.api.ApiModule;
import in.rrapps.mvpdaggertesting.movie.MovieListPresenter;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {ApiModule.class})
public interface ApiComponent {

    void inject(BaseActivity baseActivity);

    void inject(BasePresenter basePresenter);

    void inject(MovieListPresenter basePresenter);

}
