.class final enum Ly0/m$b;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ly0/m;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4018
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Ly0/m$b;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum k:Ly0/m$b;

.field public static final enum l:Ly0/m$b;

.field public static final enum m:Ly0/m$b;

.field public static final enum n:Ly0/m$b;

.field private static final synthetic o:[Ly0/m$b;


# direct methods
.method static constructor <clinit>()V
    .locals 9

    new-instance v0, Ly0/m$b;

    const-string v1, "NONE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ly0/m$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ly0/m$b;->k:Ly0/m$b;

    new-instance v1, Ly0/m$b;

    const-string v3, "START"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, Ly0/m$b;-><init>(Ljava/lang/String;I)V

    sput-object v1, Ly0/m$b;->l:Ly0/m$b;

    new-instance v3, Ly0/m$b;

    const-string v5, "END"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6}, Ly0/m$b;-><init>(Ljava/lang/String;I)V

    sput-object v3, Ly0/m$b;->m:Ly0/m$b;

    new-instance v5, Ly0/m$b;

    const-string v7, "CENTER"

    const/4 v8, 0x3

    invoke-direct {v5, v7, v8}, Ly0/m$b;-><init>(Ljava/lang/String;I)V

    sput-object v5, Ly0/m$b;->n:Ly0/m$b;

    const/4 v7, 0x4

    new-array v7, v7, [Ly0/m$b;

    aput-object v0, v7, v2

    aput-object v1, v7, v4

    aput-object v3, v7, v6

    aput-object v5, v7, v8

    sput-object v7, Ly0/m$b;->o:[Ly0/m$b;

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

.method public static valueOf(Ljava/lang/String;)Ly0/m$b;
    .locals 1

    const-class v0, Ly0/m$b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Ly0/m$b;

    return-object p0
.end method

.method public static values()[Ly0/m$b;
    .locals 1

    sget-object v0, Ly0/m$b;->o:[Ly0/m$b;

    invoke-virtual {v0}, [Ly0/m$b;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ly0/m$b;

    return-object v0
.end method
