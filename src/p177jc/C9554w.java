package p177jc;

import tc.AbstractC13053b;

/* renamed from: jc.w */
/* loaded from: classes3.dex */
public class C9554w<T> implements AbstractC13053b<T> {

    /* renamed from: c */
    private static final Object f21166c = new Object();

    /* renamed from: a */
    private volatile Object f21167a = f21166c;

    /* renamed from: b */
    private volatile AbstractC13053b<T> f21168b;

    public C9554w(AbstractC13053b<T> bVar) {
        this.f21168b = bVar;
    }

    @Override // tc.AbstractC13053b
    public T get() {
        T t = (T) this.f21167a;
        Object obj = f21166c;
        if (t == obj) {
            synchronized (this) {
                t = this.f21167a;
                if (t == obj) {
                    t = this.f21168b.get();
                    this.f21167a = t;
                    this.f21168b = null;
                }
            }
        }
        return t;
    }
}
