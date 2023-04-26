.class Lcom/facebook/react/views/modal/ReactModalHostView$DialogRootViewGroup$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/facebook/react/uimanager/FabricViewStateManager$StateUpdateCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/react/views/modal/ReactModalHostView$DialogRootViewGroup;->updateState(II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/facebook/react/views/modal/ReactModalHostView$DialogRootViewGroup;

.field final synthetic val$realHeight:F

.field final synthetic val$realWidth:F


# direct methods
.method constructor <init>(Lcom/facebook/react/views/modal/ReactModalHostView$DialogRootViewGroup;FF)V
    .locals 0

    iput-object p1, p0, Lcom/facebook/react/views/modal/ReactModalHostView$DialogRootViewGroup$2;->this$0:Lcom/facebook/react/views/modal/ReactModalHostView$DialogRootViewGroup;

    iput p2, p0, Lcom/facebook/react/views/modal/ReactModalHostView$DialogRootViewGroup$2;->val$realWidth:F

    iput p3, p0, Lcom/facebook/react/views/modal/ReactModalHostView$DialogRootViewGroup$2;->val$realHeight:F

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getStateUpdate()Lcom/facebook/react/bridge/WritableMap;
    .locals 4

    .line 1
    new-instance v0, Lcom/facebook/react/bridge/WritableNativeMap;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/facebook/react/bridge/WritableNativeMap;-><init>()V

    .line 4
    .line 5
    .line 6
    iget v1, p0, Lcom/facebook/react/views/modal/ReactModalHostView$DialogRootViewGroup$2;->val$realWidth:F

    .line 7
    .line 8
    float-to-double v1, v1

    .line 9
    const-string v3, "screenWidth"

    .line 10
    .line 11
    invoke-interface {v0, v3, v1, v2}, Lcom/facebook/react/bridge/WritableMap;->putDouble(Ljava/lang/String;D)V

    .line 12
    .line 13
    .line 14
    iget v1, p0, Lcom/facebook/react/views/modal/ReactModalHostView$DialogRootViewGroup$2;->val$realHeight:F

    .line 15
    .line 16
    float-to-double v1, v1

    .line 17
    const-string v3, "screenHeight"

    .line 18
    .line 19
    invoke-interface {v0, v3, v1, v2}, Lcom/facebook/react/bridge/WritableMap;->putDouble(Ljava/lang/String;D)V

    .line 20
    .line 21
    .line 22
    return-object v0
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
.end method
