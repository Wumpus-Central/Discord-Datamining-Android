package kotlinx.coroutines.internal;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC9973s;
import kotlin.jvm.internal.C9971q;
import kotlinx.coroutines.AbstractC10163q2;

@Metadata(m15074d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0010\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000\u001a\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\u0000\u001a\u001a\u0010\b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u0000\"\u0014\u0010\u000b\u001a\u00020\t8\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\b\u0010\n\"*\u0010\u000f\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000e\"2\u0010\u0011\u001a \u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u0010\u0012\u0004\u0012\u00020\r\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00100\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000e\"&\u0010\u0014\u001a\u0014\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00120\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u000e¨\u0006\u0015"}, m15073d2 = {"Lkotlin/coroutines/CoroutineContext;", "context", "", "b", "countOrElement", "c", "oldState", "", "a", "Lkotlinx/coroutines/internal/d0;", "Lkotlinx/coroutines/internal/d0;", "NO_THREAD_ELEMENTS", "Lkotlin/Function2;", "Lkotlin/coroutines/CoroutineContext$b;", "Lkotlin/jvm/functions/Function2;", "countAll", "Lkotlinx/coroutines/q2;", "findOne", "Lkotlinx/coroutines/internal/k0;", "d", "updateState", "kotlinx-coroutines-core"}, m15072k = 2, m15071mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.internal.h0 */
/* loaded from: classes8.dex */
public final class C10095h0 {

    /* renamed from: a */
    public static final C10087d0 f22286a = new C10087d0("NO_THREAD_ELEMENTS");

    /* renamed from: b */
    private static final Function2<Object, CoroutineContext.AbstractC9924b, Object> f22287b = C10096a.f22290k;

    /* renamed from: c */
    private static final Function2<AbstractC10163q2<?>, CoroutineContext.AbstractC9924b, AbstractC10163q2<?>> f22288c = C10097b.f22291k;

    /* renamed from: d */
    private static final Function2<C10104k0, CoroutineContext.AbstractC9924b, C10104k0> f22289d = C10098c.f22292k;

    @Metadata(m15074d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00002\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m15073d2 = {"", "countOrElement", "Lkotlin/coroutines/CoroutineContext$b;", "element", "a", "(Ljava/lang/Object;Lkotlin/coroutines/CoroutineContext$b;)Ljava/lang/Object;"}, m15072k = 3, m15071mv = {1, 6, 0})
    /* renamed from: kotlinx.coroutines.internal.h0$a */
    /* loaded from: classes8.dex */
    static final class C10096a extends AbstractC9973s implements Function2<Object, CoroutineContext.AbstractC9924b, Object> {

        /* renamed from: k */
        public static final C10096a f22290k = new C10096a();

        C10096a() {
            super(2);
        }

        /* renamed from: a */
        public final Object invoke(Object obj, CoroutineContext.AbstractC9924b bVar) {
            Integer num;
            int i;
            if (!(bVar instanceof AbstractC10163q2)) {
                return obj;
            }
            if (obj instanceof Integer) {
                num = (Integer) obj;
            } else {
                num = null;
            }
            if (num != null) {
                i = num.intValue();
            } else {
                i = 1;
            }
            if (i == 0) {
                return bVar;
            }
            return Integer.valueOf(i + 1);
        }
    }

    @Metadata(m15074d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00002\f\u0010\u0001\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m15073d2 = {"Lkotlinx/coroutines/q2;", "found", "Lkotlin/coroutines/CoroutineContext$b;", "element", "a", "(Lkotlinx/coroutines/q2;Lkotlin/coroutines/CoroutineContext$b;)Lkotlinx/coroutines/q2;"}, m15072k = 3, m15071mv = {1, 6, 0})
    /* renamed from: kotlinx.coroutines.internal.h0$b */
    /* loaded from: classes8.dex */
    static final class C10097b extends AbstractC9973s implements Function2<AbstractC10163q2<?>, CoroutineContext.AbstractC9924b, AbstractC10163q2<?>> {

        /* renamed from: k */
        public static final C10097b f22291k = new C10097b();

        C10097b() {
            super(2);
        }

        /* renamed from: a */
        public final AbstractC10163q2<?> invoke(AbstractC10163q2<?> q2Var, CoroutineContext.AbstractC9924b bVar) {
            if (q2Var != null) {
                return q2Var;
            }
            if (bVar instanceof AbstractC10163q2) {
                return (AbstractC10163q2) bVar;
            }
            return null;
        }
    }

    @Metadata(m15074d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m15073d2 = {"Lkotlinx/coroutines/internal/k0;", "state", "Lkotlin/coroutines/CoroutineContext$b;", "element", "a", "(Lkotlinx/coroutines/internal/k0;Lkotlin/coroutines/CoroutineContext$b;)Lkotlinx/coroutines/internal/k0;"}, m15072k = 3, m15071mv = {1, 6, 0})
    /* renamed from: kotlinx.coroutines.internal.h0$c */
    /* loaded from: classes8.dex */
    static final class C10098c extends AbstractC9973s implements Function2<C10104k0, CoroutineContext.AbstractC9924b, C10104k0> {

        /* renamed from: k */
        public static final C10098c f22292k = new C10098c();

        C10098c() {
            super(2);
        }

        /* renamed from: a */
        public final C10104k0 invoke(C10104k0 k0Var, CoroutineContext.AbstractC9924b bVar) {
            if (bVar instanceof AbstractC10163q2) {
                AbstractC10163q2<?> q2Var = (AbstractC10163q2) bVar;
                k0Var.m14272a(q2Var, q2Var.m14108z0(k0Var.f22296a));
            }
            return k0Var;
        }
    }

    /* renamed from: a */
    public static final void m14303a(CoroutineContext coroutineContext, Object obj) {
        if (obj != f22286a) {
            if (obj instanceof C10104k0) {
                ((C10104k0) obj).m14271b(coroutineContext);
                return;
            }
            Object w0 = coroutineContext.mo3482w0(null, f22288c);
            if (w0 != null) {
                ((AbstractC10163q2) w0).m14109U(coroutineContext, obj);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        }
    }

    /* renamed from: b */
    public static final Object m14302b(CoroutineContext coroutineContext) {
        Object w0 = coroutineContext.mo3482w0(0, f22287b);
        C9971q.m14636d(w0);
        return w0;
    }

    /* renamed from: c */
    public static final Object m14301c(CoroutineContext coroutineContext, Object obj) {
        if (obj == null) {
            obj = m14302b(coroutineContext);
        }
        if (obj == 0) {
            return f22286a;
        }
        if (obj instanceof Integer) {
            return coroutineContext.mo3482w0(new C10104k0(coroutineContext, ((Number) obj).intValue()), f22289d);
        }
        return ((AbstractC10163q2) obj).m14108z0(coroutineContext);
    }
}
