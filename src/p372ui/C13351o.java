package p372ui;

import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9971q;
import kotlinx.coroutines.internal.C10087d0;
import kotlinx.coroutines.internal.C10106l0;
import kotlinx.coroutines.internal.C10125x;
import kotlinx.coroutines.selects.AbstractC10198d;
import kotlinx.coroutines.selects.C10199e;

@Metadata(m15074d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B)\u0012 \u0010+\u001a\u001c\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000f\u0018\u00010)j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`*¢\u0006\u0004\b,\u0010-J\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0002J\u0017\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\n\u0010\t\u001a\u0004\u0018\u00010\u0003H\u0014J\u0016\u0010\f\u001a\u0004\u0018\u00010\u00032\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\nH\u0014J\u0010\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0014J\u0016\u0010\u0013\u001a\u00020\r2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011H\u0014R\u0018\u0010\u0018\u001a\u00060\u0014j\u0002`\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001e\u001a\u00020\r8DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010 \u001a\u00020\r8DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u001dR\u0014\u0010\"\u001a\u00020\r8DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\u001dR\u0014\u0010$\u001a\u00020\r8DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b#\u0010\u001dR\u0014\u0010(\u001a\u00020%8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'¨\u0006."}, m15073d2 = {"Lui/o;", "E", "Lui/a;", "", "element", "Lkotlinx/coroutines/internal/l0;", "a0", "y", "(Ljava/lang/Object;)Ljava/lang/Object;", "U", "Lkotlinx/coroutines/selects/d;", "select", "V", "", "wasClosed", "", "Q", "Lui/s;", "receive", "K", "Ljava/util/concurrent/locks/ReentrantLock;", "Lkotlinx/coroutines/internal/ReentrantLock;", "n", "Ljava/util/concurrent/locks/ReentrantLock;", "lock", "o", "Ljava/lang/Object;", "value", "M", "()Z", "isBufferAlwaysEmpty", "N", "isBufferEmpty", "s", "isBufferAlwaysFull", "u", "isBufferFull", "", "j", "()Ljava/lang/String;", "bufferDebugString", "Lkotlin/Function1;", "Lkotlinx/coroutines/internal/OnUndeliveredElement;", "onUndeliveredElement", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "kotlinx-coroutines-core"}, m15072k = 1, m15071mv = {1, 6, 0})
/* renamed from: ui.o */
/* loaded from: classes8.dex */
public class C13351o<E> extends AbstractC13323a<E> {

    /* renamed from: n */
    private final ReentrantLock f29910n = new ReentrantLock();

    /* renamed from: o */
    private Object f29911o = C13331b.f29880a;

    public C13351o(Function1<? super E, Unit> function1) {
        super(function1);
    }

    /* renamed from: a0 */
    private final C10106l0 m3885a0(Object obj) {
        Function1<E, Unit> function1;
        Object obj2 = this.f29911o;
        C10106l0 l0Var = null;
        if (!(obj2 == C13331b.f29880a || (function1 = this.f29887k) == null)) {
            l0Var = C10125x.m14200d(function1, obj2, null, 2, null);
        }
        this.f29911o = obj;
        return l0Var;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p372ui.AbstractC13323a
    /* renamed from: K */
    public boolean mo3889K(AbstractC13357s<? super E> sVar) {
        ReentrantLock reentrantLock = this.f29910n;
        reentrantLock.lock();
        try {
            return super.mo3889K(sVar);
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // p372ui.AbstractC13323a
    /* renamed from: M */
    protected final boolean mo3863M() {
        return false;
    }

    @Override // p372ui.AbstractC13323a
    /* renamed from: N */
    protected final boolean mo3862N() {
        boolean z;
        ReentrantLock reentrantLock = this.f29910n;
        reentrantLock.lock();
        try {
            if (this.f29911o == C13331b.f29880a) {
                z = true;
            } else {
                z = false;
            }
            return z;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Finally extract failed */
    @Override // p372ui.AbstractC13323a
    /* renamed from: Q */
    public void mo3888Q(boolean z) {
        ReentrantLock reentrantLock = this.f29910n;
        reentrantLock.lock();
        try {
            C10106l0 a0 = m3885a0(C13331b.f29880a);
            Unit unit = Unit.f22042a;
            reentrantLock.unlock();
            super.mo3888Q(z);
            if (a0 != null) {
                throw a0;
            }
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    @Override // p372ui.AbstractC13323a
    /* renamed from: U */
    protected Object mo3887U() {
        ReentrantLock reentrantLock = this.f29910n;
        reentrantLock.lock();
        try {
            Object obj = this.f29911o;
            C10087d0 d0Var = C13331b.f29880a;
            if (obj == d0Var) {
                Object l = m3931l();
                if (l == null) {
                    l = C13331b.f29883d;
                }
                return l;
            }
            this.f29911o = d0Var;
            Unit unit = Unit.f22042a;
            return obj;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // p372ui.AbstractC13323a
    /* renamed from: V */
    protected Object mo3886V(AbstractC10198d<?> dVar) {
        ReentrantLock reentrantLock = this.f29910n;
        reentrantLock.lock();
        try {
            Object obj = this.f29911o;
            C10087d0 d0Var = C13331b.f29880a;
            if (obj == d0Var) {
                Object l = m3931l();
                if (l == null) {
                    l = C13331b.f29883d;
                }
                return l;
            } else if (!dVar.mo14019s()) {
                return C10199e.m14012d();
            } else {
                Object obj2 = this.f29911o;
                this.f29911o = d0Var;
                Unit unit = Unit.f22042a;
                return obj2;
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // p372ui.AbstractC13332c
    /* renamed from: j */
    protected String mo3884j() {
        ReentrantLock reentrantLock = this.f29910n;
        reentrantLock.lock();
        try {
            return "(value=" + this.f29911o + ')';
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // p372ui.AbstractC13332c
    /* renamed from: s */
    protected final boolean mo3861s() {
        return false;
    }

    @Override // p372ui.AbstractC13332c
    /* renamed from: u */
    protected final boolean mo3860u() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p372ui.AbstractC13332c
    /* renamed from: y */
    public Object mo3882y(E e) {
        AbstractC13359u<E> C;
        ReentrantLock reentrantLock = this.f29910n;
        reentrantLock.lock();
        try {
            C13348l<?> l = m3931l();
            if (l != null) {
                return l;
            }
            if (this.f29911o == C13331b.f29880a) {
                do {
                    C = mo3937C();
                    if (C != null) {
                        if (C instanceof C13348l) {
                            return C;
                        }
                        C9971q.m14636d(C);
                    }
                } while (C.mo3864z(e, null) == null);
                Unit unit = Unit.f22042a;
                reentrantLock.unlock();
                C.mo3865l(e);
                return C.mo3866a();
            }
            C10106l0 a0 = m3885a0(e);
            if (a0 == null) {
                return C13331b.f29881b;
            }
            throw a0;
        } finally {
            reentrantLock.unlock();
        }
    }
}
