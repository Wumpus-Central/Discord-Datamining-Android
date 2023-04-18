.class Lcom/facebook/imagepipeline/producers/v$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/imagepipeline/producers/v;->d(Lcom/facebook/imagepipeline/producers/v$c;Lcom/facebook/imagepipeline/producers/NetworkFetcher$Callback;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic k:Lcom/facebook/imagepipeline/producers/v$c;

.field final synthetic l:Lcom/facebook/imagepipeline/producers/NetworkFetcher$Callback;

.field final synthetic m:Lcom/facebook/imagepipeline/producers/v;


# direct methods
.method constructor <init>(Lcom/facebook/imagepipeline/producers/v;Lcom/facebook/imagepipeline/producers/v$c;Lcom/facebook/imagepipeline/producers/NetworkFetcher$Callback;)V
    .locals 0

    iput-object p1, p0, Lcom/facebook/imagepipeline/producers/v$a;->m:Lcom/facebook/imagepipeline/producers/v;

    iput-object p2, p0, Lcom/facebook/imagepipeline/producers/v$a;->k:Lcom/facebook/imagepipeline/producers/v$c;

    iput-object p3, p0, Lcom/facebook/imagepipeline/producers/v$a;->l:Lcom/facebook/imagepipeline/producers/NetworkFetcher$Callback;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    iget-object v0, p0, Lcom/facebook/imagepipeline/producers/v$a;->m:Lcom/facebook/imagepipeline/producers/v;

    iget-object v1, p0, Lcom/facebook/imagepipeline/producers/v$a;->k:Lcom/facebook/imagepipeline/producers/v$c;

    iget-object v2, p0, Lcom/facebook/imagepipeline/producers/v$a;->l:Lcom/facebook/imagepipeline/producers/NetworkFetcher$Callback;

    invoke-virtual {v0, v1, v2}, Lcom/facebook/imagepipeline/producers/v;->e(Lcom/facebook/imagepipeline/producers/v$c;Lcom/facebook/imagepipeline/producers/NetworkFetcher$Callback;)V

    return-void
.end method
