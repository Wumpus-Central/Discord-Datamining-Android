.class final Lpa/s;
.super Lpa/q;
.source "SourceFile"


# instance fields
.field private final transient m:I

.field private final transient n:I

.field private final synthetic o:Lpa/q;


# direct methods
.method constructor <init>(Lpa/q;II)V
    .locals 0

    .line 1
    iput-object p1, p0, Lpa/s;->o:Lpa/q;

    .line 2
    .line 3
    invoke-direct {p0}, Lpa/q;-><init>()V

    .line 4
    .line 5
    .line 6
    iput p2, p0, Lpa/s;->m:I

    .line 7
    .line 8
    iput p3, p0, Lpa/s;->n:I

    .line 9
    .line 10
    return-void
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
    .line 126
    .line 127
    .line 128
    .line 129
.end method


# virtual methods
.method public final get(I)Ljava/lang/Object;
    .locals 2

    .line 1
    iget v0, p0, Lpa/s;->n:I

    .line 2
    .line 3
    invoke-static {p1, v0}, Lpa/n;->a(II)I

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lpa/s;->o:Lpa/q;

    .line 7
    .line 8
    iget v1, p0, Lpa/s;->m:I

    .line 9
    .line 10
    add-int/2addr p1, v1

    .line 11
    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    return-object p1
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
.end method

.method final h()[Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lpa/s;->o:Lpa/q;

    invoke-virtual {v0}, Lpa/r;->h()[Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method final i()I
    .locals 2

    iget-object v0, p0, Lpa/s;->o:Lpa/q;

    invoke-virtual {v0}, Lpa/r;->i()I

    move-result v0

    iget v1, p0, Lpa/s;->m:I

    add-int/2addr v0, v1

    return v0
.end method

.method final l()I
    .locals 2

    iget-object v0, p0, Lpa/s;->o:Lpa/q;

    invoke-virtual {v0}, Lpa/r;->i()I

    move-result v0

    iget v1, p0, Lpa/s;->m:I

    add-int/2addr v0, v1

    iget v1, p0, Lpa/s;->n:I

    add-int/2addr v0, v1

    return v0
.end method

.method public final n(II)Lpa/q;
    .locals 2

    .line 1
    iget v0, p0, Lpa/s;->n:I

    .line 2
    .line 3
    invoke-static {p1, p2, v0}, Lpa/n;->d(III)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lpa/s;->o:Lpa/q;

    .line 7
    .line 8
    iget v1, p0, Lpa/s;->m:I

    .line 9
    .line 10
    add-int/2addr p1, v1

    .line 11
    add-int/2addr p2, v1

    .line 12
    invoke-virtual {v0, p1, p2}, Lpa/q;->subList(II)Ljava/util/List;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    check-cast p1, Lpa/q;

    .line 17
    .line 18
    return-object p1
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
.end method

.method public final size()I
    .locals 1

    iget v0, p0, Lpa/s;->n:I

    return v0
.end method

.method public final synthetic subList(II)Ljava/util/List;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lpa/q;->n(II)Lpa/q;

    move-result-object p1

    return-object p1
.end method
