package com.discord.chat.bridge.automod;

import androidx.recyclerview.widget.RecyclerView;
import com.discord.chat.bridge.structurabletext.StructurableText;
import com.discord.chat.bridge.structurabletext.StructurableTextSerializer;
import com.discord.primitives.ChannelId;
import com.discord.primitives.ChannelId$$serializer;
import com.discord.primitives.GuildId;
import com.discord.primitives.GuildId$$serializer;
import com.discord.primitives.MessageId;
import com.discord.primitives.MessageId$$serializer;
import com.discord.primitives.UserId;
import com.discord.primitives.UserId$$serializer;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import ti.f;
import wi.a2;
import wi.h;
import wi.m0;
import wi.n1;

@f
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b3\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 S2\u00020\u0001:\u0002RSB\u0090\u0001\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u0003\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018ø\u0001\u0000¢\u0006\u0002\u0010\u0019B\u0088\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0014ø\u0001\u0000¢\u0006\u0002\u0010\u001aJ\u0019\u00104\u001a\u00020\u0005HÆ\u0003ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b5\u0010\u001cJ\t\u00106\u001a\u00020\u0014HÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u0010\u00108\u001a\u0004\u0018\u00010\u0014HÆ\u0003¢\u0006\u0002\u0010\"J\u0019\u00109\u001a\u00020\u0007HÆ\u0003ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b:\u0010\u001eJ\u0019\u0010;\u001a\u0004\u0018\u00010\tHÆ\u0003ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0002\b<J\u0019\u0010=\u001a\u0004\u0018\u00010\u000bHÆ\u0003ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0002\b>J\u000b\u0010?\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000b\u0010@\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u000b\u0010A\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\t\u0010B\u001a\u00020\u0003HÆ\u0003J\u0010\u0010C\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010+J\u009e\u0001\u0010D\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0014HÆ\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bE\u0010FJ\u0013\u0010G\u001a\u00020\u00142\b\u0010H\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010I\u001a\u00020\u0003HÖ\u0001J\t\u0010J\u001a\u00020\u000fHÖ\u0001J!\u0010K\u001a\u00020L2\u0006\u0010M\u001a\u00020\u00002\u0006\u0010N\u001a\u00020O2\u0006\u0010P\u001a\u00020QHÇ\u0001R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u001c\u0010\u0006\u001a\u00020\u0007ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u001f\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001cR\u0015\u0010\u0016\u001a\u0004\u0018\u00010\u0014¢\u0006\n\n\u0002\u0010#\u001a\u0004\b!\u0010\"R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u001c\u0010\b\u001a\u0004\u0018\u00010\tø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u001c\u0010\u0004\u001a\u00020\u0005ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010)\u001a\u0004\b(\u0010\u001cR\u0015\u0010\u0012\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010,\u001a\u0004\b*\u0010+R\u0011\u0010\u0013\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\b\n\u0000\u001a\u0004\b/\u00100R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b1\u0010\u001cR\u0011\u0010\u0011\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b2\u00103\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006T"}, d2 = {"Lcom/discord/chat/bridge/automod/FlaggedMessageEmbed;", "", "seen1", "", "id", "Lcom/discord/primitives/MessageId;", "channelId", "Lcom/discord/primitives/ChannelId;", "guildId", "Lcom/discord/primitives/GuildId;", "userId", "Lcom/discord/primitives/UserId;", "content", "Lcom/discord/chat/bridge/structurabletext/StructurableText;", "channelName", "", "username", "usernameColor", "roleColor", "shouldShowRoleDot", "", "avatarURL", "communicationDisabled", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Lcom/discord/primitives/ChannelId;Lcom/discord/primitives/GuildId;Lcom/discord/primitives/UserId;Lcom/discord/chat/bridge/structurabletext/StructurableText;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Integer;ZLjava/lang/String;Ljava/lang/Boolean;Lkotlinx/serialization/internal/SerializationConstructorMarker;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "(Ljava/lang/String;JLcom/discord/primitives/GuildId;Lcom/discord/primitives/UserId;Lcom/discord/chat/bridge/structurabletext/StructurableText;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Integer;ZLjava/lang/String;Ljava/lang/Boolean;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getAvatarURL", "()Ljava/lang/String;", "getChannelId-o4g7jtM", "()J", "J", "getChannelName", "getCommunicationDisabled", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getContent", "()Lcom/discord/chat/bridge/structurabletext/StructurableText;", "getGuildId-qOKuAAo", "()Lcom/discord/primitives/GuildId;", "getId-3Eiw7ao", "Ljava/lang/String;", "getRoleColor", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getShouldShowRoleDot", "()Z", "getUserId-wUX8bhU", "()Lcom/discord/primitives/UserId;", "getUsername", "getUsernameColor", "()I", "component1", "component1-3Eiw7ao", "component10", "component11", "component12", "component2", "component2-o4g7jtM", "component3", "component3-qOKuAAo", "component4", "component4-wUX8bhU", "component5", "component6", "component7", "component8", "component9", "copy", "copy-Yv-vreA", "(Ljava/lang/String;JLcom/discord/primitives/GuildId;Lcom/discord/primitives/UserId;Lcom/discord/chat/bridge/structurabletext/StructurableText;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Integer;ZLjava/lang/String;Ljava/lang/Boolean;)Lcom/discord/chat/bridge/automod/FlaggedMessageEmbed;", "equals", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)

