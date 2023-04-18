.class final enum Llg/i$a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Llg/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x401a
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Llg/i$a;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum k:Llg/i$a;

.field public static final enum l:Llg/i$a;

.field public static final enum m:Llg/i$a;

.field public static final enum n:Llg/i$a;

.field private static final synthetic o:[Llg/i$a;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Llg/i$a;

    const-string v1, "HIDDEN"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Llg/i$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Llg/i$a;->k:Llg/i$a;

    new-instance v0, Llg/i$a;

    const-string v1, "VISIBLE"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Llg/i$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Llg/i$a;->l:Llg/i$a;

    new-instance v0, Llg/i$a;

    const-string v1, "NOT_CONSIDERED"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Llg/i$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Llg/i$a;->m:Llg/i$a;

    new-instance v0, Llg/i$a;

    const-string v1, "DROP"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Llg/i$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Llg/i$a;->n:Llg/i$a;

    invoke-static {}, Llg/i$a;->a()[Llg/i$a;

    move-result-object v0

    sput-object v0, Llg/i$a;->o:[Llg/i$a;

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

.method private static final synthetic a()[Llg/i$a;
    .locals 3

    const/4 v0, 0x4

    new-array v0, v0, [Llg/i$a;

    const/4 v1, 0x0

    sget-object v2, Llg/i$a;->k:Llg/i$a;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, Llg/i$a;->l:Llg/i$a;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    sget-object v2, Llg/i$a;->m:Llg/i$a;

    aput-object v2, v0, v1

    const/4 v1, 0x3

    sget-object v2, Llg/i$a;->n:Llg/i$a;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Llg/i$a;
    .locals 1

    const-class v0, Llg/i$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Llg/i$a;

    return-object p0
.end method

.method public static values()[Llg/i$a;
    .locals 1

    sget-object v0, Llg/i$a;->o:[Llg/i$a;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Llg/i$a;

    return-object v0
.end method
