package androidx.appcompat.app;

import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.os.PowerManager;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.KeyboardShortcutGroup;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.view.ActionMode;
import androidx.appcompat.view.C1562b;
import androidx.appcompat.view.menu.AbstractC1584j;
import androidx.appcompat.view.menu.AbstractC1586k;
import androidx.appcompat.view.menu.C1572c;
import androidx.appcompat.view.menu.C1575e;
import androidx.appcompat.widget.AbstractC1688k0;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.C1683j;
import androidx.appcompat.widget.C1698n1;
import androidx.appcompat.widget.C1731u1;
import androidx.appcompat.widget.C1735v1;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.collection.SimpleArrayMap;
import androidx.core.app.C2261l;
import androidx.core.content.C2337a;
import androidx.core.content.res.C2367h;
import androidx.core.util.C2513d;
import androidx.core.view.AbstractC2694r0;
import androidx.core.view.C2674n2;
import androidx.core.view.C2686p2;
import androidx.core.view.C2720u;
import androidx.core.view.C2726v;
import androidx.core.view.C2733w0;
import androidx.core.view.WindowInsetsCompat;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.reactnativecommunity.webview.RNCWebViewManager;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import p052d.C6379a;
import p052d.C6381c;
import p052d.C6384f;
import p052d.C6385g;
import p052d.C6387i;
import p052d.C6388j;
import p071e.C6525a;
import p144i.C8096c;
import p144i.C8097d;
import p144i.Window$CallbackC8104h;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.appcompat.app.d */
/* loaded from: classes.dex */
public class LayoutInflater$Factory2C1513d extends AppCompatDelegate implements C1575e.AbstractC1576a, LayoutInflater.Factory2 {

    /* renamed from: l0 */
    private static final SimpleArrayMap<String, Integer> f735l0 = new SimpleArrayMap<>();

    /* renamed from: m0 */
    private static final boolean f736m0 = false;

    /* renamed from: n0 */
    private static final int[] f737n0 = {16842836};

    /* renamed from: o0 */
    private static final boolean f738o0 = !"robolectric".equals(Build.FINGERPRINT);

    /* renamed from: p0 */
    private static final boolean f739p0 = true;

    /* renamed from: A */
    PopupWindow f35125A;

    /* renamed from: B */
    Runnable f35126B;

    /* renamed from: C */
    C2674n2 f35127C;

    /* renamed from: D */
    private boolean f35128D;

    /* renamed from: E */
    private boolean f35129E;

    /* renamed from: F */
    ViewGroup f35130F;

    /* renamed from: G */
    private TextView f35131G;

    /* renamed from: H */
    private View f35132H;

    /* renamed from: I */
    private boolean f35133I;

    /* renamed from: J */
    private boolean f35134J;

    /* renamed from: K */
    boolean f35135K;

    /* renamed from: L */
    boolean f35136L;

    /* renamed from: M */
    boolean f35137M;

    /* renamed from: N */
    boolean f35138N;

    /* renamed from: O */
    boolean f35139O;

    /* renamed from: P */
    private boolean f35140P;

    /* renamed from: Q */
    private C1534t[] f35141Q;

    /* renamed from: R */
    private C1534t f35142R;

    /* renamed from: S */
    private boolean f35143S;

    /* renamed from: T */
    private boolean f35144T;

    /* renamed from: U */
    private boolean f35145U;

    /* renamed from: V */
    boolean f35146V;

    /* renamed from: W */
    private Configuration f35147W;

    /* renamed from: X */
    private int f35148X;

    /* renamed from: Y */
    private int f35149Y;

    /* renamed from: Z */
    private boolean f35150Z;

    /* renamed from: a0 */
    private boolean f740a0;

    /* renamed from: b0 */
    private AbstractC1529p f741b0;

    /* renamed from: c0 */
    private AbstractC1529p f742c0;

    /* renamed from: d0 */
    boolean f743d0;

    /* renamed from: e0 */
    int f744e0;

    /* renamed from: f0 */
    private final Runnable f745f0;

    /* renamed from: g0 */
    private boolean f746g0;

    /* renamed from: h0 */
    private Rect f747h0;

    /* renamed from: i0 */
    private Rect f748i0;

    /* renamed from: j0 */
    private C1543k f749j0;

    /* renamed from: k0 */
    private C1545l f750k0;

    /* renamed from: n */
    final Object f751n;

    /* renamed from: o */
    final Context f752o;

    /* renamed from: p */
    Window f753p;

    /* renamed from: q */
    private C1527n f754q;

    /* renamed from: r */
    final AbstractC1512c f755r;

    /* renamed from: s */
    ActionBar f756s;

    /* renamed from: t */
    MenuInflater f757t;

    /* renamed from: u */
    private CharSequence f758u;

    /* renamed from: v */
    private AbstractC1688k0 f759v;

    /* renamed from: w */
    private C1520h f760w;

    /* renamed from: x */
    private C1535u f761x;

    /* renamed from: y */
    ActionMode f762y;

    /* renamed from: z */
    ActionBarContextView f763z;

    /* renamed from: androidx.appcompat.app.d$a */
    /* loaded from: classes.dex */
    class RunnableC1514a implements Runnable {
        RunnableC1514a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            LayoutInflater$Factory2C1513d dVar = LayoutInflater$Factory2C1513d.this;
            if ((dVar.f744e0 & 1) != 0) {
                dVar.m40872Y(0);
            }
            LayoutInflater$Factory2C1513d dVar2 = LayoutInflater$Factory2C1513d.this;
            if ((dVar2.f744e0 & 4096) != 0) {
                dVar2.m40872Y(108);
            }
            LayoutInflater$Factory2C1513d dVar3 = LayoutInflater$Factory2C1513d.this;
            dVar3.f743d0 = false;
            dVar3.f744e0 = 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.app.d$b */
    /* loaded from: classes.dex */
    public class C1515b implements AbstractC2694r0 {
        C1515b() {
        }

