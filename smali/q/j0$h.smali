.class abstract Lq/j0$h;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lq/j0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x408
    name = "h"
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static a(Ljava/lang/String;Ljava/lang/Class;Lw/k2;Landroid/util/Size;)Lq/j0$h;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/Class<",
            "*>;",
            "Lw/k2;",
            "Landroid/util/Size;",
            ")",
            "Lq/j0$h;"
        }
    .end annotation

    new-instance v0, Lq/d;

    invoke-direct {v0, p0, p1, p2, p3}, Lq/d;-><init>(Ljava/lang/String;Ljava/lang/Class;Lw/k2;Landroid/util/Size;)V

    return-object v0
.end method

.method static b(Landroidx/camera/core/w2;)Lq/j0$h;
    .locals 3

    .line 1
    invoke-static {p0}, Lq/j0;->J(Landroidx/camera/core/w2;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {p0}, Landroidx/camera/core/w2;->k()Lw/k2;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    invoke-virtual {p0}, Landroidx/camera/core/w2;->b()Landroid/util/Size;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    invoke-static {v0, v1, v2, p0}, Lq/j0$h;->a(Ljava/lang/String;Ljava/lang/Class;Lw/k2;Landroid/util/Size;)Lq/j0$h;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    return-object p0
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
.method abstract c()Lw/k2;
.end method

.method abstract d()Landroid/util/Size;
.end method

.method abstract e()Ljava/lang/String;
.end method

.method abstract f()Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation
.end method
