.class Lcom/google/android/exoplayer2/d$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/media/AudioManager$OnAudioFocusChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/exoplayer2/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "a"
.end annotation


# instance fields
.field private final k:Landroid/os/Handler;

.field final synthetic l:Lcom/google/android/exoplayer2/d;


# direct methods
.method public constructor <init>(Lcom/google/android/exoplayer2/d;Landroid/os/Handler;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/google/android/exoplayer2/d$a;->l:Lcom/google/android/exoplayer2/d;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-object p2, p0, Lcom/google/android/exoplayer2/d$a;->k:Landroid/os/Handler;

    .line 7
    .line 8
    return-void
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
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
.end method

.method public static synthetic a(Lcom/google/android/exoplayer2/d$a;I)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/exoplayer2/d$a;->b(I)V

    return-void
.end method

.method private synthetic b(I)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/exoplayer2/d$a;->l:Lcom/google/android/exoplayer2/d;

    invoke-static {v0, p1}, Lcom/google/android/exoplayer2/d;->d(Lcom/google/android/exoplayer2/d;I)V

    return-void
.end method


# virtual methods
.method public onAudioFocusChange(I)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/exoplayer2/d$a;->k:Landroid/os/Handler;

    new-instance v1, Lcom/google/android/exoplayer2/c;

    invoke-direct {v1, p0, p1}, Lcom/google/android/exoplayer2/c;-><init>(Lcom/google/android/exoplayer2/d$a;I)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method
