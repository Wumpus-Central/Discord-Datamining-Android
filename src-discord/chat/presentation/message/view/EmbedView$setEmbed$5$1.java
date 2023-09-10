package com.discord.chat.presentation.message.view;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.s;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "portal", "", "invoke", "(Ljava/lang/Double;)V"}, k = 3, mv = {1, 8, 0}, xi = 48)

final class EmbedView$setEmbed$5$1 extends s implements Function1<Double, Unit> {
    final  int $index;
    final  Function2<Double, Integer, Unit> $onMediaClicked;

    
    
    
    public EmbedView$setEmbed$5$1(Function2<? super Double, ? super Integer, Unit> function2, int i10) {
        super(1);
        this.$onMediaClicked = function2;
        this.$index = i10;
    }

    @Override 
    public   Unit invoke(Double d10) {
        invoke2(d10);
        return Unit.f21442a;
    }

    
    public final void invoke2(Double d10) {
        this.$onMediaClicked.invoke(d10, Integer.valueOf(this.$index));
    }
}
