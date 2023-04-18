.class public Lcom/swmansion/reanimated/sensor/ReanimatedSensor;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field interval:I

.field listener:Lcom/swmansion/reanimated/sensor/ReanimatedSensorListener;

.field sensor:Landroid/hardware/Sensor;

.field sensorManager:Landroid/hardware/SensorManager;

.field sensorType:Lcom/swmansion/reanimated/sensor/ReanimatedSensorType;


# direct methods
.method constructor <init>(Ljava/lang/ref/WeakReference;Lcom/swmansion/reanimated/sensor/ReanimatedSensorType;ILcom/swmansion/reanimated/NativeProxy$SensorSetter;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/ref/WeakReference<",
            "Lcom/facebook/react/bridge/ReactApplicationContext;",
            ">;",
            "Lcom/swmansion/reanimated/sensor/ReanimatedSensorType;",
            "I",
            "Lcom/swmansion/reanimated/NativeProxy$SensorSetter;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lcom/swmansion/reanimated/sensor/ReanimatedSensorListener;

    .line 5
    .line 6
    int-to-double v1, p3

    .line 7
    invoke-direct {v0, p4, v1, v2}, Lcom/swmansion/reanimated/sensor/ReanimatedSensorListener;-><init>(Lcom/swmansion/reanimated/NativeProxy$SensorSetter;D)V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lcom/swmansion/reanimated/sensor/ReanimatedSensor;->listener:Lcom/swmansion/reanimated/sensor/ReanimatedSensorListener;

    .line 11
    .line 12
    invoke-virtual {p1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p4

    .line 16
    check-cast p4, Lcom/facebook/react/bridge/ReactApplicationContext;

    .line 17
    .line 18
    invoke-virtual {p1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    check-cast p1, Lcom/facebook/react/bridge/ReactApplicationContext;

    .line 23
    .line 24
    const-string p1, "sensor"

    .line 25
    .line 26
    invoke-virtual {p4, p1}, Lcom/facebook/react/bridge/ReactContext;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    check-cast p1, Landroid/hardware/SensorManager;

    .line 31
    .line 32
    iput-object p1, p0, Lcom/swmansion/reanimated/sensor/ReanimatedSensor;->sensorManager:Landroid/hardware/SensorManager;

    .line 33
    .line 34
    iput-object p2, p0, Lcom/swmansion/reanimated/sensor/ReanimatedSensor;->sensorType:Lcom/swmansion/reanimated/sensor/ReanimatedSensorType;

    .line 35
    .line 36
    const/4 p1, -0x1

    .line 37
    if-ne p3, p1, :cond_0

    .line 38
    .line 39
    const/4 p1, 0x2

    .line 40
    iput p1, p0, Lcom/swmansion/reanimated/sensor/ReanimatedSensor;->interval:I

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_0
    iput p3, p0, Lcom/swmansion/reanimated/sensor/ReanimatedSensor;->interval:I

    .line 44
    .line 45
    :goto_0
    return-void
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
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
.end method


# virtual methods
.method cancel()V
    .locals 3

    iget-object v0, p0, Lcom/swmansion/reanimated/sensor/ReanimatedSensor;->sensorManager:Landroid/hardware/SensorManager;

    iget-object v1, p0, Lcom/swmansion/reanimated/sensor/ReanimatedSensor;->listener:Lcom/swmansion/reanimated/sensor/ReanimatedSensorListener;

    iget-object v2, p0, Lcom/swmansion/reanimated/sensor/ReanimatedSensor;->sensor:Landroid/hardware/Sensor;

    invoke-virtual {v0, v1, v2}, Landroid/hardware/SensorManager;->unregisterListener(Landroid/hardware/SensorEventListener;Landroid/hardware/Sensor;)V

    return-void
.end method

.method initialize()Z
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/swmansion/reanimated/sensor/ReanimatedSensor;->sensorManager:Landroid/hardware/SensorManager;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/swmansion/reanimated/sensor/ReanimatedSensor;->sensorType:Lcom/swmansion/reanimated/sensor/ReanimatedSensorType;

    .line 4
    .line 5
    invoke-virtual {v1}, Lcom/swmansion/reanimated/sensor/ReanimatedSensorType;->getType()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    invoke-virtual {v0, v1}, Landroid/hardware/SensorManager;->getDefaultSensor(I)Landroid/hardware/Sensor;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iput-object v0, p0, Lcom/swmansion/reanimated/sensor/ReanimatedSensor;->sensor:Landroid/hardware/Sensor;

    .line 14
    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    iget-object v1, p0, Lcom/swmansion/reanimated/sensor/ReanimatedSensor;->sensorManager:Landroid/hardware/SensorManager;

    .line 18
    .line 19
    iget-object v2, p0, Lcom/swmansion/reanimated/sensor/ReanimatedSensor;->listener:Lcom/swmansion/reanimated/sensor/ReanimatedSensorListener;

    .line 20
    .line 21
    iget v3, p0, Lcom/swmansion/reanimated/sensor/ReanimatedSensor;->interval:I

    .line 22
    .line 23
    mul-int/lit16 v3, v3, 0x3e8

    .line 24
    .line 25
    invoke-virtual {v1, v2, v0, v3}, Landroid/hardware/SensorManager;->registerListener(Landroid/hardware/SensorEventListener;Landroid/hardware/Sensor;I)Z

    .line 26
    .line 27
    .line 28
    const/4 v0, 0x1

    .line 29
    return v0

    .line 30
    :cond_0
    const/4 v0, 0x0

    .line 31
    return v0
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
.end method
