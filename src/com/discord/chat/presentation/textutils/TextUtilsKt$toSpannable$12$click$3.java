package com.discord.chat.presentation.textutils;

import android.view.View;
import com.discord.chat.bridge.contentnode.ContentNode;
import com.discord.chat.bridge.contentnode.UserOrRoleMentionContentNode;
import com.discord.primitives.UserId;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC9679s;
import kotlin.jvm.internal.C9677q;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(m15074d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m15073d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, m15072k = 3, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes4.dex */
public final class TextUtilsKt$toSpannable$12$click$3 extends AbstractC9679s implements Function1<View, Unit> {
    final /* synthetic */ ContentNode $contentNode;
    final /* synthetic */ RenderContext $rc;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextUtilsKt$toSpannable$12$click$3(RenderContext renderContext, ContentNode contentNode) {
        super(1);
        this.$rc = renderContext;
        this.$contentNode = contentNode;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(View view) {
        invoke2(view);
        return Unit.f25780a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(View it) {
        C9677q.m14633g(it, "it");
        this.$rc.getOnTapMention().invoke(UserId.m42160toStringimpl(((UserOrRoleMentionContentNode) this.$contentNode).m41664getUserIdwUX8bhU().m42162unboximpl()), String.valueOf(((UserOrRoleMentionContentNode) this.$contentNode).m41661getChannelIdqMVnFVQ()));
    }
}
