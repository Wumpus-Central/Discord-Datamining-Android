package com.discord.chat.bridge.postpreviewembed;

import androidx.recyclerview.widget.RecyclerView;
import com.discord.chat.bridge.spoiler.SpoilerableData;
import com.discord.chat.bridge.structurabletext.StructurableText;
import com.discord.primitives.ChannelId;
import com.discord.primitives.GuildId;
import com.discord.primitives.MessageId;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import ui.f;

@f
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b1\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 X2\u00020\u0001:\u0002WXB¸\u0001\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u0017\u001a\u00020\u0018\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bø\u0001\u0000¢\u0006\u0002\u0010\u001cB\u009a\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0018ø\u0001\u0000¢\u0006\u0002\u0010\u001dJ\u0019\u00105\u001a\u00020\u0005HÆ\u0003ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b6\u0010)J\u000b\u00107\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\fHÆ\u0003J\t\u0010<\u001a\u00020\u0018HÆ\u0003J\u0019\u0010=\u001a\u00020\u0005HÆ\u0003ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b>\u0010)J\u0019\u0010?\u001a\u00020\bHÆ\u0003ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b@\u0010\u001fJ\u0019\u0010A\u001a\u00020\nHÆ\u0003ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bB\u0010)J\t\u0010C\u001a\u00020\fHÆ\u0003J\t\u0010D\u001a\u00020\fHÆ\u0003J\t\u0010E\u001a\u00020\u0003HÆ\u0003J\t\u0010F\u001a\u00020\u0010HÆ\u0003J\u000b\u0010G\u001a\u0004\u0018\u00010\fHÆ\u0003J¸\u0001\u0010H\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u0017\u001a\u00020\u0018HÆ\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bI\u0010JJ\u0013\u0010K\u001a\u00020\u00182\b\u0010L\u001a\u0004\u0018\u00010MHÖ\u0003J\t\u0010N\u001a\u00020\u0003HÖ\u0001J\t\u0010O\u001a\u00020\fHÖ\u0001J!\u0010P\u001a\u00020Q2\u0006\u0010R\u001a\u00020\u00002\u0006\u0010S\u001a\u00020T2\u0006\u0010U\u001a\u00020VHÇ\u0001R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010\u0013\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001fR\u0013\u0010\u0012\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001fR\u0013\u0010\u0014\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001fR\u0011\u0010\u000e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0011\u0010\r\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001fR\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u001c\u0010\t\u001a\u00020\nø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010*\u001a\u0004\b(\u0010)R\u001c\u0010\u0007\u001a\u00020\bø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010,\u001a\u0004\b+\u0010\u001fR\u001c\u0010\u0004\u001a\u00020\u0005ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010*\u001a\u0004\b-\u0010)R\u0011\u0010\u0017\u001a\u00020\u0018¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b0\u0010\u001fR\u0016\u0010\u0019\u001a\u0004\u0018\u00010\fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b1\u0010\u001fR\u0013\u0010\u0011\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b2\u0010\u001fR\u001c\u0010\u0006\u001a\u00020\u0005ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010*\u001a\u0004\b3\u0010)R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b4\u0010\u001f\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006Y"}, d2 = {"Lcom/discord/chat/bridge/postpreviewembed/PostPreviewEmbed;", "Lcom/discord/chat/bridge/spoiler/SpoilerableData;", "seen1", "", "parentChannelId", "Lcom/discord/primitives/ChannelId;", "threadId", "messageId", "Lcom/discord/primitives/MessageId;", "guildId", "Lcom/discord/primitives/GuildId;", "title", "", "ctaText", "ctaButtonColor", "footer", "Lcom/discord/chat/bridge/structurabletext/StructurableText;", "subtitle", "coverImage", "blurredCoverImage", "coverImageOverlayText", "backgroundImage", "spoiler", "shouldSpoiler", "", "spoilerOrNull", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/discord/primitives/ChannelId;Lcom/discord/primitives/ChannelId;Ljava/lang/String;Lcom/discord/primitives/GuildId;Ljava/lang/String;Ljava/lang/String;ILcom/discord/chat/bridge/structurabletext/StructurableText;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "(JJLjava/lang/String;JLjava/lang/String;Ljava/lang/String;ILcom/discord/chat/bridge/structurabletext/StructurableText;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getBackgroundImage", "()Ljava/lang/String;", "getBlurredCoverImage", "getCoverImage", "getCoverImageOverlayText", "getCtaButtonColor", "()I", "getCtaText", "getFooter", "()Lcom/discord/chat/bridge/structurabletext/StructurableText;", "getGuildId-fYKD8eg", "()J", "J", "getMessageId-3Eiw7ao", "Ljava/lang/String;", "getParentChannelId-o4g7jtM", "getShouldSpoiler", "()Z", "getSpoiler", "getSpoilerOrNull", "getSubtitle", "getThreadId-o4g7jtM", "getTitle", "component1", "component1-o4g7jtM", "component10", "component11", "component12", "component13", "component14", "component15", "component2", "component2-o4g7jtM", "component3", "component3-3Eiw7ao", "component4", "component4-fYKD8eg", "component5", "component6", "component7", "component8", "component9", "copy", "copy-ghR0CLE", "(JJLjava/lang/String;JLjava/lang/String;Ljava/lang/String;ILcom/discord/chat/bridge/structurabletext/StructurableText;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Lcom/discord/chat/bridge/postpreviewembed/PostPreviewEmbed;", "equals", "other", "", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)

public final class PostPreviewEmbed implements SpoilerableData {
    public static final Companion Companion = new Companion(null);
    private final String backgroundImage;
    private final String blurredCoverImage;
    private final String coverImage;
    private final String coverImageOverlayText;
    private final int ctaButtonColor;
    private final String ctaText;
    private final StructurableText footer;
    private final long guildId;
    private final String messageId;
    private final long parentChannelId;
    private final boolean shouldSpoiler;
    private final String spoiler;
    private final String spoilerOrNull;
    private final String subtitle;
    private final long threadId;
    private final String title;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/discord/chat/bridge/postpreviewembed/PostPreviewEmbed$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/bridge/postpreviewembed/PostPreviewEmbed;", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    
    public static final class Companion {
        private Companion() {
        }

        public  Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<PostPreviewEmbed> serializer() {
            return PostPreviewEmbed$$serializer.INSTANCE;
        }
    }

    
    
    private PostPreviewEmbed(int r7, com.discord.primitives.ChannelId r8, com.discord.primitives.ChannelId r9, java.lang.String r10, com.discord.primitives.GuildId r11, java.lang.String r12, java.lang.String r13, int r14, com.discord.chat.bridge.structurabletext.StructurableText r15, java.lang.String r16, java.lang.String r17, java.lang.String r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, boolean r22, java.lang.String r23, kotlinx.serialization.internal.SerializationConstructorMarker r24) {
        
        throw new UnsupportedOperationException("Method not decompiled: com.discord.chat.bridge.postpreviewembed.PostPreviewEmbed.<init>(int, com.discord.primitives.ChannelId, com.discord.primitives.ChannelId, java.lang.String, com.discord.primitives.GuildId, java.lang.String, java.lang.String, int, com.discord.chat.bridge.structurabletext.StructurableText, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, kotlinx.serialization.internal.SerializationConstructorMarker):void");
    }

    public  PostPreviewEmbed(int i10, ChannelId channelId, ChannelId channelId2, String str, GuildId guildId, String str2, String str3, int i11, StructurableText structurableText, String str4, String str5, String str6, String str7, String str8, String str9, boolean z10, String str10, SerializationConstructorMarker serializationConstructorMarker, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, channelId, channelId2, str, guildId, str2, str3, i11, structurableText, str4, str5, str6, str7, str8, str9, z10, str10, serializationConstructorMarker);
    }

    public  PostPreviewEmbed(long j10, long j11, String str, long j12, String str2, String str3, int i10, StructurableText structurableText, String str4, String str5, String str6, String str7, String str8, String str9, boolean z10, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, j11, str, j12, str2, str3, i10, structurableText, str4, str5, str6, str7, str8, str9, z10);
    }

    
    
    
    public static final void write$Self(com.discord.chat.bridge.postpreviewembed.PostPreviewEmbed r6, kotlinx.serialization.encoding.CompositeEncoder r7, kotlinx.serialization.descriptors.SerialDescriptor r8) {
        
        throw new UnsupportedOperationException("Method not decompiled: com.discord.chat.bridge.postpreviewembed.PostPreviewEmbed.write$Self(com.discord.chat.bridge.postpreviewembed.PostPreviewEmbed, kotlinx.serialization.encoding.CompositeEncoder, kotlinx.serialization.descriptors.SerialDescriptor):void");
    }

    
    public final long m116component1o4g7jtM() {
        return this.parentChannelId;
    }

    public final String component10() {
        return this.coverImage;
    }

    public final String component11() {
        return this.blurredCoverImage;
    }

    public final String component12() {
        return this.coverImageOverlayText;
    }

    public final String component13() {
        return this.backgroundImage;
    }

    public final String component14() {
        return this.spoiler;
    }

    public final boolean component15() {
        return this.shouldSpoiler;
    }

    
    public final long m117component2o4g7jtM() {
        return this.threadId;
    }

    
    public final String m118component33Eiw7ao() {
        return this.messageId;
    }

    
    public final long m119component4fYKD8eg() {
        return this.guildId;
    }

    public final String component5() {
        return this.title;
    }

    public final String component6() {
        return this.ctaText;
    }

    public final int component7() {
        return this.ctaButtonColor;
    }

    public final StructurableText component8() {
        return this.footer;
    }

    public final String component9() {
        return this.subtitle;
    }

    
    public final PostPreviewEmbed m120copyghR0CLE(long j10, long j11, String messageId, long j12, String title, String ctaText, int i10, StructurableText footer, String str, String str2, String str3, String str4, String str5, String str6, boolean z10) {
        q.h(messageId, "messageId");
        q.h(title, "title");
        q.h(ctaText, "ctaText");
        q.h(footer, "footer");
        return new PostPreviewEmbed(j10, j11, messageId, j12, title, ctaText, i10, footer, str, str2, str3, str4, str5, str6, z10, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PostPreviewEmbed)) {
            return false;
        }
        PostPreviewEmbed postPreviewEmbed = (PostPreviewEmbed) obj;
        return ChannelId.m595equalsimpl0(this.parentChannelId, postPreviewEmbed.parentChannelId) && ChannelId.m595equalsimpl0(this.threadId, postPreviewEmbed.threadId) && MessageId.m621equalsimpl0(this.messageId, postPreviewEmbed.messageId) && GuildId.m608equalsimpl0(this.guildId, postPreviewEmbed.guildId) && q.c(this.title, postPreviewEmbed.title) && q.c(this.ctaText, postPreviewEmbed.ctaText) && this.ctaButtonColor == postPreviewEmbed.ctaButtonColor && q.c(this.footer, postPreviewEmbed.footer) && q.c(this.subtitle, postPreviewEmbed.subtitle) && q.c(this.coverImage, postPreviewEmbed.coverImage) && q.c(this.blurredCoverImage, postPreviewEmbed.blurredCoverImage) && q.c(this.coverImageOverlayText, postPreviewEmbed.coverImageOverlayText) && q.c(this.backgroundImage, postPreviewEmbed.backgroundImage) && q.c(this.spoiler, postPreviewEmbed.spoiler) && this.shouldSpoiler == postPreviewEmbed.shouldSpoiler;
    }

    public final String getBackgroundImage() {
        return this.backgroundImage;
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

    public final int getCtaButtonColor() {
        return this.ctaButtonColor;
    }

    public final String getCtaText() {
        return this.ctaText;
    }

    public final StructurableText getFooter() {
        return this.footer;
    }

    
    public final long m121getGuildIdfYKD8eg() {
        return this.guildId;
    }

    
    public final String m122getMessageId3Eiw7ao() {
        return this.messageId;
    }

    
    public final long m123getParentChannelIdo4g7jtM() {
        return this.parentChannelId;
    }

    public final boolean getShouldSpoiler() {
        return this.shouldSpoiler;
    }

    public final String getSpoiler() {
        return this.spoiler;
    }

    @Override 
    public String getSpoilerOrNull() {
        return this.spoilerOrNull;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    
    public final long m124getThreadIdo4g7jtM() {
        return this.threadId;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int i10 = ((((((((((((((ChannelId.m596hashCodeimpl(this.parentChannelId) * 31) + ChannelId.m596hashCodeimpl(this.threadId)) * 31) + MessageId.m622hashCodeimpl(this.messageId)) * 31) + GuildId.m609hashCodeimpl(this.guildId)) * 31) + this.title.hashCode()) * 31) + this.ctaText.hashCode()) * 31) + this.ctaButtonColor) * 31) + this.footer.hashCode()) * 31;
        String str = this.subtitle;
        int i11 = 0;
        int hashCode = (i10 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.coverImage;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.blurredCoverImage;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.coverImageOverlayText;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.backgroundImage;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.spoiler;
        if (str6 != null) {
            i11 = str6.hashCode();
        }
        int i12 = (hashCode5 + i11) * 31;
        boolean z10 = this.shouldSpoiler;
        if (z10) {
            z10 = true;
        }
        int i13 = z10 ? 1 : 0;
        int i14 = z10 ? 1 : 0;
        int i15 = z10 ? 1 : 0;
        return i12 + i13;
    }

    public String toString() {
        String str = ChannelId.m598toStringimpl(this.parentChannelId);
        String str2 = ChannelId.m598toStringimpl(this.threadId);
        String str3 = MessageId.m623toStringimpl(this.messageId);
        String str4 = GuildId.m611toStringimpl(this.guildId);
        String str5 = this.title;
        String str6 = this.ctaText;
        int i10 = this.ctaButtonColor;
        StructurableText structurableText = this.footer;
        String str7 = this.subtitle;
        String str8 = this.coverImage;
        String str9 = this.blurredCoverImage;
        String str10 = this.coverImageOverlayText;
        String str11 = this.backgroundImage;
        String str12 = this.spoiler;
        boolean z10 = this.shouldSpoiler;
        return "PostPreviewEmbed(parentChannelId=" + str + ", threadId=" + str2 + ", messageId=" + str3 + ", guildId=" + str4 + ", title=" + str5 + ", ctaText=" + str6 + ", ctaButtonColor=" + i10 + ", footer=" + structurableText + ", subtitle=" + str7 + ", coverImage=" + str8 + ", blurredCoverImage=" + str9 + ", coverImageOverlayText=" + str10 + ", backgroundImage=" + str11 + ", spoiler=" + str12 + ", shouldSpoiler=" + z10 + ")";
    }

    
    
    private PostPreviewEmbed(long r5, long r7, java.lang.String r9, long r10, java.lang.String r12, java.lang.String r13, int r14, com.discord.chat.bridge.structurabletext.StructurableText r15, java.lang.String r16, java.lang.String r17, java.lang.String r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, boolean r22) {
        
        throw new UnsupportedOperationException("Method not decompiled: com.discord.chat.bridge.postpreviewembed.PostPreviewEmbed.<init>(long, long, java.lang.String, long, java.lang.String, java.lang.String, int, com.discord.chat.bridge.structurabletext.StructurableText, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean):void");
    }

    public  PostPreviewEmbed(long j10, long j11, String str, long j12, String str2, String str3, int i10, StructurableText structurableText, String str4, String str5, String str6, String str7, String str8, String str9, boolean z10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, j11, str, j12, str2, str3, i10, structurableText, (i11 & 256) != 0 ? null : str4, (i11 & 512) != 0 ? null : str5, (i11 & 1024) != 0 ? null : str6, (i11 & RecyclerView.ItemAnimator.FLAG_MOVED) != 0 ? null : str7, (i11 & RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? null : str8, (i11 & 8192) != 0 ? null : str9, (i11 & 16384) != 0 ? false : z10, null);
    }
}
