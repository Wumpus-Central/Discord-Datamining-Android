package com.swmansion.rnscreens;

import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.graphics.Color;
import android.view.View;
import android.view.ViewParent;
import android.view.Window;
import androidx.core.view.AbstractC2694r0;
import androidx.core.view.C2696r2;
import androidx.core.view.C2733w0;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.WindowInsetsControllerCompat;
import com.facebook.react.bridge.GuardedRunnable;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.uimanager.ViewProps;
import com.swmansion.rnscreens.C6308j;
import com.swmansion.rnscreens.C6343z;
import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;
import nf.C11088q;

@Metadata(m15074d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0013\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b)\u0010\u0010J\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u001a\u0010\u0007\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u001c\u0010\b\u001a\u0004\u0018\u00010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\r\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0002J\u000f\u0010\u000f\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u0011\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u0012\u0010\u0010J!\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0000¢\u0006\u0004\b\u0015\u0010\u0016J+\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ+\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0000¢\u0006\u0004\b\u001b\u0010\u001aJ+\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0000¢\u0006\u0004\b\u001c\u0010\u001aJ!\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0000¢\u0006\u0004\b\u001d\u0010\u0016J!\u0010\u001e\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0000¢\u0006\u0004\b\u001e\u0010\u0016J!\u0010\u001f\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0000¢\u0006\u0004\b\u001f\u0010\u0016J+\u0010 \u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0000¢\u0006\u0004\b \u0010\u001aR\u0016\u0010#\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010%\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010\"R\u0016\u0010&\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\"R\u0018\u0010(\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010'¨\u0006*"}, m15073d2 = {"Lcom/swmansion/rnscreens/z;", "", "Lcom/swmansion/rnscreens/j;", "screen", "Lcom/swmansion/rnscreens/j$e;", "trait", "j", "i", "h", "", "g", "", ViewProps.COLOR, "k", "", "e", "()V", "f", "d", "Landroid/app/Activity;", "activity", "r", "(Lcom/swmansion/rnscreens/j;Landroid/app/Activity;)V", "Lcom/facebook/react/bridge/ReactContext;", "context", "l", "(Lcom/swmansion/rnscreens/j;Landroid/app/Activity;Lcom/facebook/react/bridge/ReactContext;)V", "t", "u", "n", "p", "q", "v", "b", "Z", "mDidSetOrientation", "c", "mDidSetStatusBarAppearance", "mDidSetNavigationBarAppearance", "Ljava/lang/Integer;", "mDefaultStatusBarColor", "<init>", "react-native-screens_release"}, m15072k = 1, m15071mv = {1, 8, 0})
/* renamed from: com.swmansion.rnscreens.z */
/* loaded from: classes8.dex */
public final class C6343z {

    /* renamed from: a */
    public static final C6343z f12923a = new C6343z();

    /* renamed from: b */
    private static boolean f12924b;

    /* renamed from: c */
    private static boolean f12925c;

    /* renamed from: d */
    private static boolean f12926d;

    /* renamed from: e */
    private static Integer f12927e;

    @Metadata(m15072k = 3, m15071mv = {1, 8, 0}, m15069xi = 48)
    /* renamed from: com.swmansion.rnscreens.z$a */
    /* loaded from: classes8.dex */
    public /* synthetic */ class C6344a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f12928a;

