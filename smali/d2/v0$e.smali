.class Ld2/v0$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ld2/v0;->h(Ld2/z0;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic k:Ld2/v0;


# direct methods
.method constructor <init>(Ld2/v0;)V
    .locals 0

    iput-object p1, p0, Ld2/v0$e;->k:Ld2/v0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .line 1
    iget-object v0, p0, Ld2/v0$e;->k:Ld2/v0;

    .line 2
    .line 3
    invoke-static {v0}, Ld2/v0;->m(Ld2/v0;)Ld2/c0;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const/4 v1, 0x0

    .line 8
    new-array v2, v1, [Ljava/lang/Object;

    .line 9
    .line 10
    const-string v3, "Package handler can send"

    .line 11
    .line 12
    invoke-interface {v0, v3, v2}, Ld2/c0;->g(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    iget-object v0, p0, Ld2/v0$e;->k:Ld2/v0;

    .line 16
    .line 17
    invoke-static {v0}, Ld2/v0;->n(Ld2/v0;)Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 22
    .line 23
    .line 24
    iget-object v0, p0, Ld2/v0$e;->k:Ld2/v0;

    .line 25
    .line 26
    invoke-virtual {v0}, Ld2/v0;->d()V

    .line 27
    .line 28
    .line 29
    return-void
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
