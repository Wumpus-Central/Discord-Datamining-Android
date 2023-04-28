package p288q;

import android.content.Context;
import p355u.C13171k;
import p390w.AbstractC13617k1;
import p390w.AbstractC13662r0;
import p390w.AbstractC13697x2;
import p390w.AbstractC13702y2;
import p390w.C13582c2;
import p390w.C13619k2;
import p390w.C13639n0;
import p390w.C13696x1;

/* renamed from: q.g1 */
/* loaded from: classes.dex */
public final class C11820g1 implements AbstractC13702y2 {

    /* renamed from: b */
    final C11951y1 f26370b;

    /* renamed from: q.g1$a */
    /* loaded from: classes.dex */
    static /* synthetic */ class C11821a {

        /* renamed from: a */
        static final /* synthetic */ int[] f26371a;

        static {
            int[] iArr = new int[AbstractC13702y2.EnumC13704b.values().length];
            f26371a = iArr;
            try {
                iArr[AbstractC13702y2.EnumC13704b.IMAGE_CAPTURE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f26371a[AbstractC13702y2.EnumC13704b.PREVIEW.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f26371a[AbstractC13702y2.EnumC13704b.IMAGE_ANALYSIS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f26371a[AbstractC13702y2.EnumC13704b.VIDEO_CAPTURE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public C11820g1(Context context) {
        this.f26370b = C11951y1.m8149b(context);
    }

    @Override // p390w.AbstractC13702y2
    /* renamed from: a */
    public AbstractC13662r0 mo2994a(AbstractC13702y2.EnumC13704b bVar) {
        Object obj;
        C13696x1 J = C13696x1.m3002J();
        C13619k2.C13621b bVar2 = new C13619k2.C13621b();
        int[] iArr = C11821a.f26371a;
        int i = iArr[bVar.ordinal()];
        if (i == 1 || i == 2 || i == 3) {
            bVar2.m3180r(1);
        } else if (i == 4) {
            bVar2.m3180r(3);
        }
        AbstractC13702y2.EnumC13704b bVar3 = AbstractC13702y2.EnumC13704b.PREVIEW;
        if (bVar == bVar3) {
            C13171k.m4424a(bVar2);
        }
        J.mo2999u(AbstractC13697x2.f30585l, bVar2.m3185m());
        J.mo2999u(AbstractC13697x2.f30587n, C11815f1.f26363a);
        C13639n0.C13640a aVar = new C13639n0.C13640a();
        int i2 = iArr[bVar.ordinal()];
        if (i2 == 1) {
            aVar.m3130o(2);
        } else if (i2 == 2 || i2 == 3) {
            aVar.m3130o(1);
        } else if (i2 == 4) {
            aVar.m3130o(3);
        }
        J.mo2999u(AbstractC13697x2.f30586m, aVar.m3137h());
        AbstractC13662r0.AbstractC13663a<C13639n0.AbstractC13641b> aVar2 = AbstractC13697x2.f30588o;
        if (bVar == AbstractC13702y2.EnumC13704b.IMAGE_CAPTURE) {
            obj = C11837i2.f26424c;
        } else {
            obj = C11883o0.f26534a;
        }
        J.mo2999u(aVar2, obj);
        if (bVar == bVar3) {
            J.mo2999u(AbstractC13617k1.f30424j, this.f26370b.m8147d());
        }
        J.mo2999u(AbstractC13617k1.f30421g, Integer.valueOf(this.f26370b.m8148c().getRotation()));
        return C13582c2.m3310H(J);
    }
}
