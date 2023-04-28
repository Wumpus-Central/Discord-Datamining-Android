package co.discord.media_engine;

import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;

@Metadata(m15074d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m15073d2 = {"Lco/discord/media_engine/StatsCodec;", "", "id", "", "name", "", "(ILjava/lang/String;)V", "getId", "()I", "getName", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "android_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes.dex */
public final class StatsCodec {

    /* renamed from: id */
    private final int f6708id;
    private final String name;

    public StatsCodec(int i, String name) {
        C9971q.m14633g(name, "name");
        this.f6708id = i;
        this.name = name;
    }

    public static /* synthetic */ StatsCodec copy$default(StatsCodec statsCodec, int i, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = statsCodec.f6708id;
        }
        if ((i2 & 2) != 0) {
            str = statsCodec.name;
        }
        return statsCodec.copy(i, str);
    }

    public final int component1() {
        return this.f6708id;
    }

    public final String component2() {
        return this.name;
    }

    public final StatsCodec copy(int i, String name) {
        C9971q.m14633g(name, "name");
        return new StatsCodec(i, name);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StatsCodec)) {
            return false;
        }
        StatsCodec statsCodec = (StatsCodec) obj;
        return this.f6708id == statsCodec.f6708id && C9971q.m14638b(this.name, statsCodec.name);
    }

    public final int getId() {
        return this.f6708id;
    }

    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        return (this.f6708id * 31) + this.name.hashCode();
    }

    public String toString() {
        return "StatsCodec(id=" + this.f6708id + ", name=" + this.name + ')';
    }
}
