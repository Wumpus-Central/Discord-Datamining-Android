package p153i8;

import android.os.Looper;
import com.reactnativecommunity.webview.RNCWebViewManager;
import p079e7.C6722k;
import p079e7.C6725l;
import p081e9.AbstractC6765b;
import p081e9.AbstractC6774h;
import p119g9.C7510a;
import p119g9.C7557q0;
import p119g9.C7562u;
import p119g9.C7570y;
import p152i7.C8223h;
import p193k7.AbstractC9805n;
import p193k7.AbstractC9815v;
import p193k7.AbstractC9818x;
import p193k7.C9798l;
import p228m7.AbstractC10500b0;
import p228m7.C10498a0;

/* renamed from: i8.n0 */
/* loaded from: classes7.dex */
public class C8274n0 implements AbstractC10500b0 {

    /* renamed from: A */
    private boolean f38596A;

    /* renamed from: B */
    private C6722k f38597B;

    /* renamed from: C */
    private C6722k f38598C;

    /* renamed from: D */
    private C6722k f38599D;

    /* renamed from: E */
    private int f38600E;

    /* renamed from: F */
    private boolean f38601F;

    /* renamed from: G */
    private boolean f38602G;

    /* renamed from: H */
    private long f38603H;

    /* renamed from: I */
    private boolean f38604I;

    /* renamed from: a */
    private final C8271m0 f17988a;

    /* renamed from: c */
    private final AbstractC9818x f17990c;

    /* renamed from: d */
    private final AbstractC9815v.C9816a f17991d;

    /* renamed from: e */
    private final Looper f17992e;

    /* renamed from: f */
    private AbstractC8276b f17993f;

    /* renamed from: g */
    private C6722k f17994g;

    /* renamed from: h */
    private AbstractC9805n f17995h;

    /* renamed from: q */
    private int f18004q;

    /* renamed from: r */
    private int f18005r;

    /* renamed from: s */
    private int f18006s;

    /* renamed from: t */
    private int f18007t;

    /* renamed from: x */
    private boolean f18011x;

    /* renamed from: b */
    private final C8275a f17989b = new C8275a();

    /* renamed from: i */
    private int f17996i = RNCWebViewManager.COMMAND_CLEAR_FORM_DATA;

    /* renamed from: j */
    private int[] f17997j = new int[RNCWebViewManager.COMMAND_CLEAR_FORM_DATA];

    /* renamed from: k */
    private long[] f17998k = new long[RNCWebViewManager.COMMAND_CLEAR_FORM_DATA];

    /* renamed from: n */
    private long[] f18001n = new long[RNCWebViewManager.COMMAND_CLEAR_FORM_DATA];

    /* renamed from: m */
    private int[] f18000m = new int[RNCWebViewManager.COMMAND_CLEAR_FORM_DATA];

    /* renamed from: l */
    private int[] f17999l = new int[RNCWebViewManager.COMMAND_CLEAR_FORM_DATA];

    /* renamed from: o */
    private AbstractC10500b0.C10501a[] f18002o = new AbstractC10500b0.C10501a[RNCWebViewManager.COMMAND_CLEAR_FORM_DATA];

    /* renamed from: p */
    private C6722k[] f18003p = new C6722k[RNCWebViewManager.COMMAND_CLEAR_FORM_DATA];

    /* renamed from: u */
    private long f18008u = Long.MIN_VALUE;

    /* renamed from: v */
    private long f18009v = Long.MIN_VALUE;

    /* renamed from: w */
    private long f18010w = Long.MIN_VALUE;

    /* renamed from: z */
    private boolean f18013z = true;

    /* renamed from: y */
    private boolean f18012y = true;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i8.n0$a */
    /* loaded from: classes7.dex */
    public static final class C8275a {

        /* renamed from: a */
        public int f18014a;

        /* renamed from: b */
        public long f18015b;

        /* renamed from: c */
        public AbstractC10500b0.C10501a f18016c;

        C8275a() {
        }
    }

