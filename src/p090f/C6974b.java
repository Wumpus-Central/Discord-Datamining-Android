package p090f;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import androidx.core.graphics.drawable.C2400a;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: f.b */
/* loaded from: classes.dex */
public class C6974b extends Drawable implements Drawable.Callback {

    /* renamed from: k */
    private AbstractC6977d f15217k;

    /* renamed from: l */
    private Rect f15218l;

    /* renamed from: m */
    private Drawable f15219m;

    /* renamed from: n */
    private Drawable f15220n;

    /* renamed from: p */
    private boolean f15222p;

    /* renamed from: r */
    private boolean f15224r;

    /* renamed from: s */
    private Runnable f15225s;

    /* renamed from: t */
    private long f15226t;

    /* renamed from: u */
    private long f15227u;

    /* renamed from: v */
    private C6976c f15228v;

    /* renamed from: o */
    private int f15221o = 255;

    /* renamed from: q */
    private int f15223q = -1;

    /* renamed from: f.b$a */
    /* loaded from: classes.dex */
    class RunnableC6975a implements Runnable {
        RunnableC6975a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C6974b.this.m23785a(true);
            C6974b.this.invalidateSelf();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f.b$b */
    /* loaded from: classes.dex */
    public static class C0213b {
        /* renamed from: a */
        public static boolean m23778a(Drawable.ConstantState constantState) {
            return constantState.canApplyTheme();
        }

        /* renamed from: b */
        public static void m23777b(Drawable drawable, Outline outline) {
            drawable.getOutline(outline);
        }

