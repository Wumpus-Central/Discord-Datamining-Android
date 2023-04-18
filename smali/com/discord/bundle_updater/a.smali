.class public final synthetic Lcom/discord/bundle_updater/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic k:Lcom/discord/bundle_updater/AssetStatus;

.field public final synthetic l:Lcom/discord/bundle_updater/BundleUpdater;

.field public final synthetic m:Ljava/lang/String;

.field public final synthetic n:Ljava/lang/String;

.field public final synthetic o:Ljava/io/File;

.field public final synthetic p:Landroid/net/Uri;

.field public final synthetic q:Lorg/json/JSONObject;

.field public final synthetic r:Ljava/lang/String;

.field public final synthetic s:Lcom/discord/bundle_updater/BundleUpdater$Patch;

.field public final synthetic t:Ljava/io/File;


# direct methods
.method public synthetic constructor <init>(Lcom/discord/bundle_updater/AssetStatus;Lcom/discord/bundle_updater/BundleUpdater;Ljava/lang/String;Ljava/lang/String;Ljava/io/File;Landroid/net/Uri;Lorg/json/JSONObject;Ljava/lang/String;Lcom/discord/bundle_updater/BundleUpdater$Patch;Ljava/io/File;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/discord/bundle_updater/a;->k:Lcom/discord/bundle_updater/AssetStatus;

    iput-object p2, p0, Lcom/discord/bundle_updater/a;->l:Lcom/discord/bundle_updater/BundleUpdater;

    iput-object p3, p0, Lcom/discord/bundle_updater/a;->m:Ljava/lang/String;

    iput-object p4, p0, Lcom/discord/bundle_updater/a;->n:Ljava/lang/String;

    iput-object p5, p0, Lcom/discord/bundle_updater/a;->o:Ljava/io/File;

    iput-object p6, p0, Lcom/discord/bundle_updater/a;->p:Landroid/net/Uri;

    iput-object p7, p0, Lcom/discord/bundle_updater/a;->q:Lorg/json/JSONObject;

    iput-object p8, p0, Lcom/discord/bundle_updater/a;->r:Ljava/lang/String;

    iput-object p9, p0, Lcom/discord/bundle_updater/a;->s:Lcom/discord/bundle_updater/BundleUpdater$Patch;

    iput-object p10, p0, Lcom/discord/bundle_updater/a;->t:Ljava/io/File;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 10

    iget-object v0, p0, Lcom/discord/bundle_updater/a;->k:Lcom/discord/bundle_updater/AssetStatus;

    iget-object v1, p0, Lcom/discord/bundle_updater/a;->l:Lcom/discord/bundle_updater/BundleUpdater;

    iget-object v2, p0, Lcom/discord/bundle_updater/a;->m:Ljava/lang/String;

    iget-object v3, p0, Lcom/discord/bundle_updater/a;->n:Ljava/lang/String;

    iget-object v4, p0, Lcom/discord/bundle_updater/a;->o:Ljava/io/File;

    iget-object v5, p0, Lcom/discord/bundle_updater/a;->p:Landroid/net/Uri;

    iget-object v6, p0, Lcom/discord/bundle_updater/a;->q:Lorg/json/JSONObject;

    iget-object v7, p0, Lcom/discord/bundle_updater/a;->r:Ljava/lang/String;

    iget-object v8, p0, Lcom/discord/bundle_updater/a;->s:Lcom/discord/bundle_updater/BundleUpdater$Patch;

    iget-object v9, p0, Lcom/discord/bundle_updater/a;->t:Ljava/io/File;

    invoke-static/range {v0 .. v9}, Lcom/discord/bundle_updater/BundleUpdater;->b(Lcom/discord/bundle_updater/AssetStatus;Lcom/discord/bundle_updater/BundleUpdater;Ljava/lang/String;Ljava/lang/String;Ljava/io/File;Landroid/net/Uri;Lorg/json/JSONObject;Ljava/lang/String;Lcom/discord/bundle_updater/BundleUpdater$Patch;Ljava/io/File;)V

    return-void
.end method
