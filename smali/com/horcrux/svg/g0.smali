.class Lcom/horcrux/svg/g0;
.super Lcom/horcrux/svg/t0;
.source "SourceFile"


# annotations
.annotation build Landroid/annotation/SuppressLint;
    value = {
        "ViewConstructor"
    }
.end annotation


# instance fields
.field private final A:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final B:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Landroid/graphics/Matrix;",
            ">;"
        }
    .end annotation
.end field

.field private final C:Landroid/content/res/AssetManager;

.field private x:Landroid/graphics/Path;

.field y:Ljava/lang/String;

.field private z:Lcom/horcrux/svg/h0;


# direct methods
.method public constructor <init>(Lcom/facebook/react/bridge/ReactContext;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/horcrux/svg/t0;-><init>(Lcom/facebook/react/bridge/ReactContext;)V

    .line 2
    .line 3
    .line 4
    new-instance p1, Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lcom/horcrux/svg/g0;->A:Ljava/util/ArrayList;

    .line 10
    .line 11
    new-instance p1, Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object p1, p0, Lcom/horcrux/svg/g0;->B:Ljava/util/ArrayList;

    .line 17
    .line 18
    iget-object p1, p0, Lcom/horcrux/svg/VirtualView;->mContext:Lcom/facebook/react/bridge/ReactContext;

    .line 19
    .line 20
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    invoke-virtual {p1}, Landroid/content/res/Resources;->getAssets()Landroid/content/res/AssetManager;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    iput-object p1, p0, Lcom/horcrux/svg/g0;->C:Landroid/content/res/AssetManager;

    .line 29
    .line 30
    return-void
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
.end method

.method private p(Landroid/graphics/Paint;Lcom/horcrux/svg/h;)V
    .locals 7

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    iget-wide v1, p2, Lcom/horcrux/svg/h;->n:D

    .line 4
    .line 5
    iget-wide v3, p2, Lcom/horcrux/svg/h;->a:D

    .line 6
    .line 7
    iget v5, p0, Lcom/horcrux/svg/VirtualView;->mScale:F

    .line 8
    .line 9
    float-to-double v5, v5

    .line 10
    mul-double/2addr v3, v5

    .line 11
    div-double v3, v1, v3

    .line 12
    .line 13
    double-to-float v3, v3

    .line 14
    invoke-virtual {p1, v3}, Landroid/graphics/Paint;->setLetterSpacing(F)V

    .line 15
    .line 16
    .line 17
    const-wide/16 v3, 0x0

    .line 18
    .line 19
    cmpl-double v1, v1, v3

    .line 20
    .line 21
    if-nez v1, :cond_0

    .line 22
    .line 23
    iget-object v1, p2, Lcom/horcrux/svg/h;->i:Lcom/horcrux/svg/k0;

    .line 24
    .line 25
    sget-object v2, Lcom/horcrux/svg/k0;->k:Lcom/horcrux/svg/k0;

    .line 26
    .line 27
    if-ne v1, v2, :cond_0

    .line 28
    .line 29
    const/4 v1, 0x1

    .line 30
    goto :goto_0

    .line 31
    :cond_0
    const/4 v1, 0x0

    .line 32
    :goto_0
    if-eqz v1, :cond_1

    .line 33
    .line 34
    new-instance v1, Ljava/lang/StringBuilder;

    .line 35
    .line 36
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 37
    .line 38
    .line 39
    const-string v2, "\'rlig\', \'liga\', \'clig\', \'calt\', \'locl\', \'ccmp\', \'mark\', \'mkmk\',\'kern\', \'hlig\', \'cala\', "

    .line 40
    .line 41
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    iget-object v2, p2, Lcom/horcrux/svg/h;->g:Ljava/lang/String;

    .line 45
    .line 46
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    invoke-virtual {p1, v1}, Landroid/graphics/Paint;->setFontFeatureSettings(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    goto :goto_1

    .line 57
    :cond_1
    new-instance v1, Ljava/lang/StringBuilder;

    .line 58
    .line 59
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 60
    .line 61
    .line 62
    const-string v2, "\'rlig\', \'liga\', \'clig\', \'calt\', \'locl\', \'ccmp\', \'mark\', \'mkmk\',\'kern\', \'liga\' 0, \'clig\' 0, \'dlig\' 0, \'hlig\' 0, \'cala\' 0, "

    .line 63
    .line 64
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    iget-object v2, p2, Lcom/horcrux/svg/h;->g:Ljava/lang/String;

    .line 68
    .line 69
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v1

    .line 76
    invoke-virtual {p1, v1}, Landroid/graphics/Paint;->setFontFeatureSettings(Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    :goto_1
    const/16 v1, 0x1a

    .line 80
    .line 81
    if-lt v0, v1, :cond_2

    .line 82
    .line 83
    new-instance v0, Ljava/lang/StringBuilder;

    .line 84
    .line 85
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 86
    .line 87
    .line 88
    const-string v1, "\'wght\' "

    .line 89
    .line 90
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 91
    .line 92
    .line 93
    iget v1, p2, Lcom/horcrux/svg/h;->f:I

    .line 94
    .line 95
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 96
    .line 97
    .line 98
    iget-object p2, p2, Lcom/horcrux/svg/h;->h:Ljava/lang/String;

    .line 99
    .line 100
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 101
    .line 102
    .line 103
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object p2

    .line 107
    invoke-static {p1, p2}, Lcom/horcrux/svg/f0;->a(Landroid/graphics/Paint;Ljava/lang/String;)Z

    .line 108
    .line 109
    .line 110
    :cond_2
    return-void
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
.end method

.method private q(Landroid/graphics/Paint;Lcom/horcrux/svg/h;)V
    .locals 10

    .line 1
    iget-object v0, p2, Lcom/horcrux/svg/h;->e:Lcom/horcrux/svg/l0;

    .line 2
    .line 3
    sget-object v1, Lcom/horcrux/svg/l0;->m:Lcom/horcrux/svg/l0;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x1

    .line 7
    if-eq v0, v1, :cond_1

    .line 8
    .line 9
    iget v0, p2, Lcom/horcrux/svg/h;->f:I

    .line 10
    .line 11
    const/16 v1, 0x226

    .line 12
    .line 13
    if-lt v0, v1, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    move v0, v2

    .line 17
    goto :goto_1

    .line 18
    :cond_1
    :goto_0
    move v0, v3

    .line 19
    :goto_1
    iget-object v1, p2, Lcom/horcrux/svg/h;->c:Lcom/horcrux/svg/j0;

    .line 20
    .line 21
    sget-object v4, Lcom/horcrux/svg/j0;->l:Lcom/horcrux/svg/j0;

    .line 22
    .line 23
    if-ne v1, v4, :cond_2

    .line 24
    .line 25
    move v1, v3

    .line 26
    goto :goto_2

    .line 27
    :cond_2
    move v1, v2

    .line 28
    :goto_2
    if-eqz v0, :cond_3

    .line 29
    .line 30
    if-eqz v1, :cond_3

    .line 31
    .line 32
    const/4 v2, 0x3

    .line 33
    goto :goto_3

    .line 34
    :cond_3
    if-eqz v0, :cond_4

    .line 35
    .line 36
    move v2, v3

    .line 37
    goto :goto_3

    .line 38
    :cond_4
    if-eqz v1, :cond_5

    .line 39
    .line 40
    const/4 v2, 0x2

    .line 41
    :cond_5
    :goto_3
    iget v0, p2, Lcom/horcrux/svg/h;->f:I

    .line 42
    .line 43
    iget-object v4, p2, Lcom/horcrux/svg/h;->b:Ljava/lang/String;

    .line 44
    .line 45
    const/4 v5, 0x0

    .line 46
    if-eqz v4, :cond_7

    .line 47
    .line 48
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 49
    .line 50
    .line 51
    move-result v6

    .line 52
    if-lez v6, :cond_7

    .line 53
    .line 54
    new-instance v6, Ljava/lang/StringBuilder;

    .line 55
    .line 56
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 57
    .line 58
    .line 59
    const-string v7, "fonts/"

    .line 60
    .line 61
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    const-string v8, ".otf"

    .line 68
    .line 69
    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v6

    .line 76
    new-instance v8, Ljava/lang/StringBuilder;

    .line 77
    .line 78
    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    .line 79
    .line 80
    .line 81
    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 82
    .line 83
    .line 84
    invoke-virtual {v8, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 85
    .line 86
    .line 87
    const-string v7, ".ttf"

    .line 88
    .line 89
    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 90
    .line 91
    .line 92
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object v7

    .line 96
    sget v8, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 97
    .line 98
    const/16 v9, 0x1a

    .line 99
    .line 100
    if-lt v8, v9, :cond_6

    .line 101
    .line 102
    new-instance v5, Landroid/graphics/Typeface$Builder;

    .line 103
    .line 104
    iget-object v8, p0, Lcom/horcrux/svg/g0;->C:Landroid/content/res/AssetManager;

    .line 105
    .line 106
    invoke-direct {v5, v8, v6}, Landroid/graphics/Typeface$Builder;-><init>(Landroid/content/res/AssetManager;Ljava/lang/String;)V

    .line 107
    .line 108
    .line 109
    new-instance v6, Ljava/lang/StringBuilder;

    .line 110
    .line 111
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 112
    .line 113
    .line 114
    const-string v8, "\'wght\' "

    .line 115
    .line 116
    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 117
    .line 118
    .line 119
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 120
    .line 121
    .line 122
    iget-object v9, p2, Lcom/horcrux/svg/h;->h:Ljava/lang/String;

    .line 123
    .line 124
    invoke-virtual {v6, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 125
    .line 126
    .line 127
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 128
    .line 129
    .line 130
    move-result-object v6

    .line 131
    invoke-static {v5, v6}, Lcom/horcrux/svg/e0;->a(Landroid/graphics/Typeface$Builder;Ljava/lang/String;)Landroid/graphics/Typeface$Builder;

    .line 132
    .line 133
    .line 134
    invoke-static {v5, v0}, Landroidx/core/graphics/h;->a(Landroid/graphics/Typeface$Builder;I)Landroid/graphics/Typeface$Builder;

    .line 135
    .line 136
    .line 137
    invoke-static {v5, v1}, Landroidx/core/graphics/i;->a(Landroid/graphics/Typeface$Builder;Z)Landroid/graphics/Typeface$Builder;

    .line 138
    .line 139
    .line 140
    invoke-static {v5}, Landroidx/core/graphics/j;->a(Landroid/graphics/Typeface$Builder;)Landroid/graphics/Typeface;

    .line 141
    .line 142
    .line 143
    move-result-object v5

    .line 144
    if-nez v5, :cond_7

    .line 145
    .line 146
    new-instance v5, Landroid/graphics/Typeface$Builder;

    .line 147
    .line 148
    iget-object v6, p0, Lcom/horcrux/svg/g0;->C:Landroid/content/res/AssetManager;

    .line 149
    .line 150
    invoke-direct {v5, v6, v7}, Landroid/graphics/Typeface$Builder;-><init>(Landroid/content/res/AssetManager;Ljava/lang/String;)V

    .line 151
    .line 152
    .line 153
    new-instance v6, Ljava/lang/StringBuilder;

    .line 154
    .line 155
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 156
    .line 157
    .line 158
    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 159
    .line 160
    .line 161
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 162
    .line 163
    .line 164
    iget-object v7, p2, Lcom/horcrux/svg/h;->h:Ljava/lang/String;

    .line 165
    .line 166
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 167
    .line 168
    .line 169
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 170
    .line 171
    .line 172
    move-result-object v6

    .line 173
    invoke-static {v5, v6}, Lcom/horcrux/svg/e0;->a(Landroid/graphics/Typeface$Builder;Ljava/lang/String;)Landroid/graphics/Typeface$Builder;

    .line 174
    .line 175
    .line 176
    invoke-static {v5, v0}, Landroidx/core/graphics/h;->a(Landroid/graphics/Typeface$Builder;I)Landroid/graphics/Typeface$Builder;

    .line 177
    .line 178
    .line 179
    invoke-static {v5, v1}, Landroidx/core/graphics/i;->a(Landroid/graphics/Typeface$Builder;Z)Landroid/graphics/Typeface$Builder;

    .line 180
    .line 181
    .line 182
    invoke-static {v5}, Landroidx/core/graphics/j;->a(Landroid/graphics/Typeface$Builder;)Landroid/graphics/Typeface;

    .line 183
    .line 184
    .line 185
    move-result-object v5

    .line 186
    goto :goto_4

    .line 187
    :cond_6
    :try_start_0
    iget-object v8, p0, Lcom/horcrux/svg/g0;->C:Landroid/content/res/AssetManager;

    .line 188
    .line 189
    invoke-static {v8, v6}, Landroid/graphics/Typeface;->createFromAsset(Landroid/content/res/AssetManager;Ljava/lang/String;)Landroid/graphics/Typeface;

    .line 190
    .line 191
    .line 192
    move-result-object v5

    .line 193
    invoke-static {v5, v2}, Landroid/graphics/Typeface;->create(Landroid/graphics/Typeface;I)Landroid/graphics/Typeface;

    .line 194
    .line 195
    .line 196
    move-result-object v5
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 197
    goto :goto_4

    .line 198
    :catch_0
    :try_start_1
    iget-object v6, p0, Lcom/horcrux/svg/g0;->C:Landroid/content/res/AssetManager;

    .line 199
    .line 200
    invoke-static {v6, v7}, Landroid/graphics/Typeface;->createFromAsset(Landroid/content/res/AssetManager;Ljava/lang/String;)Landroid/graphics/Typeface;

    .line 201
    .line 202
    .line 203
    move-result-object v5

    .line 204
    invoke-static {v5, v2}, Landroid/graphics/Typeface;->create(Landroid/graphics/Typeface;I)Landroid/graphics/Typeface;

    .line 205
    .line 206
    .line 207
    move-result-object v5
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 208
    :catch_1
    :cond_7
    :goto_4
    if-nez v5, :cond_8

    .line 209
    .line 210
    :try_start_2
    invoke-static {}, Lcom/facebook/react/views/text/ReactFontManager;->getInstance()Lcom/facebook/react/views/text/ReactFontManager;

    .line 211
    .line 212
    .line 213
    move-result-object v6

    .line 214
    iget-object v7, p0, Lcom/horcrux/svg/g0;->C:Landroid/content/res/AssetManager;

    .line 215
    .line 216
    invoke-virtual {v6, v4, v2, v7}, Lcom/facebook/react/views/text/ReactFontManager;->getTypeface(Ljava/lang/String;ILandroid/content/res/AssetManager;)Landroid/graphics/Typeface;

    .line 217
    .line 218
    .line 219
    move-result-object v5
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    .line 220
    :catch_2
    :cond_8
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 221
    .line 222
    const/16 v4, 0x1c

    .line 223
    .line 224
    if-lt v2, v4, :cond_9

    .line 225
    .line 226
    invoke-static {v5, v0, v1}, Landroidx/appcompat/widget/f0;->a(Landroid/graphics/Typeface;IZ)Landroid/graphics/Typeface;

    .line 227
    .line 228
    .line 229
    move-result-object v5

    .line 230
    :cond_9
    invoke-virtual {p1, v3}, Landroid/graphics/Paint;->setLinearText(Z)V

    .line 231
    .line 232
    .line 233
    invoke-virtual {p1, v3}, Landroid/graphics/Paint;->setSubpixelText(Z)V

    .line 234
    .line 235
    .line 236
    invoke-virtual {p1, v5}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    .line 237
    .line 238
    .line 239
    iget-wide v0, p2, Lcom/horcrux/svg/h;->a:D

    .line 240
    .line 241
    iget p2, p0, Lcom/horcrux/svg/VirtualView;->mScale:F

    .line 242
    .line 243
    float-to-double v2, p2

    .line 244
    mul-double/2addr v0, v2

    .line 245
    double-to-float p2, v0

    .line 246
    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 247
    .line 248
    .line 249
    const/4 p2, 0x0

    .line 250
    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setLetterSpacing(F)V

    .line 251
    .line 252
    .line 253
    return-void
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
.end method

.method private r(Landroid/graphics/Canvas;Landroid/graphics/Paint;)V
    .locals 18

    .line 1
    move-object/from16 v6, p0

    .line 2
    .line 3
    move-object/from16 v7, p1

    .line 4
    .line 5
    invoke-virtual/range {p0 .. p0}, Lcom/horcrux/svg/l;->e()Lcom/horcrux/svg/j;

    .line 6
    .line 7
    .line 8
    move-result-object v8

    .line 9
    invoke-virtual/range {p0 .. p0}, Lcom/horcrux/svg/t0;->g()V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v8}, Lcom/horcrux/svg/j;->b()Lcom/horcrux/svg/h;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    new-instance v1, Landroid/text/TextPaint;

    .line 17
    .line 18
    move-object/from16 v2, p2

    .line 19
    .line 20
    invoke-direct {v1, v2}, Landroid/text/TextPaint;-><init>(Landroid/graphics/Paint;)V

    .line 21
    .line 22
    .line 23
    invoke-direct {v6, v1, v0}, Lcom/horcrux/svg/g0;->q(Landroid/graphics/Paint;Lcom/horcrux/svg/h;)V

    .line 24
    .line 25
    .line 26
    invoke-direct {v6, v1, v0}, Lcom/horcrux/svg/g0;->p(Landroid/graphics/Paint;Lcom/horcrux/svg/h;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {v8}, Lcom/horcrux/svg/j;->c()D

    .line 30
    .line 31
    .line 32
    move-result-wide v16

    .line 33
    sget-object v2, Lcom/horcrux/svg/g0$a;->a:[I

    .line 34
    .line 35
    iget-object v0, v0, Lcom/horcrux/svg/h;->j:Lcom/horcrux/svg/m0;

    .line 36
    .line 37
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    aget v0, v2, v0

    .line 42
    .line 43
    const/4 v2, 0x2

    .line 44
    if-eq v0, v2, :cond_1

    .line 45
    .line 46
    const/4 v2, 0x3

    .line 47
    if-eq v0, v2, :cond_0

    .line 48
    .line 49
    sget-object v0, Landroid/text/Layout$Alignment;->ALIGN_NORMAL:Landroid/text/Layout$Alignment;

    .line 50
    .line 51
    :goto_0
    move-object v2, v0

    .line 52
    goto :goto_1

    .line 53
    :cond_0
    sget-object v0, Landroid/text/Layout$Alignment;->ALIGN_OPPOSITE:Landroid/text/Layout$Alignment;

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_1
    sget-object v0, Landroid/text/Layout$Alignment;->ALIGN_CENTER:Landroid/text/Layout$Alignment;

    .line 57
    .line 58
    goto :goto_0

    .line 59
    :goto_1
    const/4 v3, 0x1

    .line 60
    new-instance v4, Landroid/text/SpannableString;

    .line 61
    .line 62
    iget-object v0, v6, Lcom/horcrux/svg/g0;->y:Ljava/lang/String;

    .line 63
    .line 64
    invoke-direct {v4, v0}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    .line 65
    .line 66
    .line 67
    iget-object v9, v6, Lcom/horcrux/svg/t0;->m:Lcom/horcrux/svg/SVGLength;

    .line 68
    .line 69
    invoke-virtual/range {p1 .. p1}, Landroid/graphics/Canvas;->getWidth()I

    .line 70
    .line 71
    .line 72
    move-result v0

    .line 73
    int-to-double v10, v0

    .line 74
    const-wide/16 v12, 0x0

    .line 75
    .line 76
    iget v0, v6, Lcom/horcrux/svg/VirtualView;->mScale:F

    .line 77
    .line 78
    float-to-double v14, v0

    .line 79
    invoke-static/range {v9 .. v17}, Lcom/horcrux/svg/x;->a(Lcom/horcrux/svg/SVGLength;DDDD)D

    .line 80
    .line 81
    .line 82
    move-result-wide v9

    .line 83
    double-to-int v5, v9

    .line 84
    move-object/from16 v0, p0

    .line 85
    .line 86
    invoke-direct/range {v0 .. v5}, Lcom/horcrux/svg/g0;->u(Landroid/text/TextPaint;Landroid/text/Layout$Alignment;ZLandroid/text/SpannableString;I)Landroid/text/StaticLayout;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    const/4 v1, 0x0

    .line 91
    invoke-virtual {v0, v1}, Landroid/text/Layout;->getLineAscent(I)I

    .line 92
    .line 93
    .line 94
    move-result v1

    .line 95
    const-wide/16 v2, 0x0

    .line 96
    .line 97
    invoke-virtual {v8, v2, v3}, Lcom/horcrux/svg/j;->l(D)D

    .line 98
    .line 99
    .line 100
    move-result-wide v2

    .line 101
    double-to-float v2, v2

    .line 102
    invoke-virtual {v8}, Lcom/horcrux/svg/j;->m()D

    .line 103
    .line 104
    .line 105
    move-result-wide v3

    .line 106
    int-to-double v8, v1

    .line 107
    add-double/2addr v3, v8

    .line 108
    double-to-float v1, v3

    .line 109
    invoke-virtual/range {p0 .. p0}, Lcom/horcrux/svg/l;->f()V

    .line 110
    .line 111
    .line 112
    invoke-virtual/range {p1 .. p1}, Landroid/graphics/Canvas;->save()I

    .line 113
    .line 114
    .line 115
    invoke-virtual {v7, v2, v1}, Landroid/graphics/Canvas;->translate(FF)V

    .line 116
    .line 117
    .line 118
    invoke-virtual {v0, v7}, Landroid/text/Layout;->draw(Landroid/graphics/Canvas;)V

    .line 119
    .line 120
    .line 121
    invoke-virtual/range {p1 .. p1}, Landroid/graphics/Canvas;->restore()V

    .line 122
    .line 123
    .line 124
    return-void
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
.end method

.method private s(Lcom/horcrux/svg/SVGLength;DD)D
    .locals 9

    const-wide/16 v3, 0x0

    iget v0, p0, Lcom/horcrux/svg/VirtualView;->mScale:F

    float-to-double v5, v0

    move-object v0, p1

    move-wide v1, p2

    move-wide v7, p4

    invoke-static/range {v0 .. v8}, Lcom/horcrux/svg/x;->a(Lcom/horcrux/svg/SVGLength;DDDD)D

    move-result-wide p1

    return-wide p1
.end method

.method private t(Ljava/lang/String;Landroid/graphics/Paint;Landroid/graphics/Canvas;)Landroid/graphics/Path;
    .locals 68

    move-object/from16 v6, p0

    move-object/from16 v14, p2

    move-object/from16 v15, p3

    .line 1
    invoke-virtual/range {p1 .. p1}, Ljava/lang/String;->length()I

    move-result v13

    .line 2
    new-instance v12, Landroid/graphics/Path;

    invoke-direct {v12}, Landroid/graphics/Path;-><init>()V

    .line 3
    iget-object v0, v6, Lcom/horcrux/svg/g0;->A:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 4
    iget-object v0, v6, Lcom/horcrux/svg/g0;->B:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    if-nez v13, :cond_0

    return-object v12

    .line 5
    :cond_0
    iget-object v0, v6, Lcom/horcrux/svg/g0;->z:Lcom/horcrux/svg/h0;

    const/4 v11, 0x0

    if-eqz v0, :cond_1

    const/16 v16, 0x1

    goto :goto_0

    :cond_1
    move/from16 v16, v11

    :goto_0
    const-wide/16 v17, 0x0

    if-eqz v16, :cond_3

    .line 6
    new-instance v0, Landroid/graphics/PathMeasure;

    iget-object v1, v6, Lcom/horcrux/svg/g0;->z:Lcom/horcrux/svg/h0;

    invoke-virtual {v1, v15, v14}, Lcom/horcrux/svg/h0;->s(Landroid/graphics/Canvas;Landroid/graphics/Paint;)Landroid/graphics/Path;

    move-result-object v1

    invoke-direct {v0, v1, v11}, Landroid/graphics/PathMeasure;-><init>(Landroid/graphics/Path;Z)V

    .line 7
    invoke-virtual {v0}, Landroid/graphics/PathMeasure;->getLength()F

    move-result v1

    float-to-double v1, v1

    .line 8
    invoke-virtual {v0}, Landroid/graphics/PathMeasure;->isClosed()Z

    move-result v3

    cmpl-double v4, v1, v17

    if-nez v4, :cond_2

    return-object v12

    :cond_2
    move-object v9, v0

    move-wide v7, v1

    move/from16 v19, v3

    goto :goto_1

    :cond_3
    const/4 v0, 0x0

    move-object v9, v0

    move/from16 v19, v11

    move-wide/from16 v7, v17

    .line 9
    :goto_1
    invoke-virtual/range {p0 .. p0}, Lcom/horcrux/svg/l;->e()Lcom/horcrux/svg/j;

    move-result-object v4

    .line 10
    invoke-virtual {v4}, Lcom/horcrux/svg/j;->b()Lcom/horcrux/svg/h;

    move-result-object v0

    .line 11
    invoke-direct {v6, v14, v0}, Lcom/horcrux/svg/g0;->q(Landroid/graphics/Paint;Lcom/horcrux/svg/h;)V

    .line 12
    new-instance v5, Lcom/horcrux/svg/k;

    invoke-direct {v5, v14}, Lcom/horcrux/svg/k;-><init>(Landroid/graphics/Paint;)V

    .line 13
    new-array v2, v13, [Z

    .line 14
    invoke-virtual/range {p1 .. p1}, Ljava/lang/String;->toCharArray()[C

    move-result-object v20

    move-object/from16 v21, v12

    .line 15
    iget-wide v11, v0, Lcom/horcrux/svg/h;->l:D

    move-wide/from16 v22, v11

    .line 16
    iget-wide v11, v0, Lcom/horcrux/svg/h;->m:D

    move-wide/from16 v25, v11

    .line 17
    iget-wide v10, v0, Lcom/horcrux/svg/h;->n:D

    .line 18
    iget-boolean v1, v0, Lcom/horcrux/svg/h;->o:Z

    const/4 v3, 0x1

    xor-int/lit8 v27, v1, 0x1

    cmpl-double v1, v10, v17

    if-nez v1, :cond_4

    .line 19
    iget-object v1, v0, Lcom/horcrux/svg/h;->i:Lcom/horcrux/svg/k0;

    sget-object v3, Lcom/horcrux/svg/k0;->k:Lcom/horcrux/svg/k0;

    if-ne v1, v3, :cond_4

    const/4 v1, 0x1

    goto :goto_2

    :cond_4
    const/4 v1, 0x0

    .line 20
    :goto_2
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    if-eqz v1, :cond_5

    .line 21
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v12, "\'rlig\', \'liga\', \'clig\', \'calt\', \'locl\', \'ccmp\', \'mark\', \'mkmk\',\'kern\', \'hlig\', \'cala\', "

    invoke-virtual {v1, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v12, v0, Lcom/horcrux/svg/h;->g:Ljava/lang/String;

    invoke-virtual {v1, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v14, v1}, Landroid/graphics/Paint;->setFontFeatureSettings(Ljava/lang/String;)V

    goto :goto_3

    .line 22
    :cond_5
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v12, "\'rlig\', \'liga\', \'clig\', \'calt\', \'locl\', \'ccmp\', \'mark\', \'mkmk\',\'kern\', \'liga\' 0, \'clig\' 0, \'dlig\' 0, \'hlig\' 0, \'cala\' 0, "

    invoke-virtual {v1, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v12, v0, Lcom/horcrux/svg/h;->g:Ljava/lang/String;

    invoke-virtual {v1, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v14, v1}, Landroid/graphics/Paint;->setFontFeatureSettings(Ljava/lang/String;)V

    :goto_3
    const/16 v1, 0x1a

    if-lt v3, v1, :cond_6

    .line 23
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "\'wght\' "

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v3, v0, Lcom/horcrux/svg/h;->f:I

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    iget-object v3, v0, Lcom/horcrux/svg/h;->h:Ljava/lang/String;

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v14, v1}, Lcom/horcrux/svg/f0;->a(Landroid/graphics/Paint;Ljava/lang/String;)Z

    .line 24
    :cond_6
    iget-object v12, v0, Lcom/horcrux/svg/h;->d:Lcom/facebook/react/bridge/ReadableMap;

    .line 25
    new-array v3, v13, [F

    move-object/from16 v1, p1

    .line 26
    invoke-virtual {v14, v1, v3}, Landroid/graphics/Paint;->getTextWidths(Ljava/lang/String;[F)I

    .line 27
    iget-object v1, v0, Lcom/horcrux/svg/h;->j:Lcom/horcrux/svg/m0;

    .line 28
    invoke-virtual/range {p0 .. p0}, Lcom/horcrux/svg/t0;->n()Lcom/horcrux/svg/t0;

    move-result-object v0

    move-object/from16 v28, v9

    move-wide/from16 v29, v10

    .line 29
    invoke-virtual {v0, v14}, Lcom/horcrux/svg/t0;->m(Landroid/graphics/Paint;)D

    move-result-wide v9

    .line 30
    invoke-direct {v6, v1, v9, v10}, Lcom/horcrux/svg/g0;->v(Lcom/horcrux/svg/m0;D)D

    move-result-wide v31

    .line 31
    invoke-virtual {v4}, Lcom/horcrux/svg/j;->c()D

    move-result-wide v42

    const-wide/high16 v44, 0x4000000000000000L    # 2.0

    if-eqz v16, :cond_b

    .line 32
    iget-object v0, v6, Lcom/horcrux/svg/g0;->z:Lcom/horcrux/svg/h0;

    invoke-virtual {v0}, Lcom/horcrux/svg/h0;->p()Lcom/horcrux/svg/q0;

    move-result-object v0

    sget-object v11, Lcom/horcrux/svg/q0;->k:Lcom/horcrux/svg/q0;

    if-ne v0, v11, :cond_7

    const/4 v11, 0x1

    goto :goto_4

    :cond_7
    const/4 v11, 0x0

    .line 33
    :goto_4
    iget-object v0, v6, Lcom/horcrux/svg/g0;->z:Lcom/horcrux/svg/h0;

    invoke-virtual {v0}, Lcom/horcrux/svg/h0;->q()Lcom/horcrux/svg/r0;

    move-result-object v0

    move-object/from16 v33, v1

    sget-object v1, Lcom/horcrux/svg/r0;->l:Lcom/horcrux/svg/r0;

    if-ne v0, v1, :cond_8

    const/16 v34, -0x1

    goto :goto_5

    :cond_8
    const/16 v34, 0x1

    .line 34
    :goto_5
    iget-object v0, v6, Lcom/horcrux/svg/g0;->z:Lcom/horcrux/svg/h0;

    invoke-virtual {v0}, Lcom/horcrux/svg/h0;->r()Lcom/horcrux/svg/SVGLength;

    move-result-object v1

    move-object/from16 v0, p0

    move/from16 v35, v11

    move-object/from16 v11, v33

    move-object/from16 v46, v2

    move-object/from16 v47, v3

    move-wide v2, v7

    move-object v15, v4

    move-object/from16 v48, v5

    move-wide/from16 v4, v42

    invoke-direct/range {v0 .. v5}, Lcom/horcrux/svg/g0;->s(Lcom/horcrux/svg/SVGLength;DD)D

    move-result-wide v0

    add-double v31, v31, v0

    if-eqz v19, :cond_a

    div-double v2, v7, v44

    .line 35
    sget-object v4, Lcom/horcrux/svg/m0;->l:Lcom/horcrux/svg/m0;

    if-ne v11, v4, :cond_9

    neg-double v2, v2

    goto :goto_6

    :cond_9
    move-wide/from16 v2, v17

    :goto_6
    add-double/2addr v0, v2

    add-double v2, v0, v7

    goto :goto_7

    :cond_a
    move-wide v2, v7

    move-wide/from16 v0, v17

    :goto_7
    move/from16 v4, v34

    move/from16 v5, v35

    goto :goto_8

    :cond_b
    move-object/from16 v46, v2

    move-object/from16 v47, v3

    move-object v15, v4

    move-object/from16 v48, v5

    move-wide v2, v7

    move-wide/from16 v0, v17

    const/4 v4, 0x1

    const/4 v5, 0x0

    .line 36
    :goto_8
    iget-object v11, v6, Lcom/horcrux/svg/t0;->n:Lcom/horcrux/svg/SVGLength;

    move-wide/from16 v49, v7

    const-wide/high16 v51, 0x3ff0000000000000L    # 1.0

    if-eqz v11, :cond_e

    .line 37
    invoke-virtual/range {p3 .. p3}, Landroid/graphics/Canvas;->getWidth()I

    move-result v8

    int-to-double v7, v8

    const-wide/16 v36, 0x0

    move/from16 v53, v5

    iget v5, v6, Lcom/horcrux/svg/VirtualView;->mScale:F

    move-wide/from16 v54, v0

    float-to-double v0, v5

    move-object/from16 v33, v11

    move-wide/from16 v34, v7

    move-wide/from16 v38, v0

    move-wide/from16 v40, v42

    invoke-static/range {v33 .. v41}, Lcom/horcrux/svg/x;->a(Lcom/horcrux/svg/SVGLength;DDDD)D

    move-result-wide v0

    cmpg-double v5, v0, v17

    if-ltz v5, :cond_d

    .line 38
    sget-object v5, Lcom/horcrux/svg/g0$a;->b:[I

    iget-object v7, v6, Lcom/horcrux/svg/t0;->p:Lcom/horcrux/svg/o0;

    invoke-virtual {v7}, Ljava/lang/Enum;->ordinal()I

    move-result v7

    aget v5, v5, v7

    const/4 v7, 0x2

    if-eq v5, v7, :cond_c

    sub-double/2addr v0, v9

    add-int/lit8 v5, v13, -0x1

    int-to-double v7, v5

    div-double/2addr v0, v7

    add-double v10, v29, v0

    move-wide/from16 v29, v10

    goto :goto_9

    :cond_c
    div-double v51, v0, v9

    goto :goto_9

    .line 39
    :cond_d
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Negative textLength value"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_e
    move-wide/from16 v54, v0

    move/from16 v53, v5

    :goto_9
    int-to-double v0, v4

    mul-double v10, v51, v0

    .line 40
    invoke-virtual/range {p2 .. p2}, Landroid/graphics/Paint;->getFontMetrics()Landroid/graphics/Paint$FontMetrics;

    move-result-object v5

    .line 41
    iget v7, v5, Landroid/graphics/Paint$FontMetrics;->descent:F

    float-to-double v7, v7

    .line 42
    iget v9, v5, Landroid/graphics/Paint$FontMetrics;->leading:F

    move-wide/from16 v40, v10

    float-to-double v10, v9

    add-double/2addr v10, v7

    move/from16 v56, v4

    .line 43
    iget v4, v5, Landroid/graphics/Paint$FontMetrics;->ascent:F

    neg-float v4, v4

    add-float/2addr v4, v9

    move-wide/from16 v57, v2

    float-to-double v2, v4

    .line 44
    iget v4, v5, Landroid/graphics/Paint$FontMetrics;->top:F

    neg-float v4, v4

    float-to-double v4, v4

    add-double v33, v4, v10

    .line 45
    invoke-virtual/range {p0 .. p0}, Lcom/horcrux/svg/t0;->k()Ljava/lang/String;

    move-result-object v9

    .line 46
    invoke-virtual/range {p0 .. p0}, Lcom/horcrux/svg/t0;->j()Lcom/horcrux/svg/i0;

    move-result-object v35

    if-eqz v35, :cond_f

    .line 47
    sget-object v36, Lcom/horcrux/svg/g0$a;->c:[I

    invoke-virtual/range {v35 .. v35}, Ljava/lang/Enum;->ordinal()I

    move-result v37

    aget v36, v36, v37

    packed-switch v36, :pswitch_data_0

    goto :goto_c

    :pswitch_0
    move-wide v10, v4

    goto :goto_b

    :pswitch_1
    div-double v10, v33, v44

    goto :goto_b

    :pswitch_2
    move-wide v10, v2

    goto :goto_b

    :pswitch_3
    const-wide v4, 0x3fe999999999999aL    # 0.8

    goto :goto_a

    :pswitch_4
    const-wide/high16 v4, 0x3fe0000000000000L    # 0.5

    :goto_a
    mul-double v10, v2, v4

    goto :goto_b

    :pswitch_5
    sub-double/2addr v2, v7

    div-double v10, v2, v44

    :goto_b
    :pswitch_6
    const/4 v4, 0x0

    goto :goto_d

    .line 48
    :pswitch_7
    new-instance v2, Landroid/graphics/Rect;

    invoke-direct {v2}, Landroid/graphics/Rect;-><init>()V

    const-string v3, "x"

    const/4 v4, 0x0

    const/4 v5, 0x1

    .line 49
    invoke-virtual {v14, v3, v4, v5, v2}, Landroid/graphics/Paint;->getTextBounds(Ljava/lang/String;IILandroid/graphics/Rect;)V

    .line 50
    invoke-virtual {v2}, Landroid/graphics/Rect;->height()I

    move-result v2

    int-to-double v2, v2

    div-double v10, v2, v44

    goto :goto_d

    :pswitch_8
    const/4 v4, 0x0

    neg-double v10, v7

    goto :goto_d

    :cond_f
    :goto_c
    :pswitch_9
    const/4 v4, 0x0

    move-wide/from16 v10, v17

    :goto_d
    if-eqz v9, :cond_13

    .line 51
    invoke-virtual {v9}, Ljava/lang/String;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_13

    .line 52
    sget-object v2, Lcom/horcrux/svg/g0$a;->c:[I

    invoke-virtual/range {v35 .. v35}, Ljava/lang/Enum;->ordinal()I

    move-result v3

    aget v2, v2, v3

    const/16 v3, 0xe

    if-eq v2, v3, :cond_13

    const/16 v3, 0x10

    if-eq v2, v3, :cond_13

    .line 53
    invoke-virtual {v9}, Ljava/lang/String;->hashCode()I

    move-result v2

    sparse-switch v2, :sswitch_data_0

    :goto_e
    const/4 v2, -0x1

    goto :goto_f

    :sswitch_0
    const-string v2, "super"

    invoke-virtual {v9, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_10

    goto :goto_e

    :cond_10
    const/4 v2, 0x2

    goto :goto_f

    :sswitch_1
    const-string v2, "sub"

    invoke-virtual {v9, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_11

    goto :goto_e

    :cond_11
    const/4 v2, 0x1

    goto :goto_f

    :sswitch_2
    const-string v2, "baseline"

    invoke-virtual {v9, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_12

    goto :goto_e

    :cond_12
    move v2, v4

    :goto_f
    const-string v3, "os2"

    const-string v5, "unitsPerEm"

    const-string v7, "tables"

    packed-switch v2, :pswitch_data_1

    .line 54
    iget v2, v6, Lcom/horcrux/svg/VirtualView;->mScale:F

    float-to-double v7, v2

    mul-double v34, v7, v42

    float-to-double v2, v2

    move-object/from16 v33, v9

    move-wide/from16 v36, v2

    move-wide/from16 v38, v42

    invoke-static/range {v33 .. v39}, Lcom/horcrux/svg/x;->b(Ljava/lang/String;DDD)D

    move-result-wide v2

    sub-double/2addr v10, v2

    goto :goto_10

    :pswitch_a
    if-eqz v12, :cond_13

    .line 55
    invoke-interface {v12, v7}, Lcom/facebook/react/bridge/ReadableMap;->hasKey(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_13

    invoke-interface {v12, v5}, Lcom/facebook/react/bridge/ReadableMap;->hasKey(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_13

    .line 56
    invoke-interface {v12, v5}, Lcom/facebook/react/bridge/ReadableMap;->getInt(Ljava/lang/String;)I

    move-result v2

    .line 57
    invoke-interface {v12, v7}, Lcom/facebook/react/bridge/ReadableMap;->getMap(Ljava/lang/String;)Lcom/facebook/react/bridge/ReadableMap;

    move-result-object v5

    .line 58
    invoke-interface {v5, v3}, Lcom/facebook/react/bridge/ReadableMap;->hasKey(Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_13

    .line 59
    invoke-interface {v5, v3}, Lcom/facebook/react/bridge/ReadableMap;->getMap(Ljava/lang/String;)Lcom/facebook/react/bridge/ReadableMap;

    move-result-object v3

    const-string v5, "ySuperscriptYOffset"

    .line 60
    invoke-interface {v3, v5}, Lcom/facebook/react/bridge/ReadableMap;->hasKey(Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_13

    .line 61
    invoke-interface {v3, v5}, Lcom/facebook/react/bridge/ReadableMap;->getDouble(Ljava/lang/String;)D

    move-result-wide v7

    .line 62
    iget v3, v6, Lcom/horcrux/svg/VirtualView;->mScale:F

    float-to-double v4, v3

    mul-double v4, v4, v42

    mul-double/2addr v4, v7

    int-to-double v2, v2

    div-double/2addr v4, v2

    sub-double/2addr v10, v4

    goto :goto_10

    :pswitch_b
    if-eqz v12, :cond_13

    .line 63
    invoke-interface {v12, v7}, Lcom/facebook/react/bridge/ReadableMap;->hasKey(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_13

    invoke-interface {v12, v5}, Lcom/facebook/react/bridge/ReadableMap;->hasKey(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_13

    .line 64
    invoke-interface {v12, v5}, Lcom/facebook/react/bridge/ReadableMap;->getInt(Ljava/lang/String;)I

    move-result v2

    .line 65
    invoke-interface {v12, v7}, Lcom/facebook/react/bridge/ReadableMap;->getMap(Ljava/lang/String;)Lcom/facebook/react/bridge/ReadableMap;

    move-result-object v4

    .line 66
    invoke-interface {v4, v3}, Lcom/facebook/react/bridge/ReadableMap;->hasKey(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_13

    .line 67
    invoke-interface {v4, v3}, Lcom/facebook/react/bridge/ReadableMap;->getMap(Ljava/lang/String;)Lcom/facebook/react/bridge/ReadableMap;

    move-result-object v3

    const-string v4, "ySubscriptYOffset"

    .line 68
    invoke-interface {v3, v4}, Lcom/facebook/react/bridge/ReadableMap;->hasKey(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_13

    .line 69
    invoke-interface {v3, v4}, Lcom/facebook/react/bridge/ReadableMap;->getDouble(Ljava/lang/String;)D

    move-result-wide v3

    .line 70
    iget v5, v6, Lcom/horcrux/svg/VirtualView;->mScale:F

    float-to-double v7, v5

    mul-double v7, v7, v42

    mul-double/2addr v7, v3

    int-to-double v2, v2

    div-double/2addr v7, v2

    add-double/2addr v10, v7

    :cond_13
    :goto_10
    :pswitch_c
    move-wide v2, v10

    .line 71
    new-instance v4, Landroid/graphics/Matrix;

    invoke-direct {v4}, Landroid/graphics/Matrix;-><init>()V

    .line 72
    new-instance v5, Landroid/graphics/Matrix;

    invoke-direct {v5}, Landroid/graphics/Matrix;-><init>()V

    .line 73
    new-instance v12, Landroid/graphics/Matrix;

    invoke-direct {v12}, Landroid/graphics/Matrix;-><init>()V

    const/16 v7, 0x9

    new-array v11, v7, [F

    new-array v10, v7, [F

    const/4 v9, 0x0

    :goto_11
    if-ge v9, v13, :cond_25

    .line 74
    aget-char v7, v20, v9

    .line 75
    invoke-static {v7}, Ljava/lang/String;->valueOf(C)Ljava/lang/String;

    move-result-object v8

    .line 76
    aget-boolean v33, v46, v9

    if-eqz v33, :cond_14

    const-string v8, ""

    move-object v6, v8

    move/from16 v34, v13

    const/4 v8, 0x0

    goto :goto_14

    :cond_14
    move-object/from16 v59, v8

    move/from16 v24, v9

    const/4 v8, 0x0

    :goto_12
    const/16 v34, 0x1

    add-int/lit8 v6, v24, 0x1

    if-ge v6, v13, :cond_16

    .line 77
    aget v34, v47, v6

    const/16 v35, 0x0

    cmpl-float v34, v34, v35

    if-lez v34, :cond_15

    goto :goto_13

    .line 78
    :cond_15
    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    move/from16 v34, v13

    move-object/from16 v13, v59

    invoke-virtual {v8, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    aget-char v13, v20, v6

    invoke-virtual {v8, v13}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v59

    const/4 v8, 0x1

    .line 79
    aput-boolean v8, v46, v6

    move/from16 v24, v6

    move/from16 v13, v34

    const/4 v8, 0x1

    goto :goto_12

    :cond_16
    :goto_13
    move/from16 v34, v13

    move-object/from16 v13, v59

    move-object v6, v13

    .line 80
    :goto_14
    invoke-virtual {v14, v6}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    move-result v13

    float-to-double v13, v13

    mul-double v13, v13, v51

    move-object/from16 v35, v6

    if-eqz v27, :cond_17

    .line 81
    aget v6, v47, v9

    move/from16 v37, v8

    move/from16 v36, v9

    float-to-double v8, v6

    mul-double v8, v8, v51

    sub-double/2addr v8, v13

    move-wide/from16 v22, v8

    goto :goto_15

    :cond_17
    move/from16 v37, v8

    move/from16 v36, v9

    :goto_15
    const/16 v6, 0x20

    if-ne v7, v6, :cond_18

    const/4 v6, 0x1

    goto :goto_16

    :cond_18
    const/4 v6, 0x0

    :goto_16
    if-eqz v6, :cond_19

    move-wide/from16 v8, v25

    goto :goto_17

    :cond_19
    move-wide/from16 v8, v17

    :goto_17
    add-double v8, v8, v29

    add-double/2addr v8, v13

    if-eqz v33, :cond_1a

    move-wide/from16 v42, v2

    move-wide/from16 v2, v17

    goto :goto_18

    :cond_1a
    add-double v38, v22, v8

    move-wide/from16 v42, v2

    move-wide/from16 v2, v38

    .line 82
    :goto_18
    invoke-virtual {v15, v2, v3}, Lcom/horcrux/svg/j;->l(D)D

    move-result-wide v2

    move-object/from16 v39, v10

    move-object/from16 v38, v11

    .line 83
    invoke-virtual {v15}, Lcom/horcrux/svg/j;->m()D

    move-result-wide v10

    .line 84
    invoke-virtual {v15}, Lcom/horcrux/svg/j;->i()D

    move-result-wide v59

    .line 85
    invoke-virtual {v15}, Lcom/horcrux/svg/j;->j()D

    move-result-wide v61

    move-wide/from16 v63, v10

    .line 86
    invoke-virtual {v15}, Lcom/horcrux/svg/j;->k()D

    move-result-wide v10

    if-nez v33, :cond_24

    if-eqz v6, :cond_1b

    goto/16 :goto_1e

    :cond_1b
    mul-double/2addr v8, v0

    mul-double/2addr v13, v0

    add-double v2, v2, v59

    mul-double/2addr v2, v0

    add-double v2, v31, v2

    sub-double/2addr v2, v8

    if-eqz v16, :cond_21

    add-double v8, v2, v13

    div-double v13, v13, v44

    move/from16 v33, v7

    add-double v6, v2, v13

    cmpl-double v59, v6, v57

    if-lez v59, :cond_1c

    goto/16 :goto_1e

    :cond_1c
    cmpg-double v59, v6, v54

    if-gez v59, :cond_1d

    goto/16 :goto_1e

    :cond_1d
    move-object/from16 v59, v15

    const/4 v15, 0x3

    if-eqz v53, :cond_1e

    double-to-float v2, v6

    move-object/from16 v3, v28

    .line 87
    invoke-virtual {v3, v2, v5, v15}, Landroid/graphics/PathMeasure;->getMatrix(FLandroid/graphics/Matrix;I)Z

    move-wide/from16 v65, v10

    move-object/from16 v15, v38

    goto :goto_1b

    :cond_1e
    move-wide/from16 v65, v10

    move-object/from16 v10, v28

    cmpg-double v11, v2, v17

    if-gez v11, :cond_1f

    const/4 v11, 0x0

    .line 88
    invoke-virtual {v10, v11, v4, v15}, Landroid/graphics/PathMeasure;->getMatrix(FLandroid/graphics/Matrix;I)Z

    double-to-float v2, v2

    .line 89
    invoke-virtual {v4, v2, v11}, Landroid/graphics/Matrix;->preTranslate(FF)Z

    const/4 v11, 0x1

    goto :goto_19

    :cond_1f
    double-to-float v2, v2

    const/4 v11, 0x1

    .line 90
    invoke-virtual {v10, v2, v4, v11}, Landroid/graphics/PathMeasure;->getMatrix(FLandroid/graphics/Matrix;I)Z

    :goto_19
    double-to-float v2, v6

    .line 91
    invoke-virtual {v10, v2, v5, v11}, Landroid/graphics/PathMeasure;->getMatrix(FLandroid/graphics/Matrix;I)Z

    cmpl-double v2, v8, v49

    if-lez v2, :cond_20

    move-wide/from16 v6, v49

    double-to-float v2, v6

    .line 92
    invoke-virtual {v10, v2, v12, v15}, Landroid/graphics/PathMeasure;->getMatrix(FLandroid/graphics/Matrix;I)Z

    sub-double/2addr v8, v6

    double-to-float v2, v8

    const/4 v3, 0x0

    .line 93
    invoke-virtual {v12, v2, v3}, Landroid/graphics/Matrix;->preTranslate(FF)Z

    goto :goto_1a

    :cond_20
    move-wide/from16 v6, v49

    double-to-float v2, v8

    .line 94
    invoke-virtual {v10, v2, v12, v11}, Landroid/graphics/PathMeasure;->getMatrix(FLandroid/graphics/Matrix;I)Z

    :goto_1a
    move-object/from16 v15, v38

    .line 95
    invoke-virtual {v4, v15}, Landroid/graphics/Matrix;->getValues([F)V

    move-object/from16 v9, v39

    .line 96
    invoke-virtual {v12, v9}, Landroid/graphics/Matrix;->getValues([F)V

    const/4 v8, 0x2

    aget v2, v15, v8

    float-to-double v2, v2

    const/16 v19, 0x5

    aget v11, v15, v19

    move-wide/from16 v49, v6

    float-to-double v6, v11

    aget v11, v9, v8

    move-object/from16 v28, v10

    float-to-double v10, v11

    aget v8, v9, v19

    float-to-double v8, v8

    sub-double/2addr v10, v2

    sub-double/2addr v8, v6

    .line 97
    invoke-static {v8, v9, v10, v11}, Ljava/lang/Math;->atan2(DD)D

    move-result-wide v2

    const-wide v6, 0x404ca5dc1a63c1f8L    # 57.29577951308232

    mul-double/2addr v2, v6

    mul-double/2addr v2, v0

    double-to-float v2, v2

    .line 98
    invoke-virtual {v5, v2}, Landroid/graphics/Matrix;->preRotate(F)Z

    :goto_1b
    neg-double v2, v13

    double-to-float v2, v2

    add-double v6, v61, v42

    double-to-float v3, v6

    .line 99
    invoke-virtual {v5, v2, v3}, Landroid/graphics/Matrix;->preTranslate(FF)Z

    move-wide/from16 v10, v40

    double-to-float v2, v10

    move/from16 v6, v56

    int-to-float v3, v6

    .line 100
    invoke-virtual {v5, v2, v3}, Landroid/graphics/Matrix;->preScale(FF)Z

    move-wide/from16 v7, v63

    double-to-float v2, v7

    const/4 v3, 0x0

    .line 101
    invoke-virtual {v5, v3, v2}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    goto :goto_1c

    :cond_21
    move/from16 v33, v7

    move-wide/from16 v65, v10

    move-object/from16 v59, v15

    move-object/from16 v15, v38

    move-wide/from16 v10, v40

    move/from16 v6, v56

    move-wide/from16 v7, v63

    double-to-float v2, v2

    add-double v7, v7, v61

    add-double v7, v7, v42

    double-to-float v3, v7

    .line 102
    invoke-virtual {v5, v2, v3}, Landroid/graphics/Matrix;->setTranslate(FF)V

    :goto_1c
    move-wide/from16 v2, v65

    double-to-float v2, v2

    .line 103
    invoke-virtual {v5, v2}, Landroid/graphics/Matrix;->preRotate(F)Z

    if-eqz v37, :cond_22

    .line 104
    new-instance v2, Landroid/graphics/Path;

    invoke-direct {v2}, Landroid/graphics/Path;-><init>()V

    const/4 v9, 0x0

    .line 105
    invoke-virtual/range {v35 .. v35}, Ljava/lang/String;->length()I

    move-result v3

    const/4 v13, 0x0

    const/4 v14, 0x0

    move-wide/from16 v37, v49

    const/16 v19, 0x2

    move-object/from16 v7, p2

    move-object/from16 v8, v35

    move/from16 v33, v36

    move-object/from16 v36, v28

    move-object/from16 v28, v39

    move-wide/from16 v39, v10

    move-object/from16 v24, v28

    const/4 v11, 0x1

    move v10, v3

    move-object v3, v15

    move v15, v11

    move v11, v13

    move-object/from16 v13, v21

    move-object/from16 v21, v12

    move v12, v14

    move-object/from16 v67, v13

    move/from16 v14, v34

    move-object v13, v2

    invoke-virtual/range {v7 .. v13}, Landroid/graphics/Paint;->getTextPath(Ljava/lang/String;IIFFLandroid/graphics/Path;)V

    move-object v7, v2

    move-object/from16 v13, v35

    move-object/from16 v2, v48

    goto :goto_1d

    :cond_22
    move-object v3, v15

    move-object/from16 v67, v21

    move/from16 v7, v33

    move/from16 v14, v34

    move-object/from16 v13, v35

    move/from16 v33, v36

    move-object/from16 v24, v39

    move-object/from16 v2, v48

    move-wide/from16 v37, v49

    const/4 v15, 0x1

    const/16 v19, 0x2

    move-wide/from16 v39, v10

    move-object/from16 v21, v12

    move-object/from16 v36, v28

    .line 106
    invoke-virtual {v2, v7, v13}, Lcom/horcrux/svg/k;->b(CLjava/lang/String;)Landroid/graphics/Path;

    move-result-object v7

    .line 107
    :goto_1d
    new-instance v8, Landroid/graphics/RectF;

    invoke-direct {v8}, Landroid/graphics/RectF;-><init>()V

    .line 108
    invoke-virtual {v7, v8, v15}, Landroid/graphics/Path;->computeBounds(Landroid/graphics/RectF;Z)V

    .line 109
    invoke-virtual {v8}, Landroid/graphics/RectF;->width()F

    move-result v8

    const/4 v9, 0x0

    cmpl-float v8, v8, v9

    if-nez v8, :cond_23

    .line 110
    invoke-virtual/range {p3 .. p3}, Landroid/graphics/Canvas;->save()I

    move-object v8, v2

    move-object/from16 v2, p3

    .line 111
    invoke-virtual {v2, v5}, Landroid/graphics/Canvas;->concat(Landroid/graphics/Matrix;)V

    move v7, v9

    move-object/from16 v9, p0

    .line 112
    iget-object v10, v9, Lcom/horcrux/svg/g0;->A:Ljava/util/ArrayList;

    invoke-virtual {v10, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 113
    iget-object v10, v9, Lcom/horcrux/svg/g0;->B:Ljava/util/ArrayList;

    new-instance v11, Landroid/graphics/Matrix;

    invoke-direct {v11, v5}, Landroid/graphics/Matrix;-><init>(Landroid/graphics/Matrix;)V

    invoke-virtual {v10, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move-object/from16 v10, p2

    .line 114
    invoke-virtual {v2, v13, v7, v7, v10}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 115
    invoke-virtual/range {p3 .. p3}, Landroid/graphics/Canvas;->restore()V

    move-object/from16 v11, v67

    goto :goto_1f

    :cond_23
    move-object/from16 v9, p0

    move-object/from16 v10, p2

    move-object v8, v2

    move-object/from16 v2, p3

    .line 116
    invoke-virtual {v7, v5}, Landroid/graphics/Path;->transform(Landroid/graphics/Matrix;)V

    move-object/from16 v11, v67

    .line 117
    invoke-virtual {v11, v7}, Landroid/graphics/Path;->addPath(Landroid/graphics/Path;)V

    goto :goto_1f

    :cond_24
    :goto_1e
    move-object/from16 v9, p0

    move-object/from16 v10, p2

    move-object/from16 v2, p3

    move-object/from16 v59, v15

    move-object/from16 v11, v21

    move/from16 v14, v34

    move/from16 v33, v36

    move-object/from16 v3, v38

    move-object/from16 v24, v39

    move-wide/from16 v39, v40

    move-object/from16 v8, v48

    move-wide/from16 v37, v49

    move/from16 v6, v56

    const/4 v15, 0x1

    const/16 v19, 0x2

    move-object/from16 v21, v12

    move-object/from16 v36, v28

    :goto_1f
    add-int/lit8 v7, v33, 0x1

    move/from16 v56, v6

    move-object/from16 v48, v8

    move-object v6, v9

    move v13, v14

    move-object/from16 v12, v21

    move-object/from16 v28, v36

    move-wide/from16 v49, v37

    move-wide/from16 v40, v39

    move-object/from16 v15, v59

    move v9, v7

    move-object v14, v10

    move-object/from16 v21, v11

    move-object/from16 v10, v24

    move-object v11, v3

    move-wide/from16 v2, v42

    goto/16 :goto_11

    :cond_25
    move-object v9, v6

    move-object/from16 v11, v21

    return-object v11

    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_8
        :pswitch_8
        :pswitch_8
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_6
        :pswitch_1
        :pswitch_0
    .end packed-switch

    :sswitch_data_0
    .sparse-switch
        -0x669119bb -> :sswitch_2
        0x1be40 -> :sswitch_1
        0x68b6f7b -> :sswitch_0
    .end sparse-switch

    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_c
        :pswitch_b
        :pswitch_a
    .end packed-switch
.end method

.method private u(Landroid/text/TextPaint;Landroid/text/Layout$Alignment;ZLandroid/text/SpannableString;I)Landroid/text/StaticLayout;
    .locals 2

    .line 1
    invoke-virtual {p4}, Landroid/text/SpannableString;->length()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    invoke-static {p4, v1, v0, p1, p5}, Landroid/text/StaticLayout$Builder;->obtain(Ljava/lang/CharSequence;IILandroid/text/TextPaint;I)Landroid/text/StaticLayout$Builder;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    invoke-virtual {p1, p2}, Landroid/text/StaticLayout$Builder;->setAlignment(Landroid/text/Layout$Alignment;)Landroid/text/StaticLayout$Builder;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    const/4 p2, 0x0

    .line 15
    const/high16 p4, 0x3f800000    # 1.0f

    .line 16
    .line 17
    invoke-virtual {p1, p2, p4}, Landroid/text/StaticLayout$Builder;->setLineSpacing(FF)Landroid/text/StaticLayout$Builder;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    invoke-virtual {p1, p3}, Landroid/text/StaticLayout$Builder;->setIncludePad(Z)Landroid/text/StaticLayout$Builder;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    const/4 p2, 0x1

    .line 26
    invoke-virtual {p1, p2}, Landroid/text/StaticLayout$Builder;->setBreakStrategy(I)Landroid/text/StaticLayout$Builder;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    invoke-virtual {p1, p2}, Landroid/text/StaticLayout$Builder;->setHyphenationFrequency(I)Landroid/text/StaticLayout$Builder;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    invoke-virtual {p1}, Landroid/text/StaticLayout$Builder;->build()Landroid/text/StaticLayout;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    return-object p1
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
.end method

.method private v(Lcom/horcrux/svg/m0;D)D
    .locals 2

    sget-object v0, Lcom/horcrux/svg/g0$a;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    const/4 v0, 0x2

    if-eq p1, v0, :cond_1

    const/4 v0, 0x3

    if-eq p1, v0, :cond_0

    const-wide/16 p1, 0x0

    return-wide p1

    :cond_0
    neg-double p1, p2

    return-wide p1

    :cond_1
    neg-double p1, p2

    const-wide/high16 v0, 0x4000000000000000L    # 2.0

    div-double/2addr p1, v0

    return-wide p1
.end method

.method private w()V
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    :goto_0
    if-eqz v0, :cond_2

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    const-class v2, Lcom/horcrux/svg/h0;

    .line 12
    .line 13
    if-ne v1, v2, :cond_0

    .line 14
    .line 15
    check-cast v0, Lcom/horcrux/svg/h0;

    .line 16
    .line 17
    iput-object v0, p0, Lcom/horcrux/svg/g0;->z:Lcom/horcrux/svg/h0;

    .line 18
    .line 19
    goto :goto_1

    .line 20
    :cond_0
    instance-of v1, v0, Lcom/horcrux/svg/t0;

    .line 21
    .line 22
    if-nez v1, :cond_1

    .line 23
    .line 24
    goto :goto_1

    .line 25
    :cond_1
    invoke-interface {v0}, Landroid/view/ViewParent;->getParent()Landroid/view/ViewParent;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    goto :goto_0

    .line 30
    :cond_2
    :goto_1
    return-void
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
.end method

.method public static x(Ljava/lang/String;)Ljava/lang/String;
    .locals 9

    .line 1
    if-eqz p0, :cond_6

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    goto :goto_3

    .line 10
    :cond_0
    new-instance v0, Ljava/text/Bidi;

    .line 11
    .line 12
    const/4 v1, -0x2

    .line 13
    invoke-direct {v0, p0, v1}, Ljava/text/Bidi;-><init>(Ljava/lang/String;I)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0}, Ljava/text/Bidi;->isLeftToRight()Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    if-eqz v1, :cond_1

    .line 21
    .line 22
    return-object p0

    .line 23
    :cond_1
    invoke-virtual {v0}, Ljava/text/Bidi;->getRunCount()I

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    new-array v2, v1, [B

    .line 28
    .line 29
    new-array v3, v1, [Ljava/lang/Integer;

    .line 30
    .line 31
    const/4 v4, 0x0

    .line 32
    move v5, v4

    .line 33
    :goto_0
    if-ge v5, v1, :cond_2

    .line 34
    .line 35
    invoke-virtual {v0, v5}, Ljava/text/Bidi;->getRunLevel(I)I

    .line 36
    .line 37
    .line 38
    move-result v6

    .line 39
    int-to-byte v6, v6

    .line 40
    aput-byte v6, v2, v5

    .line 41
    .line 42
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 43
    .line 44
    .line 45
    move-result-object v6

    .line 46
    aput-object v6, v3, v5

    .line 47
    .line 48
    add-int/lit8 v5, v5, 0x1

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_2
    invoke-static {v2, v4, v3, v4, v1}, Ljava/text/Bidi;->reorderVisually([BI[Ljava/lang/Object;II)V

    .line 52
    .line 53
    .line 54
    new-instance v5, Ljava/lang/StringBuilder;

    .line 55
    .line 56
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 57
    .line 58
    .line 59
    :goto_1
    if-ge v4, v1, :cond_5

    .line 60
    .line 61
    aget-object v6, v3, v4

    .line 62
    .line 63
    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    .line 64
    .line 65
    .line 66
    move-result v6

    .line 67
    invoke-virtual {v0, v6}, Ljava/text/Bidi;->getRunStart(I)I

    .line 68
    .line 69
    .line 70
    move-result v7

    .line 71
    invoke-virtual {v0, v6}, Ljava/text/Bidi;->getRunLimit(I)I

    .line 72
    .line 73
    .line 74
    move-result v8

    .line 75
    aget-byte v6, v2, v6

    .line 76
    .line 77
    and-int/lit8 v6, v6, 0x1

    .line 78
    .line 79
    if-eqz v6, :cond_3

    .line 80
    .line 81
    :goto_2
    add-int/lit8 v8, v8, -0x1

    .line 82
    .line 83
    if-lt v8, v7, :cond_4

    .line 84
    .line 85
    invoke-virtual {p0, v8}, Ljava/lang/String;->charAt(I)C

    .line 86
    .line 87
    .line 88
    move-result v6

    .line 89
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 90
    .line 91
    .line 92
    goto :goto_2

    .line 93
    :cond_3
    invoke-virtual {v5, p0, v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;II)Ljava/lang/StringBuilder;

    .line 94
    .line 95
    .line 96
    :cond_4
    add-int/lit8 v4, v4, 0x1

    .line 97
    .line 98
    goto :goto_1

    .line 99
    :cond_5
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object p0

    .line 103
    :cond_6
    :goto_3
    return-object p0
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
.end method


# virtual methods
.method clearCache()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lcom/horcrux/svg/g0;->x:Landroid/graphics/Path;

    .line 3
    .line 4
    invoke-super {p0}, Lcom/horcrux/svg/t0;->clearCache()V

    .line 5
    .line 6
    .line 7
    return-void
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
.end method

.method draw(Landroid/graphics/Canvas;Landroid/graphics/Paint;F)V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/horcrux/svg/g0;->y:Ljava/lang/String;

    .line 2
    .line 3
    if-eqz v0, :cond_3

    .line 4
    .line 5
    iget-object v0, p0, Lcom/horcrux/svg/t0;->m:Lcom/horcrux/svg/SVGLength;

    .line 6
    .line 7
    if-eqz v0, :cond_1

    .line 8
    .line 9
    iget-wide v0, v0, Lcom/horcrux/svg/SVGLength;->a:D

    .line 10
    .line 11
    const-wide/16 v2, 0x0

    .line 12
    .line 13
    cmpl-double v0, v0, v2

    .line 14
    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    iget v0, p0, Lcom/horcrux/svg/RenderableView;->fillOpacity:F

    .line 18
    .line 19
    mul-float/2addr v0, p3

    .line 20
    invoke-virtual {p0, p2, v0}, Lcom/horcrux/svg/RenderableView;->setupFillPaint(Landroid/graphics/Paint;F)Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-eqz v0, :cond_0

    .line 25
    .line 26
    invoke-direct {p0, p1, p2}, Lcom/horcrux/svg/g0;->r(Landroid/graphics/Canvas;Landroid/graphics/Paint;)V

    .line 27
    .line 28
    .line 29
    :cond_0
    iget v0, p0, Lcom/horcrux/svg/RenderableView;->strokeOpacity:F

    .line 30
    .line 31
    mul-float/2addr p3, v0

    .line 32
    invoke-virtual {p0, p2, p3}, Lcom/horcrux/svg/RenderableView;->setupStrokePaint(Landroid/graphics/Paint;F)Z

    .line 33
    .line 34
    .line 35
    move-result p3

    .line 36
    if-eqz p3, :cond_4

    .line 37
    .line 38
    invoke-direct {p0, p1, p2}, Lcom/horcrux/svg/g0;->r(Landroid/graphics/Canvas;Landroid/graphics/Paint;)V

    .line 39
    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_1
    iget-object v0, p0, Lcom/horcrux/svg/g0;->A:Ljava/util/ArrayList;

    .line 43
    .line 44
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    if-lez v0, :cond_2

    .line 49
    .line 50
    invoke-virtual {p0}, Lcom/horcrux/svg/l;->e()Lcom/horcrux/svg/j;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    invoke-virtual {v1}, Lcom/horcrux/svg/j;->b()Lcom/horcrux/svg/h;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    invoke-direct {p0, p2, v1}, Lcom/horcrux/svg/g0;->q(Landroid/graphics/Paint;Lcom/horcrux/svg/h;)V

    .line 59
    .line 60
    .line 61
    const/4 v1, 0x0

    .line 62
    :goto_0
    if-ge v1, v0, :cond_2

    .line 63
    .line 64
    iget-object v2, p0, Lcom/horcrux/svg/g0;->A:Ljava/util/ArrayList;

    .line 65
    .line 66
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v2

    .line 70
    check-cast v2, Ljava/lang/String;

    .line 71
    .line 72
    iget-object v3, p0, Lcom/horcrux/svg/g0;->B:Ljava/util/ArrayList;

    .line 73
    .line 74
    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v3

    .line 78
    check-cast v3, Landroid/graphics/Matrix;

    .line 79
    .line 80
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    .line 81
    .line 82
    .line 83
    invoke-virtual {p1, v3}, Landroid/graphics/Canvas;->concat(Landroid/graphics/Matrix;)V

    .line 84
    .line 85
    .line 86
    const/4 v3, 0x0

    .line 87
    invoke-virtual {p1, v2, v3, v3, p2}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 88
    .line 89
    .line 90
    invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V

    .line 91
    .line 92
    .line 93
    add-int/lit8 v1, v1, 0x1

    .line 94
    .line 95
    goto :goto_0

    .line 96
    :cond_2
    invoke-virtual {p0, p1, p2, p3}, Lcom/horcrux/svg/l;->b(Landroid/graphics/Canvas;Landroid/graphics/Paint;F)V

    .line 97
    .line 98
    .line 99
    goto :goto_1

    .line 100
    :cond_3
    invoke-virtual {p0, p1, p2}, Lcom/horcrux/svg/VirtualView;->clip(Landroid/graphics/Canvas;Landroid/graphics/Paint;)V

    .line 101
    .line 102
    .line 103
    invoke-virtual {p0, p1, p2, p3}, Lcom/horcrux/svg/l;->a(Landroid/graphics/Canvas;Landroid/graphics/Paint;F)V

    .line 104
    .line 105
    .line 106
    :cond_4
    :goto_1
    return-void
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

.method getPath(Landroid/graphics/Canvas;Landroid/graphics/Paint;)Landroid/graphics/Path;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/horcrux/svg/g0;->x:Landroid/graphics/Path;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    iget-object v0, p0, Lcom/horcrux/svg/g0;->y:Ljava/lang/String;

    .line 7
    .line 8
    if-nez v0, :cond_1

    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, Lcom/horcrux/svg/t0;->l(Landroid/graphics/Canvas;Landroid/graphics/Paint;)Landroid/graphics/Path;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    iput-object p1, p0, Lcom/horcrux/svg/g0;->x:Landroid/graphics/Path;

    .line 15
    .line 16
    return-object p1

    .line 17
    :cond_1
    invoke-direct {p0}, Lcom/horcrux/svg/g0;->w()V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0}, Lcom/horcrux/svg/t0;->g()V

    .line 21
    .line 22
    .line 23
    iget-object v0, p0, Lcom/horcrux/svg/g0;->y:Ljava/lang/String;

    .line 24
    .line 25
    invoke-static {v0}, Lcom/horcrux/svg/g0;->x(Ljava/lang/String;)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-direct {p0, v0, p2, p1}, Lcom/horcrux/svg/g0;->t(Ljava/lang/String;Landroid/graphics/Paint;Landroid/graphics/Canvas;)Landroid/graphics/Path;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    iput-object p1, p0, Lcom/horcrux/svg/g0;->x:Landroid/graphics/Path;

    .line 34
    .line 35
    invoke-virtual {p0}, Lcom/horcrux/svg/l;->f()V

    .line 36
    .line 37
    .line 38
    iget-object p1, p0, Lcom/horcrux/svg/g0;->x:Landroid/graphics/Path;

    .line 39
    .line 40
    return-object p1
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
.end method

.method hitTest([F)I
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/horcrux/svg/g0;->y:Ljava/lang/String;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-super {p0, p1}, Lcom/horcrux/svg/l;->hitTest([F)I

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    return p1

    .line 10
    :cond_0
    iget-object v0, p0, Lcom/horcrux/svg/VirtualView;->mPath:Landroid/graphics/Path;

    .line 11
    .line 12
    const/4 v1, -0x1

    .line 13
    if-eqz v0, :cond_5

    .line 14
    .line 15
    iget-boolean v0, p0, Lcom/horcrux/svg/VirtualView;->mInvertible:Z

    .line 16
    .line 17
    if-eqz v0, :cond_5

    .line 18
    .line 19
    iget-boolean v0, p0, Lcom/horcrux/svg/VirtualView;->mTransformInvertible:Z

    .line 20
    .line 21
    if-nez v0, :cond_1

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_1
    const/4 v0, 0x2

    .line 25
    new-array v0, v0, [F

    .line 26
    .line 27
    iget-object v2, p0, Lcom/horcrux/svg/VirtualView;->mInvMatrix:Landroid/graphics/Matrix;

    .line 28
    .line 29
    invoke-virtual {v2, v0, p1}, Landroid/graphics/Matrix;->mapPoints([F[F)V

    .line 30
    .line 31
    .line 32
    iget-object p1, p0, Lcom/horcrux/svg/VirtualView;->mInvTransform:Landroid/graphics/Matrix;

    .line 33
    .line 34
    invoke-virtual {p1, v0}, Landroid/graphics/Matrix;->mapPoints([F)V

    .line 35
    .line 36
    .line 37
    const/4 p1, 0x0

    .line 38
    aget p1, v0, p1

    .line 39
    .line 40
    invoke-static {p1}, Ljava/lang/Math;->round(F)I

    .line 41
    .line 42
    .line 43
    move-result p1

    .line 44
    const/4 v2, 0x1

    .line 45
    aget v0, v0, v2

    .line 46
    .line 47
    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    invoke-virtual {p0}, Lcom/horcrux/svg/RenderableView;->initBounds()V

    .line 52
    .line 53
    .line 54
    iget-object v2, p0, Lcom/horcrux/svg/VirtualView;->mRegion:Landroid/graphics/Region;

    .line 55
    .line 56
    if-eqz v2, :cond_2

    .line 57
    .line 58
    invoke-virtual {v2, p1, v0}, Landroid/graphics/Region;->contains(II)Z

    .line 59
    .line 60
    .line 61
    move-result v2

    .line 62
    if-nez v2, :cond_3

    .line 63
    .line 64
    :cond_2
    iget-object v2, p0, Lcom/horcrux/svg/VirtualView;->mStrokeRegion:Landroid/graphics/Region;

    .line 65
    .line 66
    if-eqz v2, :cond_5

    .line 67
    .line 68
    invoke-virtual {v2, p1, v0}, Landroid/graphics/Region;->contains(II)Z

    .line 69
    .line 70
    .line 71
    move-result v2

    .line 72
    if-nez v2, :cond_3

    .line 73
    .line 74
    goto :goto_0

    .line 75
    :cond_3
    invoke-virtual {p0}, Lcom/horcrux/svg/VirtualView;->getClipPath()Landroid/graphics/Path;

    .line 76
    .line 77
    .line 78
    move-result-object v2

    .line 79
    if-eqz v2, :cond_4

    .line 80
    .line 81
    iget-object v2, p0, Lcom/horcrux/svg/VirtualView;->mClipRegion:Landroid/graphics/Region;

    .line 82
    .line 83
    invoke-virtual {v2, p1, v0}, Landroid/graphics/Region;->contains(II)Z

    .line 84
    .line 85
    .line 86
    move-result p1

    .line 87
    if-nez p1, :cond_4

    .line 88
    .line 89
    return v1

    .line 90
    :cond_4
    invoke-virtual {p0}, Landroid/view/View;->getId()I

    .line 91
    .line 92
    .line 93
    move-result p1

    .line 94
    return p1

    .line 95
    :cond_5
    :goto_0
    return v1
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
.end method

.method public invalidate()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lcom/horcrux/svg/g0;->x:Landroid/graphics/Path;

    .line 3
    .line 4
    invoke-super {p0}, Lcom/horcrux/svg/t0;->invalidate()V

    .line 5
    .line 6
    .line 7
    return-void
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
.end method

.method m(Landroid/graphics/Paint;)D
    .locals 5

    .line 1
    iget-wide v0, p0, Lcom/horcrux/svg/t0;->w:D

    .line 2
    .line 3
    invoke-static {v0, v1}, Ljava/lang/Double;->isNaN(D)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    iget-wide v0, p0, Lcom/horcrux/svg/t0;->w:D

    .line 10
    .line 11
    return-wide v0

    .line 12
    :cond_0
    iget-object v0, p0, Lcom/horcrux/svg/g0;->y:Ljava/lang/String;

    .line 13
    .line 14
    const-wide/16 v1, 0x0

    .line 15
    .line 16
    if-nez v0, :cond_3

    .line 17
    .line 18
    const/4 v0, 0x0

    .line 19
    :goto_0
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 20
    .line 21
    .line 22
    move-result v3

    .line 23
    if-ge v0, v3, :cond_2

    .line 24
    .line 25
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 26
    .line 27
    .line 28
    move-result-object v3

    .line 29
    instance-of v4, v3, Lcom/horcrux/svg/t0;

    .line 30
    .line 31
    if-eqz v4, :cond_1

    .line 32
    .line 33
    check-cast v3, Lcom/horcrux/svg/t0;

    .line 34
    .line 35
    invoke-virtual {v3, p1}, Lcom/horcrux/svg/t0;->m(Landroid/graphics/Paint;)D

    .line 36
    .line 37
    .line 38
    move-result-wide v3

    .line 39
    add-double/2addr v1, v3

    .line 40
    :cond_1
    add-int/lit8 v0, v0, 0x1

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_2
    iput-wide v1, p0, Lcom/horcrux/svg/t0;->w:D

    .line 44
    .line 45
    return-wide v1

    .line 46
    :cond_3
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 47
    .line 48
    .line 49
    move-result v3

    .line 50
    if-nez v3, :cond_4

    .line 51
    .line 52
    iput-wide v1, p0, Lcom/horcrux/svg/t0;->w:D

    .line 53
    .line 54
    return-wide v1

    .line 55
    :cond_4
    invoke-virtual {p0}, Lcom/horcrux/svg/l;->e()Lcom/horcrux/svg/j;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    invoke-virtual {v1}, Lcom/horcrux/svg/j;->b()Lcom/horcrux/svg/h;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    invoke-direct {p0, p1, v1}, Lcom/horcrux/svg/g0;->q(Landroid/graphics/Paint;Lcom/horcrux/svg/h;)V

    .line 64
    .line 65
    .line 66
    invoke-direct {p0, p1, v1}, Lcom/horcrux/svg/g0;->p(Landroid/graphics/Paint;Lcom/horcrux/svg/h;)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    .line 70
    .line 71
    .line 72
    move-result p1

    .line 73
    float-to-double v0, p1

    .line 74
    iput-wide v0, p0, Lcom/horcrux/svg/t0;->w:D

    .line 75
    .line 76
    return-wide v0
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
.end method

.method public setContent(Ljava/lang/String;)V
    .locals 0
    .annotation runtime Lcom/facebook/react/uimanager/annotations/ReactProp;
        name = "content"
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/horcrux/svg/g0;->y:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/horcrux/svg/g0;->invalidate()V

    .line 4
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
.end method
