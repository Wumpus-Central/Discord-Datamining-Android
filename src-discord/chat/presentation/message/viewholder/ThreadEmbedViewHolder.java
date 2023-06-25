package com.discord.chat.presentation.message.viewholder;

import android.view.View;
import com.discord.chat.presentation.message.messagepart.ThreadEmbedMessageAccessory;
import com.discord.chat.presentation.message.view.ThreadEmbedView;
import com.discord.primitives.MessageId;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J%\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00060\nø\u0001\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\f"}, d2 = {"Lcom/discord/chat/presentation/message/viewholder/ThreadEmbedViewHolder;", "Lcom/discord/chat/presentation/message/viewholder/MessagePartViewHolder;", "threadEmbedView", "Lcom/discord/chat/presentation/message/view/ThreadEmbedView;", "(Lcom/discord/chat/presentation/message/view/ThreadEmbedView;)V", "bind", "", "threadItem", "Lcom/discord/chat/presentation/message/messagepart/ThreadEmbedMessageAccessory;", "onTapThreadEmbed", "Lkotlin/Function1;", "Lcom/discord/primitives/MessageId;", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ThreadEmbedViewHolder extends MessagePartViewHolder {
    private final ThreadEmbedView threadEmbedView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ThreadEmbedViewHolder(ThreadEmbedView threadEmbedView) {
        super(threadEmbedView, null);
        q.g(threadEmbedView, "threadEmbedView");
        this.threadEmbedView = threadEmbedView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bind$lambda$1$lambda$0(Function1 onTapThreadEmbed, ThreadEmbedMessageAccessory threadItem, View view) {
        q.g(onTapThreadEmbed, "$onTapThreadEmbed");
        q.g(threadItem, "$threadItem");
        onTapThreadEmbed.invoke(MessageId.m588boximpl(threadItem.mo214getMessageId3Eiw7ao()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.CharSequence] */
    /* JADX WARN: Unknown variable types count: 1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void bind(final com.discord.chat.presentation.message.messagepart.ThreadEmbedMessageAccessory r34, final kotlin.jvm.functions.Function1<? super com.discord.primitives.MessageId, kotlin.Unit> r35) {
        /*
            r33 = this;
            r0 = r34
            r1 = r35
            java.lang.String r2 = "threadItem"
            kotlin.jvm.internal.q.g(r0, r2)
            java.lang.String r2 = "onTapThreadEmbed"
            kotlin.jvm.internal.q.g(r1, r2)
            com.discord.chat.bridge.threads.ThreadEmbed r2 = r34.getThreadEmbed()
            r3 = r33
            com.discord.chat.presentation.message.view.ThreadEmbedView r4 = r3.threadEmbedView
            java.lang.String r5 = r2.getTitle()
            r4.setTitle(r5)
            java.lang.String r5 = r2.getMessageCountLabel()
            r4.setLabel(r5)
            java.lang.Boolean r5 = r2.getArchived()
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            boolean r5 = kotlin.jvm.internal.q.b(r5, r6)
            java.lang.String r7 = r2.getArchivedIconUrl()
            r4.setArchived(r5, r7)
            com.discord.chat.presentation.message.viewholder.t r5 = new com.discord.chat.presentation.message.viewholder.t
            r5.<init>()
            r0 = 0
            r1 = 1
            r7 = 0
            com.discord.react_gesture_handler.nested_touch.NestedScrollOnTouchUtilsKt.setOnClickListenerNested$default(r4, r0, r5, r1, r7)
            com.discord.chat.bridge.threads.ThreadEmbedMessage r5 = r2.getReferencedMessage()
            if (r5 == 0) goto L_0x004b
            com.discord.chat.bridge.Message r5 = r5.getMessage()
            goto L_0x004c
        L_0x004b:
            r5 = r7
        L_0x004c:
            java.lang.String r8 = ""
            java.lang.String r9 = "context"
            if (r5 != 0) goto L_0x0060
            com.facebook.drawee.span.DraweeSpanStringBuilder r10 = new com.facebook.drawee.span.DraweeSpanStringBuilder
            java.lang.String r11 = r2.getMessagePreviewString()
            if (r11 != 0) goto L_0x005b
            goto L_0x005c
        L_0x005b:
            r8 = r11
        L_0x005c:
            r10.<init>(r8)
            goto L_0x00d1
        L_0x0060:
            com.discord.chat.bridge.structurabletext.StructurableText r10 = r5.getContent()
            if (r10 == 0) goto L_0x00bd
            com.discord.chat.bridge.structurabletext.StructurableText r11 = r5.getContent()
            android.content.Context r8 = r4.getContext()
            r12 = r8
            kotlin.jvm.internal.q.f(r8, r9)
            java.lang.String r13 = r5.m16getId3Eiw7ao()
            boolean r14 = com.discord.chat.bridge.MessageKt.shouldAnimateEmoji(r5)
            boolean r15 = r5.getShouldShowRoleDot()
            boolean r16 = r5.getShouldShowRoleOnName()
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r28 = 1
            r29 = 0
            com.discord.chat.databinding.ThreadEmbedViewBinding r8 = r4.getBinding()
            com.facebook.drawee.span.SimpleDraweeSpanTextView r8 = r8.threadEmbedMostRecentMessageContent
            android.text.TextPaint r8 = r8.getPaint()
            android.graphics.Paint$FontMetrics r8 = r8.getFontMetrics()
            java.lang.String r10 = "binding.threadEmbedMostR…Content.paint.fontMetrics"
            kotlin.jvm.internal.q.f(r8, r10)
            float r30 = com.discord.chat.presentation.textutils.TextUtilsKt.getBaselineHeight(r8)
            r31 = 196576(0x2ffe0, float:2.75462E-40)
            r32 = 0
            com.facebook.drawee.span.DraweeSpanStringBuilder r10 = com.discord.chat.presentation.textutils.TextUtilsKt.toSpannable$default(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32)
            goto L_0x00d1
        L_0x00bd:
            com.facebook.drawee.span.DraweeSpanStringBuilder r10 = new com.facebook.drawee.span.DraweeSpanStringBuilder
            android.content.Context r11 = r4.getContext()
            kotlin.jvm.internal.q.f(r11, r9)
            java.lang.CharSequence r11 = com.discord.chat.presentation.message.viewholder.ThreadEmbedViewHolderKt.access$getContentlessPreviewText(r11, r5)
            if (r11 != 0) goto L_0x00cd
            goto L_0x00ce
        L_0x00cd:
            r8 = r11
        L_0x00ce:
            r10.<init>(r8)
        L_0x00d1:
            if (r5 == 0) goto L_0x00df
            android.content.Context r8 = r4.getContext()
            kotlin.jvm.internal.q.f(r8, r9)
            java.lang.String r8 = com.discord.chat.bridge.MessageKt.avatarUrl(r5, r8)
            goto L_0x00e0
        L_0x00df:
            r8 = r7
        L_0x00e0:
            if (r5 == 0) goto L_0x00e6
            java.lang.String r7 = r5.getUsername()
        L_0x00e6:
            java.lang.Boolean r2 = r2.getArchived()
            boolean r2 = kotlin.jvm.internal.q.b(r2, r6)
            if (r2 != 0) goto L_0x00f8
            if (r5 == 0) goto L_0x00f8
            com.discord.chat.bridge.structurabletext.StructurableText r2 = r5.getContent()
            if (r2 != 0) goto L_0x00f9
        L_0x00f8:
            r0 = r1
        L_0x00f9:
            r4.setMessage(r8, r7, r10, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.discord.chat.presentation.message.viewholder.ThreadEmbedViewHolder.bind(com.discord.chat.presentation.message.messagepart.ThreadEmbedMessageAccessory, kotlin.jvm.functions.Function1):void");
    }
}
