package com.swmansion.gesturehandler.react;

import android.os.SystemClock;
import android.util.Log;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.common.ReactConstants;
import com.facebook.react.uimanager.RootView;
import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p085ef.C6832d;
import p085ef.C6838g;

@Metadata(m15074d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000 \u00072\u00020\u0001:\u0002\u0010\u0014B\u0017\u0012\u0006\u0010\u0012\u001a\u00020\u000f\u0012\u0006\u0010#\u001a\u00020\u001a¢\u0006\u0004\b$\u0010%J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0006\u0010\u0004\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005J\u000e\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bJ\u0016\u0010\u000e\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0005R\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0016\u001a\u0004\u0018\u00010\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0019\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0018R\u0017\u0010\u001e\u001a\u00020\u001a8\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u001dR\u0016\u0010 \u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u001fR\u0016\u0010\"\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\u001f¨\u0006&"}, m15073d2 = {"Lcom/swmansion/gesturehandler/react/RNGestureHandlerRootHelper;", "", "", "i", "h", "", "disallowIntercept", "g", "Landroid/view/MotionEvent;", "ev", "c", "", "viewTag", "blockNativeResponder", "e", "Lcom/facebook/react/bridge/ReactContext;", "a", "Lcom/facebook/react/bridge/ReactContext;", "context", "Lef/g;", "b", "Lef/g;", "orchestrator", "Lef/d;", "Lef/d;", "jsGestureHandler", "Landroid/view/ViewGroup;", "d", "Landroid/view/ViewGroup;", "()Landroid/view/ViewGroup;", "rootView", "Z", "shouldIntercept", "f", "passingTouch", "wrappedView", "<init>", "(Lcom/facebook/react/bridge/ReactContext;Landroid/view/ViewGroup;)V", "react-native-gesture-handler_release"}, m15072k = 1, m15071mv = {1, 8, 0})
/* loaded from: classes8.dex */
public final class RNGestureHandlerRootHelper {

    /* renamed from: g */
    public static final C6246a f12691g = new C6246a(null);

    /* renamed from: a */
    private final ReactContext f12692a;

    /* renamed from: b */
    private final C6838g f12693b;

    /* renamed from: c */
    private final C6832d<?> f12694c;

    /* renamed from: d */
    private final ViewGroup f12695d;

    /* renamed from: e */
    private boolean f12696e;

    /* renamed from: f */
    private boolean f12697f;

    @Metadata(m15074d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\n"}, m15073d2 = {"Lcom/swmansion/gesturehandler/react/RNGestureHandlerRootHelper$a;", "", "Landroid/view/ViewGroup;", "viewGroup", "b", "", "MIN_ALPHA_FOR_TOUCH", "F", "<init>", "()V", "react-native-gesture-handler_release"}, m15072k = 1, m15071mv = {1, 8, 0})
    /* renamed from: com.swmansion.gesturehandler.react.RNGestureHandlerRootHelper$a */
    /* loaded from: classes8.dex */
    public static final class C6246a {
        private C6246a() {
        }

        public /* synthetic */ C6246a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: b */
        public final ViewGroup m26018b(ViewGroup viewGroup) {
            UiThreadUtil.assertOnUiThread();
            ViewParent viewParent = viewGroup;
            while (viewParent != null && !(viewParent instanceof RootView)) {
                viewParent = viewParent.getParent();
            }
            if (viewParent != null) {
                return (ViewGroup) viewParent;
            }
            throw new IllegalStateException(("View " + viewGroup + " has not been mounted under ReactRootView").toString());
        }
    }

    @Metadata(m15074d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0082\u0004\u0018\u00002\f\u0012\b\u0012\u00060\u0000R\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0014J\b\u0010\b\u001a\u00020\u0006H\u0014¨\u0006\u000b"}, m15073d2 = {"Lcom/swmansion/gesturehandler/react/RNGestureHandlerRootHelper$b;", "Lef/d;", "Lcom/swmansion/gesturehandler/react/RNGestureHandlerRootHelper;", "Landroid/view/MotionEvent;", "event", "sourceEvent", "", "e0", "d0", "<init>", "(Lcom/swmansion/gesturehandler/react/RNGestureHandlerRootHelper;)V", "react-native-gesture-handler_release"}, m15072k = 1, m15071mv = {1, 8, 0})
    /* renamed from: com.swmansion.gesturehandler.react.RNGestureHandlerRootHelper$b */
    /* loaded from: classes8.dex */
    private final class C6247b extends C6832d<C6247b> {
        public C6247b() {
        }

        @Override // p085ef.C6832d
        /* renamed from: d0 */
        protected void mo23999d0() {
            RNGestureHandlerRootHelper.this.f12696e = true;
            long uptimeMillis = SystemClock.uptimeMillis();
            MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
            obtain.setAction(3);
            if (RNGestureHandlerRootHelper.this.m26025d() instanceof RootView) {
                ((RootView) RNGestureHandlerRootHelper.this.m26025d()).onChildStartedNativeGesture(obtain);
            }
        }

        @Override // p085ef.C6832d
        /* renamed from: e0 */
        protected void mo23998e0(MotionEvent event, MotionEvent sourceEvent) {
            C9971q.m14633g(event, "event");
            C9971q.m14633g(sourceEvent, "sourceEvent");
            if (m24226O() == 0) {
                m24194o();
                RNGestureHandlerRootHelper.this.f12696e = false;
            }
            if (event.getActionMasked() == 1) {
                m24248A();
            }
        }
    }

    public RNGestureHandlerRootHelper(ReactContext context, ViewGroup wrappedView) {
        C9971q.m14633g(context, "context");
        C9971q.m14633g(wrappedView, "wrappedView");
        this.f12692a = context;
        UiThreadUtil.assertOnUiThread();
        int id2 = wrappedView.getId();
        if (id2 < 1 ? false : true) {
            NativeModule nativeModule = context.getNativeModule(RNGestureHandlerModule.class);
            C9971q.m14636d(nativeModule);
            RNGestureHandlerModule rNGestureHandlerModule = (RNGestureHandlerModule) nativeModule;
            C6257h registry = rNGestureHandlerModule.getRegistry();
            ViewGroup b = f12691g.m26018b(wrappedView);
            this.f12695d = b;
            Log.i(ReactConstants.TAG, "[GESTURE HANDLER] Initialize gesture handler for root view " + b);
            C6838g gVar = new C6838g(wrappedView, registry, new C6263l());
            gVar.m24128y(0.1f);
            this.f12693b = gVar;
            C6247b bVar = new C6247b();
            bVar.m24247A0(-id2);
            this.f12694c = bVar;
            registry.m25994j(bVar);
            registry.m26001c(bVar.m24225P(), id2, 3);
            rNGestureHandlerModule.registerRootHelper(this);
            return;
        }
        throw new IllegalStateException(("Expect view tag to be set for " + wrappedView).toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public static final void m26023f(RNGestureHandlerRootHelper this$0) {
        C9971q.m14633g(this$0, "this$0");
        this$0.m26020i();
    }

    /* renamed from: i */
    private final void m26020i() {
        C6832d<?> dVar = this.f12694c;
        if (dVar != null && dVar.m24226O() == 2) {
            dVar.m24201j();
            dVar.m24248A();
        }
    }

    /* renamed from: c */
    public final boolean m26026c(MotionEvent ev) {
        C9971q.m14633g(ev, "ev");
        this.f12697f = true;
        C6838g gVar = this.f12693b;
        C9971q.m14636d(gVar);
        gVar.m24132u(ev);
        this.f12697f = false;
        return this.f12696e;
    }

    /* renamed from: d */
    public final ViewGroup m26025d() {
        return this.f12695d;
    }

    /* renamed from: e */
    public final void m26024e(int i, boolean z) {
        if (z) {
            UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.swmansion.gesturehandler.react.i
                @Override // java.lang.Runnable
                public final void run() {
                    RNGestureHandlerRootHelper.m26023f(RNGestureHandlerRootHelper.this);
                }
            });
        }
    }

    /* renamed from: g */
    public final void m26022g(boolean z) {
        if (this.f12693b != null && !this.f12697f) {
            m26020i();
        }
    }

    /* renamed from: h */
    public final void m26021h() {
        Log.i(ReactConstants.TAG, "[GESTURE HANDLER] Tearing down gesture handler registered for root view " + this.f12695d);
        NativeModule nativeModule = this.f12692a.getNativeModule(RNGestureHandlerModule.class);
        C9971q.m14636d(nativeModule);
        RNGestureHandlerModule rNGestureHandlerModule = (RNGestureHandlerModule) nativeModule;
        C6257h registry = rNGestureHandlerModule.getRegistry();
        C6832d<?> dVar = this.f12694c;
        C9971q.m14636d(dVar);
        registry.m25997g(dVar.m24225P());
        rNGestureHandlerModule.unregisterRootHelper(this);
    }
}
