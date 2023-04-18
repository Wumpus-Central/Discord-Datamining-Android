.class public final synthetic Lq/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lq/w$c;


# instance fields
.field public final synthetic a:J

.field public final synthetic b:Landroidx/concurrent/futures/c$a;


# direct methods
.method public synthetic constructor <init>(JLandroidx/concurrent/futures/c$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Lq/i;->a:J

    iput-object p3, p0, Lq/i;->b:Landroidx/concurrent/futures/c$a;

    return-void
.end method


# virtual methods
.method public final a(Landroid/hardware/camera2/TotalCaptureResult;)Z
    .locals 3

    iget-wide v0, p0, Lq/i;->a:J

    iget-object v2, p0, Lq/i;->b:Landroidx/concurrent/futures/c$a;

    invoke-static {v0, v1, v2, p1}, Lq/w;->m(JLandroidx/concurrent/futures/c$a;Landroid/hardware/camera2/TotalCaptureResult;)Z

    move-result p1

    return p1
.end method
