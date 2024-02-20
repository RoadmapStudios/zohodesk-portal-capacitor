// package com.reactlibrary;

// import com.facebook.react.bridge.ReactApplicationContext;
// import com.facebook.react.bridge.ReactContextBaseJavaModule;
// import com.facebook.react.bridge.ReactMethod;
// import com.zoho.desk.asap.ZDPortalHome;
// import com.zoho.desk.asap.api.ZohoDeskPortalSDK;
// import com.zoho.desk.asap.asap_community.ZDPortalCommunity;

// public class RNZDPortalCommunity extends ReactContextBaseJavaModule {

//     private final ReactApplicationContext reactContext;

//     public RNZDPortalCommunity(ReactApplicationContext reactContext) {
//         super(reactContext);
//         this.reactContext = reactContext;
//     }

//     @Override
//     public String getName() {
//         return "RNZDPortalCommunity";
//     }

//     @ReactMethod
//     public void show() {
//         ZDPortalCommunity.show(reactContext.getCurrentActivity());
//     }
// }

package com.reactlibrary;

import com.getcapacitor.annotation.CapacitorPlugin;
import com.getcapacitor.JSObject;
import com.getcapacitor.Plugin;
import com.getcapacitor.PluginCall;
import com.getcapacitor.PluginMethod;
import com.getcapacitor.annotation.Permission;
import com.zoho.desk.asap.asap_community.ZDPortalCommunity;

@CapacitorPlugin(name = "ZDPortalCommunity")
public class ZohodeskPortalCommunity extends Plugin {

    @PluginMethod
    public void show(PluginCall call) {
        getActivity().runOnUiThread(new Runnable() {
            public void run() {
                ZDPortalCommunity.show(getActivity());
                call.resolve();
            }
        });
    }
}