        @Override // androidx.core.view.AbstractC2694r0
        /* renamed from: a */
        public WindowInsetsCompat mo13081a(View view, WindowInsetsCompat windowInsetsCompat) {
            int o = windowInsetsCompat.m37512o();
            int O0 = LayoutInflater$Factory2C1513d.this.m40883O0(windowInsetsCompat, null);
            if (o != O0) {
                windowInsetsCompat = windowInsetsCompat.m37508s(windowInsetsCompat.m37514m(), O0, windowInsetsCompat.m37513n(), windowInsetsCompat.m37515l());
            }
            return C2733w0.m37018c0(view, windowInsetsCompat);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.app.d$c */
    /* loaded from: classes.dex */
    public class C1516c implements ContentFrameLayout.AbstractC1605a {
        C1516c() {
        }

        @Override // androidx.appcompat.widget.ContentFrameLayout.AbstractC1605a
        /* renamed from: a */
        public void mo40436a() {
        }

        @Override // androidx.appcompat.widget.ContentFrameLayout.AbstractC1605a
        public void onDetachedFromWindow() {
            LayoutInflater$Factory2C1513d.this.m40874W();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.app.d$d */
    /* loaded from: classes.dex */
    public class RunnableC0016d implements Runnable {

        /* renamed from: androidx.appcompat.app.d$d$a */
        /* loaded from: classes.dex */
        class a extends C2686p2 {
            a() {
            }

            @Override // androidx.core.view.AbstractC2681o2
            /* renamed from: b */
            public void mo20596b(View view) {
                LayoutInflater$Factory2C1513d.this.f763z.setAlpha(1.0f);
                LayoutInflater$Factory2C1513d.this.f35127C.m37166h(null);
                LayoutInflater$Factory2C1513d.this.f35127C = null;
            }

            @Override // androidx.core.view.C2686p2, androidx.core.view.AbstractC2681o2
            /* renamed from: c */
            public void mo20595c(View view) {
                LayoutInflater$Factory2C1513d.this.f763z.setVisibility(0);
            }
        }

        RunnableC0016d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            LayoutInflater$Factory2C1513d dVar = LayoutInflater$Factory2C1513d.this;
            dVar.f35125A.showAtLocation(dVar.f763z, 55, 0, 0);
            LayoutInflater$Factory2C1513d.this.m40871Z();
            if (LayoutInflater$Factory2C1513d.this.m40897H0()) {
                LayoutInflater$Factory2C1513d.this.f763z.setAlpha(0.0f);
                LayoutInflater$Factory2C1513d dVar2 = LayoutInflater$Factory2C1513d.this;
                dVar2.f35127C = C2733w0.m37015e(dVar2.f763z).m37172b(1.0f);
                LayoutInflater$Factory2C1513d.this.f35127C.m37166h(new a());
                return;
            }
            LayoutInflater$Factory2C1513d.this.f763z.setAlpha(1.0f);
            LayoutInflater$Factory2C1513d.this.f763z.setVisibility(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.app.d$e */
    /* loaded from: classes.dex */
    public class C1517e extends C2686p2 {
        C1517e() {
        }

        @Override // androidx.core.view.AbstractC2681o2
        /* renamed from: b */
        public void mo20596b(View view) {
            LayoutInflater$Factory2C1513d.this.f763z.setAlpha(1.0f);
            LayoutInflater$Factory2C1513d.this.f35127C.m37166h(null);
            LayoutInflater$Factory2C1513d.this.f35127C = null;
        }

        @Override // androidx.core.view.C2686p2, androidx.core.view.AbstractC2681o2
        /* renamed from: c */
        public void mo20595c(View view) {
            LayoutInflater$Factory2C1513d.this.f763z.setVisibility(0);
            if (LayoutInflater$Factory2C1513d.this.f763z.getParent() instanceof View) {
                C2733w0.m36996n0((View) LayoutInflater$Factory2C1513d.this.f763z.getParent());
            }
        }
    }

    /* renamed from: androidx.appcompat.app.d$f */
    /* loaded from: classes.dex */
    private class C1518f implements ActionBarDrawerToggle$Delegate {
        C1518f() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.app.d$g */
    /* loaded from: classes.dex */
    public interface AbstractC1519g {
        /* renamed from: a */
        boolean mo40766a(int i);

        View onCreatePanelView(int i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.appcompat.app.d$h */
    /* loaded from: classes.dex */
    public final class C1520h implements AbstractC1584j.AbstractC1585a {
        C1520h() {
        }

        @Override // androidx.appcompat.view.menu.AbstractC1584j.AbstractC1585a
        /* renamed from: a */
        public void mo40291a(C1575e eVar, boolean z) {
            LayoutInflater$Factory2C1513d.this.m40882P(eVar);
        }

        @Override // androidx.appcompat.view.menu.AbstractC1584j.AbstractC1585a
        /* renamed from: b */
        public boolean mo40290b(C1575e eVar) {
            Window.Callback j0 = LayoutInflater$Factory2C1513d.this.m40858j0();
            if (j0 == null) {
                return true;
            }
            j0.onMenuOpened(108, eVar);
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.app.d$i */
    /* loaded from: classes.dex */
    public class C1521i implements ActionMode.Callback {

        /* renamed from: a */
        private ActionMode.Callback f772a;

        /* renamed from: androidx.appcompat.app.d$i$a */
        /* loaded from: classes.dex */
        class C1522a extends C2686p2 {
            C1522a() {
            }

            @Override // androidx.core.view.AbstractC2681o2
            /* renamed from: b */
            public void mo20596b(View view) {
                LayoutInflater$Factory2C1513d.this.f763z.setVisibility(8);
                LayoutInflater$Factory2C1513d dVar = LayoutInflater$Factory2C1513d.this;
                PopupWindow popupWindow = dVar.f35125A;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (dVar.f763z.getParent() instanceof View) {
                    C2733w0.m36996n0((View) LayoutInflater$Factory2C1513d.this.f763z.getParent());
                }
                LayoutInflater$Factory2C1513d.this.f763z.m40553k();
                LayoutInflater$Factory2C1513d.this.f35127C.m37166h(null);
                LayoutInflater$Factory2C1513d dVar2 = LayoutInflater$Factory2C1513d.this;
                dVar2.f35127C = null;
                C2733w0.m36996n0(dVar2.f35130F);
            }
        }

        public C1521i(ActionMode.Callback callback) {
            this.f772a = callback;
        }

        @Override // androidx.appcompat.view.ActionMode.Callback
        /* renamed from: a */
        public void mo40708a(ActionMode actionMode) {
            this.f772a.mo40708a(actionMode);
            LayoutInflater$Factory2C1513d dVar = LayoutInflater$Factory2C1513d.this;
            if (dVar.f35125A != null) {
                dVar.f753p.getDecorView().removeCallbacks(LayoutInflater$Factory2C1513d.this.f35126B);
            }
            LayoutInflater$Factory2C1513d dVar2 = LayoutInflater$Factory2C1513d.this;
            if (dVar2.f763z != null) {
                dVar2.m40871Z();
                LayoutInflater$Factory2C1513d dVar3 = LayoutInflater$Factory2C1513d.this;
                dVar3.f35127C = C2733w0.m37015e(dVar3.f763z).m37172b(0.0f);
                LayoutInflater$Factory2C1513d.this.f35127C.m37166h(new C1522a());
            }
            LayoutInflater$Factory2C1513d dVar4 = LayoutInflater$Factory2C1513d.this;
            AbstractC1512c cVar = dVar4.f755r;
            if (cVar != null) {
                cVar.onSupportActionModeFinished(dVar4.f762y);
            }
            LayoutInflater$Factory2C1513d dVar5 = LayoutInflater$Factory2C1513d.this;
            dVar5.f762y = null;
            C2733w0.m36996n0(dVar5.f35130F);
        }

        @Override // androidx.appcompat.view.ActionMode.Callback
        /* renamed from: b */
        public boolean mo40707b(ActionMode actionMode, Menu menu) {
            return this.f772a.mo40707b(actionMode, menu);
        }

        @Override // androidx.appcompat.view.ActionMode.Callback
        /* renamed from: c */
        public boolean mo40706c(ActionMode actionMode, MenuItem menuItem) {
            return this.f772a.mo40706c(actionMode, menuItem);
        }

        @Override // androidx.appcompat.view.ActionMode.Callback
        /* renamed from: d */
        public boolean mo40705d(ActionMode actionMode, Menu menu) {
            C2733w0.m36996n0(LayoutInflater$Factory2C1513d.this.f35130F);
            return this.f772a.mo40705d(actionMode, menu);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.app.d$j */
    /* loaded from: classes.dex */
    public static class C1523j {
        /* renamed from: a */
        static Context m40827a(Context context, Configuration configuration) {
            return context.createConfigurationContext(configuration);
        }

        /* renamed from: b */
        static void m40826b(Configuration configuration, Configuration configuration2, Configuration configuration3) {
            int i = configuration.densityDpi;
            int i2 = configuration2.densityDpi;
            if (i != i2) {
                configuration3.densityDpi = i2;
            }
        }
    }

    /* renamed from: androidx.appcompat.app.d$k */
    /* loaded from: classes.dex */
    static class C1524k {
        /* renamed from: a */
        static boolean m40825a(PowerManager powerManager) {
            return powerManager.isPowerSaveMode();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.app.d$l */
    /* loaded from: classes.dex */
    public static class C1525l {
        /* renamed from: a */
        static void m40824a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
            LocaleList locales;
            LocaleList locales2;
            boolean equals;
            locales = configuration.getLocales();
            locales2 = configuration2.getLocales();
            equals = locales.equals(locales2);
            if (!equals) {
                configuration3.setLocales(locales2);
                configuration3.locale = configuration2.locale;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.app.d$m */
    /* loaded from: classes.dex */
    public static class C1526m {
        /* renamed from: a */
        static void m40823a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6;
            int i7;
            int i8;
            i = configuration.colorMode;
            int i9 = i & 3;
            i2 = configuration2.colorMode;
            if (i9 != (i2 & 3)) {
                i7 = configuration3.colorMode;
                i8 = configuration2.colorMode;
                configuration3.colorMode = i7 | (i8 & 3);
            }
            i3 = configuration.colorMode;
            int i10 = i3 & 12;
            i4 = configuration2.colorMode;
            if (i10 != (i4 & 12)) {
                i5 = configuration3.colorMode;
                i6 = configuration2.colorMode;
                configuration3.colorMode = i5 | (i6 & 12);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.app.d$n */
    /* loaded from: classes.dex */
    public class C1527n extends Window$CallbackC8104h {

        /* renamed from: l */
        private AbstractC1519g f775l;

        C1527n(Window.Callback callback) {
            super(callback);
        }

        /* renamed from: b */
        void m40822b(AbstractC1519g gVar) {
            this.f775l = gVar;
        }

        /* renamed from: c */
        final android.view.ActionMode m40821c(ActionMode.Callback callback) {
            C1562b.C1563a aVar = new C1562b.C1563a(LayoutInflater$Factory2C1513d.this.f752o, callback);
            androidx.appcompat.view.ActionMode I = LayoutInflater$Factory2C1513d.this.mo40896I(aVar);
            if (I != null) {
                return aVar.m40704e(I);
            }
            return null;
        }

        @Override // p144i.Window$CallbackC8104h, android.view.Window.Callback
        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            if (LayoutInflater$Factory2C1513d.this.m40873X(keyEvent) || super.dispatchKeyEvent(keyEvent)) {
                return true;
            }
            return false;
        }

        @Override // p144i.Window$CallbackC8104h, android.view.Window.Callback
        public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
            if (super.dispatchKeyShortcutEvent(keyEvent) || LayoutInflater$Factory2C1513d.this.m40834v0(keyEvent.getKeyCode(), keyEvent)) {
                return true;
            }
            return false;
        }

        @Override // android.view.Window.Callback
        public void onContentChanged() {
        }

        @Override // p144i.Window$CallbackC8104h, android.view.Window.Callback
        public boolean onCreatePanelMenu(int i, Menu menu) {
            if (i != 0 || (menu instanceof C1575e)) {
                return super.onCreatePanelMenu(i, menu);
            }
            return false;
        }

        @Override // p144i.Window$CallbackC8104h, android.view.Window.Callback
        public View onCreatePanelView(int i) {
            View onCreatePanelView;
            AbstractC1519g gVar = this.f775l;
            if (gVar == null || (onCreatePanelView = gVar.onCreatePanelView(i)) == null) {
                return super.onCreatePanelView(i);
            }
            return onCreatePanelView;
        }

        @Override // p144i.Window$CallbackC8104h, android.view.Window.Callback
        public boolean onMenuOpened(int i, Menu menu) {
            super.onMenuOpened(i, menu);
            LayoutInflater$Factory2C1513d.this.m40829y0(i);
            return true;
        }

        @Override // p144i.Window$CallbackC8104h, android.view.Window.Callback
        public void onPanelClosed(int i, Menu menu) {
            super.onPanelClosed(i, menu);
            LayoutInflater$Factory2C1513d.this.m40828z0(i);
        }

        @Override // p144i.Window$CallbackC8104h, android.view.Window.Callback
        public boolean onPreparePanel(int i, View view, Menu menu) {
            C1575e eVar;
            if (menu instanceof C1575e) {
                eVar = (C1575e) menu;
            } else {
                eVar = null;
            }
            if (i == 0 && eVar == null) {
                return false;
            }
            boolean z = true;
            if (eVar != null) {
                eVar.m40651a0(true);
            }
            AbstractC1519g gVar = this.f775l;
            if (gVar == null || !gVar.mo40766a(i)) {
                z = false;
            }
            if (!z) {
                z = super.onPreparePanel(i, view, menu);
            }
            if (eVar != null) {
                eVar.m40651a0(false);
            }
            return z;
        }

        @Override // p144i.Window$CallbackC8104h, android.view.Window.Callback
        public void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> list, Menu menu, int i) {
            C1575e eVar;
            C1534t h0 = LayoutInflater$Factory2C1513d.this.m40861h0(0, true);
            if (h0 == null || (eVar = h0.f794j) == null) {
                super.onProvideKeyboardShortcuts(list, menu, i);
            } else {
                super.onProvideKeyboardShortcuts(list, eVar, i);
            }
        }

        @Override // android.view.Window.Callback
        public android.view.ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
            return null;
        }

        @Override // p144i.Window$CallbackC8104h, android.view.Window.Callback
        public android.view.ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
            if (!LayoutInflater$Factory2C1513d.this.m40844q0() || i != 0) {
                return super.onWindowStartingActionMode(callback, i);
            }
            return m40821c(callback);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.appcompat.app.d$o */
    /* loaded from: classes.dex */
    public class C1528o extends AbstractC1529p {

        /* renamed from: c */
        private final PowerManager f777c;

        C1528o(Context context) {
            super();
            this.f777c = (PowerManager) context.getApplicationContext().getSystemService("power");
        }

        @Override // androidx.appcompat.app.LayoutInflater$Factory2C1513d.AbstractC1529p
        /* renamed from: b */
        IntentFilter mo40818b() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
            return intentFilter;
        }

        @Override // androidx.appcompat.app.LayoutInflater$Factory2C1513d.AbstractC1529p
        /* renamed from: c */
        public int mo40817c() {
            return C1524k.m40825a(this.f777c) ? 2 : 1;
        }

        @Override // androidx.appcompat.app.LayoutInflater$Factory2C1513d.AbstractC1529p
        /* renamed from: d */
        public void mo40816d() {
            LayoutInflater$Factory2C1513d.this.m40894J();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.app.d$p */
    /* loaded from: classes.dex */
    public abstract class AbstractC1529p {

        /* renamed from: a */
        private BroadcastReceiver f779a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: androidx.appcompat.app.d$p$a */
        /* loaded from: classes.dex */
        public class C1530a extends BroadcastReceiver {
            C1530a() {
            }

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                AbstractC1529p.this.mo40816d();
            }
        }

        AbstractC1529p() {
        }

        /* renamed from: a */
        void m40820a() {
            BroadcastReceiver broadcastReceiver = this.f779a;
            if (broadcastReceiver != null) {
                try {
                    LayoutInflater$Factory2C1513d.this.f752o.unregisterReceiver(broadcastReceiver);
                } catch (IllegalArgumentException unused) {
                }
                this.f779a = null;
            }
        }

        /* renamed from: b */
        abstract IntentFilter mo40818b();

        /* renamed from: c */
        abstract int mo40817c();

        /* renamed from: d */
        abstract void mo40816d();

        /* renamed from: e */
        void m40819e() {
            m40820a();
            IntentFilter b = mo40818b();
            if (b != null && b.countActions() != 0) {
                if (this.f779a == null) {
                    this.f779a = new C1530a();
                }
                LayoutInflater$Factory2C1513d.this.f752o.registerReceiver(this.f779a, b);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.appcompat.app.d$q */
    /* loaded from: classes.dex */
    public class C1531q extends AbstractC1529p {

        /* renamed from: c */
        private final C1554p f782c;

        C1531q(C1554p pVar) {
            super();
            this.f782c = pVar;
        }

        @Override // androidx.appcompat.app.LayoutInflater$Factory2C1513d.AbstractC1529p
        /* renamed from: b */
        IntentFilter mo40818b() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.TIME_SET");
            intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
            intentFilter.addAction("android.intent.action.TIME_TICK");
            return intentFilter;
        }

        @Override // androidx.appcompat.app.LayoutInflater$Factory2C1513d.AbstractC1529p
        /* renamed from: c */
        public int mo40817c() {
            return this.f782c.m40760d() ? 2 : 1;
        }

        @Override // androidx.appcompat.app.LayoutInflater$Factory2C1513d.AbstractC1529p
        /* renamed from: d */
        public void mo40816d() {
            LayoutInflater$Factory2C1513d.this.m40894J();
        }
    }

    /* renamed from: androidx.appcompat.app.d$r */
    /* loaded from: classes.dex */
    private static class C1532r {
        /* renamed from: a */
        static void m40815a(ContextThemeWrapper contextThemeWrapper, Configuration configuration) {
            contextThemeWrapper.applyOverrideConfiguration(configuration);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.appcompat.app.d$s */
    /* loaded from: classes.dex */
    public class C1533s extends ContentFrameLayout {
        public C1533s(Context context) {
            super(context);
        }

        /* renamed from: b */
        private boolean m40814b(int i, int i2) {
            return i < -5 || i2 < -5 || i > getWidth() + 5 || i2 > getHeight() + 5;
        }

        @Override // android.view.ViewGroup, android.view.View
        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            if (LayoutInflater$Factory2C1513d.this.m40873X(keyEvent) || super.dispatchKeyEvent(keyEvent)) {
                return true;
            }
            return false;
        }

        @Override // android.view.ViewGroup
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (motionEvent.getAction() != 0 || !m40814b((int) motionEvent.getX(), (int) motionEvent.getY())) {
                return super.onInterceptTouchEvent(motionEvent);
            }
            LayoutInflater$Factory2C1513d.this.m40879R(0);
            return true;
        }

        @Override // android.view.View
        public void setBackgroundResource(int i) {
            setBackgroundDrawable(C6525a.m25364b(getContext(), i));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: androidx.appcompat.app.d$t */
    /* loaded from: classes.dex */
    public static final class C1534t {

        /* renamed from: a */
        int f785a;

        /* renamed from: b */
        int f786b;

        /* renamed from: c */
        int f787c;

        /* renamed from: d */
        int f788d;

        /* renamed from: e */
        int f789e;

        /* renamed from: f */
        int f790f;

        /* renamed from: g */
        ViewGroup f791g;

        /* renamed from: h */
        View f792h;

        /* renamed from: i */
        View f793i;

        /* renamed from: j */
        C1575e f794j;

        /* renamed from: k */
        C1572c f795k;

        /* renamed from: l */
        Context f796l;

        /* renamed from: m */
        boolean f797m;

        /* renamed from: n */
        boolean f798n;

        /* renamed from: o */
        boolean f799o;

        /* renamed from: p */
        public boolean f800p;

        /* renamed from: q */
        boolean f801q = false;

        /* renamed from: r */
        boolean f802r;

        /* renamed from: s */
        Bundle f803s;

        C1534t(int i) {
            this.f785a = i;
        }

        /* renamed from: a */
        AbstractC1586k m40813a(AbstractC1584j.AbstractC1585a aVar) {
            if (this.f794j == null) {
                return null;
            }
            if (this.f795k == null) {
                C1572c cVar = new C1572c(this.f796l, C6385g.f13206j);
                this.f795k = cVar;
                cVar.mo40579c(aVar);
                this.f794j.m40650b(this.f795k);
            }
            return this.f795k.m40680j(this.f791g);
        }

        /* renamed from: b */
        public boolean m40812b() {
            if (this.f792h == null) {
                return false;
            }
            if (this.f793i == null && this.f795k.m40681i().getCount() <= 0) {
                return false;
            }
            return true;
        }

        /* renamed from: c */
        void m40811c(C1575e eVar) {
            C1572c cVar;
            C1575e eVar2 = this.f794j;
            if (eVar != eVar2) {
                if (eVar2 != null) {
                    eVar2.m40663O(this.f795k);
                }
                this.f794j = eVar;
                if (eVar != null && (cVar = this.f795k) != null) {
                    eVar.m40650b(cVar);
                }
            }
        }

        /* renamed from: d */
        void m40810d(Context context) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme newTheme = context.getResources().newTheme();
            newTheme.setTo(context.getTheme());
            newTheme.resolveAttribute(C6379a.f13095a, typedValue, true);
            int i = typedValue.resourceId;
            if (i != 0) {
                newTheme.applyStyle(i, true);
            }
            newTheme.resolveAttribute(C6379a.f37740F, typedValue, true);
            int i2 = typedValue.resourceId;
            if (i2 != 0) {
                newTheme.applyStyle(i2, true);
            } else {
                newTheme.applyStyle(C6387i.f13232b, true);
            }
            C8096c cVar = new C8096c(context, 0);
            cVar.getTheme().setTo(newTheme);
            this.f796l = cVar;
            TypedArray obtainStyledAttributes = cVar.obtainStyledAttributes(C6388j.f13356y0);
            this.f786b = obtainStyledAttributes.getResourceId(C6388j.f37791B0, 0);
            this.f790f = obtainStyledAttributes.getResourceId(C6388j.f37786A0, 0);
            obtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.appcompat.app.d$u */
    /* loaded from: classes.dex */
    public final class C1535u implements AbstractC1584j.AbstractC1585a {
        C1535u() {
        }

        @Override // androidx.appcompat.view.menu.AbstractC1584j.AbstractC1585a
        /* renamed from: a */
        public void mo40291a(C1575e eVar, boolean z) {
            boolean z2;
            C1575e D = eVar.mo40569D();
            if (D != eVar) {
                z2 = true;
            } else {
                z2 = false;
            }
            LayoutInflater$Factory2C1513d dVar = LayoutInflater$Factory2C1513d.this;
            if (z2) {
                eVar = D;
            }
            C1534t c0 = dVar.m40868c0(eVar);
            if (c0 == null) {
                return;
            }
            if (z2) {
                LayoutInflater$Factory2C1513d.this.m40884O(c0.f785a, c0, D);
                LayoutInflater$Factory2C1513d.this.m40878S(c0, true);
                return;
            }
            LayoutInflater$Factory2C1513d.this.m40878S(c0, z);
        }

        @Override // androidx.appcompat.view.menu.AbstractC1584j.AbstractC1585a
        /* renamed from: b */
        public boolean mo40290b(C1575e eVar) {
            Window.Callback j0;
            if (eVar != eVar.mo40569D()) {
                return true;
            }
            LayoutInflater$Factory2C1513d dVar = LayoutInflater$Factory2C1513d.this;
            if (!dVar.f35135K || (j0 = dVar.m40858j0()) == null || LayoutInflater$Factory2C1513d.this.f35146V) {
                return true;
            }
            j0.onMenuOpened(108, eVar);
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public LayoutInflater$Factory2C1513d(Activity activity, AbstractC1512c cVar) {
        this(activity, null, cVar, activity);
    }

    /* renamed from: B0 */
    private void m40909B0(C1534t tVar, KeyEvent keyEvent) {
        int i;
        ViewGroup.LayoutParams layoutParams;
        boolean z;
        if (!tVar.f799o && !this.f35146V) {
            if (tVar.f785a == 0) {
                if ((this.f752o.getResources().getConfiguration().screenLayout & 15) == 4) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    return;
                }
            }
            Window.Callback j0 = m40858j0();
            if (j0 == null || j0.onMenuOpened(tVar.f785a, tVar.f794j)) {
                WindowManager windowManager = (WindowManager) this.f752o.getSystemService("window");
                if (windowManager != null && m40903E0(tVar, keyEvent)) {
                    ViewGroup viewGroup = tVar.f791g;
                    if (viewGroup == null || tVar.f801q) {
                        if (viewGroup == null) {
                            if (!m40852m0(tVar) || tVar.f791g == null) {
                                return;
                            }
                        } else if (tVar.f801q && viewGroup.getChildCount() > 0) {
                            tVar.f791g.removeAllViews();
                        }
                        if (!m40854l0(tVar) || !tVar.m40812b()) {
                            tVar.f801q = true;
                            return;
                        }
                        ViewGroup.LayoutParams layoutParams2 = tVar.f792h.getLayoutParams();
                        if (layoutParams2 == null) {
                            layoutParams2 = new ViewGroup.LayoutParams(-2, -2);
                        }
                        tVar.f791g.setBackgroundResource(tVar.f786b);
                        ViewParent parent = tVar.f792h.getParent();
                        if (parent instanceof ViewGroup) {
                            ((ViewGroup) parent).removeView(tVar.f792h);
                        }
                        tVar.f791g.addView(tVar.f792h, layoutParams2);
                        if (!tVar.f792h.hasFocus()) {
                            tVar.f792h.requestFocus();
                        }
                    } else {
                        View view = tVar.f793i;
                        if (!(view == null || (layoutParams = view.getLayoutParams()) == null || layoutParams.width != -1)) {
                            i = -1;
                            tVar.f798n = false;
                            WindowManager.LayoutParams layoutParams3 = new WindowManager.LayoutParams(i, -2, tVar.f788d, tVar.f789e, RNCWebViewManager.COMMAND_CLEAR_HISTORY, 8519680, -3);
                            layoutParams3.gravity = tVar.f787c;
                            layoutParams3.windowAnimations = tVar.f790f;
                            windowManager.addView(tVar.f791g, layoutParams3);
                            tVar.f799o = true;
                            return;
                        }
                    }
                    i = -2;
                    tVar.f798n = false;
                    WindowManager.LayoutParams layoutParams32 = new WindowManager.LayoutParams(i, -2, tVar.f788d, tVar.f789e, RNCWebViewManager.COMMAND_CLEAR_HISTORY, 8519680, -3);
                    layoutParams32.gravity = tVar.f787c;
                    layoutParams32.windowAnimations = tVar.f790f;
                    windowManager.addView(tVar.f791g, layoutParams32);
                    tVar.f799o = true;
                    return;
                }
                return;
            }
            m40878S(tVar, true);
        }
    }

    /* renamed from: D0 */
    private boolean m40905D0(C1534t tVar, int i, KeyEvent keyEvent, int i2) {
        C1575e eVar;
        boolean z = false;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((tVar.f797m || m40903E0(tVar, keyEvent)) && (eVar = tVar.f794j) != null) {
            z = eVar.performShortcut(i, keyEvent, i2);
        }
        if (z && (i2 & 1) == 0 && this.f759v == null) {
            m40878S(tVar, true);
        }
        return z;
    }

    /* renamed from: E0 */
    private boolean m40903E0(C1534t tVar, KeyEvent keyEvent) {
        boolean z;
        int i;
        boolean z2;
        AbstractC1688k0 k0Var;
        AbstractC1688k0 k0Var2;
        AbstractC1688k0 k0Var3;
        if (this.f35146V) {
            return false;
        }
        if (tVar.f797m) {
            return true;
        }
        C1534t tVar2 = this.f35142R;
        if (!(tVar2 == null || tVar2 == tVar)) {
            m40878S(tVar2, false);
        }
        Window.Callback j0 = m40858j0();
        if (j0 != null) {
            tVar.f793i = j0.onCreatePanelView(tVar.f785a);
        }
        int i2 = tVar.f785a;
        if (i2 == 0 || i2 == 108) {
            z = true;
        } else {
            z = false;
        }
        if (z && (k0Var3 = this.f759v) != null) {
            k0Var3.mo40136f();
        }
        if (tVar.f793i == null && (!z || !(m40907C0() instanceof C1547n))) {
            C1575e eVar = tVar.f794j;
            if (eVar == null || tVar.f802r) {
                if (eVar == null && (!m40850n0(tVar) || tVar.f794j == null)) {
                    return false;
                }
                if (z && this.f759v != null) {
                    if (this.f760w == null) {
                        this.f760w = new C1520h();
                    }
                    this.f759v.mo40138d(tVar.f794j, this.f760w);
                }
                tVar.f794j.m40645d0();
                if (!j0.onCreatePanelMenu(tVar.f785a, tVar.f794j)) {
                    tVar.m40811c(null);
                    if (z && (k0Var2 = this.f759v) != null) {
                        k0Var2.mo40138d(null, this.f760w);
                    }
                    return false;
                }
                tVar.f802r = false;
            }
            tVar.f794j.m40645d0();
            Bundle bundle = tVar.f803s;
            if (bundle != null) {
                tVar.f794j.m40662P(bundle);
                tVar.f803s = null;
            }
            if (!j0.onPreparePanel(0, tVar.f793i, tVar.f794j)) {
                if (z && (k0Var = this.f759v) != null) {
                    k0Var.mo40138d(null, this.f760w);
                }
                tVar.f794j.m40647c0();
                return false;
            }
            if (keyEvent != null) {
                i = keyEvent.getDeviceId();
            } else {
                i = -1;
            }
            if (KeyCharacterMap.load(i).getKeyboardType() != 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            tVar.f800p = z2;
            tVar.f794j.setQwertyMode(z2);
            tVar.f794j.m40647c0();
        }
        tVar.f797m = true;
        tVar.f798n = false;
        this.f35142R = tVar;
        return true;
    }

    /* renamed from: F0 */
    private void m40901F0(boolean z) {
        AbstractC1688k0 k0Var = this.f759v;
        if (k0Var == null || !k0Var.mo40141a() || (ViewConfiguration.get(this.f752o).hasPermanentMenuKey() && !this.f759v.mo40135g())) {
            C1534t h0 = m40861h0(0, true);
            h0.f801q = true;
            m40878S(h0, false);
            m40909B0(h0, null);
            return;
        }
        Window.Callback j0 = m40858j0();
        if (this.f759v.mo40137e() && z) {
            this.f759v.mo40140b();
            if (!this.f35146V) {
                j0.onPanelClosed(108, m40861h0(0, true).f794j);
            }
        } else if (j0 != null && !this.f35146V) {
            if (this.f743d0 && (this.f744e0 & 1) != 0) {
                this.f753p.getDecorView().removeCallbacks(this.f745f0);
                this.f745f0.run();
            }
            C1534t h02 = m40861h0(0, true);
            C1575e eVar = h02.f794j;
            if (eVar != null && !h02.f802r && j0.onPreparePanel(0, h02.f793i, eVar)) {
                j0.onMenuOpened(108, h02.f794j);
                this.f759v.mo40139c();
            }
        }
    }

    /* renamed from: G0 */
    private int m40899G0(int i) {
        if (i == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            return 108;
        } else if (i != 9) {
            return i;
        } else {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
            return 109;
        }
    }

    /* renamed from: I0 */
    private boolean m40895I0(ViewParent viewParent) {
        if (viewParent == null) {
            return false;
        }
        View decorView = this.f753p.getDecorView();
        while (viewParent != null) {
            if (viewParent == decorView || !(viewParent instanceof View) || C2733w0.m37030T((View) viewParent)) {
                return false;
            }
            viewParent = viewParent.getParent();
        }
        return true;
    }

    /* renamed from: K */
    private boolean m40892K(boolean z) {
        if (this.f35146V) {
            return false;
        }
        int N = m40886N();
        boolean M0 = m40887M0(m40842r0(this.f752o, N), z);
        if (N == 0) {
            m40862g0(this.f752o).m40819e();
        } else {
            AbstractC1529p pVar = this.f741b0;
            if (pVar != null) {
                pVar.m40820a();
            }
        }
        if (N == 3) {
            m40863f0(this.f752o).m40819e();
        } else {
            AbstractC1529p pVar2 = this.f742c0;
            if (pVar2 != null) {
                pVar2.m40820a();
            }
        }
        return M0;
    }

    /* renamed from: K0 */
    private void m40891K0() {
        if (this.f35129E) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    /* renamed from: L */
    private void m40890L() {
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) this.f35130F.findViewById(16908290);
        View decorView = this.f753p.getDecorView();
        contentFrameLayout.m40437a(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        TypedArray obtainStyledAttributes = this.f752o.obtainStyledAttributes(C6388j.f13356y0);
        obtainStyledAttributes.getValue(C6388j.f37836K0, contentFrameLayout.getMinWidthMajor());
        obtainStyledAttributes.getValue(C6388j.f37841L0, contentFrameLayout.getMinWidthMinor());
        int i = C6388j.f37826I0;
        if (obtainStyledAttributes.hasValue(i)) {
            obtainStyledAttributes.getValue(i, contentFrameLayout.getFixedWidthMajor());
        }
        int i2 = C6388j.f37831J0;
        if (obtainStyledAttributes.hasValue(i2)) {
            obtainStyledAttributes.getValue(i2, contentFrameLayout.getFixedWidthMinor());
        }
        int i3 = C6388j.f37816G0;
        if (obtainStyledAttributes.hasValue(i3)) {
            obtainStyledAttributes.getValue(i3, contentFrameLayout.getFixedHeightMajor());
        }
        int i4 = C6388j.f37821H0;
        if (obtainStyledAttributes.hasValue(i4)) {
            obtainStyledAttributes.getValue(i4, contentFrameLayout.getFixedHeightMinor());
        }
        obtainStyledAttributes.recycle();
        contentFrameLayout.requestLayout();
    }

    /* renamed from: L0 */
    private ActivityC1510b m40889L0() {
        for (Context context = this.f752o; context != null; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof ActivityC1510b) {
                return (ActivityC1510b) context;
            }
            if (!(context instanceof ContextWrapper)) {
                break;
            }
        }
        return null;
    }

    /* renamed from: M */
    private void m40888M(Window window) {
        if (this.f753p == null) {
            Window.Callback callback = window.getCallback();
            if (!(callback instanceof C1527n)) {
                C1527n nVar = new C1527n(callback);
                this.f754q = nVar;
                window.setCallback(nVar);
                C1698n1 u = C1698n1.m40106u(this.f752o, null, f737n0);
                Drawable h = u.m40119h(0);
                if (h != null) {
                    window.setBackgroundDrawable(h);
                }
                u.m40104w();
                this.f753p = window;
                return;
            }
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        throw new IllegalStateException("AppCompat has already installed itself into the Window");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0057  */
    /* renamed from: M0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean m40887M0(int r7, boolean r8) {
        /*
            r6 = this;
            android.content.Context r0 = r6.f752o
            r1 = 0
            android.content.res.Configuration r0 = r6.m40877T(r0, r7, r1)
            boolean r2 = r6.m40846p0()
            android.content.res.Configuration r3 = r6.f35147W
            if (r3 != 0) goto L_0x0019
            android.content.Context r3 = r6.f752o
            android.content.res.Resources r3 = r3.getResources()
            android.content.res.Configuration r3 = r3.getConfiguration()
        L_0x0019:
            int r3 = r3.uiMode
            r3 = r3 & 48
            int r0 = r0.uiMode
            r0 = r0 & 48
            r4 = 1
            if (r3 == r0) goto L_0x004b
            if (r8 == 0) goto L_0x004b
            if (r2 != 0) goto L_0x004b
            boolean r8 = r6.f35144T
            if (r8 == 0) goto L_0x004b
            boolean r8 = androidx.appcompat.app.LayoutInflater$Factory2C1513d.f738o0
            if (r8 != 0) goto L_0x0034
            boolean r8 = r6.f35145U
            if (r8 == 0) goto L_0x004b
        L_0x0034:
            java.lang.Object r8 = r6.f751n
            boolean r5 = r8 instanceof android.app.Activity
            if (r5 == 0) goto L_0x004b
            android.app.Activity r8 = (android.app.Activity) r8
            boolean r8 = r8.isChild()
            if (r8 != 0) goto L_0x004b
            java.lang.Object r8 = r6.f751n
            android.app.Activity r8 = (android.app.Activity) r8
            androidx.core.app.C2198b.m38331r(r8)
            r8 = r4
            goto L_0x004c
        L_0x004b:
            r8 = 0
        L_0x004c:
            if (r8 != 0) goto L_0x0054
            if (r3 == r0) goto L_0x0054
            r6.m40885N0(r0, r2, r1)
            goto L_0x0055
        L_0x0054:
            r4 = r8
        L_0x0055:
            if (r4 == 0) goto L_0x0062
            java.lang.Object r8 = r6.f751n
            boolean r0 = r8 instanceof androidx.appcompat.app.ActivityC1510b
            if (r0 == 0) goto L_0x0062
            androidx.appcompat.app.b r8 = (androidx.appcompat.app.ActivityC1510b) r8
            r8.onNightModeChanged(r7)
        L_0x0062:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.LayoutInflater$Factory2C1513d.m40887M0(int, boolean):boolean");
    }

    /* renamed from: N */
    private int m40886N() {
        int i = this.f35148X;
        return i != -100 ? i : AppCompatDelegate.m40921j();
    }

    /* renamed from: N0 */
    private void m40885N0(int i, boolean z, Configuration configuration) {
        Resources resources = this.f752o.getResources();
        Configuration configuration2 = new Configuration(resources.getConfiguration());
        if (configuration != null) {
            configuration2.updateFrom(configuration);
        }
        configuration2.uiMode = i | (resources.getConfiguration().uiMode & (-49));
        resources.updateConfiguration(configuration2, null);
        if (Build.VERSION.SDK_INT < 26) {
            C1546m.m40778a(resources);
        }
        int i2 = this.f35149Y;
        if (i2 != 0) {
            this.f752o.setTheme(i2);
            this.f752o.getTheme().applyStyle(this.f35149Y, true);
        }
        if (z) {
            Object obj = this.f751n;
            if (obj instanceof Activity) {
                Activity activity = (Activity) obj;
                if (activity instanceof LifecycleOwner) {
                    if (((LifecycleOwner) activity).getLifecycle().mo35843b().m35851a(Lifecycle.State.CREATED)) {
                        activity.onConfigurationChanged(configuration2);
                    }
                } else if (this.f35145U && !this.f35146V) {
                    activity.onConfigurationChanged(configuration2);
                }
            }
        }
    }

    /* renamed from: P0 */
    private void m40881P0(View view) {
        boolean z;
        int i;
        if ((C2733w0.m37041M(view) & 8192) != 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            i = C2337a.m38135c(this.f752o, C6381c.f13123b);
        } else {
            i = C2337a.m38135c(this.f752o, C6381c.f13122a);
        }
        view.setBackgroundColor(i);
    }

    /* renamed from: Q */
    private void m40880Q() {
        AbstractC1529p pVar = this.f741b0;
        if (pVar != null) {
            pVar.m40820a();
        }
        AbstractC1529p pVar2 = this.f742c0;
        if (pVar2 != null) {
            pVar2.m40820a();
        }
    }

    /* renamed from: T */
    private Configuration m40877T(Context context, int i, Configuration configuration) {
        int i2;
        if (i == 1) {
            i2 = 16;
        } else if (i != 2) {
            i2 = context.getApplicationContext().getResources().getConfiguration().uiMode & 48;
        } else {
            i2 = 32;
        }
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i2 | (configuration2.uiMode & (-49));
        return configuration2;
    }

    /* renamed from: U */
    private ViewGroup m40876U() {
        ViewGroup viewGroup;
        Context context;
        TypedArray obtainStyledAttributes = this.f752o.obtainStyledAttributes(C6388j.f13356y0);
        int i = C6388j.f37801D0;
        if (obtainStyledAttributes.hasValue(i)) {
            if (obtainStyledAttributes.getBoolean(C6388j.f37846M0, false)) {
                mo40911A(1);
            } else if (obtainStyledAttributes.getBoolean(i, false)) {
                mo40911A(108);
            }
            if (obtainStyledAttributes.getBoolean(C6388j.f37806E0, false)) {
                mo40911A(109);
            }
            if (obtainStyledAttributes.getBoolean(C6388j.f37811F0, false)) {
                mo40911A(10);
            }
            this.f35138N = obtainStyledAttributes.getBoolean(C6388j.f13361z0, false);
            obtainStyledAttributes.recycle();
            m40869b0();
            this.f753p.getDecorView();
            LayoutInflater from = LayoutInflater.from(this.f752o);
            if (this.f35139O) {
                viewGroup = this.f35137M ? (ViewGroup) from.inflate(C6385g.f13211o, (ViewGroup) null) : (ViewGroup) from.inflate(C6385g.f13210n, (ViewGroup) null);
            } else if (this.f35138N) {
                viewGroup = (ViewGroup) from.inflate(C6385g.f13202f, (ViewGroup) null);
                this.f35136L = false;
                this.f35135K = false;
            } else if (this.f35135K) {
                TypedValue typedValue = new TypedValue();
                this.f752o.getTheme().resolveAttribute(C6379a.f13100f, typedValue, true);
                if (typedValue.resourceId != 0) {
                    context = new C8096c(this.f752o, typedValue.resourceId);
                } else {
                    context = this.f752o;
                }
                viewGroup = (ViewGroup) LayoutInflater.from(context).inflate(C6385g.f13212p, (ViewGroup) null);
                AbstractC1688k0 k0Var = (AbstractC1688k0) viewGroup.findViewById(C6384f.f13186p);
                this.f759v = k0Var;
                k0Var.setWindowCallback(m40858j0());
                if (this.f35136L) {
                    this.f759v.mo40134h(109);
                }
                if (this.f35133I) {
                    this.f759v.mo40134h(2);
                }
                if (this.f35134J) {
                    this.f759v.mo40134h(5);
                }
            } else {
                viewGroup = null;
            }
            if (viewGroup != null) {
                C2733w0.m37058D0(viewGroup, new C1515b());
                if (this.f759v == null) {
                    this.f35131G = (TextView) viewGroup.findViewById(C6384f.f37781M);
                }
                C1735v1.m39980c(viewGroup);
                ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(C6384f.f13172b);
                ViewGroup viewGroup2 = (ViewGroup) this.f753p.findViewById(16908290);
                if (viewGroup2 != null) {
                    while (viewGroup2.getChildCount() > 0) {
                        View childAt = viewGroup2.getChildAt(0);
                        viewGroup2.removeViewAt(0);
                        contentFrameLayout.addView(childAt);
                    }
                    viewGroup2.setId(-1);
                    contentFrameLayout.setId(16908290);
                    if (viewGroup2 instanceof FrameLayout) {
                        ((FrameLayout) viewGroup2).setForeground(null);
                    }
                }
                this.f753p.setContentView(viewGroup);
                contentFrameLayout.setAttachListener(new C1516c());
                return viewGroup;
            }
            throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.f35135K + ", windowActionBarOverlay: " + this.f35136L + ", android:windowIsFloating: " + this.f35138N + ", windowActionModeOverlay: " + this.f35137M + ", windowNoTitle: " + this.f35139O + " }");
        }
        obtainStyledAttributes.recycle();
        throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
    }

    /* renamed from: a0 */
    private void m40870a0() {
        if (!this.f35129E) {
            this.f35130F = m40876U();
            CharSequence i0 = m40859i0();
            if (!TextUtils.isEmpty(i0)) {
                AbstractC1688k0 k0Var = this.f759v;
                if (k0Var != null) {
                    k0Var.setWindowTitle(i0);
                } else if (m40907C0() != null) {
                    m40907C0().mo40729x(i0);
                } else {
                    TextView textView = this.f35131G;
                    if (textView != null) {
                        textView.setText(i0);
                    }
                }
            }
            m40890L();
            m40910A0(this.f35130F);
            this.f35129E = true;
            C1534t h0 = m40861h0(0, false);
            if (this.f35146V) {
                return;
            }
            if (h0 == null || h0.f794j == null) {
                m40848o0(108);
            }
        }
    }

    /* renamed from: b0 */
    private void m40869b0() {
        if (this.f753p == null) {
            Object obj = this.f751n;
            if (obj instanceof Activity) {
                m40888M(((Activity) obj).getWindow());
            }
        }
        if (this.f753p == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    /* renamed from: d0 */
    private static Configuration m40866d0(Configuration configuration, Configuration configuration2) {
        Configuration configuration3 = new Configuration();
        configuration3.fontScale = 0.0f;
        if (!(configuration2 == null || configuration.diff(configuration2) == 0)) {
            float f = configuration.fontScale;
            float f2 = configuration2.fontScale;
            if (f != f2) {
                configuration3.fontScale = f2;
            }
            int i = configuration.mcc;
            int i2 = configuration2.mcc;
            if (i != i2) {
                configuration3.mcc = i2;
            }
            int i3 = configuration.mnc;
            int i4 = configuration2.mnc;
            if (i3 != i4) {
                configuration3.mnc = i4;
            }
            int i5 = Build.VERSION.SDK_INT;
            if (i5 >= 24) {
                C1525l.m40824a(configuration, configuration2, configuration3);
            } else if (!C2513d.m37601a(configuration.locale, configuration2.locale)) {
                configuration3.locale = configuration2.locale;
            }
            int i6 = configuration.touchscreen;
            int i7 = configuration2.touchscreen;
            if (i6 != i7) {
                configuration3.touchscreen = i7;
            }
            int i8 = configuration.keyboard;
            int i9 = configuration2.keyboard;
            if (i8 != i9) {
                configuration3.keyboard = i9;
            }
            int i10 = configuration.keyboardHidden;
            int i11 = configuration2.keyboardHidden;
            if (i10 != i11) {
                configuration3.keyboardHidden = i11;
            }
            int i12 = configuration.navigation;
            int i13 = configuration2.navigation;
            if (i12 != i13) {
                configuration3.navigation = i13;
            }
            int i14 = configuration.navigationHidden;
            int i15 = configuration2.navigationHidden;
            if (i14 != i15) {
                configuration3.navigationHidden = i15;
            }
            int i16 = configuration.orientation;
            int i17 = configuration2.orientation;
            if (i16 != i17) {
                configuration3.orientation = i17;
            }
            int i18 = configuration.screenLayout & 15;
            int i19 = configuration2.screenLayout;
            if (i18 != (i19 & 15)) {
                configuration3.screenLayout |= i19 & 15;
            }
            int i20 = configuration.screenLayout & 192;
            int i21 = configuration2.screenLayout;
            if (i20 != (i21 & 192)) {
                configuration3.screenLayout |= i21 & 192;
            }
            int i22 = configuration.screenLayout & 48;
            int i23 = configuration2.screenLayout;
            if (i22 != (i23 & 48)) {
                configuration3.screenLayout |= i23 & 48;
            }
            int i24 = configuration.screenLayout & 768;
            int i25 = configuration2.screenLayout;
            if (i24 != (i25 & 768)) {
                configuration3.screenLayout |= i25 & 768;
            }
            if (i5 >= 26) {
                C1526m.m40823a(configuration, configuration2, configuration3);
            }
            int i26 = configuration.uiMode & 15;
            int i27 = configuration2.uiMode;
            if (i26 != (i27 & 15)) {
                configuration3.uiMode |= i27 & 15;
            }
            int i28 = configuration.uiMode & 48;
            int i29 = configuration2.uiMode;
            if (i28 != (i29 & 48)) {
                configuration3.uiMode |= i29 & 48;
            }
            int i30 = configuration.screenWidthDp;
            int i31 = configuration2.screenWidthDp;
            if (i30 != i31) {
                configuration3.screenWidthDp = i31;
            }
            int i32 = configuration.screenHeightDp;
            int i33 = configuration2.screenHeightDp;
            if (i32 != i33) {
                configuration3.screenHeightDp = i33;
            }
            int i34 = configuration.smallestScreenWidthDp;
            int i35 = configuration2.smallestScreenWidthDp;
            if (i34 != i35) {
                configuration3.smallestScreenWidthDp = i35;
            }
            C1523j.m40826b(configuration, configuration2, configuration3);
        }
        return configuration3;
    }

    /* renamed from: f0 */
    private AbstractC1529p m40863f0(Context context) {
        if (this.f742c0 == null) {
            this.f742c0 = new C1528o(context);
        }
        return this.f742c0;
    }

    /* renamed from: g0 */
    private AbstractC1529p m40862g0(Context context) {
        if (this.f741b0 == null) {
            this.f741b0 = new C1531q(C1554p.m40763a(context));
        }
        return this.f741b0;
    }

    /* renamed from: k0 */
    private void m40856k0() {
        m40870a0();
        if (this.f35135K && this.f756s == null) {
            Object obj = this.f751n;
            if (obj instanceof Activity) {
                this.f756s = new C1556q((Activity) this.f751n, this.f35136L);
            } else if (obj instanceof Dialog) {
                this.f756s = new C1556q((Dialog) this.f751n);
            }
            ActionBar actionBar = this.f756s;
            if (actionBar != null) {
                actionBar.mo40735r(this.f746g0);
            }
        }
    }

    /* renamed from: l0 */
    private boolean m40854l0(C1534t tVar) {
        View view = tVar.f793i;
        if (view != null) {
            tVar.f792h = view;
            return true;
        } else if (tVar.f794j == null) {
            return false;
        } else {
            if (this.f761x == null) {
                this.f761x = new C1535u();
            }
            View view2 = (View) tVar.m40813a(this.f761x);
            tVar.f792h = view2;
            if (view2 != null) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: m0 */
    private boolean m40852m0(C1534t tVar) {
        tVar.m40810d(m40865e0());
        tVar.f791g = new C1533s(tVar.f796l);
        tVar.f787c = 81;
        return true;
    }

    /* renamed from: n0 */
    private boolean m40850n0(C1534t tVar) {
        Resources.Theme theme;
        Context context = this.f752o;
        int i = tVar.f785a;
        if ((i == 0 || i == 108) && this.f759v != null) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme theme2 = context.getTheme();
            theme2.resolveAttribute(C6379a.f13100f, typedValue, true);
            if (typedValue.resourceId != 0) {
                theme = context.getResources().newTheme();
                theme.setTo(theme2);
                theme.applyStyle(typedValue.resourceId, true);
                theme.resolveAttribute(C6379a.f13101g, typedValue, true);
            } else {
                theme2.resolveAttribute(C6379a.f13101g, typedValue, true);
                theme = null;
            }
            if (typedValue.resourceId != 0) {
                if (theme == null) {
                    theme = context.getResources().newTheme();
                    theme.setTo(theme2);
                }
                theme.applyStyle(typedValue.resourceId, true);
            }
            if (theme != null) {
                C8096c cVar = new C8096c(context, 0);
                cVar.getTheme().setTo(theme);
                context = cVar;
            }
        }
        C1575e eVar = new C1575e(context);
        eVar.mo40565R(this);
        tVar.m40811c(eVar);
        return true;
    }

    /* renamed from: o0 */
    private void m40848o0(int i) {
        this.f744e0 = (1 << i) | this.f744e0;
        if (!this.f743d0) {
            C2733w0.m37006i0(this.f753p.getDecorView(), this.f745f0);
            this.f743d0 = true;
        }
    }

    /* renamed from: p0 */
    private boolean m40846p0() {
        int i;
        boolean z;
        if (!this.f740a0 && (this.f751n instanceof Activity)) {
            PackageManager packageManager = this.f752o.getPackageManager();
            if (packageManager == null) {
                return false;
            }
            try {
                int i2 = Build.VERSION.SDK_INT;
                if (i2 >= 29) {
                    i = 269221888;
                } else if (i2 >= 24) {
                    i = 786432;
                } else {
                    i = 0;
                }
                ActivityInfo activityInfo = packageManager.getActivityInfo(new ComponentName(this.f752o, this.f751n.getClass()), i);
                if (activityInfo == null || (activityInfo.configChanges & 512) == 0) {
                    z = false;
                } else {
                    z = true;
                }
                this.f35150Z = z;
            } catch (PackageManager.NameNotFoundException e) {
                Log.d("AppCompatDelegate", "Exception while getting ActivityInfo", e);
                this.f35150Z = false;
            }
        }
        this.f740a0 = true;
        return this.f35150Z;
    }

    /* renamed from: u0 */
    private boolean m40836u0(int i, KeyEvent keyEvent) {
        if (keyEvent.getRepeatCount() != 0) {
            return false;
        }
        C1534t h0 = m40861h0(i, true);
        if (!h0.f799o) {
            return m40903E0(h0, keyEvent);
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x006a  */
    /* renamed from: x0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean m40830x0(int r5, android.view.KeyEvent r6) {
        /*
            r4 = this;
            androidx.appcompat.view.ActionMode r0 = r4.f762y
            r1 = 0
            if (r0 == 0) goto L_0x0006
            return r1
        L_0x0006:
            r0 = 1
            androidx.appcompat.app.d$t r2 = r4.m40861h0(r5, r0)
            if (r5 != 0) goto L_0x0043
            androidx.appcompat.widget.k0 r5 = r4.f759v
            if (r5 == 0) goto L_0x0043
            boolean r5 = r5.mo40141a()
            if (r5 == 0) goto L_0x0043
            android.content.Context r5 = r4.f752o
            android.view.ViewConfiguration r5 = android.view.ViewConfiguration.get(r5)
            boolean r5 = r5.hasPermanentMenuKey()
            if (r5 != 0) goto L_0x0043
            androidx.appcompat.widget.k0 r5 = r4.f759v
            boolean r5 = r5.mo40137e()
            if (r5 != 0) goto L_0x003c
            boolean r5 = r4.f35146V
            if (r5 != 0) goto L_0x0062
            boolean r5 = r4.m40903E0(r2, r6)
            if (r5 == 0) goto L_0x0062
            androidx.appcompat.widget.k0 r5 = r4.f759v
            boolean r0 = r5.mo40139c()
            goto L_0x0068
        L_0x003c:
            androidx.appcompat.widget.k0 r5 = r4.f759v
            boolean r0 = r5.mo40140b()
            goto L_0x0068
        L_0x0043:
            boolean r5 = r2.f799o
            if (r5 != 0) goto L_0x0064
            boolean r3 = r2.f798n
            if (r3 == 0) goto L_0x004c
            goto L_0x0064
        L_0x004c:
            boolean r5 = r2.f797m
            if (r5 == 0) goto L_0x0062
            boolean r5 = r2.f802r
            if (r5 == 0) goto L_0x005b
            r2.f797m = r1
            boolean r5 = r4.m40903E0(r2, r6)
            goto L_0x005c
        L_0x005b:
            r5 = r0
        L_0x005c:
            if (r5 == 0) goto L_0x0062
            r4.m40909B0(r2, r6)
            goto L_0x0068
        L_0x0062:
            r0 = r1
            goto L_0x0068
        L_0x0064:
            r4.m40878S(r2, r0)
            r0 = r5
        L_0x0068:
            if (r0 == 0) goto L_0x0085
            android.content.Context r5 = r4.f752o
            android.content.Context r5 = r5.getApplicationContext()
            java.lang.String r6 = "audio"
            java.lang.Object r5 = r5.getSystemService(r6)
            android.media.AudioManager r5 = (android.media.AudioManager) r5
            if (r5 == 0) goto L_0x007e
            r5.playSoundEffect(r1)
            goto L_0x0085
        L_0x007e:
            java.lang.String r5 = "AppCompatDelegate"
            java.lang.String r6 = "Couldn't get audio manager"
            android.util.Log.w(r5, r6)
        L_0x0085:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.LayoutInflater$Factory2C1513d.m40830x0(int, android.view.KeyEvent):boolean");
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    /* renamed from: A */
    public boolean mo40911A(int i) {
        int G0 = m40899G0(i);
        if (this.f35139O && G0 == 108) {
            return false;
        }
        if (this.f35135K && G0 == 1) {
            this.f35135K = false;
        }
        if (G0 == 1) {
            m40891K0();
            this.f35139O = true;
            return true;
        } else if (G0 == 2) {
            m40891K0();
            this.f35133I = true;
            return true;
        } else if (G0 == 5) {
            m40891K0();
            this.f35134J = true;
            return true;
        } else if (G0 == 10) {
            m40891K0();
            this.f35137M = true;
            return true;
        } else if (G0 == 108) {
            m40891K0();
            this.f35135K = true;
            return true;
        } else if (G0 != 109) {
            return this.f753p.requestFeature(G0);
        } else {
            m40891K0();
            this.f35136L = true;
            return true;
        }
    }

    /* renamed from: A0 */
    void m40910A0(ViewGroup viewGroup) {
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    /* renamed from: C */
    public void mo40908C(int i) {
        m40870a0();
        ViewGroup viewGroup = (ViewGroup) this.f35130F.findViewById(16908290);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.f752o).inflate(i, viewGroup);
        this.f754q.m20591a().onContentChanged();
    }

    /* renamed from: C0 */
    final ActionBar m40907C0() {
        return this.f756s;
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    /* renamed from: D */
    public void mo40906D(View view) {
        m40870a0();
        ViewGroup viewGroup = (ViewGroup) this.f35130F.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.f754q.m20591a().onContentChanged();
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    /* renamed from: E */
    public void mo40904E(View view, ViewGroup.LayoutParams layoutParams) {
        m40870a0();
        ViewGroup viewGroup = (ViewGroup) this.f35130F.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.f754q.m20591a().onContentChanged();
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    /* renamed from: F */
    public void mo40902F(Toolbar toolbar) {
        if (this.f751n instanceof Activity) {
            ActionBar n = mo40851n();
            if (!(n instanceof C1556q)) {
                this.f757t = null;
                if (n != null) {
                    n.mo40770n();
                }
                this.f756s = null;
                if (toolbar != null) {
                    C1547n nVar = new C1547n(toolbar, m40859i0(), this.f754q);
                    this.f756s = nVar;
                    this.f754q.m40822b(nVar.f831c);
                } else {
                    this.f754q.m40822b(null);
                }
                mo40847p();
                return;
            }
            throw new IllegalStateException("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
        }
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    /* renamed from: G */
    public void mo40900G(int i) {
        this.f35149Y = i;
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    /* renamed from: H */
    public final void mo40898H(CharSequence charSequence) {
        this.f758u = charSequence;
        AbstractC1688k0 k0Var = this.f759v;
        if (k0Var != null) {
            k0Var.setWindowTitle(charSequence);
        } else if (m40907C0() != null) {
            m40907C0().mo40729x(charSequence);
        } else {
            TextView textView = this.f35131G;
            if (textView != null) {
                textView.setText(charSequence);
            }
        }
    }

    /* renamed from: H0 */
    final boolean m40897H0() {
        ViewGroup viewGroup;
        return this.f35129E && (viewGroup = this.f35130F) != null && C2733w0.m37029U(viewGroup);
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    /* renamed from: I */
    public androidx.appcompat.view.ActionMode mo40896I(ActionMode.Callback callback) {
        AbstractC1512c cVar;
        if (callback != null) {
            androidx.appcompat.view.ActionMode actionMode = this.f762y;
            if (actionMode != null) {
                actionMode.mo40722c();
            }
            C1521i iVar = new C1521i(callback);
            ActionBar n = mo40851n();
            if (n != null) {
                androidx.appcompat.view.ActionMode y = n.mo40728y(iVar);
                this.f762y = y;
                if (!(y == null || (cVar = this.f755r) == null)) {
                    cVar.onSupportActionModeStarted(y);
                }
            }
            if (this.f762y == null) {
                this.f762y = m40893J0(iVar);
            }
            return this.f762y;
        }
        throw new IllegalArgumentException("ActionMode callback can not be null.");
    }

    /* renamed from: J */
    public boolean m40894J() {
        return m40892K(true);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0029  */
    /* renamed from: J0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    androidx.appcompat.view.ActionMode m40893J0(androidx.appcompat.view.ActionMode.Callback r8) {
        /*
            Method dump skipped, instructions count: 361
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.LayoutInflater$Factory2C1513d.m40893J0(androidx.appcompat.view.ActionMode$Callback):androidx.appcompat.view.ActionMode");
    }

    /* renamed from: O */
    void m40884O(int i, C1534t tVar, Menu menu) {
        if (menu == null) {
            if (tVar == null && i >= 0) {
                C1534t[] tVarArr = this.f35141Q;
                if (i < tVarArr.length) {
                    tVar = tVarArr[i];
                }
            }
            if (tVar != null) {
                menu = tVar.f794j;
            }
        }
        if ((tVar == null || tVar.f799o) && !this.f35146V) {
            this.f754q.m20591a().onPanelClosed(i, menu);
        }
    }

    /* renamed from: O0 */
    final int m40883O0(WindowInsetsCompat windowInsetsCompat, Rect rect) {
        int i;
        boolean z;
        int i2;
        int i3;
        boolean z2;
        int i4 = 0;
        if (windowInsetsCompat != null) {
            i = windowInsetsCompat.m37512o();
        } else if (rect != null) {
            i = rect.top;
        } else {
            i = 0;
        }
        ActionBarContextView actionBarContextView = this.f763z;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            z = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f763z.getLayoutParams();
            boolean z3 = true;
            if (this.f763z.isShown()) {
                if (this.f747h0 == null) {
                    this.f747h0 = new Rect();
                    this.f748i0 = new Rect();
                }
                Rect rect2 = this.f747h0;
                Rect rect3 = this.f748i0;
                if (windowInsetsCompat == null) {
                    rect2.set(rect);
                } else {
                    rect2.set(windowInsetsCompat.m37514m(), windowInsetsCompat.m37512o(), windowInsetsCompat.m37513n(), windowInsetsCompat.m37515l());
                }
                C1735v1.m39982a(this.f35130F, rect2, rect3);
                int i5 = rect2.top;
                int i6 = rect2.left;
                int i7 = rect2.right;
                WindowInsetsCompat I = C2733w0.m37049I(this.f35130F);
                if (I == null) {
                    i2 = 0;
                } else {
                    i2 = I.m37514m();
                }
                if (I == null) {
                    i3 = 0;
                } else {
                    i3 = I.m37513n();
                }
                if (marginLayoutParams.topMargin == i5 && marginLayoutParams.leftMargin == i6 && marginLayoutParams.rightMargin == i7) {
                    z2 = false;
                } else {
                    marginLayoutParams.topMargin = i5;
                    marginLayoutParams.leftMargin = i6;
                    marginLayoutParams.rightMargin = i7;
                    z2 = true;
                }
                if (i5 <= 0 || this.f35132H != null) {
                    View view = this.f35132H;
                    if (view != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                        int i8 = marginLayoutParams2.height;
                        int i9 = marginLayoutParams.topMargin;
                        if (!(i8 == i9 && marginLayoutParams2.leftMargin == i2 && marginLayoutParams2.rightMargin == i3)) {
                            marginLayoutParams2.height = i9;
                            marginLayoutParams2.leftMargin = i2;
                            marginLayoutParams2.rightMargin = i3;
                            this.f35132H.setLayoutParams(marginLayoutParams2);
                        }
                    }
                } else {
                    View view2 = new View(this.f752o);
                    this.f35132H = view2;
                    view2.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                    layoutParams.leftMargin = i2;
                    layoutParams.rightMargin = i3;
                    this.f35130F.addView(this.f35132H, -1, layoutParams);
                }
                View view3 = this.f35132H;
                if (view3 == null) {
                    z3 = false;
                }
                if (z3 && view3.getVisibility() != 0) {
                    m40881P0(this.f35132H);
                }
                if (!this.f35137M && z3) {
                    i = 0;
                }
                z = z3;
                z3 = z2;
            } else if (marginLayoutParams.topMargin != 0) {
                marginLayoutParams.topMargin = 0;
                z = false;
            } else {
                z = false;
                z3 = false;
            }
            if (z3) {
                this.f763z.setLayoutParams(marginLayoutParams);
            }
        }
        View view4 = this.f35132H;
        if (view4 != null) {
            if (!z) {
                i4 = 8;
            }
            view4.setVisibility(i4);
        }
        return i;
    }

    /* renamed from: P */
    void m40882P(C1575e eVar) {
        if (!this.f35140P) {
            this.f35140P = true;
            this.f759v.mo40133i();
            Window.Callback j0 = m40858j0();
            if (j0 != null && !this.f35146V) {
                j0.onPanelClosed(108, eVar);
            }
            this.f35140P = false;
        }
    }

    /* renamed from: R */
    void m40879R(int i) {
        m40878S(m40861h0(i, true), true);
    }

    /* renamed from: S */
    void m40878S(C1534t tVar, boolean z) {
        ViewGroup viewGroup;
        AbstractC1688k0 k0Var;
        if (!z || tVar.f785a != 0 || (k0Var = this.f759v) == null || !k0Var.mo40137e()) {
            WindowManager windowManager = (WindowManager) this.f752o.getSystemService("window");
            if (!(windowManager == null || !tVar.f799o || (viewGroup = tVar.f791g) == null)) {
                windowManager.removeView(viewGroup);
                if (z) {
                    m40884O(tVar.f785a, tVar, null);
                }
            }
            tVar.f797m = false;
            tVar.f798n = false;
            tVar.f799o = false;
            tVar.f792h = null;
            tVar.f801q = true;
            if (this.f35142R == tVar) {
                this.f35142R = null;
                return;
            }
            return;
        }
        m40882P(tVar.f794j);
    }

    /* renamed from: V */
    public View m40875V(View view, String str, Context context, AttributeSet attributeSet) {
        boolean z;
        boolean z2 = false;
        if (this.f749j0 == null) {
            String string = this.f752o.obtainStyledAttributes(C6388j.f13356y0).getString(C6388j.f37796C0);
            if (string == null) {
                this.f749j0 = new C1543k();
            } else {
                try {
                    this.f749j0 = (C1543k) this.f752o.getClassLoader().loadClass(string).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                } catch (Throwable th2) {
                    Log.i("AppCompatDelegate", "Failed to instantiate custom view inflater " + string + ". Falling back to default.", th2);
                    this.f749j0 = new C1543k();
                }
            }
        }
        boolean z3 = f736m0;
        if (z3) {
            if (this.f750k0 == null) {
                this.f750k0 = new C1545l();
            }
            if (this.f750k0.m40782a(attributeSet)) {
                z = true;
                return this.f749j0.m40788r(view, str, context, attributeSet, z, z3, true, C1731u1.m40004d());
            } else if (!(attributeSet instanceof XmlPullParser)) {
                z2 = m40895I0((ViewParent) view);
            } else if (((XmlPullParser) attributeSet).getDepth() > 1) {
                z2 = true;
            }
        }
        z = z2;
        return this.f749j0.m40788r(view, str, context, attributeSet, z, z3, true, C1731u1.m40004d());
    }

    /* renamed from: W */
    void m40874W() {
        C1575e eVar;
        AbstractC1688k0 k0Var = this.f759v;
        if (k0Var != null) {
            k0Var.mo40133i();
        }
        if (this.f35125A != null) {
            this.f753p.getDecorView().removeCallbacks(this.f35126B);
            if (this.f35125A.isShowing()) {
                try {
                    this.f35125A.dismiss();
                } catch (IllegalArgumentException unused) {
                }
            }
            this.f35125A = null;
        }
        m40871Z();
        C1534t h0 = m40861h0(0, false);
        if (h0 != null && (eVar = h0.f794j) != null) {
            eVar.close();
        }
    }

    /* renamed from: X */
    boolean m40873X(KeyEvent keyEvent) {
        View decorView;
        Object obj = this.f751n;
        boolean z = true;
        if (((obj instanceof C2720u.AbstractC2721a) || (obj instanceof DialogC1541j)) && (decorView = this.f753p.getDecorView()) != null && C2720u.m37088d(decorView, keyEvent)) {
            return true;
        }
        if (keyEvent.getKeyCode() == 82 && this.f754q.m20591a().dispatchKeyEvent(keyEvent)) {
            return true;
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyEvent.getAction() != 0) {
            z = false;
        }
        if (z) {
            return m40838t0(keyCode, keyEvent);
        }
        return m40832w0(keyCode, keyEvent);
    }

    /* renamed from: Y */
    void m40872Y(int i) {
        C1534t h0;
        C1534t h02 = m40861h0(i, true);
        if (h02.f794j != null) {
            Bundle bundle = new Bundle();
            h02.f794j.m40661Q(bundle);
            if (bundle.size() > 0) {
                h02.f803s = bundle;
            }
            h02.f794j.m40645d0();
            h02.f794j.clear();
        }
        h02.f802r = true;
        h02.f801q = true;
        if ((i == 108 || i == 0) && this.f759v != null && (h0 = m40861h0(0, false)) != null) {
            h0.f797m = false;
            m40903E0(h0, null);
        }
    }

    /* renamed from: Z */
    void m40871Z() {
        C2674n2 n2Var = this.f35127C;
        if (n2Var != null) {
            n2Var.m37171c();
        }
    }

    @Override // androidx.appcompat.view.menu.C1575e.AbstractC1576a
    /* renamed from: a */
    public boolean mo40516a(C1575e eVar, MenuItem menuItem) {
        C1534t c0;
        Window.Callback j0 = m40858j0();
        if (j0 == null || this.f35146V || (c0 = m40868c0(eVar.mo40569D())) == null) {
            return false;
        }
        return j0.onMenuItemSelected(c0.f785a, menuItem);
    }

    @Override // androidx.appcompat.view.menu.C1575e.AbstractC1576a
    /* renamed from: b */
    public void mo40515b(C1575e eVar) {
        m40901F0(true);
    }

    /* renamed from: c0 */
    C1534t m40868c0(Menu menu) {
        int i;
        C1534t[] tVarArr = this.f35141Q;
        if (tVarArr != null) {
            i = tVarArr.length;
        } else {
            i = 0;
        }
        for (int i2 = 0; i2 < i; i2++) {
            C1534t tVar = tVarArr[i2];
            if (tVar != null && tVar.f794j == menu) {
                return tVar;
            }
        }
        return null;
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    /* renamed from: d */
    public void mo40867d(View view, ViewGroup.LayoutParams layoutParams) {
        m40870a0();
        ((ViewGroup) this.f35130F.findViewById(16908290)).addView(view, layoutParams);
        this.f754q.m20591a().onContentChanged();
    }

    /* renamed from: e0 */
    final Context m40865e0() {
        Context context;
        ActionBar n = mo40851n();
        if (n != null) {
            context = n.mo40738k();
        } else {
            context = null;
        }
        if (context == null) {
            return this.f752o;
        }
        return context;
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    /* renamed from: f */
    public Context mo40864f(Context context) {
        boolean z = true;
        this.f35144T = true;
        int r0 = m40842r0(context, m40886N());
        Configuration configuration = null;
        if (f739p0 && (context instanceof ContextThemeWrapper)) {
            try {
                C1532r.m40815a((ContextThemeWrapper) context, m40877T(context, r0, null));
                return context;
            } catch (IllegalStateException unused) {
            }
        }
        if (context instanceof C8096c) {
            try {
                ((C8096c) context).m20621a(m40877T(context, r0, null));
                return context;
            } catch (IllegalStateException unused2) {
            }
        }
        if (!f738o0) {
            return super.mo40864f(context);
        }
        Configuration configuration2 = new Configuration();
        configuration2.uiMode = -1;
        configuration2.fontScale = 0.0f;
        Configuration configuration3 = C1523j.m40827a(context, configuration2).getResources().getConfiguration();
        Configuration configuration4 = context.getResources().getConfiguration();
        configuration3.uiMode = configuration4.uiMode;
        if (!configuration3.equals(configuration4)) {
            configuration = m40866d0(configuration3, configuration4);
        }
        Configuration T = m40877T(context, r0, configuration);
        C8096c cVar = new C8096c(context, C6387i.f13233c);
        cVar.m20621a(T);
        boolean z2 = false;
        try {
            if (context.getTheme() == null) {
                z = false;
            }
            z2 = z;
        } catch (NullPointerException unused3) {
        }
        if (z2) {
            C2367h.C2373f.m37963a(cVar.getTheme());
        }
        return super.mo40864f(cVar);
    }

    /* renamed from: h0 */
    protected C1534t m40861h0(int i, boolean z) {
        C1534t[] tVarArr = this.f35141Q;
        if (tVarArr == null || tVarArr.length <= i) {
            C1534t[] tVarArr2 = new C1534t[i + 1];
            if (tVarArr != null) {
                System.arraycopy(tVarArr, 0, tVarArr2, 0, tVarArr.length);
            }
            this.f35141Q = tVarArr2;
            tVarArr = tVarArr2;
        }
        C1534t tVar = tVarArr[i];
        if (tVar != null) {
            return tVar;
        }
        C1534t tVar2 = new C1534t(i);
        tVarArr[i] = tVar2;
        return tVar2;
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    /* renamed from: i */
    public <T extends View> T mo40860i(int i) {
        m40870a0();
        return (T) this.f753p.findViewById(i);
    }

    /* renamed from: i0 */
    final CharSequence m40859i0() {
        Object obj = this.f751n;
        if (obj instanceof Activity) {
            return ((Activity) obj).getTitle();
        }
        return this.f758u;
    }

    /* renamed from: j0 */
    final Window.Callback m40858j0() {
        return this.f753p.getCallback();
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    /* renamed from: k */
    public final ActionBarDrawerToggle$Delegate mo40857k() {
        return new C1518f();
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    /* renamed from: l */
    public int mo40855l() {
        return this.f35148X;
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    /* renamed from: m */
    public MenuInflater mo40853m() {
        Context context;
        if (this.f757t == null) {
            m40856k0();
            ActionBar actionBar = this.f756s;
            if (actionBar != null) {
                context = actionBar.mo40738k();
            } else {
                context = this.f752o;
            }
            this.f757t = new C8097d(context);
        }
        return this.f757t;
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    /* renamed from: n */
    public ActionBar mo40851n() {
        m40856k0();
        return this.f756s;
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    /* renamed from: o */
    public void mo40849o() {
        LayoutInflater from = LayoutInflater.from(this.f752o);
        if (from.getFactory() == null) {
            C2726v.m37081a(from, this);
        } else if (!(from.getFactory2() instanceof LayoutInflater$Factory2C1513d)) {
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return m40875V(view, str, context, attributeSet);
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    /* renamed from: p */
    public void mo40847p() {
        if (m40907C0() != null && !mo40851n().mo40771l()) {
            m40848o0(0);
        }
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    /* renamed from: q */
    public void mo40845q(Configuration configuration) {
        ActionBar n;
        if (this.f35135K && this.f35129E && (n = mo40851n()) != null) {
            n.mo40737m(configuration);
        }
        C1683j.m40162b().m40157g(this.f752o);
        this.f35147W = new Configuration(this.f752o.getResources().getConfiguration());
        m40892K(false);
    }

    /* renamed from: q0 */
    public boolean m40844q0() {
        return this.f35128D;
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    /* renamed from: r */
    public void mo40843r(Bundle bundle) {
        String str;
        this.f35144T = true;
        m40892K(false);
        m40869b0();
        Object obj = this.f751n;
        if (obj instanceof Activity) {
            try {
                str = C2261l.m38236c((Activity) obj);
            } catch (IllegalArgumentException unused) {
                str = null;
            }
            if (str != null) {
                ActionBar C0 = m40907C0();
                if (C0 == null) {
                    this.f746g0 = true;
                } else {
                    C0.mo40735r(true);
                }
            }
            AppCompatDelegate.m40925c(this);
        }
        this.f35147W = new Configuration(this.f752o.getResources().getConfiguration());
        this.f35145U = true;
    }

    /* renamed from: r0 */
    int m40842r0(Context context, int i) {
        if (i == -100) {
            return -1;
        }
        if (i != -1) {
            if (i != 0) {
                if (!(i == 1 || i == 2)) {
                    if (i == 3) {
                        return m40863f0(context).mo40817c();
                    }
                    throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                }
            } else if (((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() == 0) {
                return -1;
            } else {
                return m40862g0(context).mo40817c();
            }
        }
        return i;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0058  */
    @Override // androidx.appcompat.app.AppCompatDelegate
    /* renamed from: s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void mo40841s() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f751n
            boolean r0 = r0 instanceof android.app.Activity
            if (r0 == 0) goto L_0x0009
            androidx.appcompat.app.AppCompatDelegate.m40920y(r3)
        L_0x0009:
            boolean r0 = r3.f743d0
            if (r0 == 0) goto L_0x0018
            android.view.Window r0 = r3.f753p
            android.view.View r0 = r0.getDecorView()
            java.lang.Runnable r1 = r3.f745f0
            r0.removeCallbacks(r1)
        L_0x0018:
            r0 = 1
            r3.f35146V = r0
            int r0 = r3.f35148X
            r1 = -100
            if (r0 == r1) goto L_0x0045
            java.lang.Object r0 = r3.f751n
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L_0x0045
            android.app.Activity r0 = (android.app.Activity) r0
            boolean r0 = r0.isChangingConfigurations()
            if (r0 == 0) goto L_0x0045
            androidx.collection.SimpleArrayMap<java.lang.String, java.lang.Integer> r0 = androidx.appcompat.app.LayoutInflater$Factory2C1513d.f735l0
            java.lang.Object r1 = r3.f751n
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            int r2 = r3.f35148X
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.put(r1, r2)
            goto L_0x0054
        L_0x0045:
            androidx.collection.SimpleArrayMap<java.lang.String, java.lang.Integer> r0 = androidx.appcompat.app.LayoutInflater$Factory2C1513d.f735l0
            java.lang.Object r1 = r3.f751n
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            r0.remove(r1)
        L_0x0054:
            androidx.appcompat.app.ActionBar r0 = r3.f756s
            if (r0 == 0) goto L_0x005b
            r0.mo40770n()
        L_0x005b:
            r3.m40880Q()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.LayoutInflater$Factory2C1513d.mo40841s():void");
    }

    /* renamed from: s0 */
    boolean m40840s0() {
        androidx.appcompat.view.ActionMode actionMode = this.f762y;
        if (actionMode != null) {
            actionMode.mo40722c();
            return true;
        }
        ActionBar n = mo40851n();
        if (n == null || !n.mo40741h()) {
            return false;
        }
        return true;
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    /* renamed from: t */
    public void mo40839t(Bundle bundle) {
        m40870a0();
    }

    /* renamed from: t0 */
    boolean m40838t0(int i, KeyEvent keyEvent) {
        boolean z = true;
        if (i == 4) {
            if ((keyEvent.getFlags() & 128) == 0) {
                z = false;
            }
            this.f35143S = z;
        } else if (i == 82) {
            m40836u0(0, keyEvent);
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    /* renamed from: u */
    public void mo40837u() {
        ActionBar n = mo40851n();
        if (n != null) {
            n.mo40731v(true);
        }
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    /* renamed from: v */
    public void mo40835v(Bundle bundle) {
    }

    /* renamed from: v0 */
    boolean m40834v0(int i, KeyEvent keyEvent) {
        ActionBar n = mo40851n();
        if (n != null && n.mo40736o(i, keyEvent)) {
            return true;
        }
        C1534t tVar = this.f35142R;
        if (tVar == null || !m40905D0(tVar, keyEvent.getKeyCode(), keyEvent, 1)) {
            if (this.f35142R == null) {
                C1534t h0 = m40861h0(0, true);
                m40903E0(h0, keyEvent);
                boolean D0 = m40905D0(h0, keyEvent.getKeyCode(), keyEvent, 1);
                h0.f797m = false;
                if (D0) {
                    return true;
                }
            }
            return false;
        }
        C1534t tVar2 = this.f35142R;
        if (tVar2 != null) {
            tVar2.f798n = true;
        }
        return true;
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    /* renamed from: w */
    public void mo40833w() {
        m40894J();
    }

    /* renamed from: w0 */
    boolean m40832w0(int i, KeyEvent keyEvent) {
        if (i == 4) {
            boolean z = this.f35143S;
            this.f35143S = false;
            C1534t h0 = m40861h0(0, false);
            if (h0 != null && h0.f799o) {
                if (!z) {
                    m40878S(h0, true);
                }
                return true;
            } else if (m40840s0()) {
                return true;
            }
        } else if (i == 82) {
            m40830x0(0, keyEvent);
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    /* renamed from: x */
    public void mo40831x() {
        ActionBar n = mo40851n();
        if (n != null) {
            n.mo40731v(false);
        }
    }

    /* renamed from: y0 */
    void m40829y0(int i) {
        ActionBar n;
        if (i == 108 && (n = mo40851n()) != null) {
            n.mo40740i(true);
        }
    }

    /* renamed from: z0 */
    void m40828z0(int i) {
        if (i == 108) {
            ActionBar n = mo40851n();
            if (n != null) {
                n.mo40740i(false);
            }
        } else if (i == 0) {
            C1534t h0 = m40861h0(i, true);
            if (h0.f799o) {
                m40878S(h0, false);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public LayoutInflater$Factory2C1513d(Dialog dialog, AbstractC1512c cVar) {
        this(dialog.getContext(), dialog.getWindow(), cVar, dialog);
    }

    @Override // android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    private LayoutInflater$Factory2C1513d(Context context, Window window, AbstractC1512c cVar, Object obj) {
        SimpleArrayMap<String, Integer> simpleArrayMap;
        Integer num;
        ActivityC1510b L0;
        this.f35127C = null;
        this.f35128D = true;
        this.f35148X = -100;
        this.f745f0 = new RunnableC1514a();
        this.f752o = context;
        this.f755r = cVar;
        this.f751n = obj;
        if (this.f35148X == -100 && (obj instanceof Dialog) && (L0 = m40889L0()) != null) {
            this.f35148X = L0.getDelegate().mo40855l();
        }
        if (this.f35148X == -100 && (num = (simpleArrayMap = f735l0).get(obj.getClass().getName())) != null) {
            this.f35148X = num.intValue();
            simpleArrayMap.remove(obj.getClass().getName());
        }
        if (window != null) {
            m40888M(window);
        }
        C1683j.m40156h();
    }
}
