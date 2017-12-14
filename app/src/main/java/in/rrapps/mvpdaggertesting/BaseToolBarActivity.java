package in.rrapps.mvpdaggertesting;

import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.FrameLayout;

public abstract class BaseToolBarActivity extends BaseActivity {

    private FrameLayout contentFrame;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.setContentView(in.rrapps.mvpdaggertesting.R.layout.activity_base_toolbar);

        Toolbar toolbar = findViewById(in.rrapps.mvpdaggertesting.R.id.toolbar);
        setSupportActionBar(toolbar);

        assert getSupportActionBar() != null;
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        contentFrame = findViewById(in.rrapps.mvpdaggertesting.R.id.activity_content);
    }

    @Override
    public void setContentView(int layoutResId) {
        getLayoutInflater().inflate(layoutResId, contentFrame, true);
    }
}
