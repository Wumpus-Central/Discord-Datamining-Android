.class public final Landroidx/camera/core/impl/utils/f;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/camera/core/impl/utils/f$c;,
        Landroidx/camera/core/impl/utils/f$a;,
        Landroidx/camera/core/impl/utils/f$b;
    }
.end annotation


# instance fields
.field private final a:Landroidx/camera/core/impl/utils/f$b;


# direct methods
.method private constructor <init>(Landroidx/camera/core/impl/utils/f$b;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/camera/core/impl/utils/f;->a:Landroidx/camera/core/impl/utils/f$b;

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

.method public static b()Landroidx/camera/core/impl/utils/f;
    .locals 2

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x1e

    .line 4
    .line 5
    if-lt v0, v1, :cond_0

    .line 6
    .line 7
    new-instance v0, Landroidx/camera/core/impl/utils/f;

    .line 8
    .line 9
    new-instance v1, Landroidx/camera/core/impl/utils/f$a;

    .line 10
    .line 11
    invoke-direct {v1}, Landroidx/camera/core/impl/utils/f$a;-><init>()V

    .line 12
    .line 13
    .line 14
    invoke-direct {v0, v1}, Landroidx/camera/core/impl/utils/f;-><init>(Landroidx/camera/core/impl/utils/f$b;)V

    .line 15
    .line 16
    .line 17
    return-object v0

    .line 18
    :cond_0
    new-instance v0, Landroidx/camera/core/impl/utils/f;

    .line 19
    .line 20
    new-instance v1, Landroidx/camera/core/impl/utils/f$c;

    .line 21
    .line 22
    invoke-direct {v1}, Landroidx/camera/core/impl/utils/f$c;-><init>()V

    .line 23
    .line 24
    .line 25
    invoke-direct {v0, v1}, Landroidx/camera/core/impl/utils/f;-><init>(Landroidx/camera/core/impl/utils/f$b;)V

    .line 26
    .line 27
    .line 28
    return-object v0
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
.method public a()V
    .locals 1

    iget-object v0, p0, Landroidx/camera/core/impl/utils/f;->a:Landroidx/camera/core/impl/utils/f$b;

    invoke-interface {v0}, Landroidx/camera/core/impl/utils/f$b;->close()V

    return-void
.end method

.method public c(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Landroidx/camera/core/impl/utils/f;->a:Landroidx/camera/core/impl/utils/f$b;

    invoke-interface {v0, p1}, Landroidx/camera/core/impl/utils/f$b;->b(Ljava/lang/String;)V

    return-void
.end method

.method public d()V
    .locals 1

    iget-object v0, p0, Landroidx/camera/core/impl/utils/f;->a:Landroidx/camera/core/impl/utils/f$b;

    invoke-interface {v0}, Landroidx/camera/core/impl/utils/f$b;->a()V

    return-void
.end method
