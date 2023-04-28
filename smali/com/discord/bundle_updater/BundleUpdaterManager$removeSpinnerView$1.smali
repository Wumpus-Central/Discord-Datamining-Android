.class final Lcom/discord/bundle_updater/BundleUpdaterManager$removeSpinnerView$1;
.super Lkotlin/jvm/internal/s;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/discord/bundle_updater/BundleUpdaterManager;->removeSpinnerView()V
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

    iput-object p1, p0, Lcom/discord/bundle_updater/BundleUpdaterManager$removeSpinnerView$1;->this$0:Lcom/discord/bundle_updater/BundleUpdaterManager;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/s;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Landroid/view/ViewGroup;

    invoke-virtual {p0, p1}, Lcom/discord/bundle_updater/BundleUpdaterManager$removeSpinnerView$1;->invoke(Landroid/view/ViewGroup;)V

    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Landroid/view/ViewGroup;)V
    .locals 1

    const-string v0, "$this$runOnActivity"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Lcom/discord/bundle_updater/BundleUpdaterManager$removeSpinnerView$1;->this$0:Lcom/discord/bundle_updater/BundleUpdaterManager;

    invoke-static {v0}, Lcom/discord/bundle_updater/BundleUpdaterManager;->access$getProgressLayout$p(Lcom/discord/bundle_updater/BundleUpdaterManager;)Landroid/view/ViewGroup;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 3
    :cond_0
    iget-object p1, p0, Lcom/discord/bundle_updater/BundleUpdaterManager$removeSpinnerView$1;->this$0:Lcom/discord/bundle_updater/BundleUpdaterManager;

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lcom/discord/bundle_updater/BundleUpdaterManager;->access$setProgressLayout$p(Lcom/discord/bundle_updater/BundleUpdaterManager;Landroid/view/ViewGroup;)V

    return-void
.end method
