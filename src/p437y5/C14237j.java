package p437y5;

import android.util.SparseArray;
import java.util.LinkedList;

/* renamed from: y5.j */
/* loaded from: classes7.dex */
public class C14237j<T> {

    /* renamed from: a */
    protected final SparseArray<C14239b<T>> f32159a = new SparseArray<>();

    /* renamed from: b */
    C14239b<T> f32160b;

    /* renamed from: c */
    C14239b<T> f32161c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: y5.j$b */
    /* loaded from: classes7.dex */
    public static class C14239b<I> {

        /* renamed from: a */
        C14239b<I> f32162a;

        /* renamed from: b */
        int f32163b;

        /* renamed from: c */
        LinkedList<I> f32164c;

        /* renamed from: d */
        C14239b<I> f32165d;

        public String toString() {
            return "LinkedEntry(key: " + this.f32163b + ")";
        }

        private C14239b(C14239b<I> bVar, int i, LinkedList<I> linkedList, C14239b<I> bVar2) {
            this.f32162a = bVar;
            this.f32163b = i;
            this.f32164c = linkedList;
            this.f32165d = bVar2;
        }
    }

    /* renamed from: b */
    private void m1306b(C14239b<T> bVar) {
        if (bVar != null && bVar.f32164c.isEmpty()) {
            m1304d(bVar);
            this.f32159a.remove(bVar.f32163b);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: c */
    private void m1305c(C14239b<T> bVar) {
        if (this.f32160b != bVar) {
            m1304d(bVar);
            C14239b bVar2 = (C14239b<T>) this.f32160b;
            if (bVar2 == null) {
                this.f32160b = bVar;
                this.f32161c = bVar;
                return;
            }
            bVar.f32165d = bVar2;
            bVar2.f32162a = bVar;
            this.f32160b = bVar;
        }
    }

    /* renamed from: d */
    private synchronized void m1304d(C14239b<T> bVar) {
        C14239b bVar2 = (C14239b<T>) bVar.f32162a;
        C14239b bVar3 = (C14239b<T>) bVar.f32165d;
        if (bVar2 != null) {
            bVar2.f32165d = bVar3;
        }
        if (bVar3 != null) {
            bVar3.f32162a = bVar2;
        }
        bVar.f32162a = null;
        bVar.f32165d = null;
        if (bVar == this.f32160b) {
            this.f32160b = bVar3;
        }
        if (bVar == this.f32161c) {
            this.f32161c = bVar2;
        }
    }

    /* renamed from: a */
    public synchronized T m1307a(int i) {
        C14239b<T> bVar = this.f32159a.get(i);
        if (bVar == null) {
            return null;
        }
        T pollFirst = bVar.f32164c.pollFirst();
        m1305c(bVar);
        return pollFirst;
    }

    /* renamed from: e */
    public synchronized void m1303e(int i, T t) {
        C14239b<T> bVar = this.f32159a.get(i);
        if (bVar == null) {
            bVar = new C14239b<>(null, i, new LinkedList(), null);
            this.f32159a.put(i, bVar);
        }
        bVar.f32164c.addLast(t);
        m1305c(bVar);
    }

    /* renamed from: f */
    public synchronized T m1302f() {
        C14239b<T> bVar = this.f32161c;
        if (bVar == null) {
            return null;
        }
        T pollLast = bVar.f32164c.pollLast();
        m1306b(bVar);
        return pollLast;
    }
}
