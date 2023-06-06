package com.discord.react_gesture_handler;

import android.view.MotionEvent;
import android.view.View;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.s;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\b\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Landroid/view/View;", "view", "Lkotlin/Function1;", "Landroid/view/MotionEvent;", "", "callback", "invoke", "(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes7.dex */
public final class DiscordGestureHandlerEnabledRootView$Companion$initNestedScrollOnTouchListeners$1 extends s implements Function2<View, Function1<? super MotionEvent, ? extends Unit>, Unit> {
    public static final DiscordGestureHandlerEnabledRootView$Companion$initNestedScrollOnTouchListeners$1 INSTANCE = new DiscordGestureHandlerEnabledRootView$Companion$initNestedScrollOnTouchListeners$1();

    DiscordGestureHandlerEnabledRootView$Companion$initNestedScrollOnTouchListeners$1() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(View view, Function1<? super MotionEvent, ? extends Unit> function1) {
        invoke2(view, (Function1<? super MotionEvent, Unit>) function1);
        return Unit.f22063a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(View view, Function1<? super MotionEvent, Unit> callback) {
        Map map;
        q.g(view, "view");
        q.g(callback, "callback");
        map = DiscordGestureHandlerEnabledRootView.Companion.get$react_gesture_handler_release(view).supplementalMotionEventReceivedCallbacks;
        map.put(callback, Boolean.TRUE);
    }
}
