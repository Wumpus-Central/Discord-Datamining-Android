.class Landroidx/camera/core/a2$a;
.super Lw/k;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/camera/core/a2;->M(Ljava/lang/String;Lw/e2;Landroid/util/Size;)Lw/k2$b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lw/g1;

.field final synthetic b:Landroidx/camera/core/a2;


# direct methods
.method constructor <init>(Landroidx/camera/core/a2;Lw/g1;)V
    .locals 0

    iput-object p1, p0, Landroidx/camera/core/a2$a;->b:Landroidx/camera/core/a2;

    iput-object p2, p0, Landroidx/camera/core/a2$a;->a:Lw/g1;

    invoke-direct {p0}, Lw/k;-><init>()V

    return-void
.end method


# virtual methods
.method public b(Lw/t;)V
    .locals 2

    .line 1
    invoke-super {p0, p1}, Lw/k;->b(Lw/t;)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Landroidx/camera/core/a2$a;->a:Lw/g1;

    .line 5
    .line 6
    new-instance v1, Lz/b;

    .line 7
    .line 8
    invoke-direct {v1, p1}, Lz/b;-><init>(Lw/t;)V

    .line 9
    .line 10
    .line 11
    invoke-interface {v0, v1}, Lw/g1;->a(Landroidx/camera/core/k1;)Z

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    if-eqz p1, :cond_0

    .line 16
    .line 17
    iget-object p1, p0, Landroidx/camera/core/a2$a;->b:Landroidx/camera/core/a2;

    .line 18
    .line 19
    invoke-virtual {p1}, Landroidx/camera/core/w2;->u()V

    .line 20
    .line 21
    .line 22
    :cond_0
    return-void
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
