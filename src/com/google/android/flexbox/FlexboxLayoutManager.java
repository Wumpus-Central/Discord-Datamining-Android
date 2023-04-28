package com.google.android.flexbox;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.AbstractC3140j;
import androidx.recyclerview.widget.C3136g;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.flexbox.C5349d;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes5.dex */
public class FlexboxLayoutManager extends RecyclerView.LayoutManager implements AbstractC5346a, RecyclerView.SmoothScroller.AbstractC3100a {

    /* renamed from: c0 */
    private static final Rect f9941c0 = new Rect();

    /* renamed from: C */
    private int f37363C;

    /* renamed from: D */
    private int f37364D;

    /* renamed from: E */
    private int f37365E;

    /* renamed from: F */
    private int f37366F;

    /* renamed from: G */
    private int f37367G;

    /* renamed from: H */
    private boolean f37368H;

    /* renamed from: I */
    private boolean f37369I;

    /* renamed from: J */
    private List<C5348c> f37370J;

    /* renamed from: K */
    private final C5349d f37371K;

    /* renamed from: L */
    private RecyclerView.Recycler f37372L;

    /* renamed from: M */
    private RecyclerView.State f37373M;

    /* renamed from: N */
    private C5343d f37374N;

    /* renamed from: O */
    private C5340b f37375O;

    /* renamed from: P */
    private AbstractC3140j f37376P;

    /* renamed from: Q */
    private AbstractC3140j f37377Q;

    /* renamed from: R */
    private C5344e f37378R;

    /* renamed from: S */
    private int f37379S;

    /* renamed from: T */
    private int f37380T;

    /* renamed from: U */
    private int f37381U;

    /* renamed from: V */
    private int f37382V;

    /* renamed from: W */
    private boolean f37383W;

    /* renamed from: X */
    private SparseArray<View> f37384X;

    /* renamed from: Y */
    private final Context f37385Y;

    /* renamed from: Z */
    private View f37386Z;

    /* renamed from: a0 */
    private int f9942a0;

    /* renamed from: b0 */
    private C5349d.C5351b f9943b0;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.android.flexbox.FlexboxLayoutManager$b */
    /* loaded from: classes5.dex */
    public class C5340b {

        /* renamed from: a */
        private int f9944a;

        /* renamed from: b */
        private int f9945b;

        /* renamed from: c */
        private int f9946c;

        /* renamed from: d */
        private int f9947d;

        /* renamed from: e */
        private boolean f9948e;

        /* renamed from: f */
        private boolean f9949f;

        /* renamed from: g */
        private boolean f9950g;

        private C5340b() {
            this.f9947d = 0;
        }

