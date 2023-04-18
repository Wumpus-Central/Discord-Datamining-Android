.class public Le0/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le0/n;


# instance fields
.field private final a:I

.field private b:Landroidx/camera/extensions/impl/PreviewExtenderImpl;

.field private c:Landroidx/camera/extensions/impl/ImageCaptureExtenderImpl;

.field private d:Landroidx/camera/core/r;


# direct methods
.method public constructor <init>(I)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Le0/g;->a:I

    .line 5
    .line 6
    const/4 v0, 0x1

    .line 7
    if-eq p1, v0, :cond_4

    .line 8
    .line 9
    const/4 v0, 0x2

    .line 10
    if-eq p1, v0, :cond_3

    .line 11
    .line 12
    const/4 v0, 0x3

    .line 13
    if-eq p1, v0, :cond_2

    .line 14
    .line 15
    const/4 v0, 0x4

    .line 16
    if-eq p1, v0, :cond_1

    .line 17
    .line 18
    const/4 v0, 0x5

    .line 19
    if-ne p1, v0, :cond_0

    .line 20
    .line 21
    :try_start_0
    new-instance v0, Landroidx/camera/extensions/impl/AutoPreviewExtenderImpl;

    .line 22
    .line 23
    invoke-direct {v0}, Landroidx/camera/extensions/impl/AutoPreviewExtenderImpl;-><init>()V

    .line 24
    .line 25
    .line 26
    iput-object v0, p0, Le0/g;->b:Landroidx/camera/extensions/impl/PreviewExtenderImpl;

    .line 27
    .line 28
    new-instance v0, Landroidx/camera/extensions/impl/AutoImageCaptureExtenderImpl;

    .line 29
    .line 30
    invoke-direct {v0}, Landroidx/camera/extensions/impl/AutoImageCaptureExtenderImpl;-><init>()V

    .line 31
    .line 32
    .line 33
    iput-object v0, p0, Le0/g;->c:Landroidx/camera/extensions/impl/ImageCaptureExtenderImpl;

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 37
    .line 38
    const-string v1, "Should not activate ExtensionMode.NONE"

    .line 39
    .line 40
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    throw v0

    .line 44
    :cond_1
    new-instance v0, Landroidx/camera/extensions/impl/BeautyPreviewExtenderImpl;

    .line 45
    .line 46
    invoke-direct {v0}, Landroidx/camera/extensions/impl/BeautyPreviewExtenderImpl;-><init>()V

    .line 47
    .line 48
    .line 49
    iput-object v0, p0, Le0/g;->b:Landroidx/camera/extensions/impl/PreviewExtenderImpl;

    .line 50
    .line 51
    new-instance v0, Landroidx/camera/extensions/impl/BeautyImageCaptureExtenderImpl;

    .line 52
    .line 53
    invoke-direct {v0}, Landroidx/camera/extensions/impl/BeautyImageCaptureExtenderImpl;-><init>()V

    .line 54
    .line 55
    .line 56
    iput-object v0, p0, Le0/g;->c:Landroidx/camera/extensions/impl/ImageCaptureExtenderImpl;

    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_2
    new-instance v0, Landroidx/camera/extensions/impl/NightPreviewExtenderImpl;

    .line 60
    .line 61
    invoke-direct {v0}, Landroidx/camera/extensions/impl/NightPreviewExtenderImpl;-><init>()V

    .line 62
    .line 63
    .line 64
    iput-object v0, p0, Le0/g;->b:Landroidx/camera/extensions/impl/PreviewExtenderImpl;

    .line 65
    .line 66
    new-instance v0, Landroidx/camera/extensions/impl/NightImageCaptureExtenderImpl;

    .line 67
    .line 68
    invoke-direct {v0}, Landroidx/camera/extensions/impl/NightImageCaptureExtenderImpl;-><init>()V

    .line 69
    .line 70
    .line 71
    iput-object v0, p0, Le0/g;->c:Landroidx/camera/extensions/impl/ImageCaptureExtenderImpl;

    .line 72
    .line 73
    goto :goto_0

    .line 74
    :cond_3
    new-instance v0, Landroidx/camera/extensions/impl/HdrPreviewExtenderImpl;

    .line 75
    .line 76
    invoke-direct {v0}, Landroidx/camera/extensions/impl/HdrPreviewExtenderImpl;-><init>()V

    .line 77
    .line 78
    .line 79
    iput-object v0, p0, Le0/g;->b:Landroidx/camera/extensions/impl/PreviewExtenderImpl;

    .line 80
    .line 81
    new-instance v0, Landroidx/camera/extensions/impl/HdrImageCaptureExtenderImpl;

    .line 82
    .line 83
    invoke-direct {v0}, Landroidx/camera/extensions/impl/HdrImageCaptureExtenderImpl;-><init>()V

    .line 84
    .line 85
    .line 86
    iput-object v0, p0, Le0/g;->c:Landroidx/camera/extensions/impl/ImageCaptureExtenderImpl;

    .line 87
    .line 88
    goto :goto_0

    .line 89
    :cond_4
    new-instance v0, Landroidx/camera/extensions/impl/BokehPreviewExtenderImpl;

    .line 90
    .line 91
    invoke-direct {v0}, Landroidx/camera/extensions/impl/BokehPreviewExtenderImpl;-><init>()V

    .line 92
    .line 93
    .line 94
    iput-object v0, p0, Le0/g;->b:Landroidx/camera/extensions/impl/PreviewExtenderImpl;

    .line 95
    .line 96
    new-instance v0, Landroidx/camera/extensions/impl/BokehImageCaptureExtenderImpl;

    .line 97
    .line 98
    invoke-direct {v0}, Landroidx/camera/extensions/impl/BokehImageCaptureExtenderImpl;-><init>()V

    .line 99
    .line 100
    .line 101
    iput-object v0, p0, Le0/g;->c:Landroidx/camera/extensions/impl/ImageCaptureExtenderImpl;
    :try_end_0
    .catch Ljava/lang/NoClassDefFoundError; {:try_start_0 .. :try_end_0} :catch_0

    .line 102
    .line 103
    goto :goto_0

    .line 104
    :catch_0
    invoke-direct {p0}, Le0/g;->g()Landroidx/camera/extensions/impl/PreviewExtenderImpl;

    .line 105
    .line 106
    .line 107
    move-result-object v0

    .line 108
    iput-object v0, p0, Le0/g;->b:Landroidx/camera/extensions/impl/PreviewExtenderImpl;

    .line 109
    .line 110
    invoke-direct {p0}, Le0/g;->f()Landroidx/camera/extensions/impl/ImageCaptureExtenderImpl;

    .line 111
    .line 112
    .line 113
    move-result-object v0

    .line 114
    iput-object v0, p0, Le0/g;->c:Landroidx/camera/extensions/impl/ImageCaptureExtenderImpl;

    .line 115
    .line 116
    new-instance v0, Ljava/lang/StringBuilder;

    .line 117
    .line 118
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 119
    .line 120
    .line 121
    const-string v1, "OEM implementation for extension mode "

    .line 122
    .line 123
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 124
    .line 125
    .line 126
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 127
    .line 128
    .line 129
    const-string p1, "does not exist!"

    .line 130
    .line 131
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 132
    .line 133
    .line 134
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 135
    .line 136
    .line 137
    move-result-object p1

    .line 138
    const-string v0, "BasicVendorExtender"

    .line 139
    .line 140
    invoke-static {v0, p1}, Landroidx/camera/core/r1;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 141
    .line 142
    .line 143
    :goto_0
    return-void
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

