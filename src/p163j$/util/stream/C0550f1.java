package p163j$.util.stream;

import java.util.ArrayDeque;
import p163j$.util.Spliterator;
import p163j$.util.function.Consumer;

/* renamed from: j$.util.stream.f1 */
/* loaded from: classes2.dex */
final class C0550f1 extends AbstractC0555g1 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C0550f1(AbstractC9324C0 c0) {
        super(c0);
    }

    @Override // p163j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        if (this.f20659a != null) {
            if (this.f20662d == null) {
                Spliterator spliterator = this.f20661c;
                if (spliterator == null) {
                    ArrayDeque d = m16366d();
                    while (true) {
                        AbstractC9324C0 c = AbstractC0555g1.m16367c(d);
                        if (c != null) {
                            c.forEach(consumer);
                        } else {
                            this.f20659a = null;
                            return;
                        }
                    }
                } else {
                    spliterator.forEachRemaining(consumer);
                }
            } else {
                do {
                } while (tryAdvance(consumer));
            }
        }
    }

    @Override // p163j$.util.Spliterator
    public final boolean tryAdvance(Consumer consumer) {
        AbstractC9324C0 c;
        if (!m16365e()) {
            return false;
        }
        boolean tryAdvance = this.f20662d.tryAdvance(consumer);
        if (!tryAdvance) {
            if (this.f20661c != null || (c = AbstractC0555g1.m16367c(this.f20663e)) == null) {
                this.f20659a = null;
            } else {
                Spliterator spliterator = c.mo42181spliterator();
                this.f20662d = spliterator;
                return spliterator.tryAdvance(consumer);
            }
        }
        return tryAdvance;
    }
}
