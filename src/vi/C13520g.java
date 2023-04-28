package vi;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import p339sf.C12893f;
import p372ui.EnumC13337e;
import tf.C13080d;

@Metadata(m15074d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00000\u0002B3\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0012\u0010\u0013J&\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0014J!\u0010\u000e\u001a\u00020\r2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000bH\u0094@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0014"}, m15073d2 = {"Lvi/g;", "T", "Lvi/f;", "Lkotlin/coroutines/CoroutineContext;", "context", "", "capacity", "Lui/e;", "onBufferOverflow", "Lvi/d;", "e", "Lkotlinx/coroutines/flow/FlowCollector;", "collector", "", "l", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlinx/coroutines/flow/Flow;", "flow", "<init>", "(Lkotlinx/coroutines/flow/Flow;Lkotlin/coroutines/CoroutineContext;ILui/e;)V", "kotlinx-coroutines-core"}, m15072k = 1, m15071mv = {1, 6, 0})
/* renamed from: vi.g */
/* loaded from: classes8.dex */
public final class C13520g<T> extends AbstractC13518f<T, T> {
    public /* synthetic */ C13520g(Flow flow, CoroutineContext coroutineContext, int i, EnumC13337e eVar, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(flow, (i2 & 2) != 0 ? C12893f.f28966k : coroutineContext, (i2 & 4) != 0 ? -3 : i, (i2 & 8) != 0 ? EnumC13337e.SUSPEND : eVar);
    }

    @Override // vi.AbstractC13514d
    /* renamed from: e */
    protected AbstractC13514d<T> mo3487e(CoroutineContext coroutineContext, int i, EnumC13337e eVar) {
        return new C13520g(this.f30208n, coroutineContext, i, eVar);
    }

    @Override // vi.AbstractC13518f
    /* renamed from: l */
    protected Object mo3486l(FlowCollector<? super T> flowCollector, Continuation<? super Unit> continuation) {
        Object d;
        Object collect = this.f30208n.collect(flowCollector, continuation);
        d = C13080d.m4646d();
        return collect == d ? collect : Unit.f22042a;
    }

    public C13520g(Flow<? extends T> flow, CoroutineContext coroutineContext, int i, EnumC13337e eVar) {
        super(flow, coroutineContext, i, eVar);
    }
}
