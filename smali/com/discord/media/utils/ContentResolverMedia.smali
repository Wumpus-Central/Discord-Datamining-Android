.class public final Lcom/discord/media/utils/ContentResolverMedia;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/discord/media/utils/ContentResolverMedia$Column;,
        Lcom/discord/media/utils/ContentResolverMedia$Companion;,
        Lcom/discord/media/utils/ContentResolverMedia$MediaType;,
        Lcom/discord/media/utils/ContentResolverMedia$QueryColumns;,
        Lcom/discord/media/utils/ContentResolverMedia$QueryType;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u001d\n\u0002\u0010\u000b\n\u0002\u0008\t\u0008\u0080\u0008\u0018\u0000 /2\u00020\u0001:\u0005./012BQ\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\t\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u000b\u001a\u00020\u000c\u0012\u0006\u0010\r\u001a\u00020\u000c\u0012\u0006\u0010\u000e\u001a\u00020\u000c\u0012\u0006\u0010\u000f\u001a\u00020\u000c\u00a2\u0006\u0002\u0010\u0010J\t\u0010\u001f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010 \u001a\u00020\u0005H\u00c6\u0003J\t\u0010!\u001a\u00020\u0007H\u00c6\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\tH\u00c6\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\tH\u00c6\u0003J\t\u0010$\u001a\u00020\u000cH\u00c6\u0003J\t\u0010%\u001a\u00020\u000cH\u00c6\u0003J\t\u0010&\u001a\u00020\u000cH\u00c6\u0003J\t\u0010\'\u001a\u00020\u000cH\u00c6\u0003Jg\u0010(\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00072\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\t2\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u000c2\u0008\u0008\u0002\u0010\r\u001a\u00020\u000c2\u0008\u0008\u0002\u0010\u000e\u001a\u00020\u000c2\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u000cH\u00c6\u0001J\u0013\u0010)\u001a\u00020*2\u0008\u0010+\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010,\u001a\u00020\u000cH\u00d6\u0001J\t\u0010-\u001a\u00020\tH\u00d6\u0001R\u0011\u0010\r\u001a\u00020\u000c\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0011\u0010\u0012R\u0011\u0010\u000b\u001a\u00020\u000c\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0013\u0010\u0012R\u0011\u0010\u000f\u001a\u00020\u000c\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0014\u0010\u0012R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0015\u0010\u0016R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0017\u0010\u0018R\u0013\u0010\u0008\u001a\u0004\u0018\u00010\t\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0019\u0010\u001aR\u0013\u0010\n\u001a\u0004\u0018\u00010\t\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001b\u0010\u001aR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001c\u0010\u001dR\u0011\u0010\u000e\u001a\u00020\u000c\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001e\u0010\u0012\u00a8\u00063"
    }
    d2 = {
        "Lcom/discord/media/utils/ContentResolverMedia;",
        "",
        "id",
        "",
        "uri",
        "Landroid/net/Uri;",
        "mediaType",
        "Lcom/discord/media/utils/ContentResolverMedia$MediaType;",
        "mimeType",
        "",
        "name",
        "duration",
        "",
        "dateAdded",
        "width",
        "height",
        "(JLandroid/net/Uri;Lcom/discord/media/utils/ContentResolverMedia$MediaType;Ljava/lang/String;Ljava/lang/String;IIII)V",
        "getDateAdded",
        "()I",
        "getDuration",
        "getHeight",
        "getId",
        "()J",
        "getMediaType",
        "()Lcom/discord/media/utils/ContentResolverMedia$MediaType;",
        "getMimeType",
        "()Ljava/lang/String;",
        "getName",
        "getUri",
        "()Landroid/net/Uri;",
        "getWidth",
        "component1",
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
        "",
        "other",
        "hashCode",
        "toString",
        "Column",
        "Companion",
        "MediaType",
        "QueryColumns",
        "QueryType",
        "media_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final Companion:Lcom/discord/media/utils/ContentResolverMedia$Companion;


# instance fields
.field private final dateAdded:I

.field private final duration:I

.field private final height:I

.field private final id:J

.field private final mediaType:Lcom/discord/media/utils/ContentResolverMedia$MediaType;

.field private final mimeType:Ljava/lang/String;

.field private final name:Ljava/lang/String;

.field private final uri:Landroid/net/Uri;

.field private final width:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/discord/media/utils/ContentResolverMedia$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/discord/media/utils/ContentResolverMedia$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/discord/media/utils/ContentResolverMedia;->Companion:Lcom/discord/media/utils/ContentResolverMedia$Companion;

    return-void
.end method

.method public constructor <init>(JLandroid/net/Uri;Lcom/discord/media/utils/ContentResolverMedia$MediaType;Ljava/lang/String;Ljava/lang/String;IIII)V
    .locals 1

    .line 1
    const-string v0, "uri"

    .line 2
    .line 3
    invoke-static {p3, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "mediaType"

    .line 7
    .line 8
    invoke-static {p4, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-wide p1, p0, Lcom/discord/media/utils/ContentResolverMedia;->id:J

    .line 15
    .line 16
    iput-object p3, p0, Lcom/discord/media/utils/ContentResolverMedia;->uri:Landroid/net/Uri;

    .line 17
    .line 18
    iput-object p4, p0, Lcom/discord/media/utils/ContentResolverMedia;->mediaType:Lcom/discord/media/utils/ContentResolverMedia$MediaType;

    .line 19
    .line 20
    iput-object p5, p0, Lcom/discord/media/utils/ContentResolverMedia;->mimeType:Ljava/lang/String;

    .line 21
    .line 22
    iput-object p6, p0, Lcom/discord/media/utils/ContentResolverMedia;->name:Ljava/lang/String;

    .line 23
    .line 24
    iput p7, p0, Lcom/discord/media/utils/ContentResolverMedia;->duration:I

    .line 25
    .line 26
    iput p8, p0, Lcom/discord/media/utils/ContentResolverMedia;->dateAdded:I

    .line 27
    .line 28
    iput p9, p0, Lcom/discord/media/utils/ContentResolverMedia;->width:I

    .line 29
    .line 30
    iput p10, p0, Lcom/discord/media/utils/ContentResolverMedia;->height:I

    .line 31
    .line 32
    return-void
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
.end method

.method public static synthetic copy$default(Lcom/discord/media/utils/ContentResolverMedia;JLandroid/net/Uri;Lcom/discord/media/utils/ContentResolverMedia$MediaType;Ljava/lang/String;Ljava/lang/String;IIIIILjava/lang/Object;)Lcom/discord/media/utils/ContentResolverMedia;
    .locals 11

    move-object v0, p0

    move/from16 v1, p11

    and-int/lit8 v2, v1, 0x1

    if-eqz v2, :cond_0

    iget-wide v2, v0, Lcom/discord/media/utils/ContentResolverMedia;->id:J

    goto :goto_0

    :cond_0
    move-wide v2, p1

    :goto_0
    and-int/lit8 v4, v1, 0x2

    if-eqz v4, :cond_1

    iget-object v4, v0, Lcom/discord/media/utils/ContentResolverMedia;->uri:Landroid/net/Uri;

    goto :goto_1

    :cond_1
    move-object v4, p3

    :goto_1
    and-int/lit8 v5, v1, 0x4

    if-eqz v5, :cond_2

    iget-object v5, v0, Lcom/discord/media/utils/ContentResolverMedia;->mediaType:Lcom/discord/media/utils/ContentResolverMedia$MediaType;

    goto :goto_2

    :cond_2
    move-object v5, p4

    :goto_2
    and-int/lit8 v6, v1, 0x8

    if-eqz v6, :cond_3

    iget-object v6, v0, Lcom/discord/media/utils/ContentResolverMedia;->mimeType:Ljava/lang/String;

    goto :goto_3

    :cond_3
    move-object/from16 v6, p5

    :goto_3
    and-int/lit8 v7, v1, 0x10

    if-eqz v7, :cond_4

    iget-object v7, v0, Lcom/discord/media/utils/ContentResolverMedia;->name:Ljava/lang/String;

    goto :goto_4

    :cond_4
    move-object/from16 v7, p6

    :goto_4
    and-int/lit8 v8, v1, 0x20

    if-eqz v8, :cond_5

    iget v8, v0, Lcom/discord/media/utils/ContentResolverMedia;->duration:I

    goto :goto_5

    :cond_5
    move/from16 v8, p7

    :goto_5
    and-int/lit8 v9, v1, 0x40

    if-eqz v9, :cond_6

    iget v9, v0, Lcom/discord/media/utils/ContentResolverMedia;->dateAdded:I

    goto :goto_6

    :cond_6
    move/from16 v9, p8

    :goto_6
    and-int/lit16 v10, v1, 0x80

    if-eqz v10, :cond_7

    iget v10, v0, Lcom/discord/media/utils/ContentResolverMedia;->width:I

    goto :goto_7

    :cond_7
    move/from16 v10, p9

    :goto_7
    and-int/lit16 v1, v1, 0x100

    if-eqz v1, :cond_8

    iget v1, v0, Lcom/discord/media/utils/ContentResolverMedia;->height:I

    goto :goto_8

    :cond_8
    move/from16 v1, p10

    :goto_8
    move-wide p1, v2

    move-object p3, v4

    move-object p4, v5

    move-object/from16 p5, v6

    move-object/from16 p6, v7

    move/from16 p7, v8

    move/from16 p8, v9

    move/from16 p9, v10

    move/from16 p10, v1

    invoke-virtual/range {p0 .. p10}, Lcom/discord/media/utils/ContentResolverMedia;->copy(JLandroid/net/Uri;Lcom/discord/media/utils/ContentResolverMedia$MediaType;Ljava/lang/String;Ljava/lang/String;IIII)Lcom/discord/media/utils/ContentResolverMedia;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final component1()J
    .locals 2

    iget-wide v0, p0, Lcom/discord/media/utils/ContentResolverMedia;->id:J

    return-wide v0
.end method

.method public final component2()Landroid/net/Uri;
    .locals 1

    iget-object v0, p0, Lcom/discord/media/utils/ContentResolverMedia;->uri:Landroid/net/Uri;

    return-object v0
.end method

.method public final component3()Lcom/discord/media/utils/ContentResolverMedia$MediaType;
    .locals 1

    iget-object v0, p0, Lcom/discord/media/utils/ContentResolverMedia;->mediaType:Lcom/discord/media/utils/ContentResolverMedia$MediaType;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/discord/media/utils/ContentResolverMedia;->mimeType:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/discord/media/utils/ContentResolverMedia;->name:Ljava/lang/String;

    return-object v0
.end method

.method public final component6()I
    .locals 1

    iget v0, p0, Lcom/discord/media/utils/ContentResolverMedia;->duration:I

    return v0
.end method

.method public final component7()I
    .locals 1

    iget v0, p0, Lcom/discord/media/utils/ContentResolverMedia;->dateAdded:I

    return v0
.end method

.method public final component8()I
    .locals 1

    iget v0, p0, Lcom/discord/media/utils/ContentResolverMedia;->width:I

    return v0
.end method

.method public final component9()I
    .locals 1

    iget v0, p0, Lcom/discord/media/utils/ContentResolverMedia;->height:I

    return v0
.end method

.method public final copy(JLandroid/net/Uri;Lcom/discord/media/utils/ContentResolverMedia$MediaType;Ljava/lang/String;Ljava/lang/String;IIII)Lcom/discord/media/utils/ContentResolverMedia;
    .locals 12

    const-string v0, "uri"

    move-object v4, p3

    invoke-static {p3, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mediaType"

    move-object/from16 v5, p4

    invoke-static {v5, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/discord/media/utils/ContentResolverMedia;

    move-object v1, v0

    move-wide v2, p1

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move/from16 v8, p7

    move/from16 v9, p8

    move/from16 v10, p9

    move/from16 v11, p10

    invoke-direct/range {v1 .. v11}, Lcom/discord/media/utils/ContentResolverMedia;-><init>(JLandroid/net/Uri;Lcom/discord/media/utils/ContentResolverMedia$MediaType;Ljava/lang/String;Ljava/lang/String;IIII)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/discord/media/utils/ContentResolverMedia;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/discord/media/utils/ContentResolverMedia;

    iget-wide v3, p0, Lcom/discord/media/utils/ContentResolverMedia;->id:J

    iget-wide v5, p1, Lcom/discord/media/utils/ContentResolverMedia;->id:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/discord/media/utils/ContentResolverMedia;->uri:Landroid/net/Uri;

    iget-object v3, p1, Lcom/discord/media/utils/ContentResolverMedia;->uri:Landroid/net/Uri;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/discord/media/utils/ContentResolverMedia;->mediaType:Lcom/discord/media/utils/ContentResolverMedia$MediaType;

    iget-object v3, p1, Lcom/discord/media/utils/ContentResolverMedia;->mediaType:Lcom/discord/media/utils/ContentResolverMedia$MediaType;

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/discord/media/utils/ContentResolverMedia;->mimeType:Ljava/lang/String;

    iget-object v3, p1, Lcom/discord/media/utils/ContentResolverMedia;->mimeType:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/discord/media/utils/ContentResolverMedia;->name:Ljava/lang/String;

    iget-object v3, p1, Lcom/discord/media/utils/ContentResolverMedia;->name:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget v1, p0, Lcom/discord/media/utils/ContentResolverMedia;->duration:I

    iget v3, p1, Lcom/discord/media/utils/ContentResolverMedia;->duration:I

    if-eq v1, v3, :cond_7

    return v2

    :cond_7
    iget v1, p0, Lcom/discord/media/utils/ContentResolverMedia;->dateAdded:I

    iget v3, p1, Lcom/discord/media/utils/ContentResolverMedia;->dateAdded:I

    if-eq v1, v3, :cond_8

    return v2

    :cond_8
    iget v1, p0, Lcom/discord/media/utils/ContentResolverMedia;->width:I

    iget v3, p1, Lcom/discord/media/utils/ContentResolverMedia;->width:I

    if-eq v1, v3, :cond_9

    return v2

    :cond_9
    iget v1, p0, Lcom/discord/media/utils/ContentResolverMedia;->height:I

    iget p1, p1, Lcom/discord/media/utils/ContentResolverMedia;->height:I

    if-eq v1, p1, :cond_a

    return v2

    :cond_a
    return v0
.end method

.method public final getDateAdded()I
    .locals 1

    iget v0, p0, Lcom/discord/media/utils/ContentResolverMedia;->dateAdded:I

    return v0
.end method

.method public final getDuration()I
    .locals 1

    iget v0, p0, Lcom/discord/media/utils/ContentResolverMedia;->duration:I

    return v0
.end method

.method public final getHeight()I
    .locals 1

    iget v0, p0, Lcom/discord/media/utils/ContentResolverMedia;->height:I

    return v0
.end method

.method public final getId()J
    .locals 2

    iget-wide v0, p0, Lcom/discord/media/utils/ContentResolverMedia;->id:J

    return-wide v0
.end method

.method public final getMediaType()Lcom/discord/media/utils/ContentResolverMedia$MediaType;
    .locals 1

    iget-object v0, p0, Lcom/discord/media/utils/ContentResolverMedia;->mediaType:Lcom/discord/media/utils/ContentResolverMedia$MediaType;

    return-object v0
.end method

.method public final getMimeType()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/discord/media/utils/ContentResolverMedia;->mimeType:Ljava/lang/String;

    return-object v0
.end method

.method public final getName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/discord/media/utils/ContentResolverMedia;->name:Ljava/lang/String;

    return-object v0
.end method

.method public final getUri()Landroid/net/Uri;
    .locals 1

    iget-object v0, p0, Lcom/discord/media/utils/ContentResolverMedia;->uri:Landroid/net/Uri;

    return-object v0
.end method

.method public final getWidth()I
    .locals 1

    iget v0, p0, Lcom/discord/media/utils/ContentResolverMedia;->width:I

    return v0
.end method

.method public hashCode()I
    .locals 3

    iget-wide v0, p0, Lcom/discord/media/utils/ContentResolverMedia;->id:J

    invoke-static {v0, v1}, Lco/discord/media_engine/a;->a(J)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/discord/media/utils/ContentResolverMedia;->uri:Landroid/net/Uri;

    invoke-virtual {v1}, Landroid/net/Uri;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/discord/media/utils/ContentResolverMedia;->mediaType:Lcom/discord/media/utils/ContentResolverMedia$MediaType;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/discord/media/utils/ContentResolverMedia;->mimeType:Ljava/lang/String;

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

    iget-object v1, p0, Lcom/discord/media/utils/ContentResolverMedia;->name:Ljava/lang/String;

    if-nez v1, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/discord/media/utils/ContentResolverMedia;->duration:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/discord/media/utils/ContentResolverMedia;->dateAdded:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/discord/media/utils/ContentResolverMedia;->width:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/discord/media/utils/ContentResolverMedia;->height:I

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 12

    iget-wide v0, p0, Lcom/discord/media/utils/ContentResolverMedia;->id:J

    iget-object v2, p0, Lcom/discord/media/utils/ContentResolverMedia;->uri:Landroid/net/Uri;

    iget-object v3, p0, Lcom/discord/media/utils/ContentResolverMedia;->mediaType:Lcom/discord/media/utils/ContentResolverMedia$MediaType;

    iget-object v4, p0, Lcom/discord/media/utils/ContentResolverMedia;->mimeType:Ljava/lang/String;

    iget-object v5, p0, Lcom/discord/media/utils/ContentResolverMedia;->name:Ljava/lang/String;

    iget v6, p0, Lcom/discord/media/utils/ContentResolverMedia;->duration:I

    iget v7, p0, Lcom/discord/media/utils/ContentResolverMedia;->dateAdded:I

    iget v8, p0, Lcom/discord/media/utils/ContentResolverMedia;->width:I

    iget v9, p0, Lcom/discord/media/utils/ContentResolverMedia;->height:I

    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    const-string v11, "ContentResolverMedia(id="

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v0, ", uri="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", mediaType="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", mimeType="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", name="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", duration="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", dateAdded="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", width="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", height="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
