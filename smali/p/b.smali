.class public final Lp/b;
.super Lv/k;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lp/b$b;,
        Lp/b$a;
    }
.end annotation


# static fields
.field public static final A:Lw/r0$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lw/r0$a<",
            "Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;",
            ">;"
        }
    .end annotation
.end field

.field public static final B:Lw/r0$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lw/r0$a<",
            "Lp/d;",
            ">;"
        }
    .end annotation
.end field

.field public static final C:Lw/r0$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lw/r0$a<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field public static final D:Lw/r0$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lw/r0$a<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public static final x:Lw/r0$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lw/r0$a<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public static final y:Lw/r0$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lw/r0$a<",
            "Landroid/hardware/camera2/CameraDevice$StateCallback;",
            ">;"
        }
    .end annotation
.end field

.field public static final z:Lw/r0$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lw/r0$a<",
            "Landroid/hardware/camera2/CameraCaptureSession$StateCallback;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    const-string v0, "camera2.captureRequest.templateType"

    .line 2
    .line 3
    sget-object v1, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 4
    .line 5
    invoke-static {v0, v1}, Lw/r0$a;->a(Ljava/lang/String;Ljava/lang/Class;)Lw/r0$a;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    sput-object v0, Lp/b;->x:Lw/r0$a;

    .line 10
    .line 11
    const-string v0, "camera2.cameraDevice.stateCallback"

    .line 12
    .line 13
    const-class v1, Landroid/hardware/camera2/CameraDevice$StateCallback;

    .line 14
    .line 15
    invoke-static {v0, v1}, Lw/r0$a;->a(Ljava/lang/String;Ljava/lang/Class;)Lw/r0$a;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    sput-object v0, Lp/b;->y:Lw/r0$a;

    .line 20
    .line 21
    const-string v0, "camera2.cameraCaptureSession.stateCallback"

    .line 22
    .line 23
    const-class v1, Landroid/hardware/camera2/CameraCaptureSession$StateCallback;

    .line 24
    .line 25
    invoke-static {v0, v1}, Lw/r0$a;->a(Ljava/lang/String;Ljava/lang/Class;)Lw/r0$a;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    sput-object v0, Lp/b;->z:Lw/r0$a;

    .line 30
    .line 31
    const-string v0, "camera2.cameraCaptureSession.captureCallback"

    .line 32
    .line 33
    const-class v1, Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;

    .line 34
    .line 35
    invoke-static {v0, v1}, Lw/r0$a;->a(Ljava/lang/String;Ljava/lang/Class;)Lw/r0$a;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    sput-object v0, Lp/b;->A:Lw/r0$a;

    .line 40
    .line 41
    const-string v0, "camera2.cameraEvent.callback"

    .line 42
    .line 43
    const-class v1, Lp/d;

    .line 44
    .line 45
    invoke-static {v0, v1}, Lw/r0$a;->a(Ljava/lang/String;Ljava/lang/Class;)Lw/r0$a;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    sput-object v0, Lp/b;->B:Lw/r0$a;

    .line 50
    .line 51
    const-string v0, "camera2.captureRequest.tag"

    .line 52
    .line 53
    const-class v1, Ljava/lang/Object;

    .line 54
    .line 55
    invoke-static {v0, v1}, Lw/r0$a;->a(Ljava/lang/String;Ljava/lang/Class;)Lw/r0$a;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    sput-object v0, Lp/b;->C:Lw/r0$a;

    .line 60
    .line 61
    const-string v0, "camera2.cameraCaptureSession.physicalCameraId"

    .line 62
    .line 63
    const-class v1, Ljava/lang/String;

    .line 64
    .line 65
    invoke-static {v0, v1}, Lw/r0$a;->a(Ljava/lang/String;Ljava/lang/Class;)Lw/r0$a;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    sput-object v0, Lp/b;->D:Lw/r0$a;

    .line 70
    .line 71
    return-void
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
.end method

.method public constructor <init>(Lw/r0;)V
    .locals 0

    invoke-direct {p0, p1}, Lv/k;-><init>(Lw/r0;)V

    return-void
.end method

.method public static F(Landroid/hardware/camera2/CaptureRequest$Key;)Lw/r0$a;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/hardware/camera2/CaptureRequest$Key<",
            "*>;)",
            "Lw/r0$a<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "camera2.captureRequest.option."

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Landroid/hardware/camera2/CaptureRequest$Key;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-class v1, Ljava/lang/Object;

    invoke-static {v0, v1, p0}, Lw/r0$a;->b(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Object;)Lw/r0$a;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public G(Lp/d;)Lp/d;
    .locals 2

    invoke-virtual {p0}, Lv/k;->j()Lw/r0;

    move-result-object v0

    sget-object v1, Lp/b;->B:Lw/r0$a;

    invoke-interface {v0, v1, p1}, Lw/r0;->a(Lw/r0$a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lp/d;

    return-object p1
.end method

.method public H()Lv/k;
    .locals 1

    invoke-virtual {p0}, Lv/k;->j()Lw/r0;

    move-result-object v0

    invoke-static {v0}, Lv/k$a;->e(Lw/r0;)Lv/k$a;

    move-result-object v0

    invoke-virtual {v0}, Lv/k$a;->d()Lv/k;

    move-result-object v0

    return-object v0
.end method

.method public I(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    invoke-virtual {p0}, Lv/k;->j()Lw/r0;

    move-result-object v0

    sget-object v1, Lp/b;->C:Lw/r0$a;

    invoke-interface {v0, v1, p1}, Lw/r0;->a(Lw/r0$a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public J(I)I
    .locals 2

    invoke-virtual {p0}, Lv/k;->j()Lw/r0;

    move-result-object v0

    sget-object v1, Lp/b;->x:Lw/r0$a;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {v0, v1, p1}, Lw/r0;->a(Lw/r0$a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    return p1
.end method

.method public K(Landroid/hardware/camera2/CameraDevice$StateCallback;)Landroid/hardware/camera2/CameraDevice$StateCallback;
    .locals 2

    invoke-virtual {p0}, Lv/k;->j()Lw/r0;

    move-result-object v0

    sget-object v1, Lp/b;->y:Lw/r0$a;

    invoke-interface {v0, v1, p1}, Lw/r0;->a(Lw/r0$a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/hardware/camera2/CameraDevice$StateCallback;

    return-object p1
.end method

.method public L(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    invoke-virtual {p0}, Lv/k;->j()Lw/r0;

    move-result-object v0

    sget-object v1, Lp/b;->D:Lw/r0$a;

    invoke-interface {v0, v1, p1}, Lw/r0;->a(Lw/r0$a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    return-object p1
.end method

.method public M(Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;)Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;
    .locals 2

    invoke-virtual {p0}, Lv/k;->j()Lw/r0;

    move-result-object v0

    sget-object v1, Lp/b;->A:Lw/r0$a;

    invoke-interface {v0, v1, p1}, Lw/r0;->a(Lw/r0$a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;

    return-object p1
.end method

.method public N(Landroid/hardware/camera2/CameraCaptureSession$StateCallback;)Landroid/hardware/camera2/CameraCaptureSession$StateCallback;
    .locals 2

    invoke-virtual {p0}, Lv/k;->j()Lw/r0;

    move-result-object v0

    sget-object v1, Lp/b;->z:Lw/r0$a;

    invoke-interface {v0, v1, p1}, Lw/r0;->a(Lw/r0$a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/hardware/camera2/CameraCaptureSession$StateCallback;

    return-object p1
.end method
