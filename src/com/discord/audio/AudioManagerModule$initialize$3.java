package com.discord.audio;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC9973s;

@Metadata(m15074d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m15073d2 = {"<anonymous>", "", "volume", "", "invoke"}, m15072k = 3, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes.dex */
final class AudioManagerModule$initialize$3 extends AbstractC9973s implements Function1<Integer, Unit> {
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
        return Unit.f22042a;
    }

    public final void invoke(int i) {
        DeviceEventManagerModule.RCTDeviceEventEmitter rCTDeviceEventEmitter = this.$eventEmitter;
        WritableMap createMap = Arguments.createMap();
        createMap.putInt("volume", i);
        Unit unit = Unit.f22042a;
        rCTDeviceEventEmitter.emit("android-current-media-volume-changed", createMap);
    }
}
