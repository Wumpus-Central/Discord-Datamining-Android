package com.discord.notifications.api;

import com.discord.primitives.ApplicationId;
import com.discord.primitives.ChannelId;
import com.discord.primitives.ChannelId$$serializer;
import com.discord.primitives.GuildId;
import com.discord.primitives.MessageId;
import com.discord.primitives.MessageId$$serializer;
import com.discord.primitives.UserId;
import java.util.List;
import ki.t;
import kotlin.Metadata;
import kotlin.collections.j;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.l;
import qi.f;
import ti.a2;
import ti.m0;
import ti.n1;

@f
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 ?2\u00020\u0001:\u0002>?Bn\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011ø\u0001\u0000¢\u0006\u0002\u0010\u0012B\\\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000bø\u0001\u0000¢\u0006\u0002\u0010\u0013J\u0019\u0010%\u001a\u00020\u0005HÆ\u0003ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b&\u0010\u001cJ\u0019\u0010'\u001a\u00020\u0007HÆ\u0003ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b(\u0010\u0019J\t\u0010)\u001a\u00020\tHÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u0010\u0010+\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001eJ\u0010\u0010,\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001eJ\u000b\u0010-\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u000bHÆ\u0003Jp\u0010/\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000bHÆ\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b0\u00101J\u0013\u00102\u001a\u0002032\b\u00104\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00105\u001a\u00020\u0003HÖ\u0001J\t\u00106\u001a\u00020\u000bHÖ\u0001J!\u00107\u001a\u0002082\u0006\u00109\u001a\u00020\u00002\u0006\u0010:\u001a\u00020;2\u0006\u0010<\u001a\u00020=HÇ\u0001R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R'\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0010\n\u0002\u0010\u001a\u0012\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0015\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u001f\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001cR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001cR\u001c\u0010\u0004\u001a\u00020\u0005ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010#\u001a\u0004\b\"\u0010\u001cR\u0015\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u001f\u001a\u0004\b$\u0010\u001e\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006@"}, d2 = {"Lcom/discord/notifications/api/DirectReplyMessage;", "", "seen1", "", "id", "Lcom/discord/primitives/MessageId;", "channelId", "Lcom/discord/primitives/ChannelId;", "author", "Lcom/discord/notifications/api/DirectReplyUser;", "content", "", "type", "channelType", "channelName", "guildName", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Lcom/discord/primitives/ChannelId;Lcom/discord/notifications/api/DirectReplyUser;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "(Ljava/lang/String;JLcom/discord/notifications/api/DirectReplyUser;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getAuthor", "()Lcom/discord/notifications/api/DirectReplyUser;", "getChannelId-o4g7jtM$annotations", "()V", "getChannelId-o4g7jtM", "()J", "J", "getChannelName", "()Ljava/lang/String;", "getChannelType", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getContent", "getGuildName", "getId-3Eiw7ao", "Ljava/lang/String;", "getType", "component1", "component1-3Eiw7ao", "component2", "component2-o4g7jtM", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "copy-_6Dih7Q", "(Ljava/lang/String;JLcom/discord/notifications/api/DirectReplyUser;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)Lcom/discord/notifications/api/DirectReplyMessage;", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "notification_api_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DirectReplyMessage {
    public static final Companion Companion = new Companion(null);
    private static final Json json = l.b(null, DirectReplyMessage$Companion$json$1.INSTANCE, 1, null);
    private final DirectReplyUser author;
    private final long channelId;
    private final String channelName;
    private final Integer channelType;
    private final String content;
    private final String guildName;

    /* renamed from: id  reason: collision with root package name */
    private final String f7592id;
    private final Integer type;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0001J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/discord/notifications/api/DirectReplyMessage$Companion;", "", "()V", "json", "Lkotlinx/serialization/json/Json;", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/notifications/api/DirectReplyMessage;", "toNotificationData", "Lcom/discord/notifications/api/NotificationData;", "data", "", "notification_api_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<DirectReplyMessage> serializer() {
            return DirectReplyMessage$$serializer.INSTANCE;
        }

        public final NotificationData toNotificationData(String data) {
            List h10;
            Integer num;
            q.g(data, "data");
            Json json = DirectReplyMessage.json;
            json.a();
            DirectReplyMessage directReplyMessage = (DirectReplyMessage) json.b(DirectReplyMessage.Companion.serializer(), data);
            String str = directReplyMessage.m501getId3Eiw7ao();
            Integer type = directReplyMessage.getType();
            String content = directReplyMessage.getContent();
            long j10 = directReplyMessage.m500getChannelIdo4g7jtM();
            Integer channelType = directReplyMessage.getChannelType();
            h10 = j.h();
            long j11 = directReplyMessage.getAuthor().m505getIdre6GcUE();
            String username = directReplyMessage.getAuthor().getUsername();
            if (username == null) {
                username = "";
            }
            String discriminator = directReplyMessage.getAuthor().getDiscriminator();
            if (discriminator != null) {
                num = t.m(discriminator);
            } else {
                num = null;
            }
            String avatar = directReplyMessage.getAuthor().getAvatar();
            return new NotificationData(NotificationData.TYPE_MESSAGE_CREATE, str, (Integer) null, (String) null, type, content, (Long) null, channelType, directReplyMessage.getChannelName(), ChannelId.m562boximpl(j10), (String) null, (String) null, (ChannelId) null, (String) null, h10, UserId.m626boximpl(j11), username, (String) null, num, avatar, (String) null, (Integer) null, (GuildId) null, directReplyMessage.getGuildName(), (String) null, (Integer) null, (String) null, (ApplicationId) null, (String) null, (String) null, (NotificationMessage) null, (String) null, (Integer) null, true, true, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Boolean) null, (String) null, -9290676, 2041, (DefaultConstructorMarker) null);
        }
    }

    private DirectReplyMessage(int i10, String str, ChannelId channelId, DirectReplyUser directReplyUser, String str2, Integer num, Integer num2, String str3, String str4, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i10 & 7)) {
            n1.b(i10, 7, DirectReplyMessage$$serializer.INSTANCE.getDescriptor());
        }
        this.f7592id = str;
        this.channelId = channelId.m571unboximpl();
        this.author = directReplyUser;
        if ((i10 & 8) == 0) {
            this.content = null;
        } else {
            this.content = str2;
        }
        if ((i10 & 16) == 0) {
            this.type = null;
        } else {
            this.type = num;
        }
        if ((i10 & 32) == 0) {
            this.channelType = null;
        } else {
            this.channelType = num2;
        }
        if ((i10 & 64) == 0) {
            this.channelName = null;
        } else {
            this.channelName = str3;
        }
        if ((i10 & 128) == 0) {
            this.guildName = null;
        } else {
            this.guildName = str4;
        }
    }

    public /* synthetic */ DirectReplyMessage(int i10, String str, ChannelId channelId, DirectReplyUser directReplyUser, String str2, Integer num, Integer num2, String str3, String str4, SerializationConstructorMarker serializationConstructorMarker, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, str, channelId, directReplyUser, str2, num, num2, str3, str4, serializationConstructorMarker);
    }

    public /* synthetic */ DirectReplyMessage(String str, long j10, DirectReplyUser directReplyUser, String str2, Integer num, Integer num2, String str3, String str4, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, j10, directReplyUser, str2, num, num2, str3, str4);
    }

    /* renamed from: getChannelId-o4g7jtM$annotations  reason: not valid java name */
    public static /* synthetic */ void m496getChannelIdo4g7jtM$annotations() {
    }

    public static final void write$Self(DirectReplyMessage self, CompositeEncoder output, SerialDescriptor serialDesc) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        q.g(self, "self");
        q.g(output, "output");
        q.g(serialDesc, "serialDesc");
        boolean z14 = false;
        output.C(serialDesc, 0, MessageId$$serializer.INSTANCE, MessageId.m588boximpl(self.f7592id));
        output.C(serialDesc, 1, ChannelId$$serializer.INSTANCE, ChannelId.m562boximpl(self.channelId));
        output.C(serialDesc, 2, DirectReplyUser$$serializer.INSTANCE, self.author);
        if (!output.w(serialDesc, 3) && self.content == null) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            output.e(serialDesc, 3, a2.f26940a, self.content);
        }
        if (!output.w(serialDesc, 4) && self.type == null) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (z11) {
            output.e(serialDesc, 4, m0.f27015a, self.type);
        }
        if (!output.w(serialDesc, 5) && self.channelType == null) {
            z12 = false;
        } else {
            z12 = true;
        }
        if (z12) {
            output.e(serialDesc, 5, m0.f27015a, self.channelType);
        }
        if (!output.w(serialDesc, 6) && self.channelName == null) {
            z13 = false;
        } else {
            z13 = true;
        }
        if (z13) {
            output.e(serialDesc, 6, a2.f26940a, self.channelName);
        }
        if (output.w(serialDesc, 7) || self.guildName != null) {
            z14 = true;
        }
        if (z14) {
            output.e(serialDesc, 7, a2.f26940a, self.guildName);
        }
    }

    /* renamed from: component1-3Eiw7ao  reason: not valid java name */
    public final String m497component13Eiw7ao() {
        return this.f7592id;
    }

    /* renamed from: component2-o4g7jtM  reason: not valid java name */
    public final long m498component2o4g7jtM() {
        return this.channelId;
    }

    public final DirectReplyUser component3() {
        return this.author;
    }

    public final String component4() {
        return this.content;
    }

    public final Integer component5() {
        return this.type;
    }

    public final Integer component6() {
        return this.channelType;
    }

    public final String component7() {
        return this.channelName;
    }

    public final String component8() {
        return this.guildName;
    }

    /* renamed from: copy-_6Dih7Q  reason: not valid java name */
    public final DirectReplyMessage m499copy_6Dih7Q(String id2, long j10, DirectReplyUser author, String str, Integer num, Integer num2, String str2, String str3) {
        q.g(id2, "id");
        q.g(author, "author");
        return new DirectReplyMessage(id2, j10, author, str, num, num2, str2, str3, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DirectReplyMessage)) {
            return false;
        }
        DirectReplyMessage directReplyMessage = (DirectReplyMessage) obj;
        return MessageId.m592equalsimpl0(this.f7592id, directReplyMessage.f7592id) && ChannelId.m566equalsimpl0(this.channelId, directReplyMessage.channelId) && q.b(this.author, directReplyMessage.author) && q.b(this.content, directReplyMessage.content) && q.b(this.type, directReplyMessage.type) && q.b(this.channelType, directReplyMessage.channelType) && q.b(this.channelName, directReplyMessage.channelName) && q.b(this.guildName, directReplyMessage.guildName);
    }

    public final DirectReplyUser getAuthor() {
        return this.author;
    }

    /* renamed from: getChannelId-o4g7jtM  reason: not valid java name */
    public final long m500getChannelIdo4g7jtM() {
        return this.channelId;
    }

    public final String getChannelName() {
        return this.channelName;
    }

    public final Integer getChannelType() {
        return this.channelType;
    }

    public final String getContent() {
        return this.content;
    }

    public final String getGuildName() {
        return this.guildName;
    }

    /* renamed from: getId-3Eiw7ao  reason: not valid java name */
    public final String m501getId3Eiw7ao() {
        return this.f7592id;
    }

    public final Integer getType() {
        return this.type;
    }

    public int hashCode() {
        int i10 = ((((MessageId.m593hashCodeimpl(this.f7592id) * 31) + ChannelId.m567hashCodeimpl(this.channelId)) * 31) + this.author.hashCode()) * 31;
        String str = this.content;
        int i11 = 0;
        int hashCode = (i10 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.type;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.channelType;
        int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str2 = this.channelName;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.guildName;
        if (str3 != null) {
            i11 = str3.hashCode();
        }
        return hashCode4 + i11;
    }

    public String toString() {
        String str = MessageId.m594toStringimpl(this.f7592id);
        String str2 = ChannelId.m569toStringimpl(this.channelId);
        DirectReplyUser directReplyUser = this.author;
        String str3 = this.content;
        Integer num = this.type;
        Integer num2 = this.channelType;
        String str4 = this.channelName;
        String str5 = this.guildName;
        return "DirectReplyMessage(id=" + str + ", channelId=" + str2 + ", author=" + directReplyUser + ", content=" + str3 + ", type=" + num + ", channelType=" + num2 + ", channelName=" + str4 + ", guildName=" + str5 + ")";
    }

    private DirectReplyMessage(String str, long j10, DirectReplyUser directReplyUser, String str2, Integer num, Integer num2, String str3, String str4) {
        this.f7592id = str;
        this.channelId = j10;
        this.author = directReplyUser;
        this.content = str2;
        this.type = num;
        this.channelType = num2;
        this.channelName = str3;
        this.guildName = str4;
    }

    public /* synthetic */ DirectReplyMessage(String str, long j10, DirectReplyUser directReplyUser, String str2, Integer num, Integer num2, String str3, String str4, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, j10, directReplyUser, (i10 & 8) != 0 ? null : str2, (i10 & 16) != 0 ? null : num, (i10 & 32) != 0 ? null : num2, (i10 & 64) != 0 ? null : str3, (i10 & 128) != 0 ? null : str4, null);
    }
}