public final class FlaggedMessageEmbed {
    public static final Companion Companion = new Companion(null);
    private final String avatarURL;
    private final long channelId;
    private final String channelName;
    private final Boolean communicationDisabled;
    private final StructurableText content;
    private final GuildId guildId;

    
    private final String f7245id;
    private final Integer roleColor;
    private final boolean shouldShowRoleDot;
    private final UserId userId;
    private final String username;
    private final int usernameColor;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/discord/chat/bridge/automod/FlaggedMessageEmbed$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/bridge/automod/FlaggedMessageEmbed;", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    
    public static final class Companion {
        private Companion() {
        }

        public  Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<FlaggedMessageEmbed> serializer() {
            return FlaggedMessageEmbed$$serializer.INSTANCE;
        }
    }

    private FlaggedMessageEmbed(int i10, String str, ChannelId channelId, GuildId guildId, UserId userId, StructurableText structurableText, String str2, String str3, int i11, Integer num, boolean z10, String str4, Boolean bool, SerializationConstructorMarker serializationConstructorMarker) {
        if (643 != (i10 & 643)) {
            n1.b(i10, 643, FlaggedMessageEmbed$$serializer.INSTANCE.getDescriptor());
        }
        this.f7245id = str;
        this.channelId = channelId.m590unboximpl();
        if ((i10 & 4) == 0) {
            this.guildId = null;
        } else {
            this.guildId = guildId;
        }
        if ((i10 & 8) == 0) {
            this.userId = null;
        } else {
            this.userId = userId;
        }
        if ((i10 & 16) == 0) {
            this.content = null;
        } else {
            this.content = structurableText;
        }
        if ((i10 & 32) == 0) {
            this.channelName = null;
        } else {
            this.channelName = str2;
        }
        if ((i10 & 64) == 0) {
            this.username = null;
        } else {
            this.username = str3;
        }
        this.usernameColor = i11;
        if ((i10 & 256) == 0) {
            this.roleColor = null;
        } else {
            this.roleColor = num;
        }
        this.shouldShowRoleDot = z10;
        if ((i10 & 1024) == 0) {
            this.avatarURL = null;
        } else {
            this.avatarURL = str4;
        }
        if ((i10 & RecyclerView.ItemAnimator.FLAG_MOVED) == 0) {
            this.communicationDisabled = Boolean.FALSE;
        } else {
            this.communicationDisabled = bool;
        }
    }

