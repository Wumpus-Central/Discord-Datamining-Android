package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.AbstractC9930d;
import kotlin.coroutines.jvm.internal.AbstractC9931e;
import kotlin.jvm.internal.C9971q;
import kotlinx.coroutines.internal.C10087d0;
import p372ui.EnumC13337e;
import vi.AbstractC13511a;
import vi.AbstractC13526k;
import vi.C13529m;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(m15074d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0012\u0004\u0012\u00028\u00000\u00042\b\u0012\u0004\u0012\u00028\u00000\u00052\b\u0012\u0004\u0012\u00028\u00000\u0006B\u000f\u0012\u0006\u0010-\u001a\u00020\u0005¢\u0006\u0004\b.\u0010*J!\u0010\n\u001a\u00020\t2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00052\u0006\u0010\b\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0013\u001a\u00020\u00122\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00192\u0006\u0010\u0018\u001a\u00020\u0017H\u0014¢\u0006\u0004\b\u001a\u0010\u001bJ-\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000!2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u00172\u0006\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b\"\u0010#R\u0016\u0010&\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R*\u0010\f\u001a\u00028\u00002\u0006\u0010\f\u001a\u00028\u00008V@VX\u0096\u000e¢\u0006\u0012\u0012\u0004\b+\u0010,\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006/"}, m15073d2 = {"Lkotlinx/coroutines/flow/p;", "T", "Lvi/a;", "Lkotlinx/coroutines/flow/r;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "Lvi/k;", "expectedState", "newState", "", "l", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlinx/coroutines/flow/FlowCollector;", "collector", "", "collect", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "j", "()Lkotlinx/coroutines/flow/r;", "", "size", "", "k", "(I)[Lkotlinx/coroutines/flow/r;", "Lkotlin/coroutines/CoroutineContext;", "context", "capacity", "Lui/e;", "onBufferOverflow", "Lkotlinx/coroutines/flow/Flow;", "a", "(Lkotlin/coroutines/CoroutineContext;ILui/e;)Lkotlinx/coroutines/flow/Flow;", "n", "I", "sequence", "getValue", "()Ljava/lang/Object;", "setValue", "(Ljava/lang/Object;)V", "getValue$annotations", "()V", "initialState", "<init>", "kotlinx-coroutines-core"}, m15072k = 1, m15071mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.flow.p */
/* loaded from: classes8.dex */
public final class C10060p<T> extends AbstractC13511a<C10063r> implements MutableStateFlow<T>, Flow, AbstractC13526k<T> {
    private volatile /* synthetic */ Object _state;

    /* renamed from: n */
    private int f22236n;

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(m15072k = 3, m15071mv = {1, 6, 0}, m15069xi = 48)
    @AbstractC9931e(m14702c = "kotlinx.coroutines.flow.StateFlowImpl", m14701f = "StateFlow.kt", m14700l = {386, 398, 403}, m14699m = "collect")
    /* renamed from: kotlinx.coroutines.flow.p$a */
    /* loaded from: classes8.dex */
    public static final class C10061a extends AbstractC9930d {

        /* renamed from: k */
        Object f22237k;

        /* renamed from: l */
        Object f22238l;

        /* renamed from: m */
        Object f22239m;

        /* renamed from: n */
        Object f22240n;

        /* renamed from: o */
        Object f22241o;

        /* renamed from: p */
        /* synthetic */ Object f22242p;

        /* renamed from: q */
        final /* synthetic */ C10060p<T> f22243q;

        /* renamed from: r */
        int f22244r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10061a(C10060p<T> pVar, Continuation<? super C10061a> continuation) {
            super(continuation);
            this.f22243q = pVar;
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC9927a
        public final Object invokeSuspend(Object obj) {
            this.f22242p = obj;
            this.f22244r |= Integer.MIN_VALUE;
            return this.f22243q.collect(null, this);
        }
    }

    public C10060p(Object obj) {
        this._state = obj;
    }

