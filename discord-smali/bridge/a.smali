.class public final synthetic Lcom/discord/bridge/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/facebook/react/module/model/ReactModuleInfoProvider;


# instance fields
.field public final synthetic a:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/discord/bridge/a;->a:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final getReactModuleInfos()Ljava/util/Map;
    .locals 1

    iget-object v0, p0, Lcom/discord/bridge/a;->a:Ljava/lang/String;

    invoke-static {v0}, Lcom/discord/bridge/DCDModuleProvider$getTurboPackageForModule$1;->a(Ljava/lang/String;)Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method
