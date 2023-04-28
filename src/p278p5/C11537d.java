package p278p5;

import java.util.LinkedHashSet;

/* renamed from: p5.d */
/* loaded from: classes7.dex */
public class C11537d<E> {

    /* renamed from: a */
    private int f25756a;

    /* renamed from: b */
    private LinkedHashSet<E> f25757b;

    public C11537d(int i) {
        this.f25757b = new LinkedHashSet<>(i);
        this.f25756a = i;
    }

    /* renamed from: a */
    public synchronized boolean m9435a(E e) {
        if (this.f25757b.size() == this.f25756a) {
            LinkedHashSet<E> linkedHashSet = this.f25757b;
            linkedHashSet.remove(linkedHashSet.iterator().next());
        }
        this.f25757b.remove(e);
        return this.f25757b.add(e);
    }

    /* renamed from: b */
    public synchronized boolean m9434b(E e) {
        return this.f25757b.contains(e);
    }
}
