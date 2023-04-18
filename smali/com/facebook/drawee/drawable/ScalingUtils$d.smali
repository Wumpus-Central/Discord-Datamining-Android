.class Lcom/facebook/drawee/drawable/ScalingUtils$d;
.super Lcom/facebook/drawee/drawable/ScalingUtils$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/drawee/drawable/ScalingUtils;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "d"
.end annotation


# static fields
.field public static final l:Lcom/facebook/drawee/drawable/ScalingUtils$ScaleType;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/facebook/drawee/drawable/ScalingUtils$d;

    invoke-direct {v0}, Lcom/facebook/drawee/drawable/ScalingUtils$d;-><init>()V

    sput-object v0, Lcom/facebook/drawee/drawable/ScalingUtils$d;->l:Lcom/facebook/drawee/drawable/ScalingUtils$ScaleType;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/facebook/drawee/drawable/ScalingUtils$a;-><init>()V

    return-void
.end method


# virtual methods
.method public getTransformImpl(Landroid/graphics/Matrix;Landroid/graphics/Rect;IIFFFF)V
    .locals 0

    .line 1
    invoke-static {p7, p8}, Ljava/lang/Math;->min(FF)F

    .line 2
    .line 3
    .line 4
    move-result p5

    .line 5
    const/high16 p6, 0x3f800000    # 1.0f

    .line 6
    .line 7
    invoke-static {p5, p6}, Ljava/lang/Math;->min(FF)F

    .line 8
    .line 9
    .line 10
    move-result p5

    .line 11
    iget p6, p2, Landroid/graphics/Rect;->left:I

    .line 12
    .line 13
    int-to-float p6, p6

    .line 14
    invoke-virtual {p2}, Landroid/graphics/Rect;->width()I

    .line 15
    .line 16
    .line 17
    move-result p7

    .line 18
    int-to-float p7, p7

    .line 19
    int-to-float p3, p3

    .line 20
    mul-float/2addr p3, p5

    .line 21
    sub-float/2addr p7, p3

    .line 22
    const/high16 p3, 0x3f000000    # 0.5f

    .line 23
    .line 24
    mul-float/2addr p7, p3

    .line 25
    add-float/2addr p6, p7

    .line 26
    iget p7, p2, Landroid/graphics/Rect;->top:I

    .line 27
    .line 28
    int-to-float p7, p7

    .line 29
    invoke-virtual {p2}, Landroid/graphics/Rect;->height()I

    .line 30
    .line 31
    .line 32
    move-result p2

    .line 33
    int-to-float p2, p2

    .line 34
    int-to-float p4, p4

    .line 35
    mul-float/2addr p4, p5

    .line 36
    sub-float/2addr p2, p4

    .line 37
    mul-float/2addr p2, p3

    .line 38
    add-float/2addr p7, p2

    .line 39
    invoke-virtual {p1, p5, p5}, Landroid/graphics/Matrix;->setScale(FF)V

    .line 40
    .line 41
    .line 42
    add-float/2addr p6, p3

    .line 43
    float-to-int p2, p6

    .line 44
    int-to-float p2, p2

    .line 45
    add-float/2addr p7, p3

    .line 46
    float-to-int p3, p7

    .line 47
    int-to-float p3, p3

    .line 48
    invoke-virtual {p1, p2, p3}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    .line 49
    .line 50
    .line 51
    return-void
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
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    const-string v0, "center_inside"

    return-object v0
.end method
