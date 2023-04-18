.class public final enum Lnet/time4j/tz/d;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lnet/time4j/tz/d;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum k:Lnet/time4j/tz/d;

.field public static final enum l:Lnet/time4j/tz/d;

.field public static final enum m:Lnet/time4j/tz/d;

.field public static final enum n:Lnet/time4j/tz/d;

.field private static final synthetic o:[Lnet/time4j/tz/d;


# direct methods
.method static constructor <clinit>()V
    .locals 9

    .line 1
    new-instance v0, Lnet/time4j/tz/d;

    .line 2
    .line 3
    const-string v1, "SHORT_STANDARD_TIME"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2}, Lnet/time4j/tz/d;-><init>(Ljava/lang/String;I)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Lnet/time4j/tz/d;->k:Lnet/time4j/tz/d;

    .line 10
    .line 11
    new-instance v1, Lnet/time4j/tz/d;

    .line 12
    .line 13
    const-string v3, "LONG_STANDARD_TIME"

    .line 14
    .line 15
    const/4 v4, 0x1

    .line 16
    invoke-direct {v1, v3, v4}, Lnet/time4j/tz/d;-><init>(Ljava/lang/String;I)V

    .line 17
    .line 18
    .line 19
    sput-object v1, Lnet/time4j/tz/d;->l:Lnet/time4j/tz/d;

    .line 20
    .line 21
    new-instance v3, Lnet/time4j/tz/d;

    .line 22
    .line 23
    const-string v5, "SHORT_DAYLIGHT_TIME"

    .line 24
    .line 25
    const/4 v6, 0x2

    .line 26
    invoke-direct {v3, v5, v6}, Lnet/time4j/tz/d;-><init>(Ljava/lang/String;I)V

    .line 27
    .line 28
    .line 29
    sput-object v3, Lnet/time4j/tz/d;->m:Lnet/time4j/tz/d;

    .line 30
    .line 31
    new-instance v5, Lnet/time4j/tz/d;

    .line 32
    .line 33
    const-string v7, "LONG_DAYLIGHT_TIME"

    .line 34
    .line 35
    const/4 v8, 0x3

    .line 36
    invoke-direct {v5, v7, v8}, Lnet/time4j/tz/d;-><init>(Ljava/lang/String;I)V

    .line 37
    .line 38
    .line 39
    sput-object v5, Lnet/time4j/tz/d;->n:Lnet/time4j/tz/d;

    .line 40
    .line 41
    const/4 v7, 0x4

    .line 42
    new-array v7, v7, [Lnet/time4j/tz/d;

    .line 43
    .line 44
    aput-object v0, v7, v2

    .line 45
    .line 46
    aput-object v1, v7, v4

    .line 47
    .line 48
    aput-object v3, v7, v6

    .line 49
    .line 50
    aput-object v5, v7, v8

    .line 51
    .line 52
    sput-object v7, Lnet/time4j/tz/d;->o:[Lnet/time4j/tz/d;

    .line 53
    .line 54
    return-void
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

.method public static valueOf(Ljava/lang/String;)Lnet/time4j/tz/d;
    .locals 1

    const-class v0, Lnet/time4j/tz/d;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lnet/time4j/tz/d;

    return-object p0
.end method

.method public static values()[Lnet/time4j/tz/d;
    .locals 1

    sget-object v0, Lnet/time4j/tz/d;->o:[Lnet/time4j/tz/d;

    invoke-virtual {v0}, [Lnet/time4j/tz/d;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lnet/time4j/tz/d;

    return-object v0
.end method


# virtual methods
.method public a()Z
    .locals 1

    sget-object v0, Lnet/time4j/tz/d;->k:Lnet/time4j/tz/d;

    if-eq p0, v0, :cond_1

    sget-object v0, Lnet/time4j/tz/d;->m:Lnet/time4j/tz/d;

    if-ne p0, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method

.method public b()Z
    .locals 1

    sget-object v0, Lnet/time4j/tz/d;->m:Lnet/time4j/tz/d;

    if-eq p0, v0, :cond_1

    sget-object v0, Lnet/time4j/tz/d;->n:Lnet/time4j/tz/d;

    if-ne p0, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method
