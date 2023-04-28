package p214ld;

import p066dd.C6435d;
import p137hd.C7997b;
import p137hd.C8000e;
import p178jd.C9558a;
import p178jd.C9560c;
import p178jd.C9561d;

/* renamed from: ld.d */
/* loaded from: classes3.dex */
public final class C10402d {

    /* renamed from: a */
    private final C9560c f22798a = new C9560c(C9558a.f21176m);

    /* renamed from: a */
    private void m13489a(byte[] bArr, int i) {
        int length = bArr.length;
        int[] iArr = new int[length];
        for (int i2 = 0; i2 < length; i2++) {
            iArr[i2] = bArr[i2] & 255;
        }
        try {
            this.f22798a.m15987a(iArr, bArr.length - i);
            for (int i3 = 0; i3 < i; i3++) {
                bArr[i3] = (byte) iArr[i3];
            }
        } catch (C9561d unused) {
            throw C6435d.m25562a();
        }
    }

    /* renamed from: b */
    public C8000e m13488b(C7997b bVar) {
        C10397a aVar = new C10397a(bVar);
        C10398b[] b = C10398b.m13500b(aVar.m13509c(), aVar.m13510b());
        int i = 0;
        for (C10398b bVar2 : b) {
            i += bVar2.m13499c();
        }
        byte[] bArr = new byte[i];
        int length = b.length;
        for (int i2 = 0; i2 < length; i2++) {
            C10398b bVar3 = b[i2];
            byte[] a = bVar3.m13501a();
            int c = bVar3.m13499c();
            m13489a(a, c);
            for (int i3 = 0; i3 < c; i3++) {
                bArr[(i3 * length) + i2] = a[i3];
            }
        }
        return C10399c.m13498a(bArr);
    }
}
