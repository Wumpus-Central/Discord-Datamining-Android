package p254o2;

import android.graphics.PointF;
import p126h2.C7748e0;
import p167j2.AbstractC9465c;
import p167j2.C9479o;
import p238n2.AbstractC10705m;
import p238n2.C10694b;
import p275p2.AbstractC11511b;

/* renamed from: o2.k */
/* loaded from: classes.dex */
public class C11181k implements AbstractC11170c {

    /* renamed from: a */
    private final String f24913a;

    /* renamed from: b */
    private final AbstractC10705m<PointF, PointF> f24914b;

    /* renamed from: c */
    private final AbstractC10705m<PointF, PointF> f24915c;

    /* renamed from: d */
    private final C10694b f24916d;

    /* renamed from: e */
    private final boolean f24917e;

    public C11181k(String str, AbstractC10705m<PointF, PointF> mVar, AbstractC10705m<PointF, PointF> mVar2, C10694b bVar, boolean z) {
        this.f24913a = str;
        this.f24914b = mVar;
        this.f24915c = mVar2;
        this.f24916d = bVar;
        this.f24917e = z;
    }

    @Override // p254o2.AbstractC11170c
    /* renamed from: a */
    public AbstractC9465c mo10528a(C7748e0 e0Var, AbstractC11511b bVar) {
        return new C9479o(e0Var, bVar, this);
    }

    /* renamed from: b */
    public C10694b m10569b() {
        return this.f24916d;
    }

    /* renamed from: c */
    public String m10568c() {
        return this.f24913a;
    }

    /* renamed from: d */
    public AbstractC10705m<PointF, PointF> m10567d() {
        return this.f24914b;
    }

    /* renamed from: e */
    public AbstractC10705m<PointF, PointF> m10566e() {
        return this.f24915c;
    }

    /* renamed from: f */
    public boolean m10565f() {
        return this.f24917e;
    }

    public String toString() {
        return "RectangleShape{position=" + this.f24914b + ", size=" + this.f24915c + '}';
    }
}
