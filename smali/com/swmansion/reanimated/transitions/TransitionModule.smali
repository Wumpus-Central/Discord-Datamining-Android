.class public Lcom/swmansion/reanimated/transitions/TransitionModule;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final mUIManager:Lcom/facebook/react/uimanager/UIManagerModule;


# direct methods
.method public constructor <init>(Lcom/facebook/react/uimanager/UIManagerModule;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/swmansion/reanimated/transitions/TransitionModule;->mUIManager:Lcom/facebook/react/uimanager/UIManagerModule;

    .line 5
    .line 6
    return-void
    .line 7
    .line 8
    .line 9
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
.end method


# virtual methods
.method public animateNextTransition(ILcom/facebook/react/bridge/ReadableMap;)V
    .locals 2

    iget-object v0, p0, Lcom/swmansion/reanimated/transitions/TransitionModule;->mUIManager:Lcom/facebook/react/uimanager/UIManagerModule;

    new-instance v1, Lcom/swmansion/reanimated/transitions/TransitionModule$1;

    invoke-direct {v1, p0, p1, p2}, Lcom/swmansion/reanimated/transitions/TransitionModule$1;-><init>(Lcom/swmansion/reanimated/transitions/TransitionModule;ILcom/facebook/react/bridge/ReadableMap;)V

    invoke-virtual {v0, v1}, Lcom/facebook/react/uimanager/UIManagerModule;->prependUIBlock(Lcom/facebook/react/uimanager/UIBlock;)V

    return-void
.end method
