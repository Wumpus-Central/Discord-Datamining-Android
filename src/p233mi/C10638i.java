package p233mi;

import ag.AbstractC1385a;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.C9971q;
import p163j$.util.Iterator;
import p163j$.util.function.Consumer;

/* renamed from: mi.i */
/* loaded from: classes8.dex */
public final class C10638i extends AbstractC10623c {

    /* renamed from: k */
    public static final C10638i f23533k = new C10638i();

    /* renamed from: mi.i$a */
    /* loaded from: classes8.dex */
    public static final class C10639a implements Iterator, AbstractC1385a, p163j$.util.Iterator {
        C10639a() {
        }

        /* renamed from: b */
        public Void next() {
            throw new NoSuchElementException();
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
            return false;
        }

        @Override // java.util.Iterator, p163j$.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    private C10638i() {
        super(null);
    }

    @Override // p233mi.AbstractC10623c
    /* renamed from: a */
    public int mo12695a() {
        return 0;
    }

    /* renamed from: f */
    public Void get(int i) {
        return null;
    }

    /* renamed from: g */
    public void mo12694b(int i, Void value) {
        C9971q.m14633g(value, "value");
        throw new IllegalStateException();
    }

    @Override // p233mi.AbstractC10623c, java.lang.Iterable
    public java.util.Iterator iterator() {
        return new C10639a();
    }
}
