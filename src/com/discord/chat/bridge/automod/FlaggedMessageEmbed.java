package com.discord.chat.bridge.automod;

import androidx.recyclerview.widget.RecyclerView;
import bj.C2500a2;
import bj.C2530h;
import bj.C2555m0;
import bj.C2560n1;
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
import kotlin.jvm.internal.C9677q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p164j$.util.Spliterator;
import p450yi.AbstractC14370f;

@AbstractC14370f
@Metadata(m15074d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b3\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 S2\u00020\u0001:\u0002RSB\u0090\u0001\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u0003\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018ø\u0001\u0000¢\u0006\u0002\u0010\u0019B\u0088\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0014ø\u0001\u0000¢\u0006\u0002\u0010\u001aJ\u0019\u00104\u001a\u00020\u0005HÆ\u0003ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b5\u0010\u001cJ\t\u00106\u001a\u00020\u0014HÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u0010\u00108\u001a\u0004\u0018\u00010\u0014HÆ\u0003¢\u0006\u0002\u0010\"J\u0019\u00109\u001a\u00020\u0007HÆ\u0003ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b:\u0010\u001eJ\u0019\u0010;\u001a\u0004\u0018\u00010\tHÆ\u0003ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0002\b<J\u0019\u0010=\u001a\u0004\u0018\u00010\u000bHÆ\u0003ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0002\b>J\u000b\u0010?\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000b\u0010@\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u000b\u0010A\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\t\u0010B\u001a\u00020\u0003HÆ\u0003J\u0010\u0010C\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010+J\u009e\u0001\u0010D\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0014HÆ\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bE\u0010FJ\u0013\u0010G\u001a\u00020\u00142\b\u0010H\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010I\u001a\u00020\u0003HÖ\u0001J\t\u0010J\u001a\u00020\u000fHÖ\u0001J!\u0010K\u001a\u00020L2\u0006\u0010M\u001a\u00020\u00002\u0006\u0010N\u001a\u00020O2\u0006\u0010P\u001a\u00020QHÇ\u0001R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u001c\u0010\u0006\u001a\u00020\u0007ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u001f\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001cR\u0015\u0010\u0016\u001a\u0004\u0018\u00010\u0014¢\u0006\n\n\u0002\u0010#\u001a\u0004\b!\u0010\"R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u001c\u0010\b\u001a\u0004\u0018\u00010\tø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u001c\u0010\u0004\u001a\u00020\u0005ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010)\u001a\u0004\b(\u0010\u001cR\u0015\u0010\u0012\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010,\u001a\u0004\b*\u0010+R\u0011\u0010\u0013\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\b\n\u0000\u001a\u0004\b/\u00100R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b1\u0010\u001cR\u0011\u0010\u0011\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b2\u00103\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006T"}, m15073d2 = {"Lcom/discord/chat/bridge/automod/FlaggedMessageEmbed;", "", "seen1", "", "id", "Lcom/discord/primitives/MessageId;", "channelId", "Lcom/discord/primitives/ChannelId;", "guildId", "Lcom/discord/primitives/GuildId;", "userId", "Lcom/discord/primitives/UserId;", "content", "Lcom/discord/chat/bridge/structurabletext/StructurableText;", "channelName", "", "username", "usernameColor", "roleColor", "shouldShowRoleDot", "", "avatarURL", "communicationDisabled", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Lcom/discord/primitives/ChannelId;Lcom/discord/primitives/GuildId;Lcom/discord/primitives/UserId;Lcom/discord/chat/bridge/structurabletext/StructurableText;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Integer;ZLjava/lang/String;Ljava/lang/Boolean;Lkotlinx/serialization/internal/SerializationConstructorMarker;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "(Ljava/lang/String;JLcom/discord/primitives/GuildId;Lcom/discord/primitives/UserId;Lcom/discord/chat/bridge/structurabletext/StructurableText;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Integer;ZLjava/lang/String;Ljava/lang/Boolean;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getAvatarURL", "()Ljava/lang/String;", "getChannelId-o4g7jtM", "()J", "J", "getChannelName", "getCommunicationDisabled", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getContent", "()Lcom/discord/chat/bridge/structurabletext/StructurableText;", "getGuildId-qOKuAAo", "()Lcom/discord/primitives/GuildId;", "getId-3Eiw7ao", "Ljava/lang/String;", "getRoleColor", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getShouldShowRoleDot", "()Z", "getUserId-wUX8bhU", "()Lcom/discord/primitives/UserId;", "getUsername", "getUsernameColor", "()I", "component1", "component1-3Eiw7ao", "component10", "component11", "component12", "component2", "component2-o4g7jtM", "component3", "component3-qOKuAAo", "component4", "component4-wUX8bhU", "component5", "component6", "component7", "component8", "component9", "copy", "copy-Yv-vreA", "(Ljava/lang/String;JLcom/discord/primitives/GuildId;Lcom/discord/primitives/UserId;Lcom/discord/chat/bridge/structurabletext/StructurableText;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Integer;ZLjava/lang/String;Ljava/lang/Boolean;)Lcom/discord/chat/bridge/automod/FlaggedMessageEmbed;", "equals", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "chat_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes4.dex */
public final class FlaggedMessageEmbed {
    public static final Companion Companion = new Companion(null);
    private final String avatarURL;
    private final long channelId;
    private final String channelName;
    private final Boolean communicationDisabled;
    private final StructurableText content;
    private final GuildId guildId;

    /* renamed from: id */
    private final String f8425id;
    private final Integer roleColor;
    private final boolean shouldShowRoleDot;
    private final UserId userId;
    private final String username;
    private final int usernameColor;

    @Metadata(m15074d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m15073d2 = {"Lcom/discord/chat/bridge/automod/FlaggedMessageEmbed$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/bridge/automod/FlaggedMessageEmbed;", "chat_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<FlaggedMessageEmbed> serializer() {
            return FlaggedMessageEmbed$$serializer.INSTANCE;
        }
    }

    private FlaggedMessageEmbed(int i, String str, ChannelId channelId, GuildId guildId, UserId userId, StructurableText structurableText, String str2, String str3, int i2, Integer num, boolean z, String str4, Boolean bool, SerializationConstructorMarker serializationConstructorMarker) {
        if (643 != (i & 643)) {
            C2560n1.m33818b(i, 643, FlaggedMessageEmbed$$serializer.INSTANCE.getDescriptor());
        }
        this.f8425id = str;
        this.channelId = channelId.m42098unboximpl();
        if ((i & 4) == 0) {
            this.guildId = null;
        } else {
            this.guildId = guildId;
        }
        if ((i & 8) == 0) {
            this.userId = null;
        } else {
            this.userId = userId;
        }
        if ((i & 16) == 0) {
            this.content = null;
        } else {
            this.content = structurableText;
        }
        if ((i & 32) == 0) {
            this.channelName = null;
        } else {
            this.channelName = str2;
        }
        if ((i & 64) == 0) {
            this.username = null;
        } else {
            this.username = str3;
        }
        this.usernameColor = i2;
        if ((i & Spliterator.NONNULL) == 0) {
            this.roleColor = null;
        } else {
            this.roleColor = num;
        }
        this.shouldShowRoleDot = z;
        if ((i & Spliterator.IMMUTABLE) == 0) {
            this.avatarURL = null;
        } else {
            this.avatarURL = str4;
        }
        if ((i & RecyclerView.ItemAnimator.FLAG_MOVED) == 0) {
            this.communicationDisabled = Boolean.FALSE;
        } else {
            this.communicationDisabled = bool;
        }
    }

    public /* synthetic */ FlaggedMessageEmbed(int i, String str, ChannelId channelId, GuildId guildId, UserId userId, StructurableText structurableText, String str2, String str3, int i2, Integer num, boolean z, String str4, Boolean bool, SerializationConstructorMarker serializationConstructorMarker, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, str, channelId, guildId, userId, structurableText, str2, str3, i2, num, z, str4, bool, serializationConstructorMarker);
    }

    public /* synthetic */ FlaggedMessageEmbed(String str, long j, GuildId guildId, UserId userId, StructurableText structurableText, String str2, String str3, int i, Integer num, boolean z, String str4, Boolean bool, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, j, guildId, userId, structurableText, str2, str3, i, num, z, str4, bool);
    }

    public static final void write$Self(FlaggedMessageEmbed self, CompositeEncoder output, SerialDescriptor serialDesc) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        C9677q.m14633g(self, "self");
        C9677q.m14633g(output, "output");
        C9677q.m14633g(serialDesc, "serialDesc");
        boolean z8 = false;
        output.mo13870t(serialDesc, 0, MessageId$$serializer.INSTANCE, MessageId.m42115boximpl(self.f8425id));
        output.mo13870t(serialDesc, 1, ChannelId$$serializer.INSTANCE, ChannelId.m42089boximpl(self.channelId));
        if (!output.mo13893A(serialDesc, 2) && self.guildId == null) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            output.mo13874p(serialDesc, 2, GuildId$$serializer.INSTANCE, self.guildId);
        }
        if (!output.mo13893A(serialDesc, 3) && self.userId == null) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z2) {
            output.mo13874p(serialDesc, 3, UserId$$serializer.INSTANCE, self.userId);
        }
        if (!output.mo13893A(serialDesc, 4) && self.content == null) {
            z3 = false;
        } else {
            z3 = true;
        }
        if (z3) {
            output.mo13874p(serialDesc, 4, StructurableTextSerializer.INSTANCE, self.content);
        }
        if (!output.mo13893A(serialDesc, 5) && self.channelName == null) {
            z4 = false;
        } else {
            z4 = true;
        }
        if (z4) {
            output.mo13874p(serialDesc, 5, C2500a2.f6719a, self.channelName);
        }
        if (!output.mo13893A(serialDesc, 6) && self.username == null) {
            z5 = false;
        } else {
            z5 = true;
        }
        if (z5) {
            output.mo13874p(serialDesc, 6, C2500a2.f6719a, self.username);
        }
        output.mo13866x(serialDesc, 7, self.usernameColor);
        if (!output.mo13893A(serialDesc, 8) && self.roleColor == null) {
            z6 = false;
        } else {
            z6 = true;
        }
        if (z6) {
            output.mo13874p(serialDesc, 8, C2555m0.f6794a, self.roleColor);
        }
        output.mo13865y(serialDesc, 9, self.shouldShowRoleDot);
        if (!output.mo13893A(serialDesc, 10) && self.avatarURL == null) {
            z7 = false;
        } else {
            z7 = true;
        }
        if (z7) {
            output.mo13874p(serialDesc, 10, C2500a2.f6719a, self.avatarURL);
        }
        if (output.mo13893A(serialDesc, 11) || !C9677q.m14638b(self.communicationDisabled, Boolean.FALSE)) {
            z8 = true;
        }
        if (z8) {
            output.mo13874p(serialDesc, 11, C2530h.f6761a, self.communicationDisabled);
        }
    }

    /* renamed from: component1-3Eiw7ao  reason: not valid java name */
    public final String m41582component13Eiw7ao() {
        return this.f8425id;
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

    /* renamed from: component2-o4g7jtM  reason: not valid java name */
    public final long m41583component2o4g7jtM() {
        return this.channelId;
    }

    /* renamed from: component3-qOKuAAo  reason: not valid java name */
    public final GuildId m41584component3qOKuAAo() {
        return this.guildId;
    }

    /* renamed from: component4-wUX8bhU  reason: not valid java name */
    public final UserId m41585component4wUX8bhU() {
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

    /* renamed from: copy-Yv-vreA  reason: not valid java name */
    public final FlaggedMessageEmbed m41586copyYvvreA(String id2, long j, GuildId guildId, UserId userId, StructurableText structurableText, String str, String str2, int i, Integer num, boolean z, String str3, Boolean bool) {
        C9677q.m14633g(id2, "id");
        return new FlaggedMessageEmbed(id2, j, guildId, userId, structurableText, str, str2, i, num, z, str3, bool, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FlaggedMessageEmbed)) {
            return false;
        }
        FlaggedMessageEmbed flaggedMessageEmbed = (FlaggedMessageEmbed) obj;
        return MessageId.m42119equalsimpl0(this.f8425id, flaggedMessageEmbed.f8425id) && ChannelId.m42093equalsimpl0(this.channelId, flaggedMessageEmbed.channelId) && C9677q.m14638b(this.guildId, flaggedMessageEmbed.guildId) && C9677q.m14638b(this.userId, flaggedMessageEmbed.userId) && C9677q.m14638b(this.content, flaggedMessageEmbed.content) && C9677q.m14638b(this.channelName, flaggedMessageEmbed.channelName) && C9677q.m14638b(this.username, flaggedMessageEmbed.username) && this.usernameColor == flaggedMessageEmbed.usernameColor && C9677q.m14638b(this.roleColor, flaggedMessageEmbed.roleColor) && this.shouldShowRoleDot == flaggedMessageEmbed.shouldShowRoleDot && C9677q.m14638b(this.avatarURL, flaggedMessageEmbed.avatarURL) && C9677q.m14638b(this.communicationDisabled, flaggedMessageEmbed.communicationDisabled);
    }

    public final String getAvatarURL() {
        return this.avatarURL;
    }

    /* renamed from: getChannelId-o4g7jtM  reason: not valid java name */
    public final long m41587getChannelIdo4g7jtM() {
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

    /* renamed from: getGuildId-qOKuAAo  reason: not valid java name */
    public final GuildId m41588getGuildIdqOKuAAo() {
        return this.guildId;
    }

    /* renamed from: getId-3Eiw7ao  reason: not valid java name */
    public final String m41589getId3Eiw7ao() {
        return this.f8425id;
    }

    public final Integer getRoleColor() {
        return this.roleColor;
    }

    public final boolean getShouldShowRoleDot() {
        return this.shouldShowRoleDot;
    }

    /* renamed from: getUserId-wUX8bhU  reason: not valid java name */
    public final UserId m41590getUserIdwUX8bhU() {
        return this.userId;
    }

    public final String getUsername() {
        return this.username;
    }

    public final int getUsernameColor() {
        return this.usernameColor;
    }

    public int hashCode() {
        int i = ((MessageId.m42120hashCodeimpl(this.f8425id) * 31) + ChannelId.m42094hashCodeimpl(this.channelId)) * 31;
        GuildId guildId = this.guildId;
        int i2 = 0;
        int i3 = (i + (guildId == null ? 0 : GuildId.m42107hashCodeimpl(guildId.m42111unboximpl()))) * 31;
        UserId userId = this.userId;
        int i4 = (i3 + (userId == null ? 0 : UserId.m42158hashCodeimpl(userId.m42162unboximpl()))) * 31;
        StructurableText structurableText = this.content;
        int hashCode = (i4 + (structurableText == null ? 0 : structurableText.hashCode())) * 31;
        String str = this.channelName;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.username;
        int hashCode3 = (((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.usernameColor) * 31;
        Integer num = this.roleColor;
        int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        boolean z = this.shouldShowRoleDot;
        if (z) {
            z = true;
        }
        int i5 = z ? 1 : 0;
        int i6 = z ? 1 : 0;
        int i7 = z ? 1 : 0;
        int i8 = (hashCode4 + i5) * 31;
        String str3 = this.avatarURL;
        int hashCode5 = (i8 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool = this.communicationDisabled;
        if (bool != null) {
            i2 = bool.hashCode();
        }
        return hashCode5 + i2;
    }

    public String toString() {
        String str = MessageId.m42121toStringimpl(this.f8425id);
        String str2 = ChannelId.m42096toStringimpl(this.channelId);
        GuildId guildId = this.guildId;
        UserId userId = this.userId;
        StructurableText structurableText = this.content;
        String str3 = this.channelName;
        String str4 = this.username;
        int i = this.usernameColor;
        Integer num = this.roleColor;
        boolean z = this.shouldShowRoleDot;
        String str5 = this.avatarURL;
        Boolean bool = this.communicationDisabled;
        return "FlaggedMessageEmbed(id=" + str + ", channelId=" + str2 + ", guildId=" + guildId + ", userId=" + userId + ", content=" + structurableText + ", channelName=" + str3 + ", username=" + str4 + ", usernameColor=" + i + ", roleColor=" + num + ", shouldShowRoleDot=" + z + ", avatarURL=" + str5 + ", communicationDisabled=" + bool + ")";
    }

    private FlaggedMessageEmbed(String str, long j, GuildId guildId, UserId userId, StructurableText structurableText, String str2, String str3, int i, Integer num, boolean z, String str4, Boolean bool) {
        this.f8425id = str;
        this.channelId = j;
        this.guildId = guildId;
        this.userId = userId;
        this.content = structurableText;
        this.channelName = str2;
        this.username = str3;
        this.usernameColor = i;
        this.roleColor = num;
        this.shouldShowRoleDot = z;
        this.avatarURL = str4;
        this.communicationDisabled = bool;
    }

    public /* synthetic */ FlaggedMessageEmbed(String str, long j, GuildId guildId, UserId userId, StructurableText structurableText, String str2, String str3, int i, Integer num, boolean z, String str4, Boolean bool, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, j, (i2 & 4) != 0 ? null : guildId, (i2 & 8) != 0 ? null : userId, (i2 & 16) != 0 ? null : structurableText, (i2 & 32) != 0 ? null : str2, (i2 & 64) != 0 ? null : str3, i, (i2 & Spliterator.NONNULL) != 0 ? null : num, z, (i2 & Spliterator.IMMUTABLE) != 0 ? null : str4, (i2 & RecyclerView.ItemAnimator.FLAG_MOVED) != 0 ? Boolean.FALSE : bool, null);
    }
}
