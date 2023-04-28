package p306qi;

import ag.AbstractC1385a;
import com.facebook.react.uimanager.ViewProps;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;
import kotlin.sequences.Sequence;
import p163j$.util.Iterator;
import p163j$.util.function.Consumer;

@Metadata(m15074d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010(\n\u0002\b\t\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B\u001d\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0010\r\u001a\u00020\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0096\u0002R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\tR\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u0010"}, m15073d2 = {"Lqi/b;", "T", "Lkotlin/sequences/Sequence;", "Lqi/c;", "", "n", "a", "", "iterator", "Lkotlin/sequences/Sequence;", "sequence", "b", "I", "count", "<init>", "(Lkotlin/sequences/Sequence;I)V", "kotlin-stdlib"}, m15072k = 1, m15071mv = {1, 8, 0})
/* renamed from: qi.b */
/* loaded from: classes8.dex */
public final class C12177b<T> implements Sequence<T>, AbstractC12179c<T> {

    /* renamed from: a */
    private final Sequence<T> f27324a;

    /* renamed from: b */
    private final int f27325b;

    @Metadata(m15074d1 = {"\u0000!\n\u0000\n\u0002\u0010(\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\b*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0004\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\u0007\u001a\u00020\u0006H\u0096\u0002R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00018\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\"\u0010\u0014\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, m15073d2 = {"qi/b$a", "", "", "b", "next", "()Ljava/lang/Object;", "", "hasNext", "k", "Ljava/util/Iterator;", "getIterator", "()Ljava/util/Iterator;", "iterator", "", "l", "I", "getLeft", "()I", "setLeft", "(I)V", ViewProps.LEFT, "kotlin-stdlib"}, m15072k = 1, m15071mv = {1, 8, 0})
    /* renamed from: qi.b$a */
    /* loaded from: classes8.dex */
    public static final class C12178a implements Iterator<T>, AbstractC1385a, p163j$.util.Iterator {

        /* renamed from: k */
        private final Iterator<T> f27326k;

        /* renamed from: l */
        private int f27327l;

        C12178a(C12177b<T> bVar) {
            this.f27326k = ((C12177b) bVar).f27324a.iterator();
            this.f27327l = ((C12177b) bVar).f27325b;
        }

        /* renamed from: b */
        private final void m7496b() {
            while (this.f27327l > 0 && this.f27326k.hasNext()) {
                this.f27326k.next();
                this.f27327l--;
            }
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
            m7496b();
            return this.f27326k.hasNext();
        }

        @Override // java.util.Iterator, p163j$.util.Iterator
        public T next() {
            m7496b();
            return this.f27326k.next();
        }

        @Override // java.util.Iterator, p163j$.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C12177b(Sequence<? extends T> sequence, int i) {
        boolean z;
        C9971q.m14633g(sequence, "sequence");
        this.f27324a = sequence;
        this.f27325b = i;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            throw new IllegalArgumentException(("count must be non-negative, but was " + i + '.').toString());
        }
    }

    @Override // p306qi.AbstractC12179c
    /* renamed from: a */
    public Sequence<T> mo7495a(int i) {
        int i2 = this.f27325b + i;
        return i2 < 0 ? new C12177b(this, i) : new C12177b(this.f27324a, i2);
    }

    @Override // kotlin.sequences.Sequence
    public java.util.Iterator<T> iterator() {
        return new C12178a(this);
    }
}
