.class public final Lcom/swmansion/rnscreens/c;
.super Landroidx/appcompat/widget/SearchView;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010!\u001a\u00020 \u0012\u0006\u0010#\u001a\u00020\"\u00a2\u0006\u0004\u0008$\u0010%J\u0006\u0010\u0003\u001a\u00020\u0002J\u0012\u0010\u0006\u001a\u00020\u00022\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\u0012\u0010\u0008\u001a\u00020\u00022\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0007H\u0016J\u0008\u0010\t\u001a\u00020\u0002H\u0014J\u0008\u0010\n\u001a\u00020\u0002H\u0014R\u0018\u0010\r\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u000b\u0010\u000cR\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u000e\u0010\u000fR\u0016\u0010\u0014\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0012\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0016\u0010\u0017R$\u0010\u001f\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00198F@FX\u0086\u000e\u00a2\u0006\u000c\u001a\u0004\u0008\u001b\u0010\u001c\"\u0004\u0008\u001d\u0010\u001e\u00a8\u0006&"
    }
    d2 = {
        "Lcom/swmansion/rnscreens/c;",
        "Landroidx/appcompat/widget/SearchView;",
        "",
        "o0",
        "Landroidx/appcompat/widget/SearchView$k;",
        "listener",
        "setOnCloseListener",
        "Landroid/view/View$OnClickListener;",
        "setOnSearchClickListener",
        "onAttachedToWindow",
        "onDetachedFromWindow",
        "A0",
        "Landroidx/appcompat/widget/SearchView$k;",
        "mCustomOnCloseListener",
        "B0",
        "Landroid/view/View$OnClickListener;",
        "mCustomOnSearchClickedListener",
        "Landroidx/activity/b;",
        "C0",
        "Landroidx/activity/b;",
        "mOnBackPressedCallback",
        "Lcom/swmansion/rnscreens/f;",
        "D0",
        "Lcom/swmansion/rnscreens/f;",
        "backPressOverrider",
        "",
        "value",
        "getOverrideBackAction",
        "()Z",
        "setOverrideBackAction",
        "(Z)V",
        "overrideBackAction",
        "Landroid/content/Context;",
        "context",
        "Landroidx/fragment/app/Fragment;",
        "fragment",
        "<init>",
        "(Landroid/content/Context;Landroidx/fragment/app/Fragment;)V",
        "react-native-screens_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field private A0:Landroidx/appcompat/widget/SearchView$k;

.field private B0:Landroid/view/View$OnClickListener;

.field private C0:Landroidx/activity/b;

.field private final D0:Lcom/swmansion/rnscreens/f;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroidx/fragment/app/Fragment;)V
    .locals 1

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "fragment"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0, p1}, Landroidx/appcompat/widget/SearchView;-><init>(Landroid/content/Context;)V

    .line 12
    .line 13
    .line 14
    new-instance p1, Lcom/swmansion/rnscreens/c$a;

    .line 15
    .line 16
    invoke-direct {p1, p0}, Lcom/swmansion/rnscreens/c$a;-><init>(Lcom/swmansion/rnscreens/c;)V

    .line 17
    .line 18
    .line 19
    iput-object p1, p0, Lcom/swmansion/rnscreens/c;->C0:Landroidx/activity/b;

    .line 20
    .line 21
    new-instance v0, Lcom/swmansion/rnscreens/f;

    .line 22
    .line 23
    invoke-direct {v0, p2, p1}, Lcom/swmansion/rnscreens/f;-><init>(Landroidx/fragment/app/Fragment;Landroidx/activity/b;)V

    .line 24
    .line 25
    .line 26
    iput-object v0, p0, Lcom/swmansion/rnscreens/c;->D0:Lcom/swmansion/rnscreens/f;

    .line 27
    .line 28
    new-instance p1, Lcom/swmansion/rnscreens/a;

    .line 29
    .line 30
    invoke-direct {p1, p0}, Lcom/swmansion/rnscreens/a;-><init>(Lcom/swmansion/rnscreens/c;)V

    .line 31
    .line 32
    .line 33
    invoke-super {p0, p1}, Landroidx/appcompat/widget/SearchView;->setOnSearchClickListener(Landroid/view/View$OnClickListener;)V

    .line 34
    .line 35
    .line 36
    new-instance p1, Lcom/swmansion/rnscreens/b;

    .line 37
    .line 38
    invoke-direct {p1, p0}, Lcom/swmansion/rnscreens/b;-><init>(Lcom/swmansion/rnscreens/c;)V

    .line 39
    .line 40
    .line 41
    invoke-super {p0, p1}, Landroidx/appcompat/widget/SearchView;->setOnCloseListener(Landroidx/appcompat/widget/SearchView$k;)V

    .line 42
    .line 43
    .line 44
    const p1, 0x7fffffff

    .line 45
    .line 46
    .line 47
    invoke-virtual {p0, p1}, Landroidx/appcompat/widget/SearchView;->setMaxWidth(I)V

    .line 48
    .line 49
    .line 50
    return-void
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
.end method

