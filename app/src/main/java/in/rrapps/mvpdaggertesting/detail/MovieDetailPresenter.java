package in.rrapps.mvpdaggertesting.detail;

import in.rrapps.mvpdaggertesting.BaseApplication;
import in.rrapps.mvpdaggertesting.dao.DatabaseCallbacks;
import in.rrapps.mvpdaggertesting.dao.DatabaseInteractor;
import in.rrapps.mvpdaggertesting.models.MovieData;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;
import timber.log.Timber;

/**
 * @author shishank
 */

public class MovieDetailPresenter implements Contracts.Presenter, DatabaseCallbacks {

    private Contracts.View movieDetailView;
    private DatabaseInteractor databaseInteractor;

    public MovieDetailPresenter(Contracts.View movieDetailView) {
        this.movieDetailView = movieDetailView;
//        databaseInteractor = BaseApplication.getInstance().getDatabaseInteractor();
        databaseInteractor.setCallbacks(this);
    }

    @Override
    public void init() {
        movieDetailView.PopulateData();
    }

    @Override
    public void updateMovie(MovieData movieData) {
        movieDetailView.showLoading();
        databaseInteractor.setMovieData(movieData);
    }

    @Override
    public void findMovie(int id) {
        databaseInteractor.getMovieData(id).observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.computation())
                .subscribe(movieDetailView::onCompleted, this::onFailed);
    }

    @Override
    public void onDataInserted(MovieData data) {
        findMovie(data.getId());
    }


    @Override
    public void onFailed(Throwable throwable) {
        Timber.d("data inserted"+throwable.getCause());
    }
}