    public  FlaggedMessageEmbed(int i10, String str, ChannelId channelId, GuildId guildId, UserId userId, StructurableText structurableText, String str2, String str3, int i11, Integer num, boolean z10, String str4, Boolean bool, SerializationConstructorMarker serializationConstructorMarker, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, str, channelId, guildId, userId, structurableText, str2, str3, i11, num, z10, str4, bool, serializationConstructorMarker);
    }

    public  FlaggedMessageEmbed(String str, long j10, GuildId guildId, UserId userId, StructurableText structurableText, String str2, String str3, int i10, Integer num, boolean z10, String str4, Boolean bool, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, j10, guildId, userId, structurableText, str2, str3, i10, num, z10, str4, bool);
    }

    public static final void write$Self(FlaggedMessageEmbed self, CompositeEncoder output, SerialDescriptor serialDesc) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        q.h(self, "self");
        q.h(output, "output");
        q.h(serialDesc, "serialDesc");
        boolean z17 = false;
        output.o(serialDesc, 0, MessageId$$serializer.INSTANCE, MessageId.m607boximpl(self.f7245id));
        output.o(serialDesc, 1, ChannelId$$serializer.INSTANCE, ChannelId.m581boximpl(self.channelId));
        if (!output.z(serialDesc, 2) && self.guildId == null) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            output.B(serialDesc, 2, GuildId$$serializer.INSTANCE, self.guildId);
        }
        if (!output.z(serialDesc, 3) && self.userId == null) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (z11) {
            output.B(serialDesc, 3, UserId$$serializer.INSTANCE, self.userId);
        }
        if (!output.z(serialDesc, 4) && self.content == null) {
            z12 = false;
        } else {
            z12 = true;
        }
        if (z12) {
            output.B(serialDesc, 4, StructurableTextSerializer.INSTANCE, self.content);
        }
        if (!output.z(serialDesc, 5) && self.channelName == null) {
            z13 = false;
        } else {
            z13 = true;
        }
        if (z13) {
            output.B(serialDesc, 5, a2.f29755a, self.channelName);
        }
        if (!output.z(serialDesc, 6) && self.username == null) {
            z14 = false;
        } else {
            z14 = true;
        }
        if (z14) {
            output.B(serialDesc, 6, a2.f29755a, self.username);
        }
        output.v(serialDesc, 7, self.usernameColor);
        if (!output.z(serialDesc, 8) && self.roleColor == null) {
            z15 = false;
        } else {
            z15 = true;
        }
        if (z15) {
            output.B(serialDesc, 8, m0.f29830a, self.roleColor);
        }
        output.w(serialDesc, 9, self.shouldShowRoleDot);
        if (!output.z(serialDesc, 10) && self.avatarURL == null) {
            z16 = false;
        } else {
            z16 = true;
        }
        if (z16) {
            output.B(serialDesc, 10, a2.f29755a, self.avatarURL);
        }
        if (output.z(serialDesc, 11) || !q.c(self.communicationDisabled, Boolean.FALSE)) {
            z17 = true;
        }
        if (z17) {
            output.B(serialDesc, 11, h.f29797a, self.communicationDisabled);
        }
    }

    
    public final String m20component13Eiw7ao() {
        return this.f7245id;
    }

    public final boolean component10() {
        return this.shouldShowRoleDot;
    }

    public final String component11() {
        return this.avatarURL;
    }

    public final Boolean component12() {
        return this.communicationDisabled;
    }

    
    public final long m21component2o4g7jtM() {
        return this.channelId;
    }

    
    public final GuildId m22component3qOKuAAo() {
        return this.guildId;
    }

    
    public final UserId m23component4wUX8bhU() {
        return this.userId;
    }

    public final StructurableText component5() {
        return this.content;
    }

    public final String component6() {
        return this.channelName;
    }

    public final String component7() {
        return this.username;
    }

    public final int component8() {
        return this.usernameColor;
    }

    public final Integer component9() {
        return this.roleColor;
    }

    
    public final FlaggedMessageEmbed m24copyYvvreA(String id2, long j10, GuildId guildId, UserId userId, StructurableText structurableText, String str, String str2, int i10, Integer num, boolean z10, String str3, Boolean bool) {
        q.h(id2, "id");
        return new FlaggedMessageEmbed(id2, j10, guildId, userId, structurableText, str, str2, i10, num, z10, str3, bool, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FlaggedMessageEmbed)) {
            return false;
        }
        FlaggedMessageEmbed flaggedMessageEmbed = (FlaggedMessageEmbed) obj;
        return MessageId.m611equalsimpl0(this.f7245id, flaggedMessageEmbed.f7245id) && ChannelId.m585equalsimpl0(this.channelId, flaggedMessageEmbed.channelId) && q.c(this.guildId, flaggedMessageEmbed.guildId) && q.c(this.userId, flaggedMessageEmbed.userId) && q.c(this.content, flaggedMessageEmbed.content) && q.c(this.channelName, flaggedMessageEmbed.channelName) && q.c(this.username, flaggedMessageEmbed.username) && this.usernameColor == flaggedMessageEmbed.usernameColor && q.c(this.roleColor, flaggedMessageEmbed.roleColor) && this.shouldShowRoleDot == flaggedMessageEmbed.shouldShowRoleDot && q.c(this.avatarURL, flaggedMessageEmbed.avatarURL) && q.c(this.communicationDisabled, flaggedMessageEmbed.communicationDisabled);
    }

    public final String getAvatarURL() {
        return this.avatarURL;
    }

    
    public final long m25getChannelIdo4g7jtM() {
        return this.channelId;
    }

    public final String getChannelName() {
        return this.channelName;
    }

    public final Boolean getCommunicationDisabled() {
        return this.communicationDisabled;
    }

    public final StructurableText getContent() {
        return this.content;
    }

    
    public final GuildId m26getGuildIdqOKuAAo() {
        return this.guildId;
    }

    
    public final String m27getId3Eiw7ao() {
        return this.f7245id;
    }

    public final Integer getRoleColor() {
        return this.roleColor;
    }

    public final boolean getShouldShowRoleDot() {
        return this.shouldShowRoleDot;
    }

    
    public final UserId m28getUserIdwUX8bhU() {
        return this.userId;
    }

    public final String getUsername() {
        return this.username;
    }

    public final int getUsernameColor() {
        return this.usernameColor;
    }

    public int hashCode() {
        int i10 = ((MessageId.m612hashCodeimpl(this.f7245id) * 31) + ChannelId.m586hashCodeimpl(this.channelId)) * 31;
        GuildId guildId = this.guildId;
        int i11 = 0;
        int i12 = (i10 + (guildId == null ? 0 : GuildId.m599hashCodeimpl(guildId.m603unboximpl()))) * 31;
        UserId userId = this.userId;
        int i13 = (i12 + (userId == null ? 0 : UserId.m650hashCodeimpl(userId.m654unboximpl()))) * 31;
        StructurableText structurableText = this.content;
        int hashCode = (i13 + (structurableText == null ? 0 : structurableText.hashCode())) * 31;
        String str = this.channelName;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.username;
        int hashCode3 = (((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.usernameColor) * 31;
        Integer num = this.roleColor;
        int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        boolean z10 = this.shouldShowRoleDot;
        if (z10) {
            z10 = true;
        }
        int i14 = z10 ? 1 : 0;
        int i15 = z10 ? 1 : 0;
        int i16 = z10 ? 1 : 0;
        int i17 = (hashCode4 + i14) * 31;
        String str3 = this.avatarURL;
        int hashCode5 = (i17 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool = this.communicationDisabled;
        if (bool != null) {
            i11 = bool.hashCode();
        }
        return hashCode5 + i11;
    }

    public String toString() {
        String str = MessageId.m613toStringimpl(this.f7245id);
        String str2 = ChannelId.m588toStringimpl(this.channelId);
        GuildId guildId = this.guildId;
        UserId userId = this.userId;
        StructurableText structurableText = this.content;
        String str3 = this.channelName;
        String str4 = this.username;
        int i10 = this.usernameColor;
        Integer num = this.roleColor;
        boolean z10 = this.shouldShowRoleDot;
        String str5 = this.avatarURL;
        Boolean bool = this.communicationDisabled;
        return "FlaggedMessageEmbed(id=" + str + ", channelId=" + str2 + ", guildId=" + guildId + ", userId=" + userId + ", content=" + structurableText + ", channelName=" + str3 + ", username=" + str4 + ", usernameColor=" + i10 + ", roleColor=" + num + ", shouldShowRoleDot=" + z10 + ", avatarURL=" + str5 + ", communicationDisabled=" + bool + ")";
    }

    private FlaggedMessageEmbed(String str, long j10, GuildId guildId, UserId userId, StructurableText structurableText, String str2, String str3, int i10, Integer num, boolean z10, String str4, Boolean bool) {
        this.f7245id = str;
        this.channelId = j10;
        this.guildId = guildId;
        this.userId = userId;
        this.content = structurableText;
        this.channelName = str2;
        this.username = str3;
        this.usernameColor = i10;
        this.roleColor = num;
        this.shouldShowRoleDot = z10;
        this.avatarURL = str4;
        this.communicationDisabled = bool;
    }

    public  FlaggedMessageEmbed(String str, long j10, GuildId guildId, UserId userId, StructurableText structurableText, String str2, String str3, int i10, Integer num, boolean z10, String str4, Boolean bool, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, j10, (i11 & 4) != 0 ? null : guildId, (i11 & 8) != 0 ? null : userId, (i11 & 16) != 0 ? null : structurableText, (i11 & 32) != 0 ? null : str2, (i11 & 64) != 0 ? null : str3, i10, (i11 & 256) != 0 ? null : num, z10, (i11 & 1024) != 0 ? null : str4, (i11 & RecyclerView.ItemAnimator.FLAG_MOVED) != 0 ? Boolean.FALSE : bool, null);
    }
}
