.class final Lcom/discord/bridge/DCDPackageList$getPackages$65;
.super Lkotlin/jvm/internal/s;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/discord/bridge/DCDPackageList;->getPackages()Ljava/util/ArrayList;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/s;",
        "Lkotlin/jvm/functions/Function1<",
        "Lcom/facebook/react/bridge/ReactApplicationContext;",
        "Lcom/facebook/react/uimanager/ViewManager<",
        "*",
        "Lcom/facebook/react/uimanager/LayoutShadowNode;",
        ">;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u000c\u0012\u0002\u0008\u0003\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n\u00a2\u0006\u0002\u0008\u0005"
    }
    d2 = {
        "<anonymous>",
        "Lcom/facebook/react/uimanager/ViewManager;",
        "Lcom/facebook/react/uimanager/LayoutShadowNode;",
        "it",
        "Lcom/facebook/react/bridge/ReactApplicationContext;",
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


# static fields
.field public static final INSTANCE:Lcom/discord/bridge/DCDPackageList$getPackages$65;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/discord/bridge/DCDPackageList$getPackages$65;

    invoke-direct {v0}, Lcom/discord/bridge/DCDPackageList$getPackages$65;-><init>()V

    sput-object v0, Lcom/discord/bridge/DCDPackageList$getPackages$65;->INSTANCE:Lcom/discord/bridge/DCDPackageList$getPackages$65;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/s;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Lcom/facebook/react/bridge/ReactApplicationContext;)Lcom/facebook/react/uimanager/ViewManager;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/react/bridge/ReactApplicationContext;",
            ")",
            "Lcom/facebook/react/uimanager/ViewManager<",
            "*",
            "Lcom/facebook/react/uimanager/LayoutShadowNode;",
            ">;"
        }
    .end annotation

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    new-instance p1, Lcom/discord/safearea/SafeAreaProviderManager;

    invoke-direct {p1}, Lcom/discord/safearea/SafeAreaProviderManager;-><init>()V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lcom/facebook/react/bridge/ReactApplicationContext;

    invoke-virtual {p0, p1}, Lcom/discord/bridge/DCDPackageList$getPackages$65;->invoke(Lcom/facebook/react/bridge/ReactApplicationContext;)Lcom/facebook/react/uimanager/ViewManager;

    move-result-object p1

    return-object p1
.end method
