package androidx.vectordrawable.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import androidx.collection.C2094a;
import androidx.core.content.res.C2358d;
import androidx.core.content.res.C2367h;
import androidx.core.content.res.C2379l;
import androidx.core.graphics.C2391d;
import androidx.core.graphics.drawable.C2400a;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.react.uimanager.ViewProps;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: androidx.vectordrawable.graphics.drawable.h */
/* loaded from: classes.dex */
public class C3294h extends AbstractC3293g {

    /* renamed from: u */
    static final PorterDuff.Mode f5207u = PorterDuff.Mode.SRC_IN;

    /* renamed from: l */
    private C0069h f5208l;

    /* renamed from: m */
    private PorterDuffColorFilter f5209m;

    /* renamed from: n */
    private ColorFilter f5210n;

    /* renamed from: o */
    private boolean f5211o;

    /* renamed from: p */
    private boolean f5212p;

    /* renamed from: q */
    private Drawable.ConstantState f5213q;

    /* renamed from: r */
    private final float[] f5214r;

    /* renamed from: s */
    private final Matrix f5215s;

    /* renamed from: t */
    private final Rect f5216t;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.vectordrawable.graphics.drawable.h$b */
    /* loaded from: classes.dex */
    public static class C3296b extends AbstractC3300f {
        C3296b() {
        }

        /* renamed from: f */
        private void m34779f(TypedArray typedArray, XmlPullParser xmlPullParser) {
            String string = typedArray.getString(0);
            if (string != null) {
                this.f5243b = string;
            }
            String string2 = typedArray.getString(1);
            if (string2 != null) {
                this.f5242a = C2391d.m37903d(string2);
            }
            this.f5244c = C2379l.m37953g(typedArray, xmlPullParser, "fillType", 2, 0);
        }

        @Override // androidx.vectordrawable.graphics.drawable.C3294h.AbstractC3300f
        /* renamed from: c */
        public boolean mo34769c() {
            return true;
        }

        /* renamed from: e */
        public void m34780e(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            if (C2379l.m37950j(xmlPullParser, "pathData")) {
                TypedArray k = C2379l.m37949k(resources, theme, attributeSet, C3284a.f5182d);
                m34779f(k, xmlPullParser);
                k.recycle();
            }
        }

