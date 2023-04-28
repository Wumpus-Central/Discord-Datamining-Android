package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.C9971q;
import kotlinx.coroutines.Job;
import p339sf.C12893f;
import vi.AbstractC13526k;
import vi.C13520g;

@Metadata(m15074d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a$\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u0002\u001a\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m15073d2 = {"T", "Lkotlinx/coroutines/flow/Flow;", "Lkotlin/coroutines/CoroutineContext;", "context", "b", "", "a", "(Lkotlin/coroutines/CoroutineContext;)V", "kotlinx-coroutines-core"}, m15072k = 5, m15071mv = {1, 6, 0}, m15068xs = "kotlinx/coroutines/flow/FlowKt")
/* renamed from: kotlinx.coroutines.flow.g */
/* loaded from: classes8.dex */
final /* synthetic */ class C10043g {
    /* renamed from: a */
    private static final void m14421a(CoroutineContext coroutineContext) {
        boolean z;
        if (coroutineContext.mo3484i(Job.f22120e) == null) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            throw new IllegalArgumentException(("Flow context cannot contain job in it. Had " + coroutineContext).toString());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: b */
    public static final <T> Flow<T> m14420b(Flow<? extends T> flow, CoroutineContext coroutineContext) {
        m14421a(coroutineContext);
        if (C9971q.m14638b(coroutineContext, C12893f.f28966k)) {
            return flow;
        }
        if (flow instanceof AbstractC13526k) {
            return AbstractC13526k.C13527a.m3477a((AbstractC13526k) flow, coroutineContext, 0, null, 6, null);
        }
        return new C13520g(flow, coroutineContext, 0, null, 12, null);
    }
}
