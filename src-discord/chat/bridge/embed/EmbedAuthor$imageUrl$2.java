package com.discord.chat.bridge.embed;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.s;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)

final class EmbedAuthor$imageUrl$2 extends s implements Function0<String> {
    final  EmbedAuthor this$0;

    
    
    public EmbedAuthor$imageUrl$2(EmbedAuthor embedAuthor) {
        super(0);
        this.this$0 = embedAuthor;
    }

    @Override 
    public final String invoke() {
        return this.this$0.getIconProxyURL();
    }
}
