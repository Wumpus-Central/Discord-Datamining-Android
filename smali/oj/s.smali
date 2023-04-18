.class public final enum Loj/s;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Loj/s$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Loj/s;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\u0008\u000e\u0008\u0086\u0001\u0018\u0000 \n2\u0008\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0005B\u0011\u0008\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0008\u0010\tR\u0017\u0010\u0007\u001a\u00020\u00028\u0007\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\u0004\u001a\u0004\u0008\u0005\u0010\u0006j\u0002\u0008\u000bj\u0002\u0008\u000cj\u0002\u0008\rj\u0002\u0008\u000ej\u0002\u0008\u000f\u00a8\u0006\u0010"
    }
    d2 = {
        "Loj/s;",
        "",
        "",
        "k",
        "Ljava/lang/String;",
        "a",
        "()Ljava/lang/String;",
        "javaName",
        "<init>",
        "(Ljava/lang/String;ILjava/lang/String;)V",
        "r",
        "l",
        "m",
        "n",
        "o",
        "p",
        "okhttp"
    }
    k = 0x1
    mv = {
        0x1,
        0x4,
        0x0
    }
.end annotation


# static fields
.field public static final enum l:Loj/s;

.field public static final enum m:Loj/s;

.field public static final enum n:Loj/s;

.field public static final enum o:Loj/s;

.field public static final enum p:Loj/s;

.field private static final synthetic q:[Loj/s;

.field public static final r:Loj/s$a;


# instance fields
.field private final k:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    const/4 v0, 0x5

    .line 2
    new-array v0, v0, [Loj/s;

    .line 3
    .line 4
    new-instance v1, Loj/s;

    .line 5
    .line 6
    const-string v2, "TLS_1_3"

    .line 7
    .line 8
    const-string v3, "TLSv1.3"

    .line 9
    .line 10
    const/4 v4, 0x0

    .line 11
    invoke-direct {v1, v2, v4, v3}, Loj/s;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 12
    .line 13
    .line 14
    sput-object v1, Loj/s;->l:Loj/s;

    .line 15
    .line 16
    aput-object v1, v0, v4

    .line 17
    .line 18
    new-instance v1, Loj/s;

    .line 19
    .line 20
    const-string v2, "TLS_1_2"

    .line 21
    .line 22
    const-string v3, "TLSv1.2"

    .line 23
    .line 24
    const/4 v4, 0x1

    .line 25
    invoke-direct {v1, v2, v4, v3}, Loj/s;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 26
    .line 27
    .line 28
    sput-object v1, Loj/s;->m:Loj/s;

    .line 29
    .line 30
    aput-object v1, v0, v4

    .line 31
    .line 32
    new-instance v1, Loj/s;

    .line 33
    .line 34
    const-string v2, "TLS_1_1"

    .line 35
    .line 36
    const-string v3, "TLSv1.1"

    .line 37
    .line 38
    const/4 v4, 0x2

    .line 39
    invoke-direct {v1, v2, v4, v3}, Loj/s;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 40
    .line 41
    .line 42
    sput-object v1, Loj/s;->n:Loj/s;

    .line 43
    .line 44
    aput-object v1, v0, v4

    .line 45
    .line 46
    new-instance v1, Loj/s;

    .line 47
    .line 48
    const-string v2, "TLS_1_0"

    .line 49
    .line 50
    const-string v3, "TLSv1"

    .line 51
    .line 52
    const/4 v4, 0x3

    .line 53
    invoke-direct {v1, v2, v4, v3}, Loj/s;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 54
    .line 55
    .line 56
    sput-object v1, Loj/s;->o:Loj/s;

    .line 57
    .line 58
    aput-object v1, v0, v4

    .line 59
    .line 60
    new-instance v1, Loj/s;

    .line 61
    .line 62
    const-string v2, "SSL_3_0"

    .line 63
    .line 64
    const-string v3, "SSLv3"

    .line 65
    .line 66
    const/4 v4, 0x4

    .line 67
    invoke-direct {v1, v2, v4, v3}, Loj/s;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 68
    .line 69
    .line 70
    sput-object v1, Loj/s;->p:Loj/s;

    .line 71
    .line 72
    aput-object v1, v0, v4

    .line 73
    .line 74
    sput-object v0, Loj/s;->q:[Loj/s;

    .line 75
    .line 76
    new-instance v0, Loj/s$a;

    .line 77
    .line 78
    const/4 v1, 0x0

    .line 79
    invoke-direct {v0, v1}, Loj/s$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 80
    .line 81
    .line 82
    sput-object v0, Loj/s;->r:Loj/s$a;

    .line 83
    .line 84
    return-void
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

    iput-object p3, p0, Loj/s;->k:Ljava/lang/String;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Loj/s;
    .locals 1

    const-class v0, Loj/s;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Loj/s;

    return-object p0
.end method

.method public static values()[Loj/s;
    .locals 1

    sget-object v0, Loj/s;->q:[Loj/s;

    invoke-virtual {v0}, [Loj/s;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Loj/s;

    return-object v0
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Loj/s;->k:Ljava/lang/String;

    return-object v0
.end method
