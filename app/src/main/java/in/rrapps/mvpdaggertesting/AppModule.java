package in.rrapps.mvpdaggertesting;

import android.arch.persistence.room.Room;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import in.rrapps.mvpdaggertesting.dao.DatabaseInteractor;
import in.rrapps.mvpdaggertesting.dao.DatabaseWrapper;
import in.rrapps.mvpdaggertesting.database.AppDatabase;

/**
 * Created by abhishek
 * on 14/12/17.
 *
 * Provides application class
 */

@Module
public class AppModule {

    private final BaseApplication application;

    public AppModule(BaseApplication application) {
        this.application = application;
    }

    @Provides
    DatabaseInteractor providesDatabaseInteractor() {
        return new DatabaseWrapper();
    }

    @Provides
    @Singleton
    BaseApplication providesApplication () {
        return application;
    }

    @Provides
    @Singleton
    AppDatabase providesAppDatabase() {
        return Room.databaseBuilder(application, AppDatabase.class, "movieData").build();
    }
}
