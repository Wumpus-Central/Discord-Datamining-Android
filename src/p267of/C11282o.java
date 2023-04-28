package p267of;

import ag.AbstractC1385a;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.C9906j;
import kotlin.jvm.internal.C9971q;
import p163j$.util.Iterator;
import p163j$.util.function.Consumer;

@Metadata(m15074d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002B\u0015\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u0005\u001a\u00020\u0004H\u0086\u0002J\u000f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0086\u0002R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\r\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u0010"}, m15073d2 = {"Lof/o;", "T", "", "Lof/m;", "", "hasNext", "b", "k", "Ljava/util/Iterator;", "iterator", "", "l", "I", "index", "<init>", "(Ljava/util/Iterator;)V", "kotlin-stdlib"}, m15072k = 1, m15071mv = {1, 8, 0})
/* renamed from: of.o */
/* loaded from: classes8.dex */
public final class C11282o<T> implements Iterator<C11280m<? extends T>>, AbstractC1385a, p163j$.util.Iterator {

    /* renamed from: k */
    private final Iterator<T> f25206k;

    /* renamed from: l */
    private int f25207l;

    /* JADX WARN: Multi-variable type inference failed */
    public C11282o(Iterator<? extends T> iterator) {
        C9971q.m14633g(iterator, "iterator");
        this.f25206k = iterator;
    }

    /* renamed from: b */
    public final C11280m<T> next() {
        int i = this.f25207l;
        this.f25207l = i + 1;
        if (i < 0) {
            C9906j.m14810s();
        }
        return new C11280m<>(i, this.f25206k.next());
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
    public final boolean hasNext() {
        return this.f25206k.hasNext();
    }

    @Override // java.util.Iterator, p163j$.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
