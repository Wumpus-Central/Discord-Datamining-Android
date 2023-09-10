package com.discord.react_gesture_handler.nested_touch;

import android.view.View;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.k;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;


@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@e(c = "com.discord.react_gesture_handler.nested_touch.NestedScrollOnTouchTracker$handleTouch$2", f = "NestedScrollOnTouchTracker.kt", l = {76, 84}, m = "invokeSuspend")

public final class NestedScrollOnTouchTracker$handleTouch$2 extends k implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final  View $view;
    int label;
    final  NestedScrollOnTouchTracker this$0;

    
    
    public NestedScrollOnTouchTracker$handleTouch$2(NestedScrollOnTouchTracker nestedScrollOnTouchTracker, View view, Continuation<? super NestedScrollOnTouchTracker$handleTouch$2> continuation) {
        super(2, continuation);
        this.this$0 = nestedScrollOnTouchTracker;
        this.$view = view;
    }

    @Override 
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new NestedScrollOnTouchTracker$handleTouch$2(this.this$0, this.$view, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((NestedScrollOnTouchTracker$handleTouch$2) create(coroutineScope, continuation)).invokeSuspend(Unit.f21442a);
    }

    
    
    
    
    @Override 
    
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        
        throw new UnsupportedOperationException("Method not decompiled: com.discord.react_gesture_handler.nested_touch.NestedScrollOnTouchTracker$handleTouch$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
