package com.discord.image.animated_image.apng;

import com.discord.image.animated_image.apng.APNGView;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC9973s;
import kotlin.jvm.internal.C9971q;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(m15074d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m15073d2 = {"<anonymous>", "", "config", "Lcom/discord/image/animated_image/apng/APNGView$Config;", "invoke", "(Lcom/discord/image/animated_image/apng/APNGView$Config;)Ljava/lang/Boolean;"}, m15072k = 3, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes5.dex */
public final class APNGView$apngStateManager$4 extends AbstractC9973s implements Function1<APNGView.Config, Boolean> {
    final /* synthetic */ APNGView this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public APNGView$apngStateManager$4(APNGView aPNGView) {
        super(1);
        this.this$0 = aPNGView;
    }

    public final Boolean invoke(APNGView.Config config) {
        boolean z;
        boolean hasFilename;
        C9971q.m14633g(config, "config");
        if (this.this$0.isAttachedToWindow()) {
            hasFilename = APNGView.Companion.hasFilename(config.getUrl());
            if (hasFilename) {
                z = true;
                return Boolean.valueOf(z);
            }
        }
        z = false;
        return Boolean.valueOf(z);
    }
}
