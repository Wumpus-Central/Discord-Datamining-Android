package p188k2;

import java.util.List;
import p343t2.C12948i;
import p358u2.C13178a;
import p358u2.C13180c;

/* renamed from: k2.f */
/* loaded from: classes.dex */
public class C9732f extends AbstractC9733g<Integer> {
    public C9732f(List<C13178a<Integer>> list) {
        super(list);
    }

    /* renamed from: p */
    public int m15482p() {
        return m15481q(m15510b(), m15509d());
    }

    /* renamed from: q */
    int m15481q(C13178a<Integer> aVar, float f) {
        Integer num;
        if (aVar.f29540b == null || aVar.f29541c == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        C13180c<A> cVar = this.f21610e;
        if (cVar == 0 || (num = (Integer) cVar.m4402b(aVar.f29545g, aVar.f29546h.floatValue(), aVar.f29540b, aVar.f29541c, f, m15508e(), m15507f())) == null) {
            return C12948i.m4973j(aVar.m4413g(), aVar.m4416d(), f);
        }
        return num.intValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r */
    public Integer mo15448i(C13178a<Integer> aVar, float f) {
        return Integer.valueOf(m15481q(aVar, f));
    }
}
