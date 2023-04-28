package p119g9;

/* renamed from: g9.l0 */
/* loaded from: classes5.dex */
public final class C7544l0 {

    /* renamed from: a */
    private boolean f16342a;

    /* renamed from: b */
    private long f16343b;

    /* renamed from: c */
    private long f16344c;

    /* renamed from: d */
    private long f16345d = -9223372036854775807L;

    public C7544l0(long j) {
        this.f16343b = j;
    }

    /* renamed from: f */
    public static long m22260f(long j) {
        return (j * 1000000) / 90000;
    }

    /* renamed from: i */
    public static long m22257i(long j) {
        return (j * 90000) / 1000000;
    }

    /* renamed from: j */
    public static long m22256j(long j) {
        return m22257i(j) % 8589934592L;
    }

    /* renamed from: a */
    public synchronized long m22265a(long j) {
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        if (this.f16345d != -9223372036854775807L) {
            this.f16345d = j;
        } else {
            long j2 = this.f16343b;
            if (j2 != Long.MAX_VALUE) {
                this.f16344c = j2 - j;
            }
            this.f16345d = j;
            notifyAll();
        }
        return j + this.f16344c;
    }

    /* renamed from: b */
    public synchronized long m22264b(long j) {
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        long j2 = this.f16345d;
        if (j2 != -9223372036854775807L) {
            long i = m22257i(j2);
            long j3 = (4294967296L + i) / 8589934592L;
            long j4 = ((j3 - 1) * 8589934592L) + j;
            j += j3 * 8589934592L;
            if (Math.abs(j4 - i) < Math.abs(j - i)) {
                j = j4;
            }
        }
        return m22265a(m22260f(j));
    }

    /* renamed from: c */
    public synchronized long m22263c() {
        return this.f16343b;
    }

    /* renamed from: d */
    public synchronized long m22262d() {
        long j;
        long j2 = this.f16345d;
        j = -9223372036854775807L;
        if (j2 != -9223372036854775807L) {
            j = this.f16344c + j2;
        } else {
            long j3 = this.f16343b;
            if (j3 != Long.MAX_VALUE) {
                j = j3;
            }
        }
        return j;
    }

    /* renamed from: e */
    public synchronized long m22261e() {
        long j;
        if (this.f16343b == Long.MAX_VALUE) {
            j = 0;
        } else if (this.f16345d == -9223372036854775807L) {
            j = -9223372036854775807L;
        } else {
            j = this.f16344c;
        }
        return j;
    }

    /* renamed from: g */
    public synchronized void m22259g(long j) {
        this.f16343b = j;
        this.f16345d = -9223372036854775807L;
        this.f16342a = false;
    }

    /* renamed from: h */
    public synchronized void m22258h(boolean z, long j) {
        if (z) {
            try {
                if (!this.f16342a) {
                    this.f16343b = j;
                    this.f16342a = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (!z || j != this.f16343b) {
            while (this.f16345d == -9223372036854775807L) {
                wait();
            }
        }
    }
}
