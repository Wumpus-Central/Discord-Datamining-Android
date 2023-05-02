package com.discord.chat.presentation.message.viewholder;

import android.view.View;
import com.discord.chat.bridge.postpreviewembed.PostPreviewEmbed;
import com.discord.chat.presentation.message.messagepart.PostPreviewEmbedMessageAccessory;
import com.discord.chat.presentation.message.view.PostPreviewEmbedView;
import com.discord.primitives.ChannelId;
import com.discord.primitives.GuildId;
import com.discord.primitives.MessageId;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J7\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2$\u0010\t\u001a \u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00060\nø\u0001\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000e"}, d2 = {"Lcom/discord/chat/presentation/message/viewholder/PostPreviewEmbedViewHolder;", "Lcom/discord/chat/presentation/message/viewholder/MessagePartViewHolder;", "postPreviewEmbedView", "Lcom/discord/chat/presentation/message/view/PostPreviewEmbedView;", "(Lcom/discord/chat/presentation/message/view/PostPreviewEmbedView;)V", "bind", "", "accessory", "Lcom/discord/chat/presentation/message/messagepart/PostPreviewEmbedMessageAccessory;", "onTapPostPreviewEmbed", "Lkotlin/Function4;", "Lcom/discord/primitives/GuildId;", "Lcom/discord/primitives/ChannelId;", "Lcom/discord/primitives/MessageId;", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class PostPreviewEmbedViewHolder extends MessagePartViewHolder {
    private final PostPreviewEmbedView postPreviewEmbedView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PostPreviewEmbedViewHolder(PostPreviewEmbedView postPreviewEmbedView) {
        super(postPreviewEmbedView, null);
        q.g(postPreviewEmbedView, "postPreviewEmbedView");
        this.postPreviewEmbedView = postPreviewEmbedView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bind$lambda$0(Function4 onTapPostPreviewEmbed, PostPreviewEmbed postPreviewEmbed, View view) {
        q.g(onTapPostPreviewEmbed, "$onTapPostPreviewEmbed");
        q.g(postPreviewEmbed, "$postPreviewEmbed");
        onTapPostPreviewEmbed.invoke(GuildId.m550boximpl(postPreviewEmbed.m112getGuildIdfYKD8eg()), ChannelId.m537boximpl(postPreviewEmbed.m114getParentChannelIdo4g7jtM()), ChannelId.m537boximpl(postPreviewEmbed.m115getThreadIdo4g7jtM()), MessageId.m563boximpl(postPreviewEmbed.m113getMessageId3Eiw7ao()));
    }

    public final void bind(PostPreviewEmbedMessageAccessory accessory, final Function4<? super GuildId, ? super ChannelId, ? super ChannelId, ? super MessageId, Unit> onTapPostPreviewEmbed) {
        q.g(accessory, "accessory");
        q.g(onTapPostPreviewEmbed, "onTapPostPreviewEmbed");
        final PostPreviewEmbed postPreviewEmbed = accessory.getPostPreviewEmbed();
        PostPreviewEmbedView postPreviewEmbedView = this.postPreviewEmbedView;
        String title = postPreviewEmbed.getTitle();
        String subtitle = postPreviewEmbed.getSubtitle();
        String ctaText = postPreviewEmbed.getCtaText();
        String coverImage = postPreviewEmbed.getCoverImage();
        String blurredCoverImage = postPreviewEmbed.getBlurredCoverImage();
        postPreviewEmbedView.m304setPostPreviewEmbedDzehxI4(title, subtitle, ctaText, postPreviewEmbed.getFooter(), postPreviewEmbed.m113getMessageId3Eiw7ao(), coverImage, blurredCoverImage, postPreviewEmbed.getCoverImageOverlayText(), new View.OnClickListener() { // from class: com.discord.chat.presentation.message.viewholder.k
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PostPreviewEmbedViewHolder.bind$lambda$0(Function4.this, postPreviewEmbed, view);
            }
        });
    }
}
