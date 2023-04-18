.class public final Lio/sentry/internal/modules/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/sentry/internal/modules/a;


# static fields
.field private static final a:Lio/sentry/internal/modules/c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lio/sentry/internal/modules/c;

    invoke-direct {v0}, Lio/sentry/internal/modules/c;-><init>()V

    sput-object v0, Lio/sentry/internal/modules/c;->a:Lio/sentry/internal/modules/c;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static b()Lio/sentry/internal/modules/c;
    .locals 1

    sget-object v0, Lio/sentry/internal/modules/c;->a:Lio/sentry/internal/modules/c;

    return-object v0
.end method


# virtual methods
.method public a()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x0

    return-object v0
.end method
