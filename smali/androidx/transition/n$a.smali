.class Landroidx/transition/n$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/ViewTreeObserver$OnPreDrawListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/transition/n;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic k:Landroidx/transition/n;


# direct methods
.method constructor <init>(Landroidx/transition/n;)V
    .locals 0

    iput-object p1, p0, Landroidx/transition/n$a;->k:Landroidx/transition/n;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onPreDraw()Z
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/transition/n$a;->k:Landroidx/transition/n;

    .line 2
    .line 3
    invoke-static {v0}, Landroidx/core/view/w0;->h0(Landroid/view/View;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Landroidx/transition/n$a;->k:Landroidx/transition/n;

    .line 7
    .line 8
    iget-object v1, v0, Landroidx/transition/n;->k:Landroid/view/ViewGroup;

    .line 9
    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    iget-object v0, v0, Landroidx/transition/n;->l:Landroid/view/View;

    .line 13
    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    invoke-virtual {v1, v0}, Landroid/view/ViewGroup;->endViewTransition(Landroid/view/View;)V

    .line 17
    .line 18
    .line 19
    iget-object v0, p0, Landroidx/transition/n$a;->k:Landroidx/transition/n;

    .line 20
    .line 21
    iget-object v0, v0, Landroidx/transition/n;->k:Landroid/view/ViewGroup;

    .line 22
    .line 23
    invoke-static {v0}, Landroidx/core/view/w0;->h0(Landroid/view/View;)V

    .line 24
    .line 25
    .line 26
    iget-object v0, p0, Landroidx/transition/n$a;->k:Landroidx/transition/n;

    .line 27
    .line 28
    const/4 v1, 0x0

    .line 29
    iput-object v1, v0, Landroidx/transition/n;->k:Landroid/view/ViewGroup;

    .line 30
    .line 31
    iput-object v1, v0, Landroidx/transition/n;->l:Landroid/view/View;

    .line 32
    .line 33
    :cond_0
    const/4 v0, 0x1

    .line 34
    return v0
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
.end method
