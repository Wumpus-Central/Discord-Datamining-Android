.class public final Lcom/discord/media_player/MediaSource;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/discord/media_player/MediaSource$WhenMappings;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0006\n\u0002\u0008\u001a\n\u0002\u0010\u0008\n\u0002\u0008\u0002\u0008\u0086\u0008\u0018\u00002\u00020\u0001BC\u0012\n\u0008\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0008\u0008\u0002\u0010\u0008\u001a\u00020\t\u0012\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\u0002\u0010\u000cJ\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010\u001d\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001e\u001a\u00020\u0007H\u00c6\u0003J\t\u0010\u001f\u001a\u00020\tH\u00c6\u0003J\u0010\u0010 \u001a\u0004\u0018\u00010\u000bH\u00c6\u0003\u00a2\u0006\u0002\u0010\u0014JP\u0010!\u001a\u00020\u00002\n\u0008\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00072\u0008\u0008\u0002\u0010\u0008\u001a\u00020\t2\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bH\u00c6\u0001\u00a2\u0006\u0002\u0010\"J\u0013\u0010#\u001a\u00020\t2\u0008\u0010$\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010%\u001a\u00020&H\u00d6\u0001J\t\u0010\'\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\u000eR\u0011\u0010\u000f\u001a\u00020\t\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000f\u0010\u0010R\u0011\u0010\u0011\u001a\u00020\t\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0011\u0010\u0010R\u0011\u0010\u0012\u001a\u00020\t\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0012\u0010\u0010R\u0015\u0010\n\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\n\n\u0002\u0010\u0015\u001a\u0004\u0008\u0013\u0010\u0014R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0016\u0010\u000eR\u0011\u0010\u0008\u001a\u00020\t\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0017\u0010\u0010R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0018\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0019\u0010\u001a\u00a8\u0006("
    }
    d2 = {
        "Lcom/discord/media_player/MediaSource;",
        "",
        "sourceUrl",
        "",
        "previewUrl",
        "featureTag",
        "type",
        "Lcom/discord/media_player/MediaType;",
        "shouldAutoPlay",
        "",
        "portal",
        "",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/discord/media_player/MediaType;ZLjava/lang/Double;)V",
        "getFeatureTag",
        "()Ljava/lang/String;",
        "isGifv",
        "()Z",
        "isValid",
        "isVideo",
        "getPortal",
        "()Ljava/lang/Double;",
        "Ljava/lang/Double;",
        "getPreviewUrl",
        "getShouldAutoPlay",
        "getSourceUrl",
        "getType",
        "()Lcom/discord/media_player/MediaType;",
        "component1",
        "component2",
        "component3",
        "component4",
        "component5",
        "component6",
        "copy",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/discord/media_player/MediaType;ZLjava/lang/Double;)Lcom/discord/media_player/MediaSource;",
        "equals",
        "other",
        "hashCode",
        "",
        "toString",
        "media_player_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final featureTag:Ljava/lang/String;

.field private final isGifv:Z

.field private final isValid:Z

.field private final isVideo:Z

.field private final portal:Ljava/lang/Double;

.field private final previewUrl:Ljava/lang/String;

.field private final shouldAutoPlay:Z

.field private final sourceUrl:Ljava/lang/String;

