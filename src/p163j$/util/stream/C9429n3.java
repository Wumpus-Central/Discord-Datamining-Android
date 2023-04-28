package p163j$.util.stream;

import p163j$.util.AbstractC0518n;
import p163j$.util.AbstractC9234B;
import p163j$.util.Spliterator;
import p163j$.util.function.Consumer;

/* renamed from: j$.util.stream.n3 */
/* loaded from: classes2.dex */
final class C9429n3 extends AbstractC9430o3 implements AbstractC9234B {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C9429n3(AbstractC9234B b, long j, long j2) {
        super(b, j, j2);
    }

    C9429n3(AbstractC9234B b, long j, long j2, long j3, long j4) {
        super(b, j, j2, j3, j4);
    }

    @Override // p163j$.util.stream.AbstractC9432q3
    /* renamed from: c */
    protected final Spliterator mo16306c(Spliterator spliterator, long j, long j2, long j3, long j4) {
        return new C9429n3((AbstractC9234B) spliterator, j, j2, j3, j4);
    }

    @Override // p163j$.util.stream.AbstractC9430o3
    /* renamed from: d */
    protected final Object mo16326d() {
        return new C9428m3(0);
    }

    @Override // p163j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC0518n.m16487e(this, consumer);
    }

    @Override // p163j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return AbstractC0518n.m16484j(this, consumer);
    }
}
