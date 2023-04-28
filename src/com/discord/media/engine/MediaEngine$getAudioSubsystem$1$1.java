package com.discord.media.engine;

import com.discord.p047native.engine.NativeEngine;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C9971q;

@Metadata(m15074d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0005"}, m15073d2 = {"<anonymous>", "", "subsystem", "", "audioLayer", "onAudioSubsystem"}, m15072k = 3, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes5.dex */
final class MediaEngine$getAudioSubsystem$1$1 implements NativeEngine.GetAudioSubsystemCallback {
    final /* synthetic */ Function2<String, String, Unit> $cb;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    public MediaEngine$getAudioSubsystem$1$1(Function2<? super String, ? super String, Unit> function2) {
        this.$cb = function2;
    }

    @Override // com.discord.p047native.engine.NativeEngine.GetAudioSubsystemCallback
    public final void onAudioSubsystem(String subsystem, String audioLayer) {
        C9971q.m14633g(subsystem, "subsystem");
        C9971q.m14633g(audioLayer, "audioLayer");
        this.$cb.invoke(subsystem, audioLayer);
    }
}
