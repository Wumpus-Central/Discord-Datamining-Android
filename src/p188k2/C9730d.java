package p188k2;

import java.util.List;
import p343t2.C12948i;
import p358u2.C13178a;
import p358u2.C13180c;

/* renamed from: k2.d */
/* loaded from: classes.dex */
public class C9730d extends AbstractC9733g<Float> {
    public C9730d(List<C13178a<Float>> list) {
        super(list);
    }

    /* renamed from: p */
    public float m15486p() {
        return m15485q(m15510b(), m15509d());
    }

    /* renamed from: q */
    float m15485q(C13178a<Float> aVar, float f) {
        Float f2;
        if (aVar.f29540b == null || aVar.f29541c == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        C13180c<A> cVar = this.f21610e;
        if (cVar == 0 || (f2 = (Float) cVar.m4402b(aVar.f29545g, aVar.f29546h.floatValue(), aVar.f29540b, aVar.f29541c, f, m15508e(), m15507f())) == null) {
            return C12948i.m4974i(aVar.m4414f(), aVar.m4417c(), f);
        }
        return f2.floatValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r */
    public Float mo15448i(C13178a<Float> aVar, float f) {
        return Float.valueOf(m15485q(aVar, f));
    }
}
