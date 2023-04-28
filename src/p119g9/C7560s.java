package p119g9;

import java.util.Arrays;

/* renamed from: g9.s */
/* loaded from: classes5.dex */
public final class C7560s {

    /* renamed from: a */
    private int f16385a;

    /* renamed from: b */
    private long[] f16386b;

    public C7560s() {
        this(32);
    }

    /* renamed from: a */
    public void m22094a(long j) {
        int i = this.f16385a;
        long[] jArr = this.f16386b;
        if (i == jArr.length) {
            this.f16386b = Arrays.copyOf(jArr, i * 2);
        }
        long[] jArr2 = this.f16386b;
        int i2 = this.f16385a;
        this.f16385a = i2 + 1;
        jArr2[i2] = j;
    }

    /* renamed from: b */
    public long m22093b(int i) {
        if (i >= 0 && i < this.f16385a) {
            return this.f16386b[i];
        }
        throw new IndexOutOfBoundsException("Invalid index " + i + ", size is " + this.f16385a);
    }

    /* renamed from: c */
    public int m22092c() {
        return this.f16385a;
    }

    /* renamed from: d */
    public long[] m22091d() {
        return Arrays.copyOf(this.f16386b, this.f16385a);
    }

    public C7560s(int i) {
        this.f16386b = new long[i];
    }
}
