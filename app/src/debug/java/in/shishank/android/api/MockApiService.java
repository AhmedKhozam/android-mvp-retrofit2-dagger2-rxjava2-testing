package in.shishank.android.api;

import in.rrapps.mvpdaggertesting.api.ApiService;
import in.rrapps.mvpdaggertesting.models.response.DiscoverResponse;

import java.util.Map;

import io.reactivex.Observable;

class MockApiService implements ApiService {
    @Override
    public Observable<DiscoverResponse> getMoviesList(Map<String, Object> params) {
        return null;
    }
}
