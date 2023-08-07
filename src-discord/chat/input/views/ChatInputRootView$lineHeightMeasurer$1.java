package com.discord.chat.input.views;

import com.discord.chat.input.views.ChatInputRootView;
import com.discord.misc.utilities.size.SizeUtilsKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.s;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "height", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)

final class ChatInputRootView$lineHeightMeasurer$1 extends s implements Function1<Integer, Unit> {
    final  ChatInputRootView this$0;

    
    
    public ChatInputRootView$lineHeightMeasurer$1(ChatInputRootView chatInputRootView) {
        super(1);
        this.this$0 = chatInputRootView;
    }

    @Override 
    public   Unit invoke(Integer num) {
        invoke(num.intValue());
        return Unit.f21025a;
    }

    public final void invoke(int i10) {
        ChatInputRootView.ChatInputListener listener = this.this$0.getListener();
        if (listener != null) {
            listener.onContentSizeChange((int) SizeUtilsKt.getPxToDp(this.this$0.getWidth()), (int) SizeUtilsKt.getPxToDp(i10));
        }
    }
}
