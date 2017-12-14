package in.shishank.android;


import in.rrapps.mvpdaggertesting.ApiComponent;
import in.rrapps.mvpdaggertesting.BaseApplication;

public class DebugBaseApplication extends BaseApplication {

    public void enableMockMode() {
        apiComponent = DaggerMockApiComponent.create();
    }

    @Override
    public ApiComponent getApiComponent() {
        return apiComponent;
    }
}
