package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.AbstractC9931e;
import kotlin.coroutines.jvm.internal.AbstractC9938k;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C9971q;
import kotlinx.coroutines.C10129j;
import kotlinx.coroutines.C10227x1;
import kotlinx.coroutines.C10230y0;
import kotlinx.coroutines.CoroutineScope;
import nf.C11093t;
import tf.C13080d;

@Metadata(m15074d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u000f\u001a\u00020\n\u0012\u0006\u0010\u0015\u001a\u00020\u0010¢\u0006\u0004\b\u0016\u0010\u0017J\u0006\u0010\u0004\u001a\u00020\u0003J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016R\u001a\u0010\u000f\u001a\u00020\n8\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0015\u001a\u00020\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0018"}, m15073d2 = {"Landroidx/lifecycle/LifecycleCoroutineScopeImpl;", "Landroidx/lifecycle/g;", "Landroidx/lifecycle/j;", "", "b", "Landroidx/lifecycle/LifecycleOwner;", "source", "Landroidx/lifecycle/Lifecycle$b;", "event", "c", "Landroidx/lifecycle/Lifecycle;", "k", "Landroidx/lifecycle/Lifecycle;", "a", "()Landroidx/lifecycle/Lifecycle;", "lifecycle", "Lkotlin/coroutines/CoroutineContext;", "l", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "<init>", "(Landroidx/lifecycle/Lifecycle;Lkotlin/coroutines/CoroutineContext;)V", "lifecycle-runtime-ktx_release"}, m15072k = 1, m15071mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class LifecycleCoroutineScopeImpl extends AbstractC3034g implements AbstractC3038j {

    /* renamed from: k */
    private final Lifecycle f4368k;

    /* renamed from: l */
    private final CoroutineContext f4369l;

    @Metadata(m15074d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m15073d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, m15072k = 3, m15071mv = {1, 6, 0})
    @AbstractC9931e(m14702c = "androidx.lifecycle.LifecycleCoroutineScopeImpl$register$1", m14701f = "Lifecycle.kt", m14700l = {}, m14699m = "invokeSuspend")
    /* renamed from: androidx.lifecycle.LifecycleCoroutineScopeImpl$a */
    /* loaded from: classes.dex */
    static final class C3011a extends AbstractC9938k implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* renamed from: k */
        int f4370k;

        /* renamed from: l */
        private /* synthetic */ Object f4371l;

        C3011a(Continuation<? super C3011a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC9927a
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C3011a aVar = new C3011a(continuation);
            aVar.f4371l = obj;
            return aVar;
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C3011a) create(coroutineScope, continuation)).invokeSuspend(Unit.f22042a);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC9927a
        public final Object invokeSuspend(Object obj) {
            C13080d.m4646d();
            if (this.f4370k == 0) {
                C11093t.m10930b(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.f4371l;
                if (LifecycleCoroutineScopeImpl.this.m35846a().mo35843b().compareTo(Lifecycle.State.INITIALIZED) >= 0) {
                    LifecycleCoroutineScopeImpl.this.m35846a().mo35844a(LifecycleCoroutineScopeImpl.this);
                } else {
                    C10227x1.m13957d(coroutineScope.getCoroutineContext(), null, 1, null);
                }
                return Unit.f22042a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public LifecycleCoroutineScopeImpl(Lifecycle lifecycle, CoroutineContext coroutineContext) {
        C9971q.m14633g(lifecycle, "lifecycle");
        C9971q.m14633g(coroutineContext, "coroutineContext");
        this.f4368k = lifecycle;
        this.f4369l = coroutineContext;
        if (m35846a().mo35843b() == Lifecycle.State.DESTROYED) {
            C10227x1.m13957d(getCoroutineContext(), null, 1, null);
        }
    }

    /* renamed from: a */
    public Lifecycle m35846a() {
        return this.f4368k;
    }

    /* renamed from: b */
    public final void m35845b() {
        C10129j.m14195d(this, C10230y0.m13945c().mo4544K0(), null, new C3011a(null), 2, null);
    }

    @Override // androidx.lifecycle.AbstractC3038j
    /* renamed from: c */
    public void mo34707c(LifecycleOwner source, Lifecycle.EnumC3010b event) {
        C9971q.m14633g(source, "source");
        C9971q.m14633g(event, "event");
        if (m35846a().mo35843b().compareTo(Lifecycle.State.DESTROYED) <= 0) {
            m35846a().mo35842c(this);
            C10227x1.m13957d(getCoroutineContext(), null, 1, null);
        }
    }

    @Override // kotlinx.coroutines.CoroutineScope
    public CoroutineContext getCoroutineContext() {
        return this.f4369l;
    }
}
