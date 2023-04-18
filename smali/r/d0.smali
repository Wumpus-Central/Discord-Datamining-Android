.class Lr/d0;
.super Lr/e0;
.source "SourceFile"


# direct methods
.method constructor <init>(Landroid/hardware/camera2/CameraCharacteristics;)V
    .locals 0

    invoke-direct {p0, p1}, Lr/e0;-><init>(Landroid/hardware/camera2/CameraCharacteristics;)V

    return-void
.end method


# virtual methods
.method public b()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lr/e0;->a:Landroid/hardware/camera2/CameraCharacteristics;

    invoke-static {v0}, Lr/c0;->a(Landroid/hardware/camera2/CameraCharacteristics;)Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method