.method public static synthetic k0(Lcom/swmansion/rnscreens/c;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/swmansion/rnscreens/c;->m0(Lcom/swmansion/rnscreens/c;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic l0(Lcom/swmansion/rnscreens/c;)Z
    .locals 0

    invoke-static {p0}, Lcom/swmansion/rnscreens/c;->n0(Lcom/swmansion/rnscreens/c;)Z

    move-result p0

    return p0
.end method

.method private static final m0(Lcom/swmansion/rnscreens/c;Landroid/view/View;)V
    .locals 1

    .line 1
    const-string v0, "this$0"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/swmansion/rnscreens/c;->B0:Landroid/view/View$OnClickListener;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    invoke-interface {v0, p1}, Landroid/view/View$OnClickListener;->onClick(Landroid/view/View;)V

    .line 11
    .line 12
    .line 13
    :cond_0
    iget-object p0, p0, Lcom/swmansion/rnscreens/c;->D0:Lcom/swmansion/rnscreens/f;

    .line 14
    .line 15
    invoke-virtual {p0}, Lcom/swmansion/rnscreens/f;->b()V

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
.end method

.method private static final n0(Lcom/swmansion/rnscreens/c;)Z
    .locals 1

    .line 1
    const-string v0, "this$0"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/swmansion/rnscreens/c;->A0:Landroidx/appcompat/widget/SearchView$k;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    invoke-interface {v0}, Landroidx/appcompat/widget/SearchView$k;->a()Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    const/4 v0, 0x0

    .line 16
    :goto_0
    iget-object p0, p0, Lcom/swmansion/rnscreens/c;->D0:Lcom/swmansion/rnscreens/f;

    .line 17
    .line 18
    invoke-virtual {p0}, Lcom/swmansion/rnscreens/f;->c()V

    .line 19
    .line 20
    .line 21
    return v0
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
.end method


# virtual methods
.method public final getOverrideBackAction()Z
    .locals 1

    iget-object v0, p0, Lcom/swmansion/rnscreens/c;->D0:Lcom/swmansion/rnscreens/f;

    invoke-virtual {v0}, Lcom/swmansion/rnscreens/f;->a()Z

    move-result v0

    return v0
.end method

.method public final o0()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, v0}, Landroidx/appcompat/widget/SearchView;->setIconified(Z)V

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0}, Landroid/view/View;->requestFocusFromTouch()Z

    .line 6
    .line 7
    .line 8
    return-void
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
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
.end method

.method protected onAttachedToWindow()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroid/view/ViewGroup;->onAttachedToWindow()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroidx/appcompat/widget/SearchView;->J()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    iget-object v0, p0, Lcom/swmansion/rnscreens/c;->D0:Lcom/swmansion/rnscreens/f;

    .line 11
    .line 12
    invoke-virtual {v0}, Lcom/swmansion/rnscreens/f;->b()V

    .line 13
    .line 14
    .line 15
    :cond_0
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
.end method

.method protected onDetachedFromWindow()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroidx/appcompat/widget/SearchView;->onDetachedFromWindow()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/swmansion/rnscreens/c;->D0:Lcom/swmansion/rnscreens/f;

    .line 5
    .line 6
    invoke-virtual {v0}, Lcom/swmansion/rnscreens/f;->c()V

    .line 7
    .line 8
    .line 9
    return-void
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
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
.end method

.method public setOnCloseListener(Landroidx/appcompat/widget/SearchView$k;)V
    .locals 0

    iput-object p1, p0, Lcom/swmansion/rnscreens/c;->A0:Landroidx/appcompat/widget/SearchView$k;

    return-void
.end method

.method public setOnSearchClickListener(Landroid/view/View$OnClickListener;)V
    .locals 0

    iput-object p1, p0, Lcom/swmansion/rnscreens/c;->B0:Landroid/view/View$OnClickListener;

    return-void
.end method

.method public final setOverrideBackAction(Z)V
    .locals 1

    iget-object v0, p0, Lcom/swmansion/rnscreens/c;->D0:Lcom/swmansion/rnscreens/f;

    invoke-virtual {v0, p1}, Lcom/swmansion/rnscreens/f;->d(Z)V

    return-void
.end method
