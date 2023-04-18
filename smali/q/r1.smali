.class public final synthetic Lq/r1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ly/a;


# instance fields
.field public final synthetic a:Lq/t1;

.field public final synthetic b:Lw/k2;

.field public final synthetic c:Landroid/hardware/camera2/CameraDevice;


# direct methods
.method public synthetic constructor <init>(Lq/t1;Lw/k2;Landroid/hardware/camera2/CameraDevice;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lq/r1;->a:Lq/t1;

    iput-object p2, p0, Lq/r1;->b:Lw/k2;

    iput-object p3, p0, Lq/r1;->c:Landroid/hardware/camera2/CameraDevice;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Lfc/b;
    .locals 3

    iget-object v0, p0, Lq/r1;->a:Lq/t1;

    iget-object v1, p0, Lq/r1;->b:Lw/k2;

    iget-object v2, p0, Lq/r1;->c:Landroid/hardware/camera2/CameraDevice;

    check-cast p1, Ljava/util/List;

    invoke-static {v0, v1, v2, p1}, Lq/t1;->i(Lq/t1;Lw/k2;Landroid/hardware/camera2/CameraDevice;Ljava/util/List;)Lfc/b;

    move-result-object p1

    return-object p1
.end method
