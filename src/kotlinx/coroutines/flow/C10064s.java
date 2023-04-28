package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.AbstractC9930d;
import kotlin.coroutines.jvm.internal.AbstractC9931e;
import kotlin.jvm.functions.Function2;

@Metadata(m15074d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002J\u001b\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u0000H\u0096Aø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u0013\u0010\u0007\u001a\u00020\u0004H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR9\u0010\u0011\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\f8\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012"}, m15073d2 = {"Lkotlinx/coroutines/flow/s;", "T", "Lkotlinx/coroutines/flow/FlowCollector;", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "a", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "k", "Lkotlinx/coroutines/flow/FlowCollector;", "collector", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "l", "Lkotlin/jvm/functions/Function2;", "action", "kotlinx-coroutines-core"}, m15072k = 1, m15071mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.flow.s */
/* loaded from: classes8.dex */
public final class C10064s<T> implements FlowCollector<T> {

    /* renamed from: k */
    private final FlowCollector<T> f22248k;

    /* renamed from: l */
    private final Function2<FlowCollector<? super T>, Continuation<? super Unit>, Object> f22249l;

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(m15072k = 3, m15071mv = {1, 6, 0}, m15069xi = 48)
    @AbstractC9931e(m14702c = "kotlinx.coroutines.flow.SubscribedFlowCollector", m14701f = "Share.kt", m14700l = {419, 423}, m14699m = "onSubscription")
    /* renamed from: kotlinx.coroutines.flow.s$a */
    /* loaded from: classes8.dex */
    public static final class C10065a extends AbstractC9930d {

        /* renamed from: k */
        Object f22250k;

        /* renamed from: l */
        Object f22251l;

        /* renamed from: m */
        /* synthetic */ Object f22252m;

        /* renamed from: n */
        final /* synthetic */ C10064s<T> f22253n;

        /* renamed from: o */
        int f22254o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10065a(C10064s<T> sVar, Continuation<? super C10065a> continuation) {
            super(continuation);
            this.f22253n = sVar;
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC9927a
        public final Object invokeSuspend(Object obj) {
            this.f22252m = obj;
            this.f22254o |= Integer.MIN_VALUE;
            return this.f22253n.m14355a(this);
        }
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007a  */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1, types: [vi.n] */
    /* JADX WARN: Type inference failed for: r2v3, types: [boolean] */
    /* JADX WARN: Unknown variable types count: 1 */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m14355a(kotlin.coroutines.Continuation<? super kotlin.Unit> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof kotlinx.coroutines.flow.C10064s.C10065a
            if (r0 == 0) goto L_0x0013
            r0 = r7
            kotlinx.coroutines.flow.s$a r0 = (kotlinx.coroutines.flow.C10064s.C10065a) r0
            int r1 = r0.f22254o
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f22254o = r1
            goto L_0x0018
        L_0x0013:
            kotlinx.coroutines.flow.s$a r0 = new kotlinx.coroutines.flow.s$a
            r0.<init>(r6, r7)
        L_0x0018:
            java.lang.Object r7 = r0.f22252m
            java.lang.Object r1 = tf.C13075b.m4650d()
            int r2 = r0.f22254o
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0040
            if (r2 == r4) goto L_0x0034
            if (r2 != r3) goto L_0x002c
            nf.C11093t.m10930b(r7)
            goto L_0x0077
        L_0x002c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L_0x0034:
            java.lang.Object r2 = r0.f22251l
            vi.n r2 = (vi.C13530n) r2
            java.lang.Object r4 = r0.f22250k
            kotlinx.coroutines.flow.s r4 = (kotlinx.coroutines.flow.C10064s) r4
            nf.C11093t.m10930b(r7)     // Catch: all -> 0x007d
            goto L_0x005e
        L_0x0040:
            nf.C11093t.m10930b(r7)
            vi.n r2 = new vi.n
            kotlinx.coroutines.flow.FlowCollector<T> r7 = r6.f22248k
            kotlin.coroutines.CoroutineContext r5 = r0.getContext()
            r2.<init>(r7, r5)
            kotlin.jvm.functions.Function2<kotlinx.coroutines.flow.FlowCollector<? super T>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> r7 = r6.f22249l     // Catch: all -> 0x007d
            r0.f22250k = r6     // Catch: all -> 0x007d
            r0.f22251l = r2     // Catch: all -> 0x007d
            r0.f22254o = r4     // Catch: all -> 0x007d
            java.lang.Object r7 = r7.invoke(r2, r0)     // Catch: all -> 0x007d
            if (r7 != r1) goto L_0x005d
            return r1
        L_0x005d:
            r4 = r6
        L_0x005e:
            r2.releaseIntercepted()
            kotlinx.coroutines.flow.FlowCollector<T> r7 = r4.f22248k
            boolean r2 = r7 instanceof kotlinx.coroutines.flow.C10064s
            if (r2 == 0) goto L_0x007a
            kotlinx.coroutines.flow.s r7 = (kotlinx.coroutines.flow.C10064s) r7
            r2 = 0
            r0.f22250k = r2
            r0.f22251l = r2
            r0.f22254o = r3
            java.lang.Object r7 = r7.m14355a(r0)
            if (r7 != r1) goto L_0x0077
            return r1
        L_0x0077:
            kotlin.Unit r7 = kotlin.Unit.f22042a
            return r7
        L_0x007a:
            kotlin.Unit r7 = kotlin.Unit.f22042a
            return r7
        L_0x007d:
            r7 = move-exception
            r2.releaseIntercepted()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.C10064s.m14355a(kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public Object emit(T t, Continuation<? super Unit> continuation) {
        return this.f22248k.emit(t, continuation);
    }
}
