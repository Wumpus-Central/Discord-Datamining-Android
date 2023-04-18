.class Landroidx/appcompat/widget/z0$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/AbsListView$OnScrollListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/appcompat/widget/z0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "e"
.end annotation


# instance fields
.field final synthetic a:Landroidx/appcompat/widget/z0;


# direct methods
.method constructor <init>(Landroidx/appcompat/widget/z0;)V
    .locals 0

    iput-object p1, p0, Landroidx/appcompat/widget/z0$e;->a:Landroidx/appcompat/widget/z0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onScroll(Landroid/widget/AbsListView;III)V
    .locals 0

    return-void
.end method

.method public onScrollStateChanged(Landroid/widget/AbsListView;I)V
    .locals 0

    .line 1
    const/4 p1, 0x1

    .line 2
    if-ne p2, p1, :cond_0

    .line 3
    .line 4
    iget-object p1, p0, Landroidx/appcompat/widget/z0$e;->a:Landroidx/appcompat/widget/z0;

    .line 5
    .line 6
    invoke-virtual {p1}, Landroidx/appcompat/widget/z0;->y()Z

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    if-nez p1, :cond_0

    .line 11
    .line 12
    iget-object p1, p0, Landroidx/appcompat/widget/z0$e;->a:Landroidx/appcompat/widget/z0;

    .line 13
    .line 14
    iget-object p1, p1, Landroidx/appcompat/widget/z0;->P:Landroid/widget/PopupWindow;

    .line 15
    .line 16
    invoke-virtual {p1}, Landroid/widget/PopupWindow;->getContentView()Landroid/view/View;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    if-eqz p1, :cond_0

    .line 21
    .line 22
    iget-object p1, p0, Landroidx/appcompat/widget/z0$e;->a:Landroidx/appcompat/widget/z0;

    .line 23
    .line 24
    iget-object p2, p1, Landroidx/appcompat/widget/z0;->L:Landroid/os/Handler;

    .line 25
    .line 26
    iget-object p1, p1, Landroidx/appcompat/widget/z0;->G:Landroidx/appcompat/widget/z0$g;

    .line 27
    .line 28
    invoke-virtual {p2, p1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 29
    .line 30
    .line 31
    iget-object p1, p0, Landroidx/appcompat/widget/z0$e;->a:Landroidx/appcompat/widget/z0;

    .line 32
    .line 33
    iget-object p1, p1, Landroidx/appcompat/widget/z0;->G:Landroidx/appcompat/widget/z0$g;

    .line 34
    .line 35
    invoke-virtual {p1}, Landroidx/appcompat/widget/z0$g;->run()V

    .line 36
    .line 37
    .line 38
    :cond_0
    return-void
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
.end method
