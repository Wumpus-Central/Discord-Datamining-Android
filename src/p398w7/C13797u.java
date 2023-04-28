package p398w7;

import java.util.Arrays;
import p119g9.C7510a;

/* renamed from: w7.u */
/* loaded from: classes7.dex */
final class C13797u {

    /* renamed from: a */
    private final int f31046a;

    /* renamed from: b */
    private boolean f31047b;

    /* renamed from: c */
    private boolean f31048c;

    /* renamed from: d */
    public byte[] f31049d;

    /* renamed from: e */
    public int f31050e;

    public C13797u(int i, int i2) {
        this.f31046a = i;
        byte[] bArr = new byte[i2 + 3];
        this.f31049d = bArr;
        bArr[2] = 1;
    }

    /* renamed from: a */
    public void m2652a(byte[] bArr, int i, int i2) {
        if (this.f31047b) {
            int i3 = i2 - i;
            byte[] bArr2 = this.f31049d;
            int length = bArr2.length;
            int i4 = this.f31050e;
            if (length < i4 + i3) {
                this.f31049d = Arrays.copyOf(bArr2, (i4 + i3) * 2);
            }
            System.arraycopy(bArr, i, this.f31049d, this.f31050e, i3);
            this.f31050e += i3;
        }
    }

    /* renamed from: b */
    public boolean m2651b(int i) {
        if (!this.f31047b) {
            return false;
        }
        this.f31050e -= i;
        this.f31047b = false;
        this.f31048c = true;
        return true;
    }

    /* renamed from: c */
    public boolean m2650c() {
        return this.f31048c;
    }

    /* renamed from: d */
    public void m2649d() {
        this.f31047b = false;
        this.f31048c = false;
    }

    /* renamed from: e */
    public void m2648e(int i) {
        boolean z = true;
        C7510a.m22366f(!this.f31047b);
        if (i != this.f31046a) {
            z = false;
        }
        this.f31047b = z;
        if (z) {
            this.f31050e = 3;
            this.f31048c = false;
        }
    }
}
