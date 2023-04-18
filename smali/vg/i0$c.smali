.class public enum Lvg/i0$c;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lvg/i0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lvg/i0$c$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lvg/i0$c;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum l:Lvg/i0$c;

.field public static final enum m:Lvg/i0$c;

.field public static final enum n:Lvg/i0$c;

.field public static final enum o:Lvg/i0$c;

.field private static final synthetic p:[Lvg/i0$c;


# instance fields
.field private final k:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lvg/i0$c;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x0

    .line 5
    const-string v3, "NULL"

    .line 6
    .line 7
    invoke-direct {v0, v3, v1, v2}, Lvg/i0$c;-><init>(Ljava/lang/String;ILjava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    sput-object v0, Lvg/i0$c;->l:Lvg/i0$c;

    .line 11
    .line 12
    new-instance v0, Lvg/i0$c;

    .line 13
    .line 14
    const/4 v1, -0x1

    .line 15
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    const-string v2, "INDEX"

    .line 20
    .line 21
    const/4 v3, 0x1

    .line 22
    invoke-direct {v0, v2, v3, v1}, Lvg/i0$c;-><init>(Ljava/lang/String;ILjava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    sput-object v0, Lvg/i0$c;->m:Lvg/i0$c;

    .line 26
    .line 27
    new-instance v0, Lvg/i0$c;

    .line 28
    .line 29
    const/4 v1, 0x2

    .line 30
    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 31
    .line 32
    const-string v3, "FALSE"

    .line 33
    .line 34
    invoke-direct {v0, v3, v1, v2}, Lvg/i0$c;-><init>(Ljava/lang/String;ILjava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    sput-object v0, Lvg/i0$c;->n:Lvg/i0$c;

    .line 38
    .line 39
    new-instance v0, Lvg/i0$c$a;

    .line 40
    .line 41
    const-string v1, "MAP_GET_OR_DEFAULT"

    .line 42
    .line 43
    const/4 v2, 0x3

    .line 44
    invoke-direct {v0, v1, v2}, Lvg/i0$c$a;-><init>(Ljava/lang/String;I)V

    .line 45
    .line 46
    .line 47
    sput-object v0, Lvg/i0$c;->o:Lvg/i0$c;

    .line 48
    .line 49
    invoke-static {}, Lvg/i0$c;->a()[Lvg/i0$c;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    sput-object v0, Lvg/i0$c;->p:[Lvg/i0$c;

    .line 54
    .line 55
    return-void
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

.method private constructor <init>(Ljava/lang/String;ILjava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lvg/i0$c;->k:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;ILjava/lang/Object;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lvg/i0$c;-><init>(Ljava/lang/String;ILjava/lang/Object;)V

    return-void
.end method

.method private static final synthetic a()[Lvg/i0$c;
    .locals 3

    const/4 v0, 0x4

    new-array v0, v0, [Lvg/i0$c;

    const/4 v1, 0x0

    sget-object v2, Lvg/i0$c;->l:Lvg/i0$c;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, Lvg/i0$c;->m:Lvg/i0$c;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    sget-object v2, Lvg/i0$c;->n:Lvg/i0$c;

    aput-object v2, v0, v1

    const/4 v1, 0x3

    sget-object v2, Lvg/i0$c;->o:Lvg/i0$c;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lvg/i0$c;
    .locals 1

    const-class v0, Lvg/i0$c;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lvg/i0$c;

    return-object p0
.end method

.method public static values()[Lvg/i0$c;
    .locals 1

    sget-object v0, Lvg/i0$c;->p:[Lvg/i0$c;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lvg/i0$c;

    return-object v0
.end method
