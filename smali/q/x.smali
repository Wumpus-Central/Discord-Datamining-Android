.class public final synthetic Lq/x;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic k:Lq/w$b;

.field public final synthetic l:Landroid/hardware/camera2/TotalCaptureResult;


# direct methods
.method public synthetic constructor <init>(Lq/w$b;Landroid/hardware/camera2/TotalCaptureResult;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lq/x;->k:Lq/w$b;

    iput-object p2, p0, Lq/x;->l:Landroid/hardware/camera2/TotalCaptureResult;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lq/x;->k:Lq/w$b;

    iget-object v1, p0, Lq/x;->l:Landroid/hardware/camera2/TotalCaptureResult;

    invoke-static {v0, v1}, Lq/w$b;->a(Lq/w$b;Landroid/hardware/camera2/TotalCaptureResult;)V

    return-void
.end method
