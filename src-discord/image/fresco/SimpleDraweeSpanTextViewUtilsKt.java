package com.discord.image.fresco;

import com.facebook.drawee.span.DraweeSpanStringBuilder;
import com.facebook.drawee.span.SimpleDraweeSpanTextView;
import kotlin.Metadata;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004¨\u0006\u0005"}, d2 = {"setOptionalText", "", "Lcom/facebook/drawee/span/SimpleDraweeSpanTextView;", "builder", "Lcom/facebook/drawee/span/DraweeSpanStringBuilder;", "fresco_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SimpleDraweeSpanTextViewUtilsKt {
    public static final void setOptionalText(SimpleDraweeSpanTextView simpleDraweeSpanTextView, DraweeSpanStringBuilder draweeSpanStringBuilder) {
        int i10;
        q.g(simpleDraweeSpanTextView, "<this>");
        if (draweeSpanStringBuilder != null) {
            simpleDraweeSpanTextView.setDraweeSpanStringBuilder(draweeSpanStringBuilder);
            i10 = 0;
        } else {
            i10 = 8;
        }
        simpleDraweeSpanTextView.setVisibility(i10);
    }
}
