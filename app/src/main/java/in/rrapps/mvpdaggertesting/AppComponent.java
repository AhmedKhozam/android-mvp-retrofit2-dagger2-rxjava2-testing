package in.rrapps.mvpdaggertesting;

import javax.inject.Singleton;

import dagger.Component;
import in.rrapps.mvpdaggertesting.api.ApiModule;
import in.rrapps.mvpdaggertesting.movie.MovieComponent;
import in.rrapps.mvpdaggertesting.movie.MovieModule;

/**
 * Created by abhishek
 * on 14/12/17.
 */
@Singleton
@Component(modules = {AppModule.class, ApiModule.class})
public interface AppComponent {
    void inject(BaseApplication baseApplication);

    MovieComponent newMovieComponent(MovieModule movieModule);
}