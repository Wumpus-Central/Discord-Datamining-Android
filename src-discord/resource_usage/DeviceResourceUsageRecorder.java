package com.discord.resource_usage;

import android.net.TrafficStats;
import android.os.Build;
import android.os.Process;
import android.telephony.SignalStrength;
import android.telephony.TelephonyManager;
import co.discord.media_engine.b;
import com.discord.react.utilities.NativeMapExtensionsKt;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.WritableNativeMap;
import jf.x;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q;
import okhttp3.Interceptor;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okio.BufferedSource;
import rj.e;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u0000 \u00032\u00020\u0001:\u0002\u0003\u0004B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0005"}, d2 = {"Lcom/discord/resource_usage/DeviceResourceUsageRecorder;", "", "()V", "Companion", "RequestStats", "resource_usage_monitor_release"}, k = 1, mv = {1, 8, 0}, xi = 48)

public final class DeviceResourceUsageRecorder {
    private static final long initialAppReceiveBytes;
    private static final long initialAppSendBytes;
    private static long mediaPlayerBytesReceived;
    private static long socketBytesReceived;
    private static final int uid;
    public static final Companion Companion = new Companion(null);
    private static final RequestStats ota = new RequestStats(0, 0, 3, null);
    private static final RequestStats xhr = new RequestStats(0, 0, 3, null);
    private static final RequestStats fresco = new RequestStats(0, 0, 3, null);
    private static final RequestStats downloads = new RequestStats(0, 0, 3, null);
    private static long initialCellularReceiveBytes = TrafficStats.getMobileRxBytes();
    private static long initialCellularSendBytes = TrafficStats.getMobileTxBytes();
    private static long initialTotalReceiveBytes = TrafficStats.getTotalRxBytes();
    private static long initialTotalSendBytes = TrafficStats.getTotalTxBytes();

    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cJ\u000e\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cJ\u000e\u0010\u001e\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cJ\u000e\u0010\u001f\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cJ\u000e\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#J\u0018\u0010$\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010%\u001a\u00020\u0004H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\r\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0012\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0013\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u000f\"\u0004\b\u0015\u0010\u0011R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006&"}, d2 = {"Lcom/discord/resource_usage/DeviceResourceUsageRecorder$Companion;", "", "()V", "downloads", "Lcom/discord/resource_usage/DeviceResourceUsageRecorder$RequestStats;", "fresco", "initialAppReceiveBytes", "", "initialAppSendBytes", "initialCellularReceiveBytes", "initialCellularSendBytes", "initialTotalReceiveBytes", "initialTotalSendBytes", "mediaPlayerBytesReceived", "getMediaPlayerBytesReceived", "()J", "setMediaPlayerBytesReceived", "(J)V", "ota", "socketBytesReceived", "getSocketBytesReceived", "setSocketBytesReceived", "uid", "", "xhr", "bundleUpdaterInterceptor", "Lokhttp3/Response;", "chain", "Lokhttp3/Interceptor$Chain;", "clientXHRInterceptor", "downloadInterceptor", "frescoInterceptor", "getNetworkUsage", "Lcom/facebook/react/bridge/WritableNativeMap;", "reactApplicationContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "requestStatsInterceptor", "stats", "resource_usage_monitor_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    
    public static final class Companion {
        private Companion() {
        }

        public  Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final Response requestStatsInterceptor(Interceptor.Chain chain, RequestStats requestStats) {
            Response b10 = chain.b(chain.a());
            ResponseBody a10 = b10.a();
            requestStats.setNumRequests(requestStats.getNumRequests() + 1);
            if (e.b(b10) && a10 != null) {
                BufferedSource source = a10.source();
                source.g(Long.MAX_VALUE);
                requestStats.setBytesReceived(requestStats.getBytesReceived() + source.d().size());
            }
            return b10;
        }

        public final Response bundleUpdaterInterceptor(Interceptor.Chain chain) {
            q.h(chain, "chain");
            return requestStatsInterceptor(chain, DeviceResourceUsageRecorder.ota);
        }

        public final Response clientXHRInterceptor(Interceptor.Chain chain) {
            q.h(chain, "chain");
            return requestStatsInterceptor(chain, DeviceResourceUsageRecorder.xhr);
        }

        public final Response downloadInterceptor(Interceptor.Chain chain) {
            q.h(chain, "chain");
            return requestStatsInterceptor(chain, DeviceResourceUsageRecorder.downloads);
        }

        public final Response frescoInterceptor(Interceptor.Chain chain) {
            q.h(chain, "chain");
            return requestStatsInterceptor(chain, DeviceResourceUsageRecorder.fresco);
        }

        public final long getMediaPlayerBytesReceived() {
            return DeviceResourceUsageRecorder.mediaPlayerBytesReceived;
        }

