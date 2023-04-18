.class Landroidx/fragment/app/s$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/fragment/app/s;->a(Landroidx/fragment/app/s$e$c;Landroidx/fragment/app/s$e$b;Landroidx/fragment/app/m;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic k:Landroidx/fragment/app/s$d;

.field final synthetic l:Landroidx/fragment/app/s;


# direct methods
.method constructor <init>(Landroidx/fragment/app/s;Landroidx/fragment/app/s$d;)V
    .locals 0

    iput-object p1, p0, Landroidx/fragment/app/s$a;->l:Landroidx/fragment/app/s;

    iput-object p2, p0, Landroidx/fragment/app/s$a;->k:Landroidx/fragment/app/s$d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/s$a;->l:Landroidx/fragment/app/s;

    .line 2
    .line 3
    iget-object v0, v0, Landroidx/fragment/app/s;->b:Ljava/util/ArrayList;

    .line 4
    .line 5
    iget-object v1, p0, Landroidx/fragment/app/s$a;->k:Landroidx/fragment/app/s$d;

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    iget-object v0, p0, Landroidx/fragment/app/s$a;->k:Landroidx/fragment/app/s$d;

    .line 14
    .line 15
    invoke-virtual {v0}, Landroidx/fragment/app/s$e;->e()Landroidx/fragment/app/s$e$c;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    iget-object v1, p0, Landroidx/fragment/app/s$a;->k:Landroidx/fragment/app/s$d;

    .line 20
    .line 21
    invoke-virtual {v1}, Landroidx/fragment/app/s$e;->f()Landroidx/fragment/app/Fragment;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    iget-object v1, v1, Landroidx/fragment/app/Fragment;->mView:Landroid/view/View;

    .line 26
    .line 27
    invoke-virtual {v0, v1}, Landroidx/fragment/app/s$e$c;->a(Landroid/view/View;)V

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
