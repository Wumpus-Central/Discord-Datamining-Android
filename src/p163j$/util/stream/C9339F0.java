package p163j$.util.stream;

import java.util.Arrays;
import p163j$.util.Spliterator;
import p163j$.util.Spliterators;
import p163j$.util.function.Consumer;
import p163j$.util.function.IntFunction;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.F0 */
/* loaded from: classes2.dex */
public class C9339F0 implements AbstractC9324C0 {

    /* renamed from: a */
    final Object[] f20482a;

    /* renamed from: b */
    int f20483b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C9339F0(long j, IntFunction intFunction) {
        if (j < 2147483639) {
            this.f20482a = (Object[]) intFunction.apply((int) j);
            this.f20483b = 0;
            return;
        }
        throw new IllegalArgumentException("Stream size exceeds max array size");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C9339F0(Object[] objArr) {
        this.f20482a = objArr;
        this.f20483b = objArr.length;
    }

    @Override // p163j$.util.stream.AbstractC9324C0
    /* renamed from: a */
    public final AbstractC9324C0 mo16321a(int i) {
        throw new IndexOutOfBoundsException();
    }

    @Override // p163j$.util.stream.AbstractC9324C0
    public final long count() {
        return this.f20483b;
    }

    @Override // p163j$.util.stream.AbstractC9324C0
    public final void forEach(Consumer consumer) {
        for (int i = 0; i < this.f20483b; i++) {
            consumer.accept(this.f20482a[i]);
        }
    }

    @Override // p163j$.util.stream.AbstractC9324C0
    /* renamed from: i */
    public final void mo16320i(Object[] objArr, int i) {
        System.arraycopy(this.f20482a, 0, objArr, i, this.f20483b);
    }

    @Override // p163j$.util.stream.AbstractC9324C0
    /* renamed from: l */
    public final /* synthetic */ int mo16319l() {
        return 0;
    }

    @Override // p163j$.util.stream.AbstractC9324C0
    /* renamed from: m */
    public final Object[] mo16318m(IntFunction intFunction) {
        Object[] objArr = this.f20482a;
        if (objArr.length == this.f20483b) {
            return objArr;
        }
        throw new IllegalStateException();
    }

    @Override // p163j$.util.stream.AbstractC9324C0
    /* renamed from: n */
    public final /* synthetic */ AbstractC9324C0 mo16317n(long j, long j2, IntFunction intFunction) {
        return AbstractC0606t0.m16272h0(this, j, j2, intFunction);
    }

    @Override // p163j$.util.stream.AbstractC9324C0
    /* renamed from: spliterator */
    public final Spliterator mo42181spliterator() {
        return Spliterators.m16584l(this.f20482a, 0, this.f20483b);
    }

    public String toString() {
        Object[] objArr = this.f20482a;
        return String.format("ArrayNode[%d][%s]", Integer.valueOf(objArr.length - this.f20483b), Arrays.toString(objArr));
    }
}
