.class final Lhj/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhj/h;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lhj/n$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lhj/h<",
        "Lnet/time4j/tz/k;",
        ">;"
    }
.end annotation


# static fields
.field private static final s:Lnet/time4j/tz/p;

.field private static final t:Ljava/util/concurrent/ConcurrentMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentMap<",
            "Ljava/util/Locale;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private static final u:Ljava/util/concurrent/ConcurrentMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentMap<",
            "Ljava/util/Locale;",
            "Lhj/n$a;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final k:Z

.field private final l:Z

.field private final m:Z

.field private final n:Ljava/util/Locale;

.field private final o:Ljava/lang/String;

.field private final p:Ljava/lang/String;

.field private final q:C

.field private final r:Lgj/g;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const v0, 0xfd20

    .line 2
    .line 3
    .line 4
    invoke-static {v0}, Lnet/time4j/tz/p;->r(I)Lnet/time4j/tz/p;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    sput-object v0, Lhj/n;->s:Lnet/time4j/tz/p;

    .line 9
    .line 10
    new-instance v0, Lj$/util/concurrent/ConcurrentHashMap;

    .line 11
    .line 12
    invoke-direct {v0}, Lj$/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 13
    .line 14
    .line 15
    sput-object v0, Lhj/n;->t:Ljava/util/concurrent/ConcurrentMap;

    .line 16
    .line 17
    new-instance v0, Lj$/util/concurrent/ConcurrentHashMap;

    .line 18
    .line 19
    invoke-direct {v0}, Lj$/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 20
    .line 21
    .line 22
    sput-object v0, Lhj/n;->u:Ljava/util/concurrent/ConcurrentMap;

    .line 23
    .line 24
    return-void
.end method

.method constructor <init>(Z)V
    .locals 9

    const/4 v2, 0x1

    const/4 v3, 0x0

    .line 1
    sget-object v4, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    const-string v5, "+"

    const-string v6, "-"

    const/16 v7, 0x30

    sget-object v8, Lgj/g;->l:Lgj/g;

    move-object v0, p0

    move v1, p1

    invoke-direct/range {v0 .. v8}, Lhj/n;-><init>(ZZZLjava/util/Locale;Ljava/lang/String;Ljava/lang/String;CLgj/g;)V

    return-void
.end method

