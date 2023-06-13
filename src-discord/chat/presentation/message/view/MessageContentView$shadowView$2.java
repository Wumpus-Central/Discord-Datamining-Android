package com.discord.chat.presentation.message.view;

import android.view.ViewGroup;
import com.facebook.drawee.span.SimpleDraweeSpanTextView;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.s;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/facebook/drawee/span/SimpleDraweeSpanTextView;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
final class MessageContentView$shadowView$2 extends s implements Function0<SimpleDraweeSpanTextView> {
    final /* synthetic */ MessageContentView this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MessageContentView$shadowView$2(MessageContentView messageContentView) {
        super(0);
        this.this$0 = messageContentView;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final SimpleDraweeSpanTextView invoke() {
        SimpleDraweeSpanTextView simpleDraweeSpanTextView = new SimpleDraweeSpanTextView(this.this$0.getContext());
        simpleDraweeSpanTextView.setBreakStrategy(this.this$0.getBreakStrategy());
        simpleDraweeSpanTextView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        return simpleDraweeSpanTextView;
    }
}
