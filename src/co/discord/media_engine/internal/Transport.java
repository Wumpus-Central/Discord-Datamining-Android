package co.discord.media_engine.internal;

import co.discord.media_engine.C4081a;
import co.discord.media_engine.ReceiverReport;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;

@Metadata(m15074d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001BY\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004\u0012\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007\u0012\n\u0010\b\u001a\u00060\u0003j\u0002`\t\u0012\n\u0010\n\u001a\u00060\u0006j\u0002`\u0007\u0012\n\u0010\u000b\u001a\u00060\u0006j\u0002`\u0007\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f¢\u0006\u0002\u0010\u0011J\r\u0010\u001e\u001a\u00060\u0003j\u0002`\u0004HÆ\u0003J\r\u0010\u001f\u001a\u00060\u0006j\u0002`\u0007HÆ\u0003J\r\u0010 \u001a\u00060\u0003j\u0002`\tHÆ\u0003J\r\u0010!\u001a\u00060\u0006j\u0002`\u0007HÆ\u0003J\r\u0010\"\u001a\u00060\u0006j\u0002`\u0007HÆ\u0003J\t\u0010#\u001a\u00020\rHÆ\u0003J\u0016\u0010$\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fHÆ\u0003¢\u0006\u0002\u0010\u001aJp\u0010%\u001a\u00020\u00002\f\b\u0002\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\f\b\u0002\u0010\u0005\u001a\u00060\u0006j\u0002`\u00072\f\b\u0002\u0010\b\u001a\u00060\u0003j\u0002`\t2\f\b\u0002\u0010\n\u001a\u00060\u0006j\u0002`\u00072\f\b\u0002\u0010\u000b\u001a\u00060\u0006j\u0002`\u00072\b\b\u0002\u0010\f\u001a\u00020\r2\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fHÆ\u0001¢\u0006\u0002\u0010&J\u0013\u0010'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010*\u001a\u00020\u0006HÖ\u0001J\t\u0010+\u001a\u00020\rHÖ\u0001R\u0015\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0015\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0015\u0010\b\u001a\u00060\u0003j\u0002`\t¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0013R\u001b\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b\u0019\u0010\u001aR\u0015\u0010\n\u001a\u00060\u0006j\u0002`\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0017R\u0015\u0010\u000b\u001a\u00060\u0006j\u0002`\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0017¨\u0006,"}, m15073d2 = {"Lco/discord/media_engine/internal/Transport;", "", "decryptionFailures", "", "Lco/discord/media_engine/internal/U32;", "maxPaddingBitrate", "", "Lco/discord/media_engine/internal/I32;", "pacerDelay", "Lco/discord/media_engine/internal/I64;", "rtt", "sendBandwidth", "localAddress", "", "receiverReports", "", "Lco/discord/media_engine/ReceiverReport;", "(JIJIILjava/lang/String;[Lco/discord/media_engine/ReceiverReport;)V", "getDecryptionFailures", "()J", "getLocalAddress", "()Ljava/lang/String;", "getMaxPaddingBitrate", "()I", "getPacerDelay", "getReceiverReports", "()[Lco/discord/media_engine/ReceiverReport;", "[Lco/discord/media_engine/ReceiverReport;", "getRtt", "getSendBandwidth", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(JIJIILjava/lang/String;[Lco/discord/media_engine/ReceiverReport;)Lco/discord/media_engine/internal/Transport;", "equals", "", "other", "hashCode", "toString", "android_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes.dex */
public final class Transport {
    private final long decryptionFailures;
    private final String localAddress;
    private final int maxPaddingBitrate;
    private final long pacerDelay;
    private final ReceiverReport[] receiverReports;
    private final int rtt;
    private final int sendBandwidth;

    public Transport(long j, int i, long j2, int i2, int i3, String localAddress, ReceiverReport[] receiverReportArr) {
        C9971q.m14633g(localAddress, "localAddress");
        this.decryptionFailures = j;
        this.maxPaddingBitrate = i;
        this.pacerDelay = j2;
        this.rtt = i2;
        this.sendBandwidth = i3;
        this.localAddress = localAddress;
        this.receiverReports = receiverReportArr;
    }

    public final long component1() {
        return this.decryptionFailures;
    }

    public final int component2() {
        return this.maxPaddingBitrate;
    }

    public final long component3() {
        return this.pacerDelay;
    }

    public final int component4() {
        return this.rtt;
    }

    public final int component5() {
        return this.sendBandwidth;
    }

    public final String component6() {
        return this.localAddress;
    }

    public final ReceiverReport[] component7() {
        return this.receiverReports;
    }

    public final Transport copy(long j, int i, long j2, int i2, int i3, String localAddress, ReceiverReport[] receiverReportArr) {
        C9971q.m14633g(localAddress, "localAddress");
        return new Transport(j, i, j2, i2, i3, localAddress, receiverReportArr);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Transport)) {
            return false;
        }
        Transport transport = (Transport) obj;
        return this.decryptionFailures == transport.decryptionFailures && this.maxPaddingBitrate == transport.maxPaddingBitrate && this.pacerDelay == transport.pacerDelay && this.rtt == transport.rtt && this.sendBandwidth == transport.sendBandwidth && C9971q.m14638b(this.localAddress, transport.localAddress) && C9971q.m14638b(this.receiverReports, transport.receiverReports);
    }

    public final long getDecryptionFailures() {
        return this.decryptionFailures;
    }

    public final String getLocalAddress() {
        return this.localAddress;
    }

    public final int getMaxPaddingBitrate() {
        return this.maxPaddingBitrate;
    }

    public final long getPacerDelay() {
        return this.pacerDelay;
    }

    public final ReceiverReport[] getReceiverReports() {
        return this.receiverReports;
    }

    public final int getRtt() {
        return this.rtt;
    }

    public final int getSendBandwidth() {
        return this.sendBandwidth;
    }

    public int hashCode() {
        int a = ((((((((((C4081a.m32873a(this.decryptionFailures) * 31) + this.maxPaddingBitrate) * 31) + C4081a.m32873a(this.pacerDelay)) * 31) + this.rtt) * 31) + this.sendBandwidth) * 31) + this.localAddress.hashCode()) * 31;
        ReceiverReport[] receiverReportArr = this.receiverReports;
        return a + (receiverReportArr == null ? 0 : Arrays.hashCode(receiverReportArr));
    }

    public String toString() {
        return "Transport(decryptionFailures=" + this.decryptionFailures + ", maxPaddingBitrate=" + this.maxPaddingBitrate + ", pacerDelay=" + this.pacerDelay + ", rtt=" + this.rtt + ", sendBandwidth=" + this.sendBandwidth + ", localAddress=" + this.localAddress + ", receiverReports=" + Arrays.toString(this.receiverReports) + ')';
    }
}
