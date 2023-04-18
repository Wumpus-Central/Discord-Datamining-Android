.class public final enum Lio/sentry/o3$f;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/sentry/o3;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "f"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lio/sentry/o3$f;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lio/sentry/o3$f;

.field public static final enum ALWAYS:Lio/sentry/o3$f;

.field public static final enum MEDIUM:Lio/sentry/o3$f;

.field public static final enum NONE:Lio/sentry/o3$f;

.field public static final enum SMALL:Lio/sentry/o3$f;


# direct methods
.method private static synthetic $values()[Lio/sentry/o3$f;
    .locals 3

    .line 1
    const/4 v0, 0x4

    .line 2
    new-array v0, v0, [Lio/sentry/o3$f;

    .line 3
    .line 4
    const/4 v1, 0x0

    .line 5
    sget-object v2, Lio/sentry/o3$f;->NONE:Lio/sentry/o3$f;

    .line 6
    .line 7
    aput-object v2, v0, v1

    .line 8
    .line 9
    const/4 v1, 0x1

    .line 10
    sget-object v2, Lio/sentry/o3$f;->SMALL:Lio/sentry/o3$f;

    .line 11
    .line 12
    aput-object v2, v0, v1

    .line 13
    .line 14
    const/4 v1, 0x2

    .line 15
    sget-object v2, Lio/sentry/o3$f;->MEDIUM:Lio/sentry/o3$f;

    .line 16
    .line 17
    aput-object v2, v0, v1

    .line 18
    .line 19
    const/4 v1, 0x3

    .line 20
    sget-object v2, Lio/sentry/o3$f;->ALWAYS:Lio/sentry/o3$f;

    .line 21
    .line 22
    aput-object v2, v0, v1

    .line 23
    .line 24
    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lio/sentry/o3$f;

    .line 2
    .line 3
    const-string v1, "NONE"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2}, Lio/sentry/o3$f;-><init>(Ljava/lang/String;I)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Lio/sentry/o3$f;->NONE:Lio/sentry/o3$f;

    .line 10
    .line 11
    new-instance v0, Lio/sentry/o3$f;

    .line 12
    .line 13
    const-string v1, "SMALL"

    .line 14
    .line 15
    const/4 v2, 0x1

    .line 16
    invoke-direct {v0, v1, v2}, Lio/sentry/o3$f;-><init>(Ljava/lang/String;I)V

    .line 17
    .line 18
    .line 19
    sput-object v0, Lio/sentry/o3$f;->SMALL:Lio/sentry/o3$f;

    .line 20
    .line 21
    new-instance v0, Lio/sentry/o3$f;

    .line 22
    .line 23
    const-string v1, "MEDIUM"

    .line 24
    .line 25
    const/4 v2, 0x2

    .line 26
    invoke-direct {v0, v1, v2}, Lio/sentry/o3$f;-><init>(Ljava/lang/String;I)V

    .line 27
    .line 28
    .line 29
    sput-object v0, Lio/sentry/o3$f;->MEDIUM:Lio/sentry/o3$f;

    .line 30
    .line 31
    new-instance v0, Lio/sentry/o3$f;

    .line 32
    .line 33
    const-string v1, "ALWAYS"

    .line 34
    .line 35
    const/4 v2, 0x3

    .line 36
    invoke-direct {v0, v1, v2}, Lio/sentry/o3$f;-><init>(Ljava/lang/String;I)V

    .line 37
    .line 38
    .line 39
    sput-object v0, Lio/sentry/o3$f;->ALWAYS:Lio/sentry/o3$f;

    .line 40
    .line 41
    invoke-static {}, Lio/sentry/o3$f;->$values()[Lio/sentry/o3$f;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    sput-object v0, Lio/sentry/o3$f;->$VALUES:[Lio/sentry/o3$f;

    .line 46
    .line 47
    return-void
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

.method public static valueOf(Ljava/lang/String;)Lio/sentry/o3$f;
    .locals 1

    const-class v0, Lio/sentry/o3$f;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lio/sentry/o3$f;

    return-object p0
.end method

.method public static values()[Lio/sentry/o3$f;
    .locals 1

    sget-object v0, Lio/sentry/o3$f;->$VALUES:[Lio/sentry/o3$f;

    invoke-virtual {v0}, [Lio/sentry/o3$f;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lio/sentry/o3$f;

    return-object v0
.end method
