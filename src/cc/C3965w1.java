package cc;

import cc.AbstractC3960w0;
import p163j$.util.Spliterator;
import p163j$.util.Spliterators;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: cc.w1 */
/* loaded from: classes3.dex */
public final class C3965w1<E> extends AbstractC3960w0.AbstractC3961a<E> {

    /* renamed from: q */
    private static final Object[] f6521q;

    /* renamed from: r */
    static final C3965w1<Object> f6522r;

    /* renamed from: m */
    private final transient Object[] f6523m;

    /* renamed from: n */
    private final transient int f6524n;

    /* renamed from: o */
    final transient Object[] f6525o;

    /* renamed from: p */
    private final transient int f6526p;

    static {
        Object[] objArr = new Object[0];
        f6521q = objArr;
        f6522r = new C3965w1<>(objArr, 0, objArr, 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3965w1(Object[] objArr, int i, Object[] objArr2, int i2) {
        this.f6523m = objArr;
        this.f6524n = i;
        this.f6525o = objArr2;
        this.f6526p = i2;
    }

    @Override // cc.AbstractC3960w0.AbstractC3961a
    /* renamed from: B */
    AbstractC3884i0<E> mo33226B() {
        if (this.f6525o.length == 0) {
            return AbstractC3884i0.m33399x();
        }
        return new C3945t1(this, this.f6523m);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // cc.AbstractC3837d0
    /* renamed from: b */
    public int mo33225b(Object[] objArr, int i) {
        Object[] objArr2 = this.f6523m;
        System.arraycopy(objArr2, 0, objArr, i, objArr2.length);
        return i + this.f6523m.length;
    }

    @Override // cc.AbstractC3837d0, java.util.AbstractCollection, java.util.Collection, p163j$.util.Collection, java.util.List, p163j$.util.List
    public boolean contains(Object obj) {
        Object[] objArr = this.f6525o;
        if (obj == null || objArr.length == 0) {
            return false;
        }
        int c = C3975z.m33218c(obj);
        while (true) {
            int i = c & this.f6526p;
            Object obj2 = objArr[i];
            if (obj2 == null) {
                return false;
            }
            if (obj2.equals(obj)) {
                return true;
            }
            c = i + 1;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // cc.AbstractC3837d0
    /* renamed from: e */
    public Object[] mo33242e() {
        return this.f6523m;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // cc.AbstractC3837d0
    /* renamed from: f */
    public int mo33241f() {
        return this.f6523m.length;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // cc.AbstractC3837d0
    /* renamed from: g */
    public int mo33240g() {
        return 0;
    }

    @Override // cc.AbstractC3960w0, java.util.Collection, p163j$.util.Collection, java.util.Set, p163j$.util.Set
    public int hashCode() {
        return this.f6524n;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // cc.AbstractC3837d0
    /* renamed from: i */
    public boolean mo33222i() {
        return false;
    }

    @Override // cc.AbstractC3960w0, cc.AbstractC3837d0
    /* renamed from: j */
    public AbstractC3868g2<E> iterator() {
        return C3818a1.m33530h(this.f6523m);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, p163j$.util.Collection, java.util.List, p163j$.util.List
    public int size() {
        return this.f6523m.length;
    }

    @Override // cc.AbstractC3837d0, java.util.Collection, java.lang.Iterable, p163j$.util.Collection, java.util.Set, p163j$.util.Set
    public Spliterator<E> spliterator() {
        return Spliterators.spliterator(this.f6523m, 1297);
    }

    @Override // cc.AbstractC3960w0
    /* renamed from: w */
    boolean mo33239w() {
        return true;
    }
}
