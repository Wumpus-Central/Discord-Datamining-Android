package sa;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: sa.z */
/* loaded from: classes3.dex */
public final class C12859z extends AbstractC12855v {

    /* renamed from: m */
    private final AbstractC12830b0 f28930m;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C12859z(AbstractC12830b0 b0Var, int i) {
        super(b0Var.size(), i);
        this.f28930m = b0Var;
    }

    @Override // sa.AbstractC12855v
    /* renamed from: b */
    protected final Object mo5250b(int i) {
        return this.f28930m.get(i);
    }
}
