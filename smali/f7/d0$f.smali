.class final Lf7/d0$f;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lf7/d0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "f"
.end annotation


# instance fields
.field public final a:Lcom/google/android/exoplayer2/PlaybackParameters;

.field public final b:Z

.field public final c:J

.field public final d:J


# direct methods
.method private constructor <init>(Lcom/google/android/exoplayer2/PlaybackParameters;ZJJ)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lf7/d0$f;->a:Lcom/google/android/exoplayer2/PlaybackParameters;

    .line 4
    iput-boolean p2, p0, Lf7/d0$f;->b:Z

    .line 5
    iput-wide p3, p0, Lf7/d0$f;->c:J

    .line 6
    iput-wide p5, p0, Lf7/d0$f;->d:J

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/android/exoplayer2/PlaybackParameters;ZJJLf7/d0$a;)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p6}, Lf7/d0$f;-><init>(Lcom/google/android/exoplayer2/PlaybackParameters;ZJJ)V

    return-void
.end method
