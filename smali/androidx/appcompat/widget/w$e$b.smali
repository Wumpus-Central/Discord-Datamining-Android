.class Landroidx/appcompat/widget/w$e$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/appcompat/widget/w$e;->l(II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic k:Landroidx/appcompat/widget/w$e;


# direct methods
.method constructor <init>(Landroidx/appcompat/widget/w$e;)V
    .locals 0

    iput-object p1, p0, Landroidx/appcompat/widget/w$e$b;->k:Landroidx/appcompat/widget/w$e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onGlobalLayout()V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/appcompat/widget/w$e$b;->k:Landroidx/appcompat/widget/w$e;

    .line 2
    .line 3
    iget-object v1, v0, Landroidx/appcompat/widget/w$e;->X:Landroidx/appcompat/widget/w;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Landroidx/appcompat/widget/w$e;->S(Landroid/view/View;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    iget-object v0, p0, Landroidx/appcompat/widget/w$e$b;->k:Landroidx/appcompat/widget/w$e;

    .line 12
    .line 13
    invoke-virtual {v0}, Landroidx/appcompat/widget/z0;->dismiss()V

    .line 14
    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    iget-object v0, p0, Landroidx/appcompat/widget/w$e$b;->k:Landroidx/appcompat/widget/w$e;

    .line 18
    .line 19
    invoke-virtual {v0}, Landroidx/appcompat/widget/w$e;->Q()V

    .line 20
    .line 21
    .line 22
    iget-object v0, p0, Landroidx/appcompat/widget/w$e$b;->k:Landroidx/appcompat/widget/w$e;

    .line 23
    .line 24
    invoke-static {v0}, Landroidx/appcompat/widget/w$e;->P(Landroidx/appcompat/widget/w$e;)V

    .line 25
    .line 26
    .line 27
    :goto_0
    return-void
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
