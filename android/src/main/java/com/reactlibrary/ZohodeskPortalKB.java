// package com.reactlibrary;

// import com.facebook.react.bridge.ReactApplicationContext;
// import com.facebook.react.bridge.ReactContextBaseJavaModule;
// import com.facebook.react.bridge.ReactMethod;
// import com.zoho.desk.asap.kb.ZDPortalKB;

// public class RNZDPortalKB extends ReactContextBaseJavaModule {

//     private final ReactApplicationContext reactContext;
//     public RNZDPortalKB(ReactApplicationContext reactContext) {
//         super(reactContext);
//         this.reactContext = reactContext;
//     }

//     @Override
//     public String getName() {
//         return "RNZDPortalKB";
//     }

//     @ReactMethod
//     public void show() {
//         ZDPortalKB.show(reactContext.getCurrentActivity());
//     }
// }

package com.example.plugin;

import android.app.Activity;
import com.getcapacitor.annotation.CapacitorPlugin;
import com.getcapacitor.JSObject;
import com.getcapacitor.Plugin;
import com.getcapacitor.PluginCall;
import com.getcapacitor.PluginMethod;
import com.zoho.desk.asap.kb.ZDPortalKB;

@CapacitorPlugin(name = "ZDPortalKB")
public class ZohodeskPortalKB extends Plugin {

    @PluginMethod
    public void show(PluginCall call) {
        Activity activity = getActivity();
        if (activity != null) {
            ZDPortalKB.show(activity);
            call.resolve();
        } else {
            call.reject("Activity is null");
        }
    }
}
