.class final Lcom/google/android/exoplayer2/g0$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/exoplayer2/g0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "b"
.end annotation


# instance fields
.field private final a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/google/android/exoplayer2/p0$c;",
            ">;"
        }
    .end annotation
.end field

.field private final b:Li8/q0;

.field private final c:I

.field private final d:J


# direct methods
.method private constructor <init>(Ljava/util/List;Li8/q0;IJ)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/google/android/exoplayer2/p0$c;",
            ">;",
            "Li8/q0;",
            "IJ)V"
        }
    .end annotation

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/google/android/exoplayer2/g0$b;->a:Ljava/util/List;

    .line 4
    iput-object p2, p0, Lcom/google/android/exoplayer2/g0$b;->b:Li8/q0;

    .line 5
    iput p3, p0, Lcom/google/android/exoplayer2/g0$b;->c:I

    .line 6
    iput-wide p4, p0, Lcom/google/android/exoplayer2/g0$b;->d:J

    return-void
.end method

.method synthetic constructor <init>(Ljava/util/List;Li8/q0;IJLcom/google/android/exoplayer2/g0$a;)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p5}, Lcom/google/android/exoplayer2/g0$b;-><init>(Ljava/util/List;Li8/q0;IJ)V

    return-void
.end method

.method static synthetic a(Lcom/google/android/exoplayer2/g0$b;)I
    .locals 0

    iget p0, p0, Lcom/google/android/exoplayer2/g0$b;->c:I

    return p0
.end method

.method static synthetic b(Lcom/google/android/exoplayer2/g0$b;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Lcom/google/android/exoplayer2/g0$b;->a:Ljava/util/List;

    return-object p0
.end method

.method static synthetic c(Lcom/google/android/exoplayer2/g0$b;)Li8/q0;
    .locals 0

    iget-object p0, p0, Lcom/google/android/exoplayer2/g0$b;->b:Li8/q0;

    return-object p0
.end method

.method static synthetic d(Lcom/google/android/exoplayer2/g0$b;)J
    .locals 2

    iget-wide v0, p0, Lcom/google/android/exoplayer2/g0$b;->d:J

    return-wide v0
.end method
