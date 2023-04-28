package p144i;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.appcompat.view.menu.C1579g;
import androidx.appcompat.widget.C1698n1;
import androidx.appcompat.widget.C1709q0;
import androidx.core.view.AbstractC2599b;
import androidx.core.view.C2660l0;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p034c1.AbstractMenuC3752a;
import p052d.C6388j;
import p164j.MenuItemC9451c;

/* renamed from: i.d */
/* loaded from: classes.dex */
public class C8097d extends MenuInflater {

    /* renamed from: e */
    static final Class<?>[] f17487e;

    /* renamed from: f */
    static final Class<?>[] f17488f;

    /* renamed from: a */
    final Object[] f17489a;

    /* renamed from: b */
    final Object[] f17490b;

    /* renamed from: c */
    Context f17491c;

    /* renamed from: d */
    private Object f17492d;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i.d$a */
    /* loaded from: classes.dex */
    public static class MenuItem$OnMenuItemClickListenerC8098a implements MenuItem.OnMenuItemClickListener {

        /* renamed from: c */
        private static final Class<?>[] f17493c = {MenuItem.class};

        /* renamed from: a */
        private Object f17494a;

        /* renamed from: b */
        private Method f17495b;

        public MenuItem$OnMenuItemClickListenerC8098a(Object obj, String str) {
            this.f17494a = obj;
            Class<?> cls = obj.getClass();
            try {
                this.f17495b = cls.getMethod(str, f17493c);
            } catch (Exception e) {
                InflateException inflateException = new InflateException("Couldn't resolve menu item onClick handler " + str + " in class " + cls.getName());
                inflateException.initCause(e);
                throw inflateException;
            }
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
            try {
                if (this.f17495b.getReturnType() == Boolean.TYPE) {
                    return ((Boolean) this.f17495b.invoke(this.f17494a, menuItem)).booleanValue();
                }
                this.f17495b.invoke(this.f17494a, menuItem);
                return true;
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i.d$b */
    /* loaded from: classes.dex */
    public class C8099b {

        /* renamed from: A */
        AbstractC2599b f38538A;

        /* renamed from: B */
        private CharSequence f38539B;

        /* renamed from: C */
        private CharSequence f38540C;

        /* renamed from: D */
        private ColorStateList f38541D = null;

        /* renamed from: E */
        private PorterDuff.Mode f38542E = null;

        /* renamed from: a */
        private Menu f17496a;

        /* renamed from: b */
        private int f17497b;

        /* renamed from: c */
        private int f17498c;

        /* renamed from: d */
        private int f17499d;

        /* renamed from: e */
        private int f17500e;

        /* renamed from: f */
        private boolean f17501f;

        /* renamed from: g */
        private boolean f17502g;

        /* renamed from: h */
        private boolean f17503h;

        /* renamed from: i */
        private int f17504i;

        /* renamed from: j */
        private int f17505j;

        /* renamed from: k */
        private CharSequence f17506k;

        /* renamed from: l */
        private CharSequence f17507l;

        /* renamed from: m */
        private int f17508m;

        /* renamed from: n */
        private char f17509n;

        /* renamed from: o */
        private int f17510o;

        /* renamed from: p */
        private char f17511p;

        /* renamed from: q */
        private int f17512q;

        /* renamed from: r */
        private int f17513r;

        /* renamed from: s */
        private boolean f17514s;

        /* renamed from: t */
        private boolean f17515t;

        /* renamed from: u */
        private boolean f17516u;

        /* renamed from: v */
        private int f17517v;

        /* renamed from: w */
        private int f17518w;

        /* renamed from: x */
        private String f17519x;

        /* renamed from: y */
        private String f17520y;

        /* renamed from: z */
        private String f17521z;

        public C8099b(Menu menu) {
            this.f17496a = menu;
            m20606h();
        }

        /* renamed from: c */
        private char m20611c(String str) {
            if (str == null) {
                return (char) 0;
            }
            return str.charAt(0);
        }

        /* renamed from: e */
        private <T> T m20609e(String str, Class<?>[] clsArr, Object[] objArr) {
            try {
                Constructor<?> constructor = Class.forName(str, false, C8097d.this.f17491c.getClassLoader()).getConstructor(clsArr);
                constructor.setAccessible(true);
                return (T) constructor.newInstance(objArr);
            } catch (Exception e) {
                Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e);
                return null;
            }
        }

        /* renamed from: i */
        private void m20605i(MenuItem menuItem) {
            boolean z;
            MenuItem enabled = menuItem.setChecked(this.f17514s).setVisible(this.f17515t).setEnabled(this.f17516u);
            boolean z2 = false;
            if (this.f17513r >= 1) {
                z = true;
            } else {
                z = false;
            }
            enabled.setCheckable(z).setTitleCondensed(this.f17507l).setIcon(this.f17508m);
            int i = this.f17517v;
            if (i >= 0) {
                menuItem.setShowAsAction(i);
            }
            if (this.f17521z != null) {
                if (!C8097d.this.f17491c.isRestricted()) {
                    menuItem.setOnMenuItemClickListener(new MenuItem$OnMenuItemClickListenerC8098a(C8097d.this.m20615b(), this.f17521z));
                } else {
                    throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
                }
            }
            if (this.f17513r >= 2) {
                if (menuItem instanceof C1579g) {
                    ((C1579g) menuItem).m40605t(true);
                } else if (menuItem instanceof MenuItemC9451c) {
                    ((MenuItemC9451c) menuItem).m16211h(true);
                }
            }
            String str = this.f17519x;
            if (str != null) {
                menuItem.setActionView((View) m20609e(str, C8097d.f17487e, C8097d.this.f17489a));
                z2 = true;
            }
            int i2 = this.f17518w;
            if (i2 > 0) {
                if (!z2) {
                    menuItem.setActionView(i2);
                } else {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
                }
            }
            AbstractC2599b bVar = this.f38538A;
            if (bVar != null) {
                C2660l0.m37217a(menuItem, bVar);
            }
            C2660l0.m37215c(menuItem, this.f38539B);
            C2660l0.m37211g(menuItem, this.f38540C);
            C2660l0.m37216b(menuItem, this.f17509n, this.f17510o);
            C2660l0.m37212f(menuItem, this.f17511p, this.f17512q);
            PorterDuff.Mode mode = this.f38542E;
            if (mode != null) {
                C2660l0.m37213e(menuItem, mode);
            }
            ColorStateList colorStateList = this.f38541D;
            if (colorStateList != null) {
                C2660l0.m37214d(menuItem, colorStateList);
            }
        }

        /* renamed from: a */
        public void m20613a() {
            this.f17503h = true;
            m20605i(this.f17496a.add(this.f17497b, this.f17504i, this.f17505j, this.f17506k));
        }

        /* renamed from: b */
        public SubMenu m20612b() {
            this.f17503h = true;
            SubMenu addSubMenu = this.f17496a.addSubMenu(this.f17497b, this.f17504i, this.f17505j, this.f17506k);
            m20605i(addSubMenu.getItem());
            return addSubMenu;
        }

        /* renamed from: d */
        public boolean m20610d() {
            return this.f17503h;
        }

        /* renamed from: f */
        public void m20608f(AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = C8097d.this.f17491c.obtainStyledAttributes(attributeSet, C6388j.f13307o1);
            this.f17497b = obtainStyledAttributes.getResourceId(C6388j.f13317q1, 0);
            this.f17498c = obtainStyledAttributes.getInt(C6388j.f13327s1, 0);
            this.f17499d = obtainStyledAttributes.getInt(C6388j.f13332t1, 0);
            this.f17500e = obtainStyledAttributes.getInt(C6388j.f13337u1, 0);
            this.f17501f = obtainStyledAttributes.getBoolean(C6388j.f13322r1, true);
            this.f17502g = obtainStyledAttributes.getBoolean(C6388j.f13312p1, true);
            obtainStyledAttributes.recycle();
        }

        /* renamed from: g */
        public void m20607g(AttributeSet attributeSet) {
            boolean z;
            C1698n1 u = C1698n1.m40106u(C8097d.this.f17491c, attributeSet, C6388j.f13342v1);
            this.f17504i = u.m40113n(C6388j.f13357y1, 0);
            this.f17505j = (u.m40116k(C6388j.f37792B1, this.f17498c) & (-65536)) | (u.m40116k(C6388j.f37797C1, this.f17499d) & 65535);
            this.f17506k = u.m40111p(C6388j.f37802D1);
            this.f17507l = u.m40111p(C6388j.f37807E1);
            this.f17508m = u.m40113n(C6388j.f13347w1, 0);
            this.f17509n = m20611c(u.m40112o(C6388j.f37812F1));
            this.f17510o = u.m40116k(C6388j.f37847M1, 4096);
            this.f17511p = m20611c(u.m40112o(C6388j.f37817G1));
            this.f17512q = u.m40116k(C6388j.f37867Q1, 4096);
            int i = C6388j.f37822H1;
            if (u.m40108s(i)) {
                this.f17513r = u.m40126a(i, false) ? 1 : 0;
            } else {
                this.f17513r = this.f17500e;
            }
            this.f17514s = u.m40126a(C6388j.f13362z1, false);
            this.f17515t = u.m40126a(C6388j.f37787A1, this.f17501f);
            this.f17516u = u.m40126a(C6388j.f13352x1, this.f17502g);
            this.f17517v = u.m40116k(C6388j.f37872R1, -1);
            this.f17521z = u.m40112o(C6388j.f37827I1);
            this.f17518w = u.m40113n(C6388j.f37832J1, 0);
            this.f17519x = u.m40112o(C6388j.f37842L1);
            String o = u.m40112o(C6388j.f37837K1);
            this.f17520y = o;
            if (o != null) {
                z = true;
            } else {
                z = false;
            }
            if (z && this.f17518w == 0 && this.f17519x == null) {
                this.f38538A = (AbstractC2599b) m20609e(o, C8097d.f17488f, C8097d.this.f17490b);
            } else {
                if (z) {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                }
                this.f38538A = null;
            }
            this.f38539B = u.m40111p(C6388j.f37852N1);
            this.f38540C = u.m40111p(C6388j.f37877S1);
            int i2 = C6388j.f37862P1;
            if (u.m40108s(i2)) {
                this.f38542E = C1709q0.m40054e(u.m40116k(i2, -1), this.f38542E);
            } else {
                this.f38542E = null;
            }
            int i3 = C6388j.f37857O1;
            if (u.m40108s(i3)) {
                this.f38541D = u.m40124c(i3);
            } else {
                this.f38541D = null;
            }
            u.m40104w();
            this.f17503h = false;
        }

        /* renamed from: h */
        public void m20606h() {
            this.f17497b = 0;
            this.f17498c = 0;
            this.f17499d = 0;
            this.f17500e = 0;
            this.f17501f = true;
            this.f17502g = true;
        }
    }

    static {
        Class<?>[] clsArr = {Context.class};
        f17487e = clsArr;
        f17488f = clsArr;
    }

    public C8097d(Context context) {
        super(context);
        this.f17491c = context;
        Object[] objArr = {context};
        this.f17489a = objArr;
        this.f17490b = objArr;
    }

    /* renamed from: a */
    private Object m20616a(Object obj) {
        if (obj instanceof Activity) {
            return obj;
        }
        if (obj instanceof ContextWrapper) {
            return m20616a(((ContextWrapper) obj).getBaseContext());
        }
        return obj;
    }

    /* renamed from: c */
    private void m20614c(XmlPullParser xmlPullParser, AttributeSet attributeSet, Menu menu) {
        C8099b bVar = new C8099b(menu);
        int eventType = xmlPullParser.getEventType();
        while (true) {
            if (eventType != 2) {
                eventType = xmlPullParser.next();
                if (eventType == 1) {
                    break;
                }
            } else {
                String name = xmlPullParser.getName();
                if (name.equals("menu")) {
                    eventType = xmlPullParser.next();
                } else {
                    throw new RuntimeException("Expecting menu, got " + name);
                }
            }
        }
        boolean z = false;
        boolean z2 = false;
        String str = null;
        while (!z) {
            if (eventType != 1) {
                if (eventType != 2) {
                    if (eventType == 3) {
                        String name2 = xmlPullParser.getName();
                        if (z2 && name2.equals(str)) {
                            z2 = false;
                            str = null;
                        } else if (name2.equals("group")) {
                            bVar.m20606h();
                        } else if (name2.equals("item")) {
                            if (!bVar.m20610d()) {
                                AbstractC2599b bVar2 = bVar.f38538A;
                                if (bVar2 == null || !bVar2.mo16210a()) {
                                    bVar.m20613a();
                                } else {
                                    bVar.m20612b();
                                }
                            }
                        } else if (name2.equals("menu")) {
                            z = true;
                        }
                    }
                } else if (!z2) {
                    String name3 = xmlPullParser.getName();
                    if (name3.equals("group")) {
                        bVar.m20608f(attributeSet);
                    } else if (name3.equals("item")) {
                        bVar.m20607g(attributeSet);
                    } else if (name3.equals("menu")) {
                        m20614c(xmlPullParser, attributeSet, bVar.m20612b());
                    } else {
                        str = name3;
                        z2 = true;
                    }
                }
                eventType = xmlPullParser.next();
            } else {
                throw new RuntimeException("Unexpected end of document");
            }
        }
    }

    /* renamed from: b */
    Object m20615b() {
        if (this.f17492d == null) {
            this.f17492d = m20616a(this.f17491c);
        }
        return this.f17492d;
    }

    @Override // android.view.MenuInflater
    public void inflate(int i, Menu menu) {
        if (!(menu instanceof AbstractMenuC3752a)) {
            super.inflate(i, menu);
            return;
        }
        XmlResourceParser xmlResourceParser = null;
        try {
            try {
                try {
                    xmlResourceParser = this.f17491c.getResources().getLayout(i);
                    m20614c(xmlResourceParser, Xml.asAttributeSet(xmlResourceParser), menu);
                } catch (XmlPullParserException e) {
                    throw new InflateException("Error inflating menu XML", e);
                }
            } catch (IOException e2) {
                throw new InflateException("Error inflating menu XML", e2);
            }
        } finally {
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
        }
    }
}
