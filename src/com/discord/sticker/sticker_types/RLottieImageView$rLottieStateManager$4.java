package com.discord.sticker.sticker_types;

import com.discord.sticker.sticker_types.RLottieImageView;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC9679s;
import kotlin.jvm.internal.C9677q;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(m15074d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m15073d2 = {"<anonymous>", "", "it", "Lcom/discord/sticker/sticker_types/RLottieImageView$Config;", "invoke", "(Lcom/discord/sticker/sticker_types/RLottieImageView$Config;)Ljava/lang/Boolean;"}, m15072k = 3, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes7.dex */
public final class RLottieImageView$rLottieStateManager$4 extends AbstractC9679s implements Function1<RLottieImageView.Config, Boolean> {
    final /* synthetic */ RLottieImageView this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RLottieImageView$rLottieStateManager$4(RLottieImageView rLottieImageView) {
        super(1);
        this.this$0 = rLottieImageView;
    }

    public final Boolean invoke(RLottieImageView.Config it) {
        C9677q.m14633g(it, "it");
        return Boolean.valueOf(this.this$0.isAttachedToWindow());
    }
}
