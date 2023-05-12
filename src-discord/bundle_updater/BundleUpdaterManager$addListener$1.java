package com.discord.bundle_updater;

import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.s;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "versionRequired", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class BundleUpdaterManager$addListener$1 extends s implements Function1<Boolean, Unit> {
    final /* synthetic */ BundleUpdaterManager this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BundleUpdaterManager$addListener$1(BundleUpdaterManager bundleUpdaterManager) {
        super(1);
        this.this$0 = bundleUpdaterManager;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
        invoke(bool.booleanValue());
        return Unit.f22036a;
    }

    public final void invoke(boolean z10) {
        DeviceEventManagerModule.RCTDeviceEventEmitter eventEmitter;
        WritableNativeMap nativeMap;
        eventEmitter = this.this$0.getEventEmitter();
        nativeMap = this.this$0.getNativeMap(z10);
        eventEmitter.emit("BundleDownloaded", nativeMap);
    }
}
