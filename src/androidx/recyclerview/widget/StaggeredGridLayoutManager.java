package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.react.uimanager.ViewDefaults;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;

/* loaded from: classes.dex */
public class StaggeredGridLayoutManager extends RecyclerView.LayoutManager implements RecyclerView.SmoothScroller.AbstractC3100a {

    /* renamed from: D */
    C3118f[] f35747D;

    /* renamed from: E */
    AbstractC3140j f35748E;

    /* renamed from: F */
    AbstractC3140j f35749F;

    /* renamed from: G */
    private int f35750G;

    /* renamed from: H */
    private int f35751H;

    /* renamed from: L */
    private BitSet f35755L;

    /* renamed from: Q */
    private boolean f35760Q;

    /* renamed from: R */
    private boolean f35761R;

    /* renamed from: S */
    private C3116e f35762S;

    /* renamed from: T */
    private int f35763T;

    /* renamed from: Y */
    private int[] f35768Y;

    /* renamed from: C */
    private int f35746C = -1;

    /* renamed from: J */
    boolean f35753J = false;

    /* renamed from: K */
    boolean f35754K = false;

    /* renamed from: M */
    int f35756M = -1;

    /* renamed from: N */
    int f35757N = Integer.MIN_VALUE;

    /* renamed from: O */
    C3114d f35758O = new C3114d();

    /* renamed from: P */
    private int f35759P = 2;

    /* renamed from: U */
    private final Rect f35764U = new Rect();

    /* renamed from: V */
    private final C3112b f35765V = new C3112b();

    /* renamed from: W */
    private boolean f35766W = false;

    /* renamed from: X */
    private boolean f35767X = true;

    /* renamed from: Z */
    private final Runnable f35769Z = new RunnableC3111a();

    /* renamed from: I */
    private final C3135f f35752I = new C3135f();

    /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$a */
    /* loaded from: classes.dex */
    class RunnableC3111a implements Runnable {
        RunnableC3111a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            StaggeredGridLayoutManager.this.m35271b2();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$b */
    /* loaded from: classes.dex */
    public class C3112b {

        /* renamed from: a */
        int f4758a;

        /* renamed from: b */
        int f4759b;

        /* renamed from: c */
        boolean f4760c;

        /* renamed from: d */
        boolean f4761d;

        /* renamed from: e */
        boolean f4762e;

        /* renamed from: f */
        int[] f4763f;

        C3112b() {
            m35241c();
        }

        /* renamed from: a */
        void m35243a() {
            int i;
            if (this.f4760c) {
                i = StaggeredGridLayoutManager.this.f35748E.mo35100i();
            } else {
                i = StaggeredGridLayoutManager.this.f35748E.mo35096m();
            }
            this.f4759b = i;
        }

        /* renamed from: b */
        void m35242b(int i) {
            if (this.f4760c) {
                this.f4759b = StaggeredGridLayoutManager.this.f35748E.mo35100i() - i;
            } else {
                this.f4759b = StaggeredGridLayoutManager.this.f35748E.mo35096m() + i;
            }
        }

        /* renamed from: c */
        void m35241c() {
            this.f4758a = -1;
            this.f4759b = Integer.MIN_VALUE;
            this.f4760c = false;
            this.f4761d = false;
            this.f4762e = false;
            int[] iArr = this.f4763f;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
        }

