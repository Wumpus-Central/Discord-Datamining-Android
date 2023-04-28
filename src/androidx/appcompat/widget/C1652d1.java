package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import androidx.collection.C2098d;
import androidx.collection.SimpleArrayMap;
import androidx.collection.SparseArrayCompat;
import androidx.core.content.C2337a;
import androidx.core.graphics.drawable.C2400a;
import androidx.vectordrawable.graphics.drawable.C3286c;
import androidx.vectordrawable.graphics.drawable.C3294h;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p090f.C6967a;
import p109g.C7385c;
import p109g.C7386d;
import p341t0.C12936a;

/* renamed from: androidx.appcompat.widget.d1 */
/* loaded from: classes.dex */
public final class C1652d1 {

    /* renamed from: i */
    private static C1652d1 f1303i;

    /* renamed from: a */
    private WeakHashMap<Context, SparseArrayCompat<ColorStateList>> f1305a;

    /* renamed from: b */
    private SimpleArrayMap<String, AbstractC1657e> f1306b;

    /* renamed from: c */
    private SparseArrayCompat<String> f1307c;

    /* renamed from: d */
    private final WeakHashMap<Context, C2098d<WeakReference<Drawable.ConstantState>>> f1308d = new WeakHashMap<>(0);

    /* renamed from: e */
    private TypedValue f1309e;

    /* renamed from: f */
    private boolean f1310f;

    /* renamed from: g */
    private AbstractC1658f f1311g;

    /* renamed from: h */
    private static final PorterDuff.Mode f1302h = PorterDuff.Mode.SRC_IN;

    /* renamed from: j */
    private static final C1655c f1304j = new C1655c(6);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.widget.d1$a */
    /* loaded from: classes.dex */
    public static class C1653a implements AbstractC1657e {
        C1653a() {
        }

