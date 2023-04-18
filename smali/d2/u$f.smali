.class Ld2/u$f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ld2/u;->h(Ld2/z0;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic k:Ld2/z0;

.field final synthetic l:Ld2/u;


# direct methods
.method constructor <init>(Ld2/u;Ld2/z0;)V
    .locals 0

    iput-object p1, p0, Ld2/u$f;->l:Ld2/u;

    iput-object p2, p0, Ld2/u$f;->k:Ld2/z0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .line 1
    iget-object v0, p0, Ld2/u$f;->l:Ld2/u;

    .line 2
    .line 3
    invoke-static {v0}, Ld2/u;->l(Ld2/u;)Ljava/lang/ref/WeakReference;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, Ld2/a0;

    .line 12
    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    return-void

    .line 16
    :cond_0
    iget-object v1, p0, Ld2/u$f;->k:Ld2/z0;

    .line 17
    .line 18
    iget-object v2, v1, Ld2/z0;->h:Ld2/f1;

    .line 19
    .line 20
    sget-object v3, Ld2/f1;->l:Ld2/f1;

    .line 21
    .line 22
    if-ne v2, v3, :cond_1

    .line 23
    .line 24
    invoke-interface {v0}, Ld2/a0;->G()V

    .line 25
    .line 26
    .line 27
    return-void

    .line 28
    :cond_1
    instance-of v2, v1, Ld2/v;

    .line 29
    .line 30
    if-nez v2, :cond_2

    .line 31
    .line 32
    return-void

    .line 33
    :cond_2
    iget-object v2, p0, Ld2/u$f;->l:Ld2/u;

    .line 34
    .line 35
    check-cast v1, Ld2/v;

    .line 36
    .line 37
    invoke-static {v2, v0, v1}, Ld2/u;->o(Ld2/u;Ld2/a0;Ld2/v;)V

    .line 38
    .line 39
    .line 40
    return-void
.end method
