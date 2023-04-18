.class public final Lio/sentry/i1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/sentry/g0;


# static fields
.field private static final a:Lio/sentry/i1;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lio/sentry/i1;

    invoke-direct {v0}, Lio/sentry/i1;-><init>()V

    sput-object v0, Lio/sentry/i1;->a:Lio/sentry/i1;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static e()Lio/sentry/i1;
    .locals 1

    sget-object v0, Lio/sentry/i1;->a:Lio/sentry/i1;

    return-object v0
.end method


# virtual methods
.method public varargs a(Lio/sentry/n3;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 0

    return-void
.end method

.method public b(Lio/sentry/n3;Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 0

    return-void
.end method

.method public varargs c(Lio/sentry/n3;Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 0

    return-void
.end method

.method public d(Lio/sentry/n3;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method
