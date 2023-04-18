.class public final Lma/d;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lt9/c;

.field public static final b:[Lt9/c;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lt9/c;

    const-string v1, "CLIENT_TELEMETRY"

    const-wide/16 v2, 0x1

    invoke-direct {v0, v1, v2, v3}, Lt9/c;-><init>(Ljava/lang/String;J)V

    sput-object v0, Lma/d;->a:Lt9/c;

    const/4 v1, 0x1

    new-array v1, v1, [Lt9/c;

    const/4 v2, 0x0

    aput-object v0, v1, v2

    sput-object v1, Lma/d;->b:[Lt9/c;

    return-void
.end method
