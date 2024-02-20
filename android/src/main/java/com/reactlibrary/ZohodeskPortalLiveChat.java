// package com.reactlibrary;

// import com.facebook.react.bridge.ReactApplicationContext;
// import com.facebook.react.bridge.ReactContextBaseJavaModule;
// import com.facebook.react.bridge.ReactMethod;
// import com.zoho.desk.asap.livechat.ZDPortalLiveChat;

// public class RNZDPortalLiveChat extends ReactContextBaseJavaModule {

//     private final ReactApplicationContext reactContext;

//     public RNZDPortalLiveChat(ReactApplicationContext reactContext) {
//         super(reactContext);
//         this.reactContext = reactContext;
//     }

//     @Override
//     public String getName() {
//         return "RNZDPortalLiveChat";
//     }

//     @ReactMethod
//     public void show() {
//         ZDPortalLiveChat.show(reactContext.getCurrentActivity());
//     }

// }
package com.example.plugin;

import android.app.Activity;
import com.getcapacitor.JSObject;
import com.getcapacitor.annotation.CapacitorPlugin;
import com.getcapacitor.Plugin;
import com.getcapacitor.PluginCall;
import com.getcapacitor.PluginMethod;
import com.zoho.desk.asap.livechat.ZDPortalLiveChat;

@CapacitorPlugin(name = "ZDPortalLiveChat")
public class ZohodeskPortalLiveChat extends Plugin {

    @PluginMethod
    public void show(PluginCall call) {
        Activity activity = getActivity();
        if (activity != null) {
            ZDPortalLiveChat.show(activity);
            call.resolve();
        } else {
            call.reject("Activity is null");
        }
    }
}
