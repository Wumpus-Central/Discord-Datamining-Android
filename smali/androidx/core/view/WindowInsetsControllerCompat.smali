.class public final Landroidx/core/view/WindowInsetsControllerCompat;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/core/view/WindowInsetsControllerCompat$d;,
        Landroidx/core/view/WindowInsetsControllerCompat$c;,
        Landroidx/core/view/WindowInsetsControllerCompat$b;,
        Landroidx/core/view/WindowInsetsControllerCompat$a;,
        Landroidx/core/view/WindowInsetsControllerCompat$e;
    }
.end annotation


# instance fields
.field private final a:Landroidx/core/view/WindowInsetsControllerCompat$e;


# direct methods
.method public constructor <init>(Landroid/view/Window;Landroid/view/View;)V
    .locals 2

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1e

    if-lt v0, v1, :cond_0

    .line 5
    new-instance p2, Landroidx/core/view/WindowInsetsControllerCompat$d;

    invoke-direct {p2, p1, p0}, Landroidx/core/view/WindowInsetsControllerCompat$d;-><init>(Landroid/view/Window;Landroidx/core/view/WindowInsetsControllerCompat;)V

    iput-object p2, p0, Landroidx/core/view/WindowInsetsControllerCompat;->a:Landroidx/core/view/WindowInsetsControllerCompat$e;

    goto :goto_0

    :cond_0
    const/16 v1, 0x1a

    if-lt v0, v1, :cond_1

    .line 6
    new-instance v0, Landroidx/core/view/WindowInsetsControllerCompat$c;

    invoke-direct {v0, p1, p2}, Landroidx/core/view/WindowInsetsControllerCompat$c;-><init>(Landroid/view/Window;Landroid/view/View;)V

    iput-object v0, p0, Landroidx/core/view/WindowInsetsControllerCompat;->a:Landroidx/core/view/WindowInsetsControllerCompat$e;

    goto :goto_0

    .line 7
    :cond_1
    new-instance v0, Landroidx/core/view/WindowInsetsControllerCompat$b;

    invoke-direct {v0, p1, p2}, Landroidx/core/view/WindowInsetsControllerCompat$b;-><init>(Landroid/view/Window;Landroid/view/View;)V

    iput-object v0, p0, Landroidx/core/view/WindowInsetsControllerCompat;->a:Landroidx/core/view/WindowInsetsControllerCompat$e;

    :goto_0
    return-void
.end method

.method private constructor <init>(Landroid/view/WindowInsetsController;)V
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Landroidx/core/view/WindowInsetsControllerCompat$d;

    invoke-direct {v0, p1, p0}, Landroidx/core/view/WindowInsetsControllerCompat$d;-><init>(Landroid/view/WindowInsetsController;Landroidx/core/view/WindowInsetsControllerCompat;)V

    iput-object v0, p0, Landroidx/core/view/WindowInsetsControllerCompat;->a:Landroidx/core/view/WindowInsetsControllerCompat$e;

    return-void
.end method

.method public static f(Landroid/view/WindowInsetsController;)Landroidx/core/view/WindowInsetsControllerCompat;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    new-instance v0, Landroidx/core/view/WindowInsetsControllerCompat;

    invoke-direct {v0, p0}, Landroidx/core/view/WindowInsetsControllerCompat;-><init>(Landroid/view/WindowInsetsController;)V

    return-object v0
.end method


# virtual methods
.method public a(I)V
    .locals 1

    iget-object v0, p0, Landroidx/core/view/WindowInsetsControllerCompat;->a:Landroidx/core/view/WindowInsetsControllerCompat$e;

    invoke-virtual {v0, p1}, Landroidx/core/view/WindowInsetsControllerCompat$e;->a(I)V

    return-void
.end method

.method public b(Z)V
    .locals 1

    iget-object v0, p0, Landroidx/core/view/WindowInsetsControllerCompat;->a:Landroidx/core/view/WindowInsetsControllerCompat$e;

    invoke-virtual {v0, p1}, Landroidx/core/view/WindowInsetsControllerCompat$e;->b(Z)V

    return-void
.end method

.method public c(Z)V
    .locals 1

    iget-object v0, p0, Landroidx/core/view/WindowInsetsControllerCompat;->a:Landroidx/core/view/WindowInsetsControllerCompat$e;

    invoke-virtual {v0, p1}, Landroidx/core/view/WindowInsetsControllerCompat$e;->c(Z)V

    return-void
.end method

.method public d(I)V
    .locals 1

    iget-object v0, p0, Landroidx/core/view/WindowInsetsControllerCompat;->a:Landroidx/core/view/WindowInsetsControllerCompat$e;

    invoke-virtual {v0, p1}, Landroidx/core/view/WindowInsetsControllerCompat$e;->d(I)V

    return-void
.end method

.method public e(I)V
    .locals 1

    iget-object v0, p0, Landroidx/core/view/WindowInsetsControllerCompat;->a:Landroidx/core/view/WindowInsetsControllerCompat$e;

    invoke-virtual {v0, p1}, Landroidx/core/view/WindowInsetsControllerCompat$e;->e(I)V

    return-void
.end method
