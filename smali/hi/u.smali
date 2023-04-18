.class public final enum Lhi/u;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lhi/u;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum l:Lhi/u;

.field public static final enum m:Lhi/u;

.field public static final enum n:Lhi/u;

.field private static final synthetic o:[Lhi/u;


# instance fields
.field private final k:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lhi/u;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const-string v2, "in"

    .line 5
    .line 6
    const-string v3, "IN"

    .line 7
    .line 8
    invoke-direct {v0, v3, v1, v2}, Lhi/u;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 9
    .line 10
    .line 11
    sput-object v0, Lhi/u;->l:Lhi/u;

    .line 12
    .line 13
    new-instance v0, Lhi/u;

    .line 14
    .line 15
    const/4 v1, 0x1

    .line 16
    const-string v2, "out"

    .line 17
    .line 18
    const-string v3, "OUT"

    .line 19
    .line 20
    invoke-direct {v0, v3, v1, v2}, Lhi/u;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 21
    .line 22
    .line 23
    sput-object v0, Lhi/u;->m:Lhi/u;

    .line 24
    .line 25
    new-instance v0, Lhi/u;

    .line 26
    .line 27
    const/4 v1, 0x2

    .line 28
    const-string v2, ""

    .line 29
    .line 30
    const-string v3, "INV"

    .line 31
    .line 32
    invoke-direct {v0, v3, v1, v2}, Lhi/u;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 33
    .line 34
    .line 35
    sput-object v0, Lhi/u;->n:Lhi/u;

    .line 36
    .line 37
    invoke-static {}, Lhi/u;->a()[Lhi/u;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    sput-object v0, Lhi/u;->o:[Lhi/u;

    .line 42
    .line 43
    return-void
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
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lhi/u;->k:Ljava/lang/String;

    return-void
.end method

.method private static final synthetic a()[Lhi/u;
    .locals 3

    const/4 v0, 0x3

    new-array v0, v0, [Lhi/u;

    const/4 v1, 0x0

    sget-object v2, Lhi/u;->l:Lhi/u;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, Lhi/u;->m:Lhi/u;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    sget-object v2, Lhi/u;->n:Lhi/u;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lhi/u;
    .locals 1

    const-class v0, Lhi/u;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lhi/u;

    return-object p0
.end method

.method public static values()[Lhi/u;
    .locals 1

    sget-object v0, Lhi/u;->o:[Lhi/u;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lhi/u;

    return-object v0
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lhi/u;->k:Ljava/lang/String;

    return-object v0
.end method
