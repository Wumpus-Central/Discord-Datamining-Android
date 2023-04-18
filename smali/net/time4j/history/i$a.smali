.class Lnet/time4j/history/i$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lfj/z;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/time4j/history/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<C:",
        "Lfj/q<",
        "TC;>;>",
        "Ljava/lang/Object;",
        "Lfj/z<",
        "TC;",
        "Lnet/time4j/history/h;",
        ">;"
    }
.end annotation


# instance fields
.field private final k:Lnet/time4j/history/d;


# direct methods
.method constructor <init>(Lnet/time4j/history/d;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lnet/time4j/history/i$a;->k:Lnet/time4j/history/d;

    .line 5
    .line 6
    return-void
    .line 7
    .line 8
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
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;)Lfj/p;
    .locals 0

    check-cast p1, Lfj/q;

    invoke-virtual {p0, p1}, Lnet/time4j/history/i$a;->b(Lfj/q;)Lfj/p;

    move-result-object p1

    return-object p1
.end method

.method public b(Lfj/q;)Lfj/p;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TC;)",
            "Lfj/p<",
            "*>;"
        }
    .end annotation

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string v0, "Never called."

    invoke-direct {p1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public bridge synthetic c(Ljava/lang/Object;)Lfj/p;
    .locals 0

    check-cast p1, Lfj/q;

    invoke-virtual {p0, p1}, Lnet/time4j/history/i$a;->d(Lfj/q;)Lfj/p;

    move-result-object p1

    return-object p1
.end method

.method public d(Lfj/q;)Lfj/p;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TC;)",
            "Lfj/p<",
            "*>;"
        }
    .end annotation

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string v0, "Never called."

    invoke-direct {p1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public e(Lfj/q;)Lnet/time4j/history/h;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TC;)",
            "Lnet/time4j/history/h;"
        }
    .end annotation

    .line 1
    iget-object p1, p0, Lnet/time4j/history/i$a;->k:Lnet/time4j/history/d;

    .line 2
    .line 3
    sget-object v0, Lnet/time4j/history/d;->C:Lnet/time4j/history/d;

    .line 4
    .line 5
    const/16 v1, 0x1f

    .line 6
    .line 7
    if-ne p1, v0, :cond_0

    .line 8
    .line 9
    sget-object p1, Lnet/time4j/history/j;->n:Lnet/time4j/history/j;

    .line 10
    .line 11
    const v0, 0x3b9a8f4d

    .line 12
    .line 13
    .line 14
    const/16 v2, 0x8

    .line 15
    .line 16
    invoke-static {p1, v0, v2, v1}, Lnet/time4j/history/h;->i(Lnet/time4j/history/j;III)Lnet/time4j/history/h;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    return-object p1

    .line 21
    :cond_0
    sget-object v0, Lnet/time4j/history/d;->B:Lnet/time4j/history/d;

    .line 22
    .line 23
    const/16 v2, 0xc

    .line 24
    .line 25
    if-ne p1, v0, :cond_1

    .line 26
    .line 27
    sget-object p1, Lnet/time4j/history/j;->l:Lnet/time4j/history/j;

    .line 28
    .line 29
    const v0, 0x3b9a79c9

    .line 30
    .line 31
    .line 32
    invoke-static {p1, v0, v2, v1}, Lnet/time4j/history/h;->i(Lnet/time4j/history/j;III)Lnet/time4j/history/h;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    return-object p1

    .line 37
    :cond_1
    sget-object v0, Lnet/time4j/history/d;->A:Lnet/time4j/history/d;

    .line 38
    .line 39
    if-ne p1, v0, :cond_2

    .line 40
    .line 41
    sget-object p1, Lnet/time4j/history/j;->l:Lnet/time4j/history/j;

    .line 42
    .line 43
    const v0, 0x3b9ac9ff

    .line 44
    .line 45
    .line 46
    invoke-static {p1, v0, v2, v1}, Lnet/time4j/history/h;->i(Lnet/time4j/history/j;III)Lnet/time4j/history/h;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    return-object p1

    .line 51
    :cond_2
    sget-object p1, Lnet/time4j/history/j;->l:Lnet/time4j/history/j;

    .line 52
    .line 53
    const/16 v0, 0x270f

    .line 54
    .line 55
    invoke-static {p1, v0, v2, v1}, Lnet/time4j/history/h;->i(Lnet/time4j/history/j;III)Lnet/time4j/history/h;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    return-object p1
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
.end method

