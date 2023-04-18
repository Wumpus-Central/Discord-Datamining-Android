.class public final Lna/e;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Lna/b;

.field private static volatile b:Lna/b;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lna/d;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lna/d;-><init>(Lna/c;)V

    sput-object v0, Lna/e;->a:Lna/b;

    sput-object v0, Lna/e;->b:Lna/b;

    return-void
.end method

.method public static a()Lna/b;
    .locals 1

    sget-object v0, Lna/e;->b:Lna/b;

    return-object v0
.end method
