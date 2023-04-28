package p422xb;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import p083eb.C6812k;

/* renamed from: xb.k */
/* loaded from: classes3.dex */
public class C14045k {

    /* renamed from: m */
    public static final AbstractC14034c f31662m = new C14043i(0.5f);

    /* renamed from: a */
    C14035d f31663a;

    /* renamed from: b */
    C14035d f31664b;

    /* renamed from: c */
    C14035d f31665c;

    /* renamed from: d */
    C14035d f31666d;

    /* renamed from: e */
    AbstractC14034c f31667e;

    /* renamed from: f */
    AbstractC14034c f31668f;

    /* renamed from: g */
    AbstractC14034c f31669g;

    /* renamed from: h */
    AbstractC14034c f31670h;

    /* renamed from: i */
    C14037f f31671i;

    /* renamed from: j */
    C14037f f31672j;

    /* renamed from: k */
    C14037f f31673k;

    /* renamed from: l */
    C14037f f31674l;

    /* renamed from: xb.k$c */
    /* loaded from: classes3.dex */
    public interface AbstractC14048c {
        /* renamed from: a */
        AbstractC14034c mo1878a(AbstractC14034c cVar);
    }

    /* renamed from: a */
    public static C14047b m1935a() {
        return new C14047b();
    }

    /* renamed from: b */
    public static C14047b m1934b(Context context, int i, int i2) {
        return m1933c(context, i, i2, 0);
    }

    /* renamed from: c */
    private static C14047b m1933c(Context context, int i, int i2, int i3) {
        return m1932d(context, i, i2, new C14032a(i3));
    }

    /* renamed from: d */
    private static C14047b m1932d(Context context, int i, int i2, AbstractC14034c cVar) {
        if (i2 != 0) {
            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i);
            i = i2;
            context = contextThemeWrapper;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, C6812k.f14882z4);
        try {
            int i3 = obtainStyledAttributes.getInt(C6812k.f38036A4, 0);
            int i4 = obtainStyledAttributes.getInt(C6812k.f38060D4, i3);
            int i5 = obtainStyledAttributes.getInt(C6812k.f38068E4, i3);
            int i6 = obtainStyledAttributes.getInt(C6812k.f38052C4, i3);
            int i7 = obtainStyledAttributes.getInt(C6812k.f38044B4, i3);
            AbstractC14034c m = m1923m(obtainStyledAttributes, C6812k.f38076F4, cVar);
            AbstractC14034c m2 = m1923m(obtainStyledAttributes, C6812k.f38100I4, m);
            AbstractC14034c m3 = m1923m(obtainStyledAttributes, C6812k.f38108J4, m);
            AbstractC14034c m4 = m1923m(obtainStyledAttributes, C6812k.f38092H4, m);
            return new C14047b().m1880y(i4, m2).m1908C(i5, m3).m1884u(i6, m4).m1888q(i7, m1923m(obtainStyledAttributes, C6812k.f38084G4, m));
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: e */
    public static C14047b m1931e(Context context, AttributeSet attributeSet, int i, int i2) {
        return m1930f(context, attributeSet, i, i2, 0);
    }

    /* renamed from: f */
    public static C14047b m1930f(Context context, AttributeSet attributeSet, int i, int i2, int i3) {
        return m1929g(context, attributeSet, i, i2, new C14032a(i3));
    }

    /* renamed from: g */
    public static C14047b m1929g(Context context, AttributeSet attributeSet, int i, int i2, AbstractC14034c cVar) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C6812k.f38083G3, i, i2);
        int resourceId = obtainStyledAttributes.getResourceId(C6812k.f38091H3, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(C6812k.f38099I3, 0);
        obtainStyledAttributes.recycle();
        return m1932d(context, resourceId, resourceId2, cVar);
    }

    /* renamed from: m */
    private static AbstractC14034c m1923m(TypedArray typedArray, int i, AbstractC14034c cVar) {
        TypedValue peekValue = typedArray.peekValue(i);
        if (peekValue == null) {
            return cVar;
        }
        int i2 = peekValue.type;
        if (i2 == 5) {
            return new C14032a(TypedValue.complexToDimensionPixelSize(peekValue.data, typedArray.getResources().getDisplayMetrics()));
        }
        if (i2 == 6) {
            return new C14043i(peekValue.getFraction(1.0f, 1.0f));
        }
        return cVar;
    }

    /* renamed from: h */
    public C14037f m1928h() {
        return this.f31673k;
    }

    /* renamed from: i */
    public C14035d m1927i() {
        return this.f31666d;
    }

    /* renamed from: j */
    public AbstractC14034c m1926j() {
        return this.f31670h;
    }

    /* renamed from: k */
    public C14035d m1925k() {
        return this.f31665c;
    }

    /* renamed from: l */
    public AbstractC14034c m1924l() {
        return this.f31669g;
    }

