.class Landroidx/transition/d1$a;
.super Landroidx/transition/z;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/transition/d1;->onDisappear(Landroid/view/ViewGroup;Landroidx/transition/f0;ILandroidx/transition/f0;I)Landroid/animation/Animator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroid/view/ViewGroup;

.field final synthetic b:Landroid/view/View;

.field final synthetic c:Landroid/view/View;

.field final synthetic d:Landroidx/transition/d1;


# direct methods
.method constructor <init>(Landroidx/transition/d1;Landroid/view/ViewGroup;Landroid/view/View;Landroid/view/View;)V
    .locals 0

    iput-object p1, p0, Landroidx/transition/d1$a;->d:Landroidx/transition/d1;

    iput-object p2, p0, Landroidx/transition/d1$a;->a:Landroid/view/ViewGroup;

    iput-object p3, p0, Landroidx/transition/d1$a;->b:Landroid/view/View;

    iput-object p4, p0, Landroidx/transition/d1$a;->c:Landroid/view/View;

    invoke-direct {p0}, Landroidx/transition/z;-><init>()V

    return-void
.end method


# virtual methods
.method public onTransitionEnd(Landroidx/transition/Transition;)V
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/transition/d1$a;->c:Landroid/view/View;

    .line 2
    .line 3
    sget v1, Landroidx/transition/t;->d:I

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-virtual {v0, v1, v2}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, Landroidx/transition/d1$a;->a:Landroid/view/ViewGroup;

    .line 10
    .line 11
    invoke-static {v0}, Landroidx/transition/m0;->b(Landroid/view/ViewGroup;)Landroidx/transition/j0;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iget-object v1, p0, Landroidx/transition/d1$a;->b:Landroid/view/View;

    .line 16
    .line 17
    invoke-interface {v0, v1}, Landroidx/transition/j0;->d(Landroid/view/View;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p1, p0}, Landroidx/transition/Transition;->removeListener(Landroidx/transition/Transition$g;)Landroidx/transition/Transition;

    .line 21
    .line 22
    .line 23
    return-void
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
.end method

.method public onTransitionPause(Landroidx/transition/Transition;)V
    .locals 1

    iget-object p1, p0, Landroidx/transition/d1$a;->a:Landroid/view/ViewGroup;

    invoke-static {p1}, Landroidx/transition/m0;->b(Landroid/view/ViewGroup;)Landroidx/transition/j0;

    move-result-object p1

    iget-object v0, p0, Landroidx/transition/d1$a;->b:Landroid/view/View;

    invoke-interface {p1, v0}, Landroidx/transition/j0;->d(Landroid/view/View;)V

    return-void
.end method

.method public onTransitionResume(Landroidx/transition/Transition;)V
    .locals 1

    .line 1
    iget-object p1, p0, Landroidx/transition/d1$a;->b:Landroid/view/View;

    .line 2
    .line 3
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    if-nez p1, :cond_0

    .line 8
    .line 9
    iget-object p1, p0, Landroidx/transition/d1$a;->a:Landroid/view/ViewGroup;

    .line 10
    .line 11
    invoke-static {p1}, Landroidx/transition/m0;->b(Landroid/view/ViewGroup;)Landroidx/transition/j0;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    iget-object v0, p0, Landroidx/transition/d1$a;->b:Landroid/view/View;

    .line 16
    .line 17
    invoke-interface {p1, v0}, Landroidx/transition/j0;->c(Landroid/view/View;)V

    .line 18
    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    iget-object p1, p0, Landroidx/transition/d1$a;->d:Landroidx/transition/d1;

    .line 22
    .line 23
    invoke-virtual {p1}, Landroidx/transition/Transition;->cancel()V

    .line 24
    .line 25
    .line 26
    :goto_0
    return-void
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
.end method
