.class final Lcom/discord/overlapping_circles/OverlappingCirclesView$PlaceholderItem;
.super Landroid/view/View;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/discord/overlapping_circles/OverlappingCirclesView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "PlaceholderItem"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008\u0002\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0008\u0001\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\u0008\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u000bJ\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0014R\u000e\u0010\u0008\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000c\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0010\u001a\u00020\u00118BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0014\u0010\u0015\u001a\u0004\u0008\u0012\u0010\u0013R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"
    }
    d2 = {
        "Lcom/discord/overlapping_circles/OverlappingCirclesView$PlaceholderItem;",
        "Landroid/view/View;",
        "context",
        "Landroid/content/Context;",
        "bgColor",
        "",
        "showSeparation",
        "",
        "overlapPx",
        "separatorSizePx",
        "size",
        "(Landroid/content/Context;IZIII)V",
        "paint",
        "Landroid/graphics/Paint;",
        "radius",
        "",
        "separatorClipPath",
        "Landroid/graphics/Path;",
        "getSeparatorClipPath",
        "()Landroid/graphics/Path;",
        "separatorClipPath$delegate",
        "Lkotlin/Lazy;",
        "onDraw",
        "",
        "canvas",
        "Landroid/graphics/Canvas;",
        "overlapping_circles_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final overlapPx:I

.field private final paint:Landroid/graphics/Paint;

.field private final radius:F

.field private final separatorClipPath$delegate:Lkotlin/Lazy;

.field private final showSeparation:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;IZIII)V
    .locals 1

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0, p1}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 7
    .line 8
    .line 9
    iput-boolean p3, p0, Lcom/discord/overlapping_circles/OverlappingCirclesView$PlaceholderItem;->showSeparation:Z

    .line 10
    .line 11
    iput p4, p0, Lcom/discord/overlapping_circles/OverlappingCirclesView$PlaceholderItem;->overlapPx:I

    .line 12
    .line 13
    int-to-float p1, p6

    .line 14
    const/high16 p3, 0x40000000    # 2.0f

    .line 15
    .line 16
    div-float/2addr p1, p3

    .line 17
    iput p1, p0, Lcom/discord/overlapping_circles/OverlappingCirclesView$PlaceholderItem;->radius:F

    .line 18
    .line 19
    sget-object p1, Lnf/p;->m:Lnf/p;

    .line 20
    .line 21
    new-instance p3, Lcom/discord/overlapping_circles/OverlappingCirclesView$PlaceholderItem$separatorClipPath$2;

    .line 22
    .line 23
    invoke-direct {p3, p0, p5}, Lcom/discord/overlapping_circles/OverlappingCirclesView$PlaceholderItem$separatorClipPath$2;-><init>(Lcom/discord/overlapping_circles/OverlappingCirclesView$PlaceholderItem;I)V

    .line 24
    .line 25
    .line 26
    invoke-static {p1, p3}, Lnf/m;->b(Lnf/p;Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    iput-object p1, p0, Lcom/discord/overlapping_circles/OverlappingCirclesView$PlaceholderItem;->separatorClipPath$delegate:Lkotlin/Lazy;

    .line 31
    .line 32
    new-instance p1, Landroid/graphics/Paint;

    .line 33
    .line 34
    invoke-direct {p1}, Landroid/graphics/Paint;-><init>()V

    .line 35
    .line 36
    .line 37
    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setColor(I)V

    .line 38
    .line 39
    .line 40
    const/4 p2, 0x1

    .line 41
    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 42
    .line 43
    .line 44
    iput-object p1, p0, Lcom/discord/overlapping_circles/OverlappingCirclesView$PlaceholderItem;->paint:Landroid/graphics/Paint;

    .line 45
    .line 46
    return-void
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
.end method

.method public static final synthetic access$getOverlapPx$p(Lcom/discord/overlapping_circles/OverlappingCirclesView$PlaceholderItem;)I
    .locals 0

    iget p0, p0, Lcom/discord/overlapping_circles/OverlappingCirclesView$PlaceholderItem;->overlapPx:I

    return p0
.end method

.method public static final synthetic access$getRadius$p(Lcom/discord/overlapping_circles/OverlappingCirclesView$PlaceholderItem;)F
    .locals 0

    iget p0, p0, Lcom/discord/overlapping_circles/OverlappingCirclesView$PlaceholderItem;->radius:F

    return p0
.end method

.method private final getSeparatorClipPath()Landroid/graphics/Path;
    .locals 1

    iget-object v0, p0, Lcom/discord/overlapping_circles/OverlappingCirclesView$PlaceholderItem;->separatorClipPath$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/Path;

    return-object v0
.end method


# virtual methods
.method protected onDraw(Landroid/graphics/Canvas;)V
    .locals 3

    .line 1
    const-string v0, "canvas"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    :try_start_0
    iget-boolean v1, p0, Lcom/discord/overlapping_circles/OverlappingCirclesView$PlaceholderItem;->showSeparation:Z

    .line 11
    .line 12
    if-eqz v1, :cond_1

    .line 13
    .line 14
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 15
    .line 16
    const/16 v2, 0x1a

    .line 17
    .line 18
    if-lt v1, v2, :cond_0

    .line 19
    .line 20
    invoke-direct {p0}, Lcom/discord/overlapping_circles/OverlappingCirclesView$PlaceholderItem;->getSeparatorClipPath()Landroid/graphics/Path;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    invoke-static {p1, v1}, Lcom/discord/overlapping_circles/a;->a(Landroid/graphics/Canvas;Landroid/graphics/Path;)Z

    .line 25
    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    invoke-direct {p0}, Lcom/discord/overlapping_circles/OverlappingCirclesView$PlaceholderItem;->getSeparatorClipPath()Landroid/graphics/Path;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    sget-object v2, Landroid/graphics/Region$Op;->DIFFERENCE:Landroid/graphics/Region$Op;

    .line 33
    .line 34
    invoke-virtual {p1, v1, v2}, Landroid/graphics/Canvas;->clipPath(Landroid/graphics/Path;Landroid/graphics/Region$Op;)Z

    .line 35
    .line 36
    .line 37
    :cond_1
    :goto_0
    iget v1, p0, Lcom/discord/overlapping_circles/OverlappingCirclesView$PlaceholderItem;->radius:F

    .line 38
    .line 39
    iget-object v2, p0, Lcom/discord/overlapping_circles/OverlappingCirclesView$PlaceholderItem;->paint:Landroid/graphics/Paint;

    .line 40
    .line 41
    invoke-virtual {p1, v1, v1, v1, v2}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 42
    .line 43
    .line 44
    invoke-virtual {p1, v0}, Landroid/graphics/Canvas;->restoreToCount(I)V

    .line 45
    .line 46
    .line 47
    return-void

    .line 48
    :catchall_0
    move-exception v1

    .line 49
    invoke-virtual {p1, v0}, Landroid/graphics/Canvas;->restoreToCount(I)V

    .line 50
    .line 51
    .line 52
    throw v1
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
.end method