// package com.reactlibrary;

// import android.os.Handler;
// import android.os.Looper;

// import com.facebook.react.bridge.ReactApplicationContext;
// import com.facebook.react.bridge.ReactContextBaseJavaModule;
// import com.facebook.react.bridge.ReactMethod;
// import com.zoho.desk.chat.ZDPortalChat;
// import com.zoho.desk.chat.ZDPortalChatUser;

// public class RNZDPortalChat extends ReactContextBaseJavaModule {

//     private final ReactApplicationContext reactContext;

//     public RNZDPortalChat(ReactApplicationContext reactContext) {
//         super(reactContext);
//         this.reactContext = reactContext;
//     }

//     @Override
//     public String getName() {
//         return "RNZDPortalChat";
//     }

//     @ReactMethod
//     public void show() {
//         Handler handler = new Handler(Looper.getMainLooper());
//         handler.post(new Runnable() {
//             public void run() {
//                 ZDPortalChat.show(reactContext.getCurrentActivity());
//             }
//         });
//     }

//     @ReactMethod
//     public void setGuestUserDetails(final String email, final String name, final String phone) {
//         ZDPortalChatUser user = new ZDPortalChatUser();
//         user.setEmail(email);
//         user.setName(name);
//         user.setPhone(phone);
//         ZDPortalChat.setGuestUserDetails(user);
//     }
// }
package com.reactlibrary;

import android.content.Context;

import com.getcapacitor.JSObject;
import com.getcapacitor.Plugin;
import com.getcapacitor.PluginCall;
import com.getcapacitor.PluginMethod;
import com.getcapacitor.annotation.CapacitorPlugin;
import com.zoho.desk.chat.ZDPortalChat;
import com.zoho.desk.chat.ZDPortalChatUser;

@CapacitorPlugin(name = "ZDPortalChat")
public class ZDPortalChat extends Plugin {

    @PluginMethod
    public void show(PluginCall call) {
        getActivity().runOnUiThread(new Runnable() {
            @Override
            public void run() {
                ZDPortalChat.show(getActivity());
            }
        });
        call.resolve();
    }

    @PluginMethod
    public void setGuestUserDetails(PluginCall call) {
        String email = call.getString("email");
        String name = call.getString("name");
        String phone = call.getString("phone");

        ZDPortalChatUser user = new ZDPortalChatUser();
        user.setEmail(email);
        user.setName(name);
        user.setPhone(phone);

        ZDPortalChat.setGuestUserDetails(user);

        call.resolve();
    }
}