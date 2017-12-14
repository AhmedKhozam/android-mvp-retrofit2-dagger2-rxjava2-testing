package in.rrapps.mvpdaggertesting;

import android.app.Application;
import android.arch.persistence.room.Room;

import in.rrapps.mvpdaggertesting.dao.DatabaseWrapper;
import in.rrapps.mvpdaggertesting.database.AppDatabase;
import in.shishank.android.BuildConfig;
import in.rrapps.mvpdaggertesting.dao.DatabaseInteractor;

import lombok.Getter;
import timber.log.Timber;

public class BaseApplication extends Application {

    private static BaseApplication instance;

    @Getter
    protected ApiComponent apiComponent;

    @Getter
    private DatabaseInteractor databaseInteractor;

    @Getter
    private AppDatabase appDatabase;

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;

        if (BuildConfig.DEBUG) {
            Timber.plant(new Timber.DebugTree());
        }

        apiComponent = DaggerApiComponent.create();
        appDatabase = Room.databaseBuilder(this, AppDatabase.class, "movieData").build();
        databaseInteractor = new DatabaseWrapper();
    }

    public static BaseApplication getInstance() {
        return instance;
    }
}
