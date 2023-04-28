package p188k2;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import java.util.List;
import p358u2.C13178a;
import p358u2.C13180c;

/* renamed from: k2.j */
/* loaded from: classes.dex */
public class C9736j extends AbstractC9733g<PointF> {

    /* renamed from: i */
    private final PointF f21635i = new PointF();

    /* renamed from: j */
    private final float[] f21636j = new float[2];

    /* renamed from: k */
    private final PathMeasure f21637k = new PathMeasure();

    /* renamed from: l */
    private C9735i f21638l;

    public C9736j(List<? extends C13178a<PointF>> list) {
        super(list);
    }

    /* renamed from: p */
    public PointF mo15448i(C13178a<PointF> aVar, float f) {
        PointF pointF;
        C9735i iVar = (C9735i) aVar;
        Path j = iVar.m15475j();
        if (j == null) {
            return aVar.f29540b;
        }
        C13180c<A> cVar = this.f21610e;
        if (cVar != 0 && (pointF = (PointF) cVar.m4402b(iVar.f29545g, iVar.f29546h.floatValue(), (PointF) iVar.f29540b, (PointF) iVar.f29541c, m15508e(), f, m15507f())) != null) {
            return pointF;
        }
        if (this.f21638l != iVar) {
            this.f21637k.setPath(j, false);
            this.f21638l = iVar;
        }
        PathMeasure pathMeasure = this.f21637k;
        pathMeasure.getPosTan(f * pathMeasure.getLength(), this.f21636j, null);
        PointF pointF2 = this.f21635i;
        float[] fArr = this.f21636j;
        pointF2.set(fArr[0], fArr[1]);
        return this.f21635i;
    }
}
