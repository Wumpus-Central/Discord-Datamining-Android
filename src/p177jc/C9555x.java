package p177jc;

import java.util.Collection;
import java.util.Collections;
import java.util.Set;
import p163j$.util.concurrent.ConcurrentHashMap;
import tc.AbstractC13053b;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: jc.x */
/* loaded from: classes3.dex */
public class C9555x<T> implements AbstractC13053b<Set<T>> {

    /* renamed from: b */
    private volatile Set<T> f21170b = null;

    /* renamed from: a */
    private volatile Set<AbstractC13053b<T>> f21169a = Collections.newSetFromMap(new ConcurrentHashMap());

    C9555x(Collection<AbstractC13053b<T>> collection) {
        this.f21169a.addAll(collection);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static C9555x<?> m16008b(Collection<AbstractC13053b<?>> collection) {
        return new C9555x<>((Set) collection);
    }

    /* renamed from: d */
    private synchronized void m16006d() {
        for (AbstractC13053b<T> bVar : this.f21169a) {
            this.f21170b.add(bVar.get());
        }
        this.f21169a = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public synchronized void m16009a(AbstractC13053b<T> bVar) {
        if (this.f21170b == null) {
            this.f21169a.add(bVar);
        } else {
            this.f21170b.add(bVar.get());
        }
    }

    /* renamed from: c */
    public Set<T> get() {
        if (this.f21170b == null) {
            synchronized (this) {
                if (this.f21170b == null) {
                    this.f21170b = Collections.newSetFromMap(new ConcurrentHashMap());
                    m16006d();
                }
            }
        }
        return Collections.unmodifiableSet(this.f21170b);
    }
}
