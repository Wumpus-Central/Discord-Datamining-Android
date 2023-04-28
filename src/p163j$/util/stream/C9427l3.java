package p163j$.util.stream;

import p163j$.util.AbstractC0518n;
import p163j$.util.Spliterator;
import p163j$.util.function.Consumer;

/* renamed from: j$.util.stream.l3 */
/* loaded from: classes2.dex */
final class C9427l3 extends AbstractC9430o3 implements Spliterator.OfInt {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C9427l3(Spliterator.OfInt ofInt, long j, long j2) {
        super(ofInt, j, j2);
    }

    C9427l3(Spliterator.OfInt ofInt, long j, long j2, long j3, long j4) {
        super(ofInt, j, j2, j3, j4);
    }

    @Override // p163j$.util.stream.AbstractC9432q3
    /* renamed from: c */
    protected final Spliterator mo16306c(Spliterator spliterator, long j, long j2, long j3, long j4) {
        return new C9427l3((Spliterator.OfInt) spliterator, j, j2, j3, j4);
    }

    @Override // p163j$.util.stream.AbstractC9430o3
    /* renamed from: d */
    protected final Object mo16326d() {
        return new C9426k3(0);
    }

    @Override // p163j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC0518n.m16488d(this, consumer);
    }

    @Override // p163j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return AbstractC0518n.m16485i(this, consumer);
    }
}
