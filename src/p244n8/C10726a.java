package p244n8;

import android.net.Uri;
import com.google.android.exoplayer2.upstream.C5288a;
import com.google.android.exoplayer2.upstream.DataSource;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import p081e9.AbstractC6795x;
import p081e9.C6779m;
import p119g9.C7510a;

/* renamed from: n8.a */
/* loaded from: classes7.dex */
class C10726a implements DataSource {

    /* renamed from: a */
    private final DataSource f23783a;

    /* renamed from: b */
    private final byte[] f23784b;

    /* renamed from: c */
    private final byte[] f23785c;

    /* renamed from: d */
    private CipherInputStream f23786d;

    public C10726a(DataSource dataSource, byte[] bArr, byte[] bArr2) {
        this.f23783a = dataSource;
        this.f23784b = bArr;
        this.f23785c = bArr2;
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    /* renamed from: b */
    public final long mo12542b(C5288a aVar) {
        try {
            Cipher o = m12538o();
            try {
                o.init(2, new SecretKeySpec(this.f23784b, "AES"), new IvParameterSpec(this.f23785c));
                C6779m mVar = new C6779m(this.f23783a, aVar);
                this.f23786d = new CipherInputStream(mVar, o);
                mVar.m24352g();
                return -1L;
            } catch (InvalidAlgorithmParameterException | InvalidKeyException e) {
                throw new RuntimeException(e);
            }
        } catch (NoSuchAlgorithmException | NoSuchPaddingException e2) {
            throw new RuntimeException(e2);
        }
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    /* renamed from: c */
    public final void mo12541c(AbstractC6795x xVar) {
        C7510a.m22367e(xVar);
        this.f23783a.mo12541c(xVar);
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public void close() {
        if (this.f23786d != null) {
            this.f23786d = null;
            this.f23783a.close();
        }
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    /* renamed from: e */
    public final Map<String, List<String>> mo12540e() {
        return this.f23783a.mo12540e();
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    /* renamed from: m */
    public final Uri mo12539m() {
        return this.f23783a.mo12539m();
    }

    /* renamed from: o */
    protected Cipher m12538o() {
        return Cipher.getInstance("AES/CBC/PKCS7Padding");
    }

    @Override // p081e9.AbstractC6774h
    public final int read(byte[] bArr, int i, int i2) {
        C7510a.m22367e(this.f23786d);
        int read = this.f23786d.read(bArr, i, i2);
        if (read < 0) {
            return -1;
        }
        return read;
    }
}
