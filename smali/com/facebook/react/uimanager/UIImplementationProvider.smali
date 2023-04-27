.class public Lcom/facebook/react/uimanager/UIImplementationProvider;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Ljava/lang/Deprecated;
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method createUIImplementation(Lcom/facebook/react/bridge/ReactApplicationContext;Lcom/facebook/react/uimanager/ViewManagerRegistry;Lcom/facebook/react/uimanager/events/EventDispatcher;I)Lcom/facebook/react/uimanager/UIImplementation;
    .locals 3

    const-string v0, "UIImplementationProvider.createUIImplementation[3]"

    const-wide/16 v1, 0x0

    .line 9
    invoke-static {v1, v2, v0}, Lh6/a;->c(JLjava/lang/String;)V

    .line 10
    :try_start_0
    new-instance v0, Lcom/facebook/react/uimanager/UIImplementation;

    invoke-direct {v0, p1, p2, p3, p4}, Lcom/facebook/react/uimanager/UIImplementation;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;Lcom/facebook/react/uimanager/ViewManagerRegistry;Lcom/facebook/react/uimanager/events/EventDispatcher;I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 11
    invoke-static {v1, v2}, Lh6/a;->g(J)V

    return-object v0

    :catchall_0
    move-exception p1

    invoke-static {v1, v2}, Lh6/a;->g(J)V

    .line 12
    throw p1
.end method

.method public createUIImplementation(Lcom/facebook/react/bridge/ReactApplicationContext;Lcom/facebook/react/uimanager/ViewManagerResolver;Lcom/facebook/react/uimanager/events/EventDispatcher;I)Lcom/facebook/react/uimanager/UIImplementation;
    .locals 3

    const-string v0, "UIImplementationProvider.createUIImplementation[1]"

    const-wide/16 v1, 0x0

    .line 1
    invoke-static {v1, v2, v0}, Lh6/a;->c(JLjava/lang/String;)V

    .line 2
    :try_start_0
    new-instance v0, Lcom/facebook/react/uimanager/UIImplementation;

    invoke-direct {v0, p1, p2, p3, p4}, Lcom/facebook/react/uimanager/UIImplementation;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;Lcom/facebook/react/uimanager/ViewManagerResolver;Lcom/facebook/react/uimanager/events/EventDispatcher;I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 3
    invoke-static {v1, v2}, Lh6/a;->g(J)V

    return-object v0

    :catchall_0
    move-exception p1

    invoke-static {v1, v2}, Lh6/a;->g(J)V

    .line 4
    throw p1
.end method

.method public createUIImplementation(Lcom/facebook/react/bridge/ReactApplicationContext;Ljava/util/List;Lcom/facebook/react/uimanager/events/EventDispatcher;I)Lcom/facebook/react/uimanager/UIImplementation;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/react/bridge/ReactApplicationContext;",
            "Ljava/util/List<",
            "Lcom/facebook/react/uimanager/ViewManager;",
            ">;",
            "Lcom/facebook/react/uimanager/events/EventDispatcher;",
            "I)",
            "Lcom/facebook/react/uimanager/UIImplementation;"
        }
    .end annotation

    const-string v0, "UIImplementationProvider.createUIImplementation[2]"

    const-wide/16 v1, 0x0

    .line 5
    invoke-static {v1, v2, v0}, Lh6/a;->c(JLjava/lang/String;)V

    .line 6
    :try_start_0
    new-instance v0, Lcom/facebook/react/uimanager/UIImplementation;

    invoke-direct {v0, p1, p2, p3, p4}, Lcom/facebook/react/uimanager/UIImplementation;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;Ljava/util/List;Lcom/facebook/react/uimanager/events/EventDispatcher;I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 7
    invoke-static {v1, v2}, Lh6/a;->g(J)V

    return-object v0

    :catchall_0
    move-exception p1

    invoke-static {v1, v2}, Lh6/a;->g(J)V

    .line 8
    throw p1
.end method
