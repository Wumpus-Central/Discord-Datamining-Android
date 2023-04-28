package p163j$.util.concurrent;

import com.facebook.react.uimanager.ViewDefaults;
import java.io.ObjectStreamField;
import java.security.AccessController;
import java.security.SecureRandom;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import p163j$.util.stream.AbstractC9317A3;
import p163j$.util.stream.C0534c0;
import p163j$.util.stream.C0567j0;
import p163j$.util.stream.C9323C;

/* renamed from: j$.util.concurrent.ThreadLocalRandom */
/* loaded from: classes2.dex */
public class ThreadLocalRandom extends Random {

    /* renamed from: d */
    private static final AtomicInteger f20317d = new AtomicInteger();

    /* renamed from: e */
    private static final AtomicLong f20318e;

    /* renamed from: f */
    private static final ThreadLocal f20319f;

    /* renamed from: g */
    private static final ThreadLocal f20320g;

    /* renamed from: a */
    long f20321a;

    /* renamed from: b */
    int f20322b;

    /* renamed from: c */
    boolean f20323c = true;

    static {
        long j;
        if (((Boolean) AccessController.doPrivileged(new C9275x())).booleanValue()) {
            byte[] seed = SecureRandom.getSeed(8);
            j = seed[0] & 255;
            for (int i = 1; i < 8; i++) {
                j = (j << 8) | (seed[i] & 255);
            }
        } else {
            j = m16573h(System.nanoTime()) ^ m16573h(System.currentTimeMillis());
        }
        f20318e = new AtomicLong(j);
        f20319f = new ThreadLocal();
        f20320g = new C9276y();
        new ObjectStreamField("rnd", Long.TYPE);
        new ObjectStreamField("initialized", Boolean.TYPE);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static final int m16580a(int i) {
        int i2 = i ^ (i << 13);
        int i3 = i2 ^ (i2 >>> 17);
        int i4 = i3 ^ (i3 << 5);
        ((ThreadLocalRandom) f20320g.get()).f20322b = i4;
        return i4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static final int m16579b() {
        return ((ThreadLocalRandom) f20320g.get()).f20322b;
    }

    public static ThreadLocalRandom current() {
        ThreadLocalRandom threadLocalRandom = (ThreadLocalRandom) f20320g.get();
        if (threadLocalRandom.f20322b == 0) {
            m16575f();
        }
        return threadLocalRandom;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public static final void m16575f() {
        int addAndGet = f20317d.addAndGet(-1640531527);
        if (addAndGet == 0) {
            addAndGet = 1;
        }
        long h = m16573h(f20318e.getAndAdd(-4942790177534073029L));
        ThreadLocalRandom threadLocalRandom = (ThreadLocalRandom) f20320g.get();
        threadLocalRandom.f20321a = h;
        threadLocalRandom.f20322b = addAndGet;
    }

    /* renamed from: g */
    private static int m16574g(long j) {
        long j2 = (j ^ (j >>> 33)) * (-49064778989728563L);
        return (int) (((j2 ^ (j2 >>> 33)) * (-4265267296055464877L)) >>> 32);
    }

    /* renamed from: h */
    private static long m16573h(long j) {
        long j2 = (j ^ (j >>> 33)) * (-49064778989728563L);
        long j3 = (j2 ^ (j2 >>> 33)) * (-4265267296055464877L);
        return j3 ^ (j3 >>> 33);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public final double m16578c(double d, double d2) {
        double nextLong = (nextLong() >>> 11) * 1.1102230246251565E-16d;
        if (d >= d2) {
            return nextLong;
        }
        double d3 = ((d2 - d) * nextLong) + d;
        return d3 >= d2 ? Double.longBitsToDouble(Double.doubleToLongBits(d2) - 1) : d3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public final int m16577d(int i, int i2) {
        int i3;
        int g = m16574g(m16572i());
        if (i >= i2) {
            return g;
        }
        int i4 = i2 - i;
        int i5 = i4 - 1;
        if ((i4 & i5) == 0) {
            i3 = g & i5;
        } else if (i4 > 0) {
            int i6 = g >>> 1;
            while (true) {
                int i7 = i6 + i5;
                i3 = i6 % i4;
                if (i7 - i3 >= 0) {
                    break;
                }
                i6 = m16574g(m16572i()) >>> 1;
            }
        } else {
            while (true) {
                if (g >= i && g < i2) {
                    return g;
                }
                g = m16574g(m16572i());
            }
        }
        return i3 + i;
    }

    @Override // java.util.Random
    public final DoubleStream doubles() {
        return C9323C.m16470l(AbstractC9317A3.m16479a(new C9277z(0L, Long.MAX_VALUE, Double.MAX_VALUE, 0.0d)));
    }

    @Override // java.util.Random
    public final DoubleStream doubles(double d, double d2) {
        if (d < d2) {
            return C9323C.m16470l(AbstractC9317A3.m16479a(new C9277z(0L, Long.MAX_VALUE, d, d2)));
        }
        throw new IllegalArgumentException("bound must be greater than origin");
    }

    @Override // java.util.Random
    public final DoubleStream doubles(long j) {
        if (j >= 0) {
            return C9323C.m16470l(AbstractC9317A3.m16479a(new C9277z(0L, j, Double.MAX_VALUE, 0.0d)));
        }
        throw new IllegalArgumentException("size must be non-negative");
    }

    @Override // java.util.Random
    public final DoubleStream doubles(long j, double d, double d2) {
        if (j < 0) {
            throw new IllegalArgumentException("size must be non-negative");
        } else if (d < d2) {
            return C9323C.m16470l(AbstractC9317A3.m16479a(new C9277z(0L, j, d, d2)));
        } else {
            throw new IllegalArgumentException("bound must be greater than origin");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public final long m16576e(long j, long j2) {
        long j3;
        long h = m16573h(m16572i());
        if (j >= j2) {
            return h;
        }
        long j4 = j2 - j;
        long j5 = j4 - 1;
        if ((j4 & j5) == 0) {
            j3 = h & j5;
        } else if (j4 > 0) {
            while (true) {
                long j6 = h >>> 1;
                long j7 = j6 + j5;
                j3 = j6 % j4;
                if (j7 - j3 >= 0) {
                    break;
                }
                h = m16573h(m16572i());
            }
        } else {
            while (true) {
                if (h >= j && h < j2) {
                    return h;
                }
                h = m16573h(m16572i());
            }
        }
        return j3 + j;
    }

    /* renamed from: i */
    final long m16572i() {
        long j = this.f20321a - 7046029254386353131L;
        this.f20321a = j;
        return j;
    }

    @Override // java.util.Random
    public final IntStream ints() {
        return C0534c0.m16378l(AbstractC9317A3.m16478b(new C9252A(0L, Long.MAX_VALUE, ViewDefaults.NUMBER_OF_LINES, 0)));
    }

    @Override // java.util.Random
    public final IntStream ints(int i, int i2) {
        if (i < i2) {
            return C0534c0.m16378l(AbstractC9317A3.m16478b(new C9252A(0L, Long.MAX_VALUE, i, i2)));
        }
        throw new IllegalArgumentException("bound must be greater than origin");
    }

    @Override // java.util.Random
    public final IntStream ints(long j) {
        if (j >= 0) {
            return C0534c0.m16378l(AbstractC9317A3.m16478b(new C9252A(0L, j, ViewDefaults.NUMBER_OF_LINES, 0)));
        }
        throw new IllegalArgumentException("size must be non-negative");
    }

    @Override // java.util.Random
    public final IntStream ints(long j, int i, int i2) {
        if (j < 0) {
            throw new IllegalArgumentException("size must be non-negative");
        } else if (i < i2) {
            return C0534c0.m16378l(AbstractC9317A3.m16478b(new C9252A(0L, j, i, i2)));
        } else {
            throw new IllegalArgumentException("bound must be greater than origin");
        }
    }

    @Override // java.util.Random
    public final LongStream longs() {
        return C0567j0.m16344l(AbstractC9317A3.m16477c(new C9253B(0L, Long.MAX_VALUE, Long.MAX_VALUE, 0L)));
    }

    @Override // java.util.Random
    public final LongStream longs(long j) {
        if (j >= 0) {
            return C0567j0.m16344l(AbstractC9317A3.m16477c(new C9253B(0L, j, Long.MAX_VALUE, 0L)));
        }
        throw new IllegalArgumentException("size must be non-negative");
    }

    @Override // java.util.Random
    public final LongStream longs(long j, long j2) {
        if (j < j2) {
            return C0567j0.m16344l(AbstractC9317A3.m16477c(new C9253B(0L, Long.MAX_VALUE, j, j2)));
        }
        throw new IllegalArgumentException("bound must be greater than origin");
    }

    @Override // java.util.Random
    public final LongStream longs(long j, long j2, long j3) {
        if (j < 0) {
            throw new IllegalArgumentException("size must be non-negative");
        } else if (j2 < j3) {
            return C0567j0.m16344l(AbstractC9317A3.m16477c(new C9253B(0L, j, j2, j3)));
        } else {
            throw new IllegalArgumentException("bound must be greater than origin");
        }
    }

    @Override // java.util.Random
    protected final int next(int i) {
        return (int) (m16573h(m16572i()) >>> (64 - i));
    }

    @Override // java.util.Random
    public final boolean nextBoolean() {
        return m16574g(m16572i()) < 0;
    }

    @Override // java.util.Random
    public final double nextDouble() {
        return (m16573h(m16572i()) >>> 11) * 1.1102230246251565E-16d;
    }

    @Override // java.util.Random
    public final float nextFloat() {
        return (m16574g(m16572i()) >>> 8) * 5.9604645E-8f;
    }

    @Override // java.util.Random
    public final double nextGaussian() {
        ThreadLocal threadLocal = f20319f;
        Double d = (Double) threadLocal.get();
        if (d != null) {
            threadLocal.set(null);
            return d.doubleValue();
        }
        while (true) {
            double nextDouble = (nextDouble() * 2.0d) - 1.0d;
            double nextDouble2 = (nextDouble() * 2.0d) - 1.0d;
            double d2 = (nextDouble2 * nextDouble2) + (nextDouble * nextDouble);
            if (d2 < 1.0d && d2 != 0.0d) {
                double sqrt = StrictMath.sqrt((StrictMath.log(d2) * (-2.0d)) / d2);
                threadLocal.set(new Double(nextDouble2 * sqrt));
                return nextDouble * sqrt;
            }
        }
    }

    @Override // java.util.Random
    public final int nextInt() {
        return m16574g(m16572i());
    }

    @Override // java.util.Random
    public final int nextInt(int i) {
        if (i > 0) {
            int g = m16574g(m16572i());
            int i2 = i - 1;
            if ((i & i2) == 0) {
                return g & i2;
            }
            while (true) {
                int i3 = g >>> 1;
                int i4 = i3 + i2;
                int i5 = i3 % i;
                if (i4 - i5 >= 0) {
                    return i5;
                }
                g = m16574g(m16572i());
            }
        } else {
            throw new IllegalArgumentException("bound must be positive");
        }
    }

    public int nextInt(int i, int i2) {
        if (i < i2) {
            return m16577d(i, i2);
        }
        throw new IllegalArgumentException("bound must be greater than origin");
    }

    @Override // java.util.Random
    public final long nextLong() {
        return m16573h(m16572i());
    }

    @Override // java.util.Random
    public final void setSeed(long j) {
        if (this.f20323c) {
            throw new UnsupportedOperationException();
        }
    }
}
