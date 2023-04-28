package p163j$.util.stream;

import p163j$.util.Spliterator;
import p163j$.util.function.Consumer;

/* renamed from: j$.util.stream.z3 */
/* loaded from: classes2.dex */
final class C9442z3 extends AbstractC9402U2 {
    C9442z3(AbstractC0606t0 t0Var, Spliterator spliterator, boolean z) {
        super(t0Var, spliterator, z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C9442z3(AbstractC0606t0 t0Var, C0523a aVar, boolean z) {
        super(t0Var, aVar, z);
    }

    @Override // p163j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        if (this.f20598h != null || this.f20599i) {
            do {
            } while (tryAdvance(consumer));
            return;
        }
        consumer.getClass();
        m16431e();
        C9441y3 y3Var = new C9441y3(consumer, 1);
        this.f20592b.mo16294J0(this.f20594d, y3Var);
        this.f20599i = true;
    }

    @Override // p163j$.util.stream.AbstractC9402U2
    /* renamed from: h */
    final void mo16229h() {
        C9383P2 p2 = new C9383P2();
        this.f20598h = p2;
        this.f20595e = this.f20592b.mo16293K0(new C9441y3(p2, 0));
        this.f20596f = new C0523a(7, this);
    }

    @Override // p163j$.util.stream.AbstractC9402U2
    /* renamed from: i */
    final AbstractC9402U2 mo16228i(Spliterator spliterator) {
        return new C9442z3(this.f20592b, spliterator, this.f20591a);
    }

    @Override // p163j$.util.Spliterator
    public final boolean tryAdvance(Consumer consumer) {
        Object obj;
        consumer.getClass();
        boolean c = m16433c();
        if (c) {
            C9383P2 p2 = (C9383P2) this.f20598h;
            long j = this.f20597g;
            if (p2.f20642c == 0) {
                if (j < p2.f20641b) {
                    obj = p2.f20544e[(int) j];
                } else {
                    throw new IndexOutOfBoundsException(Long.toString(j));
                }
            } else if (j < p2.count()) {
                for (int i = 0; i <= p2.f20642c; i++) {
                    long j2 = p2.f20643d[i];
                    Object[] objArr = p2.f20545f[i];
                    if (j < objArr.length + j2) {
                        obj = objArr[(int) (j - j2)];
                    }
                }
                throw new IndexOutOfBoundsException(Long.toString(j));
            } else {
                throw new IndexOutOfBoundsException(Long.toString(j));
            }
            consumer.accept(obj);
        }
        return c;
    }
}
