package p163j$.util;

import java.util.NoSuchElementException;

/* renamed from: j$.util.l */
/* loaded from: classes2.dex */
public final class C0516l {

    /* renamed from: c */
    private static final C0516l f20436c = new C0516l();

    /* renamed from: a */
    private final boolean f20437a;

    /* renamed from: b */
    private final long f20438b;

    private C0516l() {
        this.f20437a = false;
        this.f20438b = 0L;
    }

    private C0516l(long j) {
        this.f20437a = true;
        this.f20438b = j;
    }

    /* renamed from: a */
    public static C0516l m16493a() {
        return f20436c;
    }

    /* renamed from: d */
    public static C0516l m16490d(long j) {
        return new C0516l(j);
    }

    /* renamed from: b */
    public final long m16492b() {
        if (this.f20437a) {
            return this.f20438b;
        }
        throw new NoSuchElementException("No value present");
    }

    /* renamed from: c */
    public final boolean m16491c() {
        return this.f20437a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0516l)) {
            return false;
        }
        C0516l lVar = (C0516l) obj;
        boolean z = this.f20437a;
        if (!z || !lVar.f20437a) {
            if (z == lVar.f20437a) {
                return true;
            }
        } else if (this.f20438b == lVar.f20438b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        if (!this.f20437a) {
            return 0;
        }
        long j = this.f20438b;
        return (int) (j ^ (j >>> 32));
    }

    public final String toString() {
        return this.f20437a ? String.format("OptionalLong[%s]", Long.valueOf(this.f20438b)) : "OptionalLong.empty";
    }
}