    /* renamed from: n */
    public C14037f m1922n() {
        return this.f31674l;
    }

    /* renamed from: o */
    public C14037f m1921o() {
        return this.f31672j;
    }

    /* renamed from: p */
    public C14037f m1920p() {
        return this.f31671i;
    }

    /* renamed from: q */
    public C14035d m1919q() {
        return this.f31663a;
    }

    /* renamed from: r */
    public AbstractC14034c m1918r() {
        return this.f31667e;
    }

    /* renamed from: s */
    public C14035d m1917s() {
        return this.f31664b;
    }

    /* renamed from: t */
    public AbstractC14034c m1916t() {
        return this.f31668f;
    }

    /* renamed from: u */
    public boolean m1915u(RectF rectF) {
        boolean z;
        boolean z2;
        boolean z3;
        if (!this.f31674l.getClass().equals(C14037f.class) || !this.f31672j.getClass().equals(C14037f.class) || !this.f31671i.getClass().equals(C14037f.class) || !this.f31673k.getClass().equals(C14037f.class)) {
            z = false;
        } else {
            z = true;
        }
        float a = this.f31667e.mo1937a(rectF);
        if (this.f31668f.mo1937a(rectF) == a && this.f31670h.mo1937a(rectF) == a && this.f31669g.mo1937a(rectF) == a) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!(this.f31664b instanceof C14044j) || !(this.f31663a instanceof C14044j) || !(this.f31665c instanceof C14044j) || !(this.f31666d instanceof C14044j)) {
            z3 = false;
        } else {
            z3 = true;
        }
        if (!z || !z2 || !z3) {
            return false;
        }
        return true;
    }

    /* renamed from: v */
    public C14047b m1914v() {
        return new C14047b(this);
    }

    /* renamed from: w */
    public C14045k m1913w(float f) {
        return m1914v().m1890o(f).m1892m();
    }

    /* renamed from: x */
    public C14045k m1912x(AbstractC14034c cVar) {
        return m1914v().m1889p(cVar).m1892m();
    }

    /* renamed from: y */
    public C14045k m1911y(AbstractC14048c cVar) {
        return m1914v().m1909B(cVar.mo1878a(m1918r())).m1905F(cVar.mo1878a(m1916t())).m1885t(cVar.mo1878a(m1926j())).m1881x(cVar.mo1878a(m1924l())).m1892m();
    }

    private C14045k(C14047b bVar) {
        this.f31663a = bVar.f31675a;
        this.f31664b = bVar.f31676b;
        this.f31665c = bVar.f31677c;
        this.f31666d = bVar.f31678d;
        this.f31667e = bVar.f31679e;
        this.f31668f = bVar.f31680f;
        this.f31669g = bVar.f31681g;
        this.f31670h = bVar.f31682h;
        this.f31671i = bVar.f31683i;
        this.f31672j = bVar.f31684j;
        this.f31673k = bVar.f31685k;
        this.f31674l = bVar.f31686l;
    }

    /* renamed from: xb.k$b */
    /* loaded from: classes3.dex */
    public static final class C14047b {

        /* renamed from: a */
        private C14035d f31675a;

        /* renamed from: b */
        private C14035d f31676b;

        /* renamed from: c */
        private C14035d f31677c;

        /* renamed from: d */
        private C14035d f31678d;

        /* renamed from: e */
        private AbstractC14034c f31679e;

        /* renamed from: f */
        private AbstractC14034c f31680f;

        /* renamed from: g */
        private AbstractC14034c f31681g;

        /* renamed from: h */
        private AbstractC14034c f31682h;

        /* renamed from: i */
        private C14037f f31683i;

        /* renamed from: j */
        private C14037f f31684j;

        /* renamed from: k */
        private C14037f f31685k;

        /* renamed from: l */
        private C14037f f31686l;

        public C14047b() {
            this.f31675a = C14042h.m1942b();
            this.f31676b = C14042h.m1942b();
            this.f31677c = C14042h.m1942b();
            this.f31678d = C14042h.m1942b();
            this.f31679e = new C14032a(0.0f);
            this.f31680f = new C14032a(0.0f);
            this.f31681g = new C14032a(0.0f);
            this.f31682h = new C14032a(0.0f);
            this.f31683i = C14042h.m1941c();
            this.f31684j = C14042h.m1941c();
            this.f31685k = C14042h.m1941c();
            this.f31686l = C14042h.m1941c();
        }

        /* renamed from: n */
        private static float m1891n(C14035d dVar) {
            if (dVar instanceof C14044j) {
                return ((C14044j) dVar).f31661a;
            }
            if (dVar instanceof C14036e) {
                return ((C14036e) dVar).f31618a;
            }
            return -1.0f;
        }

        /* renamed from: A */
        public C14047b m1910A(float f) {
            this.f31679e = new C14032a(f);
            return this;
        }

        /* renamed from: B */
        public C14047b m1909B(AbstractC14034c cVar) {
            this.f31679e = cVar;
            return this;
        }

        /* renamed from: C */
        public C14047b m1908C(int i, AbstractC14034c cVar) {
            return m1907D(C14042h.m1943a(i)).m1905F(cVar);
        }

        /* renamed from: D */
        public C14047b m1907D(C14035d dVar) {
            this.f31676b = dVar;
            float n = m1891n(dVar);
            if (n != -1.0f) {
                m1906E(n);
            }
            return this;
        }

        /* renamed from: E */
        public C14047b m1906E(float f) {
            this.f31680f = new C14032a(f);
            return this;
        }

        /* renamed from: F */
        public C14047b m1905F(AbstractC14034c cVar) {
            this.f31680f = cVar;
            return this;
        }

        /* renamed from: m */
        public C14045k m1892m() {
            return new C14045k(this);
        }

        /* renamed from: o */
        public C14047b m1890o(float f) {
            return m1910A(f).m1906E(f).m1882w(f).m1886s(f);
        }

        /* renamed from: p */
        public C14047b m1889p(AbstractC14034c cVar) {
            return m1909B(cVar).m1905F(cVar).m1881x(cVar).m1885t(cVar);
        }

        /* renamed from: q */
        public C14047b m1888q(int i, AbstractC14034c cVar) {
            return m1887r(C14042h.m1943a(i)).m1885t(cVar);
        }

        /* renamed from: r */
        public C14047b m1887r(C14035d dVar) {
            this.f31678d = dVar;
            float n = m1891n(dVar);
            if (n != -1.0f) {
                m1886s(n);
            }
            return this;
        }

        /* renamed from: s */
        public C14047b m1886s(float f) {
            this.f31682h = new C14032a(f);
            return this;
        }

        /* renamed from: t */
        public C14047b m1885t(AbstractC14034c cVar) {
            this.f31682h = cVar;
            return this;
        }

        /* renamed from: u */
        public C14047b m1884u(int i, AbstractC14034c cVar) {
            return m1883v(C14042h.m1943a(i)).m1881x(cVar);
        }

        /* renamed from: v */
        public C14047b m1883v(C14035d dVar) {
            this.f31677c = dVar;
            float n = m1891n(dVar);
            if (n != -1.0f) {
                m1882w(n);
            }
            return this;
        }

        /* renamed from: w */
        public C14047b m1882w(float f) {
            this.f31681g = new C14032a(f);
            return this;
        }

        /* renamed from: x */
        public C14047b m1881x(AbstractC14034c cVar) {
            this.f31681g = cVar;
            return this;
        }

        /* renamed from: y */
        public C14047b m1880y(int i, AbstractC14034c cVar) {
            return m1879z(C14042h.m1943a(i)).m1909B(cVar);
        }

        /* renamed from: z */
        public C14047b m1879z(C14035d dVar) {
            this.f31675a = dVar;
            float n = m1891n(dVar);
            if (n != -1.0f) {
                m1910A(n);
            }
            return this;
        }

        public C14047b(C14045k kVar) {
            this.f31675a = C14042h.m1942b();
            this.f31676b = C14042h.m1942b();
            this.f31677c = C14042h.m1942b();
            this.f31678d = C14042h.m1942b();
            this.f31679e = new C14032a(0.0f);
            this.f31680f = new C14032a(0.0f);
            this.f31681g = new C14032a(0.0f);
            this.f31682h = new C14032a(0.0f);
            this.f31683i = C14042h.m1941c();
            this.f31684j = C14042h.m1941c();
            this.f31685k = C14042h.m1941c();
            this.f31686l = C14042h.m1941c();
            this.f31675a = kVar.f31663a;
            this.f31676b = kVar.f31664b;
            this.f31677c = kVar.f31665c;
            this.f31678d = kVar.f31666d;
            this.f31679e = kVar.f31667e;
            this.f31680f = kVar.f31668f;
            this.f31681g = kVar.f31669g;
            this.f31682h = kVar.f31670h;
            this.f31683i = kVar.f31671i;
            this.f31684j = kVar.f31672j;
            this.f31685k = kVar.f31673k;
            this.f31686l = kVar.f31674l;
        }
    }

    public C14045k() {
        this.f31663a = C14042h.m1942b();
        this.f31664b = C14042h.m1942b();
        this.f31665c = C14042h.m1942b();
        this.f31666d = C14042h.m1942b();
        this.f31667e = new C14032a(0.0f);
        this.f31668f = new C14032a(0.0f);
        this.f31669g = new C14032a(0.0f);
        this.f31670h = new C14032a(0.0f);
        this.f31671i = C14042h.m1941c();
        this.f31672j = C14042h.m1941c();
        this.f31673k = C14042h.m1941c();
        this.f31674l = C14042h.m1941c();
    }
}
