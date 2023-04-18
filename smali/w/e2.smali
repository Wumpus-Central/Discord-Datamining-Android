.class public final Lw/e2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lw/x2;
.implements Lw/k1;
.implements Lz/k;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lw/x2<",
        "Landroidx/camera/core/a2;",
        ">;",
        "Lw/k1;",
        "Lz/k;"
    }
.end annotation


# static fields
.field public static final x:Lw/r0$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lw/r0$a<",
            "Lw/g1;",
            ">;"
        }
    .end annotation
.end field

.field public static final y:Lw/r0$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lw/r0$a<",
            "Lw/o0;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final w:Lw/c2;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    const-string v0, "camerax.core.preview.imageInfoProcessor"

    .line 2
    .line 3
    const-class v1, Lw/g1;

    .line 4
    .line 5
    invoke-static {v0, v1}, Lw/r0$a;->a(Ljava/lang/String;Ljava/lang/Class;)Lw/r0$a;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    sput-object v0, Lw/e2;->x:Lw/r0$a;

    .line 10
    .line 11
    const-string v0, "camerax.core.preview.captureProcessor"

    .line 12
    .line 13
    const-class v1, Lw/o0;

    .line 14
    .line 15
    invoke-static {v0, v1}, Lw/r0$a;->a(Ljava/lang/String;Ljava/lang/Class;)Lw/r0$a;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    sput-object v0, Lw/e2;->y:Lw/r0$a;

    .line 20
    .line 21
    return-void
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

.method public constructor <init>(Lw/c2;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lw/e2;->w:Lw/c2;

    .line 5
    .line 6
    return-void
    .line 7
    .line 8
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


# virtual methods
.method public synthetic A(Lw/k2;)Lw/k2;
    .locals 0

    invoke-static {p0, p1}, Lw/w2;->d(Lw/x2;Lw/k2;)Lw/k2;

    move-result-object p1

    return-object p1
.end method

.method public synthetic B(Landroidx/camera/core/t;)Landroidx/camera/core/t;
    .locals 0

    invoke-static {p0, p1}, Lw/w2;->a(Lw/x2;Landroidx/camera/core/t;)Landroidx/camera/core/t;

    move-result-object p1

    return-object p1
.end method

.method public synthetic C(Landroidx/camera/core/w2$b;)Landroidx/camera/core/w2$b;
    .locals 0

    invoke-static {p0, p1}, Lz/l;->a(Lz/m;Landroidx/camera/core/w2$b;)Landroidx/camera/core/w2$b;

    move-result-object p1

    return-object p1
.end method

.method public synthetic D(I)I
    .locals 0

    invoke-static {p0, p1}, Lw/j1;->f(Lw/k1;I)I

    move-result p1

    return p1
.end method

.method public F(Lw/o0;)Lw/o0;
    .locals 1

    sget-object v0, Lw/e2;->y:Lw/r0$a;

    invoke-virtual {p0, v0, p1}, Lw/e2;->a(Lw/r0$a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lw/o0;

    return-object p1
.end method

.method public G(Lw/g1;)Lw/g1;
    .locals 1

    sget-object v0, Lw/e2;->x:Lw/r0$a;

    invoke-virtual {p0, v0, p1}, Lw/e2;->a(Lw/r0$a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lw/g1;

    return-object p1
.end method

.method public synthetic a(Lw/r0$a;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0, p1, p2}, Lw/h2;->g(Lw/i2;Lw/r0$a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public synthetic b(Lw/r0$a;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0, p1}, Lw/h2;->f(Lw/i2;Lw/r0$a;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public synthetic c()Ljava/util/Set;
    .locals 1

    invoke-static {p0}, Lw/h2;->e(Lw/i2;)Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public synthetic d(Lw/r0$a;)Lw/r0$c;
    .locals 0

    invoke-static {p0, p1}, Lw/h2;->c(Lw/i2;Lw/r0$a;)Lw/r0$c;

    move-result-object p1

    return-object p1
.end method

.method public synthetic e(Lw/r0$a;)Z
    .locals 0

    invoke-static {p0, p1}, Lw/h2;->a(Lw/i2;Lw/r0$a;)Z

    move-result p1

    return p1
.end method

.method public synthetic f(Landroid/util/Size;)Landroid/util/Size;
    .locals 0

    invoke-static {p0, p1}, Lw/j1;->b(Lw/k1;Landroid/util/Size;)Landroid/util/Size;

    move-result-object p1

    return-object p1
.end method

.method public synthetic i(Ljava/util/List;)Ljava/util/List;
    .locals 0

    invoke-static {p0, p1}, Lw/j1;->c(Lw/k1;Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public j()Lw/r0;
    .locals 1

    iget-object v0, p0, Lw/e2;->w:Lw/c2;

    return-object v0
.end method

.method public l()I
    .locals 1

    sget-object v0, Lw/i1;->e:Lw/r0$a;

    invoke-virtual {p0, v0}, Lw/e2;->b(Lw/r0$a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public synthetic m(Lw/k2$d;)Lw/k2$d;
    .locals 0

    invoke-static {p0, p1}, Lw/w2;->e(Lw/x2;Lw/k2$d;)Lw/k2$d;

    move-result-object p1

    return-object p1
.end method

.method public synthetic n(Landroid/util/Size;)Landroid/util/Size;
    .locals 0

    invoke-static {p0, p1}, Lw/j1;->a(Lw/k1;Landroid/util/Size;)Landroid/util/Size;

    move-result-object p1

    return-object p1
.end method

.method public synthetic o(Ljava/lang/String;Lw/r0$b;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lw/h2;->b(Lw/i2;Ljava/lang/String;Lw/r0$b;)V

    return-void
.end method

.method public synthetic p(Lw/r0$a;)Ljava/util/Set;
    .locals 0

    invoke-static {p0, p1}, Lw/h2;->d(Lw/i2;Lw/r0$a;)Ljava/util/Set;

    move-result-object p1

    return-object p1
.end method

.method public synthetic q(Landroid/util/Size;)Landroid/util/Size;
    .locals 0

    invoke-static {p0, p1}, Lw/j1;->e(Lw/k1;Landroid/util/Size;)Landroid/util/Size;

    move-result-object p1

    return-object p1
.end method

.method public synthetic r(Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    invoke-static {p0, p1}, Lz/h;->a(Lz/i;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public synthetic t(Lw/n0;)Lw/n0;
    .locals 0

    invoke-static {p0, p1}, Lw/w2;->c(Lw/x2;Lw/n0;)Lw/n0;

    move-result-object p1

    return-object p1
.end method

.method public synthetic u(Lw/n0$b;)Lw/n0$b;
    .locals 0

    invoke-static {p0, p1}, Lw/w2;->b(Lw/x2;Lw/n0$b;)Lw/n0$b;

    move-result-object p1

    return-object p1
.end method

.method public synthetic v()Z
    .locals 1

    invoke-static {p0}, Lw/j1;->g(Lw/k1;)Z

    move-result v0

    return v0
.end method

.method public synthetic w(I)I
    .locals 0

    invoke-static {p0, p1}, Lw/w2;->f(Lw/x2;I)I

    move-result p1

    return p1
.end method

.method public synthetic x()I
    .locals 1

    invoke-static {p0}, Lw/j1;->d(Lw/k1;)I

    move-result v0

    return v0
.end method

.method public synthetic z(Lw/r0$a;Lw/r0$c;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0, p1, p2}, Lw/h2;->h(Lw/i2;Lw/r0$a;Lw/r0$c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
