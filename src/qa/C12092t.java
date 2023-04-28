package qa;

/* renamed from: qa.t */
/* loaded from: classes3.dex */
final class C12092t<E> extends AbstractC12084p<E> {

    /* renamed from: m */
    private final AbstractC12086q<E> f27140m;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C12092t(AbstractC12086q<E> qVar, int i) {
        super(qVar.size(), i);
        this.f27140m = qVar;
    }

    @Override // qa.AbstractC12084p
    /* renamed from: b */
    protected final E mo7854b(int i) {
        return this.f27140m.get(i);
    }
}
