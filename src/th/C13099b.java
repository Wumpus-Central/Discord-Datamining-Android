package th;

import fi.AbstractC7267g0;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9971q;
import p217lg.AbstractC10420h;
import p268og.AbstractC11327h0;

/* renamed from: th.b */
/* loaded from: classes8.dex */
public class C13099b extends AbstractC13104g<List<? extends AbstractC13104g<?>>> {

    /* renamed from: b */
    private final Function1<AbstractC11327h0, AbstractC7267g0> f29406b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C13099b(List<? extends AbstractC13104g<?>> value, Function1<? super AbstractC11327h0, ? extends AbstractC7267g0> computeType) {
        super(value);
        C9971q.m14633g(value, "value");
        C9971q.m14633g(computeType, "computeType");
        this.f29406b = computeType;
    }

    @Override // th.AbstractC13104g
    /* renamed from: a */
    public AbstractC7267g0 mo4552a(AbstractC11327h0 module) {
        C9971q.m14633g(module, "module");
        AbstractC7267g0 invoke = this.f29406b.invoke(module);
        if (!AbstractC10420h.m13397c0(invoke) && !AbstractC10420h.m13372p0(invoke)) {
            AbstractC10420h.m13426C0(invoke);
        }
        return invoke;
    }
}