        /* renamed from: d */
        void m35240d(C3118f[] fVarArr) {
            int length = fVarArr.length;
            int[] iArr = this.f4763f;
            if (iArr == null || iArr.length < length) {
                this.f4763f = new int[StaggeredGridLayoutManager.this.f35747D.length];
            }
            for (int i = 0; i < length; i++) {
                this.f4763f[i] = fVarArr[i].m35201p(Integer.MIN_VALUE);
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$c */
    /* loaded from: classes.dex */
    public static class C3113c extends RecyclerView.C3109i {

        /* renamed from: o */
        C3118f f4765o;

        /* renamed from: p */
        boolean f4766p;

        public C3113c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        /* renamed from: i */
        public boolean m35239i() {
            return this.f4766p;
        }

        public C3113c(int i, int i2) {
            super(i, i2);
        }

        public C3113c(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public C3113c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$e */
    /* loaded from: classes.dex */
    public static class C3116e implements Parcelable {
        public static final Parcelable.Creator<C3116e> CREATOR = new C3117a();

        /* renamed from: k */
        int f4773k;

        /* renamed from: l */
        int f4774l;

        /* renamed from: m */
        int f4775m;

        /* renamed from: n */
        int[] f4776n;

        /* renamed from: o */
        int f4777o;

        /* renamed from: p */
        int[] f4778p;

        /* renamed from: q */
        List<C3114d.C3115a> f4779q;

        /* renamed from: r */
        boolean f4780r;

        /* renamed from: s */
        boolean f4781s;

        /* renamed from: t */
        boolean f4782t;

        /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$e$a */
        /* loaded from: classes.dex */
        class C3117a implements Parcelable.Creator<C3116e> {
            C3117a() {
            }

            /* renamed from: a */
            public C3116e createFromParcel(Parcel parcel) {
                return new C3116e(parcel);
            }

            /* renamed from: b */
            public C3116e[] newArray(int i) {
                return new C3116e[i];
            }
        }

        public C3116e() {
        }

        /* renamed from: a */
        void m35220a() {
            this.f4776n = null;
            this.f4775m = 0;
            this.f4773k = -1;
            this.f4774l = -1;
        }

        /* renamed from: b */
        void m35219b() {
            this.f4776n = null;
            this.f4775m = 0;
            this.f4777o = 0;
            this.f4778p = null;
            this.f4779q = null;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f4773k);
            parcel.writeInt(this.f4774l);
            parcel.writeInt(this.f4775m);
            if (this.f4775m > 0) {
                parcel.writeIntArray(this.f4776n);
            }
            parcel.writeInt(this.f4777o);
            if (this.f4777o > 0) {
                parcel.writeIntArray(this.f4778p);
            }
            parcel.writeInt(this.f4780r ? 1 : 0);
            parcel.writeInt(this.f4781s ? 1 : 0);
            parcel.writeInt(this.f4782t ? 1 : 0);
            parcel.writeList(this.f4779q);
        }

        C3116e(Parcel parcel) {
            this.f4773k = parcel.readInt();
            this.f4774l = parcel.readInt();
            int readInt = parcel.readInt();
            this.f4775m = readInt;
            if (readInt > 0) {
                int[] iArr = new int[readInt];
                this.f4776n = iArr;
                parcel.readIntArray(iArr);
            }
            int readInt2 = parcel.readInt();
            this.f4777o = readInt2;
            if (readInt2 > 0) {
                int[] iArr2 = new int[readInt2];
                this.f4778p = iArr2;
                parcel.readIntArray(iArr2);
            }
            boolean z = false;
            this.f4780r = parcel.readInt() == 1;
            this.f4781s = parcel.readInt() == 1;
            this.f4782t = parcel.readInt() == 1 ? true : z;
            this.f4779q = parcel.readArrayList(C3114d.C3115a.class.getClassLoader());
        }

        public C3116e(C3116e eVar) {
            this.f4775m = eVar.f4775m;
            this.f4773k = eVar.f4773k;
            this.f4774l = eVar.f4774l;
            this.f4776n = eVar.f4776n;
            this.f4777o = eVar.f4777o;
            this.f4778p = eVar.f4778p;
            this.f4780r = eVar.f4780r;
            this.f4781s = eVar.f4781s;
            this.f4782t = eVar.f4782t;
            this.f4779q = eVar.f4779q;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$f */
    /* loaded from: classes.dex */
    public class C3118f {

        /* renamed from: a */
        ArrayList<View> f4783a = new ArrayList<>();

        /* renamed from: b */
        int f4784b = Integer.MIN_VALUE;

        /* renamed from: c */
        int f4785c = Integer.MIN_VALUE;

        /* renamed from: d */
        int f4786d = 0;

        /* renamed from: e */
        final int f4787e;

        C3118f(int i) {
            this.f4787e = i;
        }

        /* renamed from: a */
        void m35216a(View view) {
            C3113c n = m35203n(view);
            n.f4765o = this;
            this.f4783a.add(view);
            this.f4785c = Integer.MIN_VALUE;
            if (this.f4783a.size() == 1) {
                this.f4784b = Integer.MIN_VALUE;
            }
            if (n.m35318e() || n.m35319b()) {
                this.f4786d += StaggeredGridLayoutManager.this.f35748E.mo35104e(view);
            }
        }

        /* renamed from: b */
        void m35215b(boolean z, int i) {
            int i2;
            if (z) {
                i2 = m35205l(Integer.MIN_VALUE);
            } else {
                i2 = m35201p(Integer.MIN_VALUE);
            }
            m35212e();
            if (i2 != Integer.MIN_VALUE) {
                if (z && i2 < StaggeredGridLayoutManager.this.f35748E.mo35100i()) {
                    return;
                }
                if (z || i2 <= StaggeredGridLayoutManager.this.f35748E.mo35096m()) {
                    if (i != Integer.MIN_VALUE) {
                        i2 += i;
                    }
                    this.f4785c = i2;
                    this.f4784b = i2;
                }
            }
        }

        /* renamed from: c */
        void m35214c() {
            C3114d.C3115a f;
            ArrayList<View> arrayList = this.f4783a;
            View view = arrayList.get(arrayList.size() - 1);
            C3113c n = m35203n(view);
            this.f4785c = StaggeredGridLayoutManager.this.f35748E.mo35105d(view);
            if (n.f4766p && (f = StaggeredGridLayoutManager.this.f35758O.m35233f(n.m35320a())) != null && f.f4770l == 1) {
                this.f4785c += f.m35223a(this.f4787e);
            }
        }

        /* renamed from: d */
        void m35213d() {
            C3114d.C3115a f;
            View view = this.f4783a.get(0);
            C3113c n = m35203n(view);
            this.f4784b = StaggeredGridLayoutManager.this.f35748E.mo35102g(view);
            if (n.f4766p && (f = StaggeredGridLayoutManager.this.f35758O.m35233f(n.m35320a())) != null && f.f4770l == -1) {
                this.f4784b -= f.m35223a(this.f4787e);
            }
        }

        /* renamed from: e */
        void m35212e() {
            this.f4783a.clear();
            m35200q();
            this.f4786d = 0;
        }

        /* renamed from: f */
        public int m35211f() {
            if (StaggeredGridLayoutManager.this.f35753J) {
                return m35208i(this.f4783a.size() - 1, -1, true);
            }
            return m35208i(0, this.f4783a.size(), true);
        }

        /* renamed from: g */
        public int m35210g() {
            if (StaggeredGridLayoutManager.this.f35753J) {
                return m35208i(0, this.f4783a.size(), true);
            }
            return m35208i(this.f4783a.size() - 1, -1, true);
        }

        /* renamed from: h */
        int m35209h(int i, int i2, boolean z, boolean z2, boolean z3) {
            int i3;
            boolean z4;
            int m = StaggeredGridLayoutManager.this.f35748E.mo35096m();
            int i4 = StaggeredGridLayoutManager.this.f35748E.mo35100i();
            if (i2 > i) {
                i3 = 1;
            } else {
                i3 = -1;
            }
            while (i != i2) {
                View view = this.f4783a.get(i);
                int g = StaggeredGridLayoutManager.this.f35748E.mo35102g(view);
                int d = StaggeredGridLayoutManager.this.f35748E.mo35105d(view);
                boolean z5 = false;
                if (!z3 ? g >= i4 : g > i4) {
                    z4 = false;
                } else {
                    z4 = true;
                }
                if (!z3 ? d > m : d >= m) {
                    z5 = true;
                }
                if (z4 && z5) {
                    if (!z || !z2) {
                        if (z2) {
                            return StaggeredGridLayoutManager.this.m35446o0(view);
                        }
                        if (g < m || d > i4) {
                            return StaggeredGridLayoutManager.this.m35446o0(view);
                        }
                    } else if (g >= m && d <= i4) {
                        return StaggeredGridLayoutManager.this.m35446o0(view);
                    }
                }
                i += i3;
            }
            return -1;
        }

        /* renamed from: i */
        int m35208i(int i, int i2, boolean z) {
            return m35209h(i, i2, false, false, z);
        }

        /* renamed from: j */
        public int m35207j() {
            return this.f4786d;
        }

        /* renamed from: k */
        int m35206k() {
            int i = this.f4785c;
            if (i != Integer.MIN_VALUE) {
                return i;
            }
            m35214c();
            return this.f4785c;
        }

        /* renamed from: l */
        int m35205l(int i) {
            int i2 = this.f4785c;
            if (i2 != Integer.MIN_VALUE) {
                return i2;
            }
            if (this.f4783a.size() == 0) {
                return i;
            }
            m35214c();
            return this.f4785c;
        }

        /* renamed from: m */
        public View m35204m(int i, int i2) {
            View view = null;
            if (i2 != -1) {
                int size = this.f4783a.size() - 1;
                while (size >= 0) {
                    View view2 = this.f4783a.get(size);
                    StaggeredGridLayoutManager staggeredGridLayoutManager = StaggeredGridLayoutManager.this;
                    if (staggeredGridLayoutManager.f35753J && staggeredGridLayoutManager.m35446o0(view2) >= i) {
                        break;
                    }
                    StaggeredGridLayoutManager staggeredGridLayoutManager2 = StaggeredGridLayoutManager.this;
                    if ((!staggeredGridLayoutManager2.f35753J && staggeredGridLayoutManager2.m35446o0(view2) <= i) || !view2.hasFocusable()) {
                        break;
                    }
                    size--;
                    view = view2;
                }
            } else {
                int size2 = this.f4783a.size();
                int i3 = 0;
                while (i3 < size2) {
                    View view3 = this.f4783a.get(i3);
                    StaggeredGridLayoutManager staggeredGridLayoutManager3 = StaggeredGridLayoutManager.this;
                    if (staggeredGridLayoutManager3.f35753J && staggeredGridLayoutManager3.m35446o0(view3) <= i) {
                        break;
                    }
                    StaggeredGridLayoutManager staggeredGridLayoutManager4 = StaggeredGridLayoutManager.this;
                    if ((!staggeredGridLayoutManager4.f35753J && staggeredGridLayoutManager4.m35446o0(view3) >= i) || !view3.hasFocusable()) {
                        break;
                    }
                    i3++;
                    view = view3;
                }
            }
            return view;
        }

        /* renamed from: n */
        C3113c m35203n(View view) {
            return (C3113c) view.getLayoutParams();
        }

        /* renamed from: o */
        int m35202o() {
            int i = this.f4784b;
            if (i != Integer.MIN_VALUE) {
                return i;
            }
            m35213d();
            return this.f4784b;
        }

        /* renamed from: p */
        int m35201p(int i) {
            int i2 = this.f4784b;
            if (i2 != Integer.MIN_VALUE) {
                return i2;
            }
            if (this.f4783a.size() == 0) {
                return i;
            }
            m35213d();
            return this.f4784b;
        }

        /* renamed from: q */
        void m35200q() {
            this.f4784b = Integer.MIN_VALUE;
            this.f4785c = Integer.MIN_VALUE;
        }

        /* renamed from: r */
        void m35199r(int i) {
            int i2 = this.f4784b;
            if (i2 != Integer.MIN_VALUE) {
                this.f4784b = i2 + i;
            }
            int i3 = this.f4785c;
            if (i3 != Integer.MIN_VALUE) {
                this.f4785c = i3 + i;
            }
        }

        /* renamed from: s */
        void m35198s() {
            int size = this.f4783a.size();
            View remove = this.f4783a.remove(size - 1);
            C3113c n = m35203n(remove);
            n.f4765o = null;
            if (n.m35318e() || n.m35319b()) {
                this.f4786d -= StaggeredGridLayoutManager.this.f35748E.mo35104e(remove);
            }
            if (size == 1) {
                this.f4784b = Integer.MIN_VALUE;
            }
            this.f4785c = Integer.MIN_VALUE;
        }

        /* renamed from: t */
        void m35197t() {
            View remove = this.f4783a.remove(0);
            C3113c n = m35203n(remove);
            n.f4765o = null;
            if (this.f4783a.size() == 0) {
                this.f4785c = Integer.MIN_VALUE;
            }
            if (n.m35318e() || n.m35319b()) {
                this.f4786d -= StaggeredGridLayoutManager.this.f35748E.mo35104e(remove);
            }
            this.f4784b = Integer.MIN_VALUE;
        }

        /* renamed from: u */
        void m35196u(View view) {
            C3113c n = m35203n(view);
            n.f4765o = this;
            this.f4783a.add(0, view);
            this.f4784b = Integer.MIN_VALUE;
            if (this.f4783a.size() == 1) {
                this.f4785c = Integer.MIN_VALUE;
            }
            if (n.m35318e() || n.m35319b()) {
                this.f4786d += StaggeredGridLayoutManager.this.f35748E.mo35104e(view);
            }
        }

        /* renamed from: v */
        void m35195v(int i) {
            this.f4784b = i;
            this.f4785c = i;
        }
    }

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        RecyclerView.LayoutManager.C3097d p0 = RecyclerView.LayoutManager.m35443p0(context, attributeSet, i, i2);
        m35292Q2(p0.f4690a);
        m35288S2(p0.f4691b);
        m35290R2(p0.f4692c);
        m35263j2();
    }

    /* renamed from: D2 */
    private void m35309D2(View view, int i, int i2, boolean z) {
        boolean z2;
        m35431u(view, this.f35764U);
        C3113c cVar = (C3113c) view.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) cVar).leftMargin;
        Rect rect = this.f35764U;
        int a3 = m35272a3(i, i3 + rect.left, ((ViewGroup.MarginLayoutParams) cVar).rightMargin + rect.right);
        int i4 = ((ViewGroup.MarginLayoutParams) cVar).topMargin;
        Rect rect2 = this.f35764U;
        int a32 = m35272a3(i2, i4 + rect2.top, ((ViewGroup.MarginLayoutParams) cVar).bottomMargin + rect2.bottom);
        if (z) {
            z2 = m35484Q1(view, a3, a32, cVar);
        } else {
            z2 = m35487O1(view, a3, a32, cVar);
        }
        if (z2) {
            view.measure(a3, a32);
        }
    }

    /* renamed from: E2 */
    private void m35308E2(View view, C3113c cVar, boolean z) {
        if (cVar.f4766p) {
            if (this.f35750G == 1) {
                m35309D2(view, this.f35763T, RecyclerView.LayoutManager.m35475V(m35460h0(), m35458i0(), getPaddingTop() + getPaddingBottom(), ((ViewGroup.MarginLayoutParams) cVar).height, true), z);
            } else {
                m35309D2(view, RecyclerView.LayoutManager.m35475V(m35428v0(), m35426w0(), getPaddingLeft() + getPaddingRight(), ((ViewGroup.MarginLayoutParams) cVar).width, true), this.f35763T, z);
            }
        } else if (this.f35750G == 1) {
            m35309D2(view, RecyclerView.LayoutManager.m35475V(this.f35751H, m35426w0(), 0, ((ViewGroup.MarginLayoutParams) cVar).width, false), RecyclerView.LayoutManager.m35475V(m35460h0(), m35458i0(), getPaddingTop() + getPaddingBottom(), ((ViewGroup.MarginLayoutParams) cVar).height, true), z);
        } else {
            m35309D2(view, RecyclerView.LayoutManager.m35475V(m35428v0(), m35426w0(), getPaddingLeft() + getPaddingRight(), ((ViewGroup.MarginLayoutParams) cVar).width, true), RecyclerView.LayoutManager.m35475V(this.f35751H, m35458i0(), 0, ((ViewGroup.MarginLayoutParams) cVar).height, false), z);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:85:0x0157, code lost:
        if (m35271b2() != false) goto L_0x015b;
     */
    /* renamed from: F2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m35307F2(androidx.recyclerview.widget.RecyclerView.Recycler r9, androidx.recyclerview.widget.RecyclerView.State r10, boolean r11) {
        /*
            Method dump skipped, instructions count: 379
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.m35307F2(androidx.recyclerview.widget.RecyclerView$Recycler, androidx.recyclerview.widget.RecyclerView$State, boolean):void");
    }

    /* renamed from: G2 */
    private boolean m35306G2(int i) {
        boolean z;
        boolean z2;
        boolean z3;
        if (this.f35750G == 0) {
            if (i == -1) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z3 != this.f35754K) {
                return true;
            }
            return false;
        }
        if (i == -1) {
            z = true;
        } else {
            z = false;
        }
        if (z == this.f35754K) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2 == m35310C2()) {
            return true;
        }
        return false;
    }

    /* renamed from: I2 */
    private void m35304I2(View view) {
        for (int i = this.f35746C - 1; i >= 0; i--) {
            this.f35747D[i].m35196u(view);
        }
    }

    /* renamed from: J2 */
    private void m35303J2(RecyclerView.Recycler recycler, C3135f fVar) {
        int i;
        int i2;
        if (fVar.f4858a && !fVar.f4866i) {
            if (fVar.f4859b == 0) {
                if (fVar.f4862e == -1) {
                    m35301K2(recycler, fVar.f4864g);
                } else {
                    m35298L2(recycler, fVar.f4863f);
                }
            } else if (fVar.f4862e == -1) {
                int i3 = fVar.f4863f;
                int v2 = i3 - m35249v2(i3);
                if (v2 < 0) {
                    i2 = fVar.f4864g;
                } else {
                    i2 = fVar.f4864g - Math.min(v2, fVar.f4859b);
                }
                m35301K2(recycler, i2);
            } else {
                int w2 = m35248w2(fVar.f4864g) - fVar.f4864g;
                if (w2 < 0) {
                    i = fVar.f4863f;
                } else {
                    i = Math.min(w2, fVar.f4859b) + fVar.f4863f;
                }
                m35298L2(recycler, i);
            }
        }
    }

    /* renamed from: K2 */
    private void m35301K2(RecyclerView.Recycler recycler, int i) {
        for (int U = m35477U() - 1; U >= 0; U--) {
            View T = m35480T(U);
            if (this.f35748E.mo35102g(T) >= i && this.f35748E.mo35093q(T) >= i) {
                C3113c cVar = (C3113c) T.getLayoutParams();
                if (cVar.f4766p) {
                    for (int i2 = 0; i2 < this.f35746C; i2++) {
                        if (this.f35747D[i2].f4783a.size() == 1) {
                            return;
                        }
                    }
                    for (int i3 = 0; i3 < this.f35746C; i3++) {
                        this.f35747D[i3].m35198s();
                    }
                } else if (cVar.f4765o.f4783a.size() != 1) {
                    cVar.f4765o.m35198s();
                } else {
                    return;
                }
                m35427v1(T, recycler);
            } else {
                return;
            }
        }
    }

    /* renamed from: L2 */
    private void m35298L2(RecyclerView.Recycler recycler, int i) {
        while (m35477U() > 0) {
            View T = m35480T(0);
            if (this.f35748E.mo35105d(T) <= i && this.f35748E.mo35094p(T) <= i) {
                C3113c cVar = (C3113c) T.getLayoutParams();
                if (cVar.f4766p) {
                    for (int i2 = 0; i2 < this.f35746C; i2++) {
                        if (this.f35747D[i2].f4783a.size() == 1) {
                            return;
                        }
                    }
                    for (int i3 = 0; i3 < this.f35746C; i3++) {
                        this.f35747D[i3].m35197t();
                    }
                } else if (cVar.f4765o.f4783a.size() != 1) {
                    cVar.f4765o.m35197t();
                } else {
                    return;
                }
                m35427v1(T, recycler);
            } else {
                return;
            }
        }
    }

    /* renamed from: M2 */
    private void m35297M2() {
        if (this.f35749F.mo35098k() != 1073741824) {
            int U = m35477U();
            float f = 0.0f;
            for (int i = 0; i < U; i++) {
                View T = m35480T(i);
                float e = this.f35749F.mo35104e(T);
                if (e >= f) {
                    if (((C3113c) T.getLayoutParams()).m35239i()) {
                        e = (e * 1.0f) / this.f35746C;
                    }
                    f = Math.max(f, e);
                }
            }
            int i2 = this.f35751H;
            int round = Math.round(f * this.f35746C);
            if (this.f35749F.mo35098k() == Integer.MIN_VALUE) {
                round = Math.min(round, this.f35749F.mo35095n());
            }
            m35277Y2(round);
            if (this.f35751H != i2) {
                for (int i3 = 0; i3 < U; i3++) {
                    View T2 = m35480T(i3);
                    C3113c cVar = (C3113c) T2.getLayoutParams();
                    if (!cVar.f4766p) {
                        if (!m35310C2() || this.f35750G != 1) {
                            int i4 = cVar.f4765o.f4787e;
                            int i5 = this.f35751H * i4;
                            int i6 = i4 * i2;
                            if (this.f35750G == 1) {
                                T2.offsetLeftAndRight(i5 - i6);
                            } else {
                                T2.offsetTopAndBottom(i5 - i6);
                            }
                        } else {
                            int i7 = this.f35746C;
                            int i8 = cVar.f4765o.f4787e;
                            T2.offsetLeftAndRight(((-((i7 - 1) - i8)) * this.f35751H) - ((-((i7 - 1) - i8)) * i2));
                        }
                    }
                }
            }
        }
    }

    /* renamed from: N2 */
    private void m35296N2() {
        if (this.f35750G == 1 || !m35310C2()) {
            this.f35754K = this.f35753J;
        } else {
            this.f35754K = !this.f35753J;
        }
    }

    /* renamed from: P2 */
    private void m35294P2(int i) {
        boolean z;
        C3135f fVar = this.f35752I;
        fVar.f4862e = i;
        boolean z2 = this.f35754K;
        int i2 = 1;
        if (i == -1) {
            z = true;
        } else {
            z = false;
        }
        if (z2 != z) {
            i2 = -1;
        }
        fVar.f4861d = i2;
    }

    /* renamed from: T2 */
    private void m35287T2(int i, int i2) {
        for (int i3 = 0; i3 < this.f35746C; i3++) {
            if (!this.f35747D[i3].f4783a.isEmpty()) {
                m35275Z2(this.f35747D[i3], i, i2);
            }
        }
    }

    /* renamed from: U2 */
    private boolean m35285U2(RecyclerView.State state, C3112b bVar) {
        int i;
        if (this.f35760Q) {
            i = m35256p2(state.m35352b());
        } else {
            i = m35261l2(state.m35352b());
        }
        bVar.f4758a = i;
        bVar.f4759b = Integer.MIN_VALUE;
        return true;
    }

    /* renamed from: V1 */
    private void m35284V1(View view) {
        for (int i = this.f35746C - 1; i >= 0; i--) {
            this.f35747D[i].m35216a(view);
        }
    }

    /* renamed from: W1 */
    private void m35282W1(C3112b bVar) {
        int i;
        C3116e eVar = this.f35762S;
        int i2 = eVar.f4775m;
        if (i2 > 0) {
            if (i2 == this.f35746C) {
                for (int i3 = 0; i3 < this.f35746C; i3++) {
                    this.f35747D[i3].m35212e();
                    C3116e eVar2 = this.f35762S;
                    int i4 = eVar2.f4776n[i3];
                    if (i4 != Integer.MIN_VALUE) {
                        if (eVar2.f4781s) {
                            i = this.f35748E.mo35100i();
                        } else {
                            i = this.f35748E.mo35096m();
                        }
                        i4 += i;
                    }
                    this.f35747D[i3].m35195v(i4);
                }
            } else {
                eVar.m35219b();
                C3116e eVar3 = this.f35762S;
                eVar3.f4773k = eVar3.f4774l;
            }
        }
        C3116e eVar4 = this.f35762S;
        this.f35761R = eVar4.f4782t;
        m35290R2(eVar4.f4780r);
        m35296N2();
        C3116e eVar5 = this.f35762S;
        int i5 = eVar5.f4773k;
        if (i5 != -1) {
            this.f35756M = i5;
            bVar.f4760c = eVar5.f4781s;
        } else {
            bVar.f4760c = this.f35754K;
        }
        if (eVar5.f4777o > 1) {
            C3114d dVar = this.f35758O;
            dVar.f4767a = eVar5.f4778p;
            dVar.f4768b = eVar5.f4779q;
        }
    }

    /* renamed from: X2 */
    private void m35279X2(int i, RecyclerView.State state) {
        int i2;
        int i3;
        int c;
        boolean z;
        C3135f fVar = this.f35752I;
        boolean z2 = false;
        fVar.f4859b = 0;
        fVar.f4860c = i;
        if (!m35505F0() || (c = state.m35351c()) == -1) {
            i3 = 0;
            i2 = 0;
        } else {
            boolean z3 = this.f35754K;
            if (c < i) {
                z = true;
            } else {
                z = false;
            }
            if (z3 == z) {
                i3 = this.f35748E.mo35095n();
                i2 = 0;
            } else {
                i2 = this.f35748E.mo35095n();
                i3 = 0;
            }
        }
        if (m35472X()) {
            this.f35752I.f4863f = this.f35748E.mo35096m() - i2;
            this.f35752I.f4864g = this.f35748E.mo35100i() + i3;
        } else {
            this.f35752I.f4864g = this.f35748E.mo35101h() + i3;
            this.f35752I.f4863f = -i2;
        }
        C3135f fVar2 = this.f35752I;
        fVar2.f4865h = false;
        fVar2.f4858a = true;
        if (this.f35748E.mo35098k() == 0 && this.f35748E.mo35101h() == 0) {
            z2 = true;
        }
        fVar2.f4866i = z2;
    }

    /* renamed from: Z1 */
    private void m35276Z1(View view, C3113c cVar, C3135f fVar) {
        if (fVar.f4862e == 1) {
            if (cVar.f4766p) {
                m35284V1(view);
            } else {
                cVar.f4765o.m35216a(view);
            }
        } else if (cVar.f4766p) {
            m35304I2(view);
        } else {
            cVar.f4765o.m35196u(view);
        }
    }

    /* renamed from: Z2 */
    private void m35275Z2(C3118f fVar, int i, int i2) {
        int j = fVar.m35207j();
        if (i == -1) {
            if (fVar.m35202o() + j <= i2) {
                this.f35755L.set(fVar.f4787e, false);
            }
        } else if (fVar.m35206k() - j >= i2) {
            this.f35755L.set(fVar.f4787e, false);
        }
    }

    /* renamed from: a2 */
    private int m35273a2(int i) {
        boolean z;
        if (m35477U() != 0) {
            if (i < m35252s2()) {
                z = true;
            } else {
                z = false;
            }
            if (z != this.f35754K) {
                return -1;
            }
            return 1;
        } else if (this.f35754K) {
            return 1;
        } else {
            return -1;
        }
    }

    /* renamed from: a3 */
    private int m35272a3(int i, int i2, int i3) {
        if (i2 == 0 && i3 == 0) {
            return i;
        }
        int mode = View.MeasureSpec.getMode(i);
        if (mode == Integer.MIN_VALUE || mode == 1073741824) {
            return View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i) - i2) - i3), mode);
        }
        return i;
    }

