package com.discord.sticker.sticker_types;

import com.discord.sticker.sticker_types.RLottieImageView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.s;


@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/discord/sticker/sticker_types/RLottieImageView$Config;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)

public final class RLottieImageView$rLottieStateManager$3 extends s implements Function1<RLottieImageView.Config, Unit> {
    final  RLottieImageView this$0;

    
    
    public RLottieImageView$rLottieStateManager$3(RLottieImageView rLottieImageView) {
        super(1);
        this.this$0 = rLottieImageView;
    }

    @Override 
    public   Unit invoke(RLottieImageView.Config config) {
        invoke2(config);
        return Unit.f21215a;
    }

    
    public final void invoke2(RLottieImageView.Config it) {
        q.h(it, "it");
        this.this$0.recycle(false);
    }
}
