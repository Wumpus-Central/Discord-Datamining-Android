package p400w9;

import p384v9.C13456a;
import p384v9.C13456a.AbstractC13459d;
import p420x9.C13996n;

/* renamed from: w9.b */
/* loaded from: classes5.dex */
public final class C13813b<O extends C13456a.AbstractC13459d> {

    /* renamed from: a */
    private final int f31108a;

    /* renamed from: b */
    private final C13456a<O> f31109b;

    /* renamed from: c */
    private final O f31110c;

    /* renamed from: d */
    private final String f31111d;

    private C13813b(C13456a<O> aVar, O o, String str) {
        this.f31109b = aVar;
        this.f31110c = o;
        this.f31111d = str;
        this.f31108a = C13996n.m2070c(aVar, o, str);
    }

    /* renamed from: a */
    public static <O extends C13456a.AbstractC13459d> C13813b<O> m2593a(C13456a<O> aVar, O o, String str) {
        return new C13813b<>(aVar, o, str);
    }

    /* renamed from: b */
    public final String m2592b() {
        return this.f31109b.m3645c();
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C13813b)) {
            return false;
        }
        C13813b bVar = (C13813b) obj;
        if (!C13996n.m2071b(this.f31109b, bVar.f31109b) || !C13996n.m2071b(this.f31110c, bVar.f31110c) || !C13996n.m2071b(this.f31111d, bVar.f31111d)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f31108a;
    }
}
