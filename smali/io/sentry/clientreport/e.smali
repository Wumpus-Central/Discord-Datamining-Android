.class public final enum Lio/sentry/clientreport/e;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lio/sentry/clientreport/e;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lio/sentry/clientreport/e;

.field public static final enum BEFORE_SEND:Lio/sentry/clientreport/e;

.field public static final enum CACHE_OVERFLOW:Lio/sentry/clientreport/e;

.field public static final enum EVENT_PROCESSOR:Lio/sentry/clientreport/e;

.field public static final enum NETWORK_ERROR:Lio/sentry/clientreport/e;

.field public static final enum QUEUE_OVERFLOW:Lio/sentry/clientreport/e;

.field public static final enum RATELIMIT_BACKOFF:Lio/sentry/clientreport/e;

.field public static final enum SAMPLE_RATE:Lio/sentry/clientreport/e;


# instance fields
.field private final reason:Ljava/lang/String;


# direct methods
.method private static synthetic $values()[Lio/sentry/clientreport/e;
    .locals 3

    .line 1
    const/4 v0, 0x7

    .line 2
    new-array v0, v0, [Lio/sentry/clientreport/e;

    .line 3
    .line 4
    const/4 v1, 0x0

    .line 5
    sget-object v2, Lio/sentry/clientreport/e;->QUEUE_OVERFLOW:Lio/sentry/clientreport/e;

    .line 6
    .line 7
    aput-object v2, v0, v1

    .line 8
    .line 9
    const/4 v1, 0x1

    .line 10
    sget-object v2, Lio/sentry/clientreport/e;->CACHE_OVERFLOW:Lio/sentry/clientreport/e;

    .line 11
    .line 12
    aput-object v2, v0, v1

    .line 13
    .line 14
    const/4 v1, 0x2

    .line 15
    sget-object v2, Lio/sentry/clientreport/e;->RATELIMIT_BACKOFF:Lio/sentry/clientreport/e;

    .line 16
    .line 17
    aput-object v2, v0, v1

    .line 18
    .line 19
    const/4 v1, 0x3

    .line 20
    sget-object v2, Lio/sentry/clientreport/e;->NETWORK_ERROR:Lio/sentry/clientreport/e;

    .line 21
    .line 22
    aput-object v2, v0, v1

    .line 23
    .line 24
    const/4 v1, 0x4

    .line 25
    sget-object v2, Lio/sentry/clientreport/e;->SAMPLE_RATE:Lio/sentry/clientreport/e;

    .line 26
    .line 27
    aput-object v2, v0, v1

    .line 28
    .line 29
    const/4 v1, 0x5

    .line 30
    sget-object v2, Lio/sentry/clientreport/e;->BEFORE_SEND:Lio/sentry/clientreport/e;

    .line 31
    .line 32
    aput-object v2, v0, v1

    .line 33
    .line 34
    const/4 v1, 0x6

    .line 35
    sget-object v2, Lio/sentry/clientreport/e;->EVENT_PROCESSOR:Lio/sentry/clientreport/e;

    .line 36
    .line 37
    aput-object v2, v0, v1

    .line 38
    .line 39
    return-object v0
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
.end method

.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lio/sentry/clientreport/e;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const-string v2, "queue_overflow"

    .line 5
    .line 6
    const-string v3, "QUEUE_OVERFLOW"

    .line 7
    .line 8
    invoke-direct {v0, v3, v1, v2}, Lio/sentry/clientreport/e;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 9
    .line 10
    .line 11
    sput-object v0, Lio/sentry/clientreport/e;->QUEUE_OVERFLOW:Lio/sentry/clientreport/e;

    .line 12
    .line 13
    new-instance v0, Lio/sentry/clientreport/e;

    .line 14
    .line 15
    const/4 v1, 0x1

    .line 16
    const-string v2, "cache_overflow"

    .line 17
    .line 18
    const-string v3, "CACHE_OVERFLOW"

    .line 19
    .line 20
    invoke-direct {v0, v3, v1, v2}, Lio/sentry/clientreport/e;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 21
    .line 22
    .line 23
    sput-object v0, Lio/sentry/clientreport/e;->CACHE_OVERFLOW:Lio/sentry/clientreport/e;

    .line 24
    .line 25
    new-instance v0, Lio/sentry/clientreport/e;

    .line 26
    .line 27
    const/4 v1, 0x2

    .line 28
    const-string v2, "ratelimit_backoff"

    .line 29
    .line 30
    const-string v3, "RATELIMIT_BACKOFF"

    .line 31
    .line 32
    invoke-direct {v0, v3, v1, v2}, Lio/sentry/clientreport/e;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 33
    .line 34
    .line 35
    sput-object v0, Lio/sentry/clientreport/e;->RATELIMIT_BACKOFF:Lio/sentry/clientreport/e;

    .line 36
    .line 37
    new-instance v0, Lio/sentry/clientreport/e;

    .line 38
    .line 39
    const/4 v1, 0x3

    .line 40
    const-string v2, "network_error"

    .line 41
    .line 42
    const-string v3, "NETWORK_ERROR"

    .line 43
    .line 44
    invoke-direct {v0, v3, v1, v2}, Lio/sentry/clientreport/e;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 45
    .line 46
    .line 47
    sput-object v0, Lio/sentry/clientreport/e;->NETWORK_ERROR:Lio/sentry/clientreport/e;

    .line 48
    .line 49
    new-instance v0, Lio/sentry/clientreport/e;

    .line 50
    .line 51
    const/4 v1, 0x4

    .line 52
    const-string v2, "sample_rate"

    .line 53
    .line 54
    const-string v3, "SAMPLE_RATE"

    .line 55
    .line 56
    invoke-direct {v0, v3, v1, v2}, Lio/sentry/clientreport/e;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 57
    .line 58
    .line 59
    sput-object v0, Lio/sentry/clientreport/e;->SAMPLE_RATE:Lio/sentry/clientreport/e;

    .line 60
    .line 61
    new-instance v0, Lio/sentry/clientreport/e;

    .line 62
    .line 63
    const/4 v1, 0x5

    .line 64
    const-string v2, "before_send"

    .line 65
    .line 66
    const-string v3, "BEFORE_SEND"

    .line 67
    .line 68
    invoke-direct {v0, v3, v1, v2}, Lio/sentry/clientreport/e;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 69
    .line 70
    .line 71
    sput-object v0, Lio/sentry/clientreport/e;->BEFORE_SEND:Lio/sentry/clientreport/e;

    .line 72
    .line 73
    new-instance v0, Lio/sentry/clientreport/e;

    .line 74
    .line 75
    const/4 v1, 0x6

    .line 76
    const-string v2, "event_processor"

    .line 77
    .line 78
    const-string v3, "EVENT_PROCESSOR"

    .line 79
    .line 80
    invoke-direct {v0, v3, v1, v2}, Lio/sentry/clientreport/e;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 81
    .line 82
    .line 83
    sput-object v0, Lio/sentry/clientreport/e;->EVENT_PROCESSOR:Lio/sentry/clientreport/e;

    .line 84
    .line 85
    invoke-static {}, Lio/sentry/clientreport/e;->$values()[Lio/sentry/clientreport/e;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    sput-object v0, Lio/sentry/clientreport/e;->$VALUES:[Lio/sentry/clientreport/e;

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

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    iput-object p3, p0, Lio/sentry/clientreport/e;->reason:Ljava/lang/String;

    .line 5
    .line 6
    return-void
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
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

.method public static valueOf(Ljava/lang/String;)Lio/sentry/clientreport/e;
    .locals 1

    const-class v0, Lio/sentry/clientreport/e;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lio/sentry/clientreport/e;

    return-object p0
.end method

.method public static values()[Lio/sentry/clientreport/e;
    .locals 1

    sget-object v0, Lio/sentry/clientreport/e;->$VALUES:[Lio/sentry/clientreport/e;

    invoke-virtual {v0}, [Lio/sentry/clientreport/e;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lio/sentry/clientreport/e;

    return-object v0
.end method


# virtual methods
.method public getReason()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/sentry/clientreport/e;->reason:Ljava/lang/String;

    return-object v0
.end method
