.class public final enum Ljg/m;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Ljg/m;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum m:Ljg/m;

.field public static final enum n:Ljg/m;

.field public static final enum o:Ljg/m;

.field public static final enum p:Ljg/m;

.field private static final synthetic q:[Ljg/m;


# instance fields
.field private final k:Llh/b;

.field private final l:Llh/f;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Ljg/m;

    .line 2
    .line 3
    const-string v1, "kotlin/UByteArray"

    .line 4
    .line 5
    invoke-static {v1}, Llh/b;->e(Ljava/lang/String;)Llh/b;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    const-string v2, "fromString(\"kotlin/UByteArray\")"

    .line 10
    .line 11
    invoke-static {v1, v2}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    const-string v2, "UBYTEARRAY"

    .line 15
    .line 16
    const/4 v3, 0x0

    .line 17
    invoke-direct {v0, v2, v3, v1}, Ljg/m;-><init>(Ljava/lang/String;ILlh/b;)V

    .line 18
    .line 19
    .line 20
    sput-object v0, Ljg/m;->m:Ljg/m;

    .line 21
    .line 22
    new-instance v0, Ljg/m;

    .line 23
    .line 24
    const-string v1, "kotlin/UShortArray"

    .line 25
    .line 26
    invoke-static {v1}, Llh/b;->e(Ljava/lang/String;)Llh/b;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    const-string v2, "fromString(\"kotlin/UShortArray\")"

    .line 31
    .line 32
    invoke-static {v1, v2}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    const-string v2, "USHORTARRAY"

    .line 36
    .line 37
    const/4 v3, 0x1

    .line 38
    invoke-direct {v0, v2, v3, v1}, Ljg/m;-><init>(Ljava/lang/String;ILlh/b;)V

    .line 39
    .line 40
    .line 41
    sput-object v0, Ljg/m;->n:Ljg/m;

    .line 42
    .line 43
    new-instance v0, Ljg/m;

    .line 44
    .line 45
    const-string v1, "kotlin/UIntArray"

    .line 46
    .line 47
    invoke-static {v1}, Llh/b;->e(Ljava/lang/String;)Llh/b;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    const-string v2, "fromString(\"kotlin/UIntArray\")"

    .line 52
    .line 53
    invoke-static {v1, v2}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    const-string v2, "UINTARRAY"

    .line 57
    .line 58
    const/4 v3, 0x2

    .line 59
    invoke-direct {v0, v2, v3, v1}, Ljg/m;-><init>(Ljava/lang/String;ILlh/b;)V

    .line 60
    .line 61
    .line 62
    sput-object v0, Ljg/m;->o:Ljg/m;

    .line 63
    .line 64
    new-instance v0, Ljg/m;

    .line 65
    .line 66
    const-string v1, "kotlin/ULongArray"

    .line 67
    .line 68
    invoke-static {v1}, Llh/b;->e(Ljava/lang/String;)Llh/b;

    .line 69
    .line 70
    .line 71
    move-result-object v1

    .line 72
    const-string v2, "fromString(\"kotlin/ULongArray\")"

    .line 73
    .line 74
    invoke-static {v1, v2}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    const-string v2, "ULONGARRAY"

    .line 78
    .line 79
    const/4 v3, 0x3

    .line 80
    invoke-direct {v0, v2, v3, v1}, Ljg/m;-><init>(Ljava/lang/String;ILlh/b;)V

    .line 81
    .line 82
    .line 83
    sput-object v0, Ljg/m;->p:Ljg/m;

    .line 84
    .line 85
    invoke-static {}, Ljg/m;->a()[Ljg/m;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    sput-object v0, Ljg/m;->q:[Ljg/m;

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
    .locals 0
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
    iput-object p3, p0, Ljg/m;->k:Llh/b;

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
    iput-object p1, p0, Ljg/m;->l:Llh/f;

    .line 16
    .line 17
    return-void
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
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

.method private static final synthetic a()[Ljg/m;
    .locals 3

    const/4 v0, 0x4

    new-array v0, v0, [Ljg/m;

    const/4 v1, 0x0

    sget-object v2, Ljg/m;->m:Ljg/m;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, Ljg/m;->n:Ljg/m;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    sget-object v2, Ljg/m;->o:Ljg/m;

    aput-object v2, v0, v1

    const/4 v1, 0x3

    sget-object v2, Ljg/m;->p:Ljg/m;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Ljg/m;
    .locals 1

    const-class v0, Ljg/m;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Ljg/m;

    return-object p0
.end method

.method public static values()[Ljg/m;
    .locals 1

    sget-object v0, Ljg/m;->q:[Ljg/m;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljg/m;

    return-object v0
.end method


# virtual methods
.method public final b()Llh/f;
    .locals 1

    iget-object v0, p0, Ljg/m;->l:Llh/f;

    return-object v0
.end method
