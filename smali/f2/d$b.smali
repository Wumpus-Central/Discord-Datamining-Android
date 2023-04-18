.class Lf2/d$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lf2/d;->b(Ljava/lang/Runnable;J)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic k:J

.field final synthetic l:Ljava/lang/Runnable;

.field final synthetic m:Lf2/d;


# direct methods
.method constructor <init>(Lf2/d;JLjava/lang/Runnable;)V
    .locals 0

    iput-object p1, p0, Lf2/d$b;->m:Lf2/d;

    iput-wide p2, p0, Lf2/d$b;->k:J

    iput-object p4, p0, Lf2/d$b;->l:Ljava/lang/Runnable;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .line 1
    :try_start_0
    iget-wide v0, p0, Lf2/d$b;->k:J

    .line 2
    .line 3
    invoke-static {v0, v1}, Ljava/lang/Thread;->sleep(J)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 4
    .line 5
    .line 6
    goto :goto_0

    .line 7
    :catch_0
    move-exception v0

    .line 8
    invoke-static {}, Ld2/l;->j()Ld2/c0;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    const/4 v2, 0x1

    .line 13
    new-array v2, v2, [Ljava/lang/Object;

    .line 14
    .line 15
    const/4 v3, 0x0

    .line 16
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    aput-object v0, v2, v3

    .line 21
    .line 22
    const-string v0, "Sleep delay exception: %s"

    .line 23
    .line 24
    invoke-interface {v1, v0, v2}, Ld2/c0;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    :goto_0
    iget-object v0, p0, Lf2/d$b;->m:Lf2/d;

    .line 28
    .line 29
    iget-object v1, p0, Lf2/d$b;->l:Ljava/lang/Runnable;

    .line 30
    .line 31
    invoke-virtual {v0, v1}, Lf2/d;->submit(Ljava/lang/Runnable;)V

    .line 32
    .line 33
    .line 34
    return-void
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
.end method
