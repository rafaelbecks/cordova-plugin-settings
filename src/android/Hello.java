package com.example.plugin;

import org.apache.cordova.*;
import org.json.JSONArray;
import org.json.JSONException;
import android.provider.Settings.Secure;

public class Hello extends CordovaPlugin {

    @Override
    public boolean execute(String action, JSONArray data, CallbackContext callbackContext) throws JSONException {

        if (action.equals("sources")) {

            boolean isNonPlayAppAllowed = Settings.Secure.getInt(getContentResolver(), Settings.Secure.INSTALL_NON_MARKET_APPS) == 1;
            callbackContext.success( Boolean.toString(isNonPlayAppAllowed));

            return true;

        } else {
            
            return false;

        }
    }
}
