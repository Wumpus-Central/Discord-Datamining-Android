package p365u9;

import android.os.RemoteException;
import android.util.Log;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import p101fa.AbstractC7099a;
import p101fa.BinderC7100b;
import p420x9.AbstractBinderC14012r1;
import p420x9.AbstractC14015s1;
import p420x9.C14004p;

/* renamed from: u9.t */
/* loaded from: classes5.dex */
abstract class AbstractBinderC13234t extends AbstractBinderC14012r1 {

    /* renamed from: a */
    private final int f29705a;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractBinderC13234t(byte[] bArr) {
        boolean z;
        if (bArr.length == 25) {
            z = true;
        } else {
            z = false;
        }
        C14004p.m2060a(z);
        this.f29705a = Arrays.hashCode(bArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: c */
    public static byte[] m4253c(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e) {
            throw new AssertionError(e);
        }
    }

    @Override // p420x9.AbstractC14015s1
    /* renamed from: a */
    public final AbstractC7099a mo2029a() {
        return BinderC7100b.m23400e(mo4252e());
    }

    @Override // p420x9.AbstractC14015s1
    /* renamed from: d0 */
    public final int mo2028d0() {
        return this.f29705a;
    }

    /* renamed from: e */
    abstract byte[] mo4252e();

    public final boolean equals(Object obj) {
        AbstractC7099a a;
        if (obj != null && (obj instanceof AbstractC14015s1)) {
            try {
                AbstractC14015s1 s1Var = (AbstractC14015s1) obj;
                if (s1Var.mo2028d0() == this.f29705a && (a = s1Var.mo2029a()) != null) {
                    return Arrays.equals(mo4252e(), (byte[]) BinderC7100b.m23401c(a));
                }
                return false;
            } catch (RemoteException e) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e);
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f29705a;
    }
}
