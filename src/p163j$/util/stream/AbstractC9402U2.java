package p163j$.util.stream;

import java.util.Comparator;
import p163j$.util.Spliterator;
import p163j$.util.function.Supplier;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.U2 */
/* loaded from: classes2.dex */
public abstract class AbstractC9402U2 implements Spliterator {

    /* renamed from: a */
    final boolean f20591a;

    /* renamed from: b */
    final AbstractC0606t0 f20592b;

    /* renamed from: c */
    private Supplier f20593c;

    /* renamed from: d */
    Spliterator f20594d;

    /* renamed from: e */
    AbstractC0546e2 f20595e;

    /* renamed from: f */
    C0523a f20596f;

    /* renamed from: g */
    long f20597g;

    /* renamed from: h */
    AbstractC0543e f20598h;

    /* renamed from: i */
    boolean f20599i;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC9402U2(AbstractC0606t0 t0Var, Spliterator spliterator, boolean z) {
        this.f20592b = t0Var;
        this.f20593c = null;
        this.f20594d = spliterator;
        this.f20591a = z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC9402U2(AbstractC0606t0 t0Var, C0523a aVar, boolean z) {
        this.f20592b = t0Var;
        this.f20593c = aVar;
        this.f20594d = null;
        this.f20591a = z;
    }

    /* renamed from: d */
    private boolean m16432d() {
        boolean z;
        while (this.f20598h.count() == 0) {
            if (!this.f20595e.mo16234e()) {
                C0523a aVar = this.f20596f;
                int i = aVar.f20613a;
                Object obj = aVar.f20614b;
                switch (i) {
                    case 4:
                        C0542d3 d3Var = (C0542d3) obj;
                        z = d3Var.f20594d.tryAdvance(d3Var.f20595e);
                        break;
                    case 5:
                        C0552f3 f3Var = (C0552f3) obj;
                        z = f3Var.f20594d.tryAdvance(f3Var.f20595e);
                        break;
                    case 6:
                        C9423h3 h3Var = (C9423h3) obj;
                        z = h3Var.f20594d.tryAdvance(h3Var.f20595e);
                        break;
                    default:
                        C9442z3 z3Var = (C9442z3) obj;
                        z = z3Var.f20594d.tryAdvance(z3Var.f20595e);
                        break;
                }
                if (z) {
                    continue;
                }
            }
            if (this.f20599i) {
                return false;
            }
            this.f20595e.end();
            this.f20599i = true;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public final boolean m16433c() {
        AbstractC0543e eVar = this.f20598h;
        boolean z = false;
        if (eVar != null) {
            long j = this.f20597g + 1;
            this.f20597g = j;
            if (j < eVar.count()) {
                z = true;
            }
            if (z) {
                return z;
            }
            this.f20597g = 0L;
            this.f20598h.clear();
            return m16432d();
        } else if (this.f20599i) {
            return false;
        } else {
            m16431e();
            mo16229h();
            this.f20597g = 0L;
            this.f20595e.mo16235c(this.f20594d.getExactSizeIfKnown());
            return m16432d();
        }
    }

    @Override // p163j$.util.Spliterator
    public final int characteristics() {
        m16431e();
        int g = EnumC9394S2.m16436g(this.f20592b.mo16302A0()) & EnumC9394S2.f20564f;
        return (g & 64) != 0 ? (g & (-16449)) | (this.f20594d.characteristics() & 16448) : g;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public final void m16431e() {
        if (this.f20594d == null) {
            this.f20594d = (Spliterator) this.f20593c.get();
            this.f20593c = null;
        }
    }

    @Override // p163j$.util.Spliterator
    public final long estimateSize() {
        m16431e();
        return this.f20594d.estimateSize();
    }

    @Override // p163j$.util.Spliterator
    public final Comparator getComparator() {
        if (Spliterator.CC.$default$hasCharacteristics(this, 4)) {
            return null;
        }
        throw new IllegalStateException();
    }

    @Override // p163j$.util.Spliterator
    public final long getExactSizeIfKnown() {
        m16431e();
        if (EnumC9394S2.SIZED.m16439d(this.f20592b.mo16302A0())) {
            return this.f20594d.getExactSizeIfKnown();
        }
        return -1L;
    }

    /* renamed from: h */
    abstract void mo16229h();

    @Override // p163j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return Spliterator.CC.$default$hasCharacteristics(this, i);
    }

    /* renamed from: i */
    abstract AbstractC9402U2 mo16228i(Spliterator spliterator);

    public final String toString() {
        return String.format("%s[%s]", getClass().getName(), this.f20594d);
    }

    @Override // p163j$.util.Spliterator
    public Spliterator trySplit() {
        if (!this.f20591a || this.f20599i) {
            return null;
        }
        m16431e();
        Spliterator trySplit = this.f20594d.trySplit();
        if (trySplit == null) {
            return null;
        }
        return mo16228i(trySplit);
    }
}
