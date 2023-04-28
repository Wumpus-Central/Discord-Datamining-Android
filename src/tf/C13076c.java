package tf;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.AbstractC9927a;
import kotlin.coroutines.jvm.internal.AbstractC9930d;
import kotlin.coroutines.jvm.internal.AbstractC9936i;
import kotlin.coroutines.jvm.internal.C9933g;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C9964l0;
import kotlin.jvm.internal.C9971q;
import nf.C11093t;
import p339sf.C12893f;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(m15074d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aF\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002\"\u0004\b\u0000\u0010\u0000*\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001aZ\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002\"\u0004\b\u0000\u0010\b\"\u0004\b\u0001\u0010\u0000*\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\t2\u0006\u0010\n\u001a\u00028\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002H\u0007ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a\u001e\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0007\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000e"}, m15073d2 = {"T", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "", "completion", "", "a", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;", "R", "Lkotlin/Function2;", "receiver", "b", "(Lkotlin/jvm/functions/Function2;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;", "c", "kotlin-stdlib"}, m15072k = 5, m15071mv = {1, 8, 0}, m15068xs = "kotlin/coroutines/intrinsics/IntrinsicsKt")
/* renamed from: tf.c */
/* loaded from: classes8.dex */
public class C13076c {

    @Metadata(m15074d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J$\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002H\u0014ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\n\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\t\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000b"}, m15073d2 = {"tf/c$a", "Lkotlin/coroutines/jvm/internal/i;", "Lnf/s;", "", "result", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "", "k", "I", "label", "kotlin-stdlib"}, m15072k = 1, m15071mv = {1, 8, 0})
    /* renamed from: tf.c$a */
    /* loaded from: classes8.dex */
    public static final class C13077a extends AbstractC9936i {

        /* renamed from: k */
        private int f29377k;

        /* renamed from: l */
        final /* synthetic */ Function1 f29378l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13077a(Continuation continuation, Function1 function1) {
            super(continuation);
            this.f29378l = function1;
            C9971q.m14635e(continuation, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC9927a
        protected Object invokeSuspend(Object obj) {
            int i = this.f29377k;
            if (i == 0) {
                this.f29377k = 1;
                C11093t.m10930b(obj);
                C9971q.m14635e(this.f29378l, "null cannot be cast to non-null type kotlin.Function1<kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$0>, kotlin.Any?>");
                return ((Function1) C9964l0.m14653d(this.f29378l, 1)).invoke(this);
            } else if (i == 1) {
                this.f29377k = 2;
                C11093t.m10930b(obj);
                return obj;
            } else {
                throw new IllegalStateException("This coroutine had already completed".toString());
            }
        }
    }

    @Metadata(m15074d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J$\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002H\u0014ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\n\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\t\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000b"}, m15073d2 = {"tf/c$b", "Lkotlin/coroutines/jvm/internal/d;", "Lnf/s;", "", "result", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "", "k", "I", "label", "kotlin-stdlib"}, m15072k = 1, m15071mv = {1, 8, 0})
    /* renamed from: tf.c$b */
    /* loaded from: classes8.dex */
    public static final class C13078b extends AbstractC9930d {

        /* renamed from: k */
        private int f29379k;

        /* renamed from: l */
        final /* synthetic */ Function1 f29380l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13078b(Continuation continuation, CoroutineContext coroutineContext, Function1 function1) {
            super(continuation, coroutineContext);
            this.f29380l = function1;
            C9971q.m14635e(continuation, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC9927a
        protected Object invokeSuspend(Object obj) {
            int i = this.f29379k;
            if (i == 0) {
                this.f29379k = 1;
                C11093t.m10930b(obj);
                C9971q.m14635e(this.f29380l, "null cannot be cast to non-null type kotlin.Function1<kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$0>, kotlin.Any?>");
                return ((Function1) C9964l0.m14653d(this.f29380l, 1)).invoke(this);
            } else if (i == 1) {
                this.f29379k = 2;
                C11093t.m10930b(obj);
                return obj;
            } else {
                throw new IllegalStateException("This coroutine had already completed".toString());
            }
        }
    }

    @Metadata(m15074d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J$\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002H\u0014ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\n\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\t\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000b"}, m15073d2 = {"tf/c$c", "Lkotlin/coroutines/jvm/internal/i;", "Lnf/s;", "", "result", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "", "k", "I", "label", "kotlin-stdlib"}, m15072k = 1, m15071mv = {1, 8, 0})
    /* renamed from: tf.c$c */
    /* loaded from: classes8.dex */
    public static final class C0419c extends AbstractC9936i {

        /* renamed from: k */
        private int f29381k;

        /* renamed from: l */
        final /* synthetic */ Function2 f29382l;

        /* renamed from: m */
        final /* synthetic */ Object f29383m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0419c(Continuation continuation, Function2 function2, Object obj) {
            super(continuation);
            this.f29382l = function2;
            this.f29383m = obj;
            C9971q.m14635e(continuation, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC9927a
        protected Object invokeSuspend(Object obj) {
            int i = this.f29381k;
            if (i == 0) {
                this.f29381k = 1;
                C11093t.m10930b(obj);
                C9971q.m14635e(this.f29382l, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1>, kotlin.Any?>");
                return ((Function2) C9964l0.m14653d(this.f29382l, 2)).invoke(this.f29383m, this);
            } else if (i == 1) {
                this.f29381k = 2;
                C11093t.m10930b(obj);
                return obj;
            } else {
                throw new IllegalStateException("This coroutine had already completed".toString());
            }
        }
    }

    @Metadata(m15074d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J$\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002H\u0014ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\n\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\t\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000b"}, m15073d2 = {"tf/c$d", "Lkotlin/coroutines/jvm/internal/d;", "Lnf/s;", "", "result", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "", "k", "I", "label", "kotlin-stdlib"}, m15072k = 1, m15071mv = {1, 8, 0})
    /* renamed from: tf.c$d */
    /* loaded from: classes8.dex */
    public static final class C13079d extends AbstractC9930d {

        /* renamed from: k */
        private int f29384k;

        /* renamed from: l */
        final /* synthetic */ Function2 f29385l;

        /* renamed from: m */
        final /* synthetic */ Object f29386m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13079d(Continuation continuation, CoroutineContext coroutineContext, Function2 function2, Object obj) {
            super(continuation, coroutineContext);
            this.f29385l = function2;
            this.f29386m = obj;
            C9971q.m14635e(continuation, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC9927a
        protected Object invokeSuspend(Object obj) {
            int i = this.f29384k;
            if (i == 0) {
                this.f29384k = 1;
                C11093t.m10930b(obj);
                C9971q.m14635e(this.f29385l, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1>, kotlin.Any?>");
                return ((Function2) C9964l0.m14653d(this.f29385l, 2)).invoke(this.f29386m, this);
            } else if (i == 1) {
                this.f29384k = 2;
                C11093t.m10930b(obj);
                return obj;
            } else {
                throw new IllegalStateException("This coroutine had already completed".toString());
            }
        }
    }

    /* renamed from: a */
    public static <T> Continuation<Unit> m4649a(Function1<? super Continuation<? super T>, ? extends Object> function1, Continuation<? super T> completion) {
        C9971q.m14633g(function1, "<this>");
        C9971q.m14633g(completion, "completion");
        Continuation<?> a = C9933g.m14693a(completion);
        if (function1 instanceof AbstractC9927a) {
            return ((AbstractC9927a) function1).create(a);
        }
        CoroutineContext context = a.getContext();
        if (context == C12893f.f28966k) {
            return new C13077a(a, function1);
        }
        return new C13078b(a, context, function1);
    }

    /* renamed from: b */
    public static <R, T> Continuation<Unit> m4648b(Function2<? super R, ? super Continuation<? super T>, ? extends Object> function2, R r, Continuation<? super T> completion) {
        C9971q.m14633g(function2, "<this>");
        C9971q.m14633g(completion, "completion");
        Continuation<?> a = C9933g.m14693a(completion);
        if (function2 instanceof AbstractC9927a) {
            return ((AbstractC9927a) function2).create(r, a);
        }
        CoroutineContext context = a.getContext();
        if (context == C12893f.f28966k) {
            return new C0419c(a, function2, r);
        }
        return new C13079d(a, context, function2, r);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: c */
    public static <T> Continuation<T> m4647c(Continuation<? super T> continuation) {
        AbstractC9930d dVar;
        Continuation<T> continuation2;
        C9971q.m14633g(continuation, "<this>");
        if (continuation instanceof AbstractC9930d) {
            dVar = (AbstractC9930d) continuation;
        } else {
            dVar = null;
        }
        if (dVar == null || (continuation2 = (Continuation<T>) dVar.intercepted()) == null) {
            return continuation;
        }
        return continuation2;
    }
}
