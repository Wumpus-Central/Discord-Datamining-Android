package com.discord.react_gesture_handler.nested_touch;

import android.content.Context;
import android.view.View;
import android.view.ViewConfiguration;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q;
import kotlinx.coroutines.Job;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 &2\u00020\u0001:\u0001&BU\b\u0000\u0012\u0006\u0010#\u001a\u00020\"\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\u0016\b\u0002\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0013\u0012\u0016\b\u0002\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0013¢\u0006\u0004\b$\u0010%J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J'\u0010\f\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\n\u0010\u000bR\u0016\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\"\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\"\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0015R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001a\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0018\u0010 \u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!¨\u0006'"}, d2 = {"Lcom/discord/react_gesture_handler/nested_touch/NestedScrollOnTouchTracker;", "", "Landroid/view/View;", "view", "", "cleanUp", "Landroid/view/MotionEvent;", "event", "", "isSupplementalEvent", "handleTouch$react_gesture_handler_release", "(Landroid/view/View;Landroid/view/MotionEvent;Z)Z", "handleTouch", "Landroid/view/View$OnClickListener;", "onClickListener", "Landroid/view/View$OnClickListener;", "Landroid/view/View$OnLongClickListener;", "onLongClickListener", "Landroid/view/View$OnLongClickListener;", "Lkotlin/Function1;", "onTrackingStart", "Lkotlin/jvm/functions/Function1;", "onTrackingFinish", "Lkotlinx/coroutines/Job;", "job", "Lkotlinx/coroutines/Job;", "doClickOnUp", "Z", "Lcom/discord/react_gesture_handler/nested_touch/OriginTracker;", "originTracker", "Lcom/discord/react_gesture_handler/nested_touch/OriginTracker;", "Lcom/discord/react_gesture_handler/nested_touch/NestedClickableSpan;", "spanBeingTouched", "Lcom/discord/react_gesture_handler/nested_touch/NestedClickableSpan;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;Landroid/view/View$OnClickListener;Landroid/view/View$OnLongClickListener;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "Companion", "react_gesture_handler_release"}, k = 1, mv = {1, 8, 0})

public final class NestedScrollOnTouchTracker {
    private boolean doClickOnUp;
    private Job job;
    private final View.OnClickListener onClickListener;
    private final View.OnLongClickListener onLongClickListener;
    private final Function1<View, Unit> onTrackingFinish;
    private final Function1<View, Unit> onTrackingStart;
    private final OriginTracker originTracker;
    private NestedClickableSpan spanBeingTouched;
    private static final Companion Companion = new Companion(null);
    @Deprecated
    private static final long CLICK_MAX_DOWN_TIME = ViewConfiguration.getTapTimeout();
    @Deprecated
    private static final long LONG_PRESS_DOWN_TIME = ViewConfiguration.getLongPressTimeout();

    
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/discord/react_gesture_handler/nested_touch/NestedScrollOnTouchTracker$Companion;", "", "()V", "CLICK_MAX_DOWN_TIME", "", "getCLICK_MAX_DOWN_TIME", "()J", "LONG_PRESS_DOWN_TIME", "getLONG_PRESS_DOWN_TIME", "react_gesture_handler_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    
    public static final class Companion {
        private Companion() {
        }

        public  Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final long getCLICK_MAX_DOWN_TIME() {
            return NestedScrollOnTouchTracker.CLICK_MAX_DOWN_TIME;
        }

        public final long getLONG_PRESS_DOWN_TIME() {
            return NestedScrollOnTouchTracker.LONG_PRESS_DOWN_TIME;
        }
    }

    
    public NestedScrollOnTouchTracker(Context context, View.OnClickListener onClickListener, View.OnLongClickListener onLongClickListener, Function1<? super View, Unit> function1, Function1<? super View, Unit> function12) {
        q.h(context, "context");
        this.onClickListener = onClickListener;
        this.onLongClickListener = onLongClickListener;
        this.onTrackingStart = function1;
        this.onTrackingFinish = function12;
        this.originTracker = new OriginTracker(context);
    }

    
    public final void cleanUp(View view) {
        this.originTracker.cleanUp();
        Job job = this.job;
        if (job != null) {
            Job.a.a(job, null, 1, null);
        }
        view.setPressed(false);
        this.spanBeingTouched = null;
        Function1<View, Unit> function1 = this.onTrackingFinish;
        if (function1 != null) {
            function1.invoke(view);
        }
    }

    
    
    public final boolean handleTouch$react_gesture_handler_release(android.view.View r12, android.view.MotionEvent r13, boolean r14) {
        
        throw new UnsupportedOperationException("Method not decompiled: com.discord.react_gesture_handler.nested_touch.NestedScrollOnTouchTracker.handleTouch$react_gesture_handler_release(android.view.View, android.view.MotionEvent, boolean):boolean");
    }

    public  NestedScrollOnTouchTracker(Context context, View.OnClickListener onClickListener, View.OnLongClickListener onLongClickListener, Function1 function1, Function1 function12, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, onClickListener, onLongClickListener, (i10 & 8) != 0 ? null : function1, (i10 & 16) != 0 ? null : function12);
    }
}
