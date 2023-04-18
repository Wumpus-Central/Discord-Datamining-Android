.class final Lcom/discord/bundle_updater/BundleUpdater$otasRootDirectory$2;
.super Lkotlin/jvm/internal/s;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/discord/bundle_updater/BundleUpdater;-><init>(Landroid/content/SharedPreferences;Ljava/io/File;Landroid/content/res/AssetManager;Ljava/util/concurrent/ExecutorService;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/s;",
        "Lkotlin/jvm/functions/Function0<",
        "Ljava/io/File;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n\u00a2\u0006\u0002\u0008\u0002"
    }
    d2 = {
        "<anonymous>",
        "Ljava/io/File;",
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
.field final synthetic this$0:Lcom/discord/bundle_updater/BundleUpdater;


# direct methods
.method constructor <init>(Lcom/discord/bundle_updater/BundleUpdater;)V
    .locals 0

    iput-object p1, p0, Lcom/discord/bundle_updater/BundleUpdater$otasRootDirectory$2;->this$0:Lcom/discord/bundle_updater/BundleUpdater;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/s;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/io/File;
    .locals 3

    .line 2
    new-instance v0, Ljava/io/File;

    iget-object v1, p0, Lcom/discord/bundle_updater/BundleUpdater$otasRootDirectory$2;->this$0:Lcom/discord/bundle_updater/BundleUpdater;

    invoke-static {v1}, Lcom/discord/bundle_updater/BundleUpdater;->access$getFilesDirectory$p(Lcom/discord/bundle_updater/BundleUpdater;)Ljava/io/File;

    move-result-object v1

    invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v1

    const-string v2, "otas"

    invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/discord/bundle_updater/BundleUpdater$otasRootDirectory$2;->invoke()Ljava/io/File;

    move-result-object v0

    return-object v0
.end method
