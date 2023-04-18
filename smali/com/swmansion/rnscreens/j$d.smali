.class public final enum Lcom/swmansion/rnscreens/j$d;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/swmansion/rnscreens/j;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "d"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/swmansion/rnscreens/j$d;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u0006\u0008\u0086\u0001\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003j\u0002\u0008\u0004j\u0002\u0008\u0005j\u0002\u0008\u0006\u00a8\u0006\u0007"
    }
    d2 = {
        "Lcom/swmansion/rnscreens/j$d;",
        "",
        "<init>",
        "(Ljava/lang/String;I)V",
        "k",
        "l",
        "m",
        "react-native-screens_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final enum k:Lcom/swmansion/rnscreens/j$d;

.field public static final enum l:Lcom/swmansion/rnscreens/j$d;

.field public static final enum m:Lcom/swmansion/rnscreens/j$d;

.field private static final synthetic n:[Lcom/swmansion/rnscreens/j$d;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/swmansion/rnscreens/j$d;

    const-string v1, "PUSH"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/swmansion/rnscreens/j$d;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/swmansion/rnscreens/j$d;->k:Lcom/swmansion/rnscreens/j$d;

    new-instance v0, Lcom/swmansion/rnscreens/j$d;

    const-string v1, "MODAL"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lcom/swmansion/rnscreens/j$d;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/swmansion/rnscreens/j$d;->l:Lcom/swmansion/rnscreens/j$d;

    new-instance v0, Lcom/swmansion/rnscreens/j$d;

    const-string v1, "TRANSPARENT_MODAL"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lcom/swmansion/rnscreens/j$d;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/swmansion/rnscreens/j$d;->m:Lcom/swmansion/rnscreens/j$d;

    invoke-static {}, Lcom/swmansion/rnscreens/j$d;->a()[Lcom/swmansion/rnscreens/j$d;

    move-result-object v0

    sput-object v0, Lcom/swmansion/rnscreens/j$d;->n:[Lcom/swmansion/rnscreens/j$d;

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

.method private static final synthetic a()[Lcom/swmansion/rnscreens/j$d;
    .locals 3

    const/4 v0, 0x3

    new-array v0, v0, [Lcom/swmansion/rnscreens/j$d;

    const/4 v1, 0x0

    sget-object v2, Lcom/swmansion/rnscreens/j$d;->k:Lcom/swmansion/rnscreens/j$d;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, Lcom/swmansion/rnscreens/j$d;->l:Lcom/swmansion/rnscreens/j$d;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    sget-object v2, Lcom/swmansion/rnscreens/j$d;->m:Lcom/swmansion/rnscreens/j$d;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/swmansion/rnscreens/j$d;
    .locals 1

    const-class v0, Lcom/swmansion/rnscreens/j$d;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/swmansion/rnscreens/j$d;

    return-object p0
.end method

.method public static values()[Lcom/swmansion/rnscreens/j$d;
    .locals 1

    sget-object v0, Lcom/swmansion/rnscreens/j$d;->n:[Lcom/swmansion/rnscreens/j$d;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/swmansion/rnscreens/j$d;

    return-object v0
.end method
