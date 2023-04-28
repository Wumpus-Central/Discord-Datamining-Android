package p163j$.util.stream;

import java.util.ArrayDeque;
import java.util.Comparator;
import p163j$.util.Spliterator;

/* renamed from: j$.util.stream.g1 */
/* loaded from: classes2.dex */
abstract class AbstractC0555g1 implements Spliterator {

    /* renamed from: a */
    AbstractC9324C0 f20659a;

    /* renamed from: b */
    int f20660b;

    /* renamed from: c */
    Spliterator f20661c;

    /* renamed from: d */
    Spliterator f20662d;

    /* renamed from: e */
    ArrayDeque f20663e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC0555g1(AbstractC9324C0 c0) {
        this.f20659a = c0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: c */
    public static AbstractC9324C0 m16367c(ArrayDeque arrayDeque) {
        while (true) {
            AbstractC9324C0 c0 = (AbstractC9324C0) arrayDeque.pollFirst();
            if (c0 == null) {
                return null;
            }
            if (c0.mo16319l() != 0) {
                int l = c0.mo16319l();
                while (true) {
                    l--;
                    if (l >= 0) {
                        arrayDeque.addFirst(c0.mo16321a(l));
                    }
                }
            } else if (c0.count() > 0) {
                return c0;
            }
        }
    }

    @Override // p163j$.util.Spliterator
    public final int characteristics() {
        return 64;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: d */
    public final ArrayDeque m16366d() {
        ArrayDeque arrayDeque = new ArrayDeque(8);
        int l = this.f20659a.mo16319l();
        while (true) {
            l--;
            if (l < this.f20660b) {
                return arrayDeque;
            }
            arrayDeque.addFirst(this.f20659a.mo16321a(l));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: e */
    public final boolean m16365e() {
        if (this.f20659a == null) {
            return false;
        }
        if (this.f20662d != null) {
            return true;
        }
        Spliterator spliterator = this.f20661c;
        if (spliterator == null) {
            ArrayDeque d = m16366d();
            this.f20663e = d;
            AbstractC9324C0 c = m16367c(d);
            if (c != null) {
                spliterator = c.mo42181spliterator();
            } else {
                this.f20659a = null;
                return false;
            }
        }
        this.f20662d = spliterator;
        return true;
    }

    @Override // p163j$.util.Spliterator
    public final long estimateSize() {
        long j = 0;
        if (this.f20659a == null) {
            return 0L;
        }
        Spliterator spliterator = this.f20661c;
        if (spliterator != null) {
            return spliterator.estimateSize();
        }
        for (int i = this.f20660b; i < this.f20659a.mo16319l(); i++) {
            j += this.f20659a.mo16321a(i).count();
        }
        return j;
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
    public final Spliterator trySplit() {
        AbstractC9324C0 c0 = this.f20659a;
        if (c0 == null || this.f20662d != null) {
            return null;
        }
        Spliterator spliterator = this.f20661c;
        if (spliterator != null) {
            return spliterator.trySplit();
        }
        if (this.f20660b < c0.mo16319l() - 1) {
            AbstractC9324C0 c02 = this.f20659a;
            int i = this.f20660b;
            this.f20660b = i + 1;
            return c02.mo16321a(i).mo42181spliterator();
        }
        AbstractC9324C0 a = this.f20659a.mo16321a(this.f20660b);
        this.f20659a = a;
        if (a.mo16319l() == 0) {
            Spliterator spliterator2 = this.f20659a.mo42181spliterator();
            this.f20661c = spliterator2;
            return spliterator2.trySplit();
        }
        AbstractC9324C0 c03 = this.f20659a;
        this.f20660b = 0 + 1;
        return c03.mo16321a(0).mo42181spliterator();
    }
}
