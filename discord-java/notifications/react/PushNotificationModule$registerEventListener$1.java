package com.discord.notifications.react;

import com.discord.react.utilities.NativeMapExtensionsKt;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.s;
import nf.x;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "token", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
final class PushNotificationModule$registerEventListener$1 extends s implements Function1<String, Unit> {
    final /* synthetic */ PushNotificationModule this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PushNotificationModule$registerEventListener$1(PushNotificationModule pushNotificationModule) {
        super(1);
        this.this$0 = pushNotificationModule;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(String str) {
        invoke2(str);
        return Unit.f22042a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(String token) {
        DeviceEventManagerModule.RCTDeviceEventEmitter eventEmitter;
        q.g(token, "token");
        eventEmitter = this.this$0.getEventEmitter();
        eventEmitter.emit("register", NativeMapExtensionsKt.nativeMapOf(x.a("token", token)));
    }
}
