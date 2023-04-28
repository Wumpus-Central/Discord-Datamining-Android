package p372ui;

import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.AbstractC9930d;
import kotlin.coroutines.jvm.internal.AbstractC9931e;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC9973s;
import kotlinx.coroutines.C10025f0;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.EnumC10140l0;
import kotlinx.coroutines.channels.ProducerScope;
import nf.C11090s;
import p339sf.C12893f;

@Metadata(m15074d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a+\u0010\u0004\u001a\u00020\u0002*\u0006\u0012\u0002\b\u00030\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001ab\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f\"\u0004\b\u0000\u0010\u0006*\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2*\b\u0001\u0010\u0003\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\fH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0096\u0001\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f\"\u0004\b\u0000\u0010\u0006*\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u00142\u001e\b\u0002\u0010\u0019\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0017\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0016j\u0004\u0018\u0001`\u00182*\b\u0001\u0010\u0003\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\fH\u0000ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001c"}, m15073d2 = {"Lkotlinx/coroutines/channels/ProducerScope;", "Lkotlin/Function0;", "", "block", "a", "(Lkotlinx/coroutines/channels/ProducerScope;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "E", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/coroutines/CoroutineContext;", "context", "", "capacity", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "Lui/t;", "b", "(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;ILkotlin/jvm/functions/Function2;)Lui/t;", "Lui/e;", "onBufferOverflow", "Lkotlinx/coroutines/l0;", ViewProps.START, "Lkotlin/Function1;", "", "Lkotlinx/coroutines/CompletionHandler;", "onCompletion", "c", "(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;ILui/e;Lkotlinx/coroutines/l0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)Lui/t;", "kotlinx-coroutines-core"}, m15072k = 2, m15071mv = {1, 6, 0})
/* renamed from: ui.q */
/* loaded from: classes8.dex */
public final class C13353q {

    @Metadata(m15072k = 3, m15071mv = {1, 6, 0}, m15069xi = 48)
    @AbstractC9931e(m14702c = "kotlinx.coroutines.channels.ProduceKt", m14701f = "Produce.kt", m14700l = {153}, m14699m = "awaitClose")
    /* renamed from: ui.q$a */
    /* loaded from: classes8.dex */
    public static final class C13354a extends AbstractC9930d {

        /* renamed from: k */
        Object f29912k;

        /* renamed from: l */
        Object f29913l;

        /* renamed from: m */
        /* synthetic */ Object f29914m;

        /* renamed from: n */
        int f29915n;

        C13354a(Continuation<? super C13354a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC9927a
        public final Object invokeSuspend(Object obj) {
            this.f29914m = obj;
            this.f29915n |= Integer.MIN_VALUE;
            return C13353q.m3881a(null, null, this);
        }
    }

    @Metadata(m15074d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, m15073d2 = {"<anonymous>", "", "it", "", "invoke"}, m15072k = 3, m15071mv = {1, 6, 0}, m15069xi = 48)
    /* renamed from: ui.q$b */
    /* loaded from: classes8.dex */
    public static final class C13355b extends AbstractC9973s implements Function1<Throwable, Unit> {

        /* renamed from: k */
        final /* synthetic */ CancellableContinuation<Unit> f29916k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C13355b(CancellableContinuation<? super Unit> cancellableContinuation) {
            super(1);
            this.f29916k = cancellableContinuation;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
            invoke2(th2);
            return Unit.f22042a;
        }

