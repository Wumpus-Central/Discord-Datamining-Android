.class Lcom/facebook/drawee/span/DraweeSpanStringBuilder$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/graphics/drawable/Drawable$Callback;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/drawee/span/DraweeSpanStringBuilder;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "b"
.end annotation


# instance fields
.field final synthetic k:Lcom/facebook/drawee/span/DraweeSpanStringBuilder;


# direct methods
.method private constructor <init>(Lcom/facebook/drawee/span/DraweeSpanStringBuilder;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/facebook/drawee/span/DraweeSpanStringBuilder$b;->k:Lcom/facebook/drawee/span/DraweeSpanStringBuilder;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/drawee/span/DraweeSpanStringBuilder;Lcom/facebook/drawee/span/DraweeSpanStringBuilder$a;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Lcom/facebook/drawee/span/DraweeSpanStringBuilder$b;-><init>(Lcom/facebook/drawee/span/DraweeSpanStringBuilder;)V

    return-void
.end method


# virtual methods
.method public invalidateDrawable(Landroid/graphics/drawable/Drawable;)V
    .locals 0

    .line 1
    iget-object p1, p0, Lcom/facebook/drawee/span/DraweeSpanStringBuilder$b;->k:Lcom/facebook/drawee/span/DraweeSpanStringBuilder;

    .line 2
    .line 3
    invoke-static {p1}, Lcom/facebook/drawee/span/DraweeSpanStringBuilder;->a(Lcom/facebook/drawee/span/DraweeSpanStringBuilder;)Landroid/view/View;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    iget-object p1, p0, Lcom/facebook/drawee/span/DraweeSpanStringBuilder$b;->k:Lcom/facebook/drawee/span/DraweeSpanStringBuilder;

    .line 10
    .line 11
    invoke-static {p1}, Lcom/facebook/drawee/span/DraweeSpanStringBuilder;->a(Lcom/facebook/drawee/span/DraweeSpanStringBuilder;)Landroid/view/View;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-virtual {p1}, Landroid/view/View;->invalidate()V

    .line 16
    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    iget-object p1, p0, Lcom/facebook/drawee/span/DraweeSpanStringBuilder$b;->k:Lcom/facebook/drawee/span/DraweeSpanStringBuilder;

    .line 20
    .line 21
    invoke-static {p1}, Lcom/facebook/drawee/span/DraweeSpanStringBuilder;->b(Lcom/facebook/drawee/span/DraweeSpanStringBuilder;)Landroid/graphics/drawable/Drawable;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    if-eqz p1, :cond_1

    .line 26
    .line 27
    iget-object p1, p0, Lcom/facebook/drawee/span/DraweeSpanStringBuilder$b;->k:Lcom/facebook/drawee/span/DraweeSpanStringBuilder;

    .line 28
    .line 29
    invoke-static {p1}, Lcom/facebook/drawee/span/DraweeSpanStringBuilder;->b(Lcom/facebook/drawee/span/DraweeSpanStringBuilder;)Landroid/graphics/drawable/Drawable;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    .line 34
    .line 35
    .line 36
    :cond_1
    :goto_0
    return-void
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

.method public scheduleDrawable(Landroid/graphics/drawable/Drawable;Ljava/lang/Runnable;J)V
    .locals 2

    .line 1
    iget-object p1, p0, Lcom/facebook/drawee/span/DraweeSpanStringBuilder$b;->k:Lcom/facebook/drawee/span/DraweeSpanStringBuilder;

    .line 2
    .line 3
    invoke-static {p1}, Lcom/facebook/drawee/span/DraweeSpanStringBuilder;->a(Lcom/facebook/drawee/span/DraweeSpanStringBuilder;)Landroid/view/View;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 10
    .line 11
    .line 12
    move-result-wide v0

    .line 13
    sub-long/2addr p3, v0

    .line 14
    iget-object p1, p0, Lcom/facebook/drawee/span/DraweeSpanStringBuilder$b;->k:Lcom/facebook/drawee/span/DraweeSpanStringBuilder;

    .line 15
    .line 16
    invoke-static {p1}, Lcom/facebook/drawee/span/DraweeSpanStringBuilder;->a(Lcom/facebook/drawee/span/DraweeSpanStringBuilder;)Landroid/view/View;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    invoke-virtual {p1, p2, p3, p4}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 21
    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    iget-object p1, p0, Lcom/facebook/drawee/span/DraweeSpanStringBuilder$b;->k:Lcom/facebook/drawee/span/DraweeSpanStringBuilder;

    .line 25
    .line 26
    invoke-static {p1}, Lcom/facebook/drawee/span/DraweeSpanStringBuilder;->b(Lcom/facebook/drawee/span/DraweeSpanStringBuilder;)Landroid/graphics/drawable/Drawable;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    if-eqz p1, :cond_1

    .line 31
    .line 32
    iget-object p1, p0, Lcom/facebook/drawee/span/DraweeSpanStringBuilder$b;->k:Lcom/facebook/drawee/span/DraweeSpanStringBuilder;

    .line 33
    .line 34
    invoke-static {p1}, Lcom/facebook/drawee/span/DraweeSpanStringBuilder;->b(Lcom/facebook/drawee/span/DraweeSpanStringBuilder;)Landroid/graphics/drawable/Drawable;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    invoke-virtual {p1, p2, p3, p4}, Landroid/graphics/drawable/Drawable;->scheduleSelf(Ljava/lang/Runnable;J)V

    .line 39
    .line 40
    .line 41
    :cond_1
    :goto_0
    return-void
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

.method public unscheduleDrawable(Landroid/graphics/drawable/Drawable;Ljava/lang/Runnable;)V
    .locals 0

    .line 1
    iget-object p1, p0, Lcom/facebook/drawee/span/DraweeSpanStringBuilder$b;->k:Lcom/facebook/drawee/span/DraweeSpanStringBuilder;

    .line 2
    .line 3
    invoke-static {p1}, Lcom/facebook/drawee/span/DraweeSpanStringBuilder;->a(Lcom/facebook/drawee/span/DraweeSpanStringBuilder;)Landroid/view/View;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    iget-object p1, p0, Lcom/facebook/drawee/span/DraweeSpanStringBuilder$b;->k:Lcom/facebook/drawee/span/DraweeSpanStringBuilder;

    .line 10
    .line 11
    invoke-static {p1}, Lcom/facebook/drawee/span/DraweeSpanStringBuilder;->a(Lcom/facebook/drawee/span/DraweeSpanStringBuilder;)Landroid/view/View;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-virtual {p1, p2}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 16
    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    iget-object p1, p0, Lcom/facebook/drawee/span/DraweeSpanStringBuilder$b;->k:Lcom/facebook/drawee/span/DraweeSpanStringBuilder;

    .line 20
    .line 21
    invoke-static {p1}, Lcom/facebook/drawee/span/DraweeSpanStringBuilder;->b(Lcom/facebook/drawee/span/DraweeSpanStringBuilder;)Landroid/graphics/drawable/Drawable;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    if-eqz p1, :cond_1

    .line 26
    .line 27
    iget-object p1, p0, Lcom/facebook/drawee/span/DraweeSpanStringBuilder$b;->k:Lcom/facebook/drawee/span/DraweeSpanStringBuilder;

    .line 28
    .line 29
    invoke-static {p1}, Lcom/facebook/drawee/span/DraweeSpanStringBuilder;->b(Lcom/facebook/drawee/span/DraweeSpanStringBuilder;)Landroid/graphics/drawable/Drawable;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    invoke-virtual {p1, p2}, Landroid/graphics/drawable/Drawable;->unscheduleSelf(Ljava/lang/Runnable;)V

    .line 34
    .line 35
    .line 36
    :cond_1
    :goto_0
    return-void
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
.end method
