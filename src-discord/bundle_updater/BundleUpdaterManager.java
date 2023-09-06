package com.discord.bundle_updater;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import com.discord.bundle_updater.react.events.BundleDownloadedEvent;
import com.discord.bundle_updater.react.events.OtaCheckAttemptEvent;
import com.discord.misc.utilities.activity.ActivityExtensionsKt;
import com.discord.reactevents.ReactEvents;
import com.discord.theme.ThemeManagerKt;
import com.facebook.react.ReactInstanceManager;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.JSBundleLoader;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.WritableNativeMap;
import com.jakewharton.processphoenix.ProcessPhoenix;
import java.lang.reflect.Field;
import kf.x;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 (2\u00020\u0001:\u0001(B\u000f\u0012\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b&\u0010'J\u0016\u0010\u0006\u001a\u00020\u0005*\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0002J\b\u0010\u0007\u001a\u00020\u0005H\u0002J\b\u0010\b\u001a\u00020\u0005H\u0002J\u001c\u0010\f\u001a\u00020\u00052\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\tH\u0002J\b\u0010\r\u001a\u00020\u0003H\u0016J\u0010\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u000eH\u0007J\u0010\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u000eH\u0007J\b\u0010\u0012\u001a\u00020\u0005H\u0007J\b\u0010\u0013\u001a\u00020\u0005H\u0007J\u0010\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u0003H\u0007J\u0010\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u000eH\u0007J\u0010\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u000eH\u0007J\u0010\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u000eH\u0007J\u0010\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u0003H\u0007J\u0010\u0010\u001d\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u001bH\u0007R\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\"\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0018\u0010$\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006)"}, d2 = {"Lcom/discord/bundle_updater/BundleUpdaterManager;", "Lcom/facebook/react/bridge/ReactContextBaseJavaModule;", "Lcom/facebook/react/ReactInstanceManager;", "", "bundleLocation", "", "setJSBundle", "showSpinnerView", "removeSpinnerView", "Lkotlin/Function1;", "Landroid/view/ViewGroup;", "callback", "runOnActivity", "getName", "Lcom/facebook/react/bridge/Promise;", BaseJavaModule.METHOD_TYPE_PROMISE, "getInitialBundleDownloaded", "getInitialOtaUpdateChecked", "checkForUpdateAndReload", "reload", "type", "addListener", "getOtaRootPath", "getManifestInfo", "getBuildOverrideCookieContents", "cookieHeader", "setBuildOverrideCookieHeader", "", "count", "removeListeners", "Lcom/facebook/react/bridge/ReactApplicationContext;", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "Lcom/discord/reactevents/ReactEvents;", "reactEvents", "Lcom/discord/reactevents/ReactEvents;", "progressLayout", "Landroid/view/ViewGroup;", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "Companion", "bundle_updater_release"}, k = 1, mv = {1, 8, 0})

public final class BundleUpdaterManager extends ReactContextBaseJavaModule {
    private static final String BUNDLE_DOWNLOADED = "BundleDownloaded";
    public static final Companion Companion = new Companion(null);
    private static final String OTA_UPDATE_CHECKED = "OtaUpdateChecked";
    private ViewGroup progressLayout;
    private final ReactApplicationContext reactContext;
    private final ReactEvents reactEvents = new ReactEvents(x.a(BUNDLE_DOWNLOADED, f0.b(BundleDownloadedEvent.class)), x.a(OTA_UPDATE_CHECKED, f0.b(OtaCheckAttemptEvent.class)));

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/discord/bundle_updater/BundleUpdaterManager$Companion;", "", "()V", "BUNDLE_DOWNLOADED", "", "OTA_UPDATE_CHECKED", "bundle_updater_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    
    public static final class Companion {
        private Companion() {
        }

        public  Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    
    public BundleUpdaterManager(ReactApplicationContext reactContext) {
        super(reactContext);
        q.h(reactContext, "reactContext");
        this.reactContext = reactContext;
    }

    
    public final void removeSpinnerView() {
        runOnActivity(new BundleUpdaterManager$removeSpinnerView$1(this));
    }

    
    public final void runOnActivity(final Function1<? super ViewGroup, Unit> function1) {
        final Activity currentActivity = this.reactContext.getCurrentActivity();
        if (currentActivity != null) {
            currentActivity.runOnUiThread(new Runnable() { 
                @Override 
                public final void run() {
                    BundleUpdaterManager.runOnActivity$lambda$5$lambda$4(currentActivity, function1);
                }
            });
        }
    }

    
    public static final void runOnActivity$lambda$5$lambda$4(Activity this_apply, Function1 callback) {
        q.h(this_apply, "$this_apply");
        q.h(callback, "$callback");
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
            createFileLoader = JSBundleLoader.createAssetLoader(getReactApplicationContext(), "assets:
            q.g(createFileLoader, "createAssetLoader(\n     …     false,\n            )");
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
        q.h(type, "type");
        if (q.c(type, BUNDLE_DOWNLOADED)) {
            BundleUpdater.Companion.instance().setOnBundleDownloadedListener(new BundleUpdaterManager$addListener$1(this));
        } else if (q.c(type, OTA_UPDATE_CHECKED)) {
            BundleUpdater.Companion.instance().setOnOtaUpdateCheckedListener(new BundleUpdaterManager$addListener$2(this));
        }
    }

    @ReactMethod
    public final void checkForUpdateAndReload() {
        showSpinnerView();
        BundleUpdater.checkForUpdate$default(BundleUpdater.Companion.instance(), 0, new BundleUpdaterManager$checkForUpdateAndReload$1(this), 1, null);
    }

    @ReactMethod
    public final void getBuildOverrideCookieContents(Promise promise) {
        WritableNativeMap writableNativeMap;
        q.h(promise, "promise");
        BuildOverrideCookieContents parseBuildOverrideCookie = CookieValidator.INSTANCE.parseBuildOverrideCookie(BundleUpdater.Companion.instance().getBuildOverrideCookie());
        if (parseBuildOverrideCookie != null) {
            writableNativeMap = parseBuildOverrideCookie.toNativeMap();
        } else {
            writableNativeMap = null;
        }
        promise.resolve(writableNativeMap);
    }

    @ReactMethod
    public final void getInitialBundleDownloaded(Promise promise) {
        q.h(promise, "promise");
        promise.resolve(new BundleDownloadedEvent(BundleUpdater.Companion.instance().isVersionRequired()).serialize());
    }

    @ReactMethod
    public final void getInitialOtaUpdateChecked(Promise promise) {
        q.h(promise, "promise");
        promise.resolve(new OtaCheckAttemptEvent(BundleUpdater.Companion.instance().getOtaMetrics()).serialize());
    }

    @ReactMethod
    public final void getManifestInfo(Promise promise) {
        q.h(promise, "promise");
        promise.resolve(BundleUpdater.Companion.instance().manifestInfo().toNativeMap());
    }

    @Override 
    public String getName() {
        return "BundleUpdaterManager";
    }

    @ReactMethod
    public final void getOtaRootPath(Promise promise) {
        q.h(promise, "promise");
        promise.resolve(BundleUpdater.Companion.instance().getOtasRootDirectory().getAbsolutePath());
    }

    @ReactMethod
    public final void reload() {
        ProcessPhoenix.b(this.reactContext);
    }

    @ReactMethod
    public final void removeListeners(int i10) {
    }

    @ReactMethod
    public final void setBuildOverrideCookieHeader(String cookieHeader) {
        q.h(cookieHeader, "cookieHeader");
        BundleUpdater.Companion.instance().setBuildOverrideCookieHeader(cookieHeader);
    }
}
