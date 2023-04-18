.class final Lio/sentry/transport/a0$c;
.super Lio/sentry/transport/a0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/sentry/transport/a0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "c"
.end annotation


# static fields
.field static final a:Lio/sentry/transport/a0$c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lio/sentry/transport/a0$c;

    invoke-direct {v0}, Lio/sentry/transport/a0$c;-><init>()V

    sput-object v0, Lio/sentry/transport/a0$c;->a:Lio/sentry/transport/a0$c;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lio/sentry/transport/a0;-><init>(Lio/sentry/transport/a0$a;)V

    return-void
.end method


# virtual methods
.method public c()I
    .locals 1

    const/4 v0, -0x1

    return v0
.end method

.method public d()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method