        /* renamed from: invoke */
        public final void invoke2(Throwable th2) {
            CancellableContinuation<Unit> cancellableContinuation = this.f29916k;
            C11090s.C11091a aVar = C11090s.f24606l;
            cancellableContinuation.resumeWith(C11090s.m10940b(Unit.f22042a));
        }
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003c  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object m3881a(kotlinx.coroutines.channels.ProducerScope<?> r4, kotlin.jvm.functions.Function0<kotlin.Unit> r5, kotlin.coroutines.Continuation<? super kotlin.Unit> r6) {
        /*
            boolean r0 = r6 instanceof p372ui.C13353q.C13354a
            if (r0 == 0) goto L_0x0013
            r0 = r6
            ui.q$a r0 = (p372ui.C13353q.C13354a) r0
            int r1 = r0.f29915n
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f29915n = r1
            goto L_0x0018
        L_0x0013:
            ui.q$a r0 = new ui.q$a
            r0.<init>(r6)
        L_0x0018:
            java.lang.Object r6 = r0.f29914m
            java.lang.Object r1 = tf.C13075b.m4650d()
            int r2 = r0.f29915n
            r3 = 1
            if (r2 == 0) goto L_0x003c
            if (r2 != r3) goto L_0x0034
            java.lang.Object r4 = r0.f29913l
            r5 = r4
            kotlin.jvm.functions.Function0 r5 = (kotlin.jvm.functions.Function0) r5
            java.lang.Object r4 = r0.f29912k
            kotlinx.coroutines.channels.ProducerScope r4 = (kotlinx.coroutines.channels.ProducerScope) r4
            nf.C11093t.m10930b(r6)     // Catch: all -> 0x0032
            goto L_0x007a
        L_0x0032:
            r4 = move-exception
            goto L_0x0080
        L_0x0034:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x003c:
            nf.C11093t.m10930b(r6)
            kotlin.coroutines.CoroutineContext r6 = r0.getContext()
            kotlinx.coroutines.Job$b r2 = kotlinx.coroutines.Job.f22120e
            kotlin.coroutines.CoroutineContext$b r6 = r6.mo3484i(r2)
            if (r6 != r4) goto L_0x004d
            r6 = r3
            goto L_0x004e
        L_0x004d:
            r6 = 0
        L_0x004e:
            if (r6 == 0) goto L_0x0084
            r0.f29912k = r4     // Catch: all -> 0x0032
            r0.f29913l = r5     // Catch: all -> 0x0032
            r0.f29915n = r3     // Catch: all -> 0x0032
            kotlinx.coroutines.p r6 = new kotlinx.coroutines.p     // Catch: all -> 0x0032
            kotlin.coroutines.Continuation r2 = tf.C13075b.m4651c(r0)     // Catch: all -> 0x0032
            r6.<init>(r2, r3)     // Catch: all -> 0x0032
            r6.m14150C()     // Catch: all -> 0x0032
            ui.q$b r2 = new ui.q$b     // Catch: all -> 0x0032
            r2.<init>(r6)     // Catch: all -> 0x0032
            r4.mo3859c(r2)     // Catch: all -> 0x0032
            java.lang.Object r4 = r6.m14117y()     // Catch: all -> 0x0032
            java.lang.Object r6 = tf.C13075b.m4650d()     // Catch: all -> 0x0032
            if (r4 != r6) goto L_0x0077
            kotlin.coroutines.jvm.internal.C9933g.m14691c(r0)     // Catch: all -> 0x0032
        L_0x0077:
            if (r4 != r1) goto L_0x007a
            return r1
        L_0x007a:
            r5.invoke()
            kotlin.Unit r4 = kotlin.Unit.f22042a
            return r4
        L_0x0080:
            r5.invoke()
            throw r4
        L_0x0084:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "awaitClose() can only be invoked from the producer context"
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p372ui.C13353q.m3881a(kotlinx.coroutines.channels.ProducerScope, kotlin.jvm.functions.Function0, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* renamed from: b */
    public static final <E> AbstractC13358t<E> m3880b(CoroutineScope coroutineScope, CoroutineContext coroutineContext, int i, Function2<? super ProducerScope<? super E>, ? super Continuation<? super Unit>, ? extends Object> function2) {
        return m3879c(coroutineScope, coroutineContext, i, EnumC13337e.SUSPEND, EnumC10140l0.DEFAULT, null, function2);
    }

    /* renamed from: c */
    public static final <E> AbstractC13358t<E> m3879c(CoroutineScope coroutineScope, CoroutineContext coroutineContext, int i, EnumC13337e eVar, EnumC10140l0 l0Var, Function1<? super Throwable, Unit> function1, Function2<? super ProducerScope<? super E>, ? super Continuation<? super Unit>, ? extends Object> function2) {
        C13356r rVar = new C13356r(C10025f0.m14458e(coroutineScope, coroutineContext), C13341h.m3909b(i, eVar, null, 4, null));
        if (function1 != null) {
            rVar.mo14535Q(function1);
        }
        rVar.m14565T0(l0Var, rVar, function2);
        return rVar;
    }

    /* renamed from: d */
    public static /* synthetic */ AbstractC13358t m3878d(CoroutineScope coroutineScope, CoroutineContext coroutineContext, int i, Function2 function2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            coroutineContext = C12893f.f28966k;
        }
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return m3880b(coroutineScope, coroutineContext, i, function2);
    }

    /* renamed from: e */
    public static /* synthetic */ AbstractC13358t m3877e(CoroutineScope coroutineScope, CoroutineContext coroutineContext, int i, EnumC13337e eVar, EnumC10140l0 l0Var, Function1 function1, Function2 function2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            coroutineContext = C12893f.f28966k;
        }
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            eVar = EnumC13337e.SUSPEND;
        }
        if ((i2 & 8) != 0) {
            l0Var = EnumC10140l0.DEFAULT;
        }
        if ((i2 & 16) != 0) {
            function1 = null;
        }
        return m3879c(coroutineScope, coroutineContext, i, eVar, l0Var, function1, function2);
    }
}
