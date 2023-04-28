package th;

import fi.AbstractC7304o0;
import kotlin.jvm.internal.C9971q;
import p268og.AbstractC11327h0;

/* renamed from: th.d */
/* loaded from: classes8.dex */
public final class C13101d extends AbstractC13120o<Byte> {
    public C13101d(byte b) {
        super(Byte.valueOf(b));
    }

    /* renamed from: c */
    public AbstractC7304o0 mo4552a(AbstractC11327h0 module) {
        C9971q.m14633g(module, "module");
        AbstractC7304o0 t = module.mo6136n().m13365t();
        C9971q.m14634f(t, "module.builtIns.byteType");
        return t;
    }

    @Override // th.AbstractC13104g
    public String toString() {
        return mo4590b().intValue() + ".toByte()";
    }
}
