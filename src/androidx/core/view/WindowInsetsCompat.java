package androidx.core.view;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.DisplayCutout;
import android.view.View;
import android.view.WindowInsets;
import androidx.core.graphics.Insets;
import androidx.core.util.C2513d;
import androidx.core.util.C2517g;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Objects;

/* loaded from: classes.dex */
public class WindowInsetsCompat {

    /* renamed from: b */
    public static final WindowInsetsCompat f3512b;

    /* renamed from: a */
    private final C2541l f3513a;

    @SuppressLint({"SoonBlockedPrivateApi"})
    /* renamed from: androidx.core.view.WindowInsetsCompat$a */
    /* loaded from: classes.dex */
    static class C2530a {

        /* renamed from: a */
        private static Field f3514a;

        /* renamed from: b */
        private static Field f3515b;

        /* renamed from: c */
        private static Field f3516c;

        /* renamed from: d */
        private static boolean f3517d;

        static {
            try {
                Field declaredField = View.class.getDeclaredField("mAttachInfo");
                f3514a = declaredField;
                declaredField.setAccessible(true);
                Class<?> cls = Class.forName("android.view.View$AttachInfo");
                Field declaredField2 = cls.getDeclaredField("mStableInsets");
                f3515b = declaredField2;
                declaredField2.setAccessible(true);
                Field declaredField3 = cls.getDeclaredField("mContentInsets");
                f3516c = declaredField3;
                declaredField3.setAccessible(true);
                f3517d = true;
            } catch (ReflectiveOperationException e) {
                Log.w("WindowInsetsCompat", "Failed to get visible insets from AttachInfo " + e.getMessage(), e);
            }
        }

        /* renamed from: a */
        public static WindowInsetsCompat m37500a(View view) {
            if (f3517d && view.isAttachedToWindow()) {
                try {
                    Object obj = f3514a.get(view.getRootView());
                    if (obj != null) {
                        Rect rect = (Rect) f3515b.get(obj);
                        Rect rect2 = (Rect) f3516c.get(obj);
                        if (!(rect == null || rect2 == null)) {
                            WindowInsetsCompat a = new C2531b().m37497c(Insets.m37934c(rect)).m37496d(Insets.m37934c(rect2)).m37499a();
                            a.m37505v(a);
                            a.m37523d(view.getRootView());
                            return a;
                        }
                    }
                } catch (IllegalAccessException e) {
                    Log.w("WindowInsetsCompat", "Failed to get insets from AttachInfo. " + e.getMessage(), e);
                }
            }
            return null;
        }
    }

    /* renamed from: androidx.core.view.WindowInsetsCompat$e */
    /* loaded from: classes.dex */
    private static class C2534e extends C2533d {
        C2534e() {
        }

        @Override // androidx.core.view.WindowInsetsCompat.C2535f
        /* renamed from: c */
        void mo37492c(int i, Insets insets) {
            this.f3525c.setInsets(C2543n.m37454a(i), insets.m37932e());
        }

        C2534e(WindowInsetsCompat windowInsetsCompat) {
            super(windowInsetsCompat);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.core.view.WindowInsetsCompat$f */
    /* loaded from: classes.dex */
    public static class C2535f {

        /* renamed from: a */
        private final WindowInsetsCompat f3526a;

        /* renamed from: b */
        Insets[] f3527b;

        C2535f() {
            this(new WindowInsetsCompat((WindowInsetsCompat) null));
        }

        /* renamed from: a */
        protected final void m37494a() {
            Insets[] insetsArr = this.f3527b;
            if (insetsArr != null) {
                Insets insets = insetsArr[C2542m.m37459c(1)];
                Insets insets2 = this.f3527b[C2542m.m37459c(2)];
                if (insets2 == null) {
                    insets2 = this.f3526a.m37521f(2);
                }
                if (insets == null) {
                    insets = this.f3526a.m37521f(1);
                }
                mo37488g(Insets.m37936a(insets, insets2));
                Insets insets3 = this.f3527b[C2542m.m37459c(16)];
                if (insets3 != null) {
                    mo37489f(insets3);
                }
                Insets insets4 = this.f3527b[C2542m.m37459c(32)];
                if (insets4 != null) {
                    mo37491d(insets4);
                }
                Insets insets5 = this.f3527b[C2542m.m37459c(64)];
                if (insets5 != null) {
                    mo37487h(insets5);
                }
            }
        }

        /* renamed from: b */
        WindowInsetsCompat mo37493b() {
            throw null;
        }

        /* renamed from: c */
        void mo37492c(int i, Insets insets) {
            if (this.f3527b == null) {
                this.f3527b = new Insets[9];
            }
            for (int i2 = 1; i2 <= 256; i2 <<= 1) {
                if ((i & i2) != 0) {
                    this.f3527b[C2542m.m37459c(i2)] = insets;
                }
            }
        }

        /* renamed from: d */
        void mo37491d(Insets insets) {
        }

        /* renamed from: e */
        void mo37490e(Insets insets) {
            throw null;
        }

        /* renamed from: f */
        void mo37489f(Insets insets) {
        }

        /* renamed from: g */
        void mo37488g(Insets insets) {
            throw null;
        }

        /* renamed from: h */
        void mo37487h(Insets insets) {
        }

        C2535f(WindowInsetsCompat windowInsetsCompat) {
            this.f3526a = windowInsetsCompat;
        }
    }

    /* renamed from: androidx.core.view.WindowInsetsCompat$i */
    /* loaded from: classes.dex */
    private static class C2538i extends C2537h {
        C2538i(WindowInsetsCompat windowInsetsCompat, WindowInsets windowInsets) {
            super(windowInsetsCompat, windowInsets);
        }

        @Override // androidx.core.view.WindowInsetsCompat.C2541l
        /* renamed from: a */
        WindowInsetsCompat mo37481a() {
            WindowInsets consumeDisplayCutout;
            consumeDisplayCutout = this.f3533c.consumeDisplayCutout();
            return WindowInsetsCompat.m37502y(consumeDisplayCutout);
        }

        @Override // androidx.core.view.WindowInsetsCompat.C2536g, androidx.core.view.WindowInsetsCompat.C2541l
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C2538i)) {
                return false;
            }
            C2538i iVar = (C2538i) obj;
            if (!Objects.equals(this.f3533c, iVar.f3533c) || !Objects.equals(this.f3537g, iVar.f3537g)) {
                return false;
            }
            return true;
        }

