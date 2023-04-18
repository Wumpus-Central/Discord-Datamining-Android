.class public Lcom/mrousavy/camera/frameprocessor/ImageProxyUtils;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation

.annotation build Ld6/a;
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static getBytesPerRow(Landroidx/camera/core/ImageProxy;)I
    .locals 1
    .annotation build Landroidx/annotation/Keep;
    .end annotation

    .annotation build Ld6/a;
    .end annotation

    invoke-interface {p0}, Landroidx/camera/core/ImageProxy;->n()[Landroidx/camera/core/ImageProxy$a;

    move-result-object p0

    const/4 v0, 0x0

    aget-object p0, p0, v0

    invoke-interface {p0}, Landroidx/camera/core/ImageProxy$a;->d()I

    move-result p0

    return p0
.end method

.method public static getPlanesCount(Landroidx/camera/core/ImageProxy;)I
    .locals 0
    .annotation build Landroidx/annotation/Keep;
    .end annotation

    .annotation build Ld6/a;
    .end annotation

    invoke-interface {p0}, Landroidx/camera/core/ImageProxy;->n()[Landroidx/camera/core/ImageProxy$a;

    move-result-object p0

    array-length p0, p0

    return p0
.end method

.method public static isImageProxyValid(Landroidx/camera/core/ImageProxy;)Z
    .locals 2
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "UnsafeOptInUsageError"
        }
    .end annotation

    .annotation build Landroidx/annotation/Keep;
    .end annotation

    .annotation build Ld6/a;
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    invoke-interface {p0}, Landroidx/camera/core/ImageProxy;->p0()Landroid/media/Image;

    .line 3
    .line 4
    .line 5
    move-result-object v1

    .line 6
    if-nez v1, :cond_0

    .line 7
    .line 8
    return v0

    .line 9
    :cond_0
    invoke-interface {p0}, Landroidx/camera/core/ImageProxy;->p0()Landroid/media/Image;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    invoke-virtual {p0}, Landroid/media/Image;->getCropRect()Landroid/graphics/Rect;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 14
    .line 15
    .line 16
    const/4 p0, 0x1

    .line 17
    return p0

    .line 18
    :catch_0
    return v0
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
.end method
