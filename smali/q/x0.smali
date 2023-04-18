.class public final synthetic Lq/x0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lq/r0$e$a;


# instance fields
.field public final synthetic a:Lq/r0$c;


# direct methods
.method public synthetic constructor <init>(Lq/r0$c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lq/x0;->a:Lq/r0$c;

    return-void
.end method


# virtual methods
.method public final a(Landroid/hardware/camera2/TotalCaptureResult;)Z
    .locals 1

    iget-object v0, p0, Lq/x0;->a:Lq/r0$c;

    invoke-static {v0, p1}, Lq/r0$c;->c(Lq/r0$c;Landroid/hardware/camera2/TotalCaptureResult;)Z

    move-result p1

    return p1
.end method
