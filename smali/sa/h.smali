.class public final Lsa/h;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Lsa/e;

.field private static volatile b:Lsa/e;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lsa/g;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lsa/g;-><init>(Lsa/f;)V

    sput-object v0, Lsa/h;->a:Lsa/e;

    sput-object v0, Lsa/h;->b:Lsa/e;

    return-void
.end method

.method public static a()Lsa/e;
    .locals 1

    sget-object v0, Lsa/h;->b:Lsa/e;

    return-object v0
.end method
