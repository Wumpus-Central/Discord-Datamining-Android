package com.discord.chat.presentation.message.utils;

import android.text.style.LeadingMarginSpan;
import android.text.style.StyleSpan;
import android.view.View;
import com.facebook.drawee.span.DraweeSpanStringBuilder;
import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;

@Metadata(m15074d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\u001a\u0016\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0001\u001a\u0016\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, m15073d2 = {"createReplyContent", "Lcom/facebook/drawee/span/DraweeSpanStringBuilder;", "referenceView", "Landroid/view/View;", "builder", "createSystemReplyContent", "content", "", "chat_release"}, m15072k = 2, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes4.dex */
public final class ReplyUtilsKt {
    public static final DraweeSpanStringBuilder createReplyContent(View referenceView, DraweeSpanStringBuilder builder) {
        C9971q.m14633g(referenceView, "referenceView");
        C9971q.m14633g(builder, "builder");
        referenceView.measure(0, 0);
        builder.setSpan(new LeadingMarginSpan.Standard(referenceView.getMeasuredWidth(), 0), 0, builder.length(), 33);
        return builder;
    }

    public static final DraweeSpanStringBuilder createSystemReplyContent(View referenceView, String content) {
        C9971q.m14633g(referenceView, "referenceView");
        C9971q.m14633g(content, "content");
        DraweeSpanStringBuilder draweeSpanStringBuilder = new DraweeSpanStringBuilder(content);
        draweeSpanStringBuilder.setSpan(new StyleSpan(2), 0, draweeSpanStringBuilder.length(), 33);
        return createReplyContent(referenceView, draweeSpanStringBuilder);
    }
}
