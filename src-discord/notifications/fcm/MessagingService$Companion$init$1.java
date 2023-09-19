package com.discord.notifications.fcm;

import com.discord.notifications.client.NotificationClient;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.n;
import kotlin.jvm.internal.q;


@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)

public  class MessagingService$Companion$init$1 extends n implements Function1<String, Unit> {
    
    public MessagingService$Companion$init$1(Object obj) {
        super(1, obj, NotificationClient.class, "setToken", "setToken(Ljava/lang/String;)V", 0);
    }

    @Override 
    public   Unit invoke(String str) {
        invoke2(str);
        return Unit.f21444a;
    }

    
    public final void invoke2(String p02) {
        q.h(p02, "p0");
        ((NotificationClient) this.receiver).setToken(p02);
    }
}
