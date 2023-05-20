package com.discord.notifications.fcm;

import com.discord.notifications.client.NotificationClient;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.n;
import kotlin.jvm.internal.q;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public /* synthetic */ class MessagingService$Companion$init$1 extends n implements Function1<String, Unit> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public MessagingService$Companion$init$1(Object obj) {
        super(1, obj, NotificationClient.class, "setToken", "setToken(Ljava/lang/String;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(String str) {
        invoke2(str);
        return Unit.f22076a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(String p02) {
        q.g(p02, "p0");
        ((NotificationClient) this.receiver).setToken(p02);
    }
}
