package com.discord.chat.presentation.message.viewholder;

import com.discord.chat.bridge.attachment.Attachment;
import com.discord.chat.presentation.events.ChatEventHandler;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC9679s;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(m15074d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m15073d2 = {"<anonymous>", "", "invoke"}, m15072k = 3, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes4.dex */
public final class VoiceMessageViewHolder$bind$1$onCancelUpload$1 extends AbstractC9679s implements Function0<Unit> {
    final /* synthetic */ ChatEventHandler $eventHandler;
    final /* synthetic */ Attachment $this_with;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoiceMessageViewHolder$bind$1$onCancelUpload$1(Attachment attachment, ChatEventHandler chatEventHandler) {
        super(0);
        this.$this_with = attachment;
        this.$eventHandler = chatEventHandler;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        if (this.$this_with.getUploaderId() != null && this.$this_with.getUploaderItemId() != null) {
            this.$eventHandler.onTapCancelUploadItem(this.$this_with.getUploaderId(), this.$this_with.getUploaderItemId());
        }
    }
}
