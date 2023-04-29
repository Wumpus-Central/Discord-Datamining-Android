.class public interface abstract Lcom/discord/image/fresco/postprocessors/PostProcessor;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/discord/image/fresco/postprocessors/PostProcessor$Circle;,
        Lcom/discord/image/fresco/postprocessors/PostProcessor$Companion;,
        Lcom/discord/image/fresco/postprocessors/PostProcessor$Composite;,
        Lcom/discord/image/fresco/postprocessors/PostProcessor$DefaultImpls;,
        Lcom/discord/image/fresco/postprocessors/PostProcessor$Gradient;,
        Lcom/discord/image/fresco/postprocessors/PostProcessor$Grayscale;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0008v\u0018\u0000 \u00052\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\u0008J\u0008\u0010\u0002\u001a\u00020\u0003H\u0016\u0082\u0001\u0004\t\n\u000b\u000c\u00a8\u0006\r"
    }
    d2 = {
        "Lcom/discord/image/fresco/postprocessors/PostProcessor;",
        "",
        "create",
        "Lcom/facebook/imagepipeline/request/BasePostprocessor;",
        "Circle",
        "Companion",
        "Composite",
        "Gradient",
        "Grayscale",
        "Lcom/discord/image/fresco/postprocessors/PostProcessor$Circle;",
        "Lcom/discord/image/fresco/postprocessors/PostProcessor$Composite;",
        "Lcom/discord/image/fresco/postprocessors/PostProcessor$Gradient;",
        "Lcom/discord/image/fresco/postprocessors/PostProcessor$Grayscale;",
        "fresco_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final Companion:Lcom/discord/image/fresco/postprocessors/PostProcessor$Companion;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Lcom/discord/image/fresco/postprocessors/PostProcessor$Companion;->$$INSTANCE:Lcom/discord/image/fresco/postprocessors/PostProcessor$Companion;

    sput-object v0, Lcom/discord/image/fresco/postprocessors/PostProcessor;->Companion:Lcom/discord/image/fresco/postprocessors/PostProcessor$Companion;

    return-void
.end method


# virtual methods
.method public abstract create()Lcom/facebook/imagepipeline/request/BasePostprocessor;
.end method
