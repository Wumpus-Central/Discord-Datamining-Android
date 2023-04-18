.class public final Lqa/i;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Lqa/d;

.field private static volatile b:Lqa/d;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lqa/f;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lqa/f;-><init>(Lqa/e;)V

    sput-object v0, Lqa/i;->a:Lqa/d;

    sput-object v0, Lqa/i;->b:Lqa/d;

    return-void
.end method

.method public static a()Lqa/d;
    .locals 1

    sget-object v0, Lqa/i;->b:Lqa/d;

    return-object v0
.end method
