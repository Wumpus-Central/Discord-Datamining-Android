.class Landroidx/fragment/app/d$b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/fragment/app/d$b;->onAnimationEnd(Landroid/view/animation/Animation;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic k:Landroidx/fragment/app/d$b;


# direct methods
.method constructor <init>(Landroidx/fragment/app/d$b;)V
    .locals 0

    iput-object p1, p0, Landroidx/fragment/app/d$b$a;->k:Landroidx/fragment/app/d$b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/d$b$a;->k:Landroidx/fragment/app/d$b;

    .line 2
    .line 3
    iget-object v0, v0, Landroidx/fragment/app/d$b;->b:Landroidx/fragment/app/Fragment;

    .line 4
    .line 5
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->getAnimatingAway()Landroid/view/View;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget-object v0, p0, Landroidx/fragment/app/d$b$a;->k:Landroidx/fragment/app/d$b;

    .line 12
    .line 13
    iget-object v0, v0, Landroidx/fragment/app/d$b;->b:Landroidx/fragment/app/Fragment;

    .line 14
    .line 15
    const/4 v1, 0x0

    .line 16
    invoke-virtual {v0, v1}, Landroidx/fragment/app/Fragment;->setAnimatingAway(Landroid/view/View;)V

    .line 17
    .line 18
    .line 19
    iget-object v0, p0, Landroidx/fragment/app/d$b$a;->k:Landroidx/fragment/app/d$b;

    .line 20
    .line 21
    iget-object v1, v0, Landroidx/fragment/app/d$b;->c:Landroidx/fragment/app/o$g;

    .line 22
    .line 23
    iget-object v2, v0, Landroidx/fragment/app/d$b;->b:Landroidx/fragment/app/Fragment;

    .line 24
    .line 25
    iget-object v0, v0, Landroidx/fragment/app/d$b;->d:Landroidx/core/os/e;

    .line 26
    .line 27
    invoke-interface {v1, v2, v0}, Landroidx/fragment/app/o$g;->a(Landroidx/fragment/app/Fragment;Landroidx/core/os/e;)V

    .line 28
    .line 29
    .line 30
    :cond_0
    return-void
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
