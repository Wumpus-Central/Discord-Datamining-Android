.class final Lt7/a$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ll7/y;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lt7/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "b"
.end annotation


# instance fields
.field final synthetic a:Lt7/a;


# direct methods
.method private constructor <init>(Lt7/a;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lt7/a$b;->a:Lt7/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lt7/a;Lt7/a$a;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Lt7/a$b;-><init>(Lt7/a;)V

    return-void
.end method


# virtual methods
.method public e()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public g(J)Ll7/y$a;
    .locals 10

    .line 1
    iget-object v0, p0, Lt7/a$b;->a:Lt7/a;

    .line 2
    .line 3
    invoke-static {v0}, Lt7/a;->d(Lt7/a;)Lt7/i;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0, p1, p2}, Lt7/i;->c(J)J

    .line 8
    .line 9
    .line 10
    move-result-wide v0

    .line 11
    iget-object v2, p0, Lt7/a$b;->a:Lt7/a;

    .line 12
    .line 13
    invoke-static {v2}, Lt7/a;->e(Lt7/a;)J

    .line 14
    .line 15
    .line 16
    move-result-wide v2

    .line 17
    iget-object v4, p0, Lt7/a$b;->a:Lt7/a;

    .line 18
    .line 19
    invoke-static {v4}, Lt7/a;->f(Lt7/a;)J

    .line 20
    .line 21
    .line 22
    move-result-wide v4

    .line 23
    iget-object v6, p0, Lt7/a$b;->a:Lt7/a;

    .line 24
    .line 25
    invoke-static {v6}, Lt7/a;->e(Lt7/a;)J

    .line 26
    .line 27
    .line 28
    move-result-wide v6

    .line 29
    sub-long/2addr v4, v6

    .line 30
    mul-long/2addr v0, v4

    .line 31
    iget-object v4, p0, Lt7/a$b;->a:Lt7/a;

    .line 32
    .line 33
    invoke-static {v4}, Lt7/a;->g(Lt7/a;)J

    .line 34
    .line 35
    .line 36
    move-result-wide v4

    .line 37
    div-long/2addr v0, v4

    .line 38
    add-long/2addr v2, v0

    .line 39
    const-wide/16 v0, 0x7530

    .line 40
    .line 41
    sub-long v4, v2, v0

    .line 42
    .line 43
    iget-object v0, p0, Lt7/a$b;->a:Lt7/a;

    .line 44
    .line 45
    invoke-static {v0}, Lt7/a;->e(Lt7/a;)J

    .line 46
    .line 47
    .line 48
    move-result-wide v6

    .line 49
    iget-object v0, p0, Lt7/a$b;->a:Lt7/a;

    .line 50
    .line 51
    invoke-static {v0}, Lt7/a;->f(Lt7/a;)J

    .line 52
    .line 53
    .line 54
    move-result-wide v0

    .line 55
    const-wide/16 v2, 0x1

    .line 56
    .line 57
    sub-long v8, v0, v2

    .line 58
    .line 59
    invoke-static/range {v4 .. v9}, Lf9/q0;->s(JJJ)J

    .line 60
    .line 61
    .line 62
    move-result-wide v0

    .line 63
    new-instance v2, Ll7/y$a;

    .line 64
    .line 65
    new-instance v3, Ll7/z;

    .line 66
    .line 67
    invoke-direct {v3, p1, p2, v0, v1}, Ll7/z;-><init>(JJ)V

    .line 68
    .line 69
    .line 70
    invoke-direct {v2, v3}, Ll7/y$a;-><init>(Ll7/z;)V

    .line 71
    .line 72
    .line 73
    return-object v2
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

.method public h()J
    .locals 3

    iget-object v0, p0, Lt7/a$b;->a:Lt7/a;

    invoke-static {v0}, Lt7/a;->d(Lt7/a;)Lt7/i;

    move-result-object v0

    iget-object v1, p0, Lt7/a$b;->a:Lt7/a;

    invoke-static {v1}, Lt7/a;->g(Lt7/a;)J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lt7/i;->b(J)J

    move-result-wide v0

    return-wide v0
.end method
