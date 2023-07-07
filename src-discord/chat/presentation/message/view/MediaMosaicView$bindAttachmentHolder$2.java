package com.discord.chat.presentation.message.view;

import com.discord.chat.presentation.message.messagepart.ImageAttachmentMessageAccessory;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.s;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class MediaMosaicView$bindAttachmentHolder$2 extends s implements Function0<Unit> {
    final /* synthetic */ ImageAttachmentMessageAccessory $item;
    final /* synthetic */ MediaMosaicView this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaMosaicView$bindAttachmentHolder$2(MediaMosaicView mediaMosaicView, ImageAttachmentMessageAccessory imageAttachmentMessageAccessory) {
        super(0);
        this.this$0 = mediaMosaicView;
        this.$item = imageAttachmentMessageAccessory;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        Function1 function1;
        function1 = this.this$0.onAttachmentSpoilerClicked;
        if (function1 == null) {
            q.y("onAttachmentSpoilerClicked");
            function1 = null;
        }
        function1.invoke(Integer.valueOf(this.$item.getAttachmentIndex()));
    }
}
