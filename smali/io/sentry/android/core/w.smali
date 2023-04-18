.class final Lio/sentry/android/core/w;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/sentry/transport/q;


# instance fields
.field private final a:Landroid/content/Context;

.field private final b:Lio/sentry/g0;


# direct methods
.method constructor <init>(Landroid/content/Context;Lio/sentry/g0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lio/sentry/android/core/w;->a:Landroid/content/Context;

    .line 5
    .line 6
    iput-object p2, p0, Lio/sentry/android/core/w;->b:Lio/sentry/g0;

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


# virtual methods
.method public a()Z
    .locals 2

    iget-object v0, p0, Lio/sentry/android/core/w;->a:Landroid/content/Context;

    iget-object v1, p0, Lio/sentry/android/core/w;->b:Lio/sentry/g0;

    invoke-static {v0, v1}, Lio/sentry/android/core/internal/util/b;->b(Landroid/content/Context;Lio/sentry/g0;)Lio/sentry/android/core/internal/util/b$a;

    move-result-object v0

    invoke-virtual {p0, v0}, Lio/sentry/android/core/w;->b(Lio/sentry/android/core/internal/util/b$a;)Z

    move-result v0

    return v0
.end method

.method b(Lio/sentry/android/core/internal/util/b$a;)Z
    .locals 2

    sget-object v0, Lio/sentry/android/core/w$a;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    const/4 v0, 0x1

    if-eq p1, v0, :cond_0

    const/4 v1, 0x2

    if-eq p1, v1, :cond_0

    const/4 v1, 0x3

    if-eq p1, v1, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    return v0
.end method
