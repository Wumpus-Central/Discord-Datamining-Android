.class public final enum Lrf/a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lrf/a;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u0006\u0008\u0081\u0001\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003j\u0002\u0008\u0004j\u0002\u0008\u0005j\u0002\u0008\u0006\u00a8\u0006\u0007"
    }
    d2 = {
        "Lrf/a;",
        "",
        "<init>",
        "(Ljava/lang/String;I)V",
        "k",
        "l",
        "m",
        "kotlin-stdlib"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final enum k:Lrf/a;

.field public static final enum l:Lrf/a;

.field public static final enum m:Lrf/a;

.field private static final synthetic n:[Lrf/a;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lrf/a;

    const-string v1, "COROUTINE_SUSPENDED"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lrf/a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lrf/a;->k:Lrf/a;

    new-instance v0, Lrf/a;

    const-string v1, "UNDECIDED"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lrf/a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lrf/a;->l:Lrf/a;

    new-instance v0, Lrf/a;

    const-string v1, "RESUMED"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lrf/a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lrf/a;->m:Lrf/a;

    invoke-static {}, Lrf/a;->a()[Lrf/a;

    move-result-object v0

    sput-object v0, Lrf/a;->n:[Lrf/a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method private static final synthetic a()[Lrf/a;
    .locals 3

    const/4 v0, 0x3

    new-array v0, v0, [Lrf/a;

    const/4 v1, 0x0

    sget-object v2, Lrf/a;->k:Lrf/a;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, Lrf/a;->l:Lrf/a;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    sget-object v2, Lrf/a;->m:Lrf/a;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lrf/a;
    .locals 1

    const-class v0, Lrf/a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lrf/a;

    return-object p0
.end method

.method public static values()[Lrf/a;
    .locals 1

    sget-object v0, Lrf/a;->n:[Lrf/a;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lrf/a;

    return-object v0
.end method
