package com.discord.bundle_updater;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import com.discord.misc.utilities.activity.ActivityExtensionsKt;
import com.discord.react.utilities.NativeMapExtensionsKt;
import com.discord.theme.ThemeManagerKt;
import com.facebook.react.ReactInstanceManager;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.JSBundleLoader;
import com.facebook.react.bridge.JavaScriptModule;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.jakewharton.processphoenix.ProcessPhoenix;
import java.lang.reflect.Field;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9677q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nf.C10853x;

@Metadata(m15074d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 '2\u00020\u0001:\u0001'B\u000f\u0012\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b%\u0010&J\u0016\u0010\u0006\u001a\u00020\u0005*\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0002J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002J\b\u0010\u000b\u001a\u00020\u0005H\u0002J\b\u0010\f\u001a\u00020\u0005H\u0002J\u001c\u0010\u0010\u001a\u00020\u00052\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00050\rH\u0002J\b\u0010\u0011\u001a\u00020\u0003H\u0016J\u0010\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u0012H\u0007J\b\u0010\u0015\u001a\u00020\u0005H\u0007J\b\u0010\u0016\u001a\u00020\u0005H\u0007J\u0010\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u0003H\u0007J\u0010\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u0019H\u0007R\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010$\u001a\u00020!8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#¨\u0006("}, m15073d2 = {"Lcom/discord/bundle_updater/BundleUpdaterManager;", "Lcom/facebook/react/bridge/ReactContextBaseJavaModule;", "Lcom/facebook/react/ReactInstanceManager;", "", "bundleLocation", "", "setJSBundle", "", "versionRequired", "Lcom/facebook/react/bridge/WritableNativeMap;", "getNativeMap", "showSpinnerView", "removeSpinnerView", "Lkotlin/Function1;", "Landroid/view/ViewGroup;", "callback", "runOnActivity", "getName", "Lcom/facebook/react/bridge/Promise;", BaseJavaModule.METHOD_TYPE_PROMISE, "getInitialBundleDownloaded", "checkForUpdateAndReload", "reload", "type", "addListener", "", "count", "removeListeners", "Lcom/facebook/react/bridge/ReactApplicationContext;", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "progressLayout", "Landroid/view/ViewGroup;", "Lcom/facebook/react/modules/core/DeviceEventManagerModule$RCTDeviceEventEmitter;", "getEventEmitter", "()Lcom/facebook/react/modules/core/DeviceEventManagerModule$RCTDeviceEventEmitter;", "eventEmitter", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "Companion", "bundle_updater_release"}, m15072k = 1, m15071mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class BundleUpdaterManager extends ReactContextBaseJavaModule {
    private static final String BUNDLE_DOWNLOADED = "BundleDownloaded";
    public static final Companion Companion = new Companion(null);
    private ViewGroup progressLayout;
    private final ReactApplicationContext reactContext;

    @Metadata(m15074d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m15073d2 = {"Lcom/discord/bundle_updater/BundleUpdaterManager$Companion;", "", "()V", "BUNDLE_DOWNLOADED", "", "bundle_updater_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BundleUpdaterManager(ReactApplicationContext reactContext) {
        super(reactContext);
        C9677q.m14633g(reactContext, "reactContext");
        this.reactContext = reactContext;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final DeviceEventManagerModule.RCTDeviceEventEmitter getEventEmitter() {
        JavaScriptModule jSModule = getReactApplicationContext().getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class);
        C9677q.m14634f(jSModule, "reactApplicationContext.…EventEmitter::class.java)");
        return (DeviceEventManagerModule.RCTDeviceEventEmitter) jSModule;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final WritableNativeMap getNativeMap(boolean z) {
        return NativeMapExtensionsKt.nativeMapOf(C10853x.m10921a("versionRequired", Boolean.valueOf(z)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void removeSpinnerView() {
        runOnActivity(new BundleUpdaterManager$removeSpinnerView$1(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void runOnActivity(final Function1<? super ViewGroup, Unit> function1) {
        final Activity currentActivity = this.reactContext.getCurrentActivity();
        if (currentActivity != null) {
            currentActivity.runOnUiThread(new Runnable() { // from class: com.discord.bundle_updater.c
                @Override // java.lang.Runnable
                public final void run() {
                    BundleUpdaterManager.runOnActivity$lambda$5$lambda$4(currentActivity, function1);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void runOnActivity$lambda$5$lambda$4(Activity this_apply, Function1 callback) {
        C9677q.m14633g(this_apply, "$this_apply");
        C9677q.m14633g(callback, "$callback");
        View rootView = ActivityExtensionsKt.getRootView(this_apply);
        if (rootView != null) {
            if (!(rootView instanceof ViewGroup)) {
                rootView = null;
            }
            ViewGroup viewGroup = (ViewGroup) rootView;
            if (viewGroup != null) {
                callback.invoke(viewGroup);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setJSBundle(ReactInstanceManager reactInstanceManager, String str) {
        JSBundleLoader createFileLoader;
        if (str != null) {
            try {
                createFileLoader = JSBundleLoader.createFileLoader(str);
            } catch (Exception unused) {
                throw new IllegalAccessException("Could not setJSBundle");
            }
        } else {
            createFileLoader = null;
        }
        if (createFileLoader == null) {
            createFileLoader = JSBundleLoader.createAssetLoader(getReactApplicationContext(), "assets://index.android.bundle", false);
            C9677q.m14634f(createFileLoader, "createAssetLoader(\n     …     false,\n            )");
        }
        Field declaredField = reactInstanceManager.getClass().getDeclaredField("mBundleLoader");
        declaredField.setAccessible(true);
        declaredField.set(reactInstanceManager, createFileLoader);
    }

    private final void showSpinnerView() {
        ProgressBar progressBar = new ProgressBar(this.reactContext);
        progressBar.setLayoutParams(new FrameLayout.LayoutParams(-2, -2, 17));
        progressBar.setIndeterminate(true);
        FrameLayout frameLayout = new FrameLayout(this.reactContext);
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        frameLayout.addView(progressBar);
        frameLayout.setBackgroundColor(ThemeManagerKt.getTheme().getBackgroundModifierSelected());
        frameLayout.setClickable(true);
        this.progressLayout = frameLayout;
        runOnActivity(new BundleUpdaterManager$showSpinnerView$2(this));
    }

    @ReactMethod
    public final void addListener(String type) {
        C9677q.m14633g(type, "type");
        if (C9677q.m14638b(type, BUNDLE_DOWNLOADED)) {
            BundleUpdater.Companion.instance().setOnBundleDownloadedListener(new BundleUpdaterManager$addListener$1(this));
        }
    }

    @ReactMethod
    public final void checkForUpdateAndReload() {
        showSpinnerView();
        BundleUpdater.checkForUpdate$default(BundleUpdater.Companion.instance(), 0, new BundleUpdaterManager$checkForUpdateAndReload$1(this), 1, null);
    }

    @ReactMethod
    public final void getInitialBundleDownloaded(Promise promise) {
        C9677q.m14633g(promise, "promise");
        promise.resolve(getNativeMap(BundleUpdater.Companion.instance().isVersionRequired()));
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "BundleUpdaterManager";
    }

    @ReactMethod
    public final void reload() {
        ProcessPhoenix.m26499b(this.reactContext);
    }

    @ReactMethod
    public final void removeListeners(int i) {
    }
}
