.class public final Lcom/discord/image/fresco/postprocessors/PostProcessor$Grayscale;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/discord/image/fresco/postprocessors/PostProcessor;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/discord/image/fresco/postprocessors/PostProcessor;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Grayscale"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"
    }
    d2 = {
        "Lcom/discord/image/fresco/postprocessors/PostProcessor$Grayscale;",
        "Lcom/discord/image/fresco/postprocessors/PostProcessor;",
        "()V",
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
.field public static final INSTANCE:Lcom/discord/image/fresco/postprocessors/PostProcessor$Grayscale;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/discord/image/fresco/postprocessors/PostProcessor$Grayscale;

    invoke-direct {v0}, Lcom/discord/image/fresco/postprocessors/PostProcessor$Grayscale;-><init>()V

    sput-object v0, Lcom/discord/image/fresco/postprocessors/PostProcessor$Grayscale;->INSTANCE:Lcom/discord/image/fresco/postprocessors/PostProcessor$Grayscale;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public create()Lcom/facebook/imagepipeline/request/BasePostprocessor;
    .locals 1

    invoke-static {p0}, Lcom/discord/image/fresco/postprocessors/PostProcessor$DefaultImpls;->create(Lcom/discord/image/fresco/postprocessors/PostProcessor;)Lcom/facebook/imagepipeline/request/BasePostprocessor;

    move-result-object v0

    return-object v0
.end method
