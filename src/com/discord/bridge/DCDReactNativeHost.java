package com.discord.bridge;

import android.app.Application;
import com.discord.BuildConfig;
import com.discord.bundle_updater.BundleUpdater;
import com.discord.turbomodules.DiscordTurboModuleManagerDelegate;
import com.facebook.react.ReactNativeHost;
import com.facebook.react.ReactPackage;
import java.io.File;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.C9677q;

@Metadata(m15074d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0014J\n\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0014J\b\u0010\b\u001a\u00020\tH\u0014J\b\u0010\n\u001a\u00020\u0006H\u0014J\u0018\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\r0\fj\b\u0012\u0004\u0012\u00020\r`\u000eH\u0014J\b\u0010\u000f\u001a\u00020\u0010H\u0014J\b\u0010\u0011\u001a\u00020\u0012H\u0016¨\u0006\u0013"}, m15073d2 = {"Lcom/discord/bridge/DCDReactNativeHost;", "Lcom/facebook/react/ReactNativeHost;", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "getBundleAssetName", "", "getJSBundleFile", "getJSIModulePackage", "Lcom/discord/bridge/DCDJSIModulePackage;", "getJSMainModuleName", "getPackages", "Ljava/util/ArrayList;", "Lcom/facebook/react/ReactPackage;", "Lkotlin/collections/ArrayList;", "getReactPackageTurboModuleManagerDelegateBuilder", "Lcom/discord/turbomodules/DiscordTurboModuleManagerDelegate$Builder;", "getUseDeveloperSupport", "", "app_canaryRelease"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes.dex */
public final class DCDReactNativeHost extends ReactNativeHost {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DCDReactNativeHost(Application application) {
        super(application);
        C9677q.m14633g(application, "application");
    }

    @Override // com.facebook.react.ReactNativeHost
    protected String getBundleAssetName() {
        return BundleUpdater.ANDROID_JS_BUNDLE_ASSET_NAME;
    }

    @Override // com.facebook.react.ReactNativeHost
    protected String getJSBundleFile() {
        File bundleLocation = BundleUpdater.Companion.instance().getBundleLocation();
        if (bundleLocation != null) {
            return bundleLocation.getAbsolutePath();
        }
        return null;
    }

    @Override // com.facebook.react.ReactNativeHost
    protected String getJSMainModuleName() {
        return BuildConfig.MAIN_MODULE;
    }

    @Override // com.facebook.react.ReactNativeHost
    public boolean getUseDeveloperSupport() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.ReactNativeHost
    public DCDJSIModulePackage getJSIModulePackage() {
        return new DCDJSIModulePackage();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.ReactNativeHost
    public ArrayList<ReactPackage> getPackages() {
        return new DCDPackageList(this).getPackages();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.ReactNativeHost
    public DiscordTurboModuleManagerDelegate.Builder getReactPackageTurboModuleManagerDelegateBuilder() {
        return new DiscordTurboModuleManagerDelegate.Builder();
    }
}
