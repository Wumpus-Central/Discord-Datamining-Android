.class public final Lio/sentry/transport/t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/sentry/transport/q;


# static fields
.field private static final a:Lio/sentry/transport/t;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lio/sentry/transport/t;

    invoke-direct {v0}, Lio/sentry/transport/t;-><init>()V

    sput-object v0, Lio/sentry/transport/t;->a:Lio/sentry/transport/t;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static b()Lio/sentry/transport/t;
    .locals 1

    sget-object v0, Lio/sentry/transport/t;->a:Lio/sentry/transport/t;

    return-object v0
.end method


# virtual methods
.method public a()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method
