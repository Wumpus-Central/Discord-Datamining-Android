.class public final synthetic Lr/k0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic k:Lr/g0$b;

.field public final synthetic l:Landroid/hardware/camera2/CameraDevice;

.field public final synthetic m:I


# direct methods
.method public synthetic constructor <init>(Lr/g0$b;Landroid/hardware/camera2/CameraDevice;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lr/k0;->k:Lr/g0$b;

    iput-object p2, p0, Lr/k0;->l:Landroid/hardware/camera2/CameraDevice;

    iput p3, p0, Lr/k0;->m:I

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lr/k0;->k:Lr/g0$b;

    iget-object v1, p0, Lr/k0;->l:Landroid/hardware/camera2/CameraDevice;

    iget v2, p0, Lr/k0;->m:I

    invoke-static {v0, v1, v2}, Lr/g0$b;->c(Lr/g0$b;Landroid/hardware/camera2/CameraDevice;I)V

    return-void
.end method
