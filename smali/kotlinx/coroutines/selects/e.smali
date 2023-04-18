.class public final Lkotlinx/coroutines/selects/e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0010\u0000\n\u0002\u0008\u0010\n\u0002\u0018\u0002\n\u0002\u0008\u0004\" \u0010\u0007\u001a\u00020\u00008\u0000X\u0081\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0001\u0010\u0002\u0012\u0004\u0008\u0005\u0010\u0006\u001a\u0004\u0008\u0003\u0010\u0004\" \u0010\u000b\u001a\u00020\u00008\u0000X\u0081\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0008\u0010\u0002\u0012\u0004\u0008\n\u0010\u0006\u001a\u0004\u0008\t\u0010\u0004\"\u001a\u0010\u000e\u001a\u00020\u00008\u0002X\u0083\u0004\u00a2\u0006\u000c\n\u0004\u0008\u000c\u0010\u0002\u0012\u0004\u0008\r\u0010\u0006\"\u001a\u0010\u0010\u001a\u00020\u00008\u0002X\u0083\u0004\u00a2\u0006\u000c\n\u0004\u0008\t\u0010\u0002\u0012\u0004\u0008\u000f\u0010\u0006\"\u001a\u0010\u0014\u001a\u00020\u00118\u0002X\u0083\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\u0012\u0012\u0004\u0008\u0013\u0010\u0006\u00a8\u0006\u0015"
    }
    d2 = {
        "",
        "a",
        "Ljava/lang/Object;",
        "e",
        "()Ljava/lang/Object;",
        "getNOT_SELECTED$annotations",
        "()V",
        "NOT_SELECTED",
        "b",
        "d",
        "getALREADY_SELECTED$annotations",
        "ALREADY_SELECTED",
        "c",
        "getUNDECIDED$annotations",
        "UNDECIDED",
        "getRESUMED$annotations",
        "RESUMED",
        "Lkotlinx/coroutines/selects/f;",
        "Lkotlinx/coroutines/selects/f;",
        "getSelectOpSequenceNumber$annotations",
        "selectOpSequenceNumber",
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
.field private static final a:Ljava/lang/Object;

.field private static final b:Ljava/lang/Object;

.field private static final c:Ljava/lang/Object;

.field private static final d:Ljava/lang/Object;

.field private static final e:Lkotlinx/coroutines/selects/f;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lkotlinx/coroutines/internal/d0;

    .line 2
    .line 3
    const-string v1, "NOT_SELECTED"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lkotlinx/coroutines/internal/d0;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lkotlinx/coroutines/selects/e;->a:Ljava/lang/Object;

    .line 9
    .line 10
    new-instance v0, Lkotlinx/coroutines/internal/d0;

    .line 11
    .line 12
    const-string v1, "ALREADY_SELECTED"

    .line 13
    .line 14
    invoke-direct {v0, v1}, Lkotlinx/coroutines/internal/d0;-><init>(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    sput-object v0, Lkotlinx/coroutines/selects/e;->b:Ljava/lang/Object;

    .line 18
    .line 19
    new-instance v0, Lkotlinx/coroutines/internal/d0;

    .line 20
    .line 21
    const-string v1, "UNDECIDED"

    .line 22
    .line 23
    invoke-direct {v0, v1}, Lkotlinx/coroutines/internal/d0;-><init>(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    sput-object v0, Lkotlinx/coroutines/selects/e;->c:Ljava/lang/Object;

    .line 27
    .line 28
    new-instance v0, Lkotlinx/coroutines/internal/d0;

    .line 29
    .line 30
    const-string v1, "RESUMED"

    .line 31
    .line 32
    invoke-direct {v0, v1}, Lkotlinx/coroutines/internal/d0;-><init>(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    sput-object v0, Lkotlinx/coroutines/selects/e;->d:Ljava/lang/Object;

    .line 36
    .line 37
    new-instance v0, Lkotlinx/coroutines/selects/f;

    .line 38
    .line 39
    invoke-direct {v0}, Lkotlinx/coroutines/selects/f;-><init>()V

    .line 40
    .line 41
    .line 42
    sput-object v0, Lkotlinx/coroutines/selects/e;->e:Lkotlinx/coroutines/selects/f;

    .line 43
    .line 44
    return-void
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
.end method

.method public static final synthetic a()Ljava/lang/Object;
    .locals 1

    sget-object v0, Lkotlinx/coroutines/selects/e;->d:Ljava/lang/Object;

    return-object v0
.end method

.method public static final synthetic b()Lkotlinx/coroutines/selects/f;
    .locals 1

    sget-object v0, Lkotlinx/coroutines/selects/e;->e:Lkotlinx/coroutines/selects/f;

    return-object v0
.end method

.method public static final synthetic c()Ljava/lang/Object;
    .locals 1

    sget-object v0, Lkotlinx/coroutines/selects/e;->c:Ljava/lang/Object;

    return-object v0
.end method

.method public static final d()Ljava/lang/Object;
    .locals 1

    sget-object v0, Lkotlinx/coroutines/selects/e;->b:Ljava/lang/Object;

    return-object v0
.end method

.method public static final e()Ljava/lang/Object;
    .locals 1

    sget-object v0, Lkotlinx/coroutines/selects/e;->a:Ljava/lang/Object;

    return-object v0
.end method
