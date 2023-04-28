package kotlinx.coroutines.internal;

import java.lang.Comparable;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;
import kotlinx.coroutines.internal.AbstractC10102j0;

@Metadata(m15074d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0017\u0018\u0000*\u0012\b\u0000\u0010\u0003*\u00020\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u00060\u0004j\u0002`\u0005B\u0007¢\u0006\u0004\b&\u0010'J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0082\u0010¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0082\u0010¢\u0006\u0004\b\u000b\u0010\nJ\u0017\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0007\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u0007\u0010\u0013J\u0015\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00028\u0000¢\u0006\u0004\b\u0016\u0010\u0017J\u0011\u0010\u0018\u001a\u0004\u0018\u00018\u0000H\u0001¢\u0006\u0004\b\u0018\u0010\u0013J\u0017\u0010\u001a\u001a\u00028\u00002\u0006\u0010\u0019\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001c\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00028\u0000H\u0001¢\u0006\u0004\b\u001c\u0010\u001dR \u0010\u001c\u001a\f\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001eR$\u0010\"\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u00068F@BX\u0086\u000e¢\u0006\f\u001a\u0004\b \u0010!\"\u0004\b\u000f\u0010\nR\u0011\u0010%\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\b#\u0010$¨\u0006("}, m15073d2 = {"Lkotlinx/coroutines/internal/i0;", "Lkotlinx/coroutines/internal/j0;", "", "T", "", "Lkotlinx/coroutines/internal/SynchronizedObject;", "", "i", "", "l", "(I)V", "k", "", "f", "()[Lkotlinx/coroutines/internal/j0;", "j", "m", "(II)V", "e", "()Lkotlinx/coroutines/internal/j0;", "node", "", "g", "(Lkotlinx/coroutines/internal/j0;)Z", "b", "index", "h", "(I)Lkotlinx/coroutines/internal/j0;", "a", "(Lkotlinx/coroutines/internal/j0;)V", "[Lkotlinx/coroutines/internal/j0;", "value", "c", "()I", "size", "d", "()Z", "isEmpty", "<init>", "()V", "kotlinx-coroutines-core"}, m15072k = 1, m15071mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.internal.i0 */
/* loaded from: classes8.dex */
public class C10100i0<T extends AbstractC10102j0 & Comparable<? super T>> {
    private volatile /* synthetic */ int _size = 0;

    /* renamed from: a */
    private T[] f22294a;

    /* renamed from: f */
    private final T[] m14286f() {
        T[] tArr = this.f22294a;
        if (tArr == null) {
            T[] tArr2 = (T[]) new AbstractC10102j0[4];
            this.f22294a = tArr2;
            return tArr2;
        } else if (m14289c() < tArr.length) {
            return tArr;
        } else {
            Object[] copyOf = Arrays.copyOf(tArr, m14289c() * 2);
            C9971q.m14634f(copyOf, "copyOf(this, newSize)");
            T[] tArr3 = (T[]) ((AbstractC10102j0[]) copyOf);
            this.f22294a = tArr3;
            return tArr3;
        }
    }

    /* renamed from: j */
    private final void m14282j(int i) {
        this._size = i;
    }

    /* renamed from: k */
    private final void m14281k(int i) {
        while (true) {
            int i2 = (i * 2) + 1;
            if (i2 < m14289c()) {
                T[] tArr = this.f22294a;
                C9971q.m14636d(tArr);
                int i3 = i2 + 1;
                if (i3 < m14289c()) {
                    T t = tArr[i3];
                    C9971q.m14636d(t);
                    T t2 = tArr[i2];
                    C9971q.m14636d(t2);
                    if (((Comparable) t).compareTo(t2) < 0) {
                        i2 = i3;
                    }
                }
                T t3 = tArr[i];
                C9971q.m14636d(t3);
                T t4 = tArr[i2];
                C9971q.m14636d(t4);
                if (((Comparable) t3).compareTo(t4) > 0) {
                    m14279m(i, i2);
                    i = i2;
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: l */
    private final void m14280l(int i) {
        while (i > 0) {
            T[] tArr = this.f22294a;
            C9971q.m14636d(tArr);
            int i2 = (i - 1) / 2;
            T t = tArr[i2];
            C9971q.m14636d(t);
            T t2 = tArr[i];
            C9971q.m14636d(t2);
            if (((Comparable) t).compareTo(t2) > 0) {
                m14279m(i, i2);
                i = i2;
            } else {
                return;
            }
        }
    }

    /* renamed from: m */
    private final void m14279m(int i, int i2) {
        T[] tArr = this.f22294a;
        C9971q.m14636d(tArr);
        T t = tArr[i2];
        C9971q.m14636d(t);
        T t2 = tArr[i];
        C9971q.m14636d(t2);
        tArr[i] = t;
        tArr[i2] = t2;
        t.setIndex(i);
        t2.setIndex(i2);
    }

    /* renamed from: a */
    public final void m14291a(T t) {
        t.mo14277a(this);
        T[] f = m14286f();
        int c = m14289c();
        m14282j(c + 1);
        f[c] = t;
        t.setIndex(c);
        m14280l(c);
    }

    /* renamed from: b */
    public final T m14290b() {
        T[] tArr = this.f22294a;
        if (tArr != null) {
            return tArr[0];
        }
        return null;
    }

    /* renamed from: c */
    public final int m14289c() {
        return this._size;
    }

    /* renamed from: d */
    public final boolean m14288d() {
        return m14289c() == 0;
    }

    /* renamed from: e */
    public final T m14287e() {
        T b;
        synchronized (this) {
            b = m14290b();
        }
        return b;
    }

    /* renamed from: g */
    public final boolean m14285g(T t) {
        boolean z;
        synchronized (this) {
            if (t.mo14276b() == null) {
                z = false;
            } else {
                m14284h(t.getIndex());
                z = true;
            }
        }
        return z;
    }

    /* renamed from: h */
    public final T m14284h(int i) {
        T[] tArr = this.f22294a;
        C9971q.m14636d(tArr);
        m14282j(m14289c() - 1);
        if (i < m14289c()) {
            m14279m(i, m14289c());
            int i2 = (i - 1) / 2;
            if (i > 0) {
                T t = tArr[i];
                C9971q.m14636d(t);
                T t2 = tArr[i2];
                C9971q.m14636d(t2);
                if (((Comparable) t).compareTo(t2) < 0) {
                    m14279m(i, i2);
                    m14280l(i2);
                }
            }
            m14281k(i);
        }
        T t3 = tArr[m14289c()];
        C9971q.m14636d(t3);
        t3.mo14277a(null);
        t3.setIndex(-1);
        tArr[m14289c()] = null;
        return t3;
    }

    /* renamed from: i */
    public final T m14283i() {
        T t;
        synchronized (this) {
            if (m14289c() > 0) {
                t = m14284h(0);
            } else {
                t = null;
            }
        }
        return t;
    }
}
