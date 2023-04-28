package p163j$.util.stream;

import java.util.Comparator;
import p163j$.util.AbstractC9236D;
import p163j$.util.Spliterator;
import p163j$.util.function.IntConsumer;

/* renamed from: j$.util.stream.u3 */
/* loaded from: classes2.dex */
abstract class AbstractC9437u3 extends AbstractC9440x3 implements AbstractC9236D {
    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC9437u3(AbstractC9236D d, long j, long j2) {
        super(d, j, j2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC9437u3(AbstractC9236D d, AbstractC9437u3 u3Var) {
        super(d, u3Var);
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(IntConsumer intConsumer) {
        m16246g((Object) intConsumer);
    }

    @Override // p163j$.util.AbstractC9236D
    /* renamed from: forEachRemaining */
    public final void m16246g(Object obj) {
        obj.getClass();
        AbstractC9418Y2 y2 = null;
        while (true) {
            EnumC9439w3 m = m16240m();
            if (m != EnumC9439w3.NO_MORE) {
                EnumC9439w3 w3Var = EnumC9439w3.MAYBE_MORE;
                Spliterator spliterator = this.f20788a;
                if (m == w3Var) {
                    if (y2 == null) {
                        y2 = mo16244o();
                    } else {
                        y2.f20610b = 0;
                    }
                    long j = 0;
                    while (((AbstractC9236D) spliterator).tryAdvance(y2)) {
                        j++;
                        if (j >= 128) {
                            break;
                        }
                    }
                    if (j != 0) {
                        y2.mo16409a(obj, m16242i(j));
                    } else {
                        return;
                    }
                } else {
                    ((AbstractC9236D) spliterator).forEachRemaining(obj);
                    return;
                }
            } else {
                return;
            }
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

    /* renamed from: n */
    protected abstract void mo16245n(Object obj);

    /* renamed from: o */
    protected abstract AbstractC9418Y2 mo16244o();

    public /* bridge */ /* synthetic */ boolean tryAdvance(IntConsumer intConsumer) {
        return m16247f((Object) intConsumer);
    }

    @Override // p163j$.util.AbstractC9236D
    /* renamed from: tryAdvance */
    public final boolean m16247f(Object obj) {
        obj.getClass();
        while (m16240m() != EnumC9439w3.NO_MORE && ((AbstractC9236D) this.f20788a).tryAdvance(this)) {
            if (m16242i(1L) == 1) {
                mo16245n(obj);
                return true;
            }
        }
        return false;
    }
}
