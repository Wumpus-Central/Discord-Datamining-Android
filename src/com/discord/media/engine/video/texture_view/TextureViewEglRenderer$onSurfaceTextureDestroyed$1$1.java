package com.discord.media.engine.video.texture_view;

import java.util.concurrent.CountDownLatch;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC9679s;

@Metadata(m15074d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m15073d2 = {"<anonymous>", "", "invoke"}, m15072k = 3, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes5.dex */
final class TextureViewEglRenderer$onSurfaceTextureDestroyed$1$1 extends AbstractC9679s implements Function0<Unit> {
    final /* synthetic */ CountDownLatch $completionLatch;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextureViewEglRenderer$onSurfaceTextureDestroyed$1$1(CountDownLatch countDownLatch) {
        super(0);
        this.$completionLatch = countDownLatch;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$completionLatch.countDown();
    }
}
