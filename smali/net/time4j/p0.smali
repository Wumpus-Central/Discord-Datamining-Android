.class public final Lnet/time4j/p0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lnet/time4j/base/e;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/time4j/p0$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lnet/time4j/base/e<",
        "Lnet/time4j/a0;",
        ">;"
    }
.end annotation


# static fields
.field private static final c:Lmj/e;

.field private static final d:Z

.field public static final e:Lnet/time4j/p0;

.field public static final f:Lnet/time4j/p0;


# instance fields
.field private final a:Z

.field private final b:J


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    const-string v0, "java.vm.name"

    .line 2
    .line 3
    invoke-static {v0}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {}, Lnet/time4j/base/d;->c()Lnet/time4j/base/d;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    const-class v2, Lmj/e;

    .line 12
    .line 13
    invoke-virtual {v1, v2}, Lnet/time4j/base/d;->g(Ljava/lang/Class;)Ljava/lang/Iterable;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    const/4 v3, 0x0

    .line 26
    if-eqz v2, :cond_1

    .line 27
    .line 28
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    check-cast v2, Lmj/e;

    .line 33
    .line 34
    invoke-interface {v2}, Lmj/e;->b()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v4

    .line 38
    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    move-result v4

    .line 42
    if-eqz v4, :cond_0

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_1
    move-object v2, v3

    .line 46
    :goto_0
    if-nez v2, :cond_2

    .line 47
    .line 48
    new-instance v2, Lnet/time4j/p0$b;

    .line 49
    .line 50
    invoke-direct {v2, v3}, Lnet/time4j/p0$b;-><init>(Lnet/time4j/p0$a;)V

    .line 51
    .line 52
    .line 53
    :cond_2
    sput-object v2, Lnet/time4j/p0;->c:Lmj/e;

    .line 54
    .line 55
    const-string v0, "net.time4j.systemclock.nanoTime"

    .line 56
    .line 57
    invoke-static {v0}, Ljava/lang/Boolean;->getBoolean(Ljava/lang/String;)Z

    .line 58
    .line 59
    .line 60
    move-result v0

    .line 61
    sput-boolean v0, Lnet/time4j/p0;->d:Z

    .line 62
    .line 63
    new-instance v0, Lnet/time4j/p0;

    .line 64
    .line 65
    const/4 v1, 0x0

    .line 66
    invoke-static {}, Lnet/time4j/p0;->a()J

    .line 67
    .line 68
    .line 69
    move-result-wide v2

    .line 70
    invoke-direct {v0, v1, v2, v3}, Lnet/time4j/p0;-><init>(ZJ)V

    .line 71
    .line 72
    .line 73
    sput-object v0, Lnet/time4j/p0;->e:Lnet/time4j/p0;

    .line 74
    .line 75
    new-instance v0, Lnet/time4j/p0;

    .line 76
    .line 77
    const/4 v1, 0x1

    .line 78
    invoke-static {}, Lnet/time4j/p0;->a()J

    .line 79
    .line 80
    .line 81
    move-result-wide v2

    .line 82
    invoke-direct {v0, v1, v2, v3}, Lnet/time4j/p0;-><init>(ZJ)V

    .line 83
    .line 84
    .line 85
    sput-object v0, Lnet/time4j/p0;->f:Lnet/time4j/p0;

    .line 86
    .line 87
    return-void
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

