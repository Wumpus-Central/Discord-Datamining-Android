.class final Lio/sentry/transport/l;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Lio/sentry/transport/l;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lio/sentry/transport/l;

    invoke-direct {v0}, Lio/sentry/transport/l;-><init>()V

    sput-object v0, Lio/sentry/transport/l;->a:Lio/sentry/transport/l;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()Lio/sentry/transport/l;
    .locals 1

    sget-object v0, Lio/sentry/transport/l;->a:Lio/sentry/transport/l;

    return-object v0
.end method


# virtual methods
.method public b(Ljava/net/Authenticator;)V
    .locals 0

    invoke-static {p1}, Ljava/net/Authenticator;->setDefault(Ljava/net/Authenticator;)V

    return-void
.end method
