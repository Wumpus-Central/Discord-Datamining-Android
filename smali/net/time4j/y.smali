.class public final Lnet/time4j/y;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lfj/l0;
.implements Ljava/lang/Comparable;
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/time4j/y$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<U:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lfj/l0<",
        "TU;>;",
        "Ljava/lang/Comparable<",
        "Lnet/time4j/y<",
        "TU;>;>;",
        "Ljava/io/Serializable;"
    }
.end annotation


# static fields
.field private static final n:Lnet/time4j/y;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lnet/time4j/y<",
            "Ljava/util/concurrent/TimeUnit;",
            ">;"
        }
    .end annotation
.end field

.field private static final o:Lnet/time4j/y;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lnet/time4j/y<",
            "Lnet/time4j/n0;",
            ">;"
        }
    .end annotation
.end field

.field public static final p:Lfj/j0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lfj/j0<",
            "Ljava/util/concurrent/TimeUnit;",
            "Lnet/time4j/y<",
            "Ljava/util/concurrent/TimeUnit;",
            ">;>;"
        }
    .end annotation
.end field

.field public static final q:Lfj/j0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lfj/j0<",
            "Ljava/util/concurrent/TimeUnit;",
            "Lnet/time4j/y<",
            "Lnet/time4j/n0;",
            ">;>;"
        }
    .end annotation
.end field

.field private static final serialVersionUID:J = -0x3998cc6bfd724fd5L


# instance fields
.field private final transient k:J

.field private final transient l:I

.field private final transient m:Lmj/f;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, Lnet/time4j/y;

    .line 2
    .line 3
    sget-object v1, Lmj/f;->k:Lmj/f;

    .line 4
    .line 5
    const-wide/16 v2, 0x0

    .line 6
    .line 7
    const/4 v4, 0x0

    .line 8
    invoke-direct {v0, v2, v3, v4, v1}, Lnet/time4j/y;-><init>(JILmj/f;)V

    .line 9
    .line 10
    .line 11
    sput-object v0, Lnet/time4j/y;->n:Lnet/time4j/y;

    .line 12
    .line 13
    new-instance v0, Lnet/time4j/y;

    .line 14
    .line 15
    sget-object v5, Lmj/f;->l:Lmj/f;

    .line 16
    .line 17
    invoke-direct {v0, v2, v3, v4, v5}, Lnet/time4j/y;-><init>(JILmj/f;)V

    .line 18
    .line 19
    .line 20
    sput-object v0, Lnet/time4j/y;->o:Lnet/time4j/y;

    .line 21
    .line 22
    new-instance v0, Lnet/time4j/y$b;

    .line 23
    .line 24
    const/4 v2, 0x0

    .line 25
    invoke-direct {v0, v1, v2}, Lnet/time4j/y$b;-><init>(Lmj/f;Lnet/time4j/y$a;)V

    .line 26
    .line 27
    .line 28
    sput-object v0, Lnet/time4j/y;->p:Lfj/j0;

    .line 29
    .line 30
    new-instance v0, Lnet/time4j/y$b;

    .line 31
    .line 32
    invoke-direct {v0, v5, v2}, Lnet/time4j/y$b;-><init>(Lmj/f;Lnet/time4j/y$a;)V

    .line 33
    .line 34
    .line 35
    sput-object v0, Lnet/time4j/y;->q:Lfj/j0;

    .line 36
    .line 37
    return-void
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
.end method

.method private constructor <init>(JILmj/f;)V
    .locals 5

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    :goto_0
    const-wide/16 v0, 0x1

    .line 5
    .line 6
    const v2, 0x3b9aca00

    .line 7
    .line 8
    .line 9
    if-gez p3, :cond_0

    .line 10
    .line 11
    add-int/2addr p3, v2

    .line 12
    invoke-static {p1, p2, v0, v1}, Lnet/time4j/base/c;->m(JJ)J

    .line 13
    .line 14
    .line 15
    move-result-wide p1

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    :goto_1
    if-lt p3, v2, :cond_1

    .line 18
    .line 19
    sub-int/2addr p3, v2

    .line 20
    invoke-static {p1, p2, v0, v1}, Lnet/time4j/base/c;->f(JJ)J

    .line 21
    .line 22
    .line 23
    move-result-wide p1

    .line 24
    goto :goto_1

    .line 25
    :cond_1
    const-wide/16 v3, 0x0

    .line 26
    .line 27
    cmp-long v3, p1, v3

    .line 28
    .line 29
    if-gez v3, :cond_2

    .line 30
    .line 31
    if-lez p3, :cond_2

    .line 32
    .line 33
    add-long/2addr p1, v0

    .line 34
    sub-int/2addr p3, v2

    .line 35
    :cond_2
    iput-wide p1, p0, Lnet/time4j/y;->k:J

    .line 36
    .line 37
    iput p3, p0, Lnet/time4j/y;->l:I

    .line 38
    .line 39
    iput-object p4, p0, Lnet/time4j/y;->m:Lmj/f;

    .line 40
    .line 41
    return-void
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

