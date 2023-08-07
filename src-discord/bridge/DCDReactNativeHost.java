package com.discord.bridge;

import android.app.Application;
import com.discord.BuildConfig;
import com.discord.bundle_updater.BundleUpdater;
import com.facebook.react.ReactPackage;
import com.facebook.react.defaults.DefaultReactNativeHost;
import java.io.File;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0014J\n\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0014J\b\u0010\b\u001a\u00020\u0006H\u0014J\u0018\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u000b0\nj\b\u0012\u0004\u0012\u00020\u000b`\fH\u0014J\b\u0010\r\u001a\u00020\u000eH\u0016¨\u0006\u000f"}, d2 = {"Lcom/discord/bridge/DCDReactNativeHost;", "Lcom/facebook/react/defaults/DefaultReactNativeHost;", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "getBundleAssetName", "", "getJSBundleFile", "getJSMainModuleName", "getPackages", "Ljava/util/ArrayList;", "Lcom/facebook/react/ReactPackage;", "Lkotlin/collections/ArrayList;", "getUseDeveloperSupport", "", "app_canaryRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)

public final class DCDReactNativeHost extends DefaultReactNativeHost {
    
    public DCDReactNativeHost(Application application) {
        super(application);
        q.h(application, "application");
    }

    @Override 
    protected String getBundleAssetName() {
        return BundleUpdater.ANDROID_JS_BUNDLE_ASSET_NAME;
    }

    @Override 
    protected String getJSBundleFile() {
        File bundleLocation = BundleUpdater.Companion.instance().getBundleLocation();
        if (bundleLocation != null) {
            return bundleLocation.getAbsolutePath();
        }
        return null;
    }

    @Override 
    protected String getJSMainModuleName() {
        return BuildConfig.MAIN_MODULE;
    }

    @Override 
    public boolean getUseDeveloperSupport() {
        return false;
    }

    
    @Override 
    public ArrayList<ReactPackage> getPackages() {
        return new DCDPackageList(this).getPackages();
    }
}
