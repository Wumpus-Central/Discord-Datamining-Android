package com.discord.chat.bridge.codedlinks;

import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001R\u001b\u0010\u0002\u001a\u00020\u0003X¦\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u001b\u0010\u0006\u001a\u00020\u0007X¦\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\b\u0010\u0005R\u0014\u0010\t\u001a\u0004\u0018\u00010\nX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0012\u0010\r\u001a\u00020\u000eX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\n0\u0012X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0012\u0010\u0015\u001a\u00020\nX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\f\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0017"}, d2 = {"Lcom/discord/chat/bridge/codedlinks/ActivityBookmarkEmbed;", "", "applicationId", "Lcom/discord/primitives/ApplicationId;", "getApplicationId-VavddsQ", "()J", "channelId", "Lcom/discord/primitives/ChannelId;", "getChannelId-o4g7jtM", "description", "", "getDescription", "()Ljava/lang/String;", "extendedType", "Lcom/discord/chat/bridge/codedlinks/CodedLinkExtendedType;", "getExtendedType", "()Lcom/discord/chat/bridge/codedlinks/CodedLinkExtendedType;", "participantAvatarUris", "", "getParticipantAvatarUris", "()Ljava/util/List;", "participantsText", "getParticipantsText", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)

public interface ActivityBookmarkEmbed {
    
    long mo32getApplicationIdVavddsQ();

    
    long mo33getChannelIdo4g7jtM();

    String getDescription();

    CodedLinkExtendedType getExtendedType();

    List<String> getParticipantAvatarUris();

    String getParticipantsText();
}
