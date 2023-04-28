package co.discord.media_engine;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;

@Metadata(m15074d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f¢\u0006\u0002\u0010\u000eJ\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\u0010\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0015J\u000b\u0010\"\u001a\u0004\u0018\u00010\nHÆ\u0003J\u0016\u0010#\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010\u001bJ`\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fHÆ\u0001¢\u0006\u0002\u0010%J\u0013\u0010&\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010)\u001a\u00020\u0003HÖ\u0001J\t\u0010*\u001a\u00020\nHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0015\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0010R\u001b\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f¢\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b\u001a\u0010\u001b¨\u0006+"}, m15073d2 = {"Lco/discord/media_engine/Transport;", "", "availableOutgoingBitrate", "", "bytesReceived", "", "bytesSent", "ping", "decryptionFailures", "localAddress", "", "receiverReports", "", "Lco/discord/media_engine/ReceiverReport;", "(IJJILjava/lang/Integer;Ljava/lang/String;[Lco/discord/media_engine/ReceiverReport;)V", "getAvailableOutgoingBitrate", "()I", "getBytesReceived", "()J", "getBytesSent", "getDecryptionFailures", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getLocalAddress", "()Ljava/lang/String;", "getPing", "getReceiverReports", "()[Lco/discord/media_engine/ReceiverReport;", "[Lco/discord/media_engine/ReceiverReport;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(IJJILjava/lang/Integer;Ljava/lang/String;[Lco/discord/media_engine/ReceiverReport;)Lco/discord/media_engine/Transport;", "equals", "", "other", "hashCode", "toString", "android_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes.dex */
public final class Transport {
    private final int availableOutgoingBitrate;
    private final long bytesReceived;
    private final long bytesSent;
    private final Integer decryptionFailures;
    private final String localAddress;
    private final int ping;
    private final ReceiverReport[] receiverReports;

    public Transport(int i, long j, long j2, int i2, Integer num, String str, ReceiverReport[] receiverReportArr) {
        this.availableOutgoingBitrate = i;
        this.bytesReceived = j;
        this.bytesSent = j2;
        this.ping = i2;
        this.decryptionFailures = num;
        this.localAddress = str;
        this.receiverReports = receiverReportArr;
    }

    public final int component1() {
        return this.availableOutgoingBitrate;
    }

    public final long component2() {
        return this.bytesReceived;
    }

    public final long component3() {
        return this.bytesSent;
    }

    public final int component4() {
        return this.ping;
    }

    public final Integer component5() {
        return this.decryptionFailures;
    }

    public final String component6() {
        return this.localAddress;
    }

    public final ReceiverReport[] component7() {
        return this.receiverReports;
    }

    public final Transport copy(int i, long j, long j2, int i2, Integer num, String str, ReceiverReport[] receiverReportArr) {
        return new Transport(i, j, j2, i2, num, str, receiverReportArr);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Transport)) {
            return false;
        }
        Transport transport = (Transport) obj;
        return this.availableOutgoingBitrate == transport.availableOutgoingBitrate && this.bytesReceived == transport.bytesReceived && this.bytesSent == transport.bytesSent && this.ping == transport.ping && C9971q.m14638b(this.decryptionFailures, transport.decryptionFailures) && C9971q.m14638b(this.localAddress, transport.localAddress) && C9971q.m14638b(this.receiverReports, transport.receiverReports);
    }

    public final int getAvailableOutgoingBitrate() {
        return this.availableOutgoingBitrate;
    }

    public final long getBytesReceived() {
        return this.bytesReceived;
    }

    public final long getBytesSent() {
        return this.bytesSent;
    }

    public final Integer getDecryptionFailures() {
        return this.decryptionFailures;
    }

    public final String getLocalAddress() {
        return this.localAddress;
    }

    public final int getPing() {
        return this.ping;
    }

    public final ReceiverReport[] getReceiverReports() {
        return this.receiverReports;
    }

    public int hashCode() {
        int a = ((((((this.availableOutgoingBitrate * 31) + C4081a.m32873a(this.bytesReceived)) * 31) + C4081a.m32873a(this.bytesSent)) * 31) + this.ping) * 31;
        Integer num = this.decryptionFailures;
        int i = 0;
        int hashCode = (a + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.localAddress;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        ReceiverReport[] receiverReportArr = this.receiverReports;
        if (receiverReportArr != null) {
            i = Arrays.hashCode(receiverReportArr);
        }
        return hashCode2 + i;
    }

    public String toString() {
        return "Transport(availableOutgoingBitrate=" + this.availableOutgoingBitrate + ", bytesReceived=" + this.bytesReceived + ", bytesSent=" + this.bytesSent + ", ping=" + this.ping + ", decryptionFailures=" + this.decryptionFailures + ", localAddress=" + this.localAddress + ", receiverReports=" + Arrays.toString(this.receiverReports) + ')';
    }
}
