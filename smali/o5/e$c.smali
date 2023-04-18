.class Lo5/e$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo5/e;->r(Lcom/facebook/cache/common/CacheKey;)La2/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/concurrent/Callable<",
        "Ljava/lang/Void;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/Object;

.field final synthetic b:Lcom/facebook/cache/common/CacheKey;

.field final synthetic c:Lo5/e;


# direct methods
.method constructor <init>(Lo5/e;Ljava/lang/Object;Lcom/facebook/cache/common/CacheKey;)V
    .locals 0

    iput-object p1, p0, Lo5/e$c;->c:Lo5/e;

    iput-object p2, p0, Lo5/e$c;->a:Ljava/lang/Object;

    iput-object p3, p0, Lo5/e$c;->b:Lcom/facebook/cache/common/CacheKey;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/Void;
    .locals 4

    .line 1
    iget-object v0, p0, Lo5/e$c;->a:Ljava/lang/Object;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-static {v0, v1}, Lv5/a;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    :try_start_0
    iget-object v2, p0, Lo5/e$c;->c:Lo5/e;

    .line 9
    .line 10
    invoke-static {v2}, Lo5/e;->b(Lo5/e;)Lo5/w;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    iget-object v3, p0, Lo5/e$c;->b:Lcom/facebook/cache/common/CacheKey;

    .line 15
    .line 16
    invoke-virtual {v2, v3}, Lo5/w;->g(Lcom/facebook/cache/common/CacheKey;)Z

    .line 17
    .line 18
    .line 19
    iget-object v2, p0, Lo5/e$c;->c:Lo5/e;

    .line 20
    .line 21
    invoke-static {v2}, Lo5/e;->a(Lo5/e;)Lq3/h;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    iget-object v3, p0, Lo5/e$c;->b:Lcom/facebook/cache/common/CacheKey;

    .line 26
    .line 27
    invoke-interface {v2, v3}, Lq3/h;->f(Lcom/facebook/cache/common/CacheKey;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 28
    .line 29
    .line 30
    invoke-static {v0}, Lv5/a;->f(Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    return-object v1

    .line 34
    :catchall_0
    move-exception v1

    .line 35
    :try_start_1
    iget-object v2, p0, Lo5/e$c;->a:Ljava/lang/Object;

    .line 36
    .line 37
    invoke-static {v2, v1}, Lv5/a;->c(Ljava/lang/Object;Ljava/lang/Throwable;)V

    .line 38
    .line 39
    .line 40
    throw v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 41
    :catchall_1
    move-exception v1

    .line 42
    invoke-static {v0}, Lv5/a;->f(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    throw v1
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
.end method

.method public bridge synthetic call()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lo5/e$c;->a()Ljava/lang/Void;

    move-result-object v0

    return-object v0
.end method
