.class public final Lcom/discord/tti_manager/TTILoggingApplication$Companion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/discord/tti_manager/TTILoggingApplication;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\t\n\u0002\u0008\u0012\n\u0002\u0010\u0002\n\u0000\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002J\r\u0010\u0014\u001a\u00020\u0004H\u0000\u00a2\u0006\u0002\u0008\u0015J\u0006\u0010\u0016\u001a\u00020\u0017R+\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00048B@BX\u0082\u008e\u0002\u00a2\u0006\u0012\n\u0004\u0008\n\u0010\u000b\u001a\u0004\u0008\u0006\u0010\u0007\"\u0004\u0008\u0008\u0010\tR+\u0010\u000c\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00048B@BX\u0082\u008e\u0002\u00a2\u0006\u0012\n\u0004\u0008\u000f\u0010\u000b\u001a\u0004\u0008\r\u0010\u0007\"\u0004\u0008\u000e\u0010\tR+\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00048B@BX\u0082\u008e\u0002\u00a2\u0006\u0012\n\u0004\u0008\u0013\u0010\u000b\u001a\u0004\u0008\u0011\u0010\u0007\"\u0004\u0008\u0012\u0010\t\u00a8\u0006\u0018"
    }
    d2 = {
        "Lcom/discord/tti_manager/TTILoggingApplication$Companion;",
        "",
        "()V",
        "<set-?>",
        "",
        "applicationInitializeTimestamp",
        "getApplicationInitializeTimestamp",
        "()J",
        "setApplicationInitializeTimestamp",
        "(J)V",
        "applicationInitializeTimestamp$delegate",
        "Lkotlin/properties/ReadWriteProperty;",
        "applicationOpenedTimestampExcludingActivityLaunchGap",
        "getApplicationOpenedTimestampExcludingActivityLaunchGap",
        "setApplicationOpenedTimestampExcludingActivityLaunchGap",
        "applicationOpenedTimestampExcludingActivityLaunchGap$delegate",
        "applicationStartedTimestamp",
        "getApplicationStartedTimestamp",
        "setApplicationStartedTimestamp",
        "applicationStartedTimestamp$delegate",
        "getAppOpenedTimestamp",
        "getAppOpenedTimestamp$tti_manager_release",
        "trackActivityDelegateInitialized",
        "",
        "tti_manager_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field static final synthetic $$delegatedProperties:[Lkotlin/reflect/KProperty;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Lkotlin/reflect/KProperty<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    const/4 v0, 0x3

    .line 2
    new-array v0, v0, [Lkotlin/reflect/KProperty;

    .line 3
    .line 4
    new-instance v1, Lkotlin/jvm/internal/w;

    .line 5
    .line 6
    const-string v2, "applicationOpenedTimestampExcludingActivityLaunchGap"

    .line 7
    .line 8
    const-string v3, "getApplicationOpenedTimestampExcludingActivityLaunchGap()J"

    .line 9
    .line 10
    const-class v4, Lcom/discord/tti_manager/TTILoggingApplication$Companion;

    .line 11
    .line 12
    const/4 v5, 0x0

    .line 13
    invoke-direct {v1, v4, v2, v3, v5}, Lkotlin/jvm/internal/w;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 14
    .line 15
    .line 16
    invoke-static {v1}, Lkotlin/jvm/internal/f0;->e(Lkotlin/jvm/internal/v;)Lfg/e;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    aput-object v1, v0, v5

    .line 21
    .line 22
    new-instance v1, Lkotlin/jvm/internal/w;

    .line 23
    .line 24
    const-string v2, "applicationStartedTimestamp"

    .line 25
    .line 26
    const-string v3, "getApplicationStartedTimestamp()J"

    .line 27
    .line 28
    invoke-direct {v1, v4, v2, v3, v5}, Lkotlin/jvm/internal/w;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 29
    .line 30
    .line 31
    invoke-static {v1}, Lkotlin/jvm/internal/f0;->e(Lkotlin/jvm/internal/v;)Lfg/e;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    const/4 v2, 0x1

    .line 36
    aput-object v1, v0, v2

    .line 37
    .line 38
    new-instance v1, Lkotlin/jvm/internal/w;

    .line 39
    .line 40
    const-string v2, "applicationInitializeTimestamp"

    .line 41
    .line 42
    const-string v3, "getApplicationInitializeTimestamp()J"

    .line 43
    .line 44
    invoke-direct {v1, v4, v2, v3, v5}, Lkotlin/jvm/internal/w;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 45
    .line 46
    .line 47
    invoke-static {v1}, Lkotlin/jvm/internal/f0;->e(Lkotlin/jvm/internal/v;)Lfg/e;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    const/4 v2, 0x2

    .line 52
    aput-object v1, v0, v2

    .line 53
    .line 54
    sput-object v0, Lcom/discord/tti_manager/TTILoggingApplication$Companion;->$$delegatedProperties:[Lkotlin/reflect/KProperty;

    .line 55
    .line 56
    return-void
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
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0}, Lcom/discord/tti_manager/TTILoggingApplication$Companion;-><init>()V

    return-void
.end method

.method public static final synthetic access$setApplicationInitializeTimestamp(Lcom/discord/tti_manager/TTILoggingApplication$Companion;J)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/discord/tti_manager/TTILoggingApplication$Companion;->setApplicationInitializeTimestamp(J)V

    return-void
.end method

.method public static final synthetic access$setApplicationStartedTimestamp(Lcom/discord/tti_manager/TTILoggingApplication$Companion;J)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/discord/tti_manager/TTILoggingApplication$Companion;->setApplicationStartedTimestamp(J)V

    return-void
.end method

.method private final getApplicationInitializeTimestamp()J
    .locals 3

    invoke-static {}, Lcom/discord/tti_manager/TTILoggingApplication;->access$getApplicationInitializeTimestamp$delegate$cp()Lkotlin/properties/ReadWriteProperty;

    move-result-object v0

    sget-object v1, Lcom/discord/tti_manager/TTILoggingApplication$Companion;->$$delegatedProperties:[Lkotlin/reflect/KProperty;

    const/4 v2, 0x2

    aget-object v1, v1, v2

    invoke-interface {v0, p0, v1}, Lkotlin/properties/ReadWriteProperty;->getValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->longValue()J

    move-result-wide v0

    return-wide v0
.end method

.method private final getApplicationOpenedTimestampExcludingActivityLaunchGap()J
    .locals 3

    invoke-static {}, Lcom/discord/tti_manager/TTILoggingApplication;->access$getApplicationOpenedTimestampExcludingActivityLaunchGap$delegate$cp()Lkotlin/properties/ReadWriteProperty;

    move-result-object v0

    sget-object v1, Lcom/discord/tti_manager/TTILoggingApplication$Companion;->$$delegatedProperties:[Lkotlin/reflect/KProperty;

    const/4 v2, 0x0

    aget-object v1, v1, v2

    invoke-interface {v0, p0, v1}, Lkotlin/properties/ReadWriteProperty;->getValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->longValue()J

    move-result-wide v0

    return-wide v0
.end method

.method private final getApplicationStartedTimestamp()J
    .locals 3

    invoke-static {}, Lcom/discord/tti_manager/TTILoggingApplication;->access$getApplicationStartedTimestamp$delegate$cp()Lkotlin/properties/ReadWriteProperty;

    move-result-object v0

    sget-object v1, Lcom/discord/tti_manager/TTILoggingApplication$Companion;->$$delegatedProperties:[Lkotlin/reflect/KProperty;

    const/4 v2, 0x1

    aget-object v1, v1, v2

    invoke-interface {v0, p0, v1}, Lkotlin/properties/ReadWriteProperty;->getValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->longValue()J

    move-result-wide v0

    return-wide v0
.end method

.method private final setApplicationInitializeTimestamp(J)V
    .locals 3

    invoke-static {}, Lcom/discord/tti_manager/TTILoggingApplication;->access$getApplicationInitializeTimestamp$delegate$cp()Lkotlin/properties/ReadWriteProperty;

    move-result-object v0

    sget-object v1, Lcom/discord/tti_manager/TTILoggingApplication$Companion;->$$delegatedProperties:[Lkotlin/reflect/KProperty;

    const/4 v2, 0x2

    aget-object v1, v1, v2

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    invoke-interface {v0, p0, v1, p1}, Lkotlin/properties/ReadWriteProperty;->setValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;Ljava/lang/Object;)V

    return-void
.end method

.method private final setApplicationOpenedTimestampExcludingActivityLaunchGap(J)V
    .locals 3

    invoke-static {}, Lcom/discord/tti_manager/TTILoggingApplication;->access$getApplicationOpenedTimestampExcludingActivityLaunchGap$delegate$cp()Lkotlin/properties/ReadWriteProperty;

    move-result-object v0

    sget-object v1, Lcom/discord/tti_manager/TTILoggingApplication$Companion;->$$delegatedProperties:[Lkotlin/reflect/KProperty;

    const/4 v2, 0x0

    aget-object v1, v1, v2

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    invoke-interface {v0, p0, v1, p1}, Lkotlin/properties/ReadWriteProperty;->setValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;Ljava/lang/Object;)V

    return-void
.end method

.method private final setApplicationStartedTimestamp(J)V
    .locals 3

    invoke-static {}, Lcom/discord/tti_manager/TTILoggingApplication;->access$getApplicationStartedTimestamp$delegate$cp()Lkotlin/properties/ReadWriteProperty;

    move-result-object v0

    sget-object v1, Lcom/discord/tti_manager/TTILoggingApplication$Companion;->$$delegatedProperties:[Lkotlin/reflect/KProperty;

    const/4 v2, 0x1

    aget-object v1, v1, v2

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    invoke-interface {v0, p0, v1, p1}, Lkotlin/properties/ReadWriteProperty;->setValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final getAppOpenedTimestamp$tti_manager_release()J
    .locals 2

    invoke-direct {p0}, Lcom/discord/tti_manager/TTILoggingApplication$Companion;->getApplicationOpenedTimestampExcludingActivityLaunchGap()J

    move-result-wide v0

    return-wide v0
.end method

.method public final trackActivityDelegateInitialized()V
    .locals 4

    .line 1
    invoke-direct {p0}, Lcom/discord/tti_manager/TTILoggingApplication$Companion;->getApplicationInitializeTimestamp()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    invoke-direct {p0}, Lcom/discord/tti_manager/TTILoggingApplication$Companion;->getApplicationStartedTimestamp()J

    .line 6
    .line 7
    .line 8
    move-result-wide v2

    .line 9
    sub-long/2addr v0, v2

    .line 10
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 11
    .line 12
    .line 13
    move-result-wide v2

    .line 14
    sub-long/2addr v2, v0

    .line 15
    invoke-direct {p0, v2, v3}, Lcom/discord/tti_manager/TTILoggingApplication$Companion;->setApplicationOpenedTimestampExcludingActivityLaunchGap(J)V

    .line 16
    .line 17
    .line 18
    return-void
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
.end method
