.class public final Lx7/c$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx7/k$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lx7/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field private final b:Lac/n;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lac/n<",
            "Landroid/os/HandlerThread;",
            ">;"
        }
    .end annotation
.end field

.field private final c:Lac/n;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lac/n<",
            "Landroid/os/HandlerThread;",
            ">;"
        }
    .end annotation
.end field

.field private final d:Z

.field private final e:Z


# direct methods
.method public constructor <init>(IZZ)V
    .locals 2

    .line 1
    new-instance v0, Lx7/d;

    invoke-direct {v0, p1}, Lx7/d;-><init>(I)V

    new-instance v1, Lx7/e;

    invoke-direct {v1, p1}, Lx7/e;-><init>(I)V

    invoke-direct {p0, v0, v1, p2, p3}, Lx7/c$b;-><init>(Lac/n;Lac/n;ZZ)V

    return-void
.end method

.method constructor <init>(Lac/n;Lac/n;ZZ)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lac/n<",
            "Landroid/os/HandlerThread;",
            ">;",
            "Lac/n<",
            "Landroid/os/HandlerThread;",
            ">;ZZ)V"
        }
    .end annotation

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lx7/c$b;->b:Lac/n;

    .line 4
    iput-object p2, p0, Lx7/c$b;->c:Lac/n;

    .line 5
    iput-boolean p3, p0, Lx7/c$b;->d:Z

    .line 6
    iput-boolean p4, p0, Lx7/c$b;->e:Z

    return-void
.end method

.method public static synthetic b(I)Landroid/os/HandlerThread;
    .locals 0

    invoke-static {p0}, Lx7/c$b;->e(I)Landroid/os/HandlerThread;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(I)Landroid/os/HandlerThread;
    .locals 0

    invoke-static {p0}, Lx7/c$b;->f(I)Landroid/os/HandlerThread;

    move-result-object p0

    return-object p0
.end method

.method private static synthetic e(I)Landroid/os/HandlerThread;
    .locals 1

    new-instance v0, Landroid/os/HandlerThread;

    invoke-static {p0}, Lx7/c;->l(I)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method private static synthetic f(I)Landroid/os/HandlerThread;
    .locals 1

    new-instance v0, Landroid/os/HandlerThread;

    invoke-static {p0}, Lx7/c;->k(I)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V

    return-object v0
.end method


# virtual methods
.method public bridge synthetic a(Landroid/media/MediaCodec;)Lx7/k;
    .locals 0

    invoke-virtual {p0, p1}, Lx7/c$b;->d(Landroid/media/MediaCodec;)Lx7/c;

    move-result-object p1

    return-object p1
.end method

.method public d(Landroid/media/MediaCodec;)Lx7/c;
    .locals 8

    .line 1
    new-instance v7, Lx7/c;

    .line 2
    .line 3
    iget-object v0, p0, Lx7/c$b;->b:Lac/n;

    .line 4
    .line 5
    invoke-interface {v0}, Lac/n;->get()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    move-object v2, v0

    .line 10
    check-cast v2, Landroid/os/HandlerThread;

    .line 11
    .line 12
    iget-object v0, p0, Lx7/c$b;->c:Lac/n;

    .line 13
    .line 14
    invoke-interface {v0}, Lac/n;->get()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    move-object v3, v0

    .line 19
    check-cast v3, Landroid/os/HandlerThread;

    .line 20
    .line 21
    iget-boolean v4, p0, Lx7/c$b;->d:Z

    .line 22
    .line 23
    iget-boolean v5, p0, Lx7/c$b;->e:Z

    .line 24
    .line 25
    const/4 v6, 0x0

    .line 26
    move-object v0, v7

    .line 27
    move-object v1, p1

    .line 28
    invoke-direct/range {v0 .. v6}, Lx7/c;-><init>(Landroid/media/MediaCodec;Landroid/os/HandlerThread;Landroid/os/HandlerThread;ZZLx7/c$a;)V

    .line 29
    .line 30
    .line 31
    return-object v7
    .line 32
    .line 33
    .line 34
    .line 35
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
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
.end method
