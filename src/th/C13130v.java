package th;

import fi.AbstractC7304o0;
import kotlin.jvm.internal.C9971q;
import p268og.AbstractC11327h0;

/* renamed from: th.v */
/* loaded from: classes8.dex */
public final class C13130v extends AbstractC13104g<String> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13130v(String value) {
        super(value);
        C9971q.m14633g(value, "value");
    }

    /* renamed from: c */
    public AbstractC7304o0 mo4552a(AbstractC11327h0 module) {
        C9971q.m14633g(module, "module");
        AbstractC7304o0 W = module.mo6136n().m13406W();
        C9971q.m14634f(W, "module.builtIns.stringType");
        return W;
    }

    @Override // th.AbstractC13104g
    public String toString() {
        return '\"' + mo4590b() + '\"';
    }
}
