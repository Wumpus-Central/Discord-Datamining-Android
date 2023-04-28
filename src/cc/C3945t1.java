package cc;

import p163j$.util.function.Consumer;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: cc.t1 */
/* loaded from: classes3.dex */
public class C3945t1<E> extends AbstractC3817a0<E> {

    /* renamed from: l */
    private final AbstractC3837d0<E> f6487l;

    /* renamed from: m */
    private final AbstractC3884i0<? extends E> f6488m;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3945t1(AbstractC3837d0<E> d0Var, AbstractC3884i0<? extends E> i0Var) {
        this.f6487l = d0Var;
        this.f6488m = i0Var;
    }

    @Override // cc.AbstractC3817a0
    /* renamed from: E */
    AbstractC3837d0<E> mo33223E() {
        return this.f6487l;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // cc.AbstractC3884i0, cc.AbstractC3837d0
    /* renamed from: b */
    public int mo33225b(Object[] objArr, int i) {
        return this.f6488m.mo33225b(objArr, i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // cc.AbstractC3837d0
    /* renamed from: e */
    public Object[] mo33242e() {
        return this.f6488m.mo33242e();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // cc.AbstractC3837d0
    /* renamed from: f */
    public int mo33241f() {
        return this.f6488m.mo33241f();
    }

    @Override // cc.AbstractC3884i0, cc.AbstractC3837d0, p163j$.util.Collection, p163j$.lang.AbstractC9165a
    public void forEach(Consumer<? super E> consumer) {
        this.f6488m.forEach((Consumer<? super Object>) consumer);
    }

    @Override // cc.AbstractC3884i0, cc.AbstractC3837d0, java.lang.Iterable
    public /* synthetic */ void forEach(java.util.function.Consumer consumer) {
        forEach(Consumer.VivifiedWrapper.convert(consumer));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // cc.AbstractC3837d0
    /* renamed from: g */
    public int mo33240g() {
        return this.f6488m.mo33240g();
    }

    @Override // java.util.List, p163j$.util.List
    public E get(int i) {
        return (E) this.f6488m.get(i);
    }

    @Override // cc.AbstractC3884i0
    /* renamed from: w */
    public AbstractC3882h2<E> listIterator(int i) {
        return (AbstractC3882h2<? extends E>) this.f6488m.listIterator(i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3945t1(AbstractC3837d0<E> d0Var, Object[] objArr) {
        this(d0Var, AbstractC3884i0.m33405p(objArr));
    }
}
