package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.C9971q;
import kotlinx.coroutines.internal.C10092g;
import kotlinx.coroutines.internal.C10095h0;
import kotlinx.coroutines.scheduling.AbstractC10184i;
import kotlinx.coroutines.scheduling.AbstractRunnableC10183h;
import nf.C11067f;
import nf.C11090s;
import nf.C11093t;

@Metadata(m15074d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b \u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\u00060\u0002j\u0002`\u0003B\u000f\u0012\u0006\u0010\u0019\u001a\u00020\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0011\u0010\u0005\u001a\u0004\u0018\u00010\u0004H ¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\u000b\u001a\u00020\n2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00042\u0006\u0010\t\u001a\u00020\bH\u0010¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000e\u001a\u00028\u0001\"\u0004\b\u0001\u0010\u00012\b\u0010\r\u001a\u0004\u0018\u00010\u0004H\u0010¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0010\u001a\u0004\u0018\u00010\b2\b\u0010\r\u001a\u0004\u0018\u00010\u0004H\u0010¢\u0006\u0004\b\u0010\u0010\u0011J\u0006\u0010\u0012\u001a\u00020\nJ\u001a\u0010\u0015\u001a\u00020\n2\b\u0010\u0013\u001a\u0004\u0018\u00010\b2\b\u0010\u0014\u001a\u0004\u0018\u00010\bR\u0016\u0010\u0019\u001a\u00020\u00168\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\u001a8 X \u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c¨\u0006 "}, m15073d2 = {"Lkotlinx/coroutines/w0;", "T", "Lkotlinx/coroutines/scheduling/h;", "Lkotlinx/coroutines/SchedulerTask;", "", "h", "()Ljava/lang/Object;", "takenState", "", "cause", "", "a", "(Ljava/lang/Object;Ljava/lang/Throwable;)V", "state", "e", "(Ljava/lang/Object;)Ljava/lang/Object;", "d", "(Ljava/lang/Object;)Ljava/lang/Throwable;", "run", "exception", "finallyException", "f", "", "m", "I", "resumeMode", "Lkotlin/coroutines/Continuation;", "c", "()Lkotlin/coroutines/Continuation;", "delegate", "<init>", "(I)V", "kotlinx-coroutines-core"}, m15072k = 1, m15071mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.w0 */
/* loaded from: classes8.dex */
public abstract class AbstractC10222w0<T> extends AbstractRunnableC10183h {

    /* renamed from: m */
    public int f22472m;

    public AbstractC10222w0(int i) {
        this.f22472m = i;
    }

    /* renamed from: a */
    public void mo13977a(Object obj, Throwable th2) {
    }

    /* renamed from: c */
    public abstract Continuation<T> mo13976c();

    /* renamed from: d */
    public Throwable mo13975d(Object obj) {
        C10234z zVar = obj instanceof C10234z ? (C10234z) obj : null;
        if (zVar != null) {
            return zVar.f22488a;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: e */
    public <T> T mo13974e(Object obj) {
        return obj;
    }

    /* renamed from: f */
    public final void m13973f(Throwable th2, Throwable th3) {
        if (th2 != null || th3 != null) {
            if (!(th2 == null || th3 == null)) {
                C11067f.m10981a(th2, th3);
            }
            if (th2 == null) {
                th2 = th3;
            }
            C9971q.m14636d(th2);
            C10077i0.m14350a(mo13976c().getContext(), new C10145m0("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th2));
        }
    }

    /* renamed from: h */
    public abstract Object mo13972h();

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        C10224w2<?> w2Var;
        Job job;
        Object obj2;
        AbstractC10184i iVar = this.f22413l;
        try {
            C10092g gVar = (C10092g) mo13976c();
            Continuation<T> continuation = gVar.f22281o;
            Object obj3 = gVar.f22283q;
            CoroutineContext context = continuation.getContext();
            Object c = C10095h0.m14301c(context, obj3);
            if (c != C10095h0.f22286a) {
                w2Var = C10025f0.m14456g(continuation, context, c);
            } else {
                w2Var = null;
            }
            CoroutineContext context2 = continuation.getContext();
            Object h = mo13972h();
            Throwable d = mo13975d(h);
            if (d != null || !C10226x0.m13964b(this.f22472m)) {
                job = null;
            } else {
                job = (Job) context2.mo3484i(Job.f22120e);
            }
            if (job != null && !job.mo3873b()) {
                CancellationException C = job.mo14559C();
                mo13977a(h, C);
                C11090s.C11091a aVar = C11090s.f24606l;
                continuation.resumeWith(C11090s.m10940b(C11093t.m10931a(C)));
            } else if (d != null) {
                C11090s.C11091a aVar2 = C11090s.f24606l;
                continuation.resumeWith(C11090s.m10940b(C11093t.m10931a(d)));
            } else {
                C11090s.C11091a aVar3 = C11090s.f24606l;
                continuation.resumeWith(C11090s.m10940b(mo13974e(h)));
            }
            Unit unit = Unit.f22042a;
            if (w2Var == null || w2Var.m13967V0()) {
                C10095h0.m14303a(context, c);
            }
            try {
                iVar.mo14054a();
                obj2 = C11090s.m10940b(Unit.f22042a);
            } catch (Throwable th2) {
                C11090s.C11091a aVar4 = C11090s.f24606l;
                obj2 = C11090s.m10940b(C11093t.m10931a(th2));
            }
            m13973f(null, C11090s.m10937e(obj2));
        } catch (Throwable th3) {
            try {
                C11090s.C11091a aVar5 = C11090s.f24606l;
                iVar.mo14054a();
                obj = C11090s.m10940b(Unit.f22042a);
            } catch (Throwable th4) {
                C11090s.C11091a aVar6 = C11090s.f24606l;
                obj = C11090s.m10940b(C11093t.m10931a(th4));
            }
            m13973f(th3, C11090s.m10937e(obj));
        }
    }
}
