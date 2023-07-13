package com.discord.chat.presentation.message.view;

import com.discord.chat.presentation.message.messagepart.VideoAttachmentMessageAccessory;
import com.discord.chat.presentation.message.viewholder.MessagePartViewHolder;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.s;


@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "", "invoke", "(Ljava/lang/Double;)V"}, k = 3, mv = {1, 8, 0}, xi = 48)

public final class MediaMosaicView$bindAttachmentHolder$3 extends s implements Function1<Double, Unit> {
    final  MessagePartViewHolder $holder;
    final  VideoAttachmentMessageAccessory $item;
    final  MediaMosaicView this$0;

    
    
    public MediaMosaicView$bindAttachmentHolder$3(MediaMosaicView mediaMosaicView, VideoAttachmentMessageAccessory videoAttachmentMessageAccessory, MessagePartViewHolder messagePartViewHolder) {
        super(1);
        this.this$0 = mediaMosaicView;
        this.$item = videoAttachmentMessageAccessory;
        this.$holder = messagePartViewHolder;
    }

    @Override 
    public   Unit invoke(Double d10) {
        invoke2(d10);
        return Unit.f20663a;
    }

    
    public final void invoke2(Double d10) {
        Function3 function3;
        function3 = this.this$0.onAttachmentClicked;
        if (function3 == null) {
            q.y("onAttachmentClicked");
            function3 = null;
        }
        function3.invoke(Integer.valueOf(this.$item.getIndex()), this.$item, this.$holder);
    }
}
