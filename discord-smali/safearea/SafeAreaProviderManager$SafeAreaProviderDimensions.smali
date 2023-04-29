.class public final Lcom/discord/safearea/SafeAreaProviderManager$SafeAreaProviderDimensions;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/discord/safearea/SafeAreaProviderManager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "SafeAreaProviderDimensions"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\t\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\u0008\u0086\u0008\u0018\u00002\u00020\u0001B\u000f\u0008\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004B\u0015\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0008J\t\u0010\u000c\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\r\u001a\u00020\u0006H\u00c6\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006H\u00c6\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0012\u001a\u00020\u0006H\u00d6\u0001J\t\u0010\u0013\u001a\u00020\u0014H\u00d6\u0001R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\t\u0010\nR\u0011\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\n\u00a8\u0006\u0015"
    }
    d2 = {
        "Lcom/discord/safearea/SafeAreaProviderManager$SafeAreaProviderDimensions;",
        "",
        "safeAreaProvider",
        "Lcom/th3rdwave/safeareacontext/SafeAreaProvider;",
        "(Lcom/th3rdwave/safeareacontext/SafeAreaProvider;)V",
        "height",
        "",
        "width",
        "(II)V",
        "getHeight",
        "()I",
        "getWidth",
        "component1",
        "component2",
        "copy",
        "equals",
        "",
        "other",
        "hashCode",
        "toString",
        "",
        "safe_area_release"
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
.field private final height:I

.field private final width:I


# direct methods
.method public constructor <init>(II)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/discord/safearea/SafeAreaProviderManager$SafeAreaProviderDimensions;->height:I

    iput p2, p0, Lcom/discord/safearea/SafeAreaProviderManager$SafeAreaProviderDimensions;->width:I

    return-void
.end method

.method public constructor <init>(Lcom/th3rdwave/safeareacontext/SafeAreaProvider;)V
    .locals 1

    const-string v0, "safeAreaProvider"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-virtual {p1}, Landroid/view/View;->getRootView()Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    move-result v0

    invoke-virtual {p1}, Landroid/view/View;->getRootView()Landroid/view/View;

    move-result-object p1

    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result p1

    invoke-direct {p0, v0, p1}, Lcom/discord/safearea/SafeAreaProviderManager$SafeAreaProviderDimensions;-><init>(II)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/discord/safearea/SafeAreaProviderManager$SafeAreaProviderDimensions;IIILjava/lang/Object;)Lcom/discord/safearea/SafeAreaProviderManager$SafeAreaProviderDimensions;
    .locals 0

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    iget p1, p0, Lcom/discord/safearea/SafeAreaProviderManager$SafeAreaProviderDimensions;->height:I

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    iget p2, p0, Lcom/discord/safearea/SafeAreaProviderManager$SafeAreaProviderDimensions;->width:I

    :cond_1
    invoke-virtual {p0, p1, p2}, Lcom/discord/safearea/SafeAreaProviderManager$SafeAreaProviderDimensions;->copy(II)Lcom/discord/safearea/SafeAreaProviderManager$SafeAreaProviderDimensions;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()I
    .locals 1

    iget v0, p0, Lcom/discord/safearea/SafeAreaProviderManager$SafeAreaProviderDimensions;->height:I

    return v0
.end method

.method public final component2()I
    .locals 1

    iget v0, p0, Lcom/discord/safearea/SafeAreaProviderManager$SafeAreaProviderDimensions;->width:I

    return v0
.end method

.method public final copy(II)Lcom/discord/safearea/SafeAreaProviderManager$SafeAreaProviderDimensions;
    .locals 1

    new-instance v0, Lcom/discord/safearea/SafeAreaProviderManager$SafeAreaProviderDimensions;

    invoke-direct {v0, p1, p2}, Lcom/discord/safearea/SafeAreaProviderManager$SafeAreaProviderDimensions;-><init>(II)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/discord/safearea/SafeAreaProviderManager$SafeAreaProviderDimensions;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/discord/safearea/SafeAreaProviderManager$SafeAreaProviderDimensions;

    iget v1, p0, Lcom/discord/safearea/SafeAreaProviderManager$SafeAreaProviderDimensions;->height:I

    iget v3, p1, Lcom/discord/safearea/SafeAreaProviderManager$SafeAreaProviderDimensions;->height:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lcom/discord/safearea/SafeAreaProviderManager$SafeAreaProviderDimensions;->width:I

    iget p1, p1, Lcom/discord/safearea/SafeAreaProviderManager$SafeAreaProviderDimensions;->width:I

    if-eq v1, p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public final getHeight()I
    .locals 1

    iget v0, p0, Lcom/discord/safearea/SafeAreaProviderManager$SafeAreaProviderDimensions;->height:I

    return v0
.end method

.method public final getWidth()I
    .locals 1

    iget v0, p0, Lcom/discord/safearea/SafeAreaProviderManager$SafeAreaProviderDimensions;->width:I

    return v0
.end method

.method public hashCode()I
    .locals 2

    iget v0, p0, Lcom/discord/safearea/SafeAreaProviderManager$SafeAreaProviderDimensions;->height:I

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/discord/safearea/SafeAreaProviderManager$SafeAreaProviderDimensions;->width:I

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    iget v0, p0, Lcom/discord/safearea/SafeAreaProviderManager$SafeAreaProviderDimensions;->height:I

    iget v1, p0, Lcom/discord/safearea/SafeAreaProviderManager$SafeAreaProviderDimensions;->width:I

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "SafeAreaProviderDimensions(height="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", width="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