    /* renamed from: i8.n0$b */
    /* loaded from: classes7.dex */
    public interface AbstractC8276b {
        /* renamed from: a */
        void mo12423a(C6722k kVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public C8274n0(AbstractC6765b bVar, Looper looper, AbstractC9818x xVar, AbstractC9815v.C9816a aVar) {
        this.f17992e = looper;
        this.f17990c = xVar;
        this.f17991d = aVar;
        this.f17988a = new C8271m0(bVar);
    }

    /* renamed from: A */
    private long m20107A(int i) {
        long j = Long.MIN_VALUE;
        if (i == 0) {
            return Long.MIN_VALUE;
        }
        int C = m20105C(i - 1);
        for (int i2 = 0; i2 < i; i2++) {
            j = Math.max(j, this.f18001n[C]);
            if ((this.f18000m[C] & 1) != 0) {
                break;
            }
            C--;
            if (C == -1) {
                C = this.f17996i - 1;
            }
        }
        return j;
    }

    /* renamed from: C */
    private int m20105C(int i) {
        int i2 = this.f18006s + i;
        int i3 = this.f17996i;
        if (i2 < i3) {
            return i2;
        }
        return i2 - i3;
    }

    /* renamed from: G */
    private boolean m20101G() {
        return this.f18007t != this.f18004q;
    }

    /* renamed from: K */
    private boolean m20097K(int i) {
        AbstractC9805n nVar = this.f17995h;
        if (nVar == null || nVar.getState() == 4 || ((this.f18000m[i] & 1073741824) == 0 && this.f17995h.mo15315b())) {
            return true;
        }
        return false;
    }

    /* renamed from: M */
    private void m20095M(C6722k kVar, C6725l lVar) {
        boolean z;
        C9798l lVar2;
        C6722k kVar2;
        C6722k kVar3 = this.f17994g;
        if (kVar3 == null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            lVar2 = null;
        } else {
            lVar2 = kVar3.f14332y;
        }
        this.f17994g = kVar;
        C9798l lVar3 = kVar.f14332y;
        AbstractC9818x xVar = this.f17990c;
        if (xVar != null) {
            kVar2 = kVar.m24530b(xVar.mo15277a(kVar));
        } else {
            kVar2 = kVar;
        }
        lVar.f14361b = kVar2;
        lVar.f14360a = this.f17995h;
        if (this.f17990c != null) {
            if (z || !C7557q0.m22159c(lVar2, lVar3)) {
                AbstractC9805n nVar = this.f17995h;
                AbstractC9805n b = this.f17990c.mo15276b((Looper) C7510a.m22367e(this.f17992e), this.f17991d, kVar);
                this.f17995h = b;
                lVar.f14360a = b;
                if (nVar != null) {
                    nVar.mo15312e(this.f17991d);
                }
            }
        }
    }

    /* renamed from: N */
    private synchronized int m20094N(C6725l lVar, C8223h hVar, boolean z, boolean z2, C8275a aVar) {
        hVar.f17799n = false;
        if (!m20101G()) {
            if (!z2 && !this.f18011x) {
                C6722k kVar = this.f38598C;
                if (kVar == null || (!z && kVar == this.f17994g)) {
                    return -3;
                }
                m20095M((C6722k) C7510a.m22367e(kVar), lVar);
                return -5;
            }
            hVar.m20297m(4);
            return -4;
        }
        int C = m20105C(this.f18007t);
        if (!z && this.f18003p[C] == this.f17994g) {
            if (!m20097K(C)) {
                hVar.f17799n = true;
                return -3;
            }
            hVar.m20297m(this.f18000m[C]);
            long j = this.f18001n[C];
            hVar.f17800o = j;
            if (j < this.f18008u) {
                hVar.m20304e(Integer.MIN_VALUE);
            }
            aVar.f18014a = this.f17999l[C];
            aVar.f18015b = this.f17998k[C];
            aVar.f18016c = this.f18002o[C];
            return -4;
        }
        m20095M(this.f18003p[C], lVar);
        return -5;
    }

    /* renamed from: S */
    private void m20089S() {
        AbstractC9805n nVar = this.f17995h;
        if (nVar != null) {
            nVar.mo15312e(this.f17991d);
            this.f17995h = null;
            this.f17994g = null;
        }
    }

    /* renamed from: V */
    private synchronized void m20086V() {
        this.f18007t = 0;
        this.f17988a.m20114n();
    }

    /* renamed from: a0 */
    private synchronized boolean m20081a0(C6722k kVar) {
        this.f18013z = false;
        if (C7557q0.m22159c(kVar, this.f38598C)) {
            return false;
        }
        if (C7557q0.m22159c(kVar, this.f38599D)) {
            this.f38598C = this.f38599D;
        } else {
            this.f38598C = kVar;
        }
        C6722k kVar2 = this.f38598C;
        this.f38601F = C7562u.m22087a(kVar2.f14329v, kVar2.f14326s);
        this.f38602G = false;
        return true;
    }

    /* renamed from: g */
    private synchronized boolean m20076g(long j) {
        boolean z = true;
        if (this.f18004q == 0) {
            if (j <= this.f18009v) {
                z = false;
            }
            return z;
        } else if (m20058z() >= j) {
            return false;
        } else {
            m20064s(this.f18005r + m20074i(j));
            return true;
        }
    }

    /* renamed from: h */
    private synchronized void m20075h(long j, int i, long j2, int i2, AbstractC10500b0.C10501a aVar) {
        boolean z;
        int C;
        boolean z2;
        int i3 = this.f18004q;
        if (i3 > 0) {
            if (this.f17998k[m20105C(i3 - 1)] + this.f17999l[C] <= j2) {
                z2 = true;
            } else {
                z2 = false;
            }
            C7510a.m22371a(z2);
        }
        if ((536870912 & i) != 0) {
            z = true;
        } else {
            z = false;
        }
        this.f18011x = z;
        this.f18010w = Math.max(this.f18010w, j);
        int C2 = m20105C(this.f18004q);
        this.f18001n[C2] = j;
        long[] jArr = this.f17998k;
        jArr[C2] = j2;
        this.f17999l[C2] = i2;
        this.f18000m[C2] = i;
        this.f18002o[C2] = aVar;
        C6722k[] kVarArr = this.f18003p;
        C6722k kVar = this.f38598C;
        kVarArr[C2] = kVar;
        this.f17997j[C2] = this.f38600E;
        this.f38599D = kVar;
        int i4 = this.f18004q + 1;
        this.f18004q = i4;
        int i5 = this.f17996i;
        if (i4 == i5) {
            int i6 = i5 + RNCWebViewManager.COMMAND_CLEAR_FORM_DATA;
            int[] iArr = new int[i6];
            long[] jArr2 = new long[i6];
            long[] jArr3 = new long[i6];
            int[] iArr2 = new int[i6];
            int[] iArr3 = new int[i6];
            AbstractC10500b0.C10501a[] aVarArr = new AbstractC10500b0.C10501a[i6];
            C6722k[] kVarArr2 = new C6722k[i6];
            int i7 = this.f18006s;
            int i8 = i5 - i7;
            System.arraycopy(jArr, i7, jArr2, 0, i8);
            System.arraycopy(this.f18001n, this.f18006s, jArr3, 0, i8);
            System.arraycopy(this.f18000m, this.f18006s, iArr2, 0, i8);
            System.arraycopy(this.f17999l, this.f18006s, iArr3, 0, i8);
            System.arraycopy(this.f18002o, this.f18006s, aVarArr, 0, i8);
            System.arraycopy(this.f18003p, this.f18006s, kVarArr2, 0, i8);
            System.arraycopy(this.f17997j, this.f18006s, iArr, 0, i8);
            int i9 = this.f18006s;
            System.arraycopy(this.f17998k, 0, jArr2, i8, i9);
            System.arraycopy(this.f18001n, 0, jArr3, i8, i9);
            System.arraycopy(this.f18000m, 0, iArr2, i8, i9);
            System.arraycopy(this.f17999l, 0, iArr3, i8, i9);
            System.arraycopy(this.f18002o, 0, aVarArr, i8, i9);
            System.arraycopy(this.f18003p, 0, kVarArr2, i8, i9);
            System.arraycopy(this.f17997j, 0, iArr, i8, i9);
            this.f17998k = jArr2;
            this.f18001n = jArr3;
            this.f18000m = iArr2;
            this.f17999l = iArr3;
            this.f18002o = aVarArr;
            this.f18003p = kVarArr2;
            this.f17997j = iArr;
            this.f18006s = 0;
            this.f17996i = i6;
        }
    }

    /* renamed from: i */
    private int m20074i(long j) {
        int i = this.f18004q;
        int C = m20105C(i - 1);
        while (i > this.f18007t && this.f18001n[C] >= j) {
            i--;
            C--;
            if (C == -1) {
                C = this.f17996i - 1;
            }
        }
        return i;
    }

    /* renamed from: j */
    public static C8274n0 m20073j(AbstractC6765b bVar, Looper looper, AbstractC9818x xVar, AbstractC9815v.C9816a aVar) {
        return new C8274n0(bVar, (Looper) C7510a.m22367e(looper), (AbstractC9818x) C7510a.m22367e(xVar), (AbstractC9815v.C9816a) C7510a.m22367e(aVar));
    }

    /* renamed from: k */
    public static C8274n0 m20072k(AbstractC6765b bVar) {
        return new C8274n0(bVar, null, null, null);
    }

    /* renamed from: l */
    private synchronized long m20071l(long j, boolean z, boolean z2) {
        int i;
        int i2 = this.f18004q;
        if (i2 != 0) {
            long[] jArr = this.f18001n;
            int i3 = this.f18006s;
            if (j >= jArr[i3]) {
                if (z2 && (i = this.f18007t) != i2) {
                    i2 = i + 1;
                }
                int u = m20062u(i3, i2, j, z);
                if (u == -1) {
                    return -1L;
                }
                return m20068o(u);
            }
        }
        return -1L;
    }

    /* renamed from: m */
    private synchronized long m20070m() {
        int i = this.f18004q;
        if (i == 0) {
            return -1L;
        }
        return m20068o(i);
    }

    /* renamed from: o */
    private long m20068o(int i) {
        int i2;
        this.f18009v = Math.max(this.f18009v, m20107A(i));
        int i3 = this.f18004q - i;
        this.f18004q = i3;
        this.f18005r += i;
        int i4 = this.f18006s + i;
        this.f18006s = i4;
        int i5 = this.f17996i;
        if (i4 >= i5) {
            this.f18006s = i4 - i5;
        }
        int i6 = this.f18007t - i;
        this.f18007t = i6;
        if (i6 < 0) {
            this.f18007t = 0;
        }
        if (i3 != 0) {
            return this.f17998k[this.f18006s];
        }
        int i7 = this.f18006s;
        if (i7 != 0) {
            i5 = i7;
        }
        return this.f17998k[i5 - 1] + this.f17999l[i2];
    }

    /* renamed from: s */
    private long m20064s(int i) {
        boolean z;
        int C;
        int F = m20102F() - i;
        boolean z2 = false;
        if (F < 0 || F > this.f18004q - this.f18007t) {
            z = false;
        } else {
            z = true;
        }
        C7510a.m22371a(z);
        int i2 = this.f18004q - F;
        this.f18004q = i2;
        this.f18010w = Math.max(this.f18009v, m20107A(i2));
        if (F == 0 && this.f18011x) {
            z2 = true;
        }
        this.f18011x = z2;
        int i3 = this.f18004q;
        if (i3 == 0) {
            return 0L;
        }
        return this.f17998k[m20105C(i3 - 1)] + this.f17999l[C];
    }

    /* renamed from: u */
    private int m20062u(int i, int i2, long j, boolean z) {
        int i3 = -1;
        for (int i4 = 0; i4 < i2; i4++) {
            long j2 = this.f18001n[i];
            if (j2 > j) {
                return i3;
            }
            if (!z || (this.f18000m[i] & 1) != 0) {
                if (j2 == j) {
                    return i4;
                }
                i3 = i4;
            }
            i++;
            if (i == this.f17996i) {
                i = 0;
            }
        }
        return i3;
    }

    /* renamed from: B */
    public final int m20106B() {
        return this.f18005r + this.f18007t;
    }

    /* renamed from: D */
    public final synchronized int m20104D(long j, boolean z) {
        int C = m20105C(this.f18007t);
        if (m20101G() && j >= this.f18001n[C]) {
            if (j <= this.f18010w || !z) {
                int u = m20062u(C, this.f18004q - this.f18007t, j, true);
                if (u == -1) {
                    return 0;
                }
                return u;
            }
            return this.f18004q - this.f18007t;
        }
        return 0;
    }

    /* renamed from: E */
    public final synchronized C6722k m20103E() {
        C6722k kVar;
        if (this.f18013z) {
            kVar = null;
        } else {
            kVar = this.f38598C;
        }
        return kVar;
    }

    /* renamed from: F */
    public final int m20102F() {
        return this.f18005r + this.f18004q;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: H */
    public final void m20100H() {
        this.f38596A = true;
    }

    /* renamed from: I */
    public final synchronized boolean m20099I() {
        return this.f18011x;
    }

    /* renamed from: J */
    public synchronized boolean m20098J(boolean z) {
        C6722k kVar;
        boolean z2 = true;
        if (!m20101G()) {
            if (!z && !this.f18011x && ((kVar = this.f38598C) == null || kVar == this.f17994g)) {
                z2 = false;
            }
            return z2;
        }
        int C = m20105C(this.f18007t);
        if (this.f18003p[C] != this.f17994g) {
            return true;
        }
        return m20097K(C);
    }

    /* renamed from: L */
    public void m20096L() {
        AbstractC9805n nVar = this.f17995h;
        if (nVar != null && nVar.getState() == 1) {
            throw ((AbstractC9805n.C9806a) C7510a.m22367e(this.f17995h.mo15313d()));
        }
    }

    /* renamed from: O */
    public final synchronized int m20093O() {
        int i;
        int C = m20105C(this.f18007t);
        if (m20101G()) {
            i = this.f17997j[C];
        } else {
            i = this.f38600E;
        }
        return i;
    }

    /* renamed from: P */
    public void m20092P() {
        m20066q();
        m20089S();
    }

    /* renamed from: Q */
    public int m20091Q(C6725l lVar, C8223h hVar, boolean z, boolean z2) {
        int N = m20094N(lVar, hVar, z, z2, this.f17989b);
        if (N == -4 && !hVar.m20299k() && !hVar.m20282r()) {
            this.f17988a.m20116l(hVar, this.f17989b);
            this.f18007t++;
        }
        return N;
    }

    /* renamed from: R */
    public void m20090R() {
        m20087U(true);
        m20089S();
    }

    /* renamed from: T */
    public final void m20088T() {
        m20087U(false);
    }

    /* renamed from: U */
    public void m20087U(boolean z) {
        this.f17988a.m20115m();
        this.f18004q = 0;
        this.f18005r = 0;
        this.f18006s = 0;
        this.f18007t = 0;
        this.f18012y = true;
        this.f18008u = Long.MIN_VALUE;
        this.f18009v = Long.MIN_VALUE;
        this.f18010w = Long.MIN_VALUE;
        this.f18011x = false;
        this.f38599D = null;
        if (z) {
            this.f38597B = null;
            this.f38598C = null;
            this.f18013z = true;
        }
    }

    /* renamed from: W */
    public final synchronized boolean m20085W(int i) {
        m20086V();
        int i2 = this.f18005r;
        if (i >= i2 && i <= this.f18004q + i2) {
            this.f18008u = Long.MIN_VALUE;
            this.f18007t = i - i2;
            return true;
        }
        return false;
    }

    /* renamed from: X */
    public final synchronized boolean m20084X(long j, boolean z) {
        m20086V();
        int C = m20105C(this.f18007t);
        if (m20101G() && j >= this.f18001n[C] && (j <= this.f18010w || z)) {
            int u = m20062u(C, this.f18004q - this.f18007t, j, true);
            if (u == -1) {
                return false;
            }
            this.f18008u = j;
            this.f18007t += u;
            return true;
        }
        return false;
    }

    /* renamed from: Y */
    public final void m20083Y(long j) {
        if (this.f38603H != j) {
            this.f38603H = j;
            m20100H();
        }
    }

    /* renamed from: Z */
    public final void m20082Z(long j) {
        this.f18008u = j;
    }

    @Override // p228m7.AbstractC10500b0
    /* renamed from: a */
    public final int mo12390a(AbstractC6774h hVar, int i, boolean z, int i2) {
        return this.f17988a.m20113o(hVar, i, z);
    }

    @Override // p228m7.AbstractC10500b0
    /* renamed from: b */
    public final void mo12389b(C7570y yVar, int i, int i2) {
        this.f17988a.m20112p(yVar, i);
    }

    /* renamed from: b0 */
    public final void m20080b0(AbstractC8276b bVar) {
        this.f17993f = bVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0059  */
    @Override // p228m7.AbstractC10500b0
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void mo12382c(long r12, int r14, int r15, int r16, p228m7.AbstractC10500b0.C10501a r17) {
        /*
            r11 = this;
            r8 = r11
            boolean r0 = r8.f38596A
            if (r0 == 0) goto L_0x0010
            e7.k r0 = r8.f38597B
            java.lang.Object r0 = p119g9.C7510a.m22364h(r0)
            e7.k r0 = (p079e7.C6722k) r0
            r11.mo12388d(r0)
        L_0x0010:
            r0 = r14 & 1
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0018
            r3 = r2
            goto L_0x0019
        L_0x0018:
            r3 = r1
        L_0x0019:
            boolean r4 = r8.f18012y
            if (r4 == 0) goto L_0x0022
            if (r3 != 0) goto L_0x0020
            return
        L_0x0020:
            r8.f18012y = r1
        L_0x0022:
            long r4 = r8.f38603H
            long r4 = r4 + r12
            boolean r6 = r8.f38601F
            if (r6 == 0) goto L_0x0054
            long r6 = r8.f18008u
            int r6 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r6 >= 0) goto L_0x0030
            return
        L_0x0030:
            if (r0 != 0) goto L_0x0054
            boolean r0 = r8.f38602G
            if (r0 != 0) goto L_0x0050
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r6 = "Overriding unexpected non-sync sample for format: "
            r0.append(r6)
            e7.k r6 = r8.f38598C
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            java.lang.String r6 = "SampleQueue"
            android.util.Log.w(r6, r0)
            r8.f38602G = r2
        L_0x0050:
            r0 = r14 | 1
            r6 = r0
            goto L_0x0055
        L_0x0054:
            r6 = r14
        L_0x0055:
            boolean r0 = r8.f38604I
            if (r0 == 0) goto L_0x0066
            if (r3 == 0) goto L_0x0065
            boolean r0 = r11.m20076g(r4)
            if (r0 != 0) goto L_0x0062
            goto L_0x0065
        L_0x0062:
            r8.f38604I = r1
            goto L_0x0066
        L_0x0065:
            return
        L_0x0066:
            i8.m0 r0 = r8.f17988a
            long r0 = r0.m20123e()
            r7 = r15
            long r2 = (long) r7
            long r0 = r0 - r2
            r2 = r16
            long r2 = (long) r2
            long r9 = r0 - r2
            r0 = r11
            r1 = r4
            r3 = r6
            r4 = r9
            r6 = r15
            r7 = r17
            r0.m20075h(r1, r3, r4, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p153i8.C8274n0.mo12382c(long, int, int, int, m7.b0$a):void");
    }

    /* renamed from: c0 */
    public final synchronized void m20079c0(int i) {
        boolean z;
        if (i >= 0) {
            try {
                if (this.f18007t + i <= this.f18004q) {
                    z = true;
                    C7510a.m22371a(z);
                    this.f18007t += i;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        z = false;
        C7510a.m22371a(z);
        this.f18007t += i;
    }

    @Override // p228m7.AbstractC10500b0
    /* renamed from: d */
    public final void mo12388d(C6722k kVar) {
        C6722k v = mo12378v(kVar);
        this.f38596A = false;
        this.f38597B = kVar;
        boolean a0 = m20081a0(v);
        AbstractC8276b bVar = this.f17993f;
        if (bVar != null && a0) {
            bVar.mo12423a(v);
        }
    }

    /* renamed from: d0 */
    public final void m20078d0(int i) {
        this.f38600E = i;
    }

    @Override // p228m7.AbstractC10500b0
    /* renamed from: e */
    public /* synthetic */ int mo12387e(AbstractC6774h hVar, int i, boolean z) {
        return C10498a0.m13009a(this, hVar, i, z);
    }

    /* renamed from: e0 */
    public final void m20077e0() {
        this.f38604I = true;
    }

    @Override // p228m7.AbstractC10500b0
    /* renamed from: f */
    public /* synthetic */ void mo12386f(C7570y yVar, int i) {
        C10498a0.m13008b(this, yVar, i);
    }

    /* renamed from: n */
    public synchronized long m20069n() {
        int i = this.f18007t;
        if (i == 0) {
            return -1L;
        }
        return m20068o(i);
    }

    /* renamed from: p */
    public final void m20067p(long j, boolean z, boolean z2) {
        this.f17988a.m20126b(m20071l(j, z, z2));
    }

    /* renamed from: q */
    public final void m20066q() {
        this.f17988a.m20126b(m20070m());
    }

    /* renamed from: r */
    public final void m20065r() {
        this.f17988a.m20126b(m20069n());
    }

    /* renamed from: t */
    public final void m20063t(int i) {
        this.f17988a.m20125c(m20064s(i));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: v */
    public C6722k mo12378v(C6722k kVar) {
        if (this.f38603H == 0 || kVar.f14333z == Long.MAX_VALUE) {
            return kVar;
        }
        return kVar.m24531a().m24480i0(kVar.f14333z + this.f38603H).m24519E();
    }

    /* renamed from: w */
    public final int m20061w() {
        return this.f18005r;
    }

    /* renamed from: x */
    public final synchronized long m20060x() {
        long j;
        if (this.f18004q == 0) {
            j = Long.MIN_VALUE;
        } else {
            j = this.f18001n[this.f18006s];
        }
        return j;
    }

    /* renamed from: y */
    public final synchronized long m20059y() {
        return this.f18010w;
    }

    /* renamed from: z */
    public final synchronized long m20058z() {
        return Math.max(this.f18009v, m20107A(this.f18007t));
    }
}
