package co.discord.media_engine;

import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;

@Metadata(m15074d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006\u0012\n\u0010\u0007\u001a\u00060\bj\u0002`\t¢\u0006\u0002\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\r\u0010\u0012\u001a\u00060\u0005j\u0002`\u0006HÆ\u0003J\r\u0010\u0013\u001a\u00060\bj\u0002`\tHÆ\u0003J/\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\f\b\u0002\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\f\b\u0002\u0010\u0007\u001a\u00060\bj\u0002`\tHÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\bHÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0015\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0015\u0010\u0007\u001a\u00060\bj\u0002`\t¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001a"}, m15073d2 = {"Lco/discord/media_engine/ReceiverReport;", "", "id", "", "bitrate", "", "Lco/discord/media_engine/I64;", "fractionLost", "", "Lco/discord/media_engine/U8;", "(Ljava/lang/String;JI)V", "getBitrate", "()J", "getFractionLost", "()I", "getId", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "android_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes.dex */
public final class ReceiverReport {
    private final long bitrate;
    private final int fractionLost;

    /* renamed from: id */
    private final String f6707id;

    public ReceiverReport(String id2, long j, int i) {
        C9971q.m14633g(id2, "id");
        this.f6707id = id2;
        this.bitrate = j;
        this.fractionLost = i;
    }

    public static /* synthetic */ ReceiverReport copy$default(ReceiverReport receiverReport, String str, long j, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = receiverReport.f6707id;
        }
        if ((i2 & 2) != 0) {
            j = receiverReport.bitrate;
        }
        if ((i2 & 4) != 0) {
            i = receiverReport.fractionLost;
        }
        return receiverReport.copy(str, j, i);
    }

    public final String component1() {
        return this.f6707id;
    }

    public final long component2() {
        return this.bitrate;
    }

    public final int component3() {
        return this.fractionLost;
    }

    public final ReceiverReport copy(String id2, long j, int i) {
        C9971q.m14633g(id2, "id");
        return new ReceiverReport(id2, j, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReceiverReport)) {
            return false;
        }
        ReceiverReport receiverReport = (ReceiverReport) obj;
        return C9971q.m14638b(this.f6707id, receiverReport.f6707id) && this.bitrate == receiverReport.bitrate && this.fractionLost == receiverReport.fractionLost;
    }

    public final long getBitrate() {
        return this.bitrate;
    }

    public final int getFractionLost() {
        return this.fractionLost;
    }

    public final String getId() {
        return this.f6707id;
    }

    public int hashCode() {
        return (((this.f6707id.hashCode() * 31) + C4081a.m32873a(this.bitrate)) * 31) + this.fractionLost;
    }

    public String toString() {
        return "ReceiverReport(id=" + this.f6707id + ", bitrate=" + this.bitrate + ", fractionLost=" + this.fractionLost + ')';
    }
}
