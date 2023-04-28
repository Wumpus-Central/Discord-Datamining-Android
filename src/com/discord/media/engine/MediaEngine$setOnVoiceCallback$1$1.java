package com.discord.media.engine;

import com.discord.p047native.engine.NativeEngine;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

@Metadata(m15074d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, m15073d2 = {"<anonymous>", "", "level", "", "speaking", "", "onVoice"}, m15072k = 3, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes5.dex */
final class MediaEngine$setOnVoiceCallback$1$1 implements NativeEngine.OnVoiceCallback {
    final /* synthetic */ Function2<Float, Integer, Unit> $cb;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    public MediaEngine$setOnVoiceCallback$1$1(Function2<? super Float, ? super Integer, Unit> function2) {
        this.$cb = function2;
    }

    @Override // com.discord.p047native.engine.NativeEngine.OnVoiceCallback
    public final void onVoice(float f, int i) {
        this.$cb.invoke(Float.valueOf(f), Integer.valueOf(i));
    }
}
