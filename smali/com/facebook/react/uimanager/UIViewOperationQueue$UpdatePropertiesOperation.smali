.class final Lcom/facebook/react/uimanager/UIViewOperationQueue$UpdatePropertiesOperation;
.super Lcom/facebook/react/uimanager/UIViewOperationQueue$ViewOperation;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/react/uimanager/UIViewOperationQueue;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "UpdatePropertiesOperation"
.end annotation


# instance fields
.field private final mProps:Lcom/facebook/react/uimanager/ReactStylesDiffMap;

.field final synthetic this$0:Lcom/facebook/react/uimanager/UIViewOperationQueue;


# direct methods
.method private constructor <init>(Lcom/facebook/react/uimanager/UIViewOperationQueue;ILcom/facebook/react/uimanager/ReactStylesDiffMap;)V
    .locals 0

    .line 2
    iput-object p1, p0, Lcom/facebook/react/uimanager/UIViewOperationQueue$UpdatePropertiesOperation;->this$0:Lcom/facebook/react/uimanager/UIViewOperationQueue;

    .line 3
    invoke-direct {p0, p1, p2}, Lcom/facebook/react/uimanager/UIViewOperationQueue$ViewOperation;-><init>(Lcom/facebook/react/uimanager/UIViewOperationQueue;I)V

    .line 4
    iput-object p3, p0, Lcom/facebook/react/uimanager/UIViewOperationQueue$UpdatePropertiesOperation;->mProps:Lcom/facebook/react/uimanager/ReactStylesDiffMap;

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/react/uimanager/UIViewOperationQueue;ILcom/facebook/react/uimanager/ReactStylesDiffMap;Lcom/facebook/react/uimanager/UIViewOperationQueue$1;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lcom/facebook/react/uimanager/UIViewOperationQueue$UpdatePropertiesOperation;-><init>(Lcom/facebook/react/uimanager/UIViewOperationQueue;ILcom/facebook/react/uimanager/ReactStylesDiffMap;)V

    return-void
.end method


# virtual methods
.method public execute()V
    .locals 3

    iget-object v0, p0, Lcom/facebook/react/uimanager/UIViewOperationQueue$UpdatePropertiesOperation;->this$0:Lcom/facebook/react/uimanager/UIViewOperationQueue;

    invoke-static {v0}, Lcom/facebook/react/uimanager/UIViewOperationQueue;->access$000(Lcom/facebook/react/uimanager/UIViewOperationQueue;)Lcom/facebook/react/uimanager/NativeViewHierarchyManager;

    move-result-object v0

    iget v1, p0, Lcom/facebook/react/uimanager/UIViewOperationQueue$ViewOperation;->mTag:I

    iget-object v2, p0, Lcom/facebook/react/uimanager/UIViewOperationQueue$UpdatePropertiesOperation;->mProps:Lcom/facebook/react/uimanager/ReactStylesDiffMap;

    invoke-virtual {v0, v1, v2}, Lcom/facebook/react/uimanager/NativeViewHierarchyManager;->updateProperties(ILcom/facebook/react/uimanager/ReactStylesDiffMap;)V

    return-void
.end method
