package p163j$.util.stream;

import java.util.Collection;
import p163j$.util.Collection;
import p163j$.util.Spliterator;
import p163j$.util.function.Consumer;
import p163j$.util.function.IntFunction;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.G0 */
/* loaded from: classes2.dex */
public final class C9344G0 implements AbstractC9324C0 {

    /* renamed from: a */
    private final Collection f20489a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C9344G0(Collection collection) {
        this.f20489a = collection;
    }

    @Override // p163j$.util.stream.AbstractC9324C0
    /* renamed from: a */
    public final AbstractC9324C0 mo16321a(int i) {
        throw new IndexOutOfBoundsException();
    }

    @Override // p163j$.util.stream.AbstractC9324C0
    public final long count() {
        return this.f20489a.size();
    }

    @Override // p163j$.util.stream.AbstractC9324C0
    public final void forEach(Consumer consumer) {
        Collection.EL.m16605a(this.f20489a, consumer);
    }

    @Override // p163j$.util.stream.AbstractC9324C0
    /* renamed from: i */
    public final void mo16320i(Object[] objArr, int i) {
        for (Object obj : this.f20489a) {
            i++;
            objArr[i] = obj;
        }
    }

    @Override // p163j$.util.stream.AbstractC9324C0
    /* renamed from: l */
    public final /* synthetic */ int mo16319l() {
        return 0;
    }

    @Override // p163j$.util.stream.AbstractC9324C0
    /* renamed from: m */
    public final Object[] mo16318m(IntFunction intFunction) {
        java.util.Collection collection = this.f20489a;
        return collection.toArray((Object[]) intFunction.apply(collection.size()));
    }

    @Override // p163j$.util.stream.AbstractC9324C0
    /* renamed from: n */
    public final /* synthetic */ AbstractC9324C0 mo16317n(long j, long j2, IntFunction intFunction) {
        return AbstractC0606t0.m16272h0(this, j, j2, intFunction);
    }

    @Override // p163j$.util.stream.AbstractC9324C0
    /* renamed from: spliterator */
    public final Spliterator mo42181spliterator() {
        return Collection.EL.stream(this.f20489a).spliterator();
    }

    public final String toString() {
        java.util.Collection collection = this.f20489a;
        return String.format("CollectionNode[%d][%s]", Integer.valueOf(collection.size()), collection);
    }
}
