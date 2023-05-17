package com.discord.react_gesture_handler.nested_touch;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import androidx.core.view.a;
import androidx.core.view.w0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0018\u0010\r\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\tH\u0017R\u001a\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/discord/react_gesture_handler/nested_touch/NestedScrollOnTouchListener;", "Landroid/view/View$OnTouchListener;", "view", "Landroid/view/View;", "viewManagesAccessibility", "", "(Landroid/view/View;Z)V", "onSupplementalMotionEventReceived", "Lkotlin/Function1;", "Landroid/view/MotionEvent;", "", "viewTouchTracker", "Lcom/discord/react_gesture_handler/nested_touch/NestedScrollOnTouchTracker;", "onTouch", "event", "Companion", "react_gesture_handler_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class NestedScrollOnTouchListener implements View.OnTouchListener {
    public static final Companion Companion = new Companion(null);
    private static Function2<? super View, ? super Function1<? super MotionEvent, Unit>, Unit> onAddNativeEventListener;
    private static Function2<? super View, ? super Function1<? super MotionEvent, Unit>, Unit> onRemoveNativeEventListener;
    private Function1<? super MotionEvent, Unit> onSupplementalMotionEventReceived;
    private final NestedScrollOnTouchTracker viewTouchTracker;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\f\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0011RB\u0010\u0007\u001a\"\u0012\u0004\u0012\u00020\u0003\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fRB\u0010\r\u001a\"\u0012\u0004\u0012\u00020\u0003\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\b\u001a\u0004\b\u000e\u0010\n\"\u0004\b\u000f\u0010\f¨\u0006\u0012"}, d2 = {"Lcom/discord/react_gesture_handler/nested_touch/NestedScrollOnTouchListener$Companion;", "", "Lkotlin/Function2;", "Landroid/view/View;", "Lkotlin/Function1;", "Landroid/view/MotionEvent;", "", "onAddNativeEventListener", "Lkotlin/jvm/functions/Function2;", "getOnAddNativeEventListener", "()Lkotlin/jvm/functions/Function2;", "setOnAddNativeEventListener", "(Lkotlin/jvm/functions/Function2;)V", "onRemoveNativeEventListener", "getOnRemoveNativeEventListener", "setOnRemoveNativeEventListener", "<init>", "()V", "react_gesture_handler_release"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes7.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Function2<View, Function1<? super MotionEvent, Unit>, Unit> getOnAddNativeEventListener() {
            return NestedScrollOnTouchListener.onAddNativeEventListener;
        }

        public final Function2<View, Function1<? super MotionEvent, Unit>, Unit> getOnRemoveNativeEventListener() {
            return NestedScrollOnTouchListener.onRemoveNativeEventListener;
        }

        public final void setOnAddNativeEventListener(Function2<? super View, ? super Function1<? super MotionEvent, Unit>, Unit> function2) {
            NestedScrollOnTouchListener.onAddNativeEventListener = function2;
        }

        public final void setOnRemoveNativeEventListener(Function2<? super View, ? super Function1<? super MotionEvent, Unit>, Unit> function2) {
            NestedScrollOnTouchListener.onRemoveNativeEventListener = function2;
        }
    }

    public NestedScrollOnTouchListener(final View view, boolean z10) {
        q.g(view, "view");
        if (!z10) {
            w0.q0(view, new a() { // from class: com.discord.react_gesture_handler.nested_touch.NestedScrollOnTouchListener.1
                @Override // androidx.core.view.a
                public boolean performAccessibilityAction(View host, int i10, Bundle bundle) {
                    View.OnLongClickListener onLongClickListener;
                    q.g(host, "host");
                    if (i10 == 16) {
                        View.OnClickListener onClickListener = NestedScrollOnTouchUtilsKt.getViewClickListeners().get(view);
                        if (onClickListener != null) {
                            onClickListener.onClick(view);
                        }
                    } else if (i10 == 32 && (onLongClickListener = NestedScrollOnTouchUtilsKt.getViewLongClickListeners().get(view)) != null) {
                        onLongClickListener.onLongClick(view);
                    }
                    return super.performAccessibilityAction(host, i10, bundle);
                }
            });
        }
        Context context = view.getContext();
        q.f(context, "view.context");
        this.viewTouchTracker = new NestedScrollOnTouchTracker(context, NestedScrollOnTouchUtilsKt.getViewClickListeners().get(view), NestedScrollOnTouchUtilsKt.getViewLongClickListeners().get(view), new NestedScrollOnTouchListener$viewTouchTracker$1(this), new NestedScrollOnTouchListener$viewTouchTracker$2(this));
        this.onSupplementalMotionEventReceived = new NestedScrollOnTouchListener$onSupplementalMotionEventReceived$1(this, view);
    }

    @Override // android.view.View.OnTouchListener
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouch(View view, MotionEvent event) {
        q.g(view, "view");
        q.g(event, "event");
        return this.viewTouchTracker.handleTouch$react_gesture_handler_release(view, event, false);
    }
}
