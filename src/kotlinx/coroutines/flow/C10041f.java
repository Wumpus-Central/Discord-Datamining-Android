package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.AbstractC9930d;
import kotlin.coroutines.jvm.internal.AbstractC9931e;
import p372ui.AbstractC13358t;
import tf.C13080d;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(m15074d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a1\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a9\u0010\t\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0082@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000b"}, m15073d2 = {"T", "Lkotlinx/coroutines/flow/FlowCollector;", "Lui/t;", "channel", "", "b", "(Lkotlinx/coroutines/flow/FlowCollector;Lui/t;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "consume", "c", "(Lkotlinx/coroutines/flow/FlowCollector;Lui/t;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m15072k = 5, m15071mv = {1, 6, 0}, m15068xs = "kotlinx/coroutines/flow/FlowKt")
/* renamed from: kotlinx.coroutines.flow.f */
/* loaded from: classes8.dex */
public final /* synthetic */ class C10041f {

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(m15072k = 3, m15071mv = {1, 6, 0}, m15069xi = 48)
    @AbstractC9931e(m14702c = "kotlinx.coroutines.flow.FlowKt__ChannelsKt", m14701f = "Channels.kt", m14700l = {51, 62}, m14699m = "emitAllImpl$FlowKt__ChannelsKt")
    /* renamed from: kotlinx.coroutines.flow.f$a */
    /* loaded from: classes8.dex */
    public static final class C10042a<T> extends AbstractC9930d {

        /* renamed from: k */
        Object f22184k;

        /* renamed from: l */
        Object f22185l;

        /* renamed from: m */
        boolean f22186m;

        /* renamed from: n */
        /* synthetic */ Object f22187n;

        /* renamed from: o */
        int f22188o;

        C10042a(Continuation<? super C10042a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC9927a
        public final Object invokeSuspend(Object obj) {
            this.f22187n = obj;
            this.f22188o |= Integer.MIN_VALUE;
            return C10041f.m14422c(null, null, false, this);
        }
    }

    /* renamed from: b */
    public static final <T> Object m14423b(FlowCollector<? super T> flowCollector, AbstractC13358t<? extends T> tVar, Continuation<? super Unit> continuation) {
        Object d;
        Object c = m14422c(flowCollector, tVar, true, continuation);
        d = C13080d.m4646d();
        return c == d ? c : Unit.f22042a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0075 A[Catch: all -> 0x0055, TRY_LEAVE, TryCatch #0 {all -> 0x0055, blocks: (B:13:0x0032, B:18:0x004b, B:25:0x006f, B:27:0x0075, B:33:0x0084, B:34:0x0085), top: B:44:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0085 A[Catch: all -> 0x0055, TRY_LEAVE, TryCatch #0 {all -> 0x0055, blocks: (B:13:0x0032, B:18:0x004b, B:25:0x006f, B:27:0x0075, B:33:0x0084, B:34:0x0085), top: B:44:0x0022 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x0095 -> B:14:0x0035). Please submit an issue!!! */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final <T> java.lang.Object m14422c(kotlinx.coroutines.flow.FlowCollector<? super T> r6, p372ui.AbstractC13358t<? extends T> r7, boolean r8, kotlin.coroutines.Continuation<? super kotlin.Unit> r9) {
        /*
            boolean r0 = r9 instanceof kotlinx.coroutines.flow.C10041f.C10042a
            if (r0 == 0) goto L_0x0013
            r0 = r9
            kotlinx.coroutines.flow.f$a r0 = (kotlinx.coroutines.flow.C10041f.C10042a) r0
            int r1 = r0.f22188o
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f22188o = r1
            goto L_0x0018
        L_0x0013:
            kotlinx.coroutines.flow.f$a r0 = new kotlinx.coroutines.flow.f$a
            r0.<init>(r9)
        L_0x0018:
            java.lang.Object r9 = r0.f22187n
            java.lang.Object r1 = tf.C13075b.m4650d()
            int r2 = r0.f22188o
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0057
            if (r2 == r4) goto L_0x0041
            if (r2 != r3) goto L_0x0039
            boolean r6 = r0.f22186m
            java.lang.Object r7 = r0.f22185l
            ui.t r7 = (p372ui.AbstractC13358t) r7
            java.lang.Object r8 = r0.f22184k
            kotlinx.coroutines.flow.FlowCollector r8 = (kotlinx.coroutines.flow.FlowCollector) r8
            nf.C11093t.m10930b(r9)     // Catch: all -> 0x0055
        L_0x0035:
            r5 = r8
            r8 = r6
            r6 = r5
            goto L_0x005d
        L_0x0039:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0041:
            boolean r6 = r0.f22186m
            java.lang.Object r7 = r0.f22185l
            ui.t r7 = (p372ui.AbstractC13358t) r7
            java.lang.Object r8 = r0.f22184k
            kotlinx.coroutines.flow.FlowCollector r8 = (kotlinx.coroutines.flow.FlowCollector) r8
            nf.C11093t.m10930b(r9)     // Catch: all -> 0x0055
            ui.i r9 = (p372ui.C13342i) r9     // Catch: all -> 0x0055
            java.lang.Object r9 = r9.m3899j()     // Catch: all -> 0x0055
            goto L_0x006f
        L_0x0055:
            r8 = move-exception
            goto L_0x009c
        L_0x0057:
            nf.C11093t.m10930b(r9)
            kotlinx.coroutines.flow.C10039d.m14429d(r6)
        L_0x005d:
            r0.f22184k = r6     // Catch: all -> 0x0098
            r0.f22185l = r7     // Catch: all -> 0x0098
            r0.f22186m = r8     // Catch: all -> 0x0098
            r0.f22188o = r4     // Catch: all -> 0x0098
            java.lang.Object r9 = r7.mo3868f(r0)     // Catch: all -> 0x0098
            if (r9 != r1) goto L_0x006c
            return r1
        L_0x006c:
            r5 = r8
            r8 = r6
            r6 = r5
        L_0x006f:
            boolean r2 = p372ui.C13342i.m3901h(r9)     // Catch: all -> 0x0055
            if (r2 == 0) goto L_0x0085
            java.lang.Throwable r8 = p372ui.C13342i.m3904e(r9)     // Catch: all -> 0x0055
            if (r8 != 0) goto L_0x0084
            if (r6 == 0) goto L_0x0081
            r6 = 0
            p372ui.C13346j.m3895a(r7, r6)
        L_0x0081:
            kotlin.Unit r6 = kotlin.Unit.f22042a
            return r6
        L_0x0084:
            throw r8     // Catch: all -> 0x0055
        L_0x0085:
            java.lang.Object r9 = p372ui.C13342i.m3903f(r9)     // Catch: all -> 0x0055
            r0.f22184k = r8     // Catch: all -> 0x0055
            r0.f22185l = r7     // Catch: all -> 0x0055
            r0.f22186m = r6     // Catch: all -> 0x0055
            r0.f22188o = r3     // Catch: all -> 0x0055
            java.lang.Object r9 = r8.emit(r9, r0)     // Catch: all -> 0x0055
            if (r9 != r1) goto L_0x0035
            return r1
        L_0x0098:
            r6 = move-exception
            r5 = r8
            r8 = r6
            r6 = r5
        L_0x009c:
            throw r8     // Catch: all -> 0x009d
        L_0x009d:
            r9 = move-exception
            if (r6 == 0) goto L_0x00a3
            p372ui.C13346j.m3895a(r7, r8)
        L_0x00a3:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.C10041f.m14422c(kotlinx.coroutines.flow.FlowCollector, ui.t, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
