.class public Ln8/g$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Comparable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ln8/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "e"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/lang/Comparable<",
        "Ljava/lang/Long;",
        ">;"
    }
.end annotation


# instance fields
.field public final k:Ljava/lang/String;

.field public final l:Ln8/g$d;

.field public final m:J

.field public final n:I

.field public final o:J

.field public final p:Lj7/l;

.field public final q:Ljava/lang/String;

.field public final r:Ljava/lang/String;

.field public final s:J

.field public final t:J

.field public final u:Z


# direct methods
.method private constructor <init>(Ljava/lang/String;Ln8/g$d;JIJLj7/l;Ljava/lang/String;Ljava/lang/String;JJZ)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Ln8/g$e;->k:Ljava/lang/String;

    .line 4
    iput-object p2, p0, Ln8/g$e;->l:Ln8/g$d;

    .line 5
    iput-wide p3, p0, Ln8/g$e;->m:J

    .line 6
    iput p5, p0, Ln8/g$e;->n:I

    .line 7
    iput-wide p6, p0, Ln8/g$e;->o:J

    .line 8
    iput-object p8, p0, Ln8/g$e;->p:Lj7/l;

    .line 9
    iput-object p9, p0, Ln8/g$e;->q:Ljava/lang/String;

    .line 10
    iput-object p10, p0, Ln8/g$e;->r:Ljava/lang/String;

    .line 11
    iput-wide p11, p0, Ln8/g$e;->s:J

    .line 12
    iput-wide p13, p0, Ln8/g$e;->t:J

    .line 13
    iput-boolean p15, p0, Ln8/g$e;->u:Z

    return-void
.end method

.method synthetic constructor <init>(Ljava/lang/String;Ln8/g$d;JIJLj7/l;Ljava/lang/String;Ljava/lang/String;JJZLn8/g$a;)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p15}, Ln8/g$e;-><init>(Ljava/lang/String;Ln8/g$d;JIJLj7/l;Ljava/lang/String;Ljava/lang/String;JJZ)V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Long;)I
    .locals 4

    .line 1
    iget-wide v0, p0, Ln8/g$e;->o:J

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 4
    .line 5
    .line 6
    move-result-wide v2

    .line 7
    cmp-long v0, v0, v2

    .line 8
    .line 9
    if-lez v0, :cond_0

    .line 10
    .line 11
    const/4 p1, 0x1

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    iget-wide v0, p0, Ln8/g$e;->o:J

    .line 14
    .line 15
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 16
    .line 17
    .line 18
    move-result-wide v2

    .line 19
    cmp-long p1, v0, v2

    .line 20
    .line 21
    if-gez p1, :cond_1

    .line 22
    .line 23
    const/4 p1, -0x1

    .line 24
    goto :goto_0

    .line 25
    :cond_1
    const/4 p1, 0x0

    .line 26
    :goto_0
    return p1
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

.method public bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    check-cast p1, Ljava/lang/Long;

    invoke-virtual {p0, p1}, Ln8/g$e;->a(Ljava/lang/Long;)I

    move-result p1

    return p1
.end method
