package com.reactnativecommunity.netinfo;

import android.os.Build;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.module.annotations.ReactModule;
import com.reactnativecommunity.netinfo.C6128a;
import ye.AbstractC14368b;
import ye.C14366a;
import ye.C14373g;

@ReactModule(name = NetInfoModule.NAME)
/* loaded from: classes6.dex */
public class NetInfoModule extends ReactContextBaseJavaModule implements C6128a.AbstractC6129b {
    public static final String NAME = "RNCNetInfo";
    private final C6128a mAmazonConnectivityChecker;
    private final AbstractC14368b mConnectivityReceiver;
    private int numberOfListeners = 0;

    public NetInfoModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        if (Build.VERSION.SDK_INT >= 24) {
            this.mConnectivityReceiver = new C14373g(reactApplicationContext);
        } else {
            this.mConnectivityReceiver = new C14366a(reactApplicationContext);
        }
        this.mAmazonConnectivityChecker = new C6128a(reactApplicationContext, this);
    }

    @ReactMethod
    public void addListener(String str) {
        this.numberOfListeners++;
        this.mConnectivityReceiver.f32530e = true;
    }

    @ReactMethod
    public void getCurrentState(String str, Promise promise) {
        this.mConnectivityReceiver.m757d(str, promise);
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public void initialize() {
        this.mConnectivityReceiver.mo748g();
        this.mAmazonConnectivityChecker.m26209g();
    }

    @Override // com.reactnativecommunity.netinfo.C6128a.AbstractC6129b
    public void onAmazonFireDeviceConnectivityChanged(boolean z) {
        this.mConnectivityReceiver.m753i(z);
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public void onCatalystInstanceDestroy() {
        this.mAmazonConnectivityChecker.m26205k();
        this.mConnectivityReceiver.mo747j();
        this.mConnectivityReceiver.f32530e = false;
    }

    @ReactMethod
    public void removeListeners(Integer num) {
        int intValue = this.numberOfListeners - num.intValue();
        this.numberOfListeners = intValue;
        if (intValue == 0) {
            this.mConnectivityReceiver.f32530e = false;
        }
    }
}
