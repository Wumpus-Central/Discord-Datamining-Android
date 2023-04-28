package nf;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.C9933g;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.C9964l0;
import kotlin.jvm.internal.C9971q;
import nf.C11090s;
import p339sf.C12893f;
import tf.C13080d;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(m15074d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\b\u0012\u0004\u0012\u00028\u00010\u0004BH\u00124\u0010\u001e\u001a0\b\u0001\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000f\u0012\u0006\u0010\n\u001a\u00028\u0000ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 J \u0010\b\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005H\u0016ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\u000b\u001a\u00028\u00012\u0006\u0010\n\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00028\u0001¢\u0006\u0004\b\r\u0010\u000eRG\u0010\u0013\u001a0\b\u0001\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000f8\u0002@\u0002X\u0082\u000eø\u0001\u0000¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R \u0010\u0018\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R$\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u00058\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0019\u0010\u0015R\u0014\u0010\u001d\u001a\u00020\u001a8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c\u0082\u0002\b\n\u0002\b\u0019\n\u0002\b!¨\u0006!"}, m15073d2 = {"Lnf/d;", "T", "R", "Lnf/c;", "Lkotlin/coroutines/Continuation;", "Lnf/s;", "result", "", "resumeWith", "(Ljava/lang/Object;)V", "value", "a", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "c", "()Ljava/lang/Object;", "Lkotlin/Function3;", "", "k", "Lkotlin/jvm/functions/Function3;", "function", "l", "Ljava/lang/Object;", "m", "Lkotlin/coroutines/Continuation;", "cont", "n", "Lkotlin/coroutines/CoroutineContext;", "getContext", "()Lkotlin/coroutines/CoroutineContext;", "context", "block", "<init>", "(Lkotlin/jvm/functions/Function3;Ljava/lang/Object;)V", "kotlin-stdlib"}, m15072k = 1, m15071mv = {1, 8, 0})
/* renamed from: nf.d */
/* loaded from: classes8.dex */
public final class C11061d<T, R> extends AbstractC11058c<T, R> implements Continuation<R> {

    /* renamed from: k */
    private Function3<? super AbstractC11058c<?, ?>, Object, ? super Continuation<Object>, ? extends Object> f24576k;

    /* renamed from: l */
    private Object f24577l;

    /* renamed from: m */
    private Continuation<Object> f24578m = this;

    /* renamed from: n */
    private Object f24579n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C11061d(Function3<? super AbstractC11058c<T, R>, ? super T, ? super Continuation<? super R>, ? extends Object> block, T t) {
        super(null);
        Object obj;
        C9971q.m14633g(block, "block");
        this.f24576k = block;
        this.f24577l = t;
        C9971q.m14635e(this, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        obj = C11055b.f24570a;
        this.f24579n = obj;
    }

    @Override // nf.AbstractC11058c
    /* renamed from: a */
    public Object mo11008a(T t, Continuation<? super R> continuation) {
        Object d;
        Object d2;
        C9971q.m14635e(continuation, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        this.f24578m = continuation;
        this.f24577l = t;
        d = C13080d.m4646d();
        d2 = C13080d.m4646d();
        if (d == d2) {
            C9933g.m14691c(continuation);
        }
        return d;
    }

    /* renamed from: c */
    public final R m11007c() {
        Object obj;
        Object obj2;
        Object d;
        while (true) {
            R r = (R) this.f24579n;
            Continuation<Object> continuation = this.f24578m;
            if (continuation == null) {
                C11093t.m10930b(r);
                return r;
            }
            obj = C11055b.f24570a;
            if (C11090s.m10938d(obj, r)) {
                try {
                    Function3<? super AbstractC11058c<?, ?>, Object, ? super Continuation<Object>, ? extends Object> function3 = this.f24576k;
                    Object obj3 = this.f24577l;
                    C9971q.m14635e(function3, "null cannot be cast to non-null type kotlin.Function3<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.startCoroutineUninterceptedOrReturn, P of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.startCoroutineUninterceptedOrReturn, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.startCoroutineUninterceptedOrReturn>, kotlin.Any?>");
                    Object invoke = ((Function3) C9964l0.m14653d(function3, 3)).invoke(this, obj3, continuation);
                    d = C13080d.m4646d();
                    if (invoke != d) {
                        continuation.resumeWith(C11090s.m10940b(invoke));
                    }
                } catch (Throwable th2) {
                    C11090s.C11091a aVar = C11090s.f24606l;
                    continuation.resumeWith(C11090s.m10940b(C11093t.m10931a(th2)));
                }
            } else {
                obj2 = C11055b.f24570a;
                this.f24579n = obj2;
                continuation.resumeWith(r);
            }
        }
    }

    @Override // kotlin.coroutines.Continuation
    public CoroutineContext getContext() {
        return C12893f.f28966k;
    }

    @Override // kotlin.coroutines.Continuation
    public void resumeWith(Object obj) {
        this.f24578m = null;
        this.f24579n = obj;
    }
}
