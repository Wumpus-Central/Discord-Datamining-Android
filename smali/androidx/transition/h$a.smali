.class Landroidx/transition/h$a;
.super Landroidx/transition/z;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/transition/h;->a(Landroid/view/View;FF)Landroid/animation/Animator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroid/view/View;

.field final synthetic b:Landroidx/transition/h;


# direct methods
.method constructor <init>(Landroidx/transition/h;Landroid/view/View;)V
    .locals 0

    iput-object p1, p0, Landroidx/transition/h$a;->b:Landroidx/transition/h;

    iput-object p2, p0, Landroidx/transition/h$a;->a:Landroid/view/View;

    invoke-direct {p0}, Landroidx/transition/z;-><init>()V

    return-void
.end method


# virtual methods
.method public onTransitionEnd(Landroidx/transition/Transition;)V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/transition/h$a;->a:Landroid/view/View;

    .line 2
    .line 3
    const/high16 v1, 0x3f800000    # 1.0f

    .line 4
    .line 5
    invoke-static {v0, v1}, Landroidx/transition/p0;->h(Landroid/view/View;F)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Landroidx/transition/h$a;->a:Landroid/view/View;

    .line 9
    .line 10
    invoke-static {v0}, Landroidx/transition/p0;->a(Landroid/view/View;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p1, p0}, Landroidx/transition/Transition;->removeListener(Landroidx/transition/Transition$g;)Landroidx/transition/Transition;

    .line 14
    .line 15
    .line 16
    return-void
    .line 17
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
.end method