.field private final type:Lcom/discord/media_player/MediaType;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/discord/media_player/MediaType;ZLjava/lang/Double;)V
    .locals 1

    const-string v0, "featureTag"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "type"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/discord/media_player/MediaSource;->sourceUrl:Ljava/lang/String;

    .line 3
    iput-object p2, p0, Lcom/discord/media_player/MediaSource;->previewUrl:Ljava/lang/String;

    .line 4
    iput-object p3, p0, Lcom/discord/media_player/MediaSource;->featureTag:Ljava/lang/String;

    .line 5
    iput-object p4, p0, Lcom/discord/media_player/MediaSource;->type:Lcom/discord/media_player/MediaType;

    .line 6
    iput-boolean p5, p0, Lcom/discord/media_player/MediaSource;->shouldAutoPlay:Z

    .line 7
    iput-object p6, p0, Lcom/discord/media_player/MediaSource;->portal:Ljava/lang/Double;

    .line 8
    sget-object p3, Lcom/discord/media_player/MediaType;->GIFV:Lcom/discord/media_player/MediaType;

    const/4 p5, 0x0

    const/4 p6, 0x1

    if-ne p4, p3, :cond_0

    move p3, p6

    goto :goto_0

    :cond_0
    move p3, p5

    :goto_0
    iput-boolean p3, p0, Lcom/discord/media_player/MediaSource;->isGifv:Z

    .line 9
    sget-object p3, Lcom/discord/media_player/MediaType;->VIDEO:Lcom/discord/media_player/MediaType;

    if-ne p4, p3, :cond_1

    move p3, p6

    goto :goto_1

    :cond_1
    move p3, p5

    :goto_1
    iput-boolean p3, p0, Lcom/discord/media_player/MediaSource;->isVideo:Z

    .line 10
    sget-object p3, Lcom/discord/media_player/MediaSource$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {p4}, Ljava/lang/Enum;->ordinal()I

    move-result p4

    aget p3, p3, p4

    if-eq p3, p6, :cond_6

    const/4 p2, 0x2

    if-eq p3, p2, :cond_3

    const/4 p2, 0x3

    if-eq p3, p2, :cond_3

    const/4 p2, 0x4

    if-ne p3, p2, :cond_2

    goto :goto_2

    .line 11
    :cond_2
    new-instance p1, Llf/q;

    invoke-direct {p1}, Llf/q;-><init>()V

    throw p1

    :cond_3
    :goto_2
    if-eqz p1, :cond_5

    invoke-static {p1}, Lpi/l;->w(Ljava/lang/CharSequence;)Z

    move-result p1

    if-eqz p1, :cond_4

    goto :goto_3

    :cond_4
    move p1, p5

    goto :goto_4

    :cond_5
    :goto_3
    move p1, p6

    :goto_4
    if-nez p1, :cond_9

    goto :goto_7

    :cond_6
    if-eqz p2, :cond_8

    .line 12
    invoke-static {p2}, Lpi/l;->w(Ljava/lang/CharSequence;)Z

    move-result p1

    if-eqz p1, :cond_7

    goto :goto_5

    :cond_7
    move p1, p5

    goto :goto_6

    :cond_8
    :goto_5
    move p1, p6

    :goto_6
    if-nez p1, :cond_9

    :goto_7
    move p5, p6

    .line 13
    :cond_9
    iput-boolean p5, p0, Lcom/discord/media_player/MediaSource;->isValid:Z

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/discord/media_player/MediaType;ZLjava/lang/Double;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 9

    and-int/lit8 v0, p7, 0x1

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    move-object v3, v1

    goto :goto_0

    :cond_0
    move-object v3, p1

    :goto_0
    and-int/lit8 v0, p7, 0x2

    if-eqz v0, :cond_1

    move-object v4, v1

    goto :goto_1

    :cond_1
    move-object v4, p2

    :goto_1
    and-int/lit8 v0, p7, 0x10

    if-eqz v0, :cond_2

    const/4 v0, 0x0

    move v7, v0

    goto :goto_2

    :cond_2
    move v7, p5

    :goto_2
    and-int/lit8 v0, p7, 0x20

    if-eqz v0, :cond_3

    move-object v8, v1

    goto :goto_3

    :cond_3
    move-object v8, p6

    :goto_3
    move-object v2, p0

    move-object v5, p3

    move-object v6, p4

    .line 14
    invoke-direct/range {v2 .. v8}, Lcom/discord/media_player/MediaSource;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/discord/media_player/MediaType;ZLjava/lang/Double;)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/discord/media_player/MediaSource;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/discord/media_player/MediaType;ZLjava/lang/Double;ILjava/lang/Object;)Lcom/discord/media_player/MediaSource;
    .locals 4

    and-int/lit8 p8, p7, 0x1

    if-eqz p8, :cond_0

    iget-object p1, p0, Lcom/discord/media_player/MediaSource;->sourceUrl:Ljava/lang/String;

    :cond_0
    and-int/lit8 p8, p7, 0x2

    if-eqz p8, :cond_1

    iget-object p2, p0, Lcom/discord/media_player/MediaSource;->previewUrl:Ljava/lang/String;

    :cond_1
    move-object p8, p2

    and-int/lit8 p2, p7, 0x4

    if-eqz p2, :cond_2

    iget-object p3, p0, Lcom/discord/media_player/MediaSource;->featureTag:Ljava/lang/String;

    :cond_2
    move-object v0, p3

    and-int/lit8 p2, p7, 0x8

    if-eqz p2, :cond_3

    iget-object p4, p0, Lcom/discord/media_player/MediaSource;->type:Lcom/discord/media_player/MediaType;

    :cond_3
    move-object v1, p4

    and-int/lit8 p2, p7, 0x10

    if-eqz p2, :cond_4

    iget-boolean p5, p0, Lcom/discord/media_player/MediaSource;->shouldAutoPlay:Z

    :cond_4
    move v2, p5

    and-int/lit8 p2, p7, 0x20

    if-eqz p2, :cond_5

    iget-object p6, p0, Lcom/discord/media_player/MediaSource;->portal:Ljava/lang/Double;

    :cond_5
    move-object v3, p6

    move-object p2, p0

    move-object p3, p1

    move-object p4, p8

    move-object p5, v0

    move-object p6, v1

    move p7, v2

    move-object p8, v3

    invoke-virtual/range {p2 .. p8}, Lcom/discord/media_player/MediaSource;->copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/discord/media_player/MediaType;ZLjava/lang/Double;)Lcom/discord/media_player/MediaSource;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/discord/media_player/MediaSource;->sourceUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/discord/media_player/MediaSource;->previewUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/discord/media_player/MediaSource;->featureTag:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Lcom/discord/media_player/MediaType;
    .locals 1

    iget-object v0, p0, Lcom/discord/media_player/MediaSource;->type:Lcom/discord/media_player/MediaType;

    return-object v0
.end method

