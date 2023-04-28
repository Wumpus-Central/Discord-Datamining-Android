package p188k2;

import android.graphics.Color;
import android.graphics.Paint;
import p188k2.AbstractC9721a;
import p275p2.AbstractC11511b;
import p311r2.C12340j;
import p358u2.C13179b;
import p358u2.C13180c;

/* renamed from: k2.c */
/* loaded from: classes.dex */
public class C9728c implements AbstractC9721a.AbstractC9722b {

    /* renamed from: a */
    private final AbstractC9721a.AbstractC9722b f21620a;

    /* renamed from: b */
    private final AbstractC9721a<Integer, Integer> f21621b;

    /* renamed from: c */
    private final AbstractC9721a<Float, Float> f21622c;

    /* renamed from: d */
    private final AbstractC9721a<Float, Float> f21623d;

    /* renamed from: e */
    private final AbstractC9721a<Float, Float> f21624e;

    /* renamed from: f */
    private final AbstractC9721a<Float, Float> f21625f;

    /* renamed from: g */
    private boolean f21626g = true;

    /* renamed from: k2.c$a */
    /* loaded from: classes.dex */
    class C9729a extends C13180c<Float> {

        /* renamed from: d */
        final /* synthetic */ C13180c f21627d;

        C9729a(C13180c cVar) {
            this.f21627d = cVar;
        }

        /* renamed from: d */
        public Float mo4403a(C13179b<Float> bVar) {
            Float f = (Float) this.f21627d.mo4403a(bVar);
            if (f == null) {
                return null;
            }
            return Float.valueOf(f.floatValue() * 2.55f);
        }
    }

    public C9728c(AbstractC9721a.AbstractC9722b bVar, AbstractC11511b bVar2, C12340j jVar) {
        this.f21620a = bVar;
        AbstractC9721a<Integer, Integer> a = jVar.m7117a().mo12624a();
        this.f21621b = a;
        a.m15511a(this);
        bVar2.m9519j(a);
        AbstractC9721a<Float, Float> a2 = jVar.m7114d().mo12624a();
        this.f21622c = a2;
        a2.m15511a(this);
        bVar2.m9519j(a2);
        AbstractC9721a<Float, Float> a3 = jVar.m7116b().mo12624a();
        this.f21623d = a3;
        a3.m15511a(this);
        bVar2.m9519j(a3);
        AbstractC9721a<Float, Float> a4 = jVar.m7115c().mo12624a();
        this.f21624e = a4;
        a4.m15511a(this);
        bVar2.m9519j(a4);
        AbstractC9721a<Float, Float> a5 = jVar.m7113e().mo12624a();
        this.f21625f = a5;
        a5.m15511a(this);
        bVar2.m9519j(a5);
    }

    @Override // p188k2.AbstractC9721a.AbstractC9722b
    /* renamed from: a */
    public void mo9524a() {
        this.f21626g = true;
        this.f21620a.mo9524a();
    }

    /* renamed from: b */
    public void m15493b(Paint paint) {
        if (this.f21626g) {
            this.f21626g = false;
            double floatValue = this.f21623d.mo15449h().floatValue() * 0.017453292519943295d;
            float floatValue2 = this.f21624e.mo15449h().floatValue();
            float sin = ((float) Math.sin(floatValue)) * floatValue2;
            float cos = ((float) Math.cos(floatValue + 3.141592653589793d)) * floatValue2;
            int intValue = this.f21621b.mo15449h().intValue();
            paint.setShadowLayer(this.f21625f.mo15449h().floatValue(), sin, cos, Color.argb(Math.round(this.f21622c.mo15449h().floatValue()), Color.red(intValue), Color.green(intValue), Color.blue(intValue)));
        }
    }

    /* renamed from: c */
    public void m15492c(C13180c<Integer> cVar) {
        this.f21621b.m15504n(cVar);
    }

    /* renamed from: d */
    public void m15491d(C13180c<Float> cVar) {
        this.f21623d.m15504n(cVar);
    }

    /* renamed from: e */
    public void m15490e(C13180c<Float> cVar) {
        this.f21624e.m15504n(cVar);
    }

    /* renamed from: f */
    public void m15489f(C13180c<Float> cVar) {
        if (cVar == null) {
            this.f21622c.m15504n(null);
        } else {
            this.f21622c.m15504n(new C9729a(cVar));
        }
    }

    /* renamed from: g */
    public void m15488g(C13180c<Float> cVar) {
        this.f21625f.m15504n(cVar);
    }
}
