package in.rrapps.mvpdaggertesting;

import in.rrapps.mvpdaggertesting.ApiComponent;
import in.rrapps.mvpdaggertesting.api.MockApiModule;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {MockApiModule.class})
interface MockApiComponent extends ApiComponent {
}
