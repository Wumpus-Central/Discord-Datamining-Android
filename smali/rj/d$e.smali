.class public final Lrj/d$e;
.super Lsj/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lrj/d;-><init>(Lxj/a;Ljava/io/File;IIJLsj/e;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0008\u0002*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0008\u0010\u0003\u001a\u00020\u0002H\u0016\u00a8\u0006\u0004"
    }
    d2 = {
        "rj/d$e",
        "Lsj/a;",
        "",
        "f",
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
.field final synthetic e:Lrj/d;


# direct methods
.method constructor <init>(Lrj/d;Ljava/lang/String;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lrj/d$e;->e:Lrj/d;

    const/4 p1, 0x2

    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-direct {p0, p2, v1, p1, v0}, Lsj/a;-><init>(Ljava/lang/String;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method


# virtual methods
.method public f()J
    .locals 6

    .line 1
    iget-object v0, p0, Lrj/d$e;->e:Lrj/d;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Lrj/d$e;->e:Lrj/d;

    .line 5
    .line 6
    invoke-static {v1}, Lrj/d;->f(Lrj/d;)Z

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    const-wide/16 v2, -0x1

    .line 11
    .line 12
    if-eqz v1, :cond_2

    .line 13
    .line 14
    iget-object v1, p0, Lrj/d$e;->e:Lrj/d;

    .line 15
    .line 16
    invoke-virtual {v1}, Lrj/d;->T()Z

    .line 17
    .line 18
    .line 19
    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 20
    if-eqz v1, :cond_0

    .line 21
    .line 22
    goto :goto_2

    .line 23
    :cond_0
    const/4 v1, 0x1

    .line 24
    :try_start_1
    iget-object v4, p0, Lrj/d$e;->e:Lrj/d;

    .line 25
    .line 26
    invoke-virtual {v4}, Lrj/d;->K0()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 27
    .line 28
    .line 29
    goto :goto_0

    .line 30
    :catch_0
    :try_start_2
    iget-object v4, p0, Lrj/d$e;->e:Lrj/d;

    .line 31
    .line 32
    invoke-static {v4, v1}, Lrj/d;->s(Lrj/d;Z)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 33
    .line 34
    .line 35
    :goto_0
    :try_start_3
    iget-object v4, p0, Lrj/d$e;->e:Lrj/d;

    .line 36
    .line 37
    invoke-static {v4}, Lrj/d;->i(Lrj/d;)Z

    .line 38
    .line 39
    .line 40
    move-result v4

    .line 41
    if-eqz v4, :cond_1

    .line 42
    .line 43
    iget-object v4, p0, Lrj/d$e;->e:Lrj/d;

    .line 44
    .line 45
    invoke-virtual {v4}, Lrj/d;->G0()V

    .line 46
    .line 47
    .line 48
    iget-object v4, p0, Lrj/d$e;->e:Lrj/d;

    .line 49
    .line 50
    const/4 v5, 0x0

    .line 51
    invoke-static {v4, v5}, Lrj/d;->v(Lrj/d;I)V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_1
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 52
    .line 53
    .line 54
    goto :goto_1

    .line 55
    :catch_1
    :try_start_4
    iget-object v4, p0, Lrj/d$e;->e:Lrj/d;

    .line 56
    .line 57
    invoke-static {v4, v1}, Lrj/d;->p(Lrj/d;Z)V

    .line 58
    .line 59
    .line 60
    iget-object v1, p0, Lrj/d$e;->e:Lrj/d;

    .line 61
    .line 62
    invoke-static {}, Ldk/m;->b()Lokio/Sink;

    .line 63
    .line 64
    .line 65
    move-result-object v4

    .line 66
    invoke-static {v4}, Ldk/m;->c(Lokio/Sink;)Lokio/BufferedSink;

    .line 67
    .line 68
    .line 69
    move-result-object v4

    .line 70
    invoke-static {v1, v4}, Lrj/d;->l(Lrj/d;Lokio/BufferedSink;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 71
    .line 72
    .line 73
    :cond_1
    :goto_1
    monitor-exit v0

    .line 74
    return-wide v2

    .line 75
    :cond_2
    :goto_2
    monitor-exit v0

    .line 76
    return-wide v2

    .line 77
    :catchall_0
    move-exception v1

    .line 78
    monitor-exit v0

    .line 79
    throw v1
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
