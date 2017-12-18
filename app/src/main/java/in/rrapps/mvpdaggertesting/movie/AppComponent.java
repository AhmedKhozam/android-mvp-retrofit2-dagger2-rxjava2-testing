package in.rrapps.mvpdaggertesting.movie;

import javax.inject.Singleton;

import dagger.Component;
import in.rrapps.mvpdaggertesting.AppModule;
import in.rrapps.mvpdaggertesting.BaseApplication;

/**
 * Created by abhishek
 * on 14/12/17.
 */
@Singleton
@Component(modules = {AppModule.class})
public interface AppComponent {
    void inject(BaseApplication baseApplication);
}
