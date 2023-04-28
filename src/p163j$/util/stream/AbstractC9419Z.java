package p163j$.util.stream;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.Z */
/* loaded from: classes2.dex */
public abstract class AbstractC9419Z extends AbstractC0529b0 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC9419Z(AbstractC0533c cVar, int i) {
        super(cVar, i);
    }

    @Override // p163j$.util.stream.AbstractC0533c
    /* renamed from: W0 */
    final boolean mo16236W0() {
        return true;
    }

    @Override // p163j$.util.stream.AbstractC0533c, p163j$.util.stream.AbstractC0558h, p163j$.util.stream.AbstractC9328D
    public final /* bridge */ /* synthetic */ IntStream parallel() {
        parallel();
        return this;
    }

    @Override // p163j$.util.stream.AbstractC0533c, p163j$.util.stream.AbstractC0558h, p163j$.util.stream.AbstractC9328D
    public final /* bridge */ /* synthetic */ IntStream sequential() {
        sequential();
        return this;
    }
}
