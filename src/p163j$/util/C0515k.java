package p163j$.util;

import java.util.NoSuchElementException;

/* renamed from: j$.util.k */
/* loaded from: classes2.dex */
public final class C0515k {

    /* renamed from: c */
    private static final C0515k f20433c = new C0515k();

    /* renamed from: a */
    private final boolean f20434a;

    /* renamed from: b */
    private final int f20435b;

    private C0515k() {
        this.f20434a = false;
        this.f20435b = 0;
    }

    private C0515k(int i) {
        this.f20434a = true;
        this.f20435b = i;
    }

    /* renamed from: a */
    public static C0515k m16497a() {
        return f20433c;
    }

    /* renamed from: d */
    public static C0515k m16494d(int i) {
        return new C0515k(i);
    }

    /* renamed from: b */
    public final int m16496b() {
        if (this.f20434a) {
            return this.f20435b;
        }
        throw new NoSuchElementException("No value present");
    }

    /* renamed from: c */
    public final boolean m16495c() {
        return this.f20434a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0515k)) {
            return false;
        }
        C0515k kVar = (C0515k) obj;
        boolean z = this.f20434a;
        if (!z || !kVar.f20434a) {
            if (z == kVar.f20434a) {
                return true;
            }
        } else if (this.f20435b == kVar.f20435b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        if (this.f20434a) {
            return this.f20435b;
        }
        return 0;
    }

    public final String toString() {
        return this.f20434a ? String.format("OptionalInt[%s]", Integer.valueOf(this.f20435b)) : "OptionalInt.empty";
    }
}