        C3296b(C3296b bVar) {
            super(bVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.vectordrawable.graphics.drawable.h$e */
    /* loaded from: classes.dex */
    public static abstract class AbstractC3299e {
        private AbstractC3299e() {
        }

        /* renamed from: a */
        public boolean mo34771a() {
            return false;
        }

        /* renamed from: b */
        public boolean mo34770b(int[] iArr) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.vectordrawable.graphics.drawable.h$h */
    /* loaded from: classes.dex */
    public static class C0069h extends Drawable.ConstantState {

        /* renamed from: a */
        int f5263a;

        /* renamed from: b */
        C3301g f5264b;

        /* renamed from: c */
        ColorStateList f5265c;

        /* renamed from: d */
        PorterDuff.Mode f5266d;

        /* renamed from: e */
        boolean f5267e;

        /* renamed from: f */
        Bitmap f5268f;

        /* renamed from: g */
        ColorStateList f5269g;

        /* renamed from: h */
        PorterDuff.Mode f5270h;

        /* renamed from: i */
        int f5271i;

        /* renamed from: j */
        boolean f5272j;

        /* renamed from: k */
        boolean f5273k;

        /* renamed from: l */
        Paint f5274l;

        public C0069h(C0069h hVar) {
            this.f5265c = null;
            this.f5266d = C3294h.f5207u;
            if (hVar != null) {
                this.f5263a = hVar.f5263a;
                C3301g gVar = new C3301g(hVar.f5264b);
                this.f5264b = gVar;
                if (hVar.f5264b.f5251e != null) {
                    gVar.f5251e = new Paint(hVar.f5264b.f5251e);
                }
                if (hVar.f5264b.f5250d != null) {
                    this.f5264b.f5250d = new Paint(hVar.f5264b.f5250d);
                }
                this.f5265c = hVar.f5265c;
                this.f5266d = hVar.f5266d;
                this.f5267e = hVar.f5267e;
            }
        }

        /* renamed from: a */
        public boolean m34760a(int i, int i2) {
            if (i == this.f5268f.getWidth() && i2 == this.f5268f.getHeight()) {
                return true;
            }
            return false;
        }

        /* renamed from: b */
        public boolean m34759b() {
            if (!this.f5273k && this.f5269g == this.f5265c && this.f5270h == this.f5266d && this.f5272j == this.f5267e && this.f5271i == this.f5264b.getRootAlpha()) {
                return true;
            }
            return false;
        }

        /* renamed from: c */
        public void m34758c(int i, int i2) {
            if (this.f5268f == null || !m34760a(i, i2)) {
                this.f5268f = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
                this.f5273k = true;
            }
        }

        /* renamed from: d */
        public void m34757d(Canvas canvas, ColorFilter colorFilter, Rect rect) {
            canvas.drawBitmap(this.f5268f, (Rect) null, rect, m34756e(colorFilter));
        }

        /* renamed from: e */
        public Paint m34756e(ColorFilter colorFilter) {
            if (!m34755f() && colorFilter == null) {
                return null;
            }
            if (this.f5274l == null) {
                Paint paint = new Paint();
                this.f5274l = paint;
                paint.setFilterBitmap(true);
            }
            this.f5274l.setAlpha(this.f5264b.getRootAlpha());
            this.f5274l.setColorFilter(colorFilter);
            return this.f5274l;
        }

        /* renamed from: f */
        public boolean m34755f() {
            return this.f5264b.getRootAlpha() < 255;
        }

        /* renamed from: g */
        public boolean m34754g() {
            return this.f5264b.m34762f();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f5263a;
        }

        /* renamed from: h */
        public boolean m34753h(int[] iArr) {
            boolean g = this.f5264b.m34761g(iArr);
            this.f5273k |= g;
            return g;
        }

        /* renamed from: i */
        public void m34752i() {
            this.f5269g = this.f5265c;
            this.f5270h = this.f5266d;
            this.f5271i = this.f5264b.getRootAlpha();
            this.f5272j = this.f5267e;
            this.f5273k = false;
        }

        /* renamed from: j */
        public void m34751j(int i, int i2) {
            this.f5268f.eraseColor(0);
            this.f5264b.m34766b(new Canvas(this.f5268f), i, i2, null);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return new C3294h(this);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            return new C3294h(this);
        }

        public C0069h() {
            this.f5265c = null;
            this.f5266d = C3294h.f5207u;
            this.f5264b = new C3301g();
        }
    }

    C3294h() {
        this.f5212p = true;
        this.f5214r = new float[9];
        this.f5215s = new Matrix();
        this.f5216t = new Rect();
        this.f5208l = new C0069h();
    }

    /* renamed from: a */
    static int m34790a(int i, float f) {
        return (i & 16777215) | (((int) (Color.alpha(i) * f)) << 24);
    }

    /* renamed from: b */
    public static C3294h m34789b(Resources resources, int i, Resources.Theme theme) {
        int next;
        if (Build.VERSION.SDK_INT >= 24) {
            C3294h hVar = new C3294h();
            hVar.f5206k = C2367h.m37984f(resources, i, theme);
            hVar.f5213q = new C3302i(hVar.f5206k.getConstantState());
            return hVar;
        }
        try {
            XmlResourceParser xml = resources.getXml(i);
            AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
            while (true) {
                next = xml.next();
                if (next == 2 || next == 1) {
                    break;
                }
            }
            if (next == 2) {
                return m34788c(resources, xml, asAttributeSet, theme);
            }
            throw new XmlPullParserException("No start tag found");
        } catch (IOException e) {
            Log.e("VectorDrawableCompat", "parser error", e);
            return null;
        } catch (XmlPullParserException e2) {
            Log.e("VectorDrawableCompat", "parser error", e2);
            return null;
        }
    }

    /* renamed from: c */
    public static C3294h m34788c(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        C3294h hVar = new C3294h();
        hVar.inflate(resources, xmlPullParser, attributeSet, theme);
        return hVar;
    }

    /* renamed from: e */
    private void m34786e(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        C0069h hVar = this.f5208l;
        C3301g gVar = hVar.f5264b;
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.push(gVar.f5254h);
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        boolean z = true;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                C3298d dVar = (C3298d) arrayDeque.peek();
                if ("path".equals(name)) {
                    C3297c cVar = new C3297c();
                    cVar.m34776g(resources, attributeSet, theme, xmlPullParser);
                    dVar.f5230b.add(cVar);
                    if (cVar.getPathName() != null) {
                        gVar.f5262p.put(cVar.getPathName(), cVar);
                    }
                    hVar.f5263a = cVar.f5245d | hVar.f5263a;
                    z = false;
                } else if ("clip-path".equals(name)) {
                    C3296b bVar = new C3296b();
                    bVar.m34780e(resources, attributeSet, theme, xmlPullParser);
                    dVar.f5230b.add(bVar);
                    if (bVar.getPathName() != null) {
                        gVar.f5262p.put(bVar.getPathName(), bVar);
                    }
                    hVar.f5263a = bVar.f5245d | hVar.f5263a;
                } else if ("group".equals(name)) {
                    C3298d dVar2 = new C3298d();
                    dVar2.m34774c(resources, attributeSet, theme, xmlPullParser);
                    dVar.f5230b.add(dVar2);
                    arrayDeque.push(dVar2);
                    if (dVar2.getGroupName() != null) {
                        gVar.f5262p.put(dVar2.getGroupName(), dVar2);
                    }
                    hVar.f5263a = dVar2.f5239k | hVar.f5263a;
                }
            } else if (eventType == 3 && "group".equals(xmlPullParser.getName())) {
                arrayDeque.pop();
            }
            eventType = xmlPullParser.next();
        }
        if (z) {
            throw new XmlPullParserException("no path defined");
        }
    }

    /* renamed from: f */
    private boolean m34785f() {
        if (!isAutoMirrored() || C2400a.m37837f(this) != 1) {
            return false;
        }
        return true;
    }

    /* renamed from: g */
    private static PorterDuff.Mode m34784g(int i, PorterDuff.Mode mode) {
        if (i == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }

    /* renamed from: i */
    private void m34782i(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) {
        C0069h hVar = this.f5208l;
        C3301g gVar = hVar.f5264b;
        hVar.f5266d = m34784g(C2379l.m37953g(typedArray, xmlPullParser, "tintMode", 6, -1), PorterDuff.Mode.SRC_IN);
        ColorStateList c = C2379l.m37957c(typedArray, xmlPullParser, theme, "tint", 1);
        if (c != null) {
            hVar.f5265c = c;
        }
        hVar.f5267e = C2379l.m37959a(typedArray, xmlPullParser, "autoMirrored", 5, hVar.f5267e);
        gVar.f5257k = C2379l.m37954f(typedArray, xmlPullParser, "viewportWidth", 7, gVar.f5257k);
        float f = C2379l.m37954f(typedArray, xmlPullParser, "viewportHeight", 8, gVar.f5258l);
        gVar.f5258l = f;
        if (gVar.f5257k <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        } else if (f > 0.0f) {
            gVar.f5255i = typedArray.getDimension(3, gVar.f5255i);
            float dimension = typedArray.getDimension(2, gVar.f5256j);
            gVar.f5256j = dimension;
            if (gVar.f5255i <= 0.0f) {
                throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires width > 0");
            } else if (dimension > 0.0f) {
                gVar.setAlpha(C2379l.m37954f(typedArray, xmlPullParser, "alpha", 4, gVar.getAlpha()));
                String string = typedArray.getString(0);
                if (string != null) {
                    gVar.f5260n = string;
                    gVar.f5262p.put(string, gVar);
                }
            } else {
                throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires height > 0");
            }
        } else {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
        }
    }

    @Override // androidx.vectordrawable.graphics.drawable.AbstractC3293g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        Drawable drawable = this.f5206k;
        if (drawable == null) {
            return false;
        }
        C2400a.m37841b(drawable);
        return false;
    }

    @Override // androidx.vectordrawable.graphics.drawable.AbstractC3293g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void clearColorFilter() {
        super.clearColorFilter();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public Object m34787d(String str) {
        return this.f5208l.f5264b.f5262p.get(str);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Drawable drawable = this.f5206k;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        copyBounds(this.f5216t);
        if (this.f5216t.width() > 0 && this.f5216t.height() > 0) {
            ColorFilter colorFilter = this.f5210n;
            if (colorFilter == null) {
                colorFilter = this.f5209m;
            }
            canvas.getMatrix(this.f5215s);
            this.f5215s.getValues(this.f5214r);
            float abs = Math.abs(this.f5214r[0]);
            float abs2 = Math.abs(this.f5214r[4]);
            float abs3 = Math.abs(this.f5214r[1]);
            float abs4 = Math.abs(this.f5214r[3]);
            if (!(abs3 == 0.0f && abs4 == 0.0f)) {
                abs = 1.0f;
                abs2 = 1.0f;
            }
            int min = Math.min((int) RecyclerView.ItemAnimator.FLAG_MOVED, (int) (this.f5216t.width() * abs));
            int min2 = Math.min((int) RecyclerView.ItemAnimator.FLAG_MOVED, (int) (this.f5216t.height() * abs2));
            if (min > 0 && min2 > 0) {
                int save = canvas.save();
                Rect rect = this.f5216t;
                canvas.translate(rect.left, rect.top);
                if (m34785f()) {
                    canvas.translate(this.f5216t.width(), 0.0f);
                    canvas.scale(-1.0f, 1.0f);
                }
                this.f5216t.offsetTo(0, 0);
                this.f5208l.m34758c(min, min2);
                if (!this.f5212p) {
                    this.f5208l.m34751j(min, min2);
                } else if (!this.f5208l.m34759b()) {
                    this.f5208l.m34751j(min, min2);
                    this.f5208l.m34752i();
                }
                this.f5208l.m34757d(canvas, colorFilter, this.f5216t);
                canvas.restoreToCount(save);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        Drawable drawable = this.f5206k;
        if (drawable != null) {
            return C2400a.m37839d(drawable);
        }
        return this.f5208l.f5264b.getRootAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        Drawable drawable = this.f5206k;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        return super.getChangingConfigurations() | this.f5208l.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        Drawable drawable = this.f5206k;
        if (drawable != null) {
            return C2400a.m37838e(drawable);
        }
        return this.f5210n;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        if (this.f5206k != null && Build.VERSION.SDK_INT >= 24) {
            return new C3302i(this.f5206k.getConstantState());
        }
        this.f5208l.f5263a = getChangingConfigurations();
        return this.f5208l;
    }

    @Override // androidx.vectordrawable.graphics.drawable.AbstractC3293g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        Drawable drawable = this.f5206k;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return (int) this.f5208l.f5264b.f5256j;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        Drawable drawable = this.f5206k;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return (int) this.f5208l.f5264b.f5255i;
    }

    @Override // androidx.vectordrawable.graphics.drawable.AbstractC3293g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumHeight() {
        return super.getMinimumHeight();
    }

    @Override // androidx.vectordrawable.graphics.drawable.AbstractC3293g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumWidth() {
        return super.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Drawable drawable = this.f5206k;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    @Override // androidx.vectordrawable.graphics.drawable.AbstractC3293g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean getPadding(Rect rect) {
        return super.getPadding(rect);
    }

