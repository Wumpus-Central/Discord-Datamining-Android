.class Lq/o0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lw/n0$b;


# static fields
.field static final a:Lq/o0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lq/o0;

    invoke-direct {v0}, Lq/o0;-><init>()V

    sput-object v0, Lq/o0;->a:Lq/o0;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lw/x2;Lw/n0$a;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lw/x2<",
            "*>;",
            "Lw/n0$a;",
            ")V"
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-interface {p1, v0}, Lw/x2;->t(Lw/n0;)Lw/n0;

    .line 3
    .line 4
    .line 5
    move-result-object v0

    .line 6
    invoke-static {}, Lw/c2;->G()Lw/c2;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-static {}, Lw/n0;->a()Lw/n0;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    invoke-virtual {v2}, Lw/n0;->f()I

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    invoke-virtual {v0}, Lw/n0;->f()I

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    invoke-virtual {v0}, Lw/n0;->b()Ljava/util/List;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    invoke-virtual {p2, v1}, Lw/n0$a;->a(Ljava/util/Collection;)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0}, Lw/n0;->c()Lw/r0;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    :cond_0
    invoke-virtual {p2, v1}, Lw/n0$a;->n(Lw/r0;)V

    .line 36
    .line 37
    .line 38
    new-instance v0, Lp/b;

    .line 39
    .line 40
    invoke-direct {v0, p1}, Lp/b;-><init>(Lw/r0;)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {v0, v2}, Lp/b;->J(I)I

    .line 44
    .line 45
    .line 46
    move-result p1

    .line 47
    invoke-virtual {p2, p1}, Lw/n0$a;->o(I)V

    .line 48
    .line 49
    .line 50
    invoke-static {}, Lq/n0;->c()Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    invoke-virtual {v0, p1}, Lp/b;->M(Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;)Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    invoke-static {p1}, Lq/o1;->d(Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;)Lq/o1;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    invoke-virtual {p2, p1}, Lw/n0$a;->c(Lw/k;)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {v0}, Lp/b;->H()Lv/k;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    invoke-virtual {p2, p1}, Lw/n0$a;->e(Lw/r0;)V

    .line 70
    .line 71
    .line 72
    return-void
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
.end method
