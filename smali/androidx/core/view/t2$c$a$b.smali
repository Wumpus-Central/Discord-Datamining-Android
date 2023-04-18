.class Landroidx/core/view/t2$c$a$b;
.super Landroid/animation/AnimatorListenerAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/core/view/t2$c$a;->onApplyWindowInsets(Landroid/view/View;Landroid/view/WindowInsets;)Landroid/view/WindowInsets;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroidx/core/view/t2;

.field final synthetic b:Landroid/view/View;

.field final synthetic c:Landroidx/core/view/t2$c$a;


# direct methods
.method constructor <init>(Landroidx/core/view/t2$c$a;Landroidx/core/view/t2;Landroid/view/View;)V
    .locals 0

    iput-object p1, p0, Landroidx/core/view/t2$c$a$b;->c:Landroidx/core/view/t2$c$a;

    iput-object p2, p0, Landroidx/core/view/t2$c$a$b;->a:Landroidx/core/view/t2;

    iput-object p3, p0, Landroidx/core/view/t2$c$a$b;->b:Landroid/view/View;

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationEnd(Landroid/animation/Animator;)V
    .locals 1

    .line 1
    iget-object p1, p0, Landroidx/core/view/t2$c$a$b;->a:Landroidx/core/view/t2;

    .line 2
    .line 3
    const/high16 v0, 0x3f800000    # 1.0f

    .line 4
    .line 5
    invoke-virtual {p1, v0}, Landroidx/core/view/t2;->d(F)V

    .line 6
    .line 7
    .line 8
    iget-object p1, p0, Landroidx/core/view/t2$c$a$b;->b:Landroid/view/View;

    .line 9
    .line 10
    iget-object v0, p0, Landroidx/core/view/t2$c$a$b;->a:Landroidx/core/view/t2;

    .line 11
    .line 12
    invoke-static {p1, v0}, Landroidx/core/view/t2$c;->g(Landroid/view/View;Landroidx/core/view/t2;)V

    .line 13
    .line 14
    .line 15
    return-void
    .line 16
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
