.class public final Lkotlinx/coroutines/y0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000e\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u00c6\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0015\u0010\u0008R \u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0003\u0010\u0004\u0012\u0004\u0008\u0007\u0010\u0008\u001a\u0004\u0008\u0005\u0010\u0006R \u0010\r\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\n\u0010\u0004\u0012\u0004\u0008\u000c\u0010\u0008\u001a\u0004\u0008\u000b\u0010\u0006R \u0010\u0010\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u000e\u0010\u0004\u0012\u0004\u0008\u000f\u0010\u0008\u001a\u0004\u0008\u0003\u0010\u0006R\u001a\u0010\u0014\u001a\u00020\u00118FX\u0087\u0004\u00a2\u0006\u000c\u0012\u0004\u0008\u0013\u0010\u0008\u001a\u0004\u0008\n\u0010\u0012\u00a8\u0006\u0016"
    }
    d2 = {
        "Lkotlinx/coroutines/y0;",
        "",
        "Lkotlinx/coroutines/CoroutineDispatcher;",
        "b",
        "Lkotlinx/coroutines/CoroutineDispatcher;",
        "a",
        "()Lkotlinx/coroutines/CoroutineDispatcher;",
        "getDefault$annotations",
        "()V",
        "Default",
        "c",
        "getUnconfined",
        "getUnconfined$annotations",
        "Unconfined",
        "d",
        "getIO$annotations",
        "IO",
        "Lkotlinx/coroutines/f2;",
        "()Lkotlinx/coroutines/f2;",
        "getMain$annotations",
        "Main",
        "<init>",
        "kotlinx-coroutines-core"
    }
    k = 0x1
    mv = {
        0x1,
        0x6,
        0x0
    }
.end annotation


# static fields
.field public static final a:Lkotlinx/coroutines/y0;

.field private static final b:Lkotlinx/coroutines/CoroutineDispatcher;

.field private static final c:Lkotlinx/coroutines/CoroutineDispatcher;

.field private static final d:Lkotlinx/coroutines/CoroutineDispatcher;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lkotlinx/coroutines/y0;

    .line 2
    .line 3
    invoke-direct {v0}, Lkotlinx/coroutines/y0;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lkotlinx/coroutines/y0;->a:Lkotlinx/coroutines/y0;

    .line 7
    .line 8
    sget-object v0, Lkotlinx/coroutines/scheduling/c;->s:Lkotlinx/coroutines/scheduling/c;

    .line 9
    .line 10
    sput-object v0, Lkotlinx/coroutines/y0;->b:Lkotlinx/coroutines/CoroutineDispatcher;

    .line 11
    .line 12
    sget-object v0, Lkotlinx/coroutines/v2;->m:Lkotlinx/coroutines/v2;

    .line 13
    .line 14
    sput-object v0, Lkotlinx/coroutines/y0;->c:Lkotlinx/coroutines/CoroutineDispatcher;

    .line 15
    .line 16
    sget-object v0, Lkotlinx/coroutines/scheduling/b;->n:Lkotlinx/coroutines/scheduling/b;

    .line 17
    .line 18
    sput-object v0, Lkotlinx/coroutines/y0;->d:Lkotlinx/coroutines/CoroutineDispatcher;

    .line 19
    .line 20
    return-void
    .line 21
    .line 22
    .line 23
    .line 24
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final a()Lkotlinx/coroutines/CoroutineDispatcher;
    .locals 1

    sget-object v0, Lkotlinx/coroutines/y0;->b:Lkotlinx/coroutines/CoroutineDispatcher;

    return-object v0
.end method

.method public static final b()Lkotlinx/coroutines/CoroutineDispatcher;
    .locals 1

    sget-object v0, Lkotlinx/coroutines/y0;->d:Lkotlinx/coroutines/CoroutineDispatcher;

    return-object v0
.end method

.method public static final c()Lkotlinx/coroutines/f2;
    .locals 1

    sget-object v0, Lkotlinx/coroutines/internal/u;->c:Lkotlinx/coroutines/f2;

    return-object v0
.end method
