package com.discord.chat.bridge.postpreviewembed;

import bj.a2;
import bj.n1;
import com.discord.chat.bridge.structurabletext.StructurableText;
import com.discord.chat.bridge.structurabletext.StructurableTextSerializer;
import com.discord.primitives.ChannelId;
import com.discord.primitives.ChannelId$$serializer;
import com.discord.primitives.GuildId;
import com.discord.primitives.GuildId$$serializer;
import com.discord.primitives.MessageId;
import com.discord.primitives.MessageId$$serializer;
import j$.util.Spliterator;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import yi.f;

@f
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b%\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 G2\u00020\u0001:\u0002FGB\u008a\u0001\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015ø\u0001\u0000¢\u0006\u0002\u0010\u0016Bp\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\fø\u0001\u0000¢\u0006\u0002\u0010\u0017J\u0019\u0010(\u001a\u00020\u0005HÆ\u0003ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b)\u0010 J\u000b\u0010*\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\fHÆ\u0003J\u0019\u0010,\u001a\u00020\u0005HÆ\u0003ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b-\u0010 J\u0019\u0010.\u001a\u00020\bHÆ\u0003ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b/\u0010\u0019J\u0019\u00100\u001a\u00020\nHÆ\u0003ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b1\u0010 J\t\u00102\u001a\u00020\fHÆ\u0003J\t\u00103\u001a\u00020\fHÆ\u0003J\t\u00104\u001a\u00020\u000fHÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\fHÆ\u0003J\u008c\u0001\u00107\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\fHÆ\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b8\u00109J\u0013\u0010:\u001a\u00020;2\b\u0010<\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010=\u001a\u00020\u0003HÖ\u0001J\t\u0010>\u001a\u00020\fHÖ\u0001J!\u0010?\u001a\u00020@2\u0006\u0010A\u001a\u00020\u00002\u0006\u0010B\u001a\u00020C2\u0006\u0010D\u001a\u00020EHÇ\u0001R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0019R\u0011\u0010\r\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0019R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u001c\u0010\t\u001a\u00020\nø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010!\u001a\u0004\b\u001f\u0010 R\u001c\u0010\u0007\u001a\u00020\bø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010#\u001a\u0004\b\"\u0010\u0019R\u001c\u0010\u0004\u001a\u00020\u0005ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010!\u001a\u0004\b$\u0010 R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0019R\u001c\u0010\u0006\u001a\u00020\u0005ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010!\u001a\u0004\b&\u0010 R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u0019\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006H"}, d2 = {"Lcom/discord/chat/bridge/postpreviewembed/PostPreviewEmbed;", "", "seen1", "", "parentChannelId", "Lcom/discord/primitives/ChannelId;", "threadId", "messageId", "Lcom/discord/primitives/MessageId;", "guildId", "Lcom/discord/primitives/GuildId;", "title", "", "ctaText", "footer", "Lcom/discord/chat/bridge/structurabletext/StructurableText;", "subtitle", "coverImage", "blurredCoverImage", "coverImageOverlayText", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/discord/primitives/ChannelId;Lcom/discord/primitives/ChannelId;Ljava/lang/String;Lcom/discord/primitives/GuildId;Ljava/lang/String;Ljava/lang/String;Lcom/discord/chat/bridge/structurabletext/StructurableText;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "(JJLjava/lang/String;JLjava/lang/String;Ljava/lang/String;Lcom/discord/chat/bridge/structurabletext/StructurableText;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getBlurredCoverImage", "()Ljava/lang/String;", "getCoverImage", "getCoverImageOverlayText", "getCtaText", "getFooter", "()Lcom/discord/chat/bridge/structurabletext/StructurableText;", "getGuildId-fYKD8eg", "()J", "J", "getMessageId-3Eiw7ao", "Ljava/lang/String;", "getParentChannelId-o4g7jtM", "getSubtitle", "getThreadId-o4g7jtM", "getTitle", "component1", "component1-o4g7jtM", "component10", "component11", "component2", "component2-o4g7jtM", "component3", "component3-3Eiw7ao", "component4", "component4-fYKD8eg", "component5", "component6", "component7", "component8", "component9", "copy", "copy-2wKWx2Q", "(JJLjava/lang/String;JLjava/lang/String;Ljava/lang/String;Lcom/discord/chat/bridge/structurabletext/StructurableText;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/discord/chat/bridge/postpreviewembed/PostPreviewEmbed;", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class PostPreviewEmbed {
    public static final Companion Companion = new Companion(null);
    private final String blurredCoverImage;
    private final String coverImage;
    private final String coverImageOverlayText;
    private final String ctaText;
    private final StructurableText footer;
    private final long guildId;
    private final String messageId;
    private final long parentChannelId;
    private final String subtitle;
    private final long threadId;
    private final String title;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/discord/chat/bridge/postpreviewembed/PostPreviewEmbed$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/bridge/postpreviewembed/PostPreviewEmbed;", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<PostPreviewEmbed> serializer() {
            return PostPreviewEmbed$$serializer.INSTANCE;
        }
    }

    private PostPreviewEmbed(int i10, ChannelId channelId, ChannelId channelId2, String str, GuildId guildId, String str2, String str3, StructurableText structurableText, String str4, String str5, String str6, String str7, SerializationConstructorMarker serializationConstructorMarker) {
        if (127 != (i10 & 127)) {
            n1.b(i10, 127, PostPreviewEmbed$$serializer.INSTANCE.getDescriptor());
        }
        this.parentChannelId = channelId.m541unboximpl();
        this.threadId = channelId2.m541unboximpl();
        this.messageId = str;
        this.guildId = guildId.m554unboximpl();
        this.title = str2;
        this.ctaText = str3;
        this.footer = structurableText;
        if ((i10 & 128) == 0) {
            this.subtitle = null;
        } else {
            this.subtitle = str4;
        }
        if ((i10 & Spliterator.NONNULL) == 0) {
            this.coverImage = null;
        } else {
            this.coverImage = str5;
        }
        if ((i10 & 512) == 0) {
            this.blurredCoverImage = null;
        } else {
            this.blurredCoverImage = str6;
        }
        if ((i10 & Spliterator.IMMUTABLE) == 0) {
            this.coverImageOverlayText = null;
        } else {
            this.coverImageOverlayText = str7;
        }
    }

    public /* synthetic */ PostPreviewEmbed(int i10, ChannelId channelId, ChannelId channelId2, String str, GuildId guildId, String str2, String str3, StructurableText structurableText, String str4, String str5, String str6, String str7, SerializationConstructorMarker serializationConstructorMarker, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, channelId, channelId2, str, guildId, str2, str3, structurableText, str4, str5, str6, str7, serializationConstructorMarker);
    }

    public /* synthetic */ PostPreviewEmbed(long j10, long j11, String str, long j12, String str2, String str3, StructurableText structurableText, String str4, String str5, String str6, String str7, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, j11, str, j12, str2, str3, structurableText, str4, str5, str6, str7);
    }

    public static final void write$Self(PostPreviewEmbed self, CompositeEncoder output, SerialDescriptor serialDesc) {
        boolean z10;
        boolean z11;
        boolean z12;
        q.g(self, "self");
        q.g(output, "output");
        q.g(serialDesc, "serialDesc");
        ChannelId$$serializer channelId$$serializer = ChannelId$$serializer.INSTANCE;
        boolean z13 = false;
        output.t(serialDesc, 0, channelId$$serializer, ChannelId.m532boximpl(self.parentChannelId));
        output.t(serialDesc, 1, channelId$$serializer, ChannelId.m532boximpl(self.threadId));
        output.t(serialDesc, 2, MessageId$$serializer.INSTANCE, MessageId.m558boximpl(self.messageId));
        output.t(serialDesc, 3, GuildId$$serializer.INSTANCE, GuildId.m545boximpl(self.guildId));
        output.z(serialDesc, 4, self.title);
        output.z(serialDesc, 5, self.ctaText);
        output.t(serialDesc, 6, StructurableTextSerializer.INSTANCE, self.footer);
        if (!output.A(serialDesc, 7) && self.subtitle == null) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            output.p(serialDesc, 7, a2.f5917a, self.subtitle);
        }
        if (!output.A(serialDesc, 8) && self.coverImage == null) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (z11) {
            output.p(serialDesc, 8, a2.f5917a, self.coverImage);
        }
        if (!output.A(serialDesc, 9) && self.blurredCoverImage == null) {
            z12 = false;
        } else {
            z12 = true;
        }
        if (z12) {
            output.p(serialDesc, 9, a2.f5917a, self.blurredCoverImage);
        }
        if (output.A(serialDesc, 10) || self.coverImageOverlayText != null) {
            z13 = true;
        }
        if (z13) {
            output.p(serialDesc, 10, a2.f5917a, self.coverImageOverlayText);
        }
    }

    /* renamed from: component1-o4g7jtM  reason: not valid java name */
    public final long m107component1o4g7jtM() {
        return this.parentChannelId;
    }

    public final String component10() {
        return this.blurredCoverImage;
    }

    public final String component11() {
        return this.coverImageOverlayText;
    }

    /* renamed from: component2-o4g7jtM  reason: not valid java name */
    public final long m108component2o4g7jtM() {
        return this.threadId;
    }

    /* renamed from: component3-3Eiw7ao  reason: not valid java name */
    public final String m109component33Eiw7ao() {
        return this.messageId;
    }

    /* renamed from: component4-fYKD8eg  reason: not valid java name */
    public final long m110component4fYKD8eg() {
        return this.guildId;
    }

    public final String component5() {
        return this.title;
    }

    public final String component6() {
        return this.ctaText;
    }

    public final StructurableText component7() {
        return this.footer;
    }

    public final String component8() {
        return this.subtitle;
    }

    public final String component9() {
        return this.coverImage;
    }

    /* renamed from: copy-2wKWx2Q  reason: not valid java name */
    public final PostPreviewEmbed m111copy2wKWx2Q(long j10, long j11, String messageId, long j12, String title, String ctaText, StructurableText footer, String str, String str2, String str3, String str4) {
        q.g(messageId, "messageId");
        q.g(title, "title");
        q.g(ctaText, "ctaText");
        q.g(footer, "footer");
        return new PostPreviewEmbed(j10, j11, messageId, j12, title, ctaText, footer, str, str2, str3, str4, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PostPreviewEmbed)) {
            return false;
        }
        PostPreviewEmbed postPreviewEmbed = (PostPreviewEmbed) obj;
        return ChannelId.m536equalsimpl0(this.parentChannelId, postPreviewEmbed.parentChannelId) && ChannelId.m536equalsimpl0(this.threadId, postPreviewEmbed.threadId) && MessageId.m562equalsimpl0(this.messageId, postPreviewEmbed.messageId) && GuildId.m549equalsimpl0(this.guildId, postPreviewEmbed.guildId) && q.b(this.title, postPreviewEmbed.title) && q.b(this.ctaText, postPreviewEmbed.ctaText) && q.b(this.footer, postPreviewEmbed.footer) && q.b(this.subtitle, postPreviewEmbed.subtitle) && q.b(this.coverImage, postPreviewEmbed.coverImage) && q.b(this.blurredCoverImage, postPreviewEmbed.blurredCoverImage) && q.b(this.coverImageOverlayText, postPreviewEmbed.coverImageOverlayText);
    }

    public final String getBlurredCoverImage() {
        return this.blurredCoverImage;
    }

    public final String getCoverImage() {
        return this.coverImage;
    }

    public final String getCoverImageOverlayText() {
        return this.coverImageOverlayText;
    }

    public final String getCtaText() {
        return this.ctaText;
    }

    public final StructurableText getFooter() {
        return this.footer;
    }

    /* renamed from: getGuildId-fYKD8eg  reason: not valid java name */
    public final long m112getGuildIdfYKD8eg() {
        return this.guildId;
    }

    /* renamed from: getMessageId-3Eiw7ao  reason: not valid java name */
    public final String m113getMessageId3Eiw7ao() {
        return this.messageId;
    }

    /* renamed from: getParentChannelId-o4g7jtM  reason: not valid java name */
    public final long m114getParentChannelIdo4g7jtM() {
        return this.parentChannelId;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    /* renamed from: getThreadId-o4g7jtM  reason: not valid java name */
    public final long m115getThreadIdo4g7jtM() {
        return this.threadId;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int i10 = ((((((((((((ChannelId.m537hashCodeimpl(this.parentChannelId) * 31) + ChannelId.m537hashCodeimpl(this.threadId)) * 31) + MessageId.m563hashCodeimpl(this.messageId)) * 31) + GuildId.m550hashCodeimpl(this.guildId)) * 31) + this.title.hashCode()) * 31) + this.ctaText.hashCode()) * 31) + this.footer.hashCode()) * 31;
        String str = this.subtitle;
        int i11 = 0;
        int hashCode = (i10 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.coverImage;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.blurredCoverImage;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.coverImageOverlayText;
        if (str4 != null) {
            i11 = str4.hashCode();
        }
        return hashCode3 + i11;
    }

    public String toString() {
        String str = ChannelId.m539toStringimpl(this.parentChannelId);
        String str2 = ChannelId.m539toStringimpl(this.threadId);
        String str3 = MessageId.m564toStringimpl(this.messageId);
        String str4 = GuildId.m552toStringimpl(this.guildId);
        String str5 = this.title;
        String str6 = this.ctaText;
        StructurableText structurableText = this.footer;
        String str7 = this.subtitle;
        String str8 = this.coverImage;
        String str9 = this.blurredCoverImage;
        String str10 = this.coverImageOverlayText;
        return "PostPreviewEmbed(parentChannelId=" + str + ", threadId=" + str2 + ", messageId=" + str3 + ", guildId=" + str4 + ", title=" + str5 + ", ctaText=" + str6 + ", footer=" + structurableText + ", subtitle=" + str7 + ", coverImage=" + str8 + ", blurredCoverImage=" + str9 + ", coverImageOverlayText=" + str10 + ")";
    }

    private PostPreviewEmbed(long j10, long j11, String str, long j12, String str2, String str3, StructurableText structurableText, String str4, String str5, String str6, String str7) {
        this.parentChannelId = j10;
        this.threadId = j11;
        this.messageId = str;
        this.guildId = j12;
        this.title = str2;
        this.ctaText = str3;
        this.footer = structurableText;
        this.subtitle = str4;
        this.coverImage = str5;
        this.blurredCoverImage = str6;
        this.coverImageOverlayText = str7;
    }

    public /* synthetic */ PostPreviewEmbed(long j10, long j11, String str, long j12, String str2, String str3, StructurableText structurableText, String str4, String str5, String str6, String str7, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, j11, str, j12, str2, str3, structurableText, (i10 & 128) != 0 ? null : str4, (i10 & Spliterator.NONNULL) != 0 ? null : str5, (i10 & 512) != 0 ? null : str6, (i10 & Spliterator.IMMUTABLE) != 0 ? null : str7, null);
    }
}
