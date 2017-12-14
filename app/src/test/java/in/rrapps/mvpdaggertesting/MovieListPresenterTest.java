package in.rrapps.mvpdaggertesting;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import java.util.concurrent.TimeUnit;

import in.rrapps.mvpdaggertesting.api.ApiService;
import in.rrapps.mvpdaggertesting.api.MockApiService;
import in.rrapps.mvpdaggertesting.movie.Contracts;
import in.rrapps.mvpdaggertesting.movie.MovieListPresenter;
import io.reactivex.Scheduler;
import io.reactivex.android.plugins.RxAndroidPlugins;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.schedulers.ExecutorScheduler;
import io.reactivex.plugins.RxJavaPlugins;

import static org.mockito.ArgumentMatchers.any;

/**
 * @author shishank
 */

@RunWith(JUnit4.class)
public class MovieListPresenterTest {

    @Mock
    private Contracts.View movieView;

    @BeforeClass
    public static void setupRxSchedulers() {
        Scheduler immediate = new Scheduler() {

            @Override
            public Disposable scheduleDirect(Runnable run, long delay, TimeUnit unit) {
                return super.scheduleDirect(run, 0, unit);
            }

            @Override
            public Worker createWorker() {
                return new ExecutorScheduler.ExecutorWorker(Runnable::run);
            }
        };

        RxJavaPlugins.setInitIoSchedulerHandler(scheduler -> immediate);
        RxJavaPlugins.setInitComputationSchedulerHandler(scheduler -> immediate);
        RxJavaPlugins.setInitNewThreadSchedulerHandler(scheduler -> immediate);
        RxJavaPlugins.setInitSingleSchedulerHandler(scheduler -> immediate);
        RxAndroidPlugins.setInitMainThreadSchedulerHandler(scheduler -> immediate);
    }

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @After
    public void validate() {
        Mockito.validateMockitoUsage();
    }

    @Test
    public void validDataReturned() {
        ApiService apiService = new MockApiService();
        Contracts.Presenter presenter = new MovieListPresenter(movieView, apiService);

        presenter.fetchMovies(1);

        Mockito.verify(movieView, Mockito.times(1))
                .populateData(any());
    }
}