.method private constructor <init>(ZJ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-boolean p1, p0, Lnet/time4j/p0;->a:Z

    .line 5
    .line 6
    iput-wide p2, p0, Lnet/time4j/p0;->b:J

    .line 7
    .line 8
    return-void
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

.method private static a()J
    .locals 10

    .line 1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    const-wide/16 v2, 0x0

    .line 6
    .line 7
    const/4 v4, 0x0

    .line 8
    :goto_0
    const/16 v5, 0xa

    .line 9
    .line 10
    if-ge v4, v5, :cond_2

    .line 11
    .line 12
    sget-boolean v2, Lnet/time4j/p0;->d:Z

    .line 13
    .line 14
    if-eqz v2, :cond_0

    .line 15
    .line 16
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 17
    .line 18
    .line 19
    move-result-wide v2

    .line 20
    goto :goto_1

    .line 21
    :cond_0
    sget-object v2, Lnet/time4j/p0;->c:Lmj/e;

    .line 22
    .line 23
    invoke-interface {v2}, Lmj/e;->a()J

    .line 24
    .line 25
    .line 26
    move-result-wide v2

    .line 27
    :goto_1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 28
    .line 29
    .line 30
    move-result-wide v5

    .line 31
    cmp-long v7, v0, v5

    .line 32
    .line 33
    if-nez v7, :cond_1

    .line 34
    .line 35
    goto :goto_2

    .line 36
    :cond_1
    add-int/lit8 v4, v4, 0x1

    .line 37
    .line 38
    move-wide v0, v5

    .line 39
    goto :goto_0

    .line 40
    :cond_2
    :goto_2
    invoke-static {}, Lmj/d;->x()Lmj/d;

    .line 41
    .line 42
    .line 43
    move-result-object v4

    .line 44
    const/16 v5, 0x3e8

    .line 45
    .line 46
    invoke-static {v0, v1, v5}, Lnet/time4j/base/c;->b(JI)J

    .line 47
    .line 48
    .line 49
    move-result-wide v6

    .line 50
    invoke-virtual {v4, v6, v7}, Lmj/d;->r(J)J

    .line 51
    .line 52
    .line 53
    move-result-wide v6

    .line 54
    const-wide/32 v8, 0x3b9aca00

    .line 55
    .line 56
    .line 57
    invoke-static {v6, v7, v8, v9}, Lnet/time4j/base/c;->i(JJ)J

    .line 58
    .line 59
    .line 60
    move-result-wide v6

    .line 61
    invoke-static {v0, v1, v5}, Lnet/time4j/base/c;->d(JI)I

    .line 62
    .line 63
    .line 64
    move-result v0

    .line 65
    const v1, 0xf4240

    .line 66
    .line 67
    .line 68
    mul-int/2addr v0, v1

    .line 69
    int-to-long v0, v0

    .line 70
    add-long/2addr v6, v0

    .line 71
    invoke-static {v6, v7, v2, v3}, Lnet/time4j/base/c;->m(JJ)J

    .line 72
    .line 73
    .line 74
    move-result-wide v0

    .line 75
    return-wide v0
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

.method public static b()Lnet/time4j/a0;
    .locals 1

    sget-object v0, Lnet/time4j/p0;->e:Lnet/time4j/p0;

    invoke-virtual {v0}, Lnet/time4j/p0;->c()Lnet/time4j/a0;

    move-result-object v0

    return-object v0
.end method

.method private d()J
    .locals 4

    .line 1
    sget-boolean v0, Lnet/time4j/p0;->d:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 6
    .line 7
    .line 8
    move-result-wide v0

    .line 9
    goto :goto_0

    .line 10
    :cond_0
    sget-object v0, Lnet/time4j/p0;->c:Lmj/e;

    .line 11
    .line 12
    invoke-interface {v0}, Lmj/e;->a()J

    .line 13
    .line 14
    .line 15
    move-result-wide v0

    .line 16
    :goto_0
    iget-wide v2, p0, Lnet/time4j/p0;->b:J

    .line 17
    .line 18
    invoke-static {v0, v1, v2, v3}, Lnet/time4j/base/c;->f(JJ)J

    .line 19
    .line 20
    .line 21
    move-result-wide v0

    .line 22
    return-wide v0
    .line 23
    .line 24
.end method


# virtual methods
.method public c()Lnet/time4j/a0;
    .locals 5

    .line 1
    iget-boolean v0, p0, Lnet/time4j/p0;->a:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    sget-boolean v0, Lnet/time4j/p0;->d:Z

    .line 6
    .line 7
    if-eqz v0, :cond_1

    .line 8
    .line 9
    :cond_0
    invoke-static {}, Lmj/d;->x()Lmj/d;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {v0}, Lmj/d;->C()Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_1

    .line 18
    .line 19
    invoke-direct {p0}, Lnet/time4j/p0;->d()J

    .line 20
    .line 21
    .line 22
    move-result-wide v0

    .line 23
    const v2, 0x3b9aca00

    .line 24
    .line 25
    .line 26
    invoke-static {v0, v1, v2}, Lnet/time4j/base/c;->b(JI)J

    .line 27
    .line 28
    .line 29
    move-result-wide v3

    .line 30
    invoke-static {v0, v1, v2}, Lnet/time4j/base/c;->d(JI)I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    sget-object v1, Lmj/f;->l:Lmj/f;

    .line 35
    .line 36
    invoke-static {v3, v4, v0, v1}, Lnet/time4j/a0;->o0(JILmj/f;)Lnet/time4j/a0;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    return-object v0

    .line 41
    :cond_1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 42
    .line 43
    .line 44
    move-result-wide v0

    .line 45
    const/16 v2, 0x3e8

    .line 46
    .line 47
    invoke-static {v0, v1, v2}, Lnet/time4j/base/c;->b(JI)J

    .line 48
    .line 49
    .line 50
    move-result-wide v3

    .line 51
    invoke-static {v0, v1, v2}, Lnet/time4j/base/c;->d(JI)I

    .line 52
    .line 53
    .line 54
    move-result v0

    .line 55
    const v1, 0xf4240

    .line 56
    .line 57
    .line 58
    mul-int/2addr v0, v1

    .line 59
    sget-object v1, Lmj/f;->k:Lmj/f;

    .line 60
    .line 61
    invoke-static {v3, v4, v0, v1}, Lnet/time4j/a0;->o0(JILmj/f;)Lnet/time4j/a0;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    return-object v0
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