.method public final component5()Z
    .locals 1

    iget-boolean v0, p0, Lcom/discord/media_player/MediaSource;->shouldAutoPlay:Z

    return v0
.end method

.method public final component6()Ljava/lang/Double;
    .locals 1

    iget-object v0, p0, Lcom/discord/media_player/MediaSource;->portal:Ljava/lang/Double;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/discord/media_player/MediaType;ZLjava/lang/Double;)Lcom/discord/media_player/MediaSource;
    .locals 8

    const-string v0, "featureTag"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "type"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/discord/media_player/MediaSource;

    move-object v1, v0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move v6, p5

    move-object v7, p6

    invoke-direct/range {v1 .. v7}, Lcom/discord/media_player/MediaSource;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/discord/media_player/MediaType;ZLjava/lang/Double;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/discord/media_player/MediaSource;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/discord/media_player/MediaSource;

    iget-object v1, p0, Lcom/discord/media_player/MediaSource;->sourceUrl:Ljava/lang/String;

    iget-object v3, p1, Lcom/discord/media_player/MediaSource;->sourceUrl:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/discord/media_player/MediaSource;->previewUrl:Ljava/lang/String;

    iget-object v3, p1, Lcom/discord/media_player/MediaSource;->previewUrl:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/discord/media_player/MediaSource;->featureTag:Ljava/lang/String;

    iget-object v3, p1, Lcom/discord/media_player/MediaSource;->featureTag:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/discord/media_player/MediaSource;->type:Lcom/discord/media_player/MediaType;

    iget-object v3, p1, Lcom/discord/media_player/MediaSource;->type:Lcom/discord/media_player/MediaType;

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget-boolean v1, p0, Lcom/discord/media_player/MediaSource;->shouldAutoPlay:Z

    iget-boolean v3, p1, Lcom/discord/media_player/MediaSource;->shouldAutoPlay:Z

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/discord/media_player/MediaSource;->portal:Ljava/lang/Double;

    iget-object p1, p1, Lcom/discord/media_player/MediaSource;->portal:Ljava/lang/Double;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_7

    return v2

    :cond_7
    return v0
.end method

.method public final getFeatureTag()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/discord/media_player/MediaSource;->featureTag:Ljava/lang/String;

    return-object v0
.end method

.method public final getPortal()Ljava/lang/Double;
    .locals 1

    iget-object v0, p0, Lcom/discord/media_player/MediaSource;->portal:Ljava/lang/Double;

    return-object v0
.end method

.method public final getPreviewUrl()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/discord/media_player/MediaSource;->previewUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final getShouldAutoPlay()Z
    .locals 1

    iget-boolean v0, p0, Lcom/discord/media_player/MediaSource;->shouldAutoPlay:Z

    return v0
.end method

.method public final getSourceUrl()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/discord/media_player/MediaSource;->sourceUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final getType()Lcom/discord/media_player/MediaType;
    .locals 1

    iget-object v0, p0, Lcom/discord/media_player/MediaSource;->type:Lcom/discord/media_player/MediaType;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/discord/media_player/MediaSource;->sourceUrl:Ljava/lang/String;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/discord/media_player/MediaSource;->previewUrl:Ljava/lang/String;

    if-nez v2, :cond_1

    move v2, v1

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/discord/media_player/MediaSource;->featureTag:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/discord/media_player/MediaSource;->type:Lcom/discord/media_player/MediaType;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v2, p0, Lcom/discord/media_player/MediaSource;->shouldAutoPlay:Z

    if-eqz v2, :cond_2

    const/4 v2, 0x1

    :cond_2
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/discord/media_player/MediaSource;->portal:Ljava/lang/Double;

    if-nez v2, :cond_3

    goto :goto_2

    :cond_3
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_2
    add-int/2addr v0, v1

    return v0
.end method

.method public final isGifv()Z
    .locals 1

    iget-boolean v0, p0, Lcom/discord/media_player/MediaSource;->isGifv:Z

    return v0
.end method

.method public final isValid()Z
    .locals 1

    iget-boolean v0, p0, Lcom/discord/media_player/MediaSource;->isValid:Z

    return v0
.end method

.method public final isVideo()Z
    .locals 1

    iget-boolean v0, p0, Lcom/discord/media_player/MediaSource;->isVideo:Z

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 8

    iget-object v0, p0, Lcom/discord/media_player/MediaSource;->sourceUrl:Ljava/lang/String;

    iget-object v1, p0, Lcom/discord/media_player/MediaSource;->previewUrl:Ljava/lang/String;

    iget-object v2, p0, Lcom/discord/media_player/MediaSource;->featureTag:Ljava/lang/String;

    iget-object v3, p0, Lcom/discord/media_player/MediaSource;->type:Lcom/discord/media_player/MediaType;

    iget-boolean v4, p0, Lcom/discord/media_player/MediaSource;->shouldAutoPlay:Z

    iget-object v5, p0, Lcom/discord/media_player/MediaSource;->portal:Ljava/lang/Double;

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "MediaSource(sourceUrl="

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", previewUrl="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", featureTag="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", type="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", shouldAutoPlay="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", portal="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