        @Override // androidx.core.view.WindowInsetsCompat.C2541l
        /* renamed from: f */
        C2700s mo37476f() {
            DisplayCutout displayCutout;
            displayCutout = this.f3533c.getDisplayCutout();
            return C2700s.m37136e(displayCutout);
        }

        @Override // androidx.core.view.WindowInsetsCompat.C2541l
        public int hashCode() {
            return this.f3533c.hashCode();
        }

        C2538i(WindowInsetsCompat windowInsetsCompat, C2538i iVar) {
            super(windowInsetsCompat, iVar);
        }
    }

    /* renamed from: androidx.core.view.WindowInsetsCompat$k */
    /* loaded from: classes.dex */
    private static class C2540k extends C2539j {

        /* renamed from: q */
        static final WindowInsetsCompat f3542q;

        static {
            WindowInsets windowInsets;
            windowInsets = WindowInsets.CONSUMED;
            f3542q = WindowInsetsCompat.m37502y(windowInsets);
        }

        C2540k(WindowInsetsCompat windowInsetsCompat, WindowInsets windowInsets) {
            super(windowInsetsCompat, windowInsets);
        }

        @Override // androidx.core.view.WindowInsetsCompat.C2536g, androidx.core.view.WindowInsetsCompat.C2541l
        /* renamed from: d */
        final void mo37478d(View view) {
        }

        @Override // androidx.core.view.WindowInsetsCompat.C2536g, androidx.core.view.WindowInsetsCompat.C2541l
        /* renamed from: g */
        public Insets mo37475g(int i) {
            android.graphics.Insets insets;
            insets = this.f3533c.getInsets(C2543n.m37454a(i));
            return Insets.m37933d(insets);
        }

        @Override // androidx.core.view.WindowInsetsCompat.C2536g, androidx.core.view.WindowInsetsCompat.C2541l
        /* renamed from: h */
        public Insets mo37474h(int i) {
            android.graphics.Insets insetsIgnoringVisibility;
            insetsIgnoringVisibility = this.f3533c.getInsetsIgnoringVisibility(C2543n.m37454a(i));
            return Insets.m37933d(insetsIgnoringVisibility);
        }

        C2540k(WindowInsetsCompat windowInsetsCompat, C2540k kVar) {
            super(windowInsetsCompat, kVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.core.view.WindowInsetsCompat$l */
    /* loaded from: classes.dex */
    public static class C2541l {

        /* renamed from: b */
        static final WindowInsetsCompat f3543b = new C2531b().m37499a().m37526a().m37525b().m37524c();

        /* renamed from: a */
        final WindowInsetsCompat f3544a;

        C2541l(WindowInsetsCompat windowInsetsCompat) {
            this.f3544a = windowInsetsCompat;
        }

        /* renamed from: a */
        WindowInsetsCompat mo37481a() {
            return this.f3544a;
        }

        /* renamed from: b */
        WindowInsetsCompat mo37480b() {
            return this.f3544a;
        }

        /* renamed from: c */
        WindowInsetsCompat mo37479c() {
            return this.f3544a;
        }

        /* renamed from: d */
        void mo37478d(View view) {
        }

        /* renamed from: e */
        void mo37477e(WindowInsetsCompat windowInsetsCompat) {
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C2541l)) {
                return false;
            }
            C2541l lVar = (C2541l) obj;
            if (mo37466p() != lVar.mo37466p() || mo37467o() != lVar.mo37467o() || !C2513d.m37601a(mo37470l(), lVar.mo37470l()) || !C2513d.m37601a(mo37472j(), lVar.mo37472j()) || !C2513d.m37601a(mo37476f(), lVar.mo37476f())) {
                return false;
            }
            return true;
        }

        /* renamed from: f */
        C2700s mo37476f() {
            return null;
        }

        /* renamed from: g */
        Insets mo37475g(int i) {
            return Insets.f3325e;
        }

        /* renamed from: h */
        Insets mo37474h(int i) {
            if ((i & 8) == 0) {
                return Insets.f3325e;
            }
            throw new IllegalArgumentException("Unable to query the maximum insets for IME");
        }

        public int hashCode() {
            return C2513d.m37600b(Boolean.valueOf(mo37466p()), Boolean.valueOf(mo37467o()), mo37470l(), mo37472j(), mo37476f());
        }

        /* renamed from: i */
        Insets mo37473i() {
            return mo37470l();
        }

        /* renamed from: j */
        Insets mo37472j() {
            return Insets.f3325e;
        }

        /* renamed from: k */
        Insets mo37471k() {
            return mo37470l();
        }

        /* renamed from: l */
        Insets mo37470l() {
            return Insets.f3325e;
        }

        /* renamed from: m */
        Insets mo37469m() {
            return mo37470l();
        }

        /* renamed from: n */
        WindowInsetsCompat mo37468n(int i, int i2, int i3, int i4) {
            return f3543b;
        }

        /* renamed from: o */
        boolean mo37467o() {
            return false;
        }

        /* renamed from: p */
        boolean mo37466p() {
            return false;
        }

        /* renamed from: q */
        public void mo37465q(Insets[] insetsArr) {
        }

        /* renamed from: r */
        void mo37464r(Insets insets) {
        }

        /* renamed from: s */
        void mo37463s(WindowInsetsCompat windowInsetsCompat) {
        }

        /* renamed from: t */
        public void mo37462t(Insets insets) {
        }
    }

    /* renamed from: androidx.core.view.WindowInsetsCompat$m */
    /* loaded from: classes.dex */
    public static final class C2542m {
        /* renamed from: a */
        public static int m37461a() {
            return 128;
        }

        /* renamed from: b */
        public static int m37460b() {
            return 8;
        }

        /* renamed from: c */
        static int m37459c(int i) {
            if (i == 1) {
                return 0;
            }
            if (i == 2) {
                return 1;
            }
            if (i == 4) {
                return 2;
            }
            if (i == 8) {
                return 3;
            }
            if (i == 16) {
                return 4;
            }
            if (i == 32) {
                return 5;
            }
            if (i == 64) {
                return 6;
            }
            if (i == 128) {
                return 7;
            }
            if (i == 256) {
                return 8;
            }
            throw new IllegalArgumentException("type needs to be >= FIRST and <= LAST, type=" + i);
        }

        /* renamed from: d */
        public static int m37458d() {
            return 32;
        }

        /* renamed from: e */
        public static int m37457e() {
            return 2;
        }

        /* renamed from: f */
        public static int m37456f() {
            return 1;
        }

        /* renamed from: g */
        public static int m37455g() {
            return 7;
        }
    }

    /* renamed from: androidx.core.view.WindowInsetsCompat$n */
    /* loaded from: classes.dex */
    private static final class C2543n {
        /* renamed from: a */
        static int m37454a(int i) {
            int i2;
            int i3 = 0;
            for (int i4 = 1; i4 <= 256; i4 <<= 1) {
                if ((i & i4) != 0) {
                    if (i4 == 1) {
                        i2 = WindowInsets.Type.statusBars();
                    } else if (i4 == 2) {
                        i2 = WindowInsets.Type.navigationBars();
                    } else if (i4 == 4) {
                        i2 = WindowInsets.Type.captionBar();
                    } else if (i4 == 8) {
                        i2 = WindowInsets.Type.ime();
                    } else if (i4 == 16) {
                        i2 = WindowInsets.Type.systemGestures();
                    } else if (i4 == 32) {
                        i2 = WindowInsets.Type.mandatorySystemGestures();
                    } else if (i4 == 64) {
                        i2 = WindowInsets.Type.tappableElement();
                    } else if (i4 == 128) {
                        i2 = WindowInsets.Type.displayCutout();
                    }
                    i3 |= i2;
                }
            }
            return i3;
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 30) {
            f3512b = C2540k.f3542q;
        } else {
            f3512b = C2541l.f3543b;
        }
    }

    private WindowInsetsCompat(WindowInsets windowInsets) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            this.f3513a = new C2540k(this, windowInsets);
        } else if (i >= 29) {
            this.f3513a = new C2539j(this, windowInsets);
        } else if (i >= 28) {
            this.f3513a = new C2538i(this, windowInsets);
        } else {
            this.f3513a = new C2537h(this, windowInsets);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q */
    public static Insets m37510q(Insets insets, int i, int i2, int i3, int i4) {
        int max = Math.max(0, insets.f3326a - i);
        int max2 = Math.max(0, insets.f3327b - i2);
        int max3 = Math.max(0, insets.f3328c - i3);
        int max4 = Math.max(0, insets.f3329d - i4);
        if (max == i && max2 == i2 && max3 == i3 && max4 == i4) {
            return insets;
        }
        return Insets.m37935b(max, max2, max3, max4);
    }

    /* renamed from: y */
    public static WindowInsetsCompat m37502y(WindowInsets windowInsets) {
        return m37501z(windowInsets, null);
    }

    /* renamed from: z */
    public static WindowInsetsCompat m37501z(WindowInsets windowInsets, View view) {
        WindowInsetsCompat windowInsetsCompat = new WindowInsetsCompat((WindowInsets) C2517g.m37588g(windowInsets));
        if (view != null && C2733w0.m37030T(view)) {
            windowInsetsCompat.m37505v(C2733w0.m37049I(view));
            windowInsetsCompat.m37523d(view.getRootView());
        }
        return windowInsetsCompat;
    }

    @Deprecated
    /* renamed from: a */
    public WindowInsetsCompat m37526a() {
        return this.f3513a.mo37481a();
    }

    @Deprecated
    /* renamed from: b */
    public WindowInsetsCompat m37525b() {
        return this.f3513a.mo37480b();
    }

    @Deprecated
    /* renamed from: c */
    public WindowInsetsCompat m37524c() {
        return this.f3513a.mo37479c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public void m37523d(View view) {
        this.f3513a.mo37478d(view);
    }

    /* renamed from: e */
    public C2700s m37522e() {
        return this.f3513a.mo37476f();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WindowInsetsCompat)) {
            return false;
        }
        return C2513d.m37601a(this.f3513a, ((WindowInsetsCompat) obj).f3513a);
    }

    /* renamed from: f */
    public Insets m37521f(int i) {
        return this.f3513a.mo37475g(i);
    }

    /* renamed from: g */
    public Insets m37520g(int i) {
        return this.f3513a.mo37474h(i);
    }

    @Deprecated
    /* renamed from: h */
    public int m37519h() {
        return this.f3513a.mo37472j().f3329d;
    }

    public int hashCode() {
        C2541l lVar = this.f3513a;
        if (lVar == null) {
            return 0;
        }
        return lVar.hashCode();
    }

    @Deprecated
    /* renamed from: i */
    public int m37518i() {
        return this.f3513a.mo37472j().f3327b;
    }

    @Deprecated
    /* renamed from: j */
    public Insets m37517j() {
        return this.f3513a.mo37472j();
    }

    @Deprecated
    /* renamed from: k */
    public Insets m37516k() {
        return this.f3513a.mo37471k();
    }

    @Deprecated
    /* renamed from: l */
    public int m37515l() {
        return this.f3513a.mo37470l().f3329d;
    }

    @Deprecated
    /* renamed from: m */
    public int m37514m() {
        return this.f3513a.mo37470l().f3326a;
    }

    @Deprecated
    /* renamed from: n */
    public int m37513n() {
        return this.f3513a.mo37470l().f3328c;
    }

    @Deprecated
    /* renamed from: o */
    public int m37512o() {
        return this.f3513a.mo37470l().f3327b;
    }

    /* renamed from: p */
    public WindowInsetsCompat m37511p(int i, int i2, int i3, int i4) {
        return this.f3513a.mo37468n(i, i2, i3, i4);
    }

    /* renamed from: r */
    public boolean m37509r() {
        return this.f3513a.mo37467o();
    }

    @Deprecated
    /* renamed from: s */
    public WindowInsetsCompat m37508s(int i, int i2, int i3, int i4) {
        return new C2531b(this).m37496d(Insets.m37935b(i, i2, i3, i4)).m37499a();
    }

    /* renamed from: t */
    void m37507t(Insets[] insetsArr) {
        this.f3513a.mo37465q(insetsArr);
    }

    /* renamed from: u */
    void m37506u(Insets insets) {
        this.f3513a.mo37464r(insets);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: v */
    public void m37505v(WindowInsetsCompat windowInsetsCompat) {
        this.f3513a.mo37463s(windowInsetsCompat);
    }

    /* renamed from: w */
    void m37504w(Insets insets) {
        this.f3513a.mo37462t(insets);
    }

    /* renamed from: x */
    public WindowInsets m37503x() {
        C2541l lVar = this.f3513a;
        if (lVar instanceof C2536g) {
            return ((C2536g) lVar).f3533c;
        }
        return null;
    }

    /* renamed from: androidx.core.view.WindowInsetsCompat$c */
    /* loaded from: classes.dex */
    private static class C2532c extends C2535f {

        /* renamed from: e */
        private static Field f3519e = null;

        /* renamed from: f */
        private static boolean f3520f = false;

        /* renamed from: g */
        private static Constructor<WindowInsets> f3521g = null;

        /* renamed from: h */
        private static boolean f3522h = false;

        /* renamed from: c */
        private WindowInsets f3523c;

        /* renamed from: d */
        private Insets f3524d;

        C2532c() {
            this.f3523c = m37495i();
        }

        /* renamed from: i */
        private static WindowInsets m37495i() {
            if (!f3520f) {
                try {
                    f3519e = WindowInsets.class.getDeclaredField("CONSUMED");
                } catch (ReflectiveOperationException e) {
                    Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e);
                }
                f3520f = true;
            }
            Field field = f3519e;
            if (field != null) {
                try {
                    WindowInsets windowInsets = (WindowInsets) field.get(null);
                    if (windowInsets != null) {
                        return new WindowInsets(windowInsets);
                    }
                } catch (ReflectiveOperationException e2) {
                    Log.i("WindowInsetsCompat", "Could not get value from WindowInsets.CONSUMED field", e2);
                }
            }
            if (!f3522h) {
                try {
                    f3521g = WindowInsets.class.getConstructor(Rect.class);
                } catch (ReflectiveOperationException e3) {
                    Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e3);
                }
                f3522h = true;
            }
            Constructor<WindowInsets> constructor = f3521g;
            if (constructor != null) {
                try {
                    return constructor.newInstance(new Rect());
                } catch (ReflectiveOperationException e4) {
                    Log.i("WindowInsetsCompat", "Could not invoke WindowInsets(Rect) constructor", e4);
                }
            }
            return null;
        }

        @Override // androidx.core.view.WindowInsetsCompat.C2535f
        /* renamed from: b */
        WindowInsetsCompat mo37493b() {
            m37494a();
            WindowInsetsCompat y = WindowInsetsCompat.m37502y(this.f3523c);
            y.m37507t(this.f3527b);
            y.m37504w(this.f3524d);
            return y;
        }

        @Override // androidx.core.view.WindowInsetsCompat.C2535f
        /* renamed from: e */
        void mo37490e(Insets insets) {
            this.f3524d = insets;
        }

        @Override // androidx.core.view.WindowInsetsCompat.C2535f
        /* renamed from: g */
        void mo37488g(Insets insets) {
            WindowInsets windowInsets = this.f3523c;
            if (windowInsets != null) {
                this.f3523c = windowInsets.replaceSystemWindowInsets(insets.f3326a, insets.f3327b, insets.f3328c, insets.f3329d);
            }
        }

        C2532c(WindowInsetsCompat windowInsetsCompat) {
            super(windowInsetsCompat);
            this.f3523c = windowInsetsCompat.m37503x();
        }
    }

    /* renamed from: androidx.core.view.WindowInsetsCompat$d */
    /* loaded from: classes.dex */
    private static class C2533d extends C2535f {

        /* renamed from: c */
        final WindowInsets.Builder f3525c;

        C2533d() {
            this.f3525c = new WindowInsets.Builder();
        }

        @Override // androidx.core.view.WindowInsetsCompat.C2535f
        /* renamed from: b */
        WindowInsetsCompat mo37493b() {
            WindowInsets build;
            m37494a();
            build = this.f3525c.build();
            WindowInsetsCompat y = WindowInsetsCompat.m37502y(build);
            y.m37507t(this.f3527b);
            return y;
        }

        @Override // androidx.core.view.WindowInsetsCompat.C2535f
        /* renamed from: d */
        void mo37491d(Insets insets) {
            this.f3525c.setMandatorySystemGestureInsets(insets.m37932e());
        }

        @Override // androidx.core.view.WindowInsetsCompat.C2535f
        /* renamed from: e */
        void mo37490e(Insets insets) {
            this.f3525c.setStableInsets(insets.m37932e());
        }

        @Override // androidx.core.view.WindowInsetsCompat.C2535f
        /* renamed from: f */
        void mo37489f(Insets insets) {
            this.f3525c.setSystemGestureInsets(insets.m37932e());
        }

        @Override // androidx.core.view.WindowInsetsCompat.C2535f
        /* renamed from: g */
        void mo37488g(Insets insets) {
            this.f3525c.setSystemWindowInsets(insets.m37932e());
        }

        @Override // androidx.core.view.WindowInsetsCompat.C2535f
        /* renamed from: h */
        void mo37487h(Insets insets) {
            this.f3525c.setTappableElementInsets(insets.m37932e());
        }

        C2533d(WindowInsetsCompat windowInsetsCompat) {
            super(windowInsetsCompat);
            WindowInsets.Builder builder;
            WindowInsets x = windowInsetsCompat.m37503x();
            if (x != null) {
                builder = new WindowInsets.Builder(x);
            } else {
                builder = new WindowInsets.Builder();
            }
            this.f3525c = builder;
        }
    }

    /* renamed from: androidx.core.view.WindowInsetsCompat$h */
    /* loaded from: classes.dex */
    private static class C2537h extends C2536g {

        /* renamed from: m */
        private Insets f3538m;

        C2537h(WindowInsetsCompat windowInsetsCompat, WindowInsets windowInsets) {
            super(windowInsetsCompat, windowInsets);
            this.f3538m = null;
        }

        @Override // androidx.core.view.WindowInsetsCompat.C2541l
        /* renamed from: b */
        WindowInsetsCompat mo37480b() {
            return WindowInsetsCompat.m37502y(this.f3533c.consumeStableInsets());
        }

        @Override // androidx.core.view.WindowInsetsCompat.C2541l
        /* renamed from: c */
        WindowInsetsCompat mo37479c() {
            return WindowInsetsCompat.m37502y(this.f3533c.consumeSystemWindowInsets());
        }

        @Override // androidx.core.view.WindowInsetsCompat.C2541l
        /* renamed from: j */
        final Insets mo37472j() {
            if (this.f3538m == null) {
                this.f3538m = Insets.m37935b(this.f3533c.getStableInsetLeft(), this.f3533c.getStableInsetTop(), this.f3533c.getStableInsetRight(), this.f3533c.getStableInsetBottom());
            }
            return this.f3538m;
        }

        @Override // androidx.core.view.WindowInsetsCompat.C2541l
        /* renamed from: o */
        boolean mo37467o() {
            return this.f3533c.isConsumed();
        }

        @Override // androidx.core.view.WindowInsetsCompat.C2541l
        /* renamed from: t */
        public void mo37462t(Insets insets) {
            this.f3538m = insets;
        }

        C2537h(WindowInsetsCompat windowInsetsCompat, C2537h hVar) {
            super(windowInsetsCompat, hVar);
            this.f3538m = null;
            this.f3538m = hVar.f3538m;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.core.view.WindowInsetsCompat$g */
    /* loaded from: classes.dex */
    public static class C2536g extends C2541l {

        /* renamed from: h */
        private static boolean f3528h = false;

        /* renamed from: i */
        private static Method f3529i;

        /* renamed from: j */
        private static Class<?> f3530j;

        /* renamed from: k */
        private static Field f3531k;

        /* renamed from: l */
        private static Field f3532l;

        /* renamed from: c */
        final WindowInsets f3533c;

        /* renamed from: d */
        private Insets[] f3534d;

        /* renamed from: e */
        private Insets f3535e;

        /* renamed from: f */
        private WindowInsetsCompat f3536f;

        /* renamed from: g */
        Insets f3537g;

        C2536g(WindowInsetsCompat windowInsetsCompat, WindowInsets windowInsets) {
            super(windowInsetsCompat);
            this.f3535e = null;
            this.f3533c = windowInsets;
        }

        @SuppressLint({"WrongConstant"})
        /* renamed from: u */
        private Insets m37486u(int i, boolean z) {
            Insets insets = Insets.f3325e;
            for (int i2 = 1; i2 <= 256; i2 <<= 1) {
                if ((i & i2) != 0) {
                    insets = Insets.m37936a(insets, m37485v(i2, z));
                }
            }
            return insets;
        }

        /* renamed from: w */
        private Insets m37484w() {
            WindowInsetsCompat windowInsetsCompat = this.f3536f;
            if (windowInsetsCompat != null) {
                return windowInsetsCompat.m37517j();
            }
            return Insets.f3325e;
        }

        /* renamed from: x */
        private Insets m37483x(View view) {
            if (Build.VERSION.SDK_INT < 30) {
                if (!f3528h) {
                    m37482y();
                }
                Method method = f3529i;
                if (!(method == null || f3530j == null || f3531k == null)) {
                    try {
                        Object invoke = method.invoke(view, new Object[0]);
                        if (invoke == null) {
                            Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                            return null;
                        }
                        Rect rect = (Rect) f3531k.get(f3532l.get(invoke));
                        if (rect != null) {
                            return Insets.m37934c(rect);
                        }
                        return null;
                    } catch (ReflectiveOperationException e) {
                        Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e.getMessage(), e);
                    }
                }
                return null;
            }
            throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
        }

        @SuppressLint({"PrivateApi"})
        /* renamed from: y */
        private static void m37482y() {
            try {
                f3529i = View.class.getDeclaredMethod("getViewRootImpl", new Class[0]);
                Class<?> cls = Class.forName("android.view.View$AttachInfo");
                f3530j = cls;
                f3531k = cls.getDeclaredField("mVisibleInsets");
                f3532l = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
                f3531k.setAccessible(true);
                f3532l.setAccessible(true);
            } catch (ReflectiveOperationException e) {
                Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e.getMessage(), e);
            }
            f3528h = true;
        }

        @Override // androidx.core.view.WindowInsetsCompat.C2541l
        /* renamed from: d */
        void mo37478d(View view) {
            Insets x = m37483x(view);
            if (x == null) {
                x = Insets.f3325e;
            }
            mo37464r(x);
        }

        @Override // androidx.core.view.WindowInsetsCompat.C2541l
        /* renamed from: e */
        void mo37477e(WindowInsetsCompat windowInsetsCompat) {
            windowInsetsCompat.m37505v(this.f3536f);
            windowInsetsCompat.m37506u(this.f3537g);
        }

        @Override // androidx.core.view.WindowInsetsCompat.C2541l
        public boolean equals(Object obj) {
            if (!super.equals(obj)) {
                return false;
            }
            return Objects.equals(this.f3537g, ((C2536g) obj).f3537g);
        }

        @Override // androidx.core.view.WindowInsetsCompat.C2541l
        /* renamed from: g */
        public Insets mo37475g(int i) {
            return m37486u(i, false);
        }

        @Override // androidx.core.view.WindowInsetsCompat.C2541l
        /* renamed from: h */
        public Insets mo37474h(int i) {
            return m37486u(i, true);
        }

        @Override // androidx.core.view.WindowInsetsCompat.C2541l
        /* renamed from: l */
        final Insets mo37470l() {
            if (this.f3535e == null) {
                this.f3535e = Insets.m37935b(this.f3533c.getSystemWindowInsetLeft(), this.f3533c.getSystemWindowInsetTop(), this.f3533c.getSystemWindowInsetRight(), this.f3533c.getSystemWindowInsetBottom());
            }
            return this.f3535e;
        }

        @Override // androidx.core.view.WindowInsetsCompat.C2541l
        /* renamed from: n */
        WindowInsetsCompat mo37468n(int i, int i2, int i3, int i4) {
            C2531b bVar = new C2531b(WindowInsetsCompat.m37502y(this.f3533c));
            bVar.m37496d(WindowInsetsCompat.m37510q(mo37470l(), i, i2, i3, i4));
            bVar.m37497c(WindowInsetsCompat.m37510q(mo37472j(), i, i2, i3, i4));
            return bVar.m37499a();
        }

        @Override // androidx.core.view.WindowInsetsCompat.C2541l
        /* renamed from: p */
        boolean mo37466p() {
            return this.f3533c.isRound();
        }

        @Override // androidx.core.view.WindowInsetsCompat.C2541l
        /* renamed from: q */
        public void mo37465q(Insets[] insetsArr) {
            this.f3534d = insetsArr;
        }

        @Override // androidx.core.view.WindowInsetsCompat.C2541l
        /* renamed from: r */
        void mo37464r(Insets insets) {
            this.f3537g = insets;
        }

        @Override // androidx.core.view.WindowInsetsCompat.C2541l
        /* renamed from: s */
        void mo37463s(WindowInsetsCompat windowInsetsCompat) {
            this.f3536f = windowInsetsCompat;
        }

        /* renamed from: v */
        protected Insets m37485v(int i, boolean z) {
            int i2;
            C2700s sVar;
            if (i != 1) {
                Insets insets = null;
                if (i != 2) {
                    if (i == 8) {
                        Insets[] insetsArr = this.f3534d;
                        if (insetsArr != null) {
                            insets = insetsArr[C2542m.m37459c(8)];
                        }
                        if (insets != null) {
                            return insets;
                        }
                        Insets l = mo37470l();
                        Insets w = m37484w();
                        int i3 = l.f3329d;
                        if (i3 > w.f3329d) {
                            return Insets.m37935b(0, 0, 0, i3);
                        }
                        Insets insets2 = this.f3537g;
                        if (insets2 == null || insets2.equals(Insets.f3325e) || (i2 = this.f3537g.f3329d) <= w.f3329d) {
                            return Insets.f3325e;
                        }
                        return Insets.m37935b(0, 0, 0, i2);
                    } else if (i == 16) {
                        return mo37471k();
                    } else {
                        if (i == 32) {
                            return mo37473i();
                        }
                        if (i == 64) {
                            return mo37469m();
                        }
                        if (i != 128) {
                            return Insets.f3325e;
                        }
                        WindowInsetsCompat windowInsetsCompat = this.f3536f;
                        if (windowInsetsCompat != null) {
                            sVar = windowInsetsCompat.m37522e();
                        } else {
                            sVar = mo37476f();
                        }
                        if (sVar != null) {
                            return Insets.m37935b(sVar.m37139b(), sVar.m37137d(), sVar.m37138c(), sVar.m37140a());
                        }
                        return Insets.f3325e;
                    }
                } else if (z) {
                    Insets w2 = m37484w();
                    Insets j = mo37472j();
                    return Insets.m37935b(Math.max(w2.f3326a, j.f3326a), 0, Math.max(w2.f3328c, j.f3328c), Math.max(w2.f3329d, j.f3329d));
                } else {
                    Insets l2 = mo37470l();
                    WindowInsetsCompat windowInsetsCompat2 = this.f3536f;
                    if (windowInsetsCompat2 != null) {
                        insets = windowInsetsCompat2.m37517j();
                    }
                    int i4 = l2.f3329d;
                    if (insets != null) {
                        i4 = Math.min(i4, insets.f3329d);
                    }
                    return Insets.m37935b(l2.f3326a, 0, l2.f3328c, i4);
                }
            } else if (z) {
                return Insets.m37935b(0, Math.max(m37484w().f3327b, mo37470l().f3327b), 0, 0);
            } else {
                return Insets.m37935b(0, mo37470l().f3327b, 0, 0);
            }
        }

        C2536g(WindowInsetsCompat windowInsetsCompat, C2536g gVar) {
            this(windowInsetsCompat, new WindowInsets(gVar.f3533c));
        }
    }

    /* renamed from: androidx.core.view.WindowInsetsCompat$j */
    /* loaded from: classes.dex */
    private static class C2539j extends C2538i {

        /* renamed from: n */
        private Insets f3539n = null;

        /* renamed from: o */
        private Insets f3540o = null;

        /* renamed from: p */
        private Insets f3541p = null;

        C2539j(WindowInsetsCompat windowInsetsCompat, WindowInsets windowInsets) {
            super(windowInsetsCompat, windowInsets);
        }

        @Override // androidx.core.view.WindowInsetsCompat.C2541l
        /* renamed from: i */
        Insets mo37473i() {
            android.graphics.Insets mandatorySystemGestureInsets;
            if (this.f3540o == null) {
                mandatorySystemGestureInsets = this.f3533c.getMandatorySystemGestureInsets();
                this.f3540o = Insets.m37933d(mandatorySystemGestureInsets);
            }
            return this.f3540o;
        }

        @Override // androidx.core.view.WindowInsetsCompat.C2541l
        /* renamed from: k */
        Insets mo37471k() {
            android.graphics.Insets systemGestureInsets;
            if (this.f3539n == null) {
                systemGestureInsets = this.f3533c.getSystemGestureInsets();
                this.f3539n = Insets.m37933d(systemGestureInsets);
            }
            return this.f3539n;
        }

        @Override // androidx.core.view.WindowInsetsCompat.C2541l
        /* renamed from: m */
        Insets mo37469m() {
            android.graphics.Insets tappableElementInsets;
            if (this.f3541p == null) {
                tappableElementInsets = this.f3533c.getTappableElementInsets();
                this.f3541p = Insets.m37933d(tappableElementInsets);
            }
            return this.f3541p;
        }

        @Override // androidx.core.view.WindowInsetsCompat.C2536g, androidx.core.view.WindowInsetsCompat.C2541l
        /* renamed from: n */
        WindowInsetsCompat mo37468n(int i, int i2, int i3, int i4) {
            WindowInsets inset;
            inset = this.f3533c.inset(i, i2, i3, i4);
            return WindowInsetsCompat.m37502y(inset);
        }

        @Override // androidx.core.view.WindowInsetsCompat.C2537h, androidx.core.view.WindowInsetsCompat.C2541l
        /* renamed from: t */
        public void mo37462t(Insets insets) {
        }

        C2539j(WindowInsetsCompat windowInsetsCompat, C2539j jVar) {
            super(windowInsetsCompat, jVar);
        }
    }

    /* renamed from: androidx.core.view.WindowInsetsCompat$b */
    /* loaded from: classes.dex */
    public static final class C2531b {

        /* renamed from: a */
        private final C2535f f3518a;

        public C2531b() {
            int i = Build.VERSION.SDK_INT;
            if (i >= 30) {
                this.f3518a = new C2534e();
            } else if (i >= 29) {
                this.f3518a = new C2533d();
            } else {
                this.f3518a = new C2532c();
            }
        }

        /* renamed from: a */
        public WindowInsetsCompat m37499a() {
            return this.f3518a.mo37493b();
        }

        /* renamed from: b */
        public C2531b m37498b(int i, Insets insets) {
            this.f3518a.mo37492c(i, insets);
            return this;
        }

        @Deprecated
        /* renamed from: c */
        public C2531b m37497c(Insets insets) {
            this.f3518a.mo37490e(insets);
            return this;
        }

        @Deprecated
        /* renamed from: d */
        public C2531b m37496d(Insets insets) {
            this.f3518a.mo37488g(insets);
            return this;
        }

        public C2531b(WindowInsetsCompat windowInsetsCompat) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 30) {
                this.f3518a = new C2534e(windowInsetsCompat);
            } else if (i >= 29) {
                this.f3518a = new C2533d(windowInsetsCompat);
            } else {
                this.f3518a = new C2532c(windowInsetsCompat);
            }
        }
    }

    public WindowInsetsCompat(WindowInsetsCompat windowInsetsCompat) {
        if (windowInsetsCompat != null) {
            C2541l lVar = windowInsetsCompat.f3513a;
            int i = Build.VERSION.SDK_INT;
            if (i >= 30 && (lVar instanceof C2540k)) {
                this.f3513a = new C2540k(this, (C2540k) lVar);
            } else if (i >= 29 && (lVar instanceof C2539j)) {
                this.f3513a = new C2539j(this, (C2539j) lVar);
            } else if (i >= 28 && (lVar instanceof C2538i)) {
                this.f3513a = new C2538i(this, (C2538i) lVar);
            } else if (lVar instanceof C2537h) {
                this.f3513a = new C2537h(this, (C2537h) lVar);
            } else if (lVar instanceof C2536g) {
                this.f3513a = new C2536g(this, (C2536g) lVar);
            } else {
                this.f3513a = new C2541l(this);
            }
            lVar.mo37477e(this);
            return;
        }
        this.f3513a = new C2541l(this);
    }
}
