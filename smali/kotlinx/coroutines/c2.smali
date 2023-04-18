.class public final Lkotlinx/coroutines/c2;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0011\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u001a\u0010\u0010\u0001\u001a\u0004\u0018\u00010\u0000*\u0004\u0018\u00010\u0000H\u0000\u001a\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0000*\u0004\u0018\u00010\u0000H\u0000\"\u001a\u0010\u0008\u001a\u00020\u00038\u0002X\u0083\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010\u0005\u0012\u0004\u0008\u0006\u0010\u0007\"\u001a\u0010\u000b\u001a\u00020\u00038\u0000X\u0081\u0004\u00a2\u0006\u000c\n\u0004\u0008\t\u0010\u0005\u0012\u0004\u0008\n\u0010\u0007\"\u001a\u0010\u000e\u001a\u00020\u00038\u0002X\u0083\u0004\u00a2\u0006\u000c\n\u0004\u0008\u000c\u0010\u0005\u0012\u0004\u0008\r\u0010\u0007\"\u001a\u0010\u0011\u001a\u00020\u00038\u0002X\u0083\u0004\u00a2\u0006\u000c\n\u0004\u0008\u000f\u0010\u0005\u0012\u0004\u0008\u0010\u0010\u0007\"\u001a\u0010\u0014\u001a\u00020\u00038\u0002X\u0083\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0012\u0010\u0005\u0012\u0004\u0008\u0013\u0010\u0007\"\u001a\u0010\u0019\u001a\u00020\u00158\u0002X\u0083\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0016\u0010\u0017\u0012\u0004\u0008\u0018\u0010\u0007\"\u001a\u0010\u001b\u001a\u00020\u00158\u0002X\u0083\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0001\u0010\u0017\u0012\u0004\u0008\u001a\u0010\u0007\u00a8\u0006\u001c"
    }
    d2 = {
        "",
        "g",
        "h",
        "Lkotlinx/coroutines/internal/d0;",
        "a",
        "Lkotlinx/coroutines/internal/d0;",
        "getCOMPLETING_ALREADY$annotations",
        "()V",
        "COMPLETING_ALREADY",
        "b",
        "getCOMPLETING_WAITING_CHILDREN$annotations",
        "COMPLETING_WAITING_CHILDREN",
        "c",
        "getCOMPLETING_RETRY$annotations",
        "COMPLETING_RETRY",
        "d",
        "getTOO_LATE_TO_CANCEL$annotations",
        "TOO_LATE_TO_CANCEL",
        "e",
        "getSEALED$annotations",
        "SEALED",
        "Lkotlinx/coroutines/d1;",
        "f",
        "Lkotlinx/coroutines/d1;",
        "getEMPTY_NEW$annotations",
        "EMPTY_NEW",
        "getEMPTY_ACTIVE$annotations",
        "EMPTY_ACTIVE",
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

.field public static final b:Lkotlinx/coroutines/internal/d0;

.field private static final c:Lkotlinx/coroutines/internal/d0;

.field private static final d:Lkotlinx/coroutines/internal/d0;

.field private static final e:Lkotlinx/coroutines/internal/d0;

.field private static final f:Lkotlinx/coroutines/d1;

.field private static final g:Lkotlinx/coroutines/d1;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lkotlinx/coroutines/internal/d0;

    .line 2
    .line 3
    const-string v1, "COMPLETING_ALREADY"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lkotlinx/coroutines/internal/d0;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lkotlinx/coroutines/c2;->a:Lkotlinx/coroutines/internal/d0;

    .line 9
    .line 10
    new-instance v0, Lkotlinx/coroutines/internal/d0;

    .line 11
    .line 12
    const-string v1, "COMPLETING_WAITING_CHILDREN"

    .line 13
    .line 14
    invoke-direct {v0, v1}, Lkotlinx/coroutines/internal/d0;-><init>(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    sput-object v0, Lkotlinx/coroutines/c2;->b:Lkotlinx/coroutines/internal/d0;

    .line 18
    .line 19
    new-instance v0, Lkotlinx/coroutines/internal/d0;

    .line 20
    .line 21
    const-string v1, "COMPLETING_RETRY"

    .line 22
    .line 23
    invoke-direct {v0, v1}, Lkotlinx/coroutines/internal/d0;-><init>(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    sput-object v0, Lkotlinx/coroutines/c2;->c:Lkotlinx/coroutines/internal/d0;

    .line 27
    .line 28
    new-instance v0, Lkotlinx/coroutines/internal/d0;

    .line 29
    .line 30
    const-string v1, "TOO_LATE_TO_CANCEL"

    .line 31
    .line 32
    invoke-direct {v0, v1}, Lkotlinx/coroutines/internal/d0;-><init>(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    sput-object v0, Lkotlinx/coroutines/c2;->d:Lkotlinx/coroutines/internal/d0;

    .line 36
    .line 37
    new-instance v0, Lkotlinx/coroutines/internal/d0;

    .line 38
    .line 39
    const-string v1, "SEALED"

    .line 40
    .line 41
    invoke-direct {v0, v1}, Lkotlinx/coroutines/internal/d0;-><init>(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    sput-object v0, Lkotlinx/coroutines/c2;->e:Lkotlinx/coroutines/internal/d0;

    .line 45
    .line 46
    new-instance v0, Lkotlinx/coroutines/d1;

    .line 47
    .line 48
    const/4 v1, 0x0

    .line 49
    invoke-direct {v0, v1}, Lkotlinx/coroutines/d1;-><init>(Z)V

    .line 50
    .line 51
    .line 52
    sput-object v0, Lkotlinx/coroutines/c2;->f:Lkotlinx/coroutines/d1;

    .line 53
    .line 54
    new-instance v0, Lkotlinx/coroutines/d1;

    .line 55
    .line 56
    const/4 v1, 0x1

    .line 57
    invoke-direct {v0, v1}, Lkotlinx/coroutines/d1;-><init>(Z)V

    .line 58
    .line 59
    .line 60
    sput-object v0, Lkotlinx/coroutines/c2;->g:Lkotlinx/coroutines/d1;

    .line 61
    .line 62
    return-void
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

.method public static final synthetic a()Lkotlinx/coroutines/internal/d0;
    .locals 1

    sget-object v0, Lkotlinx/coroutines/c2;->a:Lkotlinx/coroutines/internal/d0;

    return-object v0
.end method

.method public static final synthetic b()Lkotlinx/coroutines/internal/d0;
    .locals 1

    sget-object v0, Lkotlinx/coroutines/c2;->c:Lkotlinx/coroutines/internal/d0;

    return-object v0
.end method

.method public static final synthetic c()Lkotlinx/coroutines/d1;
    .locals 1

    sget-object v0, Lkotlinx/coroutines/c2;->g:Lkotlinx/coroutines/d1;

    return-object v0
.end method

.method public static final synthetic d()Lkotlinx/coroutines/d1;
    .locals 1

    sget-object v0, Lkotlinx/coroutines/c2;->f:Lkotlinx/coroutines/d1;

    return-object v0
.end method

.method public static final synthetic e()Lkotlinx/coroutines/internal/d0;
    .locals 1

    sget-object v0, Lkotlinx/coroutines/c2;->e:Lkotlinx/coroutines/internal/d0;

    return-object v0
.end method

.method public static final synthetic f()Lkotlinx/coroutines/internal/d0;
    .locals 1

    sget-object v0, Lkotlinx/coroutines/c2;->d:Lkotlinx/coroutines/internal/d0;

    return-object v0
.end method

.method public static final g(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    instance-of v0, p0, Lkotlinx/coroutines/p1;

    if-eqz v0, :cond_0

    new-instance v0, Lkotlinx/coroutines/q1;

    check-cast p0, Lkotlinx/coroutines/p1;

    invoke-direct {v0, p0}, Lkotlinx/coroutines/q1;-><init>(Lkotlinx/coroutines/p1;)V

    move-object p0, v0

    :cond_0
    return-object p0
.end method

.method public static final h(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    instance-of v0, p0, Lkotlinx/coroutines/q1;

    if-eqz v0, :cond_0

    move-object v0, p0

    check-cast v0, Lkotlinx/coroutines/q1;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_2

    iget-object v0, v0, Lkotlinx/coroutines/q1;->a:Lkotlinx/coroutines/p1;

    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    move-object p0, v0

    :cond_2
    :goto_1
    return-object p0
.end method
