package p163j$.util.stream;

import java.util.concurrent.CountedCompleter;
import p163j$.util.Spliterator;
import p163j$.util.function.AbstractC0489d;
import p163j$.util.function.AbstractC9292O;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.J0 */
/* loaded from: classes2.dex */
public class C9357J0 extends AbstractC0548f {

    /* renamed from: h */
    protected final AbstractC0606t0 f20510h;

    /* renamed from: i */
    protected final AbstractC9292O f20511i;

    /* renamed from: j */
    protected final AbstractC0489d f20512j;

    C9357J0(C9357J0 j0, Spliterator spliterator) {
        super(j0, spliterator);
        this.f20510h = j0.f20510h;
        this.f20511i = j0.f20511i;
        this.f20512j = j0.f20512j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C9357J0(AbstractC0606t0 t0Var, Spliterator spliterator, AbstractC9292O o, AbstractC0489d dVar) {
        super(t0Var, spliterator);
        this.f20510h = t0Var;
        this.f20511i = o;
        this.f20512j = dVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p163j$.util.stream.AbstractC0548f
    /* renamed from: a */
    public final Object mo16305a() {
        AbstractC0622x0 x0Var = (AbstractC0622x0) this.f20511i.apply(this.f20510h.mo16257v0(this.f20650b));
        this.f20510h.mo16294J0(this.f20650b, x0Var);
        return x0Var.mo42182build();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p163j$.util.stream.AbstractC0548f
    /* renamed from: d */
    public final AbstractC0548f mo16304d(Spliterator spliterator) {
        return new C9357J0(this, spliterator);
    }

    @Override // p163j$.util.stream.AbstractC0548f, java.util.concurrent.CountedCompleter
    public final void onCompletion(CountedCompleter countedCompleter) {
        AbstractC0548f fVar = this.f20652d;
        if (!(fVar == null)) {
            mo16370e((AbstractC9324C0) this.f20512j.apply((AbstractC9324C0) ((C9357J0) fVar).mo16372b(), (AbstractC9324C0) ((C9357J0) this.f20653e).mo16372b()));
        }
        super.onCompletion(countedCompleter);
    }
}
