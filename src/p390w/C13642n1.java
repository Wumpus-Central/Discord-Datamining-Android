package p390w;

import android.util.Size;
import android.view.Surface;
import p120gc.AbstractFutureC7576b;
import p431y.C14186f;

/* renamed from: w.n1 */
/* loaded from: classes.dex */
public final class C13642n1 extends AbstractC13689w0 {

    /* renamed from: m */
    private final Surface f30472m;

    public C13642n1(Surface surface, Size size, int i) {
        super(size, i);
        this.f30472m = surface;
    }

    @Override // p390w.AbstractC13689w0
    /* renamed from: n */
    public AbstractFutureC7576b<Surface> mo3012n() {
        return C14186f.m1421h(this.f30472m);
    }

    public C13642n1(Surface surface) {
        this.f30472m = surface;
    }
}
