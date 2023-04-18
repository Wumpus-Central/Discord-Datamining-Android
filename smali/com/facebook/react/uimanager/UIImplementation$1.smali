.class Lcom/facebook/react/uimanager/UIImplementation$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/react/uimanager/UIImplementation;->registerRootView(Landroid/view/View;ILcom/facebook/react/uimanager/ThemedReactContext;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/facebook/react/uimanager/UIImplementation;

.field final synthetic val$rootCSSNode:Lcom/facebook/react/uimanager/ReactShadowNode;


# direct methods
.method constructor <init>(Lcom/facebook/react/uimanager/UIImplementation;Lcom/facebook/react/uimanager/ReactShadowNode;)V
    .locals 0

    iput-object p1, p0, Lcom/facebook/react/uimanager/UIImplementation$1;->this$0:Lcom/facebook/react/uimanager/UIImplementation;

    iput-object p2, p0, Lcom/facebook/react/uimanager/UIImplementation$1;->val$rootCSSNode:Lcom/facebook/react/uimanager/ReactShadowNode;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lcom/facebook/react/uimanager/UIImplementation$1;->this$0:Lcom/facebook/react/uimanager/UIImplementation;

    iget-object v0, v0, Lcom/facebook/react/uimanager/UIImplementation;->mShadowNodeRegistry:Lcom/facebook/react/uimanager/ShadowNodeRegistry;

    iget-object v1, p0, Lcom/facebook/react/uimanager/UIImplementation$1;->val$rootCSSNode:Lcom/facebook/react/uimanager/ReactShadowNode;

    invoke-virtual {v0, v1}, Lcom/facebook/react/uimanager/ShadowNodeRegistry;->addRootNode(Lcom/facebook/react/uimanager/ReactShadowNode;)V

    return-void
.end method
