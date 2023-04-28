package cc;

import p163j$.util.Spliterator;
import p163j$.util.Spliterators;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: cc.u1 */
/* loaded from: classes3.dex */
public class C3948u1<E> extends AbstractC3884i0<E> {

    /* renamed from: m */
    static final AbstractC3884i0<Object> f6490m = new C3948u1(new Object[0]);

    /* renamed from: l */
    final transient Object[] f6491l;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3948u1(Object[] objArr) {
        this.f6491l = objArr;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // cc.AbstractC3884i0, cc.AbstractC3837d0
    /* renamed from: b */
    public int mo33225b(Object[] objArr, int i) {
        Object[] objArr2 = this.f6491l;
        System.arraycopy(objArr2, 0, objArr, i, objArr2.length);
        return i + this.f6491l.length;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // cc.AbstractC3837d0
    /* renamed from: e */
    public Object[] mo33242e() {
        return this.f6491l;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // cc.AbstractC3837d0
    /* renamed from: f */
    public int mo33241f() {
        return this.f6491l.length;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // cc.AbstractC3837d0
    /* renamed from: g */
    public int mo33240g() {
        return 0;
    }

    @Override // java.util.List, p163j$.util.List
    public E get(int i) {
        return (E) this.f6491l[i];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // cc.AbstractC3837d0
    /* renamed from: i */
    public boolean mo33222i() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, p163j$.util.Collection, java.util.List, p163j$.util.List
    public int size() {
        return this.f6491l.length;
    }

    @Override // cc.AbstractC3884i0, cc.AbstractC3837d0, java.util.Collection, java.lang.Iterable, p163j$.util.Collection, java.util.Set, p163j$.util.Set
    public Spliterator<E> spliterator() {
        return Spliterators.spliterator(this.f6491l, 1296);
    }

    @Override // cc.AbstractC3884i0
    /* renamed from: w */
    public AbstractC3882h2<E> listIterator(int i) {
        Object[] objArr = this.f6491l;
        return C3818a1.m33529i(objArr, 0, objArr.length, i);
    }
}
