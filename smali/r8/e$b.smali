.class final Lr8/e$b;
.super Lq8/j;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Comparable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lr8/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lq8/j;",
        "Ljava/lang/Comparable<",
        "Lr8/e$b;",
        ">;"
    }
.end annotation


# instance fields
.field private t:J


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lq8/j;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lr8/e$a;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Lr8/e$b;-><init>()V

    return-void
.end method

.method static synthetic w(Lr8/e$b;J)J
    .locals 0

    iput-wide p1, p0, Lr8/e$b;->t:J

    return-wide p1
.end method


# virtual methods
.method public bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    check-cast p1, Lr8/e$b;

    invoke-virtual {p0, p1}, Lr8/e$b;->x(Lr8/e$b;)I

    move-result p1

    return p1
.end method

.method public x(Lr8/e$b;)I
    .locals 8

    .line 1
    invoke-virtual {p0}, Lh7/a;->m()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p1}, Lh7/a;->m()Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const/4 v2, 0x1

    .line 10
    const/4 v3, -0x1

    .line 11
    if-eq v0, v1, :cond_1

    .line 12
    .line 13
    invoke-virtual {p0}, Lh7/a;->m()Z

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    if-eqz p1, :cond_0

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    move v2, v3

    .line 21
    :goto_0
    return v2

    .line 22
    :cond_1
    iget-wide v0, p0, Lh7/h;->o:J

    .line 23
    .line 24
    iget-wide v4, p1, Lh7/h;->o:J

    .line 25
    .line 26
    sub-long/2addr v0, v4

    .line 27
    const-wide/16 v4, 0x0

    .line 28
    .line 29
    cmp-long v6, v0, v4

    .line 30
    .line 31
    if-nez v6, :cond_2

    .line 32
    .line 33
    iget-wide v0, p0, Lr8/e$b;->t:J

    .line 34
    .line 35
    iget-wide v6, p1, Lr8/e$b;->t:J

    .line 36
    .line 37
    sub-long/2addr v0, v6

    .line 38
    cmp-long p1, v0, v4

    .line 39
    .line 40
    if-nez p1, :cond_2

    .line 41
    .line 42
    const/4 p1, 0x0

    .line 43
    return p1

    .line 44
    :cond_2
    cmp-long p1, v0, v4

    .line 45
    .line 46
    if-lez p1, :cond_3

    .line 47
    .line 48
    goto :goto_1

    .line 49
    :cond_3
    move v2, v3

    .line 50
    :goto_1
    return v2
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
.end method
