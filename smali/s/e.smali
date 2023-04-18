.class Ls/e;
.super Ls/i;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ls/e$a;
    }
.end annotation


# direct methods
.method constructor <init>(Landroid/view/Surface;)V
    .locals 2

    .line 1
    new-instance v0, Ls/e$a;

    new-instance v1, Landroid/hardware/camera2/params/OutputConfiguration;

    invoke-direct {v1, p1}, Landroid/hardware/camera2/params/OutputConfiguration;-><init>(Landroid/view/Surface;)V

    invoke-direct {v0, v1}, Ls/e$a;-><init>(Landroid/hardware/camera2/params/OutputConfiguration;)V

    invoke-direct {p0, v0}, Ls/e;-><init>(Ljava/lang/Object;)V

    return-void
.end method

.method constructor <init>(Ljava/lang/Object;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Ls/i;-><init>(Ljava/lang/Object;)V

    return-void
.end method

.method static d(Landroid/hardware/camera2/params/OutputConfiguration;)Ls/e;
    .locals 2

    new-instance v0, Ls/e;

    new-instance v1, Ls/e$a;

    invoke-direct {v1, p0}, Ls/e$a;-><init>(Landroid/hardware/camera2/params/OutputConfiguration;)V

    invoke-direct {v0, v1}, Ls/e;-><init>(Ljava/lang/Object;)V

    return-object v0
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Ls/i;->a:Ljava/lang/Object;

    check-cast v0, Ls/e$a;

    iget-object v0, v0, Ls/e$a;->b:Ljava/lang/String;

    return-object v0
.end method

.method public b(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Ls/i;->a:Ljava/lang/Object;

    check-cast v0, Ls/e$a;

    iput-object p1, v0, Ls/e$a;->b:Ljava/lang/String;

    return-void
.end method

.method public c()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Ls/i;->a:Ljava/lang/Object;

    .line 2
    .line 3
    instance-of v0, v0, Ls/e$a;

    .line 4
    .line 5
    invoke-static {v0}, Landroidx/core/util/g;->a(Z)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Ls/i;->a:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, Ls/e$a;

    .line 11
    .line 12
    iget-object v0, v0, Ls/e$a;->a:Landroid/hardware/camera2/params/OutputConfiguration;

    .line 13
    .line 14
    return-object v0
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

.method public getSurface()Landroid/view/Surface;
    .locals 1

    invoke-virtual {p0}, Ls/e;->c()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/hardware/camera2/params/OutputConfiguration;

    invoke-static {v0}, Ls/c;->a(Landroid/hardware/camera2/params/OutputConfiguration;)Landroid/view/Surface;

    move-result-object v0

    return-object v0
.end method
