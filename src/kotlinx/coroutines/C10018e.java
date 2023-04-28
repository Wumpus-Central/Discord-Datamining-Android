package kotlinx.coroutines;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.C9933g;
import kotlin.jvm.internal.C9971q;
import nf.C11090s;
import tf.C13076c;
import tf.C13080d;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(m15074d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0002\b\u0004B\u001d\u0012\u0014\u0010\n\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00028\u00000\u00070\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005R\"\u0010\n\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00028\u00000\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\r"}, m15073d2 = {"Lkotlinx/coroutines/e;", "T", "", "", "b", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "Lkotlinx/coroutines/q0;", "a", "[Lkotlinx/coroutines/q0;", "deferreds", "<init>", "([Lkotlinx/coroutines/q0;)V", "kotlinx-coroutines-core"}, m15072k = 1, m15071mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.e */
/* loaded from: classes8.dex */
public final class C10018e<T> {

    /* renamed from: b */
    static final /* synthetic */ AtomicIntegerFieldUpdater f22151b = AtomicIntegerFieldUpdater.newUpdater(C10018e.class, "notCompletedCount");

    /* renamed from: a */
    private final AbstractC10161q0<T>[] f22152a;
    volatile /* synthetic */ int notCompletedCount;

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(m15074d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0082\u0004\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\b0\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0096\u0002¢\u0006\u0004\b\u0005\u0010\u0006R \u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\b0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\"\u0010\u0013\u001a\u00020\f8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R<\u0010\u001b\u001a\u000e\u0018\u00010\u0014R\b\u0012\u0004\u0012\u00028\u00000\u00152\u0012\u0010\u0016\u001a\u000e\u0018\u00010\u0014R\b\u0012\u0004\u0012\u00028\u00000\u00158F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006\u001e"}, m15073d2 = {"Lkotlinx/coroutines/e$a;", "Lkotlinx/coroutines/a2;", "", "cause", "", "W", "(Ljava/lang/Throwable;)V", "Lkotlinx/coroutines/CancellableContinuation;", "", "o", "Lkotlinx/coroutines/CancellableContinuation;", "continuation", "Lkotlinx/coroutines/a1;", "p", "Lkotlinx/coroutines/a1;", "a0", "()Lkotlinx/coroutines/a1;", "c0", "(Lkotlinx/coroutines/a1;)V", "handle", "Lkotlinx/coroutines/e$b;", "Lkotlinx/coroutines/e;", "value", "Z", "()Lkotlinx/coroutines/e$b;", "b0", "(Lkotlinx/coroutines/e$b;)V", "disposer", "<init>", "(Lkotlinx/coroutines/e;Lkotlinx/coroutines/CancellableContinuation;)V", "kotlinx-coroutines-core"}, m15072k = 1, m15071mv = {1, 6, 0})
    /* renamed from: kotlinx.coroutines.e$a */
    /* loaded from: classes8.dex */
    public final class C10019a extends AbstractC10001a2 {
        private volatile /* synthetic */ Object _disposer = null;

        /* renamed from: o */
        private final CancellableContinuation<List<? extends T>> f22153o;

        /* renamed from: p */
        public AbstractC10000a1 f22154p;

        /* JADX WARN: Multi-variable type inference failed */
        public C10019a(CancellableContinuation<? super List<? extends T>> cancellableContinuation) {
            this.f22153o = cancellableContinuation;
        }

        @Override // kotlinx.coroutines.AbstractC10003b0
        /* renamed from: W */
        public void mo13984W(Throwable th2) {
            if (th2 != null) {
                Object m = this.f22153o.mo14129m(th2);
                if (m != null) {
                    this.f22153o.mo14151B(m);
                    C10018e<T>.C10020b Z = m14481Z();
                    if (Z != null) {
                        Z.m14477b();
                        return;
                    }
                    return;
                }
                return;
            }
            if (C10018e.f22151b.decrementAndGet(C10018e.this) == 0) {
                CancellableContinuation<List<? extends T>> cancellableContinuation = this.f22153o;
                AbstractC10161q0[] q0VarArr = ((C10018e) C10018e.this).f22152a;
                ArrayList arrayList = new ArrayList(q0VarArr.length);
                for (AbstractC10161q0 q0Var : q0VarArr) {
                    arrayList.add(q0Var.mo14104n());
                }
                cancellableContinuation.resumeWith(C11090s.m10940b(arrayList));
            }
        }

        /* renamed from: Z */
        public final C10018e<T>.C10020b m14481Z() {
            return (C10020b) this._disposer;
        }

        /* renamed from: a0 */
        public final AbstractC10000a1 m14480a0() {
            AbstractC10000a1 a1Var = this.f22154p;
            if (a1Var != null) {
                return a1Var;
            }
            C9971q.m14615y("handle");
            return null;
        }

        /* renamed from: b0 */
        public final void m14479b0(C10018e<T>.C10020b bVar) {
            this._disposer = bVar;
        }

        /* renamed from: c0 */
        public final void m14478c0(AbstractC10000a1 a1Var) {
            this.f22154p = a1Var;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
            mo13984W(th2);
            return Unit.f22042a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(m15074d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0082\u0004\u0018\u00002\u00020\u0001B\u001f\u0012\u0016\u0010\u000e\u001a\u0012\u0012\u000e\u0012\f0\nR\b\u0012\u0004\u0012\u00028\u00000\u000b0\t¢\u0006\u0004\b\u000f\u0010\u0010J\u0006\u0010\u0003\u001a\u00020\u0002J\u0013\u0010\u0006\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0096\u0002J\b\u0010\b\u001a\u00020\u0007H\u0016R$\u0010\u000e\u001a\u0012\u0012\u000e\u0012\f0\nR\b\u0012\u0004\u0012\u00028\u00000\u000b0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0011"}, m15073d2 = {"Lkotlinx/coroutines/e$b;", "Lkotlinx/coroutines/n;", "", "b", "", "cause", "a", "", "toString", "", "Lkotlinx/coroutines/e$a;", "Lkotlinx/coroutines/e;", "k", "[Lkotlinx/coroutines/e$a;", "nodes", "<init>", "(Lkotlinx/coroutines/e;[Lkotlinx/coroutines/e$a;)V", "kotlinx-coroutines-core"}, m15072k = 1, m15071mv = {1, 6, 0})
    /* renamed from: kotlinx.coroutines.e$b */
    /* loaded from: classes8.dex */
    public final class C10020b extends AbstractC10148n {

        /* renamed from: k */
        private final C10018e<T>.C10019a[] f22156k;

        public C10020b(C10018e<T>.C10019a[] aVarArr) {
            this.f22156k = aVarArr;
        }

        @Override // kotlinx.coroutines.AbstractC10152o
        /* renamed from: a */
        public void mo3945a(Throwable th2) {
            m14477b();
        }

        /* renamed from: b */
        public final void m14477b() {
            for (C10018e<T>.C10019a aVar : this.f22156k) {
                aVar.m14480a0().dispose();
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
            mo3945a(th2);
            return Unit.f22042a;
        }

        public String toString() {
            return "DisposeHandlersOnCancel[" + this.f22156k + ']';
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C10018e(AbstractC10161q0<? extends T>[] q0VarArr) {
        this.f22152a = q0VarArr;
        this.notCompletedCount = q0VarArr.length;
    }

    /* renamed from: b */
    public final Object m14482b(Continuation<? super List<? extends T>> continuation) {
        Continuation c;
        Object d;
        c = C13076c.m4647c(continuation);
        C10156p pVar = new C10156p(c, 1);
        pVar.m14150C();
        int length = this.f22152a.length;
        C10019a[] aVarArr = new C10019a[length];
        for (int i = 0; i < length; i++) {
            AbstractC10161q0 q0Var = this.f22152a[i];
            q0Var.start();
            C10019a aVar = new C10019a(pVar);
            aVar.m14478c0(q0Var.mo14535Q(aVar));
            Unit unit = Unit.f22042a;
            aVarArr[i] = aVar;
        }
        C10018e<T>.C10020b bVar = new C10020b(aVarArr);
        for (int i2 = 0; i2 < length; i2++) {
            aVarArr[i2].m14479b0(bVar);
        }
        if (pVar.mo14134g()) {
            bVar.m14477b();
        } else {
            pVar.mo14131k(bVar);
        }
        Object y = pVar.m14117y();
        d = C13080d.m4646d();
        if (y == d) {
            C9933g.m14691c(continuation);
        }
        return y;
    }
}
