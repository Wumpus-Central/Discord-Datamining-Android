package p119g9;

import java.util.NoSuchElementException;

/* renamed from: g9.n */
/* loaded from: classes5.dex */
public final class C7547n {

    /* renamed from: a */
    private int f16346a = 0;

    /* renamed from: b */
    private int f16347b = -1;

    /* renamed from: c */
    private int f16348c = 0;

    /* renamed from: d */
    private int[] f16349d;

    /* renamed from: e */
    private int f16350e;

    public C7547n() {
        int[] iArr = new int[16];
        this.f16349d = iArr;
        this.f16350e = iArr.length - 1;
    }

    /* renamed from: c */
    private void m22239c() {
        int[] iArr = this.f16349d;
        int length = iArr.length << 1;
        if (length >= 0) {
            int[] iArr2 = new int[length];
            int length2 = iArr.length;
            int i = this.f16346a;
            int i2 = length2 - i;
            System.arraycopy(iArr, i, iArr2, 0, i2);
            System.arraycopy(this.f16349d, 0, iArr2, i2, i);
            this.f16346a = 0;
            this.f16347b = this.f16348c - 1;
            this.f16349d = iArr2;
            this.f16350e = iArr2.length - 1;
            return;
        }
        throw new IllegalStateException();
    }

    /* renamed from: a */
    public void m22241a(int i) {
        if (this.f16348c == this.f16349d.length) {
            m22239c();
        }
        int i2 = (this.f16347b + 1) & this.f16350e;
        this.f16347b = i2;
        this.f16349d[i2] = i;
        this.f16348c++;
    }

    /* renamed from: b */
    public void m22240b() {
        this.f16346a = 0;
        this.f16347b = -1;
        this.f16348c = 0;
    }

    /* renamed from: d */
    public boolean m22238d() {
        return this.f16348c == 0;
    }

    /* renamed from: e */
    public int m22237e() {
        int i = this.f16348c;
        if (i != 0) {
            int[] iArr = this.f16349d;
            int i2 = this.f16346a;
            int i3 = iArr[i2];
            this.f16346a = (i2 + 1) & this.f16350e;
            this.f16348c = i - 1;
            return i3;
        }
        throw new NoSuchElementException();
    }
}
