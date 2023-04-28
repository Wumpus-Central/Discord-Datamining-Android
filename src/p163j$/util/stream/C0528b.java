package p163j$.util.stream;

import p163j$.util.function.AbstractC0489d;
import p163j$.util.function.AbstractC0502q;
import p163j$.util.function.AbstractC9284G;
import p163j$.util.function.AbstractC9292O;
import p163j$.util.function.AbstractC9300X;
import p163j$.util.function.AbstractC9302Z;
import p163j$.util.function.AbstractC9304b0;
import p163j$.util.function.AbstractC9306d0;
import p163j$.util.function.BiConsumer;
import p163j$.util.function.IntFunction;
import p163j$.util.function.Supplier;
import p163j$.util.function.ToDoubleFunction;
import p163j$.util.function.ToIntFunction;
import p163j$.util.function.ToLongFunction;

/* renamed from: j$.util.stream.b */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0528b implements IntFunction, AbstractC9302Z, BiConsumer, AbstractC0502q, Supplier, ToDoubleFunction, ToIntFunction, AbstractC9284G, AbstractC9304b0, AbstractC9300X, ToLongFunction, AbstractC9306d0, AbstractC9292O, AbstractC0489d {

    /* renamed from: a */
    public final /* synthetic */ int f20617a;

    public /* synthetic */ C0528b(int i) {
        this.f20617a = i;
    }

    @Override // p163j$.util.function.AbstractC9304b0
    /* renamed from: a */
    public final void mo16406a(int i, Object obj) {
        long[] jArr = (long[]) obj;
        jArr[0] = jArr[0] + 1;
        jArr[1] = jArr[1] + i;
    }

    @Override // p163j$.util.function.AbstractC9302Z
    public final void accept(Object obj, double d) {
        switch (this.f20617a) {
            case 2:
                double[] dArr = (double[]) obj;
                AbstractC0574l.m16335a(dArr, d);
                dArr[2] = dArr[2] + d;
                return;
            default:
                double[] dArr2 = (double[]) obj;
                dArr2[2] = dArr2[2] + 1.0d;
                AbstractC0574l.m16335a(dArr2, d);
                dArr2[3] = dArr2[3] + d;
                return;
        }
    }

    @Override // p163j$.util.function.AbstractC9306d0
    public final void accept(Object obj, long j) {
        long[] jArr = (long[]) obj;
        jArr[0] = jArr[0] + 1;
        jArr[1] = jArr[1] + j;
    }

    @Override // p163j$.util.function.BiConsumer
    public final void accept(Object obj, Object obj2) {
        switch (this.f20617a) {
            case 3:
                double[] dArr = (double[]) obj;
                double[] dArr2 = (double[]) obj2;
                AbstractC0574l.m16335a(dArr, dArr2[0]);
                AbstractC0574l.m16335a(dArr, dArr2[1]);
                dArr[2] = dArr[2] + dArr2[2];
                return;
            case 7:
                double[] dArr3 = (double[]) obj;
                double[] dArr4 = (double[]) obj2;
                AbstractC0574l.m16335a(dArr3, dArr4[0]);
                AbstractC0574l.m16335a(dArr3, dArr4[1]);
                dArr3[2] = dArr3[2] + dArr4[2];
                dArr3[3] = dArr3[3] + dArr4[3];
                return;
            case 19:
                long[] jArr = (long[]) obj;
                long[] jArr2 = (long[]) obj2;
                jArr[0] = jArr[0] + jArr2[0];
                jArr[1] = jArr[1] + jArr2[1];
                return;
            default:
                long[] jArr3 = (long[]) obj;
                long[] jArr4 = (long[]) obj2;
                jArr3[0] = jArr3[0] + jArr4[0];
                jArr3[1] = jArr3[1] + jArr4[1];
                return;
        }
    }

    @Override // p163j$.util.function.BiConsumer
    public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
        switch (this.f20617a) {
            case 3:
                return biConsumer.getClass();
            case 7:
                return biConsumer.getClass();
            case 19:
                return biConsumer.getClass();
            default:
                return biConsumer.getClass();
        }
    }

    @Override // p163j$.util.function.IntFunction
    public final Object apply(int i) {
        switch (this.f20617a) {
            case 0:
                return new Object[i];
            case 1:
                return new Double[i];
            case 14:
                int i2 = C9384Q.f20546h;
                return new Object[i];
            case 20:
                return new Integer[i];
            default:
                return new Long[i];
        }
    }

    @Override // p163j$.util.function.AbstractC9292O
    public final Object apply(long j) {
        switch (this.f20617a) {
            case 27:
                return AbstractC0606t0.m16259t0(j);
            default:
                return AbstractC0606t0.m16301B0(j);
        }
    }

    @Override // p163j$.util.function.BiFunction
    public final Object apply(Object obj, Object obj2) {
        return new C9361K0((AbstractC0626y0) obj, (AbstractC0626y0) obj2);
    }

    @Override // p163j$.util.function.ToDoubleFunction
    public final double applyAsDouble(Object obj) {
        return ((Double) obj).doubleValue();
    }

    @Override // p163j$.util.function.ToIntFunction
    public final int applyAsInt(Object obj) {
        return ((Integer) obj).intValue();
    }

    @Override // p163j$.util.function.AbstractC0502q
    public final long applyAsLong(double d) {
        return 1L;
    }

    @Override // p163j$.util.function.AbstractC9284G
    public final long applyAsLong(int i) {
        return 1L;
    }

    @Override // p163j$.util.function.AbstractC9300X
    public final long applyAsLong(long j) {
        return 1L;
    }

    @Override // p163j$.util.function.ToLongFunction
    public final long applyAsLong(Object obj) {
        return ((Long) obj).longValue();
    }

    @Override // p163j$.util.function.Supplier
    public final Object get() {
        switch (this.f20617a) {
            case 5:
                return new double[4];
            case 6:
            case 7:
            case 8:
            case 14:
            case 15:
            case 16:
            default:
                return new long[2];
            case 9:
                return new double[3];
            case 10:
                return new C9338F();
            case 11:
                return new C9348H();
            case 12:
                return new C9352I();
            case 13:
                return new C9343G();
            case 17:
                return new long[2];
        }
    }
}
