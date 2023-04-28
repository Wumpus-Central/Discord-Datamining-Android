package com.facebook.react;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import com.facebook.react.devsupport.DoubleTapReloadRecognizer;
import com.facebook.react.modules.core.DefaultHardwareBackBtnHandler;
import p059d6.C6399a;

/* loaded from: classes7.dex */
public class ReactDelegate {
    private final Activity mActivity;
    private DoubleTapReloadRecognizer mDoubleTapReloadRecognizer = new DoubleTapReloadRecognizer();
    private Bundle mLaunchOptions;
    private final String mMainComponentName;
    private ReactNativeHost mReactNativeHost;
    private ReactRootView mReactRootView;

    public ReactDelegate(Activity activity, ReactNativeHost reactNativeHost, String str, Bundle bundle) {
        this.mActivity = activity;
        this.mMainComponentName = str;
        this.mLaunchOptions = bundle;
        this.mReactNativeHost = reactNativeHost;
    }

    private ReactNativeHost getReactNativeHost() {
        return this.mReactNativeHost;
    }

    protected ReactRootView createRootView() {
        return new ReactRootView(this.mActivity);
    }

    public ReactInstanceManager getReactInstanceManager() {
        return getReactNativeHost().getReactInstanceManager();
    }

    public ReactRootView getReactRootView() {
        return this.mReactRootView;
    }

    public void loadApp() {
        loadApp(this.mMainComponentName);
    }

    public void onActivityResult(int i, int i2, Intent intent, boolean z) {
        if (getReactNativeHost().hasInstance() && z) {
            getReactNativeHost().getReactInstanceManager().onActivityResult(this.mActivity, i, i2, intent);
        }
    }

    public boolean onBackPressed() {
        if (!getReactNativeHost().hasInstance()) {
            return false;
        }
        getReactNativeHost().getReactInstanceManager().onBackPressed();
        return true;
    }

    public void onHostDestroy() {
        ReactRootView reactRootView = this.mReactRootView;
        if (reactRootView != null) {
            reactRootView.unmountReactApplication();
            this.mReactRootView = null;
        }
        if (getReactNativeHost().hasInstance()) {
            getReactNativeHost().getReactInstanceManager().onHostDestroy(this.mActivity);
        }
    }

    public void onHostPause() {
        if (getReactNativeHost().hasInstance()) {
            getReactNativeHost().getReactInstanceManager().onHostPause(this.mActivity);
        }
    }

    public void onHostResume() {
        if (!getReactNativeHost().hasInstance()) {
            return;
        }
        if (this.mActivity instanceof DefaultHardwareBackBtnHandler) {
            ReactInstanceManager reactInstanceManager = getReactNativeHost().getReactInstanceManager();
            Activity activity = this.mActivity;
            reactInstanceManager.onHostResume(activity, (DefaultHardwareBackBtnHandler) activity);
            return;
        }
        throw new ClassCastException("Host Activity does not implement DefaultHardwareBackBtnHandler");
    }

    public boolean shouldShowDevMenuOrReload(int i, KeyEvent keyEvent) {
        if (!getReactNativeHost().hasInstance() || !getReactNativeHost().getUseDeveloperSupport()) {
            return false;
        }
        if (i == 82) {
            getReactNativeHost().getReactInstanceManager().showDevOptionsDialog();
            return true;
        } else if (!((DoubleTapReloadRecognizer) C6399a.m25622c(this.mDoubleTapReloadRecognizer)).didDoubleTapR(i, this.mActivity.getCurrentFocus())) {
            return false;
        } else {
            getReactNativeHost().getReactInstanceManager().getDevSupportManager().handleReloadJS();
            return true;
        }
    }

    public void loadApp(String str) {
        if (this.mReactRootView == null) {
            ReactRootView createRootView = createRootView();
            this.mReactRootView = createRootView;
            createRootView.startReactApplication(getReactNativeHost().getReactInstanceManager(), str, this.mLaunchOptions);
            return;
        }
        throw new IllegalStateException("Cannot loadApp while app is already running.");
    }
}
