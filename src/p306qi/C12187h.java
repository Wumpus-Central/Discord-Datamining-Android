package p306qi;

import ag.AbstractC1385a;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.C9933g;
import kotlin.jvm.internal.C9971q;
import nf.C11090s;
import nf.C11093t;
import p163j$.util.Iterator;
import p163j$.util.function.Consumer;
import p339sf.C12893f;
import tf.C13075b;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(m15074d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u00032\b\u0012\u0004\u0012\u00020\u00050\u0004B\u0007¢\u0006\u0004\b*\u0010+J\u000f\u0010\u0006\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\t\u001a\u00020\bH\u0002J\t\u0010\u000b\u001a\u00020\nH\u0096\u0002J\u0010\u0010\f\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\f\u0010\u0007J\u001b\u0010\u000e\u001a\u00020\u00052\u0006\u0010\r\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ \u0010\u0012\u001a\u00020\u00052\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\u0010H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0018\u001a\u00060\u0014j\u0002`\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0018\u0010\u001b\u001a\u0004\u0018\u00018\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR*\u0010%\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u0014\u0010)\u001a\u00020&8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006,"}, m15073d2 = {"Lqi/h;", "T", "Lqi/i;", "", "Lkotlin/coroutines/Continuation;", "", "h", "()Ljava/lang/Object;", "", "f", "", "hasNext", "next", "value", "d", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lnf/s;", "result", "resumeWith", "(Ljava/lang/Object;)V", "", "Lkotlin/sequences/State;", "k", "I", "state", "l", "Ljava/lang/Object;", "nextValue", "m", "Ljava/util/Iterator;", "nextIterator", "n", "Lkotlin/coroutines/Continuation;", "getNextStep", "()Lkotlin/coroutines/Continuation;", "i", "(Lkotlin/coroutines/Continuation;)V", "nextStep", "Lkotlin/coroutines/CoroutineContext;", "getContext", "()Lkotlin/coroutines/CoroutineContext;", "context", "<init>", "()V", "kotlin-stdlib"}, m15072k = 1, m15071mv = {1, 8, 0})
/* renamed from: qi.h */
/* loaded from: classes8.dex */
public final class C12187h<T> extends AbstractC12188i<T> implements Iterator<T>, Continuation<Unit>, AbstractC1385a, p163j$.util.Iterator {

    /* renamed from: k */
    private int f27347k;

    /* renamed from: l */
    private T f27348l;

    /* renamed from: m */
    private Iterator<? extends T> f27349m;

    /* renamed from: n */
    private Continuation<? super Unit> f27350n;

    /* renamed from: f */
    private final Throwable m7482f() {
        int i = this.f27347k;
        if (i == 4) {
            return new NoSuchElementException();
        }
        if (i == 5) {
            return new IllegalStateException("Iterator has failed.");
        }
        return new IllegalStateException("Unexpected state of the iterator: " + this.f27347k);
    }

    /* renamed from: h */
    private final T m7481h() {
        if (hasNext()) {
            return next();
        }
        throw new NoSuchElementException();
    }

    @Override // p306qi.AbstractC12188i
    /* renamed from: d */
    public Object mo7479d(T t, Continuation<? super Unit> continuation) {
        this.f27348l = t;
        this.f27347k = 3;
        this.f27350n = continuation;
        Object d = C13075b.m4650d();
        if (d == C13075b.m4650d()) {
            C9933g.m14691c(continuation);
        }
        if (d == C13075b.m4650d()) {
            return d;
        }
        return Unit.f22042a;
    }

    @Override // p163j$.util.Iterator
    public /* synthetic */ void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    @Override // java.util.Iterator
    public /* synthetic */ void forEachRemaining(java.util.function.Consumer consumer) {
        forEachRemaining(Consumer.VivifiedWrapper.convert(consumer));
    }

    @Override // kotlin.coroutines.Continuation
    public CoroutineContext getContext() {
        return C12893f.f28966k;
    }

    @Override // java.util.Iterator, p163j$.util.Iterator
    public boolean hasNext() {
        while (true) {
            int i = this.f27347k;
            if (i != 0) {
                if (i == 1) {
                    java.util.Iterator<? extends T> it = this.f27349m;
                    C9971q.m14636d(it);
                    if (it.hasNext()) {
                        this.f27347k = 2;
                        return true;
                    }
                    this.f27349m = null;
                } else if (i == 2 || i == 3) {
                    return true;
                } else {
                    if (i == 4) {
                        return false;
                    }
                    throw m7482f();
                }
            }
            this.f27347k = 5;
            Continuation<? super Unit> continuation = this.f27350n;
            C9971q.m14636d(continuation);
            this.f27350n = null;
            C11090s.C11091a aVar = C11090s.f24606l;
            continuation.resumeWith(C11090s.m10940b(Unit.f22042a));
        }
    }

    /* renamed from: i */
    public final void m7480i(Continuation<? super Unit> continuation) {
        this.f27350n = continuation;
    }

    @Override // java.util.Iterator, p163j$.util.Iterator
    public T next() {
        int i = this.f27347k;
        if (i == 0 || i == 1) {
            return m7481h();
        }
        if (i == 2) {
            this.f27347k = 1;
            java.util.Iterator<? extends T> it = this.f27349m;
            C9971q.m14636d(it);
            return (T) it.next();
        } else if (i == 3) {
            this.f27347k = 0;
            T t = this.f27348l;
            this.f27348l = null;
            return t;
        } else {
            throw m7482f();
        }
    }

    @Override // java.util.Iterator, p163j$.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // kotlin.coroutines.Continuation
    public void resumeWith(Object obj) {
        C11093t.m10930b(obj);
        this.f27347k = 4;
    }
}
