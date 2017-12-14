package in.rrapps.mvpdaggertesting.dao;

import in.rrapps.mvpdaggertesting.models.MovieData;

/**
 * @author shishank
 */

public interface DatabaseCallbacks {

    void onDataInserted(MovieData data);

    void onFailed(Throwable throwable);
}
