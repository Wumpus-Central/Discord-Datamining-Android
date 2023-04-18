.class public final Lcom/budiyev/android/codescanner/CodeScanner;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/budiyev/android/codescanner/CodeScanner$d;,
        Lcom/budiyev/android/codescanner/CodeScanner$j;,
        Lcom/budiyev/android/codescanner/CodeScanner$h;,
        Lcom/budiyev/android/codescanner/CodeScanner$g;,
        Lcom/budiyev/android/codescanner/CodeScanner$l;,
        Lcom/budiyev/android/codescanner/CodeScanner$c;,
        Lcom/budiyev/android/codescanner/CodeScanner$e;,
        Lcom/budiyev/android/codescanner/CodeScanner$b;,
        Lcom/budiyev/android/codescanner/CodeScanner$k;,
        Lcom/budiyev/android/codescanner/CodeScanner$f;,
        Lcom/budiyev/android/codescanner/CodeScanner$i;
    }
.end annotation


# static fields
.field public static final K:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcd/a;",
            ">;"
        }
    .end annotation
.end field

.field public static final L:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcd/a;",
            ">;"
        }
    .end annotation
.end field

.field public static final M:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcd/a;",
            ">;"
        }
    .end annotation
.end field

.field private static final N:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcd/a;",
            ">;"
        }
    .end annotation
.end field

.field private static final O:Lcom/budiyev/android/codescanner/m;

.field private static final P:Lcom/budiyev/android/codescanner/a;


# instance fields
.field private volatile A:I

.field private B:Z

.field private C:Z

.field private D:Z

.field private E:Z

.field private F:Z

.field private G:Z

.field private H:I

.field private I:I

.field private J:I

.field private final a:Ljava/lang/Object;

.field private final b:Landroid/content/Context;

.field private final c:Landroid/os/Handler;

.field private final d:Lcom/budiyev/android/codescanner/CodeScannerView;

.field private final e:Landroid/view/SurfaceHolder;

.field private final f:Landroid/view/SurfaceHolder$Callback;

.field private final g:Landroid/hardware/Camera$PreviewCallback;

.field private final h:Landroid/hardware/Camera$AutoFocusCallback;

.field private final i:Landroid/hardware/Camera$AutoFocusCallback;

.field private final j:Ljava/lang/Runnable;

.field private final k:Ljava/lang/Runnable;

.field private final l:Lcom/budiyev/android/codescanner/CodeScanner$b;

.field private final m:Lcom/budiyev/android/codescanner/CodeScanner$c;

.field private volatile n:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcd/a;",
            ">;"
        }
    .end annotation
.end field

.field private volatile o:Lcom/budiyev/android/codescanner/m;

.field private volatile p:Lcom/budiyev/android/codescanner/a;

.field private volatile q:Lcom/budiyev/android/codescanner/d;

.field private volatile r:Lcom/budiyev/android/codescanner/h;

.field private volatile s:Lcom/budiyev/android/codescanner/g;

.field private volatile t:Z

.field private volatile u:Z

.field private volatile v:Z

.field private volatile w:Z

.field private volatile x:Z

.field private volatile y:J

.field private volatile z:I


