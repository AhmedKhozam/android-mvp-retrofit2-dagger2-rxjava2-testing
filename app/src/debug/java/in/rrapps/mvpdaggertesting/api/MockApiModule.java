package in.rrapps.mvpdaggertesting.api;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import in.rrapps.mvpdaggertesting.api.ApiService;

@Module
public class MockApiModule {

    @Provides
    @Singleton
    ApiService providesApiService() {
        return new MockApiService();
    }
}
