package com.discord.react_gesture_handler.nested_touch;

import android.view.MotionEvent;
import android.view.View;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.s;


@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "event", "Landroid/view/MotionEvent;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)

public final class NestedScrollOnTouchListener$onSupplementalMotionEventReceived$1 extends s implements Function1<MotionEvent, Unit> {
    final  View $view;
    final  NestedScrollOnTouchListener this$0;

    
    
    public NestedScrollOnTouchListener$onSupplementalMotionEventReceived$1(NestedScrollOnTouchListener nestedScrollOnTouchListener, View view) {
        super(1);
        this.this$0 = nestedScrollOnTouchListener;
        this.$view = view;
    }

    @Override 
    public   Unit invoke(MotionEvent motionEvent) {
        invoke2(motionEvent);
        return Unit.f21215a;
    }

    
    public final void invoke2(MotionEvent event) {
        NestedScrollOnTouchTracker nestedScrollOnTouchTracker;
        q.h(event, "event");
        nestedScrollOnTouchTracker = this.this$0.viewTouchTracker;
        nestedScrollOnTouchTracker.handleTouch$react_gesture_handler_release(this.$view, event, true);
    }
}
