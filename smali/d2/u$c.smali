.class Ld2/u$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ld2/u;->f(Ld2/d1;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic k:Ld2/d1;

.field final synthetic l:Ld2/u;


# direct methods
.method constructor <init>(Ld2/u;Ld2/d1;)V
    .locals 0

    iput-object p1, p0, Ld2/u$c;->l:Ld2/u;

    iput-object p2, p0, Ld2/u$c;->k:Ld2/d1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 1
    iget-object v0, p0, Ld2/u$c;->l:Ld2/u;

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
    iget-object v1, p0, Ld2/u$c;->l:Ld2/u;

    .line 17
    .line 18
    iget-object v2, p0, Ld2/u$c;->k:Ld2/d1;

    .line 19
    .line 20
    invoke-static {v1, v0, v2}, Ld2/u;->m(Ld2/u;Ld2/a0;Ld2/d1;)V

    .line 21
    .line 22
    .line 23
    return-void
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
.end method
