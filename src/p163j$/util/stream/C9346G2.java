package p163j$.util.stream;

import java.util.Comparator;
import p163j$.util.Spliterator;
import p163j$.util.Spliterators;
import p163j$.util.function.Consumer;

/* renamed from: j$.util.stream.G2 */
/* loaded from: classes2.dex */
final class C9346G2 implements Spliterator {

    /* renamed from: a */
    int f20492a;

    /* renamed from: b */
    final int f20493b;

    /* renamed from: c */
    int f20494c;

    /* renamed from: d */
    final int f20495d;

    /* renamed from: e */
    Object[] f20496e;

    /* renamed from: f */
    final /* synthetic */ C9383P2 f20497f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C9346G2(C9383P2 p2, int i, int i2, int i3, int i4) {
        this.f20497f = p2;
        this.f20492a = i;
        this.f20493b = i2;
        this.f20494c = i3;
        this.f20495d = i4;
        Object[][] objArr = p2.f20545f;
        this.f20496e = objArr == null ? p2.f20544e : objArr[i];
    }

    @Override // p163j$.util.Spliterator
    public final int characteristics() {
        return 16464;
    }

    @Override // p163j$.util.Spliterator
    public final long estimateSize() {
        int i = this.f20492a;
        int i2 = this.f20495d;
        int i3 = this.f20493b;
        if (i == i3) {
            return i2 - this.f20494c;
        }
        long[] jArr = this.f20497f.f20643d;
        return ((jArr[i3] + i2) - jArr[i]) - this.f20494c;
    }

    @Override // p163j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        C9383P2 p2;
        consumer.getClass();
        int i = this.f20492a;
        int i2 = this.f20495d;
        int i3 = this.f20493b;
        if (i < i3 || (i == i3 && this.f20494c < i2)) {
            int i4 = this.f20494c;
            while (true) {
                p2 = this.f20497f;
                if (i >= i3) {
                    break;
                }
                Object[] objArr = p2.f20545f[i];
                while (i4 < objArr.length) {
                    consumer.accept(objArr[i4]);
                    i4++;
                }
                i++;
                i4 = 0;
            }
            Object[] objArr2 = this.f20492a == i3 ? this.f20496e : p2.f20545f[i3];
            while (i4 < i2) {
                consumer.accept(objArr2[i4]);
                i4++;
            }
            this.f20492a = i3;
            this.f20494c = i2;
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

    @Override // p163j$.util.Spliterator
    public final boolean tryAdvance(Consumer consumer) {
        consumer.getClass();
        int i = this.f20492a;
        int i2 = this.f20493b;
        if (i >= i2 && (i != i2 || this.f20494c >= this.f20495d)) {
            return false;
        }
        Object[] objArr = this.f20496e;
        int i3 = this.f20494c;
        this.f20494c = i3 + 1;
        consumer.accept(objArr[i3]);
        if (this.f20494c == this.f20496e.length) {
            this.f20494c = 0;
            int i4 = this.f20492a + 1;
            this.f20492a = i4;
            Object[][] objArr2 = this.f20497f.f20545f;
            if (objArr2 != null && i4 <= i2) {
                this.f20496e = objArr2[i4];
            }
        }
        return true;
    }

    @Override // p163j$.util.Spliterator
    public final Spliterator trySplit() {
        int i = this.f20492a;
        int i2 = this.f20493b;
        if (i < i2) {
            int i3 = i2 - 1;
            int i4 = this.f20494c;
            C9383P2 p2 = this.f20497f;
            C9346G2 g2 = new C9346G2(p2, i, i3, i4, p2.f20545f[i3].length);
            this.f20492a = i2;
            this.f20494c = 0;
            this.f20496e = p2.f20545f[i2];
            return g2;
        } else if (i != i2) {
            return null;
        } else {
            int i5 = this.f20494c;
            int i6 = (this.f20495d - i5) / 2;
            if (i6 == 0) {
                return null;
            }
            Spliterator l = Spliterators.m16584l(this.f20496e, i5, i5 + i6);
            this.f20494c += i6;
            return l;
        }
    }
}
