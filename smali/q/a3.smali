.class public final synthetic Lq/a3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ly/a;


# instance fields
.field public final synthetic a:Lq/b3;

.field public final synthetic b:Landroid/hardware/camera2/CameraDevice;

.field public final synthetic c:Ls/q;

.field public final synthetic d:Ljava/util/List;


# direct methods
.method public synthetic constructor <init>(Lq/b3;Landroid/hardware/camera2/CameraDevice;Ls/q;Ljava/util/List;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lq/a3;->a:Lq/b3;

    iput-object p2, p0, Lq/a3;->b:Landroid/hardware/camera2/CameraDevice;

    iput-object p3, p0, Lq/a3;->c:Ls/q;

    iput-object p4, p0, Lq/a3;->d:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Lfc/b;
    .locals 4

    iget-object v0, p0, Lq/a3;->a:Lq/b3;

    iget-object v1, p0, Lq/a3;->b:Landroid/hardware/camera2/CameraDevice;

    iget-object v2, p0, Lq/a3;->c:Ls/q;

    iget-object v3, p0, Lq/a3;->d:Ljava/util/List;

    check-cast p1, Ljava/util/List;

    invoke-static {v0, v1, v2, v3, p1}, Lq/b3;->J(Lq/b3;Landroid/hardware/camera2/CameraDevice;Ls/q;Ljava/util/List;Ljava/util/List;)Lfc/b;

    move-result-object p1

    return-object p1
.end method
