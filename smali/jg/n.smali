.class public final enum Ljg/n;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Ljg/n;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum n:Ljg/n;

.field public static final enum o:Ljg/n;

.field public static final enum p:Ljg/n;

.field public static final enum q:Ljg/n;

.field private static final synthetic r:[Ljg/n;


# instance fields
.field private final k:Llh/b;

.field private final l:Llh/f;

.field private final m:Llh/b;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Ljg/n;

    .line 2
    .line 3
    const-string v1, "kotlin/UByte"

    .line 4
    .line 5
    invoke-static {v1}, Llh/b;->e(Ljava/lang/String;)Llh/b;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    const-string v2, "fromString(\"kotlin/UByte\")"

    .line 10
    .line 11
    invoke-static {v1, v2}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    const-string v2, "UBYTE"

    .line 15
    .line 16
    const/4 v3, 0x0

    .line 17
    invoke-direct {v0, v2, v3, v1}, Ljg/n;-><init>(Ljava/lang/String;ILlh/b;)V

    .line 18
    .line 19
    .line 20
    sput-object v0, Ljg/n;->n:Ljg/n;

    .line 21
    .line 22
    new-instance v0, Ljg/n;

    .line 23
    .line 24
    const-string v1, "kotlin/UShort"

    .line 25
    .line 26
    invoke-static {v1}, Llh/b;->e(Ljava/lang/String;)Llh/b;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    const-string v2, "fromString(\"kotlin/UShort\")"

    .line 31
    .line 32
    invoke-static {v1, v2}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    const-string v2, "USHORT"

    .line 36
    .line 37
    const/4 v3, 0x1

    .line 38
    invoke-direct {v0, v2, v3, v1}, Ljg/n;-><init>(Ljava/lang/String;ILlh/b;)V

    .line 39
    .line 40
    .line 41
    sput-object v0, Ljg/n;->o:Ljg/n;

    .line 42
    .line 43
    new-instance v0, Ljg/n;

    .line 44
    .line 45
    const-string v1, "kotlin/UInt"

    .line 46
    .line 47
    invoke-static {v1}, Llh/b;->e(Ljava/lang/String;)Llh/b;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    const-string v2, "fromString(\"kotlin/UInt\")"

    .line 52
    .line 53
    invoke-static {v1, v2}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    const-string v2, "UINT"

    .line 57
    .line 58
    const/4 v3, 0x2

    .line 59
    invoke-direct {v0, v2, v3, v1}, Ljg/n;-><init>(Ljava/lang/String;ILlh/b;)V

    .line 60
    .line 61
    .line 62
    sput-object v0, Ljg/n;->p:Ljg/n;

    .line 63
    .line 64
    new-instance v0, Ljg/n;

    .line 65
    .line 66
    const-string v1, "kotlin/ULong"

    .line 67
    .line 68
    invoke-static {v1}, Llh/b;->e(Ljava/lang/String;)Llh/b;

    .line 69
    .line 70
    .line 71
    move-result-object v1

    .line 72
    const-string v2, "fromString(\"kotlin/ULong\")"

    .line 73
    .line 74
    invoke-static {v1, v2}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    const-string v2, "ULONG"

    .line 78
    .line 79
    const/4 v3, 0x3

    .line 80
    invoke-direct {v0, v2, v3, v1}, Ljg/n;-><init>(Ljava/lang/String;ILlh/b;)V

    .line 81
    .line 82
    .line 83
    sput-object v0, Ljg/n;->q:Ljg/n;

    .line 84
    .line 85
    invoke-static {}, Ljg/n;->a()[Ljg/n;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    sput-object v0, Ljg/n;->r:[Ljg/n;

    .line 90
    .line 91
    return-void
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
.end method

.method private constructor <init>(Ljava/lang/String;ILlh/b;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Llh/b;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    iput-object p3, p0, Ljg/n;->k:Llh/b;

    .line 5
    .line 6
    invoke-virtual {p3}, Llh/b;->j()Llh/f;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    const-string p2, "classId.shortClassName"

    .line 11
    .line 12
    invoke-static {p1, p2}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    iput-object p1, p0, Ljg/n;->l:Llh/f;

    .line 16
    .line 17
    new-instance p2, Llh/b;

    .line 18
    .line 19
    invoke-virtual {p3}, Llh/b;->h()Llh/c;

    .line 20
    .line 21
    .line 22
    move-result-object p3

    .line 23
    new-instance v0, Ljava/lang/StringBuilder;

    .line 24
    .line 25
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 26
    .line 27
    .line 28
    invoke-virtual {p1}, Llh/f;->b()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    const-string p1, "Array"

    .line 36
    .line 37
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    invoke-static {p1}, Llh/f;->h(Ljava/lang/String;)Llh/f;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    invoke-direct {p2, p3, p1}, Llh/b;-><init>(Llh/c;Llh/f;)V

    .line 49
    .line 50
    .line 51
    iput-object p2, p0, Ljg/n;->m:Llh/b;

    .line 52
    .line 53
    return-void
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
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
.end method

.method private static final synthetic a()[Ljg/n;
    .locals 3

    const/4 v0, 0x4

    new-array v0, v0, [Ljg/n;

    const/4 v1, 0x0

    sget-object v2, Ljg/n;->n:Ljg/n;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, Ljg/n;->o:Ljg/n;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    sget-object v2, Ljg/n;->p:Ljg/n;

    aput-object v2, v0, v1

    const/4 v1, 0x3

    sget-object v2, Ljg/n;->q:Ljg/n;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Ljg/n;
    .locals 1

    const-class v0, Ljg/n;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Ljg/n;

    return-object p0
.end method

.method public static values()[Ljg/n;
    .locals 1

    sget-object v0, Ljg/n;->r:[Ljg/n;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljg/n;

    return-object v0
.end method


# virtual methods
.method public final b()Llh/b;
    .locals 1

    iget-object v0, p0, Ljg/n;->m:Llh/b;

    return-object v0
.end method

.method public final c()Llh/b;
    .locals 1

    iget-object v0, p0, Ljg/n;->k:Llh/b;

    return-object v0
.end method

.method public final e()Llh/f;
    .locals 1

    iget-object v0, p0, Ljg/n;->l:Llh/f;

    return-object v0
.end method