    /* renamed from: c2 */
    private boolean m35270c2(C3118f fVar) {
        if (this.f35754K) {
            if (fVar.m35206k() < this.f35748E.mo35100i()) {
                ArrayList<View> arrayList = fVar.f4783a;
                return !fVar.m35203n(arrayList.get(arrayList.size() - 1)).f4766p;
            }
        } else if (fVar.m35202o() > this.f35748E.mo35096m()) {
            return !fVar.m35203n(fVar.f4783a.get(0)).f4766p;
        }
        return false;
    }

    /* renamed from: d2 */
    private int m35269d2(RecyclerView.State state) {
        if (m35477U() == 0) {
            return 0;
        }
        return C3145l.m35084a(state, this.f35748E, m35258n2(!this.f35767X), m35259m2(!this.f35767X), this, this.f35767X);
    }

    /* renamed from: e2 */
    private int m35268e2(RecyclerView.State state) {
        if (m35477U() == 0) {
            return 0;
        }
        return C3145l.m35083b(state, this.f35748E, m35258n2(!this.f35767X), m35259m2(!this.f35767X), this, this.f35767X, this.f35754K);
    }

    /* renamed from: f2 */
    private int m35267f2(RecyclerView.State state) {
        if (m35477U() == 0) {
            return 0;
        }
        return C3145l.m35082c(state, this.f35748E, m35258n2(!this.f35767X), m35259m2(!this.f35767X), this, this.f35767X);
    }

