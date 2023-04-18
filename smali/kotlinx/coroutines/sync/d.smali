.class public final Lkotlinx/coroutines/sync/d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\r\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u001a\u0010\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0001\u001a\u00020\u0000\"\u001a\u0010\u0008\u001a\u00020\u00048\u0002X\u0083\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\u0005\u0012\u0004\u0008\u0006\u0010\u0007\"\u001a\u0010\u000b\u001a\u00020\u00048\u0002X\u0083\u0004\u00a2\u0006\u000c\n\u0004\u0008\t\u0010\u0005\u0012\u0004\u0008\n\u0010\u0007\"\u001a\u0010\u000e\u001a\u00020\u00048\u0002X\u0083\u0004\u00a2\u0006\u000c\n\u0004\u0008\u000c\u0010\u0005\u0012\u0004\u0008\r\u0010\u0007\"\u001a\u0010\u0011\u001a\u00020\u00048\u0002X\u0083\u0004\u00a2\u0006\u000c\n\u0004\u0008\u000f\u0010\u0005\u0012\u0004\u0008\u0010\u0010\u0007\"\u001a\u0010\u0016\u001a\u00020\u00128\u0002X\u0083\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0013\u0010\u0014\u0012\u0004\u0008\u0015\u0010\u0007\"\u001a\u0010\u0019\u001a\u00020\u00128\u0002X\u0083\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0017\u0010\u0014\u0012\u0004\u0008\u0018\u0010\u0007\u00a8\u0006\u001a"
    }
    d2 = {
        "",
        "locked",
        "Lkotlinx/coroutines/sync/b;",
        "a",
        "Lkotlinx/coroutines/internal/d0;",
        "Lkotlinx/coroutines/internal/d0;",
        "getLOCK_FAIL$annotations",
        "()V",
        "LOCK_FAIL",
        "b",
        "getUNLOCK_FAIL$annotations",
        "UNLOCK_FAIL",
        "c",
        "getLOCKED$annotations",
        "LOCKED",
        "d",
        "getUNLOCKED$annotations",
        "UNLOCKED",
        "Lkotlinx/coroutines/sync/a;",
        "e",
        "Lkotlinx/coroutines/sync/a;",
        "getEMPTY_LOCKED$annotations",
        "EMPTY_LOCKED",
        "f",
        "getEMPTY_UNLOCKED$annotations",
        "EMPTY_UNLOCKED",
        "kotlinx-coroutines-core"
    }
    k = 0x2
    mv = {
        0x1,
        0x6,
        0x0
    }
.end annotation


# static fields
.field private static final a:Lkotlinx/coroutines/internal/d0;

.field private static final b:Lkotlinx/coroutines/internal/d0;

.field private static final c:Lkotlinx/coroutines/internal/d0;

.field private static final d:Lkotlinx/coroutines/internal/d0;

.field private static final e:Lkotlinx/coroutines/sync/a;

.field private static final f:Lkotlinx/coroutines/sync/a;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lkotlinx/coroutines/internal/d0;

    .line 2
    .line 3
    const-string v1, "LOCK_FAIL"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lkotlinx/coroutines/internal/d0;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lkotlinx/coroutines/sync/d;->a:Lkotlinx/coroutines/internal/d0;

    .line 9
    .line 10
    new-instance v0, Lkotlinx/coroutines/internal/d0;

    .line 11
    .line 12
    const-string v1, "UNLOCK_FAIL"

    .line 13
    .line 14
    invoke-direct {v0, v1}, Lkotlinx/coroutines/internal/d0;-><init>(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    sput-object v0, Lkotlinx/coroutines/sync/d;->b:Lkotlinx/coroutines/internal/d0;

    .line 18
    .line 19
    new-instance v0, Lkotlinx/coroutines/internal/d0;

    .line 20
    .line 21
    const-string v1, "LOCKED"

    .line 22
    .line 23
    invoke-direct {v0, v1}, Lkotlinx/coroutines/internal/d0;-><init>(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    sput-object v0, Lkotlinx/coroutines/sync/d;->c:Lkotlinx/coroutines/internal/d0;

    .line 27
    .line 28
    new-instance v1, Lkotlinx/coroutines/internal/d0;

    .line 29
    .line 30
    const-string v2, "UNLOCKED"

    .line 31
    .line 32
    invoke-direct {v1, v2}, Lkotlinx/coroutines/internal/d0;-><init>(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    sput-object v1, Lkotlinx/coroutines/sync/d;->d:Lkotlinx/coroutines/internal/d0;

    .line 36
    .line 37
    new-instance v2, Lkotlinx/coroutines/sync/a;

    .line 38
    .line 39
    invoke-direct {v2, v0}, Lkotlinx/coroutines/sync/a;-><init>(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    sput-object v2, Lkotlinx/coroutines/sync/d;->e:Lkotlinx/coroutines/sync/a;

    .line 43
    .line 44
    new-instance v0, Lkotlinx/coroutines/sync/a;

    .line 45
    .line 46
    invoke-direct {v0, v1}, Lkotlinx/coroutines/sync/a;-><init>(Ljava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    sput-object v0, Lkotlinx/coroutines/sync/d;->f:Lkotlinx/coroutines/sync/a;

    .line 50
    .line 51
    return-void
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
.end method

.method public static final a(Z)Lkotlinx/coroutines/sync/b;
    .locals 1

    new-instance v0, Lkotlinx/coroutines/sync/c;

    invoke-direct {v0, p0}, Lkotlinx/coroutines/sync/c;-><init>(Z)V

    return-object v0
.end method

.method public static synthetic b(ZILjava/lang/Object;)Lkotlinx/coroutines/sync/b;
    .locals 0

    and-int/lit8 p1, p1, 0x1

    if-eqz p1, :cond_0

    const/4 p0, 0x0

    :cond_0
    invoke-static {p0}, Lkotlinx/coroutines/sync/d;->a(Z)Lkotlinx/coroutines/sync/b;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic c()Lkotlinx/coroutines/sync/a;
    .locals 1

    sget-object v0, Lkotlinx/coroutines/sync/d;->e:Lkotlinx/coroutines/sync/a;

    return-object v0
.end method

.method public static final synthetic d()Lkotlinx/coroutines/sync/a;
    .locals 1

    sget-object v0, Lkotlinx/coroutines/sync/d;->f:Lkotlinx/coroutines/sync/a;

    return-object v0
.end method

.method public static final synthetic e()Lkotlinx/coroutines/internal/d0;
    .locals 1

    sget-object v0, Lkotlinx/coroutines/sync/d;->c:Lkotlinx/coroutines/internal/d0;

    return-object v0
.end method

.method public static final synthetic f()Lkotlinx/coroutines/internal/d0;
    .locals 1

    sget-object v0, Lkotlinx/coroutines/sync/d;->d:Lkotlinx/coroutines/internal/d0;

    return-object v0
.end method

.method public static final synthetic g()Lkotlinx/coroutines/internal/d0;
    .locals 1

    sget-object v0, Lkotlinx/coroutines/sync/d;->b:Lkotlinx/coroutines/internal/d0;

    return-object v0
.end method
