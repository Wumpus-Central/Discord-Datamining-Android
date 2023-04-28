package p163j$.util.stream;

import java.util.Arrays;
import p163j$.util.AbstractC9236D;
import p163j$.util.Spliterator;
import p163j$.util.Spliterators;
import p163j$.util.function.AbstractC0494i;
import p163j$.util.function.Consumer;
import p163j$.util.function.IntFunction;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.P0 */
/* loaded from: classes2.dex */
public class C9381P0 implements AbstractC0626y0 {

    /* renamed from: a */
    final double[] f20541a;

    /* renamed from: b */
    int f20542b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C9381P0(long j) {
        if (j < 2147483639) {
            this.f20541a = new double[(int) j];
            this.f20542b = 0;
            return;
        }
        throw new IllegalArgumentException("Stream size exceeds max array size");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C9381P0(double[] dArr) {
        this.f20541a = dArr;
        this.f20542b = dArr.length;
    }

    @Override // p163j$.util.stream.AbstractC9319B0, p163j$.util.stream.AbstractC9324C0
    /* renamed from: a */
    public final AbstractC9319B0 mo16321a(int i) {
        throw new IndexOutOfBoundsException();
    }

    @Override // p163j$.util.stream.AbstractC9319B0
    /* renamed from: b */
    public final Object mo16343b() {
        double[] dArr = this.f20541a;
        int length = dArr.length;
        int i = this.f20542b;
        return length == i ? dArr : Arrays.copyOf(dArr, i);
    }

    @Override // p163j$.util.stream.AbstractC9324C0
    public final long count() {
        return this.f20542b;
    }

    @Override // p163j$.util.stream.AbstractC9319B0
    /* renamed from: f */
    public final void mo16342f(int i, Object obj) {
        int i2 = this.f20542b;
        System.arraycopy(this.f20541a, 0, (double[]) obj, i, i2);
    }

    @Override // p163j$.util.stream.AbstractC9324C0
    public final /* synthetic */ void forEach(Consumer consumer) {
        AbstractC0606t0.m16278b0(this, consumer);
    }

    @Override // p163j$.util.stream.AbstractC9319B0
    /* renamed from: g */
    public final void mo16341g(Object obj) {
        AbstractC0494i iVar = (AbstractC0494i) obj;
        for (int i = 0; i < this.f20542b; i++) {
            iVar.accept(this.f20541a[i]);
        }
    }

    @Override // p163j$.util.stream.AbstractC9324C0
    /* renamed from: l */
    public final /* synthetic */ int mo16319l() {
        return 0;
    }

    @Override // p163j$.util.stream.AbstractC9324C0
    /* renamed from: m */
    public final /* synthetic */ Object[] mo16318m(IntFunction intFunction) {
        return AbstractC0606t0.m16282X(this, intFunction);
    }

    @Override // p163j$.util.stream.AbstractC9324C0
    /* renamed from: n */
    public final /* synthetic */ AbstractC9324C0 mo16317n(long j, long j2, IntFunction intFunction) {
        return AbstractC0606t0.m16275e0(this, j, j2);
    }

    /* renamed from: o */
    public final /* synthetic */ void mo16320i(Double[] dArr, int i) {
        AbstractC0606t0.m16281Y(this, dArr, i);
    }

    @Override // p163j$.util.stream.AbstractC9319B0, p163j$.util.stream.AbstractC9324C0
    /* renamed from: spliterator */
    public final AbstractC9236D mo42181spliterator() {
        return Spliterators.m16586j(this.f20541a, 0, this.f20542b);
    }

    @Override // p163j$.util.stream.AbstractC9319B0, p163j$.util.stream.AbstractC9324C0
    /* renamed from: spliterator  reason: collision with other method in class */
    public final Spliterator mo42181spliterator() {
        return Spliterators.m16586j(this.f20541a, 0, this.f20542b);
    }

    public String toString() {
        double[] dArr = this.f20541a;
        return String.format("DoubleArrayNode[%d][%s]", Integer.valueOf(dArr.length - this.f20542b), Arrays.toString(dArr));
    }
}
