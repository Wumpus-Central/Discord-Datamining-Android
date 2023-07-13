package com.discord.chat.presentation.message.view;

import com.discord.chat.presentation.message.messagepart.VideoAttachmentMessageAccessory;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.s;


@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)

public final class MediaMosaicView$bindAttachmentHolder$4 extends s implements Function0<Unit> {
    final  VideoAttachmentMessageAccessory $item;
    final  MediaMosaicView this$0;

    
    
    public MediaMosaicView$bindAttachmentHolder$4(MediaMosaicView mediaMosaicView, VideoAttachmentMessageAccessory videoAttachmentMessageAccessory) {
        super(0);
        this.this$0 = mediaMosaicView;
        this.$item = videoAttachmentMessageAccessory;
    }

    @Override 
    
    public final void invoke2() {
        Function1 function1;
        function1 = this.this$0.onAttachmentSpoilerClicked;
        if (function1 == null) {
            q.y("onAttachmentSpoilerClicked");
            function1 = null;
        }
        function1.invoke(Integer.valueOf(this.$item.getIndex()));
    }
}
