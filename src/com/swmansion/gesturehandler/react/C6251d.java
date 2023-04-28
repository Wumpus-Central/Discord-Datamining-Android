package com.swmansion.gesturehandler.react;

import android.view.View;
import androidx.core.util.Pools$SynchronizedPool;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.Event;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p085ef.C6832d;

@Metadata(m15074d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000  2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0016B\t\b\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ?\u0010\n\u001a\u00020\t\"\u000e\b\u0000\u0010\u0003*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0004\u001a\u00028\u00002\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\f\u001a\u00020\tH\u0016J\b\u0010\u000e\u001a\u00020\rH\u0016J\b\u0010\u000f\u001a\u00020\u0007H\u0016J\b\u0010\u0011\u001a\u00020\u0010H\u0016J\u0010\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u0012H\u0016R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u001b\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001d\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u001c¨\u0006!"}, m15073d2 = {"Lcom/swmansion/gesturehandler/react/d;", "Lcom/facebook/react/uimanager/events/Event;", "Lef/d;", "T", "handler", "Lcom/swmansion/gesturehandler/react/e;", "dataExtractor", "", "useNativeAnimatedName", "", "c", "(Lef/d;Lcom/swmansion/gesturehandler/react/e;Z)V", "onDispose", "", "getEventName", "canCoalesce", "", "getCoalescingKey", "Lcom/facebook/react/uimanager/events/RCTEventEmitter;", "rctEventEmitter", "dispatch", "Lcom/facebook/react/bridge/WritableMap;", "a", "Lcom/facebook/react/bridge/WritableMap;", "extraData", "b", "S", "coalescingKey", "Z", "useTopPrefixedName", "<init>", "()V", "d", "react-native-gesture-handler_release"}, m15072k = 1, m15071mv = {1, 8, 0})
/* renamed from: com.swmansion.gesturehandler.react.d */
/* loaded from: classes8.dex */
public final class C6251d extends Event<C6251d> {

    /* renamed from: d */
    public static final C6252a f12698d = new C6252a(null);

    /* renamed from: e */
    private static final Pools$SynchronizedPool<C6251d> f12699e = new Pools$SynchronizedPool<>(7);

    /* renamed from: a */
    private WritableMap f12700a;

    /* renamed from: b */
    private short f12701b;

    /* renamed from: c */
    private boolean f12702c;

    @Metadata(m15074d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ?\u0010\n\u001a\u00020\t\"\u000e\b\u0000\u0010\u0003*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0004\u001a\u00028\u00002\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ5\u0010\r\u001a\u00020\f\"\u000e\b\u0000\u0010\u0003*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0004\u001a\u00028\u00002\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0005¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\t0\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00128\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u00128\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001b"}, m15073d2 = {"Lcom/swmansion/gesturehandler/react/d$a;", "", "Lef/d;", "T", "handler", "Lcom/swmansion/gesturehandler/react/e;", "dataExtractor", "", "useTopPrefixedName", "Lcom/swmansion/gesturehandler/react/d;", "b", "(Lef/d;Lcom/swmansion/gesturehandler/react/e;Z)Lcom/swmansion/gesturehandler/react/d;", "Lcom/facebook/react/bridge/WritableMap;", "a", "(Lef/d;Lcom/swmansion/gesturehandler/react/e;)Lcom/facebook/react/bridge/WritableMap;", "Landroidx/core/util/Pools$SynchronizedPool;", "EVENTS_POOL", "Landroidx/core/util/Pools$SynchronizedPool;", "", "EVENT_NAME", "Ljava/lang/String;", "NATIVE_ANIMATED_EVENT_NAME", "", "TOUCH_EVENTS_POOL_SIZE", "I", "<init>", "()V", "react-native-gesture-handler_release"}, m15072k = 1, m15071mv = {1, 8, 0})
    /* renamed from: com.swmansion.gesturehandler.react.d$a */
    /* loaded from: classes8.dex */
    public static final class C6252a {
        private C6252a() {
        }

        public /* synthetic */ C6252a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: c */
        public static /* synthetic */ C6251d m26008c(C6252a aVar, C6832d dVar, AbstractC6253e eVar, boolean z, int i, Object obj) {
            if ((i & 4) != 0) {
                z = false;
            }
            return aVar.m26009b(dVar, eVar, z);
        }

        /* renamed from: a */
        public final <T extends C6832d<T>> WritableMap m26010a(T handler, AbstractC6253e<T> eVar) {
            C9971q.m14633g(handler, "handler");
            WritableMap createMap = Arguments.createMap();
            if (eVar != null) {
                C9971q.m14634f(createMap, "this");
                eVar.mo26007a(handler, createMap);
            }
            createMap.putInt("handlerTag", handler.m24225P());
            createMap.putInt("state", handler.m24226O());
            C9971q.m14634f(createMap, "createMap().apply {\n    …te\", handler.state)\n    }");
            return createMap;
        }

        /* renamed from: b */
        public final <T extends C6832d<T>> C6251d m26009b(T handler, AbstractC6253e<T> eVar, boolean z) {
            C9971q.m14633g(handler, "handler");
            C6251d dVar = (C6251d) C6251d.f12699e.acquire();
            if (dVar == null) {
                dVar = new C6251d(null);
            }
            dVar.m26011c(handler, eVar, z);
            return dVar;
        }
    }

    private C6251d() {
    }

    public /* synthetic */ C6251d(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public final <T extends C6832d<T>> void m26011c(T t, AbstractC6253e<T> eVar, boolean z) {
        View S = t.m24222S();
        C9971q.m14636d(S);
        super.init(S.getId());
        this.f12700a = f12698d.m26010a(t, eVar);
        this.f12701b = t.m24238G();
        this.f12702c = z;
    }

    @Override // com.facebook.react.uimanager.events.Event
    public boolean canCoalesce() {
        return true;
    }

    @Override // com.facebook.react.uimanager.events.Event
    public void dispatch(RCTEventEmitter rctEventEmitter) {
        C9971q.m14633g(rctEventEmitter, "rctEventEmitter");
        rctEventEmitter.receiveEvent(getViewTag(), "onGestureHandlerEvent", this.f12700a);
    }

    @Override // com.facebook.react.uimanager.events.Event
    public short getCoalescingKey() {
        return this.f12701b;
    }

    @Override // com.facebook.react.uimanager.events.Event
    public String getEventName() {
        return this.f12702c ? "topGestureHandlerEvent" : "onGestureHandlerEvent";
    }

    @Override // com.facebook.react.uimanager.events.Event
    public void onDispose() {
        this.f12700a = null;
        f12699e.release(this);
    }
}
