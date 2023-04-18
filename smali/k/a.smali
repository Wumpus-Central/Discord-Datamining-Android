.class public Lk/a;
.super Lk/d;
.source "SourceFile"


# static fields
.field private static volatile c:Lk/a;

.field private static final d:Ljava/util/concurrent/Executor;

.field private static final e:Ljava/util/concurrent/Executor;


# instance fields
.field private a:Lk/d;

.field private b:Lk/d;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lk/a$a;

    .line 2
    .line 3
    invoke-direct {v0}, Lk/a$a;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lk/a;->d:Ljava/util/concurrent/Executor;

    .line 7
    .line 8
    new-instance v0, Lk/a$b;

    .line 9
    .line 10
    invoke-direct {v0}, Lk/a$b;-><init>()V

    .line 11
    .line 12
    .line 13
    sput-object v0, Lk/a;->e:Ljava/util/concurrent/Executor;

    .line 14
    .line 15
    return-void
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
.end method

.method private constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lk/d;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lk/c;

    .line 5
    .line 6
    invoke-direct {v0}, Lk/c;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lk/a;->b:Lk/d;

    .line 10
    .line 11
    iput-object v0, p0, Lk/a;->a:Lk/d;

    .line 12
    .line 13
    return-void
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
.end method

.method public static d()Lk/a;
    .locals 2

    .line 1
    sget-object v0, Lk/a;->c:Lk/a;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    sget-object v0, Lk/a;->c:Lk/a;

    .line 6
    .line 7
    return-object v0

    .line 8
    :cond_0
    const-class v0, Lk/a;

    .line 9
    .line 10
    monitor-enter v0

    .line 11
    :try_start_0
    sget-object v1, Lk/a;->c:Lk/a;

    .line 12
    .line 13
    if-nez v1, :cond_1

    .line 14
    .line 15
    new-instance v1, Lk/a;

    .line 16
    .line 17
    invoke-direct {v1}, Lk/a;-><init>()V

    .line 18
    .line 19
    .line 20
    sput-object v1, Lk/a;->c:Lk/a;

    .line 21
    .line 22
    :cond_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 23
    sget-object v0, Lk/a;->c:Lk/a;

    .line 24
    .line 25
    return-object v0

    .line 26
    :catchall_0
    move-exception v1

    .line 27
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 28
    throw v1
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
.end method


# virtual methods
.method public a(Ljava/lang/Runnable;)V
    .locals 1

    iget-object v0, p0, Lk/a;->a:Lk/d;

    invoke-virtual {v0, p1}, Lk/d;->a(Ljava/lang/Runnable;)V

    return-void
.end method

.method public b()Z
    .locals 1

    iget-object v0, p0, Lk/a;->a:Lk/d;

    invoke-virtual {v0}, Lk/d;->b()Z

    move-result v0

    return v0
.end method

.method public c(Ljava/lang/Runnable;)V
    .locals 1

    iget-object v0, p0, Lk/a;->a:Lk/d;

    invoke-virtual {v0, p1}, Lk/d;->c(Ljava/lang/Runnable;)V

    return-void
.end method
