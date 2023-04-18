.class final Lcom/discord/bundle_updater/BundleUpdaterUtils$compareJSONData$1;
.super Lkotlin/jvm/internal/s;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/discord/bundle_updater/BundleUpdaterUtils;->compareJSONData(Lorg/json/JSONObject;Lorg/json/JSONObject;Lorg/json/JSONObject;)Ljava/util/List;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/s;",
        "Lkotlin/jvm/functions/Function1<",
        "Ljava/lang/String;",
        "Lkotlin/Pair<",
        "+",
        "Ljava/lang/String;",
        "+",
        "Lcom/discord/bundle_updater/AssetStatus;",
        ">;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0000\u001a\u0018\u0012\u000c\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00012\u000e\u0010\u0005\u001a\n \u0003*\u0004\u0018\u00010\u00020\u0002H\n\u00a2\u0006\u0002\u0008\u0006"
    }
    d2 = {
        "<anonymous>",
        "Lkotlin/Pair;",
        "",
        "kotlin.jvm.PlatformType",
        "Lcom/discord/bundle_updater/AssetStatus;",
        "key",
        "invoke"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic $apkData:Lorg/json/JSONObject;

.field final synthetic $newData:Lorg/json/JSONObject;

.field final synthetic $oldData:Lorg/json/JSONObject;


# direct methods
.method constructor <init>(Lorg/json/JSONObject;Lorg/json/JSONObject;Lorg/json/JSONObject;)V
    .locals 0

    iput-object p1, p0, Lcom/discord/bundle_updater/BundleUpdaterUtils$compareJSONData$1;->$newData:Lorg/json/JSONObject;

    iput-object p2, p0, Lcom/discord/bundle_updater/BundleUpdaterUtils$compareJSONData$1;->$apkData:Lorg/json/JSONObject;

    iput-object p3, p0, Lcom/discord/bundle_updater/BundleUpdaterUtils$compareJSONData$1;->$oldData:Lorg/json/JSONObject;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/s;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Lcom/discord/bundle_updater/BundleUpdaterUtils$compareJSONData$1;->invoke(Ljava/lang/String;)Lkotlin/Pair;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Ljava/lang/String;)Lkotlin/Pair;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lkotlin/Pair<",
            "Ljava/lang/String;",
            "Lcom/discord/bundle_updater/AssetStatus;",
            ">;"
        }
    .end annotation

    .line 2
    iget-object v0, p0, Lcom/discord/bundle_updater/BundleUpdaterUtils$compareJSONData$1;->$newData:Lorg/json/JSONObject;

    invoke-virtual {v0, p1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 3
    iget-object v1, p0, Lcom/discord/bundle_updater/BundleUpdaterUtils$compareJSONData$1;->$apkData:Lorg/json/JSONObject;

    const-string v2, "key"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1, p1}, Lcom/discord/bundle_updater/BundleUpdaterUtilsKt;->getStringOrNull(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 4
    :cond_0
    iget-object v1, p0, Lcom/discord/bundle_updater/BundleUpdaterUtils$compareJSONData$1;->$oldData:Lorg/json/JSONObject;

    invoke-static {v1, p1}, Lcom/discord/bundle_updater/BundleUpdaterUtilsKt;->getStringOrNull(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 5
    sget-object v0, Lcom/discord/bundle_updater/AssetStatus;->CopyFromPrevious:Lcom/discord/bundle_updater/AssetStatus;

    goto :goto_0

    .line 6
    :cond_1
    sget-object v0, Lcom/discord/bundle_updater/AssetStatus;->Download:Lcom/discord/bundle_updater/AssetStatus;

    .line 7
    :goto_0
    invoke-static {p1, v0}, Llf/x;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p1

    return-object p1
.end method
