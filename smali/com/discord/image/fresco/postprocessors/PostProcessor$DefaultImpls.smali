.class public final Lcom/discord/image/fresco/postprocessors/PostProcessor$DefaultImpls;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/discord/image/fresco/postprocessors/PostProcessor;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "DefaultImpls"
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static create(Lcom/discord/image/fresco/postprocessors/PostProcessor;)Lcom/facebook/imagepipeline/request/BasePostprocessor;
    .locals 1

    sget-object v0, Lcom/discord/image/fresco/postprocessors/PostProcessor;->Companion:Lcom/discord/image/fresco/postprocessors/PostProcessor$Companion;

    invoke-virtual {v0, p0}, Lcom/discord/image/fresco/postprocessors/PostProcessor$Companion;->create(Lcom/discord/image/fresco/postprocessors/PostProcessor;)Lcom/facebook/imagepipeline/request/BasePostprocessor;

    move-result-object p0

    return-object p0
.end method
