package kotlinx.coroutines;

import com.facebook.react.modules.appstate.AppStateModule;
import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

@Metadata(m15074d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\b'\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\u00020\u00022\u00020\u00032\b\u0012\u0004\u0012\u00028\u00000\u00042\u00020\u0005B\u001f\u0012\u0006\u00102\u001a\u00020%\u0012\u0006\u00103\u001a\u00020\f\u0012\u0006\u00104\u001a\u00020\f¢\u0006\u0004\b5\u00106J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0014J\b\u0010\u0010\u001a\u00020\u000fH\u0014J\u0012\u0010\u0013\u001a\u00020\u00072\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0004J\u001e\u0010\u0016\u001a\u00020\u00072\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\tJ\u0012\u0010\u0017\u001a\u00020\u00072\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0014J\u0017\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\nH\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u000fH\u0010¢\u0006\u0004\b\u001b\u0010\u001cJJ\u0010#\u001a\u00020\u0007\"\u0004\b\u0001\u0010\u001d2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00028\u00012\"\u0010\"\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00110!ø\u0001\u0000¢\u0006\u0004\b#\u0010$R\u001d\u0010,\u001a\u00020%8\u0006¢\u0006\u0012\n\u0004\b&\u0010'\u0012\u0004\b*\u0010+\u001a\u0004\b(\u0010)R\u0014\u0010.\u001a\u00020%8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b-\u0010)R\u0014\u00101\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b/\u00100\u0082\u0002\u0004\n\u0002\b\u0019¨\u00067"}, m15073d2 = {"Lkotlinx/coroutines/a;", "T", "Lkotlinx/coroutines/b2;", "Lkotlinx/coroutines/Job;", "Lkotlin/coroutines/Continuation;", "Lkotlinx/coroutines/CoroutineScope;", "value", "", "S0", "(Ljava/lang/Object;)V", "", "cause", "", "handled", "R0", "", "M", "", "state", "v0", "Lnf/s;", "result", "resumeWith", "Q0", "exception", "i0", "(Ljava/lang/Throwable;)V", "q0", "()Ljava/lang/String;", "R", "Lkotlinx/coroutines/l0;", ViewProps.START, "receiver", "Lkotlin/Function2;", "block", "T0", "(Lkotlinx/coroutines/l0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V", "Lkotlin/coroutines/CoroutineContext;", "l", "Lkotlin/coroutines/CoroutineContext;", "getContext", "()Lkotlin/coroutines/CoroutineContext;", "getContext$annotations", "()V", "context", "getCoroutineContext", "coroutineContext", "b", "()Z", "isActive", "parentContext", "initParentJob", AppStateModule.APP_STATE_ACTIVE, "<init>", "(Lkotlin/coroutines/CoroutineContext;ZZ)V", "kotlinx-coroutines-core"}, m15072k = 1, m15071mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.a */
/* loaded from: classes8.dex */
public abstract class AbstractC9998a<T> extends C10005b2 implements Continuation<T>, CoroutineScope {

    /* renamed from: l */
    private final CoroutineContext f22122l;

    public AbstractC9998a(CoroutineContext coroutineContext, boolean z, boolean z2) {
        super(z2);
        if (z) {
            m14523k0((Job) coroutineContext.mo3484i(Job.f22120e));
        }
        this.f22122l = coroutineContext.mo3485f0(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.coroutines.C10005b2
    /* renamed from: M */
    public String mo14542M() {
        return C10149n0.m14165a(this) + " was cancelled";
    }

    /* renamed from: Q0 */
    protected void mo13968Q0(Object obj) {
        mo13982F(obj);
    }

    /* renamed from: R0 */
    protected void mo3876R0(Throwable th2, boolean z) {
    }

    /* renamed from: S0 */
    protected void mo3875S0(T t) {
    }

    /* renamed from: T0 */
    public final <R> void m14565T0(EnumC10140l0 l0Var, R r, Function2<? super R, ? super Continuation<? super T>, ? extends Object> function2) {
        l0Var.m14171b(function2, r, this);
    }

    @Override // kotlinx.coroutines.C10005b2, kotlinx.coroutines.Job
    /* renamed from: b */
    public boolean mo3873b() {
        return super.mo3873b();
    }

    @Override // kotlin.coroutines.Continuation
    public final CoroutineContext getContext() {
        return this.f22122l;
    }

    @Override // kotlinx.coroutines.CoroutineScope
    public CoroutineContext getCoroutineContext() {
        return this.f22122l;
    }

    @Override // kotlinx.coroutines.C10005b2
    /* renamed from: i0 */
    public final void mo14524i0(Throwable th2) {
        C10077i0.m14350a(this.f22122l, th2);
    }

    @Override // kotlinx.coroutines.C10005b2
    /* renamed from: q0 */
    public String mo13988q0() {
        String b = C10025f0.m14461b(this.f22122l);
        if (b == null) {
            return super.mo13988q0();
        }
        return '\"' + b + "\":" + super.mo13988q0();
    }

    @Override // kotlin.coroutines.Continuation
    public final void resumeWith(Object obj) {
        Object o0 = m14520o0(C10015d0.m14484d(obj, null, 1, null));
        if (o0 != C10013c2.f22142b) {
            mo13968Q0(o0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.coroutines.C10005b2
    /* renamed from: v0 */
    protected final void mo14513v0(Object obj) {
        if (obj instanceof C10234z) {
            C10234z zVar = (C10234z) obj;
            mo3876R0(zVar.f22488a, zVar.m13943a());
            return;
        }
        mo3875S0(obj);
    }
}