        /* renamed from: l */
        static /* synthetic */ int m29338l(C5340b bVar, int i) {
            int i2 = bVar.f9947d + i;
            bVar.f9947d = i2;
            return i2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: r */
        public void m29332r() {
            int i;
            int i2;
            if (FlexboxLayoutManager.this.mo29278l() || !FlexboxLayoutManager.this.f37368H) {
                if (this.f9948e) {
                    i = FlexboxLayoutManager.this.f37376P.mo35100i();
                } else {
                    i = FlexboxLayoutManager.this.f37376P.mo35096m();
                }
                this.f9946c = i;
                return;
            }
            if (this.f9948e) {
                i2 = FlexboxLayoutManager.this.f37376P.mo35100i();
            } else {
                i2 = FlexboxLayoutManager.this.m35428v0() - FlexboxLayoutManager.this.f37376P.mo35096m();
            }
            this.f9946c = i2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: s */
        public void m29331s(View view) {
            AbstractC3140j jVar;
            if (FlexboxLayoutManager.this.f37364D == 0) {
                jVar = FlexboxLayoutManager.this.f37377Q;
            } else {
                jVar = FlexboxLayoutManager.this.f37376P;
            }
            if (FlexboxLayoutManager.this.mo29278l() || !FlexboxLayoutManager.this.f37368H) {
                if (this.f9948e) {
                    this.f9946c = jVar.mo35105d(view) + jVar.m35107o();
                } else {
                    this.f9946c = jVar.mo35102g(view);
                }
            } else if (this.f9948e) {
                this.f9946c = jVar.mo35102g(view) + jVar.m35107o();
            } else {
                this.f9946c = jVar.mo35105d(view);
            }
            this.f9944a = FlexboxLayoutManager.this.m35446o0(view);
            int i = 0;
            this.f9950g = false;
            int[] iArr = FlexboxLayoutManager.this.f37371K.f9993c;
            int i2 = this.f9944a;
            if (i2 == -1) {
                i2 = 0;
            }
            int i3 = iArr[i2];
            if (i3 != -1) {
                i = i3;
            }
            this.f9945b = i;
            if (FlexboxLayoutManager.this.f37370J.size() > this.f9945b) {
                this.f9944a = ((C5348c) FlexboxLayoutManager.this.f37370J.get(this.f9945b)).f9987o;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: t */
        public void m29330t() {
            this.f9944a = -1;
            this.f9945b = -1;
            this.f9946c = Integer.MIN_VALUE;
            boolean z = false;
            this.f9949f = false;
            this.f9950g = false;
            if (FlexboxLayoutManager.this.mo29278l()) {
                if (FlexboxLayoutManager.this.f37364D == 0) {
                    if (FlexboxLayoutManager.this.f37363C == 1) {
                        z = true;
                    }
                    this.f9948e = z;
                    return;
                }
                if (FlexboxLayoutManager.this.f37364D == 2) {
                    z = true;
                }
                this.f9948e = z;
            } else if (FlexboxLayoutManager.this.f37364D == 0) {
                if (FlexboxLayoutManager.this.f37363C == 3) {
                    z = true;
                }
                this.f9948e = z;
            } else {
                if (FlexboxLayoutManager.this.f37364D == 2) {
                    z = true;
                }
                this.f9948e = z;
            }
        }

        public String toString() {
            return "AnchorInfo{mPosition=" + this.f9944a + ", mFlexLinePosition=" + this.f9945b + ", mCoordinate=" + this.f9946c + ", mPerpendicularCoordinate=" + this.f9947d + ", mLayoutFromEnd=" + this.f9948e + ", mValid=" + this.f9949f + ", mAssignedFromSavedState=" + this.f9950g + '}';
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.android.flexbox.FlexboxLayoutManager$d */
    /* loaded from: classes5.dex */
    public static class C5343d {

        /* renamed from: a */
        private int f9961a;

        /* renamed from: b */
        private boolean f9962b;

        /* renamed from: c */
        private int f9963c;

        /* renamed from: d */
        private int f9964d;

        /* renamed from: e */
        private int f9965e;

        /* renamed from: f */
        private int f9966f;

        /* renamed from: g */
        private int f9967g;

        /* renamed from: h */
        private int f9968h;

        /* renamed from: i */
        private int f9969i;

        /* renamed from: j */
        private boolean f9970j;

        private C5343d() {
            this.f9968h = 1;
            this.f9969i = 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: D */
        public boolean m29324D(RecyclerView.State state, List<C5348c> list) {
            int i;
            int i2 = this.f9964d;
            if (i2 < 0 || i2 >= state.m35352b() || (i = this.f9963c) < 0 || i >= list.size()) {
                return false;
            }
            return true;
        }

        /* renamed from: c */
        static /* synthetic */ int m29321c(C5343d dVar, int i) {
            int i2 = dVar.f9965e + i;
            dVar.f9965e = i2;
            return i2;
        }

        /* renamed from: d */
        static /* synthetic */ int m29320d(C5343d dVar, int i) {
            int i2 = dVar.f9965e - i;
            dVar.f9965e = i2;
            return i2;
        }

        /* renamed from: i */
        static /* synthetic */ int m29315i(C5343d dVar, int i) {
            int i2 = dVar.f9961a - i;
            dVar.f9961a = i2;
            return i2;
        }

        /* renamed from: l */
        static /* synthetic */ int m29312l(C5343d dVar) {
            int i = dVar.f9963c;
            dVar.f9963c = i + 1;
            return i;
        }

        /* renamed from: m */
        static /* synthetic */ int m29311m(C5343d dVar) {
            int i = dVar.f9963c;
            dVar.f9963c = i - 1;
            return i;
        }

        /* renamed from: n */
        static /* synthetic */ int m29310n(C5343d dVar, int i) {
            int i2 = dVar.f9963c + i;
            dVar.f9963c = i2;
            return i2;
        }

        /* renamed from: q */
        static /* synthetic */ int m29307q(C5343d dVar, int i) {
            int i2 = dVar.f9966f + i;
            dVar.f9966f = i2;
            return i2;
        }

        /* renamed from: u */
        static /* synthetic */ int m29303u(C5343d dVar, int i) {
            int i2 = dVar.f9964d + i;
            dVar.f9964d = i2;
            return i2;
        }

        /* renamed from: v */
        static /* synthetic */ int m29302v(C5343d dVar, int i) {
            int i2 = dVar.f9964d - i;
            dVar.f9964d = i2;
            return i2;
        }

        public String toString() {
            return "LayoutState{mAvailable=" + this.f9961a + ", mFlexLinePosition=" + this.f9963c + ", mPosition=" + this.f9964d + ", mOffset=" + this.f9965e + ", mScrollingOffset=" + this.f9966f + ", mLastScrollDelta=" + this.f9967g + ", mItemDirection=" + this.f9968h + ", mLayoutDirection=" + this.f9969i + '}';
        }
    }

    public FlexboxLayoutManager(Context context) {
        this(context, 0, 1);
    }

    /* renamed from: A2 */
    private int m29433A2(int i, RecyclerView.Recycler recycler, RecyclerView.State state) {
        boolean z;
        if (m35477U() == 0 || i == 0) {
            return 0;
        }
        m29372j2();
        int i2 = 1;
        this.f37374N.f9970j = true;
        if (mo29278l() || !this.f37368H) {
            z = false;
        } else {
            z = true;
        }
        if (!z ? i <= 0 : i >= 0) {
            i2 = -1;
        }
        int abs = Math.abs(i);
        m29397U2(i2, abs);
        int k2 = this.f37374N.f9966f + m29370k2(recycler, state, this.f37374N);
        if (k2 < 0) {
            return 0;
        }
        if (z) {
            if (abs > k2) {
                i = (-i2) * k2;
            }
        } else if (abs > k2) {
            i = i2 * k2;
        }
        this.f37376P.mo35092r(-i);
        this.f37374N.f9967g = i;
        return i;
    }

    /* renamed from: B2 */
    private int m29431B2(int i) {
        int i2;
        int i3;
        int i4;
        boolean z = false;
        if (m35477U() == 0 || i == 0) {
            return 0;
        }
        m29372j2();
        boolean l = mo29278l();
        View view = this.f37386Z;
        if (l) {
            i2 = view.getWidth();
        } else {
            i2 = view.getHeight();
        }
        if (l) {
            i3 = m35428v0();
        } else {
            i3 = m35460h0();
        }
        if (m35454k0() == 1) {
            z = true;
        }
        if (z) {
            int abs = Math.abs(i);
            if (i < 0) {
                i4 = Math.min((i3 + this.f37375O.f9947d) - i2, abs);
            } else if (this.f37375O.f9947d + i <= 0) {
                return i;
            } else {
                i4 = this.f37375O.f9947d;
            }
        } else if (i > 0) {
            return Math.min((i3 - this.f37375O.f9947d) - i2, i);
        } else {
            if (this.f37375O.f9947d + i >= 0) {
                return i;
            }
            i4 = this.f37375O.f9947d;
        }
        return -i4;
    }

    /* renamed from: C2 */
    private boolean m29429C2(View view, boolean z) {
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int v0 = m35428v0() - getPaddingRight();
        int h0 = m35460h0() - getPaddingBottom();
        int x2 = m29353x2(view);
        int z22 = m29350z2(view);
        int y2 = m29352y2(view);
        int v2 = m29357v2(view);
        if (paddingLeft > x2 || v0 < y2) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (x2 >= v0 || y2 >= paddingLeft) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (paddingTop > z22 || h0 < v2) {
            z4 = false;
        } else {
            z4 = true;
        }
        if (z22 >= h0 || v2 >= paddingTop) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (z) {
            if (!z2 || !z4) {
                return false;
            }
            return true;
        } else if (!z3 || !z5) {
            return false;
        } else {
            return true;
        }
    }

    /* renamed from: D2 */
    private int m29427D2(C5348c cVar, C5343d dVar) {
        if (mo29278l()) {
            return m29424E2(cVar, dVar);
        }
        return m29421F2(cVar, dVar);
    }

    /* renamed from: E0 */
    private static boolean m29425E0(int i, int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (i3 > 0 && i != i3) {
            return false;
        }
        if (mode != Integer.MIN_VALUE) {
            if (mode == 0) {
                return true;
            }
            if (mode == 1073741824 && size == i) {
                return true;
            }
            return false;
        } else if (size >= i) {
            return true;
        } else {
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00ce  */
    /* renamed from: E2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private int m29424E2(com.google.android.flexbox.C5348c r22, com.google.android.flexbox.FlexboxLayoutManager.C5343d r23) {
        /*
            Method dump skipped, instructions count: 423
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.FlexboxLayoutManager.m29424E2(com.google.android.flexbox.c, com.google.android.flexbox.FlexboxLayoutManager$d):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00d4  */
    /* renamed from: F2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private int m29421F2(com.google.android.flexbox.C5348c r26, com.google.android.flexbox.FlexboxLayoutManager.C5343d r27) {
        /*
            Method dump skipped, instructions count: 541
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.FlexboxLayoutManager.m29421F2(com.google.android.flexbox.c, com.google.android.flexbox.FlexboxLayoutManager$d):int");
    }

    /* renamed from: G2 */
    private void m29418G2(RecyclerView.Recycler recycler, C5343d dVar) {
        if (dVar.f9970j) {
            if (dVar.f9969i == -1) {
                m29415I2(recycler, dVar);
            } else {
                m29414J2(recycler, dVar);
            }
        }
    }

    /* renamed from: H2 */
    private void m29416H2(RecyclerView.Recycler recycler, int i, int i2) {
        while (i2 >= i) {
            m35425w1(i2, recycler);
            i2--;
        }
    }

    /* renamed from: I2 */
    private void m29415I2(RecyclerView.Recycler recycler, C5343d dVar) {
        int U;
        int i;
        View T;
        int i2;
        if (dVar.f9966f >= 0 && (U = m35477U()) != 0 && (T = m35480T(U - 1)) != null && (i2 = this.f37371K.f9993c[m35446o0(T)]) != -1) {
            C5348c cVar = this.f37370J.get(i2);
            int i3 = i;
            while (true) {
                if (i3 < 0) {
                    break;
                }
                View T2 = m35480T(i3);
                if (T2 != null) {
                    if (!m29383c2(T2, dVar.f9966f)) {
                        break;
                    } else if (cVar.f9987o != m35446o0(T2)) {
                        continue;
                    } else if (i2 <= 0) {
                        U = i3;
                        break;
                    } else {
                        i2 += dVar.f9969i;
                        cVar = this.f37370J.get(i2);
                        U = i3;
                    }
                }
                i3--;
            }
            m29416H2(recycler, U, i);
        }
    }

    /* renamed from: J2 */
    private void m29414J2(RecyclerView.Recycler recycler, C5343d dVar) {
        int U;
        View T;
        if (dVar.f9966f >= 0 && (U = m35477U()) != 0 && (T = m35480T(0)) != null) {
            int i = this.f37371K.f9993c[m35446o0(T)];
            int i2 = -1;
            if (i != -1) {
                C5348c cVar = this.f37370J.get(i);
                int i3 = 0;
                while (true) {
                    if (i3 >= U) {
                        break;
                    }
                    View T2 = m35480T(i3);
                    if (T2 != null) {
                        if (!m29381d2(T2, dVar.f9966f)) {
                            break;
                        } else if (cVar.f9988p != m35446o0(T2)) {
                            continue;
                        } else if (i >= this.f37370J.size() - 1) {
                            i2 = i3;
                            break;
                        } else {
                            i += dVar.f9969i;
                            cVar = this.f37370J.get(i);
                            i2 = i3;
                        }
                    }
                    i3++;
                }
                m29416H2(recycler, 0, i2);
            }
        }
    }

    /* renamed from: K2 */
    private void m29413K2() {
        int i;
        boolean z;
        if (mo29278l()) {
            i = m35458i0();
        } else {
            i = m35426w0();
        }
        C5343d dVar = this.f37374N;
        if (i == 0 || i == Integer.MIN_VALUE) {
            z = true;
        } else {
            z = false;
        }
        dVar.f9962b = z;
    }

    /* renamed from: L2 */
    private void m29412L2() {
        boolean z;
        boolean z2;
        boolean z3;
        int k0 = m35454k0();
        int i = this.f37363C;
        boolean z4 = false;
        if (i == 0) {
            if (k0 == 1) {
                z = true;
            } else {
                z = false;
            }
            this.f37368H = z;
            if (this.f37364D == 2) {
                z4 = true;
            }
            this.f37369I = z4;
        } else if (i == 1) {
            if (k0 != 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            this.f37368H = z2;
            if (this.f37364D == 2) {
                z4 = true;
            }
            this.f37369I = z4;
        } else if (i == 2) {
            if (k0 == 1) {
                z3 = true;
            } else {
                z3 = false;
            }
            this.f37368H = z3;
            if (this.f37364D == 2) {
                this.f37368H = !z3;
            }
            this.f37369I = false;
        } else if (i != 3) {
            this.f37368H = false;
            this.f37369I = false;
        } else {
            if (k0 == 1) {
                z4 = true;
            }
            this.f37368H = z4;
            if (this.f37364D == 2) {
                this.f37368H = !z4;
            }
            this.f37369I = true;
        }
    }

    /* renamed from: O1 */
    private boolean m29406O1(View view, int i, int i2, RecyclerView.C3109i iVar) {
        if (view.isLayoutRequested() || !m35509D0() || !m29425E0(view.getWidth(), i, ((ViewGroup.MarginLayoutParams) iVar).width) || !m29425E0(view.getHeight(), i2, ((ViewGroup.MarginLayoutParams) iVar).height)) {
            return true;
        }
        return false;
    }

    /* renamed from: P2 */
    private boolean m29403P2(RecyclerView.State state, C5340b bVar) {
        View view;
        int i;
        boolean z = false;
        if (m35477U() == 0) {
            return false;
        }
        if (bVar.f9948e) {
            view = m29365o2(state.m35352b());
        } else {
            view = m29368l2(state.m35352b());
        }
        if (view == null) {
            return false;
        }
        bVar.m29331s(view);
        if (!state.m35349e() && mo35286U1()) {
            if (this.f37376P.mo35102g(view) >= this.f37376P.mo35100i() || this.f37376P.mo35105d(view) < this.f37376P.mo35096m()) {
                z = true;
            }
            if (z) {
                if (bVar.f9948e) {
                    i = this.f37376P.mo35100i();
                } else {
                    i = this.f37376P.mo35096m();
                }
                bVar.f9946c = i;
            }
        }
        return true;
    }

    /* renamed from: Q2 */
    private boolean m29401Q2(RecyclerView.State state, C5340b bVar, C5344e eVar) {
        int i;
        View T;
        int i2;
        boolean z = false;
        if (!state.m35349e() && (i = this.f37379S) != -1) {
            if (i < 0 || i >= state.m35352b()) {
                this.f37379S = -1;
                this.f37380T = Integer.MIN_VALUE;
            } else {
                bVar.f9944a = this.f37379S;
                bVar.f9945b = this.f37371K.f9993c[bVar.f9944a];
                C5344e eVar2 = this.f37378R;
                if (eVar2 != null && eVar2.m29291p(state.m35352b())) {
                    bVar.f9946c = this.f37376P.mo35096m() + eVar.f9972l;
                    bVar.f9950g = true;
                    bVar.f9945b = -1;
                    return true;
                } else if (this.f37380T == Integer.MIN_VALUE) {
                    View N = mo35490N(this.f37379S);
                    if (N == null) {
                        if (m35477U() > 0 && (T = m35480T(0)) != null) {
                            if (this.f37379S < m35446o0(T)) {
                                z = true;
                            }
                            bVar.f9948e = z;
                        }
                        bVar.m29332r();
                    } else if (this.f37376P.mo35104e(N) > this.f37376P.mo35095n()) {
                        bVar.m29332r();
                        return true;
                    } else if (this.f37376P.mo35102g(N) - this.f37376P.mo35096m() < 0) {
                        bVar.f9946c = this.f37376P.mo35096m();
                        bVar.f9948e = false;
                        return true;
                    } else if (this.f37376P.mo35100i() - this.f37376P.mo35105d(N) < 0) {
                        bVar.f9946c = this.f37376P.mo35100i();
                        bVar.f9948e = true;
                        return true;
                    } else {
                        if (bVar.f9948e) {
                            i2 = this.f37376P.mo35105d(N) + this.f37376P.m35107o();
                        } else {
                            i2 = this.f37376P.mo35102g(N);
                        }
                        bVar.f9946c = i2;
                    }
                    return true;
                } else {
                    if (mo29278l() || !this.f37368H) {
                        bVar.f9946c = this.f37376P.mo35096m() + this.f37380T;
                    } else {
                        bVar.f9946c = this.f37380T - this.f37376P.mo35099j();
                    }
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: R2 */
    private void m29400R2(RecyclerView.State state, C5340b bVar) {
        if (!m29401Q2(state, bVar, this.f37378R) && !m29403P2(state, bVar)) {
            bVar.m29332r();
            bVar.f9944a = 0;
            bVar.f9945b = 0;
        }
    }

    /* renamed from: S2 */
    private void m29399S2(int i) {
        if (i < m29363q2()) {
            int U = m35477U();
            this.f37371K.m29213t(U);
            this.f37371K.m29212u(U);
            this.f37371K.m29214s(U);
            if (i < this.f37371K.f9993c.length) {
                this.f9942a0 = i;
                View w2 = m29355w2();
                if (w2 != null) {
                    this.f37379S = m35446o0(w2);
                    if (mo29278l() || !this.f37368H) {
                        this.f37380T = this.f37376P.mo35102g(w2) - this.f37376P.mo35096m();
                    } else {
                        this.f37380T = this.f37376P.mo35105d(w2) + this.f37376P.mo35099j();
                    }
                }
            }
        }
    }

    /* renamed from: T2 */
    private void m29398T2(int i) {
        int i2;
        int i3;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(m35428v0(), m35426w0());
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(m35460h0(), m35458i0());
        int v0 = m35428v0();
        int h0 = m35460h0();
        boolean z = true;
        if (mo29278l()) {
            int i4 = this.f37381U;
            if (i4 == Integer.MIN_VALUE || i4 == v0) {
                z = false;
            }
            if (this.f37374N.f9962b) {
                i2 = this.f37385Y.getResources().getDisplayMetrics().heightPixels;
            } else {
                i2 = this.f37374N.f9961a;
            }
        } else {
            int i5 = this.f37382V;
            if (i5 == Integer.MIN_VALUE || i5 == h0) {
                z = false;
            }
            if (this.f37374N.f9962b) {
                i2 = this.f37385Y.getResources().getDisplayMetrics().widthPixels;
            } else {
                i2 = this.f37374N.f9961a;
            }
        }
        this.f37381U = v0;
        this.f37382V = h0;
        int i6 = this.f9942a0;
        if (i6 != -1 || (this.f37379S == -1 && !z)) {
            if (i6 != -1) {
                i3 = Math.min(i6, this.f37375O.f9944a);
            } else {
                i3 = this.f37375O.f9944a;
            }
            this.f9943b0.m29206a();
            if (mo29278l()) {
                if (this.f37370J.size() > 0) {
                    this.f37371K.m29223j(this.f37370J, i3);
                    this.f37371K.m29231b(this.f9943b0, makeMeasureSpec, makeMeasureSpec2, i2, i3, this.f37375O.f9944a, this.f37370J);
                } else {
                    this.f37371K.m29214s(i);
                    this.f37371K.m29229d(this.f9943b0, makeMeasureSpec, makeMeasureSpec2, i2, 0, this.f37370J);
                }
            } else if (this.f37370J.size() > 0) {
                this.f37371K.m29223j(this.f37370J, i3);
                this.f37371K.m29231b(this.f9943b0, makeMeasureSpec2, makeMeasureSpec, i2, i3, this.f37375O.f9944a, this.f37370J);
            } else {
                this.f37371K.m29214s(i);
                this.f37371K.m29226g(this.f9943b0, makeMeasureSpec, makeMeasureSpec2, i2, 0, this.f37370J);
            }
            this.f37370J = this.f9943b0.f9996a;
            this.f37371K.m29216q(makeMeasureSpec, makeMeasureSpec2, i3);
            this.f37371K.m29234Y(i3);
        } else if (!this.f37375O.f9948e) {
            this.f37370J.clear();
            this.f9943b0.m29206a();
            if (mo29278l()) {
                this.f37371K.m29228e(this.f9943b0, makeMeasureSpec, makeMeasureSpec2, i2, this.f37375O.f9944a, this.f37370J);
            } else {
                this.f37371K.m29225h(this.f9943b0, makeMeasureSpec, makeMeasureSpec2, i2, this.f37375O.f9944a, this.f37370J);
            }
            this.f37370J = this.f9943b0.f9996a;
            this.f37371K.m29217p(makeMeasureSpec, makeMeasureSpec2);
            this.f37371K.m29235X();
            C5340b bVar = this.f37375O;
            bVar.f9945b = this.f37371K.f9993c[bVar.f9944a];
            this.f37374N.f9963c = this.f37375O.f9945b;
        }
    }

    /* renamed from: U2 */
    private void m29397U2(int i, int i2) {
        boolean z;
        int i3;
        this.f37374N.f9969i = i;
        boolean l = mo29278l();
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(m35428v0(), m35426w0());
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(m35460h0(), m35458i0());
        if (l || !this.f37368H) {
            z = false;
        } else {
            z = true;
        }
        if (i == 1) {
            View T = m35480T(m35477U() - 1);
            if (T != null) {
                this.f37374N.f9965e = this.f37376P.mo35105d(T);
                int o0 = m35446o0(T);
                View p2 = m29364p2(T, this.f37370J.get(this.f37371K.f9993c[o0]));
                this.f37374N.f9968h = 1;
                C5343d dVar = this.f37374N;
                dVar.f9964d = o0 + dVar.f9968h;
                if (this.f37371K.f9993c.length <= this.f37374N.f9964d) {
                    this.f37374N.f9963c = -1;
                } else {
                    C5343d dVar2 = this.f37374N;
                    dVar2.f9963c = this.f37371K.f9993c[dVar2.f9964d];
                }
                if (z) {
                    this.f37374N.f9965e = this.f37376P.mo35102g(p2);
                    this.f37374N.f9966f = (-this.f37376P.mo35102g(p2)) + this.f37376P.mo35096m();
                    C5343d dVar3 = this.f37374N;
                    dVar3.f9966f = Math.max(dVar3.f9966f, 0);
                } else {
                    this.f37374N.f9965e = this.f37376P.mo35105d(p2);
                    this.f37374N.f9966f = this.f37376P.mo35105d(p2) - this.f37376P.mo35100i();
                }
                if ((this.f37374N.f9963c == -1 || this.f37374N.f9963c > this.f37370J.size() - 1) && this.f37374N.f9964d <= getFlexItemCount()) {
                    int i4 = i2 - this.f37374N.f9966f;
                    this.f9943b0.m29206a();
                    if (i4 > 0) {
                        if (l) {
                            this.f37371K.m29229d(this.f9943b0, makeMeasureSpec, makeMeasureSpec2, i4, this.f37374N.f9964d, this.f37370J);
                        } else {
                            this.f37371K.m29226g(this.f9943b0, makeMeasureSpec, makeMeasureSpec2, i4, this.f37374N.f9964d, this.f37370J);
                        }
                        this.f37371K.m29216q(makeMeasureSpec, makeMeasureSpec2, this.f37374N.f9964d);
                        this.f37371K.m29234Y(this.f37374N.f9964d);
                    }
                }
            } else {
                return;
            }
        } else {
            View T2 = m35480T(0);
            if (T2 != null) {
                this.f37374N.f9965e = this.f37376P.mo35102g(T2);
                int o02 = m35446o0(T2);
                View m2 = m29367m2(T2, this.f37370J.get(this.f37371K.f9993c[o02]));
                this.f37374N.f9968h = 1;
                int i5 = this.f37371K.f9993c[o02];
                if (i5 == -1) {
                    i5 = 0;
                }
                if (i5 > 0) {
                    this.f37374N.f9964d = o02 - this.f37370J.get(i5 - 1).m29261b();
                } else {
                    this.f37374N.f9964d = -1;
                }
                C5343d dVar4 = this.f37374N;
                if (i5 > 0) {
                    i3 = i5 - 1;
                } else {
                    i3 = 0;
                }
                dVar4.f9963c = i3;
                if (z) {
                    this.f37374N.f9965e = this.f37376P.mo35105d(m2);
                    this.f37374N.f9966f = this.f37376P.mo35105d(m2) - this.f37376P.mo35100i();
                    C5343d dVar5 = this.f37374N;
                    dVar5.f9966f = Math.max(dVar5.f9966f, 0);
                } else {
                    this.f37374N.f9965e = this.f37376P.mo35102g(m2);
                    this.f37374N.f9966f = (-this.f37376P.mo35102g(m2)) + this.f37376P.mo35096m();
                }
            } else {
                return;
            }
        }
        C5343d dVar6 = this.f37374N;
        dVar6.f9961a = i2 - dVar6.f9966f;
    }

    /* renamed from: V2 */
    private void m29395V2(C5340b bVar, boolean z, boolean z2) {
        if (z2) {
            m29413K2();
        } else {
            this.f37374N.f9962b = false;
        }
        if (mo29278l() || !this.f37368H) {
            this.f37374N.f9961a = this.f37376P.mo35100i() - bVar.f9946c;
        } else {
            this.f37374N.f9961a = bVar.f9946c - getPaddingRight();
        }
        this.f37374N.f9964d = bVar.f9944a;
        this.f37374N.f9968h = 1;
        this.f37374N.f9969i = 1;
        this.f37374N.f9965e = bVar.f9946c;
        this.f37374N.f9966f = Integer.MIN_VALUE;
        this.f37374N.f9963c = bVar.f9945b;
        if (z && this.f37370J.size() > 1 && bVar.f9945b >= 0 && bVar.f9945b < this.f37370J.size() - 1) {
            C5343d.m29312l(this.f37374N);
            C5343d.m29303u(this.f37374N, this.f37370J.get(bVar.f9945b).m29261b());
        }
    }

    /* renamed from: W2 */
    private void m29393W2(C5340b bVar, boolean z, boolean z2) {
        if (z2) {
            m29413K2();
        } else {
            this.f37374N.f9962b = false;
        }
        if (mo29278l() || !this.f37368H) {
            this.f37374N.f9961a = bVar.f9946c - this.f37376P.mo35096m();
        } else {
            this.f37374N.f9961a = (this.f37386Z.getWidth() - bVar.f9946c) - this.f37376P.mo35096m();
        }
        this.f37374N.f9964d = bVar.f9944a;
        this.f37374N.f9968h = 1;
        this.f37374N.f9969i = -1;
        this.f37374N.f9965e = bVar.f9946c;
        this.f37374N.f9966f = Integer.MIN_VALUE;
        this.f37374N.f9963c = bVar.f9945b;
        if (z && bVar.f9945b > 0 && this.f37370J.size() > bVar.f9945b) {
            C5343d.m29311m(this.f37374N);
            C5343d.m29302v(this.f37374N, this.f37370J.get(bVar.f9945b).m29261b());
        }
    }

    /* renamed from: c2 */
    private boolean m29383c2(View view, int i) {
        if (mo29278l() || !this.f37368H) {
            if (this.f37376P.mo35102g(view) >= this.f37376P.mo35101h() - i) {
                return true;
            }
            return false;
        } else if (this.f37376P.mo35105d(view) <= i) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: d2 */
    private boolean m29381d2(View view, int i) {
        if (mo29278l() || !this.f37368H) {
            if (this.f37376P.mo35105d(view) <= i) {
                return true;
            }
            return false;
        } else if (this.f37376P.mo35101h() - this.f37376P.mo35102g(view) <= i) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: e2 */
    private void m29379e2() {
        this.f37370J.clear();
        this.f37375O.m29330t();
        this.f37375O.f9947d = 0;
    }

    /* renamed from: f2 */
    private int m29377f2(RecyclerView.State state) {
        if (m35477U() == 0) {
            return 0;
        }
        int b = state.m35352b();
        m29372j2();
        View l2 = m29368l2(b);
        View o2 = m29365o2(b);
        if (state.m35352b() == 0 || l2 == null || o2 == null) {
            return 0;
        }
        return Math.min(this.f37376P.mo35095n(), this.f37376P.mo35105d(o2) - this.f37376P.mo35102g(l2));
    }

    /* renamed from: g2 */
    private int m29375g2(RecyclerView.State state) {
        if (m35477U() == 0) {
            return 0;
        }
        int b = state.m35352b();
        View l2 = m29368l2(b);
        View o2 = m29365o2(b);
        if (!(state.m35352b() == 0 || l2 == null || o2 == null)) {
            int o0 = m35446o0(l2);
            int o02 = m35446o0(o2);
            int abs = Math.abs(this.f37376P.mo35105d(o2) - this.f37376P.mo35102g(l2));
            int[] iArr = this.f37371K.f9993c;
            int i = iArr[o0];
            if (!(i == 0 || i == -1)) {
                return Math.round((i * (abs / ((iArr[o02] - i) + 1))) + (this.f37376P.mo35096m() - this.f37376P.mo35102g(l2)));
            }
        }
        return 0;
    }

    /* renamed from: h2 */
    private int m29374h2(RecyclerView.State state) {
        if (m35477U() == 0) {
            return 0;
        }
        int b = state.m35352b();
        View l2 = m29368l2(b);
        View o2 = m29365o2(b);
        if (state.m35352b() == 0 || l2 == null || o2 == null) {
            return 0;
        }
        int n2 = m29366n2();
        return (int) ((Math.abs(this.f37376P.mo35105d(o2) - this.f37376P.mo35102g(l2)) / ((m29363q2() - n2) + 1)) * state.m35352b());
    }

    /* renamed from: i2 */
    private void m29373i2() {
        if (this.f37374N == null) {
            this.f37374N = new C5343d();
        }
    }

    /* renamed from: j2 */
    private void m29372j2() {
        if (this.f37376P == null) {
            if (mo29278l()) {
                if (this.f37364D == 0) {
                    this.f37376P = AbstractC3140j.m35110a(this);
                    this.f37377Q = AbstractC3140j.m35108c(this);
                    return;
                }
                this.f37376P = AbstractC3140j.m35108c(this);
                this.f37377Q = AbstractC3140j.m35110a(this);
            } else if (this.f37364D == 0) {
                this.f37376P = AbstractC3140j.m35108c(this);
                this.f37377Q = AbstractC3140j.m35110a(this);
            } else {
                this.f37376P = AbstractC3140j.m35110a(this);
                this.f37377Q = AbstractC3140j.m35108c(this);
            }
        }
    }

    /* renamed from: k2 */
    private int m29370k2(RecyclerView.Recycler recycler, RecyclerView.State state, C5343d dVar) {
        if (dVar.f9966f != Integer.MIN_VALUE) {
            if (dVar.f9961a < 0) {
                C5343d.m29307q(dVar, dVar.f9961a);
            }
            m29418G2(recycler, dVar);
        }
        int i = dVar.f9961a;
        int i2 = dVar.f9961a;
        boolean l = mo29278l();
        int i3 = 0;
        while (true) {
            if ((i2 > 0 || this.f37374N.f9962b) && dVar.m29324D(state, this.f37370J)) {
                C5348c cVar = this.f37370J.get(dVar.f9963c);
                dVar.f9964d = cVar.f9987o;
                i3 += m29427D2(cVar, dVar);
                if (l || !this.f37368H) {
                    C5343d.m29321c(dVar, cVar.m29262a() * dVar.f9969i);
                } else {
                    C5343d.m29320d(dVar, cVar.m29262a() * dVar.f9969i);
                }
                i2 -= cVar.m29262a();
            }
        }
        C5343d.m29315i(dVar, i3);
        if (dVar.f9966f != Integer.MIN_VALUE) {
            C5343d.m29307q(dVar, i3);
            if (dVar.f9961a < 0) {
                C5343d.m29307q(dVar, dVar.f9961a);
            }
            m29418G2(recycler, dVar);
        }
        return i - dVar.f9961a;
    }

    /* renamed from: l2 */
    private View m29368l2(int i) {
        View s2 = m29361s2(0, m35477U(), i);
        if (s2 == null) {
            return null;
        }
        int i2 = this.f37371K.f9993c[m35446o0(s2)];
        if (i2 == -1) {
            return null;
        }
        return m29367m2(s2, this.f37370J.get(i2));
    }

    /* renamed from: m2 */
    private View m29367m2(View view, C5348c cVar) {
        boolean l = mo29278l();
        int i = cVar.f9980h;
        for (int i2 = 1; i2 < i; i2++) {
            View T = m35480T(i2);
            if (!(T == null || T.getVisibility() == 8)) {
                if (!this.f37368H || l) {
                    if (this.f37376P.mo35102g(view) <= this.f37376P.mo35102g(T)) {
                    }
                    view = T;
                } else {
                    if (this.f37376P.mo35105d(view) >= this.f37376P.mo35105d(T)) {
                    }
                    view = T;
                }
            }
        }
        return view;
    }

    /* renamed from: o2 */
    private View m29365o2(int i) {
        View s2 = m29361s2(m35477U() - 1, -1, i);
        if (s2 == null) {
            return null;
        }
        return m29364p2(s2, this.f37370J.get(this.f37371K.f9993c[m35446o0(s2)]));
    }

    /* renamed from: p2 */
    private View m29364p2(View view, C5348c cVar) {
        boolean l = mo29278l();
        int U = (m35477U() - cVar.f9980h) - 1;
        for (int U2 = m35477U() - 2; U2 > U; U2--) {
            View T = m35480T(U2);
            if (!(T == null || T.getVisibility() == 8)) {
                if (!this.f37368H || l) {
                    if (this.f37376P.mo35105d(view) >= this.f37376P.mo35105d(T)) {
                    }
                    view = T;
                } else {
                    if (this.f37376P.mo35102g(view) <= this.f37376P.mo35102g(T)) {
                    }
                    view = T;
                }
            }
        }
        return view;
    }

    /* renamed from: r2 */
    private View m29362r2(int i, int i2, boolean z) {
        int i3;
        if (i2 > i) {
            i3 = 1;
        } else {
            i3 = -1;
        }
        while (i != i2) {
            View T = m35480T(i);
            if (m29429C2(T, z)) {
                return T;
            }
            i += i3;
        }
        return null;
    }

    /* renamed from: s2 */
    private View m29361s2(int i, int i2, int i3) {
        int i4;
        int o0;
        m29372j2();
        m29373i2();
        int m = this.f37376P.mo35096m();
        int i5 = this.f37376P.mo35100i();
        if (i2 > i) {
            i4 = 1;
        } else {
            i4 = -1;
        }
        View view = null;
        View view2 = null;
        while (i != i2) {
            View T = m35480T(i);
            if (T != null && (o0 = m35446o0(T)) >= 0 && o0 < i3) {
                if (((RecyclerView.C3109i) T.getLayoutParams()).m35318e()) {
                    if (view2 == null) {
                        view2 = T;
                    }
                } else if (this.f37376P.mo35102g(T) >= m && this.f37376P.mo35105d(T) <= i5) {
                    return T;
                } else {
                    if (view == null) {
                        view = T;
                    }
                }
            }
            i += i4;
        }
        if (view != null) {
            return view;
        }
        return view2;
    }

    /* renamed from: t2 */
    private int m29360t2(int i, RecyclerView.Recycler recycler, RecyclerView.State state, boolean z) {
        boolean z2;
        int i2;
        int i3;
        if (mo29278l() || !this.f37368H) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z2) {
            int m = i - this.f37376P.mo35096m();
            if (m <= 0) {
                return 0;
            }
            i2 = m29433A2(m, recycler, state);
        } else {
            int i4 = this.f37376P.mo35100i() - i;
            if (i4 <= 0) {
                return 0;
            }
            i2 = -m29433A2(-i4, recycler, state);
        }
        int i5 = i + i2;
        if (!z || (i3 = this.f37376P.mo35100i() - i5) <= 0) {
            return i2;
        }
        this.f37376P.mo35092r(i3);
        return i3 + i2;
    }

    /* renamed from: u2 */
    private int m29359u2(int i, RecyclerView.Recycler recycler, RecyclerView.State state, boolean z) {
        int i2;
        int m;
        if (mo29278l() || !this.f37368H) {
            int m2 = i - this.f37376P.mo35096m();
            if (m2 <= 0) {
                return 0;
            }
            i2 = -m29433A2(m2, recycler, state);
        } else {
            int i3 = this.f37376P.mo35100i() - i;
            if (i3 <= 0) {
                return 0;
            }
            i2 = m29433A2(-i3, recycler, state);
        }
        int i4 = i + i2;
        if (!z || (m = i4 - this.f37376P.mo35096m()) <= 0) {
            return i2;
        }
        this.f37376P.mo35092r(-m);
        return i2 - m;
    }

    /* renamed from: v2 */
    private int m29357v2(View view) {
        return m35468Z(view) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.C3109i) view.getLayoutParams())).bottomMargin;
    }

    /* renamed from: w2 */
    private View m29355w2() {
        return m35480T(0);
    }

    /* renamed from: x2 */
    private int m29353x2(View view) {
        return m35466b0(view) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.C3109i) view.getLayoutParams())).leftMargin;
    }

    /* renamed from: y2 */
    private int m29352y2(View view) {
        return m35463e0(view) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.C3109i) view.getLayoutParams())).rightMargin;
    }

    /* renamed from: z2 */
    private int m29350z2(View view) {
        return m35462f0(view) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.C3109i) view.getLayoutParams())).topMargin;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: B */
    public int mo29432B(RecyclerView.State state) {
        return m29377f2(state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: C */
    public int mo29430C(RecyclerView.State state) {
        return m29375g2(state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: D */
    public int mo29428D(RecyclerView.State state) {
        return m29374h2(state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: E */
    public int mo29426E(RecyclerView.State state) {
        return m29377f2(state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: F */
    public int mo29423F(RecyclerView.State state) {
        return m29375g2(state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: F1 */
    public int mo29422F1(int i, RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (!mo29278l() || this.f37364D == 0) {
            int A2 = m29433A2(i, recycler, state);
            this.f37384X.clear();
            return A2;
        }
        int B2 = m29431B2(i);
        C5340b.m29338l(this.f37375O, B2);
        this.f37377Q.mo35092r(-B2);
        return B2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: G */
    public int mo29420G(RecyclerView.State state) {
        return m29374h2(state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: G1 */
    public void mo29419G1(int i) {
        this.f37379S = i;
        this.f37380T = Integer.MIN_VALUE;
        C5344e eVar = this.f37378R;
        if (eVar != null) {
            eVar.m29290r();
        }
        m35510C1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: H1 */
    public int mo29417H1(int i, RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (mo29278l() || (this.f37364D == 0 && !mo29278l())) {
            int A2 = m29433A2(i, recycler, state);
            this.f37384X.clear();
            return A2;
        }
        int B2 = m29431B2(i);
        C5340b.m29338l(this.f37375O, B2);
        this.f37377Q.mo35092r(-B2);
        return B2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: M0 */
    public void mo29411M0(RecyclerView.Adapter adapter, RecyclerView.Adapter adapter2) {
        m35435s1();
    }

    /* renamed from: M2 */
    public void m29410M2(int i) {
        int i2 = this.f37366F;
        if (i2 != i) {
            if (i2 == 4 || i == 4) {
                m35435s1();
                m29379e2();
            }
            this.f37366F = i;
            m35510C1();
        }
    }

    /* renamed from: N2 */
    public void m29409N2(int i) {
        if (this.f37363C != i) {
            m35435s1();
            this.f37363C = i;
            this.f37376P = null;
            this.f37377Q = null;
            m29379e2();
            m35510C1();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: O */
    public RecyclerView.C3109i mo29408O() {
        return new C5341c(-2, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: O0 */
    public void mo29407O0(RecyclerView recyclerView) {
        super.mo29407O0(recyclerView);
        this.f37386Z = (View) recyclerView.getParent();
    }

    /* renamed from: O2 */
    public void m29405O2(int i) {
        if (i != 2) {
            int i2 = this.f37364D;
            if (i2 != i) {
                if (i2 == 0 || i == 0) {
                    m35435s1();
                    m29379e2();
                }
                this.f37364D = i;
                this.f37376P = null;
                this.f37377Q = null;
                m35510C1();
                return;
            }
            return;
        }
        throw new UnsupportedOperationException("wrap_reverse is not supported in FlexboxLayoutManager");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: P */
    public RecyclerView.C3109i mo29404P(Context context, AttributeSet attributeSet) {
        return new C5341c(context, attributeSet);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: Q0 */
    public void mo29402Q0(RecyclerView recyclerView, RecyclerView.Recycler recycler) {
        super.mo29402Q0(recyclerView, recycler);
        if (this.f37383W) {
            m35432t1(recycler);
            recycler.m35389c();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: R1 */
    public void mo28122R1(RecyclerView recyclerView, RecyclerView.State state, int i) {
        C3136g gVar = new C3136g(recyclerView.getContext());
        gVar.setTargetPosition(i);
        m35481S1(gVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: Z0 */
    public void mo29390Z0(RecyclerView recyclerView, int i, int i2) {
        super.mo29390Z0(recyclerView, i, i2);
        m29399S2(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.SmoothScroller.AbstractC3100a
    /* renamed from: a */
    public PointF mo29388a(int i) {
        View T;
        int i2;
        if (m35477U() == 0 || (T = m35480T(0)) == null) {
            return null;
        }
        if (i < m35446o0(T)) {
            i2 = -1;
        } else {
            i2 = 1;
        }
        if (mo29278l()) {
            return new PointF(0.0f, i2);
        }
        return new PointF(i2, 0.0f);
    }

    @Override // com.google.android.flexbox.AbstractC5346a
    /* renamed from: b */
    public void mo29287b(View view, int i, int i2, C5348c cVar) {
        m35431u(view, f9941c0);
        if (mo29278l()) {
            int l0 = m35453l0(view) + m35441q0(view);
            cVar.f9977e += l0;
            cVar.f9978f += l0;
            return;
        }
        int t0 = m35433t0(view) + m35482S(view);
        cVar.f9977e += t0;
        cVar.f9978f += t0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: b1 */
    public void mo29386b1(RecyclerView recyclerView, int i, int i2, int i3) {
        super.mo29386b1(recyclerView, i, i2, i3);
        m29399S2(Math.min(i, i2));
    }

    @Override // com.google.android.flexbox.AbstractC5346a
    /* renamed from: c */
    public int mo29286c(int i, int i2, int i3) {
        return RecyclerView.LayoutManager.m35475V(m35428v0(), m35426w0(), i2, i3, mo29358v());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: c1 */
    public void mo29384c1(RecyclerView recyclerView, int i, int i2) {
        super.mo29384c1(recyclerView, i, i2);
        m29399S2(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: d1 */
    public void mo29382d1(RecyclerView recyclerView, int i, int i2) {
        super.mo29382d1(recyclerView, i, i2);
        m29399S2(i);
    }

    @Override // com.google.android.flexbox.AbstractC5346a
    /* renamed from: e */
    public View mo29285e(int i) {
        View view = this.f37384X.get(i);
        if (view != null) {
            return view;
        }
        return this.f37372L.m35377o(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: e1 */
    public void mo29380e1(RecyclerView recyclerView, int i, int i2, Object obj) {
        super.mo29380e1(recyclerView, i, i2, obj);
        m29399S2(i);
    }

    @Override // com.google.android.flexbox.AbstractC5346a
    /* renamed from: f */
    public int mo29284f(int i, int i2, int i3) {
        return RecyclerView.LayoutManager.m35475V(m35460h0(), m35458i0(), i2, i3, mo29356w());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: f1 */
    public void mo29378f1(RecyclerView.Recycler recycler, RecyclerView.State state) {
        int i;
        int i2;
        this.f37372L = recycler;
        this.f37373M = state;
        int b = state.m35352b();
        if (b != 0 || !state.m35349e()) {
            m29412L2();
            m29372j2();
            m29373i2();
            this.f37371K.m29213t(b);
            this.f37371K.m29212u(b);
            this.f37371K.m29214s(b);
            this.f37374N.f9970j = false;
            C5344e eVar = this.f37378R;
            if (eVar != null && eVar.m29291p(b)) {
                this.f37379S = this.f37378R.f9971k;
            }
            if (!(this.f37375O.f9949f && this.f37379S == -1 && this.f37378R == null)) {
                this.f37375O.m29330t();
                m29400R2(state, this.f37375O);
                this.f37375O.f9949f = true;
            }
            m35503H(recycler);
            if (this.f37375O.f9948e) {
                m29393W2(this.f37375O, false, true);
            } else {
                m29395V2(this.f37375O, false, true);
            }
            m29398T2(b);
            m29370k2(recycler, state, this.f37374N);
            if (this.f37375O.f9948e) {
                i2 = this.f37374N.f9965e;
                m29395V2(this.f37375O, true, false);
                m29370k2(recycler, state, this.f37374N);
                i = this.f37374N.f9965e;
            } else {
                i = this.f37374N.f9965e;
                m29393W2(this.f37375O, true, false);
                m29370k2(recycler, state, this.f37374N);
                i2 = this.f37374N.f9965e;
            }
            if (m35477U() <= 0) {
                return;
            }
            if (this.f37375O.f9948e) {
                m29359u2(i2 + m29360t2(i, recycler, state, true), recycler, state, false);
            } else {
                m29360t2(i + m29359u2(i2, recycler, state, true), recycler, state, false);
            }
        }
    }

    @Override // com.google.android.flexbox.AbstractC5346a
    /* renamed from: g */
    public int mo29283g(View view) {
        int l0;
        int q0;
        if (mo29278l()) {
            l0 = m35433t0(view);
            q0 = m35482S(view);
        } else {
            l0 = m35453l0(view);
            q0 = m35441q0(view);
        }
        return l0 + q0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: g1 */
    public void mo29376g1(RecyclerView.State state) {
        super.mo29376g1(state);
        this.f37378R = null;
        this.f37379S = -1;
        this.f37380T = Integer.MIN_VALUE;
        this.f9942a0 = -1;
        this.f37375O.m29330t();
        this.f37384X.clear();
    }

    @Override // com.google.android.flexbox.AbstractC5346a
    public int getAlignContent() {
        return 5;
    }

    @Override // com.google.android.flexbox.AbstractC5346a
    public int getAlignItems() {
        return this.f37366F;
    }

    @Override // com.google.android.flexbox.AbstractC5346a
    public int getFlexDirection() {
        return this.f37363C;
    }

    @Override // com.google.android.flexbox.AbstractC5346a
    public int getFlexItemCount() {
        return this.f37373M.m35352b();
    }

    @Override // com.google.android.flexbox.AbstractC5346a
    public List<C5348c> getFlexLinesInternal() {
        return this.f37370J;
    }

    @Override // com.google.android.flexbox.AbstractC5346a
    public int getFlexWrap() {
        return this.f37364D;
    }

    @Override // com.google.android.flexbox.AbstractC5346a
    public int getLargestMainSize() {
        if (this.f37370J.size() == 0) {
            return 0;
        }
        int size = this.f37370J.size();
        int i = Integer.MIN_VALUE;
        for (int i2 = 0; i2 < size; i2++) {
            i = Math.max(i, this.f37370J.get(i2).f9977e);
        }
        return i;
    }

    @Override // com.google.android.flexbox.AbstractC5346a
    public int getMaxLine() {
        return this.f37367G;
    }

    @Override // com.google.android.flexbox.AbstractC5346a
    public int getSumOfCrossSize() {
        int size = this.f37370J.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += this.f37370J.get(i2).f9979g;
        }
        return i;
    }

    @Override // com.google.android.flexbox.AbstractC5346a
    /* renamed from: h */
    public void mo29282h(C5348c cVar) {
    }

    @Override // com.google.android.flexbox.AbstractC5346a
    /* renamed from: i */
    public View mo29281i(int i) {
        return mo29285e(i);
    }

    @Override // com.google.android.flexbox.AbstractC5346a
    /* renamed from: j */
    public void mo29280j(int i, View view) {
        this.f37384X.put(i, view);
    }

    @Override // com.google.android.flexbox.AbstractC5346a
    /* renamed from: k */
    public int mo29279k(View view, int i, int i2) {
        int t0;
        int S;
        if (mo29278l()) {
            t0 = m35453l0(view);
            S = m35441q0(view);
        } else {
            t0 = m35433t0(view);
            S = m35482S(view);
        }
        return t0 + S;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: k1 */
    public void mo29371k1(Parcelable parcelable) {
        if (parcelable instanceof C5344e) {
            this.f37378R = (C5344e) parcelable;
            m35510C1();
        }
    }

    @Override // com.google.android.flexbox.AbstractC5346a
    /* renamed from: l */
    public boolean mo29278l() {
        int i = this.f37363C;
        return i == 0 || i == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: l1 */
    public Parcelable mo29369l1() {
        if (this.f37378R != null) {
            return new C5344e(this.f37378R);
        }
        C5344e eVar = new C5344e();
        if (m35477U() > 0) {
            View w2 = m29355w2();
            eVar.f9971k = m35446o0(w2);
            eVar.f9972l = this.f37376P.mo35102g(w2) - this.f37376P.mo35096m();
        } else {
            eVar.m29290r();
        }
        return eVar;
    }

    /* renamed from: n2 */
    public int m29366n2() {
        View r2 = m29362r2(0, m35477U(), false);
        if (r2 == null) {
            return -1;
        }
        return m35446o0(r2);
    }

    /* renamed from: q2 */
    public int m29363q2() {
        View r2 = m29362r2(m35477U() - 1, -1, false);
        if (r2 == null) {
            return -1;
        }
        return m35446o0(r2);
    }

    @Override // com.google.android.flexbox.AbstractC5346a
    public void setFlexLines(List<C5348c> list) {
        this.f37370J = list;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: v */
    public boolean mo29358v() {
        int i;
        if (this.f37364D == 0) {
            return mo29278l();
        }
        if (mo29278l()) {
            int v0 = m35428v0();
            View view = this.f37386Z;
            if (view != null) {
                i = view.getWidth();
            } else {
                i = 0;
            }
            if (v0 <= i) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: w */
    public boolean mo29356w() {
        int i;
        if (this.f37364D == 0) {
            return !mo29278l();
        }
        if (mo29278l()) {
            return true;
        }
        int h0 = m35460h0();
        View view = this.f37386Z;
        if (view != null) {
            i = view.getHeight();
        } else {
            i = 0;
        }
        if (h0 > i) {
            return true;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: x */
    public boolean mo29354x(RecyclerView.C3109i iVar) {
        return iVar instanceof C5341c;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: z0 */
    public boolean mo29351z0() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.android.flexbox.FlexboxLayoutManager$e */
    /* loaded from: classes5.dex */
    public static class C5344e implements Parcelable {
        public static final Parcelable.Creator<C5344e> CREATOR = new C5345a();

        /* renamed from: k */
        private int f9971k;

        /* renamed from: l */
        private int f9972l;

        /* renamed from: com.google.android.flexbox.FlexboxLayoutManager$e$a */
        /* loaded from: classes5.dex */
        class C5345a implements Parcelable.Creator<C5344e> {
            C5345a() {
            }

            /* renamed from: a */
            public C5344e createFromParcel(Parcel parcel) {
                return new C5344e(parcel);
            }

            /* renamed from: b */
            public C5344e[] newArray(int i) {
                return new C5344e[i];
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: p */
        public boolean m29291p(int i) {
            int i2 = this.f9971k;
            return i2 >= 0 && i2 < i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: r */
        public void m29290r() {
            this.f9971k = -1;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public String toString() {
            return "SavedState{mAnchorPosition=" + this.f9971k + ", mAnchorOffset=" + this.f9972l + '}';
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f9971k);
            parcel.writeInt(this.f9972l);
        }

        C5344e() {
        }

        private C5344e(Parcel parcel) {
            this.f9971k = parcel.readInt();
            this.f9972l = parcel.readInt();
        }

        private C5344e(C5344e eVar) {
            this.f9971k = eVar.f9971k;
            this.f9972l = eVar.f9972l;
        }
    }

    public FlexboxLayoutManager(Context context, int i, int i2) {
        this.f37367G = -1;
        this.f37370J = new ArrayList();
        this.f37371K = new C5349d(this);
        this.f37375O = new C5340b();
        this.f37379S = -1;
        this.f37380T = Integer.MIN_VALUE;
        this.f37381U = Integer.MIN_VALUE;
        this.f37382V = Integer.MIN_VALUE;
        this.f37384X = new SparseArray<>();
        this.f9942a0 = -1;
        this.f9943b0 = new C5349d.C5351b();
        m29409N2(i);
        m29405O2(i2);
        m29410M2(4);
        this.f37385Y = context;
    }

    /* renamed from: com.google.android.flexbox.FlexboxLayoutManager$c */
    /* loaded from: classes5.dex */
    public static class C5341c extends RecyclerView.C3109i implements AbstractC5347b {
        public static final Parcelable.Creator<C5341c> CREATOR = new C5342a();

        /* renamed from: o */
        private float f9952o;

        /* renamed from: p */
        private float f9953p;

        /* renamed from: q */
        private int f9954q;

        /* renamed from: r */
        private float f9955r;

        /* renamed from: s */
        private int f9956s;

        /* renamed from: t */
        private int f9957t;

        /* renamed from: u */
        private int f9958u;

        /* renamed from: v */
        private int f9959v;

        /* renamed from: w */
        private boolean f9960w;

        /* renamed from: com.google.android.flexbox.FlexboxLayoutManager$c$a */
        /* loaded from: classes5.dex */
        class C5342a implements Parcelable.Creator<C5341c> {
            C5342a() {
            }

            /* renamed from: a */
            public C5341c createFromParcel(Parcel parcel) {
                return new C5341c(parcel);
            }

            /* renamed from: b */
            public C5341c[] newArray(int i) {
                return new C5341c[i];
            }
        }

        public C5341c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f9952o = 0.0f;
            this.f9953p = 1.0f;
            this.f9954q = -1;
            this.f9955r = -1.0f;
            this.f9958u = 16777215;
            this.f9959v = 16777215;
        }

        @Override // com.google.android.flexbox.AbstractC5347b
        /* renamed from: D */
        public void mo29277D(int i) {
            this.f9956s = i;
        }

        @Override // com.google.android.flexbox.AbstractC5347b
        /* renamed from: E */
        public int mo29276E() {
            return ((ViewGroup.MarginLayoutParams) this).bottomMargin;
        }

        @Override // com.google.android.flexbox.AbstractC5347b
        /* renamed from: F */
        public int mo29275F() {
            return ((ViewGroup.MarginLayoutParams) this).leftMargin;
        }

        @Override // com.google.android.flexbox.AbstractC5347b
        /* renamed from: K */
        public int mo29274K() {
            return ((ViewGroup.MarginLayoutParams) this).rightMargin;
        }

        @Override // com.google.android.flexbox.AbstractC5347b
        /* renamed from: L */
        public int mo29273L() {
            return this.f9957t;
        }

        @Override // com.google.android.flexbox.AbstractC5347b
        /* renamed from: N */
        public int mo29272N() {
            return this.f9959v;
        }

        @Override // com.google.android.flexbox.AbstractC5347b
        /* renamed from: c */
        public int mo29271c() {
            return this.f9954q;
        }

        @Override // com.google.android.flexbox.AbstractC5347b
        /* renamed from: d */
        public float mo29270d() {
            return this.f9953p;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // com.google.android.flexbox.AbstractC5347b
        public int getHeight() {
            return ((ViewGroup.MarginLayoutParams) this).height;
        }

        @Override // com.google.android.flexbox.AbstractC5347b
        public int getOrder() {
            return 1;
        }

        @Override // com.google.android.flexbox.AbstractC5347b
        public int getWidth() {
            return ((ViewGroup.MarginLayoutParams) this).width;
        }

        @Override // com.google.android.flexbox.AbstractC5347b
        /* renamed from: h */
        public int mo29269h() {
            return this.f9956s;
        }

        @Override // com.google.android.flexbox.AbstractC5347b
        /* renamed from: k */
        public int mo29268k() {
            return ((ViewGroup.MarginLayoutParams) this).topMargin;
        }

        @Override // com.google.android.flexbox.AbstractC5347b
        /* renamed from: l */
        public void mo29267l(int i) {
            this.f9957t = i;
        }

        @Override // com.google.android.flexbox.AbstractC5347b
        /* renamed from: m */
        public float mo29266m() {
            return this.f9952o;
        }

        @Override // com.google.android.flexbox.AbstractC5347b
        /* renamed from: q */
        public float mo29265q() {
            return this.f9955r;
        }

        @Override // com.google.android.flexbox.AbstractC5347b
        /* renamed from: s */
        public boolean mo29264s() {
            return this.f9960w;
        }

        @Override // com.google.android.flexbox.AbstractC5347b
        /* renamed from: v */
        public int mo29263v() {
            return this.f9958u;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeFloat(this.f9952o);
            parcel.writeFloat(this.f9953p);
            parcel.writeInt(this.f9954q);
            parcel.writeFloat(this.f9955r);
            parcel.writeInt(this.f9956s);
            parcel.writeInt(this.f9957t);
            parcel.writeInt(this.f9958u);
            parcel.writeInt(this.f9959v);
            parcel.writeByte(this.f9960w ? (byte) 1 : (byte) 0);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).bottomMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).leftMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).rightMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).topMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).height);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).width);
        }

        public C5341c(int i, int i2) {
            super(i, i2);
            this.f9952o = 0.0f;
            this.f9953p = 1.0f;
            this.f9954q = -1;
            this.f9955r = -1.0f;
            this.f9958u = 16777215;
            this.f9959v = 16777215;
        }

        protected C5341c(Parcel parcel) {
            super(-2, -2);
            this.f9952o = 0.0f;
            this.f9953p = 1.0f;
            this.f9954q = -1;
            this.f9955r = -1.0f;
            this.f9958u = 16777215;
            this.f9959v = 16777215;
            this.f9952o = parcel.readFloat();
            this.f9953p = parcel.readFloat();
            this.f9954q = parcel.readInt();
            this.f9955r = parcel.readFloat();
            this.f9956s = parcel.readInt();
            this.f9957t = parcel.readInt();
            this.f9958u = parcel.readInt();
            this.f9959v = parcel.readInt();
            this.f9960w = parcel.readByte() != 0;
            ((ViewGroup.MarginLayoutParams) this).bottomMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).leftMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).rightMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).topMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).height = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).width = parcel.readInt();
        }
    }

    public FlexboxLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.f37367G = -1;
        this.f37370J = new ArrayList();
        this.f37371K = new C5349d(this);
        this.f37375O = new C5340b();
        this.f37379S = -1;
        this.f37380T = Integer.MIN_VALUE;
        this.f37381U = Integer.MIN_VALUE;
        this.f37382V = Integer.MIN_VALUE;
        this.f37384X = new SparseArray<>();
        this.f9942a0 = -1;
        this.f9943b0 = new C5349d.C5351b();
        RecyclerView.LayoutManager.C3097d p0 = RecyclerView.LayoutManager.m35443p0(context, attributeSet, i, i2);
        int i3 = p0.f4690a;
        if (i3 != 0) {
            if (i3 == 1) {
                if (p0.f4692c) {
                    m29409N2(3);
                } else {
                    m29409N2(2);
                }
            }
        } else if (p0.f4692c) {
            m29409N2(1);
        } else {
            m29409N2(0);
        }
        m29405O2(1);
        m29410M2(4);
        this.f37385Y = context;
    }
}
