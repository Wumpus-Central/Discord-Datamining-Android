.class final Landroidx/camera/core/k2;
.super Landroidx/camera/core/i0;
.source "SourceFile"


# instance fields
.field private final m:Landroidx/camera/core/k1;

.field private n:Landroid/graphics/Rect;

.field private final o:I

.field private final p:I


# direct methods
.method constructor <init>(Landroidx/camera/core/ImageProxy;Landroid/util/Size;Landroidx/camera/core/k1;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Landroidx/camera/core/i0;-><init>(Landroidx/camera/core/ImageProxy;)V

    if-nez p2, :cond_0

    .line 3
    invoke-super {p0}, Landroidx/camera/core/i0;->getWidth()I

    move-result p1

    iput p1, p0, Landroidx/camera/core/k2;->o:I

    .line 4
    invoke-super {p0}, Landroidx/camera/core/i0;->getHeight()I

    move-result p1

    iput p1, p0, Landroidx/camera/core/k2;->p:I

    goto :goto_0

    .line 5
    :cond_0
    invoke-virtual {p2}, Landroid/util/Size;->getWidth()I

    move-result p1

    iput p1, p0, Landroidx/camera/core/k2;->o:I

    .line 6
    invoke-virtual {p2}, Landroid/util/Size;->getHeight()I

    move-result p1

    iput p1, p0, Landroidx/camera/core/k2;->p:I

    .line 7
    :goto_0
    iput-object p3, p0, Landroidx/camera/core/k2;->m:Landroidx/camera/core/k1;

    return-void
.end method

.method constructor <init>(Landroidx/camera/core/ImageProxy;Landroidx/camera/core/k1;)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, p1, v0, p2}, Landroidx/camera/core/k2;-><init>(Landroidx/camera/core/ImageProxy;Landroid/util/Size;Landroidx/camera/core/k1;)V

    return-void
.end method


# virtual methods
.method public declared-synchronized c0(Landroid/graphics/Rect;)V
    .locals 3

    .line 1
    monitor-enter p0

    .line 2
    if-eqz p1, :cond_1

    .line 3
    .line 4
    :try_start_0
    new-instance v0, Landroid/graphics/Rect;

    .line 5
    .line 6
    invoke-direct {v0, p1}, Landroid/graphics/Rect;-><init>(Landroid/graphics/Rect;)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Landroidx/camera/core/k2;->getWidth()I

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    invoke-virtual {p0}, Landroidx/camera/core/k2;->getHeight()I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    const/4 v2, 0x0

    .line 18
    invoke-virtual {v0, v2, v2, p1, v1}, Landroid/graphics/Rect;->intersect(IIII)Z

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    if-nez p1, :cond_0

    .line 23
    .line 24
    invoke-virtual {v0}, Landroid/graphics/Rect;->setEmpty()V

    .line 25
    .line 26
    .line 27
    :cond_0
    move-object p1, v0

    .line 28
    :cond_1
    iput-object p1, p0, Landroidx/camera/core/k2;->n:Landroid/graphics/Rect;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 29
    .line 30
    monitor-exit p0

    .line 31
    return-void

    .line 32
    :catchall_0
    move-exception p1

    .line 33
    monitor-exit p0

    .line 34
    throw p1
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
.end method

.method public e0()Landroidx/camera/core/k1;
    .locals 1

    iget-object v0, p0, Landroidx/camera/core/k2;->m:Landroidx/camera/core/k1;

    return-object v0
.end method

.method public declared-synchronized getHeight()I
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget v0, p0, Landroidx/camera/core/k2;->p:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 3
    .line 4
    monitor-exit p0

    .line 5
    return v0

    .line 6
    :catchall_0
    move-exception v0

    .line 7
    monitor-exit p0

    .line 8
    throw v0
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
.end method

.method public declared-synchronized getWidth()I
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget v0, p0, Landroidx/camera/core/k2;->o:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 3
    .line 4
    monitor-exit p0

    .line 5
    return v0

    .line 6
    :catchall_0
    move-exception v0

    .line 7
    monitor-exit p0

    .line 8
    throw v0
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
.end method
