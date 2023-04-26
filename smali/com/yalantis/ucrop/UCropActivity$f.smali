.class Lcom/yalantis/ucrop/UCropActivity$f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/yalantis/ucrop/view/widget/HorizontalProgressWheelView$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/yalantis/ucrop/UCropActivity;->F()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/yalantis/ucrop/UCropActivity;


# direct methods
.method constructor <init>(Lcom/yalantis/ucrop/UCropActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/yalantis/ucrop/UCropActivity$f;->a:Lcom/yalantis/ucrop/UCropActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    iget-object v0, p0, Lcom/yalantis/ucrop/UCropActivity$f;->a:Lcom/yalantis/ucrop/UCropActivity;

    invoke-static {v0}, Lcom/yalantis/ucrop/UCropActivity;->f(Lcom/yalantis/ucrop/UCropActivity;)Lcom/yalantis/ucrop/view/GestureCropImageView;

    move-result-object v0

    invoke-virtual {v0}, Lcom/yalantis/ucrop/view/a;->z()V

    return-void
.end method

.method public b()V
    .locals 1

    iget-object v0, p0, Lcom/yalantis/ucrop/UCropActivity$f;->a:Lcom/yalantis/ucrop/UCropActivity;

    invoke-static {v0}, Lcom/yalantis/ucrop/UCropActivity;->f(Lcom/yalantis/ucrop/UCropActivity;)Lcom/yalantis/ucrop/view/GestureCropImageView;

    move-result-object v0

    invoke-virtual {v0}, Lcom/yalantis/ucrop/view/a;->t()V

    return-void
.end method

.method public c(FF)V
    .locals 4

    .line 1
    const/4 p2, 0x0

    .line 2
    cmpl-float p2, p1, p2

    .line 3
    .line 4
    const v0, 0x466a6000    # 15000.0f

    .line 5
    .line 6
    .line 7
    if-lez p2, :cond_0

    .line 8
    .line 9
    iget-object p2, p0, Lcom/yalantis/ucrop/UCropActivity$f;->a:Lcom/yalantis/ucrop/UCropActivity;

    .line 10
    .line 11
    invoke-static {p2}, Lcom/yalantis/ucrop/UCropActivity;->f(Lcom/yalantis/ucrop/UCropActivity;)Lcom/yalantis/ucrop/view/GestureCropImageView;

    .line 12
    .line 13
    .line 14
    move-result-object p2

    .line 15
    iget-object v1, p0, Lcom/yalantis/ucrop/UCropActivity$f;->a:Lcom/yalantis/ucrop/UCropActivity;

    .line 16
    .line 17
    invoke-static {v1}, Lcom/yalantis/ucrop/UCropActivity;->f(Lcom/yalantis/ucrop/UCropActivity;)Lcom/yalantis/ucrop/view/GestureCropImageView;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    invoke-virtual {v1}, Lcom/yalantis/ucrop/view/b;->getCurrentScale()F

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    iget-object v2, p0, Lcom/yalantis/ucrop/UCropActivity$f;->a:Lcom/yalantis/ucrop/UCropActivity;

    .line 26
    .line 27
    invoke-static {v2}, Lcom/yalantis/ucrop/UCropActivity;->f(Lcom/yalantis/ucrop/UCropActivity;)Lcom/yalantis/ucrop/view/GestureCropImageView;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    invoke-virtual {v2}, Lcom/yalantis/ucrop/view/a;->getMaxScale()F

    .line 32
    .line 33
    .line 34
    move-result v2

    .line 35
    iget-object v3, p0, Lcom/yalantis/ucrop/UCropActivity$f;->a:Lcom/yalantis/ucrop/UCropActivity;

    .line 36
    .line 37
    invoke-static {v3}, Lcom/yalantis/ucrop/UCropActivity;->f(Lcom/yalantis/ucrop/UCropActivity;)Lcom/yalantis/ucrop/view/GestureCropImageView;

    .line 38
    .line 39
    .line 40
    move-result-object v3

    .line 41
    invoke-virtual {v3}, Lcom/yalantis/ucrop/view/a;->getMinScale()F

    .line 42
    .line 43
    .line 44
    move-result v3

    .line 45
    sub-float/2addr v2, v3

    .line 46
    div-float/2addr v2, v0

    .line 47
    mul-float/2addr p1, v2

    .line 48
    add-float/2addr v1, p1

    .line 49
    invoke-virtual {p2, v1}, Lcom/yalantis/ucrop/view/a;->C(F)V

    .line 50
    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_0
    iget-object p2, p0, Lcom/yalantis/ucrop/UCropActivity$f;->a:Lcom/yalantis/ucrop/UCropActivity;

    .line 54
    .line 55
    invoke-static {p2}, Lcom/yalantis/ucrop/UCropActivity;->f(Lcom/yalantis/ucrop/UCropActivity;)Lcom/yalantis/ucrop/view/GestureCropImageView;

    .line 56
    .line 57
    .line 58
    move-result-object p2

    .line 59
    iget-object v1, p0, Lcom/yalantis/ucrop/UCropActivity$f;->a:Lcom/yalantis/ucrop/UCropActivity;

    .line 60
    .line 61
    invoke-static {v1}, Lcom/yalantis/ucrop/UCropActivity;->f(Lcom/yalantis/ucrop/UCropActivity;)Lcom/yalantis/ucrop/view/GestureCropImageView;

    .line 62
    .line 63
    .line 64
    move-result-object v1

    .line 65
    invoke-virtual {v1}, Lcom/yalantis/ucrop/view/b;->getCurrentScale()F

    .line 66
    .line 67
    .line 68
    move-result v1

    .line 69
    iget-object v2, p0, Lcom/yalantis/ucrop/UCropActivity$f;->a:Lcom/yalantis/ucrop/UCropActivity;

    .line 70
    .line 71
    invoke-static {v2}, Lcom/yalantis/ucrop/UCropActivity;->f(Lcom/yalantis/ucrop/UCropActivity;)Lcom/yalantis/ucrop/view/GestureCropImageView;

    .line 72
    .line 73
    .line 74
    move-result-object v2

    .line 75
    invoke-virtual {v2}, Lcom/yalantis/ucrop/view/a;->getMaxScale()F

    .line 76
    .line 77
    .line 78
    move-result v2

    .line 79
    iget-object v3, p0, Lcom/yalantis/ucrop/UCropActivity$f;->a:Lcom/yalantis/ucrop/UCropActivity;

    .line 80
    .line 81
    invoke-static {v3}, Lcom/yalantis/ucrop/UCropActivity;->f(Lcom/yalantis/ucrop/UCropActivity;)Lcom/yalantis/ucrop/view/GestureCropImageView;

    .line 82
    .line 83
    .line 84
    move-result-object v3

    .line 85
    invoke-virtual {v3}, Lcom/yalantis/ucrop/view/a;->getMinScale()F

    .line 86
    .line 87
    .line 88
    move-result v3

    .line 89
    sub-float/2addr v2, v3

    .line 90
    div-float/2addr v2, v0

    .line 91
    mul-float/2addr p1, v2

    .line 92
    add-float/2addr v1, p1

    .line 93
    invoke-virtual {p2, v1}, Lcom/yalantis/ucrop/view/a;->E(F)V

    .line 94
    .line 95
    .line 96
    :goto_0
    return-void
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
.end method
