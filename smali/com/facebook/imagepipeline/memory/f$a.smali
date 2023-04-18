.class Lcom/facebook/imagepipeline/memory/f$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lz3/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/imagepipeline/memory/f;-><init>(Ly3/c;Lx5/z;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lz3/c<",
        "[B>;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/imagepipeline/memory/f;


# direct methods
.method constructor <init>(Lcom/facebook/imagepipeline/memory/f;)V
    .locals 0

    iput-object p1, p0, Lcom/facebook/imagepipeline/memory/f$a;->a:Lcom/facebook/imagepipeline/memory/f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a([B)V
    .locals 1

    iget-object v0, p0, Lcom/facebook/imagepipeline/memory/f$a;->a:Lcom/facebook/imagepipeline/memory/f;

    invoke-virtual {v0, p1}, Lcom/facebook/imagepipeline/memory/f;->b([B)V

    return-void
.end method

.method public bridge synthetic release(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, [B

    invoke-virtual {p0, p1}, Lcom/facebook/imagepipeline/memory/f$a;->a([B)V

    return-void
.end method
