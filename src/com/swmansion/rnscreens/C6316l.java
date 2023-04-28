package com.swmansion.rnscreens;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.inputmethod.InputMethodManager;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import com.facebook.react.ReactRootView;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.modules.core.ChoreographerCompat;
import com.facebook.react.modules.core.ReactChoreographer;
import com.facebook.react.uimanager.ViewProps;
import com.swmansion.rnscreens.C6308j;
import com.swmansion.rnscreens.C6319n;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C9914r;
import kotlin.jvm.internal.C9971q;

@Metadata(m15074d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B\u0011\u0012\b\u0010K\u001a\u0004\u0018\u00010J¢\u0006\u0004\bL\u0010MJ\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0002J\b\u0010\u000b\u001a\u00020\u0006H\u0002J\u0018\u0010\u000f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u0001H\u0002J\u0018\u0010\u0010\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u0001H\u0002J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u000e\u001a\u00020\u0001H\u0002J\u0010\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0004H\u0002J\b\u0010\u0015\u001a\u00020\u0006H\u0002J0\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0014\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u0018H\u0014J\u0010\u0010\u001f\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u001dH\u0016J\b\u0010 \u001a\u00020\u0006H\u0016J\u0006\u0010\u0019\u001a\u00020\u0006J\u0017\u0010#\u001a\u00028\u00002\u0006\u0010\"\u001a\u00020!H\u0014¢\u0006\u0004\b#\u0010$J\u0016\u0010&\u001a\u00020\u00062\u0006\u0010\"\u001a\u00020!2\u0006\u0010%\u001a\u00020\u0018J\u0010\u0010'\u001a\u00020\u00062\u0006\u0010%\u001a\u00020\u0018H\u0016J\b\u0010(\u001a\u00020\u0006H\u0016J\u000e\u0010)\u001a\u00020!2\u0006\u0010%\u001a\u00020\u0018J\b\u0010*\u001a\u00020\fH\u0004J\u0012\u0010+\u001a\u00020\u00162\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001H\u0016J\b\u0010,\u001a\u00020\u0006H\u0014J\b\u0010-\u001a\u00020\u0006H\u0014J\u0018\u00100\u001a\u00020\u00062\u0006\u0010.\u001a\u00020\u00182\u0006\u0010/\u001a\u00020\u0018H\u0014J\b\u0010\u001a\u001a\u00020\u0006H\u0004J\u0006\u00101\u001a\u00020\u0006J\b\u00102\u001a\u00020\u0006H\u0016J\b\u00103\u001a\u00020\u0006H\u0014R$\u00107\u001a\u0012\u0012\u0004\u0012\u00028\u000004j\b\u0012\u0004\u0012\u00028\u0000`58\u0004X\u0085\u0004¢\u0006\u0006\n\u0004\b+\u00106R\u0018\u00109\u001a\u0004\u0018\u00010\u00048\u0004@\u0004X\u0085\u000e¢\u0006\u0006\n\u0004\b\u0019\u00108R\u0016\u0010;\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u0010:R\u0016\u0010<\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010:R\u0016\u0010>\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010:R\u0014\u0010A\u001a\u00020?8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u0010@R\u0018\u0010C\u001a\u0004\u0018\u00010\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u0010BR\u0011\u0010F\u001a\u00020\u00188F¢\u0006\u0006\u001a\u0004\bD\u0010ER\u0016\u0010I\u001a\u0004\u0018\u00010!8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bG\u0010H¨\u0006N"}, m15073d2 = {"Lcom/swmansion/rnscreens/l;", "Lcom/swmansion/rnscreens/n;", "T", "Landroid/view/ViewGroup;", "Landroidx/fragment/app/FragmentManager;", "fm", "", "setFragmentManager", "Lcom/facebook/react/ReactRootView;", "rootView", "h", "v", "Landroidx/fragment/app/FragmentTransaction;", "transaction", "screenFragment", "e", "g", "Lcom/swmansion/rnscreens/j$a;", "i", "fragmentManager", "t", "n", "", "changed", "", "l", "r", "b", ViewProps.ON_LAYOUT, "Landroid/view/View;", "view", "removeView", "requestLayout", "Lcom/swmansion/rnscreens/j;", "screen", "c", "(Lcom/swmansion/rnscreens/j;)Lcom/swmansion/rnscreens/n;", "index", "d", "u", "s", "j", "f", "k", "onAttachedToWindow", "onDetachedFromWindow", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "q", "p", "m", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "Ljava/util/ArrayList;", "mScreenFragments", "Landroidx/fragment/app/FragmentManager;", "mFragmentManager", "Z", "mIsAttached", "mNeedUpdate", "o", "mLayoutEnqueued", "Lcom/facebook/react/modules/core/ChoreographerCompat$FrameCallback;", "Lcom/facebook/react/modules/core/ChoreographerCompat$FrameCallback;", "mLayoutCallback", "Lcom/swmansion/rnscreens/n;", "mParentScreenFragment", "getScreenCount", "()I", "screenCount", "getTopScreen", "()Lcom/swmansion/rnscreens/j;", "topScreen", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "react-native-screens_release"}, m15072k = 1, m15071mv = {1, 8, 0})
/* renamed from: com.swmansion.rnscreens.l */
/* loaded from: classes8.dex */
public class C6316l<T extends C6319n> extends ViewGroup {

    /* renamed from: l */
    protected FragmentManager f12842l;

    /* renamed from: m */
    private boolean f12843m;

    /* renamed from: n */
    private boolean f12844n;

    /* renamed from: o */
    private boolean f12845o;

    /* renamed from: q */
    private C6319n f12847q;

    /* renamed from: k */
    protected final ArrayList<T> f12841k = new ArrayList<>();

    /* renamed from: p */
    private final ChoreographerCompat.FrameCallback f12846p = new C6317a(this);

    @Metadata(m15074d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, m15073d2 = {"com/swmansion/rnscreens/l$a", "Lcom/facebook/react/modules/core/ChoreographerCompat$FrameCallback;", "", "frameTimeNanos", "", "doFrame", "react-native-screens_release"}, m15072k = 1, m15071mv = {1, 8, 0})
    /* renamed from: com.swmansion.rnscreens.l$a */
    /* loaded from: classes8.dex */
    public static final class C6317a extends ChoreographerCompat.FrameCallback {

        /* renamed from: a */
        final /* synthetic */ C6316l<T> f12848a;

        C6317a(C6316l<T> lVar) {
            this.f12848a = lVar;
        }

        @Override // com.facebook.react.modules.core.ChoreographerCompat.FrameCallback
        public void doFrame(long j) {
            ((C6316l) this.f12848a).f12845o = false;
            C6316l<T> lVar = this.f12848a;
            lVar.measure(View.MeasureSpec.makeMeasureSpec(lVar.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(this.f12848a.getHeight(), 1073741824));
            C6316l<T> lVar2 = this.f12848a;
            lVar2.layout(lVar2.getLeft(), this.f12848a.getTop(), this.f12848a.getRight(), this.f12848a.getBottom());
        }
    }

    public C6316l(Context context) {
        super(context);
    }

    /* renamed from: e */
    private final void m25912e(FragmentTransaction fragmentTransaction, C6319n nVar) {
        fragmentTransaction.m36074b(getId(), nVar);
    }

    /* renamed from: g */
    private final void m25910g(FragmentTransaction fragmentTransaction, C6319n nVar) {
        fragmentTransaction.mo36042m(nVar);
    }

    /* renamed from: h */
    private final FragmentManager m25909h(ReactRootView reactRootView) {
        boolean z;
        FragmentManager fragmentManager;
        Context context = reactRootView.getContext();
        while (true) {
            z = context instanceof FragmentActivity;
            if (z || !(context instanceof ContextWrapper)) {
                break;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        if (z) {
            FragmentActivity fragmentActivity = (FragmentActivity) context;
            if (fragmentActivity.getSupportFragmentManager().m36098u0().isEmpty()) {
                FragmentManager supportFragmentManager = fragmentActivity.getSupportFragmentManager();
                C9971q.m14634f(supportFragmentManager, "{\n            // We are …FragmentManager\n        }");
                return supportFragmentManager;
            }
            try {
                fragmentManager = FragmentManager.m36136h0(reactRootView).getChildFragmentManager();
            } catch (IllegalStateException unused) {
                fragmentManager = fragmentActivity.getSupportFragmentManager();
            }
            C9971q.m14634f(fragmentManager, "{\n            // We are …r\n            }\n        }");
            return fragmentManager;
        }
        throw new IllegalStateException("In order to use RNScreens components your app's activity need to extend ReactActivity".toString());
    }

    /* renamed from: i */
    private final C6308j.EnumC6309a m25908i(C6319n nVar) {
        return nVar.m25884q().getActivityState();
    }

    /* renamed from: n */
    private final void m25905n() {
        ReactContext reactContext;
        this.f12844n = true;
        Context context = getContext();
        if (context instanceof ReactContext) {
            reactContext = (ReactContext) context;
        } else {
            reactContext = null;
        }
        if (reactContext != null) {
            reactContext.runOnUiQueueThread(new Runnable() { // from class: com.swmansion.rnscreens.k
                @Override // java.lang.Runnable
                public final void run() {
                    C6316l.m25904o(C6316l.this);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o */
    public static final void m25904o(C6316l this$0) {
        C9971q.m14633g(this$0, "this$0");
        this$0.m25903q();
    }

    private final void setFragmentManager(FragmentManager fragmentManager) {
        this.f12842l = fragmentManager;
        m25902r();
    }

    /* renamed from: t */
    private final void m25901t(FragmentManager fragmentManager) {
        FragmentTransaction m = fragmentManager.m36122m();
        C9971q.m14634f(m, "fragmentManager.beginTransaction()");
        boolean z = false;
        for (Fragment fragment : fragmentManager.m36098u0()) {
            if ((fragment instanceof C6319n) && ((C6319n) fragment).m25884q().getContainer() == this) {
                m.mo36042m(fragment);
                z = true;
            }
        }
        if (z) {
            m.mo36044j();
        }
    }

    /* renamed from: v */
    private final void m25900v() {
        boolean z;
        Unit unit;
        ViewParent viewParent = this;
        while (true) {
            z = viewParent instanceof ReactRootView;
            if (z || (viewParent instanceof C6308j) || viewParent.getParent() == null) {
                break;
            }
            viewParent = viewParent.getParent();
            C9971q.m14634f(viewParent, "parent.parent");
        }
        if (viewParent instanceof C6308j) {
            C6319n fragment = ((C6308j) viewParent).getFragment();
            if (fragment != null) {
                this.f12847q = fragment;
                fragment.m25881v(this);
                FragmentManager childFragmentManager = fragment.getChildFragmentManager();
                C9971q.m14634f(childFragmentManager, "screenFragment.childFragmentManager");
                setFragmentManager(childFragmentManager);
                unit = Unit.f22042a;
            } else {
                unit = null;
            }
            if (unit == null) {
                throw new IllegalStateException("Parent Screen does not have its Fragment attached".toString());
            }
        } else if (z) {
            setFragmentManager(m25909h((ReactRootView) viewParent));
        } else {
            throw new IllegalStateException("ScreenContainer is not attached under ReactRootView".toString());
        }
    }

    /* renamed from: c */
    protected T mo25863c(C6308j screen) {
        C9971q.m14633g(screen, "screen");
        return (T) new C6319n(screen);
    }

    /* renamed from: d */
    public final void m25913d(C6308j screen, int i) {
        C9971q.m14633g(screen, "screen");
        T c = mo25863c(screen);
        screen.setFragment(c);
        this.f12841k.add(i, c);
        screen.setContainer(this);
        m25905n();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: f */
    public final FragmentTransaction m25911f() {
        FragmentManager fragmentManager = this.f12842l;
        if (fragmentManager != null) {
            FragmentTransaction s = fragmentManager.m36122m().m36063s(true);
            C9971q.m14634f(s, "requireNotNull(mFragment…etReorderingAllowed(true)");
            return s;
        }
        throw new IllegalArgumentException("mFragmentManager is null when creating transaction".toString());
    }

    public final int getScreenCount() {
        return this.f12841k.size();
    }

    public C6308j getTopScreen() {
        Object obj;
        boolean z;
        Iterator<T> it = this.f12841k.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (m25908i((C6319n) obj) == C6308j.EnumC6309a.ON_TOP) {
                z = true;
                continue;
            } else {
                z = false;
                continue;
            }
            if (z) {
                break;
            }
        }
        C6319n nVar = (C6319n) obj;
        if (nVar != null) {
            return nVar.m25884q();
        }
        return null;
    }

    /* renamed from: j */
    public final C6308j m25907j(int i) {
        return this.f12841k.get(i).m25884q();
    }

    /* renamed from: k */
    public boolean mo25862k(C6319n nVar) {
        boolean M;
        M = C9914r.m14778M(this.f12841k, nVar);
        return M;
    }

    /* renamed from: l */
    public final void m25906l() {
        m25902r();
    }

    /* renamed from: m */
    protected void mo25861m() {
        C6319n fragment;
        C6308j topScreen = getTopScreen();
        if (topScreen != null && (fragment = topScreen.getFragment()) != null) {
            fragment.mo25834r();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f12843m = true;
        m25900v();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        FragmentManager fragmentManager = this.f12842l;
        if (fragmentManager != null && !fragmentManager.m36197G0()) {
            m25901t(fragmentManager);
            fragmentManager.m36145e0();
        }
        C6319n nVar = this.f12847q;
        if (nVar != null) {
            nVar.m25899A(this);
        }
        this.f12847q = null;
        super.onDetachedFromWindow();
        this.f12843m = false;
        int childCount = getChildCount();
        while (true) {
            childCount--;
            if (-1 < childCount) {
                removeViewAt(childCount);
            } else {
                return;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            getChildAt(i5).layout(0, 0, getWidth(), getHeight());
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            getChildAt(i3).measure(i, i2);
        }
    }

    /* renamed from: p */
    public void mo25860p() {
        boolean z;
        Fragment[] fragmentArr;
        FragmentTransaction f = m25911f();
        FragmentManager fragmentManager = this.f12842l;
        if (fragmentManager != null) {
            HashSet hashSet = new HashSet(fragmentManager.m36098u0());
            Iterator<T> it = this.f12841k.iterator();
            while (it.hasNext()) {
                T screenFragment = it.next();
                C9971q.m14634f(screenFragment, "screenFragment");
                if (m25908i(screenFragment) == C6308j.EnumC6309a.INACTIVE && screenFragment.isAdded()) {
                    m25910g(f, screenFragment);
                }
                hashSet.remove(screenFragment);
            }
            boolean z2 = false;
            if (!hashSet.isEmpty()) {
                for (Fragment fragment : (Fragment[]) hashSet.toArray(new Fragment[0])) {
                    if (fragment instanceof C6319n) {
                        C6319n nVar = (C6319n) fragment;
                        if (nVar.m25884q().getContainer() == null) {
                            m25910g(f, nVar);
                        }
                    }
                }
            }
            if (getTopScreen() == null) {
                z = true;
            } else {
                z = false;
            }
            ArrayList arrayList = new ArrayList();
            Iterator<T> it2 = this.f12841k.iterator();
            while (it2.hasNext()) {
                T screenFragment2 = it2.next();
                C9971q.m14634f(screenFragment2, "screenFragment");
                C6308j.EnumC6309a i = m25908i(screenFragment2);
                C6308j.EnumC6309a aVar = C6308j.EnumC6309a.INACTIVE;
                if (i != aVar && !screenFragment2.isAdded()) {
                    m25912e(f, screenFragment2);
                    z2 = true;
                } else if (i != aVar && z2) {
                    m25910g(f, screenFragment2);
                    arrayList.add(screenFragment2);
                }
                screenFragment2.m25884q().setTransitioning(z);
            }
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                C6319n screenFragment3 = (C6319n) it3.next();
                C9971q.m14634f(screenFragment3, "screenFragment");
                m25912e(f, screenFragment3);
            }
            f.mo36044j();
            return;
        }
        throw new IllegalArgumentException("mFragmentManager is null when performing update in ScreenContainer".toString());
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0014, code lost:
        if (r0.m36197G0() == true) goto L_0x0018;
     */
    /* renamed from: q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m25903q() {
        /*
            r3 = this;
            boolean r0 = r3.f12844n
            if (r0 == 0) goto L_0x0023
            boolean r0 = r3.f12843m
            if (r0 == 0) goto L_0x0023
            androidx.fragment.app.FragmentManager r0 = r3.f12842l
            if (r0 == 0) goto L_0x0023
            r1 = 0
            if (r0 == 0) goto L_0x0017
            boolean r0 = r0.m36197G0()
            r2 = 1
            if (r0 != r2) goto L_0x0017
            goto L_0x0018
        L_0x0017:
            r2 = r1
        L_0x0018:
            if (r2 == 0) goto L_0x001b
            goto L_0x0023
        L_0x001b:
            r3.f12844n = r1
            r3.mo25860p()
            r3.mo25861m()
        L_0x0023:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.swmansion.rnscreens.C6316l.m25903q():void");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: r */
    public final void m25902r() {
        this.f12844n = true;
        m25903q();
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        C9971q.m14633g(view, "view");
        if (view == getFocusedChild()) {
            Object systemService = getContext().getSystemService("input_method");
            C9971q.m14635e(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
            ((InputMethodManager) systemService).hideSoftInputFromWindow(getWindowToken(), 2);
        }
        super.removeView(view);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        super.requestLayout();
        if (!this.f12845o && this.f12846p != null) {
            this.f12845o = true;
            ReactChoreographer.getInstance().postFrameCallback(ReactChoreographer.CallbackType.NATIVE_ANIMATED_MODULE, this.f12846p);
        }
    }

    /* renamed from: s */
    public void mo25859s() {
        Iterator<T> it = this.f12841k.iterator();
        while (it.hasNext()) {
            it.next().m25884q().setContainer(null);
        }
        this.f12841k.clear();
        m25905n();
    }

    /* renamed from: u */
    public void mo25858u(int i) {
        this.f12841k.get(i).m25884q().setContainer(null);
        this.f12841k.remove(i);
        m25905n();
    }
}
