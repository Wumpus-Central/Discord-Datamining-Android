package p163j$.util;

import java.util.PrimitiveIterator;
import java.util.function.Consumer;
import java.util.function.IntConsumer;
import p163j$.util.function.C0509y;
import p163j$.util.function.Consumer;

/* renamed from: j$.util.r */
/* loaded from: classes2.dex */
public final /* synthetic */ class C9312r implements PrimitiveIterator.OfInt {

    /* renamed from: a */
    public final /* synthetic */ AbstractC0522s f20442a;

    private /* synthetic */ C9312r(AbstractC0522s sVar) {
        this.f20442a = sVar;
    }

    /* renamed from: a */
    public static /* synthetic */ C9312r m16480a(AbstractC0522s sVar) {
        if (sVar == null) {
            return null;
        }
        return new C9312r(sVar);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        AbstractC0522s sVar = this.f20442a;
        if (obj instanceof C9312r) {
            obj = ((C9312r) obj).f20442a;
        }
        return sVar.equals(obj);
    }

    @Override // java.util.PrimitiveIterator
    public final /* synthetic */ void forEachRemaining(IntConsumer intConsumer) {
        C9238F f = (C9238F) this.f20442a;
        f.getClass();
        f.m16598a((p163j$.util.function.IntConsumer) intConsumer);
    }

    @Override // java.util.PrimitiveIterator.OfInt, java.util.Iterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        ((C9238F) this.f20442a).forEachRemaining(Consumer.VivifiedWrapper.convert(consumer));
    }

    @Override // java.util.PrimitiveIterator.OfInt
    /* renamed from: forEachRemaining  reason: avoid collision after fix types in other method */
    public final /* synthetic */ void forEachRemaining2(IntConsumer intConsumer) {
        ((C9238F) this.f20442a).m16598a(C0509y.m16512a(intConsumer));
    }

    @Override // java.util.Iterator
    public final /* synthetic */ boolean hasNext() {
        return ((C9238F) this.f20442a).hasNext();
    }

    public final /* synthetic */ int hashCode() {
        return this.f20442a.hashCode();
    }

    @Override // java.util.PrimitiveIterator.OfInt, java.util.Iterator
    public final Integer next() {
        C9238F f = (C9238F) this.f20442a;
        f.getClass();
        if (!AbstractC9251T.f20302a) {
            return Integer.valueOf(f.nextInt());
        }
        AbstractC9251T.m16583a(C9238F.class, "{0} calling PrimitiveIterator.OfInt.nextInt()");
        throw null;
    }

    @Override // java.util.PrimitiveIterator.OfInt
    public final /* synthetic */ int nextInt() {
        return ((C9238F) this.f20442a).nextInt();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ void remove() {
        ((C9238F) this.f20442a).remove();
        throw null;
    }
}
