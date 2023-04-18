.class public Ldk/h;
.super Lokio/Timeout;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0006\n\u0002\u0010\u0002\n\u0002\u0008\u0008\u0008\u0016\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u00a2\u0006\u0004\u0008\u0018\u0010\u0017J\u000e\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001J\u0018\u0010\u0008\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0008\u0010\t\u001a\u00020\u0004H\u0016J\u0008\u0010\u000b\u001a\u00020\nH\u0016J\u0008\u0010\u000c\u001a\u00020\u0004H\u0016J\u0010\u0010\u000e\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u0004H\u0016J\u0008\u0010\u000f\u001a\u00020\u0001H\u0016J\u0008\u0010\u0010\u001a\u00020\u0001H\u0016J\u0008\u0010\u0012\u001a\u00020\u0011H\u0016R\"\u0010\u0002\u001a\u00020\u00018\u0007@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0012\u0010\u0013\u001a\u0004\u0008\u0014\u0010\u0015\"\u0004\u0008\u0016\u0010\u0017\u00a8\u0006\u0019"
    }
    d2 = {
        "Ldk/h;",
        "Lokio/Timeout;",
        "delegate",
        "j",
        "",
        "timeout",
        "Ljava/util/concurrent/TimeUnit;",
        "unit",
        "g",
        "h",
        "",
        "e",
        "c",
        "deadlineNanoTime",
        "d",
        "b",
        "a",
        "",
        "f",
        "Lokio/Timeout;",
        "i",
        "()Lokio/Timeout;",
        "setDelegate",
        "(Lokio/Timeout;)V",
        "<init>",
        "okio"
    }
    k = 0x1
    mv = {
        0x1,
        0x4,
        0x0
    }
.end annotation


# instance fields
.field private f:Lokio/Timeout;


# direct methods
.method public constructor <init>(Lokio/Timeout;)V
    .locals 1

    .line 1
    const-string v0, "delegate"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Lokio/Timeout;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Ldk/h;->f:Lokio/Timeout;

    .line 10
    .line 11
    return-void
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
.end method


# virtual methods
.method public a()Lokio/Timeout;
    .locals 1

    iget-object v0, p0, Ldk/h;->f:Lokio/Timeout;

    invoke-virtual {v0}, Lokio/Timeout;->a()Lokio/Timeout;

    move-result-object v0

    return-object v0
.end method

.method public b()Lokio/Timeout;
    .locals 1

    iget-object v0, p0, Ldk/h;->f:Lokio/Timeout;

    invoke-virtual {v0}, Lokio/Timeout;->b()Lokio/Timeout;

    move-result-object v0

    return-object v0
.end method

.method public c()J
    .locals 2

    iget-object v0, p0, Ldk/h;->f:Lokio/Timeout;

    invoke-virtual {v0}, Lokio/Timeout;->c()J

    move-result-wide v0

    return-wide v0
.end method

.method public d(J)Lokio/Timeout;
    .locals 1

    iget-object v0, p0, Ldk/h;->f:Lokio/Timeout;

    invoke-virtual {v0, p1, p2}, Lokio/Timeout;->d(J)Lokio/Timeout;

    move-result-object p1

    return-object p1
.end method

.method public e()Z
    .locals 1

    iget-object v0, p0, Ldk/h;->f:Lokio/Timeout;

    invoke-virtual {v0}, Lokio/Timeout;->e()Z

    move-result v0

    return v0
.end method

.method public f()V
    .locals 1

    iget-object v0, p0, Ldk/h;->f:Lokio/Timeout;

    invoke-virtual {v0}, Lokio/Timeout;->f()V

    return-void
.end method

.method public g(JLjava/util/concurrent/TimeUnit;)Lokio/Timeout;
    .locals 1

    .line 1
    const-string v0, "unit"

    .line 2
    .line 3
    invoke-static {p3, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Ldk/h;->f:Lokio/Timeout;

    .line 7
    .line 8
    invoke-virtual {v0, p1, p2, p3}, Lokio/Timeout;->g(JLjava/util/concurrent/TimeUnit;)Lokio/Timeout;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    return-object p1
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

.method public h()J
    .locals 2

    iget-object v0, p0, Ldk/h;->f:Lokio/Timeout;

    invoke-virtual {v0}, Lokio/Timeout;->h()J

    move-result-wide v0

    return-wide v0
.end method

.method public final i()Lokio/Timeout;
    .locals 1

    iget-object v0, p0, Ldk/h;->f:Lokio/Timeout;

    return-object v0
.end method

.method public final j(Lokio/Timeout;)Ldk/h;
    .locals 1

    .line 1
    const-string v0, "delegate"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Ldk/h;->f:Lokio/Timeout;

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
.end method
