package com.discord.chat.input.views;

import com.discord.chat.input.views.ChatInputRootView;
import com.discord.misc.utilities.size.SizeUtilsKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC9973s;

@Metadata(m15074d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m15073d2 = {"<anonymous>", "", "height", "", "invoke"}, m15072k = 3, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes4.dex */
final class ChatInputRootView$lineHeightMeasurer$1 extends AbstractC9973s implements Function1<Integer, Unit> {
    final /* synthetic */ ChatInputRootView this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatInputRootView$lineHeightMeasurer$1(ChatInputRootView chatInputRootView) {
        super(1);
        this.this$0 = chatInputRootView;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
        invoke(num.intValue());
        return Unit.f22042a;
    }

    public final void invoke(int i) {
        ChatInputRootView.ChatInputListener listener = this.this$0.getListener();
        if (listener != null) {
            listener.onContentSizeChange((int) SizeUtilsKt.getPxToDp(this.this$0.getWidth()), (int) SizeUtilsKt.getPxToDp(i));
        }
    }
}
