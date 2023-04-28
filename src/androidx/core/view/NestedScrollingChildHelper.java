package androidx.core.view;

import android.view.View;
import android.view.ViewParent;

/* loaded from: classes.dex */
public class NestedScrollingChildHelper {

    /* renamed from: a */
    private ViewParent f3505a;

    /* renamed from: b */
    private ViewParent f3506b;

    /* renamed from: c */
    private final View f3507c;

    /* renamed from: d */
    private boolean f3508d;

    /* renamed from: e */
    private int[] f3509e;

    public NestedScrollingChildHelper(View view) {
        this.f3507c = view;
    }

    /* renamed from: h */
    private boolean m37543h(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        ViewParent i6;
        int i7;
        int i8;
        int[] iArr3;
        if (!m37538m() || (i6 = m37542i(i5)) == null) {
            return false;
        }
        if (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) {
            if (iArr != null) {
                iArr[0] = 0;
                iArr[1] = 0;
            }
            return false;
        }
        if (iArr != null) {
            this.f3507c.getLocationInWindow(iArr);
            i8 = iArr[0];
            i7 = iArr[1];
        } else {
            i8 = 0;
            i7 = 0;
        }
        if (iArr2 == null) {
            int[] j = m37541j();
            j[0] = 0;
            j[1] = 0;
            iArr3 = j;
        } else {
            iArr3 = iArr2;
        }
        C2663l2.m37193d(i6, this.f3507c, i, i2, i3, i4, i5, iArr3);
        if (iArr != null) {
            this.f3507c.getLocationInWindow(iArr);
            iArr[0] = iArr[0] - i8;
            iArr[1] = iArr[1] - i7;
        }
        return true;
    }

    /* renamed from: i */
    private ViewParent m37542i(int i) {
        if (i == 0) {
            return this.f3505a;
        }
        if (i != 1) {
            return null;
        }
        return this.f3506b;
    }

    /* renamed from: j */
    private int[] m37541j() {
        if (this.f3509e == null) {
            this.f3509e = new int[2];
        }
        return this.f3509e;
    }

    /* renamed from: o */
    private void m37536o(int i, ViewParent viewParent) {
        if (i == 0) {
            this.f3505a = viewParent;
        } else if (i == 1) {
            this.f3506b = viewParent;
        }
    }

    /* renamed from: a */
    public boolean m37550a(float f, float f2, boolean z) {
        ViewParent i;
        if (!m37538m() || (i = m37542i(0)) == null) {
            return false;
        }
        return C2663l2.m37196a(i, this.f3507c, f, f2, z);
    }

    /* renamed from: b */
    public boolean m37549b(float f, float f2) {
        ViewParent i;
        if (!m37538m() || (i = m37542i(0)) == null) {
            return false;
        }
        return C2663l2.m37195b(i, this.f3507c, f, f2);
    }

    /* renamed from: c */
    public boolean m37548c(int i, int i2, int[] iArr, int[] iArr2) {
        return m37547d(i, i2, iArr, iArr2, 0);
    }

    /* renamed from: d */
    public boolean m37547d(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        ViewParent i4;
        int i5;
        int i6;
        if (!m37538m() || (i4 = m37542i(i3)) == null) {
            return false;
        }
        if (i != 0 || i2 != 0) {
            if (iArr2 != null) {
                this.f3507c.getLocationInWindow(iArr2);
                i6 = iArr2[0];
                i5 = iArr2[1];
            } else {
                i6 = 0;
                i5 = 0;
            }
            if (iArr == null) {
                iArr = m37541j();
            }
            iArr[0] = 0;
            iArr[1] = 0;
            C2663l2.m37194c(i4, this.f3507c, i, i2, iArr, i3);
            if (iArr2 != null) {
                this.f3507c.getLocationInWindow(iArr2);
                iArr2[0] = iArr2[0] - i6;
                iArr2[1] = iArr2[1] - i5;
            }
            if (iArr[0] == 0 && iArr[1] == 0) {
                return false;
            }
            return true;
        } else if (iArr2 == null) {
            return false;
        } else {
            iArr2[0] = 0;
            iArr2[1] = 0;
            return false;
        }
    }

    /* renamed from: e */
    public void m37546e(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        m37543h(i, i2, i3, i4, iArr, i5, iArr2);
    }

    /* renamed from: f */
    public boolean m37545f(int i, int i2, int i3, int i4, int[] iArr) {
        return m37543h(i, i2, i3, i4, iArr, 0, null);
    }

    /* renamed from: g */
    public boolean m37544g(int i, int i2, int i3, int i4, int[] iArr, int i5) {
        return m37543h(i, i2, i3, i4, iArr, i5, null);
    }

    /* renamed from: k */
    public boolean m37540k() {
        return m37539l(0);
    }

    /* renamed from: l */
    public boolean m37539l(int i) {
        return m37542i(i) != null;
    }

    /* renamed from: m */
    public boolean m37538m() {
        return this.f3508d;
    }

    /* renamed from: n */
    public void m37537n(boolean z) {
        if (this.f3508d) {
            C2733w0.m37034P0(this.f3507c);
        }
        this.f3508d = z;
    }

    /* renamed from: p */
    public boolean m37535p(int i) {
        return m37534q(i, 0);
    }

    /* renamed from: q */
    public boolean m37534q(int i, int i2) {
        if (m37539l(i2)) {
            return true;
        }
        if (!m37538m()) {
            return false;
        }
        View view = this.f3507c;
        for (ViewParent parent = this.f3507c.getParent(); parent != null; parent = parent.getParent()) {
            if (C2663l2.m37191f(parent, view, this.f3507c, i, i2)) {
                m37536o(i2, parent);
                C2663l2.m37192e(parent, view, this.f3507c, i, i2);
                return true;
            }
            if (parent instanceof View) {
                view = (View) parent;
            }
        }
        return false;
    }

    /* renamed from: r */
    public void m37533r() {
        m37532s(0);
    }

    /* renamed from: s */
    public void m37532s(int i) {
        ViewParent i2 = m37542i(i);
        if (i2 != null) {
            C2663l2.m37190g(i2, this.f3507c, i);
            m37536o(i, null);
        }
    }
}
