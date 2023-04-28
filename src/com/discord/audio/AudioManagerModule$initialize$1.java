package com.discord.audio;

import com.discord.audio.DiscordAudioManager;
import com.discord.react.utilities.NativeArrayExtensionsKt;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC9679s;
import kotlin.jvm.internal.C9677q;

@Metadata(m15074d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, m15073d2 = {"<anonymous>", "", "devices", "", "Lcom/discord/audio/DiscordAudioManager$AudioDevice;", "invoke"}, m15072k = 3, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes.dex */
final class AudioManagerModule$initialize$1 extends AbstractC9679s implements Function1<List<? extends DiscordAudioManager.AudioDevice>, Unit> {
    final /* synthetic */ DeviceEventManagerModule.RCTDeviceEventEmitter $eventEmitter;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AudioManagerModule$initialize$1(DeviceEventManagerModule.RCTDeviceEventEmitter rCTDeviceEventEmitter) {
        super(1);
        this.$eventEmitter = rCTDeviceEventEmitter;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(List<? extends DiscordAudioManager.AudioDevice> list) {
        invoke2((List<DiscordAudioManager.AudioDevice>) list);
        return Unit.f25780a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(List<DiscordAudioManager.AudioDevice> devices) {
        C9677q.m14633g(devices, "devices");
        DeviceEventManagerModule.RCTDeviceEventEmitter rCTDeviceEventEmitter = this.$eventEmitter;
        WritableMap createMap = Arguments.createMap();
        createMap.putArray("devices", NativeArrayExtensionsKt.toNativeArray(AudioManagerModule.Companion.convertDevices(devices)));
        Unit unit = Unit.f25780a;
        rCTDeviceEventEmitter.emit("android-audio-devices-updated", createMap);
    }
}
