package p422xb;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Log;
import androidx.core.util.C2513d;
import java.util.BitSet;
import lb.C10395a;
import p083eb.C6803b;
import p263ob.C11247a;
import p402wb.C13857a;
import p422xb.C14045k;
import p422xb.C14049l;
import p422xb.C14053m;

/* renamed from: xb.g */
/* loaded from: classes3.dex */
public class C14038g extends Drawable implements AbstractC14061n {

    /* renamed from: H */
    private static final String f39442H = "g";

    /* renamed from: I */
    private static final Paint f39443I;

    /* renamed from: A */
    private final C14049l.AbstractC14051b f39444A;

    /* renamed from: B */
    private final C14049l f39445B;

    /* renamed from: C */
    private PorterDuffColorFilter f39446C;

    /* renamed from: D */
    private PorterDuffColorFilter f39447D;

    /* renamed from: E */
    private int f39448E;

    /* renamed from: F */
    private final RectF f39449F;

    /* renamed from: G */
    private boolean f39450G;

    /* renamed from: k */
    private C14041c f31619k;

    /* renamed from: l */
    private final C14053m.AbstractC14060g[] f31620l;

    /* renamed from: m */
    private final C14053m.AbstractC14060g[] f31621m;

    /* renamed from: n */
    private final BitSet f31622n;

    /* renamed from: o */
    private boolean f31623o;

    /* renamed from: p */
    private final Matrix f31624p;

    /* renamed from: q */
    private final Path f31625q;

    /* renamed from: r */
    private final Path f31626r;

    /* renamed from: s */
    private final RectF f31627s;

    /* renamed from: t */
    private final RectF f31628t;

    /* renamed from: u */
    private final Region f31629u;

    /* renamed from: v */
    private final Region f31630v;

    /* renamed from: w */
    private C14045k f31631w;

    /* renamed from: x */
    private final Paint f31632x;

    /* renamed from: y */
    private final Paint f31633y;

    /* renamed from: z */
    private final C13857a f31634z;

    /* renamed from: xb.g$a */
    /* loaded from: classes3.dex */
    class C14039a implements C14049l.AbstractC14051b {
        C14039a() {
        }

        @Override // p422xb.C14049l.AbstractC14051b
        /* renamed from: a */
        public void mo1863a(C14053m mVar, Matrix matrix, int i) {
            C14038g.this.f31622n.set(i, mVar.m1857e());
            C14038g.this.f31620l[i] = mVar.m1856f(matrix);
        }

