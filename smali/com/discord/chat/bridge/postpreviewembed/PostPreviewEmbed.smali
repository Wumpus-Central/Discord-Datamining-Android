.class public final Lcom/discord/chat/bridge/postpreviewembed/PostPreviewEmbed;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/discord/chat/bridge/postpreviewembed/PostPreviewEmbed$$serializer;,
        Lcom/discord/chat/bridge/postpreviewembed/PostPreviewEmbed$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008%\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0087\u0008\u0018\u0000 G2\u00020\u0001:\u0002FGB\u008a\u0001\u0008\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0008\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\u000c\u0012\u0008\u0010\r\u001a\u0004\u0018\u00010\u000c\u0012\u0008\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u000c\u0012\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u000c\u0012\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u000c\u0012\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u000c\u0012\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0016Bp\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0008\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\u000c\u0012\u0006\u0010\r\u001a\u00020\u000c\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\n\u0008\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000c\u0012\n\u0008\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000c\u0012\n\u0008\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u000c\u0012\n\u0008\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u000c\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0017J\u0019\u0010(\u001a\u00020\u0005H\u00c6\u0003\u00f8\u0001\u0002\u00f8\u0001\u0001\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008)\u0010 J\u000b\u0010*\u001a\u0004\u0018\u00010\u000cH\u00c6\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u000cH\u00c6\u0003J\u0019\u0010,\u001a\u00020\u0005H\u00c6\u0003\u00f8\u0001\u0002\u00f8\u0001\u0001\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008-\u0010 J\u0019\u0010.\u001a\u00020\u0008H\u00c6\u0003\u00f8\u0001\u0002\u00f8\u0001\u0001\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008/\u0010\u0019J\u0019\u00100\u001a\u00020\nH\u00c6\u0003\u00f8\u0001\u0002\u00f8\u0001\u0001\u00f8\u0001\u0000\u00a2\u0006\u0004\u00081\u0010 J\t\u00102\u001a\u00020\u000cH\u00c6\u0003J\t\u00103\u001a\u00020\u000cH\u00c6\u0003J\t\u00104\u001a\u00020\u000fH\u00c6\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u000cH\u00c6\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u000cH\u00c6\u0003J\u008c\u0001\u00107\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00082\u0008\u0008\u0002\u0010\t\u001a\u00020\n2\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u000c2\u0008\u0008\u0002\u0010\r\u001a\u00020\u000c2\u0008\u0008\u0002\u0010\u000e\u001a\u00020\u000f2\n\u0008\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000c2\n\u0008\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000c2\n\u0008\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u000c2\n\u0008\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u000cH\u00c6\u0001\u00f8\u0001\u0001\u00f8\u0001\u0000\u00a2\u0006\u0004\u00088\u00109J\u0013\u0010:\u001a\u00020;2\u0008\u0010<\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010=\u001a\u00020\u0003H\u00d6\u0001J\t\u0010>\u001a\u00020\u000cH\u00d6\u0001J!\u0010?\u001a\u00020@2\u0006\u0010A\u001a\u00020\u00002\u0006\u0010B\u001a\u00020C2\u0006\u0010D\u001a\u00020EH\u00c7\u0001R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u000c\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0018\u0010\u0019R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u000c\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001a\u0010\u0019R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u000c\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001b\u0010\u0019R\u0011\u0010\r\u001a\u00020\u000c\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001c\u0010\u0019R\u0011\u0010\u000e\u001a\u00020\u000f\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001d\u0010\u001eR\u001c\u0010\t\u001a\u00020\n\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\n\n\u0002\u0010!\u001a\u0004\u0008\u001f\u0010 R\u001c\u0010\u0007\u001a\u00020\u0008\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\n\n\u0002\u0010#\u001a\u0004\u0008\"\u0010\u0019R\u001c\u0010\u0004\u001a\u00020\u0005\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\n\n\u0002\u0010!\u001a\u0004\u0008$\u0010 R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u000c\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008%\u0010\u0019R\u001c\u0010\u0006\u001a\u00020\u0005\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\n\n\u0002\u0010!\u001a\u0004\u0008&\u0010 R\u0011\u0010\u000b\u001a\u00020\u000c\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\'\u0010\u0019\u0082\u0002\u000f\n\u0002\u0008\u0019\n\u0005\u0008\u00a1\u001e0\u0001\n\u0002\u0008!\u00a8\u0006H"
    }
    d2 = {
        "Lcom/discord/chat/bridge/postpreviewembed/PostPreviewEmbed;",
        "",
        "seen1",
        "",
        "parentChannelId",
        "Lcom/discord/primitives/ChannelId;",
        "threadId",
        "messageId",
        "Lcom/discord/primitives/MessageId;",
        "guildId",
        "Lcom/discord/primitives/GuildId;",
        "title",
        "",
        "ctaText",
        "footer",
        "Lcom/discord/chat/bridge/structurabletext/StructurableText;",
        "subtitle",
        "coverImage",
        "blurredCoverImage",
        "coverImageOverlayText",
        "serializationConstructorMarker",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "(ILcom/discord/primitives/ChannelId;Lcom/discord/primitives/ChannelId;Ljava/lang/String;Lcom/discord/primitives/GuildId;Ljava/lang/String;Ljava/lang/String;Lcom/discord/chat/bridge/structurabletext/StructurableText;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;Lkotlin/jvm/internal/DefaultConstructorMarker;)V",
        "(JJLjava/lang/String;JLjava/lang/String;Ljava/lang/String;Lcom/discord/chat/bridge/structurabletext/StructurableText;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V",
        "getBlurredCoverImage",
        "()Ljava/lang/String;",
        "getCoverImage",
        "getCoverImageOverlayText",
        "getCtaText",
        "getFooter",
        "()Lcom/discord/chat/bridge/structurabletext/StructurableText;",
        "getGuildId-fYKD8eg",
        "()J",
        "J",
        "getMessageId-3Eiw7ao",
        "Ljava/lang/String;",
        "getParentChannelId-o4g7jtM",
        "getSubtitle",
        "getThreadId-o4g7jtM",
        "getTitle",
        "component1",
        "component1-o4g7jtM",
        "component10",
        "component11",
        "component2",
        "component2-o4g7jtM",
        "component3",
        "component3-3Eiw7ao",
        "component4",
        "component4-fYKD8eg",
        "component5",
        "component6",
        "component7",
        "component8",
        "component9",
        "copy",
        "copy-2wKWx2Q",
        "(JJLjava/lang/String;JLjava/lang/String;Ljava/lang/String;Lcom/discord/chat/bridge/structurabletext/StructurableText;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/discord/chat/bridge/postpreviewembed/PostPreviewEmbed;",
        "equals",
        "",
        "other",
        "hashCode",
        "toString",
        "write$Self",
        "",
        "self",
        "output",
        "Lkotlinx/serialization/encoding/CompositeEncoder;",
        "serialDesc",
        "Lkotlinx/serialization/descriptors/SerialDescriptor;",
        "$serializer",
        "Companion",
        "chat_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime Lwi/f;
.end annotation


# static fields
.field public static final Companion:Lcom/discord/chat/bridge/postpreviewembed/PostPreviewEmbed$Companion;


# instance fields
.field private final blurredCoverImage:Ljava/lang/String;

.field private final coverImage:Ljava/lang/String;

.field private final coverImageOverlayText:Ljava/lang/String;

.field private final ctaText:Ljava/lang/String;

.field private final footer:Lcom/discord/chat/bridge/structurabletext/StructurableText;

.field private final guildId:J

.field private final messageId:Ljava/lang/String;

.field private final parentChannelId:J

.field private final subtitle:Ljava/lang/String;

.field private final threadId:J

.field private final title:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/discord/chat/bridge/postpreviewembed/PostPreviewEmbed$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/discord/chat/bridge/postpreviewembed/PostPreviewEmbed$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/discord/chat/bridge/postpreviewembed/PostPreviewEmbed;->Companion:Lcom/discord/chat/bridge/postpreviewembed/PostPreviewEmbed$Companion;

    return-void
.end method

.method private constructor <init>(ILcom/discord/primitives/ChannelId;Lcom/discord/primitives/ChannelId;Ljava/lang/String;Lcom/discord/primitives/GuildId;Ljava/lang/String;Ljava/lang/String;Lcom/discord/chat/bridge/structurabletext/StructurableText;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 2

    and-int/lit8 p13, p1, 0x7f

    const/16 v0, 0x7f

    if-eq v0, p13, :cond_0

    .line 1
    sget-object p13, Lcom/discord/chat/bridge/postpreviewembed/PostPreviewEmbed$$serializer;->INSTANCE:Lcom/discord/chat/bridge/postpreviewembed/PostPreviewEmbed$$serializer;

    invoke-virtual {p13}, Lcom/discord/chat/bridge/postpreviewembed/PostPreviewEmbed$$serializer;->getDescriptor()Lkotlinx/serialization/descriptors/SerialDescriptor;

    move-result-object p13

    invoke-static {p1, v0, p13}, Lzi/n1;->b(IILkotlinx/serialization/descriptors/SerialDescriptor;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p2}, Lcom/discord/primitives/ChannelId;->unbox-impl()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/discord/chat/bridge/postpreviewembed/PostPreviewEmbed;->parentChannelId:J

    invoke-virtual {p3}, Lcom/discord/primitives/ChannelId;->unbox-impl()J

    move-result-wide p2

    iput-wide p2, p0, Lcom/discord/chat/bridge/postpreviewembed/PostPreviewEmbed;->threadId:J

    iput-object p4, p0, Lcom/discord/chat/bridge/postpreviewembed/PostPreviewEmbed;->messageId:Ljava/lang/String;

    invoke-virtual {p5}, Lcom/discord/primitives/GuildId;->unbox-impl()J

    move-result-wide p2

    iput-wide p2, p0, Lcom/discord/chat/bridge/postpreviewembed/PostPreviewEmbed;->guildId:J

    iput-object p6, p0, Lcom/discord/chat/bridge/postpreviewembed/PostPreviewEmbed;->title:Ljava/lang/String;

    iput-object p7, p0, Lcom/discord/chat/bridge/postpreviewembed/PostPreviewEmbed;->ctaText:Ljava/lang/String;

    iput-object p8, p0, Lcom/discord/chat/bridge/postpreviewembed/PostPreviewEmbed;->footer:Lcom/discord/chat/bridge/structurabletext/StructurableText;

    and-int/lit16 p2, p1, 0x80

    const/4 p3, 0x0

    if-nez p2, :cond_1

    iput-object p3, p0, Lcom/discord/chat/bridge/postpreviewembed/PostPreviewEmbed;->subtitle:Ljava/lang/String;

    goto :goto_0

    :cond_1
    iput-object p9, p0, Lcom/discord/chat/bridge/postpreviewembed/PostPreviewEmbed;->subtitle:Ljava/lang/String;

    :goto_0
    and-int/lit16 p2, p1, 0x100

    if-nez p2, :cond_2

    iput-object p3, p0, Lcom/discord/chat/bridge/postpreviewembed/PostPreviewEmbed;->coverImage:Ljava/lang/String;

    goto :goto_1

    :cond_2
    iput-object p10, p0, Lcom/discord/chat/bridge/postpreviewembed/PostPreviewEmbed;->coverImage:Ljava/lang/String;

    :goto_1
    and-int/lit16 p2, p1, 0x200

    if-nez p2, :cond_3

    iput-object p3, p0, Lcom/discord/chat/bridge/postpreviewembed/PostPreviewEmbed;->blurredCoverImage:Ljava/lang/String;

    goto :goto_2

    :cond_3
    iput-object p11, p0, Lcom/discord/chat/bridge/postpreviewembed/PostPreviewEmbed;->blurredCoverImage:Ljava/lang/String;

    :goto_2
    and-int/lit16 p1, p1, 0x400

    if-nez p1, :cond_4

    iput-object p3, p0, Lcom/discord/chat/bridge/postpreviewembed/PostPreviewEmbed;->coverImageOverlayText:Ljava/lang/String;

    goto :goto_3

    :cond_4
    iput-object p12, p0, Lcom/discord/chat/bridge/postpreviewembed/PostPreviewEmbed;->coverImageOverlayText:Ljava/lang/String;

    :goto_3
    return-void
.end method

.method public synthetic constructor <init>(ILcom/discord/primitives/ChannelId;Lcom/discord/primitives/ChannelId;Ljava/lang/String;Lcom/discord/primitives/GuildId;Ljava/lang/String;Ljava/lang/String;Lcom/discord/chat/bridge/structurabletext/StructurableText;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct/range {p0 .. p13}, Lcom/discord/chat/bridge/postpreviewembed/PostPreviewEmbed;-><init>(ILcom/discord/primitives/ChannelId;Lcom/discord/primitives/ChannelId;Ljava/lang/String;Lcom/discord/primitives/GuildId;Ljava/lang/String;Ljava/lang/String;Lcom/discord/chat/bridge/structurabletext/StructurableText;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V

    return-void
.end method

.method private constructor <init>(JJLjava/lang/String;JLjava/lang/String;Ljava/lang/String;Lcom/discord/chat/bridge/structurabletext/StructurableText;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-wide p1, p0, Lcom/discord/chat/bridge/postpreviewembed/PostPreviewEmbed;->parentChannelId:J

    .line 4
    iput-wide p3, p0, Lcom/discord/chat/bridge/postpreviewembed/PostPreviewEmbed;->threadId:J

    .line 5
    iput-object p5, p0, Lcom/discord/chat/bridge/postpreviewembed/PostPreviewEmbed;->messageId:Ljava/lang/String;

    .line 6
    iput-wide p6, p0, Lcom/discord/chat/bridge/postpreviewembed/PostPreviewEmbed;->guildId:J

    .line 7
    iput-object p8, p0, Lcom/discord/chat/bridge/postpreviewembed/PostPreviewEmbed;->title:Ljava/lang/String;

    .line 8
    iput-object p9, p0, Lcom/discord/chat/bridge/postpreviewembed/PostPreviewEmbed;->ctaText:Ljava/lang/String;

    .line 9
    iput-object p10, p0, Lcom/discord/chat/bridge/postpreviewembed/PostPreviewEmbed;->footer:Lcom/discord/chat/bridge/structurabletext/StructurableText;

    .line 10
    iput-object p11, p0, Lcom/discord/chat/bridge/postpreviewembed/PostPreviewEmbed;->subtitle:Ljava/lang/String;

    .line 11
    iput-object p12, p0, Lcom/discord/chat/bridge/postpreviewembed/PostPreviewEmbed;->coverImage:Ljava/lang/String;

    .line 12
    iput-object p13, p0, Lcom/discord/chat/bridge/postpreviewembed/PostPreviewEmbed;->blurredCoverImage:Ljava/lang/String;

    .line 13
    iput-object p14, p0, Lcom/discord/chat/bridge/postpreviewembed/PostPreviewEmbed;->coverImageOverlayText:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(JJLjava/lang/String;JLjava/lang/String;Ljava/lang/String;Lcom/discord/chat/bridge/structurabletext/StructurableText;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 19

    move/from16 v0, p15

    and-int/lit16 v1, v0, 0x80

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    move-object v14, v2

    goto :goto_0

    :cond_0
    move-object/from16 v14, p11

    :goto_0
    and-int/lit16 v1, v0, 0x100

    if-eqz v1, :cond_1

    move-object v15, v2

    goto :goto_1

    :cond_1
    move-object/from16 v15, p12

    :goto_1
    and-int/lit16 v1, v0, 0x200

    if-eqz v1, :cond_2

    move-object/from16 v16, v2

    goto :goto_2

    :cond_2
    move-object/from16 v16, p13

    :goto_2
    and-int/lit16 v0, v0, 0x400

    if-eqz v0, :cond_3

    move-object/from16 v17, v2

    goto :goto_3

    :cond_3
    move-object/from16 v17, p14

    :goto_3
    const/16 v18, 0x0

    move-object/from16 v3, p0

    move-wide/from16 v4, p1

    move-wide/from16 v6, p3

    move-object/from16 v8, p5

    move-wide/from16 v9, p6

    move-object/from16 v11, p8

    move-object/from16 v12, p9

    move-object/from16 v13, p10

    .line 14
    invoke-direct/range {v3 .. v18}, Lcom/discord/chat/bridge/postpreviewembed/PostPreviewEmbed;-><init>(JJLjava/lang/String;JLjava/lang/String;Ljava/lang/String;Lcom/discord/chat/bridge/structurabletext/StructurableText;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public synthetic constructor <init>(JJLjava/lang/String;JLjava/lang/String;Ljava/lang/String;Lcom/discord/chat/bridge/structurabletext/StructurableText;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct/range {p0 .. p14}, Lcom/discord/chat/bridge/postpreviewembed/PostPreviewEmbed;-><init>(JJLjava/lang/String;JLjava/lang/String;Ljava/lang/String;Lcom/discord/chat/bridge/structurabletext/StructurableText;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic copy-2wKWx2Q$default(Lcom/discord/chat/bridge/postpreviewembed/PostPreviewEmbed;JJLjava/lang/String;JLjava/lang/String;Ljava/lang/String;Lcom/discord/chat/bridge/structurabletext/StructurableText;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lcom/discord/chat/bridge/postpreviewembed/PostPreviewEmbed;
    .locals 15

    move-object v0, p0

    move/from16 v1, p15

    and-int/lit8 v2, v1, 0x1

    if-eqz v2, :cond_0

    iget-wide v2, v0, Lcom/discord/chat/bridge/postpreviewembed/PostPreviewEmbed;->parentChannelId:J

    goto :goto_0

    :cond_0
    move-wide/from16 v2, p1

    :goto_0
    and-int/lit8 v4, v1, 0x2

    if-eqz v4, :cond_1

    iget-wide v4, v0, Lcom/discord/chat/bridge/postpreviewembed/PostPreviewEmbed;->threadId:J

    goto :goto_1

    :cond_1
    move-wide/from16 v4, p3

    :goto_1
    and-int/lit8 v6, v1, 0x4

    if-eqz v6, :cond_2

    iget-object v6, v0, Lcom/discord/chat/bridge/postpreviewembed/PostPreviewEmbed;->messageId:Ljava/lang/String;

    goto :goto_2

    :cond_2
    move-object/from16 v6, p5

    :goto_2
    and-int/lit8 v7, v1, 0x8

    if-eqz v7, :cond_3

    iget-wide v7, v0, Lcom/discord/chat/bridge/postpreviewembed/PostPreviewEmbed;->guildId:J

    goto :goto_3

    :cond_3
    move-wide/from16 v7, p6

    :goto_3
    and-int/lit8 v9, v1, 0x10

    if-eqz v9, :cond_4

    iget-object v9, v0, Lcom/discord/chat/bridge/postpreviewembed/PostPreviewEmbed;->title:Ljava/lang/String;

    goto :goto_4

    :cond_4
    move-object/from16 v9, p8

    :goto_4
    and-int/lit8 v10, v1, 0x20

    if-eqz v10, :cond_5

    iget-object v10, v0, Lcom/discord/chat/bridge/postpreviewembed/PostPreviewEmbed;->ctaText:Ljava/lang/String;

    goto :goto_5

    :cond_5
    move-object/from16 v10, p9

    :goto_5
    and-int/lit8 v11, v1, 0x40

    if-eqz v11, :cond_6

    iget-object v11, v0, Lcom/discord/chat/bridge/postpreviewembed/PostPreviewEmbed;->footer:Lcom/discord/chat/bridge/structurabletext/StructurableText;

    goto :goto_6

    :cond_6
    move-object/from16 v11, p10

    :goto_6
    and-int/lit16 v12, v1, 0x80

    if-eqz v12, :cond_7

    iget-object v12, v0, Lcom/discord/chat/bridge/postpreviewembed/PostPreviewEmbed;->subtitle:Ljava/lang/String;

    goto :goto_7

    :cond_7
    move-object/from16 v12, p11

    :goto_7
    and-int/lit16 v13, v1, 0x100

    if-eqz v13, :cond_8

    iget-object v13, v0, Lcom/discord/chat/bridge/postpreviewembed/PostPreviewEmbed;->coverImage:Ljava/lang/String;

    goto :goto_8

    :cond_8
    move-object/from16 v13, p12

    :goto_8
    and-int/lit16 v14, v1, 0x200

    if-eqz v14, :cond_9

    iget-object v14, v0, Lcom/discord/chat/bridge/postpreviewembed/PostPreviewEmbed;->blurredCoverImage:Ljava/lang/String;

    goto :goto_9

    :cond_9
    move-object/from16 v14, p13

    :goto_9
    and-int/lit16 v1, v1, 0x400

    if-eqz v1, :cond_a

    iget-object v1, v0, Lcom/discord/chat/bridge/postpreviewembed/PostPreviewEmbed;->coverImageOverlayText:Ljava/lang/String;

    goto :goto_a

    :cond_a
    move-object/from16 v1, p14

    :goto_a
    move-wide/from16 p1, v2

    move-wide/from16 p3, v4

    move-object/from16 p5, v6

    move-wide/from16 p6, v7

    move-object/from16 p8, v9

    move-object/from16 p9, v10

    move-object/from16 p10, v11

    move-object/from16 p11, v12

    move-object/from16 p12, v13

    move-object/from16 p13, v14

    move-object/from16 p14, v1

    invoke-virtual/range {p0 .. p14}, Lcom/discord/chat/bridge/postpreviewembed/PostPreviewEmbed;->copy-2wKWx2Q(JJLjava/lang/String;JLjava/lang/String;Ljava/lang/String;Lcom/discord/chat/bridge/structurabletext/StructurableText;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/discord/chat/bridge/postpreviewembed/PostPreviewEmbed;

    move-result-object v0

    return-object v0
.end method

.method public static final write$Self(Lcom/discord/chat/bridge/postpreviewembed/PostPreviewEmbed;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V
    .locals 6

    .line 1
    const-string v0, "self"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "output"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "serialDesc"

    .line 12
    .line 13
    invoke-static {p2, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    sget-object v0, Lcom/discord/primitives/ChannelId$$serializer;->INSTANCE:Lcom/discord/primitives/ChannelId$$serializer;

    .line 17
    .line 18
    iget-wide v1, p0, Lcom/discord/chat/bridge/postpreviewembed/PostPreviewEmbed;->parentChannelId:J

    .line 19
    .line 20
    invoke-static {v1, v2}, Lcom/discord/primitives/ChannelId;->box-impl(J)Lcom/discord/primitives/ChannelId;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    const/4 v2, 0x0

    .line 25
    invoke-interface {p1, p2, v2, v0, v1}, Lkotlinx/serialization/encoding/CompositeEncoder;->B(Lkotlinx/serialization/descriptors/SerialDescriptor;ILwi/h;Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    iget-wide v3, p0, Lcom/discord/chat/bridge/postpreviewembed/PostPreviewEmbed;->threadId:J

    .line 29
    .line 30
    invoke-static {v3, v4}, Lcom/discord/primitives/ChannelId;->box-impl(J)Lcom/discord/primitives/ChannelId;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    const/4 v3, 0x1

    .line 35
    invoke-interface {p1, p2, v3, v0, v1}, Lkotlinx/serialization/encoding/CompositeEncoder;->B(Lkotlinx/serialization/descriptors/SerialDescriptor;ILwi/h;Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    sget-object v0, Lcom/discord/primitives/MessageId$$serializer;->INSTANCE:Lcom/discord/primitives/MessageId$$serializer;

    .line 39
    .line 40
    iget-object v1, p0, Lcom/discord/chat/bridge/postpreviewembed/PostPreviewEmbed;->messageId:Ljava/lang/String;

    .line 41
    .line 42
    invoke-static {v1}, Lcom/discord/primitives/MessageId;->box-impl(Ljava/lang/String;)Lcom/discord/primitives/MessageId;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    const/4 v4, 0x2

    .line 47
    invoke-interface {p1, p2, v4, v0, v1}, Lkotlinx/serialization/encoding/CompositeEncoder;->B(Lkotlinx/serialization/descriptors/SerialDescriptor;ILwi/h;Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    sget-object v0, Lcom/discord/primitives/GuildId$$serializer;->INSTANCE:Lcom/discord/primitives/GuildId$$serializer;

    .line 51
    .line 52
    iget-wide v4, p0, Lcom/discord/chat/bridge/postpreviewembed/PostPreviewEmbed;->guildId:J

    .line 53
    .line 54
    invoke-static {v4, v5}, Lcom/discord/primitives/GuildId;->box-impl(J)Lcom/discord/primitives/GuildId;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    const/4 v4, 0x3

    .line 59
    invoke-interface {p1, p2, v4, v0, v1}, Lkotlinx/serialization/encoding/CompositeEncoder;->B(Lkotlinx/serialization/descriptors/SerialDescriptor;ILwi/h;Ljava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    const/4 v0, 0x4

    .line 63
    iget-object v1, p0, Lcom/discord/chat/bridge/postpreviewembed/PostPreviewEmbed;->title:Ljava/lang/String;

    .line 64
    .line 65
    invoke-interface {p1, p2, v0, v1}, Lkotlinx/serialization/encoding/CompositeEncoder;->y(Lkotlinx/serialization/descriptors/SerialDescriptor;ILjava/lang/String;)V

    .line 66
    .line 67
    .line 68
    const/4 v0, 0x5

    .line 69
    iget-object v1, p0, Lcom/discord/chat/bridge/postpreviewembed/PostPreviewEmbed;->ctaText:Ljava/lang/String;

    .line 70
    .line 71
    invoke-interface {p1, p2, v0, v1}, Lkotlinx/serialization/encoding/CompositeEncoder;->y(Lkotlinx/serialization/descriptors/SerialDescriptor;ILjava/lang/String;)V

    .line 72
    .line 73
    .line 74
    sget-object v0, Lcom/discord/chat/bridge/structurabletext/StructurableTextSerializer;->INSTANCE:Lcom/discord/chat/bridge/structurabletext/StructurableTextSerializer;

    .line 75
    .line 76
    iget-object v1, p0, Lcom/discord/chat/bridge/postpreviewembed/PostPreviewEmbed;->footer:Lcom/discord/chat/bridge/structurabletext/StructurableText;

    .line 77
    .line 78
    const/4 v4, 0x6

    .line 79
    invoke-interface {p1, p2, v4, v0, v1}, Lkotlinx/serialization/encoding/CompositeEncoder;->B(Lkotlinx/serialization/descriptors/SerialDescriptor;ILwi/h;Ljava/lang/Object;)V

    .line 80
    .line 81
    .line 82
    const/4 v0, 0x7

    .line 83
    invoke-interface {p1, p2, v0}, Lkotlinx/serialization/encoding/CompositeEncoder;->z(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    .line 84
    .line 85
    .line 86
    move-result v1

    .line 87
    if-eqz v1, :cond_0

    .line 88
    .line 89
    :goto_0
    move v1, v3

    .line 90
    goto :goto_1

    .line 91
    :cond_0
    iget-object v1, p0, Lcom/discord/chat/bridge/postpreviewembed/PostPreviewEmbed;->subtitle:Ljava/lang/String;

    .line 92
    .line 93
    if-eqz v1, :cond_1

    .line 94
    .line 95
    goto :goto_0

    .line 96
    :cond_1
    move v1, v2

    .line 97
    :goto_1
    if-eqz v1, :cond_2

    .line 98
    .line 99
    sget-object v1, Lzi/a2;->a:Lzi/a2;

    .line 100
    .line 101
    iget-object v4, p0, Lcom/discord/chat/bridge/postpreviewembed/PostPreviewEmbed;->subtitle:Ljava/lang/String;

    .line 102
    .line 103
    invoke-interface {p1, p2, v0, v1, v4}, Lkotlinx/serialization/encoding/CompositeEncoder;->m(Lkotlinx/serialization/descriptors/SerialDescriptor;ILwi/h;Ljava/lang/Object;)V

    .line 104
    .line 105
    .line 106
    :cond_2
    const/16 v0, 0x8

    .line 107
    .line 108
    invoke-interface {p1, p2, v0}, Lkotlinx/serialization/encoding/CompositeEncoder;->z(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    .line 109
    .line 110
    .line 111
    move-result v1

    .line 112
    if-eqz v1, :cond_3

    .line 113
    .line 114
    :goto_2
    move v1, v3

    .line 115
    goto :goto_3

    .line 116
    :cond_3
    iget-object v1, p0, Lcom/discord/chat/bridge/postpreviewembed/PostPreviewEmbed;->coverImage:Ljava/lang/String;

    .line 117
    .line 118
    if-eqz v1, :cond_4

    .line 119
    .line 120
    goto :goto_2

    .line 121
    :cond_4
    move v1, v2

    .line 122
    :goto_3
    if-eqz v1, :cond_5

    .line 123
    .line 124
    sget-object v1, Lzi/a2;->a:Lzi/a2;

    .line 125
    .line 126
    iget-object v4, p0, Lcom/discord/chat/bridge/postpreviewembed/PostPreviewEmbed;->coverImage:Ljava/lang/String;

    .line 127
    .line 128
    invoke-interface {p1, p2, v0, v1, v4}, Lkotlinx/serialization/encoding/CompositeEncoder;->m(Lkotlinx/serialization/descriptors/SerialDescriptor;ILwi/h;Ljava/lang/Object;)V

    .line 129
    .line 130
    .line 131
    :cond_5
    const/16 v0, 0x9

    .line 132
    .line 133
    invoke-interface {p1, p2, v0}, Lkotlinx/serialization/encoding/CompositeEncoder;->z(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    .line 134
    .line 135
    .line 136
    move-result v1

    .line 137
    if-eqz v1, :cond_6

    .line 138
    .line 139
    :goto_4
    move v1, v3

    .line 140
    goto :goto_5

    .line 141
    :cond_6
    iget-object v1, p0, Lcom/discord/chat/bridge/postpreviewembed/PostPreviewEmbed;->blurredCoverImage:Ljava/lang/String;

    .line 142
    .line 143
    if-eqz v1, :cond_7

    .line 144
    .line 145
    goto :goto_4

    .line 146
    :cond_7
    move v1, v2

    .line 147
    :goto_5
    if-eqz v1, :cond_8

    .line 148
    .line 149
    sget-object v1, Lzi/a2;->a:Lzi/a2;

    .line 150
    .line 151
    iget-object v4, p0, Lcom/discord/chat/bridge/postpreviewembed/PostPreviewEmbed;->blurredCoverImage:Ljava/lang/String;

    .line 152
    .line 153
    invoke-interface {p1, p2, v0, v1, v4}, Lkotlinx/serialization/encoding/CompositeEncoder;->m(Lkotlinx/serialization/descriptors/SerialDescriptor;ILwi/h;Ljava/lang/Object;)V

    .line 154
    .line 155
    .line 156
    :cond_8
    const/16 v0, 0xa

    .line 157
    .line 158
    invoke-interface {p1, p2, v0}, Lkotlinx/serialization/encoding/CompositeEncoder;->z(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    .line 159
    .line 160
    .line 161
    move-result v1

    .line 162
    if-eqz v1, :cond_9

    .line 163
    .line 164
    :goto_6
    move v2, v3

    .line 165
    goto :goto_7

    .line 166
    :cond_9
    iget-object v1, p0, Lcom/discord/chat/bridge/postpreviewembed/PostPreviewEmbed;->coverImageOverlayText:Ljava/lang/String;

    .line 167
    .line 168
    if-eqz v1, :cond_a

    .line 169
    .line 170
    goto :goto_6

    .line 171
    :cond_a
    :goto_7
    if-eqz v2, :cond_b

    .line 172
    .line 173
    sget-object v1, Lzi/a2;->a:Lzi/a2;

    .line 174
    .line 175
    iget-object p0, p0, Lcom/discord/chat/bridge/postpreviewembed/PostPreviewEmbed;->coverImageOverlayText:Ljava/lang/String;

    .line 176
    .line 177
    invoke-interface {p1, p2, v0, v1, p0}, Lkotlinx/serialization/encoding/CompositeEncoder;->m(Lkotlinx/serialization/descriptors/SerialDescriptor;ILwi/h;Ljava/lang/Object;)V

    .line 178
    .line 179
    .line 180
    :cond_b
    return-void
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
.end method


# virtual methods
.method public final component1-o4g7jtM()J
    .locals 2

    iget-wide v0, p0, Lcom/discord/chat/bridge/postpreviewembed/PostPreviewEmbed;->parentChannelId:J

    return-wide v0
.end method

.method public final component10()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/postpreviewembed/PostPreviewEmbed;->blurredCoverImage:Ljava/lang/String;

    return-object v0
.end method

.method public final component11()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/postpreviewembed/PostPreviewEmbed;->coverImageOverlayText:Ljava/lang/String;

    return-object v0
.end method

.method public final component2-o4g7jtM()J
    .locals 2

    iget-wide v0, p0, Lcom/discord/chat/bridge/postpreviewembed/PostPreviewEmbed;->threadId:J

    return-wide v0
.end method

.method public final component3-3Eiw7ao()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/postpreviewembed/PostPreviewEmbed;->messageId:Ljava/lang/String;

    return-object v0
.end method

.method public final component4-fYKD8eg()J
    .locals 2

    iget-wide v0, p0, Lcom/discord/chat/bridge/postpreviewembed/PostPreviewEmbed;->guildId:J

    return-wide v0
.end method

.method public final component5()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/postpreviewembed/PostPreviewEmbed;->title:Ljava/lang/String;

    return-object v0
.end method

.method public final component6()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/postpreviewembed/PostPreviewEmbed;->ctaText:Ljava/lang/String;

    return-object v0
.end method

.method public final component7()Lcom/discord/chat/bridge/structurabletext/StructurableText;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/postpreviewembed/PostPreviewEmbed;->footer:Lcom/discord/chat/bridge/structurabletext/StructurableText;

    return-object v0
.end method

.method public final component8()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/postpreviewembed/PostPreviewEmbed;->subtitle:Ljava/lang/String;

    return-object v0
.end method

.method public final component9()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/postpreviewembed/PostPreviewEmbed;->coverImage:Ljava/lang/String;

    return-object v0
.end method

.method public final copy-2wKWx2Q(JJLjava/lang/String;JLjava/lang/String;Ljava/lang/String;Lcom/discord/chat/bridge/structurabletext/StructurableText;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/discord/chat/bridge/postpreviewembed/PostPreviewEmbed;
    .locals 17

    const-string v0, "messageId"

    move-object/from16 v6, p5

    invoke-static {v6, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "title"

    move-object/from16 v9, p8

    invoke-static {v9, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "ctaText"

    move-object/from16 v10, p9

    invoke-static {v10, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "footer"

    move-object/from16 v11, p10

    invoke-static {v11, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/discord/chat/bridge/postpreviewembed/PostPreviewEmbed;

    const/16 v16, 0x0

    move-object v1, v0

    move-wide/from16 v2, p1

    move-wide/from16 v4, p3

    move-wide/from16 v7, p6

    move-object/from16 v12, p11

    move-object/from16 v13, p12

    move-object/from16 v14, p13

    move-object/from16 v15, p14

    invoke-direct/range {v1 .. v16}, Lcom/discord/chat/bridge/postpreviewembed/PostPreviewEmbed;-><init>(JJLjava/lang/String;JLjava/lang/String;Ljava/lang/String;Lcom/discord/chat/bridge/structurabletext/StructurableText;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/discord/chat/bridge/postpreviewembed/PostPreviewEmbed;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/discord/chat/bridge/postpreviewembed/PostPreviewEmbed;

    iget-wide v3, p0, Lcom/discord/chat/bridge/postpreviewembed/PostPreviewEmbed;->parentChannelId:J

    iget-wide v5, p1, Lcom/discord/chat/bridge/postpreviewembed/PostPreviewEmbed;->parentChannelId:J

    invoke-static {v3, v4, v5, v6}, Lcom/discord/primitives/ChannelId;->equals-impl0(JJ)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-wide v3, p0, Lcom/discord/chat/bridge/postpreviewembed/PostPreviewEmbed;->threadId:J

    iget-wide v5, p1, Lcom/discord/chat/bridge/postpreviewembed/PostPreviewEmbed;->threadId:J

    invoke-static {v3, v4, v5, v6}, Lcom/discord/primitives/ChannelId;->equals-impl0(JJ)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/discord/chat/bridge/postpreviewembed/PostPreviewEmbed;->messageId:Ljava/lang/String;

    iget-object v3, p1, Lcom/discord/chat/bridge/postpreviewembed/PostPreviewEmbed;->messageId:Ljava/lang/String;

    invoke-static {v1, v3}, Lcom/discord/primitives/MessageId;->equals-impl0(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-wide v3, p0, Lcom/discord/chat/bridge/postpreviewembed/PostPreviewEmbed;->guildId:J

    iget-wide v5, p1, Lcom/discord/chat/bridge/postpreviewembed/PostPreviewEmbed;->guildId:J

    invoke-static {v3, v4, v5, v6}, Lcom/discord/primitives/GuildId;->equals-impl0(JJ)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/discord/chat/bridge/postpreviewembed/PostPreviewEmbed;->title:Ljava/lang/String;

    iget-object v3, p1, Lcom/discord/chat/bridge/postpreviewembed/PostPreviewEmbed;->title:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/discord/chat/bridge/postpreviewembed/PostPreviewEmbed;->ctaText:Ljava/lang/String;

    iget-object v3, p1, Lcom/discord/chat/bridge/postpreviewembed/PostPreviewEmbed;->ctaText:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/discord/chat/bridge/postpreviewembed/PostPreviewEmbed;->footer:Lcom/discord/chat/bridge/structurabletext/StructurableText;

    iget-object v3, p1, Lcom/discord/chat/bridge/postpreviewembed/PostPreviewEmbed;->footer:Lcom/discord/chat/bridge/structurabletext/StructurableText;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/discord/chat/bridge/postpreviewembed/PostPreviewEmbed;->subtitle:Ljava/lang/String;

    iget-object v3, p1, Lcom/discord/chat/bridge/postpreviewembed/PostPreviewEmbed;->subtitle:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lcom/discord/chat/bridge/postpreviewembed/PostPreviewEmbed;->coverImage:Ljava/lang/String;

    iget-object v3, p1, Lcom/discord/chat/bridge/postpreviewembed/PostPreviewEmbed;->coverImage:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lcom/discord/chat/bridge/postpreviewembed/PostPreviewEmbed;->blurredCoverImage:Ljava/lang/String;

    iget-object v3, p1, Lcom/discord/chat/bridge/postpreviewembed/PostPreviewEmbed;->blurredCoverImage:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    return v2

    :cond_b
    iget-object v1, p0, Lcom/discord/chat/bridge/postpreviewembed/PostPreviewEmbed;->coverImageOverlayText:Ljava/lang/String;

    iget-object p1, p1, Lcom/discord/chat/bridge/postpreviewembed/PostPreviewEmbed;->coverImageOverlayText:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_c

    return v2

    :cond_c
    return v0
.end method

.method public final getBlurredCoverImage()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/postpreviewembed/PostPreviewEmbed;->blurredCoverImage:Ljava/lang/String;

    return-object v0
.end method

.method public final getCoverImage()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/postpreviewembed/PostPreviewEmbed;->coverImage:Ljava/lang/String;

    return-object v0
.end method

.method public final getCoverImageOverlayText()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/postpreviewembed/PostPreviewEmbed;->coverImageOverlayText:Ljava/lang/String;

    return-object v0
.end method

.method public final getCtaText()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/postpreviewembed/PostPreviewEmbed;->ctaText:Ljava/lang/String;

    return-object v0
.end method

.method public final getFooter()Lcom/discord/chat/bridge/structurabletext/StructurableText;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/postpreviewembed/PostPreviewEmbed;->footer:Lcom/discord/chat/bridge/structurabletext/StructurableText;

    return-object v0
.end method

.method public final getGuildId-fYKD8eg()J
    .locals 2

    iget-wide v0, p0, Lcom/discord/chat/bridge/postpreviewembed/PostPreviewEmbed;->guildId:J

    return-wide v0
.end method

.method public final getMessageId-3Eiw7ao()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/postpreviewembed/PostPreviewEmbed;->messageId:Ljava/lang/String;

    return-object v0
.end method

.method public final getParentChannelId-o4g7jtM()J
    .locals 2

    iget-wide v0, p0, Lcom/discord/chat/bridge/postpreviewembed/PostPreviewEmbed;->parentChannelId:J

    return-wide v0
.end method

.method public final getSubtitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/postpreviewembed/PostPreviewEmbed;->subtitle:Ljava/lang/String;

    return-object v0
.end method

.method public final getThreadId-o4g7jtM()J
    .locals 2

    iget-wide v0, p0, Lcom/discord/chat/bridge/postpreviewembed/PostPreviewEmbed;->threadId:J

    return-wide v0
.end method

.method public final getTitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/postpreviewembed/PostPreviewEmbed;->title:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-wide v0, p0, Lcom/discord/chat/bridge/postpreviewembed/PostPreviewEmbed;->parentChannelId:J

    invoke-static {v0, v1}, Lcom/discord/primitives/ChannelId;->hashCode-impl(J)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lcom/discord/chat/bridge/postpreviewembed/PostPreviewEmbed;->threadId:J

    invoke-static {v1, v2}, Lcom/discord/primitives/ChannelId;->hashCode-impl(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/discord/chat/bridge/postpreviewembed/PostPreviewEmbed;->messageId:Ljava/lang/String;

    invoke-static {v1}, Lcom/discord/primitives/MessageId;->hashCode-impl(Ljava/lang/String;)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lcom/discord/chat/bridge/postpreviewembed/PostPreviewEmbed;->guildId:J

    invoke-static {v1, v2}, Lcom/discord/primitives/GuildId;->hashCode-impl(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/discord/chat/bridge/postpreviewembed/PostPreviewEmbed;->title:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/discord/chat/bridge/postpreviewembed/PostPreviewEmbed;->ctaText:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/discord/chat/bridge/postpreviewembed/PostPreviewEmbed;->footer:Lcom/discord/chat/bridge/structurabletext/StructurableText;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/discord/chat/bridge/postpreviewembed/PostPreviewEmbed;->subtitle:Ljava/lang/String;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/discord/chat/bridge/postpreviewembed/PostPreviewEmbed;->coverImage:Ljava/lang/String;

    if-nez v1, :cond_1

    move v1, v2

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_1
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/discord/chat/bridge/postpreviewembed/PostPreviewEmbed;->blurredCoverImage:Ljava/lang/String;

    if-nez v1, :cond_2

    move v1, v2

    goto :goto_2

    :cond_2
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_2
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/discord/chat/bridge/postpreviewembed/PostPreviewEmbed;->coverImageOverlayText:Ljava/lang/String;

    if-nez v1, :cond_3

    goto :goto_3

    :cond_3
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_3
    add-int/2addr v0, v2

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 13

    iget-wide v0, p0, Lcom/discord/chat/bridge/postpreviewembed/PostPreviewEmbed;->parentChannelId:J

    invoke-static {v0, v1}, Lcom/discord/primitives/ChannelId;->toString-impl(J)Ljava/lang/String;

    move-result-object v0

    iget-wide v1, p0, Lcom/discord/chat/bridge/postpreviewembed/PostPreviewEmbed;->threadId:J

    invoke-static {v1, v2}, Lcom/discord/primitives/ChannelId;->toString-impl(J)Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/discord/chat/bridge/postpreviewembed/PostPreviewEmbed;->messageId:Ljava/lang/String;

    invoke-static {v2}, Lcom/discord/primitives/MessageId;->toString-impl(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    iget-wide v3, p0, Lcom/discord/chat/bridge/postpreviewembed/PostPreviewEmbed;->guildId:J

    invoke-static {v3, v4}, Lcom/discord/primitives/GuildId;->toString-impl(J)Ljava/lang/String;

    move-result-object v3

    iget-object v4, p0, Lcom/discord/chat/bridge/postpreviewembed/PostPreviewEmbed;->title:Ljava/lang/String;

    iget-object v5, p0, Lcom/discord/chat/bridge/postpreviewembed/PostPreviewEmbed;->ctaText:Ljava/lang/String;

    iget-object v6, p0, Lcom/discord/chat/bridge/postpreviewembed/PostPreviewEmbed;->footer:Lcom/discord/chat/bridge/structurabletext/StructurableText;

    iget-object v7, p0, Lcom/discord/chat/bridge/postpreviewembed/PostPreviewEmbed;->subtitle:Ljava/lang/String;

    iget-object v8, p0, Lcom/discord/chat/bridge/postpreviewembed/PostPreviewEmbed;->coverImage:Ljava/lang/String;

    iget-object v9, p0, Lcom/discord/chat/bridge/postpreviewembed/PostPreviewEmbed;->blurredCoverImage:Ljava/lang/String;

    iget-object v10, p0, Lcom/discord/chat/bridge/postpreviewembed/PostPreviewEmbed;->coverImageOverlayText:Ljava/lang/String;

    new-instance v11, Ljava/lang/StringBuilder;

    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    const-string v12, "PostPreviewEmbed(parentChannelId="

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", threadId="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", messageId="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", guildId="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", title="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", ctaText="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", footer="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", subtitle="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", coverImage="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", blurredCoverImage="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", coverImageOverlayText="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
