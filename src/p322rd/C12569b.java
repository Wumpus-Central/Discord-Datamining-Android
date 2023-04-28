package p322rd;

import p301qd.C12108b;
import p301qd.C12109c;

/* renamed from: rd.b */
/* loaded from: classes3.dex */
final class C12569b {

    /* renamed from: a */
    private final boolean f28256a;

    /* renamed from: b */
    private final C12108b f28257b;

    /* renamed from: c */
    private final C12108b f28258c;

    /* renamed from: d */
    private final C12109c f28259d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C12569b(C12108b bVar, C12108b bVar2, C12109c cVar, boolean z) {
        this.f28257b = bVar;
        this.f28258c = bVar2;
        this.f28259d = cVar;
        this.f28256a = z;
    }

    /* renamed from: a */
    private static boolean m6531a(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    /* renamed from: e */
    private static int m6527e(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public C12109c m6530b() {
        return this.f28259d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public C12108b m6529c() {
        return this.f28257b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public C12108b m6528d() {
        return this.f28258c;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C12569b)) {
            return false;
        }
        C12569b bVar = (C12569b) obj;
        if (!m6531a(this.f28257b, bVar.f28257b) || !m6531a(this.f28258c, bVar.f28258c) || !m6531a(this.f28259d, bVar.f28259d)) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public boolean m6526f() {
        return this.f28258c == null;
    }

    public int hashCode() {
        return (m6527e(this.f28257b) ^ m6527e(this.f28258c)) ^ m6527e(this.f28259d);
    }

    public String toString() {
        Object obj;
        StringBuilder sb2 = new StringBuilder("[ ");
        sb2.append(this.f28257b);
        sb2.append(" , ");
        sb2.append(this.f28258c);
        sb2.append(" : ");
        C12109c cVar = this.f28259d;
        if (cVar == null) {
            obj = "null";
        } else {
            obj = Integer.valueOf(cVar.m7817c());
        }
        sb2.append(obj);
        sb2.append(" ]");
        return sb2.toString();
    }
}
