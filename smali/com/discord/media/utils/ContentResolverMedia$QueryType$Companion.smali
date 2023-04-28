.class public final Lcom/discord/media/utils/ContentResolverMedia$QueryType$Companion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/discord/media/utils/ContentResolverMedia$QueryType;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\u0008\u0002\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002J\u0008\u0010\u0006\u001a\u00020\u0005H\u0002R\u0014\u0010\u0003\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"
    }
    d2 = {
        "Lcom/discord/media/utils/ContentResolverMedia$QueryType$Companion;",
        "",
        "()V",
        "UNSUPPORTED_IMAGE_MIME_TYPES",
        "",
        "",
        "getUnsupportedImageMimeTypes",
        "media_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0}, Lcom/discord/media/utils/ContentResolverMedia$QueryType$Companion;-><init>()V

    return-void
.end method

.method public static final synthetic access$getUnsupportedImageMimeTypes(Lcom/discord/media/utils/ContentResolverMedia$QueryType$Companion;)Ljava/lang/String;
    .locals 0

    invoke-direct {p0}, Lcom/discord/media/utils/ContentResolverMedia$QueryType$Companion;->getUnsupportedImageMimeTypes()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private final getUnsupportedImageMimeTypes()Ljava/lang/String;
    .locals 9

    invoke-static {}, Lcom/discord/media/utils/ContentResolverMedia$QueryType;->access$getUNSUPPORTED_IMAGE_MIME_TYPES$cp()Ljava/util/List;

    move-result-object v0

    const-string v1, ","

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    sget-object v6, Lcom/discord/media/utils/ContentResolverMedia$QueryType$Companion$getUnsupportedImageMimeTypes$1;->INSTANCE:Lcom/discord/media/utils/ContentResolverMedia$QueryType$Companion$getUnsupportedImageMimeTypes$1;

    const/16 v7, 0x1e

    const/4 v8, 0x0

    invoke-static/range {v0 .. v8}, Lkotlin/collections/h;->e0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
