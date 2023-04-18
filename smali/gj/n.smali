.class public final enum Lgj/n;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lgj/n;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum k:Lgj/n;

.field public static final enum l:Lgj/n;

.field public static final enum m:Lgj/n;

.field public static final enum n:Lgj/n;

.field public static final enum o:Lgj/n;

.field public static final enum p:Lgj/n;

.field private static final synthetic q:[Lgj/n;


# direct methods
.method static constructor <clinit>()V
    .locals 13

    .line 1
    new-instance v0, Lgj/n;

    .line 2
    .line 3
    const-string v1, "ZERO"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2}, Lgj/n;-><init>(Ljava/lang/String;I)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Lgj/n;->k:Lgj/n;

    .line 10
    .line 11
    new-instance v1, Lgj/n;

    .line 12
    .line 13
    const-string v3, "ONE"

    .line 14
    .line 15
    const/4 v4, 0x1

    .line 16
    invoke-direct {v1, v3, v4}, Lgj/n;-><init>(Ljava/lang/String;I)V

    .line 17
    .line 18
    .line 19
    sput-object v1, Lgj/n;->l:Lgj/n;

    .line 20
    .line 21
    new-instance v3, Lgj/n;

    .line 22
    .line 23
    const-string v5, "TWO"

    .line 24
    .line 25
    const/4 v6, 0x2

    .line 26
    invoke-direct {v3, v5, v6}, Lgj/n;-><init>(Ljava/lang/String;I)V

    .line 27
    .line 28
    .line 29
    sput-object v3, Lgj/n;->m:Lgj/n;

    .line 30
    .line 31
    new-instance v5, Lgj/n;

    .line 32
    .line 33
    const-string v7, "FEW"

    .line 34
    .line 35
    const/4 v8, 0x3

    .line 36
    invoke-direct {v5, v7, v8}, Lgj/n;-><init>(Ljava/lang/String;I)V

    .line 37
    .line 38
    .line 39
    sput-object v5, Lgj/n;->n:Lgj/n;

    .line 40
    .line 41
    new-instance v7, Lgj/n;

    .line 42
    .line 43
    const-string v9, "MANY"

    .line 44
    .line 45
    const/4 v10, 0x4

    .line 46
    invoke-direct {v7, v9, v10}, Lgj/n;-><init>(Ljava/lang/String;I)V

    .line 47
    .line 48
    .line 49
    sput-object v7, Lgj/n;->o:Lgj/n;

    .line 50
    .line 51
    new-instance v9, Lgj/n;

    .line 52
    .line 53
    const-string v11, "OTHER"

    .line 54
    .line 55
    const/4 v12, 0x5

    .line 56
    invoke-direct {v9, v11, v12}, Lgj/n;-><init>(Ljava/lang/String;I)V

    .line 57
    .line 58
    .line 59
    sput-object v9, Lgj/n;->p:Lgj/n;

    .line 60
    .line 61
    const/4 v11, 0x6

    .line 62
    new-array v11, v11, [Lgj/n;

    .line 63
    .line 64
    aput-object v0, v11, v2

    .line 65
    .line 66
    aput-object v1, v11, v4

    .line 67
    .line 68
    aput-object v3, v11, v6

    .line 69
    .line 70
    aput-object v5, v11, v8

    .line 71
    .line 72
    aput-object v7, v11, v10

    .line 73
    .line 74
    aput-object v9, v11, v12

    .line 75
    .line 76
    sput-object v11, Lgj/n;->q:[Lgj/n;

    .line 77
    .line 78
    return-void
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

.method public static valueOf(Ljava/lang/String;)Lgj/n;
    .locals 1

    const-class v0, Lgj/n;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lgj/n;

    return-object p0
.end method

.method public static values()[Lgj/n;
    .locals 1

    sget-object v0, Lgj/n;->q:[Lgj/n;

    invoke-virtual {v0}, [Lgj/n;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lgj/n;

    return-object v0
.end method
