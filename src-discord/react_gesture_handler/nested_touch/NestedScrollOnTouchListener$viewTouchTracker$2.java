package com.discord.react_gesture_handler.nested_touch;

import android.view.MotionEvent;
import android.view.View;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.s;


@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "view", "Landroid/view/View;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)

public final class NestedScrollOnTouchListener$viewTouchTracker$2 extends s implements Function1<View, Unit> {
    final  NestedScrollOnTouchListener this$0;

    
    
    public NestedScrollOnTouchListener$viewTouchTracker$2(NestedScrollOnTouchListener nestedScrollOnTouchListener) {
        super(1);
        this.this$0 = nestedScrollOnTouchListener;
    }

    @Override 
    public   Unit invoke(View view) {
        invoke2(view);
        return Unit.f21600a;
    }

    
    public final void invoke2(View view) {
        Function1<? super MotionEvent, Unit> function1;
        q.h(view, "view");
        Function2<View, Function1<? super MotionEvent, Unit>, Unit> onRemoveNativeEventListener = NestedScrollOnTouchListener.Companion.getOnRemoveNativeEventListener();
        if (onRemoveNativeEventListener != null) {
            function1 = this.this$0.onSupplementalMotionEventReceived;
            onRemoveNativeEventListener.invoke(view, function1);
        }
    }
}
