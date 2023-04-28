package com.discord.notifications.react;

import com.discord.react.utilities.NativeMapExtensionsKt;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC9679s;
import kotlin.jvm.internal.C9677q;

@Metadata(m15074d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0014\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, m15073d2 = {"<anonymous>", "", "notification", "", "", "invoke"}, m15072k = 3, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes3.dex */
final class PushNotificationModule$registerEventListener$3 extends AbstractC9679s implements Function1<Map<String, ? extends String>, Unit> {
    final /* synthetic */ PushNotificationModule this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PushNotificationModule$registerEventListener$3(PushNotificationModule pushNotificationModule) {
        super(1);
        this.this$0 = pushNotificationModule;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Map<String, ? extends String> map) {
        invoke2((Map<String, String>) map);
        return Unit.f25780a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Map<String, String> notification) {
        DeviceEventManagerModule.RCTDeviceEventEmitter eventEmitter;
        C9677q.m14633g(notification, "notification");
        eventEmitter = this.this$0.getEventEmitter();
        eventEmitter.emit("localNotification", NativeMapExtensionsKt.toNativeMap(notification));
    }
}
