.class public final synthetic Lq/l2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ly/a;


# instance fields
.field public final synthetic a:Lq/p2;

.field public final synthetic b:Lw/k2;

.field public final synthetic c:Landroid/hardware/camera2/CameraDevice;

.field public final synthetic d:Lq/c3;


# direct methods
.method public synthetic constructor <init>(Lq/p2;Lw/k2;Landroid/hardware/camera2/CameraDevice;Lq/c3;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lq/l2;->a:Lq/p2;

    iput-object p2, p0, Lq/l2;->b:Lw/k2;

    iput-object p3, p0, Lq/l2;->c:Landroid/hardware/camera2/CameraDevice;

    iput-object p4, p0, Lq/l2;->d:Lq/c3;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Lfc/b;
    .locals 4

    iget-object v0, p0, Lq/l2;->a:Lq/p2;

    iget-object v1, p0, Lq/l2;->b:Lw/k2;

    iget-object v2, p0, Lq/l2;->c:Landroid/hardware/camera2/CameraDevice;

    iget-object v3, p0, Lq/l2;->d:Lq/c3;

    check-cast p1, Ljava/util/List;

    invoke-static {v0, v1, v2, v3, p1}, Lq/p2;->h(Lq/p2;Lw/k2;Landroid/hardware/camera2/CameraDevice;Lq/c3;Ljava/util/List;)Lfc/b;

    move-result-object p1

    return-object p1
.end method
