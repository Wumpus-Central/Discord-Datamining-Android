.class final Loj/c$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lrj/b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Loj/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "d"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0082\u0004\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0014\u001a\u00060\u0011R\u00020\u0012\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\u0008\u0010\u0003\u001a\u00020\u0002H\u0016J\u0008\u0010\u0005\u001a\u00020\u0004H\u0016R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010\u0006R\u0014\u0010\u0008\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010\u0006R\"\u0010\u0010\u001a\u00020\t8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\n\u0010\u000b\u001a\u0004\u0008\u000c\u0010\r\"\u0004\u0008\u000e\u0010\u000fR\u0018\u0010\u0014\u001a\u00060\u0011R\u00020\u00128\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000c\u0010\u0013\u00a8\u0006\u0017"
    }
    d2 = {
        "Loj/c$d;",
        "Lrj/b;",
        "",
        "a",
        "Lokio/Sink;",
        "b",
        "Lokio/Sink;",
        "cacheOut",
        "body",
        "",
        "c",
        "Z",
        "d",
        "()Z",
        "e",
        "(Z)V",
        "done",
        "Lrj/d$b;",
        "Lrj/d;",
        "Lrj/d$b;",
        "editor",
        "<init>",
        "(Loj/c;Lrj/d$b;)V",
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
.field private final a:Lokio/Sink;

.field private final b:Lokio/Sink;

.field private c:Z

.field private final d:Lrj/d$b;

.field final synthetic e:Loj/c;


# direct methods
.method public constructor <init>(Loj/c;Lrj/d$b;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lrj/d$b;",
            ")V"
        }
    .end annotation

    .line 1
    const-string v0, "editor"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Loj/c$d;->e:Loj/c;

    .line 7
    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 9
    .line 10
    .line 11
    iput-object p2, p0, Loj/c$d;->d:Lrj/d$b;

    .line 12
    .line 13
    const/4 p1, 0x1

    .line 14
    invoke-virtual {p2, p1}, Lrj/d$b;->f(I)Lokio/Sink;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    iput-object p1, p0, Loj/c$d;->a:Lokio/Sink;

    .line 19
    .line 20
    new-instance p2, Loj/c$d$a;

    .line 21
    .line 22
    invoke-direct {p2, p0, p1}, Loj/c$d$a;-><init>(Loj/c$d;Lokio/Sink;)V

    .line 23
    .line 24
    .line 25
    iput-object p2, p0, Loj/c$d;->b:Lokio/Sink;

    .line 26
    .line 27
    return-void
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
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
.end method

.method public static final synthetic c(Loj/c$d;)Lrj/d$b;
    .locals 0

    iget-object p0, p0, Loj/c$d;->d:Lrj/d$b;

    return-object p0
.end method


# virtual methods
.method public a()V
    .locals 4

    .line 1
    iget-object v0, p0, Loj/c$d;->e:Loj/c;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-boolean v1, p0, Loj/c$d;->c:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 5
    .line 6
    if-eqz v1, :cond_0

    .line 7
    .line 8
    monitor-exit v0

    .line 9
    return-void

    .line 10
    :cond_0
    const/4 v1, 0x1

    .line 11
    :try_start_1
    iput-boolean v1, p0, Loj/c$d;->c:Z

    .line 12
    .line 13
    iget-object v2, p0, Loj/c$d;->e:Loj/c;

    .line 14
    .line 15
    invoke-virtual {v2}, Loj/c;->i()I

    .line 16
    .line 17
    .line 18
    move-result v3

    .line 19
    add-int/2addr v3, v1

    .line 20
    invoke-virtual {v2, v3}, Loj/c;->s(I)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 21
    .line 22
    .line 23
    monitor-exit v0

    .line 24
    iget-object v0, p0, Loj/c$d;->a:Lokio/Sink;

    .line 25
    .line 26
    invoke-static {v0}, Lpj/c;->j(Ljava/io/Closeable;)V

    .line 27
    .line 28
    .line 29
    :try_start_2
    iget-object v0, p0, Loj/c$d;->d:Lrj/d$b;

    .line 30
    .line 31
    invoke-virtual {v0}, Lrj/d$b;->a()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    .line 32
    .line 33
    .line 34
    :catch_0
    return-void

    .line 35
    :catchall_0
    move-exception v1

    .line 36
    monitor-exit v0

    .line 37
    throw v1
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
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

.method public b()Lokio/Sink;
    .locals 1

    iget-object v0, p0, Loj/c$d;->b:Lokio/Sink;

    return-object v0
.end method

.method public final d()Z
    .locals 1

    iget-boolean v0, p0, Loj/c$d;->c:Z

    return v0
.end method

.method public final e(Z)V
    .locals 0

    iput-boolean p1, p0, Loj/c$d;->c:Z

    return-void
.end method
