.class public final synthetic Lr/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic k:Lr/j$b;

.field public final synthetic l:Landroid/hardware/camera2/CameraCaptureSession;

.field public final synthetic m:I


# direct methods
.method public synthetic constructor <init>(Lr/j$b;Landroid/hardware/camera2/CameraCaptureSession;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lr/k;->k:Lr/j$b;

    iput-object p2, p0, Lr/k;->l:Landroid/hardware/camera2/CameraCaptureSession;

    iput p3, p0, Lr/k;->m:I

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lr/k;->k:Lr/j$b;

    iget-object v1, p0, Lr/k;->l:Landroid/hardware/camera2/CameraCaptureSession;

    iget v2, p0, Lr/k;->m:I

    invoke-static {v0, v1, v2}, Lr/j$b;->c(Lr/j$b;Landroid/hardware/camera2/CameraCaptureSession;I)V

    return-void
.end method
