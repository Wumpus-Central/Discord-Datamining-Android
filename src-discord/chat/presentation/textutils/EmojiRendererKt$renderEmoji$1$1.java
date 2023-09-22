package com.discord.chat.presentation.textutils;

import android.graphics.drawable.ColorDrawable;
import com.discord.theme.DiscordTheme;
import com.discord.theme.ThemeManagerKt;
import com.facebook.drawee.generic.GenericDraweeHierarchyBuilder;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.s;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/facebook/drawee/generic/GenericDraweeHierarchyBuilder;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)

final class EmojiRendererKt$renderEmoji$1$1 extends s implements Function1<GenericDraweeHierarchyBuilder, Unit> {
    final  RenderContext $rc;

    
    
    public EmojiRendererKt$renderEmoji$1$1(RenderContext renderContext) {
        super(1);
        this.$rc = renderContext;
    }

    @Override 
    public   Unit invoke(GenericDraweeHierarchyBuilder genericDraweeHierarchyBuilder) {
        invoke2(genericDraweeHierarchyBuilder);
        return Unit.f21600a;
    }

    
    public final void invoke2(GenericDraweeHierarchyBuilder renderEmojiInto) {
        q.h(renderEmojiInto, "$this$renderEmojiInto");
        int i10 = 0;
        renderEmojiInto.D(new ColorDrawable(0));
        renderEmojiInto.z(0);
        if (this.$rc.spoilerExists()) {
            boolean spoilerIsRevealed = this.$rc.spoilerIsRevealed();
            DiscordTheme theme = ThemeManagerKt.getTheme();
            int spoilerRevealedBackground = spoilerIsRevealed ? theme.getSpoilerRevealedBackground() : theme.getSpoilerHiddenBackground();
            if (!spoilerIsRevealed) {
                i10 = ThemeManagerKt.getTheme().getSpoilerHiddenBackground();
            }
            renderEmojiInto.x(new ColorDrawable(spoilerRevealedBackground));
            renderEmojiInto.C(new ColorDrawable(i10));
        }
    }
}
