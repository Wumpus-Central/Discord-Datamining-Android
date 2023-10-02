package com.discord.chat.presentation.message.viewholder;

import android.view.View;
import com.discord.chat.bridge.postpreviewembed.PostPreviewEmbed;
import com.discord.chat.bridge.spoiler.SpoilerConfig;
import com.discord.chat.presentation.message.view.PostPreviewEmbedView;
import com.discord.primitives.ChannelId;
import com.discord.primitives.GuildId;
import com.discord.primitives.MessageId;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004JA\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2$\u0010\t\u001a \u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00060\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fø\u0001\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0010"}, d2 = {"Lcom/discord/chat/presentation/message/viewholder/PostPreviewEmbedViewHolder;", "Lcom/discord/chat/presentation/message/viewholder/MessagePartViewHolder;", "postPreviewEmbedView", "Lcom/discord/chat/presentation/message/view/PostPreviewEmbedView;", "(Lcom/discord/chat/presentation/message/view/PostPreviewEmbedView;)V", "bind", "", "postPreviewEmbed", "Lcom/discord/chat/bridge/postpreviewembed/PostPreviewEmbed;", "onTapPostPreviewEmbed", "Lkotlin/Function4;", "Lcom/discord/primitives/GuildId;", "Lcom/discord/primitives/ChannelId;", "Lcom/discord/primitives/MessageId;", "spoilerConfig", "Lcom/discord/chat/bridge/spoiler/SpoilerConfig;", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)

public final class PostPreviewEmbedViewHolder extends MessagePartViewHolder {
    private final PostPreviewEmbedView postPreviewEmbedView;

    
    public PostPreviewEmbedViewHolder(PostPreviewEmbedView postPreviewEmbedView) {
        super(postPreviewEmbedView, null);
        q.h(postPreviewEmbedView, "postPreviewEmbedView");
        this.postPreviewEmbedView = postPreviewEmbedView;
    }

    
    public static final void bind$lambda$0(Function4 onTapPostPreviewEmbed, PostPreviewEmbed postPreviewEmbed, View view) {
        q.h(onTapPostPreviewEmbed, "$onTapPostPreviewEmbed");
        q.h(postPreviewEmbed, "$postPreviewEmbed");
        onTapPostPreviewEmbed.invoke(GuildId.m630boximpl(postPreviewEmbed.m124getGuildIdfYKD8eg()), ChannelId.m617boximpl(postPreviewEmbed.m126getParentChannelIdo4g7jtM()), ChannelId.m617boximpl(postPreviewEmbed.m127getThreadIdo4g7jtM()), MessageId.m643boximpl(postPreviewEmbed.m125getMessageId3Eiw7ao()));
    }

    public final void bind(final PostPreviewEmbed postPreviewEmbed, final Function4<? super GuildId, ? super ChannelId, ? super ChannelId, ? super MessageId, Unit> onTapPostPreviewEmbed, SpoilerConfig spoilerConfig) {
        q.h(postPreviewEmbed, "postPreviewEmbed");
        q.h(onTapPostPreviewEmbed, "onTapPostPreviewEmbed");
        PostPreviewEmbedView postPreviewEmbedView = this.postPreviewEmbedView;
        String title = postPreviewEmbed.getTitle();
        String subtitle = postPreviewEmbed.getSubtitle();
        String ctaText = postPreviewEmbed.getCtaText();
        int ctaButtonColor = postPreviewEmbed.getCtaButtonColor();
        String coverImage = postPreviewEmbed.getCoverImage();
        String blurredCoverImage = postPreviewEmbed.getBlurredCoverImage();
        postPreviewEmbedView.m353setPostPreviewEmbedOGpb6Gk(title, subtitle, ctaText, ctaButtonColor, postPreviewEmbed.getFooter(), postPreviewEmbed.m125getMessageId3Eiw7ao(), coverImage, blurredCoverImage, postPreviewEmbed.getCoverImageOverlayText(), postPreviewEmbed.getBackgroundImage(), new View.OnClickListener() { 
            @Override 
            public final void onClick(View view) {
                PostPreviewEmbedViewHolder.bind$lambda$0(Function4.this, postPreviewEmbed, view);
            }
        }, postPreviewEmbed.getShouldSpoiler(), spoilerConfig);
    }
}
