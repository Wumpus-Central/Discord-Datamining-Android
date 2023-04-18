.class public final Lcom/discord/chat/bridge/embed/EmbedThumbnail;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/discord/chat/bridge/embed/EmbedUrlProvider;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/discord/chat/bridge/embed/EmbedThumbnail$$serializer;,
        Lcom/discord/chat/bridge/embed/EmbedThumbnail$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0019\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0087\u0008\u0018\u0000 42\u00020\u0001:\u000234Be\u0008\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0008\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u000b\u0012\u0008\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\u0008\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u00a2\u0006\u0002\u0010\u0010BM\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0008\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\u0008\u0002\u0010\u000c\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\u0002\u0010\u0011J\t\u0010\u001e\u001a\u00020\u0005H\u00c6\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\t\u0010!\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\"\u001a\u00020\u0003H\u00c6\u0003J\u0010\u0010#\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003\u00a2\u0006\u0002\u0010\u0015J\u0010\u0010$\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003\u00a2\u0006\u0002\u0010\u0015J\\\u0010%\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00052\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00032\u0008\u0008\u0002\u0010\t\u001a\u00020\u00032\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\u0008\u0002\u0010\u000c\u001a\u0004\u0018\u00010\u000bH\u00c6\u0001\u00a2\u0006\u0002\u0010&J\u0013\u0010\'\u001a\u00020\u000b2\u0008\u0010(\u001a\u0004\u0018\u00010)H\u00d6\u0003J\t\u0010*\u001a\u00020\u0003H\u00d6\u0001J\t\u0010+\u001a\u00020\u0005H\u00d6\u0001J!\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020\u00002\u0006\u0010/\u001a\u0002002\u0006\u00101\u001a\u000202H\u00c7\u0001R\u0014\u0010\r\u001a\u00020\u0005X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0012\u0010\u0013R\u0015\u0010\n\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\n\n\u0002\u0010\u0016\u001a\u0004\u0008\u0014\u0010\u0015R\u0011\u0010\u0008\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0017\u0010\u0018R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0019\u0010\u0013R\u0015\u0010\u000c\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\n\n\u0002\u0010\u0016\u001a\u0004\u0008\u001a\u0010\u0015R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001b\u0010\u0013R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001c\u0010\u0013R\u0011\u0010\t\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001d\u0010\u0018\u00a8\u00065"
    }
    d2 = {
        "Lcom/discord/chat/bridge/embed/EmbedThumbnail;",
        "Lcom/discord/chat/bridge/embed/EmbedUrlProvider;",
        "seen1",
        "",
        "url",
        "",
        "proxyURL",
        "videoUrl",
        "height",
        "width",
        "gifv",
        "",
        "showPlayButton",
        "embedUrl",
        "serializationConstructorMarker",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/Boolean;Ljava/lang/Boolean;)V",
        "getEmbedUrl",
        "()Ljava/lang/String;",
        "getGifv",
        "()Ljava/lang/Boolean;",
        "Ljava/lang/Boolean;",
        "getHeight",
        "()I",
        "getProxyURL",
        "getShowPlayButton",
        "getUrl",
        "getVideoUrl",
        "getWidth",
        "component1",
        "component2",
        "component3",
        "component4",
        "component5",
        "component6",
        "component7",
        "copy",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/Boolean;Ljava/lang/Boolean;)Lcom/discord/chat/bridge/embed/EmbedThumbnail;",
        "equals",
        "other",
        "",
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
.field public static final Companion:Lcom/discord/chat/bridge/embed/EmbedThumbnail$Companion;


# instance fields
.field private final embedUrl:Ljava/lang/String;

.field private final gifv:Ljava/lang/Boolean;

.field private final height:I

.field private final proxyURL:Ljava/lang/String;

.field private final showPlayButton:Ljava/lang/Boolean;

.field private final url:Ljava/lang/String;

.field private final videoUrl:Ljava/lang/String;

