.class final Lio/sentry/android/core/m0$b;
.super Lio/sentry/android/core/m0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/sentry/android/core/m0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "b"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lio/sentry/android/core/m0;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lio/sentry/android/core/m0$a;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Lio/sentry/android/core/m0$b;-><init>()V

    return-void
.end method


# virtual methods
.method protected i(Lio/sentry/o3;)Ljava/lang/String;
    .locals 0

    invoke-virtual {p1}, Lio/sentry/o3;->getOutboxPath()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method
