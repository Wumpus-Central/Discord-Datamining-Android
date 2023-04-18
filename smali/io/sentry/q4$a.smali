.class public final Lio/sentry/q4$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/sentry/q4;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/sentry/q4;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field private static final a:Lio/sentry/q4$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lio/sentry/q4$a;

    invoke-direct {v0}, Lio/sentry/q4$a;-><init>()V

    sput-object v0, Lio/sentry/q4$a;->a:Lio/sentry/q4$a;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static c()Lio/sentry/q4;
    .locals 1

    sget-object v0, Lio/sentry/q4$a;->a:Lio/sentry/q4$a;

    return-object v0
.end method


# virtual methods
.method public a(Ljava/lang/Thread$UncaughtExceptionHandler;)V
    .locals 0

    invoke-static {p1}, Ljava/lang/Thread;->setDefaultUncaughtExceptionHandler(Ljava/lang/Thread$UncaughtExceptionHandler;)V

    return-void
.end method

.method public b()Ljava/lang/Thread$UncaughtExceptionHandler;
    .locals 1

    invoke-static {}, Ljava/lang/Thread;->getDefaultUncaughtExceptionHandler()Ljava/lang/Thread$UncaughtExceptionHandler;

    move-result-object v0

    return-object v0
.end method
