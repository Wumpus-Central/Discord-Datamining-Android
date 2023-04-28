package p163j$.util.stream;

import p163j$.util.AbstractC9234B;
import p163j$.util.AbstractC9447y;
import p163j$.util.Spliterator;
import p163j$.util.function.AbstractC0494i;
import p163j$.util.function.AbstractC9290M;
import p163j$.util.function.C0497l;
import p163j$.util.function.C9279B;
import p163j$.util.function.C9293P;
import p163j$.util.function.Consumer;
import p163j$.util.function.IntConsumer;
import p163j$.util.function.IntFunction;
import p163j$.util.function.Predicate;

/* renamed from: j$.util.stream.t0 */
/* loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC0606t0 implements AbstractC9332D3 {

    /* renamed from: a */
    private static final C9404V0 f20752a = new C9404V0();

    /* renamed from: b */
    private static final AbstractC0630z0 f20753b = new C9396T0();

    /* renamed from: c */
    private static final AbstractC9314A0 f20754c = new C9400U0();

    /* renamed from: d */
    private static final AbstractC0626y0 f20755d = new C9392S0();

    /* renamed from: e */
    private static final int[] f20756e = new int[0];

    /* renamed from: f */
    private static final long[] f20757f = new long[0];

    /* renamed from: g */
    private static final double[] f20758g = new double[0];

    public /* synthetic */ AbstractC0606t0() {
    }

    public /* synthetic */ AbstractC0606t0(EnumC9398T2 t2) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: B0 */
    public static AbstractC0614v0 m16301B0(long j) {
        return (j < 0 || j >= 2147483639) ? new C0525a1() : new C9420Z0(j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: C0 */
    public static AbstractC0618w0 m16300C0(long j) {
        return (j < 0 || j >= 2147483639) ? new C0568j1() : new C0564i1(j);
    }

    /* renamed from: D0 */
    public static C0598r0 m16299D0(C0497l lVar, EnumC0595q0 q0Var) {
        lVar.getClass();
        q0Var.getClass();
        return new C0598r0(EnumC9398T2.DOUBLE_VALUE, q0Var, new C0578m(3, q0Var, lVar));
    }

    /* renamed from: E0 */
    public static C0598r0 m16298E0(C9279B b, EnumC0595q0 q0Var) {
        b.getClass();
        q0Var.getClass();
        return new C0598r0(EnumC9398T2.INT_VALUE, q0Var, new C0578m(1, q0Var, b));
    }

    /* renamed from: F0 */
    public static C0598r0 m16297F0(C9293P p, EnumC0595q0 q0Var) {
        p.getClass();
        q0Var.getClass();
        return new C0598r0(EnumC9398T2.LONG_VALUE, q0Var, new C0578m(4, q0Var, p));
    }

    /* renamed from: H0 */
    public static C0598r0 m16295H0(Predicate predicate, EnumC0595q0 q0Var) {
        predicate.getClass();
        q0Var.getClass();
        return new C0598r0(EnumC9398T2.REFERENCE, q0Var, new C0578m(2, q0Var, predicate));
    }

    /* renamed from: O */
    public static void m16291O() {
        throw new IllegalStateException("called wrong accept method");
    }

    /* renamed from: P */
    public static void m16290P(AbstractC0531b2 b2Var, Double d) {
        if (!AbstractC9347G3.f20498a) {
            b2Var.accept(d.doubleValue());
        } else {
            AbstractC9347G3.m16469a(b2Var.getClass(), "{0} calling Sink.OfDouble.accept(Double)");
            throw null;
        }
    }

    /* renamed from: R */
    public static void m16288R(AbstractC0536c2 c2Var, Integer num) {
        if (!AbstractC9347G3.f20498a) {
            c2Var.accept(num.intValue());
        } else {
            AbstractC9347G3.m16469a(c2Var.getClass(), "{0} calling Sink.OfInt.accept(Integer)");
            throw null;
        }
    }

    /* renamed from: T */
    public static void m16286T(AbstractC0541d2 d2Var, Long l) {
        if (!AbstractC9347G3.f20498a) {
            d2Var.accept(l.longValue());
        } else {
            AbstractC9347G3.m16469a(d2Var.getClass(), "{0} calling Sink.OfLong.accept(Long)");
            throw null;
        }
    }

    /* renamed from: V */
    public static void m16284V() {
        throw new IllegalStateException("called wrong accept method");
    }

    /* renamed from: W */
    public static void m16283W() {
        throw new IllegalStateException("called wrong accept method");
    }

    /* renamed from: X */
    public static Object[] m16282X(AbstractC9319B0 b0, IntFunction intFunction) {
        if (AbstractC9347G3.f20498a) {
            AbstractC9347G3.m16469a(b0.getClass(), "{0} calling Node.OfPrimitive.asArray");
            throw null;
        } else if (b0.count() < 2147483639) {
            Object[] objArr = (Object[]) intFunction.apply((int) b0.count());
            b0.mo16320i(objArr, 0);
            return objArr;
        } else {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
    }

    /* renamed from: Y */
    public static void m16281Y(AbstractC0626y0 y0Var, Double[] dArr, int i) {
        if (!AbstractC9347G3.f20498a) {
            double[] dArr2 = (double[]) y0Var.mo16343b();
            for (int i2 = 0; i2 < dArr2.length; i2++) {
                dArr[i + i2] = Double.valueOf(dArr2[i2]);
            }
            return;
        }
        AbstractC9347G3.m16469a(y0Var.getClass(), "{0} calling Node.OfDouble.copyInto(Double[], int)");
        throw null;
    }

    /* renamed from: Z */
    public static void m16280Z(AbstractC0630z0 z0Var, Integer[] numArr, int i) {
        if (!AbstractC9347G3.f20498a) {
            int[] iArr = (int[]) z0Var.mo16343b();
            for (int i2 = 0; i2 < iArr.length; i2++) {
                numArr[i + i2] = Integer.valueOf(iArr[i2]);
            }
            return;
        }
        AbstractC9347G3.m16469a(z0Var.getClass(), "{0} calling Node.OfInt.copyInto(Integer[], int)");
        throw null;
    }

    /* renamed from: a0 */
    public static void m16279a0(AbstractC9314A0 a0, Long[] lArr, int i) {
        if (!AbstractC9347G3.f20498a) {
            long[] jArr = (long[]) a0.mo16343b();
            for (int i2 = 0; i2 < jArr.length; i2++) {
                lArr[i + i2] = Long.valueOf(jArr[i2]);
            }
            return;
        }
        AbstractC9347G3.m16469a(a0.getClass(), "{0} calling Node.OfInt.copyInto(Long[], int)");
        throw null;
    }

    /* renamed from: b0 */
    public static void m16278b0(AbstractC0626y0 y0Var, Consumer consumer) {
        if (consumer instanceof AbstractC0494i) {
            y0Var.mo16341g((AbstractC0494i) consumer);
        } else if (!AbstractC9347G3.f20498a) {
            ((AbstractC9447y) y0Var.mo42181spliterator()).forEachRemaining(consumer);
        } else {
            AbstractC9347G3.m16469a(y0Var.getClass(), "{0} calling Node.OfLong.forEachRemaining(Consumer)");
            throw null;
        }
    }

    /* renamed from: c0 */
    public static void m16277c0(AbstractC0630z0 z0Var, Consumer consumer) {
        if (consumer instanceof IntConsumer) {
            z0Var.mo16341g((IntConsumer) consumer);
        } else if (!AbstractC9347G3.f20498a) {
            ((Spliterator.OfInt) z0Var.mo42181spliterator()).forEachRemaining(consumer);
        } else {
            AbstractC9347G3.m16469a(z0Var.getClass(), "{0} calling Node.OfInt.forEachRemaining(Consumer)");
            throw null;
        }
    }

    /* renamed from: d0 */
    public static void m16276d0(AbstractC9314A0 a0, Consumer consumer) {
        if (consumer instanceof AbstractC9290M) {
            a0.mo16341g((AbstractC9290M) consumer);
        } else if (!AbstractC9347G3.f20498a) {
            ((AbstractC9234B) a0.mo42181spliterator()).forEachRemaining(consumer);
        } else {
            AbstractC9347G3.m16469a(a0.getClass(), "{0} calling Node.OfLong.forEachRemaining(Consumer)");
            throw null;
        }
    }

    /* renamed from: e0 */
    public static AbstractC0626y0 m16275e0(AbstractC0626y0 y0Var, long j, long j2) {
        if (j == 0 && j2 == y0Var.count()) {
            return y0Var;
        }
        long j3 = j2 - j;
        AbstractC9447y yVar = (AbstractC9447y) y0Var.mo42181spliterator();
        AbstractC0610u0 t0 = m16259t0(j3);
        t0.mo16235c(j3);
        for (int i = 0; i < j && yVar.mo16225f(new C9424i3(1)); i++) {
        }
        for (int i2 = 0; i2 < j3 && yVar.mo16225f(t0); i2++) {
        }
        t0.end();
        return t0.mo42182build();
    }

    /* renamed from: f0 */
    public static AbstractC0630z0 m16274f0(AbstractC0630z0 z0Var, long j, long j2) {
        if (j == 0 && j2 == z0Var.count()) {
            return z0Var;
        }
        long j3 = j2 - j;
        Spliterator.OfInt ofInt = (Spliterator.OfInt) z0Var.mo42181spliterator();
        AbstractC0614v0 B0 = m16301B0(j3);
        B0.mo16235c(j3);
        for (int i = 0; i < j && ofInt.tryAdvance((IntConsumer) new C9426k3(1)); i++) {
        }
        for (int i2 = 0; i2 < j3 && ofInt.tryAdvance((IntConsumer) B0); i2++) {
        }
        B0.end();
        return B0.mo42182build();
    }

    /* renamed from: g0 */
    public static AbstractC9314A0 m16273g0(AbstractC9314A0 a0, long j, long j2) {
        if (j == 0 && j2 == a0.count()) {
            return a0;
        }
        long j3 = j2 - j;
        AbstractC9234B b = (AbstractC9234B) a0.mo42181spliterator();
        AbstractC0618w0 C0 = m16300C0(j3);
        C0.mo16235c(j3);
        for (int i = 0; i < j && b.mo16361b(new C9428m3(1)); i++) {
        }
        for (int i2 = 0; i2 < j3 && b.mo16361b(C0); i2++) {
        }
        C0.end();
        return C0.mo42182build();
    }

    /* renamed from: h0 */
    public static AbstractC9324C0 m16272h0(AbstractC9324C0 c0, long j, long j2, IntFunction intFunction) {
        if (j == 0 && j2 == c0.count()) {
            return c0;
        }
        Spliterator spliterator = c0.mo42181spliterator();
        long j3 = j2 - j;
        AbstractC0622x0 l0 = m16267l0(j3, intFunction);
        l0.mo16235c(j3);
        for (int i = 0; i < j && spliterator.tryAdvance(new C9399U(9)); i++) {
        }
        for (int i2 = 0; i2 < j3 && spliterator.tryAdvance(l0); i2++) {
        }
        l0.end();
        return l0.mo42182build();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l0 */
    public static AbstractC0622x0 m16267l0(long j, IntFunction intFunction) {
        return (j < 0 || j >= 2147483639) ? new C0592p1() : new C9412X0(j, intFunction);
    }

    /* renamed from: m0 */
    public static AbstractC9324C0 m16266m0(AbstractC0606t0 t0Var, Spliterator spliterator, boolean z, IntFunction intFunction) {
        long v0 = t0Var.mo16257v0(spliterator);
        if (v0 < 0 || !spliterator.hasCharacteristics(Spliterator.SUBSIZED)) {
            AbstractC9324C0 c0 = (AbstractC9324C0) new C9349H0(spliterator, intFunction, t0Var).invoke();
            return z ? m16256w0(c0, intFunction) : c0;
        } else if (v0 < 2147483639) {
            Object[] objArr = (Object[]) intFunction.apply((int) v0);
            new C0584n1(spliterator, t0Var, objArr).invoke();
            return new C9339F0(objArr);
        } else {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
    }

    /* renamed from: n0 */
    public static AbstractC0626y0 m16265n0(AbstractC0606t0 t0Var, Spliterator spliterator, boolean z) {
        long v0 = t0Var.mo16257v0(spliterator);
        if (v0 < 0 || !spliterator.hasCharacteristics(Spliterator.SUBSIZED)) {
            AbstractC0626y0 y0Var = (AbstractC0626y0) new C9349H0(0, spliterator, t0Var).invoke();
            return z ? m16255x0(y0Var) : y0Var;
        } else if (v0 < 2147483639) {
            double[] dArr = new double[(int) v0];
            new C0572k1(spliterator, t0Var, dArr).invoke();
            return new C9381P0(dArr);
        } else {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
    }

    /* renamed from: o0 */
    public static AbstractC0630z0 m16264o0(AbstractC0606t0 t0Var, Spliterator spliterator, boolean z) {
        long v0 = t0Var.mo16257v0(spliterator);
        if (v0 < 0 || !spliterator.hasCharacteristics(Spliterator.SUBSIZED)) {
            AbstractC0630z0 z0Var = (AbstractC0630z0) new C9349H0(1, spliterator, t0Var).invoke();
            return z ? m16253y0(z0Var) : z0Var;
        } else if (v0 < 2147483639) {
            int[] iArr = new int[(int) v0];
            new C0576l1(spliterator, t0Var, iArr).invoke();
            return new C9416Y0(iArr);
        } else {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
    }

    /* renamed from: p0 */
    public static AbstractC9314A0 m16263p0(AbstractC0606t0 t0Var, Spliterator spliterator, boolean z) {
        long v0 = t0Var.mo16257v0(spliterator);
        if (v0 < 0 || !spliterator.hasCharacteristics(Spliterator.SUBSIZED)) {
            AbstractC9314A0 a0 = (AbstractC9314A0) new C9349H0(2, spliterator, t0Var).invoke();
            return z ? m16252z0(a0) : a0;
        } else if (v0 < 2147483639) {
            long[] jArr = new long[(int) v0];
            new C0580m1(spliterator, t0Var, jArr).invoke();
            return new C0560h1(jArr);
        } else {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q0 */
    public static AbstractC9334E0 m16262q0(EnumC9398T2 t2, AbstractC9324C0 c0, AbstractC9324C0 c02) {
        int i = AbstractC9329D0.f20463a[t2.ordinal()];
        if (i == 1) {
            return new C9377O0(c0, c02);
        }
        if (i == 2) {
            return new C9365L0((AbstractC0630z0) c0, (AbstractC0630z0) c02);
        }
        if (i == 3) {
            return new C9369M0((AbstractC9314A0) c0, (AbstractC9314A0) c02);
        }
        if (i == 4) {
            return new C9361K0((AbstractC0626y0) c0, (AbstractC0626y0) c02);
        }
        throw new IllegalStateException("Unknown shape " + t2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: t0 */
    public static AbstractC0610u0 m16259t0(long j) {
        return (j < 0 || j >= 2147483639) ? new C9388R0() : new C9385Q0(j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: u0 */
    public static AbstractC9408W0 m16258u0(EnumC9398T2 t2) {
        AbstractC9319B0 b0;
        int i = AbstractC9329D0.f20463a[t2.ordinal()];
        if (i == 1) {
            return f20752a;
        }
        if (i == 2) {
            b0 = f20753b;
        } else if (i == 3) {
            b0 = f20754c;
        } else if (i == 4) {
            b0 = f20755d;
        } else {
            throw new IllegalStateException("Unknown shape " + t2);
        }
        return (AbstractC9408W0) b0;
    }

    /* renamed from: w0 */
    public static AbstractC9324C0 m16256w0(AbstractC9324C0 c0, IntFunction intFunction) {
        if (c0.mo16319l() <= 0) {
            return c0;
        }
        long count = c0.count();
        if (count < 2147483639) {
            Object[] objArr = (Object[]) intFunction.apply((int) count);
            new C0603s1(c0, objArr).invoke();
            return new C9339F0(objArr);
        }
        throw new IllegalArgumentException("Stream size exceeds max array size");
    }

    /* renamed from: x0 */
    public static AbstractC0626y0 m16255x0(AbstractC0626y0 y0Var) {
        if (y0Var.mo16319l() <= 0) {
            return y0Var;
        }
        long count = y0Var.count();
        if (count < 2147483639) {
            double[] dArr = new double[(int) count];
            new C0596q1(y0Var, dArr).invoke();
            return new C9381P0(dArr);
        }
        throw new IllegalArgumentException("Stream size exceeds max array size");
    }

    /* renamed from: y0 */
    public static AbstractC0630z0 m16253y0(AbstractC0630z0 z0Var) {
        if (z0Var.mo16319l() <= 0) {
            return z0Var;
        }
        long count = z0Var.count();
        if (count < 2147483639) {
            int[] iArr = new int[(int) count];
            new C0599r1(z0Var, iArr).invoke();
            return new C9416Y0(iArr);
        }
        throw new IllegalArgumentException("Stream size exceeds max array size");
    }

    /* renamed from: z0 */
    public static AbstractC9314A0 m16252z0(AbstractC9314A0 a0) {
        if (a0.mo16319l() <= 0) {
            return a0;
        }
        long count = a0.count();
        if (count < 2147483639) {
            long[] jArr = new long[(int) count];
            new C0596q1(a0, jArr).invoke();
            return new C0560h1(jArr);
        }
        throw new IllegalArgumentException("Stream size exceeds max array size");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: A0 */
    public abstract int mo16302A0();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: G0 */
    public abstract AbstractC0622x0 mo16296G0(long j, IntFunction intFunction);

    /* renamed from: I0 */
    public abstract AbstractC9374N1 mo16237I0();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: J0 */
    public abstract AbstractC0546e2 mo16294J0(Spliterator spliterator, AbstractC0546e2 e2Var);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: K0 */
    public abstract AbstractC0546e2 mo16293K0(AbstractC0546e2 e2Var);

    @Override // p163j$.util.stream.AbstractC9332D3
    /* renamed from: N */
    public Object mo16292N(AbstractC0606t0 t0Var, Spliterator spliterator) {
        AbstractC9374N1 I0 = mo16237I0();
        t0Var.mo16294J0(spliterator, I0);
        return I0.get();
    }

    @Override // p163j$.util.stream.AbstractC9332D3
    /* renamed from: l */
    public Object mo16268l(AbstractC0606t0 t0Var, Spliterator spliterator) {
        return ((AbstractC9374N1) new C9382P1(this, t0Var, spliterator).invoke()).get();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r0 */
    public abstract void mo16261r0(Spliterator spliterator, AbstractC0546e2 e2Var);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s0 */
    public abstract void mo16260s0(Spliterator spliterator, AbstractC0546e2 e2Var);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: v0 */
    public abstract long mo16257v0(Spliterator spliterator);

    @Override // p163j$.util.stream.AbstractC9332D3
    /* renamed from: y */
    public /* synthetic */ int mo16254y() {
        return 0;
    }
}
