.class public Lcom/facebook/imagepipeline/platform/h;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Lx5/y;Z)Lcom/facebook/imagepipeline/platform/g;
    .locals 2

    .line 1
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v0, 0x1a

    .line 4
    .line 5
    if-lt p1, v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Lx5/y;->e()I

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    new-instance v0, Lcom/facebook/imagepipeline/platform/f;

    .line 12
    .line 13
    invoke-virtual {p0}, Lx5/y;->b()Lx5/h;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    new-instance v1, Landroidx/core/util/Pools$SynchronizedPool;

    .line 18
    .line 19
    invoke-direct {v1, p1}, Landroidx/core/util/Pools$SynchronizedPool;-><init>(I)V

    .line 20
    .line 21
    .line 22
    invoke-direct {v0, p0, p1, v1}, Lcom/facebook/imagepipeline/platform/f;-><init>(Lx5/h;ILandroidx/core/util/Pools$SynchronizedPool;)V

    .line 23
    .line 24
    .line 25
    return-object v0

    .line 26
    :cond_0
    invoke-virtual {p0}, Lx5/y;->e()I

    .line 27
    .line 28
    .line 29
    move-result p1

    .line 30
    new-instance v0, Lcom/facebook/imagepipeline/platform/a;

    .line 31
    .line 32
    invoke-virtual {p0}, Lx5/y;->b()Lx5/h;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    new-instance v1, Landroidx/core/util/Pools$SynchronizedPool;

    .line 37
    .line 38
    invoke-direct {v1, p1}, Landroidx/core/util/Pools$SynchronizedPool;-><init>(I)V

    .line 39
    .line 40
    .line 41
    invoke-direct {v0, p0, p1, v1}, Lcom/facebook/imagepipeline/platform/a;-><init>(Lx5/h;ILandroidx/core/util/Pools$SynchronizedPool;)V

    .line 42
    .line 43
    .line 44
    return-object v0
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
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
.end method
