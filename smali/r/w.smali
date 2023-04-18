.class public final synthetic Lr/w;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic k:Lr/j$c;

.field public final synthetic l:Landroid/hardware/camera2/CameraCaptureSession;


# direct methods
.method public synthetic constructor <init>(Lr/j$c;Landroid/hardware/camera2/CameraCaptureSession;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lr/w;->k:Lr/j$c;

    iput-object p2, p0, Lr/w;->l:Landroid/hardware/camera2/CameraCaptureSession;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lr/w;->k:Lr/j$c;

    iget-object v1, p0, Lr/w;->l:Landroid/hardware/camera2/CameraCaptureSession;

    invoke-static {v0, v1}, Lr/j$c;->g(Lr/j$c;Landroid/hardware/camera2/CameraCaptureSession;)V

    return-void
.end method
