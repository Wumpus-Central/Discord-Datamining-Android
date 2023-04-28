package com.discord.media.engine;

import com.discord.media.engine.types.NativeTypeExtensionsKt;
import com.discord.p047native.engine.AudioInputDeviceDescription;
import com.discord.p047native.engine.AudioOutputDeviceDescription;
import com.discord.p047native.engine.NativeEngine;
import com.discord.p047native.engine.VideoInputDeviceDescription;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.C9677q;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(m15074d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003H\n¢\u0006\u0004\b\t\u0010\n"}, m15073d2 = {"<anonymous>", "", "inputDevices", "", "Lcom/discord/native/engine/AudioInputDeviceDescription;", "outputDevices", "Lcom/discord/native/engine/AudioOutputDeviceDescription;", "videoInputDevices", "Lcom/discord/native/engine/VideoInputDeviceDescription;", "onChange", "([Lcom/discord/native/engine/AudioInputDeviceDescription;[Lcom/discord/native/engine/AudioOutputDeviceDescription;[Lcom/discord/native/engine/VideoInputDeviceDescription;)V"}, m15072k = 3, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes5.dex */
public final class MediaEngine$setDeviceChangeCallback$1$1 implements NativeEngine.DeviceChangeCallback {
    final /* synthetic */ Function3<List<? extends Map<String, ? extends Object>>, List<? extends Map<String, ? extends Object>>, List<? extends Map<String, ? extends Object>>, Unit> $callback;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    public MediaEngine$setDeviceChangeCallback$1$1(Function3<? super List<? extends Map<String, ? extends Object>>, ? super List<? extends Map<String, ? extends Object>>, ? super List<? extends Map<String, ? extends Object>>, Unit> function3) {
        this.$callback = function3;
    }

    @Override // com.discord.p047native.engine.NativeEngine.DeviceChangeCallback
    public final void onChange(AudioInputDeviceDescription[] inputDevices, AudioOutputDeviceDescription[] outputDevices, VideoInputDeviceDescription[] videoInputDevices) {
        C9677q.m14633g(inputDevices, "inputDevices");
        C9677q.m14633g(outputDevices, "outputDevices");
        C9677q.m14633g(videoInputDevices, "videoInputDevices");
        this.$callback.invoke(NativeTypeExtensionsKt.toListOfMaps(inputDevices), NativeTypeExtensionsKt.toListOfMaps(outputDevices), NativeTypeExtensionsKt.toListOfMaps(videoInputDevices));
    }
}
