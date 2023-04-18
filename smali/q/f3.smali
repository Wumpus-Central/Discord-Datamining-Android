.class public final synthetic Lq/f3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lq/w$c;


# instance fields
.field public final synthetic a:Lq/h3;


# direct methods
.method public synthetic constructor <init>(Lq/h3;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lq/f3;->a:Lq/h3;

    return-void
.end method


# virtual methods
.method public final a(Landroid/hardware/camera2/TotalCaptureResult;)Z
    .locals 1

    iget-object v0, p0, Lq/f3;->a:Lq/h3;

    invoke-static {v0, p1}, Lq/h3;->b(Lq/h3;Landroid/hardware/camera2/TotalCaptureResult;)Z

    move-result p1

    return p1
.end method
