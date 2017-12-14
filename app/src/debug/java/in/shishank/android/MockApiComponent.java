package in.shishank.android;

import in.rrapps.mvpdaggertesting.ApiComponent;
import in.shishank.android.api.MockApiModule;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {MockApiModule.class})
interface MockApiComponent extends ApiComponent {
}
