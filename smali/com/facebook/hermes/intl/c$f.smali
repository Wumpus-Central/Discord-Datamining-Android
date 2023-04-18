.class public final enum Lcom/facebook/hermes/intl/c$f;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/hermes/intl/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "f"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/facebook/hermes/intl/c$f;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum k:Lcom/facebook/hermes/intl/c$f;

.field public static final enum l:Lcom/facebook/hermes/intl/c$f;

.field public static final enum m:Lcom/facebook/hermes/intl/c$f;

.field private static final synthetic n:[Lcom/facebook/hermes/intl/c$f;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 1
    new-instance v0, Lcom/facebook/hermes/intl/c$f;

    .line 2
    .line 3
    const-string v1, "SIGNIFICANT_DIGITS"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2}, Lcom/facebook/hermes/intl/c$f;-><init>(Ljava/lang/String;I)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Lcom/facebook/hermes/intl/c$f;->k:Lcom/facebook/hermes/intl/c$f;

    .line 10
    .line 11
    new-instance v1, Lcom/facebook/hermes/intl/c$f;

    .line 12
    .line 13
    const-string v3, "FRACTION_DIGITS"

    .line 14
    .line 15
    const/4 v4, 0x1

    .line 16
    invoke-direct {v1, v3, v4}, Lcom/facebook/hermes/intl/c$f;-><init>(Ljava/lang/String;I)V

    .line 17
    .line 18
    .line 19
    sput-object v1, Lcom/facebook/hermes/intl/c$f;->l:Lcom/facebook/hermes/intl/c$f;

    .line 20
    .line 21
    new-instance v3, Lcom/facebook/hermes/intl/c$f;

    .line 22
    .line 23
    const-string v5, "COMPACT_ROUNDING"

    .line 24
    .line 25
    const/4 v6, 0x2

    .line 26
    invoke-direct {v3, v5, v6}, Lcom/facebook/hermes/intl/c$f;-><init>(Ljava/lang/String;I)V

    .line 27
    .line 28
    .line 29
    sput-object v3, Lcom/facebook/hermes/intl/c$f;->m:Lcom/facebook/hermes/intl/c$f;

    .line 30
    .line 31
    const/4 v5, 0x3

    .line 32
    new-array v5, v5, [Lcom/facebook/hermes/intl/c$f;

    .line 33
    .line 34
    aput-object v0, v5, v2

    .line 35
    .line 36
    aput-object v1, v5, v4

    .line 37
    .line 38
    aput-object v3, v5, v6

    .line 39
    .line 40
    sput-object v5, Lcom/facebook/hermes/intl/c$f;->n:[Lcom/facebook/hermes/intl/c$f;

    .line 41
    .line 42
    return-void
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
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

.method public static valueOf(Ljava/lang/String;)Lcom/facebook/hermes/intl/c$f;
    .locals 1

    const-class v0, Lcom/facebook/hermes/intl/c$f;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/facebook/hermes/intl/c$f;

    return-object p0
.end method

.method public static values()[Lcom/facebook/hermes/intl/c$f;
    .locals 1

    sget-object v0, Lcom/facebook/hermes/intl/c$f;->n:[Lcom/facebook/hermes/intl/c$f;

    invoke-virtual {v0}, [Lcom/facebook/hermes/intl/c$f;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/facebook/hermes/intl/c$f;

    return-object v0
.end method
