.class Lcom/facebook/react/uimanager/UIViewOperationQueue$ConfigureLayoutAnimationOperation;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/facebook/react/uimanager/UIViewOperationQueue$UIOperation;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/react/uimanager/UIViewOperationQueue;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "ConfigureLayoutAnimationOperation"
.end annotation


# instance fields
.field private final mAnimationComplete:Lcom/facebook/react/bridge/Callback;

.field private final mConfig:Lcom/facebook/react/bridge/ReadableMap;

.field final synthetic this$0:Lcom/facebook/react/uimanager/UIViewOperationQueue;


# direct methods
.method private constructor <init>(Lcom/facebook/react/uimanager/UIViewOperationQueue;Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/bridge/Callback;)V
    .locals 0

    .line 2
    iput-object p1, p0, Lcom/facebook/react/uimanager/UIViewOperationQueue$ConfigureLayoutAnimationOperation;->this$0:Lcom/facebook/react/uimanager/UIViewOperationQueue;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p2, p0, Lcom/facebook/react/uimanager/UIViewOperationQueue$ConfigureLayoutAnimationOperation;->mConfig:Lcom/facebook/react/bridge/ReadableMap;

    .line 4
    iput-object p3, p0, Lcom/facebook/react/uimanager/UIViewOperationQueue$ConfigureLayoutAnimationOperation;->mAnimationComplete:Lcom/facebook/react/bridge/Callback;

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/react/uimanager/UIViewOperationQueue;Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/bridge/Callback;Lcom/facebook/react/uimanager/UIViewOperationQueue$1;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lcom/facebook/react/uimanager/UIViewOperationQueue$ConfigureLayoutAnimationOperation;-><init>(Lcom/facebook/react/uimanager/UIViewOperationQueue;Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/bridge/Callback;)V

    return-void
.end method


# virtual methods
.method public execute()V
    .locals 3

    iget-object v0, p0, Lcom/facebook/react/uimanager/UIViewOperationQueue$ConfigureLayoutAnimationOperation;->this$0:Lcom/facebook/react/uimanager/UIViewOperationQueue;

    invoke-static {v0}, Lcom/facebook/react/uimanager/UIViewOperationQueue;->access$000(Lcom/facebook/react/uimanager/UIViewOperationQueue;)Lcom/facebook/react/uimanager/NativeViewHierarchyManager;

    move-result-object v0

    iget-object v1, p0, Lcom/facebook/react/uimanager/UIViewOperationQueue$ConfigureLayoutAnimationOperation;->mConfig:Lcom/facebook/react/bridge/ReadableMap;

    iget-object v2, p0, Lcom/facebook/react/uimanager/UIViewOperationQueue$ConfigureLayoutAnimationOperation;->mAnimationComplete:Lcom/facebook/react/bridge/Callback;

    invoke-virtual {v0, v1, v2}, Lcom/facebook/react/uimanager/NativeViewHierarchyManager;->configureLayoutAnimation(Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/bridge/Callback;)V

    return-void
.end method
