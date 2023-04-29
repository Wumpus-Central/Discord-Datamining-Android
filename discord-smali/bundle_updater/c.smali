.class public final synthetic Lcom/discord/bundle_updater/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic k:Landroid/app/Activity;

.field public final synthetic l:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(Landroid/app/Activity;Lkotlin/jvm/functions/Function1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/discord/bundle_updater/c;->k:Landroid/app/Activity;

    iput-object p2, p0, Lcom/discord/bundle_updater/c;->l:Lkotlin/jvm/functions/Function1;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lcom/discord/bundle_updater/c;->k:Landroid/app/Activity;

    iget-object v1, p0, Lcom/discord/bundle_updater/c;->l:Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v1}, Lcom/discord/bundle_updater/BundleUpdaterManager;->a(Landroid/app/Activity;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method
