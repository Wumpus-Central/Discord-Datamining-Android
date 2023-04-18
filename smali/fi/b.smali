.class public final enum Lfi/b;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lfi/b;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum l:Lfi/b;

.field public static final enum m:Lfi/b;

.field public static final enum n:Lfi/b;

.field public static final enum o:Lfi/b;

.field public static final enum p:Lfi/b;

.field public static final enum q:Lfi/b;

.field public static final enum r:Lfi/b;

.field private static final synthetic s:[Lfi/b;


# instance fields
.field private final k:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lfi/b;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const-string v2, "<Error class: %s>"

    .line 5
    .line 6
    const-string v3, "ERROR_CLASS"

    .line 7
    .line 8
    invoke-direct {v0, v3, v1, v2}, Lfi/b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 9
    .line 10
    .line 11
    sput-object v0, Lfi/b;->l:Lfi/b;

    .line 12
    .line 13
    new-instance v0, Lfi/b;

    .line 14
    .line 15
    const/4 v1, 0x1

    .line 16
    const-string v2, "<Error function>"

    .line 17
    .line 18
    const-string v3, "ERROR_FUNCTION"

    .line 19
    .line 20
    invoke-direct {v0, v3, v1, v2}, Lfi/b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 21
    .line 22
    .line 23
    sput-object v0, Lfi/b;->m:Lfi/b;

    .line 24
    .line 25
    new-instance v0, Lfi/b;

    .line 26
    .line 27
    const/4 v1, 0x2

    .line 28
    const-string v2, "<Error scope>"

    .line 29
    .line 30
    const-string v3, "ERROR_SCOPE"

    .line 31
    .line 32
    invoke-direct {v0, v3, v1, v2}, Lfi/b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 33
    .line 34
    .line 35
    sput-object v0, Lfi/b;->n:Lfi/b;

    .line 36
    .line 37
    new-instance v0, Lfi/b;

    .line 38
    .line 39
    const/4 v1, 0x3

    .line 40
    const-string v2, "<Error module>"

    .line 41
    .line 42
    const-string v3, "ERROR_MODULE"

    .line 43
    .line 44
    invoke-direct {v0, v3, v1, v2}, Lfi/b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 45
    .line 46
    .line 47
    sput-object v0, Lfi/b;->o:Lfi/b;

    .line 48
    .line 49
    new-instance v0, Lfi/b;

    .line 50
    .line 51
    const/4 v1, 0x4

    .line 52
    const-string v2, "<Error property>"

    .line 53
    .line 54
    const-string v3, "ERROR_PROPERTY"

    .line 55
    .line 56
    invoke-direct {v0, v3, v1, v2}, Lfi/b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 57
    .line 58
    .line 59
    sput-object v0, Lfi/b;->p:Lfi/b;

    .line 60
    .line 61
    new-instance v0, Lfi/b;

    .line 62
    .line 63
    const/4 v1, 0x5

    .line 64
    const-string v2, "[Error type: %s]"

    .line 65
    .line 66
    const-string v3, "ERROR_TYPE"

    .line 67
    .line 68
    invoke-direct {v0, v3, v1, v2}, Lfi/b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 69
    .line 70
    .line 71
    sput-object v0, Lfi/b;->q:Lfi/b;

    .line 72
    .line 73
    new-instance v0, Lfi/b;

    .line 74
    .line 75
    const/4 v1, 0x6

    .line 76
    const-string v2, "<Fake parent for error lexical scope>"

    .line 77
    .line 78
    const-string v3, "PARENT_OF_ERROR_SCOPE"

    .line 79
    .line 80
    invoke-direct {v0, v3, v1, v2}, Lfi/b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 81
    .line 82
    .line 83
    sput-object v0, Lfi/b;->r:Lfi/b;

    .line 84
    .line 85
    invoke-static {}, Lfi/b;->a()[Lfi/b;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    sput-object v0, Lfi/b;->s:[Lfi/b;

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

    iput-object p3, p0, Lfi/b;->k:Ljava/lang/String;

    return-void
.end method

.method private static final synthetic a()[Lfi/b;
    .locals 3

    const/4 v0, 0x7

    new-array v0, v0, [Lfi/b;

    const/4 v1, 0x0

    sget-object v2, Lfi/b;->l:Lfi/b;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, Lfi/b;->m:Lfi/b;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    sget-object v2, Lfi/b;->n:Lfi/b;

    aput-object v2, v0, v1

    const/4 v1, 0x3

    sget-object v2, Lfi/b;->o:Lfi/b;

    aput-object v2, v0, v1

    const/4 v1, 0x4

    sget-object v2, Lfi/b;->p:Lfi/b;

    aput-object v2, v0, v1

    const/4 v1, 0x5

    sget-object v2, Lfi/b;->q:Lfi/b;

    aput-object v2, v0, v1

    const/4 v1, 0x6

    sget-object v2, Lfi/b;->r:Lfi/b;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lfi/b;
    .locals 1

    const-class v0, Lfi/b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lfi/b;

    return-object p0
.end method

.method public static values()[Lfi/b;
    .locals 1

    sget-object v0, Lfi/b;->s:[Lfi/b;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lfi/b;

    return-object v0
.end method


# virtual methods
.method public final b()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lfi/b;->k:Ljava/lang/String;

    return-object v0
.end method
