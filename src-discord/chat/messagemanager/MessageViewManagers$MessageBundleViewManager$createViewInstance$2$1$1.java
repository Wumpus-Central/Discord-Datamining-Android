package com.discord.chat.messagemanager;

import android.content.Context;
import com.discord.chat.messagemanager.MessageViewManagers;
import com.discord.chat.presentation.list.messagebundling.MessageBundleView;
import com.discord.misc.utilities.measure.ViewMeasuringWrapper;
import com.discord.primitives.MessageId;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.s;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "messageId", "Lcom/discord/primitives/MessageId;", "invoke-1xi1bu0", "(Ljava/lang/String;)V"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class MessageViewManagers$MessageBundleViewManager$createViewInstance$2$1$1 extends s implements Function1<MessageId, Unit> {
    final /* synthetic */ MessageBundleView $this_apply;
    final /* synthetic */ ViewMeasuringWrapper<MessageBundleView> $wrapper;
    final /* synthetic */ MessageViewManagers.MessageBundleViewManager this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MessageViewManagers$MessageBundleViewManager$createViewInstance$2$1$1(MessageViewManagers.MessageBundleViewManager messageBundleViewManager, MessageBundleView messageBundleView, ViewMeasuringWrapper<MessageBundleView> viewMeasuringWrapper) {
        super(1);
        this.this$0 = messageBundleViewManager;
        this.$this_apply = messageBundleView;
        this.$wrapper = viewMeasuringWrapper;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(MessageId messageId) {
        m146invoke1xi1bu0(messageId.m597unboximpl());
        return Unit.f22114a;
    }

    /* renamed from: invoke-1xi1bu0  reason: not valid java name */
    public final void m146invoke1xi1bu0(String messageId) {
        q.g(messageId, "messageId");
        MessageViewManagers.MessageBundleViewManager messageBundleViewManager = this.this$0;
        Context context = this.$this_apply.getContext();
        q.f(context, "context");
        messageBundleViewManager.m145emitOnTruncateMessageJPrav84(context, this.$wrapper.getId(), messageId);
    }
}
