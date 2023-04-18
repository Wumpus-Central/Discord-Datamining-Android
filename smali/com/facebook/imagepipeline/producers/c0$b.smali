.class Lcom/facebook/imagepipeline/producers/c0$b;
.super Lcom/facebook/imagepipeline/producers/e;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/imagepipeline/producers/c0;->b(Lcom/facebook/imagepipeline/producers/Consumer;Lcom/facebook/imagepipeline/producers/ProducerContext;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/imagepipeline/producers/s0;

.field final synthetic b:Lcom/facebook/imagepipeline/producers/c0;


# direct methods
.method constructor <init>(Lcom/facebook/imagepipeline/producers/c0;Lcom/facebook/imagepipeline/producers/s0;)V
    .locals 0

    iput-object p1, p0, Lcom/facebook/imagepipeline/producers/c0$b;->b:Lcom/facebook/imagepipeline/producers/c0;

    iput-object p2, p0, Lcom/facebook/imagepipeline/producers/c0$b;->a:Lcom/facebook/imagepipeline/producers/s0;

    invoke-direct {p0}, Lcom/facebook/imagepipeline/producers/e;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    iget-object v0, p0, Lcom/facebook/imagepipeline/producers/c0$b;->a:Lcom/facebook/imagepipeline/producers/s0;

    invoke-virtual {v0}, Lt3/g;->a()V

    return-void
.end method
