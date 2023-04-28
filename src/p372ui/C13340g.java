package p372ui;

import com.facebook.react.modules.appstate.AppStateModule;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.AbstractC9998a;
import kotlinx.coroutines.C10005b2;
import kotlinx.coroutines.C10215u1;
import kotlinx.coroutines.selects.AbstractC10197c;
import tf.C13080d;

@Metadata(m15074d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0012\u0004\u0012\u00028\u00000\u0004B-\u0012\u0006\u0010%\u001a\u00020$\u0012\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0010&\u001a\u00020\u0007\u0012\u0006\u0010'\u001a\u00020\u0007¢\u0006\u0004\b(\u0010)J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0096\u0001J\u001f\u0010\u000b\u001a\u00020\u00032\u0014\u0010\n\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u00020\u00030\tH\u0097\u0001J\"\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\fH\u0096Aø\u0001\u0000ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00028\u0000H\u0096Aø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J'\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00030\f2\u0006\u0010\u000f\u001a\u00028\u0000H\u0096\u0001ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0016\u0010\u0016\u001a\u00020\u00032\u000e\u0010\u0006\u001a\n\u0018\u00010\u0014j\u0004\u0018\u0001`\u0015J\u0010\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016R \u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001f\u001a\u00020\u00078\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR#\u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\f0 8\u0016X\u0096\u0005ø\u0001\u0000¢\u0006\u0006\u001a\u0004\b!\u0010\"\u0082\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006*"}, m15073d2 = {"Lui/g;", "E", "Lkotlinx/coroutines/a;", "", "Lui/f;", "", "cause", "", "t", "Lkotlin/Function1;", "handler", "c", "Lui/i;", "f", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "element", "w", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "d", "(Ljava/lang/Object;)Ljava/lang/Object;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "h", "J", "m", "Lui/f;", "U0", "()Lui/f;", "_channel", "x", "()Z", "isClosedForSend", "Lkotlinx/coroutines/selects/c;", "e", "()Lkotlinx/coroutines/selects/c;", "onReceiveCatching", "Lkotlin/coroutines/CoroutineContext;", "parentContext", "initParentJob", AppStateModule.APP_STATE_ACTIVE, "<init>", "(Lkotlin/coroutines/CoroutineContext;Lui/f;ZZ)V", "kotlinx-coroutines-core"}, m15072k = 1, m15071mv = {1, 6, 0})
/* renamed from: ui.g */
/* loaded from: classes8.dex */
public class C13340g<E> extends AbstractC9998a<Unit> implements AbstractC13338f<E> {

    /* renamed from: m */
    private final AbstractC13338f<E> f29904m;

    public C13340g(CoroutineContext coroutineContext, AbstractC13338f<E> fVar, boolean z, boolean z2) {
        super(coroutineContext, z, z2);
        this.f29904m = fVar;
    }

    @Override // kotlinx.coroutines.C10005b2
    /* renamed from: J */
    public void mo3913J(Throwable th2) {
        CancellationException J0 = C10005b2.m14547J0(this, th2, null, 1, null);
        this.f29904m.mo3867h(J0);
        m14552G(J0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: U0 */
    public final AbstractC13338f<E> m3912U0() {
        return this.f29904m;
    }

    @Override // p372ui.AbstractC13362x
    /* renamed from: c */
    public void mo3859c(Function1<? super Throwable, Unit> function1) {
        this.f29904m.mo3859c(function1);
    }

    @Override // p372ui.AbstractC13362x
    /* renamed from: d */
    public Object mo3858d(E e) {
        return this.f29904m.mo3858d(e);
    }

    @Override // p372ui.AbstractC13358t
    /* renamed from: e */
    public AbstractC10197c<C13342i<E>> mo3869e() {
        return this.f29904m.mo3869e();
    }

    @Override // p372ui.AbstractC13358t
    /* renamed from: f */
    public Object mo3868f(Continuation<? super C13342i<? extends E>> continuation) {
        Object f = this.f29904m.mo3868f(continuation);
        C13080d.m4646d();
        return f;
    }

    @Override // kotlinx.coroutines.C10005b2, kotlinx.coroutines.Job
    /* renamed from: h */
    public final void mo3911h(CancellationException cancellationException) {
        if (!m14522l0()) {
            if (cancellationException == null) {
                cancellationException = new C10215u1(mo14542M(), null, this);
            }
            mo3913J(cancellationException);
        }
    }

    @Override // p372ui.AbstractC13362x
    /* renamed from: t */
    public boolean mo3857t(Throwable th2) {
        return this.f29904m.mo3857t(th2);
    }

    @Override // p372ui.AbstractC13362x
    /* renamed from: w */
    public Object mo3856w(E e, Continuation<? super Unit> continuation) {
        return this.f29904m.mo3856w(e, continuation);
    }

    @Override // p372ui.AbstractC13362x
    /* renamed from: x */
    public boolean mo3855x() {
        return this.f29904m.mo3855x();
    }
}
