package com.discord.chat.presentation.textutils;

import android.view.View;
import com.discord.chat.bridge.contentnode.ContentNode;
import com.discord.chat.bridge.contentnode.UserOrRoleMentionContentNode;
import com.discord.primitives.UserId;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.s;


@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)

public final class TextUtilsKt$toSpannable$12$click$3 extends s implements Function1<View, Unit> {
    final  ContentNode $contentNode;
    final  RenderContext $rc;

    
    
    public TextUtilsKt$toSpannable$12$click$3(RenderContext renderContext, ContentNode contentNode) {
        super(1);
        this.$rc = renderContext;
        this.$contentNode = contentNode;
    }

    @Override 
    public   Unit invoke(View view) {
        invoke2(view);
        return Unit.f21213a;
    }

    
    public final void invoke2(View it) {
        q.h(it, "it");
        this.$rc.getOnTapMention().invoke(UserId.m660toStringimpl(((UserOrRoleMentionContentNode) this.$contentNode).m110getUserIdwUX8bhU().m662unboximpl()), String.valueOf(((UserOrRoleMentionContentNode) this.$contentNode).m107getChannelIdqMVnFVQ()));
    }
}
