package com.discord.timers;

import com.discord.reactevents.ReactEvents;
import com.discord.timers.reactevents.IntervalEvent;
import com.facebook.react.bridge.ReactApplicationContext;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.s;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)

final class TimersModule$setInterval$1 extends s implements Function0<Unit> {
    final  int $id;
    final  TimersModule this$0;

    
    
    public TimersModule$setInterval$1(TimersModule timersModule, int i10) {
        super(0);
        this.this$0 = timersModule;
        this.$id = i10;
    }

    @Override 
    
    public final void invoke2() {
        ReactEvents reactEvents;
        ReactApplicationContext reactApplicationContext;
        reactEvents = this.this$0.reactEvents;
        reactApplicationContext = this.this$0.getReactApplicationContext();
        q.f(reactApplicationContext, "reactApplicationContext");
        reactEvents.emitModuleEvent(reactApplicationContext, new IntervalEvent(this.$id));
    }
}
