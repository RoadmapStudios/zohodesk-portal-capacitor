// package com.reactlibrary;

// import com.facebook.react.bridge.ReactApplicationContext;
// import com.facebook.react.bridge.ReactContextBaseJavaModule;
// import com.facebook.react.bridge.ReactMethod;
// import com.zoho.desk.asap.ZDPortalHome;

// public class RNZDPortalHome extends ReactContextBaseJavaModule {

//     private final ReactApplicationContext reactContext;

//     public RNZDPortalHome(ReactApplicationContext applicationContext) {
//         super(applicationContext);
//         this.reactContext = applicationContext;
//     }

//     @Override
//     public String getName() {
//         return "RNZDPortalHome";
//     }

//     @ReactMethod
//     public void show() {
//         ZDPortalHome.show(reactContext.getCurrentActivity());
//     }
// }
package com.example.plugin;

import android.app.Activity;
import com.getcapacitor.annotation.CapacitorPlugin;
import com.getcapacitor.JSObject;
import com.getcapacitor.Plugin;
import com.getcapacitor.PluginCall;
import com.getcapacitor.PluginMethod;
import com.zoho.desk.asap.ZDPortalHome;

@CapacitorPlugin(name = "ZDPortalHome")
public class ZohodeskPortalHome extends Plugin {

    @PluginMethod
    public void show(PluginCall call) {
        Activity activity = getActivity();
        if (activity != null) {
            ZDPortalHome.show(activity);
            call.resolve();
        } else {
            call.reject("Activity is null");
        }
    }
}