        static {
            int[] iArr = new int[C6308j.EnumC6313e.values().length];
            try {
                iArr[C6308j.EnumC6313e.ORIENTATION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[C6308j.EnumC6313e.COLOR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[C6308j.EnumC6313e.STYLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[C6308j.EnumC6313e.TRANSLUCENT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[C6308j.EnumC6313e.HIDDEN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[C6308j.EnumC6313e.ANIMATED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[C6308j.EnumC6313e.NAVIGATION_BAR_COLOR.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[C6308j.EnumC6313e.NAVIGATION_BAR_HIDDEN.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            f12928a = iArr;
        }
    }

    @Metadata(m15074d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004"}, m15073d2 = {"com/swmansion/rnscreens/z$b", "Lcom/facebook/react/bridge/GuardedRunnable;", "", "runGuarded", "react-native-screens_release"}, m15072k = 1, m15071mv = {1, 8, 0})
    /* renamed from: com.swmansion.rnscreens.z$b */
    /* loaded from: classes8.dex */
    public static final class C6345b extends GuardedRunnable {

        /* renamed from: k */
        final /* synthetic */ Activity f12929k;

        /* renamed from: l */
        final /* synthetic */ Integer f12930l;

        /* renamed from: m */
        final /* synthetic */ boolean f12931m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C6345b(ReactContext reactContext, Activity activity, Integer num, boolean z) {
            super(reactContext);
            this.f12929k = activity;
            this.f12930l = num;
            this.f12931m = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: b */
        public static final void m25797b(Window window, ValueAnimator valueAnimator) {
            Object animatedValue = valueAnimator.getAnimatedValue();
            C9971q.m14635e(animatedValue, "null cannot be cast to non-null type kotlin.Int");
            window.setStatusBarColor(((Integer) animatedValue).intValue());
        }

        @Override // com.facebook.react.bridge.GuardedRunnable
        public void runGuarded() {
            final Window window = this.f12929k.getWindow();
            ValueAnimator ofObject = ValueAnimator.ofObject(new ArgbEvaluator(), Integer.valueOf(window.getStatusBarColor()), this.f12930l);
            ofObject.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.swmansion.rnscreens.a0
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    C6343z.C6345b.m25797b(window, valueAnimator);
                }
            });
            if (this.f12931m) {
                ofObject.setDuration(300L).setStartDelay(0L);
            } else {
                ofObject.setDuration(0L).setStartDelay(300L);
            }
            ofObject.start();
        }
    }

    @Metadata(m15074d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0017¨\u0006\u0004"}, m15073d2 = {"com/swmansion/rnscreens/z$c", "Lcom/facebook/react/bridge/GuardedRunnable;", "", "runGuarded", "react-native-screens_release"}, m15072k = 1, m15071mv = {1, 8, 0})
    /* renamed from: com.swmansion.rnscreens.z$c */
    /* loaded from: classes8.dex */
    public static final class C6346c extends GuardedRunnable {

        /* renamed from: k */
        final /* synthetic */ Activity f12932k;

        /* renamed from: l */
        final /* synthetic */ boolean f12933l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C6346c(ReactContext reactContext, Activity activity, boolean z) {
            super(reactContext);
            this.f12932k = activity;
            this.f12933l = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: b */
        public static final WindowInsetsCompat m25795b(View view, WindowInsetsCompat windowInsetsCompat) {
            WindowInsetsCompat c0 = C2733w0.m37018c0(view, windowInsetsCompat);
            C9971q.m14634f(c0, "onApplyWindowInsets(v, insets)");
            return c0.m37508s(c0.m37514m(), 0, c0.m37513n(), c0.m37515l());
        }

        @Override // com.facebook.react.bridge.GuardedRunnable
        @TargetApi(21)
        public void runGuarded() {
            View decorView = this.f12932k.getWindow().getDecorView();
            C9971q.m14634f(decorView, "activity.window.decorView");
            if (this.f12933l) {
                C2733w0.m37058D0(decorView, new AbstractC2694r0() { // from class: com.swmansion.rnscreens.b0
                    @Override // androidx.core.view.AbstractC2694r0
                    /* renamed from: a */
                    public final WindowInsetsCompat mo13081a(View view, WindowInsetsCompat windowInsetsCompat) {
                        WindowInsetsCompat b;
                        b = C6343z.C6346c.m25795b(view, windowInsetsCompat);
                        return b;
                    }
                });
            } else {
                C2733w0.m37058D0(decorView, null);
            }
            C2733w0.m36996n0(decorView);
        }
    }

    private C6343z() {
    }

    /* renamed from: g */
    private final boolean m25814g(C6308j jVar, C6308j.EnumC6313e eVar) {
        switch (C6344a.f12928a[eVar.ordinal()]) {
            case 1:
                if (jVar.getScreenOrientation() != null) {
                    return true;
                }
                break;
            case 2:
                if (jVar.getStatusBarColor() != null) {
                    return true;
                }
                break;
            case 3:
                if (jVar.getStatusBarStyle() != null) {
                    return true;
                }
                break;
            case 4:
                if (jVar.m25922f() != null) {
                    return true;
                }
                break;
            case 5:
                if (jVar.m25923e() != null) {
                    return true;
                }
                break;
            case 6:
                if (jVar.m25924d() != null) {
                    return true;
                }
                break;
            case 7:
                if (jVar.getNavigationBarColor() != null) {
                    return true;
                }
                break;
            case 8:
                if (jVar.m25925c() != null) {
                    return true;
                }
                break;
            default:
                throw new C11088q();
        }
        return false;
    }

    /* renamed from: h */
    private final C6308j m25813h(C6308j jVar, C6308j.EnumC6313e eVar) {
        C6319n fragment;
        if (jVar == null || (fragment = jVar.getFragment()) == null) {
            return null;
        }
        for (C6316l<?> lVar : fragment.m25885p()) {
            C6308j topScreen = lVar.getTopScreen();
            C6343z zVar = f12923a;
            C6308j h = zVar.m25813h(topScreen, eVar);
            if (h != null) {
                return h;
            }
            if (topScreen != null && zVar.m25814g(topScreen, eVar)) {
                return topScreen;
            }
        }
        return null;
    }

    /* renamed from: i */
    private final C6308j m25812i(C6308j jVar, C6308j.EnumC6313e eVar) {
        for (ViewParent container = jVar.getContainer(); container != null; container = container.getParent()) {
            if (container instanceof C6308j) {
                C6308j jVar2 = (C6308j) container;
                if (m25814g(jVar2, eVar)) {
                    return jVar2;
                }
            }
        }
        return null;
    }

    /* renamed from: j */
    private final C6308j m25811j(C6308j jVar, C6308j.EnumC6313e eVar) {
        C6308j h = m25813h(jVar, eVar);
        if (h != null) {
            return h;
        }
        if (m25814g(jVar, eVar)) {
            return jVar;
        }
        return m25812i(jVar, eVar);
    }

    /* renamed from: k */
    private final boolean m25810k(int i) {
        return ((double) 1) - ((((((double) Color.red(i)) * 0.299d) + (((double) Color.green(i)) * 0.587d)) + (((double) Color.blue(i)) * 0.114d)) / ((double) 255)) < 0.5d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m */
    public static final void m25808m(boolean z, WindowInsetsControllerCompat controller) {
        C9971q.m14633g(controller, "$controller");
        if (z) {
            controller.m37453a(WindowInsetsCompat.C2542m.m37456f());
        } else {
            controller.m37449e(WindowInsetsCompat.C2542m.m37456f());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o */
    public static final void m25806o(Window window, int i) {
        new WindowInsetsControllerCompat(window, window.getDecorView()).m37452b(f12923a.m25810k(i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: s */
    public static final void m25802s(Activity activity, String style) {
        C9971q.m14633g(style, "$style");
        View decorView = activity.getWindow().getDecorView();
        C9971q.m14634f(decorView, "activity.window.decorView");
        new WindowInsetsControllerCompat(activity.getWindow(), decorView).m37451c(C9971q.m14638b(style, "dark"));
    }

    /* renamed from: d */
    public final void m25817d() {
        f12926d = true;
    }

    /* renamed from: e */
    public final void m25816e() {
        f12924b = true;
    }

    /* renamed from: f */
    public final void m25815f() {
        f12925c = true;
    }

    @SuppressLint({"ObsoleteSdkInt"})
    /* renamed from: l */
    public final void m25809l(C6308j screen, Activity activity, ReactContext reactContext) {
        Integer num;
        boolean z;
        Boolean d;
        C9971q.m14633g(screen, "screen");
        if (activity != null && reactContext != null) {
            if (f12927e == null) {
                f12927e = Integer.valueOf(activity.getWindow().getStatusBarColor());
            }
            C6308j j = m25811j(screen, C6308j.EnumC6313e.COLOR);
            C6308j j2 = m25811j(screen, C6308j.EnumC6313e.ANIMATED);
            if (j == null || (num = j.getStatusBarColor()) == null) {
                num = f12927e;
            }
            if (j2 == null || (d = j2.m25924d()) == null) {
                z = false;
            } else {
                z = d.booleanValue();
            }
            UiThreadUtil.runOnUiThread(new C6345b(reactContext, activity, num, z));
        }
    }

    /* renamed from: n */
    public final void m25807n(C6308j screen, Activity activity) {
        final boolean z;
        Boolean e;
        C9971q.m14633g(screen, "screen");
        if (activity != null) {
            C6308j j = m25811j(screen, C6308j.EnumC6313e.HIDDEN);
            if (j == null || (e = j.m25923e()) == null) {
                z = false;
            } else {
                z = e.booleanValue();
            }
            Window window = activity.getWindow();
            final WindowInsetsControllerCompat windowInsetsControllerCompat = new WindowInsetsControllerCompat(window, window.getDecorView());
            UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.swmansion.rnscreens.w
                @Override // java.lang.Runnable
                public final void run() {
                    C6343z.m25808m(z, windowInsetsControllerCompat);
                }
            });
        }
    }

    /* renamed from: p */
    public final void m25805p(C6308j screen, Activity activity) {
        final int i;
        Integer navigationBarColor;
        C9971q.m14633g(screen, "screen");
        if (activity != null) {
            final Window window = activity.getWindow();
            C6308j j = m25811j(screen, C6308j.EnumC6313e.NAVIGATION_BAR_COLOR);
            if (j == null || (navigationBarColor = j.getNavigationBarColor()) == null) {
                i = window.getNavigationBarColor();
            } else {
                i = navigationBarColor.intValue();
            }
            UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.swmansion.rnscreens.x
                @Override // java.lang.Runnable
                public final void run() {
                    C6343z.m25806o(window, i);
                }
            });
            window.setNavigationBarColor(i);
        }
    }

    /* renamed from: q */
    public final void m25804q(C6308j screen, Activity activity) {
        boolean z;
        Boolean c;
        C9971q.m14633g(screen, "screen");
        if (activity != null) {
            Window window = activity.getWindow();
            C6308j j = m25811j(screen, C6308j.EnumC6313e.NAVIGATION_BAR_HIDDEN);
            if (j == null || (c = j.m25925c()) == null) {
                z = false;
            } else {
                z = c.booleanValue();
            }
            C2696r2.m37144b(window, z);
            if (z) {
                WindowInsetsControllerCompat windowInsetsControllerCompat = new WindowInsetsControllerCompat(window, window.getDecorView());
                windowInsetsControllerCompat.m37453a(WindowInsetsCompat.C2542m.m37457e());
                windowInsetsControllerCompat.m37450d(2);
                return;
            }
            new WindowInsetsControllerCompat(window, window.getDecorView()).m37449e(WindowInsetsCompat.C2542m.m37457e());
        }
    }

    /* renamed from: r */
    public final void m25803r(C6308j screen, Activity activity) {
        int i;
        Integer screenOrientation;
        C9971q.m14633g(screen, "screen");
        if (activity != null) {
            C6308j j = m25811j(screen, C6308j.EnumC6313e.ORIENTATION);
            if (j == null || (screenOrientation = j.getScreenOrientation()) == null) {
                i = -1;
            } else {
                i = screenOrientation.intValue();
            }
            activity.setRequestedOrientation(i);
        }
    }

    /* renamed from: t */
    public final void m25801t(C6308j screen, final Activity activity, ReactContext reactContext) {
        final String str;
        C9971q.m14633g(screen, "screen");
        if (activity != null && reactContext != null) {
            C6308j j = m25811j(screen, C6308j.EnumC6313e.STYLE);
            if (j == null || (str = j.getStatusBarStyle()) == null) {
                str = "light";
            }
            UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.swmansion.rnscreens.y
                @Override // java.lang.Runnable
                public final void run() {
                    C6343z.m25802s(activity, str);
                }
            });
        }
    }

    /* renamed from: u */
    public final void m25800u(C6308j screen, Activity activity, ReactContext reactContext) {
        boolean z;
        Boolean f;
        C9971q.m14633g(screen, "screen");
        if (activity != null && reactContext != null) {
            C6308j j = m25811j(screen, C6308j.EnumC6313e.TRANSLUCENT);
            if (j == null || (f = j.m25922f()) == null) {
                z = false;
            } else {
                z = f.booleanValue();
            }
            UiThreadUtil.runOnUiThread(new C6346c(reactContext, activity, z));
        }
    }

    /* renamed from: v */
    public final void m25799v(C6308j screen, Activity activity, ReactContext reactContext) {
        C9971q.m14633g(screen, "screen");
        if (f12924b) {
            m25803r(screen, activity);
        }
        if (f12925c) {
            m25809l(screen, activity, reactContext);
            m25801t(screen, activity, reactContext);
            m25800u(screen, activity, reactContext);
            m25807n(screen, activity);
        }
        if (f12926d) {
            m25805p(screen, activity);
            m25804q(screen, activity);
        }
    }
}
