package p163j$.util.stream;

import java.util.Comparator;
import p163j$.util.AbstractC9236D;
import p163j$.util.Spliterator;
import p163j$.util.function.IntConsumer;

/* renamed from: j$.util.stream.N2 */
/* loaded from: classes2.dex */
abstract class AbstractC9375N2 implements AbstractC9236D {

    /* renamed from: a */
    int f20530a;

    /* renamed from: b */
    final int f20531b;

    /* renamed from: c */
    int f20532c;

    /* renamed from: d */
    final int f20533d;

    /* renamed from: e */
    Object f20534e;

    /* renamed from: f */
    final /* synthetic */ AbstractC9379O2 f20535f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC9375N2(AbstractC9379O2 o2, int i, int i2, int i3, int i4) {
        this.f20535f = o2;
        this.f20530a = i;
        this.f20531b = i2;
        this.f20532c = i3;
        this.f20533d = i4;
        Object[] objArr = o2.f20539f;
        this.f20534e = objArr == null ? o2.f20538e : objArr[i];
    }

    /* renamed from: c */
    abstract void mo16459c(int i, Object obj, Object obj2);

    @Override // p163j$.util.Spliterator
    public final int characteristics() {
        return 16464;
    }

    /* renamed from: d */
    abstract AbstractC9236D mo16458d(Object obj, int i, int i2);

    /* renamed from: e */
    abstract AbstractC9236D mo16457e(int i, int i2, int i3, int i4);

    @Override // p163j$.util.Spliterator
    public final long estimateSize() {
        int i = this.f20530a;
        int i2 = this.f20533d;
        int i3 = this.f20531b;
        if (i == i3) {
            return i2 - this.f20532c;
        }
        long[] jArr = this.f20535f.f20643d;
        return ((jArr[i3] + i2) - jArr[i]) - this.f20532c;
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(IntConsumer intConsumer) {
        m16455g((Object) intConsumer);
    }

    @Override // p163j$.util.AbstractC9236D
    /* renamed from: forEachRemaining */
    public final void m16455g(Object obj) {
        AbstractC9379O2 o2;
        obj.getClass();
        int i = this.f20530a;
        int i2 = this.f20533d;
        int i3 = this.f20531b;
        if (i < i3 || (i == i3 && this.f20532c < i2)) {
            int i4 = this.f20532c;
            while (true) {
                o2 = this.f20535f;
                if (i >= i3) {
                    break;
                }
                Object obj2 = o2.f20539f[i];
                o2.mo16454o(obj2, i4, o2.mo16453p(obj2), obj);
                i++;
                i4 = 0;
            }
            o2.mo16454o(this.f20530a == i3 ? this.f20534e : o2.f20539f[i3], i4, i2, obj);
            this.f20530a = i3;
            this.f20532c = i2;
        }
    }

    @Override // p163j$.util.Spliterator
    public final /* synthetic */ Comparator getComparator() {
        return Spliterator.CC.$default$getComparator(this);
    }

    @Override // p163j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return Spliterator.CC.$default$getExactSizeIfKnown(this);
    }

    @Override // p163j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return Spliterator.CC.$default$hasCharacteristics(this, i);
    }

    public /* bridge */ /* synthetic */ boolean tryAdvance(IntConsumer intConsumer) {
        return m16456f((Object) intConsumer);
    }

    @Override // p163j$.util.AbstractC9236D
    /* renamed from: tryAdvance */
    public final boolean m16456f(Object obj) {
        obj.getClass();
        int i = this.f20530a;
        int i2 = this.f20531b;
        if (i >= i2 && (i != i2 || this.f20532c >= this.f20533d)) {
            return false;
        }
        Object obj2 = this.f20534e;
        int i3 = this.f20532c;
        this.f20532c = i3 + 1;
        mo16459c(i3, obj2, obj);
        int i4 = this.f20532c;
        Object obj3 = this.f20534e;
        AbstractC9379O2 o2 = this.f20535f;
        if (i4 == o2.mo16453p(obj3)) {
            this.f20532c = 0;
            int i5 = this.f20530a + 1;
            this.f20530a = i5;
            Object[] objArr = o2.f20539f;
            if (objArr != null && i5 <= i2) {
                this.f20534e = objArr[i5];
            }
        }
        return true;
    }

    @Override // p163j$.util.AbstractC9236D, p163j$.util.Spliterator
    public final AbstractC9236D trySplit() {
        int i = this.f20530a;
        int i2 = this.f20531b;
        if (i < i2) {
            int i3 = this.f20532c;
            AbstractC9379O2 o2 = this.f20535f;
            AbstractC9236D e = mo16457e(i, i2 - 1, i3, o2.mo16453p(o2.f20539f[i2 - 1]));
            this.f20530a = i2;
            this.f20532c = 0;
            this.f20534e = o2.f20539f[i2];
            return e;
        } else if (i != i2) {
            return null;
        } else {
            int i4 = this.f20532c;
            int i5 = (this.f20533d - i4) / 2;
            if (i5 == 0) {
                return null;
            }
            AbstractC9236D d = mo16458d(this.f20534e, i4, i5);
            this.f20532c += i5;
            return d;
        }
    }
}
