package com.discord.react_gesture_handler.passthrough_touch;

import com.discord.react_gesture_handler.passthrough_touch.events.OnTouchDownData;
import com.discord.reactevents.ReactEvents;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.ViewGroupManager;
import java.util.Map;
import jg.x;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\bH\u0014J\u0014\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nH\u0016J\b\u0010\r\u001a\u00020\u000bH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/discord/react_gesture_handler/passthrough_touch/PassthroughTouchViewManager;", "Lcom/facebook/react/uimanager/ViewGroupManager;", "Lcom/discord/react_gesture_handler/passthrough_touch/PassthroughTouchViewGroup;", "()V", "reactEvents", "Lcom/discord/reactevents/ReactEvents;", "createViewInstance", "reactContext", "Lcom/facebook/react/uimanager/ThemedReactContext;", "getExportedCustomDirectEventTypeConstants", "", "", "", "getName", "react_gesture_handler_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class PassthroughTouchViewManager extends ViewGroupManager<PassthroughTouchViewGroup> {
    private final ReactEvents reactEvents = new ReactEvents(x.a("onTouchDown", f0.b(OnTouchDownData.class)));

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        return this.reactEvents.exportEventConstants();
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return "PassthroughTouchView";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public PassthroughTouchViewGroup createViewInstance(ThemedReactContext reactContext) {
        q.g(reactContext, "reactContext");
        PassthroughTouchViewGroup passthroughTouchViewGroup = new PassthroughTouchViewGroup(reactContext);
        passthroughTouchViewGroup.setOnTouchDown(new PassthroughTouchViewManager$createViewInstance$1$1(this, passthroughTouchViewGroup));
        return passthroughTouchViewGroup;
    }
}
