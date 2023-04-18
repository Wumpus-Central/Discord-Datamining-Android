.class Lp7/d$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ll7/y;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lp7/d;->i(Ll7/y;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ll7/y;

.field final synthetic b:Lp7/d;


# direct methods
.method constructor <init>(Lp7/d;Ll7/y;)V
    .locals 0

    iput-object p1, p0, Lp7/d$a;->b:Lp7/d;

    iput-object p2, p0, Lp7/d$a;->a:Ll7/y;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public e()Z
    .locals 1

    iget-object v0, p0, Lp7/d$a;->a:Ll7/y;

    invoke-interface {v0}, Ll7/y;->e()Z

    move-result v0

    return v0
.end method

.method public g(J)Ll7/y$a;
    .locals 8

    .line 1
    iget-object v0, p0, Lp7/d$a;->a:Ll7/y;

    .line 2
    .line 3
    invoke-interface {v0, p1, p2}, Ll7/y;->g(J)Ll7/y$a;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    new-instance p2, Ll7/y$a;

    .line 8
    .line 9
    new-instance v0, Ll7/z;

    .line 10
    .line 11
    iget-object v1, p1, Ll7/y$a;->a:Ll7/z;

    .line 12
    .line 13
    iget-wide v2, v1, Ll7/z;->a:J

    .line 14
    .line 15
    iget-wide v4, v1, Ll7/z;->b:J

    .line 16
    .line 17
    iget-object v1, p0, Lp7/d$a;->b:Lp7/d;

    .line 18
    .line 19
    invoke-static {v1}, Lp7/d;->a(Lp7/d;)J

    .line 20
    .line 21
    .line 22
    move-result-wide v6

    .line 23
    add-long/2addr v4, v6

    .line 24
    invoke-direct {v0, v2, v3, v4, v5}, Ll7/z;-><init>(JJ)V

    .line 25
    .line 26
    .line 27
    new-instance v1, Ll7/z;

    .line 28
    .line 29
    iget-object p1, p1, Ll7/y$a;->b:Ll7/z;

    .line 30
    .line 31
    iget-wide v2, p1, Ll7/z;->a:J

    .line 32
    .line 33
    iget-wide v4, p1, Ll7/z;->b:J

    .line 34
    .line 35
    iget-object p1, p0, Lp7/d$a;->b:Lp7/d;

    .line 36
    .line 37
    invoke-static {p1}, Lp7/d;->a(Lp7/d;)J

    .line 38
    .line 39
    .line 40
    move-result-wide v6

    .line 41
    add-long/2addr v4, v6

    .line 42
    invoke-direct {v1, v2, v3, v4, v5}, Ll7/z;-><init>(JJ)V

    .line 43
    .line 44
    .line 45
    invoke-direct {p2, v0, v1}, Ll7/y$a;-><init>(Ll7/z;Ll7/z;)V

    .line 46
    .line 47
    .line 48
    return-object p2
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

.method public h()J
    .locals 2

    iget-object v0, p0, Lp7/d$a;->a:Ll7/y;

    invoke-interface {v0}, Ll7/y;->h()J

    move-result-wide v0

    return-wide v0
.end method
