.class public final enum Lvg/i0$b;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lvg/i0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lvg/i0$b;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum m:Lvg/i0$b;

.field public static final enum n:Lvg/i0$b;

.field public static final enum o:Lvg/i0$b;

.field private static final synthetic p:[Lvg/i0$b;


# instance fields
.field private final k:Ljava/lang/String;

.field private final l:Z


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, Lvg/i0$b;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const-string v2, "Ljava/util/Collection<+Ljava/lang/Object;>;"

    .line 5
    .line 6
    const-string v3, "ONE_COLLECTION_PARAMETER"

    .line 7
    .line 8
    invoke-direct {v0, v3, v1, v2, v1}, Lvg/i0$b;-><init>(Ljava/lang/String;ILjava/lang/String;Z)V

    .line 9
    .line 10
    .line 11
    sput-object v0, Lvg/i0$b;->m:Lvg/i0$b;

    .line 12
    .line 13
    new-instance v0, Lvg/i0$b;

    .line 14
    .line 15
    const/4 v1, 0x0

    .line 16
    const-string v2, "OBJECT_PARAMETER_NON_GENERIC"

    .line 17
    .line 18
    const/4 v3, 0x1

    .line 19
    invoke-direct {v0, v2, v3, v1, v3}, Lvg/i0$b;-><init>(Ljava/lang/String;ILjava/lang/String;Z)V

    .line 20
    .line 21
    .line 22
    sput-object v0, Lvg/i0$b;->n:Lvg/i0$b;

    .line 23
    .line 24
    new-instance v0, Lvg/i0$b;

    .line 25
    .line 26
    const/4 v1, 0x2

    .line 27
    const-string v2, "Ljava/lang/Object;"

    .line 28
    .line 29
    const-string v4, "OBJECT_PARAMETER_GENERIC"

    .line 30
    .line 31
    invoke-direct {v0, v4, v1, v2, v3}, Lvg/i0$b;-><init>(Ljava/lang/String;ILjava/lang/String;Z)V

    .line 32
    .line 33
    .line 34
    sput-object v0, Lvg/i0$b;->o:Lvg/i0$b;

    .line 35
    .line 36
    invoke-static {}, Lvg/i0$b;->a()[Lvg/i0$b;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    sput-object v0, Lvg/i0$b;->p:[Lvg/i0$b;

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

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;Z)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Z)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lvg/i0$b;->k:Ljava/lang/String;

    iput-boolean p4, p0, Lvg/i0$b;->l:Z

    return-void
.end method

.method private static final synthetic a()[Lvg/i0$b;
    .locals 3

    const/4 v0, 0x3

    new-array v0, v0, [Lvg/i0$b;

    const/4 v1, 0x0

    sget-object v2, Lvg/i0$b;->m:Lvg/i0$b;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, Lvg/i0$b;->n:Lvg/i0$b;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    sget-object v2, Lvg/i0$b;->o:Lvg/i0$b;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lvg/i0$b;
    .locals 1

    const-class v0, Lvg/i0$b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lvg/i0$b;

    return-object p0
.end method

.method public static values()[Lvg/i0$b;
    .locals 1

    sget-object v0, Lvg/i0$b;->p:[Lvg/i0$b;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lvg/i0$b;

    return-object v0
.end method
