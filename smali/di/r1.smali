.class public final enum Ldi/r1;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Ldi/r1;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum k:Ldi/r1;

.field public static final enum l:Ldi/r1;

.field private static final synthetic m:[Ldi/r1;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Ldi/r1;

    const-string v1, "SUPERTYPE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ldi/r1;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ldi/r1;->k:Ldi/r1;

    new-instance v0, Ldi/r1;

    const-string v1, "COMMON"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Ldi/r1;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ldi/r1;->l:Ldi/r1;

    invoke-static {}, Ldi/r1;->a()[Ldi/r1;

    move-result-object v0

    sput-object v0, Ldi/r1;->m:[Ldi/r1;

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

.method private static final synthetic a()[Ldi/r1;
    .locals 3

    const/4 v0, 0x2

    new-array v0, v0, [Ldi/r1;

    const/4 v1, 0x0

    sget-object v2, Ldi/r1;->k:Ldi/r1;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, Ldi/r1;->l:Ldi/r1;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Ldi/r1;
    .locals 1

    const-class v0, Ldi/r1;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Ldi/r1;

    return-object p0
.end method

.method public static values()[Ldi/r1;
    .locals 1

    sget-object v0, Ldi/r1;->m:[Ldi/r1;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ldi/r1;

    return-object v0
.end method
