package p275p2;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import java.util.Collections;
import java.util.List;
import p126h2.C7748e0;
import p167j2.C9466d;
import p223m2.C10474e;
import p254o2.C11168a;
import p254o2.C11186p;
import p311r2.C12340j;

/* renamed from: p2.g */
/* loaded from: classes.dex */
public class C11520g extends AbstractC11511b {

    /* renamed from: D */
    private final C9466d f39051D;

    /* renamed from: E */
    private final C11513c f39052E;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C11520g(C7748e0 e0Var, C11516e eVar, C11513c cVar) {
        super(e0Var, eVar);
        this.f39052E = cVar;
        C9466d dVar = new C9466d(e0Var, this, new C11186p("__container", eVar.m9488n(), false));
        this.f39051D = dVar;
        dVar.mo9523b(Collections.emptyList(), Collections.emptyList());
    }

    @Override // p275p2.AbstractC11511b
    /* renamed from: I */
    protected void mo9476I(C10474e eVar, int i, List<C10474e> list, C10474e eVar2) {
        this.f39051D.mo9520i(eVar, i, list, eVar2);
    }

    @Override // p275p2.AbstractC11511b, p167j2.AbstractC9467e
    /* renamed from: f */
    public void mo9457f(RectF rectF, Matrix matrix, boolean z) {
        super.mo9457f(rectF, matrix, z);
        this.f39051D.mo9457f(rectF, this.f25660o, z);
    }

    @Override // p275p2.AbstractC11511b
    /* renamed from: u */
    void mo9456u(Canvas canvas, Matrix matrix, int i) {
        this.f39051D.mo9521h(canvas, matrix, i);
    }

    @Override // p275p2.AbstractC11511b
    /* renamed from: w */
    public C11168a mo9475w() {
        C11168a w = super.mo9475w();
        if (w != null) {
            return w;
        }
        return this.f39052E.mo9475w();
    }

    @Override // p275p2.AbstractC11511b
    /* renamed from: y */
    public C12340j mo9474y() {
        C12340j y = super.mo9474y();
        if (y != null) {
            return y;
        }
        return this.f39052E.mo9474y();
    }
}
