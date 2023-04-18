.class public final synthetic Lq/s0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ly/a;


# instance fields
.field public final synthetic a:Lq/r0$c;

.field public final synthetic b:I


# direct methods
.method public synthetic constructor <init>(Lq/r0$c;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lq/s0;->a:Lq/r0$c;

    iput p2, p0, Lq/s0;->b:I

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Lfc/b;
    .locals 2

    iget-object v0, p0, Lq/s0;->a:Lq/r0$c;

    iget v1, p0, Lq/s0;->b:I

    check-cast p1, Landroid/hardware/camera2/TotalCaptureResult;

    invoke-static {v0, v1, p1}, Lq/r0$c;->f(Lq/r0$c;ILandroid/hardware/camera2/TotalCaptureResult;)Lfc/b;

    move-result-object p1

    return-object p1
.end method
