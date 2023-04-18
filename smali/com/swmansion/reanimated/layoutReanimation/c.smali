.class public final synthetic Lcom/swmansion/reanimated/layoutReanimation/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic k:Lcom/facebook/react/uimanager/NativeViewHierarchyManager;

.field public final synthetic l:Landroid/view/View;


# direct methods
.method public synthetic constructor <init>(Lcom/facebook/react/uimanager/NativeViewHierarchyManager;Landroid/view/View;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/swmansion/reanimated/layoutReanimation/c;->k:Lcom/facebook/react/uimanager/NativeViewHierarchyManager;

    iput-object p2, p0, Lcom/swmansion/reanimated/layoutReanimation/c;->l:Landroid/view/View;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lcom/swmansion/reanimated/layoutReanimation/c;->k:Lcom/facebook/react/uimanager/NativeViewHierarchyManager;

    iget-object v1, p0, Lcom/swmansion/reanimated/layoutReanimation/c;->l:Landroid/view/View;

    invoke-static {v0, v1}, Lcom/swmansion/reanimated/layoutReanimation/ReaLayoutAnimator;->b(Lcom/facebook/react/uimanager/NativeViewHierarchyManager;Landroid/view/View;)V

    return-void
.end method
