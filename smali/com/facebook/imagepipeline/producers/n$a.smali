.class Lcom/facebook/imagepipeline/producers/n$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/imagepipeline/producers/n;->b(Lcom/facebook/imagepipeline/producers/Consumer;Lcom/facebook/imagepipeline/producers/ProducerContext;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic k:Lcom/facebook/imagepipeline/producers/Consumer;

.field final synthetic l:Lcom/facebook/imagepipeline/producers/ProducerContext;

.field final synthetic m:Lcom/facebook/imagepipeline/producers/n;


# direct methods
.method constructor <init>(Lcom/facebook/imagepipeline/producers/n;Lcom/facebook/imagepipeline/producers/Consumer;Lcom/facebook/imagepipeline/producers/ProducerContext;)V
    .locals 0

    iput-object p1, p0, Lcom/facebook/imagepipeline/producers/n$a;->m:Lcom/facebook/imagepipeline/producers/n;

    iput-object p2, p0, Lcom/facebook/imagepipeline/producers/n$a;->k:Lcom/facebook/imagepipeline/producers/Consumer;

    iput-object p3, p0, Lcom/facebook/imagepipeline/producers/n$a;->l:Lcom/facebook/imagepipeline/producers/ProducerContext;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    iget-object v0, p0, Lcom/facebook/imagepipeline/producers/n$a;->m:Lcom/facebook/imagepipeline/producers/n;

    invoke-static {v0}, Lcom/facebook/imagepipeline/producers/n;->c(Lcom/facebook/imagepipeline/producers/n;)Lcom/facebook/imagepipeline/producers/l0;

    move-result-object v0

    iget-object v1, p0, Lcom/facebook/imagepipeline/producers/n$a;->k:Lcom/facebook/imagepipeline/producers/Consumer;

    iget-object v2, p0, Lcom/facebook/imagepipeline/producers/n$a;->l:Lcom/facebook/imagepipeline/producers/ProducerContext;

    invoke-interface {v0, v1, v2}, Lcom/facebook/imagepipeline/producers/l0;->b(Lcom/facebook/imagepipeline/producers/Consumer;Lcom/facebook/imagepipeline/producers/ProducerContext;)V

    return-void
.end method
