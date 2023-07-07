package com.discord.media.engine;

import com.discord.p000native.engine.NativeEngine;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "subsystem", "", "audioLayer", "onAudioSubsystem"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
final class MediaEngine$getAudioSubsystem$1$1 implements NativeEngine.GetAudioSubsystemCallback {
    final /* synthetic */ Function2<String, String, Unit> $cb;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    public MediaEngine$getAudioSubsystem$1$1(Function2<? super String, ? super String, Unit> function2) {
        this.$cb = function2;
    }

    @Override // com.discord.p000native.engine.NativeEngine.GetAudioSubsystemCallback
    public final void onAudioSubsystem(String subsystem, String audioLayer) {
        q.g(subsystem, "subsystem");
        q.g(audioLayer, "audioLayer");
        this.$cb.invoke(subsystem, audioLayer);
    }
}
