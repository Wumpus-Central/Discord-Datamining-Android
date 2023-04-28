package p254o2;

import android.graphics.PointF;
import p126h2.C7748e0;
import p167j2.AbstractC9465c;
import p167j2.C9468f;
import p238n2.AbstractC10705m;
import p238n2.C10698f;
import p275p2.AbstractC11511b;

/* renamed from: o2.b */
/* loaded from: classes.dex */
public class C11169b implements AbstractC11170c {

    /* renamed from: a */
    private final String f24847a;

    /* renamed from: b */
    private final AbstractC10705m<PointF, PointF> f24848b;

    /* renamed from: c */
    private final C10698f f24849c;

    /* renamed from: d */
    private final boolean f24850d;

    /* renamed from: e */
    private final boolean f24851e;

    public C11169b(String str, AbstractC10705m<PointF, PointF> mVar, C10698f fVar, boolean z, boolean z2) {
        this.f24847a = str;
        this.f24848b = mVar;
        this.f24849c = fVar;
        this.f24850d = z;
        this.f24851e = z2;
    }

    @Override // p254o2.AbstractC11170c
    /* renamed from: a */
    public AbstractC9465c mo10528a(C7748e0 e0Var, AbstractC11511b bVar) {
        return new C9468f(e0Var, bVar, this);
    }

    /* renamed from: b */
    public String m10619b() {
        return this.f24847a;
    }

    /* renamed from: c */
    public AbstractC10705m<PointF, PointF> m10618c() {
        return this.f24848b;
    }

    /* renamed from: d */
    public C10698f m10617d() {
        return this.f24849c;
    }

    /* renamed from: e */
    public boolean m10616e() {
        return this.f24851e;
    }

    /* renamed from: f */
    public boolean m10615f() {
        return this.f24850d;
    }
}
