.class public final Lio/sentry/q1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/sentry/o0;


# static fields
.field private static final a:Lio/sentry/q1;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lio/sentry/q1;

    invoke-direct {v0}, Lio/sentry/q1;-><init>()V

    sput-object v0, Lio/sentry/q1;->a:Lio/sentry/q1;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static b()Lio/sentry/q1;
    .locals 1

    sget-object v0, Lio/sentry/q1;->a:Lio/sentry/q1;

    return-object v0
.end method


# virtual methods
.method public a(Lio/sentry/o3;Lio/sentry/y1;)Lio/sentry/transport/p;
    .locals 0

    invoke-static {}, Lio/sentry/transport/s;->b()Lio/sentry/transport/s;

    move-result-object p1

    return-object p1
.end method
