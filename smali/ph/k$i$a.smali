.class public final enum Lph/k$i$a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lph/k$i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lph/k$i$a;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum k:Lph/k$i$a;

.field public static final enum l:Lph/k$i$a;

.field public static final enum m:Lph/k$i$a;

.field private static final synthetic n:[Lph/k$i$a;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 1
    new-instance v0, Lph/k$i$a;

    .line 2
    .line 3
    const-string v1, "OVERRIDABLE"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2}, Lph/k$i$a;-><init>(Ljava/lang/String;I)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Lph/k$i$a;->k:Lph/k$i$a;

    .line 10
    .line 11
    new-instance v1, Lph/k$i$a;

    .line 12
    .line 13
    const-string v3, "INCOMPATIBLE"

    .line 14
    .line 15
    const/4 v4, 0x1

    .line 16
    invoke-direct {v1, v3, v4}, Lph/k$i$a;-><init>(Ljava/lang/String;I)V

    .line 17
    .line 18
    .line 19
    sput-object v1, Lph/k$i$a;->l:Lph/k$i$a;

    .line 20
    .line 21
    new-instance v3, Lph/k$i$a;

    .line 22
    .line 23
    const-string v5, "CONFLICT"

    .line 24
    .line 25
    const/4 v6, 0x2

    .line 26
    invoke-direct {v3, v5, v6}, Lph/k$i$a;-><init>(Ljava/lang/String;I)V

    .line 27
    .line 28
    .line 29
    sput-object v3, Lph/k$i$a;->m:Lph/k$i$a;

    .line 30
    .line 31
    const/4 v5, 0x3

    .line 32
    new-array v5, v5, [Lph/k$i$a;

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
    sput-object v5, Lph/k$i$a;->n:[Lph/k$i$a;

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

.method public static valueOf(Ljava/lang/String;)Lph/k$i$a;
    .locals 1

    const-class v0, Lph/k$i$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lph/k$i$a;

    return-object p0
.end method

.method public static values()[Lph/k$i$a;
    .locals 1

    sget-object v0, Lph/k$i$a;->n:[Lph/k$i$a;

    invoke-virtual {v0}, [Lph/k$i$a;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lph/k$i$a;

    return-object v0
.end method
