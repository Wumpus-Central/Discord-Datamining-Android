.class public final enum Lvg/g0;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lvg/g0$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lvg/g0;",
        ">;"
    }
.end annotation


# static fields
.field public static final l:Lvg/g0$a;

.field public static final enum m:Lvg/g0;

.field public static final enum n:Lvg/g0;

.field public static final enum o:Lvg/g0;

.field private static final synthetic p:[Lvg/g0;


# instance fields
.field private final k:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lvg/g0;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const-string v2, "ignore"

    .line 5
    .line 6
    const-string v3, "IGNORE"

    .line 7
    .line 8
    invoke-direct {v0, v3, v1, v2}, Lvg/g0;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 9
    .line 10
    .line 11
    sput-object v0, Lvg/g0;->m:Lvg/g0;

    .line 12
    .line 13
    new-instance v0, Lvg/g0;

    .line 14
    .line 15
    const/4 v1, 0x1

    .line 16
    const-string v2, "warn"

    .line 17
    .line 18
    const-string v3, "WARN"

    .line 19
    .line 20
    invoke-direct {v0, v3, v1, v2}, Lvg/g0;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 21
    .line 22
    .line 23
    sput-object v0, Lvg/g0;->n:Lvg/g0;

    .line 24
    .line 25
    new-instance v0, Lvg/g0;

    .line 26
    .line 27
    const/4 v1, 0x2

    .line 28
    const-string v2, "strict"

    .line 29
    .line 30
    const-string v3, "STRICT"

    .line 31
    .line 32
    invoke-direct {v0, v3, v1, v2}, Lvg/g0;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 33
    .line 34
    .line 35
    sput-object v0, Lvg/g0;->o:Lvg/g0;

    .line 36
    .line 37
    invoke-static {}, Lvg/g0;->a()[Lvg/g0;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    sput-object v0, Lvg/g0;->p:[Lvg/g0;

    .line 42
    .line 43
    new-instance v0, Lvg/g0$a;

    .line 44
    .line 45
    const/4 v1, 0x0

    .line 46
    invoke-direct {v0, v1}, Lvg/g0$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 47
    .line 48
    .line 49
    sput-object v0, Lvg/g0;->l:Lvg/g0$a;

    .line 50
    .line 51
    return-void
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

    iput-object p3, p0, Lvg/g0;->k:Ljava/lang/String;

    return-void
.end method

.method private static final synthetic a()[Lvg/g0;
    .locals 3

    const/4 v0, 0x3

    new-array v0, v0, [Lvg/g0;

    const/4 v1, 0x0

    sget-object v2, Lvg/g0;->m:Lvg/g0;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, Lvg/g0;->n:Lvg/g0;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    sget-object v2, Lvg/g0;->o:Lvg/g0;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lvg/g0;
    .locals 1

    const-class v0, Lvg/g0;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lvg/g0;

    return-object p0
.end method

.method public static values()[Lvg/g0;
    .locals 1

    sget-object v0, Lvg/g0;->p:[Lvg/g0;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lvg/g0;

    return-object v0
.end method


# virtual methods
.method public final b()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lvg/g0;->k:Ljava/lang/String;

    return-object v0
.end method

.method public final c()Z
    .locals 1

    sget-object v0, Lvg/g0;->m:Lvg/g0;

    if-ne p0, v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final e()Z
    .locals 1

    sget-object v0, Lvg/g0;->n:Lvg/g0;

    if-ne p0, v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method
