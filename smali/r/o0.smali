.class Lr/o0;
.super Lr/l0;
.source "SourceFile"


# direct methods
.method constructor <init>(Landroid/hardware/camera2/CameraDevice;Ljava/lang/Object;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lr/l0;-><init>(Landroid/hardware/camera2/CameraDevice;Ljava/lang/Object;)V

    return-void
.end method

.method static g(Landroid/hardware/camera2/CameraDevice;Landroid/os/Handler;)Lr/o0;
    .locals 2

    new-instance v0, Lr/o0;

    new-instance v1, Lr/r0$a;

    invoke-direct {v1, p1}, Lr/r0$a;-><init>(Landroid/os/Handler;)V

    invoke-direct {v0, p0, v1}, Lr/o0;-><init>(Landroid/hardware/camera2/CameraDevice;Ljava/lang/Object;)V

    return-object v0
.end method


# virtual methods
.method public a(Ls/q;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lr/r0;->a:Landroid/hardware/camera2/CameraDevice;

    .line 2
    .line 3
    invoke-static {v0, p1}, Lr/r0;->c(Landroid/hardware/camera2/CameraDevice;Ls/q;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Lr/j$c;

    .line 7
    .line 8
    invoke-virtual {p1}, Ls/q;->a()Ljava/util/concurrent/Executor;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-virtual {p1}, Ls/q;->e()Landroid/hardware/camera2/CameraCaptureSession$StateCallback;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    invoke-direct {v0, v1, v2}, Lr/j$c;-><init>(Ljava/util/concurrent/Executor;Landroid/hardware/camera2/CameraCaptureSession$StateCallback;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p1}, Ls/q;->c()Ljava/util/List;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    iget-object v2, p0, Lr/r0;->b:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast v2, Lr/r0$a;

    .line 26
    .line 27
    invoke-static {v2}, Landroidx/core/util/g;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    check-cast v2, Lr/r0$a;

    .line 32
    .line 33
    iget-object v2, v2, Lr/r0$a;->a:Landroid/os/Handler;

    .line 34
    .line 35
    invoke-virtual {p1}, Ls/q;->b()Ls/a;

    .line 36
    .line 37
    .line 38
    move-result-object v3

    .line 39
    if-eqz v3, :cond_0

    .line 40
    .line 41
    :try_start_0
    invoke-virtual {v3}, Ls/a;->a()Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    check-cast p1, Landroid/hardware/camera2/params/InputConfiguration;

    .line 46
    .line 47
    invoke-static {p1}, Landroidx/core/util/g;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    iget-object v3, p0, Lr/r0;->a:Landroid/hardware/camera2/CameraDevice;

    .line 51
    .line 52
    invoke-static {v1}, Ls/q;->g(Ljava/util/List;)Ljava/util/List;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    invoke-static {v3, p1, v1, v0, v2}, Lr/m0;->a(Landroid/hardware/camera2/CameraDevice;Landroid/hardware/camera2/params/InputConfiguration;Ljava/util/List;Landroid/hardware/camera2/CameraCaptureSession$StateCallback;Landroid/os/Handler;)V

    .line 57
    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_0
    invoke-virtual {p1}, Ls/q;->d()I

    .line 61
    .line 62
    .line 63
    move-result p1

    .line 64
    const/4 v3, 0x1

    .line 65
    if-ne p1, v3, :cond_1

    .line 66
    .line 67
    iget-object p1, p0, Lr/r0;->a:Landroid/hardware/camera2/CameraDevice;

    .line 68
    .line 69
    invoke-static {v1}, Lr/r0;->e(Ljava/util/List;)Ljava/util/List;

    .line 70
    .line 71
    .line 72
    move-result-object v1

    .line 73
    invoke-virtual {p1, v1, v0, v2}, Landroid/hardware/camera2/CameraDevice;->createConstrainedHighSpeedCaptureSession(Ljava/util/List;Landroid/hardware/camera2/CameraCaptureSession$StateCallback;Landroid/os/Handler;)V

    .line 74
    .line 75
    .line 76
    goto :goto_0

    .line 77
    :cond_1
    iget-object p1, p0, Lr/r0;->a:Landroid/hardware/camera2/CameraDevice;

    .line 78
    .line 79
    invoke-static {v1}, Ls/q;->g(Ljava/util/List;)Ljava/util/List;

    .line 80
    .line 81
    .line 82
    move-result-object v1

    .line 83
    invoke-static {p1, v1, v0, v2}, Lr/n0;->a(Landroid/hardware/camera2/CameraDevice;Ljava/util/List;Landroid/hardware/camera2/CameraCaptureSession$StateCallback;Landroid/os/Handler;)V
    :try_end_0
    .catch Landroid/hardware/camera2/CameraAccessException; {:try_start_0 .. :try_end_0} :catch_0

    .line 84
    .line 85
    .line 86
    :goto_0
    return-void

    .line 87
    :catch_0
    move-exception p1

    .line 88
    invoke-static {p1}, Lr/i;->e(Landroid/hardware/camera2/CameraAccessException;)Lr/i;

    .line 89
    .line 90
    .line 91
    move-result-object p1

    .line 92
    throw p1
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
.end method
