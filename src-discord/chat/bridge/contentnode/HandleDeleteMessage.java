package com.discord.chat.bridge.contentnode;

import com.discord.primitives.ChannelId;
import com.discord.primitives.ChannelId$$serializer;
import com.discord.primitives.MessageId;
import com.discord.primitives.MessageId$$serializer;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import pi.f;
import si.a2;
import si.n1;

@f
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 12\u00020\u0001:\u000201BF\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\rø\u0001\u0000¢\u0006\u0002\u0010\u000eB,\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\n\u001a\u00020\u000bø\u0001\u0000¢\u0006\u0002\u0010\u000fJ\u0019\u0010\u001b\u001a\u00020\u0005HÆ\u0003ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u0018J\u0019\u0010\u001d\u001a\u00020\u0007HÆ\u0003ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u0015J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\tHÆ\u0003J\t\u0010 \u001a\u00020\u000bHÆ\u0003J@\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\"\u0010#J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010'\u001a\u00020\u0003HÖ\u0001J\t\u0010(\u001a\u00020\tHÖ\u0001J!\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020\u00002\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020/HÇ\u0001R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R'\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0010\n\u0002\u0010\u0016\u0012\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0004\u001a\u00020\u0005ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0018\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00062"}, d2 = {"Lcom/discord/chat/bridge/contentnode/HandleDeleteMessage;", "", "seen1", "", "id", "Lcom/discord/primitives/MessageId;", "channelId", "Lcom/discord/primitives/ChannelId;", "loggingName", "", "author", "Lcom/discord/chat/bridge/contentnode/HandleDeleteMessageAuthor;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Lcom/discord/primitives/ChannelId;Ljava/lang/String;Lcom/discord/chat/bridge/contentnode/HandleDeleteMessageAuthor;Lkotlinx/serialization/internal/SerializationConstructorMarker;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "(Ljava/lang/String;JLjava/lang/String;Lcom/discord/chat/bridge/contentnode/HandleDeleteMessageAuthor;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getAuthor", "()Lcom/discord/chat/bridge/contentnode/HandleDeleteMessageAuthor;", "getChannelId-o4g7jtM$annotations", "()V", "getChannelId-o4g7jtM", "()J", "J", "getId-3Eiw7ao", "()Ljava/lang/String;", "Ljava/lang/String;", "getLoggingName", "component1", "component1-3Eiw7ao", "component2", "component2-o4g7jtM", "component3", "component4", "copy", "copy-8a0ehIg", "(Ljava/lang/String;JLjava/lang/String;Lcom/discord/chat/bridge/contentnode/HandleDeleteMessageAuthor;)Lcom/discord/chat/bridge/contentnode/HandleDeleteMessage;", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)

public final class HandleDeleteMessage {
    public static final Companion Companion = new Companion(null);
    private final HandleDeleteMessageAuthor author;
    private final long channelId;

    
    private final String f6892id;
    private final String loggingName;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/discord/chat/bridge/contentnode/HandleDeleteMessage$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/bridge/contentnode/HandleDeleteMessage;", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    
    public static final class Companion {
        private Companion() {
        }

        public  Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<HandleDeleteMessage> serializer() {
            return HandleDeleteMessage$$serializer.INSTANCE;
        }
    }

    private HandleDeleteMessage(int i10, String str, ChannelId channelId, String str2, HandleDeleteMessageAuthor handleDeleteMessageAuthor, SerializationConstructorMarker serializationConstructorMarker) {
        if (11 != (i10 & 11)) {
            n1.b(i10, 11, HandleDeleteMessage$$serializer.INSTANCE.getDescriptor());
        }
        this.f6892id = str;
        this.channelId = channelId.m575unboximpl();
        if ((i10 & 4) == 0) {
            this.loggingName = null;
        } else {
            this.loggingName = str2;
        }
        this.author = handleDeleteMessageAuthor;
    }

    public  HandleDeleteMessage(int i10, String str, ChannelId channelId, String str2, HandleDeleteMessageAuthor handleDeleteMessageAuthor, SerializationConstructorMarker serializationConstructorMarker, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, str, channelId, str2, handleDeleteMessageAuthor, serializationConstructorMarker);
    }

    public  HandleDeleteMessage(String str, long j10, String str2, HandleDeleteMessageAuthor handleDeleteMessageAuthor, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, j10, str2, handleDeleteMessageAuthor);
    }

    
    public static  HandleDeleteMessage m56copy8a0ehIg$default(HandleDeleteMessage handleDeleteMessage, String str, long j10, String str2, HandleDeleteMessageAuthor handleDeleteMessageAuthor, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = handleDeleteMessage.f6892id;
        }
        if ((i10 & 2) != 0) {
            j10 = handleDeleteMessage.channelId;
        }
        if ((i10 & 4) != 0) {
            str2 = handleDeleteMessage.loggingName;
        }
        if ((i10 & 8) != 0) {
            handleDeleteMessageAuthor = handleDeleteMessage.author;
        }
        return handleDeleteMessage.m60copy8a0ehIg(str, j10, str2, handleDeleteMessageAuthor);
    }

    
    public static  void m57getChannelIdo4g7jtM$annotations() {
    }

    public static final void write$Self(HandleDeleteMessage self, CompositeEncoder output, SerialDescriptor serialDesc) {
        q.g(self, "self");
        q.g(output, "output");
        q.g(serialDesc, "serialDesc");
        boolean z10 = false;
        output.n(serialDesc, 0, MessageId$$serializer.INSTANCE, MessageId.m592boximpl(self.f6892id));
        output.n(serialDesc, 1, ChannelId$$serializer.INSTANCE, ChannelId.m566boximpl(self.channelId));
        if (output.w(serialDesc, 2) || self.loggingName != null) {
            z10 = true;
        }
        if (z10) {
            output.z(serialDesc, 2, a2.f26246a, self.loggingName);
        }
        output.n(serialDesc, 3, HandleDeleteMessageAuthor$$serializer.INSTANCE, self.author);
    }

    
    public final String m58component13Eiw7ao() {
        return this.f6892id;
    }

    
    public final long m59component2o4g7jtM() {
        return this.channelId;
    }

    public final String component3() {
        return this.loggingName;
    }

    public final HandleDeleteMessageAuthor component4() {
        return this.author;
    }

    
    public final HandleDeleteMessage m60copy8a0ehIg(String id2, long j10, String str, HandleDeleteMessageAuthor author) {
        q.g(id2, "id");
        q.g(author, "author");
        return new HandleDeleteMessage(id2, j10, str, author, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HandleDeleteMessage)) {
            return false;
        }
        HandleDeleteMessage handleDeleteMessage = (HandleDeleteMessage) obj;
        return MessageId.m596equalsimpl0(this.f6892id, handleDeleteMessage.f6892id) && ChannelId.m570equalsimpl0(this.channelId, handleDeleteMessage.channelId) && q.b(this.loggingName, handleDeleteMessage.loggingName) && q.b(this.author, handleDeleteMessage.author);
    }

    public final HandleDeleteMessageAuthor getAuthor() {
        return this.author;
    }

    
    public final long m61getChannelIdo4g7jtM() {
        return this.channelId;
    }

    
    public final String m62getId3Eiw7ao() {
        return this.f6892id;
    }

    public final String getLoggingName() {
        return this.loggingName;
    }

    public int hashCode() {
        int i10 = ((MessageId.m597hashCodeimpl(this.f6892id) * 31) + ChannelId.m571hashCodeimpl(this.channelId)) * 31;
        String str = this.loggingName;
        return ((i10 + (str == null ? 0 : str.hashCode())) * 31) + this.author.hashCode();
    }

    public String toString() {
        String str = MessageId.m598toStringimpl(this.f6892id);
        String str2 = ChannelId.m573toStringimpl(this.channelId);
        String str3 = this.loggingName;
        HandleDeleteMessageAuthor handleDeleteMessageAuthor = this.author;
        return "HandleDeleteMessage(id=" + str + ", channelId=" + str2 + ", loggingName=" + str3 + ", author=" + handleDeleteMessageAuthor + ")";
    }

    private HandleDeleteMessage(String str, long j10, String str2, HandleDeleteMessageAuthor handleDeleteMessageAuthor) {
        this.f6892id = str;
        this.channelId = j10;
        this.loggingName = str2;
        this.author = handleDeleteMessageAuthor;
    }

    public  HandleDeleteMessage(String str, long j10, String str2, HandleDeleteMessageAuthor handleDeleteMessageAuthor, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, j10, (i10 & 4) != 0 ? null : str2, handleDeleteMessageAuthor, null);
    }
}
