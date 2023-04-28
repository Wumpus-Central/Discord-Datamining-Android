package p384v9;

import com.google.android.gms.common.api.Status;
import p400w9.C13833l;
import p420x9.C14004p;

/* renamed from: v9.h */
/* loaded from: classes5.dex */
public final class C13475h {
    /* renamed from: a */
    public static <R extends AbstractC13478k> AbstractC13473g<R> m3611a(R r, AbstractC13470f fVar) {
        C14004p.m2050k(r, "Result must not be null");
        C14004p.m2059b(!r.mo3607b().m29108z(), "Status code must not be SUCCESS");
        C13483p pVar = new C13483p(fVar, r);
        pVar.setResult(r);
        return pVar;
    }

    /* renamed from: b */
    public static AbstractC13473g<Status> m3610b(Status status, AbstractC13470f fVar) {
        C14004p.m2050k(status, "Result must not be null");
        C13833l lVar = new C13833l(fVar);
        lVar.setResult(status);
        return lVar;
    }
}