# direct methods
.method static constructor <clinit>()V
    .locals 10

    .line 1
    invoke-static {}, Lcd/a;->values()[Lcd/a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    sput-object v0, Lcom/budiyev/android/codescanner/CodeScanner;->K:Ljava/util/List;

    .line 14
    .line 15
    const/16 v1, 0xc

    .line 16
    .line 17
    new-array v1, v1, [Lcd/a;

    .line 18
    .line 19
    sget-object v2, Lcd/a;->l:Lcd/a;

    .line 20
    .line 21
    const/4 v3, 0x0

    .line 22
    aput-object v2, v1, v3

    .line 23
    .line 24
    sget-object v2, Lcd/a;->m:Lcd/a;

    .line 25
    .line 26
    const/4 v4, 0x1

    .line 27
    aput-object v2, v1, v4

    .line 28
    .line 29
    sget-object v2, Lcd/a;->n:Lcd/a;

    .line 30
    .line 31
    const/4 v5, 0x2

    .line 32
    aput-object v2, v1, v5

    .line 33
    .line 34
    sget-object v2, Lcd/a;->o:Lcd/a;

    .line 35
    .line 36
    const/4 v6, 0x3

    .line 37
    aput-object v2, v1, v6

    .line 38
    .line 39
    sget-object v2, Lcd/a;->q:Lcd/a;

    .line 40
    .line 41
    const/4 v7, 0x4

    .line 42
    aput-object v2, v1, v7

    .line 43
    .line 44
    sget-object v2, Lcd/a;->r:Lcd/a;

    .line 45
    .line 46
    const/4 v8, 0x5

    .line 47
    aput-object v2, v1, v8

    .line 48
    .line 49
    const/4 v2, 0x6

    .line 50
    sget-object v9, Lcd/a;->s:Lcd/a;

    .line 51
    .line 52
    aput-object v9, v1, v2

    .line 53
    .line 54
    const/4 v2, 0x7

    .line 55
    sget-object v9, Lcd/a;->w:Lcd/a;

    .line 56
    .line 57
    aput-object v9, v1, v2

    .line 58
    .line 59
    const/16 v2, 0x8

    .line 60
    .line 61
    sget-object v9, Lcd/a;->x:Lcd/a;

    .line 62
    .line 63
    aput-object v9, v1, v2

    .line 64
    .line 65
    const/16 v2, 0x9

    .line 66
    .line 67
    sget-object v9, Lcd/a;->y:Lcd/a;

    .line 68
    .line 69
    aput-object v9, v1, v2

    .line 70
    .line 71
    const/16 v2, 0xa

    .line 72
    .line 73
    sget-object v9, Lcd/a;->z:Lcd/a;

    .line 74
    .line 75
    aput-object v9, v1, v2

    .line 76
    .line 77
    const/16 v2, 0xb

    .line 78
    .line 79
    sget-object v9, Lcd/a;->A:Lcd/a;

    .line 80
    .line 81
    aput-object v9, v1, v2

    .line 82
    .line 83
    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 84
    .line 85
    .line 86
    move-result-object v1

    .line 87
    invoke-static {v1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 88
    .line 89
    .line 90
    move-result-object v1

    .line 91
    sput-object v1, Lcom/budiyev/android/codescanner/CodeScanner;->L:Ljava/util/List;

    .line 92
    .line 93
    new-array v1, v8, [Lcd/a;

    .line 94
    .line 95
    sget-object v2, Lcd/a;->k:Lcd/a;

    .line 96
    .line 97
    aput-object v2, v1, v3

    .line 98
    .line 99
    sget-object v2, Lcd/a;->p:Lcd/a;

    .line 100
    .line 101
    aput-object v2, v1, v4

    .line 102
    .line 103
    sget-object v2, Lcd/a;->t:Lcd/a;

    .line 104
    .line 105
    aput-object v2, v1, v5

    .line 106
    .line 107
    sget-object v2, Lcd/a;->u:Lcd/a;

    .line 108
    .line 109
    aput-object v2, v1, v6

    .line 110
    .line 111
    sget-object v2, Lcd/a;->v:Lcd/a;

    .line 112
    .line 113
    aput-object v2, v1, v7

    .line 114
    .line 115
    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 116
    .line 117
    .line 118
    move-result-object v1

    .line 119
    invoke-static {v1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 120
    .line 121
    .line 122
    move-result-object v1

    .line 123
    sput-object v1, Lcom/budiyev/android/codescanner/CodeScanner;->M:Ljava/util/List;

    .line 124
    .line 125
    sput-object v0, Lcom/budiyev/android/codescanner/CodeScanner;->N:Ljava/util/List;

    .line 126
    .line 127
    sget-object v0, Lcom/budiyev/android/codescanner/m;->k:Lcom/budiyev/android/codescanner/m;

    .line 128
    .line 129
    sput-object v0, Lcom/budiyev/android/codescanner/CodeScanner;->O:Lcom/budiyev/android/codescanner/m;

    .line 130
    .line 131
    sget-object v0, Lcom/budiyev/android/codescanner/a;->k:Lcom/budiyev/android/codescanner/a;

    .line 132
    .line 133
    sput-object v0, Lcom/budiyev/android/codescanner/CodeScanner;->P:Lcom/budiyev/android/codescanner/a;

    .line 134
    .line 135
    return-void
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
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/budiyev/android/codescanner/CodeScannerView;)V
    .locals 5

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/lang/Object;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lcom/budiyev/android/codescanner/CodeScanner;->a:Ljava/lang/Object;

    .line 10
    .line 11
    sget-object v0, Lcom/budiyev/android/codescanner/CodeScanner;->N:Ljava/util/List;

    .line 12
    .line 13
    iput-object v0, p0, Lcom/budiyev/android/codescanner/CodeScanner;->n:Ljava/util/List;

    .line 14
    .line 15
    sget-object v0, Lcom/budiyev/android/codescanner/CodeScanner;->O:Lcom/budiyev/android/codescanner/m;

    .line 16
    .line 17
    iput-object v0, p0, Lcom/budiyev/android/codescanner/CodeScanner;->o:Lcom/budiyev/android/codescanner/m;

    .line 18
    .line 19
    sget-object v0, Lcom/budiyev/android/codescanner/CodeScanner;->P:Lcom/budiyev/android/codescanner/a;

    .line 20
    .line 21
    iput-object v0, p0, Lcom/budiyev/android/codescanner/CodeScanner;->p:Lcom/budiyev/android/codescanner/a;

    .line 22
    .line 23
    const/4 v0, 0x0

    .line 24
    iput-object v0, p0, Lcom/budiyev/android/codescanner/CodeScanner;->q:Lcom/budiyev/android/codescanner/d;

    .line 25
    .line 26
    iput-object v0, p0, Lcom/budiyev/android/codescanner/CodeScanner;->r:Lcom/budiyev/android/codescanner/h;

    .line 27
    .line 28
    iput-object v0, p0, Lcom/budiyev/android/codescanner/CodeScanner;->s:Lcom/budiyev/android/codescanner/g;

    .line 29
    .line 30
    const/4 v1, 0x0

    .line 31
    iput-boolean v1, p0, Lcom/budiyev/android/codescanner/CodeScanner;->t:Z

    .line 32
    .line 33
    iput-boolean v1, p0, Lcom/budiyev/android/codescanner/CodeScanner;->u:Z

    .line 34
    .line 35
    iput-boolean v1, p0, Lcom/budiyev/android/codescanner/CodeScanner;->v:Z

    .line 36
    .line 37
    const/4 v2, 0x1

    .line 38
    iput-boolean v2, p0, Lcom/budiyev/android/codescanner/CodeScanner;->w:Z

    .line 39
    .line 40
    iput-boolean v1, p0, Lcom/budiyev/android/codescanner/CodeScanner;->x:Z

    .line 41
    .line 42
    const-wide/16 v3, 0x7d0

    .line 43
    .line 44
    iput-wide v3, p0, Lcom/budiyev/android/codescanner/CodeScanner;->y:J

    .line 45
    .line 46
    const/4 v3, -0x1

    .line 47
    iput v3, p0, Lcom/budiyev/android/codescanner/CodeScanner;->z:I

    .line 48
    .line 49
    iput v1, p0, Lcom/budiyev/android/codescanner/CodeScanner;->A:I

    .line 50
    .line 51
    iput-boolean v2, p0, Lcom/budiyev/android/codescanner/CodeScanner;->B:Z

    .line 52
    .line 53
    iput-boolean v1, p0, Lcom/budiyev/android/codescanner/CodeScanner;->C:Z

    .line 54
    .line 55
    iput-boolean v1, p0, Lcom/budiyev/android/codescanner/CodeScanner;->D:Z

    .line 56
    .line 57
    iput-boolean v1, p0, Lcom/budiyev/android/codescanner/CodeScanner;->E:Z

    .line 58
    .line 59
    iput-boolean v1, p0, Lcom/budiyev/android/codescanner/CodeScanner;->F:Z

    .line 60
    .line 61
    iput-boolean v1, p0, Lcom/budiyev/android/codescanner/CodeScanner;->G:Z

    .line 62
    .line 63
    iput v1, p0, Lcom/budiyev/android/codescanner/CodeScanner;->H:I

    .line 64
    .line 65
    iput v1, p0, Lcom/budiyev/android/codescanner/CodeScanner;->I:I

    .line 66
    .line 67
    iput v1, p0, Lcom/budiyev/android/codescanner/CodeScanner;->J:I

    .line 68
    .line 69
    iput-object p1, p0, Lcom/budiyev/android/codescanner/CodeScanner;->b:Landroid/content/Context;

    .line 70
    .line 71
    iput-object p2, p0, Lcom/budiyev/android/codescanner/CodeScanner;->d:Lcom/budiyev/android/codescanner/CodeScannerView;

    .line 72
    .line 73
    invoke-virtual {p2}, Lcom/budiyev/android/codescanner/CodeScannerView;->getPreviewView()Landroid/view/SurfaceView;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    invoke-virtual {p1}, Landroid/view/SurfaceView;->getHolder()Landroid/view/SurfaceHolder;

    .line 78
    .line 79
    .line 80
    move-result-object p1

    .line 81
    iput-object p1, p0, Lcom/budiyev/android/codescanner/CodeScanner;->e:Landroid/view/SurfaceHolder;

    .line 82
    .line 83
    new-instance p1, Landroid/os/Handler;

    .line 84
    .line 85
    invoke-direct {p1}, Landroid/os/Handler;-><init>()V

    .line 86
    .line 87
    .line 88
    iput-object p1, p0, Lcom/budiyev/android/codescanner/CodeScanner;->c:Landroid/os/Handler;

    .line 89
    .line 90
    new-instance p1, Lcom/budiyev/android/codescanner/CodeScanner$k;

    .line 91
    .line 92
    invoke-direct {p1, p0, v0}, Lcom/budiyev/android/codescanner/CodeScanner$k;-><init>(Lcom/budiyev/android/codescanner/CodeScanner;Lcom/budiyev/android/codescanner/CodeScanner$a;)V

    .line 93
    .line 94
    .line 95
    iput-object p1, p0, Lcom/budiyev/android/codescanner/CodeScanner;->f:Landroid/view/SurfaceHolder$Callback;

    .line 96
    .line 97
    new-instance p1, Lcom/budiyev/android/codescanner/CodeScanner$f;

    .line 98
    .line 99
    invoke-direct {p1, p0, v0}, Lcom/budiyev/android/codescanner/CodeScanner$f;-><init>(Lcom/budiyev/android/codescanner/CodeScanner;Lcom/budiyev/android/codescanner/CodeScanner$a;)V

    .line 100
    .line 101
    .line 102
    iput-object p1, p0, Lcom/budiyev/android/codescanner/CodeScanner;->g:Landroid/hardware/Camera$PreviewCallback;

    .line 103
    .line 104
    new-instance p1, Lcom/budiyev/android/codescanner/CodeScanner$l;

    .line 105
    .line 106
    invoke-direct {p1, p0, v0}, Lcom/budiyev/android/codescanner/CodeScanner$l;-><init>(Lcom/budiyev/android/codescanner/CodeScanner;Lcom/budiyev/android/codescanner/CodeScanner$a;)V

    .line 107
    .line 108
    .line 109
    iput-object p1, p0, Lcom/budiyev/android/codescanner/CodeScanner;->h:Landroid/hardware/Camera$AutoFocusCallback;

    .line 110
    .line 111
    new-instance p1, Lcom/budiyev/android/codescanner/CodeScanner$g;

    .line 112
    .line 113
    invoke-direct {p1, p0, v0}, Lcom/budiyev/android/codescanner/CodeScanner$g;-><init>(Lcom/budiyev/android/codescanner/CodeScanner;Lcom/budiyev/android/codescanner/CodeScanner$a;)V

    .line 114
    .line 115
    .line 116
    iput-object p1, p0, Lcom/budiyev/android/codescanner/CodeScanner;->i:Landroid/hardware/Camera$AutoFocusCallback;

    .line 117
    .line 118
    new-instance p1, Lcom/budiyev/android/codescanner/CodeScanner$h;

    .line 119
    .line 120
    invoke-direct {p1, p0, v0}, Lcom/budiyev/android/codescanner/CodeScanner$h;-><init>(Lcom/budiyev/android/codescanner/CodeScanner;Lcom/budiyev/android/codescanner/CodeScanner$a;)V

    .line 121
    .line 122
    .line 123
    iput-object p1, p0, Lcom/budiyev/android/codescanner/CodeScanner;->j:Ljava/lang/Runnable;

    .line 124
    .line 125
    new-instance p1, Lcom/budiyev/android/codescanner/CodeScanner$j;

    .line 126
    .line 127
    invoke-direct {p1, p0, v0}, Lcom/budiyev/android/codescanner/CodeScanner$j;-><init>(Lcom/budiyev/android/codescanner/CodeScanner;Lcom/budiyev/android/codescanner/CodeScanner$a;)V

    .line 128
    .line 129
    .line 130
    iput-object p1, p0, Lcom/budiyev/android/codescanner/CodeScanner;->k:Ljava/lang/Runnable;

    .line 131
    .line 132
    new-instance p1, Lcom/budiyev/android/codescanner/CodeScanner$b;

    .line 133
    .line 134
    invoke-direct {p1, p0, v0}, Lcom/budiyev/android/codescanner/CodeScanner$b;-><init>(Lcom/budiyev/android/codescanner/CodeScanner;Lcom/budiyev/android/codescanner/CodeScanner$a;)V

    .line 135
    .line 136
    .line 137
    iput-object p1, p0, Lcom/budiyev/android/codescanner/CodeScanner;->l:Lcom/budiyev/android/codescanner/CodeScanner$b;

    .line 138
    .line 139
    new-instance p1, Lcom/budiyev/android/codescanner/CodeScanner$c;

    .line 140
    .line 141
    invoke-direct {p1, p0, v0}, Lcom/budiyev/android/codescanner/CodeScanner$c;-><init>(Lcom/budiyev/android/codescanner/CodeScanner;Lcom/budiyev/android/codescanner/CodeScanner$a;)V

    .line 142
    .line 143
    .line 144
    iput-object p1, p0, Lcom/budiyev/android/codescanner/CodeScanner;->m:Lcom/budiyev/android/codescanner/CodeScanner$c;

    .line 145
    .line 146
    invoke-virtual {p2, p0}, Lcom/budiyev/android/codescanner/CodeScannerView;->setCodeScanner(Lcom/budiyev/android/codescanner/CodeScanner;)V

    .line 147
    .line 148
    .line 149
    new-instance p1, Lcom/budiyev/android/codescanner/CodeScanner$i;

    .line 150
    .line 151
    invoke-direct {p1, p0, v0}, Lcom/budiyev/android/codescanner/CodeScanner$i;-><init>(Lcom/budiyev/android/codescanner/CodeScanner;Lcom/budiyev/android/codescanner/CodeScanner$a;)V

    .line 152
    .line 153
    .line 154
    invoke-virtual {p2, p1}, Lcom/budiyev/android/codescanner/CodeScannerView;->setSizeListener(Lcom/budiyev/android/codescanner/CodeScannerView$e;)V

    .line 155
    .line 156
    .line 157
    return-void
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
.end method

.method static synthetic A(Lcom/budiyev/android/codescanner/CodeScanner;)Lcom/budiyev/android/codescanner/CodeScanner$b;
    .locals 0

    iget-object p0, p0, Lcom/budiyev/android/codescanner/CodeScanner;->l:Lcom/budiyev/android/codescanner/CodeScanner$b;

    return-object p0
.end method

.method static synthetic B(Lcom/budiyev/android/codescanner/CodeScanner;)Lcom/budiyev/android/codescanner/CodeScanner$c;
    .locals 0

    iget-object p0, p0, Lcom/budiyev/android/codescanner/CodeScanner;->m:Lcom/budiyev/android/codescanner/CodeScanner$c;

    return-object p0
.end method

.method static synthetic C(Lcom/budiyev/android/codescanner/CodeScanner;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Lcom/budiyev/android/codescanner/CodeScanner;->n:Ljava/util/List;

    return-object p0
.end method

.method static synthetic D(Lcom/budiyev/android/codescanner/CodeScanner;)Lcom/budiyev/android/codescanner/d;
    .locals 0

    iget-object p0, p0, Lcom/budiyev/android/codescanner/CodeScanner;->q:Lcom/budiyev/android/codescanner/d;

    return-object p0
.end method

.method static synthetic E(Lcom/budiyev/android/codescanner/CodeScanner;Z)Z
    .locals 0

    iput-boolean p1, p0, Lcom/budiyev/android/codescanner/CodeScanner;->t:Z

    return p1
.end method

.method static synthetic F(Lcom/budiyev/android/codescanner/CodeScanner;)V
    .locals 0

    invoke-direct {p0}, Lcom/budiyev/android/codescanner/CodeScanner;->V()V

    return-void
.end method

.method static synthetic G(Lcom/budiyev/android/codescanner/CodeScanner;)Lcom/budiyev/android/codescanner/h;
    .locals 0

    iget-object p0, p0, Lcom/budiyev/android/codescanner/CodeScanner;->r:Lcom/budiyev/android/codescanner/h;

    return-object p0
.end method

.method static synthetic H(Lcom/budiyev/android/codescanner/CodeScanner;Z)Z
    .locals 0

    iput-boolean p1, p0, Lcom/budiyev/android/codescanner/CodeScanner;->C:Z

    return p1
.end method

.method static synthetic I(Lcom/budiyev/android/codescanner/CodeScanner;Z)Z
    .locals 0

    iput-boolean p1, p0, Lcom/budiyev/android/codescanner/CodeScanner;->E:Z

    return p1
.end method

.method static synthetic J(Lcom/budiyev/android/codescanner/CodeScanner;Z)Z
    .locals 0

    iput-boolean p1, p0, Lcom/budiyev/android/codescanner/CodeScanner;->F:Z

    return p1
.end method

.method static synthetic K(Lcom/budiyev/android/codescanner/CodeScanner;)V
    .locals 0

    invoke-direct {p0}, Lcom/budiyev/android/codescanner/CodeScanner;->W()V

    return-void
.end method

.method static synthetic L(Lcom/budiyev/android/codescanner/CodeScanner;)Ljava/lang/Object;
    .locals 0

    iget-object p0, p0, Lcom/budiyev/android/codescanner/CodeScanner;->a:Ljava/lang/Object;

    return-object p0
.end method

.method private M()V
    .locals 2

    iget-object v0, p0, Lcom/budiyev/android/codescanner/CodeScanner;->d:Lcom/budiyev/android/codescanner/CodeScannerView;

    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    move-result v0

    iget-object v1, p0, Lcom/budiyev/android/codescanner/CodeScanner;->d:Lcom/budiyev/android/codescanner/CodeScannerView;

    invoke-virtual {v1}, Landroid/view/View;->getHeight()I

    move-result v1

    invoke-direct {p0, v0, v1}, Lcom/budiyev/android/codescanner/CodeScanner;->N(II)V

    return-void
.end method

.method private N(II)V
    .locals 1

    .line 1
    iput p1, p0, Lcom/budiyev/android/codescanner/CodeScanner;->I:I

    .line 2
    .line 3
    iput p2, p0, Lcom/budiyev/android/codescanner/CodeScanner;->J:I

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    if-lez p1, :cond_0

    .line 7
    .line 8
    if-lez p2, :cond_0

    .line 9
    .line 10
    iput-boolean v0, p0, Lcom/budiyev/android/codescanner/CodeScanner;->t:Z

    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    iput-boolean v0, p0, Lcom/budiyev/android/codescanner/CodeScanner;->G:Z

    .line 14
    .line 15
    new-instance v0, Lcom/budiyev/android/codescanner/CodeScanner$e;

    .line 16
    .line 17
    invoke-direct {v0, p0, p1, p2}, Lcom/budiyev/android/codescanner/CodeScanner$e;-><init>(Lcom/budiyev/android/codescanner/CodeScanner;II)V

    .line 18
    .line 19
    .line 20
    iget-object p1, p0, Lcom/budiyev/android/codescanner/CodeScanner;->m:Lcom/budiyev/android/codescanner/CodeScanner$c;

    .line 21
    .line 22
    invoke-virtual {v0, p1}, Ljava/lang/Thread;->setUncaughtExceptionHandler(Ljava/lang/Thread$UncaughtExceptionHandler;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 26
    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    iput-boolean v0, p0, Lcom/budiyev/android/codescanner/CodeScanner;->G:Z

    .line 30
    .line 31
    :goto_0
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
.end method

.method private V()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lcom/budiyev/android/codescanner/CodeScanner;->u:Z

    .line 3
    .line 4
    iput-boolean v0, p0, Lcom/budiyev/android/codescanner/CodeScanner;->t:Z

    .line 5
    .line 6
    iput-boolean v0, p0, Lcom/budiyev/android/codescanner/CodeScanner;->v:Z

    .line 7
    .line 8
    iput-boolean v0, p0, Lcom/budiyev/android/codescanner/CodeScanner;->D:Z

    .line 9
    .line 10
    iput-boolean v0, p0, Lcom/budiyev/android/codescanner/CodeScanner;->E:Z

    .line 11
    .line 12
    iget-object v0, p0, Lcom/budiyev/android/codescanner/CodeScanner;->s:Lcom/budiyev/android/codescanner/g;

    .line 13
    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    const/4 v1, 0x0

    .line 17
    iput-object v1, p0, Lcom/budiyev/android/codescanner/CodeScanner;->s:Lcom/budiyev/android/codescanner/g;

    .line 18
    .line 19
    invoke-virtual {v0}, Lcom/budiyev/android/codescanner/g;->i()V

    .line 20
    .line 21
    .line 22
    :cond_0
    return-void
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
.end method

.method private W()V
    .locals 4

    .line 1
    iget-boolean v0, p0, Lcom/budiyev/android/codescanner/CodeScanner;->u:Z

    .line 2
    .line 3
    if-eqz v0, :cond_3

    .line 4
    .line 5
    iget-boolean v0, p0, Lcom/budiyev/android/codescanner/CodeScanner;->D:Z

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    goto :goto_1

    .line 10
    :cond_0
    iget-object v0, p0, Lcom/budiyev/android/codescanner/CodeScanner;->s:Lcom/budiyev/android/codescanner/g;

    .line 11
    .line 12
    if-eqz v0, :cond_3

    .line 13
    .line 14
    invoke-virtual {v0}, Lcom/budiyev/android/codescanner/g;->g()Z

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    if-eqz v1, :cond_3

    .line 19
    .line 20
    iget-boolean v1, p0, Lcom/budiyev/android/codescanner/CodeScanner;->w:Z

    .line 21
    .line 22
    if-nez v1, :cond_1

    .line 23
    .line 24
    goto :goto_1

    .line 25
    :cond_1
    iget-boolean v1, p0, Lcom/budiyev/android/codescanner/CodeScanner;->E:Z

    .line 26
    .line 27
    const/4 v2, 0x1

    .line 28
    if-eqz v1, :cond_2

    .line 29
    .line 30
    iget v1, p0, Lcom/budiyev/android/codescanner/CodeScanner;->H:I

    .line 31
    .line 32
    const/4 v3, 0x2

    .line 33
    if-ge v1, v3, :cond_2

    .line 34
    .line 35
    add-int/2addr v1, v2

    .line 36
    iput v1, p0, Lcom/budiyev/android/codescanner/CodeScanner;->H:I

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_2
    const/4 v1, 0x0

    .line 40
    :try_start_0
    invoke-virtual {v0}, Lcom/budiyev/android/codescanner/g;->a()Landroid/hardware/Camera;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    invoke-virtual {v0}, Landroid/hardware/Camera;->cancelAutoFocus()V

    .line 45
    .line 46
    .line 47
    iget-object v3, p0, Lcom/budiyev/android/codescanner/CodeScanner;->i:Landroid/hardware/Camera$AutoFocusCallback;

    .line 48
    .line 49
    invoke-virtual {v0, v3}, Landroid/hardware/Camera;->autoFocus(Landroid/hardware/Camera$AutoFocusCallback;)V

    .line 50
    .line 51
    .line 52
    iput v1, p0, Lcom/budiyev/android/codescanner/CodeScanner;->H:I

    .line 53
    .line 54
    iput-boolean v2, p0, Lcom/budiyev/android/codescanner/CodeScanner;->E:Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 55
    .line 56
    goto :goto_0

    .line 57
    :catch_0
    iput-boolean v1, p0, Lcom/budiyev/android/codescanner/CodeScanner;->E:Z

    .line 58
    .line 59
    :goto_0
    invoke-direct {p0}, Lcom/budiyev/android/codescanner/CodeScanner;->X()V

    .line 60
    .line 61
    .line 62
    :cond_3
    :goto_1
    return-void
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
.end method

.method private X()V
    .locals 4

    .line 1
    iget-boolean v0, p0, Lcom/budiyev/android/codescanner/CodeScanner;->F:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    const/4 v0, 0x1

    .line 7
    iput-boolean v0, p0, Lcom/budiyev/android/codescanner/CodeScanner;->F:Z

    .line 8
    .line 9
    iget-object v0, p0, Lcom/budiyev/android/codescanner/CodeScanner;->c:Landroid/os/Handler;

    .line 10
    .line 11
    iget-object v1, p0, Lcom/budiyev/android/codescanner/CodeScanner;->j:Ljava/lang/Runnable;

    .line 12
    .line 13
    iget-wide v2, p0, Lcom/budiyev/android/codescanner/CodeScanner;->y:J

    .line 14
    .line 15
    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 16
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
.end method

.method private Z(Z)V
    .locals 6

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/budiyev/android/codescanner/CodeScanner;->s:Lcom/budiyev/android/codescanner/g;

    .line 2
    .line 3
    if-eqz v0, :cond_2

    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/budiyev/android/codescanner/g;->a()Landroid/hardware/Camera;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {v1}, Landroid/hardware/Camera;->cancelAutoFocus()V

    .line 10
    .line 11
    .line 12
    const/4 v2, 0x0

    .line 13
    iput-boolean v2, p0, Lcom/budiyev/android/codescanner/CodeScanner;->C:Z

    .line 14
    .line 15
    invoke-virtual {v1}, Landroid/hardware/Camera;->getParameters()Landroid/hardware/Camera$Parameters;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    iget-object v4, p0, Lcom/budiyev/android/codescanner/CodeScanner;->p:Lcom/budiyev/android/codescanner/a;

    .line 20
    .line 21
    if-eqz p1, :cond_0

    .line 22
    .line 23
    invoke-static {v3, v4}, Lcom/budiyev/android/codescanner/n;->r(Landroid/hardware/Camera$Parameters;Lcom/budiyev/android/codescanner/a;)V

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    invoke-static {v3}, Lcom/budiyev/android/codescanner/n;->i(Landroid/hardware/Camera$Parameters;)V

    .line 28
    .line 29
    .line 30
    :goto_0
    if-eqz p1, :cond_1

    .line 31
    .line 32
    iget-object v5, p0, Lcom/budiyev/android/codescanner/CodeScanner;->d:Lcom/budiyev/android/codescanner/CodeScannerView;

    .line 33
    .line 34
    invoke-virtual {v5}, Lcom/budiyev/android/codescanner/CodeScannerView;->getFrameRect()Lcom/budiyev/android/codescanner/l;

    .line 35
    .line 36
    .line 37
    move-result-object v5

    .line 38
    if-eqz v5, :cond_1

    .line 39
    .line 40
    invoke-static {v3, v0, v5}, Lcom/budiyev/android/codescanner/n;->a(Landroid/hardware/Camera$Parameters;Lcom/budiyev/android/codescanner/g;Lcom/budiyev/android/codescanner/l;)V

    .line 41
    .line 42
    .line 43
    :cond_1
    invoke-virtual {v1, v3}, Landroid/hardware/Camera;->setParameters(Landroid/hardware/Camera$Parameters;)V

    .line 44
    .line 45
    .line 46
    if-eqz p1, :cond_2

    .line 47
    .line 48
    iput v2, p0, Lcom/budiyev/android/codescanner/CodeScanner;->H:I

    .line 49
    .line 50
    iput-boolean v2, p0, Lcom/budiyev/android/codescanner/CodeScanner;->E:Z

    .line 51
    .line 52
    sget-object p1, Lcom/budiyev/android/codescanner/a;->k:Lcom/budiyev/android/codescanner/a;

    .line 53
    .line 54
    if-ne v4, p1, :cond_2

    .line 55
    .line 56
    invoke-direct {p0}, Lcom/budiyev/android/codescanner/CodeScanner;->X()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 57
    .line 58
    .line 59
    :catch_0
    :cond_2
    return-void
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
.end method

.method static synthetic a(Lcom/budiyev/android/codescanner/CodeScanner;)I
    .locals 0

    iget p0, p0, Lcom/budiyev/android/codescanner/CodeScanner;->I:I

    return p0
.end method

.method static synthetic b(Lcom/budiyev/android/codescanner/CodeScanner;)I
    .locals 0

    iget p0, p0, Lcom/budiyev/android/codescanner/CodeScanner;->J:I

    return p0
.end method

.method static synthetic c(Lcom/budiyev/android/codescanner/CodeScanner;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/budiyev/android/codescanner/CodeScanner;->D:Z

    return p0
.end method

.method static synthetic d(Lcom/budiyev/android/codescanner/CodeScanner;Z)Z
    .locals 0

    iput-boolean p1, p0, Lcom/budiyev/android/codescanner/CodeScanner;->D:Z

    return p1
.end method

.method static synthetic e(Lcom/budiyev/android/codescanner/CodeScanner;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/budiyev/android/codescanner/CodeScanner;->u:Z

    return p0
.end method

.method private e0(Z)V
    .locals 2

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/budiyev/android/codescanner/CodeScanner;->s:Lcom/budiyev/android/codescanner/g;

    .line 2
    .line 3
    if-eqz v0, :cond_2

    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/budiyev/android/codescanner/g;->a()Landroid/hardware/Camera;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0}, Landroid/hardware/Camera;->getParameters()Landroid/hardware/Camera$Parameters;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    if-nez v1, :cond_0

    .line 14
    .line 15
    return-void

    .line 16
    :cond_0
    if-eqz p1, :cond_1

    .line 17
    .line 18
    const-string p1, "torch"

    .line 19
    .line 20
    invoke-static {v1, p1}, Lcom/budiyev/android/codescanner/n;->s(Landroid/hardware/Camera$Parameters;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_1
    const-string p1, "off"

    .line 25
    .line 26
    invoke-static {v1, p1}, Lcom/budiyev/android/codescanner/n;->s(Landroid/hardware/Camera$Parameters;Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    :goto_0
    invoke-virtual {v0, v1}, Landroid/hardware/Camera;->setParameters(Landroid/hardware/Camera$Parameters;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 30
    .line 31
    .line 32
    :catch_0
    :cond_2
    return-void
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
.end method

.method static synthetic f(Lcom/budiyev/android/codescanner/CodeScanner;Z)Z
    .locals 0

    iput-boolean p1, p0, Lcom/budiyev/android/codescanner/CodeScanner;->u:Z

    return p1
.end method

.method static synthetic g(Lcom/budiyev/android/codescanner/CodeScanner;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/budiyev/android/codescanner/CodeScanner;->G:Z

    return p0
.end method

.method static synthetic h(Lcom/budiyev/android/codescanner/CodeScanner;II)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/budiyev/android/codescanner/CodeScanner;->N(II)V

    return-void
.end method

.method private h0(Z)V
    .locals 3

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/budiyev/android/codescanner/CodeScanner;->s:Lcom/budiyev/android/codescanner/g;

    .line 2
    .line 3
    if-eqz v0, :cond_2

    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/budiyev/android/codescanner/g;->a()Landroid/hardware/Camera;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    iget-object v2, p0, Lcom/budiyev/android/codescanner/CodeScanner;->g:Landroid/hardware/Camera$PreviewCallback;

    .line 10
    .line 11
    invoke-virtual {v1, v2}, Landroid/hardware/Camera;->setPreviewCallback(Landroid/hardware/Camera$PreviewCallback;)V

    .line 12
    .line 13
    .line 14
    iget-object v2, p0, Lcom/budiyev/android/codescanner/CodeScanner;->e:Landroid/view/SurfaceHolder;

    .line 15
    .line 16
    invoke-virtual {v1, v2}, Landroid/hardware/Camera;->setPreviewDisplay(Landroid/view/SurfaceHolder;)V

    .line 17
    .line 18
    .line 19
    const/4 v2, 0x1

    .line 20
    if-nez p1, :cond_0

    .line 21
    .line 22
    invoke-virtual {v0}, Lcom/budiyev/android/codescanner/g;->h()Z

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    if-eqz p1, :cond_0

    .line 27
    .line 28
    iget-boolean p1, p0, Lcom/budiyev/android/codescanner/CodeScanner;->x:Z

    .line 29
    .line 30
    if-eqz p1, :cond_0

    .line 31
    .line 32
    invoke-direct {p0, v2}, Lcom/budiyev/android/codescanner/CodeScanner;->e0(Z)V

    .line 33
    .line 34
    .line 35
    :cond_0
    invoke-virtual {v1}, Landroid/hardware/Camera;->startPreview()V

    .line 36
    .line 37
    .line 38
    const/4 p1, 0x0

    .line 39
    iput-boolean p1, p0, Lcom/budiyev/android/codescanner/CodeScanner;->v:Z

    .line 40
    .line 41
    iput-boolean v2, p0, Lcom/budiyev/android/codescanner/CodeScanner;->D:Z

    .line 42
    .line 43
    iput-boolean p1, p0, Lcom/budiyev/android/codescanner/CodeScanner;->E:Z

    .line 44
    .line 45
    iput p1, p0, Lcom/budiyev/android/codescanner/CodeScanner;->H:I

    .line 46
    .line 47
    invoke-virtual {v0}, Lcom/budiyev/android/codescanner/g;->g()Z

    .line 48
    .line 49
    .line 50
    move-result p1

    .line 51
    if-eqz p1, :cond_2

    .line 52
    .line 53
    iget-boolean p1, p0, Lcom/budiyev/android/codescanner/CodeScanner;->w:Z

    .line 54
    .line 55
    if-eqz p1, :cond_2

    .line 56
    .line 57
    iget-object p1, p0, Lcom/budiyev/android/codescanner/CodeScanner;->d:Lcom/budiyev/android/codescanner/CodeScannerView;

    .line 58
    .line 59
    invoke-virtual {p1}, Lcom/budiyev/android/codescanner/CodeScannerView;->getFrameRect()Lcom/budiyev/android/codescanner/l;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    if-eqz p1, :cond_1

    .line 64
    .line 65
    invoke-virtual {v1}, Landroid/hardware/Camera;->getParameters()Landroid/hardware/Camera$Parameters;

    .line 66
    .line 67
    .line 68
    move-result-object v2

    .line 69
    invoke-static {v2, v0, p1}, Lcom/budiyev/android/codescanner/n;->a(Landroid/hardware/Camera$Parameters;Lcom/budiyev/android/codescanner/g;Lcom/budiyev/android/codescanner/l;)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {v1, v2}, Landroid/hardware/Camera;->setParameters(Landroid/hardware/Camera$Parameters;)V

    .line 73
    .line 74
    .line 75
    :cond_1
    iget-object p1, p0, Lcom/budiyev/android/codescanner/CodeScanner;->p:Lcom/budiyev/android/codescanner/a;

    .line 76
    .line 77
    sget-object v0, Lcom/budiyev/android/codescanner/a;->k:Lcom/budiyev/android/codescanner/a;

    .line 78
    .line 79
    if-ne p1, v0, :cond_2

    .line 80
    .line 81
    invoke-direct {p0}, Lcom/budiyev/android/codescanner/CodeScanner;->X()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 82
    .line 83
    .line 84
    :catch_0
    :cond_2
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
.end method

.method static synthetic i(Lcom/budiyev/android/codescanner/CodeScanner;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/budiyev/android/codescanner/CodeScanner;->v:Z

    return p0
.end method

.method private i0()V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/budiyev/android/codescanner/CodeScanner;->u:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-boolean v0, p0, Lcom/budiyev/android/codescanner/CodeScanner;->D:Z

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    invoke-direct {p0, v0}, Lcom/budiyev/android/codescanner/CodeScanner;->h0(Z)V

    .line 11
    .line 12
    .line 13
    :cond_0
    return-void
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
.end method

.method static synthetic j(Lcom/budiyev/android/codescanner/CodeScanner;Z)Z
    .locals 0

    iput-boolean p1, p0, Lcom/budiyev/android/codescanner/CodeScanner;->v:Z

    return p1
.end method

.method static synthetic k(Lcom/budiyev/android/codescanner/CodeScanner;)Lcom/budiyev/android/codescanner/m;
    .locals 0

    iget-object p0, p0, Lcom/budiyev/android/codescanner/CodeScanner;->o:Lcom/budiyev/android/codescanner/m;

    return-object p0
.end method

.method private k0(Z)V
    .locals 3

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/budiyev/android/codescanner/CodeScanner;->s:Lcom/budiyev/android/codescanner/g;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/budiyev/android/codescanner/g;->a()Landroid/hardware/Camera;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {v1}, Landroid/hardware/Camera;->cancelAutoFocus()V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v1}, Landroid/hardware/Camera;->getParameters()Landroid/hardware/Camera$Parameters;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    if-nez p1, :cond_0

    .line 17
    .line 18
    invoke-virtual {v0}, Lcom/budiyev/android/codescanner/g;->h()Z

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    if-eqz p1, :cond_0

    .line 23
    .line 24
    iget-boolean p1, p0, Lcom/budiyev/android/codescanner/CodeScanner;->x:Z

    .line 25
    .line 26
    if-eqz p1, :cond_0

    .line 27
    .line 28
    const-string p1, "off"

    .line 29
    .line 30
    invoke-static {v2, p1}, Lcom/budiyev/android/codescanner/n;->s(Landroid/hardware/Camera$Parameters;Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    :cond_0
    invoke-virtual {v1, v2}, Landroid/hardware/Camera;->setParameters(Landroid/hardware/Camera$Parameters;)V

    .line 34
    .line 35
    .line 36
    const/4 p1, 0x0

    .line 37
    invoke-virtual {v1, p1}, Landroid/hardware/Camera;->setPreviewCallback(Landroid/hardware/Camera$PreviewCallback;)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {v1}, Landroid/hardware/Camera;->stopPreview()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 41
    .line 42
    .line 43
    :catch_0
    :cond_1
    const/4 p1, 0x0

    .line 44
    iput-boolean p1, p0, Lcom/budiyev/android/codescanner/CodeScanner;->v:Z

    .line 45
    .line 46
    iput-boolean p1, p0, Lcom/budiyev/android/codescanner/CodeScanner;->D:Z

    .line 47
    .line 48
    iput-boolean p1, p0, Lcom/budiyev/android/codescanner/CodeScanner;->E:Z

    .line 49
    .line 50
    iput p1, p0, Lcom/budiyev/android/codescanner/CodeScanner;->H:I

    .line 51
    .line 52
    return-void
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
.end method

.method static synthetic l(Lcom/budiyev/android/codescanner/CodeScanner;)Lcom/budiyev/android/codescanner/g;
    .locals 0

    iget-object p0, p0, Lcom/budiyev/android/codescanner/CodeScanner;->s:Lcom/budiyev/android/codescanner/g;

    return-object p0
.end method

.method private l0()V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/budiyev/android/codescanner/CodeScanner;->u:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-boolean v0, p0, Lcom/budiyev/android/codescanner/CodeScanner;->D:Z

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    invoke-direct {p0, v0}, Lcom/budiyev/android/codescanner/CodeScanner;->k0(Z)V

    .line 11
    .line 12
    .line 13
    :cond_0
    return-void
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
.end method

.method static synthetic m(Lcom/budiyev/android/codescanner/CodeScanner;Lcom/budiyev/android/codescanner/g;)Lcom/budiyev/android/codescanner/g;
    .locals 0

    iput-object p1, p0, Lcom/budiyev/android/codescanner/CodeScanner;->s:Lcom/budiyev/android/codescanner/g;

    return-object p1
.end method

.method static synthetic n(Lcom/budiyev/android/codescanner/CodeScanner;)Lcom/budiyev/android/codescanner/CodeScannerView;
    .locals 0

    iget-object p0, p0, Lcom/budiyev/android/codescanner/CodeScanner;->d:Lcom/budiyev/android/codescanner/CodeScannerView;

    return-object p0
.end method

.method static synthetic o(Lcom/budiyev/android/codescanner/CodeScanner;)V
    .locals 0

    invoke-direct {p0}, Lcom/budiyev/android/codescanner/CodeScanner;->i0()V

    return-void
.end method

.method static synthetic p(Lcom/budiyev/android/codescanner/CodeScanner;)V
    .locals 0

    invoke-direct {p0}, Lcom/budiyev/android/codescanner/CodeScanner;->l0()V

    return-void
.end method

.method static synthetic q(Lcom/budiyev/android/codescanner/CodeScanner;)Ljava/lang/Runnable;
    .locals 0

    iget-object p0, p0, Lcom/budiyev/android/codescanner/CodeScanner;->k:Ljava/lang/Runnable;

    return-object p0
.end method

.method static synthetic r(Lcom/budiyev/android/codescanner/CodeScanner;)Landroid/os/Handler;
    .locals 0

    iget-object p0, p0, Lcom/budiyev/android/codescanner/CodeScanner;->c:Landroid/os/Handler;

    return-object p0
.end method

.method static synthetic s(Lcom/budiyev/android/codescanner/CodeScanner;)I
    .locals 0

    iget p0, p0, Lcom/budiyev/android/codescanner/CodeScanner;->z:I

    return p0
.end method

.method static synthetic t(Lcom/budiyev/android/codescanner/CodeScanner;I)I
    .locals 0

    iput p1, p0, Lcom/budiyev/android/codescanner/CodeScanner;->z:I

    return p1
.end method

.method static synthetic u(Lcom/budiyev/android/codescanner/CodeScanner;)Landroid/content/Context;
    .locals 0

    iget-object p0, p0, Lcom/budiyev/android/codescanner/CodeScanner;->b:Landroid/content/Context;

    return-object p0
.end method

.method static synthetic v(Lcom/budiyev/android/codescanner/CodeScanner;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/budiyev/android/codescanner/CodeScanner;->w:Z

    return p0
.end method

.method static synthetic w(Lcom/budiyev/android/codescanner/CodeScanner;Z)Z
    .locals 0

    iput-boolean p1, p0, Lcom/budiyev/android/codescanner/CodeScanner;->w:Z

    return p1
.end method

.method static synthetic x(Lcom/budiyev/android/codescanner/CodeScanner;)Lcom/budiyev/android/codescanner/a;
    .locals 0

    iget-object p0, p0, Lcom/budiyev/android/codescanner/CodeScanner;->p:Lcom/budiyev/android/codescanner/a;

    return-object p0
.end method

.method static synthetic y(Lcom/budiyev/android/codescanner/CodeScanner;Z)Z
    .locals 0

    iput-boolean p1, p0, Lcom/budiyev/android/codescanner/CodeScanner;->x:Z

    return p1
.end method

.method static synthetic z(Lcom/budiyev/android/codescanner/CodeScanner;)I
    .locals 0

    iget p0, p0, Lcom/budiyev/android/codescanner/CodeScanner;->A:I

    return p0
.end method


# virtual methods
.method public O()Z
    .locals 1

    iget-boolean v0, p0, Lcom/budiyev/android/codescanner/CodeScanner;->w:Z

    return v0
.end method

.method P()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/budiyev/android/codescanner/CodeScanner;->s:Lcom/budiyev/android/codescanner/g;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/budiyev/android/codescanner/g;->g()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 v0, 0x0

    .line 13
    goto :goto_1

    .line 14
    :cond_1
    :goto_0
    const/4 v0, 0x1

    .line 15
    :goto_1
    return v0
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
.end method

.method public Q()Z
    .locals 1

    iget-boolean v0, p0, Lcom/budiyev/android/codescanner/CodeScanner;->x:Z

    return v0
.end method

.method R()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/budiyev/android/codescanner/CodeScanner;->s:Lcom/budiyev/android/codescanner/g;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/budiyev/android/codescanner/g;->h()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 v0, 0x0

    .line 13
    goto :goto_1

    .line 14
    :cond_1
    :goto_0
    const/4 v0, 0x1

    .line 15
    :goto_1
    return v0
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
.end method

.method public S()Z
    .locals 1

    iget-boolean v0, p0, Lcom/budiyev/android/codescanner/CodeScanner;->B:Z

    return v0
.end method

.method T(Lcom/budiyev/android/codescanner/l;)V
    .locals 8

    .line 1
    iget-object v0, p0, Lcom/budiyev/android/codescanner/CodeScanner;->a:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-boolean v1, p0, Lcom/budiyev/android/codescanner/CodeScanner;->u:Z

    .line 5
    .line 6
    if-eqz v1, :cond_2

    .line 7
    .line 8
    iget-boolean v1, p0, Lcom/budiyev/android/codescanner/CodeScanner;->D:Z

    .line 9
    .line 10
    if-eqz v1, :cond_2

    .line 11
    .line 12
    iget-boolean v1, p0, Lcom/budiyev/android/codescanner/CodeScanner;->C:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 13
    .line 14
    if-nez v1, :cond_2

    .line 15
    .line 16
    const/4 v1, 0x0

    .line 17
    :try_start_1
    invoke-virtual {p0, v1}, Lcom/budiyev/android/codescanner/CodeScanner;->Y(Z)V

    .line 18
    .line 19
    .line 20
    iget-object v1, p0, Lcom/budiyev/android/codescanner/CodeScanner;->s:Lcom/budiyev/android/codescanner/g;

    .line 21
    .line 22
    iget-boolean v2, p0, Lcom/budiyev/android/codescanner/CodeScanner;->D:Z

    .line 23
    .line 24
    if-eqz v2, :cond_2

    .line 25
    .line 26
    if-eqz v1, :cond_2

    .line 27
    .line 28
    invoke-virtual {v1}, Lcom/budiyev/android/codescanner/g;->g()Z

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    if-eqz v2, :cond_2

    .line 33
    .line 34
    invoke-virtual {v1}, Lcom/budiyev/android/codescanner/g;->d()Lcom/budiyev/android/codescanner/i;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    invoke-virtual {v2}, Lcom/budiyev/android/codescanner/i;->a()I

    .line 39
    .line 40
    .line 41
    move-result v3

    .line 42
    invoke-virtual {v2}, Lcom/budiyev/android/codescanner/i;->b()I

    .line 43
    .line 44
    .line 45
    move-result v2

    .line 46
    invoke-virtual {v1}, Lcom/budiyev/android/codescanner/g;->c()I

    .line 47
    .line 48
    .line 49
    move-result v4

    .line 50
    const/16 v5, 0x5a

    .line 51
    .line 52
    if-eq v4, v5, :cond_0

    .line 53
    .line 54
    const/16 v5, 0x10e

    .line 55
    .line 56
    if-ne v4, v5, :cond_1

    .line 57
    .line 58
    :cond_0
    move v7, v3

    .line 59
    move v3, v2

    .line 60
    move v2, v7

    .line 61
    :cond_1
    invoke-virtual {v1}, Lcom/budiyev/android/codescanner/g;->e()Lcom/budiyev/android/codescanner/i;

    .line 62
    .line 63
    .line 64
    move-result-object v5

    .line 65
    invoke-virtual {v1}, Lcom/budiyev/android/codescanner/g;->f()Lcom/budiyev/android/codescanner/i;

    .line 66
    .line 67
    .line 68
    move-result-object v6

    .line 69
    invoke-static {v3, v2, p1, v5, v6}, Lcom/budiyev/android/codescanner/n;->m(IILcom/budiyev/android/codescanner/l;Lcom/budiyev/android/codescanner/i;Lcom/budiyev/android/codescanner/i;)Lcom/budiyev/android/codescanner/l;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    invoke-virtual {v1}, Lcom/budiyev/android/codescanner/g;->a()Landroid/hardware/Camera;

    .line 74
    .line 75
    .line 76
    move-result-object v1

    .line 77
    invoke-virtual {v1}, Landroid/hardware/Camera;->cancelAutoFocus()V

    .line 78
    .line 79
    .line 80
    invoke-virtual {v1}, Landroid/hardware/Camera;->getParameters()Landroid/hardware/Camera$Parameters;

    .line 81
    .line 82
    .line 83
    move-result-object v5

    .line 84
    invoke-static {v5, p1, v3, v2, v4}, Lcom/budiyev/android/codescanner/n;->c(Landroid/hardware/Camera$Parameters;Lcom/budiyev/android/codescanner/l;III)V

    .line 85
    .line 86
    .line 87
    invoke-static {v5}, Lcom/budiyev/android/codescanner/n;->d(Landroid/hardware/Camera$Parameters;)V

    .line 88
    .line 89
    .line 90
    invoke-virtual {v1, v5}, Landroid/hardware/Camera;->setParameters(Landroid/hardware/Camera$Parameters;)V

    .line 91
    .line 92
    .line 93
    iget-object p1, p0, Lcom/budiyev/android/codescanner/CodeScanner;->h:Landroid/hardware/Camera$AutoFocusCallback;

    .line 94
    .line 95
    invoke-virtual {v1, p1}, Landroid/hardware/Camera;->autoFocus(Landroid/hardware/Camera$AutoFocusCallback;)V

    .line 96
    .line 97
    .line 98
    const/4 p1, 0x1

    .line 99
    iput-boolean p1, p0, Lcom/budiyev/android/codescanner/CodeScanner;->C:Z
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 100
    .line 101
    :catch_0
    :cond_2
    :try_start_2
    monitor-exit v0

    .line 102
    return-void

    .line 103
    :catchall_0
    move-exception p1

    .line 104
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 105
    throw p1
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
.end method

.method public U()V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/budiyev/android/codescanner/CodeScanner;->u:Z

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    iget-boolean v0, p0, Lcom/budiyev/android/codescanner/CodeScanner;->D:Z

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/budiyev/android/codescanner/CodeScanner;->j0()V

    .line 10
    .line 11
    .line 12
    :cond_0
    invoke-direct {p0}, Lcom/budiyev/android/codescanner/CodeScanner;->V()V

    .line 13
    .line 14
    .line 15
    :cond_1
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
.end method

.method public Y(Z)V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/budiyev/android/codescanner/CodeScanner;->a:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-boolean v1, p0, Lcom/budiyev/android/codescanner/CodeScanner;->w:Z

    .line 5
    .line 6
    if-eq v1, p1, :cond_0

    .line 7
    .line 8
    const/4 v1, 0x1

    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 v1, 0x0

    .line 11
    :goto_0
    iput-boolean p1, p0, Lcom/budiyev/android/codescanner/CodeScanner;->w:Z

    .line 12
    .line 13
    iget-object v2, p0, Lcom/budiyev/android/codescanner/CodeScanner;->d:Lcom/budiyev/android/codescanner/CodeScannerView;

    .line 14
    .line 15
    invoke-virtual {v2, p1}, Lcom/budiyev/android/codescanner/CodeScannerView;->setAutoFocusEnabled(Z)V

    .line 16
    .line 17
    .line 18
    iget-object v2, p0, Lcom/budiyev/android/codescanner/CodeScanner;->s:Lcom/budiyev/android/codescanner/g;

    .line 19
    .line 20
    iget-boolean v3, p0, Lcom/budiyev/android/codescanner/CodeScanner;->u:Z

    .line 21
    .line 22
    if-eqz v3, :cond_1

    .line 23
    .line 24
    iget-boolean v3, p0, Lcom/budiyev/android/codescanner/CodeScanner;->D:Z

    .line 25
    .line 26
    if-eqz v3, :cond_1

    .line 27
    .line 28
    if-eqz v1, :cond_1

    .line 29
    .line 30
    if-eqz v2, :cond_1

    .line 31
    .line 32
    invoke-virtual {v2}, Lcom/budiyev/android/codescanner/g;->g()Z

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    if-eqz v1, :cond_1

    .line 37
    .line 38
    invoke-direct {p0, p1}, Lcom/budiyev/android/codescanner/CodeScanner;->Z(Z)V

    .line 39
    .line 40
    .line 41
    :cond_1
    monitor-exit v0

    .line 42
    return-void

    .line 43
    :catchall_0
    move-exception p1

    .line 44
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 45
    throw p1
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
.end method

.method public a0(I)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/budiyev/android/codescanner/CodeScanner;->a:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget v1, p0, Lcom/budiyev/android/codescanner/CodeScanner;->z:I

    .line 5
    .line 6
    if-eq v1, p1, :cond_0

    .line 7
    .line 8
    iput p1, p0, Lcom/budiyev/android/codescanner/CodeScanner;->z:I

    .line 9
    .line 10
    iget-boolean p1, p0, Lcom/budiyev/android/codescanner/CodeScanner;->u:Z

    .line 11
    .line 12
    if-eqz p1, :cond_0

    .line 13
    .line 14
    iget-boolean p1, p0, Lcom/budiyev/android/codescanner/CodeScanner;->D:Z

    .line 15
    .line 16
    invoke-virtual {p0}, Lcom/budiyev/android/codescanner/CodeScanner;->U()V

    .line 17
    .line 18
    .line 19
    if-eqz p1, :cond_0

    .line 20
    .line 21
    invoke-direct {p0}, Lcom/budiyev/android/codescanner/CodeScanner;->M()V

    .line 22
    .line 23
    .line 24
    :cond_0
    monitor-exit v0

    .line 25
    return-void

    .line 26
    :catchall_0
    move-exception p1

    .line 27
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 28
    throw p1
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
.end method

.method public b0(Lcom/budiyev/android/codescanner/d;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/budiyev/android/codescanner/CodeScanner;->a:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iput-object p1, p0, Lcom/budiyev/android/codescanner/CodeScanner;->q:Lcom/budiyev/android/codescanner/d;

    .line 5
    .line 6
    iget-boolean v1, p0, Lcom/budiyev/android/codescanner/CodeScanner;->u:Z

    .line 7
    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    iget-object v1, p0, Lcom/budiyev/android/codescanner/CodeScanner;->s:Lcom/budiyev/android/codescanner/g;

    .line 11
    .line 12
    if-eqz v1, :cond_0

    .line 13
    .line 14
    invoke-virtual {v1}, Lcom/budiyev/android/codescanner/g;->b()Lcom/budiyev/android/codescanner/f;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    invoke-virtual {v1, p1}, Lcom/budiyev/android/codescanner/f;->i(Lcom/budiyev/android/codescanner/d;)V

    .line 19
    .line 20
    .line 21
    :cond_0
    monitor-exit v0

    .line 22
    return-void

    .line 23
    :catchall_0
    move-exception p1

    .line 24
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 25
    throw p1
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
.end method

.method public c0(Lcom/budiyev/android/codescanner/h;)V
    .locals 0

    iput-object p1, p0, Lcom/budiyev/android/codescanner/CodeScanner;->r:Lcom/budiyev/android/codescanner/h;

    return-void
.end method

.method public d0(Z)V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/budiyev/android/codescanner/CodeScanner;->a:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-boolean v1, p0, Lcom/budiyev/android/codescanner/CodeScanner;->x:Z

    .line 5
    .line 6
    if-eq v1, p1, :cond_0

    .line 7
    .line 8
    const/4 v1, 0x1

    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 v1, 0x0

    .line 11
    :goto_0
    iput-boolean p1, p0, Lcom/budiyev/android/codescanner/CodeScanner;->x:Z

    .line 12
    .line 13
    iget-object v2, p0, Lcom/budiyev/android/codescanner/CodeScanner;->d:Lcom/budiyev/android/codescanner/CodeScannerView;

    .line 14
    .line 15
    invoke-virtual {v2, p1}, Lcom/budiyev/android/codescanner/CodeScannerView;->setFlashEnabled(Z)V

    .line 16
    .line 17
    .line 18
    iget-object v2, p0, Lcom/budiyev/android/codescanner/CodeScanner;->s:Lcom/budiyev/android/codescanner/g;

    .line 19
    .line 20
    iget-boolean v3, p0, Lcom/budiyev/android/codescanner/CodeScanner;->u:Z

    .line 21
    .line 22
    if-eqz v3, :cond_1

    .line 23
    .line 24
    iget-boolean v3, p0, Lcom/budiyev/android/codescanner/CodeScanner;->D:Z

    .line 25
    .line 26
    if-eqz v3, :cond_1

    .line 27
    .line 28
    if-eqz v1, :cond_1

    .line 29
    .line 30
    if-eqz v2, :cond_1

    .line 31
    .line 32
    invoke-virtual {v2}, Lcom/budiyev/android/codescanner/g;->h()Z

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    if-eqz v1, :cond_1

    .line 37
    .line 38
    invoke-direct {p0, p1}, Lcom/budiyev/android/codescanner/CodeScanner;->e0(Z)V

    .line 39
    .line 40
    .line 41
    :cond_1
    monitor-exit v0

    .line 42
    return-void

    .line 43
    :catchall_0
    move-exception p1

    .line 44
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 45
    throw p1
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
.end method

.method public f0(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcd/a;",
            ">;)V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/budiyev/android/codescanner/CodeScanner;->a:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-object v1, p1

    .line 8
    check-cast v1, Ljava/util/List;

    .line 9
    .line 10
    iput-object v1, p0, Lcom/budiyev/android/codescanner/CodeScanner;->n:Ljava/util/List;

    .line 11
    .line 12
    iget-boolean v1, p0, Lcom/budiyev/android/codescanner/CodeScanner;->u:Z

    .line 13
    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    iget-object v1, p0, Lcom/budiyev/android/codescanner/CodeScanner;->s:Lcom/budiyev/android/codescanner/g;

    .line 17
    .line 18
    if-eqz v1, :cond_0

    .line 19
    .line 20
    invoke-virtual {v1}, Lcom/budiyev/android/codescanner/g;->b()Lcom/budiyev/android/codescanner/f;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    invoke-virtual {v1, p1}, Lcom/budiyev/android/codescanner/f;->j(Ljava/util/List;)V

    .line 25
    .line 26
    .line 27
    :cond_0
    monitor-exit v0

    .line 28
    return-void

    .line 29
    :catchall_0
    move-exception p1

    .line 30
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 31
    throw p1
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
.end method

.method public g0()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/budiyev/android/codescanner/CodeScanner;->a:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-boolean v1, p0, Lcom/budiyev/android/codescanner/CodeScanner;->u:Z

    .line 5
    .line 6
    if-nez v1, :cond_0

    .line 7
    .line 8
    iget-boolean v1, p0, Lcom/budiyev/android/codescanner/CodeScanner;->t:Z

    .line 9
    .line 10
    if-nez v1, :cond_0

    .line 11
    .line 12
    invoke-direct {p0}, Lcom/budiyev/android/codescanner/CodeScanner;->M()V

    .line 13
    .line 14
    .line 15
    monitor-exit v0

    .line 16
    return-void

    .line 17
    :cond_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 18
    iget-boolean v0, p0, Lcom/budiyev/android/codescanner/CodeScanner;->D:Z

    .line 19
    .line 20
    if-nez v0, :cond_1

    .line 21
    .line 22
    iget-object v0, p0, Lcom/budiyev/android/codescanner/CodeScanner;->e:Landroid/view/SurfaceHolder;

    .line 23
    .line 24
    iget-object v1, p0, Lcom/budiyev/android/codescanner/CodeScanner;->f:Landroid/view/SurfaceHolder$Callback;

    .line 25
    .line 26
    invoke-interface {v0, v1}, Landroid/view/SurfaceHolder;->addCallback(Landroid/view/SurfaceHolder$Callback;)V

    .line 27
    .line 28
    .line 29
    const/4 v0, 0x0

    .line 30
    invoke-direct {p0, v0}, Lcom/budiyev/android/codescanner/CodeScanner;->h0(Z)V

    .line 31
    .line 32
    .line 33
    :cond_1
    return-void

    .line 34
    :catchall_0
    move-exception v1

    .line 35
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 36
    throw v1
    .line 37
    .line 38
    .line 39
    .line 40
.end method

.method public j0()V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lcom/budiyev/android/codescanner/CodeScanner;->u:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-boolean v0, p0, Lcom/budiyev/android/codescanner/CodeScanner;->D:Z

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Lcom/budiyev/android/codescanner/CodeScanner;->e:Landroid/view/SurfaceHolder;

    .line 10
    .line 11
    iget-object v1, p0, Lcom/budiyev/android/codescanner/CodeScanner;->f:Landroid/view/SurfaceHolder$Callback;

    .line 12
    .line 13
    invoke-interface {v0, v1}, Landroid/view/SurfaceHolder;->removeCallback(Landroid/view/SurfaceHolder$Callback;)V

    .line 14
    .line 15
    .line 16
    const/4 v0, 0x0

    .line 17
    invoke-direct {p0, v0}, Lcom/budiyev/android/codescanner/CodeScanner;->k0(Z)V

    .line 18
    .line 19
    .line 20
    :cond_0
    return-void
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
.end method
