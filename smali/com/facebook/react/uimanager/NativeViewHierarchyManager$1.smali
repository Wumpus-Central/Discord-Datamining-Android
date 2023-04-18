.class Lcom/facebook/react/uimanager/NativeViewHierarchyManager$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/facebook/react/uimanager/layoutanimation/LayoutAnimationListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/react/uimanager/NativeViewHierarchyManager;->manageChildren(I[I[Lcom/facebook/react/uimanager/ViewAtIndex;[I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/facebook/react/uimanager/NativeViewHierarchyManager;

.field final synthetic val$pendingDeletionTags:Ljava/util/Set;

.field final synthetic val$tag:I

.field final synthetic val$viewManager:Lcom/facebook/react/uimanager/ViewGroupManager;

.field final synthetic val$viewToDestroy:Landroid/view/View;

.field final synthetic val$viewToManage:Landroid/view/ViewGroup;


# direct methods
.method constructor <init>(Lcom/facebook/react/uimanager/NativeViewHierarchyManager;Lcom/facebook/react/uimanager/ViewGroupManager;Landroid/view/ViewGroup;Landroid/view/View;Ljava/util/Set;I)V
    .locals 0

    iput-object p1, p0, Lcom/facebook/react/uimanager/NativeViewHierarchyManager$1;->this$0:Lcom/facebook/react/uimanager/NativeViewHierarchyManager;

    iput-object p2, p0, Lcom/facebook/react/uimanager/NativeViewHierarchyManager$1;->val$viewManager:Lcom/facebook/react/uimanager/ViewGroupManager;

    iput-object p3, p0, Lcom/facebook/react/uimanager/NativeViewHierarchyManager$1;->val$viewToManage:Landroid/view/ViewGroup;

    iput-object p4, p0, Lcom/facebook/react/uimanager/NativeViewHierarchyManager$1;->val$viewToDestroy:Landroid/view/View;

    iput-object p5, p0, Lcom/facebook/react/uimanager/NativeViewHierarchyManager$1;->val$pendingDeletionTags:Ljava/util/Set;

    iput p6, p0, Lcom/facebook/react/uimanager/NativeViewHierarchyManager$1;->val$tag:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationEnd()V
    .locals 3

    .line 1
    invoke-static {}, Lcom/facebook/react/bridge/UiThreadUtil;->assertOnUiThread()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/facebook/react/uimanager/NativeViewHierarchyManager$1;->val$viewManager:Lcom/facebook/react/uimanager/ViewGroupManager;

    .line 5
    .line 6
    iget-object v1, p0, Lcom/facebook/react/uimanager/NativeViewHierarchyManager$1;->val$viewToManage:Landroid/view/ViewGroup;

    .line 7
    .line 8
    iget-object v2, p0, Lcom/facebook/react/uimanager/NativeViewHierarchyManager$1;->val$viewToDestroy:Landroid/view/View;

    .line 9
    .line 10
    invoke-virtual {v0, v1, v2}, Lcom/facebook/react/uimanager/ViewGroupManager;->removeView(Landroid/view/ViewGroup;Landroid/view/View;)V

    .line 11
    .line 12
    .line 13
    iget-object v0, p0, Lcom/facebook/react/uimanager/NativeViewHierarchyManager$1;->this$0:Lcom/facebook/react/uimanager/NativeViewHierarchyManager;

    .line 14
    .line 15
    iget-object v1, p0, Lcom/facebook/react/uimanager/NativeViewHierarchyManager$1;->val$viewToDestroy:Landroid/view/View;

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Lcom/facebook/react/uimanager/NativeViewHierarchyManager;->dropView(Landroid/view/View;)V

    .line 18
    .line 19
    .line 20
    iget-object v0, p0, Lcom/facebook/react/uimanager/NativeViewHierarchyManager$1;->val$pendingDeletionTags:Ljava/util/Set;

    .line 21
    .line 22
    iget-object v1, p0, Lcom/facebook/react/uimanager/NativeViewHierarchyManager$1;->val$viewToDestroy:Landroid/view/View;

    .line 23
    .line 24
    invoke-virtual {v1}, Landroid/view/View;->getId()I

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    invoke-interface {v0, v1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    iget-object v0, p0, Lcom/facebook/react/uimanager/NativeViewHierarchyManager$1;->val$pendingDeletionTags:Ljava/util/Set;

    .line 36
    .line 37
    invoke-interface {v0}, Ljava/util/Set;->isEmpty()Z

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    if-eqz v0, :cond_0

    .line 42
    .line 43
    iget-object v0, p0, Lcom/facebook/react/uimanager/NativeViewHierarchyManager$1;->this$0:Lcom/facebook/react/uimanager/NativeViewHierarchyManager;

    .line 44
    .line 45
    invoke-static {v0}, Lcom/facebook/react/uimanager/NativeViewHierarchyManager;->access$000(Lcom/facebook/react/uimanager/NativeViewHierarchyManager;)Ljava/util/HashMap;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    iget v1, p0, Lcom/facebook/react/uimanager/NativeViewHierarchyManager$1;->val$tag:I

    .line 50
    .line 51
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    invoke-virtual {v0, v1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    :cond_0
    return-void
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
.end method
