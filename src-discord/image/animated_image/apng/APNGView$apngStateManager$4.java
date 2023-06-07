package com.discord.image.animated_image.apng;

import com.discord.image.animated_image.apng.APNGView;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.s;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "config", "Lcom/discord/image/animated_image/apng/APNGView$Config;", "invoke", "(Lcom/discord/image/animated_image/apng/APNGView$Config;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class APNGView$apngStateManager$4 extends s implements Function1<APNGView.Config, Boolean> {
    final /* synthetic */ APNGView this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public APNGView$apngStateManager$4(APNGView aPNGView) {
        super(1);
        this.this$0 = aPNGView;
    }

    public final Boolean invoke(APNGView.Config config) {
        boolean z10;
        boolean hasFilename;
        q.g(config, "config");
        if (this.this$0.isAttachedToWindow()) {
            hasFilename = APNGView.Companion.hasFilename(config.getUrl());
            if (hasFilename) {
                z10 = true;
                return Boolean.valueOf(z10);
            }
        }
        z10 = false;
        return Boolean.valueOf(z10);
    }
}
