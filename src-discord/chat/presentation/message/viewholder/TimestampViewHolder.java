package com.discord.chat.presentation.message.viewholder;

import android.widget.TextView;
import com.discord.SetTextSizeSpKt;
import com.discord.chat.presentation.message.messagepart.TimestampMessageAccessory;
import com.discord.fonts.DiscordFontUtilsKt;
import kotlin.Metadata;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/discord/chat/presentation/message/viewholder/TimestampViewHolder;", "Lcom/discord/chat/presentation/message/viewholder/MessagePartViewHolder;", "timestampView", "Landroid/widget/TextView;", "(Landroid/widget/TextView;)V", "bind", "", "timestampItem", "Lcom/discord/chat/presentation/message/messagepart/TimestampMessageAccessory;", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)

public final class TimestampViewHolder extends MessagePartViewHolder {
    private final TextView timestampView;

    
    public TimestampViewHolder(TextView timestampView) {
        super(timestampView, null);
        q.h(timestampView, "timestampView");
        this.timestampView = timestampView;
    }

    public final void bind(TimestampMessageAccessory timestampItem) {
        q.h(timestampItem, "timestampItem");
        this.timestampView.setText(timestampItem.getTimestamp());
        SetTextSizeSpKt.setTextSizeSp(this.timestampView, 12.0f);
        this.timestampView.setTextColor(timestampItem.getTextColor());
        DiscordFontUtilsKt.setDiscordFont(this.timestampView, timestampItem.getDiscordFont());
    }
}
