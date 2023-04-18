.class public Lz5/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lz5/b$c;,
        Lz5/b$b;,
        Lz5/b$d;
    }
.end annotation


# static fields
.field public static final a:Lz5/b$b;

.field private static volatile b:Lz5/b$d;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lz5/b$c;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lz5/b$c;-><init>(Lz5/b$a;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lz5/b;->a:Lz5/b$b;

    .line 8
    .line 9
    sput-object v1, Lz5/b;->b:Lz5/b$d;

    .line 10
    .line 11
    return-void
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
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Ljava/lang/String;)V
    .locals 1

    invoke-static {}, Lz5/b;->c()Lz5/b$d;

    move-result-object v0

    invoke-interface {v0, p0}, Lz5/b$d;->a(Ljava/lang/String;)V

    return-void
.end method

.method public static b()V
    .locals 1

    invoke-static {}, Lz5/b;->c()Lz5/b$d;

    move-result-object v0

    invoke-interface {v0}, Lz5/b$d;->b()V

    return-void
.end method

.method private static c()Lz5/b$d;
    .locals 2

    .line 1
    sget-object v0, Lz5/b;->b:Lz5/b$d;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    const-class v0, Lz5/b;

    .line 6
    .line 7
    monitor-enter v0

    .line 8
    :try_start_0
    sget-object v1, Lz5/b;->b:Lz5/b$d;

    .line 9
    .line 10
    if-nez v1, :cond_0

    .line 11
    .line 12
    new-instance v1, Lz5/a;

    .line 13
    .line 14
    invoke-direct {v1}, Lz5/a;-><init>()V

    .line 15
    .line 16
    .line 17
    sput-object v1, Lz5/b;->b:Lz5/b$d;

    .line 18
    .line 19
    :cond_0
    monitor-exit v0

    .line 20
    goto :goto_0

    .line 21
    :catchall_0
    move-exception v1

    .line 22
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 23
    throw v1

    .line 24
    :cond_1
    :goto_0
    sget-object v0, Lz5/b;->b:Lz5/b$d;

    .line 25
    .line 26
    return-object v0
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

.method public static d()Z
    .locals 1

    invoke-static {}, Lz5/b;->c()Lz5/b$d;

    move-result-object v0

    invoke-interface {v0}, Lz5/b$d;->isTracing()Z

    move-result v0

    return v0
.end method
