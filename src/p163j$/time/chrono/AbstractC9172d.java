package p163j$.time.chrono;

import p163j$.time.C9212p;
import p163j$.time.temporal.AbstractC9222j;
import p163j$.time.temporal.C9228p;
import p163j$.time.temporal.EnumC9213a;

/* renamed from: j$.time.chrono.d */
/* loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC9172d {
    /* renamed from: a */
    public static int m16728a(AbstractC9174f fVar, EnumC9213a aVar) {
        if (!(aVar instanceof EnumC9213a)) {
            return AbstractC9222j.m16645a(fVar, aVar);
        }
        int i = AbstractC9173e.f20140a[aVar.ordinal()];
        if (i != 1) {
            C9212p pVar = (C9212p) fVar;
            return i != 2 ? pVar.m16656j().mo16631e(aVar) : pVar.m16660f().m16735g();
        }
        throw new C9228p("Invalid field 'InstantSeconds' for get() method, use getLong() instead");
    }
}
