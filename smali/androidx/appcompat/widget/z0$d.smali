.class Landroidx/appcompat/widget/z0$d;
.super Landroid/database/DataSetObserver;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/appcompat/widget/z0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "d"
.end annotation


# instance fields
.field final synthetic a:Landroidx/appcompat/widget/z0;


# direct methods
.method constructor <init>(Landroidx/appcompat/widget/z0;)V
    .locals 0

    iput-object p1, p0, Landroidx/appcompat/widget/z0$d;->a:Landroidx/appcompat/widget/z0;

    invoke-direct {p0}, Landroid/database/DataSetObserver;-><init>()V

    return-void
.end method


# virtual methods
.method public onChanged()V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/appcompat/widget/z0$d;->a:Landroidx/appcompat/widget/z0;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/appcompat/widget/z0;->isShowing()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Landroidx/appcompat/widget/z0$d;->a:Landroidx/appcompat/widget/z0;

    .line 10
    .line 11
    invoke-virtual {v0}, Landroidx/appcompat/widget/z0;->show()V

    .line 12
    .line 13
    .line 14
    :cond_0
    return-void
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

.method public onInvalidated()V
    .locals 1

    iget-object v0, p0, Landroidx/appcompat/widget/z0$d;->a:Landroidx/appcompat/widget/z0;

    invoke-virtual {v0}, Landroidx/appcompat/widget/z0;->dismiss()V

    return-void
.end method
