package in.rrapps.mvpdaggertesting.dao;

import android.os.AsyncTask;

import in.rrapps.mvpdaggertesting.BaseApplication;
import in.rrapps.mvpdaggertesting.database.AppDatabase;
import in.rrapps.mvpdaggertesting.models.MovieData;
import io.reactivex.Single;

/**
 * @author shishank
 */

public class DatabaseWrapper implements DatabaseInteractor {

    private final BaseApplication application;
    private DatabaseCallbacks callbacks;

    public DatabaseWrapper(BaseApplication application) {
        this.application = application;
    }

    @Override
    public void setMovieData(MovieData data) {
        new AsyncTask<Void, Void, Void>() {
            @Override
            protected Void doInBackground(Void... voids) {
                application.getAppDatabase().movieDataDao().addMovieData(data);
                return null;
            }

            @Override
            protected void onPostExecute(Void aVoid) {
                super.onPostExecute(aVoid);
                callbacks.onDataInserted(data);
            }
        }.execute();

    }

    @Override
    public Single<MovieData> getMovieData(int id) {
        return application.getAppDatabase().movieDataDao().getMovieData(id);
    }

    @Override
    public void setCallbacks(DatabaseCallbacks callbacks) {
        this.callbacks = callbacks;
    }

}
