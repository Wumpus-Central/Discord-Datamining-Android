package p354ti;

import android.os.Handler;
import android.os.Looper;
import eg.C6884j;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC9973s;
import kotlin.jvm.internal.C9971q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.AbstractC10000a1;
import kotlinx.coroutines.C10075h2;
import kotlinx.coroutines.C10227x1;
import kotlinx.coroutines.C10230y0;
import kotlinx.coroutines.CancellableContinuation;

@Metadata(m15074d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B#\b\u0002\u0012\u0006\u0010\u001e\u001a\u00020\u001b\u0012\b\u0010!\u001a\u0004\u0018\u00010\u0014\u0012\u0006\u0010$\u001a\u00020\n¢\u0006\u0004\b+\u0010,B\u001d\b\u0016\u0012\u0006\u0010\u001e\u001a\u00020\u001b\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b+\u0010-J\u001c\u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00032\n\u0010\u0007\u001a\u00060\u0005j\u0002`\u0006H\u0002J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u001c\u0010\f\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00032\n\u0010\u0007\u001a\u00060\u0005j\u0002`\u0006H\u0016J\u001e\u0010\u0011\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\r2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\b0\u000fH\u0016J$\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\r2\n\u0010\u0007\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0015\u001a\u00020\u0014H\u0016J\u0013\u0010\u0018\u001a\u00020\n2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0096\u0002J\b\u0010\u001a\u001a\u00020\u0019H\u0016R\u0014\u0010\u001e\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010!\u001a\u0004\u0018\u00010\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010$\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0018\u0010%\u001a\u0004\u0018\u00010\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u001a\u0010*\u001a\u00020\u00008\u0016X\u0096\u0004¢\u0006\f\n\u0004\b'\u0010&\u001a\u0004\b(\u0010)¨\u0006."}, m15073d2 = {"Lti/d;", "Lti/e;", "Lkotlinx/coroutines/s0;", "Lkotlin/coroutines/CoroutineContext;", "context", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "", "O0", "", "I0", "G0", "", "timeMillis", "Lkotlinx/coroutines/CancellableContinuation;", "continuation", "t", "Lkotlinx/coroutines/a1;", "R", "", "toString", "", "other", "equals", "", "hashCode", "Landroid/os/Handler;", "m", "Landroid/os/Handler;", "handler", "n", "Ljava/lang/String;", "name", "o", "Z", "invokeImmediately", "_immediate", "Lti/d;", "p", "P0", "()Lti/d;", "immediate", "<init>", "(Landroid/os/Handler;Ljava/lang/String;Z)V", "(Landroid/os/Handler;Ljava/lang/String;)V", "kotlinx-coroutines-android"}, m15072k = 1, m15071mv = {1, 6, 0})
/* renamed from: ti.d */
/* loaded from: classes8.dex */
public final class C13138d extends AbstractC13141e {
    private volatile C13138d _immediate;

    /* renamed from: m */
    private final Handler f29437m;

    /* renamed from: n */
    private final String f29438n;

    /* renamed from: o */
    private final boolean f29439o;

    /* renamed from: p */
    private final C13138d f29440p;

    @Metadata(m15074d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m15073d2 = {"", "run", "()V", "<anonymous>"}, m15072k = 3, m15071mv = {1, 6, 0})
    /* renamed from: ti.d$a */
    /* loaded from: classes8.dex */
    public static final class RunnableC13139a implements Runnable {

        /* renamed from: k */
        final /* synthetic */ CancellableContinuation f29441k;

        /* renamed from: l */
        final /* synthetic */ C13138d f29442l;

        public RunnableC13139a(CancellableContinuation cancellableContinuation, C13138d dVar) {
            this.f29441k = cancellableContinuation;
            this.f29442l = dVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f29441k.mo14120v(this.f29442l, Unit.f22042a);
        }
    }

    @Metadata(m15074d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, m15073d2 = {"<anonymous>", "", "it", "", "invoke"}, m15072k = 3, m15071mv = {1, 6, 0}, m15069xi = 48)
    /* renamed from: ti.d$b */
    /* loaded from: classes8.dex */
    static final class C13140b extends AbstractC9973s implements Function1<Throwable, Unit> {

        /* renamed from: l */
        final /* synthetic */ Runnable f29444l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C13140b(Runnable runnable) {
            super(1);
            this.f29444l = runnable;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
            invoke2(th2);
            return Unit.f22042a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th2) {
            C13138d.this.f29437m.removeCallbacks(this.f29444l);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private C13138d(Handler handler, String str, boolean z) {
        super(null);
        C13138d dVar = null;
        this.f29437m = handler;
        this.f29438n = str;
        this.f29439o = z;
        this._immediate = z ? this : dVar;
        C13138d dVar2 = this._immediate;
        if (dVar2 == null) {
            dVar2 = new C13138d(handler, str, true);
            this._immediate = dVar2;
        }
        this.f29440p = dVar2;
    }

    /* renamed from: O0 */
    private final void m4541O0(CoroutineContext coroutineContext, Runnable runnable) {
        C10227x1.m13958c(coroutineContext, new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed"));
        C10230y0.m13946b().mo4546G0(coroutineContext, runnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Q0 */
    public static final void m4539Q0(C13138d dVar, Runnable runnable) {
        dVar.f29437m.removeCallbacks(runnable);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    /* renamed from: G0 */
    public void mo4546G0(CoroutineContext coroutineContext, Runnable runnable) {
        if (!this.f29437m.post(runnable)) {
            m4541O0(coroutineContext, runnable);
        }
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    /* renamed from: I0 */
    public boolean mo4545I0(CoroutineContext coroutineContext) {
        return !this.f29439o || !C9971q.m14638b(Looper.myLooper(), this.f29437m.getLooper());
    }

    /* renamed from: P0 */
    public C13138d mo4544K0() {
        return this.f29440p;
    }

    @Override // p354ti.AbstractC13141e, kotlinx.coroutines.AbstractC10169s0
    /* renamed from: R */
    public AbstractC10000a1 mo4537R(long j, final Runnable runnable, CoroutineContext coroutineContext) {
        long h;
        Handler handler = this.f29437m;
        h = C6884j.m23956h(j, 4611686018427387903L);
        if (handler.postDelayed(runnable, h)) {
            return new AbstractC10000a1() { // from class: ti.c
                @Override // kotlinx.coroutines.AbstractC10000a1
                public final void dispose() {
                    C13138d.m4539Q0(C13138d.this, runnable);
                }
            };
        }
        m4541O0(coroutineContext, runnable);
        return C10075h2.f22261k;
    }

    public boolean equals(Object obj) {
        return (obj instanceof C13138d) && ((C13138d) obj).f29437m == this.f29437m;
    }

    public int hashCode() {
        return System.identityHashCode(this.f29437m);
    }

    @Override // kotlinx.coroutines.AbstractC10169s0
    /* renamed from: t */
    public void mo4538t(long j, CancellableContinuation<? super Unit> cancellableContinuation) {
        long h;
        RunnableC13139a aVar = new RunnableC13139a(cancellableContinuation, this);
        Handler handler = this.f29437m;
        h = C6884j.m23956h(j, 4611686018427387903L);
        if (handler.postDelayed(aVar, h)) {
            cancellableContinuation.mo14131k(new C13140b(aVar));
        } else {
            m4541O0(cancellableContinuation.getContext(), aVar);
        }
    }

    @Override // kotlinx.coroutines.AbstractC10034f2, kotlinx.coroutines.CoroutineDispatcher
    public String toString() {
        String L0 = m14434L0();
        if (L0 != null) {
            return L0;
        }
        String str = this.f29438n;
        if (str == null) {
            str = this.f29437m.toString();
        }
        if (!this.f29439o) {
            return str;
        }
        return str + ".immediate";
    }

    public /* synthetic */ C13138d(Handler handler, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(handler, (i & 2) != 0 ? null : str);
    }

    public C13138d(Handler handler, String str) {
        this(handler, str, false);
    }
}
