.class public Lcom/swmansion/reanimated/ReanimatedUIManagerFactory;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static create(Lcom/facebook/react/bridge/ReactApplicationContext;Ljava/util/List;I)Lcom/facebook/react/uimanager/UIManagerModule;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/react/bridge/ReactApplicationContext;",
            "Ljava/util/List<",
            "Lcom/facebook/react/uimanager/ViewManager;",
            ">;I)",
            "Lcom/facebook/react/uimanager/UIManagerModule;"
        }
    .end annotation

    new-instance v0, Lcom/facebook/react/uimanager/ReanimatedUIManager;

    invoke-direct {v0, p0, p1, p2}, Lcom/facebook/react/uimanager/ReanimatedUIManager;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;Ljava/util/List;I)V

    return-object v0
.end method
