.class public final synthetic Lcom/discord/bundle_updater/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic k:I

.field public final synthetic l:Lcom/discord/bundle_updater/BundleUpdater;

.field public final synthetic m:Lkotlin/jvm/functions/Function0;


# direct methods
.method public synthetic constructor <init>(ILcom/discord/bundle_updater/BundleUpdater;Lkotlin/jvm/functions/Function0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/discord/bundle_updater/b;->k:I

    iput-object p2, p0, Lcom/discord/bundle_updater/b;->l:Lcom/discord/bundle_updater/BundleUpdater;

    iput-object p3, p0, Lcom/discord/bundle_updater/b;->m:Lkotlin/jvm/functions/Function0;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget v0, p0, Lcom/discord/bundle_updater/b;->k:I

    iget-object v1, p0, Lcom/discord/bundle_updater/b;->l:Lcom/discord/bundle_updater/BundleUpdater;

    iget-object v2, p0, Lcom/discord/bundle_updater/b;->m:Lkotlin/jvm/functions/Function0;

    invoke-static {v0, v1, v2}, Lcom/discord/bundle_updater/BundleUpdater;->a(ILcom/discord/bundle_updater/BundleUpdater;Lkotlin/jvm/functions/Function0;)V

    return-void
.end method
