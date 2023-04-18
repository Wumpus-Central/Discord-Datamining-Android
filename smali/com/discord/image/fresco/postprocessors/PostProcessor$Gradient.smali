.class public final Lcom/discord/image/fresco/postprocessors/PostProcessor$Gradient;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/discord/image/fresco/postprocessors/PostProcessor;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/discord/image/fresco/postprocessors/PostProcessor;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Gradient"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/discord/image/fresco/postprocessors/PostProcessor$Gradient$Direction;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u0007\n\u0002\u0008\u0011\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\u0008\u0086\u0008\u0018\u00002\u00020\u0001:\u0001 B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0008\u0001\u0010\u0004\u001a\u00020\u0005\u0012\u0008\u0008\u0001\u0010\u0006\u001a\u00020\u0005\u0012\u0008\u0008\u0003\u0010\u0007\u001a\u00020\u0008\u0012\u0008\u0008\u0003\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0014\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0015\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0016\u001a\u00020\u0008H\u00c6\u0003J\t\u0010\u0017\u001a\u00020\u0008H\u00c6\u0003J;\u0010\u0018\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0003\u0010\u0004\u001a\u00020\u00052\u0008\u0008\u0003\u0010\u0006\u001a\u00020\u00052\u0008\u0008\u0003\u0010\u0007\u001a\u00020\u00082\u0008\u0008\u0003\u0010\t\u001a\u00020\u0008H\u00c6\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\u0008\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u00d6\u0003J\t\u0010\u001d\u001a\u00020\u0005H\u00d6\u0001J\t\u0010\u001e\u001a\u00020\u001fH\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\u000cR\u0011\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\u000eR\u0011\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0011\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0008\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0012\u0010\u0010\u00a8\u0006!"
    }
    d2 = {
        "Lcom/discord/image/fresco/postprocessors/PostProcessor$Gradient;",
        "Lcom/discord/image/fresco/postprocessors/PostProcessor;",
        "direction",
        "Lcom/discord/image/fresco/postprocessors/PostProcessor$Gradient$Direction;",
        "startColor",
        "",
        "endColor",
        "startPosition",
        "",
        "endPosition",
        "(Lcom/discord/image/fresco/postprocessors/PostProcessor$Gradient$Direction;IIFF)V",
        "getDirection",
        "()Lcom/discord/image/fresco/postprocessors/PostProcessor$Gradient$Direction;",
        "getEndColor",
        "()I",
        "getEndPosition",
        "()F",
        "getStartColor",
        "getStartPosition",
        "component1",
        "component2",
        "component3",
        "component4",
        "component5",
        "copy",
        "equals",
        "",
        "other",
        "",
        "hashCode",
        "toString",
        "",
        "Direction",
        "fresco_release"
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
.field private final direction:Lcom/discord/image/fresco/postprocessors/PostProcessor$Gradient$Direction;

.field private final endColor:I

.field private final endPosition:F

.field private final startColor:I

.field private final startPosition:F


# direct methods
.method public constructor <init>(Lcom/discord/image/fresco/postprocessors/PostProcessor$Gradient$Direction;IIFF)V
    .locals 1

    const-string v0, "direction"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/discord/image/fresco/postprocessors/PostProcessor$Gradient;->direction:Lcom/discord/image/fresco/postprocessors/PostProcessor$Gradient$Direction;

    .line 3
    iput p2, p0, Lcom/discord/image/fresco/postprocessors/PostProcessor$Gradient;->startColor:I

    .line 4
    iput p3, p0, Lcom/discord/image/fresco/postprocessors/PostProcessor$Gradient;->endColor:I

    .line 5
    iput p4, p0, Lcom/discord/image/fresco/postprocessors/PostProcessor$Gradient;->startPosition:F

    .line 6
    iput p5, p0, Lcom/discord/image/fresco/postprocessors/PostProcessor$Gradient;->endPosition:F

    return-void
.end method

.method public synthetic constructor <init>(Lcom/discord/image/fresco/postprocessors/PostProcessor$Gradient$Direction;IIFFILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 6

    and-int/lit8 p7, p6, 0x8

    if-eqz p7, :cond_0

    const/4 p4, 0x0

    :cond_0
    move v4, p4

    and-int/lit8 p4, p6, 0x10

    if-eqz p4, :cond_1

    const/high16 p5, 0x3f800000    # 1.0f

    :cond_1
    move v5, p5

    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move v3, p3

    .line 7
    invoke-direct/range {v0 .. v5}, Lcom/discord/image/fresco/postprocessors/PostProcessor$Gradient;-><init>(Lcom/discord/image/fresco/postprocessors/PostProcessor$Gradient$Direction;IIFF)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/discord/image/fresco/postprocessors/PostProcessor$Gradient;Lcom/discord/image/fresco/postprocessors/PostProcessor$Gradient$Direction;IIFFILjava/lang/Object;)Lcom/discord/image/fresco/postprocessors/PostProcessor$Gradient;
    .locals 3

    and-int/lit8 p7, p6, 0x1

    if-eqz p7, :cond_0

    iget-object p1, p0, Lcom/discord/image/fresco/postprocessors/PostProcessor$Gradient;->direction:Lcom/discord/image/fresco/postprocessors/PostProcessor$Gradient$Direction;

    :cond_0
    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_1

    iget p2, p0, Lcom/discord/image/fresco/postprocessors/PostProcessor$Gradient;->startColor:I

    :cond_1
    move p7, p2

    and-int/lit8 p2, p6, 0x4

    if-eqz p2, :cond_2

    iget p3, p0, Lcom/discord/image/fresco/postprocessors/PostProcessor$Gradient;->endColor:I

    :cond_2
    move v0, p3

    and-int/lit8 p2, p6, 0x8

    if-eqz p2, :cond_3

    iget p4, p0, Lcom/discord/image/fresco/postprocessors/PostProcessor$Gradient;->startPosition:F

    :cond_3
    move v1, p4

    and-int/lit8 p2, p6, 0x10

    if-eqz p2, :cond_4

    iget p5, p0, Lcom/discord/image/fresco/postprocessors/PostProcessor$Gradient;->endPosition:F

    :cond_4
    move v2, p5

    move-object p2, p0

    move-object p3, p1

    move p4, p7

    move p5, v0

    move p6, v1

    move p7, v2

    invoke-virtual/range {p2 .. p7}, Lcom/discord/image/fresco/postprocessors/PostProcessor$Gradient;->copy(Lcom/discord/image/fresco/postprocessors/PostProcessor$Gradient$Direction;IIFF)Lcom/discord/image/fresco/postprocessors/PostProcessor$Gradient;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Lcom/discord/image/fresco/postprocessors/PostProcessor$Gradient$Direction;
    .locals 1

    iget-object v0, p0, Lcom/discord/image/fresco/postprocessors/PostProcessor$Gradient;->direction:Lcom/discord/image/fresco/postprocessors/PostProcessor$Gradient$Direction;

    return-object v0
.end method

.method public final component2()I
    .locals 1

    iget v0, p0, Lcom/discord/image/fresco/postprocessors/PostProcessor$Gradient;->startColor:I

    return v0
.end method

.method public final component3()I
    .locals 1

    iget v0, p0, Lcom/discord/image/fresco/postprocessors/PostProcessor$Gradient;->endColor:I

    return v0
.end method

.method public final component4()F
    .locals 1

    iget v0, p0, Lcom/discord/image/fresco/postprocessors/PostProcessor$Gradient;->startPosition:F

    return v0
.end method

.method public final component5()F
    .locals 1

    iget v0, p0, Lcom/discord/image/fresco/postprocessors/PostProcessor$Gradient;->endPosition:F

    return v0
.end method

.method public final copy(Lcom/discord/image/fresco/postprocessors/PostProcessor$Gradient$Direction;IIFF)Lcom/discord/image/fresco/postprocessors/PostProcessor$Gradient;
    .locals 7

    const-string v0, "direction"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/discord/image/fresco/postprocessors/PostProcessor$Gradient;

    move-object v1, v0

    move-object v2, p1

    move v3, p2

    move v4, p3

    move v5, p4

    move v6, p5

    invoke-direct/range {v1 .. v6}, Lcom/discord/image/fresco/postprocessors/PostProcessor$Gradient;-><init>(Lcom/discord/image/fresco/postprocessors/PostProcessor$Gradient$Direction;IIFF)V

    return-object v0
.end method

.method public create()Lcom/facebook/imagepipeline/request/BasePostprocessor;
    .locals 1

    invoke-static {p0}, Lcom/discord/image/fresco/postprocessors/PostProcessor$DefaultImpls;->create(Lcom/discord/image/fresco/postprocessors/PostProcessor;)Lcom/facebook/imagepipeline/request/BasePostprocessor;

    move-result-object v0

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/discord/image/fresco/postprocessors/PostProcessor$Gradient;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/discord/image/fresco/postprocessors/PostProcessor$Gradient;

    iget-object v1, p0, Lcom/discord/image/fresco/postprocessors/PostProcessor$Gradient;->direction:Lcom/discord/image/fresco/postprocessors/PostProcessor$Gradient$Direction;

    iget-object v3, p1, Lcom/discord/image/fresco/postprocessors/PostProcessor$Gradient;->direction:Lcom/discord/image/fresco/postprocessors/PostProcessor$Gradient$Direction;

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lcom/discord/image/fresco/postprocessors/PostProcessor$Gradient;->startColor:I

    iget v3, p1, Lcom/discord/image/fresco/postprocessors/PostProcessor$Gradient;->startColor:I

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget v1, p0, Lcom/discord/image/fresco/postprocessors/PostProcessor$Gradient;->endColor:I

    iget v3, p1, Lcom/discord/image/fresco/postprocessors/PostProcessor$Gradient;->endColor:I

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget v1, p0, Lcom/discord/image/fresco/postprocessors/PostProcessor$Gradient;->startPosition:F

    iget v3, p1, Lcom/discord/image/fresco/postprocessors/PostProcessor$Gradient;->startPosition:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_5

    return v2

    :cond_5
    iget v1, p0, Lcom/discord/image/fresco/postprocessors/PostProcessor$Gradient;->endPosition:F

    iget p1, p1, Lcom/discord/image/fresco/postprocessors/PostProcessor$Gradient;->endPosition:F

    invoke-static {v1, p1}, Ljava/lang/Float;->compare(FF)I

    move-result p1

    if-eqz p1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public final getDirection()Lcom/discord/image/fresco/postprocessors/PostProcessor$Gradient$Direction;
    .locals 1

    iget-object v0, p0, Lcom/discord/image/fresco/postprocessors/PostProcessor$Gradient;->direction:Lcom/discord/image/fresco/postprocessors/PostProcessor$Gradient$Direction;

    return-object v0
.end method

.method public final getEndColor()I
    .locals 1

    iget v0, p0, Lcom/discord/image/fresco/postprocessors/PostProcessor$Gradient;->endColor:I

    return v0
.end method

.method public final getEndPosition()F
    .locals 1

    iget v0, p0, Lcom/discord/image/fresco/postprocessors/PostProcessor$Gradient;->endPosition:F

    return v0
.end method

.method public final getStartColor()I
    .locals 1

    iget v0, p0, Lcom/discord/image/fresco/postprocessors/PostProcessor$Gradient;->startColor:I

    return v0
.end method

.method public final getStartPosition()F
    .locals 1

    iget v0, p0, Lcom/discord/image/fresco/postprocessors/PostProcessor$Gradient;->startPosition:F

    return v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lcom/discord/image/fresco/postprocessors/PostProcessor$Gradient;->direction:Lcom/discord/image/fresco/postprocessors/PostProcessor$Gradient$Direction;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/discord/image/fresco/postprocessors/PostProcessor$Gradient;->startColor:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/discord/image/fresco/postprocessors/PostProcessor$Gradient;->endColor:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/discord/image/fresco/postprocessors/PostProcessor$Gradient;->startPosition:F

    invoke-static {v1}, Ljava/lang/Float;->floatToIntBits(F)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/discord/image/fresco/postprocessors/PostProcessor$Gradient;->endPosition:F

    invoke-static {v1}, Ljava/lang/Float;->floatToIntBits(F)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 7

    iget-object v0, p0, Lcom/discord/image/fresco/postprocessors/PostProcessor$Gradient;->direction:Lcom/discord/image/fresco/postprocessors/PostProcessor$Gradient$Direction;

    iget v1, p0, Lcom/discord/image/fresco/postprocessors/PostProcessor$Gradient;->startColor:I

    iget v2, p0, Lcom/discord/image/fresco/postprocessors/PostProcessor$Gradient;->endColor:I

    iget v3, p0, Lcom/discord/image/fresco/postprocessors/PostProcessor$Gradient;->startPosition:F

    iget v4, p0, Lcom/discord/image/fresco/postprocessors/PostProcessor$Gradient;->endPosition:F

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "Gradient(direction="

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", startColor="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", endColor="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", startPosition="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v0, ", endPosition="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
