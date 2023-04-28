package com.discord;

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
import com.discord.sticker.sticker_types.RLottieUtils;
import com.discord.tti_manager.TTILoggingApplication;
import com.discord.tti_manager.TTIMetrics;
import com.discord.tti_manager.react.ReactMarkerListener;
import com.discord.utils.SoLoaderUtils;
import com.facebook.react.ReactApplication;
import com.facebook.react.modules.i18nmanager.I18nUtil;
import kotlin.Metadata;

@Metadata(m15074d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\u0007\u001a\u00020\bH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, m15073d2 = {"Lcom/discord/MainApplication;", "Lcom/discord/tti_manager/TTILoggingApplication;", "Lcom/facebook/react/ReactApplication;", "()V", "host", "Lcom/discord/bridge/DCDReactNativeHost;", "getReactNativeHost", "initialize", "", "app_canaryRelease"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes.dex */
public final class MainApplication extends TTILoggingApplication implements ReactApplication {
    private final DCDReactNativeHost host = new DCDReactNativeHost(this);

    @Override // com.discord.tti_manager.TTILoggingApplication
    public void initialize() {
        TTIMetrics tTIMetrics = TTIMetrics.INSTANCE;
        TTIMetrics.record$default(tTIMetrics, "Start MainApplication.initialize()", 0L, null, false, 14, null);
        ReactMarkerListener.INSTANCE.start();
        CacheModule.Companion.quickInitCache(this);
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
        FlipperUtils.INSTANCE.init(this);
        RLottieUtils.INSTANCE.init();
        FontManager.INSTANCE.init(this);
        ReactForkOverrides.INSTANCE.init();
        AudioPlayerManager.INSTANCE.init(this);
        TTIMetrics.record$default(tTIMetrics, "Finish MainApplication.initialize()", 0L, null, false, 14, null);
        this.host.getReactInstanceManager();
    }

    @Override // com.facebook.react.ReactApplication
    public DCDReactNativeHost getReactNativeHost() {
        return this.host;
    }
}
