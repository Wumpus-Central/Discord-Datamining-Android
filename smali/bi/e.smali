.class public final enum Lbi/e;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lbi/e;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum k:Lbi/e;

.field public static final enum l:Lbi/e;

.field public static final enum m:Lbi/e;

.field private static final synthetic n:[Lbi/e;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lbi/e;

    .line 2
    .line 3
    const-string v1, "STABLE"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2}, Lbi/e;-><init>(Ljava/lang/String;I)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Lbi/e;->k:Lbi/e;

    .line 10
    .line 11
    new-instance v0, Lbi/e;

    .line 12
    .line 13
    const-string v1, "FIR_UNSTABLE"

    .line 14
    .line 15
    const/4 v2, 0x1

    .line 16
    invoke-direct {v0, v1, v2}, Lbi/e;-><init>(Ljava/lang/String;I)V

    .line 17
    .line 18
    .line 19
    sput-object v0, Lbi/e;->l:Lbi/e;

    .line 20
    .line 21
    new-instance v0, Lbi/e;

    .line 22
    .line 23
    const-string v1, "IR_UNSTABLE"

    .line 24
    .line 25
    const/4 v2, 0x2

    .line 26
    invoke-direct {v0, v1, v2}, Lbi/e;-><init>(Ljava/lang/String;I)V

    .line 27
    .line 28
    .line 29
    sput-object v0, Lbi/e;->m:Lbi/e;

    .line 30
    .line 31
    invoke-static {}, Lbi/e;->a()[Lbi/e;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    sput-object v0, Lbi/e;->n:[Lbi/e;

    .line 36
    .line 37
    return-void
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
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

.method private static final synthetic a()[Lbi/e;
    .locals 3

    const/4 v0, 0x3

    new-array v0, v0, [Lbi/e;

    const/4 v1, 0x0

    sget-object v2, Lbi/e;->k:Lbi/e;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, Lbi/e;->l:Lbi/e;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    sget-object v2, Lbi/e;->m:Lbi/e;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lbi/e;
    .locals 1

    const-class v0, Lbi/e;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lbi/e;

    return-object p0
.end method

.method public static values()[Lbi/e;
    .locals 1

    sget-object v0, Lbi/e;->n:[Lbi/e;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lbi/e;

    return-object v0
.end method