    /* renamed from: g2 */
    private int m35266g2(int i) {
        if (i != 1) {
            if (i != 2) {
                if (i != 17) {
                    if (i != 33) {
                        if (i != 66) {
                            if (i == 130 && this.f35750G == 1) {
                                return 1;
                            }
                            return Integer.MIN_VALUE;
                        } else if (this.f35750G == 0) {
                            return 1;
                        } else {
                            return Integer.MIN_VALUE;
                        }
                    } else if (this.f35750G == 1) {
                        return -1;
                    } else {
                        return Integer.MIN_VALUE;
                    }
                } else if (this.f35750G == 0) {
                    return -1;
                } else {
                    return Integer.MIN_VALUE;
                }
            } else if (this.f35750G != 1 && m35310C2()) {
                return -1;
            } else {
                return 1;
            }
        } else if (this.f35750G != 1 && m35310C2()) {
            return 1;
        } else {
            return -1;
        }
    }

    /* renamed from: h2 */
    private C3114d.C3115a m35265h2(int i) {
        C3114d.C3115a aVar = new C3114d.C3115a();
        aVar.f4771m = new int[this.f35746C];
        for (int i2 = 0; i2 < this.f35746C; i2++) {
            aVar.f4771m[i2] = i - this.f35747D[i2].m35205l(i);
        }
        return aVar;
    }

    /* renamed from: i2 */
    private C3114d.C3115a m35264i2(int i) {
        C3114d.C3115a aVar = new C3114d.C3115a();
        aVar.f4771m = new int[this.f35746C];
        for (int i2 = 0; i2 < this.f35746C; i2++) {
            aVar.f4771m[i2] = this.f35747D[i2].m35201p(i) - i;
        }
        return aVar;
    }

