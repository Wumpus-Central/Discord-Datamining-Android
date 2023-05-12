package com.discord.chat.presentation.message;

import com.discord.chat.presentation.message.viewholder.MessagePartViewHolder;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.s;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class MessageAccessoriesAdapter$onBindViewHolder$21 extends s implements Function1<Integer, Unit> {
    final /* synthetic */ MessagePartViewHolder $holder;
    final /* synthetic */ MessageAccessoriesAdapter this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MessageAccessoriesAdapter$onBindViewHolder$21(MessageAccessoriesAdapter messageAccessoriesAdapter, MessagePartViewHolder messagePartViewHolder) {
        super(1);
        this.this$0 = messageAccessoriesAdapter;
        this.$holder = messagePartViewHolder;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
        invoke(num.intValue());
        return Unit.f22036a;
    }

    public final void invoke(int i10) {
        Function1 function1;
        function1 = this.this$0.onTapSpoiler;
        function1.invoke(this.$holder);
    }
}
