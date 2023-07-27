package com.discord.tti_manager.react;

import com.discord.tti_manager.TTIMetrics;
import com.facebook.react.bridge.ReactMarker;
import com.facebook.react.bridge.ReactMarkerConstants;
import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.w;
import kotlin.properties.ReadWriteProperty;
import kotlin.properties.a;
import kotlin.reflect.KProperty;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J$\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\u0006\u0010 \u001a\u00020!H\u0016J\u0006\u0010\"\u001a\u00020\u001bJ\u0006\u0010#\u001a\u00020\u001bR+\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00048F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR+\u0010\f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00048F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u000f\u0010\u000b\u001a\u0004\b\r\u0010\u0007\"\u0004\b\u000e\u0010\tR+\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00048F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0013\u0010\u000b\u001a\u0004\b\u0011\u0010\u0007\"\u0004\b\u0012\u0010\tR\u001a\u0010\u0014\u001a\u00020\u0015X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006$"}, d2 = {"Lcom/discord/tti_manager/react/ReactMarkerListener;", "Lcom/facebook/react/bridge/ReactMarker$MarkerListener;", "()V", "<set-?>", "", "bundleLoadedTimestamp", "getBundleLoadedTimestamp", "()J", "setBundleLoadedTimestamp", "(J)V", "bundleLoadedTimestamp$delegate", "Lkotlin/properties/ReadWriteProperty;", "bundleParsedTimestamp", "getBundleParsedTimestamp", "setBundleParsedTimestamp", "bundleParsedTimestamp$delegate", "bundleStartedTimestamp", "getBundleStartedTimestamp", "setBundleStartedTimestamp", "bundleStartedTimestamp$delegate", "stopped", "", "getStopped", "()Z", "setStopped", "(Z)V", "logMarker", "", "marker", "Lcom/facebook/react/bridge/ReactMarkerConstants;", "tag", "", "instanceKey", "", ViewProps.START, "stop", "tti_manager_release"}, k = 1, mv = {1, 8, 0}, xi = 48)

public final class ReactMarkerListener implements ReactMarker.MarkerListener {
    private static final ReadWriteProperty bundleLoadedTimestamp$delegate;
    private static final ReadWriteProperty bundleParsedTimestamp$delegate;
    private static final ReadWriteProperty bundleStartedTimestamp$delegate;
    static final  KProperty<Object>[] $$delegatedProperties = {f0.e(new w(ReactMarkerListener.class, "bundleStartedTimestamp", "getBundleStartedTimestamp()J", 0)), f0.e(new w(ReactMarkerListener.class, "bundleLoadedTimestamp", "getBundleLoadedTimestamp()J", 0)), f0.e(new w(ReactMarkerListener.class, "bundleParsedTimestamp", "getBundleParsedTimestamp()J", 0))};
    public static final ReactMarkerListener INSTANCE = new ReactMarkerListener();
    private static boolean stopped = true;

    static {
        a aVar = a.f20726a;
        bundleStartedTimestamp$delegate = aVar.a();
        bundleLoadedTimestamp$delegate = aVar.a();
        bundleParsedTimestamp$delegate = aVar.a();
    }

    private ReactMarkerListener() {
    }

    public final long getBundleLoadedTimestamp() {
        return ((Number) bundleLoadedTimestamp$delegate.getValue(this, $$delegatedProperties[1])).longValue();
    }

    public final long getBundleParsedTimestamp() {
        return ((Number) bundleParsedTimestamp$delegate.getValue(this, $$delegatedProperties[2])).longValue();
    }

    public final long getBundleStartedTimestamp() {
        return ((Number) bundleStartedTimestamp$delegate.getValue(this, $$delegatedProperties[0])).longValue();
    }

    public final boolean getStopped() {
        return stopped;
    }

    @Override 
    public void logMarker(ReactMarkerConstants reactMarkerConstants, String str, int i10) {
        String str2;
        long currentTimeMillis = System.currentTimeMillis();
        if (reactMarkerConstants != null) {
            str2 = reactMarkerConstants.name();
        } else {
            str2 = null;
        }
        if (str2 != null) {
            TTIMetrics.INSTANCE.record(str2, currentTimeMillis, str, true);
        }
        if (str2 != null) {
            switch (str2.hashCode()) {
                case -1048597525:
                    if (str2.equals("PRE_RUN_JS_BUNDLE_START")) {
                        setBundleStartedTimestamp(currentTimeMillis);
                        setBundleLoadedTimestamp(currentTimeMillis);
                        setBundleParsedTimestamp(currentTimeMillis);
                        return;
                    }
                    return;
                case -351240678:
                    if (str2.equals("CONTENT_APPEARED")) {
                        stop();
                        return;
                    }
                    return;
                case 241900896:
                    if (str2.equals("RUN_JS_BUNDLE_END")) {
                        setBundleParsedTimestamp(currentTimeMillis);
                        return;
                    }
                    return;
                case 551634855:
                    if (str2.equals("RUN_JS_BUNDLE_START")) {
                        setBundleLoadedTimestamp(currentTimeMillis);
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
    }

    public final void setBundleLoadedTimestamp(long j10) {
        bundleLoadedTimestamp$delegate.setValue(this, $$delegatedProperties[1], Long.valueOf(j10));
    }

    public final void setBundleParsedTimestamp(long j10) {
        bundleParsedTimestamp$delegate.setValue(this, $$delegatedProperties[2], Long.valueOf(j10));
    }

    public final void setBundleStartedTimestamp(long j10) {
        bundleStartedTimestamp$delegate.setValue(this, $$delegatedProperties[0], Long.valueOf(j10));
    }

    public final void setStopped(boolean z10) {
        stopped = z10;
    }

    public final void start() {
        if (stopped) {
            ReactMarker.addListener(this);
            stopped = false;
        }
    }

    public final void stop() {
        if (!stopped) {
            ReactMarker.removeListener(this);
            stopped = true;
        }
    }
}
