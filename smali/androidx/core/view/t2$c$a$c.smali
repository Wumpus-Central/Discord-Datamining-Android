.class Landroidx/core/view/t2$c$a$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/core/view/t2$c$a;->onApplyWindowInsets(Landroid/view/View;Landroid/view/WindowInsets;)Landroid/view/WindowInsets;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic k:Landroid/view/View;

.field final synthetic l:Landroidx/core/view/t2;

.field final synthetic m:Landroidx/core/view/t2$a;

.field final synthetic n:Landroid/animation/ValueAnimator;

.field final synthetic o:Landroidx/core/view/t2$c$a;


# direct methods
.method constructor <init>(Landroidx/core/view/t2$c$a;Landroid/view/View;Landroidx/core/view/t2;Landroidx/core/view/t2$a;Landroid/animation/ValueAnimator;)V
    .locals 0

    iput-object p1, p0, Landroidx/core/view/t2$c$a$c;->o:Landroidx/core/view/t2$c$a;

    iput-object p2, p0, Landroidx/core/view/t2$c$a$c;->k:Landroid/view/View;

    iput-object p3, p0, Landroidx/core/view/t2$c$a$c;->l:Landroidx/core/view/t2;

    iput-object p4, p0, Landroidx/core/view/t2$c$a$c;->m:Landroidx/core/view/t2$a;

    iput-object p5, p0, Landroidx/core/view/t2$c$a$c;->n:Landroid/animation/ValueAnimator;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/core/view/t2$c$a$c;->k:Landroid/view/View;

    .line 2
    .line 3
    iget-object v1, p0, Landroidx/core/view/t2$c$a$c;->l:Landroidx/core/view/t2;

    .line 4
    .line 5
    iget-object v2, p0, Landroidx/core/view/t2$c$a$c;->m:Landroidx/core/view/t2$a;

    .line 6
    .line 7
    invoke-static {v0, v1, v2}, Landroidx/core/view/t2$c;->j(Landroid/view/View;Landroidx/core/view/t2;Landroidx/core/view/t2$a;)V

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, Landroidx/core/view/t2$c$a$c;->n:Landroid/animation/ValueAnimator;

    .line 11
    .line 12
    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->start()V

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
