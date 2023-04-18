.class Landroidx/fragment/app/c$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/fragment/app/c;->f(Ljava/util/List;Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic k:Ljava/util/List;

.field final synthetic l:Landroidx/fragment/app/s$e;

.field final synthetic m:Landroidx/fragment/app/c;


# direct methods
.method constructor <init>(Landroidx/fragment/app/c;Ljava/util/List;Landroidx/fragment/app/s$e;)V
    .locals 0

    iput-object p1, p0, Landroidx/fragment/app/c$b;->m:Landroidx/fragment/app/c;

    iput-object p2, p0, Landroidx/fragment/app/c$b;->k:Ljava/util/List;

    iput-object p3, p0, Landroidx/fragment/app/c$b;->l:Landroidx/fragment/app/s$e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/c$b;->k:Ljava/util/List;

    .line 2
    .line 3
    iget-object v1, p0, Landroidx/fragment/app/c$b;->l:Landroidx/fragment/app/s$e;

    .line 4
    .line 5
    invoke-interface {v0, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget-object v0, p0, Landroidx/fragment/app/c$b;->k:Ljava/util/List;

    .line 12
    .line 13
    iget-object v1, p0, Landroidx/fragment/app/c$b;->l:Landroidx/fragment/app/s$e;

    .line 14
    .line 15
    invoke-interface {v0, v1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    iget-object v0, p0, Landroidx/fragment/app/c$b;->m:Landroidx/fragment/app/c;

    .line 19
    .line 20
    iget-object v1, p0, Landroidx/fragment/app/c$b;->l:Landroidx/fragment/app/s$e;

    .line 21
    .line 22
    invoke-virtual {v0, v1}, Landroidx/fragment/app/c;->s(Landroidx/fragment/app/s$e;)V

    .line 23
    .line 24
    .line 25
    :cond_0
    return-void
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
