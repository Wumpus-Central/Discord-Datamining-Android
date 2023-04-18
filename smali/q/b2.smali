.class public final synthetic Lq/b2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lq/w$c;


# instance fields
.field public final synthetic a:Lq/h2;

.field public final synthetic b:Z

.field public final synthetic c:J


# direct methods
.method public synthetic constructor <init>(Lq/h2;ZJ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lq/b2;->a:Lq/h2;

    iput-boolean p2, p0, Lq/b2;->b:Z

    iput-wide p3, p0, Lq/b2;->c:J

    return-void
.end method


# virtual methods
.method public final a(Landroid/hardware/camera2/TotalCaptureResult;)Z
    .locals 4

    iget-object v0, p0, Lq/b2;->a:Lq/h2;

    iget-boolean v1, p0, Lq/b2;->b:Z

    iget-wide v2, p0, Lq/b2;->c:J

    invoke-static {v0, v1, v2, v3, p1}, Lq/h2;->e(Lq/h2;ZJLandroid/hardware/camera2/TotalCaptureResult;)Z

    move-result p1

    return p1
.end method
