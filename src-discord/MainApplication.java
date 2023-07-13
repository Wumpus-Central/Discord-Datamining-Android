package com.discord;

import com.balthazargronon.RCTZeroconf.ZeroconfModule;
import com.discord.app_database.AppDatabaseModule;
import com.discord.bridge.DCDReactNativeHost;
import com.discord.bundle_updater.BundleUpdater;
import com.discord.cache.CacheModule;
import com.discord.chat.presentation.message.view.voicemessages.AudioPlayerManager;
import com.discord.client_info.ClientInfo;
import com.discord.crash_reporting.CrashReporting;
import com.discord.crash_reporting.PerformanceTracing;
import com.discord.flipper.FlipperUtils;
import com.discord.media_player.CacheDataSourceFactory;
import com.discord.react.FontManager;
import com.discord.react_fork_overrides.ReactForkOverrides;
import com.discord.resource_usage.DeviceResourceUsageRecorder;
import com.discord.sticker.sticker_types.RLottieUtils;
import com.discord.tti_manager.TTILoggingApplication;
import com.discord.tti_manager.TTIMetrics;
import com.discord.tti_manager.react.ReactMarkerListener;
import com.discord.utils.SoLoaderUtils;
import com.facebook.react.ReactApplication;
import com.facebook.react.modules.i18nmanager.I18nUtil;
import com.facebook.react.modules.network.NetworkingModule;
import kotlin.Metadata;
import kotlin.jvm.internal.q;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Response;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\u0007\u001a\u00020\bH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/discord/MainApplication;", "Lcom/discord/tti_manager/TTILoggingApplication;", "Lcom/facebook/react/ReactApplication;", "()V", ZeroconfModule.KEY_SERVICE_HOST, "Lcom/discord/bridge/DCDReactNativeHost;", "getReactNativeHost", "initialize", "", "app_canaryRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)

public final class MainApplication extends TTILoggingApplication implements ReactApplication {
    private final DCDReactNativeHost host = new DCDReactNativeHost(this);

    
    public static final void initialize$lambda$0(OkHttpClient.Builder builder) {
        final DeviceResourceUsageRecorder.Companion companion = DeviceResourceUsageRecorder.Companion;
        builder.b(new Interceptor() { 
            @Override 
            public final Response intercept(Interceptor.Chain chain) {
                q.g(chain, "chain");
                return DeviceResourceUsageRecorder.Companion.this.clientXHRInterceptor(chain);
            }
        });
    }

    @Override 
    public void initialize() {
        TTIMetrics tTIMetrics = TTIMetrics.INSTANCE;
        TTIMetrics.record$default(tTIMetrics, "Start MainApplication.initialize()", 0L, null, false, 14, null);
        ReactMarkerListener.INSTANCE.start();
        CacheModule.Companion.quickInitCache(this);
        TTIMetrics.record$default(tTIMetrics, "quickInitCache()", 0L, null, false, 14, null);
        AppDatabaseModule.Companion.initializeAppDatabase(this);
        TTIMetrics.record$default(tTIMetrics, "initializeAppDatabase()", 0L, null, false, 14, null);
        I18nUtil.getInstance().allowRTL(this, false);
        TTIMetrics.record$default(tTIMetrics, "I18nUtil.allowRtl()", 0L, null, false, 14, null);
        BundleUpdater.Companion companion = BundleUpdater.Companion;
        companion.init(this);
        TTIMetrics.record$default(tTIMetrics, "BundlerUpdater.init()", 0L, null, false, 14, null);
        ClientInfo.INSTANCE.init(this, BuildConfig.VERSION_NAME_RNA, BuildConfig.VERSION_CODE, BuildConfig.FLAVOR, "release", companion.instance().getManifestETag(), companion.instance().getOtaVersion());
        TTIMetrics.record$default(tTIMetrics, "ClientInfo.init()", 0L, null, false, 14, null);
        CacheDataSourceFactory.Companion.init(this);
        TTIMetrics.record$default(tTIMetrics, "CacheDataSourceFactory.init()", 0L, null, false, 14, null);
        CrashReporting.INSTANCE.init(this);
        TTIMetrics.record$default(tTIMetrics, "CrashReporting.init()", 0L, null, false, 14, null);
        PerformanceTracing.Companion.get().start();
        SoLoaderUtils.init$default(SoLoaderUtils.INSTANCE, this, false, 2, null);
        TTIMetrics.record$default(tTIMetrics, "SoLoaderUtils.init()", 0L, null, false, 14, null);
        NetworkingModule.setCustomClientBuilder(new NetworkingModule.CustomClientBuilder() { 
            @Override 
            public final void apply(OkHttpClient.Builder builder) {
                MainApplication.initialize$lambda$0(builder);
            }
        });
        FlipperUtils.INSTANCE.init(this);
        RLottieUtils.INSTANCE.init();
        FontManager.INSTANCE.init(this);
        ReactForkOverrides.INSTANCE.init();
        AudioPlayerManager.INSTANCE.init(this);
        TTIMetrics.record$default(tTIMetrics, "Finish MainApplication.initialize()", 0L, null, false, 14, null);
        this.host.getReactInstanceManager();
    }

    @Override 
    public DCDReactNativeHost getReactNativeHost() {
        return this.host;
    }
}
