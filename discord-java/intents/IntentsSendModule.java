package com.discord.intents;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import com.discord.intents.packages.InstalledPackage;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import kotlin.Metadata;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\b\u0010\n\u001a\u00020\u000bH\u0016J\u0018\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0018\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0007J\u0018\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/discord/intents/IntentsSendModule;", "Lcom/facebook/react/bridge/ReactContextBaseJavaModule;", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "canSendMail", "", BaseJavaModule.METHOD_TYPE_PROMISE, "Lcom/facebook/react/bridge/Promise;", "canSendSMS", "getName", "", "isPackageInstalled", "appName", "sendMail", "options", "Lcom/facebook/react/bridge/ReadableMap;", "callback", "Lcom/facebook/react/bridge/Callback;", "sendSMS", "intents_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class IntentsSendModule extends ReactContextBaseJavaModule {
    private final ReactApplicationContext reactContext;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IntentsSendModule(ReactApplicationContext reactContext) {
        super(reactContext);
        q.g(reactContext, "reactContext");
        this.reactContext = reactContext;
    }

    @ReactMethod
    public final void canSendMail(Promise promise) {
        q.g(promise, "promise");
        promise.resolve(Boolean.TRUE);
    }

    @ReactMethod
    public final void canSendSMS(Promise promise) {
        q.g(promise, "promise");
        promise.resolve(Boolean.TRUE);
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "DCDSend";
    }

    @ReactMethod
    public final void isPackageInstalled(String appName, Promise promise) {
        q.g(appName, "appName");
        q.g(promise, "promise");
        String appPackage = InstalledPackage.Companion.parse(appName).getAppPackage();
        PackageManager packageManager = this.reactContext.getPackageManager();
        try {
            if (appPackage != null) {
                packageManager.getPackageInfo(appPackage, 0);
                promise.resolve(Boolean.TRUE);
            } else {
                promise.resolve(Boolean.FALSE);
            }
        } catch (PackageManager.NameNotFoundException unused) {
            promise.resolve(Boolean.FALSE);
        }
    }

    @ReactMethod
    public final void sendMail(ReadableMap options, Callback callback) {
        q.g(options, "options");
        q.g(callback, "callback");
        Intent intent = new Intent("android.intent.action.SENDTO");
        intent.setData(Uri.parse("mailto:"));
        String string = options.getString("subject");
        String str = "";
        if (string == null) {
            string = str;
        }
        intent.putExtra("android.intent.extra.SUBJECT", string);
        String string2 = options.getString("body");
        if (string2 != null) {
            str = string2;
        }
        intent.putExtra("android.intent.extra.TEXT", str);
        Activity currentActivity = this.reactContext.getCurrentActivity();
        if (currentActivity != null) {
            currentActivity.startActivity(intent);
        }
        callback.invoke(Boolean.TRUE);
    }

    @ReactMethod
    public final void sendSMS(ReadableMap options, Callback callback) {
        q.g(options, "options");
        q.g(callback, "callback");
        Activity currentActivity = this.reactContext.getCurrentActivity();
        if (currentActivity != null) {
            Intent intent = new Intent("android.intent.action.VIEW");
            String string = options.getString("body");
            currentActivity.startActivity(intent.setData(Uri.parse("sms:?body=" + string)));
        }
        callback.invoke(Boolean.TRUE);
    }
}
