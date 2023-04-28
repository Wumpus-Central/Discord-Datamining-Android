package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.react.uimanager.ViewDefaults;
import java.util.List;

/* loaded from: classes.dex */
public class LinearLayoutManager extends RecyclerView.LayoutManager implements ItemTouchHelper.AbstractC3088e, RecyclerView.SmoothScroller.AbstractC3100a {

    /* renamed from: C */
    int f35728C;

    /* renamed from: D */
    private C3091c f35729D;

    /* renamed from: E */
    AbstractC3140j f35730E;

    /* renamed from: F */
    private boolean f35731F;

    /* renamed from: G */
    private boolean f35732G;

    /* renamed from: H */
    boolean f35733H;

    /* renamed from: I */
    private boolean f35734I;

    /* renamed from: J */
    private boolean f35735J;

    /* renamed from: K */
    int f35736K;

    /* renamed from: L */
    int f35737L;

    /* renamed from: M */
    private boolean f35738M;

    /* renamed from: N */
    C3092d f35739N;

    /* renamed from: O */
    final C3089a f35740O;

    /* renamed from: P */
    private final C3090b f35741P;

    /* renamed from: Q */
    private int f35742Q;

    /* renamed from: R */
    private int[] f35743R;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.recyclerview.widget.LinearLayoutManager$a */
    /* loaded from: classes.dex */
    public static class C3089a {

        /* renamed from: a */
        AbstractC3140j f4639a;

        /* renamed from: b */
        int f4640b;

        /* renamed from: c */
        int f4641c;

        /* renamed from: d */
        boolean f4642d;

        /* renamed from: e */
        boolean f4643e;

        C3089a() {
            m35539e();
        }

        /* renamed from: a */
        void m35543a() {
            int i;
            if (this.f4642d) {
                i = this.f4639a.mo35100i();
            } else {
                i = this.f4639a.mo35096m();
            }
            this.f4641c = i;
        }

        /* renamed from: b */
        public void m35542b(View view, int i) {
            if (this.f4642d) {
                this.f4641c = this.f4639a.mo35105d(view) + this.f4639a.m35107o();
            } else {
                this.f4641c = this.f4639a.mo35102g(view);
            }
            this.f4640b = i;
        }

        /* renamed from: c */
        public void m35541c(View view, int i) {
            int o = this.f4639a.m35107o();
            if (o >= 0) {
                m35542b(view, i);
                return;
            }
            this.f4640b = i;
            if (this.f4642d) {
                int i2 = (this.f4639a.mo35100i() - o) - this.f4639a.mo35105d(view);
                this.f4641c = this.f4639a.mo35100i() - i2;
                if (i2 > 0) {
                    int e = this.f4641c - this.f4639a.mo35104e(view);
                    int m = this.f4639a.mo35096m();
                    int min = e - (m + Math.min(this.f4639a.mo35102g(view) - m, 0));
                    if (min < 0) {
                        this.f4641c += Math.min(i2, -min);
                        return;
                    }
                    return;
                }
                return;
            }
            int g = this.f4639a.mo35102g(view);
            int m2 = g - this.f4639a.mo35096m();
            this.f4641c = g;
            if (m2 > 0) {
                int i3 = (this.f4639a.mo35100i() - Math.min(0, (this.f4639a.mo35100i() - o) - this.f4639a.mo35105d(view))) - (g + this.f4639a.mo35104e(view));
                if (i3 < 0) {
                    this.f4641c -= Math.min(m2, -i3);
                }
            }
        }

        /* renamed from: d */
        boolean m35540d(View view, RecyclerView.State state) {
            RecyclerView.C3109i iVar = (RecyclerView.C3109i) view.getLayoutParams();
            if (iVar.m35318e() || iVar.m35320a() < 0 || iVar.m35320a() >= state.m35352b()) {
                return false;
            }
            return true;
        }

        /* renamed from: e */
        void m35539e() {
            this.f4640b = -1;
            this.f4641c = Integer.MIN_VALUE;
            this.f4642d = false;
            this.f4643e = false;
        }

