package p188k2;

import android.graphics.PointF;
import java.util.List;
import p358u2.C13178a;
import p358u2.C13180c;

/* renamed from: k2.k */
/* loaded from: classes.dex */
public class C9737k extends AbstractC9733g<PointF> {

    /* renamed from: i */
    private final PointF f21639i = new PointF();

    public C9737k(List<C13178a<PointF>> list) {
        super(list);
    }

    /* renamed from: p */
    public PointF mo15448i(C13178a<PointF> aVar, float f) {
        return mo15473j(aVar, f, f, f);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: q */
    public PointF mo15473j(C13178a<PointF> aVar, float f, float f2, float f3) {
        PointF pointF;
        PointF pointF2;
        PointF pointF3 = aVar.f29540b;
        if (pointF3 == null || (pointF = aVar.f29541c) == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        PointF pointF4 = pointF3;
        PointF pointF5 = pointF;
        C13180c<A> cVar = this.f21610e;
        if (cVar != 0 && (pointF2 = (PointF) cVar.m4402b(aVar.f29545g, aVar.f29546h.floatValue(), pointF4, pointF5, f, m15508e(), m15507f())) != null) {
            return pointF2;
        }
        PointF pointF6 = this.f21639i;
        float f4 = pointF4.x;
        float f5 = f4 + (f2 * (pointF5.x - f4));
        float f6 = pointF4.y;
        pointF6.set(f5, f6 + (f3 * (pointF5.y - f6)));
        return this.f21639i;
    }
}
