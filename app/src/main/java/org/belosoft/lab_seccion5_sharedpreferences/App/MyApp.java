package org.belosoft.lab_seccion5_sharedpreferences.App;

import android.app.Application;
import android.os.SystemClock;

/**
 * Created by oscar on 25/09/2017.
 */

public class MyApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        SystemClock.sleep(3000);
    }
}
