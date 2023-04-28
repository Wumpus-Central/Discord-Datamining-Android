package p445yd;

import java.util.Map;
import p066dd.C6435d;
import p066dd.C6437f;
import p066dd.EnumC6436e;
import p137hd.C7997b;
import p137hd.C8000e;
import p178jd.C9558a;
import p178jd.C9560c;
import p178jd.C9561d;

/* renamed from: yd.e */
/* loaded from: classes3.dex */
public final class C14358e {

    /* renamed from: a */
    private final C9560c f32488a = new C9560c(C9558a.f21175l);

    /* renamed from: a */
    private void m790a(byte[] bArr, int i) {
        int length = bArr.length;
        int[] iArr = new int[length];
        for (int i2 = 0; i2 < length; i2++) {
            iArr[i2] = bArr[i2] & 255;
        }
        try {
            this.f32488a.m15987a(iArr, bArr.length - i);
            for (int i3 = 0; i3 < i; i3++) {
                bArr[i3] = (byte) iArr[i3];
            }
        } catch (C9561d unused) {
            throw C6435d.m25562a();
        }
    }

    /* renamed from: c */
    private C8000e m788c(C14346a aVar, Map<EnumC6436e, ?> map) {
        C14363j e = aVar.m806e();
        EnumC14359f d = aVar.m807d().m783d();
        C14347b[] b = C14347b.m802b(aVar.m808c(), e, d);
        int i = 0;
        for (C14347b bVar : b) {
            i += bVar.m801c();
        }
        byte[] bArr = new byte[i];
        int i2 = 0;
        for (C14347b bVar2 : b) {
            byte[] a = bVar2.m803a();
            int c = bVar2.m801c();
            m790a(a, c);
            int i3 = 0;
            while (i3 < c) {
                bArr[i2] = a[i3];
                i3++;
                i2++;
            }
        }
        return C14356d.m798a(bArr, e, d, map);
    }

    /* renamed from: b */
    public C8000e m789b(C7997b bVar, Map<EnumC6436e, ?> map) {
        C6435d e;
        C14346a aVar = new C14346a(bVar);
        C6437f fVar = null;
        try {
            return m788c(aVar, map);
        } catch (C6435d e2) {
            e = e2;
            try {
                aVar.m805f();
                aVar.m804g(true);
                aVar.m806e();
                aVar.m807d();
                aVar.m809b();
                C8000e c = m788c(aVar, map);
                c.m20894m(new C14362i(true));
                return c;
            } catch (C6435d | C6437f unused) {
                if (fVar != null) {
                    throw fVar;
                }
                throw e;
            }
        } catch (C6437f e3) {
            e = null;
            fVar = e3;
            aVar.m805f();
            aVar.m804g(true);
            aVar.m806e();
            aVar.m807d();
            aVar.m809b();
            C8000e c2 = m788c(aVar, map);
            c2.m20894m(new C14362i(true));
            return c2;
        }
    }
}
