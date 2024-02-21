// package com.reactlibrary;

// import com.facebook.react.bridge.ReactApplicationContext;
// import com.facebook.react.bridge.ReactContextBaseJavaModule;
// import com.facebook.react.bridge.ReactMethod;
// import com.zoho.desk.asap.asap_tickets.ZDPortalTickets;

// public class RNZDPortalTickets extends ReactContextBaseJavaModule {

//     private final ReactApplicationContext reactContext;

//     public RNZDPortalTickets(ReactApplicationContext reactContext) {
//         super(reactContext);
//         this.reactContext = reactContext;
//     }

//     @Override
//     public String getName() {
//         return "RNZDPortalTickets";
//     }

//     @ReactMethod
//     public void show() {
//         ZDPortalTickets.show(reactContext.getCurrentActivity());
//     }
// }
package com.example.plugin;

import android.app.Activity;
import com.getcapacitor.JSObject;
import com.getcapacitor.Plugin;
import com.getcapacitor.PluginCall;
import com.getcapacitor.annotation.CapacitorPlugin;
import com.getcapacitor.PluginMethod;
import com.zoho.desk.asap.asap_tickets.ZDPortalTickets;

@CapacitorPlugin(name = "ZDPortalTickets")
public class ZohodeskPortalTickets extends Plugin {

    @PluginMethod
    public void show(PluginCall call) {
        Activity activity = getActivity();
        if (activity != null) {
            ZDPortalTickets.show(activity);
            call.resolve();
        } else {
            call.reject("Activity is null");
        }
    }
}
