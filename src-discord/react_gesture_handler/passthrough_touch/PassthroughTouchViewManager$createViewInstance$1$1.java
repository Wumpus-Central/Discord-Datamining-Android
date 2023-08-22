package com.discord.react_gesture_handler.passthrough_touch;

import com.discord.react_gesture_handler.passthrough_touch.events.OnTouchDownData;
import com.discord.reactevents.ReactEvents;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.events.EventDispatcher;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.jvm.internal.s;


@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)

public final class PassthroughTouchViewManager$createViewInstance$1$1 extends s implements Function0<Unit> {
    final  Ref$ObjectRef<EventDispatcher> $eventDispatcher;
    final  ThemedReactContext $reactContext;
    final  PassthroughTouchViewGroup $this_apply;
    final  PassthroughTouchViewManager this$0;

    
    
    public PassthroughTouchViewManager$createViewInstance$1$1(PassthroughTouchViewManager passthroughTouchViewManager, Ref$ObjectRef<EventDispatcher> ref$ObjectRef, ThemedReactContext themedReactContext, PassthroughTouchViewGroup passthroughTouchViewGroup) {
        super(0);
        this.this$0 = passthroughTouchViewManager;
        this.$eventDispatcher = ref$ObjectRef;
        this.$reactContext = themedReactContext;
        this.$this_apply = passthroughTouchViewGroup;
    }

    @Override 
    
    public final void invoke2() {
        ReactEvents reactEvents;
        reactEvents = this.this$0.reactEvents;
        reactEvents.emitEvent(this.$eventDispatcher.f21240j, this.$reactContext, this.$this_apply, new OnTouchDownData());
    }
}
