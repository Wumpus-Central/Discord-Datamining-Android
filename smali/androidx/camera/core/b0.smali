.class final Landroidx/camera/core/b0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/camera/core/b0$a;
    }
.end annotation


# direct methods
.method static a(Ljava/util/List;)Lw/m0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lw/p0;",
            ">;)",
            "Lw/m0;"
        }
    .end annotation

    new-instance v0, Landroidx/camera/core/b0$a;

    invoke-direct {v0, p0}, Landroidx/camera/core/b0$a;-><init>(Ljava/util/List;)V

    return-object v0
.end method

.method static varargs b([Lw/p0;)Lw/m0;
    .locals 1

    new-instance v0, Landroidx/camera/core/b0$a;

    invoke-static {p0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    invoke-direct {v0, p0}, Landroidx/camera/core/b0$a;-><init>(Ljava/util/List;)V

    return-object v0
.end method

.method static c()Lw/m0;
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    new-array v0, v0, [Lw/p0;

    .line 3
    .line 4
    new-instance v1, Lw/p0$a;

    .line 5
    .line 6
    invoke-direct {v1}, Lw/p0$a;-><init>()V

    .line 7
    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    aput-object v1, v0, v2

    .line 11
    .line 12
    invoke-static {v0}, Landroidx/camera/core/b0;->b([Lw/p0;)Lw/m0;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    return-object v0
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
