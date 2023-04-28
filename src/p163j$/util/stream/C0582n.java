package p163j$.util.stream;

/* renamed from: j$.util.stream.n */
/* loaded from: classes2.dex */
final class C0582n extends AbstractC0526a2 {

    /* renamed from: b */
    boolean f20700b;

    /* renamed from: c */
    Object f20701c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0582n(AbstractC0546e2 e2Var) {
        super(e2Var);
    }

    @Override // p163j$.util.function.Consumer
    public final void accept(Object obj) {
        AbstractC0546e2 e2Var = this.f20615a;
        if (obj != null) {
            Object obj2 = this.f20701c;
            if (obj2 != null && obj.equals(obj2)) {
                return;
            }
        } else if (!this.f20700b) {
            this.f20700b = true;
            obj = null;
        } else {
            return;
        }
        this.f20701c = obj;
        e2Var.accept((AbstractC0546e2) obj);
    }

    @Override // p163j$.util.stream.AbstractC0546e2
    /* renamed from: c */
    public final void mo16235c(long j) {
        this.f20700b = false;
        this.f20701c = null;
        this.f20615a.mo16235c(-1L);
    }

    @Override // p163j$.util.stream.AbstractC0526a2, p163j$.util.stream.AbstractC0546e2
    public final void end() {
        this.f20700b = false;
        this.f20701c = null;
        this.f20615a.end();
    }
}
