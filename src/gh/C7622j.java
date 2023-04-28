package gh;

import bi.AbstractC3598s;
import ch.C4016h;
import fi.AbstractC7267g0;
import fi.AbstractC7304o0;
import fi.C7270h0;
import kotlin.jvm.internal.C9971q;
import p142hi.C8039k;
import p142hi.EnumC8038j;
import p159ih.C8593q;
import p218lh.C10440a;

/* renamed from: gh.j */
/* loaded from: classes8.dex */
public final class C7622j implements AbstractC3598s {

    /* renamed from: a */
    public static final C7622j f16622a = new C7622j();

    private C7622j() {
    }

    @Override // bi.AbstractC3598s
    /* renamed from: a */
    public AbstractC7267g0 mo21859a(C8593q proto, String flexibleId, AbstractC7304o0 lowerBound, AbstractC7304o0 upperBound) {
        C9971q.m14633g(proto, "proto");
        C9971q.m14633g(flexibleId, "flexibleId");
        C9971q.m14633g(lowerBound, "lowerBound");
        C9971q.m14633g(upperBound, "upperBound");
        if (!C9971q.m14638b(flexibleId, "kotlin.jvm.PlatformType")) {
            return C8039k.m20774d(EnumC8038j.ERROR_FLEXIBLE_TYPE, flexibleId, lowerBound.toString(), upperBound.toString());
        }
        if (proto.m8829y(C10440a.f22981g)) {
            return new C4016h(lowerBound, upperBound);
        }
        return C7270h0.m23056d(lowerBound, upperBound);
    }
}
