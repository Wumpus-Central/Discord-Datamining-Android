package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class ChildHelper {

    /* renamed from: a */
    final AbstractC3066b f4532a;

    /* renamed from: b */
    final C3065a f4533b = new C3065a();

    /* renamed from: c */
    final List<View> f4534c = new ArrayList();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.recyclerview.widget.ChildHelper$a */
    /* loaded from: classes.dex */
    public static class C3065a {

        /* renamed from: a */
        long f4535a = 0;

        /* renamed from: b */
        C3065a f4536b;

        C3065a() {
        }

        /* renamed from: c */
        private void m35653c() {
            if (this.f4536b == null) {
                this.f4536b = new C3065a();
            }
        }

        /* renamed from: a */
        void m35655a(int i) {
            if (i >= 64) {
                C3065a aVar = this.f4536b;
                if (aVar != null) {
                    aVar.m35655a(i - 64);
                    return;
                }
                return;
            }
            this.f4535a &= ~(1 << i);
        }

        /* renamed from: b */
        int m35654b(int i) {
            C3065a aVar = this.f4536b;
            if (aVar == null) {
                if (i >= 64) {
                    return Long.bitCount(this.f4535a);
                }
                return Long.bitCount(this.f4535a & ((1 << i) - 1));
            } else if (i < 64) {
                return Long.bitCount(this.f4535a & ((1 << i) - 1));
            } else {
                return aVar.m35654b(i - 64) + Long.bitCount(this.f4535a);
            }
        }

        /* renamed from: d */
        boolean m35652d(int i) {
            if (i >= 64) {
                m35653c();
                return this.f4536b.m35652d(i - 64);
            } else if ((this.f4535a & (1 << i)) != 0) {
                return true;
            } else {
                return false;
            }
        }

        /* renamed from: e */
        void m35651e(int i, boolean z) {
            boolean z2;
            if (i >= 64) {
                m35653c();
                this.f4536b.m35651e(i - 64, z);
                return;
            }
            long j = this.f4535a;
            if ((Long.MIN_VALUE & j) != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            long j2 = (1 << i) - 1;
            this.f4535a = ((j & (~j2)) << 1) | (j & j2);
            if (z) {
                m35648h(i);
            } else {
                m35655a(i);
            }
            if (z2 || this.f4536b != null) {
                m35653c();
                this.f4536b.m35651e(0, z2);
            }
        }

        /* renamed from: f */
        boolean m35650f(int i) {
            boolean z;
            if (i >= 64) {
                m35653c();
                return this.f4536b.m35650f(i - 64);
            }
            long j = 1 << i;
            long j2 = this.f4535a;
            if ((j2 & j) != 0) {
                z = true;
            } else {
                z = false;
            }
            long j3 = j2 & (~j);
            this.f4535a = j3;
            long j4 = j - 1;
            this.f4535a = (j3 & j4) | Long.rotateRight((~j4) & j3, 1);
            C3065a aVar = this.f4536b;
            if (aVar != null) {
                if (aVar.m35652d(0)) {
                    m35648h(63);
                }
                this.f4536b.m35650f(0);
            }
            return z;
        }

        /* renamed from: g */
        void m35649g() {
            this.f4535a = 0L;
            C3065a aVar = this.f4536b;
            if (aVar != null) {
                aVar.m35649g();
            }
        }

        /* renamed from: h */
        void m35648h(int i) {
            if (i >= 64) {
                m35653c();
                this.f4536b.m35648h(i - 64);
                return;
            }
            this.f4535a |= 1 << i;
        }

        public String toString() {
            if (this.f4536b == null) {
                return Long.toBinaryString(this.f4535a);
            }
            return this.f4536b.toString() + "xx" + Long.toBinaryString(this.f4535a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.recyclerview.widget.ChildHelper$b */
    /* loaded from: classes.dex */
    public interface AbstractC3066b {
        /* renamed from: a */
        void mo35339a(View view);

        /* renamed from: b */
        RecyclerView.ViewHolder mo35338b(View view);

        /* renamed from: c */
        void mo35337c(int i);

        /* renamed from: d */
        void mo35336d(View view, int i);

        /* renamed from: e */
        void mo35335e();

        /* renamed from: f */
        int mo35334f(View view);

        /* renamed from: g */
        void mo35333g(View view);

        View getChildAt(int i);

        int getChildCount();

        /* renamed from: h */
        void mo35332h(int i);

        /* renamed from: i */
        void mo35331i(View view, int i, ViewGroup.LayoutParams layoutParams);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ChildHelper(AbstractC3066b bVar) {
        this.f4532a = bVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001f, code lost:
        if (r4.f4533b.m35652d(r2) == false) goto L_0x0024;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0021, code lost:
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0024, code lost:
        return r2;
     */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private int m35668h(int r5) {
        /*
            r4 = this;
            r0 = -1
            if (r5 >= 0) goto L_0x0004
            return r0
        L_0x0004:
            androidx.recyclerview.widget.ChildHelper$b r1 = r4.f4532a
            int r1 = r1.getChildCount()
            r2 = r5
        L_0x000b:
            if (r2 >= r1) goto L_0x0027
            androidx.recyclerview.widget.ChildHelper$a r3 = r4.f4533b
            int r3 = r3.m35654b(r2)
            int r3 = r2 - r3
            int r3 = r5 - r3
            if (r3 != 0) goto L_0x0025
        L_0x0019:
            androidx.recyclerview.widget.ChildHelper$a r5 = r4.f4533b
            boolean r5 = r5.m35652d(r2)
            if (r5 == 0) goto L_0x0024
            int r2 = r2 + 1
            goto L_0x0019
        L_0x0024:
            return r2
        L_0x0025:
            int r2 = r2 + r3
            goto L_0x000b
        L_0x0027:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.ChildHelper.m35668h(int):int");
    }

    /* renamed from: l */
    private void m35664l(View view) {
        this.f4534c.add(view);
        this.f4532a.mo35339a(view);
    }

    /* renamed from: t */
    private boolean m35656t(View view) {
        if (!this.f4534c.remove(view)) {
            return false;
        }
        this.f4532a.mo35333g(view);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m35675a(View view, int i, boolean z) {
        int i2;
        if (i < 0) {
            i2 = this.f4532a.getChildCount();
        } else {
            i2 = m35668h(i);
        }
        this.f4533b.m35651e(i2, z);
        if (z) {
            m35664l(view);
        }
        this.f4532a.mo35336d(view, i2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public void m35674b(View view, boolean z) {
        m35675a(view, -1, z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public void m35673c(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        int i2;
        if (i < 0) {
            i2 = this.f4532a.getChildCount();
        } else {
            i2 = m35668h(i);
        }
        this.f4533b.m35651e(i2, z);
        if (z) {
            m35664l(view);
        }
        this.f4532a.mo35331i(view, i2, layoutParams);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public void m35672d(int i) {
        int h = m35668h(i);
        this.f4533b.m35650f(h);
        this.f4532a.mo35337c(h);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public View m35671e(int i) {
        int size = this.f4534c.size();
        for (int i2 = 0; i2 < size; i2++) {
            View view = this.f4534c.get(i2);
            RecyclerView.ViewHolder b = this.f4532a.mo35338b(view);
            if (!(b.getLayoutPosition() != i || b.isInvalid() || b.isRemoved())) {
                return view;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public View m35670f(int i) {
        return this.f4532a.getChildAt(m35668h(i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public int m35669g() {
        return this.f4532a.getChildCount() - this.f4534c.size();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public View m35667i(int i) {
        return this.f4532a.getChildAt(i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public int m35666j() {
        return this.f4532a.getChildCount();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public void m35665k(View view) {
        int f = this.f4532a.mo35334f(view);
        if (f >= 0) {
            this.f4533b.m35648h(f);
            m35664l(view);
            return;
        }
        throw new IllegalArgumentException("view is not a child, cannot hide " + view);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public int m35663m(View view) {
        int f = this.f4532a.mo35334f(view);
        if (f != -1 && !this.f4533b.m35652d(f)) {
            return f - this.f4533b.m35654b(f);
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n */
    public boolean m35662n(View view) {
        return this.f4534c.contains(view);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o */
    public void m35661o() {
        this.f4533b.m35649g();
        for (int size = this.f4534c.size() - 1; size >= 0; size--) {
            this.f4532a.mo35333g(this.f4534c.get(size));
            this.f4534c.remove(size);
        }
        this.f4532a.mo35335e();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p */
    public void m35660p(View view) {
        int f = this.f4532a.mo35334f(view);
        if (f >= 0) {
            if (this.f4533b.m35650f(f)) {
                m35656t(view);
            }
            this.f4532a.mo35332h(f);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q */
    public void m35659q(int i) {
        int h = m35668h(i);
        View childAt = this.f4532a.getChildAt(h);
        if (childAt != null) {
            if (this.f4533b.m35650f(h)) {
                m35656t(childAt);
            }
            this.f4532a.mo35332h(h);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r */
    public boolean m35658r(View view) {
        int f = this.f4532a.mo35334f(view);
        if (f == -1) {
            m35656t(view);
            return true;
        } else if (!this.f4533b.m35652d(f)) {
            return false;
        } else {
            this.f4533b.m35650f(f);
            m35656t(view);
            this.f4532a.mo35332h(f);
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s */
    public void m35657s(View view) {
        int f = this.f4532a.mo35334f(view);
        if (f < 0) {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        } else if (this.f4533b.m35652d(f)) {
            this.f4533b.m35655a(f);
            m35656t(view);
        } else {
            throw new RuntimeException("trying to unhide a view that was not hidden" + view);
        }
    }

    public String toString() {
        return this.f4533b.toString() + ", hidden list:" + this.f4534c.size();
    }
}
