package com.discord.chat.presentation.textutils;

import android.view.View;
import com.discord.chat.bridge.spoiler.SpoilerManager;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC9679s;
import kotlin.jvm.internal.C9677q;

@Metadata(m15074d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m15073d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, m15072k = 3, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes4.dex */
final class TextUtilsKt$toSpannable$12$click$9 extends AbstractC9679s implements Function1<View, Unit> {
    final /* synthetic */ String $id;
    final /* synthetic */ RenderContext $rc;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextUtilsKt$toSpannable$12$click$9(String str, RenderContext renderContext) {
        super(1);
        this.$id = str;
        this.$rc = renderContext;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(View view) {
        invoke2(view);
        return Unit.f25780a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(View it) {
        C9677q.m14633g(it, "it");
        SpoilerManager.INSTANCE.m41695markRevealedV2PEE7g(this.$id);
        this.$rc.getOnTapSpoiler().invoke();
    }
}
