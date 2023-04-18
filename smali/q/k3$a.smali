.class Lq/k3$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lq/w$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lq/k3;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lq/k3;


# direct methods
.method constructor <init>(Lq/k3;)V
    .locals 0

    iput-object p1, p0, Lq/k3$a;->a:Lq/k3;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/hardware/camera2/TotalCaptureResult;)Z
    .locals 1

    iget-object v0, p0, Lq/k3$a;->a:Lq/k3;

    iget-object v0, v0, Lq/k3;->e:Lq/k3$b;

    invoke-interface {v0, p1}, Lq/k3$b;->a(Landroid/hardware/camera2/TotalCaptureResult;)V

    const/4 p1, 0x0

    return p1
.end method
