package androidx.recyclerview.widget;

import androidx.core.util.AbstractC2516f;
import androidx.core.util.Pools$SimplePool;
import androidx.recyclerview.widget.C3138i;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class AdapterHelper implements C3138i.AbstractC3139a {

    /* renamed from: a */
    private AbstractC2516f<C3064b> f4520a;

    /* renamed from: b */
    final ArrayList<C3064b> f4521b;

    /* renamed from: c */
    final ArrayList<C3064b> f4522c;

    /* renamed from: d */
    final AbstractC3063a f4523d;

    /* renamed from: e */
    Runnable f4524e;

    /* renamed from: f */
    final boolean f4525f;

    /* renamed from: g */
    final C3138i f4526g;

    /* renamed from: h */
    private int f4527h;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.recyclerview.widget.AdapterHelper$a */
    /* loaded from: classes.dex */
    public interface AbstractC3063a {
        /* renamed from: a */
        void mo35330a(int i, int i2);

        /* renamed from: b */
        void mo35329b(C3064b bVar);

        /* renamed from: c */
        void mo35328c(C3064b bVar);

        /* renamed from: d */
        void mo35327d(int i, int i2);

        /* renamed from: e */
        void mo35326e(int i, int i2, Object obj);

        /* renamed from: f */
        RecyclerView.ViewHolder mo35325f(int i);

        /* renamed from: g */
        void mo35324g(int i, int i2);

        /* renamed from: h */
        void mo35323h(int i, int i2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.recyclerview.widget.AdapterHelper$b */
    /* loaded from: classes.dex */
    public static final class C3064b {

        /* renamed from: a */
        int f4528a;

        /* renamed from: b */
        int f4529b;

        /* renamed from: c */
        Object f4530c;

        /* renamed from: d */
        int f4531d;

        C3064b(int i, int i2, int i3, Object obj) {
            this.f4528a = i;
            this.f4529b = i2;
            this.f4531d = i3;
            this.f4530c = obj;
        }

        /* renamed from: a */
        String m35676a() {
            int i = this.f4528a;
            return i != 1 ? i != 2 ? i != 4 ? i != 8 ? "??" : "mv" : "up" : "rm" : "add";
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C3064b)) {
                return false;
            }
            C3064b bVar = (C3064b) obj;
            int i = this.f4528a;
            if (i != bVar.f4528a) {
                return false;
            }
            if (i == 8 && Math.abs(this.f4531d - this.f4529b) == 1 && this.f4531d == bVar.f4529b && this.f4529b == bVar.f4531d) {
                return true;
            }
            if (this.f4531d != bVar.f4531d || this.f4529b != bVar.f4529b) {
                return false;
            }
            Object obj2 = this.f4530c;
            if (obj2 != null) {
                if (!obj2.equals(bVar.f4530c)) {
                    return false;
                }
            } else if (bVar.f4530c != null) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return (((this.f4528a * 31) + this.f4529b) * 31) + this.f4531d;
        }

        public String toString() {
            return Integer.toHexString(System.identityHashCode(this)) + "[" + m35676a() + ",s:" + this.f4529b + "c:" + this.f4531d + ",p:" + this.f4530c + "]";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AdapterHelper(AbstractC3063a aVar) {
        this(aVar, false);
    }

    /* renamed from: c */
    private void m35700c(C3064b bVar) {
        m35681v(bVar);
    }

    /* renamed from: d */
    private void m35699d(C3064b bVar) {
        m35681v(bVar);
    }

    /* renamed from: f */
    private void m35697f(C3064b bVar) {
        char c;
        boolean z;
        int i = bVar.f4529b;
        int i2 = bVar.f4531d + i;
        char c2 = 65535;
        int i3 = i;
        int i4 = 0;
        while (i3 < i2) {
            if (this.f4523d.mo35325f(i3) != null || m35695h(i3)) {
                if (c2 == 0) {
                    m35692k(mo35112a(2, i, i4, null));
                    z = true;
                } else {
                    z = false;
                }
                c = 1;
            } else {
                if (c2 == 1) {
                    m35681v(mo35112a(2, i, i4, null));
                    z = true;
                } else {
                    z = false;
                }
                c = 0;
            }
            if (z) {
                i3 -= i4;
                i2 -= i4;
                i4 = 1;
            } else {
                i4++;
            }
            i3++;
            c2 = c;
        }
        if (i4 != bVar.f4531d) {
            mo35111b(bVar);
            bVar = mo35112a(2, i, i4, null);
        }
        if (c2 == 0) {
            m35692k(bVar);
        } else {
            m35681v(bVar);
        }
    }

    /* renamed from: g */
    private void m35696g(C3064b bVar) {
        int i = bVar.f4529b;
        int i2 = bVar.f4531d + i;
        int i3 = 0;
        boolean z = true;
        int i4 = i;
        while (i < i2) {
            if (this.f4523d.mo35325f(i) != null || m35695h(i)) {
                if (!z) {
                    m35692k(mo35112a(4, i4, i3, bVar.f4530c));
                    i4 = i;
                    i3 = 0;
                }
                z = true;
            } else {
                if (z) {
                    m35681v(mo35112a(4, i4, i3, bVar.f4530c));
                    i4 = i;
                    i3 = 0;
                }
                z = false;
            }
            i3++;
            i++;
        }
        if (i3 != bVar.f4531d) {
            Object obj = bVar.f4530c;
            mo35111b(bVar);
            bVar = mo35112a(4, i4, i3, obj);
        }
        if (!z) {
            m35692k(bVar);
        } else {
            m35681v(bVar);
        }
    }

    /* renamed from: h */
    private boolean m35695h(int i) {
        int size = this.f4522c.size();
        for (int i2 = 0; i2 < size; i2++) {
            C3064b bVar = this.f4522c.get(i2);
            int i3 = bVar.f4528a;
            if (i3 == 8) {
                if (m35689n(bVar.f4531d, i2 + 1) == i) {
                    return true;
                }
            } else if (i3 == 1) {
                int i4 = bVar.f4529b;
                int i5 = bVar.f4531d + i4;
                while (i4 < i5) {
                    if (m35689n(i4, i2 + 1) == i) {
                        return true;
                    }
                    i4++;
                }
                continue;
            } else {
                continue;
            }
        }
        return false;
    }

    /* renamed from: k */
    private void m35692k(C3064b bVar) {
        int i;
        boolean z;
        int i2 = bVar.f4528a;
        if (i2 == 1 || i2 == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int z2 = m35677z(bVar.f4529b, i2);
        int i3 = bVar.f4529b;
        int i4 = bVar.f4528a;
        if (i4 == 2) {
            i = 0;
        } else if (i4 == 4) {
            i = 1;
        } else {
            throw new IllegalArgumentException("op should be remove or update." + bVar);
        }
        int i5 = 1;
        for (int i6 = 1; i6 < bVar.f4531d; i6++) {
            int z3 = m35677z(bVar.f4529b + (i * i6), bVar.f4528a);
            int i7 = bVar.f4528a;
            if (i7 == 2 ? z3 != z2 : !(i7 == 4 && z3 == z2 + 1)) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                i5++;
            } else {
                C3064b a = mo35112a(i7, z2, i5, bVar.f4530c);
                m35691l(a, i3);
                mo35111b(a);
                if (bVar.f4528a == 4) {
                    i3 += i5;
                }
                i5 = 1;
                z2 = z3;
            }
        }
        Object obj = bVar.f4530c;
        mo35111b(bVar);
        if (i5 > 0) {
            C3064b a2 = mo35112a(bVar.f4528a, z2, i5, obj);
            m35691l(a2, i3);
            mo35111b(a2);
        }
    }

    /* renamed from: v */
    private void m35681v(C3064b bVar) {
        this.f4522c.add(bVar);
        int i = bVar.f4528a;
        if (i == 1) {
            this.f4523d.mo35324g(bVar.f4529b, bVar.f4531d);
        } else if (i == 2) {
            this.f4523d.mo35327d(bVar.f4529b, bVar.f4531d);
        } else if (i == 4) {
            this.f4523d.mo35326e(bVar.f4529b, bVar.f4531d, bVar.f4530c);
        } else if (i == 8) {
            this.f4523d.mo35330a(bVar.f4529b, bVar.f4531d);
        } else {
            throw new IllegalArgumentException("Unknown update op type for " + bVar);
        }
    }

    /* renamed from: z */
    private int m35677z(int i, int i2) {
        int i3;
        int i4;
        for (int size = this.f4522c.size() - 1; size >= 0; size--) {
            C3064b bVar = this.f4522c.get(size);
            int i5 = bVar.f4528a;
            if (i5 == 8) {
                int i6 = bVar.f4529b;
                int i7 = bVar.f4531d;
                if (i6 < i7) {
                    i4 = i6;
                    i3 = i7;
                } else {
                    i3 = i6;
                    i4 = i7;
                }
                if (i < i4 || i > i3) {
                    if (i < i6) {
                        if (i2 == 1) {
                            bVar.f4529b = i6 + 1;
                            bVar.f4531d = i7 + 1;
                        } else if (i2 == 2) {
                            bVar.f4529b = i6 - 1;
                            bVar.f4531d = i7 - 1;
                        }
                    }
                } else if (i4 == i6) {
                    if (i2 == 1) {
                        bVar.f4531d = i7 + 1;
                    } else if (i2 == 2) {
                        bVar.f4531d = i7 - 1;
                    }
                    i++;
                } else {
                    if (i2 == 1) {
                        bVar.f4529b = i6 + 1;
                    } else if (i2 == 2) {
                        bVar.f4529b = i6 - 1;
                    }
                    i--;
                }
            } else {
                int i8 = bVar.f4529b;
                if (i8 <= i) {
                    if (i5 == 1) {
                        i -= bVar.f4531d;
                    } else if (i5 == 2) {
                        i += bVar.f4531d;
                    }
                } else if (i2 == 1) {
                    bVar.f4529b = i8 + 1;
                } else if (i2 == 2) {
                    bVar.f4529b = i8 - 1;
                }
            }
        }
        for (int size2 = this.f4522c.size() - 1; size2 >= 0; size2--) {
            C3064b bVar2 = this.f4522c.get(size2);
            if (bVar2.f4528a == 8) {
                int i9 = bVar2.f4531d;
                if (i9 == bVar2.f4529b || i9 < 0) {
                    this.f4522c.remove(size2);
                    mo35111b(bVar2);
                }
            } else if (bVar2.f4531d <= 0) {
                this.f4522c.remove(size2);
                mo35111b(bVar2);
            }
        }
        return i;
    }

    @Override // androidx.recyclerview.widget.C3138i.AbstractC3139a
    /* renamed from: a */
    public C3064b mo35112a(int i, int i2, int i3, Object obj) {
        C3064b acquire = this.f4520a.acquire();
        if (acquire == null) {
            return new C3064b(i, i2, i3, obj);
        }
        acquire.f4528a = i;
        acquire.f4529b = i2;
        acquire.f4531d = i3;
        acquire.f4530c = obj;
        return acquire;
    }

    @Override // androidx.recyclerview.widget.C3138i.AbstractC3139a
    /* renamed from: b */
    public void mo35111b(C3064b bVar) {
        if (!this.f4525f) {
            bVar.f4530c = null;
            this.f4520a.release(bVar);
        }
    }

    /* renamed from: e */
    public int m35698e(int i) {
        int size = this.f4521b.size();
        for (int i2 = 0; i2 < size; i2++) {
            C3064b bVar = this.f4521b.get(i2);
            int i3 = bVar.f4528a;
            if (i3 != 1) {
                if (i3 == 2) {
                    int i4 = bVar.f4529b;
                    if (i4 <= i) {
                        int i5 = bVar.f4531d;
                        if (i4 + i5 > i) {
                            return -1;
                        }
                        i -= i5;
                    } else {
                        continue;
                    }
                } else if (i3 == 8) {
                    int i6 = bVar.f4529b;
                    if (i6 == i) {
                        i = bVar.f4531d;
                    } else {
                        if (i6 < i) {
                            i--;
                        }
                        if (bVar.f4531d <= i) {
                            i++;
                        }
                    }
                }
            } else if (bVar.f4529b <= i) {
                i += bVar.f4531d;
            }
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public void m35694i() {
        int size = this.f4522c.size();
        for (int i = 0; i < size; i++) {
            this.f4523d.mo35328c(this.f4522c.get(i));
        }
        m35679x(this.f4522c);
        this.f4527h = 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public void m35693j() {
        m35694i();
        int size = this.f4521b.size();
        for (int i = 0; i < size; i++) {
            C3064b bVar = this.f4521b.get(i);
            int i2 = bVar.f4528a;
            if (i2 == 1) {
                this.f4523d.mo35328c(bVar);
                this.f4523d.mo35324g(bVar.f4529b, bVar.f4531d);
            } else if (i2 == 2) {
                this.f4523d.mo35328c(bVar);
                this.f4523d.mo35323h(bVar.f4529b, bVar.f4531d);
            } else if (i2 == 4) {
                this.f4523d.mo35328c(bVar);
                this.f4523d.mo35326e(bVar.f4529b, bVar.f4531d, bVar.f4530c);
            } else if (i2 == 8) {
                this.f4523d.mo35328c(bVar);
                this.f4523d.mo35330a(bVar.f4529b, bVar.f4531d);
            }
            Runnable runnable = this.f4524e;
            if (runnable != null) {
                runnable.run();
            }
        }
        m35679x(this.f4521b);
        this.f4527h = 0;
    }

    /* renamed from: l */
    void m35691l(C3064b bVar, int i) {
        this.f4523d.mo35329b(bVar);
        int i2 = bVar.f4528a;
        if (i2 == 2) {
            this.f4523d.mo35323h(i, bVar.f4531d);
        } else if (i2 == 4) {
            this.f4523d.mo35326e(i, bVar.f4531d, bVar.f4530c);
        } else {
            throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public int m35690m(int i) {
        return m35689n(i, 0);
    }

    /* renamed from: n */
    int m35689n(int i, int i2) {
        int size = this.f4522c.size();
        while (i2 < size) {
            C3064b bVar = this.f4522c.get(i2);
            int i3 = bVar.f4528a;
            if (i3 == 8) {
                int i4 = bVar.f4529b;
                if (i4 == i) {
                    i = bVar.f4531d;
                } else {
                    if (i4 < i) {
                        i--;
                    }
                    if (bVar.f4531d <= i) {
                        i++;
                    }
                }
            } else {
                int i5 = bVar.f4529b;
                if (i5 > i) {
                    continue;
                } else if (i3 == 2) {
                    int i6 = bVar.f4531d;
                    if (i < i5 + i6) {
                        return -1;
                    }
                    i -= i6;
                } else if (i3 == 1) {
                    i += bVar.f4531d;
                }
            }
            i2++;
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o */
    public boolean m35688o(int i) {
        return (i & this.f4527h) != 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p */
    public boolean m35687p() {
        return this.f4521b.size() > 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q */
    public boolean m35686q() {
        return !this.f4522c.isEmpty() && !this.f4521b.isEmpty();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r */
    public boolean m35685r(int i, int i2, Object obj) {
        if (i2 < 1) {
            return false;
        }
        this.f4521b.add(mo35112a(4, i, i2, obj));
        this.f4527h |= 4;
        if (this.f4521b.size() == 1) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s */
    public boolean m35684s(int i, int i2) {
        if (i2 < 1) {
            return false;
        }
        this.f4521b.add(mo35112a(1, i, i2, null));
        this.f4527h |= 1;
        if (this.f4521b.size() == 1) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: t */
    public boolean m35683t(int i, int i2, int i3) {
        if (i == i2) {
            return false;
        }
        if (i3 == 1) {
            this.f4521b.add(mo35112a(8, i, i2, null));
            this.f4527h |= 8;
            if (this.f4521b.size() == 1) {
                return true;
            }
            return false;
        }
        throw new IllegalArgumentException("Moving more than 1 item is not supported yet");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: u */
    public boolean m35682u(int i, int i2) {
        if (i2 < 1) {
            return false;
        }
        this.f4521b.add(mo35112a(2, i, i2, null));
        this.f4527h |= 2;
        if (this.f4521b.size() == 1) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: w */
    public void m35680w() {
        this.f4526g.m35117b(this.f4521b);
        int size = this.f4521b.size();
        for (int i = 0; i < size; i++) {
            C3064b bVar = this.f4521b.get(i);
            int i2 = bVar.f4528a;
            if (i2 == 1) {
                m35700c(bVar);
            } else if (i2 == 2) {
                m35697f(bVar);
            } else if (i2 == 4) {
                m35696g(bVar);
            } else if (i2 == 8) {
                m35699d(bVar);
            }
            Runnable runnable = this.f4524e;
            if (runnable != null) {
                runnable.run();
            }
        }
        this.f4521b.clear();
    }

    /* renamed from: x */
    void m35679x(List<C3064b> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            mo35111b(list.get(i));
        }
        list.clear();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: y */
    public void m35678y() {
        m35679x(this.f4521b);
        m35679x(this.f4522c);
        this.f4527h = 0;
    }

    AdapterHelper(AbstractC3063a aVar, boolean z) {
        this.f4520a = new Pools$SimplePool(30);
        this.f4521b = new ArrayList<>();
        this.f4522c = new ArrayList<>();
        this.f4527h = 0;
        this.f4523d = aVar;
        this.f4525f = z;
        this.f4526g = new C3138i(this);
    }
}
