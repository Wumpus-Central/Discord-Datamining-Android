package p072e0;

import android.content.Context;
import p390w.AbstractC13662r0;
import p390w.AbstractC13702y2;
import p390w.C13582c2;
import p390w.C13696x1;

/* renamed from: e0.k */
/* loaded from: classes.dex */
public final class C6540k implements AbstractC13702y2 {

    /* renamed from: b */
    private final C6542l f13694b;

    /* renamed from: c */
    private final C6544m f13695c;

    /* renamed from: e0.k$a */
    /* loaded from: classes.dex */
    static /* synthetic */ class C6541a {

        /* renamed from: a */
        static final /* synthetic */ int[] f13696a;

        static {
            int[] iArr = new int[AbstractC13702y2.EnumC13704b.values().length];
            f13696a = iArr;
            try {
                iArr[AbstractC13702y2.EnumC13704b.IMAGE_CAPTURE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f13696a[AbstractC13702y2.EnumC13704b.PREVIEW.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f13696a[AbstractC13702y2.EnumC13704b.VIDEO_CAPTURE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public C6540k(int i, AbstractC6547n nVar, Context context) {
        this.f13694b = new C6542l(i, nVar, context);
        this.f13695c = new C6544m(i, nVar, context);
    }

    @Override // p390w.AbstractC13702y2
    /* renamed from: a */
    public AbstractC13662r0 mo2994a(AbstractC13702y2.EnumC13704b bVar) {
        C13696x1 x1Var;
        int i = C6541a.f13696a[bVar.ordinal()];
        if (i == 1) {
            x1Var = C13696x1.m3001K(this.f13694b.m25347a());
        } else if (i == 2) {
            x1Var = C13696x1.m3001K(this.f13695c.m25344a());
        } else if (i != 3) {
            return null;
        } else {
            throw new IllegalArgumentException("CameraX Extensions doesn't support VideoCapture!");
        }
        return C13582c2.m3310H(x1Var);
    }
}
