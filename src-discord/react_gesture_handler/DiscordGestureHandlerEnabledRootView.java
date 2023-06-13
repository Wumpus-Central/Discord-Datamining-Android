package com.discord.react_gesture_handler;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.k2;
import com.discord.react_gesture_handler.nested_touch.NestedScrollOnTouchListener;
import com.discord.theme.ThemeManager;
import com.swmansion.gesturehandler.react.RNGestureHandlerRootView;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0000\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\bH\u0016J\b\u0010\r\u001a\u00020\tH\u0014R&\u0010\u0005\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007\u0012\u0004\u0012\u00020\n0\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/discord/react_gesture_handler/DiscordGestureHandlerEnabledRootView;", "Lcom/swmansion/gesturehandler/react/RNGestureHandlerRootView;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "supplementalMotionEventReceivedCallbacks", "", "Lkotlin/Function1;", "Landroid/view/MotionEvent;", "", "", "dispatchTouchEvent", "ev", "onAttachedToWindow", "Companion", "react_gesture_handler_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class DiscordGestureHandlerEnabledRootView extends RNGestureHandlerRootView {
    public static final Companion Companion;
    private static final WeakHashMap<View, WeakReference<DiscordGestureHandlerEnabledRootView>> gestureHandlersToRootView = new WeakHashMap<>();
    private final Map<Function1<MotionEvent, Unit>, Boolean> supplementalMotionEventReceivedCallbacks = new LinkedHashMap();

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\t\u001a\u00020\u0005H\u0002J\u0015\u0010\n\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0005H\u0000¢\u0006\u0002\b\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u00072\u0006\u0010\t\u001a\u00020\u0005H\u0002J\b\u0010\r\u001a\u00020\u000eH\u0002R\"\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00060\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/discord/react_gesture_handler/DiscordGestureHandlerEnabledRootView$Companion;", "", "()V", "gestureHandlersToRootView", "Ljava/util/WeakHashMap;", "Landroid/view/View;", "Ljava/lang/ref/WeakReference;", "Lcom/discord/react_gesture_handler/DiscordGestureHandlerEnabledRootView;", "find", "view", "get", "get$react_gesture_handler_release", "getNullable", "initNestedScrollOnTouchListeners", "", "react_gesture_handler_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final DiscordGestureHandlerEnabledRootView find(View view) {
            if (view instanceof DiscordGestureHandlerEnabledRootView) {
                return (DiscordGestureHandlerEnabledRootView) view;
            }
            if (!(view instanceof ViewGroup)) {
                return null;
            }
            for (View view2 : k2.a((ViewGroup) view)) {
                DiscordGestureHandlerEnabledRootView find = DiscordGestureHandlerEnabledRootView.Companion.find(view2);
                if (find != null) {
                    return find;
                }
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x003c, code lost:
            if (r2 == null) goto L_0x003e;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final com.discord.react_gesture_handler.DiscordGestureHandlerEnabledRootView getNullable(android.view.View r4) {
            /*
                r3 = this;
                android.content.Context r0 = r4.getContext()
                boolean r1 = r0 instanceof com.facebook.react.bridge.ReactContext
                r2 = 0
                if (r1 == 0) goto L_0x000c
                com.facebook.react.bridge.ReactContext r0 = (com.facebook.react.bridge.ReactContext) r0
                goto L_0x000d
            L_0x000c:
                r0 = r2
            L_0x000d:
                if (r0 == 0) goto L_0x001b
                android.app.Activity r0 = r0.getCurrentActivity()
                if (r0 == 0) goto L_0x001b
                android.view.View r0 = com.discord.misc.utilities.activity.ActivityExtensionsKt.getRootView(r0)
                if (r0 != 0) goto L_0x001f
            L_0x001b:
                android.view.View r0 = r4.getRootView()
            L_0x001f:
                java.util.WeakHashMap r4 = com.discord.react_gesture_handler.DiscordGestureHandlerEnabledRootView.access$getGestureHandlersToRootView$cp()
                java.lang.Object r4 = r4.get(r0)
                java.lang.ref.WeakReference r4 = (java.lang.ref.WeakReference) r4
                if (r4 == 0) goto L_0x0032
                java.lang.Object r4 = r4.get()
                com.discord.react_gesture_handler.DiscordGestureHandlerEnabledRootView r4 = (com.discord.react_gesture_handler.DiscordGestureHandlerEnabledRootView) r4
                goto L_0x0033
            L_0x0032:
                r4 = r2
            L_0x0033:
                if (r4 == 0) goto L_0x003e
                boolean r1 = r4.isAttachedToWindow()
                if (r1 == 0) goto L_0x003c
                r2 = r4
            L_0x003c:
                if (r2 != 0) goto L_0x005c
            L_0x003e:
                java.util.WeakHashMap r1 = com.discord.react_gesture_handler.DiscordGestureHandlerEnabledRootView.access$getGestureHandlersToRootView$cp()
                r1.remove(r4)
                java.lang.String r4 = "rootView"
                kotlin.jvm.internal.q.f(r0, r4)
                com.discord.react_gesture_handler.DiscordGestureHandlerEnabledRootView r2 = r3.find(r0)
                if (r2 == 0) goto L_0x005c
                java.util.WeakHashMap r4 = com.discord.react_gesture_handler.DiscordGestureHandlerEnabledRootView.access$getGestureHandlersToRootView$cp()
                java.lang.ref.WeakReference r1 = new java.lang.ref.WeakReference
                r1.<init>(r2)
                r4.put(r0, r1)
            L_0x005c:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.discord.react_gesture_handler.DiscordGestureHandlerEnabledRootView.Companion.getNullable(android.view.View):com.discord.react_gesture_handler.DiscordGestureHandlerEnabledRootView");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void initNestedScrollOnTouchListeners() {
            NestedScrollOnTouchListener.Companion companion = NestedScrollOnTouchListener.Companion;
            companion.setOnAddNativeEventListener(DiscordGestureHandlerEnabledRootView$Companion$initNestedScrollOnTouchListeners$1.INSTANCE);
            companion.setOnRemoveNativeEventListener(DiscordGestureHandlerEnabledRootView$Companion$initNestedScrollOnTouchListeners$2.INSTANCE);
        }

        public final DiscordGestureHandlerEnabledRootView get$react_gesture_handler_release(View view) {
            q.g(view, "view");
            DiscordGestureHandlerEnabledRootView nullable = getNullable(view);
            q.d(nullable);
            return nullable;
        }
    }

    static {
        Companion companion = new Companion(null);
        Companion = companion;
        companion.initNestedScrollOnTouchListeners();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DiscordGestureHandlerEnabledRootView(Context context) {
        super(context);
        q.g(context, "context");
    }

    @Override // com.swmansion.gesturehandler.react.RNGestureHandlerRootView, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent ev) {
        q.g(ev, "ev");
        Iterator<Map.Entry<Function1<MotionEvent, Unit>, Boolean>> it = this.supplementalMotionEventReceivedCallbacks.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<Function1<MotionEvent, Unit>, Boolean> next = it.next();
            Function1<MotionEvent, Unit> key = next.getKey();
            if (next.getValue().booleanValue()) {
                key.invoke(ev);
            } else {
                it.remove();
            }
        }
        try {
            return super.dispatchTouchEvent(ev);
        } catch (IllegalArgumentException unused) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.swmansion.gesturehandler.react.RNGestureHandlerRootView, com.facebook.react.views.view.ReactViewGroup, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        ThemeManager themeManager = ThemeManager.INSTANCE;
        themeManager.updateSystemUi(this);
        if (q.b(Companion.getNullable(this), this)) {
            Context context = getContext();
            q.f(context, "context");
            themeManager.updateWindowBackground(context, false);
        }
    }
}
