package com.discord.react_gesture_handler.blocking_touch;

import android.content.Context;
import android.view.MotionEvent;
import com.discord.react_gesture_handler.GetDiscordGestureHandlerEnabledRootViewKt;
import com.facebook.react.views.view.ReactViewGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"Lcom/discord/react_gesture_handler/blocking_touch/BlockingGestureViewGroup;", "Lcom/facebook/react/views/view/ReactViewGroup;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "onInterceptTouchEvent", "", "event", "Landroid/view/MotionEvent;", "react_gesture_handler_release"}, k = 1, mv = {1, 8, 0}, xi = 48)

public final class BlockingGestureViewGroup extends ReactViewGroup {
    
    public BlockingGestureViewGroup(Context context) {
        super(context);
        q.h(context, "context");
    }

    @Override 
    public boolean onInterceptTouchEvent(MotionEvent event) {
        q.h(event, "event");
        if (event.getAction() == 0) {
            GetDiscordGestureHandlerEnabledRootViewKt.getDiscordGestureHandlerEnabledRootView(this).requestDisallowInterceptTouchEvent(true);
        }
        return super.onInterceptTouchEvent(event);
    }
}