    /* renamed from: l */
    private final boolean m14365l(Object obj, Object obj2) {
        int i;
        C10063r[] i2;
        m3503i();
        synchronized (this) {
            Object obj3 = this._state;
            if (!(obj == null || C9971q.m14638b(obj3, obj))) {
                return false;
            }
            if (C9971q.m14638b(obj3, obj2)) {
                return true;
            }
            this._state = obj2;
            int i3 = this.f22236n;
            if ((i3 & 1) == 0) {
                int i4 = i3 + 1;
                this.f22236n = i4;
                C10063r[] i5 = m3503i();
                Unit unit = Unit.f22042a;
                while (true) {
                    C10063r[] rVarArr = i5;
                    if (rVarArr != null) {
                        for (C10063r rVar : rVarArr) {
                            if (rVar != null) {
                                rVar.m14357f();
                            }
                        }
                    }
                    synchronized (this) {
                        i = this.f22236n;
                        if (i == i4) {
                            this.f22236n = i4 + 1;
                            return true;
                        }
                        i2 = m3503i();
                        Unit unit2 = Unit.f22042a;
                    }
                    i5 = i2;
                    i4 = i;
                }
            } else {
                this.f22236n = i3 + 2;
                return true;
            }
        }
    }

    @Override // vi.AbstractC13526k
    /* renamed from: a */
    public Flow<T> mo3478a(CoroutineContext coroutineContext, int i, EnumC13337e eVar) {
        return C10062q.m14361d(this, coroutineContext, i, eVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00b3, code lost:
        if (kotlin.jvm.internal.C9971q.m14638b(r11, r12) == false) goto L_0x00b5;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00aa A[Catch: all -> 0x0073, TryCatch #0 {all -> 0x0073, blocks: (B:14:0x003e, B:18:0x005c, B:20:0x006f, B:29:0x0097, B:30:0x00a6, B:32:0x00aa, B:34:0x00af, B:36:0x00b5, B:40:0x00bc, B:44:0x00d0, B:46:0x00d6), top: B:53:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00af A[Catch: all -> 0x0073, TryCatch #0 {all -> 0x0073, blocks: (B:14:0x003e, B:18:0x005c, B:20:0x006f, B:29:0x0097, B:30:0x00a6, B:32:0x00aa, B:34:0x00af, B:36:0x00b5, B:40:0x00bc, B:44:0x00d0, B:46:0x00d6), top: B:53:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ce A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d6 A[Catch: all -> 0x0073, TRY_LEAVE, TryCatch #0 {all -> 0x0073, blocks: (B:14:0x003e, B:18:0x005c, B:20:0x006f, B:29:0x0097, B:30:0x00a6, B:32:0x00aa, B:34:0x00af, B:36:0x00b5, B:40:0x00bc, B:44:0x00d0, B:46:0x00d6), top: B:53:0x0024 }] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x00d4 -> B:30:0x00a6). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:47:0x00e6 -> B:30:0x00a6). Please submit an issue!!! */
    @Override // kotlinx.coroutines.flow.Flow
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector<? super T> r11, kotlin.coroutines.Continuation<?> r12) {
        /*
            Method dump skipped, instructions count: 240
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.C10060p.collect(kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // kotlinx.coroutines.flow.MutableSharedFlow, kotlinx.coroutines.flow.FlowCollector
    public Object emit(T t, Continuation<? super Unit> continuation) {
        setValue(t);
        return Unit.f22042a;
    }

    @Override // kotlinx.coroutines.flow.MutableStateFlow
    public T getValue() {
        C10087d0 d0Var = C13529m.f30221a;
        T t = (T) this._state;
        if (t == d0Var) {
            return null;
        }
        return t;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: j */
    public C10063r mo3507e() {
        return new C10063r();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: k */
    public C10063r[] mo3506f(int i) {
        return new C10063r[i];
    }

    @Override // kotlinx.coroutines.flow.MutableStateFlow
    public void setValue(T t) {
        if (t == null) {
            t = (T) C13529m.f30221a;
        }
        m14365l(null, t);
    }
}
