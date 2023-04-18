.class public final Lcom/discord/chat/bridge/activityinviteembed/ActivityInviteEmbed;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/discord/chat/bridge/activityinviteembed/ActivityInviteEmbed$$serializer;,
        Lcom/discord/chat/bridge/activityinviteembed/ActivityInviteEmbed$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0010 \n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u001f\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0087\u0008\u0018\u0000 92\u00020\u0001:\u000289B\u007f\u0008\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0005\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\u0010\u0010\n\u001a\u000c\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u000b\u0012\u0006\u0010\u000c\u001a\u00020\u0003\u0012\u0008\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\u0008\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u000f\u001a\u00020\u0007\u0012\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u0005\u0012\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u00a2\u0006\u0002\u0010\u0013Bm\u0012\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\u0008\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0012\u0008\u0002\u0010\n\u001a\u000c\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u000b\u0012\u0006\u0010\u000c\u001a\u00020\u0003\u0012\n\u0008\u0002\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\n\u0008\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u000f\u001a\u00020\u0007\u0012\u0006\u0010\u0010\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0014J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\t\u0010#\u001a\u00020\u0005H\u00c6\u0003J\t\u0010$\u001a\u00020\u0007H\u00c6\u0003J\t\u0010%\u001a\u00020\u0005H\u00c6\u0003J\t\u0010&\u001a\u00020\u0005H\u00c6\u0003J\u0013\u0010\'\u001a\u000c\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u000bH\u00c6\u0003J\t\u0010(\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\t\u0010+\u001a\u00020\u0007H\u00c6\u0003J}\u0010,\u001a\u00020\u00002\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00072\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00052\u0008\u0008\u0002\u0010\t\u001a\u00020\u00052\u0012\u0008\u0002\u0010\n\u001a\u000c\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u000b2\u0008\u0008\u0002\u0010\u000c\u001a\u00020\u00032\n\u0008\u0002\u0010\r\u001a\u0004\u0018\u00010\u00052\n\u0008\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00052\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u00072\u0008\u0008\u0002\u0010\u0010\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010-\u001a\u00020\u00072\u0008\u0010.\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010/\u001a\u00020\u0003H\u00d6\u0001J\t\u00100\u001a\u00020\u0005H\u00d6\u0001J!\u00101\u001a\u0002022\u0006\u00103\u001a\u00020\u00002\u0006\u00104\u001a\u0002052\u0006\u00106\u001a\u000207H\u00c7\u0001R\u001b\u0010\n\u001a\u000c\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u000b\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0015\u0010\u0016R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0017\u0010\u0018R\u0011\u0010\u0010\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0019\u0010\u0018R\u0011\u0010\u0008\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001a\u0010\u0018R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0006\u0010\u001bR\u0011\u0010\u000f\u001a\u00020\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001c\u0010\u001bR\u0011\u0010\u000c\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001d\u0010\u001eR\u0013\u0010\r\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001f\u0010\u0018R\u0011\u0010\t\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008 \u0010\u0018R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008!\u0010\u0018\u00a8\u0006:"
    }
    d2 = {
        "Lcom/discord/chat/bridge/activityinviteembed/ActivityInviteEmbed;",
        "",
        "seen1",
        "",
        "coverImage",
        "",
        "isListening",
        "",
        "headerText",
        "partyStatus",
        "avatarsToRender",
        "",
        "maxPartySize",
        "name",
        "subtext",
        "joinable",
        "ctaText",
        "serializationConstructorMarker",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "(ILjava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/util/List;ILjava/lang/String;Ljava/lang/String;ZLjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/util/List;ILjava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V",
        "getAvatarsToRender",
        "()Ljava/util/List;",
        "getCoverImage",
        "()Ljava/lang/String;",
        "getCtaText",
        "getHeaderText",
        "()Z",
        "getJoinable",
        "getMaxPartySize",
        "()I",
        "getName",
        "getPartyStatus",
        "getSubtext",
        "component1",
        "component10",
        "component2",
        "component3",
        "component4",
        "component5",
        "component6",
        "component7",
        "component8",
        "component9",
        "copy",
        "equals",
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
.field public static final Companion:Lcom/discord/chat/bridge/activityinviteembed/ActivityInviteEmbed$Companion;


# instance fields
.field private final avatarsToRender:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final coverImage:Ljava/lang/String;

.field private final ctaText:Ljava/lang/String;

.field private final headerText:Ljava/lang/String;

.field private final isListening:Z

.field private final joinable:Z

.field private final maxPartySize:I

.field private final name:Ljava/lang/String;

.field private final partyStatus:Ljava/lang/String;

.field private final subtext:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/discord/chat/bridge/activityinviteembed/ActivityInviteEmbed$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/discord/chat/bridge/activityinviteembed/ActivityInviteEmbed$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/discord/chat/bridge/activityinviteembed/ActivityInviteEmbed;->Companion:Lcom/discord/chat/bridge/activityinviteembed/ActivityInviteEmbed$Companion;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/util/List;ILjava/lang/String;Ljava/lang/String;ZLjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit16 p12, p1, 0x32e

    const/16 v0, 0x32e

    if-eq v0, p12, :cond_0

    .line 1
    sget-object p12, Lcom/discord/chat/bridge/activityinviteembed/ActivityInviteEmbed$$serializer;->INSTANCE:Lcom/discord/chat/bridge/activityinviteembed/ActivityInviteEmbed$$serializer;

    invoke-virtual {p12}, Lcom/discord/chat/bridge/activityinviteembed/ActivityInviteEmbed$$serializer;->getDescriptor()Lkotlinx/serialization/descriptors/SerialDescriptor;

    move-result-object p12

    invoke-static {p1, v0, p12}, Lzi/n1;->b(IILkotlinx/serialization/descriptors/SerialDescriptor;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    and-int/lit8 p12, p1, 0x1

    const/4 v0, 0x0

    if-nez p12, :cond_1

    iput-object v0, p0, Lcom/discord/chat/bridge/activityinviteembed/ActivityInviteEmbed;->coverImage:Ljava/lang/String;

    goto :goto_0

    :cond_1
    iput-object p2, p0, Lcom/discord/chat/bridge/activityinviteembed/ActivityInviteEmbed;->coverImage:Ljava/lang/String;

    :goto_0
    iput-boolean p3, p0, Lcom/discord/chat/bridge/activityinviteembed/ActivityInviteEmbed;->isListening:Z

    iput-object p4, p0, Lcom/discord/chat/bridge/activityinviteembed/ActivityInviteEmbed;->headerText:Ljava/lang/String;

    iput-object p5, p0, Lcom/discord/chat/bridge/activityinviteembed/ActivityInviteEmbed;->partyStatus:Ljava/lang/String;

    and-int/lit8 p2, p1, 0x10

    if-nez p2, :cond_2

    iput-object v0, p0, Lcom/discord/chat/bridge/activityinviteembed/ActivityInviteEmbed;->avatarsToRender:Ljava/util/List;

    goto :goto_1

    :cond_2
    iput-object p6, p0, Lcom/discord/chat/bridge/activityinviteembed/ActivityInviteEmbed;->avatarsToRender:Ljava/util/List;

    :goto_1
    iput p7, p0, Lcom/discord/chat/bridge/activityinviteembed/ActivityInviteEmbed;->maxPartySize:I

    and-int/lit8 p2, p1, 0x40

    if-nez p2, :cond_3

    iput-object v0, p0, Lcom/discord/chat/bridge/activityinviteembed/ActivityInviteEmbed;->name:Ljava/lang/String;

    goto :goto_2

    :cond_3
    iput-object p8, p0, Lcom/discord/chat/bridge/activityinviteembed/ActivityInviteEmbed;->name:Ljava/lang/String;

    :goto_2
    and-int/lit16 p1, p1, 0x80

    if-nez p1, :cond_4

    iput-object v0, p0, Lcom/discord/chat/bridge/activityinviteembed/ActivityInviteEmbed;->subtext:Ljava/lang/String;

    goto :goto_3

    :cond_4
    iput-object p9, p0, Lcom/discord/chat/bridge/activityinviteembed/ActivityInviteEmbed;->subtext:Ljava/lang/String;

    :goto_3
    iput-boolean p10, p0, Lcom/discord/chat/bridge/activityinviteembed/ActivityInviteEmbed;->joinable:Z

    iput-object p11, p0, Lcom/discord/chat/bridge/activityinviteembed/ActivityInviteEmbed;->ctaText:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/util/List;ILjava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Z",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;I",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Z",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    const-string v0, "headerText"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "partyStatus"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "ctaText"

    invoke-static {p10, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/discord/chat/bridge/activityinviteembed/ActivityInviteEmbed;->coverImage:Ljava/lang/String;

    .line 4
    iput-boolean p2, p0, Lcom/discord/chat/bridge/activityinviteembed/ActivityInviteEmbed;->isListening:Z

    .line 5
    iput-object p3, p0, Lcom/discord/chat/bridge/activityinviteembed/ActivityInviteEmbed;->headerText:Ljava/lang/String;

    .line 6
    iput-object p4, p0, Lcom/discord/chat/bridge/activityinviteembed/ActivityInviteEmbed;->partyStatus:Ljava/lang/String;

    .line 7
    iput-object p5, p0, Lcom/discord/chat/bridge/activityinviteembed/ActivityInviteEmbed;->avatarsToRender:Ljava/util/List;

    .line 8
    iput p6, p0, Lcom/discord/chat/bridge/activityinviteembed/ActivityInviteEmbed;->maxPartySize:I

    .line 9
    iput-object p7, p0, Lcom/discord/chat/bridge/activityinviteembed/ActivityInviteEmbed;->name:Ljava/lang/String;

    .line 10
    iput-object p8, p0, Lcom/discord/chat/bridge/activityinviteembed/ActivityInviteEmbed;->subtext:Ljava/lang/String;

    .line 11
    iput-boolean p9, p0, Lcom/discord/chat/bridge/activityinviteembed/ActivityInviteEmbed;->joinable:Z

    .line 12
    iput-object p10, p0, Lcom/discord/chat/bridge/activityinviteembed/ActivityInviteEmbed;->ctaText:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/util/List;ILjava/lang/String;Ljava/lang/String;ZLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 14

    move/from16 v0, p11

    and-int/lit8 v1, v0, 0x1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    move-object v4, v2

    goto :goto_0

    :cond_0
    move-object v4, p1

    :goto_0
    and-int/lit8 v1, v0, 0x10

    if-eqz v1, :cond_1

    move-object v8, v2

    goto :goto_1

    :cond_1
    move-object/from16 v8, p5

    :goto_1
    and-int/lit8 v1, v0, 0x40

    if-eqz v1, :cond_2

    move-object v10, v2

    goto :goto_2

    :cond_2
    move-object/from16 v10, p7

    :goto_2
    and-int/lit16 v0, v0, 0x80

    if-eqz v0, :cond_3

    move-object v11, v2

    goto :goto_3

    :cond_3
    move-object/from16 v11, p8

    :goto_3
    move-object v3, p0

    move/from16 v5, p2

    move-object/from16 v6, p3

    move-object/from16 v7, p4

    move/from16 v9, p6

    move/from16 v12, p9

    move-object/from16 v13, p10

    .line 13
    invoke-direct/range {v3 .. v13}, Lcom/discord/chat/bridge/activityinviteembed/ActivityInviteEmbed;-><init>(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/util/List;ILjava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/discord/chat/bridge/activityinviteembed/ActivityInviteEmbed;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/util/List;ILjava/lang/String;Ljava/lang/String;ZLjava/lang/String;ILjava/lang/Object;)Lcom/discord/chat/bridge/activityinviteembed/ActivityInviteEmbed;
    .locals 11

    move-object v0, p0

    move/from16 v1, p11

    and-int/lit8 v2, v1, 0x1

    if-eqz v2, :cond_0

    iget-object v2, v0, Lcom/discord/chat/bridge/activityinviteembed/ActivityInviteEmbed;->coverImage:Ljava/lang/String;

    goto :goto_0

    :cond_0
    move-object v2, p1

    :goto_0
    and-int/lit8 v3, v1, 0x2

    if-eqz v3, :cond_1

    iget-boolean v3, v0, Lcom/discord/chat/bridge/activityinviteembed/ActivityInviteEmbed;->isListening:Z

    goto :goto_1

    :cond_1
    move v3, p2

    :goto_1
    and-int/lit8 v4, v1, 0x4

    if-eqz v4, :cond_2

    iget-object v4, v0, Lcom/discord/chat/bridge/activityinviteembed/ActivityInviteEmbed;->headerText:Ljava/lang/String;

    goto :goto_2

    :cond_2
    move-object v4, p3

    :goto_2
    and-int/lit8 v5, v1, 0x8

    if-eqz v5, :cond_3

    iget-object v5, v0, Lcom/discord/chat/bridge/activityinviteembed/ActivityInviteEmbed;->partyStatus:Ljava/lang/String;

    goto :goto_3

    :cond_3
    move-object v5, p4

    :goto_3
    and-int/lit8 v6, v1, 0x10

    if-eqz v6, :cond_4

    iget-object v6, v0, Lcom/discord/chat/bridge/activityinviteembed/ActivityInviteEmbed;->avatarsToRender:Ljava/util/List;

    goto :goto_4

    :cond_4
    move-object/from16 v6, p5

    :goto_4
    and-int/lit8 v7, v1, 0x20

    if-eqz v7, :cond_5

    iget v7, v0, Lcom/discord/chat/bridge/activityinviteembed/ActivityInviteEmbed;->maxPartySize:I

    goto :goto_5

    :cond_5
    move/from16 v7, p6

    :goto_5
    and-int/lit8 v8, v1, 0x40

    if-eqz v8, :cond_6

    iget-object v8, v0, Lcom/discord/chat/bridge/activityinviteembed/ActivityInviteEmbed;->name:Ljava/lang/String;

    goto :goto_6

    :cond_6
    move-object/from16 v8, p7

    :goto_6
    and-int/lit16 v9, v1, 0x80

    if-eqz v9, :cond_7

    iget-object v9, v0, Lcom/discord/chat/bridge/activityinviteembed/ActivityInviteEmbed;->subtext:Ljava/lang/String;

    goto :goto_7

    :cond_7
    move-object/from16 v9, p8

    :goto_7
    and-int/lit16 v10, v1, 0x100

    if-eqz v10, :cond_8

    iget-boolean v10, v0, Lcom/discord/chat/bridge/activityinviteembed/ActivityInviteEmbed;->joinable:Z

    goto :goto_8

    :cond_8
    move/from16 v10, p9

    :goto_8
    and-int/lit16 v1, v1, 0x200

    if-eqz v1, :cond_9

    iget-object v1, v0, Lcom/discord/chat/bridge/activityinviteembed/ActivityInviteEmbed;->ctaText:Ljava/lang/String;

    goto :goto_9

    :cond_9
    move-object/from16 v1, p10

    :goto_9
    move-object p1, v2

    move p2, v3

    move-object p3, v4

    move-object p4, v5

    move-object/from16 p5, v6

    move/from16 p6, v7

    move-object/from16 p7, v8

    move-object/from16 p8, v9

    move/from16 p9, v10

    move-object/from16 p10, v1

    invoke-virtual/range {p0 .. p10}, Lcom/discord/chat/bridge/activityinviteembed/ActivityInviteEmbed;->copy(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/util/List;ILjava/lang/String;Ljava/lang/String;ZLjava/lang/String;)Lcom/discord/chat/bridge/activityinviteembed/ActivityInviteEmbed;

    move-result-object v0

    return-object v0
.end method

.method public static final write$Self(Lcom/discord/chat/bridge/activityinviteembed/ActivityInviteEmbed;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V
    .locals 5

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
    const/4 v0, 0x0

    .line 17
    invoke-interface {p1, p2, v0}, Lkotlinx/serialization/encoding/CompositeEncoder;->v(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    const/4 v2, 0x1

    .line 22
    if-eqz v1, :cond_0

    .line 23
    .line 24
    :goto_0
    move v1, v2

    .line 25
    goto :goto_1

    .line 26
    :cond_0
    iget-object v1, p0, Lcom/discord/chat/bridge/activityinviteembed/ActivityInviteEmbed;->coverImage:Ljava/lang/String;

    .line 27
    .line 28
    if-eqz v1, :cond_1

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_1
    move v1, v0

    .line 32
    :goto_1
    if-eqz v1, :cond_2

    .line 33
    .line 34
    sget-object v1, Lzi/a2;->a:Lzi/a2;

    .line 35
    .line 36
    iget-object v3, p0, Lcom/discord/chat/bridge/activityinviteembed/ActivityInviteEmbed;->coverImage:Ljava/lang/String;

    .line 37
    .line 38
    invoke-interface {p1, p2, v0, v1, v3}, Lkotlinx/serialization/encoding/CompositeEncoder;->C(Lkotlinx/serialization/descriptors/SerialDescriptor;ILwi/h;Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    :cond_2
    iget-boolean v1, p0, Lcom/discord/chat/bridge/activityinviteembed/ActivityInviteEmbed;->isListening:Z

    .line 42
    .line 43
    invoke-interface {p1, p2, v2, v1}, Lkotlinx/serialization/encoding/CompositeEncoder;->r(Lkotlinx/serialization/descriptors/SerialDescriptor;IZ)V

    .line 44
    .line 45
    .line 46
    const/4 v1, 0x2

    .line 47
    iget-object v3, p0, Lcom/discord/chat/bridge/activityinviteembed/ActivityInviteEmbed;->headerText:Ljava/lang/String;

    .line 48
    .line 49
    invoke-interface {p1, p2, v1, v3}, Lkotlinx/serialization/encoding/CompositeEncoder;->s(Lkotlinx/serialization/descriptors/SerialDescriptor;ILjava/lang/String;)V

    .line 50
    .line 51
    .line 52
    const/4 v1, 0x3

    .line 53
    iget-object v3, p0, Lcom/discord/chat/bridge/activityinviteembed/ActivityInviteEmbed;->partyStatus:Ljava/lang/String;

    .line 54
    .line 55
    invoke-interface {p1, p2, v1, v3}, Lkotlinx/serialization/encoding/CompositeEncoder;->s(Lkotlinx/serialization/descriptors/SerialDescriptor;ILjava/lang/String;)V

    .line 56
    .line 57
    .line 58
    const/4 v1, 0x4

    .line 59
    invoke-interface {p1, p2, v1}, Lkotlinx/serialization/encoding/CompositeEncoder;->v(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    .line 60
    .line 61
    .line 62
    move-result v3

    .line 63
    if-eqz v3, :cond_3

    .line 64
    .line 65
    :goto_2
    move v3, v2

    .line 66
    goto :goto_3

    .line 67
    :cond_3
    iget-object v3, p0, Lcom/discord/chat/bridge/activityinviteembed/ActivityInviteEmbed;->avatarsToRender:Ljava/util/List;

    .line 68
    .line 69
    if-eqz v3, :cond_4

    .line 70
    .line 71
    goto :goto_2

    .line 72
    :cond_4
    move v3, v0

    .line 73
    :goto_3
    if-eqz v3, :cond_5

    .line 74
    .line 75
    new-instance v3, Lzi/f;

    .line 76
    .line 77
    sget-object v4, Lzi/a2;->a:Lzi/a2;

    .line 78
    .line 79
    invoke-static {v4}, Lxi/a;->u(Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;

    .line 80
    .line 81
    .line 82
    move-result-object v4

    .line 83
    invoke-direct {v3, v4}, Lzi/f;-><init>(Lkotlinx/serialization/KSerializer;)V

    .line 84
    .line 85
    .line 86
    iget-object v4, p0, Lcom/discord/chat/bridge/activityinviteembed/ActivityInviteEmbed;->avatarsToRender:Ljava/util/List;

    .line 87
    .line 88
    invoke-interface {p1, p2, v1, v3, v4}, Lkotlinx/serialization/encoding/CompositeEncoder;->C(Lkotlinx/serialization/descriptors/SerialDescriptor;ILwi/h;Ljava/lang/Object;)V

    .line 89
    .line 90
    .line 91
    :cond_5
    const/4 v1, 0x5

    .line 92
    iget v3, p0, Lcom/discord/chat/bridge/activityinviteembed/ActivityInviteEmbed;->maxPartySize:I

    .line 93
    .line 94
    invoke-interface {p1, p2, v1, v3}, Lkotlinx/serialization/encoding/CompositeEncoder;->p(Lkotlinx/serialization/descriptors/SerialDescriptor;II)V

    .line 95
    .line 96
    .line 97
    const/4 v1, 0x6

    .line 98
    invoke-interface {p1, p2, v1}, Lkotlinx/serialization/encoding/CompositeEncoder;->v(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    .line 99
    .line 100
    .line 101
    move-result v3

    .line 102
    if-eqz v3, :cond_6

    .line 103
    .line 104
    :goto_4
    move v3, v2

    .line 105
    goto :goto_5

    .line 106
    :cond_6
    iget-object v3, p0, Lcom/discord/chat/bridge/activityinviteembed/ActivityInviteEmbed;->name:Ljava/lang/String;

    .line 107
    .line 108
    if-eqz v3, :cond_7

    .line 109
    .line 110
    goto :goto_4

    .line 111
    :cond_7
    move v3, v0

    .line 112
    :goto_5
    if-eqz v3, :cond_8

    .line 113
    .line 114
    sget-object v3, Lzi/a2;->a:Lzi/a2;

    .line 115
    .line 116
    iget-object v4, p0, Lcom/discord/chat/bridge/activityinviteembed/ActivityInviteEmbed;->name:Ljava/lang/String;

    .line 117
    .line 118
    invoke-interface {p1, p2, v1, v3, v4}, Lkotlinx/serialization/encoding/CompositeEncoder;->C(Lkotlinx/serialization/descriptors/SerialDescriptor;ILwi/h;Ljava/lang/Object;)V

    .line 119
    .line 120
    .line 121
    :cond_8
    const/4 v1, 0x7

    .line 122
    invoke-interface {p1, p2, v1}, Lkotlinx/serialization/encoding/CompositeEncoder;->v(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    .line 123
    .line 124
    .line 125
    move-result v3

    .line 126
    if-eqz v3, :cond_9

    .line 127
    .line 128
    :goto_6
    move v0, v2

    .line 129
    goto :goto_7

    .line 130
    :cond_9
    iget-object v3, p0, Lcom/discord/chat/bridge/activityinviteembed/ActivityInviteEmbed;->subtext:Ljava/lang/String;

    .line 131
    .line 132
    if-eqz v3, :cond_a

    .line 133
    .line 134
    goto :goto_6

    .line 135
    :cond_a
    :goto_7
    if-eqz v0, :cond_b

    .line 136
    .line 137
    sget-object v0, Lzi/a2;->a:Lzi/a2;

    .line 138
    .line 139
    iget-object v2, p0, Lcom/discord/chat/bridge/activityinviteembed/ActivityInviteEmbed;->subtext:Ljava/lang/String;

    .line 140
    .line 141
    invoke-interface {p1, p2, v1, v0, v2}, Lkotlinx/serialization/encoding/CompositeEncoder;->C(Lkotlinx/serialization/descriptors/SerialDescriptor;ILwi/h;Ljava/lang/Object;)V

    .line 142
    .line 143
    .line 144
    :cond_b
    const/16 v0, 0x8

    .line 145
    .line 146
    iget-boolean v1, p0, Lcom/discord/chat/bridge/activityinviteembed/ActivityInviteEmbed;->joinable:Z

    .line 147
    .line 148
    invoke-interface {p1, p2, v0, v1}, Lkotlinx/serialization/encoding/CompositeEncoder;->r(Lkotlinx/serialization/descriptors/SerialDescriptor;IZ)V

    .line 149
    .line 150
    .line 151
    const/16 v0, 0x9

    .line 152
    .line 153
    iget-object p0, p0, Lcom/discord/chat/bridge/activityinviteembed/ActivityInviteEmbed;->ctaText:Ljava/lang/String;

    .line 154
    .line 155
    invoke-interface {p1, p2, v0, p0}, Lkotlinx/serialization/encoding/CompositeEncoder;->s(Lkotlinx/serialization/descriptors/SerialDescriptor;ILjava/lang/String;)V

    .line 156
    .line 157
    .line 158
    return-void
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
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
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/activityinviteembed/ActivityInviteEmbed;->coverImage:Ljava/lang/String;

    return-object v0
.end method

.method public final component10()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/activityinviteembed/ActivityInviteEmbed;->ctaText:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Z
    .locals 1

    iget-boolean v0, p0, Lcom/discord/chat/bridge/activityinviteembed/ActivityInviteEmbed;->isListening:Z

    return v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/activityinviteembed/ActivityInviteEmbed;->headerText:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/activityinviteembed/ActivityInviteEmbed;->partyStatus:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/discord/chat/bridge/activityinviteembed/ActivityInviteEmbed;->avatarsToRender:Ljava/util/List;

    return-object v0
.end method

.method public final component6()I
    .locals 1

    iget v0, p0, Lcom/discord/chat/bridge/activityinviteembed/ActivityInviteEmbed;->maxPartySize:I

    return v0
.end method

.method public final component7()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/activityinviteembed/ActivityInviteEmbed;->name:Ljava/lang/String;

    return-object v0
.end method

.method public final component8()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/activityinviteembed/ActivityInviteEmbed;->subtext:Ljava/lang/String;

    return-object v0
.end method

.method public final component9()Z
    .locals 1

    iget-boolean v0, p0, Lcom/discord/chat/bridge/activityinviteembed/ActivityInviteEmbed;->joinable:Z

    return v0
.end method

.method public final copy(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/util/List;ILjava/lang/String;Ljava/lang/String;ZLjava/lang/String;)Lcom/discord/chat/bridge/activityinviteembed/ActivityInviteEmbed;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Z",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;I",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Z",
            "Ljava/lang/String;",
            ")",
            "Lcom/discord/chat/bridge/activityinviteembed/ActivityInviteEmbed;"
        }
    .end annotation

    const-string v0, "headerText"

    move-object v4, p3

    invoke-static {p3, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "partyStatus"

    move-object/from16 v5, p4

    invoke-static {v5, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "ctaText"

    move-object/from16 v11, p10

    invoke-static {v11, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/discord/chat/bridge/activityinviteembed/ActivityInviteEmbed;

    move-object v1, v0

    move-object v2, p1

    move v3, p2

    move-object/from16 v6, p5

    move/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move/from16 v10, p9

    invoke-direct/range {v1 .. v11}, Lcom/discord/chat/bridge/activityinviteembed/ActivityInviteEmbed;-><init>(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/util/List;ILjava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/discord/chat/bridge/activityinviteembed/ActivityInviteEmbed;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/discord/chat/bridge/activityinviteembed/ActivityInviteEmbed;

    iget-object v1, p0, Lcom/discord/chat/bridge/activityinviteembed/ActivityInviteEmbed;->coverImage:Ljava/lang/String;

    iget-object v3, p1, Lcom/discord/chat/bridge/activityinviteembed/ActivityInviteEmbed;->coverImage:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-boolean v1, p0, Lcom/discord/chat/bridge/activityinviteembed/ActivityInviteEmbed;->isListening:Z

    iget-boolean v3, p1, Lcom/discord/chat/bridge/activityinviteembed/ActivityInviteEmbed;->isListening:Z

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/discord/chat/bridge/activityinviteembed/ActivityInviteEmbed;->headerText:Ljava/lang/String;

    iget-object v3, p1, Lcom/discord/chat/bridge/activityinviteembed/ActivityInviteEmbed;->headerText:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/discord/chat/bridge/activityinviteembed/ActivityInviteEmbed;->partyStatus:Ljava/lang/String;

    iget-object v3, p1, Lcom/discord/chat/bridge/activityinviteembed/ActivityInviteEmbed;->partyStatus:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/discord/chat/bridge/activityinviteembed/ActivityInviteEmbed;->avatarsToRender:Ljava/util/List;

    iget-object v3, p1, Lcom/discord/chat/bridge/activityinviteembed/ActivityInviteEmbed;->avatarsToRender:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget v1, p0, Lcom/discord/chat/bridge/activityinviteembed/ActivityInviteEmbed;->maxPartySize:I

    iget v3, p1, Lcom/discord/chat/bridge/activityinviteembed/ActivityInviteEmbed;->maxPartySize:I

    if-eq v1, v3, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/discord/chat/bridge/activityinviteembed/ActivityInviteEmbed;->name:Ljava/lang/String;

    iget-object v3, p1, Lcom/discord/chat/bridge/activityinviteembed/ActivityInviteEmbed;->name:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/discord/chat/bridge/activityinviteembed/ActivityInviteEmbed;->subtext:Ljava/lang/String;

    iget-object v3, p1, Lcom/discord/chat/bridge/activityinviteembed/ActivityInviteEmbed;->subtext:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-boolean v1, p0, Lcom/discord/chat/bridge/activityinviteembed/ActivityInviteEmbed;->joinable:Z

    iget-boolean v3, p1, Lcom/discord/chat/bridge/activityinviteembed/ActivityInviteEmbed;->joinable:Z

    if-eq v1, v3, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lcom/discord/chat/bridge/activityinviteembed/ActivityInviteEmbed;->ctaText:Ljava/lang/String;

    iget-object p1, p1, Lcom/discord/chat/bridge/activityinviteembed/ActivityInviteEmbed;->ctaText:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_b

    return v2

    :cond_b
    return v0
.end method

.method public final getAvatarsToRender()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/discord/chat/bridge/activityinviteembed/ActivityInviteEmbed;->avatarsToRender:Ljava/util/List;

    return-object v0
.end method

.method public final getCoverImage()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/activityinviteembed/ActivityInviteEmbed;->coverImage:Ljava/lang/String;

    return-object v0
.end method

.method public final getCtaText()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/activityinviteembed/ActivityInviteEmbed;->ctaText:Ljava/lang/String;

    return-object v0
.end method

.method public final getHeaderText()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/activityinviteembed/ActivityInviteEmbed;->headerText:Ljava/lang/String;

    return-object v0
.end method

.method public final getJoinable()Z
    .locals 1

    iget-boolean v0, p0, Lcom/discord/chat/bridge/activityinviteembed/ActivityInviteEmbed;->joinable:Z

    return v0
.end method

.method public final getMaxPartySize()I
    .locals 1

    iget v0, p0, Lcom/discord/chat/bridge/activityinviteembed/ActivityInviteEmbed;->maxPartySize:I

    return v0
.end method

.method public final getName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/activityinviteembed/ActivityInviteEmbed;->name:Ljava/lang/String;

    return-object v0
.end method

.method public final getPartyStatus()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/activityinviteembed/ActivityInviteEmbed;->partyStatus:Ljava/lang/String;

    return-object v0
.end method

.method public final getSubtext()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/activityinviteembed/ActivityInviteEmbed;->subtext:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lcom/discord/chat/bridge/activityinviteembed/ActivityInviteEmbed;->coverImage:Ljava/lang/String;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v2, p0, Lcom/discord/chat/bridge/activityinviteembed/ActivityInviteEmbed;->isListening:Z

    const/4 v3, 0x1

    if-eqz v2, :cond_1

    move v2, v3

    :cond_1
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/discord/chat/bridge/activityinviteembed/ActivityInviteEmbed;->headerText:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/discord/chat/bridge/activityinviteembed/ActivityInviteEmbed;->partyStatus:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/discord/chat/bridge/activityinviteembed/ActivityInviteEmbed;->avatarsToRender:Ljava/util/List;

    if-nez v2, :cond_2

    move v2, v1

    goto :goto_1

    :cond_2
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget v2, p0, Lcom/discord/chat/bridge/activityinviteembed/ActivityInviteEmbed;->maxPartySize:I

    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/discord/chat/bridge/activityinviteembed/ActivityInviteEmbed;->name:Ljava/lang/String;

    if-nez v2, :cond_3

    move v2, v1

    goto :goto_2

    :cond_3
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/discord/chat/bridge/activityinviteembed/ActivityInviteEmbed;->subtext:Ljava/lang/String;

    if-nez v2, :cond_4

    goto :goto_3

    :cond_4
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_3
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/discord/chat/bridge/activityinviteembed/ActivityInviteEmbed;->joinable:Z

    if-eqz v1, :cond_5

    goto :goto_4

    :cond_5
    move v3, v1

    :goto_4
    add-int/2addr v0, v3

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/discord/chat/bridge/activityinviteembed/ActivityInviteEmbed;->ctaText:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public final isListening()Z
    .locals 1

    iget-boolean v0, p0, Lcom/discord/chat/bridge/activityinviteembed/ActivityInviteEmbed;->isListening:Z

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 12

    iget-object v0, p0, Lcom/discord/chat/bridge/activityinviteembed/ActivityInviteEmbed;->coverImage:Ljava/lang/String;

    iget-boolean v1, p0, Lcom/discord/chat/bridge/activityinviteembed/ActivityInviteEmbed;->isListening:Z

    iget-object v2, p0, Lcom/discord/chat/bridge/activityinviteembed/ActivityInviteEmbed;->headerText:Ljava/lang/String;

    iget-object v3, p0, Lcom/discord/chat/bridge/activityinviteembed/ActivityInviteEmbed;->partyStatus:Ljava/lang/String;

    iget-object v4, p0, Lcom/discord/chat/bridge/activityinviteembed/ActivityInviteEmbed;->avatarsToRender:Ljava/util/List;

    iget v5, p0, Lcom/discord/chat/bridge/activityinviteembed/ActivityInviteEmbed;->maxPartySize:I

    iget-object v6, p0, Lcom/discord/chat/bridge/activityinviteembed/ActivityInviteEmbed;->name:Ljava/lang/String;

    iget-object v7, p0, Lcom/discord/chat/bridge/activityinviteembed/ActivityInviteEmbed;->subtext:Ljava/lang/String;

    iget-boolean v8, p0, Lcom/discord/chat/bridge/activityinviteembed/ActivityInviteEmbed;->joinable:Z

    iget-object v9, p0, Lcom/discord/chat/bridge/activityinviteembed/ActivityInviteEmbed;->ctaText:Ljava/lang/String;

    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    const-string v11, "ActivityInviteEmbed(coverImage="

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", isListening="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", headerText="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", partyStatus="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", avatarsToRender="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", maxPartySize="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", name="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", subtext="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", joinable="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v8}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", ctaText="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
