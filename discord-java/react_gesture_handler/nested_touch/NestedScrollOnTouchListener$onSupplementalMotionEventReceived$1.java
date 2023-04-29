package com.discord.react_gesture_handler.nested_touch;

import android.view.MotionEvent;
import android.view.View;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.s;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "event", "Landroid/view/MotionEvent;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class NestedScrollOnTouchListener$onSupplementalMotionEventReceived$1 extends s implements Function1<MotionEvent, Unit> {
    final /* synthetic */ View $view;
    final /* synthetic */ NestedScrollOnTouchListener this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NestedScrollOnTouchListener$onSupplementalMotionEventReceived$1(NestedScrollOnTouchListener nestedScrollOnTouchListener, View view) {
        super(1);
        this.this$0 = nestedScrollOnTouchListener;
        this.$view = view;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(MotionEvent motionEvent) {
        invoke2(motionEvent);
        return Unit.f22042a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(MotionEvent event) {
        NestedScrollOnTouchTracker nestedScrollOnTouchTracker;
        q.g(event, "event");
        nestedScrollOnTouchTracker = this.this$0.viewTouchTracker;
        nestedScrollOnTouchTracker.handleTouch$react_gesture_handler_release(this.$view, event, true);
    }
}
