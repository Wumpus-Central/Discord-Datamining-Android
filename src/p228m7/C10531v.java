package p228m7;

import java.io.EOFException;
import p080e8.C6750h;
import p119g9.C7570y;
import p459z7.C14576a;

/* renamed from: m7.v */
/* loaded from: classes7.dex */
public final class C10531v {

    /* renamed from: a */
    private final C7570y f23285a = new C7570y(10);

    /* renamed from: a */
    public C14576a m12925a(AbstractC10515j jVar, C6750h.AbstractC6751a aVar) {
        C14576a aVar2 = null;
        int i = 0;
        while (true) {
            try {
                jVar.mo12930n(this.f23285a.m22012d(), 0, 10);
                this.f23285a.m22017P(0);
                if (this.f23285a.m22026G() != 4801587) {
                    break;
                }
                this.f23285a.m22016Q(3);
                int C = this.f23285a.m22030C();
                int i2 = C + 10;
                if (aVar2 == null) {
                    byte[] bArr = new byte[i2];
                    System.arraycopy(this.f23285a.m22012d(), 0, bArr, 0, 10);
                    jVar.mo12930n(bArr, 10, C);
                    aVar2 = new C6750h(aVar).m24404e(bArr, i2);
                } else {
                    jVar.mo12934i(C);
                }
                i += i2;
            } catch (EOFException unused) {
            }
        }
        jVar.mo12936f();
        jVar.mo12934i(i);
        return aVar2;
    }
}
