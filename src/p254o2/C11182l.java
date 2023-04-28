package p254o2;

import p126h2.C7748e0;
import p167j2.AbstractC9465c;
import p167j2.C9480p;
import p238n2.C10694b;
import p238n2.C10704l;
import p275p2.AbstractC11511b;

/* renamed from: o2.l */
/* loaded from: classes.dex */
public class C11182l implements AbstractC11170c {

    /* renamed from: a */
    private final String f24918a;

    /* renamed from: b */
    private final C10694b f24919b;

    /* renamed from: c */
    private final C10694b f24920c;

    /* renamed from: d */
    private final C10704l f24921d;

    /* renamed from: e */
    private final boolean f24922e;

    public C11182l(String str, C10694b bVar, C10694b bVar2, C10704l lVar, boolean z) {
        this.f24918a = str;
        this.f24919b = bVar;
        this.f24920c = bVar2;
        this.f24921d = lVar;
        this.f24922e = z;
    }

    @Override // p254o2.AbstractC11170c
    /* renamed from: a */
    public AbstractC9465c mo10528a(C7748e0 e0Var, AbstractC11511b bVar) {
        return new C9480p(e0Var, bVar, this);
    }

    /* renamed from: b */
    public C10694b m10564b() {
        return this.f24919b;
    }

    /* renamed from: c */
    public String m10563c() {
        return this.f24918a;
    }

    /* renamed from: d */
    public C10694b m10562d() {
        return this.f24920c;
    }

    /* renamed from: e */
    public C10704l m10561e() {
        return this.f24921d;
    }

    /* renamed from: f */
    public boolean m10560f() {
        return this.f24922e;
    }
}
