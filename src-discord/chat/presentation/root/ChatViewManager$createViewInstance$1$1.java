package com.discord.chat.presentation.root;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.s;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Integer;"}, k = 3, mv = {1, 8, 0}, xi = 48)

final class ChatViewManager$createViewInstance$1$1 extends s implements Function0<Integer> {
    final  ChatView $chatView;

    
    
    public ChatViewManager$createViewInstance$1$1(ChatView chatView) {
        super(0);
        this.$chatView = chatView;
    }

    
    @Override 
    public final Integer invoke() {
        return Integer.valueOf(this.$chatView.getId());
    }
}
