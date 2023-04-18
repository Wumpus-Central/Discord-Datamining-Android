.class public final Li0/o0$h;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Li0/o0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "h"
.end annotation


# instance fields
.field private final a:Li0/q$a;

.field private b:Ljava/util/concurrent/Executor;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-object v0, p0, Li0/o0$h;->b:Ljava/util/concurrent/Executor;

    .line 6
    .line 7
    invoke-static {}, Li0/q;->a()Li0/q$a;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iput-object v0, p0, Li0/o0$h;->a:Li0/q$a;

    .line 12
    .line 13
    return-void
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

.method public static synthetic a(Li0/w;Li0/j1$a;)V
    .locals 0

    invoke-static {p0, p1}, Li0/o0$h;->c(Li0/w;Li0/j1$a;)V

    return-void
.end method

.method private static synthetic c(Li0/w;Li0/j1$a;)V
    .locals 0

    invoke-virtual {p1, p0}, Li0/j1$a;->e(Li0/w;)Li0/j1$a;

    return-void
.end method


# virtual methods
.method public b()Li0/o0;
    .locals 3

    new-instance v0, Li0/o0;

    iget-object v1, p0, Li0/o0$h;->b:Ljava/util/concurrent/Executor;

    iget-object v2, p0, Li0/o0$h;->a:Li0/q$a;

    invoke-virtual {v2}, Li0/q$a;->a()Li0/q;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Li0/o0;-><init>(Ljava/util/concurrent/Executor;Li0/q;)V

    return-object v0
.end method

.method public d(Ljava/util/concurrent/Executor;)Li0/o0$h;
    .locals 1

    .line 1
    const-string v0, "The specified executor can\'t be null."

    .line 2
    .line 3
    invoke-static {p1, v0}, Landroidx/core/util/g;->h(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Li0/o0$h;->b:Ljava/util/concurrent/Executor;

    .line 7
    .line 8
    return-object p0
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

.method public e(Li0/w;)Li0/o0$h;
    .locals 2

    .line 1
    const-string v0, "The specified quality selector can\'t be null."

    .line 2
    .line 3
    invoke-static {p1, v0}, Landroidx/core/util/g;->h(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Li0/o0$h;->a:Li0/q$a;

    .line 7
    .line 8
    new-instance v1, Li0/p0;

    .line 9
    .line 10
    invoke-direct {v1, p1}, Li0/p0;-><init>(Li0/w;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0, v1}, Li0/q$a;->b(Landroidx/core/util/b;)Li0/q$a;

    .line 14
    .line 15
    .line 16
    return-object p0
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
