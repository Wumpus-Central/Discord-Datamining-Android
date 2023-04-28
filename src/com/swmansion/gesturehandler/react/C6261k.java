package com.swmansion.gesturehandler.react;

import android.view.View;
import androidx.core.util.Pools$SynchronizedPool;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.Event;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.facebook.react.uimanager.events.TouchesHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p085ef.C6832d;

@Metadata(m15074d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \u00062\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0013B\t\b\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ'\u0010\u0006\u001a\u00020\u0005\"\u000e\b\u0000\u0010\u0003*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0004\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\b\u001a\u00020\u0005H\u0016J\b\u0010\n\u001a\u00020\tH\u0016J\b\u0010\f\u001a\u00020\u000bH\u0016J\b\u0010\u000e\u001a\u00020\rH\u0016J\u0010\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u000fH\u0016R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0018\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u001b"}, m15073d2 = {"Lcom/swmansion/gesturehandler/react/k;", "Lcom/facebook/react/uimanager/events/Event;", "Lef/d;", "T", "handler", "", "c", "(Lef/d;)V", "onDispose", "", "getEventName", "", "canCoalesce", "", "getCoalescingKey", "Lcom/facebook/react/uimanager/events/RCTEventEmitter;", "rctEventEmitter", "dispatch", "Lcom/facebook/react/bridge/WritableMap;", "a", "Lcom/facebook/react/bridge/WritableMap;", "extraData", "b", "S", "coalescingKey", "<init>", "()V", "react-native-gesture-handler_release"}, m15072k = 1, m15071mv = {1, 8, 0})
/* renamed from: com.swmansion.gesturehandler.react.k */
/* loaded from: classes8.dex */
public final class C6261k extends Event<C6261k> {

    /* renamed from: c */
    public static final C6262a f12714c = new C6262a(null);

    /* renamed from: d */
    private static final Pools$SynchronizedPool<C6261k> f12715d = new Pools$SynchronizedPool<>(7);

    /* renamed from: a */
    private WritableMap f12716a;

    /* renamed from: b */
    private short f12717b;

    @Metadata(m15074d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ%\u0010\u0006\u001a\u00020\u0005\"\u000e\b\u0000\u0010\u0003*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0004\u001a\u00028\u0000¢\u0006\u0004\b\u0006\u0010\u0007J%\u0010\t\u001a\u00020\b\"\u000e\b\u0000\u0010\u0003*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0004\u001a\u00028\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000e8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u00118\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00118\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00118\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0013R\u0014\u0010\u0017\u001a\u00020\u00118\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0013¨\u0006\u001b"}, m15073d2 = {"Lcom/swmansion/gesturehandler/react/k$a;", "", "Lef/d;", "T", "handler", "Lcom/swmansion/gesturehandler/react/k;", "b", "(Lef/d;)Lcom/swmansion/gesturehandler/react/k;", "Lcom/facebook/react/bridge/WritableMap;", "a", "(Lef/d;)Lcom/facebook/react/bridge/WritableMap;", "Landroidx/core/util/Pools$SynchronizedPool;", "EVENTS_POOL", "Landroidx/core/util/Pools$SynchronizedPool;", "", "EVENT_NAME", "Ljava/lang/String;", "", "EVENT_TOUCH_CANCELLED", "I", "EVENT_TOUCH_DOWN", "EVENT_TOUCH_MOVE", "EVENT_TOUCH_UP", "EVENT_UNDETERMINED", "TOUCH_EVENTS_POOL_SIZE", "<init>", "()V", "react-native-gesture-handler_release"}, m15072k = 1, m15071mv = {1, 8, 0})
    /* renamed from: com.swmansion.gesturehandler.react.k$a */
    /* loaded from: classes8.dex */
    public static final class C6262a {
        private C6262a() {
        }

        public /* synthetic */ C6262a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final <T extends C6832d<T>> WritableMap m25984a(T handler) {
            C9971q.m14633g(handler, "handler");
            WritableMap createMap = Arguments.createMap();
            createMap.putInt("handlerTag", handler.m24225P());
            createMap.putInt("state", handler.m24226O());
            createMap.putInt("numberOfTouches", handler.m24223R());
            createMap.putInt("eventType", handler.m24224Q());
            WritableArray s = handler.m24186s();
            if (s != null) {
                createMap.putArray(TouchesHelper.CHANGED_TOUCHES_KEY, s);
            }
            WritableArray r = handler.m24188r();
            if (r != null) {
                createMap.putArray("allTouches", r);
            }
            if (handler.m24217X() && handler.m24226O() == 4) {
                createMap.putInt("state", 2);
            }
            C9971q.m14634f(createMap, "createMap().apply {\n    …TATE_BEGAN)\n      }\n    }");
            return createMap;
        }

        /* renamed from: b */
        public final <T extends C6832d<T>> C6261k m25983b(T handler) {
            C9971q.m14633g(handler, "handler");
            C6261k kVar = (C6261k) C6261k.f12715d.acquire();
            if (kVar == null) {
                kVar = new C6261k(null);
            }
            kVar.m25985c(handler);
            return kVar;
        }
    }

    private C6261k() {
    }

    public /* synthetic */ C6261k(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public final <T extends C6832d<T>> void m25985c(T t) {
        View S = t.m24222S();
        C9971q.m14636d(S);
        super.init(S.getId());
        this.f12716a = f12714c.m25984a(t);
        this.f12717b = t.m24238G();
    }

    @Override // com.facebook.react.uimanager.events.Event
    public boolean canCoalesce() {
        return true;
    }

    @Override // com.facebook.react.uimanager.events.Event
    public void dispatch(RCTEventEmitter rctEventEmitter) {
        C9971q.m14633g(rctEventEmitter, "rctEventEmitter");
        rctEventEmitter.receiveEvent(getViewTag(), "onGestureHandlerEvent", this.f12716a);
    }

    @Override // com.facebook.react.uimanager.events.Event
    public short getCoalescingKey() {
        return this.f12717b;
    }

    @Override // com.facebook.react.uimanager.events.Event
    public String getEventName() {
        return "onGestureHandlerEvent";
    }

    @Override // com.facebook.react.uimanager.events.Event
    public void onDispose() {
        this.f12716a = null;
        f12715d.release(this);
    }
}
