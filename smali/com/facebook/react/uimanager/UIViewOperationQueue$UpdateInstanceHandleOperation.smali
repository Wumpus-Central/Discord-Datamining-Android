.class final Lcom/facebook/react/uimanager/UIViewOperationQueue$UpdateInstanceHandleOperation;
.super Lcom/facebook/react/uimanager/UIViewOperationQueue$ViewOperation;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/react/uimanager/UIViewOperationQueue;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "UpdateInstanceHandleOperation"
.end annotation


# instance fields
.field private final mInstanceHandle:J

.field final synthetic this$0:Lcom/facebook/react/uimanager/UIViewOperationQueue;


# direct methods
.method private constructor <init>(Lcom/facebook/react/uimanager/UIViewOperationQueue;IJ)V
    .locals 0

    .line 2
    iput-object p1, p0, Lcom/facebook/react/uimanager/UIViewOperationQueue$UpdateInstanceHandleOperation;->this$0:Lcom/facebook/react/uimanager/UIViewOperationQueue;

    .line 3
    invoke-direct {p0, p1, p2}, Lcom/facebook/react/uimanager/UIViewOperationQueue$ViewOperation;-><init>(Lcom/facebook/react/uimanager/UIViewOperationQueue;I)V

    .line 4
    iput-wide p3, p0, Lcom/facebook/react/uimanager/UIViewOperationQueue$UpdateInstanceHandleOperation;->mInstanceHandle:J

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/react/uimanager/UIViewOperationQueue;IJLcom/facebook/react/uimanager/UIViewOperationQueue$1;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/facebook/react/uimanager/UIViewOperationQueue$UpdateInstanceHandleOperation;-><init>(Lcom/facebook/react/uimanager/UIViewOperationQueue;IJ)V

    return-void
.end method


# virtual methods
.method public execute()V
    .locals 4

    iget-object v0, p0, Lcom/facebook/react/uimanager/UIViewOperationQueue$UpdateInstanceHandleOperation;->this$0:Lcom/facebook/react/uimanager/UIViewOperationQueue;

    invoke-static {v0}, Lcom/facebook/react/uimanager/UIViewOperationQueue;->access$000(Lcom/facebook/react/uimanager/UIViewOperationQueue;)Lcom/facebook/react/uimanager/NativeViewHierarchyManager;

    move-result-object v0

    iget v1, p0, Lcom/facebook/react/uimanager/UIViewOperationQueue$ViewOperation;->mTag:I

    iget-wide v2, p0, Lcom/facebook/react/uimanager/UIViewOperationQueue$UpdateInstanceHandleOperation;->mInstanceHandle:J

    invoke-virtual {v0, v1, v2, v3}, Lcom/facebook/react/uimanager/NativeViewHierarchyManager;->updateInstanceHandle(IJ)V

    return-void
.end method
