package com.swmansion.rnscreens;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.uimanager.UIManagerHelper;
import com.facebook.react.uimanager.events.Event;
import com.facebook.react.uimanager.events.EventDispatcher;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nf.C11088q;
import p106ff.C7122a;
import p106ff.C7123b;
import p106ff.C7125c;
import p106ff.C7127d;
import p106ff.C7129e;
import p106ff.C7131f;
import p106ff.C7133g;

@Metadata(m15074d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010!\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\b\b\b\u0016\u0018\u0000 \f2\u00020\u0001:\u0003FGHB\t\b\u0016¢\u0006\u0004\bD\u00103B\u0011\b\u0017\u0012\u0006\u0010E\u001a\u00020,¢\u0006\u0004\bD\u00101J\b\u0010\u0003\u001a\u00020\u0002H\u0016J&\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016J\b\u0010\f\u001a\u00020\u0002H\u0016J\b\u0010\u000e\u001a\u0004\u0018\u00010\rJ\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fJ\u0006\u0010\u0011\u001a\u00020\u0002J\u0016\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014J\u0012\u0010\u0019\u001a\u00020\u00022\n\u0010\u0018\u001a\u0006\u0012\u0002\b\u00030\u0017J\u0012\u0010\u001a\u001a\u00020\u00022\n\u0010\u0018\u001a\u0006\u0012\u0002\b\u00030\u0017J\u0006\u0010\u001b\u001a\u00020\u0002J\b\u0010\u001c\u001a\u00020\u0002H\u0016J\b\u0010\u001d\u001a\u00020\u0002H\u0016J\b\u0010\u001e\u001a\u00020\u0002H\u0002J\u0010\u0010!\u001a\u00020\u00142\u0006\u0010 \u001a\u00020\u001fH\u0002J\u0010\u0010\"\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u001fH\u0002J\b\u0010#\u001a\u00020\u0002H\u0002J\b\u0010$\u001a\u00020\u0002H\u0002J\b\u0010%\u001a\u00020\u0002H\u0002J\b\u0010&\u001a\u00020\u0002H\u0002J\u0018\u0010(\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010'\u001a\u00020\u0000H\u0002J\u0010\u0010)\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u001fH\u0002J\u0010\u0010+\u001a\u00020\u00022\u0006\u0010*\u001a\u00020\u0014H\u0002R(\u00104\u001a\u00020,8\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0004\b#\u0010-\u0012\u0004\b2\u00103\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\u001e\u00107\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0017058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u00106R\u0016\u00109\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u00108R\u0016\u0010;\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010:R\u0016\u0010=\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u00108R\u0016\u0010?\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u00108R\u0016\u0010@\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u00108R\u001b\u0010C\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00170A8F¢\u0006\u0006\u001a\u0004\b>\u0010B¨\u0006I"}, m15073d2 = {"Lcom/swmansion/rnscreens/n;", "Landroidx/fragment/app/Fragment;", "", "onResume", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "r", "Landroid/app/Activity;", "y", "Lcom/facebook/react/bridge/ReactContext;", "z", "h", "", "alpha", "", "closing", "m", "Lcom/swmansion/rnscreens/l;", "screenContainer", "v", "A", "t", "s", "onDestroy", "B", "Lcom/swmansion/rnscreens/n$b;", "event", "e", "w", "k", "i", "l", "j", "fragment", "f", "g", "animationEnd", "n", "Lcom/swmansion/rnscreens/j;", "Lcom/swmansion/rnscreens/j;", "q", "()Lcom/swmansion/rnscreens/j;", "x", "(Lcom/swmansion/rnscreens/j;)V", "getScreen$annotations", "()V", "screen", "", "Ljava/util/List;", "mChildScreenContainers", "Z", "shouldUpdateOnResume", "F", "mProgress", "o", "canDispatchWillAppear", "p", "canDispatchAppear", "isTransitioning", "", "()Ljava/util/List;", "childScreenContainers", "<init>", "screenView", "a", "b", "c", "react-native-screens_release"}, m15072k = 1, m15071mv = {1, 8, 0})
/* renamed from: com.swmansion.rnscreens.n */
/* loaded from: classes8.dex */
public class C6319n extends Fragment {

    /* renamed from: r */
    public static final C6320a f12851r = new C6320a(null);

    /* renamed from: k */
    public C6308j f12852k;

