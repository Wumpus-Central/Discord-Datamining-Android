.class public Lu/k;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Lw/k2$b;)V
    .locals 3

    .line 1
    const-class v0, Lt/r;

    .line 2
    .line 3
    invoke-static {v0}, Lt/i;->a(Ljava/lang/Class;)Lw/f2;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lt/r;

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    new-instance v0, Lp/b$a;

    .line 13
    .line 14
    invoke-direct {v0}, Lp/b$a;-><init>()V

    .line 15
    .line 16
    .line 17
    sget-object v1, Landroid/hardware/camera2/CaptureRequest;->TONEMAP_MODE:Landroid/hardware/camera2/CaptureRequest$Key;

    .line 18
    .line 19
    const/4 v2, 0x2

    .line 20
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    invoke-virtual {v0, v1, v2}, Lp/b$a;->e(Landroid/hardware/camera2/CaptureRequest$Key;Ljava/lang/Object;)Lp/b$a;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0}, Lp/b$a;->a()Lp/b;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    invoke-virtual {p0, v0}, Lw/k2$b;->g(Lw/r0;)V

    .line 32
    .line 33
    .line 34
    return-void
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
.end method
