package p163j$.util.stream;

import java.util.concurrent.CountedCompleter;
import java.util.concurrent.atomic.AtomicReference;
import p163j$.util.Spliterator;

/* renamed from: j$.util.stream.K */
/* loaded from: classes2.dex */
final class C9360K extends AbstractC0538d {

    /* renamed from: j */
    private final C9333E f20517j;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C9360K(C9333E e, AbstractC0606t0 t0Var, Spliterator spliterator) {
        super(t0Var, spliterator);
        this.f20517j = e;
    }

    C9360K(C9360K k, Spliterator spliterator) {
        super(k, spliterator);
        this.f20517j = k.f20517j;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p163j$.util.stream.AbstractC0548f
    /* renamed from: a */
    public final Object mo16305a() {
        boolean z;
        AbstractC0606t0 t0Var = this.f20649a;
        AbstractC9337E3 e3 = (AbstractC9337E3) this.f20517j.f20473d.get();
        t0Var.mo16294J0(this.f20650b, e3);
        Object obj = e3.get();
        if (!this.f20517j.f20470a) {
            if (obj != null) {
                AtomicReference atomicReference = this.f20636h;
                while (!atomicReference.compareAndSet(null, obj) && atomicReference.get() == null) {
                }
            }
            return null;
        } else if (obj == null) {
            return null;
        } else {
            C9360K k = this;
            while (true) {
                if (k != null) {
                    AbstractC0548f c = k.m16371c();
                    if (c != null && c.f20652d != k) {
                        z = false;
                        break;
                    }
                    k = c;
                } else {
                    z = true;
                    break;
                }
            }
            if (z) {
                AtomicReference atomicReference2 = this.f20636h;
                while (!atomicReference2.compareAndSet(null, obj) && atomicReference2.get() == null) {
                }
            } else {
                m16377h();
            }
            return obj;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p163j$.util.stream.AbstractC0548f
    /* renamed from: d */
    public final AbstractC0548f mo16304d(Spliterator spliterator) {
        return new C9360K(this, spliterator);
    }

    @Override // p163j$.util.stream.AbstractC0538d
    /* renamed from: i */
    protected final Object mo16303i() {
        return this.f20517j.f20471b;
    }

    @Override // p163j$.util.stream.AbstractC0548f, java.util.concurrent.CountedCompleter
    public final void onCompletion(CountedCompleter countedCompleter) {
        boolean z;
        if (this.f20517j.f20470a) {
            C9360K k = (C9360K) this.f20652d;
            C9360K k2 = null;
            while (true) {
                if (k == k2) {
                    break;
                }
                Object b = k.mo16372b();
                if (b == null || !this.f20517j.f20472c.test(b)) {
                    k = (C9360K) this.f20653e;
                    k2 = k;
                } else {
                    mo16370e(b);
                    C9360K k3 = this;
                    while (true) {
                        if (k3 != null) {
                            AbstractC0548f c = k3.m16371c();
                            if (c != null && c.f20652d != k3) {
                                z = false;
                                break;
                            }
                            k3 = c;
                        } else {
                            z = true;
                            break;
                        }
                    }
                    if (z) {
                        AtomicReference atomicReference = this.f20636h;
                        while (!atomicReference.compareAndSet(null, b) && atomicReference.get() == null) {
                        }
                    } else {
                        m16377h();
                    }
                }
            }
        }
        super.onCompletion(countedCompleter);
    }
}
