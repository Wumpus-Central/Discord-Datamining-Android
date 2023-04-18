.class Lcom/facebook/drawee/drawable/ScalingUtils$l;
.super Lcom/facebook/drawee/drawable/ScalingUtils$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/drawee/drawable/ScalingUtils;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "l"
.end annotation


# static fields
.field public static final l:Lcom/facebook/drawee/drawable/ScalingUtils$ScaleType;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/facebook/drawee/drawable/ScalingUtils$l;

    invoke-direct {v0}, Lcom/facebook/drawee/drawable/ScalingUtils$l;-><init>()V

    sput-object v0, Lcom/facebook/drawee/drawable/ScalingUtils$l;->l:Lcom/facebook/drawee/drawable/ScalingUtils$ScaleType;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/facebook/drawee/drawable/ScalingUtils$a;-><init>()V

    return-void
.end method


# virtual methods
.method public getTransformImpl(Landroid/graphics/Matrix;Landroid/graphics/Rect;IIFFFF)V
    .locals 3

    .line 1
    cmpl-float v0, p8, p7

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/high16 v2, 0x3f000000    # 0.5f

    .line 5
    .line 6
    if-lez v0, :cond_0

    .line 7
    .line 8
    invoke-virtual {p2}, Landroid/graphics/Rect;->width()I

    .line 9
    .line 10
    .line 11
    move-result p4

    .line 12
    int-to-float p4, p4

    .line 13
    mul-float/2addr p4, v2

    .line 14
    int-to-float p3, p3

    .line 15
    mul-float/2addr p3, p8

    .line 16
    mul-float/2addr p5, p3

    .line 17
    sub-float/2addr p4, p5

    .line 18
    iget p5, p2, Landroid/graphics/Rect;->left:I

    .line 19
    .line 20
    int-to-float p5, p5

    .line 21
    invoke-static {p4, v1}, Ljava/lang/Math;->min(FF)F

    .line 22
    .line 23
    .line 24
    move-result p4

    .line 25
    invoke-virtual {p2}, Landroid/graphics/Rect;->width()I

    .line 26
    .line 27
    .line 28
    move-result p6

    .line 29
    int-to-float p6, p6

    .line 30
    sub-float/2addr p6, p3

    .line 31
    invoke-static {p4, p6}, Ljava/lang/Math;->max(FF)F

    .line 32
    .line 33
    .line 34
    move-result p3

    .line 35
    add-float/2addr p5, p3

    .line 36
    iget p2, p2, Landroid/graphics/Rect;->top:I

    .line 37
    .line 38
    int-to-float p2, p2

    .line 39
    move p7, p8

    .line 40
    goto :goto_0

    .line 41
    :cond_0
    iget p3, p2, Landroid/graphics/Rect;->left:I

    .line 42
    .line 43
    int-to-float p5, p3

    .line 44
    invoke-virtual {p2}, Landroid/graphics/Rect;->height()I

    .line 45
    .line 46
    .line 47
    move-result p3

    .line 48
    int-to-float p3, p3

    .line 49
    mul-float/2addr p3, v2

    .line 50
    int-to-float p4, p4

    .line 51
    mul-float/2addr p4, p7

    .line 52
    mul-float/2addr p6, p4

    .line 53
    sub-float/2addr p3, p6

    .line 54
    iget p6, p2, Landroid/graphics/Rect;->top:I

    .line 55
    .line 56
    int-to-float p6, p6

    .line 57
    invoke-static {p3, v1}, Ljava/lang/Math;->min(FF)F

    .line 58
    .line 59
    .line 60
    move-result p3

    .line 61
    invoke-virtual {p2}, Landroid/graphics/Rect;->height()I

    .line 62
    .line 63
    .line 64
    move-result p2

    .line 65
    int-to-float p2, p2

    .line 66
    sub-float/2addr p2, p4

    .line 67
    invoke-static {p3, p2}, Ljava/lang/Math;->max(FF)F

    .line 68
    .line 69
    .line 70
    move-result p2

    .line 71
    add-float/2addr p2, p6

    .line 72
    :goto_0
    invoke-virtual {p1, p7, p7}, Landroid/graphics/Matrix;->setScale(FF)V

    .line 73
    .line 74
    .line 75
    add-float/2addr p5, v2

    .line 76
    float-to-int p3, p5

    .line 77
    int-to-float p3, p3

    .line 78
    add-float/2addr p2, v2

    .line 79
    float-to-int p2, p2

    .line 80
    int-to-float p2, p2

    .line 81
    invoke-virtual {p1, p3, p2}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    .line 82
    .line 83
    .line 84
    return-void
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
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    const-string v0, "focus_crop"

    return-object v0
.end method