.method public f(Lfj/q;)Lnet/time4j/history/h;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TC;)",
            "Lnet/time4j/history/h;"
        }
    .end annotation

    .line 1
    iget-object p1, p0, Lnet/time4j/history/i$a;->k:Lnet/time4j/history/d;

    .line 2
    .line 3
    sget-object v0, Lnet/time4j/history/d;->C:Lnet/time4j/history/d;

    .line 4
    .line 5
    const/4 v1, 0x1

    .line 6
    if-ne p1, v0, :cond_0

    .line 7
    .line 8
    sget-object p1, Lnet/time4j/history/j;->n:Lnet/time4j/history/j;

    .line 9
    .line 10
    const/4 v0, 0x0

    .line 11
    const/16 v2, 0x9

    .line 12
    .line 13
    invoke-static {p1, v0, v2, v1}, Lnet/time4j/history/h;->i(Lnet/time4j/history/j;III)Lnet/time4j/history/h;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1

    .line 18
    :cond_0
    sget-object v0, Lnet/time4j/history/d;->B:Lnet/time4j/history/d;

    .line 19
    .line 20
    if-ne p1, v0, :cond_1

    .line 21
    .line 22
    sget-object p1, Lnet/time4j/history/j;->k:Lnet/time4j/history/j;

    .line 23
    .line 24
    const v0, 0x3b9a79ca

    .line 25
    .line 26
    .line 27
    invoke-static {p1, v0, v1, v1}, Lnet/time4j/history/h;->i(Lnet/time4j/history/j;III)Lnet/time4j/history/h;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    return-object p1

    .line 32
    :cond_1
    sget-object v0, Lnet/time4j/history/d;->A:Lnet/time4j/history/d;

    .line 33
    .line 34
    if-ne p1, v0, :cond_2

    .line 35
    .line 36
    sget-object p1, Lnet/time4j/history/j;->k:Lnet/time4j/history/j;

    .line 37
    .line 38
    const v0, 0x3b9aca00

    .line 39
    .line 40
    .line 41
    invoke-static {p1, v0, v1, v1}, Lnet/time4j/history/h;->i(Lnet/time4j/history/j;III)Lnet/time4j/history/h;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    return-object p1

    .line 46
    :cond_2
    sget-object p1, Lnet/time4j/history/j;->k:Lnet/time4j/history/j;

    .line 47
    .line 48
    const/16 v0, 0x2d

    .line 49
    .line 50
    invoke-static {p1, v0, v1, v1}, Lnet/time4j/history/h;->i(Lnet/time4j/history/j;III)Lnet/time4j/history/h;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    return-object p1
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
.end method

.method public g(Lfj/q;)Lnet/time4j/history/h;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TC;)",
            "Lnet/time4j/history/h;"
        }
    .end annotation

    .line 1
    :try_start_0
    iget-object v0, p0, Lnet/time4j/history/i$a;->k:Lnet/time4j/history/d;

    .line 2
    .line 3
    sget-object v1, Lnet/time4j/f0;->y:Lnet/time4j/e;

    .line 4
    .line 5
    invoke-virtual {p1, v1}, Lfj/q;->k(Lfj/p;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Lnet/time4j/f0;

    .line 10
    .line 11
    invoke-virtual {v0, p1}, Lnet/time4j/history/d;->e(Lnet/time4j/f0;)Lnet/time4j/history/h;

    .line 12
    .line 13
    .line 14
    move-result-object p1
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 15
    return-object p1

    .line 16
    :catch_0
    move-exception p1

    .line 17
    new-instance v0, Lfj/r;

    .line 18
    .line 19
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    invoke-direct {v0, v1, p1}, Lfj/r;-><init>(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 24
    .line 25
    .line 26
    throw v0
    .line 27
.end method

.method public h(Lfj/q;Lnet/time4j/history/h;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TC;",
            "Lnet/time4j/history/h;",
            ")Z"
        }
    .end annotation

    iget-object p1, p0, Lnet/time4j/history/i$a;->k:Lnet/time4j/history/d;

    invoke-virtual {p1, p2}, Lnet/time4j/history/d;->B(Lnet/time4j/history/h;)Z

    move-result p1

    return p1
.end method

.method public i(Lfj/q;Lnet/time4j/history/h;Z)Lfj/q;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TC;",
            "Lnet/time4j/history/h;",
            "Z)TC;"
        }
    .end annotation

    .line 1
    if-eqz p2, :cond_0

    .line 2
    .line 3
    iget-object p3, p0, Lnet/time4j/history/i$a;->k:Lnet/time4j/history/d;

    .line 4
    .line 5
    invoke-virtual {p3, p2}, Lnet/time4j/history/d;->d(Lnet/time4j/history/h;)Lnet/time4j/f0;

    .line 6
    .line 7
    .line 8
    move-result-object p2

    .line 9
    sget-object p3, Lnet/time4j/f0;->y:Lnet/time4j/e;

    .line 10
    .line 11
    invoke-virtual {p1, p3, p2}, Lfj/q;->E(Lfj/p;Ljava/lang/Object;)Lfj/q;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    return-object p1

    .line 16
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 17
    .line 18
    const-string p2, "Missing historic date."

    .line 19
    .line 20
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    throw p1
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

.method public bridge synthetic j(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lfj/q;

    invoke-virtual {p0, p1}, Lnet/time4j/history/i$a;->e(Lfj/q;)Lnet/time4j/history/h;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic m(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 0

    check-cast p1, Lfj/q;

    check-cast p2, Lnet/time4j/history/h;

    invoke-virtual {p0, p1, p2}, Lnet/time4j/history/i$a;->h(Lfj/q;Lnet/time4j/history/h;)Z

    move-result p1

    return p1
.end method

.method public bridge synthetic o(Ljava/lang/Object;Ljava/lang/Object;Z)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lfj/q;

    check-cast p2, Lnet/time4j/history/h;

    invoke-virtual {p0, p1, p2, p3}, Lnet/time4j/history/i$a;->i(Lfj/q;Lnet/time4j/history/h;Z)Lfj/q;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic p(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lfj/q;

    invoke-virtual {p0, p1}, Lnet/time4j/history/i$a;->f(Lfj/q;)Lnet/time4j/history/h;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic q(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lfj/q;

    invoke-virtual {p0, p1}, Lnet/time4j/history/i$a;->g(Lfj/q;)Lnet/time4j/history/h;

    move-result-object p1

    return-object p1
.end method
