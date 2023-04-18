.class Lcom/facebook/react/uimanager/UIViewOperationQueue$SetLayoutAnimationEnabledOperation;
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
    name = "SetLayoutAnimationEnabledOperation"
.end annotation


# instance fields
.field private final mEnabled:Z

.field final synthetic this$0:Lcom/facebook/react/uimanager/UIViewOperationQueue;


# direct methods
.method private constructor <init>(Lcom/facebook/react/uimanager/UIViewOperationQueue;Z)V
    .locals 0

    .line 2
    iput-object p1, p0, Lcom/facebook/react/uimanager/UIViewOperationQueue$SetLayoutAnimationEnabledOperation;->this$0:Lcom/facebook/react/uimanager/UIViewOperationQueue;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-boolean p2, p0, Lcom/facebook/react/uimanager/UIViewOperationQueue$SetLayoutAnimationEnabledOperation;->mEnabled:Z

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/react/uimanager/UIViewOperationQueue;ZLcom/facebook/react/uimanager/UIViewOperationQueue$1;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/facebook/react/uimanager/UIViewOperationQueue$SetLayoutAnimationEnabledOperation;-><init>(Lcom/facebook/react/uimanager/UIViewOperationQueue;Z)V

    return-void
.end method


# virtual methods
.method public execute()V
    .locals 2

    iget-object v0, p0, Lcom/facebook/react/uimanager/UIViewOperationQueue$SetLayoutAnimationEnabledOperation;->this$0:Lcom/facebook/react/uimanager/UIViewOperationQueue;

    invoke-static {v0}, Lcom/facebook/react/uimanager/UIViewOperationQueue;->access$000(Lcom/facebook/react/uimanager/UIViewOperationQueue;)Lcom/facebook/react/uimanager/NativeViewHierarchyManager;

    move-result-object v0

    iget-boolean v1, p0, Lcom/facebook/react/uimanager/UIViewOperationQueue$SetLayoutAnimationEnabledOperation;->mEnabled:Z

    invoke-virtual {v0, v1}, Lcom/facebook/react/uimanager/NativeViewHierarchyManager;->setLayoutAnimationEnabled(Z)V

    return-void
.end method
