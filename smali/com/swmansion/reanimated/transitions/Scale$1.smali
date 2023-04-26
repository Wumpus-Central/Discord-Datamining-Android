.class Lcom/swmansion/reanimated/transitions/Scale$1;
.super Landroidx/transition/z;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/swmansion/reanimated/transitions/Scale;->createAnimation(Landroid/view/View;FFLandroidx/transition/f0;)Landroid/animation/Animator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/swmansion/reanimated/transitions/Scale;

.field final synthetic val$initialScaleX:F

.field final synthetic val$initialScaleY:F

.field final synthetic val$view:Landroid/view/View;


# direct methods
.method constructor <init>(Lcom/swmansion/reanimated/transitions/Scale;Landroid/view/View;FF)V
    .locals 0

    iput-object p1, p0, Lcom/swmansion/reanimated/transitions/Scale$1;->this$0:Lcom/swmansion/reanimated/transitions/Scale;

    iput-object p2, p0, Lcom/swmansion/reanimated/transitions/Scale$1;->val$view:Landroid/view/View;

    iput p3, p0, Lcom/swmansion/reanimated/transitions/Scale$1;->val$initialScaleX:F

    iput p4, p0, Lcom/swmansion/reanimated/transitions/Scale$1;->val$initialScaleY:F

    invoke-direct {p0}, Landroidx/transition/z;-><init>()V

    return-void
.end method


# virtual methods
.method public onTransitionEnd(Landroidx/transition/Transition;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/swmansion/reanimated/transitions/Scale$1;->val$view:Landroid/view/View;

    .line 2
    .line 3
    iget v1, p0, Lcom/swmansion/reanimated/transitions/Scale$1;->val$initialScaleX:F

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Landroid/view/View;->setScaleX(F)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lcom/swmansion/reanimated/transitions/Scale$1;->val$view:Landroid/view/View;

    .line 9
    .line 10
    iget v1, p0, Lcom/swmansion/reanimated/transitions/Scale$1;->val$initialScaleY:F

    .line 11
    .line 12
    invoke-virtual {v0, v1}, Landroid/view/View;->setScaleY(F)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p1, p0}, Landroidx/transition/Transition;->removeListener(Landroidx/transition/Transition$g;)Landroidx/transition/Transition;

    .line 16
    .line 17
    .line 18
    return-void
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
.end method
