.class public final enum Lvc/c$a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lvc/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lvc/c$a;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum k:Lvc/c$a;

.field public static final enum l:Lvc/c$a;

.field public static final enum m:Lvc/c$a;

.field public static final enum n:Lvc/c$a;

.field public static final enum o:Lvc/c$a;

.field private static final synthetic p:[Lvc/c$a;


# direct methods
.method static constructor <clinit>()V
    .locals 11

    .line 1
    new-instance v0, Lvc/c$a;

    .line 2
    .line 3
    const-string v1, "ATTEMPT_MIGRATION"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2}, Lvc/c$a;-><init>(Ljava/lang/String;I)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Lvc/c$a;->k:Lvc/c$a;

    .line 10
    .line 11
    new-instance v1, Lvc/c$a;

    .line 12
    .line 13
    const-string v3, "NOT_GENERATED"

    .line 14
    .line 15
    const/4 v4, 0x1

    .line 16
    invoke-direct {v1, v3, v4}, Lvc/c$a;-><init>(Ljava/lang/String;I)V

    .line 17
    .line 18
    .line 19
    sput-object v1, Lvc/c$a;->l:Lvc/c$a;

    .line 20
    .line 21
    new-instance v3, Lvc/c$a;

    .line 22
    .line 23
    const-string v5, "UNREGISTERED"

    .line 24
    .line 25
    const/4 v6, 0x2

    .line 26
    invoke-direct {v3, v5, v6}, Lvc/c$a;-><init>(Ljava/lang/String;I)V

    .line 27
    .line 28
    .line 29
    sput-object v3, Lvc/c$a;->m:Lvc/c$a;

    .line 30
    .line 31
    new-instance v5, Lvc/c$a;

    .line 32
    .line 33
    const-string v7, "REGISTERED"

    .line 34
    .line 35
    const/4 v8, 0x3

    .line 36
    invoke-direct {v5, v7, v8}, Lvc/c$a;-><init>(Ljava/lang/String;I)V

    .line 37
    .line 38
    .line 39
    sput-object v5, Lvc/c$a;->n:Lvc/c$a;

    .line 40
    .line 41
    new-instance v7, Lvc/c$a;

    .line 42
    .line 43
    const-string v9, "REGISTER_ERROR"

    .line 44
    .line 45
    const/4 v10, 0x4

    .line 46
    invoke-direct {v7, v9, v10}, Lvc/c$a;-><init>(Ljava/lang/String;I)V

    .line 47
    .line 48
    .line 49
    sput-object v7, Lvc/c$a;->o:Lvc/c$a;

    .line 50
    .line 51
    const/4 v9, 0x5

    .line 52
    new-array v9, v9, [Lvc/c$a;

    .line 53
    .line 54
    aput-object v0, v9, v2

    .line 55
    .line 56
    aput-object v1, v9, v4

    .line 57
    .line 58
    aput-object v3, v9, v6

    .line 59
    .line 60
    aput-object v5, v9, v8

    .line 61
    .line 62
    aput-object v7, v9, v10

    .line 63
    .line 64
    sput-object v9, Lvc/c$a;->p:[Lvc/c$a;

    .line 65
    .line 66
    return-void
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

.method public static valueOf(Ljava/lang/String;)Lvc/c$a;
    .locals 1

    const-class v0, Lvc/c$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lvc/c$a;

    return-object p0
.end method

.method public static values()[Lvc/c$a;
    .locals 1

    sget-object v0, Lvc/c$a;->p:[Lvc/c$a;

    invoke-virtual {v0}, [Lvc/c$a;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lvc/c$a;

    return-object v0
.end method
