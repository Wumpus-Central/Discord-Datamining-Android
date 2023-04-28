package p163j$.util.stream;

import java.util.Arrays;
import p163j$.util.AbstractC9236D;
import p163j$.util.Spliterator;
import p163j$.util.Spliterators;
import p163j$.util.function.AbstractC9290M;
import p163j$.util.function.Consumer;
import p163j$.util.function.IntFunction;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.h1 */
/* loaded from: classes2.dex */
public class C0560h1 implements AbstractC9314A0 {

    /* renamed from: a */
    final long[] f20668a;

    /* renamed from: b */
    int f20669b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0560h1(long j) {
        if (j < 2147483639) {
            this.f20668a = new long[(int) j];
            this.f20669b = 0;
            return;
        }
        throw new IllegalArgumentException("Stream size exceeds max array size");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0560h1(long[] jArr) {
        this.f20668a = jArr;
        this.f20669b = jArr.length;
    }

    @Override // p163j$.util.stream.AbstractC9319B0, p163j$.util.stream.AbstractC9324C0
    /* renamed from: a */
    public final AbstractC9319B0 mo16321a(int i) {
        throw new IndexOutOfBoundsException();
    }

    @Override // p163j$.util.stream.AbstractC9319B0
    /* renamed from: b */
    public final Object mo16343b() {
        long[] jArr = this.f20668a;
        int length = jArr.length;
        int i = this.f20669b;
        return length == i ? jArr : Arrays.copyOf(jArr, i);
    }

    @Override // p163j$.util.stream.AbstractC9324C0
    public final long count() {
        return this.f20669b;
    }

    @Override // p163j$.util.stream.AbstractC9319B0
    /* renamed from: f */
    public final void mo16342f(int i, Object obj) {
        int i2 = this.f20669b;
        System.arraycopy(this.f20668a, 0, (long[]) obj, i, i2);
    }

    @Override // p163j$.util.stream.AbstractC9324C0
    public final /* synthetic */ void forEach(Consumer consumer) {
        AbstractC0606t0.m16276d0(this, consumer);
    }

    @Override // p163j$.util.stream.AbstractC9319B0
    /* renamed from: g */
    public final void mo16341g(Object obj) {
        AbstractC9290M m = (AbstractC9290M) obj;
        for (int i = 0; i < this.f20669b; i++) {
            m.accept(this.f20668a[i]);
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
        return AbstractC0606t0.m16273g0(this, j, j2);
    }

    /* renamed from: o */
    public final /* synthetic */ void mo16320i(Long[] lArr, int i) {
        AbstractC0606t0.m16279a0(this, lArr, i);
    }

    @Override // p163j$.util.stream.AbstractC9319B0, p163j$.util.stream.AbstractC9324C0
    /* renamed from: spliterator */
    public final AbstractC9236D mo42181spliterator() {
        return Spliterators.m16585k(this.f20668a, 0, this.f20669b);
    }

    @Override // p163j$.util.stream.AbstractC9319B0, p163j$.util.stream.AbstractC9324C0
    /* renamed from: spliterator  reason: collision with other method in class */
    public final Spliterator mo42181spliterator() {
        return Spliterators.m16585k(this.f20668a, 0, this.f20669b);
    }

    public String toString() {
        long[] jArr = this.f20668a;
        return String.format("LongArrayNode[%d][%s]", Integer.valueOf(jArr.length - this.f20669b), Arrays.toString(jArr));
    }
}
