package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public class GridLayoutManager extends LinearLayoutManager {

    /* renamed from: U */
    int[] f35722U;

    /* renamed from: V */
    View[] f35723V;

    /* renamed from: a0 */
    private boolean f4591a0;

    /* renamed from: S */
    boolean f35720S = false;

    /* renamed from: T */
    int f35721T = -1;

    /* renamed from: W */
    final SparseIntArray f35724W = new SparseIntArray();

    /* renamed from: X */
    final SparseIntArray f35725X = new SparseIntArray();

    /* renamed from: Y */
    AbstractC3080c f35726Y = new C3078a();

    /* renamed from: Z */
    final Rect f35727Z = new Rect();

    /* renamed from: androidx.recyclerview.widget.GridLayoutManager$a */
    /* loaded from: classes.dex */
    public static final class C3078a extends AbstractC3080c {
        @Override // androidx.recyclerview.widget.GridLayoutManager.AbstractC3080c
        /* renamed from: e */
        public int mo35606e(int i, int i2) {
            return i % i2;
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.AbstractC3080c
        /* renamed from: f */
        public int mo35605f(int i) {
            return 1;
        }
    }

    /* renamed from: androidx.recyclerview.widget.GridLayoutManager$c */
    /* loaded from: classes.dex */
    public static abstract class AbstractC3080c {

        /* renamed from: a */
        final SparseIntArray f4594a = new SparseIntArray();

        /* renamed from: b */
        final SparseIntArray f4595b = new SparseIntArray();

        /* renamed from: c */
        private boolean f4596c = false;

        /* renamed from: d */
        private boolean f4597d = false;

        /* renamed from: a */
        static int m35610a(SparseIntArray sparseIntArray, int i) {
            int size = sparseIntArray.size() - 1;
            int i2 = 0;
            while (i2 <= size) {
                int i3 = (i2 + size) >>> 1;
                if (sparseIntArray.keyAt(i3) < i) {
                    i2 = i3 + 1;
                } else {
                    size = i3 - 1;
                }
            }
            int i4 = i2 - 1;
            if (i4 < 0 || i4 >= sparseIntArray.size()) {
                return -1;
            }
            return sparseIntArray.keyAt(i4);
        }

        /* renamed from: b */
        int m35609b(int i, int i2) {
            if (!this.f4597d) {
                return m35607d(i, i2);
            }
            int i3 = this.f4595b.get(i, -1);
            if (i3 != -1) {
                return i3;
            }
            int d = m35607d(i, i2);
            this.f4595b.put(i, d);
            return d;
        }

        /* renamed from: c */
        int m35608c(int i, int i2) {
            if (!this.f4596c) {
                return mo35606e(i, i2);
            }
            int i3 = this.f4594a.get(i, -1);
            if (i3 != -1) {
                return i3;
            }
            int e = mo35606e(i, i2);
            this.f4594a.put(i, e);
            return e;
        }

        /* renamed from: d */
        public int m35607d(int i, int i2) {
            int i3;
            int i4;
            int i5;
            int a;
            if (!this.f4597d || (a = m35610a(this.f4595b, i)) == -1) {
                i5 = 0;
                i4 = 0;
                i3 = 0;
            } else {
                i5 = this.f4595b.get(a);
                i4 = a + 1;
                i3 = m35608c(a, i2) + mo35605f(a);
                if (i3 == i2) {
                    i5++;
                    i3 = 0;
                }
            }
            int f = mo35605f(i);
            while (i4 < i) {
                int f2 = mo35605f(i4);
                i3 += f2;
                if (i3 == i2) {
                    i5++;
                    i3 = 0;
                } else if (i3 > i2) {
                    i5++;
                    i3 = f2;
                }
                i4++;
            }
            if (i3 + f > i2) {
                return i5 + 1;
            }
            return i5;
        }

        /* renamed from: e */
        public abstract int mo35606e(int i, int i2);

        /* renamed from: f */
        public abstract int mo35605f(int i);

        /* renamed from: g */
        public void m35604g() {
            this.f4595b.clear();
        }

        /* renamed from: h */
        public void m35603h() {
            this.f4594a.clear();
        }
    }

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        m35614n3(RecyclerView.LayoutManager.m35443p0(context, attributeSet, i, i2).f4691b);
    }

    /* renamed from: W2 */
    private void m35631W2(RecyclerView.Recycler recycler, RecyclerView.State state, int i, boolean z) {
        int i2;
        int i3;
        int i4;
        int i5 = 0;
        if (z) {
            i4 = 1;
            i2 = i;
            i3 = 0;
        } else {
            i3 = i - 1;
            i2 = -1;
            i4 = -1;
        }
        while (i3 != i2) {
            View view = this.f35723V[i3];
            C3079b bVar = (C3079b) view.getLayoutParams();
            int j3 = m35618j3(recycler, state, m35446o0(view));
            bVar.f4593p = j3;
            bVar.f4592o = i5;
            i5 += j3;
            i3 += i4;
        }
    }

    /* renamed from: X2 */
    private void m35630X2() {
        int U = m35477U();
        for (int i = 0; i < U; i++) {
            C3079b bVar = (C3079b) m35480T(i).getLayoutParams();
            int a = bVar.m35320a();
            this.f35724W.put(a, bVar.m35611j());
            this.f35725X.put(a, bVar.m35612i());
        }
    }

    /* renamed from: Y2 */
    private void m35629Y2(int i) {
        this.f35722U = m35628Z2(this.f35722U, this.f35721T, i);
    }

    /* renamed from: Z2 */
    static int[] m35628Z2(int[] iArr, int i, int i2) {
        int i3;
        if (!(iArr != null && iArr.length == i + 1 && iArr[iArr.length - 1] == i2)) {
            iArr = new int[i + 1];
        }
        int i4 = 0;
        iArr[0] = 0;
        int i5 = i2 / i;
        int i6 = i2 % i;
        int i7 = 0;
        for (int i8 = 1; i8 <= i; i8++) {
            i4 += i6;
            if (i4 <= 0 || i - i4 >= i6) {
                i3 = i5;
            } else {
                i3 = i5 + 1;
                i4 -= i;
            }
            i7 += i3;
            iArr[i8] = i7;
        }
        return iArr;
    }

    /* renamed from: a3 */
    private void m35627a3() {
        this.f35724W.clear();
        this.f35725X.clear();
    }

    /* renamed from: b3 */
    private int m35626b3(RecyclerView.State state) {
        int i;
        if (!(m35477U() == 0 || state.m35352b() == 0)) {
            m35568c2();
            boolean z2 = m35544z2();
            View h2 = m35562h2(!z2, true);
            View g2 = m35563g2(!z2, true);
            if (!(h2 == null || g2 == null)) {
                int b = this.f35726Y.m35609b(m35446o0(h2), this.f35721T);
                int b2 = this.f35726Y.m35609b(m35446o0(g2), this.f35721T);
                int min = Math.min(b, b2);
                int max = Math.max(b, b2);
                int b3 = this.f35726Y.m35609b(state.m35352b() - 1, this.f35721T) + 1;
                if (this.f35733H) {
                    i = Math.max(0, (b3 - max) - 1);
                } else {
                    i = Math.max(0, min);
                }
                if (!z2) {
                    return i;
                }
                return Math.round((i * (Math.abs(this.f35730E.mo35105d(g2) - this.f35730E.mo35102g(h2)) / ((this.f35726Y.m35609b(m35446o0(g2), this.f35721T) - this.f35726Y.m35609b(m35446o0(h2), this.f35721T)) + 1))) + (this.f35730E.mo35096m() - this.f35730E.mo35102g(h2)));
            }
        }
        return 0;
    }

    /* renamed from: c3 */
    private int m35625c3(RecyclerView.State state) {
        if (!(m35477U() == 0 || state.m35352b() == 0)) {
            m35568c2();
            View h2 = m35562h2(!m35544z2(), true);
            View g2 = m35563g2(!m35544z2(), true);
            if (!(h2 == null || g2 == null)) {
                if (!m35544z2()) {
                    return this.f35726Y.m35609b(state.m35352b() - 1, this.f35721T) + 1;
                }
                int d = this.f35730E.mo35105d(g2) - this.f35730E.mo35102g(h2);
                int b = this.f35726Y.m35609b(m35446o0(h2), this.f35721T);
                return (int) ((d / ((this.f35726Y.m35609b(m35446o0(g2), this.f35721T) - b) + 1)) * (this.f35726Y.m35609b(state.m35352b() - 1, this.f35721T) + 1));
            }
        }
        return 0;
    }

    /* renamed from: d3 */
    private void m35624d3(RecyclerView.Recycler recycler, RecyclerView.State state, LinearLayoutManager.C3089a aVar, int i) {
        boolean z;
        if (i == 1) {
            z = true;
        } else {
            z = false;
        }
        int i3 = m35619i3(recycler, state, aVar.f4640b);
        if (z) {
            while (i3 > 0) {
                int i2 = aVar.f4640b;
                if (i2 > 0) {
                    int i4 = i2 - 1;
                    aVar.f4640b = i4;
                    i3 = m35619i3(recycler, state, i4);
                } else {
                    return;
                }
            }
            return;
        }
        int b = state.m35352b() - 1;
        int i5 = aVar.f4640b;
        while (i5 < b) {
            int i6 = i5 + 1;
            int i32 = m35619i3(recycler, state, i6);
            if (i32 <= i3) {
                break;
            }
            i5 = i6;
            i3 = i32;
        }
        aVar.f4640b = i5;
    }

    /* renamed from: e3 */
    private void m35623e3() {
        View[] viewArr = this.f35723V;
        if (viewArr == null || viewArr.length != this.f35721T) {
            this.f35723V = new View[this.f35721T];
        }
    }

    /* renamed from: h3 */
    private int m35620h3(RecyclerView.Recycler recycler, RecyclerView.State state, int i) {
        if (!state.m35349e()) {
            return this.f35726Y.m35609b(i, this.f35721T);
        }
        int f = recycler.m35386f(i);
        if (f != -1) {
            return this.f35726Y.m35609b(f, this.f35721T);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. " + i);
        return 0;
    }

    /* renamed from: i3 */
    private int m35619i3(RecyclerView.Recycler recycler, RecyclerView.State state, int i) {
        if (!state.m35349e()) {
            return this.f35726Y.m35608c(i, this.f35721T);
        }
        int i2 = this.f35725X.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        int f = recycler.m35386f(i);
        if (f != -1) {
            return this.f35726Y.m35608c(f, this.f35721T);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i);
        return 0;
    }

    /* renamed from: j3 */
    private int m35618j3(RecyclerView.Recycler recycler, RecyclerView.State state, int i) {
        if (!state.m35349e()) {
            return this.f35726Y.mo35605f(i);
        }
        int i2 = this.f35724W.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        int f = recycler.m35386f(i);
        if (f != -1) {
            return this.f35726Y.mo35605f(f);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i);
        return 1;
    }

    /* renamed from: k3 */
    private void m35617k3(float f, int i) {
        m35629Y2(Math.max(Math.round(f * this.f35721T), i));
    }

    /* renamed from: l3 */
    private void m35616l3(View view, int i, boolean z) {
        int i2;
        int i3;
        C3079b bVar = (C3079b) view.getLayoutParams();
        Rect rect = bVar.f4750l;
        int i4 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) bVar).topMargin + ((ViewGroup.MarginLayoutParams) bVar).bottomMargin;
        int i5 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) bVar).leftMargin + ((ViewGroup.MarginLayoutParams) bVar).rightMargin;
        int f3 = m35622f3(bVar.f4592o, bVar.f4593p);
        if (this.f35728C == 1) {
            i2 = RecyclerView.LayoutManager.m35475V(f3, i, i5, ((ViewGroup.MarginLayoutParams) bVar).width, false);
            i3 = RecyclerView.LayoutManager.m35475V(this.f35730E.mo35095n(), m35458i0(), i4, ((ViewGroup.MarginLayoutParams) bVar).height, true);
        } else {
            int V = RecyclerView.LayoutManager.m35475V(f3, i, i4, ((ViewGroup.MarginLayoutParams) bVar).height, false);
            int V2 = RecyclerView.LayoutManager.m35475V(this.f35730E.mo35095n(), m35426w0(), i5, ((ViewGroup.MarginLayoutParams) bVar).width, true);
            i3 = V;
            i2 = V2;
        }
        m35615m3(view, i2, i3, z);
    }

    /* renamed from: m3 */
    private void m35615m3(View view, int i, int i2, boolean z) {
        boolean z2;
        RecyclerView.C3109i iVar = (RecyclerView.C3109i) view.getLayoutParams();
        if (z) {
            z2 = m35484Q1(view, i, i2, iVar);
        } else {
            z2 = m35487O1(view, i, i2, iVar);
        }
        if (z2) {
            view.measure(i, i2);
        }
    }

    /* renamed from: o3 */
    private void m35613o3() {
        int i;
        int i2;
        if (m35547w2() == 1) {
            i2 = m35428v0() - getPaddingRight();
            i = getPaddingLeft();
        } else {
            i2 = m35460h0() - getPaddingBottom();
            i = getPaddingTop();
        }
        m35629Y2(i2 - i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x009f, code lost:
        r21.f4645b = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00a1, code lost:
        return;
     */
    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* renamed from: A2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    void mo35596A2(androidx.recyclerview.widget.RecyclerView.Recycler r18, androidx.recyclerview.widget.RecyclerView.State r19, androidx.recyclerview.widget.LinearLayoutManager.C3091c r20, androidx.recyclerview.widget.LinearLayoutManager.C3090b r21) {
        /*
            Method dump skipped, instructions count: 556
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.mo35596A2(androidx.recyclerview.widget.RecyclerView$Recycler, androidx.recyclerview.widget.RecyclerView$State, androidx.recyclerview.widget.LinearLayoutManager$c, androidx.recyclerview.widget.LinearLayoutManager$b):void");
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: C */
    public int mo29430C(RecyclerView.State state) {
        if (this.f4591a0) {
            return m35626b3(state);
        }
        return super.mo29430C(state);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* renamed from: C2 */
    public void mo35594C2(RecyclerView.Recycler recycler, RecyclerView.State state, LinearLayoutManager.C3089a aVar, int i) {
        super.mo35594C2(recycler, state, aVar, i);
        m35613o3();
        if (state.m35352b() > 0 && !state.m35349e()) {
            m35624d3(recycler, state, aVar, i);
        }
        m35623e3();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: D */
    public int mo29428D(RecyclerView.State state) {
        if (this.f4591a0) {
            return m35625c3(state);
        }
        return super.mo29428D(state);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: F */
    public int mo29423F(RecyclerView.State state) {
        if (this.f4591a0) {
            return m35626b3(state);
        }
        return super.mo29423F(state);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: F1 */
    public int mo29422F1(int i, RecyclerView.Recycler recycler, RecyclerView.State state) {
        m35613o3();
        m35623e3();
        return super.mo29422F1(i, recycler, state);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: G */
    public int mo29420G(RecyclerView.State state) {
        if (this.f4591a0) {
            return m35625c3(state);
        }
        return super.mo29420G(state);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: H1 */
    public int mo29417H1(int i, RecyclerView.Recycler recycler, RecyclerView.State state) {
        m35613o3();
        m35623e3();
        return super.mo29417H1(i, recycler, state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: L1 */
    public void mo35299L1(Rect rect, int i, int i2) {
        int i3;
        int i4;
        if (this.f35722U == null) {
            super.mo35299L1(rect, i, i2);
        }
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        if (this.f35728C == 1) {
            i4 = RecyclerView.LayoutManager.m35422y(i2, rect.height() + paddingTop, m35451m0());
            int[] iArr = this.f35722U;
            i3 = RecyclerView.LayoutManager.m35422y(i, iArr[iArr.length - 1] + paddingLeft, m35449n0());
        } else {
            i3 = RecyclerView.LayoutManager.m35422y(i, rect.width() + paddingLeft, m35449n0());
            int[] iArr2 = this.f35722U;
            i4 = RecyclerView.LayoutManager.m35422y(i2, iArr2[iArr2.length - 1] + paddingTop, m35451m0());
        }
        m35494K1(i3, i4);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* renamed from: N2 */
    public void mo35583N2(boolean z) {
        if (!z) {
            super.mo35583N2(false);
            return;
        }
        throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: O */
    public RecyclerView.C3109i mo29408O() {
        if (this.f35728C == 0) {
            return new C3079b(-2, -1);
        }
        return new C3079b(-1, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: P */
    public RecyclerView.C3109i mo29404P(Context context, AttributeSet attributeSet) {
        return new C3079b(context, attributeSet);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: Q */
    public RecyclerView.C3109i mo35293Q(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new C3079b((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new C3079b(layoutParams);
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x00d6, code lost:
        if (r13 == r7) goto L_0x00b0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00f6, code lost:
        if (r13 == r11) goto L_0x00b8;
     */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0107  */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: R0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.view.View mo35291R0(android.view.View r24, int r25, androidx.recyclerview.widget.RecyclerView.Recycler r26, androidx.recyclerview.widget.RecyclerView.State r27) {
        /*
            Method dump skipped, instructions count: 337
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.mo35291R0(android.view.View, int, androidx.recyclerview.widget.RecyclerView$Recycler, androidx.recyclerview.widget.RecyclerView$State):android.view.View");
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: U1 */
    public boolean mo35286U1() {
        return this.f35739N == null && !this.f35720S;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* renamed from: W1 */
    void mo35574W1(RecyclerView.State state, LinearLayoutManager.C3091c cVar, RecyclerView.LayoutManager.AbstractC3096c cVar2) {
        int i = this.f35721T;
        for (int i2 = 0; i2 < this.f35721T && cVar.m35535c(state) && i > 0; i2++) {
            int i3 = cVar.f4651d;
            cVar2.mo35418a(i3, Math.max(0, cVar.f4654g));
            i -= this.f35726Y.mo35605f(i3);
            cVar.f4651d += cVar.f4652e;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: X0 */
    public void mo35471X0(RecyclerView.Recycler recycler, RecyclerView.State state, View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof C3079b)) {
            super.m35473W0(view, accessibilityNodeInfoCompat);
            return;
        }
        C3079b bVar = (C3079b) layoutParams;
        int h3 = m35620h3(recycler, state, bVar.m35320a());
        if (this.f35728C == 0) {
            accessibilityNodeInfoCompat.m37383d0(AccessibilityNodeInfoCompat.C2558c.m37331b(bVar.m35612i(), bVar.m35611j(), h3, 1, false, false));
        } else {
            accessibilityNodeInfoCompat.m37383d0(AccessibilityNodeInfoCompat.C2558c.m37331b(h3, 1, bVar.m35612i(), bVar.m35611j(), false, false));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: Y */
    public int mo35470Y(RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (this.f35728C == 1) {
            return this.f35721T;
        }
        if (state.m35352b() < 1) {
            return 0;
        }
        return m35620h3(recycler, state, state.m35352b() - 1) + 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: Z0 */
    public void mo29390Z0(RecyclerView recyclerView, int i, int i2) {
        this.f35726Y.m35603h();
        this.f35726Y.m35604g();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: a1 */
    public void mo35274a1(RecyclerView recyclerView) {
        this.f35726Y.m35603h();
        this.f35726Y.m35604g();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: b1 */
    public void mo29386b1(RecyclerView recyclerView, int i, int i2, int i3) {
        this.f35726Y.m35603h();
        this.f35726Y.m35604g();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: c1 */
    public void mo29384c1(RecyclerView recyclerView, int i, int i2) {
        this.f35726Y.m35603h();
        this.f35726Y.m35604g();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: e1 */
    public void mo29380e1(RecyclerView recyclerView, int i, int i2, Object obj) {
        this.f35726Y.m35603h();
        this.f35726Y.m35604g();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: f1 */
    public void mo29378f1(RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (state.m35349e()) {
            m35630X2();
        }
        super.mo29378f1(recycler, state);
        m35627a3();
    }

    /* renamed from: f3 */
    int m35622f3(int i, int i2) {
        if (this.f35728C != 1 || !m35545y2()) {
            int[] iArr = this.f35722U;
            return iArr[i2 + i] - iArr[i];
        }
        int[] iArr2 = this.f35722U;
        int i3 = this.f35721T;
        return iArr2[i3 - i] - iArr2[(i3 - i) - i2];
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: g1 */
    public void mo29376g1(RecyclerView.State state) {
        super.mo29376g1(state);
        this.f35720S = false;
    }

    /* renamed from: g3 */
    public int m35621g3() {
        return this.f35721T;
    }

    /* renamed from: n3 */
    public void m35614n3(int i) {
        if (i != this.f35721T) {
            this.f35720S = true;
            if (i >= 1) {
                this.f35721T = i;
                this.f35726Y.m35603h();
                m35510C1();
                return;
            }
            throw new IllegalArgumentException("Span count should be at least 1. Provided " + i);
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* renamed from: q2 */
    View mo35553q2(RecyclerView.Recycler recycler, RecyclerView.State state, boolean z, boolean z2) {
        int i;
        int i2;
        int U = m35477U();
        int i3 = 1;
        if (z2) {
            i2 = m35477U() - 1;
            i = -1;
            i3 = -1;
        } else {
            i = U;
            i2 = 0;
        }
        int b = state.m35352b();
        m35568c2();
        int m = this.f35730E.mo35096m();
        int i4 = this.f35730E.mo35100i();
        View view = null;
        View view2 = null;
        while (i2 != i) {
            View T = m35480T(i2);
            int o0 = m35446o0(T);
            if (o0 >= 0 && o0 < b && m35619i3(recycler, state, o0) == 0) {
                if (((RecyclerView.C3109i) T.getLayoutParams()).m35318e()) {
                    if (view2 == null) {
                        view2 = T;
                    }
                } else if (this.f35730E.mo35102g(T) < i4 && this.f35730E.mo35105d(T) >= m) {
                    return T;
                } else {
                    if (view == null) {
                        view = T;
                    }
                }
            }
            i2 += i3;
        }
        if (view != null) {
            return view;
        }
        return view2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: r0 */
    public int mo35439r0(RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (this.f35728C == 0) {
            return this.f35721T;
        }
        if (state.m35352b() < 1) {
            return 0;
        }
        return m35620h3(recycler, state, state.m35352b() - 1) + 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: x */
    public boolean mo29354x(RecyclerView.C3109i iVar) {
        return iVar instanceof C3079b;
    }

    /* renamed from: androidx.recyclerview.widget.GridLayoutManager$b */
    /* loaded from: classes.dex */
    public static class C3079b extends RecyclerView.C3109i {

        /* renamed from: o */
        int f4592o = -1;

        /* renamed from: p */
        int f4593p = 0;

        public C3079b(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        /* renamed from: i */
        public int m35612i() {
            return this.f4592o;
        }

        /* renamed from: j */
        public int m35611j() {
            return this.f4593p;
        }

        public C3079b(int i, int i2) {
            super(i, i2);
        }

        public C3079b(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public C3079b(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    public GridLayoutManager(Context context, int i, int i2, boolean z) {
        super(context, i2, z);
        m35614n3(i);
    }
}