.method private f()Landroidx/camera/extensions/impl/ImageCaptureExtenderImpl;
    .locals 1

    new-instance v0, Le0/g$b;

    invoke-direct {v0, p0}, Le0/g$b;-><init>(Le0/g;)V

    return-object v0
.end method

.method private g()Landroidx/camera/extensions/impl/PreviewExtenderImpl;
    .locals 1

    new-instance v0, Le0/g$a;

    invoke-direct {v0, p0}, Le0/g$a;-><init>(Le0/g;)V

    return-object v0
.end method

.method private h()I
    .locals 1

    iget-object v0, p0, Le0/g;->c:Landroidx/camera/extensions/impl/ImageCaptureExtenderImpl;

    invoke-interface {v0}, Landroidx/camera/extensions/impl/ImageCaptureExtenderImpl;->getCaptureProcessor()Landroidx/camera/extensions/impl/CaptureProcessorImpl;

    move-result-object v0

    if-eqz v0, :cond_0

    const/16 v0, 0x23

    return v0

    :cond_0
    const/16 v0, 0x100

    return v0
.end method

.method private j(I)[Landroid/util/Size;
    .locals 2

    .line 1
    iget-object v0, p0, Le0/g;->d:Landroidx/camera/core/r;

    .line 2
    .line 3
    invoke-static {v0}, Lv/h;->b(Landroidx/camera/core/r;)Lv/h;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sget-object v1, Landroid/hardware/camera2/CameraCharacteristics;->SCALER_STREAM_CONFIGURATION_MAP:Landroid/hardware/camera2/CameraCharacteristics$Key;

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Lv/h;->c(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    check-cast v0, Landroid/hardware/camera2/params/StreamConfigurationMap;

    .line 14
    .line 15
    invoke-virtual {v0, p1}, Landroid/hardware/camera2/params/StreamConfigurationMap;->getOutputSizes(I)[Landroid/util/Size;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    return-object p1
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
.end method

.method private l()I
    .locals 2

    iget-object v0, p0, Le0/g;->b:Landroidx/camera/extensions/impl/PreviewExtenderImpl;

    invoke-interface {v0}, Landroidx/camera/extensions/impl/PreviewExtenderImpl;->getProcessorType()Landroidx/camera/extensions/impl/PreviewExtenderImpl$ProcessorType;

    move-result-object v0

    sget-object v1, Landroidx/camera/extensions/impl/PreviewExtenderImpl$ProcessorType;->PROCESSOR_TYPE_IMAGE_PROCESSOR:Landroidx/camera/extensions/impl/PreviewExtenderImpl$ProcessorType;

    if-ne v0, v1, :cond_0

    const/16 v0, 0x23

    return v0

    :cond_0
    const/16 v0, 0x22

    return v0
.end method


# virtual methods
.method public a()Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Landroid/util/Pair<",
            "Ljava/lang/Integer;",
            "[",
            "Landroid/util/Size;",
            ">;>;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Le0/g;->d:Landroidx/camera/core/r;

    .line 2
    .line 3
    const-string v1, "VendorExtender#init() must be called first"

    .line 4
    .line 5
    invoke-static {v0, v1}, Landroidx/core/util/g;->h(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    invoke-static {}, Le0/j;->b()Le0/o;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    sget-object v1, Le0/o;->l:Le0/o;

    .line 13
    .line 14
    invoke-virtual {v0, v1}, Le0/o;->a(Le0/o;)I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-ltz v0, :cond_0

    .line 19
    .line 20
    :try_start_0
    iget-object v0, p0, Le0/g;->c:Landroidx/camera/extensions/impl/ImageCaptureExtenderImpl;

    .line 21
    .line 22
    invoke-interface {v0}, Landroidx/camera/extensions/impl/ImageCaptureExtenderImpl;->getSupportedResolutions()Ljava/util/List;

    .line 23
    .line 24
    .line 25
    move-result-object v0
    :try_end_0
    .catch Ljava/lang/NoSuchMethodError; {:try_start_0 .. :try_end_0} :catch_0

    .line 26
    if-eqz v0, :cond_0

    .line 27
    .line 28
    return-object v0

    .line 29
    :catch_0
    :cond_0
    invoke-direct {p0}, Le0/g;->h()I

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    const/4 v1, 0x1

    .line 34
    new-array v1, v1, [Landroid/util/Pair;

    .line 35
    .line 36
    new-instance v2, Landroid/util/Pair;

    .line 37
    .line 38
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 39
    .line 40
    .line 41
    move-result-object v3

    .line 42
    invoke-direct {p0, v0}, Le0/g;->j(I)[Landroid/util/Size;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    invoke-direct {v2, v3, v0}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    const/4 v0, 0x0

    .line 50
    aput-object v2, v1, v0

    .line 51
    .line 52
    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    return-object v0
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
.end method

.method public b(Ljava/lang/String;Ljava/util/Map;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Landroid/hardware/camera2/CameraCharacteristics;",
            ">;)Z"
        }
    .end annotation

    .line 1
    invoke-interface {p2, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    check-cast p2, Landroid/hardware/camera2/CameraCharacteristics;

    .line 6
    .line 7
    iget-object v0, p0, Le0/g;->b:Landroidx/camera/extensions/impl/PreviewExtenderImpl;

    .line 8
    .line 9
    invoke-interface {v0, p1, p2}, Landroidx/camera/extensions/impl/PreviewExtenderImpl;->isExtensionAvailable(Ljava/lang/String;Landroid/hardware/camera2/CameraCharacteristics;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    iget-object v0, p0, Le0/g;->c:Landroidx/camera/extensions/impl/ImageCaptureExtenderImpl;

    .line 16
    .line 17
    invoke-interface {v0, p1, p2}, Landroidx/camera/extensions/impl/ImageCaptureExtenderImpl;->isExtensionAvailable(Ljava/lang/String;Landroid/hardware/camera2/CameraCharacteristics;)Z

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    if-eqz p1, :cond_0

    .line 22
    .line 23
    const/4 p1, 0x1

    .line 24
    goto :goto_0

    .line 25
    :cond_0
    const/4 p1, 0x0

    .line 26
    :goto_0
    return p1
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
.end method

.method public c()Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Landroid/util/Pair<",
            "Ljava/lang/Integer;",
            "[",
            "Landroid/util/Size;",
            ">;>;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Le0/g;->d:Landroidx/camera/core/r;

    .line 2
    .line 3
    const-string v1, "VendorExtender#init() must be called first"

    .line 4
    .line 5
    invoke-static {v0, v1}, Landroidx/core/util/g;->h(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    invoke-static {}, Le0/j;->b()Le0/o;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    sget-object v1, Le0/o;->l:Le0/o;

    .line 13
    .line 14
    invoke-virtual {v0, v1}, Le0/o;->a(Le0/o;)I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-ltz v0, :cond_0

    .line 19
    .line 20
    :try_start_0
    iget-object v0, p0, Le0/g;->b:Landroidx/camera/extensions/impl/PreviewExtenderImpl;

    .line 21
    .line 22
    invoke-interface {v0}, Landroidx/camera/extensions/impl/PreviewExtenderImpl;->getSupportedResolutions()Ljava/util/List;

    .line 23
    .line 24
    .line 25
    move-result-object v0
    :try_end_0
    .catch Ljava/lang/NoSuchMethodError; {:try_start_0 .. :try_end_0} :catch_0

    .line 26
    if-eqz v0, :cond_0

    .line 27
    .line 28
    return-object v0

    .line 29
    :catch_0
    :cond_0
    invoke-direct {p0}, Le0/g;->l()I

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    const/4 v1, 0x1

    .line 34
    new-array v1, v1, [Landroid/util/Pair;

    .line 35
    .line 36
    new-instance v2, Landroid/util/Pair;

    .line 37
    .line 38
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 39
    .line 40
    .line 41
    move-result-object v3

    .line 42
    invoke-direct {p0, v0}, Le0/g;->j(I)[Landroid/util/Size;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    invoke-direct {v2, v3, v0}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    const/4 v0, 0x0

    .line 50
    aput-object v2, v1, v0

    .line 51
    .line 52
    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    return-object v0
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
.end method

.method public d(Landroid/content/Context;)Lw/l2;
    .locals 1

    iget-object p1, p0, Le0/g;->d:Landroidx/camera/core/r;

    const-string v0, "VendorExtender#init() must be called first"

    invoke-static {p1, v0}, Landroidx/core/util/g;->h(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 p1, 0x0

    return-object p1
.end method

.method public e(Landroidx/camera/core/r;)V
    .locals 2

    .line 1
    iput-object p1, p0, Le0/g;->d:Landroidx/camera/core/r;

    .line 2
    .line 3
    invoke-static {p1}, Lv/h;->b(Landroidx/camera/core/r;)Lv/h;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Lv/h;->e()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-static {p1}, Lv/h;->a(Landroidx/camera/core/r;)Landroid/hardware/camera2/CameraCharacteristics;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    iget-object v1, p0, Le0/g;->b:Landroidx/camera/extensions/impl/PreviewExtenderImpl;

    .line 16
    .line 17
    invoke-interface {v1, v0, p1}, Landroidx/camera/extensions/impl/PreviewExtenderImpl;->init(Ljava/lang/String;Landroid/hardware/camera2/CameraCharacteristics;)V

    .line 18
    .line 19
    .line 20
    iget-object v1, p0, Le0/g;->c:Landroidx/camera/extensions/impl/ImageCaptureExtenderImpl;

    .line 21
    .line 22
    invoke-interface {v1, v0, p1}, Landroidx/camera/extensions/impl/ImageCaptureExtenderImpl;->init(Ljava/lang/String;Landroid/hardware/camera2/CameraCharacteristics;)V

    .line 23
    .line 24
    .line 25
    new-instance p1, Ljava/lang/StringBuilder;

    .line 26
    .line 27
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 28
    .line 29
    .line 30
    const-string v0, "Extension init Mode = "

    .line 31
    .line 32
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    iget v0, p0, Le0/g;->a:I

    .line 36
    .line 37
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    const-string v0, "BasicVendorExtender"

    .line 45
    .line 46
    invoke-static {v0, p1}, Landroidx/camera/core/r1;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    new-instance p1, Ljava/lang/StringBuilder;

    .line 50
    .line 51
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 52
    .line 53
    .line 54
    const-string v1, "PreviewExtender processorType= "

    .line 55
    .line 56
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    iget-object v1, p0, Le0/g;->b:Landroidx/camera/extensions/impl/PreviewExtenderImpl;

    .line 60
    .line 61
    invoke-interface {v1}, Landroidx/camera/extensions/impl/PreviewExtenderImpl;->getProcessorType()Landroidx/camera/extensions/impl/PreviewExtenderImpl$ProcessorType;

    .line 62
    .line 63
    .line 64
    move-result-object v1

    .line 65
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    invoke-static {v0, p1}, Landroidx/camera/core/r1;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    new-instance p1, Ljava/lang/StringBuilder;

    .line 76
    .line 77
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 78
    .line 79
    .line 80
    const-string v1, "ImageCaptureExtender processor= "

    .line 81
    .line 82
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 83
    .line 84
    .line 85
    iget-object v1, p0, Le0/g;->c:Landroidx/camera/extensions/impl/ImageCaptureExtenderImpl;

    .line 86
    .line 87
    invoke-interface {v1}, Landroidx/camera/extensions/impl/ImageCaptureExtenderImpl;->getCaptureProcessor()Landroidx/camera/extensions/impl/CaptureProcessorImpl;

    .line 88
    .line 89
    .line 90
    move-result-object v1

    .line 91
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 92
    .line 93
    .line 94
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object p1

    .line 98
    invoke-static {v0, p1}, Landroidx/camera/core/r1;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 99
    .line 100
    .line 101
    return-void
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

.method public i()Landroidx/camera/extensions/impl/ImageCaptureExtenderImpl;
    .locals 1

    iget-object v0, p0, Le0/g;->c:Landroidx/camera/extensions/impl/ImageCaptureExtenderImpl;

    return-object v0
.end method

.method public k()Landroidx/camera/extensions/impl/PreviewExtenderImpl;
    .locals 1

    iget-object v0, p0, Le0/g;->b:Landroidx/camera/extensions/impl/PreviewExtenderImpl;

    return-object v0
.end method
