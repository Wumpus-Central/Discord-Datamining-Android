package bi;

import fi.AbstractC7267g0;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC9973s;
import kotlin.jvm.internal.C9971q;
import p268og.AbstractC11327h0;
import th.AbstractC13104g;
import th.C13099b;

/* renamed from: bi.n */
/* loaded from: classes8.dex */
public final class C3589n extends C13099b {

    /* renamed from: c */
    private final AbstractC7267g0 f5850c;

    /* renamed from: bi.n$a */
    /* loaded from: classes8.dex */
    static final class C3590a extends AbstractC9973s implements Function1<AbstractC11327h0, AbstractC7267g0> {

        /* renamed from: k */
        final /* synthetic */ AbstractC7267g0 f5851k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C3590a(AbstractC7267g0 g0Var) {
            super(1);
            this.f5851k = g0Var;
        }

        /* renamed from: a */
        public final AbstractC7267g0 invoke(AbstractC11327h0 it) {
            C9971q.m14633g(it, "it");
            return this.f5851k;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3589n(List<? extends AbstractC13104g<?>> value, AbstractC7267g0 type) {
        super(value, new C3590a(type));
        C9971q.m14633g(value, "value");
        C9971q.m14633g(type, "type");
        this.f5850c = type;
    }

    /* renamed from: c */
    public final AbstractC7267g0 m34010c() {
        return this.f5850c;
    }
}
