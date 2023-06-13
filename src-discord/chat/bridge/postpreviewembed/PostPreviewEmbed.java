package com.discord.chat.bridge.postpreviewembed;

import androidx.recyclerview.widget.RecyclerView;
import com.discord.chat.bridge.spoiler.SpoilerableData;
import com.discord.chat.bridge.structurabletext.StructurableText;
import com.discord.primitives.ChannelId;
import com.discord.primitives.GuildId;
import com.discord.primitives.MessageId;
import j$.util.Spliterator;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import vj.f;

@f
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b,\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 Q2\u00020\u0001:\u0002PQB¦\u0001\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u0015\u001a\u00020\u0016\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019ø\u0001\u0000¢\u0006\u0002\u0010\u001aB\u0086\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0016ø\u0001\u0000¢\u0006\u0002\u0010\u001bJ\u0019\u00100\u001a\u00020\u0005HÆ\u0003ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b1\u0010$J\u000b\u00102\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\fHÆ\u0003J\t\u00105\u001a\u00020\u0016HÆ\u0003J\u0019\u00106\u001a\u00020\u0005HÆ\u0003ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b7\u0010$J\u0019\u00108\u001a\u00020\bHÆ\u0003ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b9\u0010\u001dJ\u0019\u0010:\u001a\u00020\nHÆ\u0003ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b;\u0010$J\t\u0010<\u001a\u00020\fHÆ\u0003J\t\u0010=\u001a\u00020\fHÆ\u0003J\t\u0010>\u001a\u00020\u000fHÆ\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010@\u001a\u0004\u0018\u00010\fHÆ\u0003J¢\u0001\u0010A\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u0015\u001a\u00020\u0016HÆ\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bB\u0010CJ\u0013\u0010D\u001a\u00020\u00162\b\u0010E\u001a\u0004\u0018\u00010FHÖ\u0003J\t\u0010G\u001a\u00020\u0003HÖ\u0001J\t\u0010H\u001a\u00020\fHÖ\u0001J!\u0010I\u001a\u00020J2\u0006\u0010K\u001a\u00020\u00002\u0006\u0010L\u001a\u00020M2\u0006\u0010N\u001a\u00020OHÇ\u0001R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\u0011\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001dR\u0013\u0010\u0013\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001dR\u0011\u0010\r\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001dR\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u001c\u0010\t\u001a\u00020\nø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010%\u001a\u0004\b#\u0010$R\u001c\u0010\u0007\u001a\u00020\bø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010'\u001a\u0004\b&\u0010\u001dR\u001c\u0010\u0004\u001a\u00020\u0005ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010%\u001a\u0004\b(\u0010$R\u0011\u0010\u0015\u001a\u00020\u0016¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001dR\u0016\u0010\u0017\u001a\u0004\u0018\u00010\fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\u001dR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b-\u0010\u001dR\u001c\u0010\u0006\u001a\u00020\u0005ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010%\u001a\u0004\b.\u0010$R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b/\u0010\u001d\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006R"}, d2 = {"Lcom/discord/chat/bridge/postpreviewembed/PostPreviewEmbed;", "Lcom/discord/chat/bridge/spoiler/SpoilerableData;", "seen1", "", "parentChannelId", "Lcom/discord/primitives/ChannelId;", "threadId", "messageId", "Lcom/discord/primitives/MessageId;", "guildId", "Lcom/discord/primitives/GuildId;", "title", "", "ctaText", "footer", "Lcom/discord/chat/bridge/structurabletext/StructurableText;", "subtitle", "coverImage", "blurredCoverImage", "coverImageOverlayText", "spoiler", "shouldSpoiler", "", "spoilerOrNull", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/discord/primitives/ChannelId;Lcom/discord/primitives/ChannelId;Ljava/lang/String;Lcom/discord/primitives/GuildId;Ljava/lang/String;Ljava/lang/String;Lcom/discord/chat/bridge/structurabletext/StructurableText;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "(JJLjava/lang/String;JLjava/lang/String;Ljava/lang/String;Lcom/discord/chat/bridge/structurabletext/StructurableText;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getBlurredCoverImage", "()Ljava/lang/String;", "getCoverImage", "getCoverImageOverlayText", "getCtaText", "getFooter", "()Lcom/discord/chat/bridge/structurabletext/StructurableText;", "getGuildId-fYKD8eg", "()J", "J", "getMessageId-3Eiw7ao", "Ljava/lang/String;", "getParentChannelId-o4g7jtM", "getShouldSpoiler", "()Z", "getSpoiler", "getSpoilerOrNull", "getSubtitle", "getThreadId-o4g7jtM", "getTitle", "component1", "component1-o4g7jtM", "component10", "component11", "component12", "component13", "component2", "component2-o4g7jtM", "component3", "component3-3Eiw7ao", "component4", "component4-fYKD8eg", "component5", "component6", "component7", "component8", "component9", "copy", "copy-gBJQiEk", "(JJLjava/lang/String;JLjava/lang/String;Ljava/lang/String;Lcom/discord/chat/bridge/structurabletext/StructurableText;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Lcom/discord/chat/bridge/postpreviewembed/PostPreviewEmbed;", "equals", "other", "", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class PostPreviewEmbed implements SpoilerableData {
    public static final Companion Companion = new Companion(null);
    private final String blurredCoverImage;
    private final String coverImage;
    private final String coverImageOverlayText;
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
    /* loaded from: classes8.dex */
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

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0082, code lost:
        if (r5 != false) goto L_0x0084;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private PostPreviewEmbed(int r7, com.discord.primitives.ChannelId r8, com.discord.primitives.ChannelId r9, java.lang.String r10, com.discord.primitives.GuildId r11, java.lang.String r12, java.lang.String r13, com.discord.chat.bridge.structurabletext.StructurableText r14, java.lang.String r15, java.lang.String r16, java.lang.String r17, java.lang.String r18, java.lang.String r19, boolean r20, java.lang.String r21, kotlinx.serialization.internal.SerializationConstructorMarker r22) {
        /*
            r6 = this;
            r0 = r6
            r1 = r7
            r2 = r1 & 127(0x7f, float:1.78E-43)
            r3 = 127(0x7f, float:1.78E-43)
            if (r3 == r2) goto L_0x0011
            com.discord.chat.bridge.postpreviewembed.PostPreviewEmbed$$serializer r2 = com.discord.chat.bridge.postpreviewembed.PostPreviewEmbed$$serializer.INSTANCE
            kotlinx.serialization.descriptors.SerialDescriptor r2 = r2.getDescriptor()
            yj.n1.b(r7, r3, r2)
        L_0x0011:
            r6.<init>()
            long r2 = r8.m555unboximpl()
            r0.parentChannelId = r2
            long r2 = r9.m555unboximpl()
            r0.threadId = r2
            r2 = r10
            r0.messageId = r2
            long r2 = r11.m568unboximpl()
            r0.guildId = r2
            r2 = r12
            r0.title = r2
            r2 = r13
            r0.ctaText = r2
            r2 = r14
            r0.footer = r2
            r2 = r1 & 128(0x80, float:1.794E-43)
            r3 = 0
            if (r2 != 0) goto L_0x003a
            r0.subtitle = r3
            goto L_0x003d
        L_0x003a:
            r2 = r15
            r0.subtitle = r2
        L_0x003d:
            r2 = r1 & 256(0x100, float:3.59E-43)
            if (r2 != 0) goto L_0x0044
            r0.coverImage = r3
            goto L_0x0048
        L_0x0044:
            r2 = r16
            r0.coverImage = r2
        L_0x0048:
            r2 = r1 & 512(0x200, float:7.175E-43)
            if (r2 != 0) goto L_0x004f
            r0.blurredCoverImage = r3
            goto L_0x0053
        L_0x004f:
            r2 = r17
            r0.blurredCoverImage = r2
        L_0x0053:
            r2 = r1 & 1024(0x400, float:1.435E-42)
            if (r2 != 0) goto L_0x005a
            r0.coverImageOverlayText = r3
            goto L_0x005e
        L_0x005a:
            r2 = r18
            r0.coverImageOverlayText = r2
        L_0x005e:
            r2 = r1 & 2048(0x800, float:2.87E-42)
            if (r2 != 0) goto L_0x0065
            r0.spoiler = r3
            goto L_0x0069
        L_0x0065:
            r2 = r19
            r0.spoiler = r2
        L_0x0069:
            r2 = r1 & 4096(0x1000, float:5.74E-42)
            r4 = 0
            if (r2 != 0) goto L_0x0071
            r0.shouldSpoiler = r4
            goto L_0x0075
        L_0x0071:
            r2 = r20
            r0.shouldSpoiler = r2
        L_0x0075:
            r1 = r1 & 8192(0x2000, float:1.14794E-41)
            if (r1 != 0) goto L_0x008c
            java.lang.String r1 = r0.spoiler
            r2 = 1
            if (r1 == 0) goto L_0x0084
            boolean r5 = oj.l.w(r1)
            if (r5 == 0) goto L_0x0085
        L_0x0084:
            r4 = r2
        L_0x0085:
            r2 = r2 ^ r4
            if (r2 == 0) goto L_0x0089
            r3 = r1
        L_0x0089:
            r0.spoilerOrNull = r3
            goto L_0x0090
        L_0x008c:
            r1 = r21
            r0.spoilerOrNull = r1
        L_0x0090:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.discord.chat.bridge.postpreviewembed.PostPreviewEmbed.<init>(int, com.discord.primitives.ChannelId, com.discord.primitives.ChannelId, java.lang.String, com.discord.primitives.GuildId, java.lang.String, java.lang.String, com.discord.chat.bridge.structurabletext.StructurableText, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, kotlinx.serialization.internal.SerializationConstructorMarker):void");
    }

    public /* synthetic */ PostPreviewEmbed(int i10, ChannelId channelId, ChannelId channelId2, String str, GuildId guildId, String str2, String str3, StructurableText structurableText, String str4, String str5, String str6, String str7, String str8, boolean z10, String str9, SerializationConstructorMarker serializationConstructorMarker, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, channelId, channelId2, str, guildId, str2, str3, structurableText, str4, str5, str6, str7, str8, z10, str9, serializationConstructorMarker);
    }

    public /* synthetic */ PostPreviewEmbed(long j10, long j11, String str, long j12, String str2, String str3, StructurableText structurableText, String str4, String str5, String str6, String str7, String str8, boolean z10, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, j11, str, j12, str2, str3, structurableText, str4, str5, str6, str7, str8, z10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x0109, code lost:
        if (kotlin.jvm.internal.q.b(r1, r4) != false) goto L_0x010c;
     */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0104  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void write$Self(com.discord.chat.bridge.postpreviewembed.PostPreviewEmbed r6, kotlinx.serialization.encoding.CompositeEncoder r7, kotlinx.serialization.descriptors.SerialDescriptor r8) {
        /*
            Method dump skipped, instructions count: 280
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.discord.chat.bridge.postpreviewembed.PostPreviewEmbed.write$Self(com.discord.chat.bridge.postpreviewembed.PostPreviewEmbed, kotlinx.serialization.encoding.CompositeEncoder, kotlinx.serialization.descriptors.SerialDescriptor):void");
    }

    /* renamed from: component1-o4g7jtM  reason: not valid java name */
    public final long m108component1o4g7jtM() {
        return this.parentChannelId;
    }

    public final String component10() {
        return this.blurredCoverImage;
    }

    public final String component11() {
        return this.coverImageOverlayText;
    }

    public final String component12() {
        return this.spoiler;
    }

    public final boolean component13() {
        return this.shouldSpoiler;
    }

    /* renamed from: component2-o4g7jtM  reason: not valid java name */
    public final long m109component2o4g7jtM() {
        return this.threadId;
    }

    /* renamed from: component3-3Eiw7ao  reason: not valid java name */
    public final String m110component33Eiw7ao() {
        return this.messageId;
    }

    /* renamed from: component4-fYKD8eg  reason: not valid java name */
    public final long m111component4fYKD8eg() {
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

    /* renamed from: copy-gBJQiEk  reason: not valid java name */
    public final PostPreviewEmbed m112copygBJQiEk(long j10, long j11, String messageId, long j12, String title, String ctaText, StructurableText footer, String str, String str2, String str3, String str4, String str5, boolean z10) {
        q.g(messageId, "messageId");
        q.g(title, "title");
        q.g(ctaText, "ctaText");
        q.g(footer, "footer");
        return new PostPreviewEmbed(j10, j11, messageId, j12, title, ctaText, footer, str, str2, str3, str4, str5, z10, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PostPreviewEmbed)) {
            return false;
        }
        PostPreviewEmbed postPreviewEmbed = (PostPreviewEmbed) obj;
        return ChannelId.m550equalsimpl0(this.parentChannelId, postPreviewEmbed.parentChannelId) && ChannelId.m550equalsimpl0(this.threadId, postPreviewEmbed.threadId) && MessageId.m576equalsimpl0(this.messageId, postPreviewEmbed.messageId) && GuildId.m563equalsimpl0(this.guildId, postPreviewEmbed.guildId) && q.b(this.title, postPreviewEmbed.title) && q.b(this.ctaText, postPreviewEmbed.ctaText) && q.b(this.footer, postPreviewEmbed.footer) && q.b(this.subtitle, postPreviewEmbed.subtitle) && q.b(this.coverImage, postPreviewEmbed.coverImage) && q.b(this.blurredCoverImage, postPreviewEmbed.blurredCoverImage) && q.b(this.coverImageOverlayText, postPreviewEmbed.coverImageOverlayText) && q.b(this.spoiler, postPreviewEmbed.spoiler) && this.shouldSpoiler == postPreviewEmbed.shouldSpoiler;
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
    public final long m113getGuildIdfYKD8eg() {
        return this.guildId;
    }

    /* renamed from: getMessageId-3Eiw7ao  reason: not valid java name */
    public final String m114getMessageId3Eiw7ao() {
        return this.messageId;
    }

    /* renamed from: getParentChannelId-o4g7jtM  reason: not valid java name */
    public final long m115getParentChannelIdo4g7jtM() {
        return this.parentChannelId;
    }

    public final boolean getShouldSpoiler() {
        return this.shouldSpoiler;
    }

    public final String getSpoiler() {
        return this.spoiler;
    }

    @Override // com.discord.chat.bridge.spoiler.SpoilerableData
    public String getSpoilerOrNull() {
        return this.spoilerOrNull;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    /* renamed from: getThreadId-o4g7jtM  reason: not valid java name */
    public final long m116getThreadIdo4g7jtM() {
        return this.threadId;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int i10 = ((((((((((((ChannelId.m551hashCodeimpl(this.parentChannelId) * 31) + ChannelId.m551hashCodeimpl(this.threadId)) * 31) + MessageId.m577hashCodeimpl(this.messageId)) * 31) + GuildId.m564hashCodeimpl(this.guildId)) * 31) + this.title.hashCode()) * 31) + this.ctaText.hashCode()) * 31) + this.footer.hashCode()) * 31;
        String str = this.subtitle;
        int i11 = 0;
        int hashCode = (i10 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.coverImage;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.blurredCoverImage;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.coverImageOverlayText;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.spoiler;
        if (str5 != null) {
            i11 = str5.hashCode();
        }
        int i12 = (hashCode4 + i11) * 31;
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
        String str = ChannelId.m553toStringimpl(this.parentChannelId);
        String str2 = ChannelId.m553toStringimpl(this.threadId);
        String str3 = MessageId.m578toStringimpl(this.messageId);
        String str4 = GuildId.m566toStringimpl(this.guildId);
        String str5 = this.title;
        String str6 = this.ctaText;
        StructurableText structurableText = this.footer;
        String str7 = this.subtitle;
        String str8 = this.coverImage;
        String str9 = this.blurredCoverImage;
        String str10 = this.coverImageOverlayText;
        String str11 = this.spoiler;
        boolean z10 = this.shouldSpoiler;
        return "PostPreviewEmbed(parentChannelId=" + str + ", threadId=" + str2 + ", messageId=" + str3 + ", guildId=" + str4 + ", title=" + str5 + ", ctaText=" + str6 + ", footer=" + structurableText + ", subtitle=" + str7 + ", coverImage=" + str8 + ", blurredCoverImage=" + str9 + ", coverImageOverlayText=" + str10 + ", spoiler=" + str11 + ", shouldSpoiler=" + z10 + ")";
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private PostPreviewEmbed(long r5, long r7, java.lang.String r9, long r10, java.lang.String r12, java.lang.String r13, com.discord.chat.bridge.structurabletext.StructurableText r14, java.lang.String r15, java.lang.String r16, java.lang.String r17, java.lang.String r18, java.lang.String r19, boolean r20) {
        /*
            r4 = this;
            r0 = r4
            r1 = r19
            r4.<init>()
            r2 = r5
            r0.parentChannelId = r2
            r2 = r7
            r0.threadId = r2
            r2 = r9
            r0.messageId = r2
            r2 = r10
            r0.guildId = r2
            r2 = r12
            r0.title = r2
            r2 = r13
            r0.ctaText = r2
            r2 = r14
            r0.footer = r2
            r2 = r15
            r0.subtitle = r2
            r2 = r16
            r0.coverImage = r2
            r2 = r17
            r0.blurredCoverImage = r2
            r2 = r18
            r0.coverImageOverlayText = r2
            r0.spoiler = r1
            r2 = r20
            r0.shouldSpoiler = r2
            r2 = 1
            if (r1 == 0) goto L_0x003c
            boolean r3 = oj.l.w(r19)
            if (r3 == 0) goto L_0x003a
            goto L_0x003c
        L_0x003a:
            r3 = 0
            goto L_0x003d
        L_0x003c:
            r3 = r2
        L_0x003d:
            r2 = r2 ^ r3
            if (r2 == 0) goto L_0x0041
            goto L_0x0042
        L_0x0041:
            r1 = 0
        L_0x0042:
            r0.spoilerOrNull = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.discord.chat.bridge.postpreviewembed.PostPreviewEmbed.<init>(long, long, java.lang.String, long, java.lang.String, java.lang.String, com.discord.chat.bridge.structurabletext.StructurableText, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean):void");
    }

    public /* synthetic */ PostPreviewEmbed(long j10, long j11, String str, long j12, String str2, String str3, StructurableText structurableText, String str4, String str5, String str6, String str7, String str8, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, j11, str, j12, str2, str3, structurableText, (i10 & 128) != 0 ? null : str4, (i10 & Spliterator.NONNULL) != 0 ? null : str5, (i10 & 512) != 0 ? null : str6, (i10 & Spliterator.IMMUTABLE) != 0 ? null : str7, (i10 & RecyclerView.ItemAnimator.FLAG_MOVED) != 0 ? null : str8, (i10 & 4096) != 0 ? false : z10, null);
    }
}
