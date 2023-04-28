.class public final Lcom/discord/sticker_picker/react/StickerPickerRowDataSerializationUtilsKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0000\u00a8\u0006\u0004"
    }
    d2 = {
        "deserializeStickerPickerRowData",
        "Lcom/discord/sticker_picker/StickerPickerRow;",
        "data",
        "Lcom/facebook/react/bridge/ReadableMap;",
        "sticker_picker_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final deserializeStickerPickerRowData(Lcom/facebook/react/bridge/ReadableMap;)Lcom/discord/sticker_picker/StickerPickerRow;
    .locals 15

    .line 1
    const-string v0, "data"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "rowContentWidth"

    .line 7
    .line 8
    invoke-interface {p0, v0}, Lcom/facebook/react/bridge/ReadableMap;->getInt(Ljava/lang/String;)I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    const-string v1, "rowContentPaddingVertical"

    .line 13
    .line 14
    invoke-interface {p0, v1}, Lcom/facebook/react/bridge/ReadableMap;->getInt(Ljava/lang/String;)I

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    const-string v2, "itemSize"

    .line 19
    .line 20
    invoke-interface {p0, v2}, Lcom/facebook/react/bridge/ReadableMap;->getInt(Ljava/lang/String;)I

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    const-string v3, "items"

    .line 25
    .line 26
    invoke-static {p0, v3}, Lcom/discord/react/utilities/NativeMapExtensionsKt;->getNonNullArray(Lcom/facebook/react/bridge/ReadableMap;Ljava/lang/String;)Lcom/facebook/react/bridge/ReadableArray;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    invoke-static {p0}, Lcom/discord/react/utilities/NativeArrayExtensionsKt;->sizeRange(Lcom/facebook/react/bridge/ReadableArray;)Lkotlin/ranges/IntRange;

    .line 31
    .line 32
    .line 33
    move-result-object v3

    .line 34
    new-instance v4, Ljava/util/ArrayList;

    .line 35
    .line 36
    const/16 v5, 0xa

    .line 37
    .line 38
    invoke-static {v3, v5}, Lkotlin/collections/h;->t(Ljava/lang/Iterable;I)I

    .line 39
    .line 40
    .line 41
    move-result v5

    .line 42
    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 43
    .line 44
    .line 45
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 46
    .line 47
    .line 48
    move-result-object v3

    .line 49
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 50
    .line 51
    .line 52
    move-result v5

    .line 53
    if-eqz v5, :cond_5

    .line 54
    .line 55
    move-object v5, v3

    .line 56
    check-cast v5, Lof/p;

    .line 57
    .line 58
    invoke-virtual {v5}, Lof/p;->nextInt()I

    .line 59
    .line 60
    .line 61
    move-result v5

    .line 62
    invoke-interface {p0, v5}, Lcom/facebook/react/bridge/ReadableArray;->isNull(I)Z

    .line 63
    .line 64
    .line 65
    move-result v6

    .line 66
    if-nez v6, :cond_4

    .line 67
    .line 68
    invoke-interface {p0, v5}, Lcom/facebook/react/bridge/ReadableArray;->getMap(I)Lcom/facebook/react/bridge/ReadableMap;

    .line 69
    .line 70
    .line 71
    move-result-object v5

    .line 72
    const-string v6, "stickerRow"

    .line 73
    .line 74
    invoke-static {v5, v6}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    const-string v6, "stickerId"

    .line 78
    .line 79
    invoke-static {v5, v6}, Lcom/discord/react/utilities/NativeMapExtensionsKt;->getNonNullString(Lcom/facebook/react/bridge/ReadableMap;Ljava/lang/String;)Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object v8

    .line 83
    const-string v6, "stickerName"

    .line 84
    .line 85
    invoke-static {v5, v6}, Lcom/discord/react/utilities/NativeMapExtensionsKt;->getNonNullString(Lcom/facebook/react/bridge/ReadableMap;Ljava/lang/String;)Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object v9

    .line 89
    const-string v6, "stickerType"

    .line 90
    .line 91
    invoke-interface {v5, v6}, Lcom/facebook/react/bridge/ReadableMap;->getInt(Ljava/lang/String;)I

    .line 92
    .line 93
    .line 94
    move-result v6

    .line 95
    const/4 v7, 0x1

    .line 96
    if-eq v6, v7, :cond_3

    .line 97
    .line 98
    const/4 v7, 0x2

    .line 99
    if-eq v6, v7, :cond_2

    .line 100
    .line 101
    const/4 v7, 0x3

    .line 102
    if-eq v6, v7, :cond_1

    .line 103
    .line 104
    const/4 v7, 0x4

    .line 105
    if-ne v6, v7, :cond_0

    .line 106
    .line 107
    sget-object v6, Lcom/discord/sticker_picker/StickerPickerRow$Sticker$Type;->GIF:Lcom/discord/sticker_picker/StickerPickerRow$Sticker$Type;

    .line 108
    .line 109
    goto :goto_1

    .line 110
    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 111
    .line 112
    new-instance v0, Ljava/lang/StringBuilder;

    .line 113
    .line 114
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 115
    .line 116
    .line 117
    const-string v1, "Unknown type "

    .line 118
    .line 119
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 120
    .line 121
    .line 122
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 123
    .line 124
    .line 125
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 126
    .line 127
    .line 128
    move-result-object v0

    .line 129
    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 130
    .line 131
    .line 132
    throw p0

    .line 133
    :cond_1
    sget-object v6, Lcom/discord/sticker_picker/StickerPickerRow$Sticker$Type;->LOTTIE:Lcom/discord/sticker_picker/StickerPickerRow$Sticker$Type;

    .line 134
    .line 135
    goto :goto_1

    .line 136
    :cond_2
    sget-object v6, Lcom/discord/sticker_picker/StickerPickerRow$Sticker$Type;->APNG:Lcom/discord/sticker_picker/StickerPickerRow$Sticker$Type;

    .line 137
    .line 138
    goto :goto_1

    .line 139
    :cond_3
    sget-object v6, Lcom/discord/sticker_picker/StickerPickerRow$Sticker$Type;->PNG:Lcom/discord/sticker_picker/StickerPickerRow$Sticker$Type;

    .line 140
    .line 141
    :goto_1
    move-object v10, v6

    .line 142
    const-string v6, "stickerUrl"

    .line 143
    .line 144
    invoke-static {v5, v6}, Lcom/discord/react/utilities/NativeMapExtensionsKt;->getNonNullString(Lcom/facebook/react/bridge/ReadableMap;Ljava/lang/String;)Ljava/lang/String;

    .line 145
    .line 146
    .line 147
    move-result-object v12

    .line 148
    const-string v6, "stickerAnimated"

    .line 149
    .line 150
    invoke-interface {v5, v6}, Lcom/facebook/react/bridge/ReadableMap;->getBoolean(Ljava/lang/String;)Z

    .line 151
    .line 152
    .line 153
    move-result v11

    .line 154
    const-string v6, "stickerDisabled"

    .line 155
    .line 156
    invoke-interface {v5, v6}, Lcom/facebook/react/bridge/ReadableMap;->getBoolean(Ljava/lang/String;)Z

    .line 157
    .line 158
    .line 159
    move-result v13

    .line 160
    const-string v6, "stickerOpaque"

    .line 161
    .line 162
    invoke-interface {v5, v6}, Lcom/facebook/react/bridge/ReadableMap;->getBoolean(Ljava/lang/String;)Z

    .line 163
    .line 164
    .line 165
    move-result v14

    .line 166
    new-instance v5, Lcom/discord/sticker_picker/StickerPickerRow$Sticker;

    .line 167
    .line 168
    move-object v7, v5

    .line 169
    invoke-direct/range {v7 .. v14}, Lcom/discord/sticker_picker/StickerPickerRow$Sticker;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/discord/sticker_picker/StickerPickerRow$Sticker$Type;ZLjava/lang/String;ZZ)V

    .line 170
    .line 171
    .line 172
    goto :goto_2

    .line 173
    :cond_4
    const/4 v5, 0x0

    .line 174
    :goto_2
    invoke-interface {v4, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 175
    .line 176
    .line 177
    goto/16 :goto_0

    .line 178
    .line 179
    :cond_5
    new-instance p0, Lcom/discord/sticker_picker/StickerPickerRow;

    .line 180
    .line 181
    invoke-direct {p0, v0, v1, v2, v4}, Lcom/discord/sticker_picker/StickerPickerRow;-><init>(IIILjava/util/List;)V

    .line 182
    .line 183
    .line 184
    return-object p0
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
.end method
