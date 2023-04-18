.class public Lcom/facebook/imagepipeline/datasource/d;
.super Lcom/facebook/imagepipeline/datasource/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lcom/facebook/imagepipeline/datasource/a<",
        "TT;>;"
    }
.end annotation


# direct methods
.method private constructor <init>(Lcom/facebook/imagepipeline/producers/l0;Lcom/facebook/imagepipeline/producers/r0;Lw5/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/imagepipeline/producers/l0<",
            "TT;>;",
            "Lcom/facebook/imagepipeline/producers/r0;",
            "Lw5/d;",
            ")V"
        }
    .end annotation

    invoke-direct {p0, p1, p2, p3}, Lcom/facebook/imagepipeline/datasource/a;-><init>(Lcom/facebook/imagepipeline/producers/l0;Lcom/facebook/imagepipeline/producers/r0;Lw5/d;)V

    return-void
.end method

.method public static H(Lcom/facebook/imagepipeline/producers/l0;Lcom/facebook/imagepipeline/producers/r0;Lw5/d;)Lcom/facebook/datasource/DataSource;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/facebook/imagepipeline/producers/l0<",
            "TT;>;",
            "Lcom/facebook/imagepipeline/producers/r0;",
            "Lw5/d;",
            ")",
            "Lcom/facebook/datasource/DataSource<",
            "TT;>;"
        }
    .end annotation

    new-instance v0, Lcom/facebook/imagepipeline/datasource/d;

    invoke-direct {v0, p0, p1, p2}, Lcom/facebook/imagepipeline/datasource/d;-><init>(Lcom/facebook/imagepipeline/producers/l0;Lcom/facebook/imagepipeline/producers/r0;Lw5/d;)V

    return-object v0
.end method
