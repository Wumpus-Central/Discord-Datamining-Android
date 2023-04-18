.class Lcom/facebook/react/views/textinput/ReactEditTextClickDetector;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/react/views/textinput/ReactEditTextClickDetector$TimestampedMotionEvent;
    }
.end annotation


# static fields
.field private static final MAX_CLICK_DISTANCE_DP:I = 0xc

.field private static final MAX_CLICK_DURATION_MS:J = 0xfaL


# instance fields
.field private currentDownEvent:Lcom/facebook/react/views/textinput/ReactEditTextClickDetector$TimestampedMotionEvent;

.field private final reactEditText:Lcom/facebook/react/views/textinput/ReactEditText;

.field private final screenDensity:F


# direct methods
.method public constructor <init>(Lcom/facebook/react/views/textinput/ReactEditText;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/facebook/react/views/textinput/ReactEditTextClickDetector;->reactEditText:Lcom/facebook/react/views/textinput/ReactEditText;

    .line 5
    .line 6
    invoke-virtual {p1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    invoke-virtual {p1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    iget p1, p1, Landroid/util/DisplayMetrics;->density:F

    .line 15
    .line 16
    iput p1, p0, Lcom/facebook/react/views/textinput/ReactEditTextClickDetector;->screenDensity:F

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
.end method

.method private static forceShowKeyboardOnClicks()Z
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1c

    if-gt v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method


# virtual methods
.method cancelPress()V
    .locals 1

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/facebook/react/views/textinput/ReactEditTextClickDetector;->currentDownEvent:Lcom/facebook/react/views/textinput/ReactEditTextClickDetector$TimestampedMotionEvent;

    return-void
.end method

.method handleDown(Landroid/view/MotionEvent;)V
    .locals 3

    new-instance v0, Lcom/facebook/react/views/textinput/ReactEditTextClickDetector$TimestampedMotionEvent;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-direct {v0, v1, v2, p1}, Lcom/facebook/react/views/textinput/ReactEditTextClickDetector$TimestampedMotionEvent;-><init>(JLandroid/view/MotionEvent;)V

    iput-object v0, p0, Lcom/facebook/react/views/textinput/ReactEditTextClickDetector;->currentDownEvent:Lcom/facebook/react/views/textinput/ReactEditTextClickDetector$TimestampedMotionEvent;

    return-void
.end method

.method handleUp(Landroid/view/MotionEvent;)V
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/facebook/react/views/textinput/ReactEditTextClickDetector;->currentDownEvent:Lcom/facebook/react/views/textinput/ReactEditTextClickDetector$TimestampedMotionEvent;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    const/4 v1, 0x0

    .line 7
    iput-object v1, p0, Lcom/facebook/react/views/textinput/ReactEditTextClickDetector;->currentDownEvent:Lcom/facebook/react/views/textinput/ReactEditTextClickDetector$TimestampedMotionEvent;

    .line 8
    .line 9
    invoke-static {}, Lcom/facebook/react/views/textinput/ReactEditTextClickDetector;->forceShowKeyboardOnClicks()Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-eqz v1, :cond_4

    .line 14
    .line 15
    iget-object v1, p0, Lcom/facebook/react/views/textinput/ReactEditTextClickDetector;->reactEditText:Lcom/facebook/react/views/textinput/ReactEditText;

    .line 16
    .line 17
    invoke-virtual {v1}, Landroid/view/View;->isEnabled()Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-nez v1, :cond_1

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 25
    .line 26
    .line 27
    move-result-wide v1

    .line 28
    iget-wide v3, v0, Lcom/facebook/react/views/textinput/ReactEditTextClickDetector$TimestampedMotionEvent;->timestamp:J

    .line 29
    .line 30
    sub-long/2addr v1, v3

    .line 31
    const-wide/16 v3, 0xfa

    .line 32
    .line 33
    cmp-long v1, v1, v3

    .line 34
    .line 35
    if-lez v1, :cond_2

    .line 36
    .line 37
    return-void

    .line 38
    :cond_2
    iget-object v1, v0, Lcom/facebook/react/views/textinput/ReactEditTextClickDetector$TimestampedMotionEvent;->motionEvent:Landroid/view/MotionEvent;

    .line 39
    .line 40
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getRawX()F

    .line 41
    .line 42
    .line 43
    move-result v1

    .line 44
    iget-object v0, v0, Lcom/facebook/react/views/textinput/ReactEditTextClickDetector$TimestampedMotionEvent;->motionEvent:Landroid/view/MotionEvent;

    .line 45
    .line 46
    invoke-virtual {v0}, Landroid/view/MotionEvent;->getRawY()F

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getRawX()F

    .line 51
    .line 52
    .line 53
    move-result v2

    .line 54
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getRawY()F

    .line 55
    .line 56
    .line 57
    move-result p1

    .line 58
    sub-float/2addr v2, v1

    .line 59
    float-to-double v1, v2

    .line 60
    const-wide/high16 v3, 0x4000000000000000L    # 2.0

    .line 61
    .line 62
    invoke-static {v1, v2, v3, v4}, Ljava/lang/Math;->pow(DD)D

    .line 63
    .line 64
    .line 65
    move-result-wide v1

    .line 66
    sub-float/2addr p1, v0

    .line 67
    float-to-double v5, p1

    .line 68
    invoke-static {v5, v6, v3, v4}, Ljava/lang/Math;->pow(DD)D

    .line 69
    .line 70
    .line 71
    move-result-wide v3

    .line 72
    add-double/2addr v1, v3

    .line 73
    invoke-static {v1, v2}, Ljava/lang/Math;->sqrt(D)D

    .line 74
    .line 75
    .line 76
    move-result-wide v0

    .line 77
    iget p1, p0, Lcom/facebook/react/views/textinput/ReactEditTextClickDetector;->screenDensity:F

    .line 78
    .line 79
    float-to-double v2, p1

    .line 80
    div-double/2addr v0, v2

    .line 81
    const-wide/high16 v2, 0x4028000000000000L    # 12.0

    .line 82
    .line 83
    cmpl-double p1, v0, v2

    .line 84
    .line 85
    if-lez p1, :cond_3

    .line 86
    .line 87
    return-void

    .line 88
    :cond_3
    iget-object p1, p0, Lcom/facebook/react/views/textinput/ReactEditTextClickDetector;->reactEditText:Lcom/facebook/react/views/textinput/ReactEditText;

    .line 89
    .line 90
    invoke-virtual {p1}, Lcom/facebook/react/views/textinput/ReactEditText;->showSoftKeyboard()Z

    .line 91
    .line 92
    .line 93
    :cond_4
    :goto_0
    return-void
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
.end method
