.class public final Lio/sentry/android/core/internal/gestures/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/GestureDetector$OnGestureListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/sentry/android/core/internal/gestures/g$b;
    }
.end annotation


# instance fields
.field private final k:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Landroid/app/Activity;",
            ">;"
        }
    .end annotation
.end field

.field private final l:Lio/sentry/f0;

.field private final m:Lio/sentry/android/core/SentryAndroidOptions;

.field private final n:Z

.field private o:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Landroid/view/View;",
            ">;"
        }
    .end annotation
.end field

.field private p:Lio/sentry/m0;

.field private q:Ljava/lang/String;

.field private final r:Lio/sentry/android/core/internal/gestures/g$b;


# direct methods
.method public constructor <init>(Landroid/app/Activity;Lio/sentry/f0;Lio/sentry/android/core/SentryAndroidOptions;Z)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-object v0, p0, Lio/sentry/android/core/internal/gestures/g;->o:Ljava/lang/ref/WeakReference;

    .line 6
    .line 7
    iput-object v0, p0, Lio/sentry/android/core/internal/gestures/g;->p:Lio/sentry/m0;

    .line 8
    .line 9
    iput-object v0, p0, Lio/sentry/android/core/internal/gestures/g;->q:Ljava/lang/String;

    .line 10
    .line 11
    new-instance v1, Lio/sentry/android/core/internal/gestures/g$b;

    .line 12
    .line 13
    invoke-direct {v1, v0}, Lio/sentry/android/core/internal/gestures/g$b;-><init>(Lio/sentry/android/core/internal/gestures/g$a;)V

    .line 14
    .line 15
    .line 16
    iput-object v1, p0, Lio/sentry/android/core/internal/gestures/g;->r:Lio/sentry/android/core/internal/gestures/g$b;

    .line 17
    .line 18
    new-instance v0, Ljava/lang/ref/WeakReference;

    .line 19
    .line 20
    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    iput-object v0, p0, Lio/sentry/android/core/internal/gestures/g;->k:Ljava/lang/ref/WeakReference;

    .line 24
    .line 25
    iput-object p2, p0, Lio/sentry/android/core/internal/gestures/g;->l:Lio/sentry/f0;

    .line 26
    .line 27
    iput-object p3, p0, Lio/sentry/android/core/internal/gestures/g;->m:Lio/sentry/android/core/SentryAndroidOptions;

    .line 28
    .line 29
    iput-boolean p4, p0, Lio/sentry/android/core/internal/gestures/g;->n:Z

    .line 30
    .line 31
    return-void
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
.end method

