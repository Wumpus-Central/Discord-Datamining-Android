package p152i7;

import android.media.MediaCodec;
import p119g9.C7510a;
import p119g9.C7557q0;

/* renamed from: i7.b */
/* loaded from: classes7.dex */
public final class C8216b {

    /* renamed from: a */
    public byte[] f17774a;

    /* renamed from: b */
    public byte[] f17775b;

    /* renamed from: c */
    public int f17776c;

    /* renamed from: d */
    public int[] f17777d;

    /* renamed from: e */
    public int[] f17778e;

    /* renamed from: f */
    public int f17779f;

    /* renamed from: g */
    public int f17780g;

    /* renamed from: h */
    public int f17781h;

    /* renamed from: i */
    private final MediaCodec.CryptoInfo f17782i;

    /* renamed from: j */
    private final C0255b f17783j;

    /* renamed from: i7.b$b */
    /* loaded from: classes7.dex */
    private static final class C0255b {

        /* renamed from: a */
        private final MediaCodec.CryptoInfo f17784a;

        /* renamed from: b */
        private final MediaCodec.CryptoInfo.Pattern f17785b;

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: b */
        public void m20292b(int i, int i2) {
            this.f17785b.set(i, i2);
            this.f17784a.setPattern(this.f17785b);
        }

        private C0255b(MediaCodec.CryptoInfo cryptoInfo) {
            this.f17784a = cryptoInfo;
            this.f17785b = new MediaCodec.CryptoInfo.Pattern(0, 0);
        }
    }

    public C8216b() {
        MediaCodec.CryptoInfo cryptoInfo = new MediaCodec.CryptoInfo();
        this.f17782i = cryptoInfo;
        this.f17783j = C7557q0.f16368a >= 24 ? new C0255b(cryptoInfo) : null;
    }

    /* renamed from: a */
    public MediaCodec.CryptoInfo m20296a() {
        return this.f17782i;
    }

    /* renamed from: b */
    public void m20295b(int i) {
        if (i != 0) {
            if (this.f17777d == null) {
                int[] iArr = new int[1];
                this.f17777d = iArr;
                this.f17782i.numBytesOfClearData = iArr;
            }
            int[] iArr2 = this.f17777d;
            iArr2[0] = iArr2[0] + i;
        }
    }

    /* renamed from: c */
    public void m20294c(int i, int[] iArr, int[] iArr2, byte[] bArr, byte[] bArr2, int i2, int i3, int i4) {
        this.f17779f = i;
        this.f17777d = iArr;
        this.f17778e = iArr2;
        this.f17775b = bArr;
        this.f17774a = bArr2;
        this.f17776c = i2;
        this.f17780g = i3;
        this.f17781h = i4;
        MediaCodec.CryptoInfo cryptoInfo = this.f17782i;
        cryptoInfo.numSubSamples = i;
        cryptoInfo.numBytesOfClearData = iArr;
        cryptoInfo.numBytesOfEncryptedData = iArr2;
        cryptoInfo.key = bArr;
        cryptoInfo.iv = bArr2;
        cryptoInfo.mode = i2;
        if (C7557q0.f16368a >= 24) {
            ((C0255b) C7510a.m22367e(this.f17783j)).m20292b(i3, i4);
        }
    }
}
