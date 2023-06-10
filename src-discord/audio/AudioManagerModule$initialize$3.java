package com.discord.audio;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.s;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "volume", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class AudioManagerModule$initialize$3 extends s implements Function1<Integer, Unit> {
    final /* synthetic */ DeviceEventManagerModule.RCTDeviceEventEmitter $eventEmitter;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AudioManagerModule$initialize$3(DeviceEventManagerModule.RCTDeviceEventEmitter rCTDeviceEventEmitter) {
        super(1);
        this.$eventEmitter = rCTDeviceEventEmitter;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
        invoke(num.intValue());
        return Unit.f22104a;
    }

    public final void invoke(int i10) {
        DeviceEventManagerModule.RCTDeviceEventEmitter rCTDeviceEventEmitter = this.$eventEmitter;
        WritableMap createMap = Arguments.createMap();
        createMap.putInt("volume", i10);
        Unit unit = Unit.f22104a;
        rCTDeviceEventEmitter.emit("android-current-media-volume-changed", createMap);
    }
}
