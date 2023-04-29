.class public final Lcom/discord/sticker_picker/StickerPickerRowView;
.super Landroid/widget/LinearLayout;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/discord/sticker_picker/StickerPickerRowView$WhenMappings;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0006\u0010\u0007\u001a\u00020\u0004J\u000e\u0010\u0008\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0016\u0010\n\u001a\u00020\t8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\n\u0010\u000bR.\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00040\u000c8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u000e\u0010\u000f\u001a\u0004\u0008\u0010\u0010\u0011\"\u0004\u0008\u0012\u0010\u0013R.\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00040\u000c8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0014\u0010\u000f\u001a\u0004\u0008\u0015\u0010\u0011\"\u0004\u0008\u0016\u0010\u0013\u00a8\u0006\u001b"
    }
    d2 = {
        "Lcom/discord/sticker_picker/StickerPickerRowView;",
        "Landroid/widget/LinearLayout;",
        "Lcom/discord/sticker_picker/StickerPickerRow;",
        "rowData",
        "",
        "configureRowStickerViews",
        "createRowStickerViews",
        "clean",
        "setRowData",
        "",
        "firstRenderPass",
        "Z",
        "Lkotlin/Function1;",
        "",
        "onPressSticker",
        "Lkotlin/jvm/functions/Function1;",
        "getOnPressSticker",
        "()Lkotlin/jvm/functions/Function1;",
        "setOnPressSticker",
        "(Lkotlin/jvm/functions/Function1;)V",
        "onLongPressSticker",
        "getOnLongPressSticker",
        "setOnLongPressSticker",
        "Landroid/content/Context;",
        "context",
        "<init>",
        "(Landroid/content/Context;)V",
        "sticker_picker_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field private firstRenderPass:Z

.field private onLongPressSticker:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/String;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field private onPressSticker:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/String;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0, p1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 7
    .line 8
    .line 9
    sget-object p1, Lcom/discord/sticker_picker/StickerPickerRowView$onPressSticker$1;->INSTANCE:Lcom/discord/sticker_picker/StickerPickerRowView$onPressSticker$1;

    .line 10
    .line 11
    iput-object p1, p0, Lcom/discord/sticker_picker/StickerPickerRowView;->onPressSticker:Lkotlin/jvm/functions/Function1;

    .line 12
    .line 13
    sget-object p1, Lcom/discord/sticker_picker/StickerPickerRowView$onLongPressSticker$1;->INSTANCE:Lcom/discord/sticker_picker/StickerPickerRowView$onLongPressSticker$1;

    .line 14
    .line 15
    iput-object p1, p0, Lcom/discord/sticker_picker/StickerPickerRowView;->onLongPressSticker:Lkotlin/jvm/functions/Function1;

    .line 16
    .line 17
    const/4 p1, 0x0

    .line 18
    invoke-virtual {p0, p1}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 19
    .line 20
    .line 21
    return-void
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
.end method

.method public static synthetic a(Lcom/discord/sticker_picker/StickerPickerRowView;Lcom/discord/sticker_picker/StickerPickerRow$Sticker;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/discord/sticker_picker/StickerPickerRowView;->configureRowStickerViews$lambda$3$lambda$1(Lcom/discord/sticker_picker/StickerPickerRowView;Lcom/discord/sticker_picker/StickerPickerRow$Sticker;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic b(Lcom/discord/sticker_picker/StickerPickerRowView;Lcom/discord/sticker_picker/StickerPickerRow$Sticker;Landroid/view/View;)Z
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/discord/sticker_picker/StickerPickerRowView;->configureRowStickerViews$lambda$3$lambda$2(Lcom/discord/sticker_picker/StickerPickerRowView;Lcom/discord/sticker_picker/StickerPickerRow$Sticker;Landroid/view/View;)Z

    move-result p0

    return p0
.end method

.method private final configureRowStickerViews(Lcom/discord/sticker_picker/StickerPickerRow;)V
    .locals 13

    .line 1
    invoke-virtual {p1}, Lcom/discord/sticker_picker/StickerPickerRow;->getItems()Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const/4 v1, 0x0

    .line 10
    move v2, v1

    .line 11
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 12
    .line 13
    .line 14
    move-result v3

    .line 15
    if-eqz v3, :cond_7

    .line 16
    .line 17
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v3

    .line 21
    add-int/lit8 v4, v2, 0x1

    .line 22
    .line 23
    if-gez v2, :cond_0

    .line 24
    .line 25
    invoke-static {}, Lkotlin/collections/h;->s()V

    .line 26
    .line 27
    .line 28
    :cond_0
    check-cast v3, Lcom/discord/sticker_picker/StickerPickerRow$Sticker;

    .line 29
    .line 30
    invoke-virtual {p0, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    const-string v5, "null cannot be cast to non-null type com.discord.sticker.StickerView"

    .line 35
    .line 36
    invoke-static {v2, v5}, Lkotlin/jvm/internal/q;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    move-object v6, v2

    .line 40
    check-cast v6, Lcom/discord/sticker/StickerView;

    .line 41
    .line 42
    const/4 v2, 0x4

    .line 43
    if-nez v3, :cond_1

    .line 44
    .line 45
    invoke-virtual {v6, v2}, Landroid/view/View;->setVisibility(I)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {v6}, Lcom/discord/image/animated_image/apng/APNGImageView;->recycle()V

    .line 49
    .line 50
    .line 51
    goto/16 :goto_2

    .line 52
    .line 53
    :cond_1
    invoke-virtual {v6, v1}, Landroid/view/View;->setVisibility(I)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {v3}, Lcom/discord/sticker_picker/StickerPickerRow$Sticker;->getOpaque()Z

    .line 57
    .line 58
    .line 59
    move-result v5

    .line 60
    if-eqz v5, :cond_2

    .line 61
    .line 62
    const/high16 v5, 0x3f800000    # 1.0f

    .line 63
    .line 64
    goto :goto_1

    .line 65
    :cond_2
    const v5, 0x3e99999a    # 0.3f

    .line 66
    .line 67
    .line 68
    :goto_1
    invoke-virtual {v6, v5}, Landroid/view/View;->setAlpha(F)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {v3}, Lcom/discord/sticker_picker/StickerPickerRow$Sticker;->getDisabled()Z

    .line 72
    .line 73
    .line 74
    move-result v5

    .line 75
    const/4 v7, 0x1

    .line 76
    xor-int/2addr v5, v7

    .line 77
    invoke-virtual {v6, v5}, Landroid/view/View;->setEnabled(Z)V

    .line 78
    .line 79
    .line 80
    new-instance v5, Lcom/discord/sticker_picker/a;

    .line 81
    .line 82
    invoke-direct {v5, p0, v3}, Lcom/discord/sticker_picker/a;-><init>(Lcom/discord/sticker_picker/StickerPickerRowView;Lcom/discord/sticker_picker/StickerPickerRow$Sticker;)V

    .line 83
    .line 84
    .line 85
    const/4 v8, 0x0

    .line 86
    invoke-static {v6, v1, v5, v7, v8}, Lcom/discord/react_gesture_handler/nested_touch/NestedScrollOnTouchUtilsKt;->setOnClickListenerNested$default(Landroid/view/View;ZLandroid/view/View$OnClickListener;ILjava/lang/Object;)V

    .line 87
    .line 88
    .line 89
    new-instance v5, Lcom/discord/sticker_picker/b;

    .line 90
    .line 91
    invoke-direct {v5, p0, v3}, Lcom/discord/sticker_picker/b;-><init>(Lcom/discord/sticker_picker/StickerPickerRowView;Lcom/discord/sticker_picker/StickerPickerRow$Sticker;)V

    .line 92
    .line 93
    .line 94
    invoke-static {v6, v1, v5, v7, v8}, Lcom/discord/react_gesture_handler/nested_touch/NestedScrollOnTouchUtilsKt;->setOnLongClickListenerNested$default(Landroid/view/View;ZLandroid/view/View$OnLongClickListener;ILjava/lang/Object;)V

    .line 95
    .line 96
    .line 97
    invoke-virtual {v3}, Lcom/discord/sticker_picker/StickerPickerRow$Sticker;->getType()Lcom/discord/sticker_picker/StickerPickerRow$Sticker$Type;

    .line 98
    .line 99
    .line 100
    move-result-object v5

    .line 101
    sget-object v8, Lcom/discord/sticker_picker/StickerPickerRowView$WhenMappings;->$EnumSwitchMapping$0:[I

    .line 102
    .line 103
    invoke-virtual {v5}, Ljava/lang/Enum;->ordinal()I

    .line 104
    .line 105
    .line 106
    move-result v5

    .line 107
    aget v5, v8, v5

    .line 108
    .line 109
    if-eq v5, v7, :cond_6

    .line 110
    .line 111
    const/4 v8, 0x2

    .line 112
    if-eq v5, v8, :cond_5

    .line 113
    .line 114
    const/4 v8, 0x3

    .line 115
    if-eq v5, v8, :cond_4

    .line 116
    .line 117
    if-eq v5, v2, :cond_3

    .line 118
    .line 119
    goto :goto_2

    .line 120
    :cond_3
    invoke-virtual {v3}, Lcom/discord/sticker_picker/StickerPickerRow$Sticker;->getUrl()Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object v2

    .line 124
    invoke-virtual {p1}, Lcom/discord/sticker_picker/StickerPickerRow;->getItemSize()I

    .line 125
    .line 126
    .line 127
    move-result v5

    .line 128
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 129
    .line 130
    .line 131
    move-result-object v5

    .line 132
    invoke-virtual {p1}, Lcom/discord/sticker_picker/StickerPickerRow;->getItemSize()I

    .line 133
    .line 134
    .line 135
    move-result v7

    .line 136
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 137
    .line 138
    .line 139
    move-result-object v7

    .line 140
    invoke-virtual {v3}, Lcom/discord/sticker_picker/StickerPickerRow$Sticker;->getAnimated()Z

    .line 141
    .line 142
    .line 143
    move-result v3

    .line 144
    invoke-virtual {v6, v2, v5, v7, v3}, Lcom/discord/sticker/StickerView;->asGif(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Z)V

    .line 145
    .line 146
    .line 147
    goto :goto_2

    .line 148
    :cond_4
    invoke-virtual {v3}, Lcom/discord/sticker_picker/StickerPickerRow$Sticker;->getUrl()Ljava/lang/String;

    .line 149
    .line 150
    .line 151
    move-result-object v2

    .line 152
    invoke-virtual {p1}, Lcom/discord/sticker_picker/StickerPickerRow;->getItemSize()I

    .line 153
    .line 154
    .line 155
    move-result v8

    .line 156
    invoke-virtual {p1}, Lcom/discord/sticker_picker/StickerPickerRow;->getItemSize()I

    .line 157
    .line 158
    .line 159
    move-result v9

    .line 160
    invoke-virtual {v3}, Lcom/discord/sticker_picker/StickerPickerRow$Sticker;->getAnimated()Z

    .line 161
    .line 162
    .line 163
    move-result v10

    .line 164
    invoke-virtual {v3}, Lcom/discord/sticker_picker/StickerPickerRow$Sticker;->getId()Ljava/lang/String;

    .line 165
    .line 166
    .line 167
    move-result-object v11

    .line 168
    invoke-virtual {v3}, Lcom/discord/sticker_picker/StickerPickerRow$Sticker;->getAnimated()Z

    .line 169
    .line 170
    .line 171
    move-result v3

    .line 172
    xor-int/lit8 v12, v3, 0x1

    .line 173
    .line 174
    move-object v7, v2

    .line 175
    invoke-virtual/range {v6 .. v12}, Lcom/discord/sticker/StickerView;->asLottie(Ljava/lang/String;IIZLjava/lang/String;I)V

    .line 176
    .line 177
    .line 178
    goto :goto_2

    .line 179
    :cond_5
    invoke-virtual {v3}, Lcom/discord/sticker_picker/StickerPickerRow$Sticker;->getUrl()Ljava/lang/String;

    .line 180
    .line 181
    .line 182
    move-result-object v2

    .line 183
    invoke-virtual {p1}, Lcom/discord/sticker_picker/StickerPickerRow;->getItemSize()I

    .line 184
    .line 185
    .line 186
    move-result v5

    .line 187
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 188
    .line 189
    .line 190
    move-result-object v5

    .line 191
    invoke-virtual {p1}, Lcom/discord/sticker_picker/StickerPickerRow;->getItemSize()I

    .line 192
    .line 193
    .line 194
    move-result v7

    .line 195
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 196
    .line 197
    .line 198
    move-result-object v7

    .line 199
    invoke-virtual {v3}, Lcom/discord/sticker_picker/StickerPickerRow$Sticker;->getAnimated()Z

    .line 200
    .line 201
    .line 202
    move-result v3

    .line 203
    invoke-virtual {v6, v2, v5, v7, v3}, Lcom/discord/sticker/StickerView;->asApng(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Z)V

    .line 204
    .line 205
    .line 206
    goto :goto_2

    .line 207
    :cond_6
    invoke-virtual {v3}, Lcom/discord/sticker_picker/StickerPickerRow$Sticker;->getUrl()Ljava/lang/String;

    .line 208
    .line 209
    .line 210
    move-result-object v2

    .line 211
    invoke-virtual {p1}, Lcom/discord/sticker_picker/StickerPickerRow;->getItemSize()I

    .line 212
    .line 213
    .line 214
    move-result v3

    .line 215
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 216
    .line 217
    .line 218
    move-result-object v3

    .line 219
    invoke-virtual {p1}, Lcom/discord/sticker_picker/StickerPickerRow;->getItemSize()I

    .line 220
    .line 221
    .line 222
    move-result v5

    .line 223
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 224
    .line 225
    .line 226
    move-result-object v5

    .line 227
    invoke-virtual {v6, v2, v3, v5}, Lcom/discord/sticker/StickerView;->asPng(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)V

    .line 228
    .line 229
    .line 230
    :goto_2
    move v2, v4

    .line 231
    goto/16 :goto_0

    .line 232
    .line 233
    :cond_7
    return-void
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
.end method

.method private static final configureRowStickerViews$lambda$3$lambda$1(Lcom/discord/sticker_picker/StickerPickerRowView;Lcom/discord/sticker_picker/StickerPickerRow$Sticker;Landroid/view/View;)V
    .locals 0

    .line 1
    const-string p2, "this$0"

    .line 2
    .line 3
    invoke-static {p0, p2}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lcom/discord/sticker_picker/StickerPickerRowView;->onPressSticker:Lkotlin/jvm/functions/Function1;

    .line 7
    .line 8
    invoke-virtual {p1}, Lcom/discord/sticker_picker/StickerPickerRow$Sticker;->getId()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    return-void
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
.end method

.method private static final configureRowStickerViews$lambda$3$lambda$2(Lcom/discord/sticker_picker/StickerPickerRowView;Lcom/discord/sticker_picker/StickerPickerRow$Sticker;Landroid/view/View;)Z
    .locals 0

    .line 1
    const-string p2, "this$0"

    .line 2
    .line 3
    invoke-static {p0, p2}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lcom/discord/sticker_picker/StickerPickerRowView;->onLongPressSticker:Lkotlin/jvm/functions/Function1;

    .line 7
    .line 8
    invoke-virtual {p1}, Lcom/discord/sticker_picker/StickerPickerRow$Sticker;->getId()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    const/4 p0, 0x1

    .line 16
    return p0
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
.end method

.method private final createRowStickerViews(Lcom/discord/sticker_picker/StickerPickerRow;)V
    .locals 14

    .line 1
    invoke-virtual {p0}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Lcom/discord/sticker_picker/StickerPickerRow;->getItemSize()I

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    invoke-static {v0}, Lcom/discord/misc/utilities/size/SizeUtilsKt;->getDpToPx(I)I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    invoke-virtual {p1}, Lcom/discord/sticker_picker/StickerPickerRow;->getItems()Ljava/util/List;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    invoke-virtual {p1}, Lcom/discord/sticker_picker/StickerPickerRow;->getRowContentWidth()I

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    invoke-static {v2}, Lcom/discord/misc/utilities/size/SizeUtilsKt;->getDpToPx(I)I

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    mul-int v3, v0, v1

    .line 29
    .line 30
    sub-int/2addr v2, v3

    .line 31
    const/4 v3, 0x1

    .line 32
    sub-int/2addr v1, v3

    .line 33
    div-int/2addr v2, v1

    .line 34
    invoke-virtual {p1}, Lcom/discord/sticker_picker/StickerPickerRow;->getRowContentPaddingVertical()I

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    invoke-static {v1}, Lcom/discord/misc/utilities/size/SizeUtilsKt;->getDpToPx(I)I

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    invoke-virtual {p1}, Lcom/discord/sticker_picker/StickerPickerRow;->getItems()Ljava/util/List;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    const/4 v4, 0x0

    .line 51
    move v5, v4

    .line 52
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 53
    .line 54
    .line 55
    move-result v6

    .line 56
    if-eqz v6, :cond_2

    .line 57
    .line 58
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v6

    .line 62
    add-int/lit8 v7, v5, 0x1

    .line 63
    .line 64
    if-gez v5, :cond_0

    .line 65
    .line 66
    invoke-static {}, Lkotlin/collections/h;->s()V

    .line 67
    .line 68
    .line 69
    :cond_0
    check-cast v6, Lcom/discord/sticker_picker/StickerPickerRow$Sticker;

    .line 70
    .line 71
    if-nez v5, :cond_1

    .line 72
    .line 73
    move v5, v4

    .line 74
    goto :goto_1

    .line 75
    :cond_1
    move v5, v2

    .line 76
    :goto_1
    new-instance v6, Lcom/discord/sticker/StickerView;

    .line 77
    .line 78
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 79
    .line 80
    .line 81
    move-result-object v9

    .line 82
    const-string v8, "context"

    .line 83
    .line 84
    invoke-static {v9, v8}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 85
    .line 86
    .line 87
    const/4 v10, 0x0

    .line 88
    const/4 v11, 0x0

    .line 89
    const/4 v12, 0x6

    .line 90
    const/4 v13, 0x0

    .line 91
    move-object v8, v6

    .line 92
    invoke-direct/range {v8 .. v13}, Lcom/discord/sticker/StickerView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 93
    .line 94
    .line 95
    const/4 v8, 0x2

    .line 96
    const/4 v9, 0x0

    .line 97
    invoke-static {v6, v3, v4, v8, v9}, Lcom/discord/ripple/RippleUtilsKt;->addRipple$default(Landroid/view/View;ZIILjava/lang/Object;)V

    .line 98
    .line 99
    .line 100
    new-instance v8, Landroid/widget/LinearLayout$LayoutParams;

    .line 101
    .line 102
    invoke-direct {v8, v0, v0}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 103
    .line 104
    .line 105
    invoke-virtual {v8, v5, v1, v4, v1}, Landroid/view/ViewGroup$MarginLayoutParams;->setMargins(IIII)V

    .line 106
    .line 107
    .line 108
    invoke-virtual {v6, v8}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 109
    .line 110
    .line 111
    invoke-virtual {p0, v6}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 112
    .line 113
    .line 114
    move v5, v7

    .line 115
    goto :goto_0

    .line 116
    :cond_2
    return-void
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
.end method


# virtual methods
.method public final clean()V
    .locals 3

    .line 1
    invoke-static {p0}, Landroidx/core/view/k2;->a(Landroid/view/ViewGroup;)Lkotlin/sequences/Sequence;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {v0}, Lkotlin/sequences/Sequence;->iterator()Ljava/util/Iterator;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    check-cast v1, Landroid/view/View;

    .line 20
    .line 21
    const-string v2, "null cannot be cast to non-null type com.discord.sticker.StickerView"

    .line 22
    .line 23
    invoke-static {v1, v2}, Lkotlin/jvm/internal/q;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    check-cast v1, Lcom/discord/sticker/StickerView;

    .line 27
    .line 28
    invoke-virtual {v1}, Lcom/discord/image/animated_image/apng/APNGImageView;->recycle()V

    .line 29
    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    return-void
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

.method public final getOnLongPressSticker()Lkotlin/jvm/functions/Function1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function1<",
            "Ljava/lang/String;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/discord/sticker_picker/StickerPickerRowView;->onLongPressSticker:Lkotlin/jvm/functions/Function1;

    return-object v0
.end method

.method public final getOnPressSticker()Lkotlin/jvm/functions/Function1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function1<",
            "Ljava/lang/String;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/discord/sticker_picker/StickerPickerRowView;->onPressSticker:Lkotlin/jvm/functions/Function1;

    return-object v0
.end method

.method public final setOnLongPressSticker(Lkotlin/jvm/functions/Function1;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/String;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    .line 1
    const-string v0, "<set-?>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lcom/discord/sticker_picker/StickerPickerRowView;->onLongPressSticker:Lkotlin/jvm/functions/Function1;

    .line 7
    .line 8
    return-void
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
.end method

.method public final setOnPressSticker(Lkotlin/jvm/functions/Function1;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/String;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    .line 1
    const-string v0, "<set-?>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lcom/discord/sticker_picker/StickerPickerRowView;->onPressSticker:Lkotlin/jvm/functions/Function1;

    .line 7
    .line 8
    return-void
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
.end method

.method public final setRowData(Lcom/discord/sticker_picker/StickerPickerRow;)V
    .locals 2

    .line 1
    const-string v0, "rowData"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Lcom/discord/sticker_picker/StickerPickerRow;->getItems()Ljava/util/List;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    if-eq v0, v1, :cond_0

    .line 19
    .line 20
    invoke-direct {p0, p1}, Lcom/discord/sticker_picker/StickerPickerRowView;->createRowStickerViews(Lcom/discord/sticker_picker/StickerPickerRow;)V

    .line 21
    .line 22
    .line 23
    :cond_0
    invoke-direct {p0, p1}, Lcom/discord/sticker_picker/StickerPickerRowView;->configureRowStickerViews(Lcom/discord/sticker_picker/StickerPickerRow;)V

    .line 24
    .line 25
    .line 26
    iget-boolean p1, p0, Lcom/discord/sticker_picker/StickerPickerRowView;->firstRenderPass:Z

    .line 27
    .line 28
    if-eqz p1, :cond_1

    .line 29
    .line 30
    const/4 p1, 0x0

    .line 31
    iput-boolean p1, p0, Lcom/discord/sticker_picker/StickerPickerRowView;->firstRenderPass:Z

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_1
    invoke-static {p0}, Lcom/discord/misc/utilities/measure/ViewMeasureExtensionsKt;->measureAndLayout(Landroid/view/View;)V

    .line 35
    .line 36
    .line 37
    :goto_0
    return-void
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
.end method
