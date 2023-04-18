.class public final synthetic Lr/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic k:Lr/j$b;

.field public final synthetic l:Landroid/hardware/camera2/CameraCaptureSession;

.field public final synthetic m:Landroid/hardware/camera2/CaptureRequest;

.field public final synthetic n:J

.field public final synthetic o:J


# direct methods
.method public synthetic constructor <init>(Lr/j$b;Landroid/hardware/camera2/CameraCaptureSession;Landroid/hardware/camera2/CaptureRequest;JJ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lr/p;->k:Lr/j$b;

    iput-object p2, p0, Lr/p;->l:Landroid/hardware/camera2/CameraCaptureSession;

    iput-object p3, p0, Lr/p;->m:Landroid/hardware/camera2/CaptureRequest;

    iput-wide p4, p0, Lr/p;->n:J

    iput-wide p6, p0, Lr/p;->o:J

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 7

    iget-object v0, p0, Lr/p;->k:Lr/j$b;

    iget-object v1, p0, Lr/p;->l:Landroid/hardware/camera2/CameraCaptureSession;

    iget-object v2, p0, Lr/p;->m:Landroid/hardware/camera2/CaptureRequest;

    iget-wide v3, p0, Lr/p;->n:J

    iget-wide v5, p0, Lr/p;->o:J

    invoke-static/range {v0 .. v6}, Lr/j$b;->d(Lr/j$b;Landroid/hardware/camera2/CameraCaptureSession;Landroid/hardware/camera2/CaptureRequest;JJ)V

    return-void
.end method
