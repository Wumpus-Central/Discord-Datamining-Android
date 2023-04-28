package li;

import kotlin.jvm.internal.C9971q;

/* renamed from: li.a */
/* loaded from: classes8.dex */
public final class C10450a<T> {

    /* renamed from: a */
    private final T f23066a;

    /* renamed from: b */
    private final T f23067b;

    public C10450a(T t, T t2) {
        this.f23066a = t;
        this.f23067b = t2;
    }

    /* renamed from: a */
    public final T m13152a() {
        return this.f23066a;
    }

    /* renamed from: b */
    public final T m13151b() {
        return this.f23067b;
    }

    /* renamed from: c */
    public final T m13150c() {
        return this.f23066a;
    }

    /* renamed from: d */
    public final T m13149d() {
        return this.f23067b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10450a)) {
            return false;
        }
        C10450a aVar = (C10450a) obj;
        return C9971q.m14638b(this.f23066a, aVar.f23066a) && C9971q.m14638b(this.f23067b, aVar.f23067b);
    }

    public int hashCode() {
        T t = this.f23066a;
        int i = 0;
        int hashCode = (t == null ? 0 : t.hashCode()) * 31;
        T t2 = this.f23067b;
        if (t2 != null) {
            i = t2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        return "ApproximationBounds(lower=" + this.f23066a + ", upper=" + this.f23067b + ')';
    }
}
