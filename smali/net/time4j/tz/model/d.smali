.class public abstract Lnet/time4j/tz/model/d;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final transient k:J

.field private final transient l:Lnet/time4j/g0;

.field private final transient m:Lnet/time4j/tz/model/i;

.field private final transient n:I


# direct methods
.method protected constructor <init>(ILnet/time4j/tz/model/i;I)V
    .locals 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    if-eqz p2, :cond_4

    .line 5
    .line 6
    const v0, 0x7fffffff

    .line 7
    .line 8
    .line 9
    if-eq p3, v0, :cond_1

    .line 10
    .line 11
    const v1, -0xfd20

    .line 12
    .line 13
    .line 14
    if-lt p3, v1, :cond_0

    .line 15
    .line 16
    const v1, 0xfd20

    .line 17
    .line 18
    .line 19
    if-gt p3, v1, :cond_0

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 23
    .line 24
    new-instance p2, Ljava/lang/StringBuilder;

    .line 25
    .line 26
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 27
    .line 28
    .line 29
    const-string v0, "DST out of range: "

    .line 30
    .line 31
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object p2

    .line 41
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    throw p1

    .line 45
    :cond_1
    :goto_0
    const v1, 0x15180

    .line 46
    .line 47
    .line 48
    if-ne p1, v1, :cond_2

    .line 49
    .line 50
    const-wide/16 v1, 0x0

    .line 51
    .line 52
    iput-wide v1, p0, Lnet/time4j/tz/model/d;->k:J

    .line 53
    .line 54
    invoke-static {}, Lnet/time4j/g0;->H0()Lnet/time4j/g0;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    iput-object p1, p0, Lnet/time4j/tz/model/d;->l:Lnet/time4j/g0;

    .line 59
    .line 60
    goto :goto_1

    .line 61
    :cond_2
    invoke-static {}, Lnet/time4j/g0;->I0()Lnet/time4j/g0;

    .line 62
    .line 63
    .line 64
    move-result-object v1

    .line 65
    int-to-long v2, p1

    .line 66
    sget-object p1, Lnet/time4j/g;->m:Lnet/time4j/g;

    .line 67
    .line 68
    invoke-virtual {v1, v2, v3, p1}, Lnet/time4j/g0;->S0(JLnet/time4j/g;)Lnet/time4j/j;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    invoke-virtual {p1}, Lnet/time4j/j;->a()J

    .line 73
    .line 74
    .line 75
    move-result-wide v1

    .line 76
    iput-wide v1, p0, Lnet/time4j/tz/model/d;->k:J

    .line 77
    .line 78
    invoke-virtual {p1}, Lnet/time4j/j;->b()Lnet/time4j/g0;

    .line 79
    .line 80
    .line 81
    move-result-object p1

    .line 82
    iput-object p1, p0, Lnet/time4j/tz/model/d;->l:Lnet/time4j/g0;

    .line 83
    .line 84
    :goto_1
    iput-object p2, p0, Lnet/time4j/tz/model/d;->m:Lnet/time4j/tz/model/i;

    .line 85
    .line 86
    if-ne p3, v0, :cond_3

    .line 87
    .line 88
    const/4 p3, 0x0

    .line 89
    :cond_3
    iput p3, p0, Lnet/time4j/tz/model/d;->n:I

    .line 90
    .line 91
    return-void

    .line 92
    :cond_4
    new-instance p1, Ljava/lang/NullPointerException;

    .line 93
    .line 94
    const-string p2, "Missing offset indicator."

    .line 95
    .line 96
    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 97
    .line 98
    .line 99
    throw p1
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
.method protected a()Ljava/lang/String;
    .locals 3

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-class v1, Lgj/c;

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Ljava/lang/Class;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, Lgj/c;

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    invoke-interface {v0}, Lgj/c;->value()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    return-object v0

    .line 20
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 21
    .line 22
    new-instance v1, Ljava/lang/StringBuilder;

    .line 23
    .line 24
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 25
    .line 26
    .line 27
    const-string v2, "Cannot find calendar type annotation: "

    .line 28
    .line 29
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    throw v0
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
.end method

.method public abstract b(I)Lnet/time4j/f0;
.end method

.method protected final c()J
    .locals 2

    iget-wide v0, p0, Lnet/time4j/tz/model/d;->k:J

    return-wide v0
.end method

.method public final d()Lnet/time4j/tz/model/i;
    .locals 1

    iget-object v0, p0, Lnet/time4j/tz/model/d;->m:Lnet/time4j/tz/model/i;

    return-object v0
.end method

.method public final e()I
    .locals 1

    iget v0, p0, Lnet/time4j/tz/model/d;->n:I

    return v0
.end method

.method public final f()Lnet/time4j/g0;
    .locals 1

    iget-object v0, p0, Lnet/time4j/tz/model/d;->l:Lnet/time4j/g0;

    return-object v0
.end method

.method g()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method protected abstract h(J)I
.end method

.method protected abstract i(Lnet/time4j/base/a;)I
.end method
