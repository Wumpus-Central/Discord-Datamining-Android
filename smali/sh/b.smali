.class public final enum Lsh/b;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lsh/b;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum k:Lsh/b;

.field public static final enum l:Lsh/b;

.field public static final enum m:Lsh/b;

.field private static final synthetic n:[Lsh/b;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lsh/b;

    const-string v1, "WARNING"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lsh/b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lsh/b;->k:Lsh/b;

    new-instance v0, Lsh/b;

    const-string v1, "ERROR"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lsh/b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lsh/b;->l:Lsh/b;

    new-instance v0, Lsh/b;

    const-string v1, "HIDDEN"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lsh/b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lsh/b;->m:Lsh/b;

    invoke-static {}, Lsh/b;->a()[Lsh/b;

    move-result-object v0

    sput-object v0, Lsh/b;->n:[Lsh/b;

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

.method private static final synthetic a()[Lsh/b;
    .locals 3

    const/4 v0, 0x3

    new-array v0, v0, [Lsh/b;

    const/4 v1, 0x0

    sget-object v2, Lsh/b;->k:Lsh/b;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, Lsh/b;->l:Lsh/b;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    sget-object v2, Lsh/b;->m:Lsh/b;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lsh/b;
    .locals 1

    const-class v0, Lsh/b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lsh/b;

    return-object p0
.end method

.method public static values()[Lsh/b;
    .locals 1

    sget-object v0, Lsh/b;->n:[Lsh/b;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lsh/b;

    return-object v0
.end method
