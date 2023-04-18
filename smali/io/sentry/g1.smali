.class public final Lio/sentry/g1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/sentry/c0;


# static fields
.field private static final a:Lio/sentry/g1;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lio/sentry/g1;

    invoke-direct {v0}, Lio/sentry/g1;-><init>()V

    sput-object v0, Lio/sentry/g1;->a:Lio/sentry/g1;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static b()Lio/sentry/g1;
    .locals 1

    sget-object v0, Lio/sentry/g1;->a:Lio/sentry/g1;

    return-object v0
.end method


# virtual methods
.method public a(Ljava/io/InputStream;)Lio/sentry/q2;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method
