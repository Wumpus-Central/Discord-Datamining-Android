package com.discord.chat.presentation.message.messagepart;

import com.discord.primitives.ChannelId;
import com.discord.primitives.MessageId;
import com.discord.react_asset_fetcher.ReactAsset;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B<\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u000bø\u0001\u0000¢\u0006\u0002\u0010\fJ\u0019\u0010\u0018\u001a\u00020\u0003HÆ\u0003ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u000eJ\u0019\u0010\u001a\u001a\u00020\u0005HÆ\u0003ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u0010J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001f\u001a\u00020\u000bHÆ\u0003JV\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b!\u0010\"J\u0013\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010&HÖ\u0003J\t\u0010'\u001a\u00020(HÖ\u0001J\t\u0010)\u001a\u00020\u0007HÖ\u0001R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0004\u001a\u00020\u0005ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u001f\u0010\u0002\u001a\u00020\u0003X\u0096\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0015\u0010\u000eR\u0011\u0010\t\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000e\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006*"}, d2 = {"Lcom/discord/chat/presentation/message/messagepart/InfoLinkMessageAccessory;", "Lcom/discord/chat/presentation/message/messagepart/MessageAccessory;", "messageId", "Lcom/discord/primitives/MessageId;", "channelId", "Lcom/discord/primitives/ChannelId;", "attachmentId", "", "embedId", "text", "icon", "Lcom/discord/react_asset_fetcher/ReactAsset;", "(Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/discord/react_asset_fetcher/ReactAsset;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getAttachmentId", "()Ljava/lang/String;", "getChannelId-o4g7jtM", "()J", "J", "getEmbedId", "getIcon", "()Lcom/discord/react_asset_fetcher/ReactAsset;", "getMessageId-3Eiw7ao", "Ljava/lang/String;", "getText", "component1", "component1-3Eiw7ao", "component2", "component2-o4g7jtM", "component3", "component4", "component5", "component6", "copy", "copy-eTS4JUY", "(Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/discord/react_asset_fetcher/ReactAsset;)Lcom/discord/chat/presentation/message/messagepart/InfoLinkMessageAccessory;", "equals", "", "other", "", "hashCode", "", "toString", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)

public final class InfoLinkMessageAccessory extends MessageAccessory {
    private final String attachmentId;
    private final long channelId;
    private final String embedId;
    private final ReactAsset icon;
    private final String messageId;
    private final String text;

    private InfoLinkMessageAccessory(String str, long j10, String str2, String str3, String str4, ReactAsset reactAsset) {
        super(str, "info link " + str2, null);
        this.messageId = str;
        this.channelId = j10;
        this.attachmentId = str2;
        this.embedId = str3;
        this.text = str4;
        this.icon = reactAsset;
    }

    public  InfoLinkMessageAccessory(String str, long j10, String str2, String str3, String str4, ReactAsset reactAsset, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, j10, str2, str3, str4, reactAsset);
    }

    
    public static  InfoLinkMessageAccessory m284copyeTS4JUY$default(InfoLinkMessageAccessory infoLinkMessageAccessory, String str, long j10, String str2, String str3, String str4, ReactAsset reactAsset, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = infoLinkMessageAccessory.mo236getMessageId3Eiw7ao();
        }
        if ((i10 & 2) != 0) {
            j10 = infoLinkMessageAccessory.channelId;
        }
        if ((i10 & 4) != 0) {
            str2 = infoLinkMessageAccessory.attachmentId;
        }
        if ((i10 & 8) != 0) {
            str3 = infoLinkMessageAccessory.embedId;
        }
        if ((i10 & 16) != 0) {
            str4 = infoLinkMessageAccessory.text;
        }
        if ((i10 & 32) != 0) {
            reactAsset = infoLinkMessageAccessory.icon;
        }
        return infoLinkMessageAccessory.m287copyeTS4JUY(str, j10, str2, str3, str4, reactAsset);
    }

    
    public final String m285component13Eiw7ao() {
        return mo236getMessageId3Eiw7ao();
    }

    
    public final long m286component2o4g7jtM() {
        return this.channelId;
    }

    public final String component3() {
        return this.attachmentId;
    }

    public final String component4() {
        return this.embedId;
    }

    public final String component5() {
        return this.text;
    }

    public final ReactAsset component6() {
        return this.icon;
    }

    
    public final InfoLinkMessageAccessory m287copyeTS4JUY(String messageId, long j10, String str, String str2, String text, ReactAsset icon) {
        q.h(messageId, "messageId");
        q.h(text, "text");
        q.h(icon, "icon");
        return new InfoLinkMessageAccessory(messageId, j10, str, str2, text, icon, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InfoLinkMessageAccessory)) {
            return false;
        }
        InfoLinkMessageAccessory infoLinkMessageAccessory = (InfoLinkMessageAccessory) obj;
        return MessageId.m640equalsimpl0(mo236getMessageId3Eiw7ao(), infoLinkMessageAccessory.mo236getMessageId3Eiw7ao()) && ChannelId.m614equalsimpl0(this.channelId, infoLinkMessageAccessory.channelId) && q.c(this.attachmentId, infoLinkMessageAccessory.attachmentId) && q.c(this.embedId, infoLinkMessageAccessory.embedId) && q.c(this.text, infoLinkMessageAccessory.text) && this.icon == infoLinkMessageAccessory.icon;
    }

    public final String getAttachmentId() {
        return this.attachmentId;
    }

    
    public final long m288getChannelIdo4g7jtM() {
        return this.channelId;
    }

    public final String getEmbedId() {
        return this.embedId;
    }

    public final ReactAsset getIcon() {
        return this.icon;
    }

    @Override 
    
    public String mo236getMessageId3Eiw7ao() {
        return this.messageId;
    }

    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        int i10 = ((MessageId.m641hashCodeimpl(mo236getMessageId3Eiw7ao()) * 31) + ChannelId.m615hashCodeimpl(this.channelId)) * 31;
        String str = this.attachmentId;
        int i11 = 0;
        int hashCode = (i10 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.embedId;
        if (str2 != null) {
            i11 = str2.hashCode();
        }
        return ((((hashCode + i11) * 31) + this.text.hashCode()) * 31) + this.icon.hashCode();
    }

    public String toString() {
        String str = MessageId.m642toStringimpl(mo236getMessageId3Eiw7ao());
        String str2 = ChannelId.m617toStringimpl(this.channelId);
        String str3 = this.attachmentId;
        String str4 = this.embedId;
        String str5 = this.text;
        ReactAsset reactAsset = this.icon;
        return "InfoLinkMessageAccessory(messageId=" + str + ", channelId=" + str2 + ", attachmentId=" + str3 + ", embedId=" + str4 + ", text=" + str5 + ", icon=" + reactAsset + ")";
    }
}
