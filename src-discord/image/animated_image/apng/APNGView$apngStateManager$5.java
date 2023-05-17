package com.discord.image.animated_image.apng;

import com.discord.image.animated_image.apng.APNGView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.s;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "config", "Lcom/discord/image/animated_image/apng/APNGView$Config;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class APNGView$apngStateManager$5 extends s implements Function1<APNGView.Config, Unit> {
    final /* synthetic */ APNGView this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public APNGView$apngStateManager$5(APNGView aPNGView) {
        super(1);
        this.this$0 = aPNGView;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(APNGView.Config config) {
        invoke2(config);
        return Unit.f22036a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(APNGView.Config config) {
        q.g(config, "config");
        this.this$0.fetchAPNG(config);
    }
}
