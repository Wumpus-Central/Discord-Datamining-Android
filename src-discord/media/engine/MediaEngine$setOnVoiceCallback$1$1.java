package com.discord.media.engine;

import com.discord.p000native.engine.NativeEngine;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "level", "", "speaking", "", "onVoice"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
final class MediaEngine$setOnVoiceCallback$1$1 implements NativeEngine.OnVoiceCallback {
    final /* synthetic */ Function2<Float, Integer, Unit> $cb;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    public MediaEngine$setOnVoiceCallback$1$1(Function2<? super Float, ? super Integer, Unit> function2) {
        this.$cb = function2;
    }

    @Override // com.discord.p000native.engine.NativeEngine.OnVoiceCallback
    public final void onVoice(float f10, int i10) {
        this.$cb.invoke(Float.valueOf(f10), Integer.valueOf(i10));
    }
}
