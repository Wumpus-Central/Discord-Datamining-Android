.class Lcom/facebook/react/ReactInstanceManager$9;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/react/ReactInstanceManager;->attachRootViewToInstance(Lcom/facebook/react/uimanager/ReactRoot;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/facebook/react/ReactInstanceManager;

.field final synthetic val$reactRoot:Lcom/facebook/react/uimanager/ReactRoot;

.field final synthetic val$rootTag:I


# direct methods
.method constructor <init>(Lcom/facebook/react/ReactInstanceManager;ILcom/facebook/react/uimanager/ReactRoot;)V
    .locals 0

    iput-object p1, p0, Lcom/facebook/react/ReactInstanceManager$9;->this$0:Lcom/facebook/react/ReactInstanceManager;

    iput p2, p0, Lcom/facebook/react/ReactInstanceManager$9;->val$rootTag:I

    iput-object p3, p0, Lcom/facebook/react/ReactInstanceManager$9;->val$reactRoot:Lcom/facebook/react/uimanager/ReactRoot;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .line 1
    const-string v0, "pre_rootView.onAttachedToReactInstance"

    .line 2
    .line 3
    iget v1, p0, Lcom/facebook/react/ReactInstanceManager$9;->val$rootTag:I

    .line 4
    .line 5
    const-wide/16 v2, 0x0

    .line 6
    .line 7
    invoke-static {v2, v3, v0, v1}, Lg6/a;->e(JLjava/lang/String;I)V

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, Lcom/facebook/react/ReactInstanceManager$9;->val$reactRoot:Lcom/facebook/react/uimanager/ReactRoot;

    .line 11
    .line 12
    const/16 v1, 0x65

    .line 13
    .line 14
    invoke-interface {v0, v1}, Lcom/facebook/react/uimanager/ReactRoot;->onStage(I)V

    .line 15
    .line 16
    .line 17
    return-void
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
.end method
