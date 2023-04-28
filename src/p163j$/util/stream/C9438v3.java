package p163j$.util.stream;

import java.util.Comparator;
import p163j$.util.Spliterator;
import p163j$.util.function.Consumer;

/* renamed from: j$.util.stream.v3 */
/* loaded from: classes2.dex */
final class C9438v3 extends AbstractC9440x3 implements Spliterator, Consumer {

    /* renamed from: e */
    Object f20777e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C9438v3(Spliterator spliterator, long j, long j2) {
        super(spliterator, j, j2);
    }

    C9438v3(Spliterator spliterator, C9438v3 v3Var) {
        super(spliterator, v3Var);
    }

    @Override // p163j$.util.function.Consumer
    public final void accept(Object obj) {
        this.f20777e = obj;
    }

    @Override // p163j$.util.function.Consumer
    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return consumer.getClass();
    }

    @Override // p163j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        consumer.getClass();
        C9422Z2 z2 = null;
        while (true) {
            EnumC9439w3 m = m16240m();
            if (m != EnumC9439w3.NO_MORE) {
                EnumC9439w3 w3Var = EnumC9439w3.MAYBE_MORE;
                Spliterator spliterator = this.f20788a;
                if (m == w3Var) {
                    if (z2 == null) {
                        z2 = new C9422Z2();
                    } else {
                        z2.f20616a = 0;
                    }
                    long j = 0;
                    while (spliterator.tryAdvance(z2)) {
                        j++;
                        if (j >= 128) {
                            break;
                        }
                    }
                    if (j != 0) {
                        long i = m16242i(j);
                        for (int i2 = 0; i2 < i; i2++) {
                            consumer.accept(z2.f20612b[i2]);
                        }
                    } else {
                        return;
                    }
                } else {
                    spliterator.forEachRemaining(consumer);
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

    @Override // p163j$.util.stream.AbstractC9440x3
    /* renamed from: l */
    protected final Spliterator mo16241l(Spliterator spliterator) {
        return new C9438v3(spliterator, this);
    }

    @Override // p163j$.util.Spliterator
    public final boolean tryAdvance(Consumer consumer) {
        consumer.getClass();
        while (m16240m() != EnumC9439w3.NO_MORE && this.f20788a.tryAdvance(this)) {
            if (m16242i(1L) == 1) {
                consumer.accept(this.f20777e);
                this.f20777e = null;
                return true;
            }
        }
        return false;
    }
}
