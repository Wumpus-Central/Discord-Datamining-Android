package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.AbstractC9931e;
import kotlin.coroutines.jvm.internal.AbstractC9938k;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.AbstractC10034f2;
import kotlinx.coroutines.C10129j;
import kotlinx.coroutines.C10230y0;
import kotlinx.coroutines.CoroutineScope;
import nf.C11093t;
import tf.C13080d;

@Metadata(m15074d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m15073d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, m15072k = 3, m15071mv = {1, 6, 0})
@AbstractC9931e(m14702c = "androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3", m14701f = "RepeatOnLifecycle.kt", m14700l = {84}, m14699m = "invokeSuspend")
/* loaded from: classes.dex */
final class RepeatOnLifecycleKt$repeatOnLifecycle$3 extends AbstractC9938k implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* renamed from: k */
    int f4417k;

    /* renamed from: l */
    private /* synthetic */ Object f4418l;

    /* renamed from: m */
    final /* synthetic */ Lifecycle f4419m;

    /* renamed from: n */
    final /* synthetic */ Lifecycle.State f4420n;

    /* renamed from: o */
    final /* synthetic */ Function2<CoroutineScope, Continuation<? super Unit>, Object> f4421o;

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(m15074d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m15073d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, m15072k = 3, m15071mv = {1, 6, 0})
    @AbstractC9931e(m14702c = "androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1", m14701f = "RepeatOnLifecycle.kt", m14700l = {166}, m14699m = "invokeSuspend")
    /* renamed from: androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1 */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends AbstractC9938k implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* renamed from: k */
        Object f4422k;

        /* renamed from: l */
        Object f4423l;

        /* renamed from: m */
        Object f4424m;

        /* renamed from: n */
        Object f4425n;

        /* renamed from: o */
        Object f4426o;

        /* renamed from: p */
        Object f4427p;

        /* renamed from: q */
        int f4428q;

        /* renamed from: r */
        final /* synthetic */ Lifecycle f4429r;

        /* renamed from: s */
        final /* synthetic */ Lifecycle.State f4430s;

        /* renamed from: t */
        final /* synthetic */ CoroutineScope f4431t;

        /* renamed from: u */
        final /* synthetic */ Function2<CoroutineScope, Continuation<? super Unit>, Object> f4432u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(Lifecycle lifecycle, Lifecycle.State state, CoroutineScope coroutineScope, Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.f4429r = lifecycle;
            this.f4430s = state;
            this.f4431t = coroutineScope;
            this.f4432u = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC9927a
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.f4429r, this.f4430s, this.f4431t, this.f4432u, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.f22042a);
        }

        /* JADX WARN: Removed duplicated region for block: B:33:0x00c5  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x00cf  */
        /* JADX WARN: Type inference failed for: r10v0, types: [androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1, T] */
        /* JADX WARN: Unknown variable types count: 1 */
        @Override // kotlin.coroutines.jvm.internal.AbstractC9927a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r17) {
            /*
                Method dump skipped, instructions count: 213
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public RepeatOnLifecycleKt$repeatOnLifecycle$3(Lifecycle lifecycle, Lifecycle.State state, Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super RepeatOnLifecycleKt$repeatOnLifecycle$3> continuation) {
        super(2, continuation);
        this.f4419m = lifecycle;
        this.f4420n = state;
        this.f4421o = function2;
    }

    @Override // kotlin.coroutines.jvm.internal.AbstractC9927a
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        RepeatOnLifecycleKt$repeatOnLifecycle$3 repeatOnLifecycleKt$repeatOnLifecycle$3 = new RepeatOnLifecycleKt$repeatOnLifecycle$3(this.f4419m, this.f4420n, this.f4421o, continuation);
        repeatOnLifecycleKt$repeatOnLifecycle$3.f4418l = obj;
        return repeatOnLifecycleKt$repeatOnLifecycle$3;
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((RepeatOnLifecycleKt$repeatOnLifecycle$3) create(coroutineScope, continuation)).invokeSuspend(Unit.f22042a);
    }

    @Override // kotlin.coroutines.jvm.internal.AbstractC9927a
    public final Object invokeSuspend(Object obj) {
        Object d;
        d = C13080d.m4646d();
        int i = this.f4417k;
        if (i == 0) {
            C11093t.m10930b(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.f4418l;
            AbstractC10034f2 K0 = C10230y0.m13945c().mo4544K0();
            AnonymousClass1 r1 = new AnonymousClass1(this.f4419m, this.f4420n, coroutineScope, this.f4421o, null);
            this.f4417k = 1;
            if (C10129j.m14192g(K0, r1, this) == d) {
                return d;
            }
        } else if (i == 1) {
            C11093t.m10930b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return Unit.f22042a;
    }
}
