package com.discord.chat.bridge;

import com.discord.misc.utilities.size.SizeUtilsKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.s;


@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Integer;"}, k = 3, mv = {1, 8, 0}, xi = 48)

public final class Message$constrainedWidth$2 extends s implements Function0<Integer> {
    final  Message this$0;

    
    
    public Message$constrainedWidth$2(Message message) {
        super(0);
        this.this$0 = message;
    }

    
    @Override 
    public final Integer invoke() {
        Float f10 = this.this$0.get_constrainedWidth();
        if (f10 != null) {
            return Integer.valueOf(SizeUtilsKt.getDpToPx(f10.floatValue()));
        }
        return null;
    }
}