    /* renamed from: m */
    private boolean f12854m;

    /* renamed from: q */
    private boolean f12858q;

    /* renamed from: l */
    private final List<C6316l<?>> f12853l = new ArrayList();

    /* renamed from: n */
    private float f12855n = -1.0f;

    /* renamed from: o */
    private boolean f12856o = true;

    /* renamed from: p */
    private boolean f12857p = true;

    @Metadata(m15074d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0005¨\u0006\u0007"}, m15073d2 = {"Lcom/swmansion/rnscreens/n$a;", "", "Landroid/view/View;", "view", "a", "<init>", "()V", "react-native-screens_release"}, m15072k = 1, m15071mv = {1, 8, 0})
    /* renamed from: com.swmansion.rnscreens.n$a */
    /* loaded from: classes8.dex */
    public static final class C6320a {
        private C6320a() {
        }

        public /* synthetic */ C6320a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        protected final View m25876a(View view) {
            C9971q.m14633g(view, "view");
            ViewParent parent = view.getParent();
            if (parent != null) {
                ViewGroup viewGroup = (ViewGroup) parent;
                viewGroup.endViewTransition(view);
                viewGroup.removeView(view);
            }
            view.setVisibility(0);
            return view;
        }
    }

    @Metadata(m15074d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, m15073d2 = {"Lcom/swmansion/rnscreens/n$b;", "", "<init>", "(Ljava/lang/String;I)V", "k", "l", "m", "n", "react-native-screens_release"}, m15072k = 1, m15071mv = {1, 8, 0})
    /* renamed from: com.swmansion.rnscreens.n$b */
    /* loaded from: classes8.dex */
    public enum EnumC6321b {
        Appear,
        WillAppear,
        Disappear,
        WillDisappear
    }

    @Metadata(m15074d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\b"}, m15073d2 = {"Lcom/swmansion/rnscreens/n$c;", "Landroid/widget/FrameLayout;", "", "clearFocus", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "react-native-screens_release"}, m15072k = 1, m15071mv = {1, 8, 0})
    /* renamed from: com.swmansion.rnscreens.n$c */
    /* loaded from: classes8.dex */
    private static final class C6322c extends FrameLayout {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6322c(Context context) {
            super(context);
            C9971q.m14633g(context, "context");
        }

        @Override // android.view.ViewGroup, android.view.View
        public void clearFocus() {
            if (getVisibility() != 4) {
                super.clearFocus();
            }
        }
    }

    @Metadata(m15072k = 3, m15071mv = {1, 8, 0}, m15069xi = 48)
    /* renamed from: com.swmansion.rnscreens.n$d */
    /* loaded from: classes8.dex */
    public /* synthetic */ class C6323d {

        /* renamed from: a */
        public static final /* synthetic */ int[] f12864a;

        static {
            int[] iArr = new int[EnumC6321b.values().length];
            try {
                iArr[EnumC6321b.WillAppear.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC6321b.Appear.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC6321b.WillDisappear.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC6321b.Disappear.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f12864a = iArr;
        }
    }

    public C6319n() {
        throw new IllegalStateException("Screen fragments should never be restored. Follow instructions from https://github.com/software-mansion/react-native-screens/issues/17#issuecomment-424704067 to properly configure your main activity.");
    }

    /* renamed from: B */
    private final void m25898B() {
        FragmentActivity activity = getActivity();
        if (activity == null) {
            this.f12854m = true;
        } else {
            C6343z.f12923a.m25799v(m25884q(), activity, m25877z());
        }
    }

    /* renamed from: e */
    private final boolean m25896e(EnumC6321b bVar) {
        int i = C6323d.f12864a[bVar.ordinal()];
        if (i == 1) {
            return this.f12856o;
        }
        if (i == 2) {
            return this.f12857p;
        }
        if (i != 3) {
            if (i != 4) {
                throw new C11088q();
            } else if (!this.f12857p) {
                return true;
            }
        } else if (!this.f12856o) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    private final void m25895f(EnumC6321b bVar, C6319n nVar) {
        Event event;
        if ((nVar instanceof C6331s) && nVar.m25896e(bVar)) {
            C6308j q = nVar.m25884q();
            nVar.m25880w(bVar);
            int i = C6323d.f12864a[bVar.ordinal()];
            if (i == 1) {
                event = new C7131f(q.getId());
            } else if (i == 2) {
                event = new C7123b(q.getId());
            } else if (i == 3) {
                event = new C7133g(q.getId());
            } else if (i == 4) {
                event = new C7125c(q.getId());
            } else {
                throw new C11088q();
            }
            Context context = m25884q().getContext();
            C9971q.m14635e(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
            EventDispatcher eventDispatcherForReactTag = UIManagerHelper.getEventDispatcherForReactTag((ReactContext) context, m25884q().getId());
            if (eventDispatcherForReactTag != null) {
                eventDispatcherForReactTag.dispatchEvent(event);
            }
            nVar.m25894g(bVar);
        }
    }

    /* renamed from: g */
    private final void m25894g(EnumC6321b bVar) {
        C6319n fragment;
        boolean z;
        List<C6316l<?>> list = this.f12853l;
        ArrayList<C6316l> arrayList = new ArrayList();
        for (Object obj : list) {
            if (((C6316l) obj).getScreenCount() > 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                arrayList.add(obj);
            }
        }
        for (C6316l lVar : arrayList) {
            C6308j topScreen = lVar.getTopScreen();
            if (!(topScreen == null || (fragment = topScreen.getFragment()) == null)) {
                m25895f(bVar, fragment);
            }
        }
    }

    /* renamed from: i */
    private final void m25892i() {
        m25895f(EnumC6321b.Appear, this);
        m25888m(1.0f, false);
    }

    /* renamed from: j */
    private final void m25891j() {
        m25895f(EnumC6321b.Disappear, this);
        m25888m(1.0f, true);
    }

    /* renamed from: k */
    private final void m25890k() {
        m25895f(EnumC6321b.WillAppear, this);
        m25888m(0.0f, false);
    }

    /* renamed from: l */
    private final void m25889l() {
        m25895f(EnumC6321b.WillDisappear, this);
        m25888m(0.0f, true);
    }

    /* renamed from: n */
    private final void m25887n(final boolean z) {
        this.f12858q = !z;
        Fragment parentFragment = getParentFragment();
        if (parentFragment != null && (!(parentFragment instanceof C6319n) || ((C6319n) parentFragment).f12858q)) {
            return;
        }
        if (isResumed()) {
            UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.swmansion.rnscreens.m
                @Override // java.lang.Runnable
                public final void run() {
                    C6319n.m25886o(z, this);
                }
            });
        } else if (z) {
            m25891j();
        } else {
            m25889l();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o */
    public static final void m25886o(boolean z, C6319n this$0) {
        C9971q.m14633g(this$0, "this$0");
        if (z) {
            this$0.m25892i();
        } else {
            this$0.m25890k();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: u */
    public static final View m25882u(View view) {
        return f12851r.m25876a(view);
    }

    /* renamed from: w */
    private final void m25880w(EnumC6321b bVar) {
        int i = C6323d.f12864a[bVar.ordinal()];
        if (i == 1) {
            this.f12856o = false;
        } else if (i == 2) {
            this.f12857p = false;
        } else if (i == 3) {
            this.f12856o = true;
        } else if (i == 4) {
            this.f12857p = true;
        }
    }

    /* renamed from: A */
    public final void m25899A(C6316l<?> screenContainer) {
        C9971q.m14633g(screenContainer, "screenContainer");
        this.f12853l.remove(screenContainer);
    }

    /* renamed from: h */
    public final void m25893h() {
        Context context = m25884q().getContext();
        C9971q.m14635e(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
        EventDispatcher eventDispatcherForReactTag = UIManagerHelper.getEventDispatcherForReactTag((ReactContext) context, m25884q().getId());
        if (eventDispatcherForReactTag != null) {
            eventDispatcherForReactTag.dispatchEvent(new C7122a(m25884q().getId()));
        }
    }

    /* renamed from: m */
    public final void m25888m(float f, boolean z) {
        boolean z2;
        boolean z3;
        if (this instanceof C6331s) {
            int i = 1;
            boolean z4 = false;
            if (this.f12855n == f) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2) {
                float max = Math.max(0.0f, Math.min(1.0f, f));
                this.f12855n = max;
                if (max == 0.0f) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (!z3) {
                    if (max != 1.0f) {
                        i = 0;
                    }
                    if (i != 0) {
                        i = 2;
                    } else {
                        i = 3;
                    }
                }
                short s = (short) i;
                C6316l<?> container = m25884q().getContainer();
                if (container instanceof C6327r) {
                    z4 = ((C6327r) container).getGoingForward();
                }
                Context context = m25884q().getContext();
                C9971q.m14635e(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
                EventDispatcher eventDispatcherForReactTag = UIManagerHelper.getEventDispatcherForReactTag((ReactContext) context, m25884q().getId());
                if (eventDispatcherForReactTag != null) {
                    eventDispatcherForReactTag.dispatchEvent(new C7129e(m25884q().getId(), this.f12855n, z, z4, s));
                }
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        C9971q.m14633g(inflater, "inflater");
        m25884q().setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        Context context = getContext();
        if (context == null) {
            return null;
        }
        C6322c cVar = new C6322c(context);
        cVar.addView(m25882u(m25884q()));
        return cVar;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        EventDispatcher eventDispatcherForReactTag;
        super.onDestroy();
        C6316l<?> container = m25884q().getContainer();
        if (container == null || !container.mo25862k(this)) {
            Context context = m25884q().getContext();
            if ((context instanceof ReactContext) && (eventDispatcherForReactTag = UIManagerHelper.getEventDispatcherForReactTag((ReactContext) context, m25884q().getId())) != null) {
                eventDispatcherForReactTag.dispatchEvent(new C7127d(m25884q().getId()));
            }
        }
        this.f12853l.clear();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        if (this.f12854m) {
            this.f12854m = false;
            C6343z.f12923a.m25799v(m25884q(), m25878y(), m25877z());
        }
    }

    /* renamed from: p */
    public final List<C6316l<?>> m25885p() {
        return this.f12853l;
    }

    /* renamed from: q */
    public final C6308j m25884q() {
        C6308j jVar = this.f12852k;
        if (jVar != null) {
            return jVar;
        }
        C9971q.m14615y("screen");
        return null;
    }

    /* renamed from: r */
    public void mo25834r() {
        m25898B();
    }

    /* renamed from: s */
    public void mo25833s() {
        m25887n(true);
    }

    /* renamed from: t */
    public final void m25883t() {
        m25887n(false);
    }

    /* renamed from: v */
    public final void m25881v(C6316l<?> screenContainer) {
        C9971q.m14633g(screenContainer, "screenContainer");
        this.f12853l.add(screenContainer);
    }

    /* renamed from: x */
    public final void m25879x(C6308j jVar) {
        C9971q.m14633g(jVar, "<set-?>");
        this.f12852k = jVar;
    }

    /* renamed from: y */
    public final Activity m25878y() {
        C6319n fragment;
        FragmentActivity activity;
        FragmentActivity activity2 = getActivity();
        if (activity2 != null) {
            return activity2;
        }
        Context context = m25884q().getContext();
        if (context instanceof ReactContext) {
            ReactContext reactContext = (ReactContext) context;
            if (reactContext.getCurrentActivity() != null) {
                return reactContext.getCurrentActivity();
            }
        }
        for (ViewParent container = m25884q().getContainer(); container != null; container = container.getParent()) {
            if (!(!(container instanceof C6308j) || (fragment = ((C6308j) container).getFragment()) == null || (activity = fragment.getActivity()) == null)) {
                return activity;
            }
        }
        return null;
    }

    /* renamed from: z */
    public final ReactContext m25877z() {
        if (getContext() instanceof ReactContext) {
            Context context = getContext();
            C9971q.m14635e(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
            return (ReactContext) context;
        } else if (m25884q().getContext() instanceof ReactContext) {
            Context context2 = m25884q().getContext();
            C9971q.m14635e(context2, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
            return (ReactContext) context2;
        } else {
            for (ViewParent container = m25884q().getContainer(); container != null; container = container.getParent()) {
                if (container instanceof C6308j) {
                    C6308j jVar = (C6308j) container;
                    if (jVar.getContext() instanceof ReactContext) {
                        Context context3 = jVar.getContext();
                        C9971q.m14635e(context3, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
                        return (ReactContext) context3;
                    }
                }
            }
            return null;
        }
    }

    @SuppressLint({"ValidFragment"})
    public C6319n(C6308j screenView) {
        C9971q.m14633g(screenView, "screenView");
        m25879x(screenView);
    }
}
