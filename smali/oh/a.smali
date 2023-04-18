.class public final enum Loh/a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Loh/a;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum m:Loh/a;

.field public static final enum n:Loh/a;

.field public static final enum o:Loh/a;

.field private static final synthetic p:[Loh/a;


# instance fields
.field private final k:Z

.field private final l:Z


# direct methods
.method static constructor <clinit>()V
    .locals 15

    .line 1
    new-instance v7, Loh/a;

    .line 2
    .line 3
    const-string v1, "NO_ARGUMENTS"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x0

    .line 7
    const/4 v4, 0x0

    .line 8
    const/4 v5, 0x3

    .line 9
    const/4 v6, 0x0

    .line 10
    move-object v0, v7

    .line 11
    invoke-direct/range {v0 .. v6}, Loh/a;-><init>(Ljava/lang/String;IZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 12
    .line 13
    .line 14
    sput-object v7, Loh/a;->m:Loh/a;

    .line 15
    .line 16
    new-instance v0, Loh/a;

    .line 17
    .line 18
    const-string v9, "UNLESS_EMPTY"

    .line 19
    .line 20
    const/4 v10, 0x1

    .line 21
    const/4 v11, 0x1

    .line 22
    const/4 v12, 0x0

    .line 23
    const/4 v13, 0x2

    .line 24
    const/4 v14, 0x0

    .line 25
    move-object v8, v0

    .line 26
    invoke-direct/range {v8 .. v14}, Loh/a;-><init>(Ljava/lang/String;IZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 27
    .line 28
    .line 29
    sput-object v0, Loh/a;->n:Loh/a;

    .line 30
    .line 31
    new-instance v0, Loh/a;

    .line 32
    .line 33
    const/4 v1, 0x2

    .line 34
    const/4 v2, 0x1

    .line 35
    const-string v3, "ALWAYS_PARENTHESIZED"

    .line 36
    .line 37
    invoke-direct {v0, v3, v1, v2, v2}, Loh/a;-><init>(Ljava/lang/String;IZZ)V

    .line 38
    .line 39
    .line 40
    sput-object v0, Loh/a;->o:Loh/a;

    .line 41
    .line 42
    invoke-static {}, Loh/a;->a()[Loh/a;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    sput-object v0, Loh/a;->p:[Loh/a;

    .line 47
    .line 48
    return-void
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

.method private constructor <init>(Ljava/lang/String;IZZ)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ZZ)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    iput-boolean p3, p0, Loh/a;->k:Z

    .line 3
    iput-boolean p4, p0, Loh/a;->l:Z

    return-void
.end method

.method synthetic constructor <init>(Ljava/lang/String;IZZILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p6, p5, 0x1

    const/4 v0, 0x0

    if-eqz p6, :cond_0

    move p3, v0

    :cond_0
    and-int/lit8 p5, p5, 0x2

    if-eqz p5, :cond_1

    move p4, v0

    .line 4
    :cond_1
    invoke-direct {p0, p1, p2, p3, p4}, Loh/a;-><init>(Ljava/lang/String;IZZ)V

    return-void
.end method

.method private static final synthetic a()[Loh/a;
    .locals 3

    const/4 v0, 0x3

    new-array v0, v0, [Loh/a;

    const/4 v1, 0x0

    sget-object v2, Loh/a;->m:Loh/a;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, Loh/a;->n:Loh/a;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    sget-object v2, Loh/a;->o:Loh/a;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Loh/a;
    .locals 1

    const-class v0, Loh/a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Loh/a;

    return-object p0
.end method

.method public static values()[Loh/a;
    .locals 1

    sget-object v0, Loh/a;->p:[Loh/a;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Loh/a;

    return-object v0
.end method


# virtual methods
.method public final b()Z
    .locals 1

    iget-boolean v0, p0, Loh/a;->k:Z

    return v0
.end method

.method public final c()Z
    .locals 1

    iget-boolean v0, p0, Loh/a;->l:Z

    return v0
.end method
