package com.discord.react_gesture_handler;

import android.view.MotionEvent;
import android.view.View;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC9973s;
import kotlin.jvm.internal.C9971q;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(m15074d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\b\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m15073d2 = {"Landroid/view/View;", "view", "Lkotlin/Function1;", "Landroid/view/MotionEvent;", "", "callback", "invoke", "(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V", "<anonymous>"}, m15072k = 3, m15071mv = {1, 8, 0})
/* renamed from: com.discord.react_gesture_handler.DiscordGestureHandlerEnabledRootView$Companion$initNestedScrollOnTouchListeners$1 */
/* loaded from: classes6.dex */
public final class C4660x1eafcca1 extends AbstractC9973s implements Function2<View, Function1<? super MotionEvent, ? extends Unit>, Unit> {
    public static final C4660x1eafcca1 INSTANCE = new C4660x1eafcca1();

    C4660x1eafcca1() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(View view, Function1<? super MotionEvent, ? extends Unit> function1) {
        invoke2(view, (Function1<? super MotionEvent, Unit>) function1);
        return Unit.f22042a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(View view, Function1<? super MotionEvent, Unit> callback) {
        Map map;
        C9971q.m14633g(view, "view");
        C9971q.m14633g(callback, "callback");
        map = DiscordGestureHandlerEnabledRootView.Companion.get$react_gesture_handler_release(view).supplementalMotionEventReceivedCallbacks;
        map.put(callback, Boolean.TRUE);
    }
}
