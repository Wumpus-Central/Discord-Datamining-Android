.class public final Landroidx/camera/core/impl/utils/k;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/camera/core/impl/utils/k$d;
    }
.end annotation


# static fields
.field private static final c:Ljava/lang/String; = "k"

.field private static final d:Ljava/lang/ThreadLocal;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ThreadLocal<",
            "Ljava/text/SimpleDateFormat;",
            ">;"
        }
    .end annotation
.end field

.field private static final e:Ljava/lang/ThreadLocal;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ThreadLocal<",
            "Ljava/text/SimpleDateFormat;",
            ">;"
        }
    .end annotation
.end field

.field private static final f:Ljava/lang/ThreadLocal;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ThreadLocal<",
            "Ljava/text/SimpleDateFormat;",
            ">;"
        }
    .end annotation
.end field

.field private static final g:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private static final h:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final a:Landroidx/exifinterface/media/a;

.field private b:Z


# direct methods
.method static constructor <clinit>()V
    .locals 11

    .line 1
    new-instance v0, Landroidx/camera/core/impl/utils/k$a;

    .line 2
    .line 3
    invoke-direct {v0}, Landroidx/camera/core/impl/utils/k$a;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Landroidx/camera/core/impl/utils/k;->d:Ljava/lang/ThreadLocal;

    .line 7
    .line 8
    new-instance v0, Landroidx/camera/core/impl/utils/k$b;

    .line 9
    .line 10
    invoke-direct {v0}, Landroidx/camera/core/impl/utils/k$b;-><init>()V

    .line 11
    .line 12
    .line 13
    sput-object v0, Landroidx/camera/core/impl/utils/k;->e:Ljava/lang/ThreadLocal;

    .line 14
    .line 15
    new-instance v0, Landroidx/camera/core/impl/utils/k$c;

    .line 16
    .line 17
    invoke-direct {v0}, Landroidx/camera/core/impl/utils/k$c;-><init>()V

    .line 18
    .line 19
    .line 20
    sput-object v0, Landroidx/camera/core/impl/utils/k;->f:Ljava/lang/ThreadLocal;

    .line 21
    .line 22
    invoke-static {}, Landroidx/camera/core/impl/utils/k;->e()Ljava/util/List;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    sput-object v0, Landroidx/camera/core/impl/utils/k;->g:Ljava/util/List;

    .line 27
    .line 28
    const-string v1, "ImageWidth"

    .line 29
    .line 30
    const-string v2, "ImageLength"

    .line 31
    .line 32
    const-string v3, "PixelXDimension"

    .line 33
    .line 34
    const-string v4, "PixelYDimension"

    .line 35
    .line 36
    const-string v5, "Compression"

    .line 37
    .line 38
    const-string v6, "JPEGInterchangeFormat"

    .line 39
    .line 40
    const-string v7, "JPEGInterchangeFormatLength"

    .line 41
    .line 42
    const-string v8, "ThumbnailImageLength"

    .line 43
    .line 44
    const-string v9, "ThumbnailImageWidth"

    .line 45
    .line 46
    const-string v10, "ThumbnailOrientation"

    .line 47
    .line 48
    filled-new-array/range {v1 .. v10}, [Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    sput-object v0, Landroidx/camera/core/impl/utils/k;->h:Ljava/util/List;

    .line 57
    .line 58
    return-void
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

.method private constructor <init>(Landroidx/exifinterface/media/a;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, Landroidx/camera/core/impl/utils/k;->b:Z

    .line 6
    .line 7
    iput-object p1, p0, Landroidx/camera/core/impl/utils/k;->a:Landroidx/exifinterface/media/a;

    .line 8
    .line 9
    return-void
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
.end method

.method private static a(Ljava/lang/String;)Ljava/util/Date;
    .locals 1

    sget-object v0, Landroidx/camera/core/impl/utils/k;->d:Ljava/lang/ThreadLocal;

    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/text/SimpleDateFormat;

    invoke-virtual {v0, p0}, Ljava/text/DateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;

    move-result-object p0

    return-object p0
.end method

.method private static b(Ljava/lang/String;)Ljava/util/Date;
    .locals 1

    sget-object v0, Landroidx/camera/core/impl/utils/k;->f:Ljava/lang/ThreadLocal;

    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/text/SimpleDateFormat;

    invoke-virtual {v0, p0}, Ljava/text/DateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;

    move-result-object p0

    return-object p0
.end method

.method private static c(Ljava/lang/String;)Ljava/util/Date;
    .locals 1

    sget-object v0, Landroidx/camera/core/impl/utils/k;->e:Ljava/lang/ThreadLocal;

    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/text/SimpleDateFormat;

    invoke-virtual {v0, p0}, Ljava/text/DateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;

    move-result-object p0

    return-object p0
.end method

.method public static d(Ljava/io/InputStream;)Landroidx/camera/core/impl/utils/k;
    .locals 2

    new-instance v0, Landroidx/camera/core/impl/utils/k;

    new-instance v1, Landroidx/exifinterface/media/a;

    invoke-direct {v1, p0}, Landroidx/exifinterface/media/a;-><init>(Ljava/io/InputStream;)V

    invoke-direct {v0, v1}, Landroidx/camera/core/impl/utils/k;-><init>(Landroidx/exifinterface/media/a;)V

    return-object v0
.end method

.method public static e()Ljava/util/List;
    .locals 153
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 1
    const-string v0, "ImageWidth"

    .line 2
    .line 3
    const-string v1, "ImageLength"

    .line 4
    .line 5
    const-string v2, "BitsPerSample"

    .line 6
    .line 7
    const-string v3, "Compression"

    .line 8
    .line 9
    const-string v4, "PhotometricInterpretation"

    .line 10
    .line 11
    const-string v5, "Orientation"

    .line 12
    .line 13
    const-string v6, "SamplesPerPixel"

    .line 14
    .line 15
    const-string v7, "PlanarConfiguration"

    .line 16
    .line 17
    const-string v8, "YCbCrSubSampling"

    .line 18
    .line 19
    const-string v9, "YCbCrPositioning"

    .line 20
    .line 21
    const-string v10, "XResolution"

    .line 22
    .line 23
    const-string v11, "YResolution"

    .line 24
    .line 25
    const-string v12, "ResolutionUnit"

    .line 26
    .line 27
    const-string v13, "StripOffsets"

    .line 28
    .line 29
    const-string v14, "RowsPerStrip"

    .line 30
    .line 31
    const-string v15, "StripByteCounts"

    .line 32
    .line 33
    const-string v16, "JPEGInterchangeFormat"

    .line 34
    .line 35
    const-string v17, "JPEGInterchangeFormatLength"

    .line 36
    .line 37
    const-string v18, "TransferFunction"

    .line 38
    .line 39
    const-string v19, "WhitePoint"

    .line 40
    .line 41
    const-string v20, "PrimaryChromaticities"

    .line 42
    .line 43
    const-string v21, "YCbCrCoefficients"

    .line 44
    .line 45
    const-string v22, "ReferenceBlackWhite"

    .line 46
    .line 47
    const-string v23, "DateTime"

    .line 48
    .line 49
    const-string v24, "ImageDescription"

    .line 50
    .line 51
    const-string v25, "Make"

    .line 52
    .line 53
    const-string v26, "Model"

    .line 54
    .line 55
    const-string v27, "Software"

    .line 56
    .line 57
    const-string v28, "Artist"

    .line 58
    .line 59
    const-string v29, "Copyright"

    .line 60
    .line 61
    const-string v30, "ExifVersion"

    .line 62
    .line 63
    const-string v31, "FlashpixVersion"

    .line 64
    .line 65
    const-string v32, "ColorSpace"

    .line 66
    .line 67
    const-string v33, "Gamma"

    .line 68
    .line 69
    const-string v34, "PixelXDimension"

    .line 70
    .line 71
    const-string v35, "PixelYDimension"

    .line 72
    .line 73
    const-string v36, "ComponentsConfiguration"

    .line 74
    .line 75
    const-string v37, "CompressedBitsPerPixel"

    .line 76
    .line 77
    const-string v38, "MakerNote"

    .line 78
    .line 79
    const-string v39, "UserComment"

    .line 80
    .line 81
    const-string v40, "RelatedSoundFile"

    .line 82
    .line 83
    const-string v41, "DateTimeOriginal"

    .line 84
    .line 85
    const-string v42, "DateTimeDigitized"

    .line 86
    .line 87
    const-string v43, "OffsetTime"

    .line 88
    .line 89
    const-string v44, "OffsetTimeOriginal"

    .line 90
    .line 91
    const-string v45, "OffsetTimeDigitized"

    .line 92
    .line 93
    const-string v46, "SubSecTime"

    .line 94
    .line 95
    const-string v47, "SubSecTimeOriginal"

    .line 96
    .line 97
    const-string v48, "SubSecTimeDigitized"

    .line 98
    .line 99
    const-string v49, "ExposureTime"

    .line 100
    .line 101
    const-string v50, "FNumber"

    .line 102
    .line 103
    const-string v51, "ExposureProgram"

    .line 104
    .line 105
    const-string v52, "SpectralSensitivity"

    .line 106
    .line 107
    const-string v53, "PhotographicSensitivity"

    .line 108
    .line 109
    const-string v54, "OECF"

    .line 110
    .line 111
    const-string v55, "SensitivityType"

    .line 112
    .line 113
    const-string v56, "StandardOutputSensitivity"

    .line 114
    .line 115
    const-string v57, "RecommendedExposureIndex"

    .line 116
    .line 117
    const-string v58, "ISOSpeed"

    .line 118
    .line 119
    const-string v59, "ISOSpeedLatitudeyyy"

    .line 120
    .line 121
    const-string v60, "ISOSpeedLatitudezzz"

    .line 122
    .line 123
    const-string v61, "ShutterSpeedValue"

    .line 124
    .line 125
    const-string v62, "ApertureValue"

    .line 126
    .line 127
    const-string v63, "BrightnessValue"

    .line 128
    .line 129
    const-string v64, "ExposureBiasValue"

    .line 130
    .line 131
    const-string v65, "MaxApertureValue"

    .line 132
    .line 133
    const-string v66, "SubjectDistance"

    .line 134
    .line 135
    const-string v67, "MeteringMode"

    .line 136
    .line 137
    const-string v68, "LightSource"

    .line 138
    .line 139
    const-string v69, "Flash"

    .line 140
    .line 141
    const-string v70, "SubjectArea"

    .line 142
    .line 143
    const-string v71, "FocalLength"

    .line 144
    .line 145
    const-string v72, "FlashEnergy"

    .line 146
    .line 147
    const-string v73, "SpatialFrequencyResponse"

    .line 148
    .line 149
    const-string v74, "FocalPlaneXResolution"

    .line 150
    .line 151
    const-string v75, "FocalPlaneYResolution"

    .line 152
    .line 153
    const-string v76, "FocalPlaneResolutionUnit"

    .line 154
    .line 155
    const-string v77, "SubjectLocation"

    .line 156
    .line 157
    const-string v78, "ExposureIndex"

    .line 158
    .line 159
    const-string v79, "SensingMethod"

    .line 160
    .line 161
    const-string v80, "FileSource"

    .line 162
    .line 163
    const-string v81, "SceneType"

    .line 164
    .line 165
    const-string v82, "CFAPattern"

    .line 166
    .line 167
    const-string v83, "CustomRendered"

    .line 168
    .line 169
    const-string v84, "ExposureMode"

    .line 170
    .line 171
    const-string v85, "WhiteBalance"

    .line 172
    .line 173
    const-string v86, "DigitalZoomRatio"

    .line 174
    .line 175
    const-string v87, "FocalLengthIn35mmFilm"

    .line 176
    .line 177
    const-string v88, "SceneCaptureType"

    .line 178
    .line 179
    const-string v89, "GainControl"

    .line 180
    .line 181
    const-string v90, "Contrast"

    .line 182
    .line 183
    const-string v91, "Saturation"

    .line 184
    .line 185
    const-string v92, "Sharpness"

    .line 186
    .line 187
    const-string v93, "DeviceSettingDescription"

    .line 188
    .line 189
    const-string v94, "SubjectDistanceRange"

    .line 190
    .line 191
    const-string v95, "ImageUniqueID"

    .line 192
    .line 193
    const-string v96, "CameraOwnerName"

    .line 194
    .line 195
    const-string v97, "BodySerialNumber"

    .line 196
    .line 197
    const-string v98, "LensSpecification"

    .line 198
    .line 199
    const-string v99, "LensMake"

    .line 200
    .line 201
    const-string v100, "LensModel"

    .line 202
    .line 203
    const-string v101, "LensSerialNumber"

    .line 204
    .line 205
    const-string v102, "GPSVersionID"

    .line 206
    .line 207
    const-string v103, "GPSLatitudeRef"

    .line 208
    .line 209
    const-string v104, "GPSLatitude"

    .line 210
    .line 211
    const-string v105, "GPSLongitudeRef"

    .line 212
    .line 213
    const-string v106, "GPSLongitude"

    .line 214
    .line 215
    const-string v107, "GPSAltitudeRef"

    .line 216
    .line 217
    const-string v108, "GPSAltitude"

    .line 218
    .line 219
    const-string v109, "GPSTimeStamp"

    .line 220
    .line 221
    const-string v110, "GPSSatellites"

    .line 222
    .line 223
    const-string v111, "GPSStatus"

    .line 224
    .line 225
    const-string v112, "GPSMeasureMode"

    .line 226
    .line 227
    const-string v113, "GPSDOP"

    .line 228
    .line 229
    const-string v114, "GPSSpeedRef"

    .line 230
    .line 231
    const-string v115, "GPSSpeed"

    .line 232
    .line 233
    const-string v116, "GPSTrackRef"

    .line 234
    .line 235
    const-string v117, "GPSTrack"

    .line 236
    .line 237
    const-string v118, "GPSImgDirectionRef"

    .line 238
    .line 239
    const-string v119, "GPSImgDirection"

    .line 240
    .line 241
    const-string v120, "GPSMapDatum"

    .line 242
    .line 243
    const-string v121, "GPSDestLatitudeRef"

    .line 244
    .line 245
    const-string v122, "GPSDestLatitude"

    .line 246
    .line 247
    const-string v123, "GPSDestLongitudeRef"

    .line 248
    .line 249
    const-string v124, "GPSDestLongitude"

    .line 250
    .line 251
    const-string v125, "GPSDestBearingRef"

    .line 252
    .line 253
    const-string v126, "GPSDestBearing"

    .line 254
    .line 255
    const-string v127, "GPSDestDistanceRef"

    .line 256
    .line 257
    const-string v128, "GPSDestDistance"

    .line 258
    .line 259
    const-string v129, "GPSProcessingMethod"

    .line 260
    .line 261
    const-string v130, "GPSAreaInformation"

    .line 262
    .line 263
    const-string v131, "GPSDateStamp"

    .line 264
    .line 265
    const-string v132, "GPSDifferential"

    .line 266
    .line 267
    const-string v133, "GPSHPositioningError"

    .line 268
    .line 269
    const-string v134, "InteroperabilityIndex"

    .line 270
    .line 271
    const-string v135, "ThumbnailImageLength"

    .line 272
    .line 273
    const-string v136, "ThumbnailImageWidth"

    .line 274
    .line 275
    const-string v137, "ThumbnailOrientation"

    .line 276
    .line 277
    const-string v138, "DNGVersion"

    .line 278
    .line 279
    const-string v139, "DefaultCropSize"

    .line 280
    .line 281
    const-string v140, "ThumbnailImage"

    .line 282
    .line 283
    const-string v141, "PreviewImageStart"

    .line 284
    .line 285
    const-string v142, "PreviewImageLength"

    .line 286
    .line 287
    const-string v143, "AspectFrame"

    .line 288
    .line 289
    const-string v144, "SensorBottomBorder"

    .line 290
    .line 291
    const-string v145, "SensorLeftBorder"

    .line 292
    .line 293
    const-string v146, "SensorRightBorder"

    .line 294
    .line 295
    const-string v147, "SensorTopBorder"

    .line 296
    .line 297
    const-string v148, "ISO"

    .line 298
    .line 299
    const-string v149, "JpgFromRaw"

    .line 300
    .line 301
    const-string v150, "Xmp"

    .line 302
    .line 303
    const-string v151, "NewSubfileType"

    .line 304
    .line 305
    const-string v152, "SubfileType"

    .line 306
    .line 307
    filled-new-array/range {v0 .. v152}, [Ljava/lang/String;

    .line 308
    .line 309
    .line 310
    move-result-object v0

    .line 311
    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 312
    .line 313
    .line 314
    move-result-object v0

    .line 315
    return-object v0
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    .line 1139
.end method

.method private o(Ljava/lang/String;)J
    .locals 2

    const-wide/16 v0, -0x1

    if-nez p1, :cond_0

    return-wide v0

    :cond_0
    :try_start_0
    invoke-static {p1}, Landroidx/camera/core/impl/utils/k;->b(Ljava/lang/String;)Ljava/util/Date;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/Date;->getTime()J

    move-result-wide v0
    :try_end_0
    .catch Ljava/text/ParseException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-wide v0
.end method

.method private p(Ljava/lang/String;Ljava/lang/String;)J
    .locals 2

    .line 1
    const-wide/16 v0, -0x1

    .line 2
    .line 3
    if-nez p1, :cond_0

    .line 4
    .line 5
    if-nez p2, :cond_0

    .line 6
    .line 7
    return-wide v0

    .line 8
    :cond_0
    if-nez p2, :cond_1

    .line 9
    .line 10
    :try_start_0
    invoke-static {p1}, Landroidx/camera/core/impl/utils/k;->a(Ljava/lang/String;)Ljava/util/Date;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    invoke-virtual {p1}, Ljava/util/Date;->getTime()J

    .line 15
    .line 16
    .line 17
    move-result-wide p1
    :try_end_0
    .catch Ljava/text/ParseException; {:try_start_0 .. :try_end_0} :catch_0

    .line 18
    return-wide p1

    .line 19
    :catch_0
    return-wide v0

    .line 20
    :cond_1
    if-nez p1, :cond_2

    .line 21
    .line 22
    :try_start_1
    invoke-static {p2}, Landroidx/camera/core/impl/utils/k;->c(Ljava/lang/String;)Ljava/util/Date;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    invoke-virtual {p1}, Ljava/util/Date;->getTime()J

    .line 27
    .line 28
    .line 29
    move-result-wide p1
    :try_end_1
    .catch Ljava/text/ParseException; {:try_start_1 .. :try_end_1} :catch_1

    .line 30
    return-wide p1

    .line 31
    :catch_1
    return-wide v0

    .line 32
    :cond_2
    new-instance v0, Ljava/lang/StringBuilder;

    .line 33
    .line 34
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    const-string p1, " "

    .line 41
    .line 42
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    invoke-direct {p0, p1}, Landroidx/camera/core/impl/utils/k;->o(Ljava/lang/String;)J

    .line 53
    .line 54
    .line 55
    move-result-wide p1

    .line 56
    return-wide p1
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


# virtual methods
.method public f()Ljava/lang/String;
    .locals 2

    iget-object v0, p0, Landroidx/camera/core/impl/utils/k;->a:Landroidx/exifinterface/media/a;

    const-string v1, "ImageDescription"

    invoke-virtual {v0, v1}, Landroidx/exifinterface/media/a;->f(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public g()I
    .locals 3

    iget-object v0, p0, Landroidx/camera/core/impl/utils/k;->a:Landroidx/exifinterface/media/a;

    const-string v1, "ImageLength"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroidx/exifinterface/media/a;->h(Ljava/lang/String;I)I

    move-result v0

    return v0
.end method

.method public h()Landroid/location/Location;
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Landroidx/camera/core/impl/utils/k;->a:Landroidx/exifinterface/media/a;

    .line 4
    .line 5
    const-string v2, "GPSProcessingMethod"

    .line 6
    .line 7
    invoke-virtual {v1, v2}, Landroidx/exifinterface/media/a;->f(Ljava/lang/String;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    iget-object v2, v0, Landroidx/camera/core/impl/utils/k;->a:Landroidx/exifinterface/media/a;

    .line 12
    .line 13
    invoke-virtual {v2}, Landroidx/exifinterface/media/a;->m()[D

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    iget-object v3, v0, Landroidx/camera/core/impl/utils/k;->a:Landroidx/exifinterface/media/a;

    .line 18
    .line 19
    const-wide/16 v4, 0x0

    .line 20
    .line 21
    invoke-virtual {v3, v4, v5}, Landroidx/exifinterface/media/a;->e(D)D

    .line 22
    .line 23
    .line 24
    move-result-wide v6

    .line 25
    iget-object v3, v0, Landroidx/camera/core/impl/utils/k;->a:Landroidx/exifinterface/media/a;

    .line 26
    .line 27
    const-string v8, "GPSSpeed"

    .line 28
    .line 29
    invoke-virtual {v3, v8, v4, v5}, Landroidx/exifinterface/media/a;->g(Ljava/lang/String;D)D

    .line 30
    .line 31
    .line 32
    move-result-wide v8

    .line 33
    iget-object v3, v0, Landroidx/camera/core/impl/utils/k;->a:Landroidx/exifinterface/media/a;

    .line 34
    .line 35
    const-string v10, "GPSSpeedRef"

    .line 36
    .line 37
    invoke-virtual {v3, v10}, Landroidx/exifinterface/media/a;->f(Ljava/lang/String;)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v3

    .line 41
    const-string v10, "K"

    .line 42
    .line 43
    if-nez v3, :cond_0

    .line 44
    .line 45
    move-object v3, v10

    .line 46
    :cond_0
    iget-object v11, v0, Landroidx/camera/core/impl/utils/k;->a:Landroidx/exifinterface/media/a;

    .line 47
    .line 48
    const-string v12, "GPSDateStamp"

    .line 49
    .line 50
    invoke-virtual {v11, v12}, Landroidx/exifinterface/media/a;->f(Ljava/lang/String;)Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v11

    .line 54
    iget-object v12, v0, Landroidx/camera/core/impl/utils/k;->a:Landroidx/exifinterface/media/a;

    .line 55
    .line 56
    const-string v13, "GPSTimeStamp"

    .line 57
    .line 58
    invoke-virtual {v12, v13}, Landroidx/exifinterface/media/a;->f(Ljava/lang/String;)Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v12

    .line 62
    invoke-direct {v0, v11, v12}, Landroidx/camera/core/impl/utils/k;->p(Ljava/lang/String;Ljava/lang/String;)J

    .line 63
    .line 64
    .line 65
    move-result-wide v11

    .line 66
    if-nez v2, :cond_1

    .line 67
    .line 68
    const/4 v1, 0x0

    .line 69
    return-object v1

    .line 70
    :cond_1
    if-nez v1, :cond_2

    .line 71
    .line 72
    sget-object v1, Landroidx/camera/core/impl/utils/k;->c:Ljava/lang/String;

    .line 73
    .line 74
    :cond_2
    new-instance v13, Landroid/location/Location;

    .line 75
    .line 76
    invoke-direct {v13, v1}, Landroid/location/Location;-><init>(Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    const/4 v1, 0x0

    .line 80
    aget-wide v14, v2, v1

    .line 81
    .line 82
    invoke-virtual {v13, v14, v15}, Landroid/location/Location;->setLatitude(D)V

    .line 83
    .line 84
    .line 85
    const/4 v14, 0x1

    .line 86
    aget-wide v1, v2, v14

    .line 87
    .line 88
    invoke-virtual {v13, v1, v2}, Landroid/location/Location;->setLongitude(D)V

    .line 89
    .line 90
    .line 91
    cmpl-double v1, v6, v4

    .line 92
    .line 93
    if-eqz v1, :cond_3

    .line 94
    .line 95
    invoke-virtual {v13, v6, v7}, Landroid/location/Location;->setAltitude(D)V

    .line 96
    .line 97
    .line 98
    :cond_3
    cmpl-double v1, v8, v4

    .line 99
    .line 100
    if-eqz v1, :cond_a

    .line 101
    .line 102
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    .line 103
    .line 104
    .line 105
    move-result v1

    .line 106
    const/16 v2, 0x4b

    .line 107
    .line 108
    if-eq v1, v2, :cond_6

    .line 109
    .line 110
    const/16 v2, 0x4d

    .line 111
    .line 112
    if-eq v1, v2, :cond_5

    .line 113
    .line 114
    const/16 v2, 0x4e

    .line 115
    .line 116
    if-eq v1, v2, :cond_4

    .line 117
    .line 118
    goto :goto_0

    .line 119
    :cond_4
    const-string v1, "N"

    .line 120
    .line 121
    invoke-virtual {v3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 122
    .line 123
    .line 124
    move-result v1

    .line 125
    if-eqz v1, :cond_7

    .line 126
    .line 127
    move v1, v14

    .line 128
    goto :goto_1

    .line 129
    :cond_5
    const-string v1, "M"

    .line 130
    .line 131
    invoke-virtual {v3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 132
    .line 133
    .line 134
    move-result v1

    .line 135
    if-eqz v1, :cond_7

    .line 136
    .line 137
    const/4 v1, 0x0

    .line 138
    goto :goto_1

    .line 139
    :cond_6
    invoke-virtual {v3, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 140
    .line 141
    .line 142
    move-result v1

    .line 143
    if-eqz v1, :cond_7

    .line 144
    .line 145
    const/4 v1, 0x2

    .line 146
    goto :goto_1

    .line 147
    :cond_7
    :goto_0
    const/4 v1, -0x1

    .line 148
    :goto_1
    if-eqz v1, :cond_9

    .line 149
    .line 150
    if-eq v1, v14, :cond_8

    .line 151
    .line 152
    invoke-static {v8, v9}, Landroidx/camera/core/impl/utils/k$d;->a(D)Landroidx/camera/core/impl/utils/k$d$a;

    .line 153
    .line 154
    .line 155
    move-result-object v1

    .line 156
    invoke-virtual {v1}, Landroidx/camera/core/impl/utils/k$d$a;->a()D

    .line 157
    .line 158
    .line 159
    move-result-wide v1

    .line 160
    goto :goto_2

    .line 161
    :cond_8
    invoke-static {v8, v9}, Landroidx/camera/core/impl/utils/k$d;->b(D)Landroidx/camera/core/impl/utils/k$d$a;

    .line 162
    .line 163
    .line 164
    move-result-object v1

    .line 165
    invoke-virtual {v1}, Landroidx/camera/core/impl/utils/k$d$a;->a()D

    .line 166
    .line 167
    .line 168
    move-result-wide v1

    .line 169
    goto :goto_2

    .line 170
    :cond_9
    invoke-static {v8, v9}, Landroidx/camera/core/impl/utils/k$d;->c(D)Landroidx/camera/core/impl/utils/k$d$a;

    .line 171
    .line 172
    .line 173
    move-result-object v1

    .line 174
    invoke-virtual {v1}, Landroidx/camera/core/impl/utils/k$d$a;->a()D

    .line 175
    .line 176
    .line 177
    move-result-wide v1

    .line 178
    :goto_2
    double-to-float v1, v1

    .line 179
    invoke-virtual {v13, v1}, Landroid/location/Location;->setSpeed(F)V

    .line 180
    .line 181
    .line 182
    :cond_a
    const-wide/16 v1, -0x1

    .line 183
    .line 184
    cmp-long v1, v11, v1

    .line 185
    .line 186
    if-eqz v1, :cond_b

    .line 187
    .line 188
    invoke-virtual {v13, v11, v12}, Landroid/location/Location;->setTime(J)V

    .line 189
    .line 190
    .line 191
    :cond_b
    return-object v13
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

.method public i()I
    .locals 3

    iget-object v0, p0, Landroidx/camera/core/impl/utils/k;->a:Landroidx/exifinterface/media/a;

    const-string v1, "Orientation"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroidx/exifinterface/media/a;->h(Ljava/lang/String;I)I

    move-result v0

    return v0
.end method

.method public j()I
    .locals 4

    invoke-virtual {p0}, Landroidx/camera/core/impl/utils/k;->i()I

    move-result v0

    const/16 v1, 0x5a

    const/16 v2, 0x10e

    const/16 v3, 0xb4

    packed-switch v0, :pswitch_data_0

    const/4 v0, 0x0

    return v0

    :pswitch_0
    return v2

    :pswitch_1
    return v1

    :pswitch_2
    return v2

    :pswitch_3
    return v3

    nop

    :pswitch_data_0
    .packed-switch 0x3
        :pswitch_3
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public k()J
    .locals 6

    .line 1
    iget-object v0, p0, Landroidx/camera/core/impl/utils/k;->a:Landroidx/exifinterface/media/a;

    .line 2
    .line 3
    const-string v1, "DateTimeOriginal"

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Landroidx/exifinterface/media/a;->f(Ljava/lang/String;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-direct {p0, v0}, Landroidx/camera/core/impl/utils/k;->o(Ljava/lang/String;)J

    .line 10
    .line 11
    .line 12
    move-result-wide v0

    .line 13
    const-wide/16 v2, -0x1

    .line 14
    .line 15
    cmp-long v4, v0, v2

    .line 16
    .line 17
    if-nez v4, :cond_0

    .line 18
    .line 19
    return-wide v2

    .line 20
    :cond_0
    iget-object v2, p0, Landroidx/camera/core/impl/utils/k;->a:Landroidx/exifinterface/media/a;

    .line 21
    .line 22
    const-string v3, "SubSecTimeOriginal"

    .line 23
    .line 24
    invoke-virtual {v2, v3}, Landroidx/exifinterface/media/a;->f(Ljava/lang/String;)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    if-eqz v2, :cond_2

    .line 29
    .line 30
    :try_start_0
    invoke-static {v2}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 31
    .line 32
    .line 33
    move-result-wide v2

    .line 34
    :goto_0
    const-wide/16 v4, 0x3e8

    .line 35
    .line 36
    cmp-long v4, v2, v4

    .line 37
    .line 38
    if-lez v4, :cond_1

    .line 39
    .line 40
    const-wide/16 v4, 0xa

    .line 41
    .line 42
    div-long/2addr v2, v4
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 43
    goto :goto_0

    .line 44
    :cond_1
    add-long/2addr v0, v2

    .line 45
    :catch_0
    :cond_2
    return-wide v0
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
.end method

.method public l()I
    .locals 3

    iget-object v0, p0, Landroidx/camera/core/impl/utils/k;->a:Landroidx/exifinterface/media/a;

    const-string v1, "ImageWidth"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroidx/exifinterface/media/a;->h(Ljava/lang/String;I)I

    move-result v0

    return v0
.end method

.method public m()Z
    .locals 2

    invoke-virtual {p0}, Landroidx/camera/core/impl/utils/k;->i()I

    move-result v0

    const/4 v1, 0x2

    if-eq v0, v1, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    const/4 v0, 0x1

    return v0
.end method

.method public n()Z
    .locals 3

    invoke-virtual {p0}, Landroidx/camera/core/impl/utils/k;->i()I

    move-result v0

    const/4 v1, 0x4

    const/4 v2, 0x1

    if-eq v0, v1, :cond_0

    const/4 v1, 0x5

    if-eq v0, v1, :cond_0

    const/4 v1, 0x7

    if-eq v0, v1, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    return v2
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    .line 1
    sget-object v0, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    .line 2
    .line 3
    const/16 v1, 0x8

    .line 4
    .line 5
    new-array v1, v1, [Ljava/lang/Object;

    .line 6
    .line 7
    invoke-virtual {p0}, Landroidx/camera/core/impl/utils/k;->l()I

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    const/4 v3, 0x0

    .line 16
    aput-object v2, v1, v3

    .line 17
    .line 18
    invoke-virtual {p0}, Landroidx/camera/core/impl/utils/k;->g()I

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    const/4 v3, 0x1

    .line 27
    aput-object v2, v1, v3

    .line 28
    .line 29
    invoke-virtual {p0}, Landroidx/camera/core/impl/utils/k;->j()I

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    const/4 v3, 0x2

    .line 38
    aput-object v2, v1, v3

    .line 39
    .line 40
    invoke-virtual {p0}, Landroidx/camera/core/impl/utils/k;->n()Z

    .line 41
    .line 42
    .line 43
    move-result v2

    .line 44
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 45
    .line 46
    .line 47
    move-result-object v2

    .line 48
    const/4 v3, 0x3

    .line 49
    aput-object v2, v1, v3

    .line 50
    .line 51
    invoke-virtual {p0}, Landroidx/camera/core/impl/utils/k;->m()Z

    .line 52
    .line 53
    .line 54
    move-result v2

    .line 55
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 56
    .line 57
    .line 58
    move-result-object v2

    .line 59
    const/4 v3, 0x4

    .line 60
    aput-object v2, v1, v3

    .line 61
    .line 62
    const/4 v2, 0x5

    .line 63
    invoke-virtual {p0}, Landroidx/camera/core/impl/utils/k;->h()Landroid/location/Location;

    .line 64
    .line 65
    .line 66
    move-result-object v3

    .line 67
    aput-object v3, v1, v2

    .line 68
    .line 69
    invoke-virtual {p0}, Landroidx/camera/core/impl/utils/k;->k()J

    .line 70
    .line 71
    .line 72
    move-result-wide v2

    .line 73
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 74
    .line 75
    .line 76
    move-result-object v2

    .line 77
    const/4 v3, 0x6

    .line 78
    aput-object v2, v1, v3

    .line 79
    .line 80
    const/4 v2, 0x7

    .line 81
    invoke-virtual {p0}, Landroidx/camera/core/impl/utils/k;->f()Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object v3

    .line 85
    aput-object v3, v1, v2

    .line 86
    .line 87
    const-string v2, "Exif{width=%s, height=%s, rotation=%d, isFlippedVertically=%s, isFlippedHorizontally=%s, location=%s, timestamp=%s, description=%s}"

    .line 88
    .line 89
    invoke-static {v0, v2, v1}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    return-object v0
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
