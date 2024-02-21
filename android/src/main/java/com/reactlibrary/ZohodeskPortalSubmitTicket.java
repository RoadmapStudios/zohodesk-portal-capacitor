// package com.reactlibrary;

// import com.facebook.react.bridge.ReactApplicationContext;
// import com.facebook.react.bridge.ReactContextBaseJavaModule;
// import com.facebook.react.bridge.ReactMethod;
// import com.zoho.desk.asap.asap_tickets.ZDPortalSubmitTicket;

// public class RNZDPortalSubmitTicket extends ReactContextBaseJavaModule {

//     private final ReactApplicationContext reactContext;

//     public RNZDPortalSubmitTicket(ReactApplicationContext reactContext) {
//         super(reactContext);
//         this.reactContext = reactContext;
//     }

//     @Override
//     public String getName() {
//         return "RNZDPortalSubmitTicket";
//     }

//     @ReactMethod
//     public void show() {
//         ZDPortalSubmitTicket.show(reactContext.getCurrentActivity());
//     }
// }

package com.example.plugin;

import android.app.Activity;
import com.getcapacitor.JSObject;
import com.getcapacitor.annotation.CapacitorPlugin;
import com.getcapacitor.Plugin;
import com.getcapacitor.PluginCall;
import com.getcapacitor.PluginMethod;
import com.zoho.desk.asap.asap_tickets.ZDPortalSubmitTicket;

@CapacitorPlugin(name = "ZDPortalSubmitTicket")
public class ZohodeskPortalSubmitTicket extends Plugin {

    @PluginMethod
    public void show(PluginCall call) {
        Activity activity = getActivity();
        if (activity != null) {
            ZDPortalSubmitTicket.show(activity);
            call.resolve();
        } else {
            call.reject("Activity is null");
        }
    }
}