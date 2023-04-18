.class public final Lcom/discord/bridge/DCDReactNativeHost;
.super Lcom/facebook/react/ReactNativeHost;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0008\u0010\u0005\u001a\u00020\u0006H\u0014J\n\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0014J\u0008\u0010\u0008\u001a\u00020\tH\u0014J\u0008\u0010\n\u001a\u00020\u0006H\u0014J\u0018\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\r0\u000cj\u0008\u0012\u0004\u0012\u00020\r`\u000eH\u0014J\u0008\u0010\u000f\u001a\u00020\u0010H\u0014J\u0008\u0010\u0011\u001a\u00020\u0012H\u0016\u00a8\u0006\u0013"
    }
    d2 = {
        "Lcom/discord/bridge/DCDReactNativeHost;",
        "Lcom/facebook/react/ReactNativeHost;",
        "application",
        "Landroid/app/Application;",
        "(Landroid/app/Application;)V",
        "getBundleAssetName",
        "",
        "getJSBundleFile",
        "getJSIModulePackage",
        "Lcom/discord/bridge/DCDJSIModulePackage;",
        "getJSMainModuleName",
        "getPackages",
        "Ljava/util/ArrayList;",
        "Lcom/facebook/react/ReactPackage;",
        "Lkotlin/collections/ArrayList;",
        "getReactPackageTurboModuleManagerDelegateBuilder",
        "Lcom/discord/turbomodules/DiscordTurboModuleManagerDelegate$Builder;",
        "getUseDeveloperSupport",
        "",
        "app_canaryRelease"
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
.method public constructor <init>(Landroid/app/Application;)V
    .locals 1

    .line 1
    const-string v0, "application"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0, p1}, Lcom/facebook/react/ReactNativeHost;-><init>(Landroid/app/Application;)V

    .line 7
    .line 8
    .line 9
    return-void
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
.end method


# virtual methods
.method protected getBundleAssetName()Ljava/lang/String;
    .locals 1

    const-string v0, "index.android.bundle"

    return-object v0
.end method

.method protected getJSBundleFile()Ljava/lang/String;
    .locals 1

    sget-object v0, Lcom/discord/bundle_updater/BundleUpdater;->Companion:Lcom/discord/bundle_updater/BundleUpdater$Companion;

    invoke-virtual {v0}, Lcom/discord/bundle_updater/BundleUpdater$Companion;->instance()Lcom/discord/bundle_updater/BundleUpdater;

    move-result-object v0

    invoke-virtual {v0}, Lcom/discord/bundle_updater/BundleUpdater;->getBundleLocation()Ljava/io/File;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method protected getJSIModulePackage()Lcom/discord/bridge/DCDJSIModulePackage;
    .locals 1

    .line 2
    new-instance v0, Lcom/discord/bridge/DCDJSIModulePackage;

    invoke-direct {v0}, Lcom/discord/bridge/DCDJSIModulePackage;-><init>()V

    return-object v0
.end method

.method public bridge synthetic getJSIModulePackage()Lcom/facebook/react/bridge/JSIModulePackage;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/discord/bridge/DCDReactNativeHost;->getJSIModulePackage()Lcom/discord/bridge/DCDJSIModulePackage;

    move-result-object v0

    return-object v0
.end method

.method protected getJSMainModuleName()Ljava/lang/String;
    .locals 1

    const-string v0, "index.native"

    return-object v0
.end method

.method protected getPackages()Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList<",
            "Lcom/facebook/react/ReactPackage;",
            ">;"
        }
    .end annotation

    .line 2
    new-instance v0, Lcom/discord/bridge/DCDPackageList;

    invoke-direct {v0, p0}, Lcom/discord/bridge/DCDPackageList;-><init>(Lcom/facebook/react/ReactNativeHost;)V

    invoke-virtual {v0}, Lcom/discord/bridge/DCDPackageList;->getPackages()Ljava/util/ArrayList;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getPackages()Ljava/util/List;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/discord/bridge/DCDReactNativeHost;->getPackages()Ljava/util/ArrayList;

    move-result-object v0

    return-object v0
.end method

.method protected getReactPackageTurboModuleManagerDelegateBuilder()Lcom/discord/turbomodules/DiscordTurboModuleManagerDelegate$Builder;
    .locals 1

    .line 2
    new-instance v0, Lcom/discord/turbomodules/DiscordTurboModuleManagerDelegate$Builder;

    invoke-direct {v0}, Lcom/discord/turbomodules/DiscordTurboModuleManagerDelegate$Builder;-><init>()V

    return-object v0
.end method

.method public bridge synthetic getReactPackageTurboModuleManagerDelegateBuilder()Lcom/facebook/react/ReactPackageTurboModuleManagerDelegate$Builder;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/discord/bridge/DCDReactNativeHost;->getReactPackageTurboModuleManagerDelegateBuilder()Lcom/discord/turbomodules/DiscordTurboModuleManagerDelegate$Builder;

    move-result-object v0

    return-object v0
.end method

.method public getUseDeveloperSupport()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method
