package kotlinx.coroutines.flow;

import androidx.concurrent.futures.C2113b;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.C9933g;
import kotlin.jvm.internal.C9971q;
import kotlinx.coroutines.C10156p;
import kotlinx.coroutines.internal.C10087d0;
import nf.C11090s;
import tf.C13076c;
import tf.C13080d;
import vi.AbstractC13513c;
import vi.C13512b;

@Metadata(m15074d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\n\b\u0002\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001B\u0007¢\u0006\u0004\b\u0012\u0010\rJ\u001b\u0010\u0005\u001a\u00020\u00042\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J)\u0010\n\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b0\u00072\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\f\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\u0013\u0010\u0010\u001a\u00020\tH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0013"}, m15073d2 = {"Lkotlinx/coroutines/flow/r;", "Lvi/c;", "Lkotlinx/coroutines/flow/p;", "flow", "", "c", "(Lkotlinx/coroutines/flow/p;)Z", "", "Lkotlin/coroutines/Continuation;", "", "e", "(Lkotlinx/coroutines/flow/p;)[Lkotlin/coroutines/Continuation;", "f", "()V", "g", "()Z", "d", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<init>", "kotlinx-coroutines-core"}, m15072k = 1, m15071mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.flow.r */
/* loaded from: classes8.dex */
final class C10063r extends AbstractC13513c<C10060p<?>> {

    /* renamed from: a */
    static final /* synthetic */ AtomicReferenceFieldUpdater f22247a = AtomicReferenceFieldUpdater.newUpdater(C10063r.class, Object.class, "_state");
    volatile /* synthetic */ Object _state = null;

    /* renamed from: c */
    public boolean mo3502a(C10060p<?> pVar) {
        C10087d0 d0Var;
        if (this._state != null) {
            return false;
        }
        d0Var = C10062q.f22245a;
        this._state = d0Var;
        return true;
    }

    /* renamed from: d */
    public final Object m14359d(Continuation<? super Unit> continuation) {
        Continuation c;
        C10087d0 d0Var;
        Object d;
        Object d2;
        c = C13076c.m4647c(continuation);
        C10156p pVar = new C10156p(c, 1);
        pVar.m14150C();
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f22247a;
        d0Var = C10062q.f22245a;
        if (!C2113b.m38965a(atomicReferenceFieldUpdater, this, d0Var, pVar)) {
            C11090s.C11091a aVar = C11090s.f24606l;
            pVar.resumeWith(C11090s.m10940b(Unit.f22042a));
        }
        Object y = pVar.m14117y();
        d = C13080d.m4646d();
        if (y == d) {
            C9933g.m14691c(continuation);
        }
        d2 = C13080d.m4646d();
        if (y == d2) {
            return y;
        }
        return Unit.f22042a;
    }

    /* renamed from: e */
    public Continuation<Unit>[] mo3501b(C10060p<?> pVar) {
        this._state = null;
        return C13512b.f30197a;
    }

    /* renamed from: f */
    public final void m14357f() {
        C10087d0 d0Var;
        C10087d0 d0Var2;
        C10087d0 d0Var3;
        C10087d0 d0Var4;
        while (true) {
            Object obj = this._state;
            if (obj != null) {
                d0Var = C10062q.f22246b;
                if (obj != d0Var) {
                    d0Var2 = C10062q.f22245a;
                    if (obj == d0Var2) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f22247a;
                        d0Var3 = C10062q.f22246b;
                        if (C2113b.m38965a(atomicReferenceFieldUpdater, this, obj, d0Var3)) {
                            return;
                        }
                    } else {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f22247a;
                        d0Var4 = C10062q.f22245a;
                        if (C2113b.m38965a(atomicReferenceFieldUpdater2, this, obj, d0Var4)) {
                            C11090s.C11091a aVar = C11090s.f24606l;
                            ((C10156p) obj).resumeWith(C11090s.m10940b(Unit.f22042a));
                            return;
                        }
                    }
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: g */
    public final boolean m14356g() {
        C10087d0 d0Var;
        C10087d0 d0Var2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f22247a;
        d0Var = C10062q.f22245a;
        Object andSet = atomicReferenceFieldUpdater.getAndSet(this, d0Var);
        C9971q.m14636d(andSet);
        d0Var2 = C10062q.f22246b;
        if (andSet == d0Var2) {
            return true;
        }
        return false;
    }
}
