package in.rrapps.mvpdaggertesting.detail;

import android.os.Bundle;

import in.rrapps.mvpdaggertesting.BaseToolBarActivity;
import in.shishank.android.R;

/**
 * @author shishank
 */

public class MovieDetailActivity extends BaseToolBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie_detail);
    }
}