    @Override // androidx.vectordrawable.graphics.drawable.AbstractC3293g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int[] getState() {
        return super.getState();
    }

    @Override // androidx.vectordrawable.graphics.drawable.AbstractC3293g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Region getTransparentRegion() {
        return super.getTransparentRegion();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public void m34783h(boolean z) {
        this.f5212p = z;
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        Drawable drawable = this.f5206k;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        Drawable drawable = this.f5206k;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        Drawable drawable = this.f5206k;
        if (drawable != null) {
            return C2400a.m37835h(drawable);
        }
        return this.f5208l.f5267e;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        C0069h hVar;
        ColorStateList colorStateList;
        Drawable drawable = this.f5206k;
        if (drawable != null) {
            return drawable.isStateful();
        }
        if (super.isStateful() || ((hVar = this.f5208l) != null && (hVar.m34754g() || ((colorStateList = this.f5208l.f5265c) != null && colorStateList.isStateful())))) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    PorterDuffColorFilter m34781j(PorterDuffColorFilter porterDuffColorFilter, ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    @Override // androidx.vectordrawable.graphics.drawable.AbstractC3293g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void jumpToCurrentState() {
        super.jumpToCurrentState();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        Drawable drawable = this.f5206k;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.f5211o && super.mutate() == this) {
            this.f5208l = new C0069h(this.f5208l);
            this.f5211o = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        Drawable drawable = this.f5206k;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        boolean z;
        PorterDuff.Mode mode;
        Drawable drawable = this.f5206k;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        C0069h hVar = this.f5208l;
        ColorStateList colorStateList = hVar.f5265c;
        if (colorStateList == null || (mode = hVar.f5266d) == null) {
            z = false;
        } else {
            this.f5209m = m34781j(this.f5209m, colorStateList, mode);
            invalidateSelf();
            z = true;
        }
        if (!hVar.m34754g() || !hVar.m34753h(iArr)) {
            return z;
        }
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void scheduleSelf(Runnable runnable, long j) {
        Drawable drawable = this.f5206k;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j);
        } else {
            super.scheduleSelf(runnable, j);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        Drawable drawable = this.f5206k;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else if (this.f5208l.f5264b.getRootAlpha() != i) {
            this.f5208l.f5264b.setRootAlpha(i);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z) {
        Drawable drawable = this.f5206k;
        if (drawable != null) {
            C2400a.m37833j(drawable, z);
        } else {
            this.f5208l.f5267e = z;
        }
    }

    @Override // androidx.vectordrawable.graphics.drawable.AbstractC3293g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setChangingConfigurations(int i) {
        super.setChangingConfigurations(i);
    }

    @Override // androidx.vectordrawable.graphics.drawable.AbstractC3293g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setColorFilter(int i, PorterDuff.Mode mode) {
        super.setColorFilter(i, mode);
    }

