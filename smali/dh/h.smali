.class public final enum Ldh/h;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Ldh/h;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum k:Ldh/h;

.field public static final enum l:Ldh/h;

.field public static final enum m:Ldh/h;

.field private static final synthetic n:[Ldh/h;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Ldh/h;

    .line 2
    .line 3
    const-string v1, "FORCE_FLEXIBILITY"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2}, Ldh/h;-><init>(Ljava/lang/String;I)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Ldh/h;->k:Ldh/h;

    .line 10
    .line 11
    new-instance v0, Ldh/h;

    .line 12
    .line 13
    const-string v1, "NULLABLE"

    .line 14
    .line 15
    const/4 v2, 0x1

    .line 16
    invoke-direct {v0, v1, v2}, Ldh/h;-><init>(Ljava/lang/String;I)V

    .line 17
    .line 18
    .line 19
    sput-object v0, Ldh/h;->l:Ldh/h;

    .line 20
    .line 21
    new-instance v0, Ldh/h;

    .line 22
    .line 23
    const-string v1, "NOT_NULL"

    .line 24
    .line 25
    const/4 v2, 0x2

    .line 26
    invoke-direct {v0, v1, v2}, Ldh/h;-><init>(Ljava/lang/String;I)V

    .line 27
    .line 28
    .line 29
    sput-object v0, Ldh/h;->m:Ldh/h;

    .line 30
    .line 31
    invoke-static {}, Ldh/h;->a()[Ldh/h;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    sput-object v0, Ldh/h;->n:[Ldh/h;

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

.method private static final synthetic a()[Ldh/h;
    .locals 3

    const/4 v0, 0x3

    new-array v0, v0, [Ldh/h;

    const/4 v1, 0x0

    sget-object v2, Ldh/h;->k:Ldh/h;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, Ldh/h;->l:Ldh/h;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    sget-object v2, Ldh/h;->m:Ldh/h;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Ldh/h;
    .locals 1

    const-class v0, Ldh/h;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Ldh/h;

    return-object p0
.end method

.method public static values()[Ldh/h;
    .locals 1

    sget-object v0, Ldh/h;->n:[Ldh/h;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ldh/h;

    return-object v0
.end method
