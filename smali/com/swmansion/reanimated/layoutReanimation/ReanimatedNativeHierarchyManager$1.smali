.class Lcom/swmansion/reanimated/layoutReanimation/ReanimatedNativeHierarchyManager$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/swmansion/reanimated/layoutReanimation/ReanimatedNativeHierarchyManager;->manageChildren(I[I[Lcom/facebook/react/uimanager/ViewAtIndex;[I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/swmansion/reanimated/layoutReanimation/ReanimatedNativeHierarchyManager;

.field final synthetic val$toBeRemovedChildren:Ljava/util/ArrayList;

.field final synthetic val$view:Landroid/view/View;

.field final synthetic val$viewGroup:Landroid/view/ViewGroup;

.field final synthetic val$viewGroupManager:Lcom/facebook/react/uimanager/ViewGroupManager;


# direct methods
.method constructor <init>(Lcom/swmansion/reanimated/layoutReanimation/ReanimatedNativeHierarchyManager;Ljava/util/ArrayList;Landroid/view/View;Lcom/facebook/react/uimanager/ViewGroupManager;Landroid/view/ViewGroup;)V
    .locals 0

    iput-object p1, p0, Lcom/swmansion/reanimated/layoutReanimation/ReanimatedNativeHierarchyManager$1;->this$0:Lcom/swmansion/reanimated/layoutReanimation/ReanimatedNativeHierarchyManager;

    iput-object p2, p0, Lcom/swmansion/reanimated/layoutReanimation/ReanimatedNativeHierarchyManager$1;->val$toBeRemovedChildren:Ljava/util/ArrayList;

    iput-object p3, p0, Lcom/swmansion/reanimated/layoutReanimation/ReanimatedNativeHierarchyManager$1;->val$view:Landroid/view/View;

    iput-object p4, p0, Lcom/swmansion/reanimated/layoutReanimation/ReanimatedNativeHierarchyManager$1;->val$viewGroupManager:Lcom/facebook/react/uimanager/ViewGroupManager;

    iput-object p5, p0, Lcom/swmansion/reanimated/layoutReanimation/ReanimatedNativeHierarchyManager$1;->val$viewGroup:Landroid/view/ViewGroup;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/swmansion/reanimated/layoutReanimation/ReanimatedNativeHierarchyManager$1;->val$toBeRemovedChildren:Ljava/util/ArrayList;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/swmansion/reanimated/layoutReanimation/ReanimatedNativeHierarchyManager$1;->val$view:Landroid/view/View;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lcom/swmansion/reanimated/layoutReanimation/ReanimatedNativeHierarchyManager$1;->val$viewGroupManager:Lcom/facebook/react/uimanager/ViewGroupManager;

    .line 9
    .line 10
    iget-object v1, p0, Lcom/swmansion/reanimated/layoutReanimation/ReanimatedNativeHierarchyManager$1;->val$viewGroup:Landroid/view/ViewGroup;

    .line 11
    .line 12
    iget-object v2, p0, Lcom/swmansion/reanimated/layoutReanimation/ReanimatedNativeHierarchyManager$1;->val$view:Landroid/view/View;

    .line 13
    .line 14
    invoke-virtual {v0, v1, v2}, Lcom/facebook/react/uimanager/ViewGroupManager;->removeView(Landroid/view/ViewGroup;Landroid/view/View;)V

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
.end method
