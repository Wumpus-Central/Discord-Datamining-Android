package p348t7;

import p119g9.C7510a;
import p119g9.C7558r;
import p228m7.AbstractC10500b0;

/* renamed from: t7.p */
/* loaded from: classes7.dex */
public final class C12999p {

    /* renamed from: a */
    public final boolean f29198a;

    /* renamed from: b */
    public final String f29199b;

    /* renamed from: c */
    public final AbstractC10500b0.C10501a f29200c;

    /* renamed from: d */
    public final int f29201d;

    /* renamed from: e */
    public final byte[] f29202e;

    public C12999p(boolean z, String str, int i, byte[] bArr, int i2, int i3, byte[] bArr2) {
        boolean z2;
        boolean z3 = true;
        if (i == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        C7510a.m22371a((bArr2 != null ? false : z3) ^ z2);
        this.f29198a = z;
        this.f29199b = str;
        this.f29201d = i;
        this.f29202e = bArr2;
        this.f29200c = new AbstractC10500b0.C10501a(m4774a(str), bArr, i2, i3);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: a */
    private static int m4774a(String str) {
        if (str == null) {
            return 1;
        }
        char c = 65535;
        switch (str.hashCode()) {
            case 3046605:
                if (str.equals("cbc1")) {
                    c = 0;
                    break;
                }
                break;
            case 3046671:
                if (str.equals("cbcs")) {
                    c = 1;
                    break;
                }
                break;
            case 3049879:
                if (str.equals("cenc")) {
                    c = 2;
                    break;
                }
                break;
            case 3049895:
                if (str.equals("cens")) {
                    c = 3;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
            case 1:
                return 2;
            case 2:
            case 3:
                break;
            default:
                C7558r.m22104h("TrackEncryptionBox", "Unsupported protection scheme type '" + str + "'. Assuming AES-CTR crypto mode.");
                break;
        }
        return 1;
    }
}
