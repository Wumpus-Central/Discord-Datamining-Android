package p188k2;

import android.graphics.PointF;
import java.util.Collections;
import p358u2.C13178a;
import p358u2.C13180c;

/* renamed from: k2.n */
/* loaded from: classes.dex */
public class C9740n extends AbstractC9721a<PointF, PointF> {

    /* renamed from: i */
    private final PointF f21644i = new PointF();

    /* renamed from: j */
    private final PointF f21645j = new PointF();

    /* renamed from: k */
    private final AbstractC9721a<Float, Float> f21646k;

    /* renamed from: l */
    private final AbstractC9721a<Float, Float> f21647l;

    /* renamed from: m */
    protected C13180c<Float> f21648m;

    /* renamed from: n */
    protected C13180c<Float> f21649n;

    public C9740n(AbstractC9721a<Float, Float> aVar, AbstractC9721a<Float, Float> aVar2) {
        super(Collections.emptyList());
        this.f21646k = aVar;
        this.f21647l = aVar2;
        mo15446m(m15507f());
    }

    @Override // p188k2.AbstractC9721a
    /* renamed from: m */
    public void mo15446m(float f) {
        this.f21646k.mo15446m(f);
        this.f21647l.mo15446m(f);
        this.f21644i.set(this.f21646k.mo15449h().floatValue(), this.f21647l.mo15449h().floatValue());
        for (int i = 0; i < this.f21606a.size(); i++) {
            this.f21606a.get(i).mo9524a();
        }
    }

    /* renamed from: p */
    public PointF mo15449h() {
        return mo15448i(null, 0.0f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q */
    public PointF mo15448i(C13178a<PointF> aVar, float f) {
        Float f2;
        C13178a<Float> b;
        float f3;
        C13178a<Float> b2;
        float f4;
        Float f5 = null;
        if (this.f21648m == null || (b2 = this.f21646k.m15510b()) == null) {
            f2 = null;
        } else {
            float d = this.f21646k.m15509d();
            Float f6 = b2.f29546h;
            C13180c<Float> cVar = this.f21648m;
            float f7 = b2.f29545g;
            if (f6 == null) {
                f4 = f7;
            } else {
                f4 = f6.floatValue();
            }
            f2 = cVar.m4402b(f7, f4, b2.f29540b, b2.f29541c, f, f, d);
        }
        if (!(this.f21649n == null || (b = this.f21647l.m15510b()) == null)) {
            float d2 = this.f21647l.m15509d();
            Float f8 = b.f29546h;
            C13180c<Float> cVar2 = this.f21649n;
            float f9 = b.f29545g;
            if (f8 == null) {
                f3 = f9;
            } else {
                f3 = f8.floatValue();
            }
            f5 = cVar2.m4402b(f9, f3, b.f29540b, b.f29541c, f, f, d2);
        }
        if (f2 == null) {
            this.f21645j.set(this.f21644i.x, 0.0f);
        } else {
            this.f21645j.set(f2.floatValue(), 0.0f);
        }
        if (f5 == null) {
            PointF pointF = this.f21645j;
            pointF.set(pointF.x, this.f21644i.y);
        } else {
            PointF pointF2 = this.f21645j;
            pointF2.set(pointF2.x, f5.floatValue());
        }
        return this.f21645j;
    }

    /* renamed from: r */
    public void m15465r(C13180c<Float> cVar) {
        C13180c<Float> cVar2 = this.f21648m;
        if (cVar2 != null) {
            cVar2.m4401c(null);
        }
        this.f21648m = cVar;
        if (cVar != null) {
            cVar.m4401c(this);
        }
    }

    /* renamed from: s */
    public void m15464s(C13180c<Float> cVar) {
        C13180c<Float> cVar2 = this.f21649n;
        if (cVar2 != null) {
            cVar2.m4401c(null);
        }
        this.f21649n = cVar;
        if (cVar != null) {
            cVar.m4401c(this);
        }
    }
}