.method private c(Ljava/lang/StringBuilder;)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Lnet/time4j/y;->i()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/16 v0, 0x2d

    .line 8
    .line 9
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 10
    .line 11
    .line 12
    iget-wide v0, p0, Lnet/time4j/y;->k:J

    .line 13
    .line 14
    invoke-static {v0, v1}, Ljava/lang/Math;->abs(J)J

    .line 15
    .line 16
    .line 17
    move-result-wide v0

    .line 18
    invoke-virtual {p1, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    iget-wide v0, p0, Lnet/time4j/y;->k:J

    .line 23
    .line 24
    invoke-virtual {p1, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    :goto_0
    iget v0, p0, Lnet/time4j/y;->l:I

    .line 28
    .line 29
    if-eqz v0, :cond_2

    .line 30
    .line 31
    const/16 v0, 0x2e

    .line 32
    .line 33
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    iget v0, p0, Lnet/time4j/y;->l:I

    .line 37
    .line 38
    invoke-static {v0}, Ljava/lang/Math;->abs(I)I

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 47
    .line 48
    .line 49
    move-result v1

    .line 50
    rsub-int/lit8 v1, v1, 0x9

    .line 51
    .line 52
    :goto_1
    if-lez v1, :cond_1

    .line 53
    .line 54
    const/16 v2, 0x30

    .line 55
    .line 56
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    add-int/lit8 v1, v1, -0x1

    .line 60
    .line 61
    goto :goto_1

    .line 62
    :cond_1
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    :cond_2
    return-void
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

.method public static j(JI)Lnet/time4j/y;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(JI)",
            "Lnet/time4j/y<",
            "Ljava/util/concurrent/TimeUnit;",
            ">;"
        }
    .end annotation

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    cmp-long v0, p0, v0

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    if-nez p2, :cond_0

    .line 8
    .line 9
    sget-object p0, Lnet/time4j/y;->n:Lnet/time4j/y;

    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_0
    new-instance v0, Lnet/time4j/y;

    .line 13
    .line 14
    sget-object v1, Lmj/f;->k:Lmj/f;

    .line 15
    .line 16
    invoke-direct {v0, p0, p1, p2, v1}, Lnet/time4j/y;-><init>(JILmj/f;)V

    .line 17
    .line 18
    .line 19
    return-object v0
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

.method public static k(JI)Lnet/time4j/y;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(JI)",
            "Lnet/time4j/y<",
            "Lnet/time4j/n0;",
            ">;"
        }
    .end annotation

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    cmp-long v0, p0, v0

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    if-nez p2, :cond_0

    .line 8
    .line 9
    sget-object p0, Lnet/time4j/y;->o:Lnet/time4j/y;

    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_0
    new-instance v0, Lnet/time4j/y;

    .line 13
    .line 14
    sget-object v1, Lmj/f;->l:Lmj/f;

    .line 15
    .line 16
    invoke-direct {v0, p0, p1, p2, v1}, Lnet/time4j/y;-><init>(JILmj/f;)V

    .line 17
    .line 18
    .line 19
    return-object v0
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

.method private readObject(Ljava/io/ObjectInputStream;)V
    .locals 1

    new-instance p1, Ljava/io/InvalidObjectException;

    const-string v0, "Serialization proxy required."

    invoke-direct {p1, v0}, Ljava/io/InvalidObjectException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private writeReplace()Ljava/lang/Object;
    .locals 2

    new-instance v0, Lnet/time4j/SPX;

    const/4 v1, 0x5

    invoke-direct {v0, p0, v1}, Lnet/time4j/SPX;-><init>(Ljava/lang/Object;I)V

    return-object v0
.end method