    /* renamed from: j2 */
    private void m35263j2() {
        this.f35748E = AbstractC3140j.m35109b(this, this.f35750G);
        this.f35749F = AbstractC3140j.m35109b(this, 1 - this.f35750G);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Unknown variable types count: 1 */
    /* renamed from: k2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private int m35262k2(androidx.recyclerview.widget.RecyclerView.Recycler r17, androidx.recyclerview.widget.C3135f r18, androidx.recyclerview.widget.RecyclerView.State r19) {
        /*
            Method dump skipped, instructions count: 516
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.m35262k2(androidx.recyclerview.widget.RecyclerView$Recycler, androidx.recyclerview.widget.f, androidx.recyclerview.widget.RecyclerView$State):int");
    }

    /* renamed from: l2 */
    private int m35261l2(int i) {
        int U = m35477U();
        for (int i2 = 0; i2 < U; i2++) {
            int o0 = m35446o0(m35480T(i2));
            if (o0 >= 0 && o0 < i) {
                return o0;
            }
        }
        return 0;
    }

    /* renamed from: p2 */
    private int m35256p2(int i) {
        for (int U = m35477U() - 1; U >= 0; U--) {
            int o0 = m35446o0(m35480T(U));
            if (o0 >= 0 && o0 < i) {
                return o0;
            }
        }
        return 0;
    }

    /* renamed from: q2 */
    private void m35255q2(RecyclerView.Recycler recycler, RecyclerView.State state, boolean z) {
        int i;
        int u2 = m35250u2(Integer.MIN_VALUE);
        if (u2 != Integer.MIN_VALUE && (i = this.f35748E.mo35100i() - u2) > 0) {
            int i2 = i - (-m35295O2(-i, recycler, state));
            if (z && i2 > 0) {
                this.f35748E.mo35092r(i2);
            }
        }
    }

    /* renamed from: r2 */
    private void m35253r2(RecyclerView.Recycler recycler, RecyclerView.State state, boolean z) {
        int m;
        int x2 = m35247x2(ViewDefaults.NUMBER_OF_LINES);
        if (x2 != Integer.MAX_VALUE && (m = x2 - this.f35748E.mo35096m()) > 0) {
            int O2 = m - m35295O2(m, recycler, state);
            if (z && O2 > 0) {
                this.f35748E.mo35092r(-O2);
            }
        }
    }

    /* renamed from: u2 */
    private int m35250u2(int i) {
        int l = this.f35747D[0].m35205l(i);
        for (int i2 = 1; i2 < this.f35746C; i2++) {
            int l2 = this.f35747D[i2].m35205l(i);
            if (l2 > l) {
                l = l2;
            }
        }
        return l;
    }

    /* renamed from: v2 */
    private int m35249v2(int i) {
        int p = this.f35747D[0].m35201p(i);
        for (int i2 = 1; i2 < this.f35746C; i2++) {
            int p2 = this.f35747D[i2].m35201p(i);
            if (p2 > p) {
                p = p2;
            }
        }
        return p;
    }

    /* renamed from: w2 */
    private int m35248w2(int i) {
        int l = this.f35747D[0].m35205l(i);
        for (int i2 = 1; i2 < this.f35746C; i2++) {
            int l2 = this.f35747D[i2].m35205l(i);
            if (l2 < l) {
                l = l2;
            }
        }
        return l;
    }

    /* renamed from: x2 */
    private int m35247x2(int i) {
        int p = this.f35747D[0].m35201p(i);
        for (int i2 = 1; i2 < this.f35746C; i2++) {
            int p2 = this.f35747D[i2].m35201p(i);
            if (p2 < p) {
                p = p2;
            }
        }
        return p;
    }

    /* renamed from: y2 */
    private C3118f m35246y2(C3135f fVar) {
        int i;
        int i2;
        int i3;
        if (m35306G2(fVar.f4862e)) {
            i3 = this.f35746C - 1;
            i2 = -1;
            i = -1;
        } else {
            i2 = this.f35746C;
            i3 = 0;
            i = 1;
        }
        C3118f fVar2 = null;
        if (fVar.f4862e == 1) {
            int m = this.f35748E.mo35096m();
            int i4 = ViewDefaults.NUMBER_OF_LINES;
            while (i3 != i2) {
                C3118f fVar3 = this.f35747D[i3];
                int l = fVar3.m35205l(m);
                if (l < i4) {
                    fVar2 = fVar3;
                    i4 = l;
                }
                i3 += i;
            }
            return fVar2;
        }
        int i5 = this.f35748E.mo35100i();
        int i6 = Integer.MIN_VALUE;
        while (i3 != i2) {
            C3118f fVar4 = this.f35747D[i3];
            int p = fVar4.m35201p(i5);
            if (p > i6) {
                fVar2 = fVar4;
                i6 = p;
            }
            i3 += i;
        }
        return fVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0043 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0044  */
    /* renamed from: z2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m35244z2(int r7, int r8, int r9) {
        /*
            r6 = this;
            boolean r0 = r6.f35754K
            if (r0 == 0) goto L_0x0009
            int r0 = r6.m35251t2()
            goto L_0x000d
        L_0x0009:
            int r0 = r6.m35252s2()
        L_0x000d:
            r1 = 8
            if (r9 != r1) goto L_0x001a
            if (r7 >= r8) goto L_0x0016
            int r2 = r8 + 1
            goto L_0x001c
        L_0x0016:
            int r2 = r7 + 1
            r3 = r8
            goto L_0x001d
        L_0x001a:
            int r2 = r7 + r8
        L_0x001c:
            r3 = r7
        L_0x001d:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r4 = r6.f35758O
            r4.m35231h(r3)
            r4 = 1
            if (r9 == r4) goto L_0x003c
            r5 = 2
            if (r9 == r5) goto L_0x0036
            if (r9 == r1) goto L_0x002b
            goto L_0x0041
        L_0x002b:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r6.f35758O
            r9.m35228k(r7, r4)
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r7 = r6.f35758O
            r7.m35229j(r8, r4)
            goto L_0x0041
        L_0x0036:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r6.f35758O
            r9.m35228k(r7, r8)
            goto L_0x0041
        L_0x003c:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r6.f35758O
            r9.m35229j(r7, r8)
        L_0x0041:
            if (r2 > r0) goto L_0x0044
            return
        L_0x0044:
            boolean r7 = r6.f35754K
            if (r7 == 0) goto L_0x004d
            int r7 = r6.m35252s2()
            goto L_0x0051
        L_0x004d:
            int r7 = r6.m35251t2()
        L_0x0051:
            if (r3 > r7) goto L_0x0056
            r6.m35510C1()
        L_0x0056:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.m35244z2(int, int, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0074, code lost:
        if (r10 == r11) goto L_0x0088;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0086, code lost:
        if (r10 == r11) goto L_0x0088;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0088, code lost:
        r10 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x008a, code lost:
        r10 = false;
     */
    /* renamed from: A2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    android.view.View m35312A2() {
        /*
            r12 = this;
            int r0 = r12.m35477U()
            r1 = 1
            int r0 = r0 - r1
            java.util.BitSet r2 = new java.util.BitSet
            int r3 = r12.f35746C
            r2.<init>(r3)
            int r3 = r12.f35746C
            r4 = 0
            r2.set(r4, r3, r1)
            int r3 = r12.f35750G
            r5 = -1
            if (r3 != r1) goto L_0x0020
            boolean r3 = r12.m35310C2()
            if (r3 == 0) goto L_0x0020
            r3 = r1
            goto L_0x0021
        L_0x0020:
            r3 = r5
        L_0x0021:
            boolean r6 = r12.f35754K
            if (r6 == 0) goto L_0x0027
            r6 = r5
            goto L_0x002b
        L_0x0027:
            int r0 = r0 + 1
            r6 = r0
            r0 = r4
        L_0x002b:
            if (r0 >= r6) goto L_0x002e
            r5 = r1
        L_0x002e:
            if (r0 == r6) goto L_0x00ab
            android.view.View r7 = r12.m35480T(r0)
            android.view.ViewGroup$LayoutParams r8 = r7.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r8 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.C3113c) r8
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r9 = r8.f4765o
            int r9 = r9.f4787e
            boolean r9 = r2.get(r9)
            if (r9 == 0) goto L_0x0054
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r9 = r8.f4765o
            boolean r9 = r12.m35270c2(r9)
            if (r9 == 0) goto L_0x004d
            return r7
        L_0x004d:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r9 = r8.f4765o
            int r9 = r9.f4787e
            r2.clear(r9)
        L_0x0054:
            boolean r9 = r8.f4766p
            if (r9 == 0) goto L_0x0059
            goto L_0x00a9
        L_0x0059:
            int r9 = r0 + r5
            if (r9 == r6) goto L_0x00a9
            android.view.View r9 = r12.m35480T(r9)
            boolean r10 = r12.f35754K
            if (r10 == 0) goto L_0x0077
            androidx.recyclerview.widget.j r10 = r12.f35748E
            int r10 = r10.mo35105d(r7)
            androidx.recyclerview.widget.j r11 = r12.f35748E
            int r11 = r11.mo35105d(r9)
            if (r10 >= r11) goto L_0x0074
            return r7
        L_0x0074:
            if (r10 != r11) goto L_0x008a
            goto L_0x0088
        L_0x0077:
            androidx.recyclerview.widget.j r10 = r12.f35748E
            int r10 = r10.mo35102g(r7)
            androidx.recyclerview.widget.j r11 = r12.f35748E
            int r11 = r11.mo35102g(r9)
            if (r10 <= r11) goto L_0x0086
            return r7
        L_0x0086:
            if (r10 != r11) goto L_0x008a
        L_0x0088:
            r10 = r1
            goto L_0x008b
        L_0x008a:
            r10 = r4
        L_0x008b:
            if (r10 == 0) goto L_0x00a9
            android.view.ViewGroup$LayoutParams r9 = r9.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r9 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.C3113c) r9
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r8 = r8.f4765o
            int r8 = r8.f4787e
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r9 = r9.f4765o
            int r9 = r9.f4787e
            int r8 = r8 - r9
            if (r8 >= 0) goto L_0x00a0
            r8 = r1
            goto L_0x00a1
        L_0x00a0:
            r8 = r4
        L_0x00a1:
            if (r3 >= 0) goto L_0x00a5
            r9 = r1
            goto L_0x00a6
        L_0x00a5:
            r9 = r4
        L_0x00a6:
            if (r8 == r9) goto L_0x00a9
            return r7
        L_0x00a9:
            int r0 = r0 + r5
            goto L_0x002e
        L_0x00ab:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.m35312A2():android.view.View");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: B */
    public int mo29432B(RecyclerView.State state) {
        return m35269d2(state);
    }

    /* renamed from: B2 */
    public void m35311B2() {
        this.f35758O.m35237b();
        m35510C1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: C */
    public int mo29430C(RecyclerView.State state) {
        return m35268e2(state);
    }

    /* renamed from: C2 */
    boolean m35310C2() {
        return m35454k0() == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: D */
    public int mo29428D(RecyclerView.State state) {
        return m35267f2(state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: E */
    public int mo29426E(RecyclerView.State state) {
        return m35269d2(state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: F */
    public int mo29423F(RecyclerView.State state) {
        return m35268e2(state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: F1 */
    public int mo29422F1(int i, RecyclerView.Recycler recycler, RecyclerView.State state) {
        return m35295O2(i, recycler, state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: G */
    public int mo29420G(RecyclerView.State state) {
        return m35267f2(state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: G1 */
    public void mo29419G1(int i) {
        C3116e eVar = this.f35762S;
        if (!(eVar == null || eVar.f4773k == i)) {
            eVar.m35220a();
        }
        this.f35756M = i;
        this.f35757N = Integer.MIN_VALUE;
        m35510C1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: H1 */
    public int mo29417H1(int i, RecyclerView.Recycler recycler, RecyclerView.State state) {
        return m35295O2(i, recycler, state);
    }

    /* renamed from: H2 */
    void m35305H2(int i, RecyclerView.State state) {
        int i2;
        int i3;
        if (i > 0) {
            i3 = m35251t2();
            i2 = 1;
        } else {
            i3 = m35252s2();
            i2 = -1;
        }
        this.f35752I.f4858a = true;
        m35279X2(i3, state);
        m35294P2(i2);
        C3135f fVar = this.f35752I;
        fVar.f4860c = i3 + fVar.f4861d;
        fVar.f4859b = Math.abs(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: K0 */
    public void mo35302K0(int i) {
        super.mo35302K0(i);
        for (int i2 = 0; i2 < this.f35746C; i2++) {
            this.f35747D[i2].m35199r(i);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: L0 */
    public void mo35300L0(int i) {
        super.mo35300L0(i);
        for (int i2 = 0; i2 < this.f35746C; i2++) {
            this.f35747D[i2].m35199r(i);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: L1 */
    public void mo35299L1(Rect rect, int i, int i2) {
        int i3;
        int i4;
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        if (this.f35750G == 1) {
            i4 = RecyclerView.LayoutManager.m35422y(i2, rect.height() + paddingTop, m35451m0());
            i3 = RecyclerView.LayoutManager.m35422y(i, (this.f35751H * this.f35746C) + paddingLeft, m35449n0());
        } else {
            i3 = RecyclerView.LayoutManager.m35422y(i, rect.width() + paddingLeft, m35449n0());
            i4 = RecyclerView.LayoutManager.m35422y(i2, (this.f35751H * this.f35746C) + paddingTop, m35451m0());
        }
        m35494K1(i3, i4);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: M0 */
    public void mo29411M0(RecyclerView.Adapter adapter, RecyclerView.Adapter adapter2) {
        this.f35758O.m35237b();
        for (int i = 0; i < this.f35746C; i++) {
            this.f35747D[i].m35212e();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: O */
    public RecyclerView.C3109i mo29408O() {
        if (this.f35750G == 0) {
            return new C3113c(-2, -1);
        }
        return new C3113c(-1, -2);
    }

    /* renamed from: O2 */
    int m35295O2(int i, RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (m35477U() == 0 || i == 0) {
            return 0;
        }
        m35305H2(i, state);
        int k2 = m35262k2(recycler, this.f35752I, state);
        if (this.f35752I.f4859b >= k2) {
            if (i < 0) {
                i = -k2;
            } else {
                i = k2;
            }
        }
        this.f35748E.mo35092r(-i);
        this.f35760Q = this.f35754K;
        C3135f fVar = this.f35752I;
        fVar.f4859b = 0;
        m35303J2(recycler, fVar);
        return i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: P */
    public RecyclerView.C3109i mo29404P(Context context, AttributeSet attributeSet) {
        return new C3113c(context, attributeSet);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: Q */
    public RecyclerView.C3109i mo35293Q(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new C3113c((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new C3113c(layoutParams);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: Q0 */
    public void mo29402Q0(RecyclerView recyclerView, RecyclerView.Recycler recycler) {
        super.mo29402Q0(recyclerView, recycler);
        m35423x1(this.f35769Z);
        for (int i = 0; i < this.f35746C; i++) {
            this.f35747D[i].m35212e();
        }
        recyclerView.requestLayout();
    }

    /* renamed from: Q2 */
    public void m35292Q2(int i) {
        if (i == 0 || i == 1) {
            mo35254r(null);
            if (i != this.f35750G) {
                this.f35750G = i;
                AbstractC3140j jVar = this.f35748E;
                this.f35748E = this.f35749F;
                this.f35749F = jVar;
                m35510C1();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("invalid orientation.");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: R0 */
    public View mo35291R0(View view, int i, RecyclerView.Recycler recycler, RecyclerView.State state) {
        View M;
        int i2;
        boolean z;
        boolean z2;
        int i3;
        int i4;
        int i5;
        View m;
        if (m35477U() == 0 || (M = m35492M(view)) == null) {
            return null;
        }
        m35296N2();
        int g2 = m35266g2(i);
        if (g2 == Integer.MIN_VALUE) {
            return null;
        }
        C3113c cVar = (C3113c) M.getLayoutParams();
        boolean z3 = cVar.f4766p;
        C3118f fVar = cVar.f4765o;
        if (g2 == 1) {
            i2 = m35251t2();
        } else {
            i2 = m35252s2();
        }
        m35279X2(i2, state);
        m35294P2(g2);
        C3135f fVar2 = this.f35752I;
        fVar2.f4860c = fVar2.f4861d + i2;
        fVar2.f4859b = (int) (this.f35748E.mo35095n() * 0.33333334f);
        C3135f fVar3 = this.f35752I;
        fVar3.f4865h = true;
        fVar3.f4858a = false;
        m35262k2(recycler, fVar3, state);
        this.f35760Q = this.f35754K;
        if (!(z3 || (m = fVar.m35204m(i2, g2)) == null || m == M)) {
            return m;
        }
        if (m35306G2(g2)) {
            for (int i6 = this.f35746C - 1; i6 >= 0; i6--) {
                View m2 = this.f35747D[i6].m35204m(i2, g2);
                if (!(m2 == null || m2 == M)) {
                    return m2;
                }
            }
        } else {
            for (int i7 = 0; i7 < this.f35746C; i7++) {
                View m3 = this.f35747D[i7].m35204m(i2, g2);
                if (!(m3 == null || m3 == M)) {
                    return m3;
                }
            }
        }
        boolean z4 = !this.f35753J;
        if (g2 == -1) {
            z = true;
        } else {
            z = false;
        }
        if (z4 == z) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z3) {
            if (z2) {
                i5 = fVar.m35211f();
            } else {
                i5 = fVar.m35210g();
            }
            View N = mo35490N(i5);
            if (!(N == null || N == M)) {
                return N;
            }
        }
        if (m35306G2(g2)) {
            for (int i8 = this.f35746C - 1; i8 >= 0; i8--) {
                if (i8 != fVar.f4787e) {
                    if (z2) {
                        i4 = this.f35747D[i8].m35211f();
                    } else {
                        i4 = this.f35747D[i8].m35210g();
                    }
                    View N2 = mo35490N(i4);
                    if (!(N2 == null || N2 == M)) {
                        return N2;
                    }
                }
            }
        } else {
            for (int i9 = 0; i9 < this.f35746C; i9++) {
                if (z2) {
                    i3 = this.f35747D[i9].m35211f();
                } else {
                    i3 = this.f35747D[i9].m35210g();
                }
                View N3 = mo35490N(i3);
                if (!(N3 == null || N3 == M)) {
                    return N3;
                }
            }
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: R1 */
    public void mo28122R1(RecyclerView recyclerView, RecyclerView.State state, int i) {
        C3136g gVar = new C3136g(recyclerView.getContext());
        gVar.setTargetPosition(i);
        m35481S1(gVar);
    }

    /* renamed from: R2 */
    public void m35290R2(boolean z) {
        mo35254r(null);
        C3116e eVar = this.f35762S;
        if (!(eVar == null || eVar.f4780r == z)) {
            eVar.f4780r = z;
        }
        this.f35753J = z;
        m35510C1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: S0 */
    public void mo35289S0(AccessibilityEvent accessibilityEvent) {
        super.mo35289S0(accessibilityEvent);
        if (m35477U() > 0) {
            View n2 = m35258n2(false);
            View m2 = m35259m2(false);
            if (n2 != null && m2 != null) {
                int o0 = m35446o0(n2);
                int o02 = m35446o0(m2);
                if (o0 < o02) {
                    accessibilityEvent.setFromIndex(o0);
                    accessibilityEvent.setToIndex(o02);
                    return;
                }
                accessibilityEvent.setFromIndex(o02);
                accessibilityEvent.setToIndex(o0);
            }
        }
    }

    /* renamed from: S2 */
    public void m35288S2(int i) {
        mo35254r(null);
        if (i != this.f35746C) {
            m35311B2();
            this.f35746C = i;
            this.f35755L = new BitSet(this.f35746C);
            this.f35747D = new C3118f[this.f35746C];
            for (int i2 = 0; i2 < this.f35746C; i2++) {
                this.f35747D[i2] = new C3118f(i2);
            }
            m35510C1();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: U1 */
    public boolean mo35286U1() {
        return this.f35762S == null;
    }

    /* renamed from: V2 */
    boolean m35283V2(RecyclerView.State state, C3112b bVar) {
        int i;
        int i2;
        int i3;
        boolean z = false;
        if (!state.m35349e() && (i = this.f35756M) != -1) {
            if (i < 0 || i >= state.m35352b()) {
                this.f35756M = -1;
                this.f35757N = Integer.MIN_VALUE;
            } else {
                C3116e eVar = this.f35762S;
                if (eVar == null || eVar.f4773k == -1 || eVar.f4775m < 1) {
                    View N = mo35490N(this.f35756M);
                    if (N != null) {
                        if (this.f35754K) {
                            i2 = m35251t2();
                        } else {
                            i2 = m35252s2();
                        }
                        bVar.f4758a = i2;
                        if (this.f35757N != Integer.MIN_VALUE) {
                            if (bVar.f4760c) {
                                bVar.f4759b = (this.f35748E.mo35100i() - this.f35757N) - this.f35748E.mo35105d(N);
                            } else {
                                bVar.f4759b = (this.f35748E.mo35096m() + this.f35757N) - this.f35748E.mo35102g(N);
                            }
                            return true;
                        } else if (this.f35748E.mo35104e(N) > this.f35748E.mo35095n()) {
                            if (bVar.f4760c) {
                                i3 = this.f35748E.mo35100i();
                            } else {
                                i3 = this.f35748E.mo35096m();
                            }
                            bVar.f4759b = i3;
                            return true;
                        } else {
                            int g = this.f35748E.mo35102g(N) - this.f35748E.mo35096m();
                            if (g < 0) {
                                bVar.f4759b = -g;
                                return true;
                            }
                            int i4 = this.f35748E.mo35100i() - this.f35748E.mo35105d(N);
                            if (i4 < 0) {
                                bVar.f4759b = i4;
                                return true;
                            }
                            bVar.f4759b = Integer.MIN_VALUE;
                        }
                    } else {
                        int i5 = this.f35756M;
                        bVar.f4758a = i5;
                        int i6 = this.f35757N;
                        if (i6 == Integer.MIN_VALUE) {
                            if (m35273a2(i5) == 1) {
                                z = true;
                            }
                            bVar.f4760c = z;
                            bVar.m35243a();
                        } else {
                            bVar.m35242b(i6);
                        }
                        bVar.f4761d = true;
                    }
                } else {
                    bVar.f4759b = Integer.MIN_VALUE;
                    bVar.f4758a = this.f35756M;
                }
                return true;
            }
        }
        return false;
    }

    /* renamed from: W2 */
    void m35281W2(RecyclerView.State state, C3112b bVar) {
        if (!m35283V2(state, bVar) && !m35285U2(state, bVar)) {
            bVar.m35243a();
            bVar.f4758a = 0;
        }
    }

    /* renamed from: X1 */
    boolean m35280X1() {
        int l = this.f35747D[0].m35205l(Integer.MIN_VALUE);
        for (int i = 1; i < this.f35746C; i++) {
            if (this.f35747D[i].m35205l(Integer.MIN_VALUE) != l) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: Y1 */
    boolean m35278Y1() {
        int p = this.f35747D[0].m35201p(Integer.MIN_VALUE);
        for (int i = 1; i < this.f35746C; i++) {
            if (this.f35747D[i].m35201p(Integer.MIN_VALUE) != p) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: Y2 */
    void m35277Y2(int i) {
        this.f35751H = i / this.f35746C;
        this.f35763T = View.MeasureSpec.makeMeasureSpec(i, this.f35749F.mo35098k());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: Z0 */
    public void mo29390Z0(RecyclerView recyclerView, int i, int i2) {
        m35244z2(i, i2, 1);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.SmoothScroller.AbstractC3100a
    /* renamed from: a */
    public PointF mo29388a(int i) {
        int a2 = m35273a2(i);
        PointF pointF = new PointF();
        if (a2 == 0) {
            return null;
        }
        if (this.f35750G == 0) {
            pointF.x = a2;
            pointF.y = 0.0f;
        } else {
            pointF.x = 0.0f;
            pointF.y = a2;
        }
        return pointF;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: a1 */
    public void mo35274a1(RecyclerView recyclerView) {
        this.f35758O.m35237b();
        m35510C1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: b1 */
    public void mo29386b1(RecyclerView recyclerView, int i, int i2, int i3) {
        m35244z2(i, i2, 8);
    }

    /* renamed from: b2 */
    boolean m35271b2() {
        int i;
        int i2;
        int i3;
        if (m35477U() == 0 || this.f35759P == 0 || !m35421y0()) {
            return false;
        }
        if (this.f35754K) {
            i2 = m35251t2();
            i = m35252s2();
        } else {
            i2 = m35252s2();
            i = m35251t2();
        }
        if (i2 == 0 && m35312A2() != null) {
            this.f35758O.m35237b();
            m35508D1();
            m35510C1();
            return true;
        } else if (!this.f35766W) {
            return false;
        } else {
            if (this.f35754K) {
                i3 = -1;
            } else {
                i3 = 1;
            }
            int i4 = i + 1;
            C3114d.C3115a e = this.f35758O.m35234e(i2, i4, i3, true);
            if (e == null) {
                this.f35766W = false;
                this.f35758O.m35235d(i4);
                return false;
            }
            C3114d.C3115a e2 = this.f35758O.m35234e(i2, e.f4769k, i3 * (-1), true);
            if (e2 == null) {
                this.f35758O.m35235d(e.f4769k);
            } else {
                this.f35758O.m35235d(e2.f4769k + 1);
            }
            m35508D1();
            m35510C1();
            return true;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: c1 */
    public void mo29384c1(RecyclerView recyclerView, int i, int i2) {
        m35244z2(i, i2, 2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: e1 */
    public void mo29380e1(RecyclerView recyclerView, int i, int i2, Object obj) {
        m35244z2(i, i2, 4);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: f1 */
    public void mo29378f1(RecyclerView.Recycler recycler, RecyclerView.State state) {
        m35307F2(recycler, state, true);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: g1 */
    public void mo29376g1(RecyclerView.State state) {
        super.mo29376g1(state);
        this.f35756M = -1;
        this.f35757N = Integer.MIN_VALUE;
        this.f35762S = null;
        this.f35765V.m35241c();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: k1 */
    public void mo29371k1(Parcelable parcelable) {
        if (parcelable instanceof C3116e) {
            C3116e eVar = (C3116e) parcelable;
            this.f35762S = eVar;
            if (this.f35756M != -1) {
                eVar.m35220a();
                this.f35762S.m35219b();
            }
            m35510C1();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: l1 */
    public Parcelable mo29369l1() {
        int i;
        int i2;
        int i3;
        int[] iArr;
        if (this.f35762S != null) {
            return new C3116e(this.f35762S);
        }
        C3116e eVar = new C3116e();
        eVar.f4780r = this.f35753J;
        eVar.f4781s = this.f35760Q;
        eVar.f4782t = this.f35761R;
        C3114d dVar = this.f35758O;
        if (dVar == null || (iArr = dVar.f4767a) == null) {
            eVar.f4777o = 0;
        } else {
            eVar.f4778p = iArr;
            eVar.f4777o = iArr.length;
            eVar.f4779q = dVar.f4768b;
        }
        if (m35477U() > 0) {
            if (this.f35760Q) {
                i = m35251t2();
            } else {
                i = m35252s2();
            }
            eVar.f4773k = i;
            eVar.f4774l = m35257o2();
            int i4 = this.f35746C;
            eVar.f4775m = i4;
            eVar.f4776n = new int[i4];
            for (int i5 = 0; i5 < this.f35746C; i5++) {
                if (this.f35760Q) {
                    i2 = this.f35747D[i5].m35205l(Integer.MIN_VALUE);
                    if (i2 != Integer.MIN_VALUE) {
                        i3 = this.f35748E.mo35100i();
                        i2 -= i3;
                        eVar.f4776n[i5] = i2;
                    } else {
                        eVar.f4776n[i5] = i2;
                    }
                } else {
                    i2 = this.f35747D[i5].m35201p(Integer.MIN_VALUE);
                    if (i2 != Integer.MIN_VALUE) {
                        i3 = this.f35748E.mo35096m();
                        i2 -= i3;
                        eVar.f4776n[i5] = i2;
                    } else {
                        eVar.f4776n[i5] = i2;
                    }
                }
            }
        } else {
            eVar.f4773k = -1;
            eVar.f4774l = -1;
            eVar.f4775m = 0;
        }
        return eVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: m1 */
    public void mo35260m1(int i) {
        if (i == 0) {
            m35271b2();
        }
    }

    /* renamed from: m2 */
    View m35259m2(boolean z) {
        int m = this.f35748E.mo35096m();
        int i = this.f35748E.mo35100i();
        View view = null;
        for (int U = m35477U() - 1; U >= 0; U--) {
            View T = m35480T(U);
            int g = this.f35748E.mo35102g(T);
            int d = this.f35748E.mo35105d(T);
            if (d > m && g < i) {
                if (d <= i || !z) {
                    return T;
                }
                if (view == null) {
                    view = T;
                }
            }
        }
        return view;
    }

    /* renamed from: n2 */
    View m35258n2(boolean z) {
        int m = this.f35748E.mo35096m();
        int i = this.f35748E.mo35100i();
        int U = m35477U();
        View view = null;
        for (int i2 = 0; i2 < U; i2++) {
            View T = m35480T(i2);
            int g = this.f35748E.mo35102g(T);
            if (this.f35748E.mo35105d(T) > m && g < i) {
                if (g >= m || !z) {
                    return T;
                }
                if (view == null) {
                    view = T;
                }
            }
        }
        return view;
    }

    /* renamed from: o2 */
    int m35257o2() {
        View view;
        if (this.f35754K) {
            view = m35259m2(true);
        } else {
            view = m35258n2(true);
        }
        if (view == null) {
            return -1;
        }
        return m35446o0(view);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: r */
    public void mo35254r(String str) {
        if (this.f35762S == null) {
            super.mo35254r(str);
        }
    }

    /* renamed from: s2 */
    int m35252s2() {
        if (m35477U() == 0) {
            return 0;
        }
        return m35446o0(m35480T(0));
    }

    /* renamed from: t2 */
    int m35251t2() {
        int U = m35477U();
        if (U == 0) {
            return 0;
        }
        return m35446o0(m35480T(U - 1));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: v */
    public boolean mo29358v() {
        return this.f35750G == 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: w */
    public boolean mo29356w() {
        return this.f35750G == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: x */
    public boolean mo29354x(RecyclerView.C3109i iVar) {
        return iVar instanceof C3113c;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: z */
    public void mo35245z(int i, int i2, RecyclerView.State state, RecyclerView.LayoutManager.AbstractC3096c cVar) {
        int i3;
        int i4;
        if (this.f35750G != 0) {
            i = i2;
        }
        if (!(m35477U() == 0 || i == 0)) {
            m35305H2(i, state);
            int[] iArr = this.f35768Y;
            if (iArr == null || iArr.length < this.f35746C) {
                this.f35768Y = new int[this.f35746C];
            }
            int i5 = 0;
            for (int i6 = 0; i6 < this.f35746C; i6++) {
                C3135f fVar = this.f35752I;
                if (fVar.f4861d == -1) {
                    i4 = fVar.f4863f;
                    i3 = this.f35747D[i6].m35201p(i4);
                } else {
                    i4 = this.f35747D[i6].m35205l(fVar.f4864g);
                    i3 = this.f35752I.f4864g;
                }
                int i7 = i4 - i3;
                if (i7 >= 0) {
                    this.f35768Y[i5] = i7;
                    i5++;
                }
            }
            Arrays.sort(this.f35768Y, 0, i5);
            for (int i8 = 0; i8 < i5 && this.f35752I.m35124a(state); i8++) {
                cVar.mo35418a(this.f35752I.f4860c, this.f35768Y[i8]);
                C3135f fVar2 = this.f35752I;
                fVar2.f4860c += fVar2.f4861d;
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: z0 */
    public boolean mo29351z0() {
        return this.f35759P != 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$d */
    /* loaded from: classes.dex */
    public static class C3114d {

        /* renamed from: a */
        int[] f4767a;

        /* renamed from: b */
        List<C3115a> f4768b;

        C3114d() {
        }

        /* renamed from: i */
        private int m35230i(int i) {
            if (this.f4768b == null) {
                return -1;
            }
            C3115a f = m35233f(i);
            if (f != null) {
                this.f4768b.remove(f);
            }
            int size = this.f4768b.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    i2 = -1;
                    break;
                } else if (this.f4768b.get(i2).f4769k >= i) {
                    break;
                } else {
                    i2++;
                }
            }
            if (i2 == -1) {
                return -1;
            }
            this.f4768b.remove(i2);
            return this.f4768b.get(i2).f4769k;
        }

        /* renamed from: l */
        private void m35227l(int i, int i2) {
            List<C3115a> list = this.f4768b;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    C3115a aVar = this.f4768b.get(size);
                    int i3 = aVar.f4769k;
                    if (i3 >= i) {
                        aVar.f4769k = i3 + i2;
                    }
                }
            }
        }

        /* renamed from: m */
        private void m35226m(int i, int i2) {
            List<C3115a> list = this.f4768b;
            if (list != null) {
                int i3 = i + i2;
                for (int size = list.size() - 1; size >= 0; size--) {
                    C3115a aVar = this.f4768b.get(size);
                    int i4 = aVar.f4769k;
                    if (i4 >= i) {
                        if (i4 < i3) {
                            this.f4768b.remove(size);
                        } else {
                            aVar.f4769k = i4 - i2;
                        }
                    }
                }
            }
        }

        /* renamed from: a */
        public void m35238a(C3115a aVar) {
            if (this.f4768b == null) {
                this.f4768b = new ArrayList();
            }
            int size = this.f4768b.size();
            for (int i = 0; i < size; i++) {
                C3115a aVar2 = this.f4768b.get(i);
                if (aVar2.f4769k == aVar.f4769k) {
                    this.f4768b.remove(i);
                }
                if (aVar2.f4769k >= aVar.f4769k) {
                    this.f4768b.add(i, aVar);
                    return;
                }
            }
            this.f4768b.add(aVar);
        }

        /* renamed from: b */
        void m35237b() {
            int[] iArr = this.f4767a;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.f4768b = null;
        }

        /* renamed from: c */
        void m35236c(int i) {
            int[] iArr = this.f4767a;
            if (iArr == null) {
                int[] iArr2 = new int[Math.max(i, 10) + 1];
                this.f4767a = iArr2;
                Arrays.fill(iArr2, -1);
            } else if (i >= iArr.length) {
                int[] iArr3 = new int[m35224o(i)];
                this.f4767a = iArr3;
                System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                int[] iArr4 = this.f4767a;
                Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
            }
        }

        /* renamed from: d */
        int m35235d(int i) {
            List<C3115a> list = this.f4768b;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    if (this.f4768b.get(size).f4769k >= i) {
                        this.f4768b.remove(size);
                    }
                }
            }
            return m35231h(i);
        }

        /* renamed from: e */
        public C3115a m35234e(int i, int i2, int i3, boolean z) {
            List<C3115a> list = this.f4768b;
            if (list == null) {
                return null;
            }
            int size = list.size();
            for (int i4 = 0; i4 < size; i4++) {
                C3115a aVar = this.f4768b.get(i4);
                int i5 = aVar.f4769k;
                if (i5 >= i2) {
                    return null;
                }
                if (i5 >= i && (i3 == 0 || aVar.f4770l == i3 || (z && aVar.f4772n))) {
                    return aVar;
                }
            }
            return null;
        }

        /* renamed from: f */
        public C3115a m35233f(int i) {
            List<C3115a> list = this.f4768b;
            if (list == null) {
                return null;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                C3115a aVar = this.f4768b.get(size);
                if (aVar.f4769k == i) {
                    return aVar;
                }
            }
            return null;
        }

        /* renamed from: g */
        int m35232g(int i) {
            int[] iArr = this.f4767a;
            if (iArr == null || i >= iArr.length) {
                return -1;
            }
            return iArr[i];
        }

        /* renamed from: h */
        int m35231h(int i) {
            int[] iArr = this.f4767a;
            if (iArr == null || i >= iArr.length) {
                return -1;
            }
            int i2 = m35230i(i);
            if (i2 == -1) {
                int[] iArr2 = this.f4767a;
                Arrays.fill(iArr2, i, iArr2.length, -1);
                return this.f4767a.length;
            }
            int min = Math.min(i2 + 1, this.f4767a.length);
            Arrays.fill(this.f4767a, i, min, -1);
            return min;
        }

        /* renamed from: j */
        void m35229j(int i, int i2) {
            int[] iArr = this.f4767a;
            if (iArr != null && i < iArr.length) {
                int i3 = i + i2;
                m35236c(i3);
                int[] iArr2 = this.f4767a;
                System.arraycopy(iArr2, i, iArr2, i3, (iArr2.length - i) - i2);
                Arrays.fill(this.f4767a, i, i3, -1);
                m35227l(i, i2);
            }
        }

        /* renamed from: k */
        void m35228k(int i, int i2) {
            int[] iArr = this.f4767a;
            if (iArr != null && i < iArr.length) {
                int i3 = i + i2;
                m35236c(i3);
                int[] iArr2 = this.f4767a;
                System.arraycopy(iArr2, i3, iArr2, i, (iArr2.length - i) - i2);
                int[] iArr3 = this.f4767a;
                Arrays.fill(iArr3, iArr3.length - i2, iArr3.length, -1);
                m35226m(i, i2);
            }
        }

        /* renamed from: n */
        void m35225n(int i, C3118f fVar) {
            m35236c(i);
            this.f4767a[i] = fVar.f4787e;
        }

        /* renamed from: o */
        int m35224o(int i) {
            int length = this.f4767a.length;
            while (length <= i) {
                length *= 2;
            }
            return length;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @SuppressLint({"BanParcelableUsage"})
        /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a */
        /* loaded from: classes.dex */
        public static class C3115a implements Parcelable {
            public static final Parcelable.Creator<C3115a> CREATOR = new C0062a();

            /* renamed from: k */
            int f4769k;

            /* renamed from: l */
            int f4770l;

            /* renamed from: m */
            int[] f4771m;

            /* renamed from: n */
            boolean f4772n;

            /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a$a */
            /* loaded from: classes.dex */
            class C0062a implements Parcelable.Creator<C3115a> {
                C0062a() {
                }

                /* renamed from: a */
                public C3115a createFromParcel(Parcel parcel) {
                    return new C3115a(parcel);
                }

                /* renamed from: b */
                public C3115a[] newArray(int i) {
                    return new C3115a[i];
                }
            }

            C3115a(Parcel parcel) {
                this.f4769k = parcel.readInt();
                this.f4770l = parcel.readInt();
                this.f4772n = parcel.readInt() != 1 ? false : true;
                int readInt = parcel.readInt();
                if (readInt > 0) {
                    int[] iArr = new int[readInt];
                    this.f4771m = iArr;
                    parcel.readIntArray(iArr);
                }
            }

            /* renamed from: a */
            int m35223a(int i) {
                int[] iArr = this.f4771m;
                if (iArr == null) {
                    return 0;
                }
                return iArr[i];
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public String toString() {
                return "FullSpanItem{mPosition=" + this.f4769k + ", mGapDir=" + this.f4770l + ", mHasUnwantedGapAfter=" + this.f4772n + ", mGapPerSpan=" + Arrays.toString(this.f4771m) + '}';
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(this.f4769k);
                parcel.writeInt(this.f4770l);
                parcel.writeInt(this.f4772n ? 1 : 0);
                int[] iArr = this.f4771m;
                if (iArr == null || iArr.length <= 0) {
                    parcel.writeInt(0);
                    return;
                }
                parcel.writeInt(iArr.length);
                parcel.writeIntArray(this.f4771m);
            }

            C3115a() {
            }
        }
    }
}
