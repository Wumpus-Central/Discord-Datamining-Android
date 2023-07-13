package com.discord.progress_dots;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.s;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)

final class ProgressDot$start$2 extends s implements Function0<Unit> {
    final  ProgressDot this$0;

    
    
    public ProgressDot$start$2(ProgressDot progressDot) {
        super(0);
        this.this$0 = progressDot;
    }

    @Override 
    
    public final void invoke2() {
        Function0<Unit> onScaleDownCompleteListener = this.this$0.getOnScaleDownCompleteListener();
        if (onScaleDownCompleteListener != null) {
            onScaleDownCompleteListener.invoke();
        }
    }
}
