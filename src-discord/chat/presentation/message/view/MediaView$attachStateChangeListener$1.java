package com.discord.chat.presentation.message.view;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.s;


@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "mediaViewAttached", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)

public final class MediaView$attachStateChangeListener$1 extends s implements Function1<Boolean, Unit> {
    final  MediaView this$0;

    
    
    public MediaView$attachStateChangeListener$1(MediaView mediaView) {
        super(1);
        this.this$0 = mediaView;
    }

    @Override 
    public   Unit invoke(Boolean bool) {
        invoke(bool.booleanValue());
        return Unit.f21210a;
    }

    public final void invoke(boolean z10) {
        if (z10) {
            MediaView.setMediaData$default(this.this$0, null, false, false, false, null, false, null, null, false, false, false, 2045, null);
        } else {
            MediaView.setMediaData$default(this.this$0, null, true, false, false, null, false, null, null, false, false, false, 2041, null);
        }
    }
}
