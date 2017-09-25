package org.belosoft.lab_seccion5_sharedpreferences.Splash;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;

import org.belosoft.lab_seccion5_sharedpreferences.Utils.Util;
import org.belosoft.lab_seccion5_sharedpreferences.activities.Loggy;
import org.belosoft.lab_seccion5_sharedpreferences.activities.MainActivity;

/**
 * Created by oscar on 25/09/2017.
 */

public class SplashActivity extends AppCompatActivity {

    private SharedPreferences prefs;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        prefs = getSharedPreferences("Preferences", Context.MODE_PRIVATE);

        Intent intentlogin = new Intent(this, Loggy.class);
        Intent intentMain = new Intent(this, MainActivity.class);

        if (!TextUtils.isEmpty(Util.getUserMailPrefs(prefs)) && !TextUtils.isEmpty(Util.getUserPassPrefs(prefs))){
            startActivity(intentMain);
        } else {
            startActivity(intentlogin);
        }
        finish();
    }
}
