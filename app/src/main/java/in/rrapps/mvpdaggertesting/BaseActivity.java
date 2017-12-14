package in.rrapps.mvpdaggertesting;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.FrameLayout;

import in.rrapps.mvpdaggertesting.api.ApiService;

import javax.inject.Inject;

public abstract class BaseActivity extends AppCompatActivity {

    @Inject
    ApiService apiService;

    private FrameLayout contentFrame;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.setContentView(in.shishank.android.R.layout.activity_base);


        contentFrame = (FrameLayout) findViewById(in.shishank.android.R.id.base_container);
    }

    @Override
    public void setContentView(int layoutResId) {
        getLayoutInflater().inflate(layoutResId, contentFrame, true);
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                onBackPressed();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

}
