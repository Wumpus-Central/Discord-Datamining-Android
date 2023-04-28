package qa;

import java.util.Iterator;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: qa.z */
/* loaded from: classes3.dex */
public final class C12101z<E> extends AbstractC12096v<E> {

    /* renamed from: r */
    static final C12101z<Object> f27147r = new C12101z<>(new Object[0], 0, null, 0, 0);

    /* renamed from: m */
    private final transient Object[] f27148m;

    /* renamed from: n */
    private final transient Object[] f27149n;

    /* renamed from: o */
    private final transient int f27150o;

    /* renamed from: p */
    private final transient int f27151p;

    /* renamed from: q */
    private final transient int f27152q;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C12101z(Object[] objArr, int i, Object[] objArr2, int i2, int i3) {
        this.f27148m = objArr;
        this.f27149n = objArr2;
        this.f27150o = i2;
        this.f27151p = i;
        this.f27152q = i3;
    }

    @Override // qa.AbstractC12088r
    /* renamed from: a */
    final int mo7845a(Object[] objArr, int i) {
        System.arraycopy(this.f27148m, 0, objArr, 0, this.f27152q);
        return this.f27152q + 0;
    }

    @Override // qa.AbstractC12088r
    /* renamed from: b */
    public final AbstractC12057b0<E> mo7844b() {
        return (AbstractC12057b0) mo7852e().iterator();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(@NullableDecl Object obj) {
        Object[] objArr = this.f27149n;
        if (obj == null || objArr == null) {
            return false;
        }
        int a = C12082o.m7863a(obj.hashCode());
        while (true) {
            int i = a & this.f27150o;
            Object obj2 = objArr[i];
            if (obj2 == null) {
                return false;
            }
            if (obj2.equals(obj)) {
                return true;
            }
            a = i + 1;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // qa.AbstractC12088r
    /* renamed from: f */
    public final Object[] mo7843f() {
        return this.f27148m;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // qa.AbstractC12088r
    /* renamed from: g */
    public final int mo7842g() {
        return 0;
    }

    @Override // qa.AbstractC12096v, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f27151p;
    }

    @Override // qa.AbstractC12088r
    /* renamed from: i */
    final int mo7841i() {
        return this.f27152q;
    }

    @Override // qa.AbstractC12096v, qa.AbstractC12088r, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return mo7844b();
    }

    @Override // qa.AbstractC12096v
    /* renamed from: r */
    final boolean mo7840r() {
        return true;
    }

    @Override // qa.AbstractC12096v
    /* renamed from: s */
    final AbstractC12086q<E> mo7839s() {
        return AbstractC12086q.m7857s(this.f27148m, this.f27152q);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f27152q;
    }
}