# virtual methods
.method public b(Lnet/time4j/y;)I
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/time4j/y<",
            "TU;>;)I"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lnet/time4j/y;->m:Lmj/f;

    .line 2
    .line 3
    iget-object v1, p1, Lnet/time4j/y;->m:Lmj/f;

    .line 4
    .line 5
    if-ne v0, v1, :cond_2

    .line 6
    .line 7
    iget-wide v0, p0, Lnet/time4j/y;->k:J

    .line 8
    .line 9
    iget-wide v2, p1, Lnet/time4j/y;->k:J

    .line 10
    .line 11
    cmp-long v4, v0, v2

    .line 12
    .line 13
    if-gez v4, :cond_0

    .line 14
    .line 15
    const/4 p1, -0x1

    .line 16
    return p1

    .line 17
    :cond_0
    cmp-long v0, v0, v2

    .line 18
    .line 19
    if-lez v0, :cond_1

    .line 20
    .line 21
    const/4 p1, 0x1

    .line 22
    return p1

    .line 23
    :cond_1
    iget v0, p0, Lnet/time4j/y;->l:I

    .line 24
    .line 25
    iget p1, p1, Lnet/time4j/y;->l:I

    .line 26
    .line 27
    sub-int/2addr v0, p1

    .line 28
    return v0

    .line 29
    :cond_2
    new-instance p1, Ljava/lang/ClassCastException;

    .line 30
    .line 31
    const-string v0, "Different time scales."

    .line 32
    .line 33
    invoke-direct {p1, v0}, Ljava/lang/ClassCastException;-><init>(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    throw p1
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
.end method

.method public bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    check-cast p1, Lnet/time4j/y;

    invoke-virtual {p0, p1}, Lnet/time4j/y;->b(Lnet/time4j/y;)I

    move-result p1

    return p1
.end method

.method public e()I
    .locals 2

    iget v0, p0, Lnet/time4j/y;->l:I

    if-gez v0, :cond_0

    const v1, 0x3b9aca00

    add-int/2addr v0, v1

    :cond_0
    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, Lnet/time4j/y;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-eqz v1, :cond_2

    .line 9
    .line 10
    check-cast p1, Lnet/time4j/y;

    .line 11
    .line 12
    iget-wide v3, p0, Lnet/time4j/y;->k:J

    .line 13
    .line 14
    iget-wide v5, p1, Lnet/time4j/y;->k:J

    .line 15
    .line 16
    cmp-long v1, v3, v5

    .line 17
    .line 18
    if-nez v1, :cond_1

    .line 19
    .line 20
    iget v1, p0, Lnet/time4j/y;->l:I

    .line 21
    .line 22
    iget v3, p1, Lnet/time4j/y;->l:I

    .line 23
    .line 24
    if-ne v1, v3, :cond_1

    .line 25
    .line 26
    iget-object v1, p0, Lnet/time4j/y;->m:Lmj/f;

    .line 27
    .line 28
    iget-object p1, p1, Lnet/time4j/y;->m:Lmj/f;

    .line 29
    .line 30
    if-ne v1, p1, :cond_1

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_1
    move v0, v2

    .line 34
    :goto_0
    return v0

    .line 35
    :cond_2
    return v2
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
.end method

.method public f()Lmj/f;
    .locals 1

    iget-object v0, p0, Lnet/time4j/y;->m:Lmj/f;

    return-object v0
.end method

.method public h()J
    .locals 4

    .line 1
    iget-wide v0, p0, Lnet/time4j/y;->k:J

    .line 2
    .line 3
    iget v2, p0, Lnet/time4j/y;->l:I

    .line 4
    .line 5
    if-gez v2, :cond_0

    .line 6
    .line 7
    const-wide/16 v2, 0x1

    .line 8
    .line 9
    sub-long/2addr v0, v2

    .line 10
    :cond_0
    return-wide v0
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
.end method

.method public hashCode()I
    .locals 4

    .line 1
    iget-wide v0, p0, Lnet/time4j/y;->k:J

    .line 2
    .line 3
    const/16 v2, 0x20

    .line 4
    .line 5
    ushr-long v2, v0, v2

    .line 6
    .line 7
    xor-long/2addr v0, v2

    .line 8
    long-to-int v0, v0

    .line 9
    const/16 v1, 0xa1

    .line 10
    .line 11
    add-int/2addr v1, v0

    .line 12
    mul-int/lit8 v1, v1, 0x17

    .line 13
    .line 14
    iget v0, p0, Lnet/time4j/y;->l:I

    .line 15
    .line 16
    add-int/2addr v1, v0

    .line 17
    mul-int/lit8 v1, v1, 0x17

    .line 18
    .line 19
    iget-object v0, p0, Lnet/time4j/y;->m:Lmj/f;

    .line 20
    .line 21
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    add-int/2addr v1, v0

    .line 26
    return v1
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
.end method

.method public i()Z
    .locals 4

    iget-wide v0, p0, Lnet/time4j/y;->k:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-ltz v0, :cond_1

    iget v0, p0, Lnet/time4j/y;->l:I

    if-gez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0, v0}, Lnet/time4j/y;->c(Ljava/lang/StringBuilder;)V

    .line 7
    .line 8
    .line 9
    const-string v1, "s ["

    .line 10
    .line 11
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    iget-object v1, p0, Lnet/time4j/y;->m:Lmj/f;

    .line 15
    .line 16
    invoke-virtual {v1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const/16 v1, 0x5d

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    return-object v0
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
.end method
