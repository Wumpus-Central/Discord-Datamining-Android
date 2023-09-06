package com.discord.notifications.react;

import com.discord.notifications.react.events.RegisterEvent;
import com.discord.reactevents.ReactEvents;
import com.facebook.react.bridge.ReactApplicationContext;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.s;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "token", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)

final class PushNotificationModule$registerEventListener$1 extends s implements Function1<String, Unit> {
    final  PushNotificationModule this$0;

    
    
    public PushNotificationModule$registerEventListener$1(PushNotificationModule pushNotificationModule) {
        super(1);
        this.this$0 = pushNotificationModule;
    }

    @Override 
    public   Unit invoke(String str) {
        invoke2(str);
        return Unit.f21436a;
    }

    
    public final void invoke2(String token) {
        ReactEvents reactEvents;
        ReactApplicationContext reactApplicationContext;
        q.h(token, "token");
        reactEvents = this.this$0.reactEvents;
        reactApplicationContext = this.this$0.reactContext;
        reactEvents.emitModuleEvent(reactApplicationContext, new RegisterEvent(token));
    }
}
