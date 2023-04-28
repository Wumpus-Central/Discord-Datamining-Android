package p188k2;

import java.util.List;
import p343t2.C12948i;
import p358u2.C13178a;
import p358u2.C13180c;
import p358u2.C13181d;

/* renamed from: k2.l */
/* loaded from: classes.dex */
public class C9738l extends AbstractC9733g<C13181d> {

    /* renamed from: i */
    private final C13181d f21640i = new C13181d();

    public C9738l(List<C13178a<C13181d>> list) {
        super(list);
    }

    /* renamed from: p */
    public C13181d mo15448i(C13178a<C13181d> aVar, float f) {
        C13181d dVar;
        C13181d dVar2;
        C13181d dVar3 = aVar.f29540b;
        if (dVar3 == null || (dVar = aVar.f29541c) == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        C13181d dVar4 = dVar3;
        C13181d dVar5 = dVar;
        C13180c<A> cVar = this.f21610e;
        if (cVar != 0 && (dVar2 = (C13181d) cVar.m4402b(aVar.f29545g, aVar.f29546h.floatValue(), dVar4, dVar5, f, m15508e(), m15507f())) != null) {
            return dVar2;
        }
        this.f21640i.m4397d(C12948i.m4974i(dVar4.m4399b(), dVar5.m4399b(), f), C12948i.m4974i(dVar4.m4398c(), dVar5.m4398c(), f));
        return this.f21640i;
    }
}
