.class public final Lr/g0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lr/g0$b;,
        Lr/g0$a;
    }
.end annotation


# instance fields
.field private final a:Lr/g0$a;


# direct methods
.method private constructor <init>(Landroid/hardware/camera2/CameraDevice;Landroid/os/Handler;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 5
    .line 6
    const/16 v1, 0x1c

    .line 7
    .line 8
    if-lt v0, v1, :cond_0

    .line 9
    .line 10
    new-instance p2, Lr/q0;

    .line 11
    .line 12
    invoke-direct {p2, p1}, Lr/q0;-><init>(Landroid/hardware/camera2/CameraDevice;)V

    .line 13
    .line 14
    .line 15
    iput-object p2, p0, Lr/g0;->a:Lr/g0$a;

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const/16 v1, 0x18

    .line 19
    .line 20
    if-lt v0, v1, :cond_1

    .line 21
    .line 22
    invoke-static {p1, p2}, Lr/o0;->g(Landroid/hardware/camera2/CameraDevice;Landroid/os/Handler;)Lr/o0;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    iput-object p1, p0, Lr/g0;->a:Lr/g0$a;

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_1
    invoke-static {p1, p2}, Lr/l0;->f(Landroid/hardware/camera2/CameraDevice;Landroid/os/Handler;)Lr/l0;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    iput-object p1, p0, Lr/g0;->a:Lr/g0$a;

    .line 34
    .line 35
    :goto_0
    return-void
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
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

.method public static b(Landroid/hardware/camera2/CameraDevice;Landroid/os/Handler;)Lr/g0;
    .locals 1

    new-instance v0, Lr/g0;

    invoke-direct {v0, p0, p1}, Lr/g0;-><init>(Landroid/hardware/camera2/CameraDevice;Landroid/os/Handler;)V

    return-object v0
.end method


# virtual methods
.method public a(Ls/q;)V
    .locals 1

    iget-object v0, p0, Lr/g0;->a:Lr/g0$a;

    invoke-interface {v0, p1}, Lr/g0$a;->a(Ls/q;)V

    return-void
.end method