.field private final width:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/discord/chat/bridge/embed/EmbedThumbnail$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/discord/chat/bridge/embed/EmbedThumbnail$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/discord/chat/bridge/embed/EmbedThumbnail;->Companion:Lcom/discord/chat/bridge/embed/EmbedThumbnail$Companion;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p10, p1, 0x19

    const/16 v0, 0x19

    if-eq v0, p10, :cond_0

    .line 1
    sget-object p10, Lcom/discord/chat/bridge/embed/EmbedThumbnail$$serializer;->INSTANCE:Lcom/discord/chat/bridge/embed/EmbedThumbnail$$serializer;

    invoke-virtual {p10}, Lcom/discord/chat/bridge/embed/EmbedThumbnail$$serializer;->getDescriptor()Lkotlinx/serialization/descriptors/SerialDescriptor;

    move-result-object p10

    invoke-static {p1, v0, p10}, Lzi/n1;->b(IILkotlinx/serialization/descriptors/SerialDescriptor;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/discord/chat/bridge/embed/EmbedThumbnail;->url:Ljava/lang/String;

    and-int/lit8 p10, p1, 0x2

    const/4 v0, 0x0

    if-nez p10, :cond_1

    iput-object v0, p0, Lcom/discord/chat/bridge/embed/EmbedThumbnail;->proxyURL:Ljava/lang/String;

    goto :goto_0

    :cond_1
    iput-object p3, p0, Lcom/discord/chat/bridge/embed/EmbedThumbnail;->proxyURL:Ljava/lang/String;

    :goto_0
    and-int/lit8 p3, p1, 0x4

    if-nez p3, :cond_2

    iput-object v0, p0, Lcom/discord/chat/bridge/embed/EmbedThumbnail;->videoUrl:Ljava/lang/String;

    goto :goto_1

    :cond_2
    iput-object p4, p0, Lcom/discord/chat/bridge/embed/EmbedThumbnail;->videoUrl:Ljava/lang/String;

    :goto_1
    iput p5, p0, Lcom/discord/chat/bridge/embed/EmbedThumbnail;->height:I

    iput p6, p0, Lcom/discord/chat/bridge/embed/EmbedThumbnail;->width:I

    and-int/lit8 p3, p1, 0x20

    if-nez p3, :cond_3

    iput-object v0, p0, Lcom/discord/chat/bridge/embed/EmbedThumbnail;->gifv:Ljava/lang/Boolean;

    goto :goto_2

    :cond_3
    iput-object p7, p0, Lcom/discord/chat/bridge/embed/EmbedThumbnail;->gifv:Ljava/lang/Boolean;

    :goto_2
    and-int/lit8 p3, p1, 0x40

    if-nez p3, :cond_4

    iput-object v0, p0, Lcom/discord/chat/bridge/embed/EmbedThumbnail;->showPlayButton:Ljava/lang/Boolean;

    goto :goto_3

    :cond_4
    iput-object p8, p0, Lcom/discord/chat/bridge/embed/EmbedThumbnail;->showPlayButton:Ljava/lang/Boolean;

    :goto_3
    and-int/lit16 p1, p1, 0x80

    if-nez p1, :cond_6

    .line 2
    iget-object p1, p0, Lcom/discord/chat/bridge/embed/EmbedThumbnail;->proxyURL:Ljava/lang/String;

    if-nez p1, :cond_5

    goto :goto_4

    :cond_5
    move-object p2, p1

    .line 3
    :goto_4
    iput-object p2, p0, Lcom/discord/chat/bridge/embed/EmbedThumbnail;->embedUrl:Ljava/lang/String;

    goto :goto_5

    :cond_6
    iput-object p9, p0, Lcom/discord/chat/bridge/embed/EmbedThumbnail;->embedUrl:Ljava/lang/String;

    :goto_5
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/Boolean;Ljava/lang/Boolean;)V
    .locals 1

    const-string v0, "url"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    iput-object p1, p0, Lcom/discord/chat/bridge/embed/EmbedThumbnail;->url:Ljava/lang/String;

    .line 6
    iput-object p2, p0, Lcom/discord/chat/bridge/embed/EmbedThumbnail;->proxyURL:Ljava/lang/String;

    .line 7
    iput-object p3, p0, Lcom/discord/chat/bridge/embed/EmbedThumbnail;->videoUrl:Ljava/lang/String;

    .line 8
    iput p4, p0, Lcom/discord/chat/bridge/embed/EmbedThumbnail;->height:I

    .line 9
    iput p5, p0, Lcom/discord/chat/bridge/embed/EmbedThumbnail;->width:I

    .line 10
    iput-object p6, p0, Lcom/discord/chat/bridge/embed/EmbedThumbnail;->gifv:Ljava/lang/Boolean;

    .line 11
    iput-object p7, p0, Lcom/discord/chat/bridge/embed/EmbedThumbnail;->showPlayButton:Ljava/lang/Boolean;

    if-nez p2, :cond_0

    goto :goto_0

    :cond_0
    move-object p1, p2

    .line 12
    :goto_0
    iput-object p1, p0, Lcom/discord/chat/bridge/embed/EmbedThumbnail;->embedUrl:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/Boolean;Ljava/lang/Boolean;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 10

    and-int/lit8 v0, p8, 0x2

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    move-object v4, v1

    goto :goto_0

    :cond_0
    move-object v4, p2

    :goto_0
    and-int/lit8 v0, p8, 0x4

    if-eqz v0, :cond_1

    move-object v5, v1

    goto :goto_1

    :cond_1
    move-object v5, p3

    :goto_1
    and-int/lit8 v0, p8, 0x20

    if-eqz v0, :cond_2

    move-object v8, v1

    goto :goto_2

    :cond_2
    move-object/from16 v8, p6

    :goto_2
    and-int/lit8 v0, p8, 0x40

    if-eqz v0, :cond_3

    move-object v9, v1

    goto :goto_3

    :cond_3
    move-object/from16 v9, p7

    :goto_3
    move-object v2, p0

    move-object v3, p1

    move v6, p4

    move v7, p5

    .line 13
    invoke-direct/range {v2 .. v9}, Lcom/discord/chat/bridge/embed/EmbedThumbnail;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/Boolean;Ljava/lang/Boolean;)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/discord/chat/bridge/embed/EmbedThumbnail;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/Boolean;Ljava/lang/Boolean;ILjava/lang/Object;)Lcom/discord/chat/bridge/embed/EmbedThumbnail;
    .locals 5

    and-int/lit8 p9, p8, 0x1

    if-eqz p9, :cond_0

    iget-object p1, p0, Lcom/discord/chat/bridge/embed/EmbedThumbnail;->url:Ljava/lang/String;

    :cond_0
    and-int/lit8 p9, p8, 0x2

    if-eqz p9, :cond_1

    iget-object p2, p0, Lcom/discord/chat/bridge/embed/EmbedThumbnail;->proxyURL:Ljava/lang/String;

    :cond_1
    move-object p9, p2

    and-int/lit8 p2, p8, 0x4

    if-eqz p2, :cond_2

    iget-object p3, p0, Lcom/discord/chat/bridge/embed/EmbedThumbnail;->videoUrl:Ljava/lang/String;

    :cond_2
    move-object v0, p3

    and-int/lit8 p2, p8, 0x8

    if-eqz p2, :cond_3

    iget p4, p0, Lcom/discord/chat/bridge/embed/EmbedThumbnail;->height:I

    :cond_3
    move v1, p4

    and-int/lit8 p2, p8, 0x10

    if-eqz p2, :cond_4

    iget p5, p0, Lcom/discord/chat/bridge/embed/EmbedThumbnail;->width:I

    :cond_4
    move v2, p5

    and-int/lit8 p2, p8, 0x20

    if-eqz p2, :cond_5

    iget-object p6, p0, Lcom/discord/chat/bridge/embed/EmbedThumbnail;->gifv:Ljava/lang/Boolean;

    :cond_5
    move-object v3, p6

    and-int/lit8 p2, p8, 0x40

    if-eqz p2, :cond_6

    iget-object p7, p0, Lcom/discord/chat/bridge/embed/EmbedThumbnail;->showPlayButton:Ljava/lang/Boolean;

    :cond_6
    move-object v4, p7

    move-object p2, p0

    move-object p3, p1

    move-object p4, p9

    move-object p5, v0

    move p6, v1

    move p7, v2

    move-object p8, v3

    move-object p9, v4

    invoke-virtual/range {p2 .. p9}, Lcom/discord/chat/bridge/embed/EmbedThumbnail;->copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/Boolean;Ljava/lang/Boolean;)Lcom/discord/chat/bridge/embed/EmbedThumbnail;

    move-result-object p0

    return-object p0
