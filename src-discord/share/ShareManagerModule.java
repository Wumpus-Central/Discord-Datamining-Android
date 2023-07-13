package com.discord.share;

import android.app.Activity;
import android.content.Intent;
import com.discord.share.ShareBroadcastReceiver;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import kotlin.Metadata;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\nH\u0016J\b\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\f\u001a\u00020\nH\u0007J\u001a\u0010\r\u001a\u00020\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000f\u001a\u00020\bH\u0007J\u001c\u0010\u0010\u001a\u00020\n2\b\u0010\u0011\u001a\u0004\u0018\u00010\b2\b\u0010\u0012\u001a\u0004\u0018\u00010\bH\u0007J0\u0010\u0013\u001a\u00020\n2\b\u0010\u0014\u001a\u0004\u0018\u00010\b2\b\u0010\u0015\u001a\u0004\u0018\u00010\b2\b\u0010\u0016\u001a\u0004\u0018\u00010\b2\b\u0010\u0017\u001a\u0004\u0018\u00010\bH\u0007R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/discord/share/ShareManagerModule;", "Lcom/facebook/react/bridge/ReactContextBaseJavaModule;", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "shareBroadcastReceiver", "Lcom/discord/share/ShareBroadcastReceiver;", "getName", "", "initialize", "", "invalidate", "launchApp", "setAuthenticationToken", "authenticationToken", "superProperties", "setSelectedChannel", "channelJSON", "guildJSON", "share", "text", "url", "chooserText", "location", "share_release"}, k = 1, mv = {1, 8, 0}, xi = 48)

public final class ShareManagerModule extends ReactContextBaseJavaModule {
    private final ShareBroadcastReceiver shareBroadcastReceiver;

    
    public ShareManagerModule(ReactApplicationContext reactContext) {
        super(reactContext);
        q.g(reactContext, "reactContext");
        this.shareBroadcastReceiver = new ShareBroadcastReceiver(reactContext);
    }

    @Override 
    public String getName() {
        return "ShareManager";
    }

    @Override 
    public void initialize() {
        super.initialize();
        ShareBroadcastReceiver.Companion companion = ShareBroadcastReceiver.Companion;
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        q.f(reactApplicationContext, "reactApplicationContext");
        companion.register(reactApplicationContext, this.shareBroadcastReceiver);
    }

    @Override 
    public void invalidate() {
        super.invalidate();
        try {
            ShareBroadcastReceiver.Companion companion = ShareBroadcastReceiver.Companion;
            ReactApplicationContext reactApplicationContext = getReactApplicationContext();
            q.f(reactApplicationContext, "reactApplicationContext");
            companion.unregister(reactApplicationContext, this.shareBroadcastReceiver);
        } catch (Exception unused) {
        }
    }

    @ReactMethod
    public final void launchApp() {
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        if (reactApplicationContext != null) {
            Intent launchIntentForPackage = reactApplicationContext.getPackageManager().getLaunchIntentForPackage(reactApplicationContext.getPackageName());
            Activity currentActivity = getCurrentActivity();
            if (currentActivity != null) {
                currentActivity.finish();
            }
            Activity currentActivity2 = getCurrentActivity();
            if (currentActivity2 != null) {
                currentActivity2.startActivity(launchIntentForPackage);
            }
        }
    }

    @ReactMethod
    public final void setAuthenticationToken(String str, String superProperties) {
        q.g(superProperties, "superProperties");
    }

    @ReactMethod
    public final void setSelectedChannel(String str, String str2) {
    }

    
    
    
    
    @com.facebook.react.bridge.ReactMethod
    
    public final void share(java.lang.String r16, java.lang.String r17, java.lang.String r18, java.lang.String r19) {
        
        throw new UnsupportedOperationException("Method not decompiled: com.discord.share.ShareManagerModule.share(java.lang.String, java.lang.String, java.lang.String, java.lang.String):void");
    }
}
