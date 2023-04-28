package p167j2;

import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;
import p126h2.C7748e0;
import p188k2.AbstractC9721a;
import p188k2.C9739m;
import p254o2.C11187q;
import p254o2.C11192s;
import p275p2.AbstractC11511b;

/* renamed from: j2.r */
/* loaded from: classes.dex */
public class C9482r implements AbstractC9476m, AbstractC9721a.AbstractC9722b {

    /* renamed from: b */
    private final String f20975b;

    /* renamed from: c */
    private final boolean f20976c;

    /* renamed from: d */
    private final C7748e0 f20977d;

    /* renamed from: e */
    private final C9739m f20978e;

    /* renamed from: f */
    private boolean f20979f;

    /* renamed from: a */
    private final Path f20974a = new Path();

    /* renamed from: g */
    private final C9464b f20980g = new C9464b();

    public C9482r(C7748e0 e0Var, AbstractC11511b bVar, C11187q qVar) {
        this.f20975b = qVar.m10543b();
        this.f20976c = qVar.m10541d();
        this.f20977d = e0Var;
        C9739m c = qVar.m10542c().mo12624a();
        this.f20978e = c;
        bVar.m9519j(c);
        c.m15511a(this);
    }

    /* renamed from: c */
    private void m16164c() {
        this.f20979f = false;
        this.f20977d.invalidateSelf();
    }

    @Override // p188k2.AbstractC9721a.AbstractC9722b
    /* renamed from: a */
    public void mo9524a() {
        m16164c();
    }

    @Override // p167j2.AbstractC9465c
    /* renamed from: b */
    public void mo9523b(List<AbstractC9465c> list, List<AbstractC9465c> list2) {
        ArrayList arrayList = null;
        for (int i = 0; i < list.size(); i++) {
            AbstractC9465c cVar = list.get(i);
            if (cVar instanceof C9485u) {
                C9485u uVar = (C9485u) cVar;
                if (uVar.m16157k() == C11192s.EnumC11193a.SIMULTANEOUSLY) {
                    this.f20980g.m16191a(uVar);
                    uVar.m16161c(this);
                }
            }
            if (cVar instanceof AbstractC9483s) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add((AbstractC9483s) cVar);
            }
        }
        this.f20978e.m15468q(arrayList);
    }

    @Override // p167j2.AbstractC9476m
    /* renamed from: d */
    public Path mo16163d() {
        if (this.f20979f) {
            return this.f20974a;
        }
        this.f20974a.reset();
        if (this.f20976c) {
            this.f20979f = true;
            return this.f20974a;
        }
        Path h = this.f20978e.mo15449h();
        if (h == null) {
            return this.f20974a;
        }
        this.f20974a.set(h);
        this.f20974a.setFillType(Path.FillType.EVEN_ODD);
        this.f20980g.m16190b(this.f20974a);
        this.f20979f = true;
        return this.f20974a;
    }
}
