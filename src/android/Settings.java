package com.example.plugin;

import org.apache.cordova.*;
import org.json.JSONArray;
import org.json.JSONException;
import android.provider.Settings.Secure;

public class Settings extends CordovaPlugin {

    @Override
    public boolean execute(String action) throws JSONException {

        if (action.equals("getSetting")) {

            boolean isNonPlayAppAllowed = Settings.Secure.getInt(getContentResolver(), Settings.Secure.INSTALL_NON_MARKET_APPS) == 1;

            return isNonPlayAppAllowed;

        } else {
            
            return false;

        }
    }
}
