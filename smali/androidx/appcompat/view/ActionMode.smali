.class public abstract Landroidx/appcompat/view/ActionMode;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/appcompat/view/ActionMode$Callback;
    }
.end annotation


# instance fields
.field private k:Ljava/lang/Object;

.field private l:Z


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract c()V
.end method

.method public abstract d()Landroid/view/View;
.end method

.method public abstract e()Landroid/view/Menu;
.end method

.method public abstract f()Landroid/view/MenuInflater;
.end method

.method public abstract g()Ljava/lang/CharSequence;
.end method

.method public h()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Landroidx/appcompat/view/ActionMode;->k:Ljava/lang/Object;

    return-object v0
.end method

.method public abstract i()Ljava/lang/CharSequence;
.end method

.method public j()Z
    .locals 1

    iget-boolean v0, p0, Landroidx/appcompat/view/ActionMode;->l:Z

    return v0
.end method

.method public abstract k()V
.end method

.method public l()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public abstract m(Landroid/view/View;)V
.end method

.method public abstract n(I)V
.end method

.method public abstract o(Ljava/lang/CharSequence;)V
.end method

.method public p(Ljava/lang/Object;)V
    .locals 0

    iput-object p1, p0, Landroidx/appcompat/view/ActionMode;->k:Ljava/lang/Object;

    return-void
.end method

.method public abstract q(I)V
.end method

.method public abstract r(Ljava/lang/CharSequence;)V
.end method

.method public s(Z)V
    .locals 0

    iput-boolean p1, p0, Landroidx/appcompat/view/ActionMode;->l:Z

    return-void
.end method
