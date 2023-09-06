package com.discord.chat.presentation.list.messagebundling;

import android.view.View;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.s;


@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "view", "Landroid/view/View;", "<anonymous parameter 1>", "", "height", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)

public final class MessageBundleAdapter$delegates$2 extends s implements Function3<View, Integer, Integer, Unit> {
    final  MessageBundleAdapter this$0;

    
    
    public MessageBundleAdapter$delegates$2(MessageBundleAdapter messageBundleAdapter) {
        super(3);
        this.this$0 = messageBundleAdapter;
    }

    @Override 
    public   Unit invoke(View view, Integer num, Integer num2) {
        invoke(view, num.intValue(), num2.intValue());
        return Unit.f21436a;
    }

    public final void invoke(View view, int i10, int i11) {
        q.h(view, "view");
        this.this$0.handleTruncation(view, i11);
    }
}
