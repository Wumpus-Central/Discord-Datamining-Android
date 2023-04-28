package com.discord.chat.presentation.textutils;

import android.view.View;
import com.discord.chat.bridge.contentnode.ContentNode;
import com.discord.chat.bridge.contentnode.LinkContentNode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC9679s;
import kotlin.jvm.internal.C9677q;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(m15074d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m15073d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke", "(Landroid/view/View;)Ljava/lang/Boolean;"}, m15072k = 3, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes4.dex */
public final class TextUtilsKt$toSpannable$12$click$1 extends AbstractC9679s implements Function1<View, Boolean> {
    final /* synthetic */ ContentNode $contentNode;
    final /* synthetic */ RenderContext $rc;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextUtilsKt$toSpannable$12$click$1(ContentNode contentNode, RenderContext renderContext) {
        super(1);
        this.$contentNode = contentNode;
        this.$rc = renderContext;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.discord.chat.bridge.contentnode.ContentNode, java.lang.Object] */
    public final Boolean invoke(View it) {
        boolean z;
        C9677q.m14633g(it, "it");
        if (((LinkContentNode) this.$contentNode).isUrl()) {
            this.$rc.getOnLongTapLink().invoke(this.$contentNode);
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
