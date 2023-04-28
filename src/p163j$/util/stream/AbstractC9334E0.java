package p163j$.util.stream;

/* renamed from: j$.util.stream.E0 */
/* loaded from: classes2.dex */
abstract class AbstractC9334E0 implements AbstractC9324C0 {

    /* renamed from: a */
    protected final AbstractC9324C0 f20474a;

    /* renamed from: b */
    protected final AbstractC9324C0 f20475b;

    /* renamed from: c */
    private final long f20476c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC9334E0(AbstractC9324C0 c0, AbstractC9324C0 c02) {
        this.f20474a = c0;
        this.f20475b = c02;
        this.f20476c = c0.count() + c02.count();
    }

    @Override // p163j$.util.stream.AbstractC9324C0
    /* renamed from: a */
    public final AbstractC9324C0 mo16321a(int i) {
        if (i == 0) {
            return this.f20474a;
        }
        if (i == 1) {
            return this.f20475b;
        }
        throw new IndexOutOfBoundsException();
    }

    @Override // p163j$.util.stream.AbstractC9324C0
    public final long count() {
        return this.f20476c;
    }

    @Override // p163j$.util.stream.AbstractC9324C0
    /* renamed from: l */
    public final int mo16319l() {
        return 2;
    }
}
