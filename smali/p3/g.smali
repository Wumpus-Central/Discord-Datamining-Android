.class public Lp3/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lp3/c;


# static fields
.field private static a:Lp3/g;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static declared-synchronized i()Lp3/g;
    .locals 2

    .line 1
    const-class v0, Lp3/g;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    sget-object v1, Lp3/g;->a:Lp3/g;

    .line 5
    .line 6
    if-nez v1, :cond_0

    .line 7
    .line 8
    new-instance v1, Lp3/g;

    .line 9
    .line 10
    invoke-direct {v1}, Lp3/g;-><init>()V

    .line 11
    .line 12
    .line 13
    sput-object v1, Lp3/g;->a:Lp3/g;

    .line 14
    .line 15
    :cond_0
    sget-object v1, Lp3/g;->a:Lp3/g;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 16
    .line 17
    monitor-exit v0

    .line 18
    return-object v1

    .line 19
    :catchall_0
    move-exception v1

    .line 20
    monitor-exit v0

    .line 21
    throw v1
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
.method public a(Lp3/b;)V
    .locals 0

    return-void
.end method

.method public b(Lp3/b;)V
    .locals 0

    return-void
.end method

.method public c(Lp3/b;)V
    .locals 0

    return-void
.end method

.method public d()V
    .locals 0

    return-void
.end method

.method public e(Lp3/b;)V
    .locals 0

    return-void
.end method

.method public f(Lp3/b;)V
    .locals 0

    return-void
.end method

.method public g(Lp3/b;)V
    .locals 0

    return-void
.end method

.method public h(Lp3/b;)V
    .locals 0

    return-void
.end method
