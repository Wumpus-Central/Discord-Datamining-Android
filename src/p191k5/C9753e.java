package p191k5;

import android.graphics.Bitmap;
import com.facebook.common.references.CloseableReference;
import java.util.List;
import p039c6.AbstractC3768a;
import p394w3.C13740j;

/* renamed from: k5.e */
/* loaded from: classes7.dex */
public class C9753e {

    /* renamed from: a */
    private final AbstractC9751c f21710a;

    /* renamed from: b */
    private final int f21711b;

    /* renamed from: c */
    private CloseableReference<Bitmap> f21712c;

    /* renamed from: d */
    private List<CloseableReference<Bitmap>> f21713d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C9753e(C9754f fVar) {
        this.f21710a = (AbstractC9751c) C13740j.m2834g(fVar.m15425e());
        this.f21711b = fVar.m15426d();
        this.f21712c = fVar.m15424f();
        this.f21713d = fVar.m15427c();
        fVar.m15428b();
    }

    /* renamed from: b */
    public static C9753e m15433b(AbstractC9751c cVar) {
        return new C9753e(cVar);
    }

    /* renamed from: e */
    public static C9754f m15430e(AbstractC9751c cVar) {
        return new C9754f(cVar);
    }

    /* renamed from: a */
    public synchronized void m15434a() {
        CloseableReference.m32025t(this.f21712c);
        this.f21712c = null;
        CloseableReference.m32023z(this.f21713d);
        this.f21713d = null;
    }

    /* renamed from: c */
    public AbstractC3768a m15432c() {
        return null;
    }

    /* renamed from: d */
    public AbstractC9751c m15431d() {
        return this.f21710a;
    }

    private C9753e(AbstractC9751c cVar) {
        this.f21710a = (AbstractC9751c) C13740j.m2834g(cVar);
        this.f21711b = 0;
    }
}
