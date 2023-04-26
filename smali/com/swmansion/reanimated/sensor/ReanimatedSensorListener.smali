.class public Lcom/swmansion/reanimated/sensor/ReanimatedSensorListener;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/hardware/SensorEventListener;


# instance fields
.field private final interval:D

.field private lastRead:D

.field private orientation:[F

.field private quaternion:[F

.field private rotation:[F

.field private setter:Lcom/swmansion/reanimated/NativeProxy$SensorSetter;


# direct methods
.method constructor <init>(Lcom/swmansion/reanimated/NativeProxy$SensorSetter;D)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 5
    .line 6
    .line 7
    move-result-wide v0

    .line 8
    long-to-double v0, v0

    .line 9
    iput-wide v0, p0, Lcom/swmansion/reanimated/sensor/ReanimatedSensorListener;->lastRead:D

    .line 10
    .line 11
    const/16 v0, 0x9

    .line 12
    .line 13
    new-array v0, v0, [F

    .line 14
    .line 15
    iput-object v0, p0, Lcom/swmansion/reanimated/sensor/ReanimatedSensorListener;->rotation:[F

    .line 16
    .line 17
    const/4 v0, 0x3

    .line 18
    new-array v0, v0, [F

    .line 19
    .line 20
    iput-object v0, p0, Lcom/swmansion/reanimated/sensor/ReanimatedSensorListener;->orientation:[F

    .line 21
    .line 22
    const/4 v0, 0x4

    .line 23
    new-array v0, v0, [F

    .line 24
    .line 25
    iput-object v0, p0, Lcom/swmansion/reanimated/sensor/ReanimatedSensorListener;->quaternion:[F

    .line 26
    .line 27
    iput-object p1, p0, Lcom/swmansion/reanimated/sensor/ReanimatedSensorListener;->setter:Lcom/swmansion/reanimated/NativeProxy$SensorSetter;

    .line 28
    .line 29
    iput-wide p2, p0, Lcom/swmansion/reanimated/sensor/ReanimatedSensorListener;->interval:D

    .line 30
    .line 31
    return-void
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
.end method


# virtual methods
.method public onAccuracyChanged(Landroid/hardware/Sensor;I)V
    .locals 0

    return-void
.end method

.method public onSensorChanged(Landroid/hardware/SensorEvent;)V
    .locals 6

    .line 1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    long-to-double v0, v0

    .line 6
    iget-wide v2, p0, Lcom/swmansion/reanimated/sensor/ReanimatedSensorListener;->lastRead:D

    .line 7
    .line 8
    sub-double v2, v0, v2

    .line 9
    .line 10
    iget-wide v4, p0, Lcom/swmansion/reanimated/sensor/ReanimatedSensorListener;->interval:D

    .line 11
    .line 12
    cmpg-double v2, v2, v4

    .line 13
    .line 14
    if-gez v2, :cond_0

    .line 15
    .line 16
    return-void

    .line 17
    :cond_0
    iget-object v2, p1, Landroid/hardware/SensorEvent;->sensor:Landroid/hardware/Sensor;

    .line 18
    .line 19
    invoke-virtual {v2}, Landroid/hardware/Sensor;->getType()I

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    iput-wide v0, p0, Lcom/swmansion/reanimated/sensor/ReanimatedSensorListener;->lastRead:D

    .line 24
    .line 25
    const/16 v0, 0xb

    .line 26
    .line 27
    if-ne v2, v0, :cond_1

    .line 28
    .line 29
    iget-object v0, p0, Lcom/swmansion/reanimated/sensor/ReanimatedSensorListener;->quaternion:[F

    .line 30
    .line 31
    iget-object v1, p1, Landroid/hardware/SensorEvent;->values:[F

    .line 32
    .line 33
    invoke-static {v0, v1}, Landroid/hardware/SensorManager;->getQuaternionFromVector([F[F)V

    .line 34
    .line 35
    .line 36
    iget-object v0, p0, Lcom/swmansion/reanimated/sensor/ReanimatedSensorListener;->rotation:[F

    .line 37
    .line 38
    iget-object p1, p1, Landroid/hardware/SensorEvent;->values:[F

    .line 39
    .line 40
    invoke-static {v0, p1}, Landroid/hardware/SensorManager;->getRotationMatrixFromVector([F[F)V

    .line 41
    .line 42
    .line 43
    iget-object p1, p0, Lcom/swmansion/reanimated/sensor/ReanimatedSensorListener;->rotation:[F

    .line 44
    .line 45
    iget-object v0, p0, Lcom/swmansion/reanimated/sensor/ReanimatedSensorListener;->orientation:[F

    .line 46
    .line 47
    invoke-static {p1, v0}, Landroid/hardware/SensorManager;->getOrientation([F[F)[F

    .line 48
    .line 49
    .line 50
    const/4 p1, 0x7

    .line 51
    new-array p1, p1, [F

    .line 52
    .line 53
    iget-object v0, p0, Lcom/swmansion/reanimated/sensor/ReanimatedSensorListener;->quaternion:[F

    .line 54
    .line 55
    const/4 v1, 0x1

    .line 56
    aget v2, v0, v1

    .line 57
    .line 58
    const/4 v3, 0x0

    .line 59
    aput v2, p1, v3

    .line 60
    .line 61
    const/4 v2, 0x2

    .line 62
    aget v4, v0, v2

    .line 63
    .line 64
    aput v4, p1, v1

    .line 65
    .line 66
    const/4 v4, 0x3

    .line 67
    aget v5, v0, v4

    .line 68
    .line 69
    aput v5, p1, v2

    .line 70
    .line 71
    aget v0, v0, v3

    .line 72
    .line 73
    aput v0, p1, v4

    .line 74
    .line 75
    iget-object v0, p0, Lcom/swmansion/reanimated/sensor/ReanimatedSensorListener;->orientation:[F

    .line 76
    .line 77
    aget v3, v0, v3

    .line 78
    .line 79
    const/4 v4, 0x4

    .line 80
    aput v3, p1, v4

    .line 81
    .line 82
    const/4 v3, 0x5

    .line 83
    aget v1, v0, v1

    .line 84
    .line 85
    aput v1, p1, v3

    .line 86
    .line 87
    const/4 v1, 0x6

    .line 88
    aget v0, v0, v2

    .line 89
    .line 90
    aput v0, p1, v1

    .line 91
    .line 92
    iget-object v0, p0, Lcom/swmansion/reanimated/sensor/ReanimatedSensorListener;->setter:Lcom/swmansion/reanimated/NativeProxy$SensorSetter;

    .line 93
    .line 94
    invoke-virtual {v0, p1}, Lcom/swmansion/reanimated/NativeProxy$SensorSetter;->sensorSetter([F)V

    .line 95
    .line 96
    .line 97
    goto :goto_0

    .line 98
    :cond_1
    iget-object v0, p0, Lcom/swmansion/reanimated/sensor/ReanimatedSensorListener;->setter:Lcom/swmansion/reanimated/NativeProxy$SensorSetter;

    .line 99
    .line 100
    iget-object p1, p1, Landroid/hardware/SensorEvent;->values:[F

    .line 101
    .line 102
    invoke-virtual {v0, p1}, Lcom/swmansion/reanimated/NativeProxy$SensorSetter;->sensorSetter([F)V

    .line 103
    .line 104
    .line 105
    :goto_0
    return-void
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
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
.end method
