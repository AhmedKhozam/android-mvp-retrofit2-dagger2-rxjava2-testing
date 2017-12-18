package in.rrapps.mvpdaggertesting;

import android.app.Application;

import javax.inject.Inject;

import in.rrapps.mvpdaggertesting.api.ApiModule;
import in.rrapps.mvpdaggertesting.dao.DatabaseInteractor;
import in.rrapps.mvpdaggertesting.database.AppDatabase;

import lombok.Getter;
import timber.log.Timber;

public class BaseApplication extends Application {

    private static BaseApplication instance;

    @Inject @Getter
    DatabaseInteractor databaseInteractor;

    @Inject @Getter
    AppDatabase appDatabase;

    @Getter
    private AppComponent appComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;

        if (BuildConfig.DEBUG) {
            Timber.plant(new Timber.DebugTree());
        }

        appComponent = DaggerAppComponent.builder()
                .appModule(new AppModule(this))
                .build();

        appComponent.inject(this);
    }
}