        @Override // p422xb.C14049l.AbstractC14051b
        /* renamed from: b */
        public void mo1862b(C14053m mVar, Matrix matrix, int i) {
            C14038g.this.f31622n.set(i + 4, mVar.m1857e());
            C14038g.this.f31621m[i] = mVar.m1856f(matrix);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: xb.g$b */
    /* loaded from: classes3.dex */
    public class C14040b implements C14045k.AbstractC14048c {

        /* renamed from: a */
        final /* synthetic */ float f31636a;

        C14040b(float f) {
            this.f31636a = f;
        }

        @Override // p422xb.C14045k.AbstractC14048c
        /* renamed from: a */
        public AbstractC14034c mo1878a(AbstractC14034c cVar) {
            if (cVar instanceof C14043i) {
                return cVar;
            }
            return new C14033b(this.f31636a, cVar);
        }
    }

    static {
        Paint paint = new Paint(1);
        f39443I = paint;
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    /* synthetic */ C14038g(C14041c cVar, C14039a aVar) {
        this(cVar);
    }

    /* renamed from: F */
    private float m2000F() {
        if (m1992N()) {
            return this.f31633y.getStrokeWidth() / 2.0f;
        }
        return 0.0f;
    }

    /* renamed from: L */
    private boolean m1994L() {
        C14041c cVar = this.f31619k;
        int i = cVar.f31654q;
        if (i == 1 || cVar.f31655r <= 0 || (i != 2 && !m1984V())) {
            return false;
        }
        return true;
    }

    /* renamed from: M */
    private boolean m1993M() {
        Paint.Style style = this.f31619k.f31659v;
        return style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.FILL;
    }

    /* renamed from: N */
    private boolean m1992N() {
        Paint.Style style = this.f31619k.f31659v;
        if ((style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && this.f31633y.getStrokeWidth() > 0.0f) {
            return true;
        }
        return false;
    }

    /* renamed from: P */
    private void m1990P() {
        super.invalidateSelf();
    }

    /* renamed from: S */
    private void m1987S(Canvas canvas) {
        if (m1994L()) {
            canvas.save();
            m1985U(canvas);
            if (!this.f39450G) {
                m1956n(canvas);
                canvas.restore();
                return;
            }
            int width = (int) (this.f39449F.width() - getBounds().width());
            int height = (int) (this.f39449F.height() - getBounds().height());
            if (width < 0 || height < 0) {
                throw new IllegalStateException("Invalid shadow bounds. Check that the treatments result in a valid path.");
            }
            Bitmap createBitmap = Bitmap.createBitmap(((int) this.f39449F.width()) + (this.f31619k.f31655r * 2) + width, ((int) this.f39449F.height()) + (this.f31619k.f31655r * 2) + height, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(createBitmap);
            float f = (getBounds().left - this.f31619k.f31655r) - width;
            float f2 = (getBounds().top - this.f31619k.f31655r) - height;
            canvas2.translate(-f, -f2);
            m1956n(canvas2);
            canvas.drawBitmap(createBitmap, f, f2, (Paint) null);
            createBitmap.recycle();
            canvas.restore();
        }
    }

    /* renamed from: T */
    private static int m1986T(int i, int i2) {
        return (i * (i2 + (i2 >>> 7))) >>> 8;
    }

    /* renamed from: U */
    private void m1985U(Canvas canvas) {
        canvas.translate(m2004B(), m2003C());
    }

    /* renamed from: f */
    private PorterDuffColorFilter m1970f(Paint paint, boolean z) {
        if (!z) {
            return null;
        }
        int color = paint.getColor();
        int l = m1958l(color);
        this.f39448E = l;
        if (l != color) {
            return new PorterDuffColorFilter(l, PorterDuff.Mode.SRC_IN);
        }
        return null;
    }

    /* renamed from: g */
    private void m1968g(RectF rectF, Path path) {
        m1966h(rectF, path);
        if (this.f31619k.f31647j != 1.0f) {
            this.f31624p.reset();
            Matrix matrix = this.f31624p;
            float f = this.f31619k.f31647j;
            matrix.setScale(f, f, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(this.f31624p);
        }
        path.computeBounds(this.f39449F, true);
    }

    /* renamed from: i */
    private void m1964i() {
        C14045k y = m2001E().m1911y(new C14040b(-m2000F()));
        this.f31631w = y;
        this.f39445B.m1874d(y, this.f31619k.f31648k, m1948v(), this.f31626r);
    }

    /* renamed from: i0 */
    private boolean m1963i0(int[] iArr) {
        boolean z;
        int color;
        int colorForState;
        int color2;
        int colorForState2;
        if (this.f31619k.f31641d == null || color2 == (colorForState2 = this.f31619k.f31641d.getColorForState(iArr, (color2 = this.f31632x.getColor())))) {
            z = false;
        } else {
            this.f31632x.setColor(colorForState2);
            z = true;
        }
        if (this.f31619k.f31642e == null || color == (colorForState = this.f31619k.f31642e.getColorForState(iArr, (color = this.f31633y.getColor())))) {
            return z;
        }
        this.f31633y.setColor(colorForState);
        return true;
    }

    /* renamed from: j */
    private PorterDuffColorFilter m1962j(ColorStateList colorStateList, PorterDuff.Mode mode, boolean z) {
        int colorForState = colorStateList.getColorForState(getState(), 0);
        if (z) {
            colorForState = m1958l(colorForState);
        }
        this.f39448E = colorForState;
        return new PorterDuffColorFilter(colorForState, mode);
    }

    /* renamed from: j0 */
    private boolean m1961j0() {
        PorterDuffColorFilter porterDuffColorFilter = this.f39446C;
        PorterDuffColorFilter porterDuffColorFilter2 = this.f39447D;
        C14041c cVar = this.f31619k;
        this.f39446C = m1960k(cVar.f31644g, cVar.f31645h, this.f31632x, true);
        C14041c cVar2 = this.f31619k;
        this.f39447D = m1960k(cVar2.f31643f, cVar2.f31645h, this.f31633y, false);
        C14041c cVar3 = this.f31619k;
        if (cVar3.f31658u) {
            this.f31634z.m2529d(cVar3.f31644g.getColorForState(getState(), 0));
        }
        if (!C2513d.m37601a(porterDuffColorFilter, this.f39446C) || !C2513d.m37601a(porterDuffColorFilter2, this.f39447D)) {
            return true;
        }
        return false;
    }

    /* renamed from: k */
    private PorterDuffColorFilter m1960k(ColorStateList colorStateList, PorterDuff.Mode mode, Paint paint, boolean z) {
        if (colorStateList == null || mode == null) {
            return m1970f(paint, z);
        }
        return m1962j(colorStateList, mode, z);
    }

    /* renamed from: k0 */
    private void m1959k0() {
        float K = m1995K();
        this.f31619k.f31655r = (int) Math.ceil(0.75f * K);
        this.f31619k.f31656s = (int) Math.ceil(K * 0.25f);
        m1961j0();
        m1990P();
    }

    /* renamed from: m */
    public static C14038g m1957m(Context context, float f) {
        int c = C10395a.m13518c(context, C6803b.f14539m, C14038g.class.getSimpleName());
        C14038g gVar = new C14038g();
        gVar.m1991O(context);
        gVar.m1981Y(ColorStateList.valueOf(c));
        gVar.m1982X(f);
        return gVar;
    }

    /* renamed from: n */
    private void m1956n(Canvas canvas) {
        if (this.f31622n.cardinality() > 0) {
            Log.w(f39442H, "Compatibility shadow requested but can't be drawn for all operations in this shape.");
        }
        if (this.f31619k.f31656s != 0) {
            canvas.drawPath(this.f31625q, this.f31634z.m2530c());
        }
        for (int i = 0; i < 4; i++) {
            this.f31620l[i].m1813b(this.f31634z, this.f31619k.f31655r, canvas);
            this.f31621m[i].m1813b(this.f31634z, this.f31619k.f31655r, canvas);
        }
        if (this.f39450G) {
            int B = m2004B();
            int C = m2003C();
            canvas.translate(-B, -C);
            canvas.drawPath(this.f31625q, f39443I);
            canvas.translate(B, C);
        }
    }

    /* renamed from: o */
    private void m1955o(Canvas canvas) {
        m1953q(canvas, this.f31632x, this.f31625q, this.f31619k.f31638a, m1949u());
    }

    /* renamed from: q */
    private void m1953q(Canvas canvas, Paint paint, Path path, C14045k kVar, RectF rectF) {
        if (kVar.m1915u(rectF)) {
            float a = kVar.m1916t().mo1937a(rectF) * this.f31619k.f31648k;
            canvas.drawRoundRect(rectF, a, a, paint);
            return;
        }
        canvas.drawPath(path, paint);
    }

    /* renamed from: v */
    private RectF m1948v() {
        this.f31628t.set(m1949u());
        float F = m2000F();
        this.f31628t.inset(F, F);
        return this.f31628t;
    }

    /* renamed from: A */
    public int m2005A() {
        return this.f39448E;
    }

    /* renamed from: B */
    public int m2004B() {
        C14041c cVar = this.f31619k;
        return (int) (cVar.f31656s * Math.sin(Math.toRadians(cVar.f31657t)));
    }

    /* renamed from: C */
    public int m2003C() {
        C14041c cVar = this.f31619k;
        return (int) (cVar.f31656s * Math.cos(Math.toRadians(cVar.f31657t)));
    }

    /* renamed from: D */
    public int m2002D() {
        return this.f31619k.f31655r;
    }

    /* renamed from: E */
    public C14045k m2001E() {
        return this.f31619k.f31638a;
    }

    /* renamed from: G */
    public ColorStateList m1999G() {
        return this.f31619k.f31644g;
    }

    /* renamed from: H */
    public float m1998H() {
        return this.f31619k.f31638a.m1918r().mo1937a(m1949u());
    }

    /* renamed from: I */
    public float m1997I() {
        return this.f31619k.f31638a.m1916t().mo1937a(m1949u());
    }

    /* renamed from: J */
    public float m1996J() {
        return this.f31619k.f31653p;
    }

    /* renamed from: K */
    public float m1995K() {
        return m1947w() + m1996J();
    }

    /* renamed from: O */
    public void m1991O(Context context) {
        this.f31619k.f31639b = new C11247a(context);
        m1959k0();
    }

    /* renamed from: Q */
    public boolean m1989Q() {
        C11247a aVar = this.f31619k.f31639b;
        if (aVar == null || !aVar.m10364d()) {
            return false;
        }
        return true;
    }

    /* renamed from: R */
    public boolean m1988R() {
        return this.f31619k.f31638a.m1915u(m1949u());
    }

    /* renamed from: V */
    public boolean m1984V() {
        int i = Build.VERSION.SDK_INT;
        if (m1988R() || this.f31625q.isConvex() || i >= 29) {
            return false;
        }
        return true;
    }

    /* renamed from: W */
    public void m1983W(AbstractC14034c cVar) {
        setShapeAppearanceModel(this.f31619k.f31638a.m1912x(cVar));
    }

    /* renamed from: X */
    public void m1982X(float f) {
        C14041c cVar = this.f31619k;
        if (cVar.f31652o != f) {
            cVar.f31652o = f;
            m1959k0();
        }
    }

    /* renamed from: Y */
    public void m1981Y(ColorStateList colorStateList) {
        C14041c cVar = this.f31619k;
        if (cVar.f31641d != colorStateList) {
            cVar.f31641d = colorStateList;
            onStateChange(getState());
        }
    }

    /* renamed from: Z */
    public void m1980Z(float f) {
        C14041c cVar = this.f31619k;
        if (cVar.f31648k != f) {
            cVar.f31648k = f;
            this.f31623o = true;
            invalidateSelf();
        }
    }

    /* renamed from: a0 */
    public void m1979a0(int i, int i2, int i3, int i4) {
        C14041c cVar = this.f31619k;
        if (cVar.f31646i == null) {
            cVar.f31646i = new Rect();
        }
        this.f31619k.f31646i.set(i, i2, i3, i4);
        invalidateSelf();
    }

    /* renamed from: b0 */
    public void m1977b0(float f) {
        C14041c cVar = this.f31619k;
        if (cVar.f31651n != f) {
            cVar.f31651n = f;
            m1959k0();
        }
    }

    /* renamed from: c0 */
    public void m1975c0(boolean z) {
        this.f39450G = z;
    }

    /* renamed from: d0 */
    public void m1973d0(int i) {
        this.f31634z.m2529d(i);
        this.f31619k.f31658u = false;
        m1990P();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        this.f31632x.setColorFilter(this.f39446C);
        int alpha = this.f31632x.getAlpha();
        this.f31632x.setAlpha(m1986T(alpha, this.f31619k.f31650m));
        this.f31633y.setColorFilter(this.f39447D);
        this.f31633y.setStrokeWidth(this.f31619k.f31649l);
        int alpha2 = this.f31633y.getAlpha();
        this.f31633y.setAlpha(m1986T(alpha2, this.f31619k.f31650m));
        if (this.f31623o) {
            m1964i();
            m1968g(m1949u(), this.f31625q);
            this.f31623o = false;
        }
        m1987S(canvas);
        if (m1993M()) {
            m1955o(canvas);
        }
        if (m1992N()) {
            mo1952r(canvas);
        }
        this.f31632x.setAlpha(alpha);
        this.f31633y.setAlpha(alpha2);
    }

    /* renamed from: e0 */
    public void m1971e0(float f, int i) {
        m1965h0(f);
        m1967g0(ColorStateList.valueOf(i));
    }

    /* renamed from: f0 */
    public void m1969f0(float f, ColorStateList colorStateList) {
        m1965h0(f);
        m1967g0(colorStateList);
    }

    /* renamed from: g0 */
    public void m1967g0(ColorStateList colorStateList) {
        C14041c cVar = this.f31619k;
        if (cVar.f31642e != colorStateList) {
            cVar.f31642e = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f31619k.f31650m;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.f31619k;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    @TargetApi(21)
    public void getOutline(Outline outline) {
        if (this.f31619k.f31654q != 2) {
            if (m1988R()) {
                outline.setRoundRect(getBounds(), m1998H() * this.f31619k.f31648k);
                return;
            }
            m1968g(m1949u(), this.f31625q);
            if (this.f31625q.isConvex() || Build.VERSION.SDK_INT >= 29) {
                try {
                    outline.setConvexPath(this.f31625q);
                } catch (IllegalArgumentException unused) {
                }
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        Rect rect2 = this.f31619k.f31646i;
        if (rect2 == null) {
            return super.getPadding(rect);
        }
        rect.set(rect2);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public Region getTransparentRegion() {
        this.f31629u.set(getBounds());
        m1968g(m1949u(), this.f31625q);
        this.f31630v.setPath(this.f31625q, this.f31629u);
        this.f31629u.op(this.f31630v, Region.Op.DIFFERENCE);
        return this.f31629u;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: h */
    public final void m1966h(RectF rectF, Path path) {
        C14049l lVar = this.f39445B;
        C14041c cVar = this.f31619k;
        lVar.m1873e(cVar.f31638a, cVar.f31648k, rectF, this.f39444A, path);
    }

    /* renamed from: h0 */
    public void m1965h0(float f) {
        this.f31619k.f31649l = f;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        this.f31623o = true;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        ColorStateList colorStateList3;
        ColorStateList colorStateList4;
        if (super.isStateful() || (((colorStateList = this.f31619k.f31644g) != null && colorStateList.isStateful()) || (((colorStateList2 = this.f31619k.f31643f) != null && colorStateList2.isStateful()) || (((colorStateList3 = this.f31619k.f31642e) != null && colorStateList3.isStateful()) || ((colorStateList4 = this.f31619k.f31641d) != null && colorStateList4.isStateful()))))) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: l */
    public int m1958l(int i) {
        float K = m1995K() + m1944z();
        C11247a aVar = this.f31619k.f31639b;
        if (aVar != null) {
            return aVar.m10365c(i, K);
        }
        return i;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        this.f31619k = new C14041c(this.f31619k);
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        this.f31623o = true;
        super.onBoundsChange(rect);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.graphics.drawable.Drawable, com.google.android.material.internal.C5658k.AbstractC5660b
    public boolean onStateChange(int[] iArr) {
        boolean z;
        boolean i0 = m1963i0(iArr);
        boolean j0 = m1961j0();
        if (i0 || j0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            invalidateSelf();
        }
        return z;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: p */
    public void m1954p(Canvas canvas, Paint paint, Path path, RectF rectF) {
        m1953q(canvas, paint, path, this.f31619k.f31638a, rectF);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: r */
    public void mo1952r(Canvas canvas) {
        m1953q(canvas, this.f31633y, this.f31626r, this.f31631w, m1948v());
    }

    /* renamed from: s */
    public float m1951s() {
        return this.f31619k.f31638a.m1926j().mo1937a(m1949u());
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        C14041c cVar = this.f31619k;
        if (cVar.f31650m != i) {
            cVar.f31650m = i;
            m1990P();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f31619k.f31640c = colorFilter;
        m1990P();
    }

    @Override // p422xb.AbstractC14061n
    public void setShapeAppearanceModel(C14045k kVar) {
        this.f31619k.f31638a = kVar;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.f31619k.f31644g = colorStateList;
        m1961j0();
        m1990P();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        C14041c cVar = this.f31619k;
        if (cVar.f31645h != mode) {
            cVar.f31645h = mode;
            m1961j0();
            m1990P();
        }
    }

    /* renamed from: t */
    public float m1950t() {
        return this.f31619k.f31638a.m1924l().mo1937a(m1949u());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: u */
    public RectF m1949u() {
        this.f31627s.set(getBounds());
        return this.f31627s;
    }

    /* renamed from: w */
    public float m1947w() {
        return this.f31619k.f31652o;
    }

    /* renamed from: x */
    public ColorStateList m1946x() {
        return this.f31619k.f31641d;
    }

    /* renamed from: y */
    public float m1945y() {
        return this.f31619k.f31648k;
    }

    /* renamed from: z */
    public float m1944z() {
        return this.f31619k.f31651n;
    }

    public C14038g() {
        this(new C14045k());
    }

    public C14038g(Context context, AttributeSet attributeSet, int i, int i2) {
        this(C14045k.m1931e(context, attributeSet, i, i2).m1892m());
    }

    public C14038g(C14045k kVar) {
        this(new C14041c(kVar, null));
    }

    private C14038g(C14041c cVar) {
        C14049l lVar;
        this.f31620l = new C14053m.AbstractC14060g[4];
        this.f31621m = new C14053m.AbstractC14060g[4];
        this.f31622n = new BitSet(8);
        this.f31624p = new Matrix();
        this.f31625q = new Path();
        this.f31626r = new Path();
        this.f31627s = new RectF();
        this.f31628t = new RectF();
        this.f31629u = new Region();
        this.f31630v = new Region();
        Paint paint = new Paint(1);
        this.f31632x = paint;
        Paint paint2 = new Paint(1);
        this.f31633y = paint2;
        this.f31634z = new C13857a();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            lVar = C14049l.m1867k();
        } else {
            lVar = new C14049l();
        }
        this.f39445B = lVar;
        this.f39449F = new RectF();
        this.f39450G = true;
        this.f31619k = cVar;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        m1961j0();
        m1963i0(getState());
        this.f39444A = new C14039a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: xb.g$c */
    /* loaded from: classes3.dex */
    public static final class C14041c extends Drawable.ConstantState {

        /* renamed from: a */
        public C14045k f31638a;

        /* renamed from: b */
        public C11247a f31639b;

        /* renamed from: c */
        public ColorFilter f31640c;

        /* renamed from: d */
        public ColorStateList f31641d;

        /* renamed from: e */
        public ColorStateList f31642e;

        /* renamed from: f */
        public ColorStateList f31643f;

        /* renamed from: g */
        public ColorStateList f31644g;

        /* renamed from: h */
        public PorterDuff.Mode f31645h;

        /* renamed from: i */
        public Rect f31646i;

        /* renamed from: j */
        public float f31647j;

        /* renamed from: k */
        public float f31648k;

        /* renamed from: l */
        public float f31649l;

        /* renamed from: m */
        public int f31650m;

        /* renamed from: n */
        public float f31651n;

        /* renamed from: o */
        public float f31652o;

        /* renamed from: p */
        public float f31653p;

        /* renamed from: q */
        public int f31654q;

        /* renamed from: r */
        public int f31655r;

        /* renamed from: s */
        public int f31656s;

        /* renamed from: t */
        public int f31657t;

        /* renamed from: u */
        public boolean f31658u;

        /* renamed from: v */
        public Paint.Style f31659v;

        public C14041c(C14045k kVar, C11247a aVar) {
            this.f31641d = null;
            this.f31642e = null;
            this.f31643f = null;
            this.f31644g = null;
            this.f31645h = PorterDuff.Mode.SRC_IN;
            this.f31646i = null;
            this.f31647j = 1.0f;
            this.f31648k = 1.0f;
            this.f31650m = 255;
            this.f31651n = 0.0f;
            this.f31652o = 0.0f;
            this.f31653p = 0.0f;
            this.f31654q = 0;
            this.f31655r = 0;
            this.f31656s = 0;
            this.f31657t = 0;
            this.f31658u = false;
            this.f31659v = Paint.Style.FILL_AND_STROKE;
            this.f31638a = kVar;
            this.f31639b = aVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            C14038g gVar = new C14038g(this, null);
            gVar.f31623o = true;
            return gVar;
        }

        public C14041c(C14041c cVar) {
            this.f31641d = null;
            this.f31642e = null;
            this.f31643f = null;
            this.f31644g = null;
            this.f31645h = PorterDuff.Mode.SRC_IN;
            this.f31646i = null;
            this.f31647j = 1.0f;
            this.f31648k = 1.0f;
            this.f31650m = 255;
            this.f31651n = 0.0f;
            this.f31652o = 0.0f;
            this.f31653p = 0.0f;
            this.f31654q = 0;
            this.f31655r = 0;
            this.f31656s = 0;
            this.f31657t = 0;
            this.f31658u = false;
            this.f31659v = Paint.Style.FILL_AND_STROKE;
            this.f31638a = cVar.f31638a;
            this.f31639b = cVar.f31639b;
            this.f31649l = cVar.f31649l;
            this.f31640c = cVar.f31640c;
            this.f31641d = cVar.f31641d;
            this.f31642e = cVar.f31642e;
            this.f31645h = cVar.f31645h;
            this.f31644g = cVar.f31644g;
            this.f31650m = cVar.f31650m;
            this.f31647j = cVar.f31647j;
            this.f31656s = cVar.f31656s;
            this.f31654q = cVar.f31654q;
            this.f31658u = cVar.f31658u;
            this.f31648k = cVar.f31648k;
            this.f31651n = cVar.f31651n;
            this.f31652o = cVar.f31652o;
            this.f31653p = cVar.f31653p;
            this.f31655r = cVar.f31655r;
            this.f31657t = cVar.f31657t;
            this.f31643f = cVar.f31643f;
            this.f31659v = cVar.f31659v;
            if (cVar.f31646i != null) {
                this.f31646i = new Rect(cVar.f31646i);
            }
        }
    }
}