        @Override // androidx.appcompat.widget.C1652d1.AbstractC1657e
        /* renamed from: a */
        public Drawable mo40253a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                return C6967a.m23807m(context, context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e) {
                Log.e("AsldcInflateDelegate", "Exception while inflating <animated-selector>", e);
                return null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.appcompat.widget.d1$b */
    /* loaded from: classes.dex */
    public static class C1654b implements AbstractC1657e {
        C1654b() {
        }

        @Override // androidx.appcompat.widget.C1652d1.AbstractC1657e
        /* renamed from: a */
        public Drawable mo40253a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                return C3286c.m34815a(context, context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e) {
                Log.e("AvdcInflateDelegate", "Exception while inflating <animated-vector>", e);
                return null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.appcompat.widget.d1$c */
    /* loaded from: classes.dex */
    public static class C1655c extends C12936a<Integer, PorterDuffColorFilter> {
        public C1655c(int i) {
            super(i);
        }

        /* renamed from: h */
        private static int m40256h(int i, PorterDuff.Mode mode) {
            return ((i + 31) * 31) + mode.hashCode();
        }

        /* renamed from: i */
        PorterDuffColorFilter m40255i(int i, PorterDuff.Mode mode) {
            return m5032c(Integer.valueOf(m40256h(i, mode)));
        }

        /* renamed from: j */
        PorterDuffColorFilter m40254j(int i, PorterDuff.Mode mode, PorterDuffColorFilter porterDuffColorFilter) {
            return m5031d(Integer.valueOf(m40256h(i, mode)), porterDuffColorFilter);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.widget.d1$d */
    /* loaded from: classes.dex */
    public static class C1656d implements AbstractC1657e {
        C1656d() {
        }

        @Override // androidx.appcompat.widget.C1652d1.AbstractC1657e
        /* renamed from: a */
        public Drawable mo40253a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            String classAttribute = attributeSet.getClassAttribute();
            if (classAttribute != null) {
                try {
                    Drawable drawable = (Drawable) C1656d.class.getClassLoader().loadClass(classAttribute).asSubclass(Drawable.class).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                    C7385c.m22760c(drawable, context.getResources(), xmlPullParser, attributeSet, theme);
                    return drawable;
                } catch (Exception e) {
                    Log.e("DrawableDelegate", "Exception while inflating <drawable>", e);
                }
            }
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.appcompat.widget.d1$e */
    /* loaded from: classes.dex */
    public interface AbstractC1657e {
        /* renamed from: a */
        Drawable mo40253a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme);
    }

    /* renamed from: androidx.appcompat.widget.d1$f */
    /* loaded from: classes.dex */
    public interface AbstractC1658f {
        /* renamed from: a */
        Drawable mo40154a(C1652d1 d1Var, Context context, int i);

        /* renamed from: b */
        ColorStateList mo40153b(Context context, int i);

        /* renamed from: c */
        boolean mo40152c(Context context, int i, Drawable drawable);

        /* renamed from: d */
        PorterDuff.Mode mo40151d(int i);

        /* renamed from: e */
        boolean mo40150e(Context context, int i, Drawable drawable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.appcompat.widget.d1$g */
    /* loaded from: classes.dex */
    public static class C1659g implements AbstractC1657e {
        C1659g() {
        }

        @Override // androidx.appcompat.widget.C1652d1.AbstractC1657e
        /* renamed from: a */
        public Drawable mo40253a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                return C3294h.m34788c(context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e) {
                Log.e("VdcInflateDelegate", "Exception while inflating <vector>", e);
                return null;
            }
        }
    }

    /* renamed from: a */
    private void m40280a(String str, AbstractC1657e eVar) {
        if (this.f1306b == null) {
            this.f1306b = new SimpleArrayMap<>();
        }
        this.f1306b.put(str, eVar);
    }

    /* renamed from: b */
    private synchronized boolean m40279b(Context context, long j, Drawable drawable) {
        Drawable.ConstantState constantState = drawable.getConstantState();
        if (constantState == null) {
            return false;
        }
        C2098d<WeakReference<Drawable.ConstantState>> dVar = this.f1308d.get(context);
        if (dVar == null) {
            dVar = new C2098d<>();
            this.f1308d.put(context, dVar);
        }
        dVar.m39011m(j, new WeakReference<>(constantState));
        return true;
    }

    /* renamed from: c */
    private void m40278c(Context context, int i, ColorStateList colorStateList) {
        if (this.f1305a == null) {
            this.f1305a = new WeakHashMap<>();
        }
        SparseArrayCompat<ColorStateList> sparseArrayCompat = this.f1305a.get(context);
        if (sparseArrayCompat == null) {
            sparseArrayCompat = new SparseArrayCompat<>();
            this.f1305a.put(context, sparseArrayCompat);
        }
        sparseArrayCompat.m39047a(i, colorStateList);
    }

    /* renamed from: d */
    private void m40277d(Context context) {
        if (!this.f1310f) {
            this.f1310f = true;
            Drawable j = m40271j(context, C7386d.f15901a);
            if (j == null || !m40264q(j)) {
                this.f1310f = false;
                throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
            }
        }
    }

    /* renamed from: e */
    private static long m40276e(TypedValue typedValue) {
        return (typedValue.assetCookie << 32) | typedValue.data;
    }

    /* renamed from: f */
    private Drawable m40275f(Context context, int i) {
        Drawable drawable;
        if (this.f1309e == null) {
            this.f1309e = new TypedValue();
        }
        TypedValue typedValue = this.f1309e;
        context.getResources().getValue(i, typedValue, true);
        long e = m40276e(typedValue);
        Drawable i2 = m40272i(context, e);
        if (i2 != null) {
            return i2;
        }
        AbstractC1658f fVar = this.f1311g;
        if (fVar == null) {
            drawable = null;
        } else {
            drawable = fVar.mo40154a(this, context, i);
        }
        if (drawable != null) {
            drawable.setChangingConfigurations(typedValue.changingConfigurations);
            m40279b(context, e, drawable);
        }
        return drawable;
    }

    /* renamed from: g */
    private static PorterDuffColorFilter m40274g(ColorStateList colorStateList, PorterDuff.Mode mode, int[] iArr) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return m40269l(colorStateList.getColorForState(iArr, 0), mode);
    }

    /* renamed from: h */
    public static synchronized C1652d1 m40273h() {
        C1652d1 d1Var;
        synchronized (C1652d1.class) {
            if (f1303i == null) {
                C1652d1 d1Var2 = new C1652d1();
                f1303i = d1Var2;
                m40265p(d1Var2);
            }
            d1Var = f1303i;
        }
        return d1Var;
    }

    /* renamed from: i */
    private synchronized Drawable m40272i(Context context, long j) {
        C2098d<WeakReference<Drawable.ConstantState>> dVar = this.f1308d.get(context);
        if (dVar == null) {
            return null;
        }
        WeakReference<Drawable.ConstantState> h = dVar.m39015h(j);
        if (h != null) {
            Drawable.ConstantState constantState = h.get();
            if (constantState != null) {
                return constantState.newDrawable(context.getResources());
            }
            dVar.m39010n(j);
        }
        return null;
    }

    /* renamed from: l */
    public static synchronized PorterDuffColorFilter m40269l(int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter i2;
        synchronized (C1652d1.class) {
            C1655c cVar = f1304j;
            i2 = cVar.m40255i(i, mode);
            if (i2 == null) {
                i2 = new PorterDuffColorFilter(i, mode);
                cVar.m40254j(i, mode, i2);
            }
        }
        return i2;
    }

    /* renamed from: n */
    private ColorStateList m40267n(Context context, int i) {
        SparseArrayCompat<ColorStateList> sparseArrayCompat;
        WeakHashMap<Context, SparseArrayCompat<ColorStateList>> weakHashMap = this.f1305a;
        if (weakHashMap == null || (sparseArrayCompat = weakHashMap.get(context)) == null) {
            return null;
        }
        return sparseArrayCompat.m39043f(i);
    }

    /* renamed from: p */
    private static void m40265p(C1652d1 d1Var) {
        if (Build.VERSION.SDK_INT < 24) {
            d1Var.m40280a("vector", new C1659g());
            d1Var.m40280a("animated-vector", new C1654b());
            d1Var.m40280a("animated-selector", new C1653a());
            d1Var.m40280a("drawable", new C1656d());
        }
    }

    /* renamed from: q */
    private static boolean m40264q(Drawable drawable) {
        if ((drawable instanceof C3294h) || "android.graphics.drawable.VectorDrawable".equals(drawable.getClass().getName())) {
            return true;
        }
        return false;
    }

    /* renamed from: r */
    private Drawable m40263r(Context context, int i) {
        int next;
        SimpleArrayMap<String, AbstractC1657e> simpleArrayMap = this.f1306b;
        if (simpleArrayMap == null || simpleArrayMap.isEmpty()) {
            return null;
        }
        SparseArrayCompat<String> sparseArrayCompat = this.f1307c;
        if (sparseArrayCompat != null) {
            String f = sparseArrayCompat.m39043f(i);
            if ("appcompat_skip_skip".equals(f) || (f != null && this.f1306b.get(f) == null)) {
                return null;
            }
        } else {
            this.f1307c = new SparseArrayCompat<>();
        }
        if (this.f1309e == null) {
            this.f1309e = new TypedValue();
        }
        TypedValue typedValue = this.f1309e;
        Resources resources = context.getResources();
        resources.getValue(i, typedValue, true);
        long e = m40276e(typedValue);
        Drawable i2 = m40272i(context, e);
        if (i2 != null) {
            return i2;
        }
        CharSequence charSequence = typedValue.string;
        if (charSequence != null && charSequence.toString().endsWith(".xml")) {
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
                    String name = xml.getName();
                    this.f1307c.m39047a(i, name);
                    AbstractC1657e eVar = this.f1306b.get(name);
                    if (eVar != null) {
                        i2 = eVar.mo40253a(context, xml, asAttributeSet, context.getTheme());
                    }
                    if (i2 != null) {
                        i2.setChangingConfigurations(typedValue.changingConfigurations);
                        m40279b(context, e, i2);
                    }
                } else {
                    throw new XmlPullParserException("No start tag found");
                }
            } catch (Exception e2) {
                Log.e("ResourceManagerInternal", "Exception while inflating drawable", e2);
            }
        }
        if (i2 == null) {
            this.f1307c.m39047a(i, "appcompat_skip_skip");
        }
        return i2;
    }

    /* renamed from: v */
    private Drawable m40259v(Context context, int i, boolean z, Drawable drawable) {
        ColorStateList m = m40268m(context, i);
        if (m != null) {
            if (C1709q0.m40058a(drawable)) {
                drawable = drawable.mutate();
            }
            Drawable r = C2400a.m37825r(drawable);
            C2400a.m37828o(r, m);
            PorterDuff.Mode o = m40266o(i);
            if (o == null) {
                return r;
            }
            C2400a.m37827p(r, o);
            return r;
        }
        AbstractC1658f fVar = this.f1311g;
        if ((fVar == null || !fVar.mo40150e(context, i, drawable)) && !m40257x(context, i, drawable) && z) {
            return null;
        }
        return drawable;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: w */
    public static void m40258w(Drawable drawable, C1692l1 l1Var, int[] iArr) {
        ColorStateList colorStateList;
        PorterDuff.Mode mode;
        if (!C1709q0.m40058a(drawable) || drawable.mutate() == drawable) {
            boolean z = l1Var.f1417d;
            if (z || l1Var.f1416c) {
                if (z) {
                    colorStateList = l1Var.f1414a;
                } else {
                    colorStateList = null;
                }
                if (l1Var.f1416c) {
                    mode = l1Var.f1415b;
                } else {
                    mode = f1302h;
                }
                drawable.setColorFilter(m40274g(colorStateList, mode, iArr));
            } else {
                drawable.clearColorFilter();
            }
            if (Build.VERSION.SDK_INT <= 23) {
                drawable.invalidateSelf();
                return;
            }
            return;
        }
        Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
    }

    /* renamed from: j */
    public synchronized Drawable m40271j(Context context, int i) {
        return m40270k(context, i, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public synchronized Drawable m40270k(Context context, int i, boolean z) {
        Drawable r;
        m40277d(context);
        r = m40263r(context, i);
        if (r == null) {
            r = m40275f(context, i);
        }
        if (r == null) {
            r = C2337a.m38133e(context, i);
        }
        if (r != null) {
            r = m40259v(context, i, z, r);
        }
        if (r != null) {
            C1709q0.m40057b(r);
        }
        return r;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public synchronized ColorStateList m40268m(Context context, int i) {
        ColorStateList n;
        n = m40267n(context, i);
        if (n == null) {
            AbstractC1658f fVar = this.f1311g;
            if (fVar == null) {
                n = null;
            } else {
                n = fVar.mo40153b(context, i);
            }
            if (n != null) {
                m40278c(context, i, n);
            }
        }
        return n;
    }

    /* renamed from: o */
    PorterDuff.Mode m40266o(int i) {
        AbstractC1658f fVar = this.f1311g;
        if (fVar == null) {
            return null;
        }
        return fVar.mo40151d(i);
    }

    /* renamed from: s */
    public synchronized void m40262s(Context context) {
        C2098d<WeakReference<Drawable.ConstantState>> dVar = this.f1308d.get(context);
        if (dVar != null) {
            dVar.m39019c();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: t */
    public synchronized Drawable m40261t(Context context, C1731u1 u1Var, int i) {
        Drawable r = m40263r(context, i);
        if (r == null) {
            r = u1Var.m40251a(i);
        }
        if (r == null) {
            return null;
        }
        return m40259v(context, i, false, r);
    }

    /* renamed from: u */
    public synchronized void m40260u(AbstractC1658f fVar) {
        this.f1311g = fVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: x */
    public boolean m40257x(Context context, int i, Drawable drawable) {
        AbstractC1658f fVar = this.f1311g;
        return fVar != null && fVar.mo40152c(context, i, drawable);
    }
}
