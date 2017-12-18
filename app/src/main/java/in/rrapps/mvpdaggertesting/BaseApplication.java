package in.rrapps.mvpdaggertesting;

import android.app.Application;

import javax.inject.Inject;

import in.rrapps.mvpdaggertesting.dao.DatabaseInteractor;
import in.rrapps.mvpdaggertesting.database.AppDatabase;
import in.rrapps.mvpdaggertesting.movie.DaggerAppComponent;
import lombok.Getter;
import timber.log.Timber;

public class BaseApplication extends Application {

    private static BaseApplication instance;

/*    @Inject @Getter
    ApiComponent apiComponent;*/

    @Inject @Getter
    DatabaseInteractor databaseInteractor;

    @Inject @Getter
    AppDatabase appDatabase;

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;

        if (BuildConfig.DEBUG) {
            Timber.plant(new Timber.DebugTree());
        }

        DaggerAppComponent.builder()
                .appModule(new AppModule(this))
                .build()
                .inject(this);
    }

    public static BaseApplication getInstance() {
        return instance;
    }
}
