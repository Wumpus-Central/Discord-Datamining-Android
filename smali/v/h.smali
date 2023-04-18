.class public final Lv/h;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Lq/m0;


# direct methods
.method public constructor <init>(Lq/m0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lv/h;->a:Lq/m0;

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

.method public static a(Landroidx/camera/core/r;)Landroid/hardware/camera2/CameraCharacteristics;
    .locals 2

    .line 1
    instance-of v0, p0, Lq/m0;

    .line 2
    .line 3
    const-string v1, "CameraInfo does not contain any Camera2 information."

    .line 4
    .line 5
    invoke-static {v0, v1}, Landroidx/core/util/g;->j(ZLjava/lang/String;)V

    .line 6
    .line 7
    .line 8
    check-cast p0, Lq/m0;

    .line 9
    .line 10
    invoke-virtual {p0}, Lq/m0;->k()Lr/f0;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    invoke-virtual {p0}, Lr/f0;->d()Landroid/hardware/camera2/CameraCharacteristics;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    return-object p0
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

.method public static b(Landroidx/camera/core/r;)Lv/h;
    .locals 2

    .line 1
    instance-of v0, p0, Lq/m0;

    .line 2
    .line 3
    const-string v1, "CameraInfo doesn\'t contain Camera2 implementation."

    .line 4
    .line 5
    invoke-static {v0, v1}, Landroidx/core/util/g;->b(ZLjava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    check-cast p0, Lq/m0;

    .line 9
    .line 10
    invoke-virtual {p0}, Lq/m0;->j()Lv/h;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    return-object p0
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
.method public c(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Landroid/hardware/camera2/CameraCharacteristics$Key<",
            "TT;>;)TT;"
        }
    .end annotation

    iget-object v0, p0, Lv/h;->a:Lq/m0;

    invoke-virtual {v0}, Lq/m0;->k()Lr/f0;

    move-result-object v0

    invoke-virtual {v0, p1}, Lr/f0;->a(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public d()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Landroid/hardware/camera2/CameraCharacteristics;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lv/h;->a:Lq/m0;

    invoke-virtual {v0}, Lq/m0;->l()Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public e()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lv/h;->a:Lq/m0;

    invoke-virtual {v0}, Lq/m0;->b()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
