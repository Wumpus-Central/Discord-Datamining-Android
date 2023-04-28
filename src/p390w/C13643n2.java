package p390w;

import androidx.camera.core.AbstractC1876k1;
import androidx.camera.core.ImageProxy;
import java.util.Collections;
import java.util.List;
import p120gc.AbstractFutureC7576b;
import p431y.C14186f;

/* renamed from: w.n2 */
/* loaded from: classes.dex */
public final class C13643n2 implements AbstractC13629l1 {

    /* renamed from: a */
    private final int f30473a;

    /* renamed from: b */
    private final ImageProxy f30474b;

    public C13643n2(ImageProxy imageProxy, String str) {
        AbstractC1876k1 p0 = imageProxy.mo39604p0();
        if (p0 != null) {
            Integer num = (Integer) p0.mo343c().m3089c(str);
            if (num != null) {
                this.f30473a = num.intValue();
                this.f30474b = imageProxy;
                return;
            }
            throw new IllegalArgumentException("ImageProxy has no associated tag");
        }
        throw new IllegalArgumentException("ImageProxy has no associated ImageInfo");
    }

    @Override // p390w.AbstractC13629l1
    /* renamed from: a */
    public List<Integer> mo3127a() {
        return Collections.singletonList(Integer.valueOf(this.f30473a));
    }

    @Override // p390w.AbstractC13629l1
    /* renamed from: b */
    public AbstractFutureC7576b<ImageProxy> mo3126b(int i) {
        if (i != this.f30473a) {
            return C14186f.m1423f(new IllegalArgumentException("Capture id does not exist in the bundle"));
        }
        return C14186f.m1421h(this.f30474b);
    }

    /* renamed from: c */
    public void m3125c() {
        this.f30474b.close();
    }
}
