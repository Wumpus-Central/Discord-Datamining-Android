.class public final Lnet/time4j/z0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/time4j/z0$b;,
        Lnet/time4j/z0$c;,
        Lnet/time4j/z0$d;,
        Lnet/time4j/z0$e;,
        Lnet/time4j/z0$f;
    }
.end annotation


# static fields
.field private static final serialVersionUID:J = 0x6c2b9cb54e3d6a9bL

.field private static final v:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/util/Locale;",
            "Lnet/time4j/z0;",
            ">;"
        }
    .end annotation
.end field

.field public static final w:Lnet/time4j/z0;

.field private static final x:Lgj/y;


# instance fields
.field private final transient k:Lnet/time4j/x0;

.field private final transient l:I

.field private final transient m:Lnet/time4j/x0;

.field private final transient n:Lnet/time4j/x0;

.field private final transient o:Lnet/time4j/c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lnet/time4j/c<",
            "Ljava/lang/Integer;",
            "Lnet/time4j/f0;",
            ">;"
        }
    .end annotation
.end field

.field private final transient p:Lnet/time4j/c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lnet/time4j/c<",
            "Ljava/lang/Integer;",
            "Lnet/time4j/f0;",
            ">;"
        }
    .end annotation
.end field

.field private final transient q:Lnet/time4j/c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lnet/time4j/c<",
            "Ljava/lang/Integer;",
            "Lnet/time4j/f0;",
            ">;"
        }
    .end annotation
.end field

.field private final transient r:Lnet/time4j/c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lnet/time4j/c<",
            "Ljava/lang/Integer;",
            "Lnet/time4j/f0;",
            ">;"
        }
    .end annotation
.end field

.field private final transient s:Lnet/time4j/c0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lnet/time4j/c0<",
            "Lnet/time4j/x0;",
            ">;"
        }
    .end annotation
.end field

.field private final transient t:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Lfj/p<",
            "*>;>;"
        }
    .end annotation
.end field

.field private final transient u:Lfj/n;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lfj/n<",
            "Lnet/time4j/base/a;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, Lj$/util/concurrent/ConcurrentHashMap;

    .line 2
    .line 3
    invoke-direct {v0}, Lj$/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lnet/time4j/z0;->v:Ljava/util/Map;

    .line 7
    .line 8
    new-instance v0, Lnet/time4j/z0;

    .line 9
    .line 10
    sget-object v1, Lnet/time4j/x0;->k:Lnet/time4j/x0;

    .line 11
    .line 12
    sget-object v2, Lnet/time4j/x0;->p:Lnet/time4j/x0;

    .line 13
    .line 14
    sget-object v3, Lnet/time4j/x0;->q:Lnet/time4j/x0;

    .line 15
    .line 16
    const/4 v4, 0x4

    .line 17
    invoke-direct {v0, v1, v4, v2, v3}, Lnet/time4j/z0;-><init>(Lnet/time4j/x0;ILnet/time4j/x0;Lnet/time4j/x0;)V

    .line 18
    .line 19
    .line 20
    sput-object v0, Lnet/time4j/z0;->w:Lnet/time4j/z0;

    .line 21
    .line 22
    invoke-static {}, Lnet/time4j/base/d;->c()Lnet/time4j/base/d;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    const-class v1, Lgj/y;

    .line 27
    .line 28
    invoke-virtual {v0, v1}, Lnet/time4j/base/d;->g(Ljava/lang/Class;)Ljava/lang/Iterable;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    if-eqz v1, :cond_0

    .line 41
    .line 42
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    check-cast v0, Lgj/y;

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_0
    const/4 v0, 0x0

    .line 50
    :goto_0
    sput-object v0, Lnet/time4j/z0;->x:Lgj/y;

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
.end method

