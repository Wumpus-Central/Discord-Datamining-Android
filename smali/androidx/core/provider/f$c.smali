.class Landroidx/core/provider/f$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/core/provider/f;->d(Landroid/content/Context;Landroidx/core/provider/e;ILjava/util/concurrent/Executor;Landroidx/core/provider/a;)Landroid/graphics/Typeface;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/concurrent/Callable<",
        "Landroidx/core/provider/f$e;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Landroid/content/Context;

.field final synthetic c:Landroidx/core/provider/e;

.field final synthetic d:I


# direct methods
.method constructor <init>(Ljava/lang/String;Landroid/content/Context;Landroidx/core/provider/e;I)V
    .locals 0

    iput-object p1, p0, Landroidx/core/provider/f$c;->a:Ljava/lang/String;

    iput-object p2, p0, Landroidx/core/provider/f$c;->b:Landroid/content/Context;

    iput-object p3, p0, Landroidx/core/provider/f$c;->c:Landroidx/core/provider/e;

    iput p4, p0, Landroidx/core/provider/f$c;->d:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Landroidx/core/provider/f$e;
    .locals 4

    .line 1
    :try_start_0
    iget-object v0, p0, Landroidx/core/provider/f$c;->a:Ljava/lang/String;

    .line 2
    .line 3
    iget-object v1, p0, Landroidx/core/provider/f$c;->b:Landroid/content/Context;

    .line 4
    .line 5
    iget-object v2, p0, Landroidx/core/provider/f$c;->c:Landroidx/core/provider/e;

    .line 6
    .line 7
    iget v3, p0, Landroidx/core/provider/f$c;->d:I

    .line 8
    .line 9
    invoke-static {v0, v1, v2, v3}, Landroidx/core/provider/f;->c(Ljava/lang/String;Landroid/content/Context;Landroidx/core/provider/e;I)Landroidx/core/provider/f$e;

    .line 10
    .line 11
    .line 12
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 13
    return-object v0

    .line 14
    :catchall_0
    new-instance v0, Landroidx/core/provider/f$e;

    .line 15
    .line 16
    const/4 v1, -0x3

    .line 17
    invoke-direct {v0, v1}, Landroidx/core/provider/f$e;-><init>(I)V

    .line 18
    .line 19
    .line 20
    return-object v0
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

.method public bridge synthetic call()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Landroidx/core/provider/f$c;->a()Landroidx/core/provider/f$e;

    move-result-object v0

    return-object v0
.end method
