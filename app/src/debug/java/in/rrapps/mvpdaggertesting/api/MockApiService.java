package in.rrapps.mvpdaggertesting.api;

import java.util.ArrayList;
import java.util.Map;

import in.rrapps.mvpdaggertesting.models.response.DiscoverResponse;
import io.reactivex.Observable;

public class MockApiService implements ApiService {
    @Override
    public Observable<DiscoverResponse> getMoviesList(Map<String, Object> params) {
        DiscoverResponse response = new DiscoverResponse();
        response.setResults(new ArrayList<>());
        return Observable.just(response);
    }
}
