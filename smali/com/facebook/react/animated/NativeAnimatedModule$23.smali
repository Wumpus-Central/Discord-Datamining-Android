.class Lcom/facebook/react/animated/NativeAnimatedModule$23;
.super Lcom/facebook/react/animated/NativeAnimatedModule$UIThreadOperation;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/react/animated/NativeAnimatedModule;->getValue(DLcom/facebook/react/bridge/Callback;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/facebook/react/animated/NativeAnimatedModule;

.field final synthetic val$animatedValueNodeTag:I

.field final synthetic val$callback:Lcom/facebook/react/bridge/Callback;


# direct methods
.method constructor <init>(Lcom/facebook/react/animated/NativeAnimatedModule;ILcom/facebook/react/bridge/Callback;)V
    .locals 0

    iput-object p1, p0, Lcom/facebook/react/animated/NativeAnimatedModule$23;->this$0:Lcom/facebook/react/animated/NativeAnimatedModule;

    iput p2, p0, Lcom/facebook/react/animated/NativeAnimatedModule$23;->val$animatedValueNodeTag:I

    iput-object p3, p0, Lcom/facebook/react/animated/NativeAnimatedModule$23;->val$callback:Lcom/facebook/react/bridge/Callback;

    const/4 p2, 0x0

    invoke-direct {p0, p1, p2}, Lcom/facebook/react/animated/NativeAnimatedModule$UIThreadOperation;-><init>(Lcom/facebook/react/animated/NativeAnimatedModule;Lcom/facebook/react/animated/NativeAnimatedModule$1;)V

    return-void
.end method


# virtual methods
.method public execute(Lcom/facebook/react/animated/NativeAnimatedNodesManager;)V
    .locals 2

    iget v0, p0, Lcom/facebook/react/animated/NativeAnimatedModule$23;->val$animatedValueNodeTag:I

    iget-object v1, p0, Lcom/facebook/react/animated/NativeAnimatedModule$23;->val$callback:Lcom/facebook/react/bridge/Callback;

    invoke-virtual {p1, v0, v1}, Lcom/facebook/react/animated/NativeAnimatedNodesManager;->getValue(ILcom/facebook/react/bridge/Callback;)V

    return-void
.end method
