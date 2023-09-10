package com.discord.chat.bridge.contentnode;

import com.discord.primitives.ChannelId;
import com.discord.primitives.ChannelId$$serializer;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import ui.f;
import xi.n1;

@f
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 12\u00020\u0001:\u000201BT\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000eø\u0001\u0000¢\u0006\u0002\u0010\u000fB6\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bø\u0001\u0000¢\u0006\u0002\u0010\u0010J\u0019\u0010\u001a\u001a\u00020\u0005HÆ\u0003ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u0012J\t\u0010\u001c\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0007HÆ\u0003J\u000f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\f0\u000bHÆ\u0003JN\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bHÆ\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b!\u0010\"J\u0013\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010&HÖ\u0003J\t\u0010'\u001a\u00020\u0003HÖ\u0001J\t\u0010(\u001a\u00020\u0007HÖ\u0001J!\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020\u00002\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020/HÇ\u0001R\u001c\u0010\u0004\u001a\u00020\u0005ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\t\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0015R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00062"}, d2 = {"Lcom/discord/chat/bridge/contentnode/CommandMentionContentNode;", "Lcom/discord/chat/bridge/contentnode/MentionContentNode;", "seen1", "", "channelId", "Lcom/discord/primitives/ChannelId;", "commandId", "", "commandName", "commandKey", "content", "", "Lcom/discord/chat/bridge/contentnode/ContentNode;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/discord/primitives/ChannelId;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getChannelId-o4g7jtM", "()J", "J", "getCommandId", "()Ljava/lang/String;", "getCommandKey", "getCommandName", "getContent", "()Ljava/util/List;", "component1", "component1-o4g7jtM", "component2", "component3", "component4", "component5", "copy", "copy-JrbBJuM", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lcom/discord/chat/bridge/contentnode/CommandMentionContentNode;", "equals", "", "other", "", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)

public final class CommandMentionContentNode extends MentionContentNode {
    public static final Companion Companion = new Companion(null);
    private final long channelId;
    private final String commandId;
    private final String commandKey;
    private final String commandName;
    private final List<ContentNode> content;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/discord/chat/bridge/contentnode/CommandMentionContentNode$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/bridge/contentnode/CommandMentionContentNode;", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    
    public static final class Companion {
        private Companion() {
        }

        public  Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<CommandMentionContentNode> serializer() {
            return CommandMentionContentNode$$serializer.INSTANCE;
        }
    }

    
    
    private CommandMentionContentNode(int i10, ChannelId channelId, String str, String str2, String str3, List<? extends ContentNode> list, SerializationConstructorMarker serializationConstructorMarker) {
        super(i10, serializationConstructorMarker);
        if (31 != (i10 & 31)) {
            n1.b(i10, 31, CommandMentionContentNode$$serializer.INSTANCE.getDescriptor());
        }
        this.channelId = channelId.m607unboximpl();
        this.commandId = str;
        this.commandName = str2;
        this.commandKey = str3;
        this.content = list;
    }

    public  CommandMentionContentNode(int i10, ChannelId channelId, String str, String str2, String str3, List list, SerializationConstructorMarker serializationConstructorMarker, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, channelId, str, str2, str3, list, serializationConstructorMarker);
    }

    public  CommandMentionContentNode(long j10, String str, String str2, String str3, List list, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, str, str2, str3, list);
    }

    
    
    public static  CommandMentionContentNode m51copyJrbBJuM$default(CommandMentionContentNode commandMentionContentNode, long j10, String str, String str2, String str3, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = commandMentionContentNode.channelId;
        }
        if ((i10 & 2) != 0) {
            str = commandMentionContentNode.commandId;
        }
        if ((i10 & 4) != 0) {
            str2 = commandMentionContentNode.commandName;
        }
        if ((i10 & 8) != 0) {
            str3 = commandMentionContentNode.commandKey;
        }
        if ((i10 & 16) != 0) {
            list = commandMentionContentNode.getContent();
        }
        return commandMentionContentNode.m53copyJrbBJuM(j10, str, str2, str3, list);
    }

    public static final void write$Self(CommandMentionContentNode self, CompositeEncoder output, SerialDescriptor serialDesc) {
        q.h(self, "self");
        q.h(output, "output");
        q.h(serialDesc, "serialDesc");
        MentionContentNode.write$Self(self, output, serialDesc);
        output.h(serialDesc, 0, ChannelId$$serializer.INSTANCE, ChannelId.m598boximpl(self.channelId));
        output.y(serialDesc, 1, self.commandId);
        output.y(serialDesc, 2, self.commandName);
        output.y(serialDesc, 3, self.commandKey);
        output.h(serialDesc, 4, new xi.f(ContentNodeSerializer.INSTANCE), self.getContent());
    }

    
    public final long m52component1o4g7jtM() {
        return this.channelId;
    }

    public final String component2() {
        return this.commandId;
    }

    public final String component3() {
        return this.commandName;
    }

    public final String component4() {
        return this.commandKey;
    }

    public final List<ContentNode> component5() {
        return getContent();
    }

    
    public final CommandMentionContentNode m53copyJrbBJuM(long j10, String commandId, String commandName, String commandKey, List<? extends ContentNode> content) {
        q.h(commandId, "commandId");
        q.h(commandName, "commandName");
        q.h(commandKey, "commandKey");
        q.h(content, "content");
        return new CommandMentionContentNode(j10, commandId, commandName, commandKey, content, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommandMentionContentNode)) {
            return false;
        }
        CommandMentionContentNode commandMentionContentNode = (CommandMentionContentNode) obj;
        return ChannelId.m602equalsimpl0(this.channelId, commandMentionContentNode.channelId) && q.c(this.commandId, commandMentionContentNode.commandId) && q.c(this.commandName, commandMentionContentNode.commandName) && q.c(this.commandKey, commandMentionContentNode.commandKey) && q.c(getContent(), commandMentionContentNode.getContent());
    }

    
    public final long m54getChannelIdo4g7jtM() {
        return this.channelId;
    }

    public final String getCommandId() {
        return this.commandId;
    }

    public final String getCommandKey() {
        return this.commandKey;
    }

    public final String getCommandName() {
        return this.commandName;
    }

    @Override 
    public List<ContentNode> getContent() {
        return this.content;
    }

    public int hashCode() {
        return (((((((ChannelId.m603hashCodeimpl(this.channelId) * 31) + this.commandId.hashCode()) * 31) + this.commandName.hashCode()) * 31) + this.commandKey.hashCode()) * 31) + getContent().hashCode();
    }

    public String toString() {
        String str = ChannelId.m605toStringimpl(this.channelId);
        String str2 = this.commandId;
        String str3 = this.commandName;
        String str4 = this.commandKey;
        List<ContentNode> content = getContent();
        return "CommandMentionContentNode(channelId=" + str + ", commandId=" + str2 + ", commandName=" + str3 + ", commandKey=" + str4 + ", content=" + content + ")";
    }

    
    private CommandMentionContentNode(long j10, String str, String str2, String str3, List<? extends ContentNode> list) {
        super(null);
        this.channelId = j10;
        this.commandId = str;
        this.commandName = str2;
        this.commandKey = str3;
        this.content = list;
    }
}
