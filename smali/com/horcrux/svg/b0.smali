.class Lcom/horcrux/svg/b0;
.super Lcom/horcrux/svg/RenderableView;
.source "SourceFile"


# annotations
.annotation build Landroid/annotation/SuppressLint;
    value = {
        "ViewConstructor"
    }
.end annotation


# instance fields
.field private k:Lcom/horcrux/svg/SVGLength;

.field private l:Lcom/horcrux/svg/SVGLength;

.field private m:Lcom/horcrux/svg/SVGLength;

.field private n:Lcom/horcrux/svg/SVGLength;

.field private o:Lcom/horcrux/svg/SVGLength;

.field private p:Lcom/horcrux/svg/SVGLength;


# direct methods
.method public constructor <init>(Lcom/facebook/react/bridge/ReactContext;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/horcrux/svg/RenderableView;-><init>(Lcom/facebook/react/bridge/ReactContext;)V

    return-void
.end method


# virtual methods
.method getPath(Landroid/graphics/Canvas;Landroid/graphics/Paint;)Landroid/graphics/Path;
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    new-instance v9, Landroid/graphics/Path;

    .line 4
    .line 5
    invoke-direct {v9}, Landroid/graphics/Path;-><init>()V

    .line 6
    .line 7
    .line 8
    iget-object v1, v0, Lcom/horcrux/svg/b0;->k:Lcom/horcrux/svg/SVGLength;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Lcom/horcrux/svg/VirtualView;->relativeOnWidth(Lcom/horcrux/svg/SVGLength;)D

    .line 11
    .line 12
    .line 13
    move-result-wide v1

    .line 14
    iget-object v3, v0, Lcom/horcrux/svg/b0;->l:Lcom/horcrux/svg/SVGLength;

    .line 15
    .line 16
    invoke-virtual {v0, v3}, Lcom/horcrux/svg/VirtualView;->relativeOnHeight(Lcom/horcrux/svg/SVGLength;)D

    .line 17
    .line 18
    .line 19
    move-result-wide v3

    .line 20
    iget-object v5, v0, Lcom/horcrux/svg/b0;->m:Lcom/horcrux/svg/SVGLength;

    .line 21
    .line 22
    invoke-virtual {v0, v5}, Lcom/horcrux/svg/VirtualView;->relativeOnWidth(Lcom/horcrux/svg/SVGLength;)D

    .line 23
    .line 24
    .line 25
    move-result-wide v5

    .line 26
    iget-object v7, v0, Lcom/horcrux/svg/b0;->n:Lcom/horcrux/svg/SVGLength;

    .line 27
    .line 28
    invoke-virtual {v0, v7}, Lcom/horcrux/svg/VirtualView;->relativeOnHeight(Lcom/horcrux/svg/SVGLength;)D

    .line 29
    .line 30
    .line 31
    move-result-wide v7

    .line 32
    iget-object v10, v0, Lcom/horcrux/svg/b0;->o:Lcom/horcrux/svg/SVGLength;

    .line 33
    .line 34
    if-nez v10, :cond_1

    .line 35
    .line 36
    iget-object v11, v0, Lcom/horcrux/svg/b0;->p:Lcom/horcrux/svg/SVGLength;

    .line 37
    .line 38
    if-eqz v11, :cond_0

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_0
    double-to-float v10, v1

    .line 42
    double-to-float v11, v3

    .line 43
    add-double/2addr v1, v5

    .line 44
    double-to-float v5, v1

    .line 45
    add-double/2addr v3, v7

    .line 46
    double-to-float v6, v3

    .line 47
    sget-object v7, Landroid/graphics/Path$Direction;->CW:Landroid/graphics/Path$Direction;

    .line 48
    .line 49
    move-object v1, v9

    .line 50
    move v2, v10

    .line 51
    move v3, v11

    .line 52
    move v4, v5

    .line 53
    move v5, v6

    .line 54
    move-object v6, v7

    .line 55
    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Path;->addRect(FFFFLandroid/graphics/Path$Direction;)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {v9}, Landroid/graphics/Path;->close()V

    .line 59
    .line 60
    .line 61
    goto :goto_3

    .line 62
    :cond_1
    :goto_0
    if-nez v10, :cond_2

    .line 63
    .line 64
    iget-object v10, v0, Lcom/horcrux/svg/b0;->p:Lcom/horcrux/svg/SVGLength;

    .line 65
    .line 66
    invoke-virtual {v0, v10}, Lcom/horcrux/svg/VirtualView;->relativeOnHeight(Lcom/horcrux/svg/SVGLength;)D

    .line 67
    .line 68
    .line 69
    move-result-wide v10

    .line 70
    :goto_1
    move-wide v12, v10

    .line 71
    goto :goto_2

    .line 72
    :cond_2
    iget-object v11, v0, Lcom/horcrux/svg/b0;->p:Lcom/horcrux/svg/SVGLength;

    .line 73
    .line 74
    if-nez v11, :cond_3

    .line 75
    .line 76
    invoke-virtual {v0, v10}, Lcom/horcrux/svg/VirtualView;->relativeOnWidth(Lcom/horcrux/svg/SVGLength;)D

    .line 77
    .line 78
    .line 79
    move-result-wide v10

    .line 80
    goto :goto_1

    .line 81
    :cond_3
    invoke-virtual {v0, v10}, Lcom/horcrux/svg/VirtualView;->relativeOnWidth(Lcom/horcrux/svg/SVGLength;)D

    .line 82
    .line 83
    .line 84
    move-result-wide v10

    .line 85
    iget-object v12, v0, Lcom/horcrux/svg/b0;->p:Lcom/horcrux/svg/SVGLength;

    .line 86
    .line 87
    invoke-virtual {v0, v12}, Lcom/horcrux/svg/VirtualView;->relativeOnHeight(Lcom/horcrux/svg/SVGLength;)D

    .line 88
    .line 89
    .line 90
    move-result-wide v12

    .line 91
    :goto_2
    const-wide/high16 v14, 0x4000000000000000L    # 2.0

    .line 92
    .line 93
    div-double v16, v5, v14

    .line 94
    .line 95
    cmpl-double v18, v10, v16

    .line 96
    .line 97
    if-lez v18, :cond_4

    .line 98
    .line 99
    move-wide/from16 v10, v16

    .line 100
    .line 101
    :cond_4
    div-double v14, v7, v14

    .line 102
    .line 103
    cmpl-double v16, v12, v14

    .line 104
    .line 105
    if-lez v16, :cond_5

    .line 106
    .line 107
    move-wide v12, v14

    .line 108
    :cond_5
    double-to-float v14, v1

    .line 109
    double-to-float v15, v3

    .line 110
    add-double/2addr v1, v5

    .line 111
    double-to-float v5, v1

    .line 112
    add-double/2addr v3, v7

    .line 113
    double-to-float v6, v3

    .line 114
    double-to-float v7, v10

    .line 115
    double-to-float v8, v12

    .line 116
    sget-object v10, Landroid/graphics/Path$Direction;->CW:Landroid/graphics/Path$Direction;

    .line 117
    .line 118
    move-object v1, v9

    .line 119
    move v2, v14

    .line 120
    move v3, v15

    .line 121
    move v4, v5

    .line 122
    move v5, v6

    .line 123
    move v6, v7

    .line 124
    move v7, v8

    .line 125
    move-object v8, v10

    .line 126
    invoke-virtual/range {v1 .. v8}, Landroid/graphics/Path;->addRoundRect(FFFFFFLandroid/graphics/Path$Direction;)V

    .line 127
    .line 128
    .line 129
    :goto_3
    return-object v9
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

.method public setHeight(Lcom/facebook/react/bridge/Dynamic;)V
    .locals 0
    .annotation runtime Lcom/facebook/react/uimanager/annotations/ReactProp;
        name = "height"
    .end annotation

    .line 1
    invoke-static {p1}, Lcom/horcrux/svg/SVGLength;->b(Lcom/facebook/react/bridge/Dynamic;)Lcom/horcrux/svg/SVGLength;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iput-object p1, p0, Lcom/horcrux/svg/b0;->n:Lcom/horcrux/svg/SVGLength;

    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/horcrux/svg/VirtualView;->invalidate()V

    .line 8
    .line 9
    .line 10
    return-void
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

.method public setRx(Lcom/facebook/react/bridge/Dynamic;)V
    .locals 0
    .annotation runtime Lcom/facebook/react/uimanager/annotations/ReactProp;
        name = "rx"
    .end annotation

    .line 1
    invoke-static {p1}, Lcom/horcrux/svg/SVGLength;->b(Lcom/facebook/react/bridge/Dynamic;)Lcom/horcrux/svg/SVGLength;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iput-object p1, p0, Lcom/horcrux/svg/b0;->o:Lcom/horcrux/svg/SVGLength;

    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/horcrux/svg/VirtualView;->invalidate()V

    .line 8
    .line 9
    .line 10
    return-void
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

.method public setRy(Lcom/facebook/react/bridge/Dynamic;)V
    .locals 0
    .annotation runtime Lcom/facebook/react/uimanager/annotations/ReactProp;
        name = "ry"
    .end annotation

    .line 1
    invoke-static {p1}, Lcom/horcrux/svg/SVGLength;->b(Lcom/facebook/react/bridge/Dynamic;)Lcom/horcrux/svg/SVGLength;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iput-object p1, p0, Lcom/horcrux/svg/b0;->p:Lcom/horcrux/svg/SVGLength;

    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/horcrux/svg/VirtualView;->invalidate()V

    .line 8
    .line 9
    .line 10
    return-void
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

.method public setWidth(Lcom/facebook/react/bridge/Dynamic;)V
    .locals 0
    .annotation runtime Lcom/facebook/react/uimanager/annotations/ReactProp;
        name = "width"
    .end annotation

    .line 1
    invoke-static {p1}, Lcom/horcrux/svg/SVGLength;->b(Lcom/facebook/react/bridge/Dynamic;)Lcom/horcrux/svg/SVGLength;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iput-object p1, p0, Lcom/horcrux/svg/b0;->m:Lcom/horcrux/svg/SVGLength;

    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/horcrux/svg/VirtualView;->invalidate()V

    .line 8
    .line 9
    .line 10
    return-void
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

.method public setX(Lcom/facebook/react/bridge/Dynamic;)V
    .locals 0
    .annotation runtime Lcom/facebook/react/uimanager/annotations/ReactProp;
        name = "x"
    .end annotation

    .line 1
    invoke-static {p1}, Lcom/horcrux/svg/SVGLength;->b(Lcom/facebook/react/bridge/Dynamic;)Lcom/horcrux/svg/SVGLength;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iput-object p1, p0, Lcom/horcrux/svg/b0;->k:Lcom/horcrux/svg/SVGLength;

    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/horcrux/svg/VirtualView;->invalidate()V

    .line 8
    .line 9
    .line 10
    return-void
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

.method public setY(Lcom/facebook/react/bridge/Dynamic;)V
    .locals 0
    .annotation runtime Lcom/facebook/react/uimanager/annotations/ReactProp;
        name = "y"
    .end annotation

    .line 1
    invoke-static {p1}, Lcom/horcrux/svg/SVGLength;->b(Lcom/facebook/react/bridge/Dynamic;)Lcom/horcrux/svg/SVGLength;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iput-object p1, p0, Lcom/horcrux/svg/b0;->l:Lcom/horcrux/svg/SVGLength;

    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/horcrux/svg/VirtualView;->invalidate()V

    .line 8
    .line 9
    .line 10
    return-void
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
