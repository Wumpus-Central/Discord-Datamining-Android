package com.discord.notifications.fcm;

import com.discord.notifications.client.NotificationClient;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9674n;
import kotlin.jvm.internal.C9677q;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(m15072k = 3, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes3.dex */
public /* synthetic */ class MessagingService$Companion$init$1 extends C9674n implements Function1<String, Unit> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public MessagingService$Companion$init$1(Object obj) {
        super(1, obj, NotificationClient.class, "setToken", "setToken(Ljava/lang/String;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(String str) {
        invoke2(str);
        return Unit.f25780a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(String p0) {
        C9677q.m14633g(p0, "p0");
        ((NotificationClient) this.receiver).setToken(p0);
    }
}
