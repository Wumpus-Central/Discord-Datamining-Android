package androidx.viewpager2.widget;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.C3313f;
import java.util.Locale;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.viewpager2.widget.e */
/* loaded from: classes.dex */
public final class C3311e extends RecyclerView.OnScrollListener {

    /* renamed from: a */
    private C3313f.AbstractC3321i f5299a;

    /* renamed from: b */
    private final C3313f f5300b;

    /* renamed from: c */
    private final RecyclerView f5301c;

    /* renamed from: d */
    private final LinearLayoutManager f5302d;

    /* renamed from: e */
    private int f5303e;

    /* renamed from: f */
    private int f5304f;

    /* renamed from: g */
    private C3312a f5305g = new C3312a();

    /* renamed from: h */
    private int f5306h;

    /* renamed from: i */
    private int f5307i;

    /* renamed from: j */
    private boolean f5308j;

    /* renamed from: k */
    private boolean f5309k;

    /* renamed from: l */
    private boolean f5310l;

    /* renamed from: m */
    private boolean f5311m;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.viewpager2.widget.e$a */
    /* loaded from: classes.dex */
    public static final class C3312a {

        /* renamed from: a */
        int f5312a;

        /* renamed from: b */
        float f5313b;

        /* renamed from: c */
        int f5314c;

        C3312a() {
        }

