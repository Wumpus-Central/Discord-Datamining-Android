.class public final synthetic Lr/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic k:Lr/j$b;

.field public final synthetic l:Landroid/hardware/camera2/CameraCaptureSession;

.field public final synthetic m:I

.field public final synthetic n:J


# direct methods
.method public synthetic constructor <init>(Lr/j$b;Landroid/hardware/camera2/CameraCaptureSession;IJ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lr/m;->k:Lr/j$b;

    iput-object p2, p0, Lr/m;->l:Landroid/hardware/camera2/CameraCaptureSession;

    iput p3, p0, Lr/m;->m:I

    iput-wide p4, p0, Lr/m;->n:J

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    iget-object v0, p0, Lr/m;->k:Lr/j$b;

    iget-object v1, p0, Lr/m;->l:Landroid/hardware/camera2/CameraCaptureSession;

    iget v2, p0, Lr/m;->m:I

    iget-wide v3, p0, Lr/m;->n:J

    invoke-static {v0, v1, v2, v3, v4}, Lr/j$b;->e(Lr/j$b;Landroid/hardware/camera2/CameraCaptureSession;IJ)V

    return-void
.end method
