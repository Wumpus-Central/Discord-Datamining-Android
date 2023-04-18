.class public final Lrj/d$c$a;
.super Ldk/g;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lrj/d$c;->k(I)Lokio/Source;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0004*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0008\u0010\u0003\u001a\u00020\u0002H\u0016R\u0016\u0010\u0007\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\u0008"
    }
    d2 = {
        "rj/d$c$a",
        "Ldk/g;",
        "",
        "close",
        "",
        "k",
        "Z",
        "closed",
        "okhttp"
    }
    k = 0x1
    mv = {
        0x1,
        0x4,
        0x0
    }
.end annotation


# instance fields
.field private k:Z

.field final synthetic l:Lrj/d$c;

.field final synthetic m:Lokio/Source;


# direct methods
.method constructor <init>(Lrj/d$c;Lokio/Source;Lokio/Source;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lokio/Source;",
            "Lokio/Source;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lrj/d$c$a;->l:Lrj/d$c;

    iput-object p2, p0, Lrj/d$c$a;->m:Lokio/Source;

    invoke-direct {p0, p3}, Ldk/g;-><init>(Lokio/Source;)V

    return-void
.end method


# virtual methods
.method public close()V
    .locals 3

    .line 1
    invoke-super {p0}, Ldk/g;->close()V

    .line 2
    .line 3
    .line 4
    iget-boolean v0, p0, Lrj/d$c$a;->k:Z

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    const/4 v0, 0x1

    .line 9
    iput-boolean v0, p0, Lrj/d$c$a;->k:Z

    .line 10
    .line 11
    iget-object v0, p0, Lrj/d$c$a;->l:Lrj/d$c;

    .line 12
    .line 13
    iget-object v0, v0, Lrj/d$c;->j:Lrj/d;

    .line 14
    .line 15
    monitor-enter v0

    .line 16
    :try_start_0
    iget-object v1, p0, Lrj/d$c$a;->l:Lrj/d$c;

    .line 17
    .line 18
    invoke-virtual {v1}, Lrj/d$c;->f()I

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    add-int/lit8 v2, v2, -0x1

    .line 23
    .line 24
    invoke-virtual {v1, v2}, Lrj/d$c;->n(I)V

    .line 25
    .line 26
    .line 27
    iget-object v1, p0, Lrj/d$c$a;->l:Lrj/d$c;

    .line 28
    .line 29
    invoke-virtual {v1}, Lrj/d$c;->f()I

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    if-nez v1, :cond_0

    .line 34
    .line 35
    iget-object v1, p0, Lrj/d$c$a;->l:Lrj/d$c;

    .line 36
    .line 37
    invoke-virtual {v1}, Lrj/d$c;->i()Z

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    if-eqz v1, :cond_0

    .line 42
    .line 43
    iget-object v1, p0, Lrj/d$c$a;->l:Lrj/d$c;

    .line 44
    .line 45
    iget-object v2, v1, Lrj/d$c;->j:Lrj/d;

    .line 46
    .line 47
    invoke-virtual {v2, v1}, Lrj/d;->I0(Lrj/d$c;)Z

    .line 48
    .line 49
    .line 50
    :cond_0
    sget-object v1, Lkotlin/Unit;->a:Lkotlin/Unit;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 51
    .line 52
    monitor-exit v0

    .line 53
    goto :goto_0

    .line 54
    :catchall_0
    move-exception v1

    .line 55
    monitor-exit v0

    .line 56
    throw v1

    .line 57
    :cond_1
    :goto_0
    return-void
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
