package com.discord.bug_reporter;

import com.discord.react.utilities.NativeMapExtensionsKt;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC9973s;

@Metadata(m15074d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m15073d2 = {"<anonymous>", "", "invoke"}, m15072k = 3, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes.dex */
final class ScreenshotHelperModule$addListener$1 extends AbstractC9973s implements Function0<Unit> {
    final /* synthetic */ ScreenshotHelperModule this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScreenshotHelperModule$addListener$1(ScreenshotHelperModule screenshotHelperModule) {
        super(0);
        this.this$0 = screenshotHelperModule;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        DeviceEventManagerModule.RCTDeviceEventEmitter eventEmitter;
        eventEmitter = this.this$0.getEventEmitter();
        eventEmitter.emit("screenshotTaken", NativeMapExtensionsKt.nativeMapOf(new Pair[0]));
    }
}
