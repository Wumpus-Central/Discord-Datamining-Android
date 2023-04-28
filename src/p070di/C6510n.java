package p070di;

import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C9971q;
import p087ei.AbstractC6944n;
import pg.AbstractC11666c;

/* renamed from: di.n */
/* loaded from: classes8.dex */
public final class C6510n extends C6464a {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6510n(AbstractC6944n storageManager, Function0<? extends List<? extends AbstractC11666c>> compute) {
        super(storageManager, compute);
        C9971q.m14633g(storageManager, "storageManager");
        C9971q.m14633g(compute, "compute");
    }

    @Override // p070di.C6464a, pg.AbstractC11672g
    public boolean isEmpty() {
        return false;
    }
}