.method private constructor <init>(Lnet/time4j/x0;ILnet/time4j/x0;Lnet/time4j/x0;)V
    .locals 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    if-eqz p1, :cond_3

    .line 5
    .line 6
    const/4 v0, 0x1

    .line 7
    if-lt p2, v0, :cond_2

    .line 8
    .line 9
    const/4 v1, 0x7

    .line 10
    if-gt p2, v1, :cond_2

    .line 11
    .line 12
    if-eqz p3, :cond_1

    .line 13
    .line 14
    if-eqz p4, :cond_0

    .line 15
    .line 16
    iput-object p1, p0, Lnet/time4j/z0;->k:Lnet/time4j/x0;

    .line 17
    .line 18
    iput p2, p0, Lnet/time4j/z0;->l:I

    .line 19
    .line 20
    iput-object p3, p0, Lnet/time4j/z0;->m:Lnet/time4j/x0;

    .line 21
    .line 22
    iput-object p4, p0, Lnet/time4j/z0;->n:Lnet/time4j/x0;

    .line 23
    .line 24
    new-instance p1, Lnet/time4j/z0$d;

    .line 25
    .line 26
    const-string p2, "WEEK_OF_YEAR"

    .line 27
    .line 28
    const/4 v1, 0x0

    .line 29
    invoke-direct {p1, p0, p2, v1}, Lnet/time4j/z0$d;-><init>(Lnet/time4j/z0;Ljava/lang/String;I)V

    .line 30
    .line 31
    .line 32
    iput-object p1, p0, Lnet/time4j/z0;->o:Lnet/time4j/c;

    .line 33
    .line 34
    new-instance p2, Lnet/time4j/z0$d;

    .line 35
    .line 36
    const-string v1, "WEEK_OF_MONTH"

    .line 37
    .line 38
    invoke-direct {p2, p0, v1, v0}, Lnet/time4j/z0$d;-><init>(Lnet/time4j/z0;Ljava/lang/String;I)V

    .line 39
    .line 40
    .line 41
    iput-object p2, p0, Lnet/time4j/z0;->p:Lnet/time4j/c;

    .line 42
    .line 43
    new-instance v0, Lnet/time4j/z0$d;

    .line 44
    .line 45
    const-string v1, "BOUNDED_WEEK_OF_YEAR"

    .line 46
    .line 47
    const/4 v2, 0x2

    .line 48
    invoke-direct {v0, p0, v1, v2}, Lnet/time4j/z0$d;-><init>(Lnet/time4j/z0;Ljava/lang/String;I)V

    .line 49
    .line 50
    .line 51
    iput-object v0, p0, Lnet/time4j/z0;->q:Lnet/time4j/c;

    .line 52
    .line 53
    new-instance v1, Lnet/time4j/z0$d;

    .line 54
    .line 55
    const-string v2, "BOUNDED_WEEK_OF_MONTH"

    .line 56
    .line 57
    const/4 v3, 0x3

    .line 58
    invoke-direct {v1, p0, v2, v3}, Lnet/time4j/z0$d;-><init>(Lnet/time4j/z0;Ljava/lang/String;I)V

    .line 59
    .line 60
    .line 61
    iput-object v1, p0, Lnet/time4j/z0;->r:Lnet/time4j/c;

    .line 62
    .line 63
    new-instance v2, Lnet/time4j/z0$f;

    .line 64
    .line 65
    invoke-direct {v2, p0}, Lnet/time4j/z0$f;-><init>(Lnet/time4j/z0;)V

    .line 66
    .line 67
    .line 68
    iput-object v2, p0, Lnet/time4j/z0;->s:Lnet/time4j/c0;

    .line 69
    .line 70
    new-instance v3, Lnet/time4j/z0$a;

    .line 71
    .line 72
    invoke-direct {v3, p0, p3, p4}, Lnet/time4j/z0$a;-><init>(Lnet/time4j/z0;Lnet/time4j/x0;Lnet/time4j/x0;)V

    .line 73
    .line 74
    .line 75
    iput-object v3, p0, Lnet/time4j/z0;->u:Lfj/n;

    .line 76
    .line 77
    new-instance p3, Ljava/util/HashSet;

    .line 78
    .line 79
    invoke-direct {p3}, Ljava/util/HashSet;-><init>()V

    .line 80
    .line 81
    .line 82
    invoke-interface {p3, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 83
    .line 84
    .line 85
    invoke-interface {p3, p2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 86
    .line 87
    .line 88
    invoke-interface {p3, v2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 89
    .line 90
    .line 91
    invoke-interface {p3, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 92
    .line 93
    .line 94
    invoke-interface {p3, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 95
    .line 96
    .line 97
    invoke-static {p3}, Ljava/util/Collections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    .line 98
    .line 99
    .line 100
    move-result-object p1

    .line 101
    iput-object p1, p0, Lnet/time4j/z0;->t:Ljava/util/Set;

    .line 102
    .line 103
    return-void

    .line 104
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    .line 105
    .line 106
    const-string p2, "Missing end of weekend."

    .line 107
    .line 108
    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 109
    .line 110
    .line 111
    throw p1

    .line 112
    :cond_1
    new-instance p1, Ljava/lang/NullPointerException;

    .line 113
    .line 114
    const-string p2, "Missing start of weekend."

    .line 115
    .line 116
    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 117
    .line 118
    .line 119
    throw p1

    .line 120
    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 121
    .line 122
    new-instance p3, Ljava/lang/StringBuilder;

    .line 123
    .line 124
    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    .line 125
    .line 126
    .line 127
    const-string p4, "Minimal days in first week out of range: "

    .line 128
    .line 129
    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 130
    .line 131
    .line 132
    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 133
    .line 134
    .line 135
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 136
    .line 137
    .line 138
    move-result-object p2

    .line 139
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 140
    .line 141
    .line 142
    throw p1

    .line 143
    :cond_3
    new-instance p1, Ljava/lang/NullPointerException;

    .line 144
    .line 145
    const-string p2, "Missing first day of week."

    .line 146
    .line 147
    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 148
    .line 149
    .line 150
    throw p1
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

.method static c(J)Lnet/time4j/x0;
    .locals 2

    const-wide/16 v0, 0x5

    add-long/2addr p0, v0

    const/4 v0, 0x7

    invoke-static {p0, p1, v0}, Lnet/time4j/base/c;->d(JI)I

    move-result p0

    add-int/lit8 p0, p0, 0x1

    invoke-static {p0}, Lnet/time4j/x0;->h(I)Lnet/time4j/x0;

    move-result-object p0

    return-object p0
.end method

.method public static j(Ljava/util/Locale;)Lnet/time4j/z0;
    .locals 6

    .line 1
    invoke-virtual {p0}, Ljava/util/Locale;->getCountry()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    sget-object p0, Lnet/time4j/z0;->w:Lnet/time4j/z0;

    .line 12
    .line 13
    return-object p0

    .line 14
    :cond_0
    sget-object v0, Lnet/time4j/z0;->v:Ljava/util/Map;

    .line 15
    .line 16
    invoke-interface {v0, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    check-cast v1, Lnet/time4j/z0;

    .line 21
    .line 22
    if-eqz v1, :cond_1

    .line 23
    .line 24
    return-object v1

    .line 25
    :cond_1
    sget-object v1, Lnet/time4j/z0;->x:Lgj/y;

    .line 26
    .line 27
    if-nez v1, :cond_3

    .line 28
    .line 29
    new-instance v0, Ljava/util/GregorianCalendar;

    .line 30
    .line 31
    invoke-direct {v0, p0}, Ljava/util/GregorianCalendar;-><init>(Ljava/util/Locale;)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {v0}, Ljava/util/Calendar;->getFirstDayOfWeek()I

    .line 35
    .line 36
    .line 37
    move-result p0

    .line 38
    const/4 v1, 0x1

    .line 39
    if-ne p0, v1, :cond_2

    .line 40
    .line 41
    const/4 p0, 0x7

    .line 42
    goto :goto_0

    .line 43
    :cond_2
    sub-int/2addr p0, v1

    .line 44
    :goto_0
    invoke-static {p0}, Lnet/time4j/x0;->h(I)Lnet/time4j/x0;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    invoke-virtual {v0}, Ljava/util/Calendar;->getMinimalDaysInFirstWeek()I

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    invoke-static {p0, v0}, Lnet/time4j/z0;->k(Lnet/time4j/x0;I)Lnet/time4j/z0;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    return-object p0

    .line 57
    :cond_3
    new-instance v2, Lnet/time4j/z0;

    .line 58
    .line 59
    invoke-interface {v1, p0}, Lgj/y;->d(Ljava/util/Locale;)I

    .line 60
    .line 61
    .line 62
    move-result v3

    .line 63
    invoke-static {v3}, Lnet/time4j/x0;->h(I)Lnet/time4j/x0;

    .line 64
    .line 65
    .line 66
    move-result-object v3

    .line 67
    invoke-interface {v1, p0}, Lgj/y;->b(Ljava/util/Locale;)I

    .line 68
    .line 69
    .line 70
    move-result v4

    .line 71
    invoke-interface {v1, p0}, Lgj/y;->c(Ljava/util/Locale;)I

    .line 72
    .line 73
    .line 74
    move-result v5

    .line 75
    invoke-static {v5}, Lnet/time4j/x0;->h(I)Lnet/time4j/x0;

    .line 76
    .line 77
    .line 78
    move-result-object v5

    .line 79
    invoke-interface {v1, p0}, Lgj/y;->a(Ljava/util/Locale;)I

    .line 80
    .line 81
    .line 82
    move-result v1

    .line 83
    invoke-static {v1}, Lnet/time4j/x0;->h(I)Lnet/time4j/x0;

    .line 84
    .line 85
    .line 86
    move-result-object v1

    .line 87
    invoke-direct {v2, v3, v4, v5, v1}, Lnet/time4j/z0;-><init>(Lnet/time4j/x0;ILnet/time4j/x0;Lnet/time4j/x0;)V

    .line 88
    .line 89
    .line 90
    invoke-interface {v0}, Ljava/util/Map;->size()I

    .line 91
    .line 92
    .line 93
    move-result v1

    .line 94
    const/16 v3, 0x96

    .line 95
    .line 96
    if-le v1, v3, :cond_4

    .line 97
    .line 98
    invoke-interface {v0}, Ljava/util/Map;->clear()V

    .line 99
    .line 100
    .line 101
    :cond_4
    invoke-interface {v0, p0, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    return-object v2
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

.method public static k(Lnet/time4j/x0;I)Lnet/time4j/z0;
    .locals 2

    sget-object v0, Lnet/time4j/x0;->p:Lnet/time4j/x0;

    sget-object v1, Lnet/time4j/x0;->q:Lnet/time4j/x0;

    invoke-static {p0, p1, v0, v1}, Lnet/time4j/z0;->l(Lnet/time4j/x0;ILnet/time4j/x0;Lnet/time4j/x0;)Lnet/time4j/z0;

    move-result-object p0

    return-object p0
.end method

.method public static l(Lnet/time4j/x0;ILnet/time4j/x0;Lnet/time4j/x0;)Lnet/time4j/z0;
    .locals 1

    .line 1
    sget-object v0, Lnet/time4j/x0;->k:Lnet/time4j/x0;

    .line 2
    .line 3
    if-ne p0, v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x4

    .line 6
    if-ne p1, v0, :cond_0

    .line 7
    .line 8
    sget-object v0, Lnet/time4j/x0;->p:Lnet/time4j/x0;

    .line 9
    .line 10
    if-ne p2, v0, :cond_0

    .line 11
    .line 12
    sget-object v0, Lnet/time4j/x0;->q:Lnet/time4j/x0;

    .line 13
    .line 14
    if-ne p3, v0, :cond_0

    .line 15
    .line 16
    sget-object p0, Lnet/time4j/z0;->w:Lnet/time4j/z0;

    .line 17
    .line 18
    return-object p0

    .line 19
    :cond_0
    new-instance v0, Lnet/time4j/z0;

    .line 20
    .line 21
    invoke-direct {v0, p0, p1, p2, p3}, Lnet/time4j/z0;-><init>(Lnet/time4j/x0;ILnet/time4j/x0;Lnet/time4j/x0;)V

    .line 22
    .line 23
    .line 24
    return-object v0
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

.method private readObject(Ljava/io/ObjectInputStream;)V
    .locals 1

    new-instance p1, Ljava/io/InvalidObjectException;

    const-string v0, "Serialization proxy required."

    invoke-direct {p1, v0}, Ljava/io/InvalidObjectException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private writeReplace()Ljava/lang/Object;
    .locals 2

    new-instance v0, Lnet/time4j/SPX;

    const/4 v1, 0x3

    invoke-direct {v0, p0, v1}, Lnet/time4j/SPX;-><init>(Ljava/lang/Object;I)V

    return-object v0
.end method


# virtual methods
.method public a()Lnet/time4j/c;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lnet/time4j/c<",
            "Ljava/lang/Integer;",
            "Lnet/time4j/f0;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lnet/time4j/z0;->r:Lnet/time4j/c;

    return-object v0
.end method

.method public b()Lnet/time4j/c;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lnet/time4j/c<",
            "Ljava/lang/Integer;",
            "Lnet/time4j/f0;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lnet/time4j/z0;->q:Lnet/time4j/c;

    return-object v0
.end method

.method d()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Lfj/p<",
            "*>;>;"
        }
    .end annotation

    iget-object v0, p0, Lnet/time4j/z0;->t:Ljava/util/Set;

    return-object v0
.end method

.method public e()Lnet/time4j/x0;
    .locals 1

    iget-object v0, p0, Lnet/time4j/z0;->n:Lnet/time4j/x0;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, Lnet/time4j/z0;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-eqz v1, :cond_2

    .line 9
    .line 10
    check-cast p1, Lnet/time4j/z0;

    .line 11
    .line 12
    iget-object v1, p0, Lnet/time4j/z0;->k:Lnet/time4j/x0;

    .line 13
    .line 14
    iget-object v3, p1, Lnet/time4j/z0;->k:Lnet/time4j/x0;

    .line 15
    .line 16
    if-ne v1, v3, :cond_1

    .line 17
    .line 18
    iget v1, p0, Lnet/time4j/z0;->l:I

    .line 19
    .line 20
    iget v3, p1, Lnet/time4j/z0;->l:I

    .line 21
    .line 22
    if-ne v1, v3, :cond_1

    .line 23
    .line 24
    iget-object v1, p0, Lnet/time4j/z0;->m:Lnet/time4j/x0;

    .line 25
    .line 26
    iget-object v3, p1, Lnet/time4j/z0;->m:Lnet/time4j/x0;

    .line 27
    .line 28
    if-ne v1, v3, :cond_1

    .line 29
    .line 30
    iget-object v1, p0, Lnet/time4j/z0;->n:Lnet/time4j/x0;

    .line 31
    .line 32
    iget-object p1, p1, Lnet/time4j/z0;->n:Lnet/time4j/x0;

    .line 33
    .line 34
    if-ne v1, p1, :cond_1

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_1
    move v0, v2

    .line 38
    :goto_0
    return v0

    .line 39
    :cond_2
    return v2
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

.method public f()Lnet/time4j/x0;
    .locals 1

    iget-object v0, p0, Lnet/time4j/z0;->k:Lnet/time4j/x0;

    return-object v0
.end method

.method public g()I
    .locals 1

    iget v0, p0, Lnet/time4j/z0;->l:I

    return v0
.end method

.method public h()Lnet/time4j/x0;
    .locals 1

    iget-object v0, p0, Lnet/time4j/z0;->m:Lnet/time4j/x0;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    .line 1
    iget-object v0, p0, Lnet/time4j/z0;->k:Lnet/time4j/x0;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    mul-int/lit8 v0, v0, 0x11

    .line 12
    .line 13
    iget v1, p0, Lnet/time4j/z0;->l:I

    .line 14
    .line 15
    mul-int/lit8 v1, v1, 0x25

    .line 16
    .line 17
    add-int/2addr v0, v1

    .line 18
    return v0
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method

.method public i()Lnet/time4j/c0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lnet/time4j/c0<",
            "Lnet/time4j/x0;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lnet/time4j/z0;->s:Lnet/time4j/c0;

    return-object v0
.end method

.method public m()Lnet/time4j/c;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lnet/time4j/c<",
            "Ljava/lang/Integer;",
            "Lnet/time4j/f0;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lnet/time4j/z0;->p:Lnet/time4j/c;

    return-object v0
.end method

.method public n()Lnet/time4j/c;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lnet/time4j/c<",
            "Ljava/lang/Integer;",
            "Lnet/time4j/f0;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lnet/time4j/z0;->o:Lnet/time4j/c;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const/16 v1, 0x40

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 6
    .line 7
    .line 8
    const-class v1, Lnet/time4j/z0;

    .line 9
    .line 10
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    const-string v1, "[firstDayOfWeek="

    .line 18
    .line 19
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    iget-object v1, p0, Lnet/time4j/z0;->k:Lnet/time4j/x0;

    .line 23
    .line 24
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    const-string v1, ",minimalDaysInFirstWeek="

    .line 28
    .line 29
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    iget v1, p0, Lnet/time4j/z0;->l:I

    .line 33
    .line 34
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    const-string v1, ",startOfWeekend="

    .line 38
    .line 39
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    iget-object v1, p0, Lnet/time4j/z0;->m:Lnet/time4j/x0;

    .line 43
    .line 44
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    const-string v1, ",endOfWeekend="

    .line 48
    .line 49
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    iget-object v1, p0, Lnet/time4j/z0;->n:Lnet/time4j/x0;

    .line 53
    .line 54
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    const/16 v1, 0x5d

    .line 58
    .line 59
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    return-object v0
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
