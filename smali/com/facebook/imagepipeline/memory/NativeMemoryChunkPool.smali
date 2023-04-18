.class public Lcom/facebook/imagepipeline/memory/NativeMemoryChunkPool;
.super Lcom/facebook/imagepipeline/memory/h;
.source "SourceFile"


# annotations
.annotation build Lv3/d;
.end annotation


# direct methods
.method public constructor <init>(Ly3/c;Lx5/z;Lx5/a0;)V
    .locals 0
    .annotation build Lv3/d;
    .end annotation

    invoke-direct {p0, p1, p2, p3}, Lcom/facebook/imagepipeline/memory/h;-><init>(Ly3/c;Lx5/z;Lx5/a0;)V

    return-void
.end method


# virtual methods
.method protected bridge synthetic A(I)Lx5/s;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/facebook/imagepipeline/memory/NativeMemoryChunkPool;->F(I)Lcom/facebook/imagepipeline/memory/NativeMemoryChunk;

    move-result-object p1

    return-object p1
.end method

.method protected F(I)Lcom/facebook/imagepipeline/memory/NativeMemoryChunk;
    .locals 1

    new-instance v0, Lcom/facebook/imagepipeline/memory/NativeMemoryChunk;

    invoke-direct {v0, p1}, Lcom/facebook/imagepipeline/memory/NativeMemoryChunk;-><init>(I)V

    return-object v0
.end method

.method protected bridge synthetic g(I)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/facebook/imagepipeline/memory/NativeMemoryChunkPool;->F(I)Lcom/facebook/imagepipeline/memory/NativeMemoryChunk;

    move-result-object p1

    return-object p1
.end method
