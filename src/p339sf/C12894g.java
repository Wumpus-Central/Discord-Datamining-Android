package p339sf;

import androidx.concurrent.futures.C2113b;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;
import kotlin.jvm.internal.C9971q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nf.C11090s;
import tf.C13080d;
import tf.EnumC13074a;

@Metadata(m15074d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\b\u0001\u0018\u0000 \u001c*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u00022\u00020\u0003:\u0001\nB!\b\u0000\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0019\u0010\u001aB\u0017\b\u0011\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b\u0019\u0010\u001bJ \u0010\u0007\u001a\u00020\u00062\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ\n\u0010\n\u001a\u0004\u0018\u00010\tH\u0001J\b\u0010\f\u001a\u00020\u000bH\u0016R\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0017\u001a\u0004\u0018\u00010\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001d"}, m15073d2 = {"Lsf/g;", "T", "Lkotlin/coroutines/Continuation;", "Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "Lnf/s;", "result", "", "resumeWith", "(Ljava/lang/Object;)V", "", "a", "", "toString", "k", "Lkotlin/coroutines/Continuation;", "delegate", "Ljava/lang/Object;", "Lkotlin/coroutines/CoroutineContext;", "getContext", "()Lkotlin/coroutines/CoroutineContext;", "context", "getCallerFrame", "()Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "callerFrame", "initialResult", "<init>", "(Lkotlin/coroutines/Continuation;Ljava/lang/Object;)V", "(Lkotlin/coroutines/Continuation;)V", "l", "kotlin-stdlib"}, m15072k = 1, m15071mv = {1, 8, 0})
/* renamed from: sf.g */
/* loaded from: classes8.dex */
public final class C12894g<T> implements Continuation<T>, CoroutineStackFrame {

    /* renamed from: l */
    private static final C12895a f28967l = new C12895a(null);
    @Deprecated

    /* renamed from: m */
    private static final AtomicReferenceFieldUpdater<C12894g<?>, Object> f28968m = AtomicReferenceFieldUpdater.newUpdater(C12894g.class, Object.class, "result");

    /* renamed from: k */
    private final Continuation<T> f28969k;
    private volatile Object result;

    @Metadata(m15074d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\bRj\u0010\u0005\u001aR\u0012\u0014\u0012\u0012\u0012\u0002\b\u0003 \u0004*\b\u0012\u0002\b\u0003\u0018\u00010\u00030\u0003\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00010\u0001 \u0004*(\u0012\u0014\u0012\u0012\u0012\u0002\b\u0003 \u0004*\b\u0012\u0002\b\u0003\u0018\u00010\u00030\u0003\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00010\u0001\u0018\u00010\u00020\u00028\u0002X\u0082\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\u0007\u0010\b¨\u0006\n"}, m15073d2 = {"Lsf/g$a;", "", "Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;", "Lsf/g;", "kotlin.jvm.PlatformType", "RESULT", "Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;", "getRESULT$annotations", "()V", "<init>", "kotlin-stdlib"}, m15072k = 1, m15071mv = {1, 8, 0})
    /* renamed from: sf.g$a */
    /* loaded from: classes8.dex */
    private static final class C12895a {
        private C12895a() {
        }

        public /* synthetic */ C12895a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C12894g(Continuation<? super T> delegate, Object obj) {
        C9971q.m14633g(delegate, "delegate");
        this.f28969k = delegate;
        this.result = obj;
    }

    /* renamed from: a */
    public final Object m5178a() {
        Object d;
        Object d2;
        Object d3;
        Object obj = this.result;
        EnumC13074a aVar = EnumC13074a.UNDECIDED;
        if (obj == aVar) {
            AtomicReferenceFieldUpdater<C12894g<?>, Object> atomicReferenceFieldUpdater = f28968m;
            d2 = C13080d.m4646d();
            if (C2113b.m38965a(atomicReferenceFieldUpdater, this, aVar, d2)) {
                d3 = C13080d.m4646d();
                return d3;
            }
            obj = this.result;
        }
        if (obj == EnumC13074a.RESUMED) {
            d = C13080d.m4646d();
            return d;
        } else if (!(obj instanceof C11090s.C11092b)) {
            return obj;
        } else {
            throw ((C11090s.C11092b) obj).f24608k;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
    public CoroutineStackFrame getCallerFrame() {
        Continuation<T> continuation = this.f28969k;
        if (continuation instanceof CoroutineStackFrame) {
            return (CoroutineStackFrame) continuation;
        }
        return null;
    }

    @Override // kotlin.coroutines.Continuation
    public CoroutineContext getContext() {
        return this.f28969k.getContext();
    }

    @Override // kotlin.coroutines.Continuation
    public void resumeWith(Object obj) {
        Object d;
        Object d2;
        while (true) {
            Object obj2 = this.result;
            EnumC13074a aVar = EnumC13074a.UNDECIDED;
            if (obj2 != aVar) {
                d = C13080d.m4646d();
                if (obj2 == d) {
                    AtomicReferenceFieldUpdater<C12894g<?>, Object> atomicReferenceFieldUpdater = f28968m;
                    d2 = C13080d.m4646d();
                    if (C2113b.m38965a(atomicReferenceFieldUpdater, this, d2, EnumC13074a.RESUMED)) {
                        this.f28969k.resumeWith(obj);
                        return;
                    }
                } else {
                    throw new IllegalStateException("Already resumed");
                }
            } else if (C2113b.m38965a(f28968m, this, aVar, obj)) {
                return;
            }
        }
    }

    public String toString() {
        return "SafeContinuation for " + this.f28969k;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C12894g(Continuation<? super T> delegate) {
        this(delegate, EnumC13074a.UNDECIDED);
        C9971q.m14633g(delegate, "delegate");
    }
}
