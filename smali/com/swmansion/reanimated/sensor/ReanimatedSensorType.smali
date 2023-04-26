.class public final enum Lcom/swmansion/reanimated/sensor/ReanimatedSensorType;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/swmansion/reanimated/sensor/ReanimatedSensorType;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/swmansion/reanimated/sensor/ReanimatedSensorType;

.field public static final enum ACCELEROMETER:Lcom/swmansion/reanimated/sensor/ReanimatedSensorType;

.field public static final enum GRAVITY:Lcom/swmansion/reanimated/sensor/ReanimatedSensorType;

.field public static final enum GYROSCOPE:Lcom/swmansion/reanimated/sensor/ReanimatedSensorType;

.field public static final enum MAGNETIC_FIELD:Lcom/swmansion/reanimated/sensor/ReanimatedSensorType;

.field public static final enum ROTATION_VECTOR:Lcom/swmansion/reanimated/sensor/ReanimatedSensorType;


# instance fields
.field private final type:I


# direct methods
.method static constructor <clinit>()V
    .locals 12

    .line 1
    new-instance v0, Lcom/swmansion/reanimated/sensor/ReanimatedSensorType;

    .line 2
    .line 3
    const/16 v1, 0xa

    .line 4
    .line 5
    const-string v2, "ACCELEROMETER"

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    invoke-direct {v0, v2, v3, v1}, Lcom/swmansion/reanimated/sensor/ReanimatedSensorType;-><init>(Ljava/lang/String;II)V

    .line 9
    .line 10
    .line 11
    sput-object v0, Lcom/swmansion/reanimated/sensor/ReanimatedSensorType;->ACCELEROMETER:Lcom/swmansion/reanimated/sensor/ReanimatedSensorType;

    .line 12
    .line 13
    new-instance v1, Lcom/swmansion/reanimated/sensor/ReanimatedSensorType;

    .line 14
    .line 15
    const-string v2, "GYROSCOPE"

    .line 16
    .line 17
    const/4 v4, 0x1

    .line 18
    const/4 v5, 0x4

    .line 19
    invoke-direct {v1, v2, v4, v5}, Lcom/swmansion/reanimated/sensor/ReanimatedSensorType;-><init>(Ljava/lang/String;II)V

    .line 20
    .line 21
    .line 22
    sput-object v1, Lcom/swmansion/reanimated/sensor/ReanimatedSensorType;->GYROSCOPE:Lcom/swmansion/reanimated/sensor/ReanimatedSensorType;

    .line 23
    .line 24
    new-instance v2, Lcom/swmansion/reanimated/sensor/ReanimatedSensorType;

    .line 25
    .line 26
    const/16 v6, 0x9

    .line 27
    .line 28
    const-string v7, "GRAVITY"

    .line 29
    .line 30
    const/4 v8, 0x2

    .line 31
    invoke-direct {v2, v7, v8, v6}, Lcom/swmansion/reanimated/sensor/ReanimatedSensorType;-><init>(Ljava/lang/String;II)V

    .line 32
    .line 33
    .line 34
    sput-object v2, Lcom/swmansion/reanimated/sensor/ReanimatedSensorType;->GRAVITY:Lcom/swmansion/reanimated/sensor/ReanimatedSensorType;

    .line 35
    .line 36
    new-instance v6, Lcom/swmansion/reanimated/sensor/ReanimatedSensorType;

    .line 37
    .line 38
    const-string v7, "MAGNETIC_FIELD"

    .line 39
    .line 40
    const/4 v9, 0x3

    .line 41
    invoke-direct {v6, v7, v9, v8}, Lcom/swmansion/reanimated/sensor/ReanimatedSensorType;-><init>(Ljava/lang/String;II)V

    .line 42
    .line 43
    .line 44
    sput-object v6, Lcom/swmansion/reanimated/sensor/ReanimatedSensorType;->MAGNETIC_FIELD:Lcom/swmansion/reanimated/sensor/ReanimatedSensorType;

    .line 45
    .line 46
    new-instance v7, Lcom/swmansion/reanimated/sensor/ReanimatedSensorType;

    .line 47
    .line 48
    const-string v10, "ROTATION_VECTOR"

    .line 49
    .line 50
    const/16 v11, 0xb

    .line 51
    .line 52
    invoke-direct {v7, v10, v5, v11}, Lcom/swmansion/reanimated/sensor/ReanimatedSensorType;-><init>(Ljava/lang/String;II)V

    .line 53
    .line 54
    .line 55
    sput-object v7, Lcom/swmansion/reanimated/sensor/ReanimatedSensorType;->ROTATION_VECTOR:Lcom/swmansion/reanimated/sensor/ReanimatedSensorType;

    .line 56
    .line 57
    const/4 v10, 0x5

    .line 58
    new-array v10, v10, [Lcom/swmansion/reanimated/sensor/ReanimatedSensorType;

    .line 59
    .line 60
    aput-object v0, v10, v3

    .line 61
    .line 62
    aput-object v1, v10, v4

    .line 63
    .line 64
    aput-object v2, v10, v8

    .line 65
    .line 66
    aput-object v6, v10, v9

    .line 67
    .line 68
    aput-object v7, v10, v5

    .line 69
    .line 70
    sput-object v10, Lcom/swmansion/reanimated/sensor/ReanimatedSensorType;->$VALUES:[Lcom/swmansion/reanimated/sensor/ReanimatedSensorType;

    .line 71
    .line 72
    return-void
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
.end method

.method private constructor <init>(Ljava/lang/String;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    iput p3, p0, Lcom/swmansion/reanimated/sensor/ReanimatedSensorType;->type:I

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

.method public static getInstanceById(I)Lcom/swmansion/reanimated/sensor/ReanimatedSensorType;
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    if-eq p0, v0, :cond_4

    .line 3
    .line 4
    const/4 v0, 0x2

    .line 5
    if-eq p0, v0, :cond_3

    .line 6
    .line 7
    const/4 v0, 0x3

    .line 8
    if-eq p0, v0, :cond_2

    .line 9
    .line 10
    const/4 v0, 0x4

    .line 11
    if-eq p0, v0, :cond_1

    .line 12
    .line 13
    const/4 v0, 0x5

    .line 14
    if-ne p0, v0, :cond_0

    .line 15
    .line 16
    sget-object p0, Lcom/swmansion/reanimated/sensor/ReanimatedSensorType;->ROTATION_VECTOR:Lcom/swmansion/reanimated/sensor/ReanimatedSensorType;

    .line 17
    .line 18
    return-object p0

    .line 19
    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 20
    .line 21
    const-string v0, "[Reanimated] Unknown sensor type"

    .line 22
    .line 23
    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    throw p0

    .line 27
    :cond_1
    sget-object p0, Lcom/swmansion/reanimated/sensor/ReanimatedSensorType;->MAGNETIC_FIELD:Lcom/swmansion/reanimated/sensor/ReanimatedSensorType;

    .line 28
    .line 29
    return-object p0

    .line 30
    :cond_2
    sget-object p0, Lcom/swmansion/reanimated/sensor/ReanimatedSensorType;->GRAVITY:Lcom/swmansion/reanimated/sensor/ReanimatedSensorType;

    .line 31
    .line 32
    return-object p0

    .line 33
    :cond_3
    sget-object p0, Lcom/swmansion/reanimated/sensor/ReanimatedSensorType;->GYROSCOPE:Lcom/swmansion/reanimated/sensor/ReanimatedSensorType;

    .line 34
    .line 35
    return-object p0

    .line 36
    :cond_4
    sget-object p0, Lcom/swmansion/reanimated/sensor/ReanimatedSensorType;->ACCELEROMETER:Lcom/swmansion/reanimated/sensor/ReanimatedSensorType;

    .line 37
    .line 38
    return-object p0
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
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/swmansion/reanimated/sensor/ReanimatedSensorType;
    .locals 1

    const-class v0, Lcom/swmansion/reanimated/sensor/ReanimatedSensorType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/swmansion/reanimated/sensor/ReanimatedSensorType;

    return-object p0
.end method

.method public static values()[Lcom/swmansion/reanimated/sensor/ReanimatedSensorType;
    .locals 1

    sget-object v0, Lcom/swmansion/reanimated/sensor/ReanimatedSensorType;->$VALUES:[Lcom/swmansion/reanimated/sensor/ReanimatedSensorType;

    invoke-virtual {v0}, [Lcom/swmansion/reanimated/sensor/ReanimatedSensorType;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/swmansion/reanimated/sensor/ReanimatedSensorType;

    return-object v0
.end method


# virtual methods
.method public getType()I
    .locals 1

    iget v0, p0, Lcom/swmansion/reanimated/sensor/ReanimatedSensorType;->type:I

    return v0
.end method