        public final WritableNativeMap getNetworkUsage(ReactApplicationContext reactApplicationContext) {
            Pair pair;
            Integer num;
            SignalStrength signalStrength;
            int i10;
            q.h(reactApplicationContext, "reactApplicationContext");
            try {
                Object systemService = reactApplicationContext.getSystemService("phone");
                q.f(systemService, "null cannot be cast to non-null type android.telephony.TelephonyManager");
                TelephonyManager telephonyManager = (TelephonyManager) systemService;
                if (Build.VERSION.SDK_INT >= 28) {
                    signalStrength = telephonyManager.getSignalStrength();
                    if (signalStrength != null) {
                        i10 = signalStrength.getLevel();
                    } else {
                        i10 = 0;
                    }
                    num = Integer.valueOf(i10);
                } else {
                    num = null;
                }
                pair = new Pair(num, Boolean.valueOf(telephonyManager.isNetworkRoaming()));
            } catch (Exception unused) {
                pair = new Pair(null, null);
            }
            return NativeMapExtensionsKt.nativeMapOf(x.a("signalStrengthLevel", (Integer) pair.a()), x.a("isNetworkRoaming", (Boolean) pair.b()), x.a("cellularReceiveBytes", Long.valueOf(TrafficStats.getMobileRxBytes() - DeviceResourceUsageRecorder.initialCellularReceiveBytes)), x.a("cellularSendBytes", Long.valueOf(TrafficStats.getMobileTxBytes() - DeviceResourceUsageRecorder.initialCellularSendBytes)), x.a("totalReceiveBytes", Long.valueOf(TrafficStats.getTotalRxBytes() - DeviceResourceUsageRecorder.initialTotalReceiveBytes)), x.a("totalSendBytes", Long.valueOf(TrafficStats.getTotalTxBytes() - DeviceResourceUsageRecorder.initialTotalSendBytes)), x.a("uidReceiveBytes", Long.valueOf(TrafficStats.getUidRxBytes(DeviceResourceUsageRecorder.uid) - DeviceResourceUsageRecorder.initialAppReceiveBytes)), x.a("uidSendBytes", Long.valueOf(TrafficStats.getUidTxBytes(DeviceResourceUsageRecorder.uid) - DeviceResourceUsageRecorder.initialAppSendBytes)), x.a("socketBytesReceived", Long.valueOf(getSocketBytesReceived())), x.a("otaBytesReceived", Long.valueOf(DeviceResourceUsageRecorder.ota.getBytesReceived())), x.a("otaNumRequests", Integer.valueOf(DeviceResourceUsageRecorder.ota.getNumRequests())), x.a("xhrBytesReceived", Long.valueOf(DeviceResourceUsageRecorder.xhr.getBytesReceived())), x.a("xhrNumRequests", Integer.valueOf(DeviceResourceUsageRecorder.xhr.getNumRequests())), x.a("frescoBytesReceived", Long.valueOf(DeviceResourceUsageRecorder.fresco.getBytesReceived())), x.a("frescoNumRequests", Integer.valueOf(DeviceResourceUsageRecorder.fresco.getNumRequests())), x.a("downloadBytesReceived", Long.valueOf(DeviceResourceUsageRecorder.downloads.getBytesReceived())), x.a("downloadNumRequests", Integer.valueOf(DeviceResourceUsageRecorder.downloads.getNumRequests())), x.a("mediaPlayerBytesReceived", Long.valueOf(getMediaPlayerBytesReceived())));
        }

        public final long getSocketBytesReceived() {
            return DeviceResourceUsageRecorder.socketBytesReceived;
        }

        public final void setMediaPlayerBytesReceived(long j10) {
            DeviceResourceUsageRecorder.mediaPlayerBytesReceived = j10;
        }

        public final void setSocketBytesReceived(long j10) {
            DeviceResourceUsageRecorder.socketBytesReceived = j10;
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0018"}, d2 = {"Lcom/discord/resource_usage/DeviceResourceUsageRecorder$RequestStats;", "", "numRequests", "", "bytesReceived", "", "(IJ)V", "getBytesReceived", "()J", "setBytesReceived", "(J)V", "getNumRequests", "()I", "setNumRequests", "(I)V", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "resource_usage_monitor_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    
    public static final class RequestStats {
        private long bytesReceived;
        private int numRequests;

        public RequestStats() {
            this(0, 0L, 3, null);
        }

        public RequestStats(int i10, long j10) {
            this.numRequests = i10;
            this.bytesReceived = j10;
        }

        public static  RequestStats copy$default(RequestStats requestStats, int i10, long j10, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                i10 = requestStats.numRequests;
            }
            if ((i11 & 2) != 0) {
                j10 = requestStats.bytesReceived;
            }
            return requestStats.copy(i10, j10);
        }

        public final int component1() {
            return this.numRequests;
        }

        public final long component2() {
            return this.bytesReceived;
        }

        public final RequestStats copy(int i10, long j10) {
            return new RequestStats(i10, j10);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RequestStats)) {
                return false;
            }
            RequestStats requestStats = (RequestStats) obj;
            return this.numRequests == requestStats.numRequests && this.bytesReceived == requestStats.bytesReceived;
        }

        public final long getBytesReceived() {
            return this.bytesReceived;
        }

        public final int getNumRequests() {
            return this.numRequests;
        }

        public int hashCode() {
            return (this.numRequests * 31) + b.a(this.bytesReceived);
        }

        public final void setBytesReceived(long j10) {
            this.bytesReceived = j10;
        }

        public final void setNumRequests(int i10) {
            this.numRequests = i10;
        }

        public String toString() {
            int i10 = this.numRequests;
            long j10 = this.bytesReceived;
            return "RequestStats(numRequests=" + i10 + ", bytesReceived=" + j10 + ")";
        }

        public  RequestStats(int i10, long j10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? 0 : i10, (i11 & 2) != 0 ? 0L : j10);
        }
    }

    static {
        int myUid = Process.myUid();
        uid = myUid;
        initialAppReceiveBytes = TrafficStats.getUidRxBytes(myUid);
        initialAppSendBytes = TrafficStats.getUidTxBytes(myUid);
    }
}