        public String toString() {
            return "AnchorInfo{mPosition=" + this.f4640b + ", mCoordinate=" + this.f4641c + ", mLayoutFromEnd=" + this.f4642d + ", mValid=" + this.f4643e + '}';
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: androidx.recyclerview.widget.LinearLayoutManager$b */
    /* loaded from: classes.dex */
    public static class C3090b {

        /* renamed from: a */
        public int f4644a;

        /* renamed from: b */
        public boolean f4645b;

        /* renamed from: c */
        public boolean f4646c;

        /* renamed from: d */
        public boolean f4647d;

        protected C3090b() {
        }

        /* renamed from: a */
        void m35538a() {
            this.f4644a = 0;
            this.f4645b = false;
            this.f4646c = false;
            this.f4647d = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.recyclerview.widget.LinearLayoutManager$c */
    /* loaded from: classes.dex */
    public static class C3091c {

        /* renamed from: b */
        int f4649b;

        /* renamed from: c */
        int f4650c;

        /* renamed from: d */
        int f4651d;

        /* renamed from: e */
        int f4652e;

        /* renamed from: f */
        int f4653f;

        /* renamed from: g */
        int f4654g;

        /* renamed from: k */
        int f4658k;

        /* renamed from: m */
        boolean f4660m;

        /* renamed from: a */
        boolean f4648a = true;

        /* renamed from: h */
        int f4655h = 0;

        /* renamed from: i */
        int f4656i = 0;

        /* renamed from: j */
        boolean f4657j = false;

        /* renamed from: l */
        List<RecyclerView.ViewHolder> f4659l = null;

        C3091c() {
        }

        /* renamed from: e */
        private View m35533e() {
            int size = this.f4659l.size();
            for (int i = 0; i < size; i++) {
                View view = this.f4659l.get(i).itemView;
                RecyclerView.C3109i iVar = (RecyclerView.C3109i) view.getLayoutParams();
                if (!iVar.m35318e() && this.f4651d == iVar.m35320a()) {
                    m35536b(view);
                    return view;
                }
            }
            return null;
        }

        /* renamed from: a */
        public void m35537a() {
            m35536b(null);
        }

        /* renamed from: b */
        public void m35536b(View view) {
            View f = m35532f(view);
            if (f == null) {
                this.f4651d = -1;
            } else {
                this.f4651d = ((RecyclerView.C3109i) f.getLayoutParams()).m35320a();
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: c */
        public boolean m35535c(RecyclerView.State state) {
            int i = this.f4651d;
            return i >= 0 && i < state.m35352b();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: d */
        public View m35534d(RecyclerView.Recycler recycler) {
            if (this.f4659l != null) {
                return m35533e();
            }
            View o = recycler.m35377o(this.f4651d);
            this.f4651d += this.f4652e;
            return o;
        }

        /* renamed from: f */
        public View m35532f(View view) {
            int a;
            int size = this.f4659l.size();
            View view2 = null;
            int i = ViewDefaults.NUMBER_OF_LINES;
            for (int i2 = 0; i2 < size; i2++) {
                View view3 = this.f4659l.get(i2).itemView;
                RecyclerView.C3109i iVar = (RecyclerView.C3109i) view3.getLayoutParams();
                if (view3 != view && !iVar.m35318e() && (a = (iVar.m35320a() - this.f4651d) * this.f4652e) >= 0 && a < i) {
                    view2 = view3;
                    if (a == 0) {
                        break;
                    }
                    i = a;
                }
            }
            return view2;
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    /* renamed from: androidx.recyclerview.widget.LinearLayoutManager$d */
    /* loaded from: classes.dex */
    public static class C3092d implements Parcelable {
        public static final Parcelable.Creator<C3092d> CREATOR = new C3093a();

        /* renamed from: k */
        int f4661k;

        /* renamed from: l */
        int f4662l;

        /* renamed from: m */
        boolean f4663m;

        /* renamed from: androidx.recyclerview.widget.LinearLayoutManager$d$a */
        /* loaded from: classes.dex */
        class C3093a implements Parcelable.Creator<C3092d> {
            C3093a() {
            }

            /* renamed from: a */
            public C3092d createFromParcel(Parcel parcel) {
                return new C3092d(parcel);
            }

            /* renamed from: b */
            public C3092d[] newArray(int i) {
                return new C3092d[i];
            }
        }

        public C3092d() {
        }

        /* renamed from: a */
        boolean m35531a() {
            return this.f4661k >= 0;
        }

        /* renamed from: b */
        void m35530b() {
            this.f4661k = -1;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f4661k);
            parcel.writeInt(this.f4662l);
            parcel.writeInt(this.f4663m ? 1 : 0);
        }

        C3092d(Parcel parcel) {
            this.f4661k = parcel.readInt();
            this.f4662l = parcel.readInt();
            this.f4663m = parcel.readInt() != 1 ? false : true;
        }

        public C3092d(C3092d dVar) {
            this.f4661k = dVar.f4661k;
            this.f4662l = dVar.f4662l;
            this.f4663m = dVar.f4663m;
        }
    }

    public LinearLayoutManager(Context context) {
        this(context, 1, false);
    }

    /* renamed from: B2 */
    private void m35595B2(RecyclerView.Recycler recycler, RecyclerView.State state, int i, int i2) {
        boolean z;
        if (state.m35347g() && m35477U() != 0 && !state.m35349e() && mo35286U1()) {
            List<RecyclerView.ViewHolder> k = recycler.m35381k();
            int size = k.size();
            int o0 = m35446o0(m35480T(0));
            int i3 = 0;
            int i4 = 0;
            for (int i5 = 0; i5 < size; i5++) {
                RecyclerView.ViewHolder viewHolder = k.get(i5);
                if (!viewHolder.isRemoved()) {
                    boolean z2 = true;
                    if (viewHolder.getLayoutPosition() < o0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z != this.f35733H) {
                        z2 = true;
                    }
                    if (z2) {
                        i3 += this.f35730E.mo35104e(viewHolder.itemView);
                    } else {
                        i4 += this.f35730E.mo35104e(viewHolder.itemView);
                    }
                }
            }
            this.f35729D.f4659l = k;
            if (i3 > 0) {
                m35576U2(m35446o0(m35549u2()), i);
                C3091c cVar = this.f35729D;
                cVar.f4655h = i3;
                cVar.f4650c = 0;
                cVar.m35537a();
                m35566d2(recycler, this.f35729D, state, false);
            }
            if (i4 > 0) {
                m35578S2(m35446o0(m35550t2()), i2);
                C3091c cVar2 = this.f35729D;
                cVar2.f4655h = i4;
                cVar2.f4650c = 0;
                cVar2.m35537a();
                m35566d2(recycler, this.f35729D, state, false);
            }
            this.f35729D.f4659l = null;
        }
    }

    /* renamed from: D2 */
    private void m35593D2(RecyclerView.Recycler recycler, C3091c cVar) {
        if (cVar.f4648a && !cVar.f4660m) {
            int i = cVar.f4654g;
            int i2 = cVar.f4656i;
            if (cVar.f4653f == -1) {
                m35591F2(recycler, i, i2);
            } else {
                m35590G2(recycler, i, i2);
            }
        }
    }

    /* renamed from: E2 */
    private void m35592E2(RecyclerView.Recycler recycler, int i, int i2) {
        if (i != i2) {
            if (i2 > i) {
                for (int i3 = i2 - 1; i3 >= i; i3--) {
                    m35425w1(i3, recycler);
                }
                return;
            }
            while (i > i2) {
                m35425w1(i, recycler);
                i--;
            }
        }
    }

    /* renamed from: F2 */
    private void m35591F2(RecyclerView.Recycler recycler, int i, int i2) {
        int U = m35477U();
        if (i >= 0) {
            int h = (this.f35730E.mo35101h() - i) + i2;
            if (this.f35733H) {
                for (int i3 = 0; i3 < U; i3++) {
                    View T = m35480T(i3);
                    if (this.f35730E.mo35102g(T) < h || this.f35730E.mo35093q(T) < h) {
                        m35592E2(recycler, 0, i3);
                        return;
                    }
                }
                return;
            }
            int i4 = U - 1;
            for (int i5 = i4; i5 >= 0; i5--) {
                View T2 = m35480T(i5);
                if (this.f35730E.mo35102g(T2) < h || this.f35730E.mo35093q(T2) < h) {
                    m35592E2(recycler, i4, i5);
                    return;
                }
            }
        }
    }

    /* renamed from: G2 */
    private void m35590G2(RecyclerView.Recycler recycler, int i, int i2) {
        if (i >= 0) {
            int i3 = i - i2;
            int U = m35477U();
            if (this.f35733H) {
                int i4 = U - 1;
                for (int i5 = i4; i5 >= 0; i5--) {
                    View T = m35480T(i5);
                    if (this.f35730E.mo35105d(T) > i3 || this.f35730E.mo35094p(T) > i3) {
                        m35592E2(recycler, i4, i5);
                        return;
                    }
                }
                return;
            }
            for (int i6 = 0; i6 < U; i6++) {
                View T2 = m35480T(i6);
                if (this.f35730E.mo35105d(T2) > i3 || this.f35730E.mo35094p(T2) > i3) {
                    m35592E2(recycler, 0, i6);
                    return;
                }
            }
        }
    }

    /* renamed from: I2 */
    private void m35588I2() {
        if (this.f35728C == 1 || !m35545y2()) {
            this.f35733H = this.f35732G;
        } else {
            this.f35733H = !this.f35732G;
        }
    }

    /* renamed from: O2 */
    private boolean m35582O2(RecyclerView.Recycler recycler, RecyclerView.State state, C3089a aVar) {
        View q2;
        boolean z;
        boolean z2 = false;
        if (m35477U() == 0) {
            return false;
        }
        View g0 = m35461g0();
        if (g0 == null || !aVar.m35540d(g0, state)) {
            boolean z3 = this.f35731F;
            boolean z4 = this.f35734I;
            if (z3 != z4 || (q2 = mo35553q2(recycler, state, aVar.f4642d, z4)) == null) {
                return false;
            }
            aVar.m35542b(q2, m35446o0(q2));
            if (!state.m35349e() && mo35286U1()) {
                int g = this.f35730E.mo35102g(q2);
                int d = this.f35730E.mo35105d(q2);
                int m = this.f35730E.mo35096m();
                int i = this.f35730E.mo35100i();
                if (d > m || g >= m) {
                    z = false;
                } else {
                    z = true;
                }
                if (g >= i && d > i) {
                    z2 = true;
                }
                if (z || z2) {
                    if (aVar.f4642d) {
                        m = i;
                    }
                    aVar.f4641c = m;
                }
            }
            return true;
        }
        aVar.m35541c(g0, m35446o0(g0));
        return true;
    }

    /* renamed from: P2 */
    private boolean m35581P2(RecyclerView.State state, C3089a aVar) {
        int i;
        boolean z;
        int i2;
        boolean z2 = false;
        if (!state.m35349e() && (i = this.f35736K) != -1) {
            if (i < 0 || i >= state.m35352b()) {
                this.f35736K = -1;
                this.f35737L = Integer.MIN_VALUE;
            } else {
                aVar.f4640b = this.f35736K;
                C3092d dVar = this.f35739N;
                if (dVar != null && dVar.m35531a()) {
                    boolean z3 = this.f35739N.f4663m;
                    aVar.f4642d = z3;
                    if (z3) {
                        aVar.f4641c = this.f35730E.mo35100i() - this.f35739N.f4662l;
                    } else {
                        aVar.f4641c = this.f35730E.mo35096m() + this.f35739N.f4662l;
                    }
                    return true;
                } else if (this.f35737L == Integer.MIN_VALUE) {
                    View N = mo35490N(this.f35736K);
                    if (N == null) {
                        if (m35477U() > 0) {
                            if (this.f35736K < m35446o0(m35480T(0))) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (z == this.f35733H) {
                                z2 = true;
                            }
                            aVar.f4642d = z2;
                        }
                        aVar.m35543a();
                    } else if (this.f35730E.mo35104e(N) > this.f35730E.mo35095n()) {
                        aVar.m35543a();
                        return true;
                    } else if (this.f35730E.mo35102g(N) - this.f35730E.mo35096m() < 0) {
                        aVar.f4641c = this.f35730E.mo35096m();
                        aVar.f4642d = false;
                        return true;
                    } else if (this.f35730E.mo35100i() - this.f35730E.mo35105d(N) < 0) {
                        aVar.f4641c = this.f35730E.mo35100i();
                        aVar.f4642d = true;
                        return true;
                    } else {
                        if (aVar.f4642d) {
                            i2 = this.f35730E.mo35105d(N) + this.f35730E.m35107o();
                        } else {
                            i2 = this.f35730E.mo35102g(N);
                        }
                        aVar.f4641c = i2;
                    }
                    return true;
                } else {
                    boolean z4 = this.f35733H;
                    aVar.f4642d = z4;
                    if (z4) {
                        aVar.f4641c = this.f35730E.mo35100i() - this.f35737L;
                    } else {
                        aVar.f4641c = this.f35730E.mo35096m() + this.f35737L;
                    }
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: Q2 */
    private void m35580Q2(RecyclerView.Recycler recycler, RecyclerView.State state, C3089a aVar) {
        int i;
        if (!m35581P2(state, aVar) && !m35582O2(recycler, state, aVar)) {
            aVar.m35543a();
            if (this.f35734I) {
                i = state.m35352b() - 1;
            } else {
                i = 0;
            }
            aVar.f4640b = i;
        }
    }

    /* renamed from: R2 */
    private void m35579R2(int i, int i2, boolean z, RecyclerView.State state) {
        int i3;
        int i4;
        this.f35729D.f4660m = m35589H2();
        this.f35729D.f4653f = i;
        int[] iArr = this.f35743R;
        boolean z2 = false;
        iArr[0] = 0;
        int i5 = 1;
        iArr[1] = 0;
        mo28184V1(state, iArr);
        int max = Math.max(0, this.f35743R[0]);
        int max2 = Math.max(0, this.f35743R[1]);
        if (i == 1) {
            z2 = true;
        }
        C3091c cVar = this.f35729D;
        if (z2) {
            i3 = max2;
        } else {
            i3 = max;
        }
        cVar.f4655h = i3;
        if (!z2) {
            max = max2;
        }
        cVar.f4656i = max;
        if (z2) {
            cVar.f4655h = i3 + this.f35730E.mo35099j();
            View t2 = m35550t2();
            C3091c cVar2 = this.f35729D;
            if (this.f35733H) {
                i5 = -1;
            }
            cVar2.f4652e = i5;
            int o0 = m35446o0(t2);
            C3091c cVar3 = this.f35729D;
            cVar2.f4651d = o0 + cVar3.f4652e;
            cVar3.f4649b = this.f35730E.mo35105d(t2);
            i4 = this.f35730E.mo35105d(t2) - this.f35730E.mo35100i();
        } else {
            View u2 = m35549u2();
            this.f35729D.f4655h += this.f35730E.mo35096m();
            C3091c cVar4 = this.f35729D;
            if (!this.f35733H) {
                i5 = -1;
            }
            cVar4.f4652e = i5;
            int o02 = m35446o0(u2);
            C3091c cVar5 = this.f35729D;
            cVar4.f4651d = o02 + cVar5.f4652e;
            cVar5.f4649b = this.f35730E.mo35102g(u2);
            i4 = (-this.f35730E.mo35102g(u2)) + this.f35730E.mo35096m();
        }
        C3091c cVar6 = this.f35729D;
        cVar6.f4650c = i2;
        if (z) {
            cVar6.f4650c = i2 - i4;
        }
        cVar6.f4654g = i4;
    }

    /* renamed from: S2 */
    private void m35578S2(int i, int i2) {
        int i3;
        this.f35729D.f4650c = this.f35730E.mo35100i() - i2;
        C3091c cVar = this.f35729D;
        if (this.f35733H) {
            i3 = -1;
        } else {
            i3 = 1;
        }
        cVar.f4652e = i3;
        cVar.f4651d = i;
        cVar.f4653f = 1;
        cVar.f4649b = i2;
        cVar.f4654g = Integer.MIN_VALUE;
    }

    /* renamed from: T2 */
    private void m35577T2(C3089a aVar) {
        m35578S2(aVar.f4640b, aVar.f4641c);
    }

    /* renamed from: U2 */
    private void m35576U2(int i, int i2) {
        int i3;
        this.f35729D.f4650c = i2 - this.f35730E.mo35096m();
        C3091c cVar = this.f35729D;
        cVar.f4651d = i;
        if (this.f35733H) {
            i3 = 1;
        } else {
            i3 = -1;
        }
        cVar.f4652e = i3;
        cVar.f4653f = -1;
        cVar.f4649b = i2;
        cVar.f4654g = Integer.MIN_VALUE;
    }

    /* renamed from: V2 */
    private void m35575V2(C3089a aVar) {
        m35576U2(aVar.f4640b, aVar.f4641c);
    }

    /* renamed from: X1 */
    private int m35573X1(RecyclerView.State state) {
        if (m35477U() == 0) {
            return 0;
        }
        m35568c2();
        return C3145l.m35084a(state, this.f35730E, m35562h2(!this.f35735J, true), m35563g2(!this.f35735J, true), this, this.f35735J);
    }

    /* renamed from: Y1 */
    private int m35572Y1(RecyclerView.State state) {
        if (m35477U() == 0) {
            return 0;
        }
        m35568c2();
        return C3145l.m35083b(state, this.f35730E, m35562h2(!this.f35735J, true), m35563g2(!this.f35735J, true), this, this.f35735J, this.f35733H);
    }

    /* renamed from: Z1 */
    private int m35571Z1(RecyclerView.State state) {
        if (m35477U() == 0) {
            return 0;
        }
        m35568c2();
        return C3145l.m35082c(state, this.f35730E, m35562h2(!this.f35735J, true), m35563g2(!this.f35735J, true), this, this.f35735J);
    }

    /* renamed from: f2 */
    private View m35564f2() {
        return m35557m2(0, m35477U());
    }

    /* renamed from: k2 */
    private View m35559k2() {
        return m35557m2(m35477U() - 1, -1);
    }

    /* renamed from: o2 */
    private View m35555o2() {
        if (this.f35733H) {
            return m35564f2();
        }
        return m35559k2();
    }

    /* renamed from: p2 */
    private View m35554p2() {
        if (this.f35733H) {
            return m35559k2();
        }
        return m35564f2();
    }

    /* renamed from: r2 */
    private int m35552r2(int i, RecyclerView.Recycler recycler, RecyclerView.State state, boolean z) {
        int i2;
        int i3 = this.f35730E.mo35100i() - i;
        if (i3 <= 0) {
            return 0;
        }
        int i4 = -m35587J2(-i3, recycler, state);
        int i5 = i + i4;
        if (!z || (i2 = this.f35730E.mo35100i() - i5) <= 0) {
            return i4;
        }
        this.f35730E.mo35092r(i2);
        return i2 + i4;
    }

    /* renamed from: s2 */
    private int m35551s2(int i, RecyclerView.Recycler recycler, RecyclerView.State state, boolean z) {
        int m;
        int m2 = i - this.f35730E.mo35096m();
        if (m2 <= 0) {
            return 0;
        }
        int i2 = -m35587J2(m2, recycler, state);
        int i3 = i + i2;
        if (!z || (m = i3 - this.f35730E.mo35096m()) <= 0) {
            return i2;
        }
        this.f35730E.mo35092r(-m);
        return i2 - m;
    }

    /* renamed from: t2 */
    private View m35550t2() {
        return m35480T(this.f35733H ? 0 : m35477U() - 1);
    }

    /* renamed from: u2 */
    private View m35549u2() {
        return m35480T(this.f35733H ? m35477U() - 1 : 0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: A */
    public void mo35515A(int i, RecyclerView.LayoutManager.AbstractC3096c cVar) {
        boolean z;
        int i2;
        C3092d dVar = this.f35739N;
        int i3 = -1;
        if (dVar == null || !dVar.m35531a()) {
            m35588I2();
            z = this.f35733H;
            i2 = this.f35736K;
            if (i2 == -1) {
                i2 = z ? i - 1 : 0;
            }
        } else {
            C3092d dVar2 = this.f35739N;
            z = dVar2.f4663m;
            i2 = dVar2.f4661k;
        }
        if (!z) {
            i3 = 1;
        }
        for (int i4 = 0; i4 < this.f35742Q && i2 >= 0 && i2 < i; i4++) {
            cVar.mo35418a(i2, 0);
            i2 += i3;
        }
    }

    /* renamed from: A2 */
    void mo35596A2(RecyclerView.Recycler recycler, RecyclerView.State state, C3091c cVar, C3090b bVar) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        boolean z;
        boolean z2;
        View d = cVar.m35534d(recycler);
        if (d == null) {
            bVar.f4645b = true;
            return;
        }
        RecyclerView.C3109i iVar = (RecyclerView.C3109i) d.getLayoutParams();
        if (cVar.f4659l == null) {
            boolean z3 = this.f35733H;
            if (cVar.f4653f == -1) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z3 == z2) {
                m35447o(d);
            } else {
                m35444p(d, 0);
            }
        } else {
            boolean z4 = this.f35733H;
            if (cVar.f4653f == -1) {
                z = true;
            } else {
                z = false;
            }
            if (z4 == z) {
                m35452m(d);
            } else {
                m35450n(d, 0);
            }
        }
        m35500I0(d, 0, 0);
        bVar.f4644a = this.f35730E.mo35104e(d);
        if (this.f35728C == 1) {
            if (m35545y2()) {
                i5 = m35428v0() - getPaddingRight();
                i4 = i5 - this.f35730E.mo35103f(d);
            } else {
                i4 = getPaddingLeft();
                i5 = this.f35730E.mo35103f(d) + i4;
            }
            if (cVar.f4653f == -1) {
                int i6 = cVar.f4649b;
                i = i6;
                i2 = i5;
                i3 = i6 - bVar.f4644a;
            } else {
                int i7 = cVar.f4649b;
                i3 = i7;
                i2 = i5;
                i = bVar.f4644a + i7;
            }
        } else {
            int paddingTop = getPaddingTop();
            int f = this.f35730E.mo35103f(d) + paddingTop;
            if (cVar.f4653f == -1) {
                int i8 = cVar.f4649b;
                i2 = i8;
                i3 = paddingTop;
                i = f;
                i4 = i8 - bVar.f4644a;
            } else {
                int i9 = cVar.f4649b;
                i3 = paddingTop;
                i2 = bVar.f4644a + i9;
                i = f;
                i4 = i9;
            }
        }
        m35502H0(d, i4, i3, i2, i);
        if (iVar.m35318e() || iVar.m35319b()) {
            bVar.f4646c = true;
        }
        bVar.f4647d = d.hasFocusable();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: B */
    public int mo29432B(RecyclerView.State state) {
        return m35573X1(state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: C */
    public int mo29430C(RecyclerView.State state) {
        return m35572Y1(state);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: C2 */
    public void mo35594C2(RecyclerView.Recycler recycler, RecyclerView.State state, C3089a aVar, int i) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: D */
    public int mo29428D(RecyclerView.State state) {
        return m35571Z1(state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: E */
    public int mo29426E(RecyclerView.State state) {
        return m35573X1(state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: F */
    public int mo29423F(RecyclerView.State state) {
        return m35572Y1(state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: F1 */
    public int mo29422F1(int i, RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (this.f35728C == 1) {
            return 0;
        }
        return m35587J2(i, recycler, state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: G */
    public int mo29420G(RecyclerView.State state) {
        return m35571Z1(state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: G1 */
    public void mo29419G1(int i) {
        this.f35736K = i;
        this.f35737L = Integer.MIN_VALUE;
        C3092d dVar = this.f35739N;
        if (dVar != null) {
            dVar.m35530b();
        }
        m35510C1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: H1 */
    public int mo29417H1(int i, RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (this.f35728C == 0) {
            return 0;
        }
        return m35587J2(i, recycler, state);
    }

    /* renamed from: H2 */
    boolean m35589H2() {
        if (this.f35730E.mo35098k() == 0 && this.f35730E.mo35101h() == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: J2 */
    int m35587J2(int i, RecyclerView.Recycler recycler, RecyclerView.State state) {
        int i2;
        if (m35477U() == 0 || i == 0) {
            return 0;
        }
        m35568c2();
        this.f35729D.f4648a = true;
        if (i > 0) {
            i2 = 1;
        } else {
            i2 = -1;
        }
        int abs = Math.abs(i);
        m35579R2(i2, abs, true, state);
        C3091c cVar = this.f35729D;
        int d2 = cVar.f4654g + m35566d2(recycler, cVar, state, false);
        if (d2 < 0) {
            return 0;
        }
        if (abs > d2) {
            i = i2 * d2;
        }
        this.f35730E.mo35092r(-i);
        this.f35729D.f4658k = i;
        return i;
    }

    /* renamed from: K2 */
    public void m35586K2(int i, int i2) {
        this.f35736K = i;
        this.f35737L = i2;
        C3092d dVar = this.f35739N;
        if (dVar != null) {
            dVar.m35530b();
        }
        m35510C1();
    }

    /* renamed from: L2 */
    public void m35585L2(int i) {
        if (i == 0 || i == 1) {
            mo35254r(null);
            if (i != this.f35728C || this.f35730E == null) {
                AbstractC3140j b = AbstractC3140j.m35109b(this, i);
                this.f35730E = b;
                this.f35740O.f4639a = b;
                this.f35728C = i;
                m35510C1();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("invalid orientation:" + i);
    }

    /* renamed from: M2 */
    public void m35584M2(boolean z) {
        mo35254r(null);
        if (z != this.f35732G) {
            this.f35732G = z;
            m35510C1();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: N */
    public View mo35490N(int i) {
        int U = m35477U();
        if (U == 0) {
            return null;
        }
        int o0 = i - m35446o0(m35480T(0));
        if (o0 >= 0 && o0 < U) {
            View T = m35480T(o0);
            if (m35446o0(T) == i) {
                return T;
            }
        }
        return super.mo35490N(i);
    }

    /* renamed from: N2 */
    public void mo35583N2(boolean z) {
        mo35254r(null);
        if (this.f35734I != z) {
            this.f35734I = z;
            m35510C1();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: O */
    public RecyclerView.C3109i mo29408O() {
        return new RecyclerView.C3109i(-2, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: P1 */
    boolean mo35485P1() {
        if (m35458i0() == 1073741824 || m35426w0() == 1073741824 || !m35424x0()) {
            return false;
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: Q0 */
    public void mo29402Q0(RecyclerView recyclerView, RecyclerView.Recycler recycler) {
        super.mo29402Q0(recyclerView, recycler);
        if (this.f35738M) {
            m35432t1(recycler);
            recycler.m35389c();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: R0 */
    public View mo35291R0(View view, int i, RecyclerView.Recycler recycler, RecyclerView.State state) {
        int a2;
        View view2;
        View view3;
        m35588I2();
        if (m35477U() == 0 || (a2 = m35570a2(i)) == Integer.MIN_VALUE) {
            return null;
        }
        m35568c2();
        m35579R2(a2, (int) (this.f35730E.mo35095n() * 0.33333334f), false, state);
        C3091c cVar = this.f35729D;
        cVar.f4654g = Integer.MIN_VALUE;
        cVar.f4648a = false;
        m35566d2(recycler, cVar, state, true);
        if (a2 == -1) {
            view2 = m35554p2();
        } else {
            view2 = m35555o2();
        }
        if (a2 == -1) {
            view3 = m35549u2();
        } else {
            view3 = m35550t2();
        }
        if (!view3.hasFocusable()) {
            return view2;
        }
        if (view2 == null) {
            return null;
        }
        return view3;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: R1 */
    public void mo28122R1(RecyclerView recyclerView, RecyclerView.State state, int i) {
        C3136g gVar = new C3136g(recyclerView.getContext());
        gVar.setTargetPosition(i);
        m35481S1(gVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: S0 */
    public void mo35289S0(AccessibilityEvent accessibilityEvent) {
        super.mo35289S0(accessibilityEvent);
        if (m35477U() > 0) {
            accessibilityEvent.setFromIndex(m35561i2());
            accessibilityEvent.setToIndex(m35558l2());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: U1 */
    public boolean mo35286U1() {
        return this.f35739N == null && this.f35731F == this.f35734I;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: V1 */
    public void mo28184V1(RecyclerView.State state, int[] iArr) {
        int i;
        int v2 = m35548v2(state);
        if (this.f35729D.f4653f == -1) {
            i = 0;
        } else {
            i = v2;
            v2 = 0;
        }
        iArr[0] = v2;
        iArr[1] = i;
    }

    /* renamed from: W1 */
    void mo35574W1(RecyclerView.State state, C3091c cVar, RecyclerView.LayoutManager.AbstractC3096c cVar2) {
        int i = cVar.f4651d;
        if (i >= 0 && i < state.m35352b()) {
            cVar2.mo35418a(i, Math.max(0, cVar.f4654g));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.SmoothScroller.AbstractC3100a
    /* renamed from: a */
    public PointF mo29388a(int i) {
        if (m35477U() == 0) {
            return null;
        }
        boolean z = false;
        int i2 = 1;
        if (i < m35446o0(m35480T(0))) {
            z = true;
        }
        if (z != this.f35733H) {
            i2 = -1;
        }
        if (this.f35728C == 0) {
            return new PointF(i2, 0.0f);
        }
        return new PointF(0.0f, i2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a2 */
    public int m35570a2(int i) {
        if (i != 1) {
            if (i != 2) {
                if (i != 17) {
                    if (i != 33) {
                        if (i != 66) {
                            if (i == 130 && this.f35728C == 1) {
                                return 1;
                            }
                            return Integer.MIN_VALUE;
                        } else if (this.f35728C == 0) {
                            return 1;
                        } else {
                            return Integer.MIN_VALUE;
                        }
                    } else if (this.f35728C == 1) {
                        return -1;
                    } else {
                        return Integer.MIN_VALUE;
                    }
                } else if (this.f35728C == 0) {
                    return -1;
                } else {
                    return Integer.MIN_VALUE;
                }
            } else if (this.f35728C != 1 && m35545y2()) {
                return -1;
            } else {
                return 1;
            }
        } else if (this.f35728C != 1 && m35545y2()) {
            return 1;
        } else {
            return -1;
        }
    }

    /* renamed from: b2 */
    C3091c m35569b2() {
        return new C3091c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c2 */
    public void m35568c2() {
        if (this.f35729D == null) {
            this.f35729D = m35569b2();
        }
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.AbstractC3088e
    /* renamed from: d */
    public void mo35567d(View view, View view2, int i, int i2) {
        boolean z;
        mo35254r("Cannot drop a view during a scroll or layout calculation");
        m35568c2();
        m35588I2();
        int o0 = m35446o0(view);
        int o02 = m35446o0(view2);
        if (o0 < o02) {
            z = true;
        } else {
            z = true;
        }
        if (this.f35733H) {
            if (z) {
                m35586K2(o02, this.f35730E.mo35100i() - (this.f35730E.mo35102g(view2) + this.f35730E.mo35104e(view)));
            } else {
                m35586K2(o02, this.f35730E.mo35100i() - this.f35730E.mo35105d(view2));
            }
        } else if (z) {
            m35586K2(o02, this.f35730E.mo35102g(view2));
        } else {
            m35586K2(o02, this.f35730E.mo35105d(view2) - this.f35730E.mo35104e(view));
        }
    }

    /* renamed from: d2 */
    int m35566d2(RecyclerView.Recycler recycler, C3091c cVar, RecyclerView.State state, boolean z) {
        int i = cVar.f4650c;
        int i2 = cVar.f4654g;
        if (i2 != Integer.MIN_VALUE) {
            if (i < 0) {
                cVar.f4654g = i2 + i;
            }
            m35593D2(recycler, cVar);
        }
        int i3 = cVar.f4650c + cVar.f4655h;
        C3090b bVar = this.f35741P;
        while (true) {
            if ((!cVar.f4660m && i3 <= 0) || !cVar.m35535c(state)) {
                break;
            }
            bVar.m35538a();
            mo35596A2(recycler, state, cVar, bVar);
            if (!bVar.f4645b) {
                cVar.f4649b += bVar.f4644a * cVar.f4653f;
                if (!bVar.f4646c || cVar.f4659l != null || !state.m35349e()) {
                    int i4 = cVar.f4650c;
                    int i5 = bVar.f4644a;
                    cVar.f4650c = i4 - i5;
                    i3 -= i5;
                }
                int i6 = cVar.f4654g;
                if (i6 != Integer.MIN_VALUE) {
                    int i7 = i6 + bVar.f4644a;
                    cVar.f4654g = i7;
                    int i8 = cVar.f4650c;
                    if (i8 < 0) {
                        cVar.f4654g = i7 + i8;
                    }
                    m35593D2(recycler, cVar);
                }
                if (z && bVar.f4647d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i - cVar.f4650c;
    }

    /* renamed from: e2 */
    public int m35565e2() {
        View n2 = m35556n2(0, m35477U(), true, false);
        if (n2 == null) {
            return -1;
        }
        return m35446o0(n2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: f1 */
    public void mo29378f1(RecyclerView.Recycler recycler, RecyclerView.State state) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        View N;
        int i8;
        int i9;
        int i10 = -1;
        if (!(this.f35739N == null && this.f35736K == -1) && state.m35352b() == 0) {
            m35432t1(recycler);
            return;
        }
        C3092d dVar = this.f35739N;
        if (dVar != null && dVar.m35531a()) {
            this.f35736K = this.f35739N.f4661k;
        }
        m35568c2();
        this.f35729D.f4648a = false;
        m35588I2();
        View g0 = m35461g0();
        C3089a aVar = this.f35740O;
        if (!aVar.f4643e || this.f35736K != -1 || this.f35739N != null) {
            aVar.m35539e();
            C3089a aVar2 = this.f35740O;
            aVar2.f4642d = this.f35733H ^ this.f35734I;
            m35580Q2(recycler, state, aVar2);
            this.f35740O.f4643e = true;
        } else if (g0 != null && (this.f35730E.mo35102g(g0) >= this.f35730E.mo35100i() || this.f35730E.mo35105d(g0) <= this.f35730E.mo35096m())) {
            this.f35740O.m35541c(g0, m35446o0(g0));
        }
        C3091c cVar = this.f35729D;
        if (cVar.f4658k >= 0) {
            i = 1;
        } else {
            i = -1;
        }
        cVar.f4653f = i;
        int[] iArr = this.f35743R;
        iArr[0] = 0;
        iArr[1] = 0;
        mo28184V1(state, iArr);
        int max = Math.max(0, this.f35743R[0]) + this.f35730E.mo35096m();
        int max2 = Math.max(0, this.f35743R[1]) + this.f35730E.mo35099j();
        if (!(!state.m35349e() || (i7 = this.f35736K) == -1 || this.f35737L == Integer.MIN_VALUE || (N = mo35490N(i7)) == null)) {
            if (this.f35733H) {
                i8 = this.f35730E.mo35100i() - this.f35730E.mo35105d(N);
                i9 = this.f35737L;
            } else {
                i9 = this.f35730E.mo35102g(N) - this.f35730E.mo35096m();
                i8 = this.f35737L;
            }
            int i11 = i8 - i9;
            if (i11 > 0) {
                max += i11;
            } else {
                max2 -= i11;
            }
        }
        C3089a aVar3 = this.f35740O;
        if (!aVar3.f4642d ? !this.f35733H : this.f35733H) {
            i10 = 1;
        }
        mo35594C2(recycler, state, aVar3, i10);
        m35503H(recycler);
        this.f35729D.f4660m = m35589H2();
        this.f35729D.f4657j = state.m35349e();
        this.f35729D.f4656i = 0;
        C3089a aVar4 = this.f35740O;
        if (aVar4.f4642d) {
            m35575V2(aVar4);
            C3091c cVar2 = this.f35729D;
            cVar2.f4655h = max;
            m35566d2(recycler, cVar2, state, false);
            C3091c cVar3 = this.f35729D;
            i3 = cVar3.f4649b;
            int i12 = cVar3.f4651d;
            int i13 = cVar3.f4650c;
            if (i13 > 0) {
                max2 += i13;
            }
            m35577T2(this.f35740O);
            C3091c cVar4 = this.f35729D;
            cVar4.f4655h = max2;
            cVar4.f4651d += cVar4.f4652e;
            m35566d2(recycler, cVar4, state, false);
            C3091c cVar5 = this.f35729D;
            i2 = cVar5.f4649b;
            int i14 = cVar5.f4650c;
            if (i14 > 0) {
                m35576U2(i12, i3);
                C3091c cVar6 = this.f35729D;
                cVar6.f4655h = i14;
                m35566d2(recycler, cVar6, state, false);
                i3 = this.f35729D.f4649b;
            }
        } else {
            m35577T2(aVar4);
            C3091c cVar7 = this.f35729D;
            cVar7.f4655h = max2;
            m35566d2(recycler, cVar7, state, false);
            C3091c cVar8 = this.f35729D;
            i2 = cVar8.f4649b;
            int i15 = cVar8.f4651d;
            int i16 = cVar8.f4650c;
            if (i16 > 0) {
                max += i16;
            }
            m35575V2(this.f35740O);
            C3091c cVar9 = this.f35729D;
            cVar9.f4655h = max;
            cVar9.f4651d += cVar9.f4652e;
            m35566d2(recycler, cVar9, state, false);
            C3091c cVar10 = this.f35729D;
            i3 = cVar10.f4649b;
            int i17 = cVar10.f4650c;
            if (i17 > 0) {
                m35578S2(i15, i2);
                C3091c cVar11 = this.f35729D;
                cVar11.f4655h = i17;
                m35566d2(recycler, cVar11, state, false);
                i2 = this.f35729D.f4649b;
            }
        }
        if (m35477U() > 0) {
            if (this.f35733H ^ this.f35734I) {
                int r2 = m35552r2(i2, recycler, state, true);
                i5 = i3 + r2;
                i4 = i2 + r2;
                i6 = m35551s2(i5, recycler, state, false);
            } else {
                int s2 = m35551s2(i3, recycler, state, true);
                i5 = i3 + s2;
                i4 = i2 + s2;
                i6 = m35552r2(i4, recycler, state, false);
            }
            i3 = i5 + i6;
            i2 = i4 + i6;
        }
        m35595B2(recycler, state, i3, i2);
        if (!state.m35349e()) {
            this.f35730E.m35106s();
        } else {
            this.f35740O.m35539e();
        }
        this.f35731F = this.f35734I;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: g1 */
    public void mo29376g1(RecyclerView.State state) {
        super.mo29376g1(state);
        this.f35739N = null;
        this.f35736K = -1;
        this.f35737L = Integer.MIN_VALUE;
        this.f35740O.m35539e();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g2 */
    public View m35563g2(boolean z, boolean z2) {
        if (this.f35733H) {
            return m35556n2(0, m35477U(), z, z2);
        }
        return m35556n2(m35477U() - 1, -1, z, z2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h2 */
    public View m35562h2(boolean z, boolean z2) {
        if (this.f35733H) {
            return m35556n2(m35477U() - 1, -1, z, z2);
        }
        return m35556n2(0, m35477U(), z, z2);
    }

    /* renamed from: i2 */
    public int m35561i2() {
        View n2 = m35556n2(0, m35477U(), false, true);
        if (n2 == null) {
            return -1;
        }
        return m35446o0(n2);
    }

    /* renamed from: j2 */
    public int m35560j2() {
        View n2 = m35556n2(m35477U() - 1, -1, true, false);
        if (n2 == null) {
            return -1;
        }
        return m35446o0(n2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: k1 */
    public void mo29371k1(Parcelable parcelable) {
        if (parcelable instanceof C3092d) {
            C3092d dVar = (C3092d) parcelable;
            this.f35739N = dVar;
            if (this.f35736K != -1) {
                dVar.m35530b();
            }
            m35510C1();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: l1 */
    public Parcelable mo29369l1() {
        if (this.f35739N != null) {
            return new C3092d(this.f35739N);
        }
        C3092d dVar = new C3092d();
        if (m35477U() > 0) {
            m35568c2();
            boolean z = this.f35731F ^ this.f35733H;
            dVar.f4663m = z;
            if (z) {
                View t2 = m35550t2();
                dVar.f4662l = this.f35730E.mo35100i() - this.f35730E.mo35105d(t2);
                dVar.f4661k = m35446o0(t2);
            } else {
                View u2 = m35549u2();
                dVar.f4661k = m35446o0(u2);
                dVar.f4662l = this.f35730E.mo35102g(u2) - this.f35730E.mo35096m();
            }
        } else {
            dVar.m35530b();
        }
        return dVar;
    }

    /* renamed from: l2 */
    public int m35558l2() {
        View n2 = m35556n2(m35477U() - 1, -1, false, true);
        if (n2 == null) {
            return -1;
        }
        return m35446o0(n2);
    }

    /* renamed from: m2 */
    View m35557m2(int i, int i2) {
        char c;
        int i3;
        int i4;
        m35568c2();
        if (i2 > i) {
            c = 1;
        } else if (i2 < i) {
            c = 65535;
        } else {
            c = 0;
        }
        if (c == 0) {
            return m35480T(i);
        }
        if (this.f35730E.mo35102g(m35480T(i)) < this.f35730E.mo35096m()) {
            i4 = 16644;
            i3 = 16388;
        } else {
            i4 = 4161;
            i3 = 4097;
        }
        if (this.f35728C == 0) {
            return this.f4676o.m35072a(i, i2, i4, i3);
        }
        return this.f4677p.m35072a(i, i2, i4, i3);
    }

    /* renamed from: n2 */
    View m35556n2(int i, int i2, boolean z, boolean z2) {
        int i3;
        m35568c2();
        int i4 = 320;
        if (z) {
            i3 = 24579;
        } else {
            i3 = 320;
        }
        if (!z2) {
            i4 = 0;
        }
        if (this.f35728C == 0) {
            return this.f4676o.m35072a(i, i2, i3, i4);
        }
        return this.f4677p.m35072a(i, i2, i3, i4);
    }

    /* renamed from: q2 */
    View mo35553q2(RecyclerView.Recycler recycler, RecyclerView.State state, boolean z, boolean z2) {
        int i;
        int i2;
        int i3;
        boolean z3;
        boolean z4;
        m35568c2();
        int U = m35477U();
        if (z2) {
            i3 = m35477U() - 1;
            i2 = -1;
            i = -1;
        } else {
            i2 = U;
            i3 = 0;
            i = 1;
        }
        int b = state.m35352b();
        int m = this.f35730E.mo35096m();
        int i4 = this.f35730E.mo35100i();
        View view = null;
        View view2 = null;
        View view3 = null;
        while (i3 != i2) {
            View T = m35480T(i3);
            int o0 = m35446o0(T);
            int g = this.f35730E.mo35102g(T);
            int d = this.f35730E.mo35105d(T);
            if (o0 >= 0 && o0 < b) {
                if (!((RecyclerView.C3109i) T.getLayoutParams()).m35318e()) {
                    if (d > m || g >= m) {
                        z3 = false;
                    } else {
                        z3 = true;
                    }
                    if (g < i4 || d <= i4) {
                        z4 = false;
                    } else {
                        z4 = true;
                    }
                    if (!z3 && !z4) {
                        return T;
                    }
                    if (z) {
                        if (!z4) {
                            if (view != null) {
                            }
                            view = T;
                        }
                        view2 = T;
                    } else {
                        if (!z3) {
                            if (view != null) {
                            }
                            view = T;
                        }
                        view2 = T;
                    }
                } else if (view3 == null) {
                    view3 = T;
                }
            }
            i3 += i;
        }
        if (view != null) {
            return view;
        }
        if (view2 != null) {
            return view2;
        }
        return view3;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: r */
    public void mo35254r(String str) {
        if (this.f35739N == null) {
            super.mo35254r(str);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: v */
    public boolean mo29358v() {
        return this.f35728C == 0;
    }

    @Deprecated
    /* renamed from: v2 */
    protected int m35548v2(RecyclerView.State state) {
        if (state.m35350d()) {
            return this.f35730E.mo35095n();
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: w */
    public boolean mo29356w() {
        return this.f35728C == 1;
    }

    /* renamed from: w2 */
    public int m35547w2() {
        return this.f35728C;
    }

    /* renamed from: x2 */
    public boolean m35546x2() {
        return this.f35732G;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: y2 */
    public boolean m35545y2() {
        return m35454k0() == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: z */
    public void mo35245z(int i, int i2, RecyclerView.State state, RecyclerView.LayoutManager.AbstractC3096c cVar) {
        int i3;
        if (this.f35728C != 0) {
            i = i2;
        }
        if (m35477U() != 0 && i != 0) {
            m35568c2();
            if (i > 0) {
                i3 = 1;
            } else {
                i3 = -1;
            }
            m35579R2(i3, Math.abs(i), true, state);
            mo35574W1(state, this.f35729D, cVar);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: z0 */
    public boolean mo29351z0() {
        return true;
    }

    /* renamed from: z2 */
    public boolean m35544z2() {
        return this.f35735J;
    }

    public LinearLayoutManager(Context context, int i, boolean z) {
        this.f35728C = 1;
        this.f35732G = false;
        this.f35733H = false;
        this.f35734I = false;
        this.f35735J = true;
        this.f35736K = -1;
        this.f35737L = Integer.MIN_VALUE;
        this.f35739N = null;
        this.f35740O = new C3089a();
        this.f35741P = new C3090b();
        this.f35742Q = 2;
        this.f35743R = new int[2];
        m35585L2(i);
        m35584M2(z);
    }

    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.f35728C = 1;
        this.f35732G = false;
        this.f35733H = false;
        this.f35734I = false;
        this.f35735J = true;
        this.f35736K = -1;
        this.f35737L = Integer.MIN_VALUE;
        this.f35739N = null;
        this.f35740O = new C3089a();
        this.f35741P = new C3090b();
        this.f35742Q = 2;
        this.f35743R = new int[2];
        RecyclerView.LayoutManager.C3097d p0 = RecyclerView.LayoutManager.m35443p0(context, attributeSet, i, i2);
        m35585L2(p0.f4690a);
        m35584M2(p0.f4692c);
        mo35583N2(p0.f4693d);
    }
}
