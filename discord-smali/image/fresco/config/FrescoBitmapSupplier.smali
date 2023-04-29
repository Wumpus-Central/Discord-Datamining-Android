.class public final Lcom/discord/image/fresco/config/FrescoBitmapSupplier;
.super Lp5/j;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/discord/image/fresco/config/FrescoBitmapSupplier$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0000\u0018\u0000 \u00082\u00020\u0001:\u0001\u0008B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0008\u0010\u0003\u001a\u00020\u0002H\u0016\u00a8\u0006\t"
    }
    d2 = {
        "Lcom/discord/image/fresco/config/FrescoBitmapSupplier;",
        "Lp5/j;",
        "Lcom/facebook/imagepipeline/cache/MemoryCacheParams;",
        "get",
        "Landroid/content/Context;",
        "context",
        "<init>",
        "(Landroid/content/Context;)V",
        "Companion",
        "fresco_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final Companion:Lcom/discord/image/fresco/config/FrescoBitmapSupplier$Companion;

.field private static final MAX_BITMAP_MEM_CACHE_SIZE_RATIO:I = 0x3


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/discord/image/fresco/config/FrescoBitmapSupplier$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/discord/image/fresco/config/FrescoBitmapSupplier$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/discord/image/fresco/config/FrescoBitmapSupplier;->Companion:Lcom/discord/image/fresco/config/FrescoBitmapSupplier$Companion;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "activity"

    .line 7
    .line 8
    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    const-string v0, "null cannot be cast to non-null type android.app.ActivityManager"

    .line 13
    .line 14
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    check-cast p1, Landroid/app/ActivityManager;

    .line 18
    .line 19
    invoke-direct {p0, p1}, Lp5/j;-><init>(Landroid/app/ActivityManager;)V

    .line 20
    .line 21
    .line 22
    return-void
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
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
.end method


# virtual methods
.method public get()Lcom/facebook/imagepipeline/cache/MemoryCacheParams;
    .locals 8

    .line 2
    invoke-super {p0}, Lp5/j;->get()Lcom/facebook/imagepipeline/cache/MemoryCacheParams;

    move-result-object v0

    .line 3
    new-instance v7, Lcom/facebook/imagepipeline/cache/MemoryCacheParams;

    .line 4
    iget v2, v0, Lcom/facebook/imagepipeline/cache/MemoryCacheParams;->a:I

    .line 5
    iget v3, v0, Lcom/facebook/imagepipeline/cache/MemoryCacheParams;->b:I

    .line 6
    iget v4, v0, Lcom/facebook/imagepipeline/cache/MemoryCacheParams;->c:I

    .line 7
    iget v5, v0, Lcom/facebook/imagepipeline/cache/MemoryCacheParams;->d:I

    .line 8
    div-int/lit8 v6, v2, 0x3

    move-object v1, v7

    .line 9
    invoke-direct/range {v1 .. v6}, Lcom/facebook/imagepipeline/cache/MemoryCacheParams;-><init>(IIIII)V

    return-object v7
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/discord/image/fresco/config/FrescoBitmapSupplier;->get()Lcom/facebook/imagepipeline/cache/MemoryCacheParams;

    move-result-object v0

    return-object v0
.end method
