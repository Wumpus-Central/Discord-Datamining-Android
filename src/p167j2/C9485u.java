package p167j2;

import java.util.ArrayList;
import java.util.List;
import p188k2.AbstractC9721a;
import p254o2.C11192s;
import p275p2.AbstractC11511b;

/* renamed from: j2.u */
/* loaded from: classes.dex */
public class C9485u implements AbstractC9465c, AbstractC9721a.AbstractC9722b {

    /* renamed from: a */
    private final String f20986a;

    /* renamed from: b */
    private final boolean f20987b;

    /* renamed from: c */
    private final List<AbstractC9721a.AbstractC9722b> f20988c = new ArrayList();

    /* renamed from: d */
    private final C11192s.EnumC11193a f20989d;

    /* renamed from: e */
    private final AbstractC9721a<?, Float> f20990e;

    /* renamed from: f */
    private final AbstractC9721a<?, Float> f20991f;

    /* renamed from: g */
    private final AbstractC9721a<?, Float> f20992g;

    public C9485u(AbstractC11511b bVar, C11192s sVar) {
        this.f20986a = sVar.m10526c();
        this.f20987b = sVar.m10522g();
        this.f20989d = sVar.m10523f();
        AbstractC9721a<Float, Float> a = sVar.m10524e().mo12624a();
        this.f20990e = a;
        AbstractC9721a<Float, Float> a2 = sVar.m10527b().mo12624a();
        this.f20991f = a2;
        AbstractC9721a<Float, Float> a3 = sVar.m10525d().mo12624a();
        this.f20992g = a3;
        bVar.m9519j(a);
        bVar.m9519j(a2);
        bVar.m9519j(a3);
        a.m15511a(this);
        a2.m15511a(this);
        a3.m15511a(this);
    }

    @Override // p188k2.AbstractC9721a.AbstractC9722b
    /* renamed from: a */
    public void mo9524a() {
        for (int i = 0; i < this.f20988c.size(); i++) {
            this.f20988c.get(i).mo9524a();
        }
    }

    @Override // p167j2.AbstractC9465c
    /* renamed from: b */
    public void mo9523b(List<AbstractC9465c> list, List<AbstractC9465c> list2) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public void m16161c(AbstractC9721a.AbstractC9722b bVar) {
        this.f20988c.add(bVar);
    }

    /* renamed from: g */
    public AbstractC9721a<?, Float> m16160g() {
        return this.f20991f;
    }

    /* renamed from: i */
    public AbstractC9721a<?, Float> m16159i() {
        return this.f20992g;
    }

    /* renamed from: j */
    public AbstractC9721a<?, Float> m16158j() {
        return this.f20990e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public C11192s.EnumC11193a m16157k() {
        return this.f20989d;
    }

    /* renamed from: l */
    public boolean m16156l() {
        return this.f20987b;
    }
}
