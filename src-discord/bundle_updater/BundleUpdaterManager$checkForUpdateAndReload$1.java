package com.discord.bundle_updater;

import android.app.Activity;
import android.app.Application;
import android.view.ViewGroup;
import com.facebook.react.ReactApplication;
import com.facebook.react.ReactInstanceManager;
import com.facebook.react.ReactNativeHost;
import com.facebook.react.bridge.ReactApplicationContext;
import java.io.File;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.s;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)

final class BundleUpdaterManager$checkForUpdateAndReload$1 extends s implements Function0<Unit> {
    final  BundleUpdaterManager this$0;

    
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Landroid/view/ViewGroup;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    
    
    public static final class AnonymousClass1 extends s implements Function1<ViewGroup, Unit> {
        final  BundleUpdaterManager this$0;

        
        AnonymousClass1(BundleUpdaterManager bundleUpdaterManager) {
            super(1);
            this.this$0 = bundleUpdaterManager;
        }

        @Override 
        public   Unit invoke(ViewGroup viewGroup) {
            invoke2(viewGroup);
            return Unit.f21215a;
        }

        
        public final void invoke2(ViewGroup runOnActivity) {
            ReactApplicationContext reactApplicationContext;
            Application application;
            ReactNativeHost reactNativeHost;
            ReactInstanceManager reactInstanceManager;
            q.h(runOnActivity, "$this$runOnActivity");
            reactApplicationContext = this.this$0.reactContext;
            Activity currentActivity = reactApplicationContext.getCurrentActivity();
            if (currentActivity != null && (application = currentActivity.getApplication()) != null) {
                String str = null;
                if (!(application instanceof ReactApplication)) {
                    application = null;
                }
                ReactApplication reactApplication = (ReactApplication) application;
                if (reactApplication != null && (reactNativeHost = reactApplication.getReactNativeHost()) != null && (reactInstanceManager = reactNativeHost.getReactInstanceManager()) != null) {
                    BundleUpdaterManager bundleUpdaterManager = this.this$0;
                    File bundleLocation = BundleUpdater.Companion.instance().getBundleLocation();
                    if (bundleLocation != null) {
                        str = bundleLocation.getAbsolutePath();
                    }
                    bundleUpdaterManager.setJSBundle(reactInstanceManager, str);
                    reactInstanceManager.recreateReactContextInBackground();
                }
            }
        }
    }

    
    
    public BundleUpdaterManager$checkForUpdateAndReload$1(BundleUpdaterManager bundleUpdaterManager) {
        super(0);
        this.this$0 = bundleUpdaterManager;
    }

    @Override 
    
    public final void invoke2() {
        this.this$0.removeSpinnerView();
        BundleUpdaterManager bundleUpdaterManager = this.this$0;
        bundleUpdaterManager.runOnActivity(new AnonymousClass1(bundleUpdaterManager));
    }
}
