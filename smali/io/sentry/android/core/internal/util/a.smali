.class public final Lio/sentry/android/core/internal/util/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/sentry/transport/o;


# static fields
.field private static final a:Lio/sentry/transport/o;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lio/sentry/android/core/internal/util/a;

    invoke-direct {v0}, Lio/sentry/android/core/internal/util/a;-><init>()V

    sput-object v0, Lio/sentry/android/core/internal/util/a;->a:Lio/sentry/transport/o;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static b()Lio/sentry/transport/o;
    .locals 1

    sget-object v0, Lio/sentry/android/core/internal/util/a;->a:Lio/sentry/transport/o;

    return-object v0
.end method


# virtual methods
.method public a()J
    .locals 2

    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v0

    return-wide v0
.end method