    @Override // androidx.vectordrawable.graphics.drawable.AbstractC3293g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setFilterBitmap(boolean z) {
        super.setFilterBitmap(z);
    }

    @Override // androidx.vectordrawable.graphics.drawable.AbstractC3293g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspot(float f, float f2) {
        super.setHotspot(f, f2);
    }

    @Override // androidx.vectordrawable.graphics.drawable.AbstractC3293g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspotBounds(int i, int i2, int i3, int i4) {
        super.setHotspotBounds(i, i2, i3, i4);
    }

    @Override // androidx.vectordrawable.graphics.drawable.AbstractC3293g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean setState(int[] iArr) {
        return super.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(int i) {
        Drawable drawable = this.f5206k;
        if (drawable != null) {
            C2400a.m37829n(drawable, i);
        } else {
            setTintList(ColorStateList.valueOf(i));
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f5206k;
        if (drawable != null) {
            C2400a.m37828o(drawable, colorStateList);
            return;
        }
        C0069h hVar = this.f5208l;
        if (hVar.f5265c != colorStateList) {
            hVar.f5265c = colorStateList;
            this.f5209m = m34781j(this.f5209m, colorStateList, hVar.f5266d);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f5206k;
        if (drawable != null) {
            C2400a.m37827p(drawable, mode);
            return;
        }
        C0069h hVar = this.f5208l;
        if (hVar.f5266d != mode) {
            hVar.f5266d = mode;
            this.f5209m = m34781j(this.f5209m, hVar.f5265c, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.f5206k;
        if (drawable != null) {
            return drawable.setVisible(z, z2);
        }
        return super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Drawable
    public void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.f5206k;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    /* renamed from: androidx.vectordrawable.graphics.drawable.h$i */
    /* loaded from: classes.dex */
    private static class C3302i extends Drawable.ConstantState {

        /* renamed from: a */
        private final Drawable.ConstantState f5275a;

        public C3302i(Drawable.ConstantState constantState) {
            this.f5275a = constantState;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public boolean canApplyTheme() {
            return this.f5275a.canApplyTheme();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f5275a.getChangingConfigurations();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            C3294h hVar = new C3294h();
            hVar.f5206k = (VectorDrawable) this.f5275a.newDrawable();
            return hVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            C3294h hVar = new C3294h();
            hVar.f5206k = (VectorDrawable) this.f5275a.newDrawable(resources);
            return hVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            C3294h hVar = new C3294h();
            hVar.f5206k = (VectorDrawable) this.f5275a.newDrawable(resources, theme);
            return hVar;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f5206k;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
            return;
        }
        this.f5210n = colorFilter;
        invalidateSelf();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.vectordrawable.graphics.drawable.h$f */
    /* loaded from: classes.dex */
    public static abstract class AbstractC3300f extends AbstractC3299e {

        /* renamed from: a */
        protected C2391d.C2393b[] f5242a;

        /* renamed from: b */
        String f5243b;

        /* renamed from: c */
        int f5244c;

        /* renamed from: d */
        int f5245d;

        public AbstractC3300f() {
            super();
            this.f5242a = null;
            this.f5244c = 0;
        }

        /* renamed from: c */
        public boolean mo34769c() {
            return false;
        }

        /* renamed from: d */
        public void m34768d(Path path) {
            path.reset();
            C2391d.C2393b[] bVarArr = this.f5242a;
            if (bVarArr != null) {
                C2391d.C2393b.m37892e(bVarArr, path);
            }
        }

        public C2391d.C2393b[] getPathData() {
            return this.f5242a;
        }

        public String getPathName() {
            return this.f5243b;
        }

        public void setPathData(C2391d.C2393b[] bVarArr) {
            if (!C2391d.m37905b(this.f5242a, bVarArr)) {
                this.f5242a = C2391d.m37901f(bVarArr);
            } else {
                C2391d.m37897j(this.f5242a, bVarArr);
            }
        }

        public AbstractC3300f(AbstractC3300f fVar) {
            super();
            this.f5242a = null;
            this.f5244c = 0;
            this.f5243b = fVar.f5243b;
            this.f5245d = fVar.f5245d;
            this.f5242a = C2391d.m37901f(fVar.f5242a);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        Drawable drawable = this.f5206k;
        if (drawable != null) {
            C2400a.m37836g(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        C0069h hVar = this.f5208l;
        hVar.f5264b = new C3301g();
        TypedArray k = C2379l.m37949k(resources, theme, attributeSet, C3284a.f5179a);
        m34782i(k, xmlPullParser, theme);
        k.recycle();
        hVar.f5263a = getChangingConfigurations();
        hVar.f5273k = true;
        m34786e(resources, xmlPullParser, attributeSet, theme);
        this.f5209m = m34781j(this.f5209m, hVar.f5265c, hVar.f5266d);
    }

    C3294h(C0069h hVar) {
        this.f5212p = true;
        this.f5214r = new float[9];
        this.f5215s = new Matrix();
        this.f5216t = new Rect();
        this.f5208l = hVar;
        this.f5209m = m34781j(this.f5209m, hVar.f5265c, hVar.f5266d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.vectordrawable.graphics.drawable.h$c */
    /* loaded from: classes.dex */
    public static class C3297c extends AbstractC3300f {

        /* renamed from: e */
        private int[] f5217e;

        /* renamed from: f */
        C2358d f5218f;

        /* renamed from: g */
        float f5219g;

        /* renamed from: h */
        C2358d f5220h;

        /* renamed from: i */
        float f5221i;

        /* renamed from: j */
        float f5222j;

        /* renamed from: k */
        float f5223k;

        /* renamed from: l */
        float f5224l;

        /* renamed from: m */
        float f5225m;

        /* renamed from: n */
        Paint.Cap f5226n;

        /* renamed from: o */
        Paint.Join f5227o;

        /* renamed from: p */
        float f5228p;

        C3297c() {
            this.f5219g = 0.0f;
            this.f5221i = 1.0f;
            this.f5222j = 1.0f;
            this.f5223k = 0.0f;
            this.f5224l = 1.0f;
            this.f5225m = 0.0f;
            this.f5226n = Paint.Cap.BUTT;
            this.f5227o = Paint.Join.MITER;
            this.f5228p = 4.0f;
        }

        /* renamed from: e */
        private Paint.Cap m34778e(int i, Paint.Cap cap) {
            if (i == 0) {
                return Paint.Cap.BUTT;
            }
            if (i == 1) {
                return Paint.Cap.ROUND;
            }
            if (i != 2) {
                return cap;
            }
            return Paint.Cap.SQUARE;
        }

        /* renamed from: f */
        private Paint.Join m34777f(int i, Paint.Join join) {
            if (i == 0) {
                return Paint.Join.MITER;
            }
            if (i == 1) {
                return Paint.Join.ROUND;
            }
            if (i != 2) {
                return join;
            }
            return Paint.Join.BEVEL;
        }

        /* renamed from: h */
        private void m34775h(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) {
            this.f5217e = null;
            if (C2379l.m37950j(xmlPullParser, "pathData")) {
                String string = typedArray.getString(0);
                if (string != null) {
                    this.f5243b = string;
                }
                String string2 = typedArray.getString(2);
                if (string2 != null) {
                    this.f5242a = C2391d.m37903d(string2);
                }
                this.f5220h = C2379l.m37955e(typedArray, xmlPullParser, theme, "fillColor", 1, 0);
                this.f5222j = C2379l.m37954f(typedArray, xmlPullParser, "fillAlpha", 12, this.f5222j);
                this.f5226n = m34778e(C2379l.m37953g(typedArray, xmlPullParser, "strokeLineCap", 8, -1), this.f5226n);
                this.f5227o = m34777f(C2379l.m37953g(typedArray, xmlPullParser, "strokeLineJoin", 9, -1), this.f5227o);
                this.f5228p = C2379l.m37954f(typedArray, xmlPullParser, "strokeMiterLimit", 10, this.f5228p);
                this.f5218f = C2379l.m37955e(typedArray, xmlPullParser, theme, "strokeColor", 3, 0);
                this.f5221i = C2379l.m37954f(typedArray, xmlPullParser, "strokeAlpha", 11, this.f5221i);
                this.f5219g = C2379l.m37954f(typedArray, xmlPullParser, "strokeWidth", 4, this.f5219g);
                this.f5224l = C2379l.m37954f(typedArray, xmlPullParser, "trimPathEnd", 6, this.f5224l);
                this.f5225m = C2379l.m37954f(typedArray, xmlPullParser, "trimPathOffset", 7, this.f5225m);
                this.f5223k = C2379l.m37954f(typedArray, xmlPullParser, "trimPathStart", 5, this.f5223k);
                this.f5244c = C2379l.m37953g(typedArray, xmlPullParser, "fillType", 13, this.f5244c);
            }
        }

        @Override // androidx.vectordrawable.graphics.drawable.C3294h.AbstractC3299e
        /* renamed from: a */
        public boolean mo34771a() {
            return this.f5220h.m38020i() || this.f5218f.m38020i();
        }

        @Override // androidx.vectordrawable.graphics.drawable.C3294h.AbstractC3299e
        /* renamed from: b */
        public boolean mo34770b(int[] iArr) {
            return this.f5218f.m38019j(iArr) | this.f5220h.m38019j(iArr);
        }

        /* renamed from: g */
        public void m34776g(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            TypedArray k = C2379l.m37949k(resources, theme, attributeSet, C3284a.f5181c);
            m34775h(k, xmlPullParser, theme);
            k.recycle();
        }

        float getFillAlpha() {
            return this.f5222j;
        }

        int getFillColor() {
            return this.f5220h.m38024e();
        }

        float getStrokeAlpha() {
            return this.f5221i;
        }

        int getStrokeColor() {
            return this.f5218f.m38024e();
        }

        float getStrokeWidth() {
            return this.f5219g;
        }

        float getTrimPathEnd() {
            return this.f5224l;
        }

        float getTrimPathOffset() {
            return this.f5225m;
        }

        float getTrimPathStart() {
            return this.f5223k;
        }

        void setFillAlpha(float f) {
            this.f5222j = f;
        }

        void setFillColor(int i) {
            this.f5220h.m38018k(i);
        }

        void setStrokeAlpha(float f) {
            this.f5221i = f;
        }

        void setStrokeColor(int i) {
            this.f5218f.m38018k(i);
        }

        void setStrokeWidth(float f) {
            this.f5219g = f;
        }

        void setTrimPathEnd(float f) {
            this.f5224l = f;
        }

        void setTrimPathOffset(float f) {
            this.f5225m = f;
        }

        void setTrimPathStart(float f) {
            this.f5223k = f;
        }

        C3297c(C3297c cVar) {
            super(cVar);
            this.f5219g = 0.0f;
            this.f5221i = 1.0f;
            this.f5222j = 1.0f;
            this.f5223k = 0.0f;
            this.f5224l = 1.0f;
            this.f5225m = 0.0f;
            this.f5226n = Paint.Cap.BUTT;
            this.f5227o = Paint.Join.MITER;
            this.f5228p = 4.0f;
            this.f5217e = cVar.f5217e;
            this.f5218f = cVar.f5218f;
            this.f5219g = cVar.f5219g;
            this.f5221i = cVar.f5221i;
            this.f5220h = cVar.f5220h;
            this.f5244c = cVar.f5244c;
            this.f5222j = cVar.f5222j;
            this.f5223k = cVar.f5223k;
            this.f5224l = cVar.f5224l;
            this.f5225m = cVar.f5225m;
            this.f5226n = cVar.f5226n;
            this.f5227o = cVar.f5227o;
            this.f5228p = cVar.f5228p;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.vectordrawable.graphics.drawable.h$g */
    /* loaded from: classes.dex */
    public static class C3301g {

        /* renamed from: q */
        private static final Matrix f5246q = new Matrix();

        /* renamed from: a */
        private final Path f5247a;

        /* renamed from: b */
        private final Path f5248b;

        /* renamed from: c */
        private final Matrix f5249c;

        /* renamed from: d */
        Paint f5250d;

        /* renamed from: e */
        Paint f5251e;

        /* renamed from: f */
        private PathMeasure f5252f;

        /* renamed from: g */
        private int f5253g;

        /* renamed from: h */
        final C3298d f5254h;

        /* renamed from: i */
        float f5255i;

        /* renamed from: j */
        float f5256j;

        /* renamed from: k */
        float f5257k;

        /* renamed from: l */
        float f5258l;

        /* renamed from: m */
        int f5259m;

        /* renamed from: n */
        String f5260n;

        /* renamed from: o */
        Boolean f5261o;

        /* renamed from: p */
        final C2094a<String, Object> f5262p;

        public C3301g() {
            this.f5249c = new Matrix();
            this.f5255i = 0.0f;
            this.f5256j = 0.0f;
            this.f5257k = 0.0f;
            this.f5258l = 0.0f;
            this.f5259m = 255;
            this.f5260n = null;
            this.f5261o = null;
            this.f5262p = new C2094a<>();
            this.f5254h = new C3298d();
            this.f5247a = new Path();
            this.f5248b = new Path();
        }

        /* renamed from: a */
        private static float m34767a(float f, float f2, float f3, float f4) {
            return (f * f4) - (f2 * f3);
        }

        /* renamed from: c */
        private void m34765c(C3298d dVar, Matrix matrix, Canvas canvas, int i, int i2, ColorFilter colorFilter) {
            dVar.f5229a.set(matrix);
            dVar.f5229a.preConcat(dVar.f5238j);
            canvas.save();
            for (int i3 = 0; i3 < dVar.f5230b.size(); i3++) {
                AbstractC3299e eVar = dVar.f5230b.get(i3);
                if (eVar instanceof C3298d) {
                    m34765c((C3298d) eVar, dVar.f5229a, canvas, i, i2, colorFilter);
                } else if (eVar instanceof AbstractC3300f) {
                    m34764d(dVar, (AbstractC3300f) eVar, canvas, i, i2, colorFilter);
                }
            }
            canvas.restore();
        }

        /* renamed from: d */
        private void m34764d(C3298d dVar, AbstractC3300f fVar, Canvas canvas, int i, int i2, ColorFilter colorFilter) {
            Path.FillType fillType;
            Path.FillType fillType2;
            float f = i / this.f5257k;
            float f2 = i2 / this.f5258l;
            float min = Math.min(f, f2);
            Matrix matrix = dVar.f5229a;
            this.f5249c.set(matrix);
            this.f5249c.postScale(f, f2);
            float e = m34763e(matrix);
            if (e != 0.0f) {
                fVar.m34768d(this.f5247a);
                Path path = this.f5247a;
                this.f5248b.reset();
                if (fVar.mo34769c()) {
                    Path path2 = this.f5248b;
                    if (fVar.f5244c == 0) {
                        fillType2 = Path.FillType.WINDING;
                    } else {
                        fillType2 = Path.FillType.EVEN_ODD;
                    }
                    path2.setFillType(fillType2);
                    this.f5248b.addPath(path, this.f5249c);
                    canvas.clipPath(this.f5248b);
                    return;
                }
                C3297c cVar = (C3297c) fVar;
                float f3 = cVar.f5223k;
                if (!(f3 == 0.0f && cVar.f5224l == 1.0f)) {
                    float f4 = cVar.f5225m;
                    float f5 = (f3 + f4) % 1.0f;
                    float f6 = (cVar.f5224l + f4) % 1.0f;
                    if (this.f5252f == null) {
                        this.f5252f = new PathMeasure();
                    }
                    this.f5252f.setPath(this.f5247a, false);
                    float length = this.f5252f.getLength();
                    float f7 = f5 * length;
                    float f8 = f6 * length;
                    path.reset();
                    if (f7 > f8) {
                        this.f5252f.getSegment(f7, length, path, true);
                        this.f5252f.getSegment(0.0f, f8, path, true);
                    } else {
                        this.f5252f.getSegment(f7, f8, path, true);
                    }
                    path.rLineTo(0.0f, 0.0f);
                }
                this.f5248b.addPath(path, this.f5249c);
                if (cVar.f5220h.m38017l()) {
                    C2358d dVar2 = cVar.f5220h;
                    if (this.f5251e == null) {
                        Paint paint = new Paint(1);
                        this.f5251e = paint;
                        paint.setStyle(Paint.Style.FILL);
                    }
                    Paint paint2 = this.f5251e;
                    if (dVar2.m38021h()) {
                        Shader f9 = dVar2.m38023f();
                        f9.setLocalMatrix(this.f5249c);
                        paint2.setShader(f9);
                        paint2.setAlpha(Math.round(cVar.f5222j * 255.0f));
                    } else {
                        paint2.setShader(null);
                        paint2.setAlpha(255);
                        paint2.setColor(C3294h.m34790a(dVar2.m38024e(), cVar.f5222j));
                    }
                    paint2.setColorFilter(colorFilter);
                    Path path3 = this.f5248b;
                    if (cVar.f5244c == 0) {
                        fillType = Path.FillType.WINDING;
                    } else {
                        fillType = Path.FillType.EVEN_ODD;
                    }
                    path3.setFillType(fillType);
                    canvas.drawPath(this.f5248b, paint2);
                }
                if (cVar.f5218f.m38017l()) {
                    C2358d dVar3 = cVar.f5218f;
                    if (this.f5250d == null) {
                        Paint paint3 = new Paint(1);
                        this.f5250d = paint3;
                        paint3.setStyle(Paint.Style.STROKE);
                    }
                    Paint paint4 = this.f5250d;
                    Paint.Join join = cVar.f5227o;
                    if (join != null) {
                        paint4.setStrokeJoin(join);
                    }
                    Paint.Cap cap = cVar.f5226n;
                    if (cap != null) {
                        paint4.setStrokeCap(cap);
                    }
                    paint4.setStrokeMiter(cVar.f5228p);
                    if (dVar3.m38021h()) {
                        Shader f10 = dVar3.m38023f();
                        f10.setLocalMatrix(this.f5249c);
                        paint4.setShader(f10);
                        paint4.setAlpha(Math.round(cVar.f5221i * 255.0f));
                    } else {
                        paint4.setShader(null);
                        paint4.setAlpha(255);
                        paint4.setColor(C3294h.m34790a(dVar3.m38024e(), cVar.f5221i));
                    }
                    paint4.setColorFilter(colorFilter);
                    paint4.setStrokeWidth(cVar.f5219g * min * e);
                    canvas.drawPath(this.f5248b, paint4);
                }
            }
        }

        /* renamed from: e */
        private float m34763e(Matrix matrix) {
            float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
            matrix.mapVectors(fArr);
            float a = m34767a(fArr[0], fArr[1], fArr[2], fArr[3]);
            float max = Math.max((float) Math.hypot(fArr[0], fArr[1]), (float) Math.hypot(fArr[2], fArr[3]));
            if (max > 0.0f) {
                return Math.abs(a) / max;
            }
            return 0.0f;
        }

        /* renamed from: b */
        public void m34766b(Canvas canvas, int i, int i2, ColorFilter colorFilter) {
            m34765c(this.f5254h, f5246q, canvas, i, i2, colorFilter);
        }

        /* renamed from: f */
        public boolean m34762f() {
            if (this.f5261o == null) {
                this.f5261o = Boolean.valueOf(this.f5254h.mo34771a());
            }
            return this.f5261o.booleanValue();
        }

        /* renamed from: g */
        public boolean m34761g(int[] iArr) {
            return this.f5254h.mo34770b(iArr);
        }

        public float getAlpha() {
            return getRootAlpha() / 255.0f;
        }

        public int getRootAlpha() {
            return this.f5259m;
        }

        public void setAlpha(float f) {
            setRootAlpha((int) (f * 255.0f));
        }

        public void setRootAlpha(int i) {
            this.f5259m = i;
        }

        public C3301g(C3301g gVar) {
            this.f5249c = new Matrix();
            this.f5255i = 0.0f;
            this.f5256j = 0.0f;
            this.f5257k = 0.0f;
            this.f5258l = 0.0f;
            this.f5259m = 255;
            this.f5260n = null;
            this.f5261o = null;
            C2094a<String, Object> aVar = new C2094a<>();
            this.f5262p = aVar;
            this.f5254h = new C3298d(gVar.f5254h, aVar);
            this.f5247a = new Path(gVar.f5247a);
            this.f5248b = new Path(gVar.f5248b);
            this.f5255i = gVar.f5255i;
            this.f5256j = gVar.f5256j;
            this.f5257k = gVar.f5257k;
            this.f5258l = gVar.f5258l;
            this.f5253g = gVar.f5253g;
            this.f5259m = gVar.f5259m;
            this.f5260n = gVar.f5260n;
            String str = gVar.f5260n;
            if (str != null) {
                aVar.put(str, this);
            }
            this.f5261o = gVar.f5261o;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.vectordrawable.graphics.drawable.h$d */
    /* loaded from: classes.dex */
    public static class C3298d extends AbstractC3299e {

        /* renamed from: a */
        final Matrix f5229a;

        /* renamed from: b */
        final ArrayList<AbstractC3299e> f5230b;

        /* renamed from: c */
        float f5231c;

        /* renamed from: d */
        private float f5232d;

        /* renamed from: e */
        private float f5233e;

        /* renamed from: f */
        private float f5234f;

        /* renamed from: g */
        private float f5235g;

        /* renamed from: h */
        private float f5236h;

        /* renamed from: i */
        private float f5237i;

        /* renamed from: j */
        final Matrix f5238j;

        /* renamed from: k */
        int f5239k;

        /* renamed from: l */
        private int[] f5240l;

        /* renamed from: m */
        private String f5241m;

        public C3298d(C3298d dVar, C2094a<String, Object> aVar) {
            super();
            AbstractC3300f fVar;
            this.f5229a = new Matrix();
            this.f5230b = new ArrayList<>();
            this.f5231c = 0.0f;
            this.f5232d = 0.0f;
            this.f5233e = 0.0f;
            this.f5234f = 1.0f;
            this.f5235g = 1.0f;
            this.f5236h = 0.0f;
            this.f5237i = 0.0f;
            Matrix matrix = new Matrix();
            this.f5238j = matrix;
            this.f5241m = null;
            this.f5231c = dVar.f5231c;
            this.f5232d = dVar.f5232d;
            this.f5233e = dVar.f5233e;
            this.f5234f = dVar.f5234f;
            this.f5235g = dVar.f5235g;
            this.f5236h = dVar.f5236h;
            this.f5237i = dVar.f5237i;
            this.f5240l = dVar.f5240l;
            String str = dVar.f5241m;
            this.f5241m = str;
            this.f5239k = dVar.f5239k;
            if (str != null) {
                aVar.put(str, this);
            }
            matrix.set(dVar.f5238j);
            ArrayList<AbstractC3299e> arrayList = dVar.f5230b;
            for (int i = 0; i < arrayList.size(); i++) {
                AbstractC3299e eVar = arrayList.get(i);
                if (eVar instanceof C3298d) {
                    this.f5230b.add(new C3298d((C3298d) eVar, aVar));
                } else {
                    if (eVar instanceof C3297c) {
                        fVar = new C3297c((C3297c) eVar);
                    } else if (eVar instanceof C3296b) {
                        fVar = new C3296b((C3296b) eVar);
                    } else {
                        throw new IllegalStateException("Unknown object in the tree!");
                    }
                    this.f5230b.add(fVar);
                    String str2 = fVar.f5243b;
                    if (str2 != null) {
                        aVar.put(str2, fVar);
                    }
                }
            }
        }

        /* renamed from: d */
        private void m34773d() {
            this.f5238j.reset();
            this.f5238j.postTranslate(-this.f5232d, -this.f5233e);
            this.f5238j.postScale(this.f5234f, this.f5235g);
            this.f5238j.postRotate(this.f5231c, 0.0f, 0.0f);
            this.f5238j.postTranslate(this.f5236h + this.f5232d, this.f5237i + this.f5233e);
        }

        /* renamed from: e */
        private void m34772e(TypedArray typedArray, XmlPullParser xmlPullParser) {
            this.f5240l = null;
            this.f5231c = C2379l.m37954f(typedArray, xmlPullParser, ViewProps.ROTATION, 5, this.f5231c);
            this.f5232d = typedArray.getFloat(1, this.f5232d);
            this.f5233e = typedArray.getFloat(2, this.f5233e);
            this.f5234f = C2379l.m37954f(typedArray, xmlPullParser, ViewProps.SCALE_X, 3, this.f5234f);
            this.f5235g = C2379l.m37954f(typedArray, xmlPullParser, ViewProps.SCALE_Y, 4, this.f5235g);
            this.f5236h = C2379l.m37954f(typedArray, xmlPullParser, ViewProps.TRANSLATE_X, 6, this.f5236h);
            this.f5237i = C2379l.m37954f(typedArray, xmlPullParser, ViewProps.TRANSLATE_Y, 7, this.f5237i);
            String string = typedArray.getString(0);
            if (string != null) {
                this.f5241m = string;
            }
            m34773d();
        }

        @Override // androidx.vectordrawable.graphics.drawable.C3294h.AbstractC3299e
        /* renamed from: a */
        public boolean mo34771a() {
            for (int i = 0; i < this.f5230b.size(); i++) {
                if (this.f5230b.get(i).mo34771a()) {
                    return true;
                }
            }
            return false;
        }

        @Override // androidx.vectordrawable.graphics.drawable.C3294h.AbstractC3299e
        /* renamed from: b */
        public boolean mo34770b(int[] iArr) {
            boolean z = false;
            for (int i = 0; i < this.f5230b.size(); i++) {
                z |= this.f5230b.get(i).mo34770b(iArr);
            }
            return z;
        }

        /* renamed from: c */
        public void m34774c(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            TypedArray k = C2379l.m37949k(resources, theme, attributeSet, C3284a.f5180b);
            m34772e(k, xmlPullParser);
            k.recycle();
        }

        public String getGroupName() {
            return this.f5241m;
        }

        public Matrix getLocalMatrix() {
            return this.f5238j;
        }

        public float getPivotX() {
            return this.f5232d;
        }

        public float getPivotY() {
            return this.f5233e;
        }

        public float getRotation() {
            return this.f5231c;
        }

        public float getScaleX() {
            return this.f5234f;
        }

        public float getScaleY() {
            return this.f5235g;
        }

        public float getTranslateX() {
            return this.f5236h;
        }

        public float getTranslateY() {
            return this.f5237i;
        }

        public void setPivotX(float f) {
            if (f != this.f5232d) {
                this.f5232d = f;
                m34773d();
            }
        }

        public void setPivotY(float f) {
            if (f != this.f5233e) {
                this.f5233e = f;
                m34773d();
            }
        }

        public void setRotation(float f) {
            if (f != this.f5231c) {
                this.f5231c = f;
                m34773d();
            }
        }

        public void setScaleX(float f) {
            if (f != this.f5234f) {
                this.f5234f = f;
                m34773d();
            }
        }

        public void setScaleY(float f) {
            if (f != this.f5235g) {
                this.f5235g = f;
                m34773d();
            }
        }

        public void setTranslateX(float f) {
            if (f != this.f5236h) {
                this.f5236h = f;
                m34773d();
            }
        }

        public void setTranslateY(float f) {
            if (f != this.f5237i) {
                this.f5237i = f;
                m34773d();
            }
        }

        public C3298d() {
            super();
            this.f5229a = new Matrix();
            this.f5230b = new ArrayList<>();
            this.f5231c = 0.0f;
            this.f5232d = 0.0f;
            this.f5233e = 0.0f;
            this.f5234f = 1.0f;
            this.f5235g = 1.0f;
            this.f5236h = 0.0f;
            this.f5237i = 0.0f;
            this.f5238j = new Matrix();
            this.f5241m = null;
        }
    }
}
