.class final Lcom/discord/bundle_updater/BundleUpdaterManager$checkForUpdateAndReload$1$1;
.super Lkotlin/jvm/internal/s;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/discord/bundle_updater/BundleUpdaterManager$checkForUpdateAndReload$1;->invoke()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/s;",
        "Lkotlin/jvm/functions/Function1<",
        "Landroid/view/ViewGroup;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n\u00a2\u0006\u0002\u0008\u0003"
    }
    d2 = {
        "<anonymous>",
        "",
        "Landroid/view/ViewGroup;",
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
.field final synthetic this$0:Lcom/discord/bundle_updater/BundleUpdaterManager;


# direct methods
.method constructor <init>(Lcom/discord/bundle_updater/BundleUpdaterManager;)V
    .locals 0

    iput-object p1, p0, Lcom/discord/bundle_updater/BundleUpdaterManager$checkForUpdateAndReload$1$1;->this$0:Lcom/discord/bundle_updater/BundleUpdaterManager;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/s;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Landroid/view/ViewGroup;

    invoke-virtual {p0, p1}, Lcom/discord/bundle_updater/BundleUpdaterManager$checkForUpdateAndReload$1$1;->invoke(Landroid/view/ViewGroup;)V

    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Landroid/view/ViewGroup;)V
    .locals 3

    const-string v0, "$this$runOnActivity"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    iget-object p1, p0, Lcom/discord/bundle_updater/BundleUpdaterManager$checkForUpdateAndReload$1$1;->this$0:Lcom/discord/bundle_updater/BundleUpdaterManager;

    invoke-static {p1}, Lcom/discord/bundle_updater/BundleUpdaterManager;->access$getReactContext$p(Lcom/discord/bundle_updater/BundleUpdaterManager;)Lcom/facebook/react/bridge/ReactApplicationContext;

    move-result-object p1

    invoke-virtual {p1}, Lcom/facebook/react/bridge/ReactContext;->getCurrentActivity()Landroid/app/Activity;

    move-result-object p1

    if-eqz p1, :cond_2

    .line 3
    invoke-virtual {p1}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    move-result-object p1

    if-eqz p1, :cond_2

    .line 4
    instance-of v0, p1, Lcom/facebook/react/ReactApplication;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move-object p1, v1

    :cond_0
    check-cast p1, Lcom/facebook/react/ReactApplication;

    if-eqz p1, :cond_2

    .line 5
    invoke-interface {p1}, Lcom/facebook/react/ReactApplication;->getReactNativeHost()Lcom/facebook/react/ReactNativeHost;

    move-result-object p1

    if-eqz p1, :cond_2

    .line 6
    invoke-virtual {p1}, Lcom/facebook/react/ReactNativeHost;->getReactInstanceManager()Lcom/facebook/react/ReactInstanceManager;

    move-result-object p1

    if-eqz p1, :cond_2

    .line 7
    iget-object v0, p0, Lcom/discord/bundle_updater/BundleUpdaterManager$checkForUpdateAndReload$1$1;->this$0:Lcom/discord/bundle_updater/BundleUpdaterManager;

    .line 8
    sget-object v2, Lcom/discord/bundle_updater/BundleUpdater;->Companion:Lcom/discord/bundle_updater/BundleUpdater$Companion;

    invoke-virtual {v2}, Lcom/discord/bundle_updater/BundleUpdater$Companion;->instance()Lcom/discord/bundle_updater/BundleUpdater;

    move-result-object v2

    invoke-virtual {v2}, Lcom/discord/bundle_updater/BundleUpdater;->getBundleLocation()Ljava/io/File;

    move-result-object v2

    if-eqz v2, :cond_1

    invoke-virtual {v2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v1

    :cond_1
    invoke-static {v0, p1, v1}, Lcom/discord/bundle_updater/BundleUpdaterManager;->access$setJSBundle(Lcom/discord/bundle_updater/BundleUpdaterManager;Lcom/facebook/react/ReactInstanceManager;Ljava/lang/String;)V

    .line 9
    invoke-virtual {p1}, Lcom/facebook/react/ReactInstanceManager;->recreateReactContextInBackground()V

    :cond_2
    return-void
.end method
