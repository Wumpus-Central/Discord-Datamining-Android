package p233mi;

import ag.AbstractC1385a;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.C9971q;
import p163j$.util.Iterator;
import p163j$.util.function.Consumer;

/* renamed from: mi.o */
/* loaded from: classes8.dex */
public final class C10648o<T> extends AbstractC10623c<T> {

    /* renamed from: k */
    private final T f23542k;

    /* renamed from: l */
    private final int f23543l;

    /* renamed from: mi.o$a */
    /* loaded from: classes8.dex */
    public static final class C10649a implements Iterator<T>, AbstractC1385a, p163j$.util.Iterator {

        /* renamed from: k */
        private boolean f23544k = true;

        /* renamed from: l */
        final /* synthetic */ C10648o<T> f23545l;

        C10649a(C10648o<T> oVar) {
            this.f23545l = oVar;
        }

        @Override // p163j$.util.Iterator
        public /* synthetic */ void forEachRemaining(Consumer consumer) {
            Iterator.CC.$default$forEachRemaining(this, consumer);
        }

        @Override // java.util.Iterator
        public /* synthetic */ void forEachRemaining(java.util.function.Consumer consumer) {
            forEachRemaining(Consumer.VivifiedWrapper.convert(consumer));
        }

        @Override // java.util.Iterator, p163j$.util.Iterator
        public boolean hasNext() {
            return this.f23544k;
        }

        @Override // java.util.Iterator, p163j$.util.Iterator
        public T next() {
            if (this.f23544k) {
                this.f23544k = false;
                return this.f23545l.m12692g();
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator, p163j$.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10648o(T value, int i) {
        super(null);
        C9971q.m14633g(value, "value");
        this.f23542k = value;
        this.f23543l = i;
    }

    @Override // p233mi.AbstractC10623c
    /* renamed from: a */
    public int mo12695a() {
        return 1;
    }

    @Override // p233mi.AbstractC10623c
    /* renamed from: b */
    public void mo12694b(int i, T value) {
        C9971q.m14633g(value, "value");
        throw new IllegalStateException();
    }

    /* renamed from: f */
    public final int m12693f() {
        return this.f23543l;
    }

    /* renamed from: g */
    public final T m12692g() {
        return this.f23542k;
    }

    @Override // p233mi.AbstractC10623c
    public T get(int i) {
        if (i == this.f23543l) {
            return this.f23542k;
        }
        return null;
    }

    @Override // p233mi.AbstractC10623c, java.lang.Iterable
    public java.util.Iterator<T> iterator() {
        return new C10649a(this);
    }
}
