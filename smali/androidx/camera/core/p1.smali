.class abstract Landroidx/camera/core/p1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/camera/core/k1;


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static d(Lw/s2;JILandroid/graphics/Matrix;)Landroidx/camera/core/k1;
    .locals 7

    new-instance v6, Landroidx/camera/core/h;

    move-object v0, v6

    move-object v1, p0

    move-wide v2, p1

    move v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, Landroidx/camera/core/h;-><init>(Lw/s2;JILandroid/graphics/Matrix;)V

    return-object v6
.end method


# virtual methods
.method public abstract a()J
.end method

.method public abstract b()Lw/s2;
.end method

.method public c(Landroidx/camera/core/impl/utils/m$b;)V
    .locals 1

    invoke-virtual {p0}, Landroidx/camera/core/p1;->e()I

    move-result v0

    invoke-virtual {p1, v0}, Landroidx/camera/core/impl/utils/m$b;->m(I)Landroidx/camera/core/impl/utils/m$b;

    return-void
.end method

.method public abstract e()I
.end method

.method public abstract f()Landroid/graphics/Matrix;
.end method
