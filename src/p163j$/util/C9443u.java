package p163j$.util;

import java.util.PrimitiveIterator;
import java.util.function.Consumer;
import java.util.function.LongConsumer;
import p163j$.util.function.AbstractC9290M;
import p163j$.util.function.C9289L;
import p163j$.util.function.Consumer;

/* renamed from: j$.util.u */
/* loaded from: classes2.dex */
public final /* synthetic */ class C9443u implements PrimitiveIterator.OfLong {

    /* renamed from: a */
    public final /* synthetic */ AbstractC9444v f20800a;

    private /* synthetic */ C9443u(AbstractC9444v vVar) {
        this.f20800a = vVar;
    }

    /* renamed from: a */
    public static /* synthetic */ C9443u m16227a(AbstractC9444v vVar) {
        return new C9443u(vVar);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        AbstractC9444v vVar = this.f20800a;
        if (obj instanceof C9443u) {
            obj = ((C9443u) obj).f20800a;
        }
        return vVar.equals(obj);
    }

    @Override // java.util.PrimitiveIterator
    public final /* synthetic */ void forEachRemaining(LongConsumer longConsumer) {
        C9239G g = (C9239G) this.f20800a;
        g.getClass();
        g.m16597a((AbstractC9290M) longConsumer);
    }

    @Override // java.util.PrimitiveIterator.OfLong, java.util.Iterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        ((C9239G) this.f20800a).forEachRemaining(Consumer.VivifiedWrapper.convert(consumer));
    }

    @Override // java.util.PrimitiveIterator.OfLong
    /* renamed from: forEachRemaining  reason: avoid collision after fix types in other method */
    public final /* synthetic */ void forEachRemaining2(LongConsumer longConsumer) {
        ((C9239G) this.f20800a).m16597a(C9289L.m16542a(longConsumer));
    }

    @Override // java.util.Iterator
    public final /* synthetic */ boolean hasNext() {
        return ((C9239G) this.f20800a).hasNext();
    }

    public final /* synthetic */ int hashCode() {
        return this.f20800a.hashCode();
    }

    @Override // java.util.PrimitiveIterator.OfLong, java.util.Iterator
    public final Long next() {
        C9239G g = (C9239G) this.f20800a;
        g.getClass();
        if (!AbstractC9251T.f20302a) {
            return Long.valueOf(g.nextLong());
        }
        AbstractC9251T.m16583a(C9239G.class, "{0} calling PrimitiveIterator.OfLong.nextLong()");
        throw null;
    }

    @Override // java.util.PrimitiveIterator.OfLong
    public final /* synthetic */ long nextLong() {
        return ((C9239G) this.f20800a).nextLong();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ void remove() {
        ((C9239G) this.f20800a).remove();
        throw null;
    }
}