        /* renamed from: a */
        void m34679a() {
            this.f5312a = -1;
            this.f5313b = 0.0f;
            this.f5314c = 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3311e(C3313f fVar) {
        this.f5300b = fVar;
        RecyclerView recyclerView = fVar.f5324t;
        this.f5301c = recyclerView;
        this.f5302d = (LinearLayoutManager) recyclerView.getLayoutManager();
        m34683l();
    }

    /* renamed from: a */
    private void m34694a(int i, float f, int i2) {
        C3313f.AbstractC3321i iVar = this.f5299a;
        if (iVar != null) {
            iVar.mo26099b(i, f, i2);
        }
    }

    /* renamed from: b */
    private void m34693b(int i) {
        C3313f.AbstractC3321i iVar = this.f5299a;
        if (iVar != null) {
            iVar.mo26098c(i);
        }
    }

    /* renamed from: c */
    private void m34692c(int i) {
        if ((this.f5303e != 3 || this.f5304f != 0) && this.f5304f != i) {
            this.f5304f = i;
            C3313f.AbstractC3321i iVar = this.f5299a;
            if (iVar != null) {
                iVar.mo26100a(i);
            }
        }
    }

    /* renamed from: d */
    private int m34691d() {
        return this.f5302d.m35561i2();
    }

    /* renamed from: i */
    private boolean m34686i() {
        int i = this.f5303e;
        return i == 1 || i == 4;
    }

    /* renamed from: l */
    private void m34683l() {
        this.f5303e = 0;
        this.f5304f = 0;
        this.f5305g.m34679a();
        this.f5306h = -1;
        this.f5307i = -1;
        this.f5308j = false;
        this.f5309k = false;
        this.f5311m = false;
        this.f5310l = false;
    }

    /* renamed from: n */
    private void m34681n(boolean z) {
        int i;
        this.f5311m = z;
        if (z) {
            i = 4;
        } else {
            i = 1;
        }
        this.f5303e = i;
        int i2 = this.f5307i;
        if (i2 != -1) {
            this.f5306h = i2;
            this.f5307i = -1;
        } else if (this.f5306h == -1) {
            this.f5306h = m34691d();
        }
        m34692c(1);
    }

    /* renamed from: o */
    private void m34680o() {
        boolean z;
        int i;
        float f;
        C3312a aVar = this.f5305g;
        int i2 = this.f5302d.m35561i2();
        aVar.f5312a = i2;
        if (i2 == -1) {
            aVar.m34679a();
            return;
        }
        View N = this.f5302d.mo35490N(i2);
        if (N == null) {
            aVar.m34679a();
            return;
        }
        int l0 = this.f5302d.m35453l0(N);
        int q0 = this.f5302d.m35441q0(N);
        int t0 = this.f5302d.m35433t0(N);
        int S = this.f5302d.m35482S(N);
        ViewGroup.LayoutParams layoutParams = N.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            l0 += marginLayoutParams.leftMargin;
            q0 += marginLayoutParams.rightMargin;
            t0 += marginLayoutParams.topMargin;
            S += marginLayoutParams.bottomMargin;
        }
        int height = N.getHeight() + t0 + S;
        int width = N.getWidth() + l0 + q0;
        if (this.f5302d.m35547w2() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            i = (N.getLeft() - l0) - this.f5301c.getPaddingLeft();
            if (this.f5300b.m34675d()) {
                i = -i;
            }
            height = width;
        } else {
            i = (N.getTop() - t0) - this.f5301c.getPaddingTop();
        }
        int i3 = -i;
        aVar.f5314c = i3;
        if (i3 >= 0) {
            if (height == 0) {
                f = 0.0f;
            } else {
                f = i3 / height;
            }
            aVar.f5313b = f;
        } else if (new C3307a(this.f5302d).m34701d()) {
            throw new IllegalStateException("Page(s) contain a ViewGroup with a LayoutTransition (or animateLayoutChanges=\"true\"), which interferes with the scrolling animation. Make sure to call getLayoutTransition().setAnimateParentHierarchy(false) on all ViewGroups with a LayoutTransition before an animation is started.");
        } else {
            throw new IllegalStateException(String.format(Locale.US, "Page can only be offset by a positive amount, not by %d", Integer.valueOf(aVar.f5314c)));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public double m34690e() {
        m34680o();
        C3312a aVar = this.f5305g;
        return aVar.f5312a + aVar.f5313b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public int m34689f() {
        return this.f5304f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public boolean m34688g() {
        return this.f5311m;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public boolean m34687h() {
        return this.f5304f == 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public void m34685j() {
        this.f5310l = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public void m34684k(int i, boolean z) {
        int i2;
        if (z) {
            i2 = 2;
        } else {
            i2 = 3;
        }
        this.f5303e = i2;
        boolean z2 = false;
        this.f5311m = false;
        if (this.f5307i != i) {
            z2 = true;
        }
        this.f5307i = i;
        m34692c(2);
        if (z2) {
            m34693b(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public void m34682m(C3313f.AbstractC3321i iVar) {
        this.f5299a = iVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public void onScrollStateChanged(RecyclerView recyclerView, int i) {
        boolean z = true;
        if (!(this.f5303e == 1 && this.f5304f == 1) && i == 1) {
            m34681n(false);
        } else if (!m34686i() || i != 2) {
            if (m34686i() && i == 0) {
                m34680o();
                if (!this.f5309k) {
                    int i2 = this.f5305g.f5312a;
                    if (i2 != -1) {
                        m34694a(i2, 0.0f, 0);
                    }
                } else {
                    C3312a aVar = this.f5305g;
                    if (aVar.f5314c == 0) {
                        int i3 = this.f5306h;
                        int i4 = aVar.f5312a;
                        if (i3 != i4) {
                            m34693b(i4);
                        }
                    } else {
                        z = false;
                    }
                }
                if (z) {
                    m34692c(0);
                    m34683l();
                }
            }
            if (this.f5303e == 2 && i == 0 && this.f5310l) {
                m34680o();
                C3312a aVar2 = this.f5305g;
                if (aVar2.f5314c == 0) {
                    int i5 = this.f5307i;
                    int i6 = aVar2.f5312a;
                    if (i5 != i6) {
                        if (i6 == -1) {
                            i6 = 0;
                        }
                        m34693b(i6);
                    }
                    m34692c(0);
                    m34683l();
                }
            }
        } else if (this.f5309k) {
            m34692c(2);
            this.f5308j = true;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001d, code lost:
        if (r5 == r3.f5300b.m34675d()) goto L_0x0022;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0039  */
    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onScrolled(androidx.recyclerview.widget.RecyclerView r4, int r5, int r6) {
        /*
            r3 = this;
            r4 = 1
            r3.f5309k = r4
            r3.m34680o()
            boolean r0 = r3.f5308j
            r1 = -1
            r2 = 0
            if (r0 == 0) goto L_0x003d
            r3.f5308j = r2
            if (r6 > 0) goto L_0x0022
            if (r6 != 0) goto L_0x0020
            if (r5 >= 0) goto L_0x0016
            r5 = r4
            goto L_0x0017
        L_0x0016:
            r5 = r2
        L_0x0017:
            androidx.viewpager2.widget.f r6 = r3.f5300b
            boolean r6 = r6.m34675d()
            if (r5 != r6) goto L_0x0020
            goto L_0x0022
        L_0x0020:
            r5 = r2
            goto L_0x0023
        L_0x0022:
            r5 = r4
        L_0x0023:
            if (r5 == 0) goto L_0x002f
            androidx.viewpager2.widget.e$a r5 = r3.f5305g
            int r6 = r5.f5314c
            if (r6 == 0) goto L_0x002f
            int r5 = r5.f5312a
            int r5 = r5 + r4
            goto L_0x0033
        L_0x002f:
            androidx.viewpager2.widget.e$a r5 = r3.f5305g
            int r5 = r5.f5312a
        L_0x0033:
            r3.f5307i = r5
            int r6 = r3.f5306h
            if (r6 == r5) goto L_0x004b
            r3.m34693b(r5)
            goto L_0x004b
        L_0x003d:
            int r5 = r3.f5303e
            if (r5 != 0) goto L_0x004b
            androidx.viewpager2.widget.e$a r5 = r3.f5305g
            int r5 = r5.f5312a
            if (r5 != r1) goto L_0x0048
            r5 = r2
        L_0x0048:
            r3.m34693b(r5)
        L_0x004b:
            androidx.viewpager2.widget.e$a r5 = r3.f5305g
            int r6 = r5.f5312a
            if (r6 != r1) goto L_0x0052
            r6 = r2
        L_0x0052:
            float r0 = r5.f5313b
            int r5 = r5.f5314c
            r3.m34694a(r6, r0, r5)
            androidx.viewpager2.widget.e$a r5 = r3.f5305g
            int r6 = r5.f5312a
            int r0 = r3.f5307i
            if (r6 == r0) goto L_0x0063
            if (r0 != r1) goto L_0x0071
        L_0x0063:
            int r5 = r5.f5314c
            if (r5 != 0) goto L_0x0071
            int r5 = r3.f5304f
            if (r5 == r4) goto L_0x0071
            r3.m34692c(r2)
            r3.m34683l()
        L_0x0071:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager2.widget.C3311e.onScrolled(androidx.recyclerview.widget.RecyclerView, int, int):void");
    }
}
