package p163j$.util.stream;

import java.util.ArrayDeque;
import p163j$.util.AbstractC9236D;
import p163j$.util.Spliterator;
import p163j$.util.function.IntConsumer;

/* renamed from: j$.util.stream.e1 */
/* loaded from: classes2.dex */
abstract class AbstractC0545e1 extends AbstractC0555g1 implements AbstractC9236D {
    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC0545e1(AbstractC9319B0 b0) {
        super(b0);
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(IntConsumer intConsumer) {
        m16373g((Object) intConsumer);
    }

    @Override // p163j$.util.AbstractC9236D
    /* renamed from: forEachRemaining */
    public final void m16373g(Object obj) {
        if (this.f20659a != null) {
            if (this.f20662d == null) {
                Spliterator spliterator = this.f20661c;
                if (spliterator == null) {
                    ArrayDeque d = m16366d();
                    while (true) {
                        AbstractC9319B0 b0 = (AbstractC9319B0) AbstractC0555g1.m16367c(d);
                        if (b0 != null) {
                            b0.mo16341g(obj);
                        } else {
                            this.f20659a = null;
                            return;
                        }
                    }
                } else {
                    ((AbstractC9236D) spliterator).forEachRemaining(obj);
                }
            } else {
                do {
                } while (m16374f(obj));
            }
        }
    }

    public /* bridge */ /* synthetic */ boolean tryAdvance(IntConsumer intConsumer) {
        return m16374f((Object) intConsumer);
    }

    @Override // p163j$.util.AbstractC9236D
    /* renamed from: tryAdvance */
    public final boolean m16374f(Object obj) {
        AbstractC9319B0 b0;
        if (!m16365e()) {
            return false;
        }
        boolean tryAdvance = ((AbstractC9236D) this.f20662d).tryAdvance(obj);
        if (!tryAdvance) {
            if (this.f20661c != null || (b0 = (AbstractC9319B0) AbstractC0555g1.m16367c(this.f20663e)) == null) {
                this.f20659a = null;
            } else {
                AbstractC9236D spliterator = b0.mo42181spliterator();
                this.f20662d = spliterator;
                return spliterator.tryAdvance(obj);
            }
        }
        return tryAdvance;
    }
}