.method public static synthetic a(Lio/sentry/android/core/internal/gestures/g;Lio/sentry/m0;Lio/sentry/Scope;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lio/sentry/android/core/internal/gestures/g;->o(Lio/sentry/m0;Lio/sentry/Scope;)V

    return-void
.end method

.method public static synthetic b(Lio/sentry/android/core/internal/gestures/g;Lio/sentry/Scope;Lio/sentry/m0;Lio/sentry/m0;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lio/sentry/android/core/internal/gestures/g;->l(Lio/sentry/Scope;Lio/sentry/m0;Lio/sentry/m0;)V

    return-void
.end method

.method public static synthetic c(Lio/sentry/android/core/internal/gestures/g;Lio/sentry/Scope;)V
    .locals 0

    invoke-direct {p0, p1}, Lio/sentry/android/core/internal/gestures/g;->p(Lio/sentry/Scope;)V

    return-void
.end method

.method public static synthetic d(Lio/sentry/android/core/internal/gestures/g;Lio/sentry/Scope;Lio/sentry/m0;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lio/sentry/android/core/internal/gestures/g;->m(Lio/sentry/Scope;Lio/sentry/m0;)V

    return-void
.end method

.method public static synthetic e(Landroid/view/View;)Z
    .locals 0

    invoke-static {p0}, Lio/sentry/android/core/internal/gestures/g;->n(Landroid/view/View;)Z

    move-result p0

    return p0
.end method

.method static synthetic f(Lio/sentry/android/core/internal/gestures/g;)Z
    .locals 0

    iget-boolean p0, p0, Lio/sentry/android/core/internal/gestures/g;->n:Z

    return p0
.end method

.method private g(Landroid/view/View;Ljava/lang/String;Ljava/util/Map;Landroid/view/MotionEvent;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/view/View;",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;",
            "Landroid/view/MotionEvent;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    :goto_0
    new-instance v1, Lio/sentry/v;

    .line 21
    .line 22
    invoke-direct {v1}, Lio/sentry/v;-><init>()V

    .line 23
    .line 24
    .line 25
    const-string v2, "android:motionEvent"

    .line 26
    .line 27
    invoke-virtual {v1, v2, p4}, Lio/sentry/v;->h(Ljava/lang/String;Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    const-string p4, "android:view"

    .line 31
    .line 32
    invoke-virtual {v1, p4, p1}, Lio/sentry/v;->h(Ljava/lang/String;Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    iget-object p4, p0, Lio/sentry/android/core/internal/gestures/g;->l:Lio/sentry/f0;

    .line 36
    .line 37
    invoke-static {p1}, Lio/sentry/android/core/internal/gestures/l;->c(Landroid/view/View;)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    invoke-static {p2, p1, v0, p3}, Lio/sentry/d;->r(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Lio/sentry/d;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    invoke-interface {p4, p1, v1}, Lio/sentry/f0;->j(Lio/sentry/d;Lio/sentry/v;)V

    .line 46
    .line 47
    .line 48
    return-void
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
.end method

.method private j(Ljava/lang/String;)Landroid/view/View;
    .locals 7

    .line 1
    iget-object v0, p0, Lio/sentry/android/core/internal/gestures/g;->k:Ljava/lang/ref/WeakReference;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Landroid/app/Activity;

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    const/4 v2, 0x0

    .line 11
    const-string v3, ". No breadcrumb captured."

    .line 12
    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    iget-object v0, p0, Lio/sentry/android/core/internal/gestures/g;->m:Lio/sentry/android/core/SentryAndroidOptions;

    .line 16
    .line 17
    invoke-virtual {v0}, Lio/sentry/o3;->getLogger()Lio/sentry/g0;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    sget-object v4, Lio/sentry/n3;->DEBUG:Lio/sentry/n3;

    .line 22
    .line 23
    new-instance v5, Ljava/lang/StringBuilder;

    .line 24
    .line 25
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 26
    .line 27
    .line 28
    const-string v6, "Activity is null in "

    .line 29
    .line 30
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    new-array v2, v2, [Ljava/lang/Object;

    .line 44
    .line 45
    invoke-interface {v0, v4, p1, v2}, Lio/sentry/g0;->c(Lio/sentry/n3;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    return-object v1

    .line 49
    :cond_0
    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    if-nez v0, :cond_1

    .line 54
    .line 55
    iget-object v0, p0, Lio/sentry/android/core/internal/gestures/g;->m:Lio/sentry/android/core/SentryAndroidOptions;

    .line 56
    .line 57
    invoke-virtual {v0}, Lio/sentry/o3;->getLogger()Lio/sentry/g0;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    sget-object v4, Lio/sentry/n3;->DEBUG:Lio/sentry/n3;

    .line 62
    .line 63
    new-instance v5, Ljava/lang/StringBuilder;

    .line 64
    .line 65
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 66
    .line 67
    .line 68
    const-string v6, "Window is null in "

    .line 69
    .line 70
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 74
    .line 75
    .line 76
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 77
    .line 78
    .line 79
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    new-array v2, v2, [Ljava/lang/Object;

    .line 84
    .line 85
    invoke-interface {v0, v4, p1, v2}, Lio/sentry/g0;->c(Lio/sentry/n3;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 86
    .line 87
    .line 88
    return-object v1

    .line 89
    :cond_1
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    if-nez v0, :cond_2

    .line 94
    .line 95
    iget-object v0, p0, Lio/sentry/android/core/internal/gestures/g;->m:Lio/sentry/android/core/SentryAndroidOptions;

    .line 96
    .line 97
    invoke-virtual {v0}, Lio/sentry/o3;->getLogger()Lio/sentry/g0;

    .line 98
    .line 99
    .line 100
    move-result-object v0

    .line 101
    sget-object v4, Lio/sentry/n3;->DEBUG:Lio/sentry/n3;

    .line 102
    .line 103
    new-instance v5, Ljava/lang/StringBuilder;

    .line 104
    .line 105
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 106
    .line 107
    .line 108
    const-string v6, "DecorView is null in "

    .line 109
    .line 110
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 111
    .line 112
    .line 113
    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 114
    .line 115
    .line 116
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 117
    .line 118
    .line 119
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    move-result-object p1

    .line 123
    new-array v2, v2, [Ljava/lang/Object;

    .line 124
    .line 125
    invoke-interface {v0, v4, p1, v2}, Lio/sentry/g0;->c(Lio/sentry/n3;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 126
    .line 127
    .line 128
    return-object v1

    .line 129
    :cond_2
    return-object v0
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
.end method

.method private k(Landroid/app/Activity;)Ljava/lang/String;
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method private synthetic l(Lio/sentry/Scope;Lio/sentry/m0;Lio/sentry/m0;)V
    .locals 2

    .line 1
    if-nez p3, :cond_0

    .line 2
    .line 3
    invoke-virtual {p1, p2}, Lio/sentry/Scope;->x(Lio/sentry/m0;)V

    .line 4
    .line 5
    .line 6
    goto :goto_0

    .line 7
    :cond_0
    iget-object p1, p0, Lio/sentry/android/core/internal/gestures/g;->m:Lio/sentry/android/core/SentryAndroidOptions;

    .line 8
    .line 9
    invoke-virtual {p1}, Lio/sentry/o3;->getLogger()Lio/sentry/g0;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    sget-object p3, Lio/sentry/n3;->DEBUG:Lio/sentry/n3;

    .line 14
    .line 15
    const/4 v0, 0x1

    .line 16
    new-array v0, v0, [Ljava/lang/Object;

    .line 17
    .line 18
    const/4 v1, 0x0

    .line 19
    invoke-interface {p2}, Lio/sentry/m0;->getName()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p2

    .line 23
    aput-object p2, v0, v1

    .line 24
    .line 25
    const-string p2, "Transaction \'%s\' won\'t be bound to the Scope since there\'s one already in there."

    .line 26
    .line 27
    invoke-interface {p1, p3, p2, v0}, Lio/sentry/g0;->c(Lio/sentry/n3;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    :goto_0
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
.end method

.method private synthetic m(Lio/sentry/Scope;Lio/sentry/m0;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lio/sentry/android/core/internal/gestures/g;->p:Lio/sentry/m0;

    .line 2
    .line 3
    if-ne p2, v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p1}, Lio/sentry/Scope;->d()V

    .line 6
    .line 7
    .line 8
    :cond_0
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
    .line 47
    .line 48
    .line 49
.end method

.method private static synthetic n(Landroid/view/View;)Z
    .locals 0

    invoke-static {p0}, Lio/sentry/android/core/internal/gestures/l;->f(Landroid/view/View;)Z

    move-result p0

    return p0
.end method

.method private synthetic o(Lio/sentry/m0;Lio/sentry/Scope;)V
    .locals 0

    invoke-virtual {p0, p2, p1}, Lio/sentry/android/core/internal/gestures/g;->h(Lio/sentry/Scope;Lio/sentry/m0;)V

    return-void
.end method

.method private synthetic p(Lio/sentry/Scope;)V
    .locals 0

    invoke-virtual {p0, p1}, Lio/sentry/android/core/internal/gestures/g;->i(Lio/sentry/Scope;)V

    return-void
.end method

.method private r(Landroid/view/View;Ljava/lang/String;)V
    .locals 6

    .line 1
    iget-object v0, p0, Lio/sentry/android/core/internal/gestures/g;->m:Lio/sentry/android/core/SentryAndroidOptions;

    .line 2
    .line 3
    invoke-virtual {v0}, Lio/sentry/o3;->isTracingEnabled()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_6

    .line 8
    .line 9
    iget-object v0, p0, Lio/sentry/android/core/internal/gestures/g;->m:Lio/sentry/android/core/SentryAndroidOptions;

    .line 10
    .line 11
    invoke-virtual {v0}, Lio/sentry/android/core/SentryAndroidOptions;->isEnableUserInteractionTracing()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    goto/16 :goto_1

    .line 18
    .line 19
    :cond_0
    iget-object v0, p0, Lio/sentry/android/core/internal/gestures/g;->k:Ljava/lang/ref/WeakReference;

    .line 20
    .line 21
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    check-cast v0, Landroid/app/Activity;

    .line 26
    .line 27
    const/4 v1, 0x0

    .line 28
    if-nez v0, :cond_1

    .line 29
    .line 30
    iget-object p1, p0, Lio/sentry/android/core/internal/gestures/g;->m:Lio/sentry/android/core/SentryAndroidOptions;

    .line 31
    .line 32
    invoke-virtual {p1}, Lio/sentry/o3;->getLogger()Lio/sentry/g0;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    sget-object p2, Lio/sentry/n3;->DEBUG:Lio/sentry/n3;

    .line 37
    .line 38
    const-string v0, "Activity is null, no transaction captured."

    .line 39
    .line 40
    new-array v1, v1, [Ljava/lang/Object;

    .line 41
    .line 42
    invoke-interface {p1, p2, v0, v1}, Lio/sentry/g0;->c(Lio/sentry/n3;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    return-void

    .line 46
    :cond_1
    :try_start_0
    invoke-static {p1}, Lio/sentry/android/core/internal/gestures/l;->b(Landroid/view/View;)Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v2
    :try_end_0
    .catch Landroid/content/res/Resources$NotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 50
    iget-object v3, p0, Lio/sentry/android/core/internal/gestures/g;->o:Ljava/lang/ref/WeakReference;

    .line 51
    .line 52
    if-eqz v3, :cond_2

    .line 53
    .line 54
    invoke-virtual {v3}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v3

    .line 58
    check-cast v3, Landroid/view/View;

    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_2
    const/4 v3, 0x0

    .line 62
    :goto_0
    iget-object v4, p0, Lio/sentry/android/core/internal/gestures/g;->p:Lio/sentry/m0;

    .line 63
    .line 64
    if-eqz v4, :cond_5

    .line 65
    .line 66
    invoke-virtual {p1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 67
    .line 68
    .line 69
    move-result v3

    .line 70
    if-eqz v3, :cond_4

    .line 71
    .line 72
    iget-object v3, p0, Lio/sentry/android/core/internal/gestures/g;->q:Ljava/lang/String;

    .line 73
    .line 74
    invoke-virtual {p2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 75
    .line 76
    .line 77
    move-result v3

    .line 78
    if-eqz v3, :cond_4

    .line 79
    .line 80
    iget-object v3, p0, Lio/sentry/android/core/internal/gestures/g;->p:Lio/sentry/m0;

    .line 81
    .line 82
    invoke-interface {v3}, Lio/sentry/ISpan;->a()Z

    .line 83
    .line 84
    .line 85
    move-result v3

    .line 86
    if-nez v3, :cond_4

    .line 87
    .line 88
    iget-object p1, p0, Lio/sentry/android/core/internal/gestures/g;->m:Lio/sentry/android/core/SentryAndroidOptions;

    .line 89
    .line 90
    invoke-virtual {p1}, Lio/sentry/o3;->getLogger()Lio/sentry/g0;

    .line 91
    .line 92
    .line 93
    move-result-object p1

    .line 94
    sget-object p2, Lio/sentry/n3;->DEBUG:Lio/sentry/n3;

    .line 95
    .line 96
    new-instance v0, Ljava/lang/StringBuilder;

    .line 97
    .line 98
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 99
    .line 100
    .line 101
    const-string v3, "The view with id: "

    .line 102
    .line 103
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 104
    .line 105
    .line 106
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 107
    .line 108
    .line 109
    const-string v2, " already has an ongoing transaction assigned. Rescheduling finish"

    .line 110
    .line 111
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 112
    .line 113
    .line 114
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object v0

    .line 118
    new-array v1, v1, [Ljava/lang/Object;

    .line 119
    .line 120
    invoke-interface {p1, p2, v0, v1}, Lio/sentry/g0;->c(Lio/sentry/n3;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 121
    .line 122
    .line 123
    iget-object p1, p0, Lio/sentry/android/core/internal/gestures/g;->m:Lio/sentry/android/core/SentryAndroidOptions;

    .line 124
    .line 125
    invoke-virtual {p1}, Lio/sentry/o3;->getIdleTimeout()Ljava/lang/Long;

    .line 126
    .line 127
    .line 128
    move-result-object p1

    .line 129
    if-eqz p1, :cond_3

    .line 130
    .line 131
    iget-object p1, p0, Lio/sentry/android/core/internal/gestures/g;->p:Lio/sentry/m0;

    .line 132
    .line 133
    invoke-interface {p1}, Lio/sentry/m0;->k()V

    .line 134
    .line 135
    .line 136
    :cond_3
    return-void

    .line 137
    :cond_4
    sget-object v1, Lio/sentry/f4;->OK:Lio/sentry/f4;

    .line 138
    .line 139
    invoke-virtual {p0, v1}, Lio/sentry/android/core/internal/gestures/g;->s(Lio/sentry/f4;)V

    .line 140
    .line 141
    .line 142
    :cond_5
    new-instance v1, Ljava/lang/StringBuilder;

    .line 143
    .line 144
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 145
    .line 146
    .line 147
    invoke-direct {p0, v0}, Lio/sentry/android/core/internal/gestures/g;->k(Landroid/app/Activity;)Ljava/lang/String;

    .line 148
    .line 149
    .line 150
    move-result-object v0

    .line 151
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 152
    .line 153
    .line 154
    const-string v0, "."

    .line 155
    .line 156
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 157
    .line 158
    .line 159
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 160
    .line 161
    .line 162
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 163
    .line 164
    .line 165
    move-result-object v0

    .line 166
    new-instance v1, Ljava/lang/StringBuilder;

    .line 167
    .line 168
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 169
    .line 170
    .line 171
    const-string v2, "ui.action."

    .line 172
    .line 173
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 174
    .line 175
    .line 176
    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 177
    .line 178
    .line 179
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 180
    .line 181
    .line 182
    move-result-object v1

    .line 183
    new-instance v2, Lio/sentry/p4;

    .line 184
    .line 185
    invoke-direct {v2}, Lio/sentry/p4;-><init>()V

    .line 186
    .line 187
    .line 188
    const/4 v3, 0x1

    .line 189
    invoke-virtual {v2, v3}, Lio/sentry/p4;->l(Z)V

    .line 190
    .line 191
    .line 192
    iget-object v4, p0, Lio/sentry/android/core/internal/gestures/g;->m:Lio/sentry/android/core/SentryAndroidOptions;

    .line 193
    .line 194
    invoke-virtual {v4}, Lio/sentry/o3;->getIdleTimeout()Ljava/lang/Long;

    .line 195
    .line 196
    .line 197
    move-result-object v4

    .line 198
    invoke-virtual {v2, v4}, Lio/sentry/p4;->h(Ljava/lang/Long;)V

    .line 199
    .line 200
    .line 201
    invoke-virtual {v2, v3}, Lio/sentry/p4;->k(Z)V

    .line 202
    .line 203
    .line 204
    iget-object v3, p0, Lio/sentry/android/core/internal/gestures/g;->l:Lio/sentry/f0;

    .line 205
    .line 206
    new-instance v4, Lio/sentry/n4;

    .line 207
    .line 208
    sget-object v5, Lio/sentry/protocol/y;->COMPONENT:Lio/sentry/protocol/y;

    .line 209
    .line 210
    invoke-direct {v4, v0, v5, v1}, Lio/sentry/n4;-><init>(Ljava/lang/String;Lio/sentry/protocol/y;Ljava/lang/String;)V

    .line 211
    .line 212
    .line 213
    invoke-interface {v3, v4, v2}, Lio/sentry/f0;->h(Lio/sentry/n4;Lio/sentry/p4;)Lio/sentry/m0;

    .line 214
    .line 215
    .line 216
    move-result-object v0

    .line 217
    iget-object v1, p0, Lio/sentry/android/core/internal/gestures/g;->l:Lio/sentry/f0;

    .line 218
    .line 219
    new-instance v2, Lio/sentry/android/core/internal/gestures/d;

    .line 220
    .line 221
    invoke-direct {v2, p0, v0}, Lio/sentry/android/core/internal/gestures/d;-><init>(Lio/sentry/android/core/internal/gestures/g;Lio/sentry/m0;)V

    .line 222
    .line 223
    .line 224
    invoke-interface {v1, v2}, Lio/sentry/f0;->k(Lio/sentry/b2;)V

    .line 225
    .line 226
    .line 227
    iput-object v0, p0, Lio/sentry/android/core/internal/gestures/g;->p:Lio/sentry/m0;

    .line 228
    .line 229
    new-instance v0, Ljava/lang/ref/WeakReference;

    .line 230
    .line 231
    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 232
    .line 233
    .line 234
    iput-object v0, p0, Lio/sentry/android/core/internal/gestures/g;->o:Ljava/lang/ref/WeakReference;

    .line 235
    .line 236
    iput-object p2, p0, Lio/sentry/android/core/internal/gestures/g;->q:Ljava/lang/String;

    .line 237
    .line 238
    return-void

    .line 239
    :catch_0
    iget-object p1, p0, Lio/sentry/android/core/internal/gestures/g;->m:Lio/sentry/android/core/SentryAndroidOptions;

    .line 240
    .line 241
    invoke-virtual {p1}, Lio/sentry/o3;->getLogger()Lio/sentry/g0;

    .line 242
    .line 243
    .line 244
    move-result-object p1

    .line 245
    sget-object p2, Lio/sentry/n3;->DEBUG:Lio/sentry/n3;

    .line 246
    .line 247
    const-string v0, "View id cannot be retrieved from Resources, no transaction captured."

    .line 248
    .line 249
    new-array v1, v1, [Ljava/lang/Object;

    .line 250
    .line 251
    invoke-interface {p1, p2, v0, v1}, Lio/sentry/g0;->c(Lio/sentry/n3;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 252
    .line 253
    .line 254
    :cond_6
    :goto_1
    return-void
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


# virtual methods
.method h(Lio/sentry/Scope;Lio/sentry/m0;)V
    .locals 1

    new-instance v0, Lio/sentry/android/core/internal/gestures/f;

    invoke-direct {v0, p0, p1, p2}, Lio/sentry/android/core/internal/gestures/f;-><init>(Lio/sentry/android/core/internal/gestures/g;Lio/sentry/Scope;Lio/sentry/m0;)V

    invoke-virtual {p1, v0}, Lio/sentry/Scope;->B(Lio/sentry/Scope$b;)V

    return-void
.end method

.method i(Lio/sentry/Scope;)V
    .locals 1

    new-instance v0, Lio/sentry/android/core/internal/gestures/e;

    invoke-direct {v0, p0, p1}, Lio/sentry/android/core/internal/gestures/e;-><init>(Lio/sentry/android/core/internal/gestures/g;Lio/sentry/Scope;)V

    invoke-virtual {p1, v0}, Lio/sentry/Scope;->B(Lio/sentry/Scope$b;)V

    return-void
.end method

.method public onDown(Landroid/view/MotionEvent;)Z
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    iget-object v1, p0, Lio/sentry/android/core/internal/gestures/g;->r:Lio/sentry/android/core/internal/gestures/g$b;

    .line 6
    .line 7
    invoke-static {v1}, Lio/sentry/android/core/internal/gestures/g$b;->e(Lio/sentry/android/core/internal/gestures/g$b;)V

    .line 8
    .line 9
    .line 10
    iget-object v1, p0, Lio/sentry/android/core/internal/gestures/g;->r:Lio/sentry/android/core/internal/gestures/g$b;

    .line 11
    .line 12
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    invoke-static {v1, v2}, Lio/sentry/android/core/internal/gestures/g$b;->f(Lio/sentry/android/core/internal/gestures/g$b;F)F

    .line 17
    .line 18
    .line 19
    iget-object v1, p0, Lio/sentry/android/core/internal/gestures/g;->r:Lio/sentry/android/core/internal/gestures/g$b;

    .line 20
    .line 21
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    invoke-static {v1, p1}, Lio/sentry/android/core/internal/gestures/g$b;->g(Lio/sentry/android/core/internal/gestures/g$b;F)F

    .line 26
    .line 27
    .line 28
    return v0
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
.end method

.method public onFling(Landroid/view/MotionEvent;Landroid/view/MotionEvent;FF)Z
    .locals 0

    iget-object p1, p0, Lio/sentry/android/core/internal/gestures/g;->r:Lio/sentry/android/core/internal/gestures/g$b;

    const-string p2, "swipe"

    invoke-static {p1, p2}, Lio/sentry/android/core/internal/gestures/g$b;->c(Lio/sentry/android/core/internal/gestures/g$b;Ljava/lang/String;)Ljava/lang/String;

    const/4 p1, 0x0

    return p1
.end method

.method public onLongPress(Landroid/view/MotionEvent;)V
    .locals 0

    return-void
.end method

.method public onScroll(Landroid/view/MotionEvent;Landroid/view/MotionEvent;FF)Z
    .locals 1

    .line 1
    const-string p2, "onScroll"

    .line 2
    .line 3
    invoke-direct {p0, p2}, Lio/sentry/android/core/internal/gestures/g;->j(Ljava/lang/String;)Landroid/view/View;

    .line 4
    .line 5
    .line 6
    move-result-object p2

    .line 7
    const/4 p3, 0x0

    .line 8
    if-eqz p2, :cond_2

    .line 9
    .line 10
    if-nez p1, :cond_0

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    iget-object p4, p0, Lio/sentry/android/core/internal/gestures/g;->r:Lio/sentry/android/core/internal/gestures/g$b;

    .line 14
    .line 15
    invoke-static {p4}, Lio/sentry/android/core/internal/gestures/g$b;->b(Lio/sentry/android/core/internal/gestures/g$b;)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p4

    .line 19
    if-nez p4, :cond_2

    .line 20
    .line 21
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 22
    .line 23
    .line 24
    move-result p4

    .line 25
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    new-instance v0, Lio/sentry/android/core/internal/gestures/g$a;

    .line 30
    .line 31
    invoke-direct {v0, p0}, Lio/sentry/android/core/internal/gestures/g$a;-><init>(Lio/sentry/android/core/internal/gestures/g;)V

    .line 32
    .line 33
    .line 34
    invoke-static {p2, p4, p1, v0}, Lio/sentry/android/core/internal/gestures/l;->a(Landroid/view/View;FFLio/sentry/android/core/internal/gestures/k;)Landroid/view/View;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    if-nez p1, :cond_1

    .line 39
    .line 40
    iget-object p1, p0, Lio/sentry/android/core/internal/gestures/g;->m:Lio/sentry/android/core/SentryAndroidOptions;

    .line 41
    .line 42
    invoke-virtual {p1}, Lio/sentry/o3;->getLogger()Lio/sentry/g0;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    sget-object p2, Lio/sentry/n3;->DEBUG:Lio/sentry/n3;

    .line 47
    .line 48
    const-string p4, "Unable to find scroll target. No breadcrumb captured."

    .line 49
    .line 50
    new-array v0, p3, [Ljava/lang/Object;

    .line 51
    .line 52
    invoke-interface {p1, p2, p4, v0}, Lio/sentry/g0;->c(Lio/sentry/n3;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    return p3

    .line 56
    :cond_1
    iget-object p2, p0, Lio/sentry/android/core/internal/gestures/g;->r:Lio/sentry/android/core/internal/gestures/g$b;

    .line 57
    .line 58
    invoke-static {p2, p1}, Lio/sentry/android/core/internal/gestures/g$b;->h(Lio/sentry/android/core/internal/gestures/g$b;Landroid/view/View;)V

    .line 59
    .line 60
    .line 61
    iget-object p1, p0, Lio/sentry/android/core/internal/gestures/g;->r:Lio/sentry/android/core/internal/gestures/g$b;

    .line 62
    .line 63
    const-string p2, "scroll"

    .line 64
    .line 65
    invoke-static {p1, p2}, Lio/sentry/android/core/internal/gestures/g$b;->c(Lio/sentry/android/core/internal/gestures/g$b;Ljava/lang/String;)Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    :cond_2
    :goto_0
    return p3
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
.end method

.method public onShowPress(Landroid/view/MotionEvent;)V
    .locals 0

    return-void
.end method

.method public onSingleTapUp(Landroid/view/MotionEvent;)Z
    .locals 5

    .line 1
    const-string v0, "onSingleTapUp"

    .line 2
    .line 3
    invoke-direct {p0, v0}, Lio/sentry/android/core/internal/gestures/g;->j(Ljava/lang/String;)Landroid/view/View;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const/4 v1, 0x0

    .line 8
    if-eqz v0, :cond_2

    .line 9
    .line 10
    if-nez p1, :cond_0

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    .line 18
    .line 19
    .line 20
    move-result v3

    .line 21
    new-instance v4, Lio/sentry/android/core/internal/gestures/c;

    .line 22
    .line 23
    invoke-direct {v4}, Lio/sentry/android/core/internal/gestures/c;-><init>()V

    .line 24
    .line 25
    .line 26
    invoke-static {v0, v2, v3, v4}, Lio/sentry/android/core/internal/gestures/l;->a(Landroid/view/View;FFLio/sentry/android/core/internal/gestures/k;)Landroid/view/View;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    if-nez v0, :cond_1

    .line 31
    .line 32
    iget-object p1, p0, Lio/sentry/android/core/internal/gestures/g;->m:Lio/sentry/android/core/SentryAndroidOptions;

    .line 33
    .line 34
    invoke-virtual {p1}, Lio/sentry/o3;->getLogger()Lio/sentry/g0;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    sget-object v0, Lio/sentry/n3;->DEBUG:Lio/sentry/n3;

    .line 39
    .line 40
    const-string v2, "Unable to find click target. No breadcrumb captured."

    .line 41
    .line 42
    new-array v3, v1, [Ljava/lang/Object;

    .line 43
    .line 44
    invoke-interface {p1, v0, v2, v3}, Lio/sentry/g0;->c(Lio/sentry/n3;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    return v1

    .line 48
    :cond_1
    invoke-static {}, Ljava/util/Collections;->emptyMap()Ljava/util/Map;

    .line 49
    .line 50
    .line 51
    move-result-object v2

    .line 52
    const-string v3, "click"

    .line 53
    .line 54
    invoke-direct {p0, v0, v3, v2, p1}, Lio/sentry/android/core/internal/gestures/g;->g(Landroid/view/View;Ljava/lang/String;Ljava/util/Map;Landroid/view/MotionEvent;)V

    .line 55
    .line 56
    .line 57
    invoke-direct {p0, v0, v3}, Lio/sentry/android/core/internal/gestures/g;->r(Landroid/view/View;Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    :cond_2
    :goto_0
    return v1
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

.method public q(Landroid/view/MotionEvent;)V
    .locals 4

    .line 1
    const-string v0, "onUp"

    .line 2
    .line 3
    invoke-direct {p0, v0}, Lio/sentry/android/core/internal/gestures/g;->j(Ljava/lang/String;)Landroid/view/View;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p0, Lio/sentry/android/core/internal/gestures/g;->r:Lio/sentry/android/core/internal/gestures/g$b;

    .line 8
    .line 9
    invoke-static {v1}, Lio/sentry/android/core/internal/gestures/g$b;->a(Lio/sentry/android/core/internal/gestures/g$b;)Ljava/lang/ref/WeakReference;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    check-cast v1, Landroid/view/View;

    .line 18
    .line 19
    if-eqz v0, :cond_2

    .line 20
    .line 21
    if-nez v1, :cond_0

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    iget-object v0, p0, Lio/sentry/android/core/internal/gestures/g;->r:Lio/sentry/android/core/internal/gestures/g$b;

    .line 25
    .line 26
    invoke-static {v0}, Lio/sentry/android/core/internal/gestures/g$b;->b(Lio/sentry/android/core/internal/gestures/g$b;)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    if-nez v0, :cond_1

    .line 31
    .line 32
    iget-object p1, p0, Lio/sentry/android/core/internal/gestures/g;->m:Lio/sentry/android/core/SentryAndroidOptions;

    .line 33
    .line 34
    invoke-virtual {p1}, Lio/sentry/o3;->getLogger()Lio/sentry/g0;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    sget-object v0, Lio/sentry/n3;->DEBUG:Lio/sentry/n3;

    .line 39
    .line 40
    const/4 v1, 0x0

    .line 41
    new-array v1, v1, [Ljava/lang/Object;

    .line 42
    .line 43
    const-string v2, "Unable to define scroll type. No breadcrumb captured."

    .line 44
    .line 45
    invoke-interface {p1, v0, v2, v1}, Lio/sentry/g0;->c(Lio/sentry/n3;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    return-void

    .line 49
    :cond_1
    iget-object v0, p0, Lio/sentry/android/core/internal/gestures/g;->r:Lio/sentry/android/core/internal/gestures/g$b;

    .line 50
    .line 51
    invoke-static {v0, p1}, Lio/sentry/android/core/internal/gestures/g$b;->d(Lio/sentry/android/core/internal/gestures/g$b;Landroid/view/MotionEvent;)Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    iget-object v2, p0, Lio/sentry/android/core/internal/gestures/g;->r:Lio/sentry/android/core/internal/gestures/g$b;

    .line 56
    .line 57
    invoke-static {v2}, Lio/sentry/android/core/internal/gestures/g$b;->b(Lio/sentry/android/core/internal/gestures/g$b;)Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v2

    .line 61
    const-string v3, "direction"

    .line 62
    .line 63
    invoke-static {v3, v0}, Ljava/util/Collections;->singletonMap(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    invoke-direct {p0, v1, v2, v0, p1}, Lio/sentry/android/core/internal/gestures/g;->g(Landroid/view/View;Ljava/lang/String;Ljava/util/Map;Landroid/view/MotionEvent;)V

    .line 68
    .line 69
    .line 70
    iget-object p1, p0, Lio/sentry/android/core/internal/gestures/g;->r:Lio/sentry/android/core/internal/gestures/g$b;

    .line 71
    .line 72
    invoke-static {p1}, Lio/sentry/android/core/internal/gestures/g$b;->b(Lio/sentry/android/core/internal/gestures/g$b;)Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    invoke-direct {p0, v1, p1}, Lio/sentry/android/core/internal/gestures/g;->r(Landroid/view/View;Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    iget-object p1, p0, Lio/sentry/android/core/internal/gestures/g;->r:Lio/sentry/android/core/internal/gestures/g$b;

    .line 80
    .line 81
    invoke-static {p1}, Lio/sentry/android/core/internal/gestures/g$b;->e(Lio/sentry/android/core/internal/gestures/g$b;)V

    .line 82
    .line 83
    .line 84
    :cond_2
    :goto_0
    return-void
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
.end method

.method s(Lio/sentry/f4;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lio/sentry/android/core/internal/gestures/g;->p:Lio/sentry/m0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0, p1}, Lio/sentry/ISpan;->d(Lio/sentry/f4;)V

    .line 6
    .line 7
    .line 8
    :cond_0
    iget-object p1, p0, Lio/sentry/android/core/internal/gestures/g;->l:Lio/sentry/f0;

    .line 9
    .line 10
    new-instance v0, Lio/sentry/android/core/internal/gestures/b;

    .line 11
    .line 12
    invoke-direct {v0, p0}, Lio/sentry/android/core/internal/gestures/b;-><init>(Lio/sentry/android/core/internal/gestures/g;)V

    .line 13
    .line 14
    .line 15
    invoke-interface {p1, v0}, Lio/sentry/f0;->k(Lio/sentry/b2;)V

    .line 16
    .line 17
    .line 18
    const/4 p1, 0x0

    .line 19
    iput-object p1, p0, Lio/sentry/android/core/internal/gestures/g;->p:Lio/sentry/m0;

    .line 20
    .line 21
    iget-object v0, p0, Lio/sentry/android/core/internal/gestures/g;->o:Ljava/lang/ref/WeakReference;

    .line 22
    .line 23
    if-eqz v0, :cond_1

    .line 24
    .line 25
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->clear()V

    .line 26
    .line 27
    .line 28
    :cond_1
    iput-object p1, p0, Lio/sentry/android/core/internal/gestures/g;->q:Ljava/lang/String;

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
