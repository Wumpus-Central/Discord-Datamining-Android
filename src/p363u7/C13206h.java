package p363u7;

import java.util.Arrays;
import p079e7.C6722k;
import p117g7.C7469m0;
import p119g9.C7510a;
import p119g9.C7570y;
import p363u7.AbstractC13207i;

/* renamed from: u7.h */
/* loaded from: classes7.dex */
final class C13206h extends AbstractC13207i {

    /* renamed from: o */
    private static final byte[] f29633o = {79, 112, 117, 115, 72, 101, 97, 100};

    /* renamed from: n */
    private boolean f29634n;

    /* renamed from: n */
    private long m4332n(byte[] bArr) {
        int i;
        int i2;
        int i3 = bArr[0] & 255;
        int i4 = i3 & 3;
        if (i4 != 0) {
            i = 2;
            if (!(i4 == 1 || i4 == 2)) {
                i = bArr[1] & 63;
            }
        } else {
            i = 1;
        }
        int i5 = i3 >> 3;
        int i6 = i5 & 3;
        if (i5 >= 16) {
            i2 = 2500 << i6;
        } else if (i5 >= 12) {
            i2 = 10000 << (i6 & 1);
        } else if (i6 == 3) {
            i2 = 60000;
        } else {
            i2 = 10000 << i6;
        }
        return i * i2;
    }

    /* renamed from: o */
    public static boolean m4331o(C7570y yVar) {
        int a = yVar.m22015a();
        byte[] bArr = f29633o;
        if (a < bArr.length) {
            return false;
        }
        byte[] bArr2 = new byte[bArr.length];
        yVar.m22006j(bArr2, 0, bArr.length);
        return Arrays.equals(bArr2, bArr);
    }

    @Override // p363u7.AbstractC13207i
    /* renamed from: f */
    protected long mo4317f(C7570y yVar) {
        return m4328c(m4332n(yVar.m22012d()));
    }

    @Override // p363u7.AbstractC13207i
    /* renamed from: h */
    protected boolean mo4316h(C7570y yVar, long j, AbstractC13207i.C13209b bVar) {
        boolean z = true;
        if (!this.f29634n) {
            byte[] copyOf = Arrays.copyOf(yVar.m22012d(), yVar.m22010f());
            bVar.f29648a = new C6722k.C6724b().m24488e0("audio/opus").m24516H(C7469m0.m22560c(copyOf)).m24486f0(48000).m24504T(C7469m0.m22562a(copyOf)).m24519E();
            this.f29634n = true;
            return true;
        }
        C7510a.m22367e(bVar.f29648a);
        if (yVar.m22002n() != 1332770163) {
            z = false;
        }
        yVar.m22017P(0);
        return z;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p363u7.AbstractC13207i
    /* renamed from: l */
    public void mo4315l(boolean z) {
        super.mo4315l(z);
        if (z) {
            this.f29634n = false;
        }
    }
}
