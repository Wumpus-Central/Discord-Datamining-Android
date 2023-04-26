.class Lcom/facebook/imagepipeline/producers/c0$a;
.super Lcom/facebook/imagepipeline/producers/s0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/imagepipeline/producers/c0;->b(Lcom/facebook/imagepipeline/producers/Consumer;Lcom/facebook/imagepipeline/producers/ProducerContext;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/imagepipeline/producers/s0<",
        "Lu5/e;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic p:Lcom/facebook/imagepipeline/request/ImageRequest;

.field final synthetic q:Lcom/facebook/imagepipeline/producers/n0;

.field final synthetic r:Lcom/facebook/imagepipeline/producers/ProducerContext;

.field final synthetic s:Lcom/facebook/imagepipeline/producers/c0;


# direct methods
.method constructor <init>(Lcom/facebook/imagepipeline/producers/c0;Lcom/facebook/imagepipeline/producers/Consumer;Lcom/facebook/imagepipeline/producers/n0;Lcom/facebook/imagepipeline/producers/ProducerContext;Ljava/lang/String;Lcom/facebook/imagepipeline/request/ImageRequest;Lcom/facebook/imagepipeline/producers/n0;Lcom/facebook/imagepipeline/producers/ProducerContext;)V
    .locals 0

    iput-object p1, p0, Lcom/facebook/imagepipeline/producers/c0$a;->s:Lcom/facebook/imagepipeline/producers/c0;

    iput-object p6, p0, Lcom/facebook/imagepipeline/producers/c0$a;->p:Lcom/facebook/imagepipeline/request/ImageRequest;

    iput-object p7, p0, Lcom/facebook/imagepipeline/producers/c0$a;->q:Lcom/facebook/imagepipeline/producers/n0;

    iput-object p8, p0, Lcom/facebook/imagepipeline/producers/c0$a;->r:Lcom/facebook/imagepipeline/producers/ProducerContext;

    invoke-direct {p0, p2, p3, p4, p5}, Lcom/facebook/imagepipeline/producers/s0;-><init>(Lcom/facebook/imagepipeline/producers/Consumer;Lcom/facebook/imagepipeline/producers/n0;Lcom/facebook/imagepipeline/producers/ProducerContext;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method protected bridge synthetic b(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lu5/e;

    invoke-virtual {p0, p1}, Lcom/facebook/imagepipeline/producers/c0$a;->j(Lu5/e;)V

    return-void
.end method

.method protected bridge synthetic c()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/facebook/imagepipeline/producers/c0$a;->k()Lu5/e;

    move-result-object v0

    return-object v0
.end method

.method protected j(Lu5/e;)V
    .locals 0

    invoke-static {p1}, Lu5/e;->h(Lu5/e;)V

    return-void
.end method

.method protected k()Lu5/e;
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/facebook/imagepipeline/producers/c0$a;->s:Lcom/facebook/imagepipeline/producers/c0;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/facebook/imagepipeline/producers/c0$a;->p:Lcom/facebook/imagepipeline/request/ImageRequest;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Lcom/facebook/imagepipeline/producers/c0;->d(Lcom/facebook/imagepipeline/request/ImageRequest;)Lu5/e;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const-string v1, "local"

    .line 10
    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    iget-object v0, p0, Lcom/facebook/imagepipeline/producers/c0$a;->q:Lcom/facebook/imagepipeline/producers/n0;

    .line 14
    .line 15
    iget-object v2, p0, Lcom/facebook/imagepipeline/producers/c0$a;->r:Lcom/facebook/imagepipeline/producers/ProducerContext;

    .line 16
    .line 17
    iget-object v3, p0, Lcom/facebook/imagepipeline/producers/c0$a;->s:Lcom/facebook/imagepipeline/producers/c0;

    .line 18
    .line 19
    invoke-virtual {v3}, Lcom/facebook/imagepipeline/producers/c0;->f()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    const/4 v4, 0x0

    .line 24
    invoke-interface {v0, v2, v3, v4}, Lcom/facebook/imagepipeline/producers/n0;->b(Lcom/facebook/imagepipeline/producers/ProducerContext;Ljava/lang/String;Z)V

    .line 25
    .line 26
    .line 27
    iget-object v0, p0, Lcom/facebook/imagepipeline/producers/c0$a;->r:Lcom/facebook/imagepipeline/producers/ProducerContext;

    .line 28
    .line 29
    invoke-interface {v0, v1}, Lcom/facebook/imagepipeline/producers/ProducerContext;->g(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    const/4 v0, 0x0

    .line 33
    return-object v0

    .line 34
    :cond_0
    invoke-virtual {v0}, Lu5/e;->z0()V

    .line 35
    .line 36
    .line 37
    iget-object v2, p0, Lcom/facebook/imagepipeline/producers/c0$a;->q:Lcom/facebook/imagepipeline/producers/n0;

    .line 38
    .line 39
    iget-object v3, p0, Lcom/facebook/imagepipeline/producers/c0$a;->r:Lcom/facebook/imagepipeline/producers/ProducerContext;

    .line 40
    .line 41
    iget-object v4, p0, Lcom/facebook/imagepipeline/producers/c0$a;->s:Lcom/facebook/imagepipeline/producers/c0;

    .line 42
    .line 43
    invoke-virtual {v4}, Lcom/facebook/imagepipeline/producers/c0;->f()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v4

    .line 47
    const/4 v5, 0x1

    .line 48
    invoke-interface {v2, v3, v4, v5}, Lcom/facebook/imagepipeline/producers/n0;->b(Lcom/facebook/imagepipeline/producers/ProducerContext;Ljava/lang/String;Z)V

    .line 49
    .line 50
    .line 51
    iget-object v2, p0, Lcom/facebook/imagepipeline/producers/c0$a;->r:Lcom/facebook/imagepipeline/producers/ProducerContext;

    .line 52
    .line 53
    invoke-interface {v2, v1}, Lcom/facebook/imagepipeline/producers/ProducerContext;->g(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    return-object v0
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
