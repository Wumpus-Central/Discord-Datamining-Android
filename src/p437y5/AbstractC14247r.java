package p437y5;

import java.util.HashSet;
import java.util.Set;

/* renamed from: y5.r */
/* loaded from: classes7.dex */
public abstract class AbstractC14247r<T> implements AbstractC14252w<T> {

    /* renamed from: a */
    private final Set<T> f32174a = new HashSet();

    /* renamed from: b */
    private final C14237j<T> f32175b = new C14237j<>();

    /* renamed from: b */
    private T m1285b(T t) {
        if (t != null) {
            synchronized (this) {
                this.f32174a.remove(t);
            }
        }
        return t;
    }

    @Override // p437y5.AbstractC14252w
    public T get(int i) {
        return m1285b(this.f32175b.m1307a(i));
    }

    @Override // p437y5.AbstractC14252w
    public T pop() {
        return m1285b(this.f32175b.m1302f());
    }

    @Override // p437y5.AbstractC14252w
    public void put(T t) {
        boolean add;
        synchronized (this) {
            add = this.f32174a.add(t);
        }
        if (add) {
            this.f32175b.m1303e(mo1262a(t), t);
        }
    }
}
