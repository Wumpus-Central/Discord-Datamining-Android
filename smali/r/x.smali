.class public final synthetic Lr/x;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic k:Lr/j$c;

.field public final synthetic l:Landroid/hardware/camera2/CameraCaptureSession;

.field public final synthetic m:Landroid/view/Surface;


# direct methods
.method public synthetic constructor <init>(Lr/j$c;Landroid/hardware/camera2/CameraCaptureSession;Landroid/view/Surface;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lr/x;->k:Lr/j$c;

    iput-object p2, p0, Lr/x;->l:Landroid/hardware/camera2/CameraCaptureSession;

    iput-object p3, p0, Lr/x;->m:Landroid/view/Surface;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lr/x;->k:Lr/j$c;

    iget-object v1, p0, Lr/x;->l:Landroid/hardware/camera2/CameraCaptureSession;

    iget-object v2, p0, Lr/x;->m:Landroid/view/Surface;

    invoke-static {v0, v1, v2}, Lr/j$c;->a(Lr/j$c;Landroid/hardware/camera2/CameraCaptureSession;Landroid/view/Surface;)V

    return-void
.end method
