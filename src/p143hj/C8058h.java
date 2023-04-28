package p143hj;

import java.io.Serializable;

/* renamed from: hj.h */
/* loaded from: classes8.dex */
public final class C8058h implements Comparable<C8058h>, Serializable {

    /* renamed from: k */
    public static final C8058h f17438k = new C8058h(0);

    /* renamed from: l */
    public static final C8058h f17439l = new C8058h(1);
    private final long days;

    private C8058h(long j) {
        this.days = j;
    }

    /* renamed from: c */
    public static C8058h m20716c(long j) {
        return j == 0 ? f17438k : j == 1 ? f17439l : new C8058h(j);
    }

    /* renamed from: a */
    public int compareTo(C8058h hVar) {
        long j = this.days;
        long j2 = hVar.days;
        if (j < j2) {
            return -1;
        }
        return j > j2 ? 1 : 0;
    }

    /* renamed from: b */
    public long m20717b() {
        return this.days;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8058h) || this.days != ((C8058h) obj).days) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        long j = this.days;
        return (int) (j ^ (j >>> 32));
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        if (this.days < 0) {
            sb2.append('-');
        }
        sb2.append('P');
        sb2.append(Math.abs(this.days));
        sb2.append('D');
        return sb2.toString();
    }
}
