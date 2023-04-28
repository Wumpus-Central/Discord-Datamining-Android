package kotlinx.coroutines.selects;

import androidx.concurrent.futures.C2113b;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C9971q;
import kotlinx.coroutines.AbstractC10000a1;
import kotlinx.coroutines.AbstractC10219v1;
import kotlinx.coroutines.C10015d0;
import kotlinx.coroutines.C10077i0;
import kotlinx.coroutines.C10160q;
import kotlinx.coroutines.C10210t0;
import kotlinx.coroutines.C10234z;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.internal.AbstractC10082b;
import kotlinx.coroutines.internal.AbstractC10086d;
import kotlinx.coroutines.internal.AbstractC10127y;
import kotlinx.coroutines.internal.C10108n;
import kotlinx.coroutines.internal.C10110p;
import nf.C11090s;
import nf.C11093t;
import p429xi.C14169a;
import p429xi.C14170b;
import tf.C13076c;
import tf.C13080d;

@Metadata(m15074d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0001\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\u00020\u00022\b\u0012\u0004\u0012\u00028\u00000\u00032\b\u0012\u0004\u0012\u00028\u00000\u00042\b\u0012\u0004\u0012\u00028\u00000\u00052\u00060\u0006j\u0002`\u0007:\u0004JKLMB\u0015\u0012\f\u00107\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\bH\u0010IJ\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\nJ \u0010\u000e\u001a\u00020\b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\fH\u0016ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0011\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0018\u0010\u0013J\u0017\u0010\u001b\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u001b\u0010\"\u001a\u0004\u0018\u00010\u00142\b\u0010!\u001a\u0004\u0018\u00010 H\u0016¢\u0006\u0004\b\"\u0010#J\u0019\u0010&\u001a\u0004\u0018\u00010\u00142\u0006\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b&\u0010'J\u000f\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\b)\u0010*JG\u0010/\u001a\u00020\b\"\u0004\b\u0001\u0010+*\b\u0012\u0004\u0012\u00028\u00010,2\"\u0010.\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00140-H\u0096\u0002ø\u0001\u0000¢\u0006\u0004\b/\u00100J8\u00104\u001a\u00020\b2\u0006\u00102\u001a\u0002012\u001c\u0010.\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u001403H\u0016ø\u0001\u0000¢\u0006\u0004\b4\u00105R\u001a\u00107\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u00106R(\u0010<\u001a\u0004\u0018\u00010\u00192\b\u00108\u001a\u0004\u0018\u00010\u00198B@BX\u0082\u000e¢\u0006\f\u001a\u0004\b9\u0010:\"\u0004\b;\u0010\u001cR\u001c\u0010?\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b=\u0010>R\u0014\u0010C\u001a\u00020@8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bA\u0010BR\u001a\u0010F\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bD\u0010ER\u0014\u0010G\u001a\u00020\u001d8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u001f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006N"}, m15073d2 = {"Lkotlinx/coroutines/selects/b;", "R", "Lkotlinx/coroutines/internal/n;", "Lkotlinx/coroutines/selects/a;", "Lkotlinx/coroutines/selects/d;", "Lkotlin/coroutines/Continuation;", "Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "Lkotlinx/coroutines/internal/CoroutineStackFrame;", "", "d0", "()V", "Z", "Lnf/s;", "result", "resumeWith", "(Ljava/lang/Object;)V", "", "exception", "x", "(Ljava/lang/Throwable;)V", "", "b0", "()Ljava/lang/Object;", "e", "c0", "Lkotlinx/coroutines/a1;", "handle", "n", "(Lkotlinx/coroutines/a1;)V", "", "s", "()Z", "Lkotlinx/coroutines/internal/p$c;", "otherOp", "r", "(Lkotlinx/coroutines/internal/p$c;)Ljava/lang/Object;", "Lkotlinx/coroutines/internal/b;", "desc", "y", "(Lkotlinx/coroutines/internal/b;)Ljava/lang/Object;", "", "toString", "()Ljava/lang/String;", "Q", "Lkotlinx/coroutines/selects/c;", "Lkotlin/Function2;", "block", "A", "(Lkotlinx/coroutines/selects/c;Lkotlin/jvm/functions/Function2;)V", "", "timeMillis", "Lkotlin/Function1;", "i", "(JLkotlin/jvm/functions/Function1;)V", "Lkotlin/coroutines/Continuation;", "uCont", "value", "a0", "()Lkotlinx/coroutines/a1;", "e0", "parentHandle", "getCallerFrame", "()Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "callerFrame", "Lkotlin/coroutines/CoroutineContext;", "getContext", "()Lkotlin/coroutines/CoroutineContext;", "context", "w", "()Lkotlin/coroutines/Continuation;", "completion", "isSelected", "<init>", "(Lkotlin/coroutines/Continuation;)V", "a", "b", "c", "d", "kotlinx-coroutines-core"}, m15072k = 1, m15071mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.selects.b */
/* loaded from: classes8.dex */
public final class C10192b<R> extends C10108n implements AbstractC10191a<R>, AbstractC10198d<R>, Continuation<R>, CoroutineStackFrame {

    /* renamed from: o */
    static final /* synthetic */ AtomicReferenceFieldUpdater f22429o = AtomicReferenceFieldUpdater.newUpdater(C10192b.class, Object.class, "_state");

    /* renamed from: p */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f22430p = AtomicReferenceFieldUpdater.newUpdater(C10192b.class, Object.class, "_result");
    private volatile /* synthetic */ Object _result;

    /* renamed from: n */
    private final Continuation<R> f22431n;
    volatile /* synthetic */ Object _state = C10199e.m14011e();
    private volatile /* synthetic */ Object _parentHandle = null;

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(m15074d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0007\b\u0002\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u001b\u0012\n\u0010\u0010\u001a\u0006\u0012\u0002\b\u00030\r\u0012\u0006\u0010\u0014\u001a\u00020\u0011¢\u0006\u0004\b\u001a\u0010\u001bJ\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0002J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u0002J\u0014\u0010\t\u001a\u0004\u0018\u00010\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016J\u001c\u0010\n\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010\f\u001a\u00020\u000bH\u0016R\u0018\u0010\u0010\u001a\u0006\u0012\u0002\b\u00030\r8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0019\u001a\u00020\u00158\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001c"}, m15073d2 = {"Lkotlinx/coroutines/selects/b$a;", "Lkotlinx/coroutines/internal/d;", "", "k", "", "l", "failure", "j", "affected", "i", "d", "", "toString", "Lkotlinx/coroutines/selects/b;", "b", "Lkotlinx/coroutines/selects/b;", "impl", "Lkotlinx/coroutines/internal/b;", "c", "Lkotlinx/coroutines/internal/b;", "desc", "", "J", "g", "()J", "opSequence", "<init>", "(Lkotlinx/coroutines/selects/b;Lkotlinx/coroutines/internal/b;)V", "kotlinx-coroutines-core"}, m15072k = 1, m15071mv = {1, 6, 0})
    /* renamed from: kotlinx.coroutines.selects.b$a */
    /* loaded from: classes8.dex */
    public static final class C10193a extends AbstractC10086d<Object> {

        /* renamed from: b */
        public final C10192b<?> f22432b;

        /* renamed from: c */
        public final AbstractC10082b f22433c;

        /* renamed from: d */
        private final long f22434d;

        public C10193a(C10192b<?> bVar, AbstractC10082b bVar2) {
            C10200f fVar;
            this.f22432b = bVar;
            this.f22433c = bVar2;
            fVar = C10199e.f22444e;
            this.f22434d = fVar.m14010a();
            bVar2.m14337d(this);
        }

        /* renamed from: j */
        private final void m14027j(Object obj) {
            boolean z;
            Object obj2;
            if (obj == null) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                obj2 = null;
            } else {
                obj2 = C10199e.m14011e();
            }
            if (C2113b.m38965a(C10192b.f22429o, this.f22432b, this, obj2) && z) {
                this.f22432b.m14035Z();
            }
        }

        /* renamed from: k */
        private final Object m14026k() {
            C10192b<?> bVar = this.f22432b;
            while (true) {
                Object obj = bVar._state;
                if (obj == this) {
                    return null;
                }
                if (obj instanceof AbstractC10127y) {
                    ((AbstractC10127y) obj).mo14023c(this.f22432b);
                } else if (obj != C10199e.m14011e()) {
                    return C10199e.m14012d();
                } else {
                    if (C2113b.m38965a(C10192b.f22429o, this.f22432b, C10199e.m14011e(), this)) {
                        return null;
                    }
                }
            }
        }

        /* renamed from: l */
        private final void m14025l() {
            C2113b.m38965a(C10192b.f22429o, this.f22432b, this, C10199e.m14011e());
        }

        @Override // kotlinx.coroutines.internal.AbstractC10086d
        /* renamed from: d */
        public void mo14002d(Object obj, Object obj2) {
            m14027j(obj2);
            this.f22433c.mo14243a(this, obj2);
        }

        @Override // kotlinx.coroutines.internal.AbstractC10086d
        /* renamed from: g */
        public long mo14028g() {
            return this.f22434d;
        }

        @Override // kotlinx.coroutines.internal.AbstractC10086d
        /* renamed from: i */
        public Object mo3922i(Object obj) {
            Object k;
            if (obj == null && (k = m14026k()) != null) {
                return k;
            }
            try {
                return this.f22433c.mo14242c(this);
            } catch (Throwable th2) {
                if (obj == null) {
                    m14025l();
                }
                throw th2;
            }
        }

        @Override // kotlinx.coroutines.internal.AbstractC10127y
        public String toString() {
            return "AtomicSelectOp(sequence=" + mo14028g() + ')';
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(m15074d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\b"}, m15073d2 = {"Lkotlinx/coroutines/selects/b$b;", "Lkotlinx/coroutines/internal/p;", "Lkotlinx/coroutines/a1;", "n", "Lkotlinx/coroutines/a1;", "handle", "<init>", "(Lkotlinx/coroutines/a1;)V", "kotlinx-coroutines-core"}, m15072k = 1, m15071mv = {1, 6, 0})
    /* renamed from: kotlinx.coroutines.selects.b$b */
    /* loaded from: classes8.dex */
    public static final class C0312b extends C10110p {

        /* renamed from: n */
        public final AbstractC10000a1 f22435n;

        public C0312b(AbstractC10000a1 a1Var) {
            this.f22435n = a1Var;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(m15074d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\f\u0010\rJ\u0014\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016R\u0014\u0010\b\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0018\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\n¨\u0006\u000e"}, m15073d2 = {"Lkotlinx/coroutines/selects/b$c;", "Lkotlinx/coroutines/internal/y;", "", "affected", "c", "Lkotlinx/coroutines/internal/p$c;", "a", "Lkotlinx/coroutines/internal/p$c;", "otherOp", "Lkotlinx/coroutines/internal/d;", "()Lkotlinx/coroutines/internal/d;", "atomicOp", "<init>", "(Lkotlinx/coroutines/internal/p$c;)V", "kotlinx-coroutines-core"}, m15072k = 1, m15071mv = {1, 6, 0})
    /* renamed from: kotlinx.coroutines.selects.b$c */
    /* loaded from: classes8.dex */
    public static final class C10194c extends AbstractC10127y {

        /* renamed from: a */
        public final C10110p.C10113c f22436a;

        public C10194c(C10110p.C10113c cVar) {
            this.f22436a = cVar;
        }

        @Override // kotlinx.coroutines.internal.AbstractC10127y
        /* renamed from: a */
        public AbstractC10086d<?> mo14024a() {
            return this.f22436a.mo14024a();
        }

        @Override // kotlinx.coroutines.internal.AbstractC10127y
        /* renamed from: c */
        public Object mo14023c(Object obj) {
            Object obj2;
            if (obj != null) {
                C10192b bVar = (C10192b) obj;
                this.f22436a.m14240d();
                Object e = this.f22436a.mo14024a().m14333e(null);
                if (e == null) {
                    obj2 = this.f22436a.f22314c;
                } else {
                    obj2 = C10199e.m14011e();
                }
                C2113b.m38965a(C10192b.f22429o, bVar, this, obj2);
                return e;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.selects.SelectBuilderImpl<*>");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(m15074d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0096\u0002¨\u0006\b"}, m15073d2 = {"Lkotlinx/coroutines/selects/b$d;", "Lkotlinx/coroutines/v1;", "", "cause", "", "W", "<init>", "(Lkotlinx/coroutines/selects/b;)V", "kotlinx-coroutines-core"}, m15072k = 1, m15071mv = {1, 6, 0})
    /* renamed from: kotlinx.coroutines.selects.b$d */
    /* loaded from: classes8.dex */
    public final class C10195d extends AbstractC10219v1 {
        public C10195d() {
        }

        @Override // kotlinx.coroutines.AbstractC10003b0
        /* renamed from: W */
        public void mo13984W(Throwable th2) {
            if (C10192b.this.mo14019s()) {
                C10192b.this.mo14017x(m14564X().mo14559C());
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
            mo13984W(th2);
            return Unit.f22042a;
        }
    }

    @Metadata(m15074d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m15073d2 = {"", "run", "()V", "<anonymous>"}, m15072k = 3, m15071mv = {1, 6, 0})
    /* renamed from: kotlinx.coroutines.selects.b$e */
    /* loaded from: classes8.dex */
    public static final class RunnableC10196e implements Runnable {

        /* renamed from: l */
        final /* synthetic */ Function1 f22439l;

        public RunnableC10196e(Function1 function1) {
            this.f22439l = function1;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (C10192b.this.mo14019s()) {
                C14169a.m1469c(this.f22439l, C10192b.this.mo14018w());
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C10192b(Continuation<? super R> continuation) {
        Object obj;
        this.f22431n = continuation;
        obj = C10199e.f22442c;
        this._result = obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Z */
    public final void m14035Z() {
        AbstractC10000a1 a0 = m14034a0();
        if (a0 != null) {
            a0.dispose();
        }
        for (C10110p pVar = (C10110p) m14253L(); !C9971q.m14638b(pVar, this); pVar = pVar.m14252M()) {
            if (pVar instanceof C0312b) {
                ((C0312b) pVar).f22435n.dispose();
            }
        }
    }

    /* renamed from: a0 */
    private final AbstractC10000a1 m14034a0() {
        return (AbstractC10000a1) this._parentHandle;
    }

    /* renamed from: d0 */
    private final void m14031d0() {
        Job job = (Job) getContext().mo3484i(Job.f22120e);
        if (job != null) {
            AbstractC10000a1 d = Job.C9996a.m14568d(job, true, false, new C10195d(), 2, null);
            m14030e0(d);
            if (mo14022e()) {
                d.dispose();
            }
        }
    }

    /* renamed from: e0 */
    private final void m14030e0(AbstractC10000a1 a1Var) {
        this._parentHandle = a1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.coroutines.selects.AbstractC10191a
    /* renamed from: A */
    public <Q> void mo14037A(AbstractC10197c<? extends Q> cVar, Function2<? super Q, ? super Continuation<? super R>, ? extends Object> function2) {
        cVar.mo3940a(this, function2);
    }

    /* renamed from: b0 */
    public final Object m14033b0() {
        Object obj;
        Object obj2;
        Object obj3;
        Object d;
        Object d2;
        if (!mo14022e()) {
            m14031d0();
        }
        Object obj4 = this._result;
        obj = C10199e.f22442c;
        if (obj4 == obj) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f22430p;
            obj3 = C10199e.f22442c;
            d = C13080d.m4646d();
            if (C2113b.m38965a(atomicReferenceFieldUpdater, this, obj3, d)) {
                d2 = C13080d.m4646d();
                return d2;
            }
            obj4 = this._result;
        }
        obj2 = C10199e.f22443d;
        if (obj4 == obj2) {
            throw new IllegalStateException("Already resumed");
        } else if (!(obj4 instanceof C10234z)) {
            return obj4;
        } else {
            throw ((C10234z) obj4).f22488a;
        }
    }

    /* renamed from: c0 */
    public final void m14032c0(Throwable th2) {
        if (mo14019s()) {
            C11090s.C11091a aVar = C11090s.f24606l;
            resumeWith(C11090s.m10940b(C11093t.m10931a(th2)));
        } else if (!(th2 instanceof CancellationException)) {
            Object b0 = m14033b0();
            if (!(b0 instanceof C10234z) || ((C10234z) b0).f22488a != th2) {
                C10077i0.m14350a(getContext(), th2);
            }
        }
    }

    @Override // kotlinx.coroutines.selects.AbstractC10198d
    /* renamed from: e */
    public boolean mo14022e() {
        while (true) {
            Object obj = this._state;
            if (obj == C10199e.m14011e()) {
                return false;
            }
            if (!(obj instanceof AbstractC10127y)) {
                return true;
            }
            ((AbstractC10127y) obj).mo14023c(this);
        }
    }

    @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
    public CoroutineStackFrame getCallerFrame() {
        Continuation<R> continuation = this.f22431n;
        if (continuation instanceof CoroutineStackFrame) {
            return (CoroutineStackFrame) continuation;
        }
        return null;
    }

    @Override // kotlin.coroutines.Continuation
    public CoroutineContext getContext() {
        return this.f22431n.getContext();
    }

    @Override // kotlinx.coroutines.selects.AbstractC10191a
    /* renamed from: i */
    public void mo14029i(long j, Function1<? super Continuation<? super R>, ? extends Object> function1) {
        if (j > 0) {
            mo14021n(C10210t0.m13990c(getContext()).mo4537R(j, new RunnableC10196e(function1), getContext()));
        } else if (mo14019s()) {
            C14170b.m1465b(function1, mo14018w());
        }
    }

    @Override // kotlinx.coroutines.selects.AbstractC10198d
    /* renamed from: n */
    public void mo14021n(AbstractC10000a1 a1Var) {
        C0312b bVar = new C0312b(a1Var);
        if (!mo14022e()) {
            m14259F(bVar);
            if (!mo14022e()) {
                return;
            }
        }
        a1Var.dispose();
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0030, code lost:
        m14035Z();
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0035, code lost:
        return kotlinx.coroutines.C10160q.f22367a;
     */
    @Override // kotlinx.coroutines.selects.AbstractC10198d
    /* renamed from: r */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object mo14020r(kotlinx.coroutines.internal.C10110p.C10113c r4) {
        /*
            r3 = this;
        L_0x0000:
            java.lang.Object r0 = r3._state
            java.lang.Object r1 = kotlinx.coroutines.selects.C10199e.m14011e()
            r2 = 0
            if (r0 != r1) goto L_0x0036
            if (r4 != 0) goto L_0x0018
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.selects.C10192b.f22429o
            java.lang.Object r1 = kotlinx.coroutines.selects.C10199e.m14011e()
            boolean r0 = androidx.concurrent.futures.C2113b.m38965a(r0, r3, r1, r2)
            if (r0 != 0) goto L_0x0030
            goto L_0x0000
        L_0x0018:
            kotlinx.coroutines.selects.b$c r0 = new kotlinx.coroutines.selects.b$c
            r0.<init>(r4)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = kotlinx.coroutines.selects.C10192b.f22429o
            java.lang.Object r2 = kotlinx.coroutines.selects.C10199e.m14011e()
            boolean r1 = androidx.concurrent.futures.C2113b.m38965a(r1, r3, r2, r0)
            if (r1 == 0) goto L_0x0000
            java.lang.Object r4 = r0.mo14023c(r3)
            if (r4 == 0) goto L_0x0030
            return r4
        L_0x0030:
            r3.m14035Z()
            kotlinx.coroutines.internal.d0 r4 = kotlinx.coroutines.C10160q.f22367a
            return r4
        L_0x0036:
            boolean r1 = r0 instanceof kotlinx.coroutines.internal.AbstractC10127y
            if (r1 == 0) goto L_0x006a
            if (r4 == 0) goto L_0x0064
            kotlinx.coroutines.internal.d r1 = r4.mo14024a()
            boolean r2 = r1 instanceof kotlinx.coroutines.selects.C10192b.C10193a
            if (r2 == 0) goto L_0x0058
            r2 = r1
            kotlinx.coroutines.selects.b$a r2 = (kotlinx.coroutines.selects.C10192b.C10193a) r2
            kotlinx.coroutines.selects.b<?> r2 = r2.f22432b
            if (r2 == r3) goto L_0x004c
            goto L_0x0058
        L_0x004c:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r0 = "Cannot use matching select clauses on the same object"
            java.lang.String r0 = r0.toString()
            r4.<init>(r0)
            throw r4
        L_0x0058:
            r2 = r0
            kotlinx.coroutines.internal.y r2 = (kotlinx.coroutines.internal.AbstractC10127y) r2
            boolean r1 = r1.m14199b(r2)
            if (r1 == 0) goto L_0x0064
            java.lang.Object r4 = kotlinx.coroutines.internal.C10084c.f22271b
            return r4
        L_0x0064:
            kotlinx.coroutines.internal.y r0 = (kotlinx.coroutines.internal.AbstractC10127y) r0
            r0.mo14023c(r3)
            goto L_0x0000
        L_0x006a:
            if (r4 != 0) goto L_0x006d
            return r2
        L_0x006d:
            kotlinx.coroutines.internal.p$a r4 = r4.f22314c
            if (r0 != r4) goto L_0x0074
            kotlinx.coroutines.internal.d0 r4 = kotlinx.coroutines.C10160q.f22367a
            return r4
        L_0x0074:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.selects.C10192b.mo14020r(kotlinx.coroutines.internal.p$c):java.lang.Object");
    }

    @Override // kotlin.coroutines.Continuation
    public void resumeWith(Object obj) {
        Object obj2;
        Object obj3;
        Object d;
        Object d2;
        Object obj4;
        while (true) {
            Object obj5 = this._result;
            obj2 = C10199e.f22442c;
            if (obj5 == obj2) {
                Object d3 = C10015d0.m14484d(obj, null, 1, null);
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f22430p;
                obj3 = C10199e.f22442c;
                if (C2113b.m38965a(atomicReferenceFieldUpdater, this, obj3, d3)) {
                    return;
                }
            } else {
                d = C13080d.m4646d();
                if (obj5 == d) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f22430p;
                    d2 = C13080d.m4646d();
                    obj4 = C10199e.f22443d;
                    if (C2113b.m38965a(atomicReferenceFieldUpdater2, this, d2, obj4)) {
                        if (C11090s.m10935g(obj)) {
                            Continuation<R> continuation = this.f22431n;
                            Throwable e = C11090s.m10937e(obj);
                            C9971q.m14636d(e);
                            continuation.resumeWith(C11090s.m10940b(C11093t.m10931a(e)));
                            return;
                        }
                        this.f22431n.resumeWith(obj);
                        return;
                    }
                } else {
                    throw new IllegalStateException("Already resumed");
                }
            }
        }
    }

    @Override // kotlinx.coroutines.selects.AbstractC10198d
    /* renamed from: s */
    public boolean mo14019s() {
        Object r = mo14020r(null);
        if (r == C10160q.f22367a) {
            return true;
        }
        if (r == null) {
            return false;
        }
        throw new IllegalStateException(("Unexpected trySelectIdempotent result " + r).toString());
    }

    @Override // kotlinx.coroutines.internal.C10110p
    public String toString() {
        return "SelectInstance(state=" + this._state + ", result=" + this._result + ')';
    }

    @Override // kotlinx.coroutines.selects.AbstractC10198d
    /* renamed from: w */
    public Continuation<R> mo14018w() {
        return this;
    }

    @Override // kotlinx.coroutines.selects.AbstractC10198d
    /* renamed from: x */
    public void mo14017x(Throwable th2) {
        Object obj;
        Object obj2;
        Object d;
        Object d2;
        Object obj3;
        Continuation c;
        while (true) {
            Object obj4 = this._result;
            obj = C10199e.f22442c;
            if (obj4 == obj) {
                C10234z zVar = new C10234z(th2, false, 2, null);
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f22430p;
                obj2 = C10199e.f22442c;
                if (C2113b.m38965a(atomicReferenceFieldUpdater, this, obj2, zVar)) {
                    return;
                }
            } else {
                d = C13080d.m4646d();
                if (obj4 == d) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f22430p;
                    d2 = C13080d.m4646d();
                    obj3 = C10199e.f22443d;
                    if (C2113b.m38965a(atomicReferenceFieldUpdater2, this, d2, obj3)) {
                        c = C13076c.m4647c(this.f22431n);
                        C11090s.C11091a aVar = C11090s.f24606l;
                        c.resumeWith(C11090s.m10940b(C11093t.m10931a(th2)));
                        return;
                    }
                } else {
                    throw new IllegalStateException("Already resumed");
                }
            }
        }
    }

    @Override // kotlinx.coroutines.selects.AbstractC10198d
    /* renamed from: y */
    public Object mo14016y(AbstractC10082b bVar) {
        return new C10193a(this, bVar).mo14023c(null);
    }
}
