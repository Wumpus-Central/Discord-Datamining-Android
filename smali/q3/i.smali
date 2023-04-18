.class public Lq3/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lp3/b;


# static fields
.field private static final i:Ljava/lang/Object;

.field private static j:Lq3/i;

.field private static k:I


# instance fields
.field private a:Lcom/facebook/cache/common/CacheKey;

.field private b:Ljava/lang/String;

.field private c:J

.field private d:J

.field private e:J

.field private f:Ljava/io/IOException;

.field private g:Lp3/c$a;

.field private h:Lq3/i;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lq3/i;->i:Ljava/lang/Object;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()Lq3/i;
    .locals 3

    .line 1
    sget-object v0, Lq3/i;->i:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    sget-object v1, Lq3/i;->j:Lq3/i;

    .line 5
    .line 6
    if-eqz v1, :cond_0

    .line 7
    .line 8
    iget-object v2, v1, Lq3/i;->h:Lq3/i;

    .line 9
    .line 10
    sput-object v2, Lq3/i;->j:Lq3/i;

    .line 11
    .line 12
    const/4 v2, 0x0

    .line 13
    iput-object v2, v1, Lq3/i;->h:Lq3/i;

    .line 14
    .line 15
    sget v2, Lq3/i;->k:I

    .line 16
    .line 17
    add-int/lit8 v2, v2, -0x1

    .line 18
    .line 19
    sput v2, Lq3/i;->k:I

    .line 20
    .line 21
    monitor-exit v0

    .line 22
    return-object v1

    .line 23
    :cond_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 24
    new-instance v0, Lq3/i;

    .line 25
    .line 26
    invoke-direct {v0}, Lq3/i;-><init>()V

    .line 27
    .line 28
    .line 29
    return-object v0

    .line 30
    :catchall_0
    move-exception v1

    .line 31
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 32
    throw v1
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
.end method

.method private c()V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lq3/i;->a:Lcom/facebook/cache/common/CacheKey;

    .line 3
    .line 4
    iput-object v0, p0, Lq3/i;->b:Ljava/lang/String;

    .line 5
    .line 6
    const-wide/16 v1, 0x0

    .line 7
    .line 8
    iput-wide v1, p0, Lq3/i;->c:J

    .line 9
    .line 10
    iput-wide v1, p0, Lq3/i;->d:J

    .line 11
    .line 12
    iput-wide v1, p0, Lq3/i;->e:J

    .line 13
    .line 14
    iput-object v0, p0, Lq3/i;->f:Ljava/io/IOException;

    .line 15
    .line 16
    iput-object v0, p0, Lq3/i;->g:Lp3/c$a;

    .line 17
    .line 18
    return-void
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
.end method


# virtual methods
.method public b()V
    .locals 3

    .line 1
    sget-object v0, Lq3/i;->i:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    sget v1, Lq3/i;->k:I

    .line 5
    .line 6
    const/4 v2, 0x5

    .line 7
    if-ge v1, v2, :cond_1

    .line 8
    .line 9
    invoke-direct {p0}, Lq3/i;->c()V

    .line 10
    .line 11
    .line 12
    sget v1, Lq3/i;->k:I

    .line 13
    .line 14
    add-int/lit8 v1, v1, 0x1

    .line 15
    .line 16
    sput v1, Lq3/i;->k:I

    .line 17
    .line 18
    sget-object v1, Lq3/i;->j:Lq3/i;

    .line 19
    .line 20
    if-eqz v1, :cond_0

    .line 21
    .line 22
    iput-object v1, p0, Lq3/i;->h:Lq3/i;

    .line 23
    .line 24
    :cond_0
    sput-object p0, Lq3/i;->j:Lq3/i;

    .line 25
    .line 26
    :cond_1
    monitor-exit v0

    .line 27
    return-void

    .line 28
    :catchall_0
    move-exception v1

    .line 29
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 30
    throw v1
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
.end method

.method public d(Lcom/facebook/cache/common/CacheKey;)Lq3/i;
    .locals 0

    iput-object p1, p0, Lq3/i;->a:Lcom/facebook/cache/common/CacheKey;

    return-object p0
.end method

.method public e(J)Lq3/i;
    .locals 0

    iput-wide p1, p0, Lq3/i;->d:J

    return-object p0
.end method

.method public f(J)Lq3/i;
    .locals 0

    iput-wide p1, p0, Lq3/i;->e:J

    return-object p0
.end method

.method public g(Lp3/c$a;)Lq3/i;
    .locals 0

    iput-object p1, p0, Lq3/i;->g:Lp3/c$a;

    return-object p0
.end method

.method public h(Ljava/io/IOException;)Lq3/i;
    .locals 0

    iput-object p1, p0, Lq3/i;->f:Ljava/io/IOException;

    return-object p0
.end method

.method public i(J)Lq3/i;
    .locals 0

    iput-wide p1, p0, Lq3/i;->c:J

    return-object p0
.end method

.method public j(Ljava/lang/String;)Lq3/i;
    .locals 0

    iput-object p1, p0, Lq3/i;->b:Ljava/lang/String;

    return-object p0
.end method