.method private constructor <init>(ZZZLjava/util/Locale;Ljava/lang/String;Ljava/lang/String;CLgj/g;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-boolean p1, p0, Lhj/n;->k:Z

    .line 4
    iput-boolean p2, p0, Lhj/n;->l:Z

    .line 5
    iput-boolean p3, p0, Lhj/n;->m:Z

    .line 6
    iput-object p4, p0, Lhj/n;->n:Ljava/util/Locale;

    .line 7
    iput-object p5, p0, Lhj/n;->o:Ljava/lang/String;

    .line 8
    iput-object p6, p0, Lhj/n;->p:Ljava/lang/String;

    .line 9
    iput-char p7, p0, Lhj/n;->q:C

    .line 10
    iput-object p8, p0, Lhj/n;->r:Lgj/g;

    return-void
.end method

.method private static a(CC)Z
    .locals 2

    .line 1
    if-eq p0, p1, :cond_1

    .line 2
    .line 3
    invoke-static {p0}, Ljava/lang/Character;->toUpperCase(C)C

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    invoke-static {p1}, Ljava/lang/Character;->toUpperCase(C)C

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eq v0, v1, :cond_1

    .line 12
    .line 13
    invoke-static {p0}, Ljava/lang/Character;->toLowerCase(C)C

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    invoke-static {p1}, Ljava/lang/Character;->toLowerCase(C)C

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    if-ne p0, p1, :cond_0

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    const/4 p0, 0x0

    .line 25
    goto :goto_1

    .line 26
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 27
    :goto_1
    return p0
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

.method private static b(Ljava/util/Locale;)Ljava/lang/String;
    .locals 2

    .line 1
    sget-object v0, Lhj/n;->t:Ljava/util/concurrent/ConcurrentMap;

    .line 2
    .line 3
    invoke-interface {v0, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    check-cast v1, Ljava/lang/String;

    .line 8
    .line 9
    if-nez v1, :cond_0

    .line 10
    .line 11
    sget-object v1, Lnet/time4j/tz/p;->u:Lnet/time4j/tz/p;

    .line 12
    .line 13
    invoke-virtual {v1, p0}, Lnet/time4j/tz/p;->o(Ljava/util/Locale;)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-interface {v0, p0, v1}, Ljava/util/concurrent/ConcurrentMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    check-cast p0, Ljava/lang/String;

    .line 22
    .line 23
    if-eqz p0, :cond_0

    .line 24
    .line 25
    move-object v1, p0

    .line 26
    :cond_0
    return-object v1
    .line 27
.end method

.method private static d(Lfj/o;Lfj/d;)Lnet/time4j/tz/p;
    .locals 2

    .line 1
    sget-object v0, Lgj/a;->d:Lfj/c;

    .line 2
    .line 3
    invoke-interface {p1, v0}, Lfj/d;->b(Lfj/c;)Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    invoke-interface {p1, v0}, Lfj/d;->c(Lfj/c;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    check-cast p1, Lnet/time4j/tz/k;

    .line 14
    .line 15
    instance-of v0, p1, Lnet/time4j/tz/p;

    .line 16
    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    check-cast p1, Lnet/time4j/tz/p;

    .line 20
    .line 21
    return-object p1

    .line 22
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 23
    .line 24
    new-instance v0, Ljava/lang/StringBuilder;

    .line 25
    .line 26
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 27
    .line 28
    .line 29
    const-string v1, "Cannot extract timezone offset from format attributes for: "

    .line 30
    .line 31
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    throw p1
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
.end method

.method private static g(Ljava/util/Locale;)Lhj/n$a;
    .locals 6

    .line 1
    sget-object v0, Lhj/n;->u:Ljava/util/concurrent/ConcurrentMap;

    .line 2
    .line 3
    invoke-interface {v0, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lhj/n$a;

    .line 8
    .line 9
    if-nez v0, :cond_2

    .line 10
    .line 11
    sget-object v1, Lhj/n;->s:Lnet/time4j/tz/p;

    .line 12
    .line 13
    invoke-virtual {v1, p0}, Lnet/time4j/tz/p;->o(Ljava/util/Locale;)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    const/4 v3, 0x0

    .line 22
    :goto_0
    if-ge v3, v2, :cond_2

    .line 23
    .line 24
    invoke-virtual {v1, v3}, Ljava/lang/String;->charAt(I)C

    .line 25
    .line 26
    .line 27
    move-result v4

    .line 28
    const/16 v5, 0xb1

    .line 29
    .line 30
    if-ne v4, v5, :cond_1

    .line 31
    .line 32
    const-string v0, "hh"

    .line 33
    .line 34
    invoke-virtual {v1, v0, v3}, Ljava/lang/String;->indexOf(Ljava/lang/String;I)I

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    add-int/lit8 v0, v0, 0x2

    .line 39
    .line 40
    const-string v2, "mm"

    .line 41
    .line 42
    invoke-virtual {v1, v2, v0}, Ljava/lang/String;->indexOf(Ljava/lang/String;I)I

    .line 43
    .line 44
    .line 45
    move-result v2

    .line 46
    new-instance v4, Lhj/n$a;

    .line 47
    .line 48
    invoke-virtual {v1, v0, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    add-int/lit8 v2, v2, 0x2

    .line 53
    .line 54
    invoke-direct {v4, v1, v0, v3, v2}, Lhj/n$a;-><init>(Ljava/lang/String;Ljava/lang/String;II)V

    .line 55
    .line 56
    .line 57
    sget-object v0, Lhj/n;->u:Ljava/util/concurrent/ConcurrentMap;

    .line 58
    .line 59
    invoke-interface {v0, p0, v4}, Ljava/util/concurrent/ConcurrentMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object p0

    .line 63
    move-object v0, p0

    .line 64
    check-cast v0, Lhj/n$a;

    .line 65
    .line 66
    if-eqz v0, :cond_0

    .line 67
    .line 68
    goto :goto_1

    .line 69
    :cond_0
    move-object v0, v4

    .line 70
    goto :goto_1

    .line 71
    :cond_1
    add-int/lit8 v3, v3, 0x1

    .line 72
    .line 73
    goto :goto_0

    .line 74
    :cond_2
    :goto_1
    return-object v0
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

.method private static k(Ljava/lang/CharSequence;IC)I
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    move v1, v0

    .line 3
    :goto_0
    const/4 v2, 0x2

    .line 4
    if-ge v0, v2, :cond_4

    .line 5
    .line 6
    add-int v2, p1, v0

    .line 7
    .line 8
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    .line 9
    .line 10
    .line 11
    move-result v3

    .line 12
    const/16 v4, -0x3e8

    .line 13
    .line 14
    if-lt v2, v3, :cond_1

    .line 15
    .line 16
    if-nez v0, :cond_0

    .line 17
    .line 18
    return v4

    .line 19
    :cond_0
    not-int p0, v1

    .line 20
    return p0

    .line 21
    :cond_1
    invoke-interface {p0, v2}, Ljava/lang/CharSequence;->charAt(I)C

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    sub-int/2addr v2, p2

    .line 26
    if-ltz v2, :cond_2

    .line 27
    .line 28
    const/16 v3, 0x9

    .line 29
    .line 30
    if-gt v2, v3, :cond_2

    .line 31
    .line 32
    mul-int/lit8 v1, v1, 0xa

    .line 33
    .line 34
    add-int/2addr v1, v2

    .line 35
    add-int/lit8 v0, v0, 0x1

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_2
    if-nez v0, :cond_3

    .line 39
    .line 40
    return v4

    .line 41
    :cond_3
    not-int p0, v1

    .line 42
    return p0

    .line 43
    :cond_4
    return v1
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

.method private static l(Ljava/lang/CharSequence;IC)I
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    move v1, v0

    .line 3
    :goto_0
    const/4 v2, 0x2

    .line 4
    if-ge v0, v2, :cond_2

    .line 5
    .line 6
    add-int v2, p1, v0

    .line 7
    .line 8
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    .line 9
    .line 10
    .line 11
    move-result v3

    .line 12
    const/16 v4, -0x3e8

    .line 13
    .line 14
    if-lt v2, v3, :cond_0

    .line 15
    .line 16
    return v4

    .line 17
    :cond_0
    invoke-interface {p0, v2}, Ljava/lang/CharSequence;->charAt(I)C

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    sub-int/2addr v2, p2

    .line 22
    if-ltz v2, :cond_1

    .line 23
    .line 24
    const/16 v3, 0x9

    .line 25
    .line 26
    if-gt v2, v3, :cond_1

    .line 27
    .line 28
    mul-int/lit8 v1, v1, 0xa

    .line 29
    .line 30
    add-int/2addr v1, v2

    .line 31
    add-int/lit8 v0, v0, 0x1

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_1
    return v4

    .line 35
    :cond_2
    return v1
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

.method private static m(Ljava/lang/CharSequence;IILjava/util/Locale;Z)I
    .locals 7

    .line 1
    invoke-static {p3}, Lhj/n;->b(Ljava/util/Locale;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p3

    .line 5
    const/4 v0, 0x4

    .line 6
    new-array v1, v0, [Ljava/lang/String;

    .line 7
    .line 8
    const-string v2, "GMT"

    .line 9
    .line 10
    const/4 v3, 0x0

    .line 11
    aput-object v2, v1, v3

    .line 12
    .line 13
    const/4 v2, 0x1

    .line 14
    aput-object p3, v1, v2

    .line 15
    .line 16
    const/4 p3, 0x2

    .line 17
    const-string v2, "UTC"

    .line 18
    .line 19
    aput-object v2, v1, p3

    .line 20
    .line 21
    const/4 p3, 0x3

    .line 22
    const-string v2, "UT"

    .line 23
    .line 24
    aput-object v2, v1, p3

    .line 25
    .line 26
    move p3, v3

    .line 27
    :goto_0
    if-ge p3, v0, :cond_3

    .line 28
    .line 29
    aget-object v2, v1, p3

    .line 30
    .line 31
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 32
    .line 33
    .line 34
    move-result v4

    .line 35
    sub-int v5, p1, p2

    .line 36
    .line 37
    if-lt v5, v4, :cond_2

    .line 38
    .line 39
    add-int v5, p2, v4

    .line 40
    .line 41
    invoke-interface {p0, p2, v5}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    .line 42
    .line 43
    .line 44
    move-result-object v5

    .line 45
    invoke-interface {v5}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v5

    .line 49
    if-eqz p4, :cond_0

    .line 50
    .line 51
    invoke-virtual {v5, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 52
    .line 53
    .line 54
    move-result v6

    .line 55
    if-nez v6, :cond_1

    .line 56
    .line 57
    :cond_0
    if-nez p4, :cond_2

    .line 58
    .line 59
    invoke-virtual {v5, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    move-result v2

    .line 63
    if-eqz v2, :cond_2

    .line 64
    .line 65
    :cond_1
    return v4

    .line 66
    :cond_2
    add-int/lit8 p3, p3, 0x1

    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_3
    return v3
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
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
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
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
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
.end method


# virtual methods
.method public c()Lfj/p;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lfj/p<",
            "Lnet/time4j/tz/k;",
            ">;"
        }
    .end annotation

    sget-object v0, Lhj/b0;->l:Lhj/b0;

    return-object v0
.end method

.method public e(Lfj/o;Ljava/lang/Appendable;Lfj/d;Ljava/util/Set;Z)I
    .locals 18
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lfj/o;",
            "Ljava/lang/Appendable;",
            "Lfj/d;",
            "Ljava/util/Set<",
            "Lhj/g;",
            ">;Z)I"
        }
    .end annotation

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    move-object/from16 v3, p3

    .line 8
    .line 9
    move-object/from16 v4, p4

    .line 10
    .line 11
    instance-of v5, v2, Ljava/lang/CharSequence;

    .line 12
    .line 13
    if-eqz v5, :cond_0

    .line 14
    .line 15
    move-object v5, v2

    .line 16
    check-cast v5, Ljava/lang/CharSequence;

    .line 17
    .line 18
    invoke-interface {v5}, Ljava/lang/CharSequence;->length()I

    .line 19
    .line 20
    .line 21
    move-result v5

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    const/4 v5, -0x1

    .line 24
    :goto_0
    invoke-interface/range {p1 .. p1}, Lfj/o;->f()Z

    .line 25
    .line 26
    .line 27
    move-result v7

    .line 28
    if-eqz v7, :cond_1

    .line 29
    .line 30
    invoke-interface/range {p1 .. p1}, Lfj/o;->r()Lnet/time4j/tz/k;

    .line 31
    .line 32
    .line 33
    move-result-object v7

    .line 34
    goto :goto_1

    .line 35
    :cond_1
    const/4 v7, 0x0

    .line 36
    :goto_1
    if-nez v7, :cond_2

    .line 37
    .line 38
    invoke-static {v1, v3}, Lhj/n;->d(Lfj/o;Lfj/d;)Lnet/time4j/tz/p;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    goto :goto_2

    .line 43
    :cond_2
    instance-of v8, v7, Lnet/time4j/tz/p;

    .line 44
    .line 45
    if-eqz v8, :cond_3

    .line 46
    .line 47
    move-object v1, v7

    .line 48
    check-cast v1, Lnet/time4j/tz/p;

    .line 49
    .line 50
    goto :goto_2

    .line 51
    :cond_3
    instance-of v8, v1, Lnet/time4j/base/f;

    .line 52
    .line 53
    if-eqz v8, :cond_17

    .line 54
    .line 55
    invoke-static {v7}, Lnet/time4j/tz/l;->N(Lnet/time4j/tz/k;)Lnet/time4j/tz/l;

    .line 56
    .line 57
    .line 58
    move-result-object v7

    .line 59
    check-cast v1, Lnet/time4j/base/f;

    .line 60
    .line 61
    invoke-virtual {v7, v1}, Lnet/time4j/tz/l;->B(Lnet/time4j/base/f;)Lnet/time4j/tz/p;

    .line 62
    .line 63
    .line 64
    move-result-object v1

    .line 65
    :goto_2
    if-eqz p5, :cond_4

    .line 66
    .line 67
    iget-object v7, v0, Lhj/n;->n:Ljava/util/Locale;

    .line 68
    .line 69
    goto :goto_3

    .line 70
    :cond_4
    sget-object v7, Lgj/a;->c:Lfj/c;

    .line 71
    .line 72
    sget-object v8, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 73
    .line 74
    invoke-interface {v3, v7, v8}, Lfj/d;->a(Lfj/c;Ljava/lang/Object;)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v7

    .line 78
    check-cast v7, Ljava/util/Locale;

    .line 79
    .line 80
    :goto_3
    const/16 v8, 0x30

    .line 81
    .line 82
    if-eqz p5, :cond_5

    .line 83
    .line 84
    iget-char v9, v0, Lhj/n;->q:C

    .line 85
    .line 86
    goto :goto_4

    .line 87
    :cond_5
    sget-object v9, Lgj/a;->m:Lfj/c;

    .line 88
    .line 89
    invoke-static {v8}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    .line 90
    .line 91
    .line 92
    move-result-object v10

    .line 93
    invoke-interface {v3, v9, v10}, Lfj/d;->a(Lfj/c;Ljava/lang/Object;)Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object v9

    .line 97
    check-cast v9, Ljava/lang/Character;

    .line 98
    .line 99
    invoke-virtual {v9}, Ljava/lang/Character;->charValue()C

    .line 100
    .line 101
    .line 102
    move-result v9

    .line 103
    :goto_4
    if-eqz p5, :cond_6

    .line 104
    .line 105
    iget-object v10, v0, Lhj/n;->o:Ljava/lang/String;

    .line 106
    .line 107
    goto :goto_5

    .line 108
    :cond_6
    sget-object v10, Lhj/b;->g:Lfj/c;

    .line 109
    .line 110
    const-string v11, "+"

    .line 111
    .line 112
    invoke-interface {v3, v10, v11}, Lfj/d;->a(Lfj/c;Ljava/lang/Object;)Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object v10

    .line 116
    check-cast v10, Ljava/lang/String;

    .line 117
    .line 118
    :goto_5
    if-eqz p5, :cond_7

    .line 119
    .line 120
    iget-object v11, v0, Lhj/n;->p:Ljava/lang/String;

    .line 121
    .line 122
    goto :goto_6

    .line 123
    :cond_7
    sget-object v11, Lhj/b;->h:Lfj/c;

    .line 124
    .line 125
    const-string v12, "-"

    .line 126
    .line 127
    invoke-interface {v3, v11, v12}, Lfj/d;->a(Lfj/c;Ljava/lang/Object;)Ljava/lang/Object;

    .line 128
    .line 129
    .line 130
    move-result-object v11

    .line 131
    check-cast v11, Ljava/lang/String;

    .line 132
    .line 133
    :goto_6
    if-eqz p5, :cond_8

    .line 134
    .line 135
    iget-boolean v3, v0, Lhj/n;->m:Z

    .line 136
    .line 137
    goto :goto_7

    .line 138
    :cond_8
    sget-object v12, Lgj/a;->n:Lfj/c;

    .line 139
    .line 140
    sget-object v13, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 141
    .line 142
    invoke-interface {v3, v12, v13}, Lfj/d;->a(Lfj/c;Ljava/lang/Object;)Ljava/lang/Object;

    .line 143
    .line 144
    .line 145
    move-result-object v3

    .line 146
    check-cast v3, Ljava/lang/Boolean;

    .line 147
    .line 148
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 149
    .line 150
    .line 151
    move-result v3

    .line 152
    :goto_7
    invoke-virtual {v1}, Lnet/time4j/tz/p;->l()I

    .line 153
    .line 154
    .line 155
    move-result v12

    .line 156
    invoke-virtual {v1}, Lnet/time4j/tz/p;->k()I

    .line 157
    .line 158
    .line 159
    move-result v13

    .line 160
    if-nez v3, :cond_9

    .line 161
    .line 162
    if-nez v12, :cond_9

    .line 163
    .line 164
    if-nez v13, :cond_9

    .line 165
    .line 166
    invoke-static {v7}, Lhj/n;->b(Ljava/util/Locale;)Ljava/lang/String;

    .line 167
    .line 168
    .line 169
    move-result-object v1

    .line 170
    invoke-interface {v2, v1}, Ljava/lang/Appendable;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    .line 171
    .line 172
    .line 173
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 174
    .line 175
    .line 176
    move-result v1

    .line 177
    goto/16 :goto_11

    .line 178
    .line 179
    :cond_9
    invoke-static {v7}, Lhj/n;->g(Ljava/util/Locale;)Lhj/n$a;

    .line 180
    .line 181
    .line 182
    move-result-object v7

    .line 183
    invoke-static {v7}, Lhj/n$a;->a(Lhj/n$a;)Ljava/lang/String;

    .line 184
    .line 185
    .line 186
    move-result-object v12

    .line 187
    invoke-virtual {v12}, Ljava/lang/String;->length()I

    .line 188
    .line 189
    .line 190
    move-result v12

    .line 191
    const/4 v14, 0x0

    .line 192
    const/4 v15, 0x0

    .line 193
    :goto_8
    if-ge v15, v12, :cond_15

    .line 194
    .line 195
    invoke-static {v7}, Lhj/n$a;->a(Lhj/n$a;)Ljava/lang/String;

    .line 196
    .line 197
    .line 198
    move-result-object v13

    .line 199
    invoke-virtual {v13, v15}, Ljava/lang/String;->charAt(I)C

    .line 200
    .line 201
    .line 202
    move-result v13

    .line 203
    invoke-static {v7}, Lhj/n$a;->b(Lhj/n$a;)I

    .line 204
    .line 205
    .line 206
    move-result v6

    .line 207
    if-gt v6, v15, :cond_13

    .line 208
    .line 209
    invoke-static {v7}, Lhj/n$a;->c(Lhj/n$a;)I

    .line 210
    .line 211
    .line 212
    move-result v6

    .line 213
    if-gt v6, v15, :cond_a

    .line 214
    .line 215
    goto/16 :goto_f

    .line 216
    .line 217
    :cond_a
    invoke-virtual {v1}, Lnet/time4j/tz/p;->n()Lnet/time4j/tz/f;

    .line 218
    .line 219
    .line 220
    move-result-object v6

    .line 221
    sget-object v13, Lnet/time4j/tz/f;->k:Lnet/time4j/tz/f;

    .line 222
    .line 223
    if-ne v6, v13, :cond_b

    .line 224
    .line 225
    invoke-interface {v2, v11}, Ljava/lang/Appendable;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    .line 226
    .line 227
    .line 228
    invoke-virtual {v11}, Ljava/lang/String;->length()I

    .line 229
    .line 230
    .line 231
    move-result v6

    .line 232
    goto :goto_9

    .line 233
    :cond_b
    invoke-interface {v2, v10}, Ljava/lang/Appendable;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    .line 234
    .line 235
    .line 236
    invoke-virtual {v10}, Ljava/lang/String;->length()I

    .line 237
    .line 238
    .line 239
    move-result v6

    .line 240
    :goto_9
    add-int/2addr v14, v6

    .line 241
    invoke-virtual {v1}, Lnet/time4j/tz/p;->h()I

    .line 242
    .line 243
    .line 244
    move-result v6

    .line 245
    invoke-virtual {v1}, Lnet/time4j/tz/p;->i()I

    .line 246
    .line 247
    .line 248
    move-result v13

    .line 249
    invoke-virtual {v1}, Lnet/time4j/tz/p;->j()I

    .line 250
    .line 251
    .line 252
    move-result v15

    .line 253
    const/16 v8, 0xa

    .line 254
    .line 255
    if-ge v6, v8, :cond_c

    .line 256
    .line 257
    iget-boolean v8, v0, Lhj/n;->k:Z

    .line 258
    .line 259
    if-nez v8, :cond_c

    .line 260
    .line 261
    invoke-interface {v2, v9}, Ljava/lang/Appendable;->append(C)Ljava/lang/Appendable;

    .line 262
    .line 263
    .line 264
    add-int/lit8 v14, v14, 0x1

    .line 265
    .line 266
    :cond_c
    invoke-static {v6}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 267
    .line 268
    .line 269
    move-result-object v6

    .line 270
    move-object/from16 v17, v1

    .line 271
    .line 272
    const/4 v8, 0x0

    .line 273
    :goto_a
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    .line 274
    .line 275
    .line 276
    move-result v1

    .line 277
    if-ge v8, v1, :cond_d

    .line 278
    .line 279
    invoke-virtual {v6, v8}, Ljava/lang/String;->charAt(I)C

    .line 280
    .line 281
    .line 282
    move-result v1

    .line 283
    const/16 v16, 0x30

    .line 284
    .line 285
    add-int/lit8 v1, v1, -0x30

    .line 286
    .line 287
    add-int/2addr v1, v9

    .line 288
    int-to-char v1, v1

    .line 289
    invoke-interface {v2, v1}, Ljava/lang/Appendable;->append(C)Ljava/lang/Appendable;

    .line 290
    .line 291
    .line 292
    add-int/lit8 v14, v14, 0x1

    .line 293
    .line 294
    add-int/lit8 v8, v8, 0x1

    .line 295
    .line 296
    goto :goto_a

    .line 297
    :cond_d
    if-nez v13, :cond_f

    .line 298
    .line 299
    if-nez v15, :cond_f

    .line 300
    .line 301
    iget-boolean v1, v0, Lhj/n;->k:Z

    .line 302
    .line 303
    if-nez v1, :cond_e

    .line 304
    .line 305
    goto :goto_b

    .line 306
    :cond_e
    const/16 v16, 0x30

    .line 307
    .line 308
    goto :goto_e

    .line 309
    :cond_f
    :goto_b
    invoke-static {v7}, Lhj/n$a;->d(Lhj/n$a;)Ljava/lang/String;

    .line 310
    .line 311
    .line 312
    move-result-object v1

    .line 313
    invoke-interface {v2, v1}, Ljava/lang/Appendable;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    .line 314
    .line 315
    .line 316
    invoke-static {v7}, Lhj/n$a;->d(Lhj/n$a;)Ljava/lang/String;

    .line 317
    .line 318
    .line 319
    move-result-object v1

    .line 320
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 321
    .line 322
    .line 323
    move-result v1

    .line 324
    add-int/2addr v14, v1

    .line 325
    const/16 v1, 0xa

    .line 326
    .line 327
    if-ge v13, v1, :cond_10

    .line 328
    .line 329
    invoke-interface {v2, v9}, Ljava/lang/Appendable;->append(C)Ljava/lang/Appendable;

    .line 330
    .line 331
    .line 332
    add-int/lit8 v14, v14, 0x1

    .line 333
    .line 334
    :cond_10
    invoke-static {v13}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 335
    .line 336
    .line 337
    move-result-object v1

    .line 338
    const/4 v6, 0x0

    .line 339
    :goto_c
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 340
    .line 341
    .line 342
    move-result v8

    .line 343
    if-ge v6, v8, :cond_11

    .line 344
    .line 345
    invoke-virtual {v1, v6}, Ljava/lang/String;->charAt(I)C

    .line 346
    .line 347
    .line 348
    move-result v8

    .line 349
    const/16 v13, 0x30

    .line 350
    .line 351
    sub-int/2addr v8, v13

    .line 352
    add-int/2addr v8, v9

    .line 353
    int-to-char v8, v8

    .line 354
    invoke-interface {v2, v8}, Ljava/lang/Appendable;->append(C)Ljava/lang/Appendable;

    .line 355
    .line 356
    .line 357
    add-int/lit8 v14, v14, 0x1

    .line 358
    .line 359
    add-int/lit8 v6, v6, 0x1

    .line 360
    .line 361
    goto :goto_c

    .line 362
    :cond_11
    if-eqz v15, :cond_e

    .line 363
    .line 364
    invoke-static {v7}, Lhj/n$a;->d(Lhj/n$a;)Ljava/lang/String;

    .line 365
    .line 366
    .line 367
    move-result-object v1

    .line 368
    invoke-interface {v2, v1}, Ljava/lang/Appendable;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    .line 369
    .line 370
    .line 371
    invoke-static {v7}, Lhj/n$a;->d(Lhj/n$a;)Ljava/lang/String;

    .line 372
    .line 373
    .line 374
    move-result-object v1

    .line 375
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 376
    .line 377
    .line 378
    move-result v1

    .line 379
    add-int/2addr v14, v1

    .line 380
    const/16 v1, 0xa

    .line 381
    .line 382
    if-ge v15, v1, :cond_12

    .line 383
    .line 384
    invoke-interface {v2, v9}, Ljava/lang/Appendable;->append(C)Ljava/lang/Appendable;

    .line 385
    .line 386
    .line 387
    add-int/lit8 v14, v14, 0x1

    .line 388
    .line 389
    :cond_12
    invoke-static {v15}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 390
    .line 391
    .line 392
    move-result-object v1

    .line 393
    const/4 v6, 0x0

    .line 394
    :goto_d
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 395
    .line 396
    .line 397
    move-result v8

    .line 398
    if-ge v6, v8, :cond_e

    .line 399
    .line 400
    invoke-virtual {v1, v6}, Ljava/lang/String;->charAt(I)C

    .line 401
    .line 402
    .line 403
    move-result v8

    .line 404
    const/16 v16, 0x30

    .line 405
    .line 406
    add-int/lit8 v8, v8, -0x30

    .line 407
    .line 408
    add-int/2addr v8, v9

    .line 409
    int-to-char v8, v8

    .line 410
    invoke-interface {v2, v8}, Ljava/lang/Appendable;->append(C)Ljava/lang/Appendable;

    .line 411
    .line 412
    .line 413
    add-int/lit8 v14, v14, 0x1

    .line 414
    .line 415
    add-int/lit8 v6, v6, 0x1

    .line 416
    .line 417
    goto :goto_d

    .line 418
    :goto_e
    invoke-static {v7}, Lhj/n$a;->c(Lhj/n$a;)I

    .line 419
    .line 420
    .line 421
    move-result v1

    .line 422
    add-int/lit8 v15, v1, -0x1

    .line 423
    .line 424
    goto :goto_10

    .line 425
    :cond_13
    :goto_f
    move-object/from16 v17, v1

    .line 426
    .line 427
    move/from16 v16, v8

    .line 428
    .line 429
    if-nez v3, :cond_14

    .line 430
    .line 431
    invoke-interface {v2, v13}, Ljava/lang/Appendable;->append(C)Ljava/lang/Appendable;

    .line 432
    .line 433
    .line 434
    add-int/lit8 v14, v14, 0x1

    .line 435
    .line 436
    :cond_14
    :goto_10
    add-int/lit8 v15, v15, 0x1

    .line 437
    .line 438
    move/from16 v8, v16

    .line 439
    .line 440
    move-object/from16 v1, v17

    .line 441
    .line 442
    goto/16 :goto_8

    .line 443
    .line 444
    :cond_15
    move v1, v14

    .line 445
    :goto_11
    const/4 v2, -0x1

    .line 446
    if-eq v5, v2, :cond_16

    .line 447
    .line 448
    if-lez v1, :cond_16

    .line 449
    .line 450
    if-eqz v4, :cond_16

    .line 451
    .line 452
    new-instance v2, Lhj/g;

    .line 453
    .line 454
    sget-object v3, Lhj/b0;->k:Lhj/b0;

    .line 455
    .line 456
    add-int v6, v5, v1

    .line 457
    .line 458
    invoke-direct {v2, v3, v5, v6}, Lhj/g;-><init>(Lfj/p;II)V

    .line 459
    .line 460
    .line 461
    invoke-interface {v4, v2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 462
    .line 463
    .line 464
    :cond_16
    return v1

    .line 465
    :cond_17
    new-instance v2, Ljava/lang/IllegalArgumentException;

    .line 466
    .line 467
    new-instance v3, Ljava/lang/StringBuilder;

    .line 468
    .line 469
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 470
    .line 471
    .line 472
    const-string v4, "Cannot extract timezone offset from: "

    .line 473
    .line 474
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 475
    .line 476
    .line 477
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 478
    .line 479
    .line 480
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 481
    .line 482
    .line 483
    move-result-object v1

    .line 484
    invoke-direct {v2, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 485
    .line 486
    .line 487
    throw v2
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
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, Lhj/n;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-eqz v1, :cond_2

    .line 9
    .line 10
    check-cast p1, Lhj/n;

    .line 11
    .line 12
    iget-boolean v1, p0, Lhj/n;->k:Z

    .line 13
    .line 14
    iget-boolean p1, p1, Lhj/n;->k:Z

    .line 15
    .line 16
    if-ne v1, p1, :cond_1

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_1
    move v0, v2

    .line 20
    :goto_0
    return v0

    .line 21
    :cond_2
    return v2
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
.end method

.method public f(Lfj/p;)Lhj/h;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lfj/p<",
            "Lnet/time4j/tz/k;",
            ">;)",
            "Lhj/h<",
            "Lnet/time4j/tz/k;",
            ">;"
        }
    .end annotation

    return-object p0
.end method

.method public h()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public hashCode()I
    .locals 1

    iget-boolean v0, p0, Lhj/n;->k:Z

    return v0
.end method

.method public i(Ljava/lang/CharSequence;Lhj/s;Lfj/d;Lhj/t;Z)V
    .locals 25
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/CharSequence;",
            "Lhj/s;",
            "Lfj/d;",
            "Lhj/t<",
            "*>;Z)V"
        }
    .end annotation

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    move-object/from16 v3, p3

    .line 8
    .line 9
    move-object/from16 v4, p4

    .line 10
    .line 11
    invoke-interface/range {p1 .. p1}, Ljava/lang/CharSequence;->length()I

    .line 12
    .line 13
    .line 14
    move-result v5

    .line 15
    invoke-virtual/range {p2 .. p2}, Lhj/s;->f()I

    .line 16
    .line 17
    .line 18
    move-result v6

    .line 19
    if-lt v6, v5, :cond_0

    .line 20
    .line 21
    const-string v1, "Missing localized time zone offset."

    .line 22
    .line 23
    invoke-virtual {v2, v6, v1}, Lhj/s;->k(ILjava/lang/String;)V

    .line 24
    .line 25
    .line 26
    return-void

    .line 27
    :cond_0
    if-eqz p5, :cond_1

    .line 28
    .line 29
    iget-object v7, v0, Lhj/n;->n:Ljava/util/Locale;

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_1
    sget-object v7, Lgj/a;->c:Lfj/c;

    .line 33
    .line 34
    sget-object v8, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 35
    .line 36
    invoke-interface {v3, v7, v8}, Lfj/d;->a(Lfj/c;Ljava/lang/Object;)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v7

    .line 40
    check-cast v7, Ljava/util/Locale;

    .line 41
    .line 42
    :goto_0
    invoke-static {v7}, Lgj/b;->q(Ljava/util/Locale;)Z

    .line 43
    .line 44
    .line 45
    move-result v8

    .line 46
    if-eqz p5, :cond_2

    .line 47
    .line 48
    iget-boolean v9, v0, Lhj/n;->m:Z

    .line 49
    .line 50
    goto :goto_1

    .line 51
    :cond_2
    sget-object v9, Lgj/a;->n:Lfj/c;

    .line 52
    .line 53
    sget-object v10, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 54
    .line 55
    invoke-interface {v3, v9, v10}, Lfj/d;->a(Lfj/c;Ljava/lang/Object;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v9

    .line 59
    check-cast v9, Ljava/lang/Boolean;

    .line 60
    .line 61
    invoke-virtual {v9}, Ljava/lang/Boolean;->booleanValue()Z

    .line 62
    .line 63
    .line 64
    move-result v9

    .line 65
    :goto_1
    if-eqz p5, :cond_3

    .line 66
    .line 67
    iget-boolean v10, v0, Lhj/n;->l:Z

    .line 68
    .line 69
    goto :goto_2

    .line 70
    :cond_3
    sget-object v10, Lgj/a;->i:Lfj/c;

    .line 71
    .line 72
    sget-object v11, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 73
    .line 74
    invoke-interface {v3, v10, v11}, Lfj/d;->a(Lfj/c;Ljava/lang/Object;)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v10

    .line 78
    check-cast v10, Ljava/lang/Boolean;

    .line 79
    .line 80
    invoke-virtual {v10}, Ljava/lang/Boolean;->booleanValue()Z

    .line 81
    .line 82
    .line 83
    move-result v10

    .line 84
    :goto_2
    if-eqz p5, :cond_4

    .line 85
    .line 86
    iget-char v11, v0, Lhj/n;->q:C

    .line 87
    .line 88
    goto :goto_3

    .line 89
    :cond_4
    sget-object v11, Lgj/a;->m:Lfj/c;

    .line 90
    .line 91
    const/16 v12, 0x30

    .line 92
    .line 93
    invoke-static {v12}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    .line 94
    .line 95
    .line 96
    move-result-object v12

    .line 97
    invoke-interface {v3, v11, v12}, Lfj/d;->a(Lfj/c;Ljava/lang/Object;)Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object v11

    .line 101
    check-cast v11, Ljava/lang/Character;

    .line 102
    .line 103
    invoke-virtual {v11}, Ljava/lang/Character;->charValue()C

    .line 104
    .line 105
    .line 106
    move-result v11

    .line 107
    :goto_3
    if-eqz p5, :cond_5

    .line 108
    .line 109
    iget-object v12, v0, Lhj/n;->o:Ljava/lang/String;

    .line 110
    .line 111
    goto :goto_4

    .line 112
    :cond_5
    sget-object v12, Lhj/b;->g:Lfj/c;

    .line 113
    .line 114
    const-string v13, "+"

    .line 115
    .line 116
    invoke-interface {v3, v12, v13}, Lfj/d;->a(Lfj/c;Ljava/lang/Object;)Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object v12

    .line 120
    check-cast v12, Ljava/lang/String;

    .line 121
    .line 122
    :goto_4
    if-eqz p5, :cond_6

    .line 123
    .line 124
    iget-object v13, v0, Lhj/n;->p:Ljava/lang/String;

    .line 125
    .line 126
    goto :goto_5

    .line 127
    :cond_6
    sget-object v13, Lhj/b;->h:Lfj/c;

    .line 128
    .line 129
    const-string v14, "-"

    .line 130
    .line 131
    invoke-interface {v3, v13, v14}, Lfj/d;->a(Lfj/c;Ljava/lang/Object;)Ljava/lang/Object;

    .line 132
    .line 133
    .line 134
    move-result-object v13

    .line 135
    check-cast v13, Ljava/lang/String;

    .line 136
    .line 137
    :goto_5
    invoke-static {v7}, Lhj/n;->g(Ljava/util/Locale;)Lhj/n$a;

    .line 138
    .line 139
    .line 140
    move-result-object v14

    .line 141
    invoke-static {v14}, Lhj/n$a;->a(Lhj/n$a;)Ljava/lang/String;

    .line 142
    .line 143
    .line 144
    move-result-object v15

    .line 145
    invoke-virtual {v15}, Ljava/lang/String;->length()I

    .line 146
    .line 147
    .line 148
    move-result v15

    .line 149
    const/16 v16, 0x0

    .line 150
    .line 151
    const/16 v17, 0x0

    .line 152
    .line 153
    move v0, v6

    .line 154
    move/from16 v3, v16

    .line 155
    .line 156
    move-object/from16 v18, v17

    .line 157
    .line 158
    :goto_6
    if-ge v3, v15, :cond_21

    .line 159
    .line 160
    move/from16 v17, v15

    .line 161
    .line 162
    invoke-static {v14}, Lhj/n$a;->a(Lhj/n$a;)Ljava/lang/String;

    .line 163
    .line 164
    .line 165
    move-result-object v15

    .line 166
    invoke-virtual {v15, v3}, Ljava/lang/String;->charAt(I)C

    .line 167
    .line 168
    .line 169
    move-result v15

    .line 170
    move/from16 v19, v15

    .line 171
    .line 172
    invoke-static {v14}, Lhj/n$a;->b(Lhj/n$a;)I

    .line 173
    .line 174
    .line 175
    move-result v15

    .line 176
    if-gt v15, v3, :cond_1a

    .line 177
    .line 178
    invoke-static {v14}, Lhj/n$a;->c(Lhj/n$a;)I

    .line 179
    .line 180
    .line 181
    move-result v15

    .line 182
    if-gt v15, v3, :cond_7

    .line 183
    .line 184
    goto/16 :goto_10

    .line 185
    .line 186
    :cond_7
    invoke-static {v1, v0, v12, v10, v8}, Lhj/m;->n(Ljava/lang/CharSequence;ILjava/lang/CharSequence;ZZ)I

    .line 187
    .line 188
    .line 189
    move-result v3

    .line 190
    const/4 v15, -0x1

    .line 191
    if-ne v3, v15, :cond_b

    .line 192
    .line 193
    invoke-static {v1, v0, v13, v10, v8}, Lhj/m;->n(Ljava/lang/CharSequence;ILjava/lang/CharSequence;ZZ)I

    .line 194
    .line 195
    .line 196
    move-result v3

    .line 197
    if-ne v3, v15, :cond_a

    .line 198
    .line 199
    if-eqz v9, :cond_8

    .line 200
    .line 201
    goto :goto_7

    .line 202
    :cond_8
    invoke-static {v1, v5, v6, v7, v10}, Lhj/n;->m(Ljava/lang/CharSequence;IILjava/util/Locale;Z)I

    .line 203
    .line 204
    .line 205
    move-result v16

    .line 206
    :goto_7
    if-lez v16, :cond_9

    .line 207
    .line 208
    sget-object v0, Lhj/b0;->l:Lhj/b0;

    .line 209
    .line 210
    sget-object v1, Lnet/time4j/tz/p;->u:Lnet/time4j/tz/p;

    .line 211
    .line 212
    invoke-virtual {v4, v0, v1}, Lhj/t;->I(Lfj/p;Ljava/lang/Object;)V

    .line 213
    .line 214
    .line 215
    add-int v6, v6, v16

    .line 216
    .line 217
    invoke-virtual {v2, v6}, Lhj/s;->l(I)V

    .line 218
    .line 219
    .line 220
    return-void

    .line 221
    :cond_9
    const-string v0, "Missing sign in localized time zone offset."

    .line 222
    .line 223
    invoke-virtual {v2, v6, v0}, Lhj/s;->k(ILjava/lang/String;)V

    .line 224
    .line 225
    .line 226
    return-void

    .line 227
    :cond_a
    sget-object v18, Lnet/time4j/tz/f;->k:Lnet/time4j/tz/f;

    .line 228
    .line 229
    goto :goto_8

    .line 230
    :cond_b
    sget-object v18, Lnet/time4j/tz/f;->l:Lnet/time4j/tz/f;

    .line 231
    .line 232
    :goto_8
    move-object/from16 v15, v18

    .line 233
    .line 234
    add-int/2addr v0, v3

    .line 235
    invoke-static {v1, v0, v11}, Lhj/n;->k(Ljava/lang/CharSequence;IC)I

    .line 236
    .line 237
    .line 238
    move-result v3

    .line 239
    move-object/from16 v20, v12

    .line 240
    .line 241
    const/16 v12, -0x3e8

    .line 242
    .line 243
    if-ne v3, v12, :cond_c

    .line 244
    .line 245
    const-string v1, "Missing hour part in localized time zone offset."

    .line 246
    .line 247
    invoke-virtual {v2, v0, v1}, Lhj/s;->k(ILjava/lang/String;)V

    .line 248
    .line 249
    .line 250
    return-void

    .line 251
    :cond_c
    if-gez v3, :cond_d

    .line 252
    .line 253
    not-int v3, v3

    .line 254
    add-int/lit8 v0, v0, 0x1

    .line 255
    .line 256
    goto :goto_9

    .line 257
    :cond_d
    add-int/lit8 v0, v0, 0x2

    .line 258
    .line 259
    :goto_9
    if-lt v0, v5, :cond_f

    .line 260
    .line 261
    move-object/from16 v12, p0

    .line 262
    .line 263
    iget-boolean v1, v12, Lhj/n;->k:Z

    .line 264
    .line 265
    if-eqz v1, :cond_e

    .line 266
    .line 267
    sget-object v1, Lhj/b0;->l:Lhj/b0;

    .line 268
    .line 269
    invoke-static {v15, v3}, Lnet/time4j/tz/p;->p(Lnet/time4j/tz/f;I)Lnet/time4j/tz/p;

    .line 270
    .line 271
    .line 272
    move-result-object v3

    .line 273
    invoke-virtual {v4, v1, v3}, Lhj/t;->I(Lfj/p;Ljava/lang/Object;)V

    .line 274
    .line 275
    .line 276
    invoke-virtual {v2, v0}, Lhj/s;->l(I)V

    .line 277
    .line 278
    .line 279
    goto :goto_a

    .line 280
    :cond_e
    const-string v1, "Missing minute part in localized time zone offset."

    .line 281
    .line 282
    invoke-virtual {v2, v0, v1}, Lhj/s;->k(ILjava/lang/String;)V

    .line 283
    .line 284
    .line 285
    :goto_a
    return-void

    .line 286
    :cond_f
    move-object/from16 v12, p0

    .line 287
    .line 288
    move-object/from16 v21, v13

    .line 289
    .line 290
    if-eqz p5, :cond_10

    .line 291
    .line 292
    iget-object v13, v12, Lhj/n;->r:Lgj/g;

    .line 293
    .line 294
    move/from16 v22, v6

    .line 295
    .line 296
    move-object/from16 v23, v7

    .line 297
    .line 298
    move-object/from16 v7, p3

    .line 299
    .line 300
    goto :goto_b

    .line 301
    :cond_10
    sget-object v13, Lgj/a;->f:Lfj/c;

    .line 302
    .line 303
    move/from16 v22, v6

    .line 304
    .line 305
    sget-object v6, Lgj/g;->l:Lgj/g;

    .line 306
    .line 307
    move-object/from16 v23, v7

    .line 308
    .line 309
    move-object/from16 v7, p3

    .line 310
    .line 311
    invoke-interface {v7, v13, v6}, Lfj/d;->a(Lfj/c;Ljava/lang/Object;)Ljava/lang/Object;

    .line 312
    .line 313
    .line 314
    move-result-object v6

    .line 315
    move-object v13, v6

    .line 316
    check-cast v13, Lgj/g;

    .line 317
    .line 318
    :goto_b
    invoke-static {v14}, Lhj/n$a;->d(Lhj/n$a;)Ljava/lang/String;

    .line 319
    .line 320
    .line 321
    move-result-object v6

    .line 322
    invoke-static {v1, v0, v6, v10, v8}, Lhj/m;->n(Ljava/lang/CharSequence;ILjava/lang/CharSequence;ZZ)I

    .line 323
    .line 324
    .line 325
    move-result v6

    .line 326
    const/4 v7, -0x1

    .line 327
    if-eq v6, v7, :cond_11

    .line 328
    .line 329
    add-int/2addr v0, v6

    .line 330
    goto :goto_c

    .line 331
    :cond_11
    iget-boolean v6, v12, Lhj/n;->k:Z

    .line 332
    .line 333
    if-eqz v6, :cond_12

    .line 334
    .line 335
    sget-object v1, Lhj/b0;->l:Lhj/b0;

    .line 336
    .line 337
    invoke-static {v15, v3}, Lnet/time4j/tz/p;->p(Lnet/time4j/tz/f;I)Lnet/time4j/tz/p;

    .line 338
    .line 339
    .line 340
    move-result-object v3

    .line 341
    invoke-virtual {v4, v1, v3}, Lhj/t;->I(Lfj/p;Ljava/lang/Object;)V

    .line 342
    .line 343
    .line 344
    invoke-virtual {v2, v0}, Lhj/s;->l(I)V

    .line 345
    .line 346
    .line 347
    return-void

    .line 348
    :cond_12
    invoke-virtual {v13}, Lgj/g;->c()Z

    .line 349
    .line 350
    .line 351
    move-result v6

    .line 352
    if-eqz v6, :cond_13

    .line 353
    .line 354
    const-string v1, "Mismatch of localized time zone offset separator."

    .line 355
    .line 356
    invoke-virtual {v2, v0, v1}, Lhj/s;->k(ILjava/lang/String;)V

    .line 357
    .line 358
    .line 359
    return-void

    .line 360
    :cond_13
    :goto_c
    invoke-static {v1, v0, v11}, Lhj/n;->l(Ljava/lang/CharSequence;IC)I

    .line 361
    .line 362
    .line 363
    move-result v6

    .line 364
    const/16 v7, -0x3e8

    .line 365
    .line 366
    if-ne v6, v7, :cond_14

    .line 367
    .line 368
    const-string v1, "Minute part in localized time zone offset does not match expected pattern mm."

    .line 369
    .line 370
    invoke-virtual {v2, v0, v1}, Lhj/s;->k(ILjava/lang/String;)V

    .line 371
    .line 372
    .line 373
    return-void

    .line 374
    :cond_14
    add-int/lit8 v0, v0, 0x2

    .line 375
    .line 376
    if-ge v0, v5, :cond_16

    .line 377
    .line 378
    invoke-static {v14}, Lhj/n$a;->d(Lhj/n$a;)Ljava/lang/String;

    .line 379
    .line 380
    .line 381
    move-result-object v7

    .line 382
    invoke-static {v1, v0, v7, v10, v8}, Lhj/m;->n(Ljava/lang/CharSequence;ILjava/lang/CharSequence;ZZ)I

    .line 383
    .line 384
    .line 385
    move-result v7

    .line 386
    const/4 v13, -0x1

    .line 387
    if-eq v7, v13, :cond_16

    .line 388
    .line 389
    add-int/2addr v0, v7

    .line 390
    invoke-static {v1, v0, v11}, Lhj/n;->l(Ljava/lang/CharSequence;IC)I

    .line 391
    .line 392
    .line 393
    move-result v13

    .line 394
    move/from16 v24, v8

    .line 395
    .line 396
    const/16 v8, -0x3e8

    .line 397
    .line 398
    if-ne v13, v8, :cond_15

    .line 399
    .line 400
    sub-int/2addr v0, v7

    .line 401
    goto :goto_d

    .line 402
    :cond_15
    add-int/lit8 v0, v0, 0x2

    .line 403
    .line 404
    goto :goto_d

    .line 405
    :cond_16
    move/from16 v24, v8

    .line 406
    .line 407
    const/16 v8, -0x3e8

    .line 408
    .line 409
    move/from16 v13, v16

    .line 410
    .line 411
    :goto_d
    if-eqz v13, :cond_19

    .line 412
    .line 413
    if-ne v13, v8, :cond_17

    .line 414
    .line 415
    goto :goto_e

    .line 416
    :cond_17
    mul-int/lit16 v3, v3, 0xe10

    .line 417
    .line 418
    mul-int/lit8 v6, v6, 0x3c

    .line 419
    .line 420
    add-int/2addr v3, v6

    .line 421
    add-int/2addr v3, v13

    .line 422
    sget-object v6, Lnet/time4j/tz/f;->k:Lnet/time4j/tz/f;

    .line 423
    .line 424
    if-ne v15, v6, :cond_18

    .line 425
    .line 426
    neg-int v3, v3

    .line 427
    :cond_18
    invoke-static {v3}, Lnet/time4j/tz/p;->r(I)Lnet/time4j/tz/p;

    .line 428
    .line 429
    .line 430
    move-result-object v3

    .line 431
    goto :goto_f

    .line 432
    :cond_19
    :goto_e
    invoke-static {v15, v3, v6}, Lnet/time4j/tz/p;->q(Lnet/time4j/tz/f;II)Lnet/time4j/tz/p;

    .line 433
    .line 434
    .line 435
    move-result-object v3

    .line 436
    :goto_f
    invoke-static {v14}, Lhj/n$a;->c(Lhj/n$a;)I

    .line 437
    .line 438
    .line 439
    move-result v6

    .line 440
    add-int/lit8 v6, v6, -0x1

    .line 441
    .line 442
    move-object/from16 v18, v3

    .line 443
    .line 444
    move v3, v6

    .line 445
    goto :goto_13

    .line 446
    :cond_1a
    :goto_10
    move/from16 v22, v6

    .line 447
    .line 448
    move-object/from16 v23, v7

    .line 449
    .line 450
    move/from16 v24, v8

    .line 451
    .line 452
    move-object/from16 v20, v12

    .line 453
    .line 454
    move-object/from16 v21, v13

    .line 455
    .line 456
    move-object/from16 v12, p0

    .line 457
    .line 458
    if-nez v9, :cond_20

    .line 459
    .line 460
    if-ge v0, v5, :cond_1b

    .line 461
    .line 462
    invoke-interface {v1, v0}, Ljava/lang/CharSequence;->charAt(I)C

    .line 463
    .line 464
    .line 465
    move-result v6

    .line 466
    goto :goto_11

    .line 467
    :cond_1b
    move/from16 v6, v16

    .line 468
    .line 469
    :goto_11
    move/from16 v7, v19

    .line 470
    .line 471
    if-nez v10, :cond_1c

    .line 472
    .line 473
    if-eq v7, v6, :cond_1d

    .line 474
    .line 475
    :cond_1c
    if-eqz v10, :cond_1e

    .line 476
    .line 477
    invoke-static {v7, v6}, Lhj/n;->a(CC)Z

    .line 478
    .line 479
    .line 480
    move-result v6

    .line 481
    if-eqz v6, :cond_1e

    .line 482
    .line 483
    :cond_1d
    add-int/lit8 v0, v0, 0x1

    .line 484
    .line 485
    goto :goto_13

    .line 486
    :cond_1e
    move/from16 v6, v22

    .line 487
    .line 488
    move-object/from16 v7, v23

    .line 489
    .line 490
    invoke-static {v1, v5, v6, v7, v10}, Lhj/n;->m(Ljava/lang/CharSequence;IILjava/util/Locale;Z)I

    .line 491
    .line 492
    .line 493
    move-result v0

    .line 494
    if-lez v0, :cond_1f

    .line 495
    .line 496
    sget-object v1, Lhj/b0;->l:Lhj/b0;

    .line 497
    .line 498
    sget-object v3, Lnet/time4j/tz/p;->u:Lnet/time4j/tz/p;

    .line 499
    .line 500
    invoke-virtual {v4, v1, v3}, Lhj/t;->I(Lfj/p;Ljava/lang/Object;)V

    .line 501
    .line 502
    .line 503
    add-int/2addr v6, v0

    .line 504
    invoke-virtual {v2, v6}, Lhj/s;->l(I)V

    .line 505
    .line 506
    .line 507
    goto :goto_12

    .line 508
    :cond_1f
    const-string v0, "Literal mismatched in localized time zone offset."

    .line 509
    .line 510
    invoke-virtual {v2, v6, v0}, Lhj/s;->k(ILjava/lang/String;)V

    .line 511
    .line 512
    .line 513
    :goto_12
    return-void

    .line 514
    :cond_20
    :goto_13
    move/from16 v6, v22

    .line 515
    .line 516
    move-object/from16 v7, v23

    .line 517
    .line 518
    add-int/lit8 v3, v3, 0x1

    .line 519
    .line 520
    move/from16 v15, v17

    .line 521
    .line 522
    move-object/from16 v12, v20

    .line 523
    .line 524
    move-object/from16 v13, v21

    .line 525
    .line 526
    move/from16 v8, v24

    .line 527
    .line 528
    goto/16 :goto_6

    .line 529
    .line 530
    :cond_21
    move-object/from16 v12, p0

    .line 531
    .line 532
    move-object/from16 v3, v18

    .line 533
    .line 534
    if-nez v3, :cond_22

    .line 535
    .line 536
    const-string v1, "Unable to determine localized time zone offset."

    .line 537
    .line 538
    invoke-virtual {v2, v0, v1}, Lhj/s;->k(ILjava/lang/String;)V

    .line 539
    .line 540
    .line 541
    goto :goto_14

    .line 542
    :cond_22
    sget-object v1, Lhj/b0;->l:Lhj/b0;

    .line 543
    .line 544
    invoke-virtual {v4, v1, v3}, Lhj/t;->I(Lfj/p;Ljava/lang/Object;)V

    .line 545
    .line 546
    .line 547
    invoke-virtual {v2, v0}, Lhj/s;->l(I)V

    .line 548
    .line 549
    .line 550
    :goto_14
    return-void
.end method

.method public j(Lhj/c;Lfj/d;I)Lhj/h;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lhj/c<",
            "*>;",
            "Lfj/d;",
            "I)",
            "Lhj/h<",
            "Lnet/time4j/tz/k;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance p1, Lhj/n;

    .line 2
    .line 3
    iget-boolean v1, p0, Lhj/n;->k:Z

    .line 4
    .line 5
    sget-object p3, Lgj/a;->i:Lfj/c;

    .line 6
    .line 7
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 8
    .line 9
    invoke-interface {p2, p3, v0}, Lfj/d;->a(Lfj/c;Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p3

    .line 13
    check-cast p3, Ljava/lang/Boolean;

    .line 14
    .line 15
    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    sget-object p3, Lgj/a;->n:Lfj/c;

    .line 20
    .line 21
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 22
    .line 23
    invoke-interface {p2, p3, v0}, Lfj/d;->a(Lfj/c;Ljava/lang/Object;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object p3

    .line 27
    check-cast p3, Ljava/lang/Boolean;

    .line 28
    .line 29
    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 30
    .line 31
    .line 32
    move-result v3

    .line 33
    sget-object p3, Lgj/a;->c:Lfj/c;

    .line 34
    .line 35
    sget-object v0, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 36
    .line 37
    invoke-interface {p2, p3, v0}, Lfj/d;->a(Lfj/c;Ljava/lang/Object;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object p3

    .line 41
    move-object v4, p3

    .line 42
    check-cast v4, Ljava/util/Locale;

    .line 43
    .line 44
    sget-object p3, Lhj/b;->g:Lfj/c;

    .line 45
    .line 46
    const-string v0, "+"

    .line 47
    .line 48
    invoke-interface {p2, p3, v0}, Lfj/d;->a(Lfj/c;Ljava/lang/Object;)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object p3

    .line 52
    move-object v5, p3

    .line 53
    check-cast v5, Ljava/lang/String;

    .line 54
    .line 55
    sget-object p3, Lhj/b;->h:Lfj/c;

    .line 56
    .line 57
    const-string v0, "-"

    .line 58
    .line 59
    invoke-interface {p2, p3, v0}, Lfj/d;->a(Lfj/c;Ljava/lang/Object;)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object p3

    .line 63
    move-object v6, p3

    .line 64
    check-cast v6, Ljava/lang/String;

    .line 65
    .line 66
    sget-object p3, Lgj/a;->m:Lfj/c;

    .line 67
    .line 68
    const/16 v0, 0x30

    .line 69
    .line 70
    invoke-static {v0}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    invoke-interface {p2, p3, v0}, Lfj/d;->a(Lfj/c;Ljava/lang/Object;)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object p3

    .line 78
    check-cast p3, Ljava/lang/Character;

    .line 79
    .line 80
    invoke-virtual {p3}, Ljava/lang/Character;->charValue()C

    .line 81
    .line 82
    .line 83
    move-result v7

    .line 84
    sget-object p3, Lgj/a;->f:Lfj/c;

    .line 85
    .line 86
    sget-object v0, Lgj/g;->l:Lgj/g;

    .line 87
    .line 88
    invoke-interface {p2, p3, v0}, Lfj/d;->a(Lfj/c;Ljava/lang/Object;)Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object p2

    .line 92
    move-object v8, p2

    .line 93
    check-cast v8, Lgj/g;

    .line 94
    .line 95
    move-object v0, p1

    .line 96
    invoke-direct/range {v0 .. v8}, Lhj/n;-><init>(ZZZLjava/util/Locale;Ljava/lang/String;Ljava/lang/String;CLgj/g;)V

    .line 97
    .line 98
    .line 99
    return-object p1
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

.method public toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const/16 v1, 0x40

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 6
    .line 7
    .line 8
    const-class v1, Lhj/n;

    .line 9
    .line 10
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    const-string v1, "[abbreviated="

    .line 18
    .line 19
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    iget-boolean v1, p0, Lhj/n;->k:Z

    .line 23
    .line 24
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    const/16 v1, 0x5d

    .line 28
    .line 29
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    return-object v0
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
