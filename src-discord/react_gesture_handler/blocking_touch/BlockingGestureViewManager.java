package com.discord.react_gesture_handler.blocking_touch;

import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.viewmanagers.BlockingGestureViewManagerDelegate;
import com.facebook.react.viewmanagers.BlockingGestureViewManagerInterface;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q;

@ReactModule(name = BlockingGestureViewManager.NAME)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0001\u0018\u0000 \u000e2\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u0001\u000eB\u0005¢\u0006\u0002\u0010\u0004J\u0010\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\nH\u0014J$\u0010\u000b\u001a\u001e\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00020\u0002\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00000\u00000\u0006H\u0014J\b\u0010\f\u001a\u00020\rH\u0016R*\u0010\u0005\u001a\u001e\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00020\u0002\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00000\u00000\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/discord/react_gesture_handler/blocking_touch/BlockingGestureViewManager;", "Lcom/facebook/react/uimanager/ViewGroupManager;", "Lcom/discord/react_gesture_handler/blocking_touch/BlockingGestureViewGroup;", "Lcom/facebook/react/viewmanagers/BlockingGestureViewManagerInterface;", "()V", "mDelegate", "Lcom/facebook/react/viewmanagers/BlockingGestureViewManagerDelegate;", "kotlin.jvm.PlatformType", "createViewInstance", "reactContext", "Lcom/facebook/react/uimanager/ThemedReactContext;", "getDelegate", "getName", "", "Companion", "react_gesture_handler_release"}, k = 1, mv = {1, 8, 0}, xi = 48)

public final class BlockingGestureViewManager extends ViewGroupManager<BlockingGestureViewGroup> implements BlockingGestureViewManagerInterface<BlockingGestureViewGroup> {
    public static final Companion Companion = new Companion(null);
    public static final String NAME = "BlockingGestureView";
    private final BlockingGestureViewManagerDelegate<BlockingGestureViewGroup, BlockingGestureViewManager> mDelegate = new BlockingGestureViewManagerDelegate<>(this);

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/discord/react_gesture_handler/blocking_touch/BlockingGestureViewManager$Companion;", "", "()V", "NAME", "", "react_gesture_handler_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    
    public static final class Companion {
        private Companion() {
        }

        public  Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override 
    public String getName() {
        return NAME;
    }

    
    @Override 
    public BlockingGestureViewGroup createViewInstance(ThemedReactContext reactContext) {
        q.h(reactContext, "reactContext");
        return new BlockingGestureViewGroup(reactContext);
    }

    
    @Override 
    public BlockingGestureViewManagerDelegate<BlockingGestureViewGroup, BlockingGestureViewManager> getDelegate() {
        return this.mDelegate;
    }
}
