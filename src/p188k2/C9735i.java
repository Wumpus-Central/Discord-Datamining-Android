package p188k2;

import android.graphics.Path;
import android.graphics.PointF;
import p126h2.C7762i;
import p343t2.C12949j;
import p358u2.C13178a;

/* renamed from: k2.i */
/* loaded from: classes.dex */
public class C9735i extends C13178a<PointF> {

    /* renamed from: q */
    private Path f21633q;

    /* renamed from: r */
    private final C13178a<PointF> f21634r;

    public C9735i(C7762i iVar, C13178a<PointF> aVar) {
        super(iVar, aVar.f29540b, aVar.f29541c, aVar.f29542d, aVar.f29543e, aVar.f29544f, aVar.f29545g, aVar.f29546h);
        this.f21634r = aVar;
        m15476i();
    }

    /* renamed from: i */
    public void m15476i() {
        boolean z;
        T t;
        T t2;
        T t3 = this.f29541c;
        if (t3 == 0 || (t2 = this.f29540b) == 0 || !((PointF) t2).equals(((PointF) t3).x, ((PointF) t3).y)) {
            z = false;
        } else {
            z = true;
        }
        T t4 = this.f29540b;
        if (t4 != 0 && (t = this.f29541c) != 0 && !z) {
            C13178a<PointF> aVar = this.f21634r;
            this.f21633q = C12949j.m4968d((PointF) t4, (PointF) t, aVar.f29553o, aVar.f29554p);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public Path m15475j() {
        return this.f21633q;
    }
}
