.class Landroidx/camera/core/g1$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/camera/core/g1$h$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/camera/core/g1;->Y(Ljava/lang/String;Lw/f1;Landroid/util/Size;)Lw/k2$b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lz/o;

.field final synthetic b:Landroidx/camera/core/g1;


# direct methods
.method constructor <init>(Landroidx/camera/core/g1;Lz/o;)V
    .locals 0

    iput-object p1, p0, Landroidx/camera/core/g1$b;->b:Landroidx/camera/core/g1;

    iput-object p2, p0, Landroidx/camera/core/g1$b;->a:Lz/o;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroidx/camera/core/g1$g;)V
    .locals 2

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x1a

    .line 4
    .line 5
    if-lt v0, v1, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, Landroidx/camera/core/g1$b;->a:Lz/o;

    .line 8
    .line 9
    iget p1, p1, Landroidx/camera/core/g1$g;->b:I

    .line 10
    .line 11
    invoke-virtual {v0, p1}, Lz/o;->f(I)V

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
