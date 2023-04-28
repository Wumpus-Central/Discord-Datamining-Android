package th;

import fi.AbstractC7267g0;
import fi.AbstractC7304o0;
import kotlin.jvm.internal.C9971q;
import p142hi.C8039k;
import p142hi.EnumC8038j;
import p217lg.C10434k;
import p268og.AbstractC11313e;
import p268og.AbstractC11327h0;
import p268og.C11393x;

/* renamed from: th.y */
/* loaded from: classes8.dex */
public final class C13133y extends AbstractC13098a0<Long> {
    public C13133y(long j) {
        super(Long.valueOf(j));
    }

    @Override // th.AbstractC13104g
    /* renamed from: a */
    public AbstractC7267g0 mo4552a(AbstractC11327h0 module) {
        AbstractC7304o0 o0Var;
        C9971q.m14633g(module, "module");
        AbstractC11313e a = C11393x.m10149a(module, C10434k.C10435a.f38768B0);
        if (a != null) {
            o0Var = a.mo6166p();
        } else {
            o0Var = null;
        }
        if (o0Var == null) {
            return C8039k.m20774d(EnumC8038j.NOT_FOUND_UNSIGNED_TYPE, "ULong");
        }
        return o0Var;
    }

    @Override // th.AbstractC13104g
    public String toString() {
        return mo4590b().longValue() + ".toULong()";
    }
}
