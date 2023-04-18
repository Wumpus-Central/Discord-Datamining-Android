.class Lnet/time4j/h0$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lfj/z;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/time4j/h0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "d"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<V:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lfj/z<",
        "Lnet/time4j/h0;",
        "TV;>;"
    }
.end annotation


# instance fields
.field private final k:Lfj/p;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lfj/p<",
            "TV;>;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>(Lfj/p;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lfj/p<",
            "TV;>;)V"
        }
    .end annotation

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lnet/time4j/h0$d;->k:Lfj/p;

    return-void
.end method

.method synthetic constructor <init>(Lfj/p;Lnet/time4j/h0$a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lnet/time4j/h0$d;-><init>(Lfj/p;)V

    return-void
.end method

.method static synthetic b(Lnet/time4j/h0$d;)Lfj/p;
    .locals 0

    iget-object p0, p0, Lnet/time4j/h0$d;->k:Lfj/p;

    return-object p0
.end method

.method static n(Lfj/p;)Lnet/time4j/h0$d;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<V:",
            "Ljava/lang/Object;",
            ">(",
            "Lfj/p<",
            "TV;>;)",
            "Lnet/time4j/h0$d<",
            "TV;>;"
        }
    .end annotation

    new-instance v0, Lnet/time4j/h0$d;

    invoke-direct {v0, p0}, Lnet/time4j/h0$d;-><init>(Lfj/p;)V

    return-object v0
.end method

.method private r(Ljava/lang/Object;)J
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TV;)J"
        }
    .end annotation

    const-class v0, Ljava/lang/Number;

    invoke-virtual {v0, p1}, Ljava/lang/Class;->cast(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    move-result-wide v0

    return-wide v0
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;)Lfj/p;
    .locals 0

    check-cast p1, Lnet/time4j/h0;

    invoke-virtual {p0, p1}, Lnet/time4j/h0$d;->d(Lnet/time4j/h0;)Lfj/p;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic c(Ljava/lang/Object;)Lfj/p;
    .locals 0

    check-cast p1, Lnet/time4j/h0;

    invoke-virtual {p0, p1}, Lnet/time4j/h0$d;->e(Lnet/time4j/h0;)Lfj/p;

    move-result-object p1

    return-object p1
.end method

.method public d(Lnet/time4j/h0;)Lfj/p;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/time4j/h0;",
            ")",
            "Lfj/p<",
            "*>;"
        }
    .end annotation

    invoke-static {}, Lnet/time4j/h0;->S()Ljava/util/Map;

    move-result-object p1

    iget-object v0, p0, Lnet/time4j/h0$d;->k:Lfj/p;

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lfj/p;

    return-object p1
.end method

.method public e(Lnet/time4j/h0;)Lfj/p;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/time4j/h0;",
            ")",
            "Lfj/p<",
            "*>;"
        }
    .end annotation

    invoke-static {}, Lnet/time4j/h0;->S()Ljava/util/Map;

    move-result-object p1

    iget-object v0, p0, Lnet/time4j/h0$d;->k:Lfj/p;

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lfj/p;

    return-object p1
.end method

