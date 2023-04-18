.class Lw4/c$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lw4/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic k:Lw4/c;


# direct methods
.method constructor <init>(Lw4/c;)V
    .locals 0

    iput-object p1, p0, Lw4/c$a;->k:Lw4/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 1
    iget-object v0, p0, Lw4/c$a;->k:Lw4/c;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Lw4/c$a;->k:Lw4/c;

    .line 5
    .line 6
    const/4 v2, 0x0

    .line 7
    invoke-static {v1, v2}, Lw4/c;->f(Lw4/c;Z)Z

    .line 8
    .line 9
    .line 10
    iget-object v1, p0, Lw4/c$a;->k:Lw4/c;

    .line 11
    .line 12
    invoke-static {v1}, Lw4/c;->k(Lw4/c;)Z

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    iget-object v1, p0, Lw4/c$a;->k:Lw4/c;

    .line 19
    .line 20
    invoke-static {v1}, Lw4/c;->l(Lw4/c;)Lw4/c$b;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    if-eqz v1, :cond_1

    .line 25
    .line 26
    iget-object v1, p0, Lw4/c$a;->k:Lw4/c;

    .line 27
    .line 28
    invoke-static {v1}, Lw4/c;->l(Lw4/c;)Lw4/c$b;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    invoke-interface {v1}, Lw4/c$b;->f()V

    .line 33
    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_0
    iget-object v1, p0, Lw4/c$a;->k:Lw4/c;

    .line 37
    .line 38
    invoke-static {v1}, Lw4/c;->m(Lw4/c;)V

    .line 39
    .line 40
    .line 41
    :cond_1
    :goto_0
    monitor-exit v0

    .line 42
    return-void

    .line 43
    :catchall_0
    move-exception v1

    .line 44
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

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
