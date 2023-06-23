package com.discord.react_gesture_handler.blocking_touch;

import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.viewmanagers.BlockingGestureViewManagerInterface;
import kotlin.Metadata;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003B\u0005¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0014J\b\u0010\b\u001a\u00020\tH\u0016¨\u0006\n"}, d2 = {"Lcom/discord/react_gesture_handler/blocking_touch/BlockingGestureViewManager;", "Lcom/facebook/react/uimanager/ViewGroupManager;", "Lcom/discord/react_gesture_handler/blocking_touch/BlockingGestureViewGroup;", "Lcom/facebook/react/viewmanagers/BlockingGestureViewManagerInterface;", "()V", "createViewInstance", "reactContext", "Lcom/facebook/react/uimanager/ThemedReactContext;", "getName", "", "react_gesture_handler_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class BlockingGestureViewManager extends ViewGroupManager<BlockingGestureViewGroup> implements BlockingGestureViewManagerInterface<BlockingGestureViewGroup> {
    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return "BlockingGestureView";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public BlockingGestureViewGroup createViewInstance(ThemedReactContext reactContext) {
        q.g(reactContext, "reactContext");
        return new BlockingGestureViewGroup(reactContext);
    }
}
