package com.discord.image.animated_image.apng;

import com.discord.image.animated_image.apng.APNGView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.s;


@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "config", "Lcom/discord/image/animated_image/apng/APNGView$Config;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)

public final class APNGView$apngStateManager$3 extends s implements Function1<APNGView.Config, Unit> {
    final  APNGView this$0;

    
    
    public APNGView$apngStateManager$3(APNGView aPNGView) {
        super(1);
        this.this$0 = aPNGView;
    }

    @Override 
    public   Unit invoke(APNGView.Config config) {
        invoke2(config);
        return Unit.f21601a;
    }

    
    public final void invoke2(APNGView.Config config) {
        q.h(config, "config");
        this.this$0.recycle(false, config.getShowLoading());
    }
}
