.class public final Lcom/discord/misc/utilities/measure/HeadlessViewMeasurer$MeasureBounds;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/discord/misc/utilities/measure/HeadlessViewMeasurer;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "MeasureBounds"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u000b\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\u0008\u0086\u0008\u0018\u00002\u00020\u0001B\u001d\u0012\n\u0008\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0005J\u0010\u0010\n\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0007J\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0007J&\u0010\u000c\u001a\u00020\u00002\n\u0008\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001\u00a2\u0006\u0002\u0010\rJ\u0013\u0010\u000e\u001a\u00020\u000f2\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0011\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u0012\u001a\u00020\u0013H\u00d6\u0001R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u0008\u001a\u0004\u0008\u0006\u0010\u0007R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u0008\u001a\u0004\u0008\t\u0010\u0007\u00a8\u0006\u0014"
    }
    d2 = {
        "Lcom/discord/misc/utilities/measure/HeadlessViewMeasurer$MeasureBounds;",
        "",
        "widthPx",
        "",
        "heightPx",
        "(Ljava/lang/Integer;Ljava/lang/Integer;)V",
        "getHeightPx",
        "()Ljava/lang/Integer;",
        "Ljava/lang/Integer;",
        "getWidthPx",
        "component1",
        "component2",
        "copy",
        "(Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/discord/misc/utilities/measure/HeadlessViewMeasurer$MeasureBounds;",
        "equals",
        "",
        "other",
        "hashCode",
        "toString",
        "",
        "misc_utilities_release"
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
.field private final heightPx:Ljava/lang/Integer;

.field private final widthPx:Ljava/lang/Integer;


# direct methods
.method public constructor <init>()V
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x3

    invoke-direct {p0, v0, v0, v1, v0}, Lcom/discord/misc/utilities/measure/HeadlessViewMeasurer$MeasureBounds;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/Integer;Ljava/lang/Integer;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/discord/misc/utilities/measure/HeadlessViewMeasurer$MeasureBounds;->widthPx:Ljava/lang/Integer;

    .line 3
    iput-object p2, p0, Lcom/discord/misc/utilities/measure/HeadlessViewMeasurer$MeasureBounds;->heightPx:Ljava/lang/Integer;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Integer;Ljava/lang/Integer;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p4, p3, 0x1

    const/4 v0, 0x0

    if-eqz p4, :cond_0

    move-object p1, v0

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    move-object p2, v0

    .line 4
    :cond_1
    invoke-direct {p0, p1, p2}, Lcom/discord/misc/utilities/measure/HeadlessViewMeasurer$MeasureBounds;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/discord/misc/utilities/measure/HeadlessViewMeasurer$MeasureBounds;Ljava/lang/Integer;Ljava/lang/Integer;ILjava/lang/Object;)Lcom/discord/misc/utilities/measure/HeadlessViewMeasurer$MeasureBounds;
    .locals 0

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    iget-object p1, p0, Lcom/discord/misc/utilities/measure/HeadlessViewMeasurer$MeasureBounds;->widthPx:Ljava/lang/Integer;

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    iget-object p2, p0, Lcom/discord/misc/utilities/measure/HeadlessViewMeasurer$MeasureBounds;->heightPx:Ljava/lang/Integer;

    :cond_1
    invoke-virtual {p0, p1, p2}, Lcom/discord/misc/utilities/measure/HeadlessViewMeasurer$MeasureBounds;->copy(Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/discord/misc/utilities/measure/HeadlessViewMeasurer$MeasureBounds;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/discord/misc/utilities/measure/HeadlessViewMeasurer$MeasureBounds;->widthPx:Ljava/lang/Integer;

    return-object v0
.end method

.method public final component2()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/discord/misc/utilities/measure/HeadlessViewMeasurer$MeasureBounds;->heightPx:Ljava/lang/Integer;

    return-object v0
.end method

.method public final copy(Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/discord/misc/utilities/measure/HeadlessViewMeasurer$MeasureBounds;
    .locals 1

    new-instance v0, Lcom/discord/misc/utilities/measure/HeadlessViewMeasurer$MeasureBounds;

    invoke-direct {v0, p1, p2}, Lcom/discord/misc/utilities/measure/HeadlessViewMeasurer$MeasureBounds;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/discord/misc/utilities/measure/HeadlessViewMeasurer$MeasureBounds;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/discord/misc/utilities/measure/HeadlessViewMeasurer$MeasureBounds;

    iget-object v1, p0, Lcom/discord/misc/utilities/measure/HeadlessViewMeasurer$MeasureBounds;->widthPx:Ljava/lang/Integer;

    iget-object v3, p1, Lcom/discord/misc/utilities/measure/HeadlessViewMeasurer$MeasureBounds;->widthPx:Ljava/lang/Integer;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/discord/misc/utilities/measure/HeadlessViewMeasurer$MeasureBounds;->heightPx:Ljava/lang/Integer;

    iget-object p1, p1, Lcom/discord/misc/utilities/measure/HeadlessViewMeasurer$MeasureBounds;->heightPx:Ljava/lang/Integer;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public final getHeightPx()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/discord/misc/utilities/measure/HeadlessViewMeasurer$MeasureBounds;->heightPx:Ljava/lang/Integer;

    return-object v0
.end method

.method public final getWidthPx()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/discord/misc/utilities/measure/HeadlessViewMeasurer$MeasureBounds;->widthPx:Ljava/lang/Integer;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/discord/misc/utilities/measure/HeadlessViewMeasurer$MeasureBounds;->widthPx:Ljava/lang/Integer;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/discord/misc/utilities/measure/HeadlessViewMeasurer$MeasureBounds;->heightPx:Ljava/lang/Integer;

    if-nez v2, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_1
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    iget-object v0, p0, Lcom/discord/misc/utilities/measure/HeadlessViewMeasurer$MeasureBounds;->widthPx:Ljava/lang/Integer;

    iget-object v1, p0, Lcom/discord/misc/utilities/measure/HeadlessViewMeasurer$MeasureBounds;->heightPx:Ljava/lang/Integer;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "MeasureBounds(widthPx="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", heightPx="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
