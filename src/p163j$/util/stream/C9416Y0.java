package p163j$.util.stream;

import java.util.Arrays;
import p163j$.util.AbstractC9236D;
import p163j$.util.Spliterator;
import p163j$.util.Spliterators;
import p163j$.util.function.Consumer;
import p163j$.util.function.IntConsumer;
import p163j$.util.function.IntFunction;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.Y0 */
/* loaded from: classes2.dex */
public class C9416Y0 implements AbstractC0630z0 {

    /* renamed from: a */
    final int[] f20607a;

    /* renamed from: b */
    int f20608b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C9416Y0(long j) {
        if (j < 2147483639) {
            this.f20607a = new int[(int) j];
            this.f20608b = 0;
            return;
        }
        throw new IllegalArgumentException("Stream size exceeds max array size");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C9416Y0(int[] iArr) {
        this.f20607a = iArr;
        this.f20608b = iArr.length;
    }

    @Override // p163j$.util.stream.AbstractC9319B0, p163j$.util.stream.AbstractC9324C0
    /* renamed from: a */
    public final AbstractC9319B0 mo16321a(int i) {
        throw new IndexOutOfBoundsException();
    }

    @Override // p163j$.util.stream.AbstractC9319B0
    /* renamed from: b */
    public final Object mo16343b() {
        int[] iArr = this.f20607a;
        int length = iArr.length;
        int i = this.f20608b;
        return length == i ? iArr : Arrays.copyOf(iArr, i);
    }

    @Override // p163j$.util.stream.AbstractC9324C0
    public final long count() {
        return this.f20608b;
    }

    @Override // p163j$.util.stream.AbstractC9319B0
    /* renamed from: f */
    public final void mo16342f(int i, Object obj) {
        int i2 = this.f20608b;
        System.arraycopy(this.f20607a, 0, (int[]) obj, i, i2);
    }

    @Override // p163j$.util.stream.AbstractC9324C0
    public final /* synthetic */ void forEach(Consumer consumer) {
        AbstractC0606t0.m16277c0(this, consumer);
    }

    @Override // p163j$.util.stream.AbstractC9319B0
    /* renamed from: g */
    public final void mo16341g(Object obj) {
        IntConsumer intConsumer = (IntConsumer) obj;
        for (int i = 0; i < this.f20608b; i++) {
            intConsumer.accept(this.f20607a[i]);
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
        return AbstractC0606t0.m16274f0(this, j, j2);
    }

    /* renamed from: o */
    public final /* synthetic */ void mo16320i(Integer[] numArr, int i) {
        AbstractC0606t0.m16280Z(this, numArr, i);
    }

    @Override // p163j$.util.stream.AbstractC9319B0, p163j$.util.stream.AbstractC9324C0
    /* renamed from: spliterator */
    public final AbstractC9236D mo42181spliterator() {
        return Spliterators.spliterator(this.f20607a, 0, this.f20608b, 1040);
    }

    @Override // p163j$.util.stream.AbstractC9319B0, p163j$.util.stream.AbstractC9324C0
    /* renamed from: spliterator  reason: collision with other method in class */
    public final Spliterator mo42181spliterator() {
        return Spliterators.spliterator(this.f20607a, 0, this.f20608b, 1040);
    }

    public String toString() {
        int[] iArr = this.f20607a;
        return String.format("IntArrayNode[%d][%s]", Integer.valueOf(iArr.length - this.f20608b), Arrays.toString(iArr));
    }
}
