package com.discord.chat.presentation.textutils;

import android.view.View;
import com.discord.chat.bridge.contentnode.ContentNode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.s;


@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke", "(Landroid/view/View;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)

public final class TextUtilsKt$toSpannable$12$click$7 extends s implements Function1<View, Boolean> {
    final  ContentNode $contentNode;
    final  RenderContext $rc;

    
    
    public TextUtilsKt$toSpannable$12$click$7(RenderContext renderContext, ContentNode contentNode) {
        super(1);
        this.$rc = renderContext;
        this.$contentNode = contentNode;
    }

    
    public final Boolean invoke(View it) {
        q.g(it, "it");
        this.$rc.getOnLongPressCommand().invoke(this.$contentNode);
        return Boolean.TRUE;
    }
}
