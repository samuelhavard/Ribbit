package com.samuelhavard.ribbit.activities;

import android.app.Application;
import com.parse.Parse;
import com.parse.ParseObject;

/**
 * Created by samue_000 on 10/23/2015.
 */
public class RibbitApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Parse.enableLocalDatastore(this);
        Parse.initialize(this, "s5lRpA4LcGHdU7cPNYOSyJyJt130ednz6Wi2VRZa",
                                "Guzx4NF9KYMzrhMCUkPwhVwDmsKJWdxnbpOxqvVS");

    }

}
