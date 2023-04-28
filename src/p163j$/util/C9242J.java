package p163j$.util;

import java.util.Comparator;
import p163j$.util.Spliterator;
import p163j$.util.function.AbstractC0494i;
import p163j$.util.function.Consumer;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.J */
/* loaded from: classes2.dex */
public final class C9242J implements AbstractC9447y {

    /* renamed from: a */
    private final double[] f20280a;

    /* renamed from: b */
    private int f20281b;

    /* renamed from: c */
    private final int f20282c;

    /* renamed from: d */
    private final int f20283d;

    public C9242J(double[] dArr, int i, int i2, int i3) {
        this.f20280a = dArr;
        this.f20281b = i;
        this.f20282c = i2;
        this.f20283d = i3 | 64 | Spliterator.SUBSIZED;
    }

    @Override // p163j$.util.Spliterator
    public final int characteristics() {
        return this.f20283d;
    }

    @Override // p163j$.util.Spliterator
    public final long estimateSize() {
        return this.f20282c - this.f20281b;
    }

    @Override // p163j$.util.AbstractC9447y
    /* renamed from: f */
    public final boolean tryAdvance(AbstractC0494i iVar) {
        iVar.getClass();
        int i = this.f20281b;
        if (i < 0 || i >= this.f20282c) {
            return false;
        }
        this.f20281b = i + 1;
        iVar.accept(this.f20280a[i]);
        return true;
    }

    @Override // p163j$.util.AbstractC9447y, p163j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC0518n.m16489c(this, consumer);
    }

    @Override // p163j$.util.AbstractC9447y
    /* renamed from: g */
    public final void forEachRemaining(AbstractC0494i iVar) {
        int i;
        iVar.getClass();
        double[] dArr = this.f20280a;
        int length = dArr.length;
        int i2 = this.f20282c;
        if (length >= i2 && (i = this.f20281b) >= 0) {
            this.f20281b = i2;
            if (i < i2) {
                do {
                    iVar.accept(dArr[i]);
                    i++;
                } while (i < i2);
            }
        }
    }

    @Override // p163j$.util.Spliterator
    public final Comparator getComparator() {
        if (Spliterator.CC.$default$hasCharacteristics(this, 4)) {
            return null;
        }
        throw new IllegalStateException();
    }

    @Override // p163j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return Spliterator.CC.$default$getExactSizeIfKnown(this);
    }

    @Override // p163j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return Spliterator.CC.$default$hasCharacteristics(this, i);
    }

    @Override // p163j$.util.AbstractC9447y, p163j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return AbstractC0518n.m16486h(this, consumer);
    }

    @Override // p163j$.util.AbstractC9447y, p163j$.util.AbstractC9236D, p163j$.util.Spliterator
    public final AbstractC9447y trySplit() {
        int i = this.f20281b;
        int i2 = (this.f20282c + i) >>> 1;
        if (i >= i2) {
            return null;
        }
        this.f20281b = i2;
        return new C9242J(this.f20280a, i, i2, this.f20283d);
    }
}
