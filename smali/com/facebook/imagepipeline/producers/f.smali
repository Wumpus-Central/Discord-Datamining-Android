.class public Lcom/facebook/imagepipeline/producers/f;
.super Lcom/facebook/imagepipeline/producers/h;
.source "SourceFile"


# direct methods
.method public constructor <init>(Lo5/s;Lo5/f;Lcom/facebook/imagepipeline/producers/l0;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lo5/s<",
            "Lcom/facebook/cache/common/CacheKey;",
            "Lu5/c;",
            ">;",
            "Lo5/f;",
            "Lcom/facebook/imagepipeline/producers/l0<",
            "Lcom/facebook/common/references/CloseableReference<",
            "Lu5/c;",
            ">;>;)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2, p3}, Lcom/facebook/imagepipeline/producers/h;-><init>(Lo5/s;Lo5/f;Lcom/facebook/imagepipeline/producers/l0;)V

    return-void
.end method


# virtual methods
.method protected d()Ljava/lang/String;
    .locals 1

    const-string v0, "pipe_ui"

    return-object v0
.end method

.method protected e()Ljava/lang/String;
    .locals 1

    const-string v0, "BitmapMemoryCacheGetProducer"

    return-object v0
.end method

.method protected g(Lcom/facebook/imagepipeline/producers/Consumer;Lcom/facebook/cache/common/CacheKey;Z)Lcom/facebook/imagepipeline/producers/Consumer;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/imagepipeline/producers/Consumer<",
            "Lcom/facebook/common/references/CloseableReference<",
            "Lu5/c;",
            ">;>;",
            "Lcom/facebook/cache/common/CacheKey;",
            "Z)",
            "Lcom/facebook/imagepipeline/producers/Consumer<",
            "Lcom/facebook/common/references/CloseableReference<",
            "Lu5/c;",
            ">;>;"
        }
    .end annotation

    return-object p1
.end method
