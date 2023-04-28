package androidx.core.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContentInfo;
import android.view.Display;
import android.view.KeyEvent;
import android.view.OnReceiveContentListener;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeProvider;
import androidx.collection.SimpleArrayMap;
import androidx.core.util.C2517g;
import androidx.core.view.C2549a;
import androidx.core.view.C2710t2;
import androidx.core.view.C2733w0;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.view.accessibility.AccessibilityViewCommand;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import p002a1.C1239e;

@SuppressLint({"PrivateConstructorForUtilityClass"})
/* renamed from: androidx.core.view.w0 */
/* loaded from: classes.dex */
public class C2733w0 {

    /* renamed from: c */
    private static Field f3648c;

    /* renamed from: a */
    private static final AtomicInteger f3646a = new AtomicInteger(1);

    /* renamed from: b */
    private static WeakHashMap<View, C2674n2> f3647b = null;

    /* renamed from: d */
    private static boolean f3649d = false;

    /* renamed from: e */
    private static final int[] f3650e = {C1239e.f22b, C1239e.f24c, C1239e.f44n, C1239e.f55y, C1239e.f35024B, C1239e.f35025C, C1239e.f35026D, C1239e.f35027E, C1239e.f35028F, C1239e.f35029G, C1239e.f26d, C1239e.f28e, C1239e.f30f, C1239e.f32g, C1239e.f34h, C1239e.f36i, C1239e.f38j, C1239e.f40k, C1239e.f42l, C1239e.f43m, C1239e.f45o, C1239e.f46p, C1239e.f47q, C1239e.f48r, C1239e.f49s, C1239e.f50t, C1239e.f51u, C1239e.f52v, C1239e.f53w, C1239e.f54x, C1239e.f56z, C1239e.f35023A};

    /* renamed from: f */
    private static final AbstractC2708t0 f3651f = new AbstractC2708t0() { // from class: androidx.core.view.v0
        @Override // androidx.core.view.AbstractC2708t0
        public final ContentInfoCompat onReceiveContent(ContentInfoCompat contentInfoCompat) {
            ContentInfoCompat Y;
            Y = C2733w0.m37025Y(contentInfoCompat);
            return Y;
        }
    };

