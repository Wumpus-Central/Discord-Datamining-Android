package p119g9;

import java.util.Arrays;

/* renamed from: g9.k0 */
/* loaded from: classes5.dex */
public final class C7542k0<V> {

    /* renamed from: a */
    private long[] f16338a;

    /* renamed from: b */
    private V[] f16339b;

    /* renamed from: c */
    private int f16340c;

    /* renamed from: d */
    private int f16341d;

    public C7542k0() {
        this(10);
    }

    /* renamed from: b */
    private void m22286b(long j, V v) {
        int i = this.f16340c;
        int i2 = this.f16341d;
        V[] vArr = this.f16339b;
        int length = (i + i2) % vArr.length;
        this.f16338a[length] = j;
        vArr[length] = v;
        this.f16341d = i2 + 1;
    }

    /* renamed from: d */
    private void m22284d(long j) {
        int i = this.f16341d;
        if (i > 0) {
            if (j <= this.f16338a[((this.f16340c + i) - 1) % this.f16339b.length]) {
                m22285c();
            }
        }
    }

    /* renamed from: e */
    private void m22283e() {
        int length = this.f16339b.length;
        if (this.f16341d >= length) {
            int i = length * 2;
            long[] jArr = new long[i];
            V[] vArr = (V[]) m22282f(i);
            int i2 = this.f16340c;
            int i3 = length - i2;
            System.arraycopy(this.f16338a, i2, jArr, 0, i3);
            System.arraycopy(this.f16339b, this.f16340c, vArr, 0, i3);
            int i4 = this.f16340c;
            if (i4 > 0) {
                System.arraycopy(this.f16338a, 0, jArr, i3, i4);
                System.arraycopy(this.f16339b, 0, vArr, i3, this.f16340c);
            }
            this.f16338a = jArr;
            this.f16339b = vArr;
            this.f16340c = 0;
        }
    }

    /* renamed from: f */
    private static <V> V[] m22282f(int i) {
        return (V[]) new Object[i];
    }

    /* renamed from: h */
    private V m22280h(long j, boolean z) {
        V v = null;
        long j2 = Long.MAX_VALUE;
        while (this.f16341d > 0) {
            long j3 = j - this.f16338a[this.f16340c];
            if (j3 < 0 && (z || (-j3) >= j2)) {
                break;
            }
            v = m22277k();
            j2 = j3;
        }
        return v;
    }

    /* renamed from: k */
    private V m22277k() {
        boolean z;
        if (this.f16341d > 0) {
            z = true;
        } else {
            z = false;
        }
        C7510a.m22366f(z);
        V[] vArr = this.f16339b;
        int i = this.f16340c;
        V v = vArr[i];
        vArr[i] = null;
        this.f16340c = (i + 1) % vArr.length;
        this.f16341d--;
        return v;
    }

    /* renamed from: a */
    public synchronized void m22287a(long j, V v) {
        m22284d(j);
        m22283e();
        m22286b(j, v);
    }

    /* renamed from: c */
    public synchronized void m22285c() {
        this.f16340c = 0;
        this.f16341d = 0;
        Arrays.fill(this.f16339b, (Object) null);
    }

    /* renamed from: g */
    public synchronized V m22281g(long j) {
        return m22280h(j, false);
    }

    /* renamed from: i */
    public synchronized V m22279i() {
        V v;
        if (this.f16341d == 0) {
            v = null;
        } else {
            v = m22277k();
        }
        return v;
    }

    /* renamed from: j */
    public synchronized V m22278j(long j) {
        return m22280h(j, true);
    }

    /* renamed from: l */
    public synchronized int m22276l() {
        return this.f16341d;
    }

    public C7542k0(int i) {
        this.f16338a = new long[i];
        this.f16339b = (V[]) m22282f(i);
    }
}
