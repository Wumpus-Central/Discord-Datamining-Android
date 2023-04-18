.class Lcom/facebook/react/animated/NativeAnimatedModule$7;
.super Lcom/facebook/react/animated/NativeAnimatedModule$UIThreadOperation;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/react/animated/NativeAnimatedModule;->startListeningToAnimatedNodeValue(D)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/facebook/react/animated/NativeAnimatedModule;

.field final synthetic val$listener:Lcom/facebook/react/animated/AnimatedNodeValueListener;

.field final synthetic val$tag:I


# direct methods
.method constructor <init>(Lcom/facebook/react/animated/NativeAnimatedModule;ILcom/facebook/react/animated/AnimatedNodeValueListener;)V
    .locals 0

    iput-object p1, p0, Lcom/facebook/react/animated/NativeAnimatedModule$7;->this$0:Lcom/facebook/react/animated/NativeAnimatedModule;

    iput p2, p0, Lcom/facebook/react/animated/NativeAnimatedModule$7;->val$tag:I

    iput-object p3, p0, Lcom/facebook/react/animated/NativeAnimatedModule$7;->val$listener:Lcom/facebook/react/animated/AnimatedNodeValueListener;

    const/4 p2, 0x0

    invoke-direct {p0, p1, p2}, Lcom/facebook/react/animated/NativeAnimatedModule$UIThreadOperation;-><init>(Lcom/facebook/react/animated/NativeAnimatedModule;Lcom/facebook/react/animated/NativeAnimatedModule$1;)V

    return-void
.end method


# virtual methods
.method public execute(Lcom/facebook/react/animated/NativeAnimatedNodesManager;)V
    .locals 2

    iget v0, p0, Lcom/facebook/react/animated/NativeAnimatedModule$7;->val$tag:I

    iget-object v1, p0, Lcom/facebook/react/animated/NativeAnimatedModule$7;->val$listener:Lcom/facebook/react/animated/AnimatedNodeValueListener;

    invoke-virtual {p1, v0, v1}, Lcom/facebook/react/animated/NativeAnimatedNodesManager;->startListeningToAnimatedNodeValue(ILcom/facebook/react/animated/AnimatedNodeValueListener;)V

    return-void
.end method