        /* renamed from: c */
        public static Resources m23776c(Resources.Theme theme) {
            return theme.getResources();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f.b$c */
    /* loaded from: classes.dex */
    public static class C6976c implements Drawable.Callback {

        /* renamed from: k */
        private Drawable.Callback f15230k;

        C6976c() {
        }

        /* renamed from: a */
        public Drawable.Callback m23775a() {
            Drawable.Callback callback = this.f15230k;
            this.f15230k = null;
            return callback;
        }

        /* renamed from: b */
        public C6976c m23774b(Drawable.Callback callback) {
            this.f15230k = callback;
            return this;
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void invalidateDrawable(Drawable drawable) {
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
            Drawable.Callback callback = this.f15230k;
            if (callback != null) {
                callback.scheduleDrawable(drawable, runnable, j);
            }
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            Drawable.Callback callback = this.f15230k;
            if (callback != null) {
                callback.unscheduleDrawable(drawable, runnable);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f.b$d */
    /* loaded from: classes.dex */
    public static abstract class AbstractC6977d extends Drawable.ConstantState {

        /* renamed from: A */
        int f38321A;

        /* renamed from: B */
        int f38322B;

        /* renamed from: C */
        boolean f38323C;

        /* renamed from: D */
        ColorFilter f38324D;

        /* renamed from: E */
        boolean f38325E;

        /* renamed from: F */
        ColorStateList f38326F;

        /* renamed from: G */
        PorterDuff.Mode f38327G;

        /* renamed from: H */
        boolean f38328H;

        /* renamed from: I */
        boolean f38329I;

        /* renamed from: a */
        final C6974b f15231a;

        /* renamed from: b */
        Resources f15232b;

        /* renamed from: c */
        int f15233c;

        /* renamed from: d */
        int f15234d;

        /* renamed from: e */
        int f15235e;

        /* renamed from: f */
        SparseArray<Drawable.ConstantState> f15236f;

        /* renamed from: g */
        Drawable[] f15237g;

        /* renamed from: h */
        int f15238h;

        /* renamed from: i */
        boolean f15239i;

        /* renamed from: j */
        boolean f15240j;

        /* renamed from: k */
        Rect f15241k;

        /* renamed from: l */
        boolean f15242l;

        /* renamed from: m */
        boolean f15243m;

        /* renamed from: n */
        int f15244n;

        /* renamed from: o */
        int f15245o;

        /* renamed from: p */
        int f15246p;

        /* renamed from: q */
        int f15247q;

        /* renamed from: r */
        boolean f15248r;

        /* renamed from: s */
        int f15249s;

        /* renamed from: t */
        boolean f15250t;

        /* renamed from: u */
        boolean f15251u;

        /* renamed from: v */
        boolean f15252v;

        /* renamed from: w */
        boolean f15253w;

        /* renamed from: x */
        boolean f15254x;

        /* renamed from: y */
        boolean f15255y;

        /* renamed from: z */
        int f15256z;

        /* JADX INFO: Access modifiers changed from: package-private */
        public AbstractC6977d(AbstractC6977d dVar, C6974b bVar, Resources resources) {
            Resources resources2;
            int i;
            this.f15239i = false;
            this.f15242l = false;
            this.f15254x = true;
            this.f38321A = 0;
            this.f38322B = 0;
            this.f15231a = bVar;
            Rect rect = null;
            if (resources != null) {
                resources2 = resources;
            } else if (dVar != null) {
                resources2 = dVar.f15232b;
            } else {
                resources2 = null;
            }
            this.f15232b = resources2;
            if (dVar != null) {
                i = dVar.f15233c;
            } else {
                i = 0;
            }
            int f = C6974b.m23781f(resources, i);
            this.f15233c = f;
            if (dVar != null) {
                this.f15234d = dVar.f15234d;
                this.f15235e = dVar.f15235e;
                this.f15252v = true;
                this.f15253w = true;
                this.f15239i = dVar.f15239i;
                this.f15242l = dVar.f15242l;
                this.f15254x = dVar.f15254x;
                this.f15255y = dVar.f15255y;
                this.f15256z = dVar.f15256z;
                this.f38321A = dVar.f38321A;
                this.f38322B = dVar.f38322B;
                this.f38323C = dVar.f38323C;
                this.f38324D = dVar.f38324D;
                this.f38325E = dVar.f38325E;
                this.f38326F = dVar.f38326F;
                this.f38327G = dVar.f38327G;
                this.f38328H = dVar.f38328H;
                this.f38329I = dVar.f38329I;
                if (dVar.f15233c == f) {
                    if (dVar.f15240j) {
                        this.f15241k = dVar.f15241k != null ? new Rect(dVar.f15241k) : rect;
                        this.f15240j = true;
                    }
                    if (dVar.f15243m) {
                        this.f15244n = dVar.f15244n;
                        this.f15245o = dVar.f15245o;
                        this.f15246p = dVar.f15246p;
                        this.f15247q = dVar.f15247q;
                        this.f15243m = true;
                    }
                }
                if (dVar.f15248r) {
                    this.f15249s = dVar.f15249s;
                    this.f15248r = true;
                }
                if (dVar.f15250t) {
                    this.f15251u = dVar.f15251u;
                    this.f15250t = true;
                }
                Drawable[] drawableArr = dVar.f15237g;
                this.f15237g = new Drawable[drawableArr.length];
                this.f15238h = dVar.f15238h;
                SparseArray<Drawable.ConstantState> sparseArray = dVar.f15236f;
                if (sparseArray != null) {
                    this.f15236f = sparseArray.clone();
                } else {
                    this.f15236f = new SparseArray<>(this.f15238h);
                }
                int i2 = this.f15238h;
                for (int i3 = 0; i3 < i2; i3++) {
                    Drawable drawable = drawableArr[i3];
                    if (drawable != null) {
                        Drawable.ConstantState constantState = drawable.getConstantState();
                        if (constantState != null) {
                            this.f15236f.put(i3, constantState);
                        } else {
                            this.f15237g[i3] = drawableArr[i3];
                        }
                    }
                }
                return;
            }
            this.f15237g = new Drawable[10];
            this.f15238h = 0;
        }

        /* renamed from: e */
        private void m23769e() {
            SparseArray<Drawable.ConstantState> sparseArray = this.f15236f;
            if (sparseArray != null) {
                int size = sparseArray.size();
                for (int i = 0; i < size; i++) {
                    this.f15237g[this.f15236f.keyAt(i)] = m23757s(this.f15236f.valueAt(i).newDrawable(this.f15232b));
                }
                this.f15236f = null;
            }
        }

        /* renamed from: s */
        private Drawable m23757s(Drawable drawable) {
            C2400a.m37830m(drawable, this.f15256z);
            Drawable mutate = drawable.mutate();
            mutate.setCallback(this.f15231a);
            return mutate;
        }

        /* renamed from: a */
        public final int m23773a(Drawable drawable) {
            int i = this.f15238h;
            if (i >= this.f15237g.length) {
                mo23743o(i, i + 10);
            }
            drawable.mutate();
            drawable.setVisible(false, true);
            drawable.setCallback(this.f15231a);
            this.f15237g[i] = drawable;
            this.f15238h++;
            this.f15235e = drawable.getChangingConfigurations() | this.f15235e;
            m23759p();
            this.f15241k = null;
            this.f15240j = false;
            this.f15243m = false;
            this.f15252v = false;
            return i;
        }

        /* renamed from: b */
        final void m23772b(Resources.Theme theme) {
            if (theme != null) {
                m23769e();
                int i = this.f15238h;
                Drawable[] drawableArr = this.f15237g;
                for (int i2 = 0; i2 < i; i2++) {
                    Drawable drawable = drawableArr[i2];
                    if (drawable != null && C2400a.m37841b(drawable)) {
                        C2400a.m37842a(drawableArr[i2], theme);
                        this.f15235e |= drawableArr[i2].getChangingConfigurations();
                    }
                }
                m23751y(C0213b.m23776c(theme));
            }
        }

        /* renamed from: c */
        public boolean m23771c() {
            if (this.f15252v) {
                return this.f15253w;
            }
            m23769e();
            this.f15252v = true;
            int i = this.f15238h;
            Drawable[] drawableArr = this.f15237g;
            for (int i2 = 0; i2 < i; i2++) {
                if (drawableArr[i2].getConstantState() == null) {
                    this.f15253w = false;
                    return false;
                }
            }
            this.f15253w = true;
            return true;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public boolean canApplyTheme() {
            int i = this.f15238h;
            Drawable[] drawableArr = this.f15237g;
            for (int i2 = 0; i2 < i; i2++) {
                Drawable drawable = drawableArr[i2];
                if (drawable == null) {
                    Drawable.ConstantState constantState = this.f15236f.get(i2);
                    if (constantState != null && C0213b.m23778a(constantState)) {
                        return true;
                    }
                } else if (C2400a.m37841b(drawable)) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: d */
        protected void m23770d() {
            this.f15243m = true;
            m23769e();
            int i = this.f15238h;
            Drawable[] drawableArr = this.f15237g;
            this.f15245o = -1;
            this.f15244n = -1;
            this.f15247q = 0;
            this.f15246p = 0;
            for (int i2 = 0; i2 < i; i2++) {
                Drawable drawable = drawableArr[i2];
                int intrinsicWidth = drawable.getIntrinsicWidth();
                if (intrinsicWidth > this.f15244n) {
                    this.f15244n = intrinsicWidth;
                }
                int intrinsicHeight = drawable.getIntrinsicHeight();
                if (intrinsicHeight > this.f15245o) {
                    this.f15245o = intrinsicHeight;
                }
                int minimumWidth = drawable.getMinimumWidth();
                if (minimumWidth > this.f15246p) {
                    this.f15246p = minimumWidth;
                }
                int minimumHeight = drawable.getMinimumHeight();
                if (minimumHeight > this.f15247q) {
                    this.f15247q = minimumHeight;
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: f */
        public final int m23768f() {
            return this.f15237g.length;
        }

        /* renamed from: g */
        public final Drawable m23767g(int i) {
            int indexOfKey;
            Drawable drawable = this.f15237g[i];
            if (drawable != null) {
                return drawable;
            }
            SparseArray<Drawable.ConstantState> sparseArray = this.f15236f;
            if (sparseArray == null || (indexOfKey = sparseArray.indexOfKey(i)) < 0) {
                return null;
            }
            Drawable s = m23757s(this.f15236f.valueAt(indexOfKey).newDrawable(this.f15232b));
            this.f15237g[i] = s;
            this.f15236f.removeAt(indexOfKey);
            if (this.f15236f.size() == 0) {
                this.f15236f = null;
            }
            return s;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f15234d | this.f15235e;
        }

        /* renamed from: h */
        public final int m23766h() {
            return this.f15238h;
        }

        /* renamed from: i */
        public final int m23765i() {
            if (!this.f15243m) {
                m23770d();
            }
            return this.f15245o;
        }

        /* renamed from: j */
        public final int m23764j() {
            if (!this.f15243m) {
                m23770d();
            }
            return this.f15247q;
        }

        /* renamed from: k */
        public final int m23763k() {
            if (!this.f15243m) {
                m23770d();
            }
            return this.f15246p;
        }

        /* renamed from: l */
        public final Rect m23762l() {
            Rect rect = null;
            if (this.f15239i) {
                return null;
            }
            Rect rect2 = this.f15241k;
            if (rect2 != null || this.f15240j) {
                return rect2;
            }
            m23769e();
            Rect rect3 = new Rect();
            int i = this.f15238h;
            Drawable[] drawableArr = this.f15237g;
            for (int i2 = 0; i2 < i; i2++) {
                if (drawableArr[i2].getPadding(rect3)) {
                    if (rect == null) {
                        rect = new Rect(0, 0, 0, 0);
                    }
                    int i3 = rect3.left;
                    if (i3 > rect.left) {
                        rect.left = i3;
                    }
                    int i4 = rect3.top;
                    if (i4 > rect.top) {
                        rect.top = i4;
                    }
                    int i5 = rect3.right;
                    if (i5 > rect.right) {
                        rect.right = i5;
                    }
                    int i6 = rect3.bottom;
                    if (i6 > rect.bottom) {
                        rect.bottom = i6;
                    }
                }
            }
            this.f15240j = true;
            this.f15241k = rect;
            return rect;
        }

        /* renamed from: m */
        public final int m23761m() {
            if (!this.f15243m) {
                m23770d();
            }
            return this.f15244n;
        }

        /* renamed from: n */
        public final int m23760n() {
            int i;
            if (this.f15248r) {
                return this.f15249s;
            }
            m23769e();
            int i2 = this.f15238h;
            Drawable[] drawableArr = this.f15237g;
            if (i2 > 0) {
                i = drawableArr[0].getOpacity();
            } else {
                i = -2;
            }
            for (int i3 = 1; i3 < i2; i3++) {
                i = Drawable.resolveOpacity(i, drawableArr[i3].getOpacity());
            }
            this.f15249s = i;
            this.f15248r = true;
            return i;
        }

        /* renamed from: o */
        public void mo23743o(int i, int i2) {
            Drawable[] drawableArr = new Drawable[i2];
            Drawable[] drawableArr2 = this.f15237g;
            if (drawableArr2 != null) {
                System.arraycopy(drawableArr2, 0, drawableArr, 0, i);
            }
            this.f15237g = drawableArr;
        }

        /* renamed from: p */
        void m23759p() {
            this.f15248r = false;
            this.f15250t = false;
        }

        /* renamed from: q */
        public final boolean m23758q() {
            return this.f15242l;
        }

        /* renamed from: r */
        abstract void mo23742r();

        /* renamed from: t */
        public final void m23756t(boolean z) {
            this.f15242l = z;
        }

        /* renamed from: u */
        public final void m23755u(int i) {
            this.f38321A = i;
        }

        /* renamed from: v */
        public final void m23754v(int i) {
            this.f38322B = i;
        }

        /* renamed from: w */
        final boolean m23753w(int i, int i2) {
            int i3 = this.f15238h;
            Drawable[] drawableArr = this.f15237g;
            boolean z = false;
            for (int i4 = 0; i4 < i3; i4++) {
                Drawable drawable = drawableArr[i4];
                if (drawable != null) {
                    boolean m = C2400a.m37830m(drawable, i);
                    if (i4 == i2) {
                        z = m;
                    }
                }
            }
            this.f15256z = i;
            return z;
        }

        /* renamed from: x */
        public final void m23752x(boolean z) {
            this.f15239i = z;
        }

        /* renamed from: y */
        final void m23751y(Resources resources) {
            if (resources != null) {
                this.f15232b = resources;
                int f = C6974b.m23781f(resources, this.f15233c);
                int i = this.f15233c;
                this.f15233c = f;
                if (i != f) {
                    this.f15243m = false;
                    this.f15240j = false;
                }
            }
        }
    }

    /* renamed from: d */
    private void m23783d(Drawable drawable) {
        if (this.f15228v == null) {
            this.f15228v = new C6976c();
        }
        drawable.setCallback(this.f15228v.m23774b(drawable.getCallback()));
        try {
            if (this.f15217k.f38321A <= 0 && this.f15222p) {
                drawable.setAlpha(this.f15221o);
            }
            AbstractC6977d dVar = this.f15217k;
            if (dVar.f38325E) {
                drawable.setColorFilter(dVar.f38324D);
            } else {
                if (dVar.f38328H) {
                    C2400a.m37828o(drawable, dVar.f38326F);
                }
                AbstractC6977d dVar2 = this.f15217k;
                if (dVar2.f38329I) {
                    C2400a.m37827p(drawable, dVar2.f38327G);
                }
            }
            drawable.setVisible(isVisible(), true);
            drawable.setDither(this.f15217k.f15254x);
            drawable.setState(getState());
            drawable.setLevel(getLevel());
            drawable.setBounds(getBounds());
            C2400a.m37830m(drawable, C2400a.m37837f(this));
            C2400a.m37833j(drawable, this.f15217k.f38323C);
            Rect rect = this.f15218l;
            if (rect != null) {
                C2400a.m37831l(drawable, rect.left, rect.top, rect.right, rect.bottom);
            }
        } finally {
            drawable.setCallback(this.f15228v.m23775a());
        }
    }

    /* renamed from: e */
    private boolean m23782e() {
        if (!isAutoMirrored() || C2400a.m37837f(this) != 1) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    static int m23781f(Resources resources, int i) {
        if (resources != null) {
            i = resources.getDisplayMetrics().densityDpi;
        }
        if (i == 0) {
            return 160;
        }
        return i;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0066 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    void m23785a(boolean r14) {
        /*
            r13 = this;
            r0 = 1
            r13.f15222p = r0
            long r1 = android.os.SystemClock.uptimeMillis()
            android.graphics.drawable.Drawable r3 = r13.f15219m
            r4 = 255(0xff, double:1.26E-321)
            r6 = 0
            r8 = 0
            if (r3 == 0) goto L_0x0036
            long r9 = r13.f15226t
            int r11 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r11 == 0) goto L_0x0038
            int r11 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r11 > 0) goto L_0x0022
            int r9 = r13.f15221o
            r3.setAlpha(r9)
            r13.f15226t = r6
            goto L_0x0038
        L_0x0022:
            long r9 = r9 - r1
            long r9 = r9 * r4
            int r9 = (int) r9
            f.b$d r10 = r13.f15217k
            int r10 = r10.f38321A
            int r9 = r9 / r10
            int r9 = 255 - r9
            int r10 = r13.f15221o
            int r9 = r9 * r10
            int r9 = r9 / 255
            r3.setAlpha(r9)
            r3 = r0
            goto L_0x0039
        L_0x0036:
            r13.f15226t = r6
        L_0x0038:
            r3 = r8
        L_0x0039:
            android.graphics.drawable.Drawable r9 = r13.f15220n
            if (r9 == 0) goto L_0x0061
            long r10 = r13.f15227u
            int r12 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r12 == 0) goto L_0x0063
            int r12 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r12 > 0) goto L_0x0050
            r9.setVisible(r8, r8)
            r0 = 0
            r13.f15220n = r0
            r13.f15227u = r6
            goto L_0x0063
        L_0x0050:
            long r10 = r10 - r1
            long r10 = r10 * r4
            int r3 = (int) r10
            f.b$d r4 = r13.f15217k
            int r4 = r4.f38322B
            int r3 = r3 / r4
            int r4 = r13.f15221o
            int r3 = r3 * r4
            int r3 = r3 / 255
            r9.setAlpha(r3)
            goto L_0x0064
        L_0x0061:
            r13.f15227u = r6
        L_0x0063:
            r0 = r3
        L_0x0064:
            if (r14 == 0) goto L_0x0070
            if (r0 == 0) goto L_0x0070
            java.lang.Runnable r14 = r13.f15225s
            r3 = 16
            long r1 = r1 + r3
            r13.scheduleSelf(r14, r1)
        L_0x0070:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p090f.C6974b.m23785a(boolean):void");
    }

    @Override // android.graphics.drawable.Drawable
    public void applyTheme(Resources.Theme theme) {
        this.f15217k.m23772b(theme);
    }

    /* renamed from: b */
    AbstractC6977d mo23748b() {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public int m23784c() {
        return this.f15223q;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        return this.f15217k.canApplyTheme();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Drawable drawable = this.f15219m;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        Drawable drawable2 = this.f15220n;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:33:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0073  */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean m23780g(int r10) {
        /*
            r9 = this;
            int r0 = r9.f15223q
            r1 = 0
            if (r10 != r0) goto L_0x0006
            return r1
        L_0x0006:
            long r2 = android.os.SystemClock.uptimeMillis()
            f.b$d r0 = r9.f15217k
            int r0 = r0.f38322B
            r4 = 0
            r5 = 0
            if (r0 <= 0) goto L_0x002e
            android.graphics.drawable.Drawable r0 = r9.f15220n
            if (r0 == 0) goto L_0x001a
            r0.setVisible(r1, r1)
        L_0x001a:
            android.graphics.drawable.Drawable r0 = r9.f15219m
            if (r0 == 0) goto L_0x0029
            r9.f15220n = r0
            f.b$d r0 = r9.f15217k
            int r0 = r0.f38322B
            long r0 = (long) r0
            long r0 = r0 + r2
            r9.f15227u = r0
            goto L_0x0035
        L_0x0029:
            r9.f15220n = r4
            r9.f15227u = r5
            goto L_0x0035
        L_0x002e:
            android.graphics.drawable.Drawable r0 = r9.f15219m
            if (r0 == 0) goto L_0x0035
            r0.setVisible(r1, r1)
        L_0x0035:
            if (r10 < 0) goto L_0x0055
            f.b$d r0 = r9.f15217k
            int r1 = r0.f15238h
            if (r10 >= r1) goto L_0x0055
            android.graphics.drawable.Drawable r0 = r0.m23767g(r10)
            r9.f15219m = r0
            r9.f15223q = r10
            if (r0 == 0) goto L_0x005a
            f.b$d r10 = r9.f15217k
            int r10 = r10.f38321A
            if (r10 <= 0) goto L_0x0051
            long r7 = (long) r10
            long r2 = r2 + r7
            r9.f15226t = r2
        L_0x0051:
            r9.m23783d(r0)
            goto L_0x005a
        L_0x0055:
            r9.f15219m = r4
            r10 = -1
            r9.f15223q = r10
        L_0x005a:
            long r0 = r9.f15226t
            int r10 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            r0 = 1
            if (r10 != 0) goto L_0x0067
            long r1 = r9.f15227u
            int r10 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r10 == 0) goto L_0x0079
        L_0x0067:
            java.lang.Runnable r10 = r9.f15225s
            if (r10 != 0) goto L_0x0073
            f.b$a r10 = new f.b$a
            r10.<init>()
            r9.f15225s = r10
            goto L_0x0076
        L_0x0073:
            r9.unscheduleSelf(r10)
        L_0x0076:
            r9.m23785a(r0)
        L_0x0079:
            r9.invalidateSelf()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p090f.C6974b.m23780g(int):boolean");
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f15221o;
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        return super.getChangingConfigurations() | this.f15217k.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (!this.f15217k.m23771c()) {
            return null;
        }
        this.f15217k.f15234d = getChangingConfigurations();
        return this.f15217k;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable getCurrent() {
        return this.f15219m;
    }

    @Override // android.graphics.drawable.Drawable
    public void getHotspotBounds(Rect rect) {
        Rect rect2 = this.f15218l;
        if (rect2 != null) {
            rect.set(rect2);
        } else {
            super.getHotspotBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        if (this.f15217k.m23758q()) {
            return this.f15217k.m23765i();
        }
        Drawable drawable = this.f15219m;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        if (this.f15217k.m23758q()) {
            return this.f15217k.m23761m();
        }
        Drawable drawable = this.f15219m;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
        if (this.f15217k.m23758q()) {
            return this.f15217k.m23764j();
        }
        Drawable drawable = this.f15219m;
        if (drawable != null) {
            return drawable.getMinimumHeight();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
        if (this.f15217k.m23758q()) {
            return this.f15217k.m23763k();
        }
        Drawable drawable = this.f15219m;
        if (drawable != null) {
            return drawable.getMinimumWidth();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Drawable drawable = this.f15219m;
        if (drawable == null || !drawable.isVisible()) {
            return -2;
        }
        return this.f15217k.m23760n();
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        Drawable drawable = this.f15219m;
        if (drawable != null) {
            C0213b.m23777b(drawable, outline);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        boolean z;
        Rect l = this.f15217k.m23762l();
        if (l != null) {
            rect.set(l);
            if ((l.right | l.left | l.top | l.bottom) != 0) {
                z = true;
            } else {
                z = false;
            }
        } else {
            Drawable drawable = this.f15219m;
            if (drawable != null) {
                z = drawable.getPadding(rect);
            } else {
                z = super.getPadding(rect);
            }
        }
        if (m23782e()) {
            int i = rect.left;
            rect.left = rect.right;
            rect.right = i;
        }
        return z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo23747h(AbstractC6977d dVar) {
        this.f15217k = dVar;
        int i = this.f15223q;
        if (i >= 0) {
            Drawable g = dVar.m23767g(i);
            this.f15219m = g;
            if (g != null) {
                m23783d(g);
            }
        }
        this.f15220n = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public final void m23779i(Resources resources) {
        this.f15217k.m23751y(resources);
    }

    public void invalidateDrawable(Drawable drawable) {
        AbstractC6977d dVar = this.f15217k;
        if (dVar != null) {
            dVar.m23759p();
        }
        if (drawable == this.f15219m && getCallback() != null) {
            getCallback().invalidateDrawable(this);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        return this.f15217k.f38323C;
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        boolean z;
        Drawable drawable = this.f15220n;
        boolean z2 = true;
        if (drawable != null) {
            drawable.jumpToCurrentState();
            this.f15220n = null;
            z = true;
        } else {
            z = false;
        }
        Drawable drawable2 = this.f15219m;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
            if (this.f15222p) {
                this.f15219m.setAlpha(this.f15221o);
            }
        }
        if (this.f15227u != 0) {
            this.f15227u = 0L;
            z = true;
        }
        if (this.f15226t != 0) {
            this.f15226t = 0L;
        } else {
            z2 = z;
        }
        if (z2) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.f15224r && super.mutate() == this) {
            AbstractC6977d b = mo23748b();
            b.mo23742r();
            mo23747h(b);
            this.f15224r = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        Drawable drawable = this.f15220n;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        Drawable drawable2 = this.f15219m;
        if (drawable2 != null) {
            drawable2.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLayoutDirectionChanged(int i) {
        return this.f15217k.m23753w(i, m23784c());
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i) {
        Drawable drawable = this.f15220n;
        if (drawable != null) {
            return drawable.setLevel(i);
        }
        Drawable drawable2 = this.f15219m;
        if (drawable2 != null) {
            return drawable2.setLevel(i);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f15220n;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        Drawable drawable2 = this.f15219m;
        if (drawable2 != null) {
            return drawable2.setState(iArr);
        }
        return false;
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        if (drawable == this.f15219m && getCallback() != null) {
            getCallback().scheduleDrawable(this, runnable, j);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        if (!this.f15222p || this.f15221o != i) {
            this.f15222p = true;
            this.f15221o = i;
            Drawable drawable = this.f15219m;
            if (drawable == null) {
                return;
            }
            if (this.f15226t == 0) {
                drawable.setAlpha(i);
            } else {
                m23785a(false);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z) {
        AbstractC6977d dVar = this.f15217k;
        if (dVar.f38323C != z) {
            dVar.f38323C = z;
            Drawable drawable = this.f15219m;
            if (drawable != null) {
                C2400a.m37833j(drawable, z);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        AbstractC6977d dVar = this.f15217k;
        dVar.f38325E = true;
        if (dVar.f38324D != colorFilter) {
            dVar.f38324D = colorFilter;
            Drawable drawable = this.f15219m;
            if (drawable != null) {
                drawable.setColorFilter(colorFilter);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z) {
        AbstractC6977d dVar = this.f15217k;
        if (dVar.f15254x != z) {
            dVar.f15254x = z;
            Drawable drawable = this.f15219m;
            if (drawable != null) {
                drawable.setDither(z);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspot(float f, float f2) {
        Drawable drawable = this.f15219m;
        if (drawable != null) {
            C2400a.m37832k(drawable, f, f2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspotBounds(int i, int i2, int i3, int i4) {
        Rect rect = this.f15218l;
        if (rect == null) {
            this.f15218l = new Rect(i, i2, i3, i4);
        } else {
            rect.set(i, i2, i3, i4);
        }
        Drawable drawable = this.f15219m;
        if (drawable != null) {
            C2400a.m37831l(drawable, i, i2, i3, i4);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        AbstractC6977d dVar = this.f15217k;
        dVar.f38328H = true;
        if (dVar.f38326F != colorStateList) {
            dVar.f38326F = colorStateList;
            C2400a.m37828o(this.f15219m, colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        AbstractC6977d dVar = this.f15217k;
        dVar.f38329I = true;
        if (dVar.f38327G != mode) {
            dVar.f38327G = mode;
            C2400a.m37827p(this.f15219m, mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        Drawable drawable = this.f15220n;
        if (drawable != null) {
            drawable.setVisible(z, z2);
        }
        Drawable drawable2 = this.f15219m;
        if (drawable2 != null) {
            drawable2.setVisible(z, z2);
        }
        return visible;
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        if (drawable == this.f15219m && getCallback() != null) {
            getCallback().unscheduleDrawable(this, runnable);
        }
    }
}