.end method

.method public static final write$Self(Lcom/discord/chat/bridge/embed/EmbedThumbnail;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V
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
    iget-object v0, p0, Lcom/discord/chat/bridge/embed/EmbedThumbnail;->url:Ljava/lang/String;

    .line 17
    .line 18
    const/4 v1, 0x0

    .line 19
    invoke-interface {p1, p2, v1, v0}, Lkotlinx/serialization/encoding/CompositeEncoder;->s(Lkotlinx/serialization/descriptors/SerialDescriptor;ILjava/lang/String;)V

    .line 20
    .line 21
    .line 22
    const/4 v0, 0x1

    .line 23
    invoke-interface {p1, p2, v0}, Lkotlinx/serialization/encoding/CompositeEncoder;->v(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    if-eqz v2, :cond_0

    .line 28
    .line 29
    :goto_0
    move v2, v0

    .line 30
    goto :goto_1

    .line 31
    :cond_0
    iget-object v2, p0, Lcom/discord/chat/bridge/embed/EmbedThumbnail;->proxyURL:Ljava/lang/String;

    .line 32
    .line 33
    if-eqz v2, :cond_1

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_1
    move v2, v1

    .line 37
    :goto_1
    if-eqz v2, :cond_2

    .line 38
    .line 39
    sget-object v2, Lzi/a2;->a:Lzi/a2;

    .line 40
    .line 41
    iget-object v3, p0, Lcom/discord/chat/bridge/embed/EmbedThumbnail;->proxyURL:Ljava/lang/String;

    .line 42
    .line 43
    invoke-interface {p1, p2, v0, v2, v3}, Lkotlinx/serialization/encoding/CompositeEncoder;->C(Lkotlinx/serialization/descriptors/SerialDescriptor;ILwi/h;Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    :cond_2
    const/4 v2, 0x2

    .line 47
    invoke-interface {p1, p2, v2}, Lkotlinx/serialization/encoding/CompositeEncoder;->v(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    .line 48
    .line 49
    .line 50
    move-result v3

    .line 51
    if-eqz v3, :cond_3

    .line 52
    .line 53
    :goto_2
    move v3, v0

    .line 54
    goto :goto_3

    .line 55
    :cond_3
    iget-object v3, p0, Lcom/discord/chat/bridge/embed/EmbedThumbnail;->videoUrl:Ljava/lang/String;

    .line 56
    .line 57
    if-eqz v3, :cond_4

    .line 58
    .line 59
    goto :goto_2

    .line 60
    :cond_4
    move v3, v1

    .line 61
    :goto_3
    if-eqz v3, :cond_5

    .line 62
    .line 63
    sget-object v3, Lzi/a2;->a:Lzi/a2;

    .line 64
    .line 65
    iget-object v4, p0, Lcom/discord/chat/bridge/embed/EmbedThumbnail;->videoUrl:Ljava/lang/String;

    .line 66
    .line 67
    invoke-interface {p1, p2, v2, v3, v4}, Lkotlinx/serialization/encoding/CompositeEncoder;->C(Lkotlinx/serialization/descriptors/SerialDescriptor;ILwi/h;Ljava/lang/Object;)V

    .line 68
    .line 69
    .line 70
    :cond_5
    const/4 v2, 0x3

    .line 71
    iget v3, p0, Lcom/discord/chat/bridge/embed/EmbedThumbnail;->height:I

    .line 72
    .line 73
    invoke-interface {p1, p2, v2, v3}, Lkotlinx/serialization/encoding/CompositeEncoder;->p(Lkotlinx/serialization/descriptors/SerialDescriptor;II)V

    .line 74
    .line 75
    .line 76
    const/4 v2, 0x4

    .line 77
    iget v3, p0, Lcom/discord/chat/bridge/embed/EmbedThumbnail;->width:I

    .line 78
    .line 79
    invoke-interface {p1, p2, v2, v3}, Lkotlinx/serialization/encoding/CompositeEncoder;->p(Lkotlinx/serialization/descriptors/SerialDescriptor;II)V

    .line 80
    .line 81
    .line 82
    const/4 v2, 0x5

    .line 83
    invoke-interface {p1, p2, v2}, Lkotlinx/serialization/encoding/CompositeEncoder;->v(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    .line 84
    .line 85
    .line 86
    move-result v3

    .line 87
    if-eqz v3, :cond_6

    .line 88
    .line 89
    :goto_4
    move v3, v0

    .line 90
    goto :goto_5

    .line 91
    :cond_6
    iget-object v3, p0, Lcom/discord/chat/bridge/embed/EmbedThumbnail;->gifv:Ljava/lang/Boolean;

    .line 92
    .line 93
    if-eqz v3, :cond_7

    .line 94
    .line 95
    goto :goto_4

    .line 96
    :cond_7
    move v3, v1

    .line 97
    :goto_5
    if-eqz v3, :cond_8

    .line 98
    .line 99
    sget-object v3, Lzi/h;->a:Lzi/h;

    .line 100
    .line 101
    iget-object v4, p0, Lcom/discord/chat/bridge/embed/EmbedThumbnail;->gifv:Ljava/lang/Boolean;

    .line 102
    .line 103
    invoke-interface {p1, p2, v2, v3, v4}, Lkotlinx/serialization/encoding/CompositeEncoder;->C(Lkotlinx/serialization/descriptors/SerialDescriptor;ILwi/h;Ljava/lang/Object;)V

    .line 104
    .line 105
    .line 106
    :cond_8
    const/4 v2, 0x6

    .line 107
    invoke-interface {p1, p2, v2}, Lkotlinx/serialization/encoding/CompositeEncoder;->v(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    .line 108
    .line 109
    .line 110
    move-result v3

    .line 111
    if-eqz v3, :cond_9

    .line 112
    .line 113
    :goto_6
    move v3, v0

    .line 114
    goto :goto_7

    .line 115
    :cond_9
    iget-object v3, p0, Lcom/discord/chat/bridge/embed/EmbedThumbnail;->showPlayButton:Ljava/lang/Boolean;

    .line 116
    .line 117
    if-eqz v3, :cond_a

    .line 118
    .line 119
    goto :goto_6

    .line 120
    :cond_a
    move v3, v1

    .line 121
    :goto_7
    if-eqz v3, :cond_b

    .line 122
    .line 123
    sget-object v3, Lzi/h;->a:Lzi/h;

    .line 124
    .line 125
    iget-object v4, p0, Lcom/discord/chat/bridge/embed/EmbedThumbnail;->showPlayButton:Ljava/lang/Boolean;

    .line 126
    .line 127
    invoke-interface {p1, p2, v2, v3, v4}, Lkotlinx/serialization/encoding/CompositeEncoder;->C(Lkotlinx/serialization/descriptors/SerialDescriptor;ILwi/h;Ljava/lang/Object;)V

    .line 128
    .line 129
    .line 130
    :cond_b
    const/4 v2, 0x7

    .line 131
    invoke-interface {p1, p2, v2}, Lkotlinx/serialization/encoding/CompositeEncoder;->v(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    .line 132
    .line 133
    .line 134
    move-result v3

    .line 135
    if-eqz v3, :cond_c

    .line 136
    .line 137
    :goto_8
    move v1, v0

    .line 138
    goto :goto_9

    .line 139
    :cond_c
    invoke-virtual {p0}, Lcom/discord/chat/bridge/embed/EmbedThumbnail;->getEmbedUrl()Ljava/lang/String;

    .line 140
    .line 141
    .line 142
    move-result-object v3

    .line 143
    iget-object v4, p0, Lcom/discord/chat/bridge/embed/EmbedThumbnail;->proxyURL:Ljava/lang/String;

    .line 144
    .line 145
    if-nez v4, :cond_d

    .line 146
    .line 147
    iget-object v4, p0, Lcom/discord/chat/bridge/embed/EmbedThumbnail;->url:Ljava/lang/String;

    .line 148
    .line 149
    :cond_d
    invoke-static {v3, v4}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 150
    .line 151
    .line 152
    move-result v3

    .line 153
    if-nez v3, :cond_e

    .line 154
    .line 155
    goto :goto_8

    .line 156
    :cond_e
    :goto_9
    if-eqz v1, :cond_f

    .line 157
    .line 158
    invoke-virtual {p0}, Lcom/discord/chat/bridge/embed/EmbedThumbnail;->getEmbedUrl()Ljava/lang/String;

    .line 159
    .line 160
    .line 161
    move-result-object p0

    .line 162
    invoke-interface {p1, p2, v2, p0}, Lkotlinx/serialization/encoding/CompositeEncoder;->s(Lkotlinx/serialization/descriptors/SerialDescriptor;ILjava/lang/String;)V

    .line 163
    .line 164
    .line 165
    :cond_f
    return-void
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

    iget-object v0, p0, Lcom/discord/chat/bridge/embed/EmbedThumbnail;->url:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/embed/EmbedThumbnail;->proxyURL:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/embed/EmbedThumbnail;->videoUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()I
    .locals 1

    iget v0, p0, Lcom/discord/chat/bridge/embed/EmbedThumbnail;->height:I

    return v0
.end method

.method public final component5()I
    .locals 1

    iget v0, p0, Lcom/discord/chat/bridge/embed/EmbedThumbnail;->width:I

    return v0
.end method

.method public final component6()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/embed/EmbedThumbnail;->gifv:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final component7()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/embed/EmbedThumbnail;->showPlayButton:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/Boolean;Ljava/lang/Boolean;)Lcom/discord/chat/bridge/embed/EmbedThumbnail;
    .locals 9

    const-string v0, "url"

    move-object v2, p1

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/discord/chat/bridge/embed/EmbedThumbnail;

    move-object v1, v0

    move-object v3, p2

    move-object v4, p3

    move v5, p4

    move v6, p5

    move-object v7, p6

    move-object/from16 v8, p7

    invoke-direct/range {v1 .. v8}, Lcom/discord/chat/bridge/embed/EmbedThumbnail;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/Boolean;Ljava/lang/Boolean;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/discord/chat/bridge/embed/EmbedThumbnail;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/discord/chat/bridge/embed/EmbedThumbnail;

    iget-object v1, p0, Lcom/discord/chat/bridge/embed/EmbedThumbnail;->url:Ljava/lang/String;

    iget-object v3, p1, Lcom/discord/chat/bridge/embed/EmbedThumbnail;->url:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/discord/chat/bridge/embed/EmbedThumbnail;->proxyURL:Ljava/lang/String;

    iget-object v3, p1, Lcom/discord/chat/bridge/embed/EmbedThumbnail;->proxyURL:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/discord/chat/bridge/embed/EmbedThumbnail;->videoUrl:Ljava/lang/String;

    iget-object v3, p1, Lcom/discord/chat/bridge/embed/EmbedThumbnail;->videoUrl:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget v1, p0, Lcom/discord/chat/bridge/embed/EmbedThumbnail;->height:I

    iget v3, p1, Lcom/discord/chat/bridge/embed/EmbedThumbnail;->height:I

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget v1, p0, Lcom/discord/chat/bridge/embed/EmbedThumbnail;->width:I

    iget v3, p1, Lcom/discord/chat/bridge/embed/EmbedThumbnail;->width:I

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/discord/chat/bridge/embed/EmbedThumbnail;->gifv:Ljava/lang/Boolean;

    iget-object v3, p1, Lcom/discord/chat/bridge/embed/EmbedThumbnail;->gifv:Ljava/lang/Boolean;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/discord/chat/bridge/embed/EmbedThumbnail;->showPlayButton:Ljava/lang/Boolean;

    iget-object p1, p1, Lcom/discord/chat/bridge/embed/EmbedThumbnail;->showPlayButton:Ljava/lang/Boolean;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_8

    return v2

    :cond_8
    return v0
.end method

.method public getEmbedUrl()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/embed/EmbedThumbnail;->embedUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final getGifv()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/embed/EmbedThumbnail;->gifv:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final getHeight()I
    .locals 1

    iget v0, p0, Lcom/discord/chat/bridge/embed/EmbedThumbnail;->height:I

    return v0
.end method

.method public final getProxyURL()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/embed/EmbedThumbnail;->proxyURL:Ljava/lang/String;

    return-object v0
.end method

.method public final getShowPlayButton()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/embed/EmbedThumbnail;->showPlayButton:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final getUrl()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/embed/EmbedThumbnail;->url:Ljava/lang/String;

    return-object v0
.end method

.method public final getVideoUrl()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/embed/EmbedThumbnail;->videoUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final getWidth()I
    .locals 1

    iget v0, p0, Lcom/discord/chat/bridge/embed/EmbedThumbnail;->width:I

    return v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/discord/chat/bridge/embed/EmbedThumbnail;->url:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/discord/chat/bridge/embed/EmbedThumbnail;->proxyURL:Ljava/lang/String;

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

    iget-object v1, p0, Lcom/discord/chat/bridge/embed/EmbedThumbnail;->videoUrl:Ljava/lang/String;

    if-nez v1, :cond_1

    move v1, v2

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_1
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/discord/chat/bridge/embed/EmbedThumbnail;->height:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/discord/chat/bridge/embed/EmbedThumbnail;->width:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/discord/chat/bridge/embed/EmbedThumbnail;->gifv:Ljava/lang/Boolean;

    if-nez v1, :cond_2

    move v1, v2

    goto :goto_2

    :cond_2
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_2
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/discord/chat/bridge/embed/EmbedThumbnail;->showPlayButton:Ljava/lang/Boolean;

    if-nez v1, :cond_3

    goto :goto_3

    :cond_3
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_3
    add-int/2addr v0, v2

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 9

    iget-object v0, p0, Lcom/discord/chat/bridge/embed/EmbedThumbnail;->url:Ljava/lang/String;

    iget-object v1, p0, Lcom/discord/chat/bridge/embed/EmbedThumbnail;->proxyURL:Ljava/lang/String;

    iget-object v2, p0, Lcom/discord/chat/bridge/embed/EmbedThumbnail;->videoUrl:Ljava/lang/String;

    iget v3, p0, Lcom/discord/chat/bridge/embed/EmbedThumbnail;->height:I

    iget v4, p0, Lcom/discord/chat/bridge/embed/EmbedThumbnail;->width:I

    iget-object v5, p0, Lcom/discord/chat/bridge/embed/EmbedThumbnail;->gifv:Ljava/lang/Boolean;

    iget-object v6, p0, Lcom/discord/chat/bridge/embed/EmbedThumbnail;->showPlayButton:Ljava/lang/Boolean;

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "EmbedThumbnail(url="

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", proxyURL="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", videoUrl="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", height="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", width="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", gifv="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", showPlayButton="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
