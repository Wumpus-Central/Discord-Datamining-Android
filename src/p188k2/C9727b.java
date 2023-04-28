package p188k2;

import java.util.List;
import p343t2.C12943d;
import p343t2.C12948i;
import p358u2.C13178a;
import p358u2.C13180c;

/* renamed from: k2.b */
/* loaded from: classes.dex */
public class C9727b extends AbstractC9733g<Integer> {
    public C9727b(List<C13178a<Integer>> list) {
        super(list);
    }

    /* renamed from: p */
    public int m15496p() {
        return m15495q(m15510b(), m15509d());
    }

    /* renamed from: q */
    public int m15495q(C13178a<Integer> aVar, float f) {
        Integer num;
        if (aVar.f29540b == null || aVar.f29541c == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        C13180c<A> cVar = this.f21610e;
        if (cVar == 0 || (num = (Integer) cVar.m4402b(aVar.f29545g, aVar.f29546h.floatValue(), aVar.f29540b, aVar.f29541c, f, m15508e(), m15507f())) == null) {
            return C12943d.m5017c(C12948i.m4981b(f, 0.0f, 1.0f), aVar.f29540b.intValue(), aVar.f29541c.intValue());
        }
        return num.intValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r */
    public Integer mo15448i(C13178a<Integer> aVar, float f) {
        return Integer.valueOf(m15495q(aVar, f));
    }
}