    /* renamed from: g */
    private static final ViewTreeObserver$OnGlobalLayoutListenerC2738e f3652g = new ViewTreeObserver$OnGlobalLayoutListenerC2738e();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.core.view.w0$a */
    /* loaded from: classes.dex */
    public class C2734a extends AbstractC2739f<Boolean> {
        C2734a(int i, Class cls, int i2) {
            super(i, cls, i2);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: i */
        public Boolean mo36951d(View view) {
            return Boolean.valueOf(C2750p.m36854d(view));
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: j */
        public void mo36950e(View view, Boolean bool) {
            C2750p.m36849i(view, bool.booleanValue());
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: k */
        public boolean mo36947h(Boolean bool, Boolean bool2) {
            return !m36954a(bool, bool2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.core.view.w0$b */
    /* loaded from: classes.dex */
    public class C2735b extends AbstractC2739f<CharSequence> {
        C2735b(int i, Class cls, int i2, int i3) {
            super(i, cls, i2, i3);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: i */
        public CharSequence mo36951d(View view) {
            return C2750p.m36856b(view);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: j */
        public void mo36950e(View view, CharSequence charSequence) {
            C2750p.m36850h(view, charSequence);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: k */
        public boolean mo36947h(CharSequence charSequence, CharSequence charSequence2) {
            return !TextUtils.equals(charSequence, charSequence2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.core.view.w0$c */
    /* loaded from: classes.dex */
    public class C2736c extends AbstractC2739f<CharSequence> {
        C2736c(int i, Class cls, int i2, int i3) {
            super(i, cls, i2, i3);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: i */
        public CharSequence mo36951d(View view) {
            return C2752r.m36844a(view);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: j */
        public void mo36950e(View view, CharSequence charSequence) {
            C2752r.m36843b(view, charSequence);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: k */
        public boolean mo36947h(CharSequence charSequence, CharSequence charSequence2) {
            return !TextUtils.equals(charSequence, charSequence2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.core.view.w0$d */
    /* loaded from: classes.dex */
    public class C2737d extends AbstractC2739f<Boolean> {
        C2737d(int i, Class cls, int i2) {
            super(i, cls, i2);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: i */
        public Boolean mo36951d(View view) {
            return Boolean.valueOf(C2750p.m36855c(view));
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: j */
        public void mo36950e(View view, Boolean bool) {
            C2750p.m36851g(view, bool.booleanValue());
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: k */
        public boolean mo36947h(Boolean bool, Boolean bool2) {
            return !m36954a(bool, bool2);
        }
    }

    /* renamed from: androidx.core.view.w0$e */
    /* loaded from: classes.dex */
    static class ViewTreeObserver$OnGlobalLayoutListenerC2738e implements ViewTreeObserver.OnGlobalLayoutListener, View.OnAttachStateChangeListener {

        /* renamed from: k */
        private final WeakHashMap<View, Boolean> f3653k = new WeakHashMap<>();

        ViewTreeObserver$OnGlobalLayoutListenerC2738e() {
        }

        /* renamed from: b */
        private void m36958b(View view, boolean z) {
            boolean z2;
            int i;
            if (!view.isShown() || view.getWindowVisibility() != 0) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (z != z2) {
                if (z2) {
                    i = 16;
                } else {
                    i = 32;
                }
                C2733w0.m37024Z(view, i);
                this.f3653k.put(view, Boolean.valueOf(z2));
            }
        }

        /* renamed from: c */
        private void m36957c(View view) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(this);
        }

        /* renamed from: e */
        private void m36955e(View view) {
            C2741h.m36931o(view.getViewTreeObserver(), this);
        }

        /* renamed from: a */
        void m36959a(View view) {
            boolean z;
            WeakHashMap<View, Boolean> weakHashMap = this.f3653k;
            if (!view.isShown() || view.getWindowVisibility() != 0) {
                z = false;
            } else {
                z = true;
            }
            weakHashMap.put(view, Boolean.valueOf(z));
            view.addOnAttachStateChangeListener(this);
            if (C2744k.m36911b(view)) {
                m36957c(view);
            }
        }

        /* renamed from: d */
        void m36956d(View view) {
            this.f3653k.remove(view);
            view.removeOnAttachStateChangeListener(this);
            m36955e(view);
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (Build.VERSION.SDK_INT < 28) {
                for (Map.Entry<View, Boolean> entry : this.f3653k.entrySet()) {
                    m36958b(entry.getKey(), entry.getValue().booleanValue());
                }
            }
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            m36957c(view);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.core.view.w0$f */
    /* loaded from: classes.dex */
    public static abstract class AbstractC2739f<T> {

        /* renamed from: a */
        private final int f3654a;

        /* renamed from: b */
        private final Class<T> f3655b;

        /* renamed from: c */
        private final int f3656c;

        /* renamed from: d */
        private final int f3657d;

        AbstractC2739f(int i, Class<T> cls, int i2) {
            this(i, cls, 0, i2);
        }

        /* renamed from: b */
        private boolean m36953b() {
            return true;
        }

        /* renamed from: c */
        private boolean m36952c() {
            return Build.VERSION.SDK_INT >= this.f3656c;
        }

        /* renamed from: a */
        boolean m36954a(Boolean bool, Boolean bool2) {
            boolean z;
            boolean z2;
            if (bool == null || !bool.booleanValue()) {
                z = false;
            } else {
                z = true;
            }
            if (bool2 == null || !bool2.booleanValue()) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (z == z2) {
                return true;
            }
            return false;
        }

        /* renamed from: d */
        abstract T mo36951d(View view);

        /* renamed from: e */
        abstract void mo36950e(View view, T t);

        /* renamed from: f */
        T m36949f(View view) {
            if (m36952c()) {
                return mo36951d(view);
            }
            if (!m36953b()) {
                return null;
            }
            T t = (T) view.getTag(this.f3654a);
            if (this.f3655b.isInstance(t)) {
                return t;
            }
            return null;
        }

        /* renamed from: g */
        void m36948g(View view, T t) {
            if (m36952c()) {
                mo36950e(view, t);
            } else if (m36953b() && mo36947h(m36949f(view), t)) {
                C2733w0.m37005j(view);
                view.setTag(this.f3654a, t);
                C2733w0.m37024Z(view, this.f3657d);
            }
        }

        /* renamed from: h */
        abstract boolean mo36947h(T t, T t2);

        AbstractC2739f(int i, Class<T> cls, int i2, int i3) {
            this.f3654a = i;
            this.f3655b = cls;
            this.f3657d = i2;
            this.f3656c = i3;
        }
    }

    /* renamed from: androidx.core.view.w0$g */
    /* loaded from: classes.dex */
    static class C2740g {
        /* renamed from: a */
        static boolean m36946a(View view) {
            return view.hasOnClickListeners();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.core.view.w0$h */
    /* loaded from: classes.dex */
    public static class C2741h {
        /* renamed from: a */
        static AccessibilityNodeProvider m36945a(View view) {
            return view.getAccessibilityNodeProvider();
        }

        /* renamed from: b */
        static boolean m36944b(View view) {
            return view.getFitsSystemWindows();
        }

        /* renamed from: c */
        static int m36943c(View view) {
            return view.getImportantForAccessibility();
        }

        /* renamed from: d */
        static int m36942d(View view) {
            return view.getMinimumHeight();
        }

        /* renamed from: e */
        static int m36941e(View view) {
            return view.getMinimumWidth();
        }

        /* renamed from: f */
        static ViewParent m36940f(View view) {
            return view.getParentForAccessibility();
        }

        /* renamed from: g */
        static int m36939g(View view) {
            return view.getWindowSystemUiVisibility();
        }

        /* renamed from: h */
        static boolean m36938h(View view) {
            return view.hasOverlappingRendering();
        }

        /* renamed from: i */
        static boolean m36937i(View view) {
            return view.hasTransientState();
        }

        /* renamed from: j */
        static boolean m36936j(View view, int i, Bundle bundle) {
            return view.performAccessibilityAction(i, bundle);
        }

        /* renamed from: k */
        static void m36935k(View view) {
            view.postInvalidateOnAnimation();
        }

        /* renamed from: l */
        static void m36934l(View view, int i, int i2, int i3, int i4) {
            view.postInvalidateOnAnimation(i, i2, i3, i4);
        }

        /* renamed from: m */
        static void m36933m(View view, Runnable runnable) {
            view.postOnAnimation(runnable);
        }

        /* renamed from: n */
        static void m36932n(View view, Runnable runnable, long j) {
            view.postOnAnimationDelayed(runnable, j);
        }

        /* renamed from: o */
        static void m36931o(ViewTreeObserver viewTreeObserver, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
            viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
        }

        /* renamed from: p */
        static void m36930p(View view) {
            view.requestFitSystemWindows();
        }

        /* renamed from: q */
        static void m36929q(View view, Drawable drawable) {
            view.setBackground(drawable);
        }

        /* renamed from: r */
        static void m36928r(View view, boolean z) {
            view.setHasTransientState(z);
        }

        /* renamed from: s */
        static void m36927s(View view, int i) {
            view.setImportantForAccessibility(i);
        }
    }

    /* renamed from: androidx.core.view.w0$i */
    /* loaded from: classes.dex */
    static class C2742i {
        /* renamed from: a */
        static int m36926a() {
            return View.generateViewId();
        }

        /* renamed from: b */
        static Display m36925b(View view) {
            return view.getDisplay();
        }

        /* renamed from: c */
        static int m36924c(View view) {
            return view.getLabelFor();
        }

        /* renamed from: d */
        static int m36923d(View view) {
            return view.getLayoutDirection();
        }

        /* renamed from: e */
        static int m36922e(View view) {
            return view.getPaddingEnd();
        }

        /* renamed from: f */
        static int m36921f(View view) {
            return view.getPaddingStart();
        }

        /* renamed from: g */
        static boolean m36920g(View view) {
            return view.isPaddingRelative();
        }

        /* renamed from: h */
        static void m36919h(View view, int i) {
            view.setLabelFor(i);
        }

        /* renamed from: i */
        static void m36918i(View view, Paint paint) {
            view.setLayerPaint(paint);
        }

        /* renamed from: j */
        static void m36917j(View view, int i) {
            view.setLayoutDirection(i);
        }

        /* renamed from: k */
        static void m36916k(View view, int i, int i2, int i3, int i4) {
            view.setPaddingRelative(i, i2, i3, i4);
        }
    }

    /* renamed from: androidx.core.view.w0$j */
    /* loaded from: classes.dex */
    static class C2743j {
        /* renamed from: a */
        static Rect m36915a(View view) {
            return view.getClipBounds();
        }

        /* renamed from: b */
        static boolean m36914b(View view) {
            return view.isInLayout();
        }

        /* renamed from: c */
        static void m36913c(View view, Rect rect) {
            view.setClipBounds(rect);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.core.view.w0$k */
    /* loaded from: classes.dex */
    public static class C2744k {
        /* renamed from: a */
        static int m36912a(View view) {
            return view.getAccessibilityLiveRegion();
        }

        /* renamed from: b */
        static boolean m36911b(View view) {
            return view.isAttachedToWindow();
        }

        /* renamed from: c */
        static boolean m36910c(View view) {
            return view.isLaidOut();
        }

        /* renamed from: d */
        static boolean m36909d(View view) {
            return view.isLayoutDirectionResolved();
        }

        /* renamed from: e */
        static void m36908e(ViewParent viewParent, View view, View view2, int i) {
            viewParent.notifySubtreeAccessibilityStateChanged(view, view2, i);
        }

        /* renamed from: f */
        static void m36907f(View view, int i) {
            view.setAccessibilityLiveRegion(i);
        }

        /* renamed from: g */
        static void m36906g(AccessibilityEvent accessibilityEvent, int i) {
            accessibilityEvent.setContentChangeTypes(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.core.view.w0$l */
    /* loaded from: classes.dex */
    public static class C2745l {
        /* renamed from: a */
        static WindowInsets m36905a(View view, WindowInsets windowInsets) {
            return view.dispatchApplyWindowInsets(windowInsets);
        }

        /* renamed from: b */
        static WindowInsets m36904b(View view, WindowInsets windowInsets) {
            return view.onApplyWindowInsets(windowInsets);
        }

        /* renamed from: c */
        static void m36903c(View view) {
            view.requestApplyInsets();
        }
    }

    /* renamed from: androidx.core.view.w0$m */
    /* loaded from: classes.dex */
    private static class C2746m {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: androidx.core.view.w0$m$a */
        /* loaded from: classes.dex */
        public class View$OnApplyWindowInsetsListenerC2747a implements View.OnApplyWindowInsetsListener {

            /* renamed from: a */
            WindowInsetsCompat f3658a = null;

            /* renamed from: b */
            final /* synthetic */ View f3659b;

            /* renamed from: c */
            final /* synthetic */ AbstractC2694r0 f3660c;

            View$OnApplyWindowInsetsListenerC2747a(View view, AbstractC2694r0 r0Var) {
                this.f3659b = view;
                this.f3660c = r0Var;
            }

            @Override // android.view.View.OnApplyWindowInsetsListener
            public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                WindowInsetsCompat z = WindowInsetsCompat.m37501z(windowInsets, view);
                int i = Build.VERSION.SDK_INT;
                if (i < 30) {
                    C2746m.m36902a(windowInsets, this.f3659b);
                    if (z.equals(this.f3658a)) {
                        return this.f3660c.mo13081a(view, z).m37503x();
                    }
                }
                this.f3658a = z;
                WindowInsetsCompat a = this.f3660c.mo13081a(view, z);
                if (i >= 30) {
                    return a.m37503x();
                }
                C2733w0.m36996n0(view);
                return a.m37503x();
            }
        }

        /* renamed from: a */
        static void m36902a(WindowInsets windowInsets, View view) {
            View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(C1239e.f33g0);
            if (onApplyWindowInsetsListener != null) {
                onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
            }
        }

        /* renamed from: b */
        static WindowInsetsCompat m36901b(View view, WindowInsetsCompat windowInsetsCompat, Rect rect) {
            WindowInsets x = windowInsetsCompat.m37503x();
            if (x != null) {
                return WindowInsetsCompat.m37501z(view.computeSystemWindowInsets(x, rect), view);
            }
            rect.setEmpty();
            return windowInsetsCompat;
        }

        /* renamed from: c */
        static boolean m36900c(View view, float f, float f2, boolean z) {
            return view.dispatchNestedFling(f, f2, z);
        }

        /* renamed from: d */
        static boolean m36899d(View view, float f, float f2) {
            return view.dispatchNestedPreFling(f, f2);
        }

        /* renamed from: e */
        static boolean m36898e(View view, int i, int i2, int[] iArr, int[] iArr2) {
            return view.dispatchNestedPreScroll(i, i2, iArr, iArr2);
        }

        /* renamed from: f */
        static boolean m36897f(View view, int i, int i2, int i3, int i4, int[] iArr) {
            return view.dispatchNestedScroll(i, i2, i3, i4, iArr);
        }

        /* renamed from: g */
        static ColorStateList m36896g(View view) {
            return view.getBackgroundTintList();
        }

        /* renamed from: h */
        static PorterDuff.Mode m36895h(View view) {
            return view.getBackgroundTintMode();
        }

        /* renamed from: i */
        static float m36894i(View view) {
            return view.getElevation();
        }

        /* renamed from: j */
        public static WindowInsetsCompat m36893j(View view) {
            return WindowInsetsCompat.C2530a.m37500a(view);
        }

        /* renamed from: k */
        static String m36892k(View view) {
            return view.getTransitionName();
        }

        /* renamed from: l */
        static float m36891l(View view) {
            return view.getTranslationZ();
        }

        /* renamed from: m */
        static float m36890m(View view) {
            return view.getZ();
        }

        /* renamed from: n */
        static boolean m36889n(View view) {
            return view.hasNestedScrollingParent();
        }

        /* renamed from: o */
        static boolean m36888o(View view) {
            return view.isImportantForAccessibility();
        }

        /* renamed from: p */
        static boolean m36887p(View view) {
            return view.isNestedScrollingEnabled();
        }

        /* renamed from: q */
        static void m36886q(View view, ColorStateList colorStateList) {
            view.setBackgroundTintList(colorStateList);
        }

        /* renamed from: r */
        static void m36885r(View view, PorterDuff.Mode mode) {
            view.setBackgroundTintMode(mode);
        }

        /* renamed from: s */
        static void m36884s(View view, float f) {
            view.setElevation(f);
        }

        /* renamed from: t */
        static void m36883t(View view, boolean z) {
            view.setNestedScrollingEnabled(z);
        }

        /* renamed from: u */
        static void m36882u(View view, AbstractC2694r0 r0Var) {
            if (Build.VERSION.SDK_INT < 30) {
                view.setTag(C1239e.f35048Z, r0Var);
            }
            if (r0Var == null) {
                view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(C1239e.f33g0));
            } else {
                view.setOnApplyWindowInsetsListener(new View$OnApplyWindowInsetsListenerC2747a(view, r0Var));
            }
        }

        /* renamed from: v */
        static void m36881v(View view, String str) {
            view.setTransitionName(str);
        }

        /* renamed from: w */
        static void m36880w(View view, float f) {
            view.setTranslationZ(f);
        }

        /* renamed from: x */
        static void m36879x(View view, float f) {
            view.setZ(f);
        }

        /* renamed from: y */
        static boolean m36878y(View view, int i) {
            return view.startNestedScroll(i);
        }

        /* renamed from: z */
        static void m36877z(View view) {
            view.stopNestedScroll();
        }
    }

    /* renamed from: androidx.core.view.w0$n */
    /* loaded from: classes.dex */
    private static class C2748n {
        /* renamed from: a */
        public static WindowInsetsCompat m36876a(View view) {
            WindowInsets rootWindowInsets = view.getRootWindowInsets();
            if (rootWindowInsets == null) {
                return null;
            }
            WindowInsetsCompat y = WindowInsetsCompat.m37502y(rootWindowInsets);
            y.m37505v(y);
            y.m37523d(view.getRootView());
            return y;
        }

        /* renamed from: b */
        static int m36875b(View view) {
            return view.getScrollIndicators();
        }

        /* renamed from: c */
        static void m36874c(View view, int i) {
            view.setScrollIndicators(i);
        }

        /* renamed from: d */
        static void m36873d(View view, int i, int i2) {
            view.setScrollIndicators(i, i2);
        }
    }

    /* renamed from: androidx.core.view.w0$o */
    /* loaded from: classes.dex */
    static class C2749o {
        /* renamed from: a */
        static void m36872a(View view, Collection<View> collection, int i) {
            view.addKeyboardNavigationClusters(collection, i);
        }

        /* renamed from: b */
        static int m36871b(View view) {
            int importantForAutofill;
            importantForAutofill = view.getImportantForAutofill();
            return importantForAutofill;
        }

        /* renamed from: c */
        static int m36870c(View view) {
            int nextClusterForwardId;
            nextClusterForwardId = view.getNextClusterForwardId();
            return nextClusterForwardId;
        }

        /* renamed from: d */
        static boolean m36869d(View view) {
            boolean hasExplicitFocusable;
            hasExplicitFocusable = view.hasExplicitFocusable();
            return hasExplicitFocusable;
        }

        /* renamed from: e */
        static boolean m36868e(View view) {
            boolean isFocusedByDefault;
            isFocusedByDefault = view.isFocusedByDefault();
            return isFocusedByDefault;
        }

        /* renamed from: f */
        static boolean m36867f(View view) {
            boolean isImportantForAutofill;
            isImportantForAutofill = view.isImportantForAutofill();
            return isImportantForAutofill;
        }

        /* renamed from: g */
        static boolean m36866g(View view) {
            boolean isKeyboardNavigationCluster;
            isKeyboardNavigationCluster = view.isKeyboardNavigationCluster();
            return isKeyboardNavigationCluster;
        }

        /* renamed from: h */
        static View m36865h(View view, View view2, int i) {
            View keyboardNavigationClusterSearch;
            keyboardNavigationClusterSearch = view.keyboardNavigationClusterSearch(view2, i);
            return keyboardNavigationClusterSearch;
        }

        /* renamed from: i */
        static boolean m36864i(View view) {
            boolean restoreDefaultFocus;
            restoreDefaultFocus = view.restoreDefaultFocus();
            return restoreDefaultFocus;
        }

        /* renamed from: j */
        static void m36863j(View view, String... strArr) {
            view.setAutofillHints(strArr);
        }

        /* renamed from: k */
        static void m36862k(View view, boolean z) {
            view.setFocusedByDefault(z);
        }

        /* renamed from: l */
        static void m36861l(View view, int i) {
            view.setImportantForAutofill(i);
        }

        /* renamed from: m */
        static void m36860m(View view, boolean z) {
            view.setKeyboardNavigationCluster(z);
        }

        /* renamed from: n */
        static void m36859n(View view, int i) {
            view.setNextClusterForwardId(i);
        }

        /* renamed from: o */
        static void m36858o(View view, CharSequence charSequence) {
            view.setTooltipText(charSequence);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.core.view.w0$p */
    /* loaded from: classes.dex */
    public static class C2750p {
        /* renamed from: a */
        static void m36857a(View view, final AbstractC2755u uVar) {
            int i = C1239e.f31f0;
            SimpleArrayMap simpleArrayMap = (SimpleArrayMap) view.getTag(i);
            if (simpleArrayMap == null) {
                simpleArrayMap = new SimpleArrayMap();
                view.setTag(i, simpleArrayMap);
            }
            Objects.requireNonNull(uVar);
            View.OnUnhandledKeyEventListener u1Var = new View.OnUnhandledKeyEventListener() { // from class: androidx.core.view.u1
                @Override // android.view.View.OnUnhandledKeyEventListener
                public final boolean onUnhandledKeyEvent(View view2, KeyEvent keyEvent) {
                    return C2733w0.AbstractC2755u.this.onUnhandledKeyEvent(view2, keyEvent);
                }
            };
            simpleArrayMap.put(uVar, u1Var);
            view.addOnUnhandledKeyEventListener(u1Var);
        }

        /* renamed from: b */
        static CharSequence m36856b(View view) {
            CharSequence accessibilityPaneTitle;
            accessibilityPaneTitle = view.getAccessibilityPaneTitle();
            return accessibilityPaneTitle;
        }

        /* renamed from: c */
        static boolean m36855c(View view) {
            boolean isAccessibilityHeading;
            isAccessibilityHeading = view.isAccessibilityHeading();
            return isAccessibilityHeading;
        }

        /* renamed from: d */
        static boolean m36854d(View view) {
            boolean isScreenReaderFocusable;
            isScreenReaderFocusable = view.isScreenReaderFocusable();
            return isScreenReaderFocusable;
        }

        /* renamed from: e */
        static void m36853e(View view, AbstractC2755u uVar) {
            View.OnUnhandledKeyEventListener onUnhandledKeyEventListener;
            SimpleArrayMap simpleArrayMap = (SimpleArrayMap) view.getTag(C1239e.f31f0);
            if (simpleArrayMap != null && (onUnhandledKeyEventListener = (View.OnUnhandledKeyEventListener) simpleArrayMap.get(uVar)) != null) {
                view.removeOnUnhandledKeyEventListener(onUnhandledKeyEventListener);
            }
        }

        /* renamed from: f */
        static <T> T m36852f(View view, int i) {
            View requireViewById;
            requireViewById = view.requireViewById(i);
            return (T) requireViewById;
        }

        /* renamed from: g */
        static void m36851g(View view, boolean z) {
            view.setAccessibilityHeading(z);
        }

        /* renamed from: h */
        static void m36850h(View view, CharSequence charSequence) {
            view.setAccessibilityPaneTitle(charSequence);
        }

        /* renamed from: i */
        static void m36849i(View view, boolean z) {
            view.setScreenReaderFocusable(z);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.core.view.w0$q */
    /* loaded from: classes.dex */
    public static class C2751q {
        /* renamed from: a */
        static View.AccessibilityDelegate m36848a(View view) {
            View.AccessibilityDelegate accessibilityDelegate;
            accessibilityDelegate = view.getAccessibilityDelegate();
            return accessibilityDelegate;
        }

        /* renamed from: b */
        static List<Rect> m36847b(View view) {
            List<Rect> systemGestureExclusionRects;
            systemGestureExclusionRects = view.getSystemGestureExclusionRects();
            return systemGestureExclusionRects;
        }

        /* renamed from: c */
        static void m36846c(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i, int i2) {
            view.saveAttributeDataForStyleable(context, iArr, attributeSet, typedArray, i, i2);
        }

        /* renamed from: d */
        static void m36845d(View view, List<Rect> list) {
            view.setSystemGestureExclusionRects(list);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.core.view.w0$r */
    /* loaded from: classes.dex */
    public static class C2752r {
        /* renamed from: a */
        static CharSequence m36844a(View view) {
            CharSequence stateDescription;
            stateDescription = view.getStateDescription();
            return stateDescription;
        }

        /* renamed from: b */
        static void m36843b(View view, CharSequence charSequence) {
            view.setStateDescription(charSequence);
        }
    }

    /* renamed from: androidx.core.view.w0$s */
    /* loaded from: classes.dex */
    private static final class C2753s {
        /* renamed from: a */
        public static String[] m36842a(View view) {
            String[] receiveContentMimeTypes;
            receiveContentMimeTypes = view.getReceiveContentMimeTypes();
            return receiveContentMimeTypes;
        }

        /* renamed from: b */
        public static ContentInfoCompat m36841b(View view, ContentInfoCompat contentInfoCompat) {
            ContentInfo performReceiveContent;
            ContentInfo k = contentInfoCompat.m37567k();
            performReceiveContent = view.performReceiveContent(k);
            if (performReceiveContent == null) {
                return null;
            }
            if (performReceiveContent == k) {
                return contentInfoCompat;
            }
            return ContentInfoCompat.m37566l(performReceiveContent);
        }

        /* renamed from: c */
        public static void m36840c(View view, String[] strArr, AbstractC2702s0 s0Var) {
            if (s0Var == null) {
                view.setOnReceiveContentListener(strArr, null);
            } else {
                view.setOnReceiveContentListener(strArr, new OnReceiveContentListenerC2754t(s0Var));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.core.view.w0$t */
    /* loaded from: classes.dex */
    public static final class OnReceiveContentListenerC2754t implements OnReceiveContentListener {

        /* renamed from: a */
        private final AbstractC2702s0 f3661a;

        OnReceiveContentListenerC2754t(AbstractC2702s0 s0Var) {
            this.f3661a = s0Var;
        }

        public ContentInfo onReceiveContent(View view, ContentInfo contentInfo) {
            ContentInfoCompat l = ContentInfoCompat.m37566l(contentInfo);
            ContentInfoCompat a = this.f3661a.mo32330a(view, l);
            if (a == null) {
                return null;
            }
            if (a == l) {
                return contentInfo;
            }
            return a.m37567k();
        }
    }

    /* renamed from: androidx.core.view.w0$u */
    /* loaded from: classes.dex */
    public interface AbstractC2755u {
        boolean onUnhandledKeyEvent(View view, KeyEvent keyEvent);
    }

    /* renamed from: androidx.core.view.w0$v */
    /* loaded from: classes.dex */
    static class C2756v {

        /* renamed from: d */
        private static final ArrayList<WeakReference<View>> f3662d = new ArrayList<>();

        /* renamed from: a */
        private WeakHashMap<View, Boolean> f3663a = null;

        /* renamed from: b */
        private SparseArray<WeakReference<View>> f3664b = null;

        /* renamed from: c */
        private WeakReference<KeyEvent> f3665c = null;

        C2756v() {
        }

        /* renamed from: a */
        static C2756v m36839a(View view) {
            int i = C1239e.f29e0;
            C2756v vVar = (C2756v) view.getTag(i);
            if (vVar != null) {
                return vVar;
            }
            C2756v vVar2 = new C2756v();
            view.setTag(i, vVar2);
            return vVar2;
        }

        /* renamed from: c */
        private View m36837c(View view, KeyEvent keyEvent) {
            WeakHashMap<View, Boolean> weakHashMap = this.f3663a;
            if (weakHashMap != null && weakHashMap.containsKey(view)) {
                if (view instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                        View c = m36837c(viewGroup.getChildAt(childCount), keyEvent);
                        if (c != null) {
                            return c;
                        }
                    }
                }
                if (m36835e(view, keyEvent)) {
                    return view;
                }
            }
            return null;
        }

        /* renamed from: d */
        private SparseArray<WeakReference<View>> m36836d() {
            if (this.f3664b == null) {
                this.f3664b = new SparseArray<>();
            }
            return this.f3664b;
        }

        /* renamed from: e */
        private boolean m36835e(View view, KeyEvent keyEvent) {
            ArrayList arrayList = (ArrayList) view.getTag(C1239e.f31f0);
            if (arrayList == null) {
                return false;
            }
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (((AbstractC2755u) arrayList.get(size)).onUnhandledKeyEvent(view, keyEvent)) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: g */
        private void m36833g() {
            WeakHashMap<View, Boolean> weakHashMap = this.f3663a;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            ArrayList<WeakReference<View>> arrayList = f3662d;
            if (!arrayList.isEmpty()) {
                synchronized (arrayList) {
                    if (this.f3663a == null) {
                        this.f3663a = new WeakHashMap<>();
                    }
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        ArrayList<WeakReference<View>> arrayList2 = f3662d;
                        View view = arrayList2.get(size).get();
                        if (view == null) {
                            arrayList2.remove(size);
                        } else {
                            this.f3663a.put(view, Boolean.TRUE);
                            for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                                this.f3663a.put((View) parent, Boolean.TRUE);
                            }
                        }
                    }
                }
            }
        }

        /* renamed from: b */
        boolean m36838b(View view, KeyEvent keyEvent) {
            if (keyEvent.getAction() == 0) {
                m36833g();
            }
            View c = m36837c(view, keyEvent);
            if (keyEvent.getAction() == 0) {
                int keyCode = keyEvent.getKeyCode();
                if (c != null && !KeyEvent.isModifierKey(keyCode)) {
                    m36836d().put(keyCode, new WeakReference<>(c));
                }
            }
            if (c != null) {
                return true;
            }
            return false;
        }

        /* renamed from: f */
        boolean m36834f(KeyEvent keyEvent) {
            WeakReference<View> weakReference;
            int indexOfKey;
            WeakReference<KeyEvent> weakReference2 = this.f3665c;
            if (weakReference2 != null && weakReference2.get() == keyEvent) {
                return false;
            }
            this.f3665c = new WeakReference<>(keyEvent);
            SparseArray<WeakReference<View>> d = m36836d();
            if (keyEvent.getAction() != 1 || (indexOfKey = d.indexOfKey(keyEvent.getKeyCode())) < 0) {
                weakReference = null;
            } else {
                weakReference = d.valueAt(indexOfKey);
                d.removeAt(indexOfKey);
            }
            if (weakReference == null) {
                weakReference = d.get(keyEvent.getKeyCode());
            }
            if (weakReference == null) {
                return false;
            }
            View view = weakReference.get();
            if (view != null && C2733w0.m37030T(view)) {
                m36835e(view, keyEvent);
            }
            return true;
        }
    }

    @SuppressLint({"InlinedApi"})
    /* renamed from: A */
    public static int m37065A(View view) {
        if (Build.VERSION.SDK_INT >= 26) {
            return C2749o.m36871b(view);
        }
        return 0;
    }

    /* renamed from: A0 */
    public static void m37064A0(View view, int i) {
        C2741h.m36927s(view, i);
    }

    /* renamed from: B */
    public static int m37063B(View view) {
        return C2742i.m36923d(view);
    }

    /* renamed from: B0 */
    public static void m37062B0(View view, int i) {
        if (Build.VERSION.SDK_INT >= 26) {
            C2749o.m36861l(view, i);
        }
    }

    /* renamed from: C */
    public static int m37061C(View view) {
        return C2741h.m36942d(view);
    }

    /* renamed from: C0 */
    public static void m37060C0(View view, boolean z) {
        C2746m.m36883t(view, z);
    }

    /* renamed from: D */
    public static int m37059D(View view) {
        return C2741h.m36941e(view);
    }

    /* renamed from: D0 */
    public static void m37058D0(View view, AbstractC2694r0 r0Var) {
        C2746m.m36882u(view, r0Var);
    }

    /* renamed from: E */
    public static String[] m37057E(View view) {
        if (Build.VERSION.SDK_INT >= 31) {
            return C2753s.m36842a(view);
        }
        return (String[]) view.getTag(C1239e.f23b0);
    }

    /* renamed from: E0 */
    public static void m37056E0(View view, String[] strArr, AbstractC2702s0 s0Var) {
        boolean z;
        if (Build.VERSION.SDK_INT >= 31) {
            C2753s.m36840c(view, strArr, s0Var);
            return;
        }
        if (strArr == null || strArr.length == 0) {
            strArr = null;
        }
        boolean z2 = false;
        if (s0Var != null) {
            if (strArr != null) {
                z = true;
            } else {
                z = false;
            }
            C2517g.m37593b(z, "When the listener is set, MIME types must also be set");
        }
        if (strArr != null) {
            int length = strArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                } else if (strArr[i].startsWith("*")) {
                    z2 = true;
                    break;
                } else {
                    i++;
                }
            }
            C2517g.m37593b(!z2, "A MIME type set here must not start with *: " + Arrays.toString(strArr));
        }
        view.setTag(C1239e.f23b0, strArr);
        view.setTag(C1239e.f21a0, s0Var);
    }

    /* renamed from: F */
    public static int m37055F(View view) {
        return C2742i.m36922e(view);
    }

    /* renamed from: F0 */
    public static void m37054F0(View view, int i, int i2, int i3, int i4) {
        C2742i.m36916k(view, i, i2, i3, i4);
    }

    /* renamed from: G */
    public static int m37053G(View view) {
        return C2742i.m36921f(view);
    }

    /* renamed from: G0 */
    public static void m37052G0(View view, boolean z) {
        m36992p0().m36948g(view, Boolean.valueOf(z));
    }

    /* renamed from: H */
    public static ViewParent m37051H(View view) {
        return C2741h.m36940f(view);
    }

    /* renamed from: H0 */
    public static void m37050H0(View view, int i, int i2) {
        C2748n.m36873d(view, i, i2);
    }

    /* renamed from: I */
    public static WindowInsetsCompat m37049I(View view) {
        return C2748n.m36876a(view);
    }

    /* renamed from: I0 */
    public static void m37048I0(View view, CharSequence charSequence) {
        m37036O0().m36948g(view, charSequence);
    }

    /* renamed from: J */
    public static CharSequence m37047J(View view) {
        return m37036O0().m36949f(view);
    }

    /* renamed from: J0 */
    public static void m37046J0(View view, String str) {
        C2746m.m36881v(view, str);
    }

    /* renamed from: K */
    public static String m37045K(View view) {
        return C2746m.m36892k(view);
    }

    /* renamed from: K0 */
    public static void m37044K0(View view, float f) {
        C2746m.m36880w(view, f);
    }

    /* renamed from: L */
    public static float m37043L(View view) {
        return C2746m.m36891l(view);
    }

    /* renamed from: L0 */
    private static void m37042L0(View view) {
        if (m36973z(view) == 0) {
            m37064A0(view, 1);
        }
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            if (m36973z((View) parent) == 4) {
                m37064A0(view, 2);
                return;
            }
        }
    }

    @Deprecated
    /* renamed from: M */
    public static int m37041M(View view) {
        return C2741h.m36939g(view);
    }

    /* renamed from: M0 */
    public static void m37040M0(View view, C2710t2.AbstractC2712b bVar) {
        C2710t2.m37118c(view, bVar);
    }

    /* renamed from: N */
    public static float m37039N(View view) {
        return C2746m.m36890m(view);
    }

    /* renamed from: N0 */
    public static void m37038N0(View view, float f) {
        C2746m.m36879x(view, f);
    }

    /* renamed from: O */
    public static boolean m37037O(View view) {
        return m36999m(view) != null;
    }

    /* renamed from: O0 */
    private static AbstractC2739f<CharSequence> m37036O0() {
        return new C2736c(C1239e.f27d0, CharSequence.class, 64, 30);
    }

    /* renamed from: P */
    public static boolean m37035P(View view) {
        return C2740g.m36946a(view);
    }

    /* renamed from: P0 */
    public static void m37034P0(View view) {
        C2746m.m36877z(view);
    }

    /* renamed from: Q */
    public static boolean m37033Q(View view) {
        return C2741h.m36938h(view);
    }

    /* renamed from: R */
    public static boolean m37032R(View view) {
        return C2741h.m36937i(view);
    }

    /* renamed from: S */
    public static boolean m37031S(View view) {
        Boolean f = m37021b().m36949f(view);
        if (f == null || !f.booleanValue()) {
            return false;
        }
        return true;
    }

    /* renamed from: T */
    public static boolean m37030T(View view) {
        return C2744k.m36911b(view);
    }

    /* renamed from: U */
    public static boolean m37029U(View view) {
        return C2744k.m36910c(view);
    }

    /* renamed from: V */
    public static boolean m37028V(View view) {
        return C2746m.m36887p(view);
    }

    /* renamed from: W */
    public static boolean m37027W(View view) {
        return C2742i.m36920g(view);
    }

    /* renamed from: X */
    public static boolean m37026X(View view) {
        Boolean f = m36992p0().m36949f(view);
        if (f == null || !f.booleanValue()) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Y */
    public static /* synthetic */ ContentInfoCompat m37025Y(ContentInfoCompat contentInfoCompat) {
        return contentInfoCompat;
    }

    /* renamed from: Z */
    static void m37024Z(View view, int i) {
        boolean z;
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            if (m36993p(view) == null || !view.isShown() || view.getWindowVisibility() != 0) {
                z = false;
            } else {
                z = true;
            }
            int i2 = 32;
            if (m36995o(view) != 0 || z) {
                AccessibilityEvent obtain = AccessibilityEvent.obtain();
                if (!z) {
                    i2 = RecyclerView.ItemAnimator.FLAG_MOVED;
                }
                obtain.setEventType(i2);
                C2744k.m36906g(obtain, i);
                if (z) {
                    obtain.getText().add(m36993p(view));
                    m37042L0(view);
                }
                view.sendAccessibilityEventUnchecked(obtain);
            } else if (i == 32) {
                AccessibilityEvent obtain2 = AccessibilityEvent.obtain();
                view.onInitializeAccessibilityEvent(obtain2);
                obtain2.setEventType(32);
                C2744k.m36906g(obtain2, i);
                obtain2.setSource(view);
                view.onPopulateAccessibilityEvent(obtain2);
                obtain2.getText().add(m36993p(view));
                accessibilityManager.sendAccessibilityEvent(obtain2);
            } else if (view.getParent() != null) {
                try {
                    C2744k.m36908e(view.getParent(), view, view, i);
                } catch (AbstractMethodError e) {
                    Log.e("ViewCompat", view.getParent().getClass().getSimpleName() + " does not fully implement ViewParent", e);
                }
            }
        }
    }

    /* renamed from: a0 */
    public static void m37022a0(View view, int i) {
        view.offsetLeftAndRight(i);
    }

    /* renamed from: b */
    private static AbstractC2739f<Boolean> m37021b() {
        return new C2737d(C1239e.f35046X, Boolean.class, 28);
    }

    /* renamed from: b0 */
    public static void m37020b0(View view, int i) {
        view.offsetTopAndBottom(i);
    }

    /* renamed from: c */
    public static int m37019c(View view, CharSequence charSequence, AccessibilityViewCommand accessibilityViewCommand) {
        int r = m36989r(view, charSequence);
        if (r != -1) {
            m37017d(view, new AccessibilityNodeInfoCompat.C2556a(r, charSequence, accessibilityViewCommand));
        }
        return r;
    }

    /* renamed from: c0 */
    public static WindowInsetsCompat m37018c0(View view, WindowInsetsCompat windowInsetsCompat) {
        WindowInsets x = windowInsetsCompat.m37503x();
        if (x != null) {
            WindowInsets b = C2745l.m36904b(view, x);
            if (!b.equals(x)) {
                return WindowInsetsCompat.m37501z(b, view);
            }
        }
        return windowInsetsCompat;
    }

    /* renamed from: d */
    private static void m37017d(View view, AccessibilityNodeInfoCompat.C2556a aVar) {
        m37005j(view);
        m37000l0(aVar.m37337b(), view);
        m36991q(view).add(aVar);
        m37024Z(view, 0);
    }

    /* renamed from: d0 */
    public static void m37016d0(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        view.onInitializeAccessibilityNodeInfo(accessibilityNodeInfoCompat.m37410H0());
    }

    /* renamed from: e */
    public static C2674n2 m37015e(View view) {
        if (f3647b == null) {
            f3647b = new WeakHashMap<>();
        }
        C2674n2 n2Var = f3647b.get(view);
        if (n2Var != null) {
            return n2Var;
        }
        C2674n2 n2Var2 = new C2674n2(view);
        f3647b.put(view, n2Var2);
        return n2Var2;
    }

    /* renamed from: e0 */
    private static AbstractC2739f<CharSequence> m37014e0() {
        return new C2735b(C1239e.f35047Y, CharSequence.class, 8, 28);
    }

    /* renamed from: f */
    public static WindowInsetsCompat m37013f(View view, WindowInsetsCompat windowInsetsCompat, Rect rect) {
        return C2746m.m36901b(view, windowInsetsCompat, rect);
    }

    /* renamed from: f0 */
    public static boolean m37012f0(View view, int i, Bundle bundle) {
        return C2741h.m36936j(view, i, bundle);
    }

    /* renamed from: g */
    public static WindowInsetsCompat m37011g(View view, WindowInsetsCompat windowInsetsCompat) {
        WindowInsets x = windowInsetsCompat.m37503x();
        if (x != null) {
            WindowInsets a = C2745l.m36905a(view, x);
            if (!a.equals(x)) {
                return WindowInsetsCompat.m37501z(a, view);
            }
        }
        return windowInsetsCompat;
    }

    /* renamed from: g0 */
    public static ContentInfoCompat m37010g0(View view, ContentInfoCompat contentInfoCompat) {
        if (Log.isLoggable("ViewCompat", 3)) {
            Log.d("ViewCompat", "performReceiveContent: " + contentInfoCompat + ", view=" + view.getClass().getSimpleName() + "[" + view.getId() + "]");
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return C2753s.m36841b(view, contentInfoCompat);
        }
        AbstractC2702s0 s0Var = (AbstractC2702s0) view.getTag(C1239e.f21a0);
        if (s0Var == null) {
            return m36977x(view).onReceiveContent(contentInfoCompat);
        }
        ContentInfoCompat a = s0Var.mo32330a(view, contentInfoCompat);
        if (a == null) {
            return null;
        }
        return m36977x(view).onReceiveContent(a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public static boolean m37009h(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return C2756v.m36839a(view).m36838b(view, keyEvent);
    }

    /* renamed from: h0 */
    public static void m37008h0(View view) {
        C2741h.m36935k(view);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public static boolean m37007i(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return C2756v.m36839a(view).m36834f(keyEvent);
    }

    /* renamed from: i0 */
    public static void m37006i0(View view, Runnable runnable) {
        C2741h.m36933m(view, runnable);
    }

    /* renamed from: j */
    static void m37005j(View view) {
        C2549a l = m37001l(view);
        if (l == null) {
            l = new C2549a();
        }
        m36990q0(view, l);
    }

    @SuppressLint({"LambdaLast"})
    /* renamed from: j0 */
    public static void m37004j0(View view, Runnable runnable, long j) {
        C2741h.m36932n(view, runnable, j);
    }

    /* renamed from: k */
    public static int m37003k() {
        return C2742i.m36926a();
    }

    /* renamed from: k0 */
    public static void m37002k0(View view, int i) {
        m37000l0(i, view);
        m37024Z(view, 0);
    }

    /* renamed from: l */
    public static C2549a m37001l(View view) {
        View.AccessibilityDelegate m = m36999m(view);
        if (m == null) {
            return null;
        }
        if (m instanceof C2549a.C0042a) {
            return ((C2549a.C0042a) m).f3552a;
        }
        return new C2549a(m);
    }

    /* renamed from: l0 */
    private static void m37000l0(int i, View view) {
        List<AccessibilityNodeInfoCompat.C2556a> q = m36991q(view);
        for (int i2 = 0; i2 < q.size(); i2++) {
            if (q.get(i2).m37337b() == i) {
                q.remove(i2);
                return;
            }
        }
    }

    /* renamed from: m */
    private static View.AccessibilityDelegate m36999m(View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            return C2751q.m36848a(view);
        }
        return m36997n(view);
    }

    /* renamed from: m0 */
    public static void m36998m0(View view, AccessibilityNodeInfoCompat.C2556a aVar, CharSequence charSequence, AccessibilityViewCommand accessibilityViewCommand) {
        if (accessibilityViewCommand == null && charSequence == null) {
            m37002k0(view, aVar.m37337b());
        } else {
            m37017d(view, aVar.m37338a(charSequence, accessibilityViewCommand));
        }
    }

    /* renamed from: n */
    private static View.AccessibilityDelegate m36997n(View view) {
        if (f3649d) {
            return null;
        }
        if (f3648c == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                f3648c = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                f3649d = true;
                return null;
            }
        }
        try {
            Object obj = f3648c.get(view);
            if (obj instanceof View.AccessibilityDelegate) {
                return (View.AccessibilityDelegate) obj;
            }
            return null;
        } catch (Throwable unused2) {
            f3649d = true;
            return null;
        }
    }

    /* renamed from: n0 */
    public static void m36996n0(View view) {
        C2745l.m36903c(view);
    }

    /* renamed from: o */
    public static int m36995o(View view) {
        return C2744k.m36912a(view);
    }

    /* renamed from: o0 */
    public static void m36994o0(View view, @SuppressLint({"ContextFirst"}) Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i, int i2) {
        if (Build.VERSION.SDK_INT >= 29) {
            C2751q.m36846c(view, context, iArr, attributeSet, typedArray, i, i2);
        }
    }

    /* renamed from: p */
    public static CharSequence m36993p(View view) {
        return m37014e0().m36949f(view);
    }

    /* renamed from: p0 */
    private static AbstractC2739f<Boolean> m36992p0() {
        return new C2734a(C1239e.f25c0, Boolean.class, 28);
    }

    /* renamed from: q */
    private static List<AccessibilityNodeInfoCompat.C2556a> m36991q(View view) {
        int i = C1239e.f35044V;
        ArrayList arrayList = (ArrayList) view.getTag(i);
        if (arrayList != null) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        view.setTag(i, arrayList2);
        return arrayList2;
    }

    /* renamed from: q0 */
    public static void m36990q0(View view, C2549a aVar) {
        View.AccessibilityDelegate accessibilityDelegate;
        if (aVar == null && (m36999m(view) instanceof C2549a.C0042a)) {
            aVar = new C2549a();
        }
        if (aVar == null) {
            accessibilityDelegate = null;
        } else {
            accessibilityDelegate = aVar.getBridge();
        }
        view.setAccessibilityDelegate(accessibilityDelegate);
    }

    /* renamed from: r */
    private static int m36989r(View view, CharSequence charSequence) {
        boolean z;
        List<AccessibilityNodeInfoCompat.C2556a> q = m36991q(view);
        for (int i = 0; i < q.size(); i++) {
            if (TextUtils.equals(charSequence, q.get(i).m37336c())) {
                return q.get(i).m37337b();
            }
        }
        int i2 = -1;
        int i3 = 0;
        while (true) {
            int[] iArr = f3650e;
            if (i3 >= iArr.length || i2 != -1) {
                break;
            }
            int i4 = iArr[i3];
            boolean z2 = true;
            for (int i5 = 0; i5 < q.size(); i5++) {
                if (q.get(i5).m37337b() != i4) {
                    z = true;
                } else {
                    z = false;
                }
                z2 &= z;
            }
            if (z2) {
                i2 = i4;
            }
            i3++;
        }
        return i2;
    }

    /* renamed from: r0 */
    public static void m36988r0(View view, boolean z) {
        m37021b().m36948g(view, Boolean.valueOf(z));
    }

    /* renamed from: s */
    public static ColorStateList m36987s(View view) {
        return C2746m.m36896g(view);
    }

    /* renamed from: s0 */
    public static void m36986s0(View view, int i) {
        C2744k.m36907f(view, i);
    }

    /* renamed from: t */
    public static PorterDuff.Mode m36985t(View view) {
        return C2746m.m36895h(view);
    }

    /* renamed from: t0 */
    public static void m36984t0(View view, CharSequence charSequence) {
        m37014e0().m36948g(view, charSequence);
        if (charSequence != null) {
            f3652g.m36959a(view);
        } else {
            f3652g.m36956d(view);
        }
    }

    /* renamed from: u */
    public static Rect m36983u(View view) {
        return C2743j.m36915a(view);
    }

    /* renamed from: u0 */
    public static void m36982u0(View view, Drawable drawable) {
        C2741h.m36929q(view, drawable);
    }

    /* renamed from: v */
    public static Display m36981v(View view) {
        return C2742i.m36925b(view);
    }

    /* renamed from: v0 */
    public static void m36980v0(View view, ColorStateList colorStateList) {
        C2746m.m36886q(view, colorStateList);
    }

    /* renamed from: w */
    public static float m36979w(View view) {
        return C2746m.m36894i(view);
    }

    /* renamed from: w0 */
    public static void m36978w0(View view, PorterDuff.Mode mode) {
        C2746m.m36885r(view, mode);
    }

    /* renamed from: x */
    private static AbstractC2708t0 m36977x(View view) {
        if (view instanceof AbstractC2708t0) {
            return (AbstractC2708t0) view;
        }
        return f3651f;
    }

    /* renamed from: x0 */
    public static void m36976x0(View view, Rect rect) {
        C2743j.m36913c(view, rect);
    }

    /* renamed from: y */
    public static boolean m36975y(View view) {
        return C2741h.m36944b(view);
    }

    /* renamed from: y0 */
    public static void m36974y0(View view, float f) {
        C2746m.m36884s(view, f);
    }

    /* renamed from: z */
    public static int m36973z(View view) {
        return C2741h.m36943c(view);
    }

    /* renamed from: z0 */
    public static void m36972z0(View view, boolean z) {
        C2741h.m36928r(view, z);
    }
}
