.class public final Lw9/q;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static b:Lw9/q;

.field private static final c:Lw9/r;


# instance fields
.field private a:Lw9/r;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    new-instance v6, Lw9/r;

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, Lw9/r;-><init>(IZZII)V

    sput-object v6, Lw9/q;->c:Lw9/r;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static declared-synchronized b()Lw9/q;
    .locals 2

    const-class v0, Lw9/q;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lw9/q;->b:Lw9/q;

    if-nez v1, :cond_0

    new-instance v1, Lw9/q;

    invoke-direct {v1}, Lw9/q;-><init>()V

    sput-object v1, Lw9/q;->b:Lw9/q;

    :cond_0
    sget-object v1, Lw9/q;->b:Lw9/q;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    monitor-exit v0

    throw v1
.end method


# virtual methods
.method public a()Lw9/r;
    .locals 1

    iget-object v0, p0, Lw9/q;->a:Lw9/r;

    return-object v0
.end method

.method public final declared-synchronized c(Lw9/r;)V
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    if-nez p1, :cond_0

    .line 3
    .line 4
    :try_start_0
    sget-object p1, Lw9/q;->c:Lw9/r;

    .line 5
    .line 6
    iput-object p1, p0, Lw9/q;->a:Lw9/r;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 7
    .line 8
    monitor-exit p0

    .line 9
    return-void

    .line 10
    :cond_0
    :try_start_1
    iget-object v0, p0, Lw9/q;->a:Lw9/r;

    .line 11
    .line 12
    if-eqz v0, :cond_2

    .line 13
    .line 14
    invoke-virtual {v0}, Lw9/r;->I()I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    invoke-virtual {p1}, Lw9/r;->I()I

    .line 19
    .line 20
    .line 21
    move-result v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 22
    if-ge v0, v1, :cond_1

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_1
    monitor-exit p0

    .line 26
    return-void

    .line 27
    :cond_2
    :goto_0
    :try_start_2
    iput-object p1, p0, Lw9/q;->a:Lw9/r;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 28
    .line 29
    monitor-exit p0

    .line 30
    return-void

    .line 31
    :catchall_0
    move-exception p1

    .line 32
    monitor-exit p0

    .line 33
    throw p1
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
.end method
