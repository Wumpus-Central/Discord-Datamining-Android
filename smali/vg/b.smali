.class public final enum Lvg/b;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lvg/b;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum l:Lvg/b;

.field public static final enum m:Lvg/b;

.field public static final enum n:Lvg/b;

.field public static final enum o:Lvg/b;

.field public static final enum p:Lvg/b;

.field public static final enum q:Lvg/b;

.field private static final synthetic r:[Lvg/b;


# instance fields
.field private final k:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lvg/b;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const-string v2, "METHOD"

    .line 5
    .line 6
    const-string v3, "METHOD_RETURN_TYPE"

    .line 7
    .line 8
    invoke-direct {v0, v3, v1, v2}, Lvg/b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 9
    .line 10
    .line 11
    sput-object v0, Lvg/b;->l:Lvg/b;

    .line 12
    .line 13
    new-instance v0, Lvg/b;

    .line 14
    .line 15
    const/4 v1, 0x1

    .line 16
    const-string v2, "PARAMETER"

    .line 17
    .line 18
    const-string v3, "VALUE_PARAMETER"

    .line 19
    .line 20
    invoke-direct {v0, v3, v1, v2}, Lvg/b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 21
    .line 22
    .line 23
    sput-object v0, Lvg/b;->m:Lvg/b;

    .line 24
    .line 25
    new-instance v0, Lvg/b;

    .line 26
    .line 27
    const-string v1, "FIELD"

    .line 28
    .line 29
    const/4 v2, 0x2

    .line 30
    invoke-direct {v0, v1, v2, v1}, Lvg/b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 31
    .line 32
    .line 33
    sput-object v0, Lvg/b;->n:Lvg/b;

    .line 34
    .line 35
    new-instance v0, Lvg/b;

    .line 36
    .line 37
    const/4 v1, 0x3

    .line 38
    const-string v2, "TYPE_USE"

    .line 39
    .line 40
    invoke-direct {v0, v2, v1, v2}, Lvg/b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 41
    .line 42
    .line 43
    sput-object v0, Lvg/b;->o:Lvg/b;

    .line 44
    .line 45
    new-instance v0, Lvg/b;

    .line 46
    .line 47
    const-string v1, "TYPE_PARAMETER_BOUNDS"

    .line 48
    .line 49
    const/4 v3, 0x4

    .line 50
    invoke-direct {v0, v1, v3, v2}, Lvg/b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 51
    .line 52
    .line 53
    sput-object v0, Lvg/b;->p:Lvg/b;

    .line 54
    .line 55
    new-instance v0, Lvg/b;

    .line 56
    .line 57
    const-string v1, "TYPE_PARAMETER"

    .line 58
    .line 59
    const/4 v2, 0x5

    .line 60
    invoke-direct {v0, v1, v2, v1}, Lvg/b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 61
    .line 62
    .line 63
    sput-object v0, Lvg/b;->q:Lvg/b;

    .line 64
    .line 65
    invoke-static {}, Lvg/b;->a()[Lvg/b;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    sput-object v0, Lvg/b;->r:[Lvg/b;

    .line 70
    .line 71
    return-void
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

    iput-object p3, p0, Lvg/b;->k:Ljava/lang/String;

    return-void
.end method

.method private static final synthetic a()[Lvg/b;
    .locals 3

    const/4 v0, 0x6

    new-array v0, v0, [Lvg/b;

    const/4 v1, 0x0

    sget-object v2, Lvg/b;->l:Lvg/b;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, Lvg/b;->m:Lvg/b;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    sget-object v2, Lvg/b;->n:Lvg/b;

    aput-object v2, v0, v1

    const/4 v1, 0x3

    sget-object v2, Lvg/b;->o:Lvg/b;

    aput-object v2, v0, v1

    const/4 v1, 0x4

    sget-object v2, Lvg/b;->p:Lvg/b;

    aput-object v2, v0, v1

    const/4 v1, 0x5

    sget-object v2, Lvg/b;->q:Lvg/b;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lvg/b;
    .locals 1

    const-class v0, Lvg/b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lvg/b;

    return-object p0
.end method

.method public static values()[Lvg/b;
    .locals 1

    sget-object v0, Lvg/b;->r:[Lvg/b;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lvg/b;

    return-object v0
.end method


# virtual methods
.method public final b()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lvg/b;->k:Ljava/lang/String;

    return-object v0
.end method
