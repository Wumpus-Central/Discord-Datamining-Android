.class final La2/f$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = La2/f;->c(Ljava/util/concurrent/Callable;Ljava/util/concurrent/Executor;La2/c;)La2/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic k:La2/g;

.field final synthetic l:Ljava/util/concurrent/Callable;


# direct methods
.method constructor <init>(La2/c;La2/g;Ljava/util/concurrent/Callable;)V
    .locals 0

    iput-object p2, p0, La2/f$c;->k:La2/g;

    iput-object p3, p0, La2/f$c;->l:Ljava/util/concurrent/Callable;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 1
    :try_start_0
    iget-object v0, p0, La2/f$c;->k:La2/g;

    .line 2
    .line 3
    iget-object v1, p0, La2/f$c;->l:Ljava/util/concurrent/Callable;

    .line 4
    .line 5
    invoke-interface {v1}, Ljava/util/concurrent/Callable;->call()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {v0, v1}, La2/g;->d(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 10
    .line 11
    .line 12
    goto :goto_0

    .line 13
    :catch_0
    move-exception v0

    .line 14
    iget-object v1, p0, La2/f$c;->k:La2/g;

    .line 15
    .line 16
    invoke-virtual {v1, v0}, La2/g;->c(Ljava/lang/Exception;)V

    .line 17
    .line 18
    .line 19
    goto :goto_0

    .line 20
    :catch_1
    iget-object v0, p0, La2/f$c;->k:La2/g;

    .line 21
    .line 22
    invoke-virtual {v0}, La2/g;->b()V

    .line 23
    .line 24
    .line 25
    :goto_0
    return-void
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
