.class Landroidx/fragment/app/o$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/fragment/app/o;->m(Landroidx/fragment/app/q;Landroid/view/ViewGroup;Landroid/view/View;Landroidx/collection/a;Landroidx/fragment/app/o$h;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic k:Landroidx/fragment/app/Fragment;

.field final synthetic l:Landroidx/fragment/app/Fragment;

.field final synthetic m:Z

.field final synthetic n:Landroidx/collection/a;

.field final synthetic o:Landroid/view/View;

.field final synthetic p:Landroidx/fragment/app/q;

.field final synthetic q:Landroid/graphics/Rect;


# direct methods
.method constructor <init>(Landroidx/fragment/app/Fragment;Landroidx/fragment/app/Fragment;ZLandroidx/collection/a;Landroid/view/View;Landroidx/fragment/app/q;Landroid/graphics/Rect;)V
    .locals 0

    iput-object p1, p0, Landroidx/fragment/app/o$e;->k:Landroidx/fragment/app/Fragment;

    iput-object p2, p0, Landroidx/fragment/app/o$e;->l:Landroidx/fragment/app/Fragment;

    iput-boolean p3, p0, Landroidx/fragment/app/o$e;->m:Z

    iput-object p4, p0, Landroidx/fragment/app/o$e;->n:Landroidx/collection/a;

    iput-object p5, p0, Landroidx/fragment/app/o$e;->o:Landroid/view/View;

    iput-object p6, p0, Landroidx/fragment/app/o$e;->p:Landroidx/fragment/app/q;

    iput-object p7, p0, Landroidx/fragment/app/o$e;->q:Landroid/graphics/Rect;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/o$e;->k:Landroidx/fragment/app/Fragment;

    .line 2
    .line 3
    iget-object v1, p0, Landroidx/fragment/app/o$e;->l:Landroidx/fragment/app/Fragment;

    .line 4
    .line 5
    iget-boolean v2, p0, Landroidx/fragment/app/o$e;->m:Z

    .line 6
    .line 7
    iget-object v3, p0, Landroidx/fragment/app/o$e;->n:Landroidx/collection/a;

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    invoke-static {v0, v1, v2, v3, v4}, Landroidx/fragment/app/o;->f(Landroidx/fragment/app/Fragment;Landroidx/fragment/app/Fragment;ZLandroidx/collection/a;Z)V

    .line 11
    .line 12
    .line 13
    iget-object v0, p0, Landroidx/fragment/app/o$e;->o:Landroid/view/View;

    .line 14
    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    iget-object v1, p0, Landroidx/fragment/app/o$e;->p:Landroidx/fragment/app/q;

    .line 18
    .line 19
    iget-object v2, p0, Landroidx/fragment/app/o$e;->q:Landroid/graphics/Rect;

    .line 20
    .line 21
    invoke-virtual {v1, v0, v2}, Landroidx/fragment/app/q;->k(Landroid/view/View;Landroid/graphics/Rect;)V

    .line 22
    .line 23
    .line 24
    :cond_0
    return-void
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
