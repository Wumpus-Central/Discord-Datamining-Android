package com.discord.chat.presentation.message;

import com.discord.react_strings.RenderContext;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.s;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/discord/react_strings/RenderContext;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)

final class MessageViewAccessibilityDelegate$getReferencedMessageLabel$1 extends s implements Function1<RenderContext, Unit> {
    final  String $username;

    
    
    public MessageViewAccessibilityDelegate$getReferencedMessageLabel$1(String str) {
        super(1);
        this.$username = str;
    }

    @Override 
    public   Unit invoke(RenderContext renderContext) {
        invoke2(renderContext);
        return Unit.f21601a;
    }

    
    public final void invoke2(RenderContext i18nFormat) {
        q.h(i18nFormat, "$this$i18nFormat");
        i18nFormat.getArgs().put("username", this.$username);
    }
}
