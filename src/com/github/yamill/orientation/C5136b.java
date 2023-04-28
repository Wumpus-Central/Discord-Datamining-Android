package com.github.yamill.orientation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.AbstractC9931e;
import kotlin.coroutines.jvm.internal.AbstractC9938k;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC9973s;
import kotlin.jvm.internal.C9971q;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.C10210t0;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import nf.C11093t;
import tf.C13080d;

@Metadata(m15074d1 = {"\u0000\u001c\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u001aP\u0010\t\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u00070\u0006\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0018\u0010\b\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u00070\u0006¨\u0006\n"}, m15073d2 = {"T", "R", "", "intervalMs", "Lkotlinx/coroutines/CoroutineScope;", "coroutineScope", "Lkotlin/Function2;", "", "destinationFunction", "a", "react-native-orientation_release"}, m15072k = 2, m15071mv = {1, 8, 0})
/* renamed from: com.github.yamill.orientation.b */
/* loaded from: classes7.dex */
public final class C5136b {

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(m15074d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u00002\u0006\u0010\u0003\u001a\u00028\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m15073d2 = {"T", "R", "param1", "param2", "", "a", "(Ljava/lang/Object;Ljava/lang/Object;)V"}, m15072k = 3, m15071mv = {1, 8, 0})
    /* renamed from: com.github.yamill.orientation.b$a */
    /* loaded from: classes7.dex */
    public static final class C5137a extends AbstractC9973s implements Function2<T, R, Unit> {

        /* renamed from: k */
        final /* synthetic */ Ref$ObjectRef<T> f8920k;

        /* renamed from: l */
        final /* synthetic */ Ref$ObjectRef<R> f8921l;

        /* renamed from: m */
        final /* synthetic */ Ref$ObjectRef<Job> f8922m;

        /* renamed from: n */
        final /* synthetic */ CoroutineScope f8923n;

        /* renamed from: o */
        final /* synthetic */ long f8924o;

        /* renamed from: p */
        final /* synthetic */ Function2<T, R, Unit> f8925p;

        /* JADX INFO: Access modifiers changed from: package-private */
        @Metadata(m15074d1 = {"\u0000\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u00020\u0002H\u008a@"}, m15073d2 = {"T", "R", "Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, m15072k = 3, m15071mv = {1, 8, 0})
        @AbstractC9931e(m14702c = "com.github.yamill.orientation.ThrottleUtilsKt$throttleLatest$1$1", m14701f = "ThrottleUtils.kt", m14700l = {25}, m14699m = "invokeSuspend")
        /* renamed from: com.github.yamill.orientation.b$a$a */
        /* loaded from: classes7.dex */
        public static final class C0138a extends AbstractC9938k implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

            /* renamed from: k */
            int f8926k;

            /* renamed from: l */
            final /* synthetic */ long f8927l;

            /* renamed from: m */
            final /* synthetic */ Function2<T, R, Unit> f8928m;

            /* renamed from: n */
            final /* synthetic */ Ref$ObjectRef<T> f8929n;

            /* renamed from: o */
            final /* synthetic */ Ref$ObjectRef<R> f8930o;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C0138a(long j, Function2<? super T, ? super R, Unit> function2, Ref$ObjectRef<T> ref$ObjectRef, Ref$ObjectRef<R> ref$ObjectRef2, Continuation<? super C0138a> continuation) {
                super(2, continuation);
                this.f8927l = j;
                this.f8928m = function2;
                this.f8929n = ref$ObjectRef;
                this.f8930o = ref$ObjectRef2;
            }

            @Override // kotlin.coroutines.jvm.internal.AbstractC9927a
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C0138a(this.f8927l, this.f8928m, this.f8929n, this.f8930o, continuation);
            }

            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C0138a) create(coroutineScope, continuation)).invokeSuspend(Unit.f22042a);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.coroutines.jvm.internal.AbstractC9927a
            public final Object invokeSuspend(Object obj) {
                Object d;
                d = C13080d.m4646d();
                int i = this.f8926k;
                if (i == 0) {
                    C11093t.m10930b(obj);
                    long j = this.f8927l;
                    this.f8926k = 1;
                    if (C10210t0.m13992a(j, this) == d) {
                        return d;
                    }
                } else if (i == 1) {
                    C11093t.m10930b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                this.f8928m.invoke(this.f8929n.f22069k, this.f8930o.f22069k);
                return Unit.f22042a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C5137a(Ref$ObjectRef<T> ref$ObjectRef, Ref$ObjectRef<R> ref$ObjectRef2, Ref$ObjectRef<Job> ref$ObjectRef3, CoroutineScope coroutineScope, long j, Function2<? super T, ? super R, Unit> function2) {
            super(2);
            this.f8920k = ref$ObjectRef;
            this.f8921l = ref$ObjectRef2;
            this.f8922m = ref$ObjectRef3;
            this.f8923n = coroutineScope;
            this.f8924o = j;
            this.f8925p = function2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r12v4, types: [T, kotlinx.coroutines.Job] */
        /* JADX WARN: Unknown variable types count: 1 */
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void m30584a(T r11, R r12) {
            /*
                r10 = this;
                kotlin.jvm.internal.Ref$ObjectRef<T> r0 = r10.f8920k
                r0.f22069k = r11
                kotlin.jvm.internal.Ref$ObjectRef<R> r11 = r10.f8921l
                r11.f22069k = r12
                kotlin.jvm.internal.Ref$ObjectRef<kotlinx.coroutines.Job> r11 = r10.f8922m
                T r11 = r11.f22069k
                kotlinx.coroutines.Job r11 = (kotlinx.coroutines.Job) r11
                r12 = 0
                if (r11 == 0) goto L_0x0018
                boolean r11 = r11.mo14526g()
                if (r11 != 0) goto L_0x0018
                r12 = 1
            L_0x0018:
                if (r12 != 0) goto L_0x0037
                kotlin.jvm.internal.Ref$ObjectRef<kotlinx.coroutines.Job> r11 = r10.f8922m
                kotlinx.coroutines.CoroutineScope r0 = r10.f8923n
                r1 = 0
                r2 = 0
                com.github.yamill.orientation.b$a$a r12 = new com.github.yamill.orientation.b$a$a
                long r4 = r10.f8924o
                kotlin.jvm.functions.Function2<T, R, kotlin.Unit> r6 = r10.f8925p
                kotlin.jvm.internal.Ref$ObjectRef<T> r7 = r10.f8920k
                kotlin.jvm.internal.Ref$ObjectRef<R> r8 = r10.f8921l
                r9 = 0
                r3 = r12
                r3.<init>(r4, r6, r7, r8, r9)
                r4 = 3
                r5 = 0
                kotlinx.coroutines.Job r12 = kotlinx.coroutines.C10129j.m14195d(r0, r1, r2, r3, r4, r5)
                r11.f22069k = r12
            L_0x0037:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.github.yamill.orientation.C5136b.C5137a.m30584a(java.lang.Object, java.lang.Object):void");
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Object obj, Object obj2) {
            m30584a(obj, obj2);
            return Unit.f22042a;
        }
    }

    /* renamed from: a */
    public static final <T, R> Function2<T, R, Unit> m30585a(long j, CoroutineScope coroutineScope, Function2<? super T, ? super R, Unit> destinationFunction) {
        C9971q.m14633g(coroutineScope, "coroutineScope");
        C9971q.m14633g(destinationFunction, "destinationFunction");
        return new C5137a(new Ref$ObjectRef(), new Ref$ObjectRef(), new Ref$ObjectRef(), coroutineScope, j, destinationFunction);
    }
}
