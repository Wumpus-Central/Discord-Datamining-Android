.class Lcom/facebook/react/uimanager/ReaUiImplementationProvider;
.super Lcom/facebook/react/uimanager/UIImplementationProvider;
.source "SourceFile"


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/facebook/react/uimanager/UIImplementationProvider;-><init>()V

    return-void
.end method


# virtual methods
.method createUIImplementation(Lcom/facebook/react/bridge/ReactApplicationContext;Lcom/facebook/react/uimanager/ViewManagerRegistry;Lcom/facebook/react/uimanager/events/EventDispatcher;I)Lcom/facebook/react/uimanager/UIImplementation;
    .locals 1

    new-instance v0, Lcom/facebook/react/uimanager/ReanimatedUIImplementation;

    invoke-direct {v0, p1, p2, p3, p4}, Lcom/facebook/react/uimanager/ReanimatedUIImplementation;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;Lcom/facebook/react/uimanager/ViewManagerRegistry;Lcom/facebook/react/uimanager/events/EventDispatcher;I)V

    return-object v0
.end method
