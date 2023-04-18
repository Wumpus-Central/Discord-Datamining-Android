.class public final synthetic Lr/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic k:Lr/j$b;

.field public final synthetic l:Landroid/hardware/camera2/CameraCaptureSession;

.field public final synthetic m:Landroid/hardware/camera2/CaptureRequest;

.field public final synthetic n:Landroid/view/Surface;

.field public final synthetic o:J


# direct methods
.method public synthetic constructor <init>(Lr/j$b;Landroid/hardware/camera2/CameraCaptureSession;Landroid/hardware/camera2/CaptureRequest;Landroid/view/Surface;J)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lr/l;->k:Lr/j$b;

    iput-object p2, p0, Lr/l;->l:Landroid/hardware/camera2/CameraCaptureSession;

    iput-object p3, p0, Lr/l;->m:Landroid/hardware/camera2/CaptureRequest;

    iput-object p4, p0, Lr/l;->n:Landroid/view/Surface;

    iput-wide p5, p0, Lr/l;->o:J

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 6

    iget-object v0, p0, Lr/l;->k:Lr/j$b;

    iget-object v1, p0, Lr/l;->l:Landroid/hardware/camera2/CameraCaptureSession;

    iget-object v2, p0, Lr/l;->m:Landroid/hardware/camera2/CaptureRequest;

    iget-object v3, p0, Lr/l;->n:Landroid/view/Surface;

    iget-wide v4, p0, Lr/l;->o:J

    invoke-static/range {v0 .. v5}, Lr/j$b;->a(Lr/j$b;Landroid/hardware/camera2/CameraCaptureSession;Landroid/hardware/camera2/CaptureRequest;Landroid/view/Surface;J)V

    return-void
.end method
