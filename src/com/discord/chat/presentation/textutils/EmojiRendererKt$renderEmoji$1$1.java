package com.discord.chat.presentation.textutils;

import android.graphics.drawable.ColorDrawable;
import com.discord.theme.DiscordTheme;
import com.discord.theme.ThemeManagerKt;
import com.facebook.drawee.generic.GenericDraweeHierarchyBuilder;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC9973s;
import kotlin.jvm.internal.C9971q;

@Metadata(m15074d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, m15073d2 = {"<anonymous>", "", "Lcom/facebook/drawee/generic/GenericDraweeHierarchyBuilder;", "invoke"}, m15072k = 3, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes4.dex */
final class EmojiRendererKt$renderEmoji$1$1 extends AbstractC9973s implements Function1<GenericDraweeHierarchyBuilder, Unit> {
    final /* synthetic */ RenderContext $rc;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EmojiRendererKt$renderEmoji$1$1(RenderContext renderContext) {
        super(1);
        this.$rc = renderContext;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(GenericDraweeHierarchyBuilder genericDraweeHierarchyBuilder) {
        invoke2(genericDraweeHierarchyBuilder);
        return Unit.f22042a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(GenericDraweeHierarchyBuilder renderEmojiInto) {
        C9971q.m14633g(renderEmojiInto, "$this$renderEmojiInto");
        int i = 0;
        renderEmojiInto.m31764D(new ColorDrawable(0));
        renderEmojiInto.m31730z(0);
        if (this.$rc.spoilerExists()) {
            boolean spoilerIsRevealed = this.$rc.spoilerIsRevealed();
            DiscordTheme theme = ThemeManagerKt.getTheme();
            int spoilerRevealedBackground = spoilerIsRevealed ? theme.getSpoilerRevealedBackground() : theme.getSpoilerHiddenBackground();
            if (!spoilerIsRevealed) {
                i = ThemeManagerKt.getTheme().getSpoilerHiddenBackground();
            }
            renderEmojiInto.m31732x(new ColorDrawable(spoilerRevealedBackground));
            renderEmojiInto.m31765C(new ColorDrawable(i));
        }
    }
}
