.class final Lcom/discord/cache/CacheModule$Companion$quickInitCache$1;
.super Lkotlin/jvm/internal/s;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/discord/cache/CacheModule$Companion;->quickInitCache(Landroid/content/Context;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/s;",
        "Lkotlin/jvm/functions/Function0<",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n\u00a2\u0006\u0002\u0008\u0002"
    }
    d2 = {
        "<anonymous>",
        "",
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
.field final synthetic $applicationContext:Landroid/content/Context;


# direct methods
.method constructor <init>(Landroid/content/Context;)V
    .locals 0

    iput-object p1, p0, Lcom/discord/cache/CacheModule$Companion$quickInitCache$1;->$applicationContext:Landroid/content/Context;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/s;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/discord/cache/CacheModule$Companion$quickInitCache$1;->invoke()V

    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object v0
.end method

.method public final invoke()V
    .locals 9

    .line 2
    sget-object v8, Lcom/discord/tti_manager/TTIMetrics;->INSTANCE:Lcom/discord/tti_manager/TTIMetrics;

    const-string v1, "CacheStorage Init Start"

    const-wide/16 v2, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/16 v6, 0xe

    const/4 v7, 0x0

    move-object v0, v8

    invoke-static/range {v0 .. v7}, Lcom/discord/tti_manager/TTIMetrics;->record$default(Lcom/discord/tti_manager/TTIMetrics;Ljava/lang/String;JLjava/lang/String;ZILjava/lang/Object;)V

    .line 3
    iget-object v0, p0, Lcom/discord/cache/CacheModule$Companion$quickInitCache$1;->$applicationContext:Landroid/content/Context;

    const-string v1, "CacheStore"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    const-string v1, "hydrate"

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    const-string v1, "CacheStorage Init End"

    const-wide/16 v2, 0x0

    move-object v0, v8

    .line 4
    invoke-static/range {v0 .. v7}, Lcom/discord/tti_manager/TTIMetrics;->record$default(Lcom/discord/tti_manager/TTIMetrics;Ljava/lang/String;JLjava/lang/String;ZILjava/lang/Object;)V

    const/4 v0, 0x1

    .line 5
    invoke-static {v0}, Lcom/discord/cache/CacheModule;->access$setCacheLoaded$cp(Z)V

    return-void
.end method
