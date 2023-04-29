package com.discord.audio;

import com.discord.audio.DiscordAudioManager;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.s;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "device", "Lcom/discord/audio/DiscordAudioManager$DeviceTypes;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class AudioManagerModule$initialize$2 extends s implements Function1<DiscordAudioManager.DeviceTypes, Unit> {
    final /* synthetic */ DeviceEventManagerModule.RCTDeviceEventEmitter $eventEmitter;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AudioManagerModule$initialize$2(DeviceEventManagerModule.RCTDeviceEventEmitter rCTDeviceEventEmitter) {
        super(1);
        this.$eventEmitter = rCTDeviceEventEmitter;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(DiscordAudioManager.DeviceTypes deviceTypes) {
        invoke2(deviceTypes);
        return Unit.f22034a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(DiscordAudioManager.DeviceTypes device) {
        q.g(device, "device");
        DeviceEventManagerModule.RCTDeviceEventEmitter rCTDeviceEventEmitter = this.$eventEmitter;
        WritableMap createMap = Arguments.createMap();
        createMap.putString("device", device.toString());
        Unit unit = Unit.f22034a;
        rCTDeviceEventEmitter.emit("android-active-audio-device-changed", createMap);
    }
}
