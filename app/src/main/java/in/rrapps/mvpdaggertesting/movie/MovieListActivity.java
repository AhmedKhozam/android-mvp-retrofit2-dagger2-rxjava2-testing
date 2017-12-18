package in.rrapps.mvpdaggertesting.movie;

import android.os.Bundle;
import android.view.Menu;

import in.rrapps.mvpdaggertesting.BaseApplication;
import in.rrapps.mvpdaggertesting.BaseToolBarActivity;


public class MovieListActivity extends BaseToolBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(in.rrapps.mvpdaggertesting.R.layout.activity_movie_list);
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(false);
        }

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(in.rrapps.mvpdaggertesting.R.menu.sort_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }
}
