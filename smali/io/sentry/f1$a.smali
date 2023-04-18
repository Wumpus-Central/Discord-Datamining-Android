.class public final enum Lio/sentry/f1$a;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements Lio/sentry/f1;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/sentry/f1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lio/sentry/f1$a;",
        ">;",
        "Lio/sentry/f1;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lio/sentry/f1$a;

.field public static final enum DAY:Lio/sentry/f1$a;

.field public static final enum HOUR:Lio/sentry/f1$a;

.field public static final enum MICROSECOND:Lio/sentry/f1$a;

.field public static final enum MILLISECOND:Lio/sentry/f1$a;

.field public static final enum MINUTE:Lio/sentry/f1$a;

.field public static final enum NANOSECOND:Lio/sentry/f1$a;

.field public static final enum SECOND:Lio/sentry/f1$a;

.field public static final enum WEEK:Lio/sentry/f1$a;


# direct methods
.method private static synthetic $values()[Lio/sentry/f1$a;
    .locals 3

    .line 1
    const/16 v0, 0x8

    .line 2
    .line 3
    new-array v0, v0, [Lio/sentry/f1$a;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    sget-object v2, Lio/sentry/f1$a;->NANOSECOND:Lio/sentry/f1$a;

    .line 7
    .line 8
    aput-object v2, v0, v1

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    sget-object v2, Lio/sentry/f1$a;->MICROSECOND:Lio/sentry/f1$a;

    .line 12
    .line 13
    aput-object v2, v0, v1

    .line 14
    .line 15
    const/4 v1, 0x2

    .line 16
    sget-object v2, Lio/sentry/f1$a;->MILLISECOND:Lio/sentry/f1$a;

    .line 17
    .line 18
    aput-object v2, v0, v1

    .line 19
    .line 20
    const/4 v1, 0x3

    .line 21
    sget-object v2, Lio/sentry/f1$a;->SECOND:Lio/sentry/f1$a;

    .line 22
    .line 23
    aput-object v2, v0, v1

    .line 24
    .line 25
    const/4 v1, 0x4

    .line 26
    sget-object v2, Lio/sentry/f1$a;->MINUTE:Lio/sentry/f1$a;

    .line 27
    .line 28
    aput-object v2, v0, v1

    .line 29
    .line 30
    const/4 v1, 0x5

    .line 31
    sget-object v2, Lio/sentry/f1$a;->HOUR:Lio/sentry/f1$a;

    .line 32
    .line 33
    aput-object v2, v0, v1

    .line 34
    .line 35
    const/4 v1, 0x6

    .line 36
    sget-object v2, Lio/sentry/f1$a;->DAY:Lio/sentry/f1$a;

    .line 37
    .line 38
    aput-object v2, v0, v1

    .line 39
    .line 40
    const/4 v1, 0x7

    .line 41
    sget-object v2, Lio/sentry/f1$a;->WEEK:Lio/sentry/f1$a;

    .line 42
    .line 43
    aput-object v2, v0, v1

    .line 44
    .line 45
    return-object v0
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
.end method

.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lio/sentry/f1$a;

    .line 2
    .line 3
    const-string v1, "NANOSECOND"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2}, Lio/sentry/f1$a;-><init>(Ljava/lang/String;I)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Lio/sentry/f1$a;->NANOSECOND:Lio/sentry/f1$a;

    .line 10
    .line 11
    new-instance v0, Lio/sentry/f1$a;

    .line 12
    .line 13
    const-string v1, "MICROSECOND"

    .line 14
    .line 15
    const/4 v2, 0x1

    .line 16
    invoke-direct {v0, v1, v2}, Lio/sentry/f1$a;-><init>(Ljava/lang/String;I)V

    .line 17
    .line 18
    .line 19
    sput-object v0, Lio/sentry/f1$a;->MICROSECOND:Lio/sentry/f1$a;

    .line 20
    .line 21
    new-instance v0, Lio/sentry/f1$a;

    .line 22
    .line 23
    const-string v1, "MILLISECOND"

    .line 24
    .line 25
    const/4 v2, 0x2

    .line 26
    invoke-direct {v0, v1, v2}, Lio/sentry/f1$a;-><init>(Ljava/lang/String;I)V

    .line 27
    .line 28
    .line 29
    sput-object v0, Lio/sentry/f1$a;->MILLISECOND:Lio/sentry/f1$a;

    .line 30
    .line 31
    new-instance v0, Lio/sentry/f1$a;

    .line 32
    .line 33
    const-string v1, "SECOND"

    .line 34
    .line 35
    const/4 v2, 0x3

    .line 36
    invoke-direct {v0, v1, v2}, Lio/sentry/f1$a;-><init>(Ljava/lang/String;I)V

    .line 37
    .line 38
    .line 39
    sput-object v0, Lio/sentry/f1$a;->SECOND:Lio/sentry/f1$a;

    .line 40
    .line 41
    new-instance v0, Lio/sentry/f1$a;

    .line 42
    .line 43
    const-string v1, "MINUTE"

    .line 44
    .line 45
    const/4 v2, 0x4

    .line 46
    invoke-direct {v0, v1, v2}, Lio/sentry/f1$a;-><init>(Ljava/lang/String;I)V

    .line 47
    .line 48
    .line 49
    sput-object v0, Lio/sentry/f1$a;->MINUTE:Lio/sentry/f1$a;

    .line 50
    .line 51
    new-instance v0, Lio/sentry/f1$a;

    .line 52
    .line 53
    const-string v1, "HOUR"

    .line 54
    .line 55
    const/4 v2, 0x5

    .line 56
    invoke-direct {v0, v1, v2}, Lio/sentry/f1$a;-><init>(Ljava/lang/String;I)V

    .line 57
    .line 58
    .line 59
    sput-object v0, Lio/sentry/f1$a;->HOUR:Lio/sentry/f1$a;

    .line 60
    .line 61
    new-instance v0, Lio/sentry/f1$a;

    .line 62
    .line 63
    const-string v1, "DAY"

    .line 64
    .line 65
    const/4 v2, 0x6

    .line 66
    invoke-direct {v0, v1, v2}, Lio/sentry/f1$a;-><init>(Ljava/lang/String;I)V

    .line 67
    .line 68
    .line 69
    sput-object v0, Lio/sentry/f1$a;->DAY:Lio/sentry/f1$a;

    .line 70
    .line 71
    new-instance v0, Lio/sentry/f1$a;

    .line 72
    .line 73
    const-string v1, "WEEK"

    .line 74
    .line 75
    const/4 v2, 0x7

    .line 76
    invoke-direct {v0, v1, v2}, Lio/sentry/f1$a;-><init>(Ljava/lang/String;I)V

    .line 77
    .line 78
    .line 79
    sput-object v0, Lio/sentry/f1$a;->WEEK:Lio/sentry/f1$a;

    .line 80
    .line 81
    invoke-static {}, Lio/sentry/f1$a;->$values()[Lio/sentry/f1$a;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    sput-object v0, Lio/sentry/f1$a;->$VALUES:[Lio/sentry/f1$a;

    .line 86
    .line 87
    return-void
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

.method public static valueOf(Ljava/lang/String;)Lio/sentry/f1$a;
    .locals 1

    const-class v0, Lio/sentry/f1$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lio/sentry/f1$a;

    return-object p0
.end method

.method public static values()[Lio/sentry/f1$a;
    .locals 1

    sget-object v0, Lio/sentry/f1$a;->$VALUES:[Lio/sentry/f1$a;

    invoke-virtual {v0}, [Lio/sentry/f1$a;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lio/sentry/f1$a;

    return-object v0
.end method


# virtual methods
.method public bridge synthetic apiName()Ljava/lang/String;
    .locals 1

    invoke-static {p0}, Lio/sentry/e1;->a(Lio/sentry/f1;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
