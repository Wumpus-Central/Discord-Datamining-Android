package com.discord.chat.bridge;

import com.discord.misc.utilities.size.SizeUtilsKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC9973s;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(m15074d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m15073d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Integer;"}, m15072k = 3, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes4.dex */
public final class Message$constrainedWidth$2 extends AbstractC9973s implements Function0<Integer> {
    final /* synthetic */ Message this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Message$constrainedWidth$2(Message message) {
        super(0);
        this.this$0 = message;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final Integer invoke() {
        Float f = this.this$0.get_constrainedWidth();
        if (f != null) {
            return Integer.valueOf(SizeUtilsKt.getDpToPx(f.floatValue()));
        }
        return null;
    }
}