.method public f(Lnet/time4j/h0;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/time4j/h0;",
            ")TV;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lnet/time4j/h0$d;->k:Lfj/p;

    .line 2
    .line 3
    invoke-interface {v0}, Lfj/p;->G()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-static {p1}, Lnet/time4j/h0;->O(Lnet/time4j/h0;)Lnet/time4j/f0;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    iget-object v0, p0, Lnet/time4j/h0$d;->k:Lfj/p;

    .line 14
    .line 15
    invoke-virtual {p1, v0}, Lfj/q;->c(Lfj/p;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    return-object p1

    .line 20
    :cond_0
    iget-object p1, p0, Lnet/time4j/h0$d;->k:Lfj/p;

    .line 21
    .line 22
    invoke-interface {p1}, Lfj/p;->T()Z

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    if-eqz p1, :cond_1

    .line 27
    .line 28
    iget-object p1, p0, Lnet/time4j/h0$d;->k:Lfj/p;

    .line 29
    .line 30
    invoke-interface {p1}, Lfj/p;->f()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    return-object p1

    .line 35
    :cond_1
    new-instance p1, Lfj/r;

    .line 36
    .line 37
    new-instance v0, Ljava/lang/StringBuilder;

    .line 38
    .line 39
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 40
    .line 41
    .line 42
    const-string v1, "Missing rule for: "

    .line 43
    .line 44
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    iget-object v1, p0, Lnet/time4j/h0$d;->k:Lfj/p;

    .line 48
    .line 49
    invoke-interface {v1}, Lfj/p;->name()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    invoke-direct {p1, v0}, Lfj/r;-><init>(Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    throw p1
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
.end method

.method public g(Lnet/time4j/h0;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/time4j/h0;",
            ")TV;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lnet/time4j/h0$d;->k:Lfj/p;

    .line 2
    .line 3
    invoke-interface {v0}, Lfj/p;->G()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-static {p1}, Lnet/time4j/h0;->O(Lnet/time4j/h0;)Lnet/time4j/f0;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    iget-object v0, p0, Lnet/time4j/h0$d;->k:Lfj/p;

    .line 14
    .line 15
    invoke-virtual {p1, v0}, Lfj/q;->t(Lfj/p;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    return-object p1

    .line 20
    :cond_0
    iget-object p1, p0, Lnet/time4j/h0$d;->k:Lfj/p;

    .line 21
    .line 22
    invoke-interface {p1}, Lfj/p;->T()Z

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    if-eqz p1, :cond_1

    .line 27
    .line 28
    iget-object p1, p0, Lnet/time4j/h0$d;->k:Lfj/p;

    .line 29
    .line 30
    invoke-interface {p1}, Lfj/p;->S()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    return-object p1

    .line 35
    :cond_1
    new-instance p1, Lfj/r;

    .line 36
    .line 37
    new-instance v0, Ljava/lang/StringBuilder;

    .line 38
    .line 39
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 40
    .line 41
    .line 42
    const-string v1, "Missing rule for: "

    .line 43
    .line 44
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    iget-object v1, p0, Lnet/time4j/h0$d;->k:Lfj/p;

    .line 48
    .line 49
    invoke-interface {v1}, Lfj/p;->name()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    invoke-direct {p1, v0}, Lfj/r;-><init>(Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    throw p1
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
.end method

.method public h(Lnet/time4j/h0;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/time4j/h0;",
            ")TV;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lnet/time4j/h0$d;->k:Lfj/p;

    .line 2
    .line 3
    invoke-interface {v0}, Lfj/p;->G()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-static {p1}, Lnet/time4j/h0;->O(Lnet/time4j/h0;)Lnet/time4j/f0;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    iget-object v0, p0, Lnet/time4j/h0$d;->k:Lfj/p;

    .line 14
    .line 15
    invoke-virtual {p1, v0}, Lfj/q;->k(Lfj/p;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    return-object p1

    .line 20
    :cond_0
    iget-object v0, p0, Lnet/time4j/h0$d;->k:Lfj/p;

    .line 21
    .line 22
    invoke-interface {v0}, Lfj/p;->T()Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-eqz v0, :cond_1

    .line 27
    .line 28
    invoke-static {p1}, Lnet/time4j/h0;->Q(Lnet/time4j/h0;)Lnet/time4j/g0;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    iget-object v0, p0, Lnet/time4j/h0$d;->k:Lfj/p;

    .line 33
    .line 34
    invoke-virtual {p1, v0}, Lfj/q;->k(Lfj/p;)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    return-object p1

    .line 39
    :cond_1
    new-instance p1, Lfj/r;

    .line 40
    .line 41
    new-instance v0, Ljava/lang/StringBuilder;

    .line 42
    .line 43
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 44
    .line 45
    .line 46
    const-string v1, "Missing rule for: "

    .line 47
    .line 48
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    iget-object v1, p0, Lnet/time4j/h0$d;->k:Lfj/p;

    .line 52
    .line 53
    invoke-interface {v1}, Lfj/p;->name()Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    invoke-direct {p1, v0}, Lfj/r;-><init>(Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    throw p1
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
.end method

.method public i(Lnet/time4j/h0;Ljava/lang/Object;)Z
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/time4j/h0;",
            "TV;)Z"
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p2, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    iget-object v1, p0, Lnet/time4j/h0$d;->k:Lfj/p;

    .line 6
    .line 7
    invoke-interface {v1}, Lfj/p;->G()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_1

    .line 12
    .line 13
    invoke-static {p1}, Lnet/time4j/h0;->O(Lnet/time4j/h0;)Lnet/time4j/f0;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    iget-object v0, p0, Lnet/time4j/h0$d;->k:Lfj/p;

    .line 18
    .line 19
    invoke-virtual {p1, v0, p2}, Lfj/q;->A(Lfj/p;Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    return p1

    .line 24
    :cond_1
    iget-object v1, p0, Lnet/time4j/h0$d;->k:Lfj/p;

    .line 25
    .line 26
    invoke-interface {v1}, Lfj/p;->T()Z

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    if-eqz v1, :cond_5

    .line 31
    .line 32
    iget-object v1, p0, Lnet/time4j/h0$d;->k:Lfj/p;

    .line 33
    .line 34
    invoke-interface {v1}, Lfj/p;->getType()Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    const-class v2, Ljava/lang/Number;

    .line 39
    .line 40
    invoke-virtual {v2, v1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 41
    .line 42
    .line 43
    move-result v1

    .line 44
    if-eqz v1, :cond_3

    .line 45
    .line 46
    iget-object p1, p0, Lnet/time4j/h0$d;->k:Lfj/p;

    .line 47
    .line 48
    invoke-interface {p1}, Lfj/p;->S()Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    invoke-direct {p0, p1}, Lnet/time4j/h0$d;->r(Ljava/lang/Object;)J

    .line 53
    .line 54
    .line 55
    move-result-wide v1

    .line 56
    iget-object p1, p0, Lnet/time4j/h0$d;->k:Lfj/p;

    .line 57
    .line 58
    invoke-interface {p1}, Lfj/p;->f()Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    invoke-direct {p0, p1}, Lnet/time4j/h0$d;->r(Ljava/lang/Object;)J

    .line 63
    .line 64
    .line 65
    move-result-wide v3

    .line 66
    invoke-direct {p0, p2}, Lnet/time4j/h0$d;->r(Ljava/lang/Object;)J

    .line 67
    .line 68
    .line 69
    move-result-wide p1

    .line 70
    cmp-long v1, v1, p1

    .line 71
    .line 72
    if-gtz v1, :cond_2

    .line 73
    .line 74
    cmp-long p1, v3, p1

    .line 75
    .line 76
    if-ltz p1, :cond_2

    .line 77
    .line 78
    const/4 v0, 0x1

    .line 79
    :cond_2
    return v0

    .line 80
    :cond_3
    iget-object v1, p0, Lnet/time4j/h0$d;->k:Lfj/p;

    .line 81
    .line 82
    sget-object v2, Lnet/time4j/g0;->y:Lfj/p;

    .line 83
    .line 84
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 85
    .line 86
    .line 87
    move-result v1

    .line 88
    if-eqz v1, :cond_4

    .line 89
    .line 90
    sget-object v1, Lnet/time4j/g0;->x:Lnet/time4j/g0;

    .line 91
    .line 92
    invoke-virtual {v1, p2}, Lnet/time4j/g0;->equals(Ljava/lang/Object;)Z

    .line 93
    .line 94
    .line 95
    move-result v1

    .line 96
    if-eqz v1, :cond_4

    .line 97
    .line 98
    return v0

    .line 99
    :cond_4
    invoke-static {p1}, Lnet/time4j/h0;->Q(Lnet/time4j/h0;)Lnet/time4j/g0;

    .line 100
    .line 101
    .line 102
    move-result-object p1

    .line 103
    iget-object v0, p0, Lnet/time4j/h0$d;->k:Lfj/p;

    .line 104
    .line 105
    invoke-virtual {p1, v0, p2}, Lfj/q;->A(Lfj/p;Ljava/lang/Object;)Z

    .line 106
    .line 107
    .line 108
    move-result p1

    .line 109
    return p1

    .line 110
    :cond_5
    new-instance p1, Lfj/r;

    .line 111
    .line 112
    new-instance p2, Ljava/lang/StringBuilder;

    .line 113
    .line 114
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 115
    .line 116
    .line 117
    const-string v0, "Missing rule for: "

    .line 118
    .line 119
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 120
    .line 121
    .line 122
    iget-object v0, p0, Lnet/time4j/h0$d;->k:Lfj/p;

    .line 123
    .line 124
    invoke-interface {v0}, Lfj/p;->name()Ljava/lang/String;

    .line 125
    .line 126
    .line 127
    move-result-object v0

    .line 128
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 129
    .line 130
    .line 131
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 132
    .line 133
    .line 134
    move-result-object p2

    .line 135
    invoke-direct {p1, p2}, Lfj/r;-><init>(Ljava/lang/String;)V

    .line 136
    .line 137
    .line 138
    throw p1
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
.end method

.method public bridge synthetic j(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lnet/time4j/h0;

    invoke-virtual {p0, p1}, Lnet/time4j/h0$d;->f(Lnet/time4j/h0;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic m(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 0

    check-cast p1, Lnet/time4j/h0;

    invoke-virtual {p0, p1, p2}, Lnet/time4j/h0$d;->i(Lnet/time4j/h0;Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public bridge synthetic o(Ljava/lang/Object;Ljava/lang/Object;Z)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lnet/time4j/h0;

    invoke-virtual {p0, p1, p2, p3}, Lnet/time4j/h0$d;->s(Lnet/time4j/h0;Ljava/lang/Object;Z)Lnet/time4j/h0;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic p(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lnet/time4j/h0;

    invoke-virtual {p0, p1}, Lnet/time4j/h0$d;->g(Lnet/time4j/h0;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic q(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lnet/time4j/h0;

    invoke-virtual {p0, p1}, Lnet/time4j/h0$d;->h(Lnet/time4j/h0;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public s(Lnet/time4j/h0;Ljava/lang/Object;Z)Lnet/time4j/h0;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/time4j/h0;",
            "TV;Z)",
            "Lnet/time4j/h0;"
        }
    .end annotation

    .line 1
    if-eqz p2, :cond_8

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lnet/time4j/h0$d;->h(Lnet/time4j/h0;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {p2, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    return-object p1

    .line 14
    :cond_0
    if-eqz p3, :cond_1

    .line 15
    .line 16
    invoke-static {}, Lnet/time4j/h0;->R()Lfj/h0;

    .line 17
    .line 18
    .line 19
    move-result-object p3

    .line 20
    iget-object v0, p0, Lnet/time4j/h0$d;->k:Lfj/p;

    .line 21
    .line 22
    invoke-virtual {p3, v0}, Lfj/h0;->L(Lfj/p;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object p3

    .line 26
    check-cast p3, Lnet/time4j/w;

    .line 27
    .line 28
    invoke-virtual {p0, p1}, Lnet/time4j/h0$d;->h(Lnet/time4j/h0;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    invoke-direct {p0, v0}, Lnet/time4j/h0$d;->r(Ljava/lang/Object;)J

    .line 33
    .line 34
    .line 35
    move-result-wide v0

    .line 36
    invoke-direct {p0, p2}, Lnet/time4j/h0$d;->r(Ljava/lang/Object;)J

    .line 37
    .line 38
    .line 39
    move-result-wide v2

    .line 40
    invoke-static {v2, v3, v0, v1}, Lnet/time4j/base/c;->m(JJ)J

    .line 41
    .line 42
    .line 43
    move-result-wide v0

    .line 44
    invoke-virtual {p1, v0, v1, p3}, Lfj/k0;->K(JLjava/lang/Object;)Lfj/k0;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    check-cast p1, Lnet/time4j/h0;

    .line 49
    .line 50
    return-object p1

    .line 51
    :cond_1
    iget-object p3, p0, Lnet/time4j/h0$d;->k:Lfj/p;

    .line 52
    .line 53
    invoke-interface {p3}, Lfj/p;->G()Z

    .line 54
    .line 55
    .line 56
    move-result p3

    .line 57
    if-eqz p3, :cond_2

    .line 58
    .line 59
    invoke-static {p1}, Lnet/time4j/h0;->O(Lnet/time4j/h0;)Lnet/time4j/f0;

    .line 60
    .line 61
    .line 62
    move-result-object p3

    .line 63
    iget-object v0, p0, Lnet/time4j/h0$d;->k:Lfj/p;

    .line 64
    .line 65
    invoke-virtual {p3, v0, p2}, Lfj/q;->E(Lfj/p;Ljava/lang/Object;)Lfj/q;

    .line 66
    .line 67
    .line 68
    move-result-object p2

    .line 69
    check-cast p2, Lnet/time4j/f0;

    .line 70
    .line 71
    invoke-static {p1}, Lnet/time4j/h0;->Q(Lnet/time4j/h0;)Lnet/time4j/g0;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    invoke-static {p2, p1}, Lnet/time4j/h0;->e0(Lnet/time4j/f0;Lnet/time4j/g0;)Lnet/time4j/h0;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    return-object p1

    .line 80
    :cond_2
    iget-object p3, p0, Lnet/time4j/h0$d;->k:Lfj/p;

    .line 81
    .line 82
    invoke-interface {p3}, Lfj/p;->T()Z

    .line 83
    .line 84
    .line 85
    move-result p3

    .line 86
    if-eqz p3, :cond_7

    .line 87
    .line 88
    iget-object p3, p0, Lnet/time4j/h0$d;->k:Lfj/p;

    .line 89
    .line 90
    invoke-interface {p3}, Lfj/p;->getType()Ljava/lang/Class;

    .line 91
    .line 92
    .line 93
    move-result-object p3

    .line 94
    const-class v0, Ljava/lang/Number;

    .line 95
    .line 96
    invoke-virtual {v0, p3}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 97
    .line 98
    .line 99
    move-result p3

    .line 100
    const-string v0, "Out of range: "

    .line 101
    .line 102
    if-eqz p3, :cond_4

    .line 103
    .line 104
    iget-object p3, p0, Lnet/time4j/h0$d;->k:Lfj/p;

    .line 105
    .line 106
    invoke-interface {p3}, Lfj/p;->S()Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object p3

    .line 110
    invoke-direct {p0, p3}, Lnet/time4j/h0$d;->r(Ljava/lang/Object;)J

    .line 111
    .line 112
    .line 113
    move-result-wide v1

    .line 114
    iget-object p3, p0, Lnet/time4j/h0$d;->k:Lfj/p;

    .line 115
    .line 116
    invoke-interface {p3}, Lfj/p;->f()Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object p3

    .line 120
    invoke-direct {p0, p3}, Lnet/time4j/h0$d;->r(Ljava/lang/Object;)J

    .line 121
    .line 122
    .line 123
    move-result-wide v3

    .line 124
    invoke-direct {p0, p2}, Lnet/time4j/h0$d;->r(Ljava/lang/Object;)J

    .line 125
    .line 126
    .line 127
    move-result-wide v5

    .line 128
    cmp-long p3, v1, v5

    .line 129
    .line 130
    if-gtz p3, :cond_3

    .line 131
    .line 132
    cmp-long p3, v3, v5

    .line 133
    .line 134
    if-ltz p3, :cond_3

    .line 135
    .line 136
    goto :goto_0

    .line 137
    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 138
    .line 139
    new-instance p3, Ljava/lang/StringBuilder;

    .line 140
    .line 141
    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    .line 142
    .line 143
    .line 144
    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 145
    .line 146
    .line 147
    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 148
    .line 149
    .line 150
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 151
    .line 152
    .line 153
    move-result-object p2

    .line 154
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 155
    .line 156
    .line 157
    throw p1

    .line 158
    :cond_4
    iget-object p3, p0, Lnet/time4j/h0$d;->k:Lfj/p;

    .line 159
    .line 160
    sget-object v1, Lnet/time4j/g0;->y:Lfj/p;

    .line 161
    .line 162
    invoke-virtual {p3, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 163
    .line 164
    .line 165
    move-result p3

    .line 166
    if-eqz p3, :cond_6

    .line 167
    .line 168
    sget-object p3, Lnet/time4j/g0;->x:Lnet/time4j/g0;

    .line 169
    .line 170
    invoke-virtual {p2, p3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 171
    .line 172
    .line 173
    move-result p3

    .line 174
    if-nez p3, :cond_5

    .line 175
    .line 176
    goto :goto_0

    .line 177
    :cond_5
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 178
    .line 179
    new-instance p3, Ljava/lang/StringBuilder;

    .line 180
    .line 181
    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    .line 182
    .line 183
    .line 184
    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 185
    .line 186
    .line 187
    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 188
    .line 189
    .line 190
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 191
    .line 192
    .line 193
    move-result-object p2

    .line 194
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 195
    .line 196
    .line 197
    throw p1

    .line 198
    :cond_6
    :goto_0
    invoke-static {p1}, Lnet/time4j/h0;->Q(Lnet/time4j/h0;)Lnet/time4j/g0;

    .line 199
    .line 200
    .line 201
    move-result-object p3

    .line 202
    iget-object v0, p0, Lnet/time4j/h0$d;->k:Lfj/p;

    .line 203
    .line 204
    invoke-virtual {p3, v0, p2}, Lfj/q;->E(Lfj/p;Ljava/lang/Object;)Lfj/q;

    .line 205
    .line 206
    .line 207
    move-result-object p2

    .line 208
    check-cast p2, Lnet/time4j/g0;

    .line 209
    .line 210
    invoke-static {p1}, Lnet/time4j/h0;->O(Lnet/time4j/h0;)Lnet/time4j/f0;

    .line 211
    .line 212
    .line 213
    move-result-object p1

    .line 214
    invoke-static {p1, p2}, Lnet/time4j/h0;->e0(Lnet/time4j/f0;Lnet/time4j/g0;)Lnet/time4j/h0;

    .line 215
    .line 216
    .line 217
    move-result-object p1

    .line 218
    return-object p1

    .line 219
    :cond_7
    new-instance p1, Lfj/r;

    .line 220
    .line 221
    new-instance p2, Ljava/lang/StringBuilder;

    .line 222
    .line 223
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 224
    .line 225
    .line 226
    const-string p3, "Missing rule for: "

    .line 227
    .line 228
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 229
    .line 230
    .line 231
    iget-object p3, p0, Lnet/time4j/h0$d;->k:Lfj/p;

    .line 232
    .line 233
    invoke-interface {p3}, Lfj/p;->name()Ljava/lang/String;

    .line 234
    .line 235
    .line 236
    move-result-object p3

    .line 237
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 238
    .line 239
    .line 240
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 241
    .line 242
    .line 243
    move-result-object p2

    .line 244
    invoke-direct {p1, p2}, Lfj/r;-><init>(Ljava/lang/String;)V

    .line 245
    .line 246
    .line 247
    throw p1

    .line 248
    :cond_8
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 249
    .line 250
    const-string p2, "Missing element value."

    .line 251
    .line 252
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 253
    .line 254
    .line 255
    throw p1
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
.end method
