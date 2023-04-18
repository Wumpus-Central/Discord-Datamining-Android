.class Lhj/v;
.super Lhj/t;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lhj/v$c;,
        Lhj/v$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lhj/t<",
        "Lhj/v;",
        ">;"
    }
.end annotation


# static fields
.field private static final u:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Lfj/p<",
            "*>;>;"
        }
    .end annotation
.end field


# instance fields
.field private k:[Ljava/lang/Object;

.field private l:[Ljava/lang/Object;

.field private m:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lfj/p<",
            "*>;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private n:[I

.field private o:I

.field private p:I

.field private q:I

.field private r:I

.field private s:Z

.field private t:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Ljava/util/HashSet;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 4
    .line 5
    .line 6
    sget-object v1, Lnet/time4j/f0;->z:Lnet/time4j/c;

    .line 7
    .line 8
    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    sget-object v1, Lnet/time4j/f0;->D:Lnet/time4j/k0;

    .line 12
    .line 13
    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    sget-object v1, Lnet/time4j/f0;->E:Lnet/time4j/k0;

    .line 17
    .line 18
    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    sget-object v1, Lnet/time4j/g0;->E:Lnet/time4j/k0;

    .line 22
    .line 23
    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    sget-object v1, Lnet/time4j/g0;->G:Lnet/time4j/k0;

    .line 27
    .line 28
    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    sget-object v1, Lnet/time4j/g0;->I:Lnet/time4j/k0;

    .line 32
    .line 33
    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    sget-object v1, Lnet/time4j/g0;->M:Lnet/time4j/k0;

    .line 37
    .line 38
    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    sput-object v0, Lhj/v;->u:Ljava/util/Set;

    .line 46
    .line 47
    return-void
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
.end method

.method constructor <init>(IZ)V
    .locals 3

    .line 1
    invoke-direct {p0}, Lhj/t;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, Lhj/v;->s:Z

    .line 6
    .line 7
    const/4 v1, -0x1

    .line 8
    iput v1, p0, Lhj/v;->t:I

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    if-eqz p2, :cond_0

    .line 12
    .line 13
    const/high16 p1, -0x80000000

    .line 14
    .line 15
    iput p1, p0, Lhj/v;->o:I

    .line 16
    .line 17
    iput p1, p0, Lhj/v;->p:I

    .line 18
    .line 19
    iput p1, p0, Lhj/v;->q:I

    .line 20
    .line 21
    iput p1, p0, Lhj/v;->r:I

    .line 22
    .line 23
    iput-object v1, p0, Lhj/v;->k:[Ljava/lang/Object;

    .line 24
    .line 25
    iput-object v1, p0, Lhj/v;->l:[Ljava/lang/Object;

    .line 26
    .line 27
    const/4 p2, 0x3

    .line 28
    new-array v2, p2, [I

    .line 29
    .line 30
    iput-object v2, p0, Lhj/v;->n:[I

    .line 31
    .line 32
    :goto_0
    if-ge v0, p2, :cond_1

    .line 33
    .line 34
    iget-object v2, p0, Lhj/v;->n:[I

    .line 35
    .line 36
    aput p1, v2, v0

    .line 37
    .line 38
    add-int/lit8 v0, v0, 0x1

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_0
    invoke-static {p1}, Lhj/v;->S(I)I

    .line 42
    .line 43
    .line 44
    move-result p1

    .line 45
    iput p1, p0, Lhj/v;->o:I

    .line 46
    .line 47
    add-int/lit8 p2, p1, -0x1

    .line 48
    .line 49
    iput p2, p0, Lhj/v;->p:I

    .line 50
    .line 51
    invoke-static {p1}, Lhj/v;->X(I)I

    .line 52
    .line 53
    .line 54
    move-result p1

    .line 55
    iput p1, p0, Lhj/v;->q:I

    .line 56
    .line 57
    iget p1, p0, Lhj/v;->o:I

    .line 58
    .line 59
    new-array p2, p1, [Ljava/lang/Object;

    .line 60
    .line 61
    iput-object p2, p0, Lhj/v;->k:[Ljava/lang/Object;

    .line 62
    .line 63
    iput-object v1, p0, Lhj/v;->l:[Ljava/lang/Object;

    .line 64
    .line 65
    new-array p1, p1, [I

    .line 66
    .line 67
    iput-object p1, p0, Lhj/v;->n:[I

    .line 68
    .line 69
    iput v0, p0, Lhj/v;->r:I

    .line 70
    .line 71
    :cond_1
    iput-object v1, p0, Lhj/v;->m:Ljava/util/Map;

    .line 72
    .line 73
    return-void
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
.end method

.method static synthetic O(Lhj/v;)I
    .locals 0

    iget p0, p0, Lhj/v;->o:I

    return p0
.end method

.method static synthetic Q(Lhj/v;)I
    .locals 0

    iget p0, p0, Lhj/v;->r:I

    return p0
.end method

.method static synthetic R(Lhj/v;)[Ljava/lang/Object;
    .locals 0

    iget-object p0, p0, Lhj/v;->k:[Ljava/lang/Object;

    return-object p0
.end method

.method private static S(I)I
    .locals 2

    int-to-float p0, p0

    const/high16 v0, 0x3f400000    # 0.75f

    div-float/2addr p0, v0

    float-to-double v0, p0

    invoke-static {v0, v1}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v0

    double-to-int p0, v0

    invoke-static {p0}, Lhj/v;->Z(I)I

    move-result p0

    const/4 v0, 0x2

    invoke-static {v0, p0}, Ljava/lang/Math;->max(II)I

    move-result p0

    return p0
.end method

.method private static T(I)Lfj/p;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Lfj/p<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    .line 1
    packed-switch p0, :pswitch_data_0

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 5
    .line 6
    new-instance v1, Ljava/lang/StringBuilder;

    .line 7
    .line 8
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 9
    .line 10
    .line 11
    const-string v2, "No element index: "

    .line 12
    .line 13
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    invoke-direct {v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    throw v0

    .line 27
    :pswitch_0
    sget-object p0, Lnet/time4j/g0;->M:Lnet/time4j/k0;

    .line 28
    .line 29
    return-object p0

    .line 30
    :pswitch_1
    sget-object p0, Lnet/time4j/g0;->I:Lnet/time4j/k0;

    .line 31
    .line 32
    return-object p0

    .line 33
    :pswitch_2
    sget-object p0, Lnet/time4j/g0;->G:Lnet/time4j/k0;

    .line 34
    .line 35
    return-object p0

    .line 36
    :pswitch_3
    sget-object p0, Lnet/time4j/g0;->E:Lnet/time4j/k0;

    .line 37
    .line 38
    return-object p0

    .line 39
    :pswitch_4
    sget-object p0, Lnet/time4j/f0;->E:Lnet/time4j/k0;

    .line 40
    .line 41
    return-object p0

    .line 42
    :pswitch_5
    sget-object p0, Lnet/time4j/f0;->D:Lnet/time4j/k0;

    .line 43
    .line 44
    return-object p0

    .line 45
    :pswitch_6
    sget-object p0, Lnet/time4j/f0;->z:Lnet/time4j/c;

    .line 46
    .line 47
    return-object p0

    .line 48
    nop

    .line 49
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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

.method private U(Lfj/p;)I
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lfj/p<",
            "*>;)I"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lhj/v;->k:[Ljava/lang/Object;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const/high16 v2, -0x80000000

    .line 5
    .line 6
    if-nez v0, :cond_8

    .line 7
    .line 8
    sget-object v0, Lnet/time4j/f0;->z:Lnet/time4j/c;

    .line 9
    .line 10
    if-ne p1, v0, :cond_0

    .line 11
    .line 12
    iget-object p1, p0, Lhj/v;->n:[I

    .line 13
    .line 14
    const/4 v0, 0x0

    .line 15
    aget p1, p1, v0

    .line 16
    .line 17
    return p1

    .line 18
    :cond_0
    sget-object v0, Lnet/time4j/f0;->D:Lnet/time4j/k0;

    .line 19
    .line 20
    if-ne p1, v0, :cond_1

    .line 21
    .line 22
    iget-object p1, p0, Lhj/v;->n:[I

    .line 23
    .line 24
    aget p1, p1, v1

    .line 25
    .line 26
    return p1

    .line 27
    :cond_1
    sget-object v0, Lnet/time4j/f0;->E:Lnet/time4j/k0;

    .line 28
    .line 29
    if-ne p1, v0, :cond_2

    .line 30
    .line 31
    iget-object p1, p0, Lhj/v;->n:[I

    .line 32
    .line 33
    const/4 v0, 0x2

    .line 34
    aget p1, p1, v0

    .line 35
    .line 36
    return p1

    .line 37
    :cond_2
    sget-object v0, Lnet/time4j/g0;->E:Lnet/time4j/k0;

    .line 38
    .line 39
    if-ne p1, v0, :cond_3

    .line 40
    .line 41
    iget p1, p0, Lhj/v;->o:I

    .line 42
    .line 43
    return p1

    .line 44
    :cond_3
    sget-object v0, Lnet/time4j/g0;->G:Lnet/time4j/k0;

    .line 45
    .line 46
    if-ne p1, v0, :cond_4

    .line 47
    .line 48
    iget p1, p0, Lhj/v;->p:I

    .line 49
    .line 50
    return p1

    .line 51
    :cond_4
    sget-object v0, Lnet/time4j/g0;->I:Lnet/time4j/k0;

    .line 52
    .line 53
    if-ne p1, v0, :cond_5

    .line 54
    .line 55
    iget p1, p0, Lhj/v;->q:I

    .line 56
    .line 57
    return p1

    .line 58
    :cond_5
    sget-object v0, Lnet/time4j/g0;->M:Lnet/time4j/k0;

    .line 59
    .line 60
    if-ne p1, v0, :cond_6

    .line 61
    .line 62
    iget p1, p0, Lhj/v;->r:I

    .line 63
    .line 64
    return p1

    .line 65
    :cond_6
    iget-object v0, p0, Lhj/v;->m:Ljava/util/Map;

    .line 66
    .line 67
    if-eqz v0, :cond_7

    .line 68
    .line 69
    invoke-interface {v0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 70
    .line 71
    .line 72
    move-result v1

    .line 73
    if-eqz v1, :cond_7

    .line 74
    .line 75
    const-class v1, Ljava/lang/Integer;

    .line 76
    .line 77
    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object p1

    .line 81
    invoke-virtual {v1, p1}, Ljava/lang/Class;->cast(Ljava/lang/Object;)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object p1

    .line 85
    check-cast p1, Ljava/lang/Integer;

    .line 86
    .line 87
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 88
    .line 89
    .line 90
    move-result p1

    .line 91
    return p1

    .line 92
    :cond_7
    return v2

    .line 93
    :cond_8
    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    .line 94
    .line 95
    .line 96
    move-result v3

    .line 97
    invoke-static {v3}, Lhj/v;->Y(I)I

    .line 98
    .line 99
    .line 100
    move-result v3

    .line 101
    iget v4, p0, Lhj/v;->p:I

    .line 102
    .line 103
    and-int/2addr v3, v4

    .line 104
    aget-object v4, v0, v3

    .line 105
    .line 106
    if-nez v4, :cond_9

    .line 107
    .line 108
    return v2

    .line 109
    :cond_9
    invoke-virtual {p1, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 110
    .line 111
    .line 112
    move-result v4

    .line 113
    if-eqz v4, :cond_a

    .line 114
    .line 115
    iget-object p1, p0, Lhj/v;->n:[I

    .line 116
    .line 117
    aget p1, p1, v3

    .line 118
    .line 119
    return p1

    .line 120
    :cond_a
    add-int/2addr v3, v1

    .line 121
    iget v4, p0, Lhj/v;->p:I

    .line 122
    .line 123
    and-int/2addr v3, v4

    .line 124
    aget-object v4, v0, v3

    .line 125
    .line 126
    if-nez v4, :cond_b

    .line 127
    .line 128
    return v2

    .line 129
    :cond_b
    invoke-virtual {p1, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 130
    .line 131
    .line 132
    move-result v4

    .line 133
    if-eqz v4, :cond_a

    .line 134
    .line 135
    iget-object p1, p0, Lhj/v;->n:[I

    .line 136
    .line 137
    aget p1, p1, v3

    .line 138
    .line 139
    return p1
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

.method static W(Lfj/p;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lfj/p<",
            "*>;)Z"
        }
    .end annotation

    sget-object v0, Lhj/v;->u:Ljava/util/Set;

    invoke-interface {v0, p0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method private static X(I)I
    .locals 2

    int-to-float v0, p0

    const/high16 v1, 0x3f400000    # 0.75f

    mul-float/2addr v0, v1

    float-to-double v0, v0

    invoke-static {v0, v1}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v0

    double-to-int v0, v0

    add-int/lit8 p0, p0, -0x1

    invoke-static {v0, p0}, Ljava/lang/Math;->min(II)I

    move-result p0

    return p0
.end method

.method private static Y(I)I
    .locals 1

    const v0, -0x61c88647

    mul-int/2addr p0, v0

    ushr-int/lit8 v0, p0, 0x10

    xor-int/2addr p0, v0

    return p0
.end method

.method private static Z(I)I
    .locals 2

    const/4 v0, 0x1

    if-nez p0, :cond_0

    return v0

    :cond_0
    add-int/lit8 p0, p0, -0x1

    shr-int/lit8 v1, p0, 0x1

    or-int/2addr p0, v1

    shr-int/lit8 v1, p0, 0x2

    or-int/2addr p0, v1

    shr-int/lit8 v1, p0, 0x4

    or-int/2addr p0, v1

    shr-int/lit8 v1, p0, 0x8

    or-int/2addr p0, v1

    shr-int/lit8 v1, p0, 0x10

    or-int/2addr p0, v1

    add-int/2addr p0, v0

    return p0
.end method

.method private b0(I)V
    .locals 12

    .line 1
    iget-object v0, p0, Lhj/v;->k:[Ljava/lang/Object;

    .line 2
    .line 3
    iget-object v1, p0, Lhj/v;->l:[Ljava/lang/Object;

    .line 4
    .line 5
    iget-object v2, p0, Lhj/v;->n:[I

    .line 6
    .line 7
    add-int/lit8 v3, p1, -0x1

    .line 8
    .line 9
    new-array v4, p1, [Ljava/lang/Object;

    .line 10
    .line 11
    if-nez v1, :cond_0

    .line 12
    .line 13
    const/4 v5, 0x0

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    new-array v5, p1, [Ljava/lang/Object;

    .line 16
    .line 17
    :goto_0
    new-array v6, p1, [I

    .line 18
    .line 19
    iget v7, p0, Lhj/v;->o:I

    .line 20
    .line 21
    iget v8, p0, Lhj/v;->r:I

    .line 22
    .line 23
    const/4 v9, 0x0

    .line 24
    :goto_1
    if-ge v9, v8, :cond_4

    .line 25
    .line 26
    :goto_2
    add-int/lit8 v7, v7, -0x1

    .line 27
    .line 28
    aget-object v10, v0, v7

    .line 29
    .line 30
    if-nez v10, :cond_1

    .line 31
    .line 32
    goto :goto_2

    .line 33
    :cond_1
    invoke-virtual {v10}, Ljava/lang/Object;->hashCode()I

    .line 34
    .line 35
    .line 36
    move-result v10

    .line 37
    invoke-static {v10}, Lhj/v;->Y(I)I

    .line 38
    .line 39
    .line 40
    move-result v10

    .line 41
    and-int/2addr v10, v3

    .line 42
    aget-object v11, v4, v10

    .line 43
    .line 44
    if-eqz v11, :cond_2

    .line 45
    .line 46
    :goto_3
    add-int/lit8 v10, v10, 0x1

    .line 47
    .line 48
    and-int/2addr v10, v3

    .line 49
    aget-object v11, v4, v10

    .line 50
    .line 51
    if-eqz v11, :cond_2

    .line 52
    .line 53
    goto :goto_3

    .line 54
    :cond_2
    aget-object v11, v0, v7

    .line 55
    .line 56
    aput-object v11, v4, v10

    .line 57
    .line 58
    if-eqz v1, :cond_3

    .line 59
    .line 60
    aget-object v11, v1, v7

    .line 61
    .line 62
    aput-object v11, v5, v10

    .line 63
    .line 64
    :cond_3
    aget v11, v2, v7

    .line 65
    .line 66
    aput v11, v6, v10

    .line 67
    .line 68
    add-int/lit8 v9, v9, 0x1

    .line 69
    .line 70
    goto :goto_1

    .line 71
    :cond_4
    iput p1, p0, Lhj/v;->o:I

    .line 72
    .line 73
    iput v3, p0, Lhj/v;->p:I

    .line 74
    .line 75
    invoke-static {p1}, Lhj/v;->X(I)I

    .line 76
    .line 77
    .line 78
    move-result p1

    .line 79
    iput p1, p0, Lhj/v;->q:I

    .line 80
    .line 81
    iput-object v4, p0, Lhj/v;->k:[Ljava/lang/Object;

    .line 82
    .line 83
    iput-object v5, p0, Lhj/v;->l:[Ljava/lang/Object;

    .line 84
    .line 85
    iput-object v6, p0, Lhj/v;->n:[I

    .line 86
    .line 87
    return-void
    .line 88
    .line 89
    .line 90
.end method

.method private c0(Ljava/lang/Object;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lhj/v;->k:[Ljava/lang/Object;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-nez v0, :cond_8

    .line 5
    .line 6
    sget-object v0, Lnet/time4j/f0;->z:Lnet/time4j/c;

    .line 7
    .line 8
    const/high16 v2, -0x80000000

    .line 9
    .line 10
    if-ne p1, v0, :cond_0

    .line 11
    .line 12
    iget-object p1, p0, Lhj/v;->n:[I

    .line 13
    .line 14
    const/4 v0, 0x0

    .line 15
    aput v2, p1, v0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    sget-object v0, Lnet/time4j/f0;->D:Lnet/time4j/k0;

    .line 19
    .line 20
    if-ne p1, v0, :cond_1

    .line 21
    .line 22
    iget-object p1, p0, Lhj/v;->n:[I

    .line 23
    .line 24
    aput v2, p1, v1

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_1
    sget-object v0, Lnet/time4j/f0;->E:Lnet/time4j/k0;

    .line 28
    .line 29
    if-ne p1, v0, :cond_2

    .line 30
    .line 31
    iget-object p1, p0, Lhj/v;->n:[I

    .line 32
    .line 33
    const/4 v0, 0x2

    .line 34
    aput v2, p1, v0

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_2
    sget-object v0, Lnet/time4j/g0;->E:Lnet/time4j/k0;

    .line 38
    .line 39
    if-ne p1, v0, :cond_3

    .line 40
    .line 41
    iput v2, p0, Lhj/v;->o:I

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_3
    sget-object v0, Lnet/time4j/g0;->G:Lnet/time4j/k0;

    .line 45
    .line 46
    if-ne p1, v0, :cond_4

    .line 47
    .line 48
    iput v2, p0, Lhj/v;->p:I

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_4
    sget-object v0, Lnet/time4j/g0;->I:Lnet/time4j/k0;

    .line 52
    .line 53
    if-ne p1, v0, :cond_5

    .line 54
    .line 55
    iput v2, p0, Lhj/v;->q:I

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_5
    sget-object v0, Lnet/time4j/g0;->M:Lnet/time4j/k0;

    .line 59
    .line 60
    if-ne p1, v0, :cond_6

    .line 61
    .line 62
    iput v2, p0, Lhj/v;->r:I

    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_6
    iget-object v0, p0, Lhj/v;->m:Ljava/util/Map;

    .line 66
    .line 67
    if-eqz v0, :cond_7

    .line 68
    .line 69
    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    :cond_7
    :goto_0
    return-void

    .line 73
    :cond_8
    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    .line 74
    .line 75
    .line 76
    move-result v2

    .line 77
    invoke-static {v2}, Lhj/v;->Y(I)I

    .line 78
    .line 79
    .line 80
    move-result v2

    .line 81
    iget v3, p0, Lhj/v;->p:I

    .line 82
    .line 83
    and-int/2addr v2, v3

    .line 84
    aget-object v3, v0, v2

    .line 85
    .line 86
    if-nez v3, :cond_9

    .line 87
    .line 88
    return-void

    .line 89
    :cond_9
    invoke-virtual {p1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 90
    .line 91
    .line 92
    move-result v3

    .line 93
    if-eqz v3, :cond_a

    .line 94
    .line 95
    invoke-direct {p0, v2}, Lhj/v;->d0(I)V

    .line 96
    .line 97
    .line 98
    return-void

    .line 99
    :cond_a
    add-int/2addr v2, v1

    .line 100
    iget v3, p0, Lhj/v;->p:I

    .line 101
    .line 102
    and-int/2addr v2, v3

    .line 103
    aget-object v3, v0, v2

    .line 104
    .line 105
    if-nez v3, :cond_b

    .line 106
    .line 107
    return-void

    .line 108
    :cond_b
    invoke-virtual {p1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 109
    .line 110
    .line 111
    move-result v3

    .line 112
    if-eqz v3, :cond_a

    .line 113
    .line 114
    invoke-direct {p0, v2}, Lhj/v;->d0(I)V

    .line 115
    .line 116
    .line 117
    return-void
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

.method private d0(I)V
    .locals 5

    .line 1
    iget v0, p0, Lhj/v;->r:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, -0x1

    .line 4
    .line 5
    iput v0, p0, Lhj/v;->r:I

    .line 6
    .line 7
    iget-object v0, p0, Lhj/v;->k:[Ljava/lang/Object;

    .line 8
    .line 9
    :goto_0
    add-int/lit8 v1, p1, 0x1

    .line 10
    .line 11
    iget v2, p0, Lhj/v;->p:I

    .line 12
    .line 13
    and-int/2addr v1, v2

    .line 14
    :goto_1
    aget-object v2, v0, v1

    .line 15
    .line 16
    if-nez v2, :cond_0

    .line 17
    .line 18
    const/4 v1, 0x0

    .line 19
    aput-object v1, v0, p1

    .line 20
    .line 21
    return-void

    .line 22
    :cond_0
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 23
    .line 24
    .line 25
    move-result v3

    .line 26
    invoke-static {v3}, Lhj/v;->Y(I)I

    .line 27
    .line 28
    .line 29
    move-result v3

    .line 30
    iget v4, p0, Lhj/v;->p:I

    .line 31
    .line 32
    and-int/2addr v3, v4

    .line 33
    if-gt p1, v1, :cond_1

    .line 34
    .line 35
    if-ge p1, v3, :cond_2

    .line 36
    .line 37
    if-le v3, v1, :cond_4

    .line 38
    .line 39
    goto :goto_2

    .line 40
    :cond_1
    if-lt p1, v3, :cond_4

    .line 41
    .line 42
    if-le v3, v1, :cond_4

    .line 43
    .line 44
    :cond_2
    :goto_2
    aput-object v2, v0, p1

    .line 45
    .line 46
    iget-object v2, p0, Lhj/v;->l:[Ljava/lang/Object;

    .line 47
    .line 48
    if-eqz v2, :cond_3

    .line 49
    .line 50
    aget-object v3, v2, v1

    .line 51
    .line 52
    aput-object v3, v2, p1

    .line 53
    .line 54
    :cond_3
    iget-object v2, p0, Lhj/v;->n:[I

    .line 55
    .line 56
    aget v3, v2, v1

    .line 57
    .line 58
    aput v3, v2, p1

    .line 59
    .line 60
    move p1, v1

    .line 61
    goto :goto_0

    .line 62
    :cond_4
    add-int/lit8 v1, v1, 0x1

    .line 63
    .line 64
    and-int/2addr v1, v4

    .line 65
    goto :goto_1
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


# virtual methods
.method G()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/lang/Object;",
            ">()TE;"
        }
    .end annotation

    const/4 v0, 0x0

    return-object v0
.end method

.method H(Lfj/p;I)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lfj/p<",
            "*>;I)V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lhj/v;->k:[Ljava/lang/Object;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-nez v0, :cond_18

    .line 5
    .line 6
    sget-object v0, Lnet/time4j/f0;->z:Lnet/time4j/c;

    .line 7
    .line 8
    const/high16 v2, -0x80000000

    .line 9
    .line 10
    if-ne p1, v0, :cond_2

    .line 11
    .line 12
    iget-boolean v0, p0, Lhj/v;->s:Z

    .line 13
    .line 14
    const/4 v1, 0x0

    .line 15
    if-nez v0, :cond_1

    .line 16
    .line 17
    iget-object v0, p0, Lhj/v;->n:[I

    .line 18
    .line 19
    aget v0, v0, v1

    .line 20
    .line 21
    if-eq v0, v2, :cond_1

    .line 22
    .line 23
    if-ne v0, p2, :cond_0

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    new-instance p2, Lhj/a;

    .line 27
    .line 28
    invoke-direct {p2, p1}, Lhj/a;-><init>(Lfj/p;)V

    .line 29
    .line 30
    .line 31
    throw p2

    .line 32
    :cond_1
    :goto_0
    iget-object p1, p0, Lhj/v;->n:[I

    .line 33
    .line 34
    aput p2, p1, v1

    .line 35
    .line 36
    goto/16 :goto_7

    .line 37
    .line 38
    :cond_2
    sget-object v0, Lnet/time4j/f0;->D:Lnet/time4j/k0;

    .line 39
    .line 40
    if-ne p1, v0, :cond_5

    .line 41
    .line 42
    iget-boolean v0, p0, Lhj/v;->s:Z

    .line 43
    .line 44
    if-nez v0, :cond_4

    .line 45
    .line 46
    iget-object v0, p0, Lhj/v;->n:[I

    .line 47
    .line 48
    aget v0, v0, v1

    .line 49
    .line 50
    if-eq v0, v2, :cond_4

    .line 51
    .line 52
    if-ne v0, p2, :cond_3

    .line 53
    .line 54
    goto :goto_1

    .line 55
    :cond_3
    new-instance p2, Lhj/a;

    .line 56
    .line 57
    invoke-direct {p2, p1}, Lhj/a;-><init>(Lfj/p;)V

    .line 58
    .line 59
    .line 60
    throw p2

    .line 61
    :cond_4
    :goto_1
    iget-object p1, p0, Lhj/v;->n:[I

    .line 62
    .line 63
    aput p2, p1, v1

    .line 64
    .line 65
    goto/16 :goto_7

    .line 66
    .line 67
    :cond_5
    sget-object v0, Lnet/time4j/f0;->E:Lnet/time4j/k0;

    .line 68
    .line 69
    if-ne p1, v0, :cond_8

    .line 70
    .line 71
    iget-boolean v0, p0, Lhj/v;->s:Z

    .line 72
    .line 73
    const/4 v1, 0x2

    .line 74
    if-nez v0, :cond_7

    .line 75
    .line 76
    iget-object v0, p0, Lhj/v;->n:[I

    .line 77
    .line 78
    aget v0, v0, v1

    .line 79
    .line 80
    if-eq v0, v2, :cond_7

    .line 81
    .line 82
    if-ne v0, p2, :cond_6

    .line 83
    .line 84
    goto :goto_2

    .line 85
    :cond_6
    new-instance p2, Lhj/a;

    .line 86
    .line 87
    invoke-direct {p2, p1}, Lhj/a;-><init>(Lfj/p;)V

    .line 88
    .line 89
    .line 90
    throw p2

    .line 91
    :cond_7
    :goto_2
    iget-object p1, p0, Lhj/v;->n:[I

    .line 92
    .line 93
    aput p2, p1, v1

    .line 94
    .line 95
    goto/16 :goto_7

    .line 96
    .line 97
    :cond_8
    sget-object v0, Lnet/time4j/g0;->E:Lnet/time4j/k0;

    .line 98
    .line 99
    if-ne p1, v0, :cond_b

    .line 100
    .line 101
    iget-boolean v0, p0, Lhj/v;->s:Z

    .line 102
    .line 103
    if-nez v0, :cond_a

    .line 104
    .line 105
    iget v0, p0, Lhj/v;->o:I

    .line 106
    .line 107
    if-eq v0, v2, :cond_a

    .line 108
    .line 109
    if-ne v0, p2, :cond_9

    .line 110
    .line 111
    goto :goto_3

    .line 112
    :cond_9
    new-instance p2, Lhj/a;

    .line 113
    .line 114
    invoke-direct {p2, p1}, Lhj/a;-><init>(Lfj/p;)V

    .line 115
    .line 116
    .line 117
    throw p2

    .line 118
    :cond_a
    :goto_3
    iput p2, p0, Lhj/v;->o:I

    .line 119
    .line 120
    goto :goto_7

    .line 121
    :cond_b
    sget-object v0, Lnet/time4j/g0;->G:Lnet/time4j/k0;

    .line 122
    .line 123
    if-ne p1, v0, :cond_e

    .line 124
    .line 125
    iget-boolean v0, p0, Lhj/v;->s:Z

    .line 126
    .line 127
    if-nez v0, :cond_d

    .line 128
    .line 129
    iget v0, p0, Lhj/v;->p:I

    .line 130
    .line 131
    if-eq v0, v2, :cond_d

    .line 132
    .line 133
    if-ne v0, p2, :cond_c

    .line 134
    .line 135
    goto :goto_4

    .line 136
    :cond_c
    new-instance p2, Lhj/a;

    .line 137
    .line 138
    invoke-direct {p2, p1}, Lhj/a;-><init>(Lfj/p;)V

    .line 139
    .line 140
    .line 141
    throw p2

    .line 142
    :cond_d
    :goto_4
    iput p2, p0, Lhj/v;->p:I

    .line 143
    .line 144
    goto :goto_7

    .line 145
    :cond_e
    sget-object v0, Lnet/time4j/g0;->I:Lnet/time4j/k0;

    .line 146
    .line 147
    if-ne p1, v0, :cond_11

    .line 148
    .line 149
    iget-boolean v0, p0, Lhj/v;->s:Z

    .line 150
    .line 151
    if-nez v0, :cond_10

    .line 152
    .line 153
    iget v0, p0, Lhj/v;->q:I

    .line 154
    .line 155
    if-eq v0, v2, :cond_10

    .line 156
    .line 157
    if-ne v0, p2, :cond_f

    .line 158
    .line 159
    goto :goto_5

    .line 160
    :cond_f
    new-instance p2, Lhj/a;

    .line 161
    .line 162
    invoke-direct {p2, p1}, Lhj/a;-><init>(Lfj/p;)V

    .line 163
    .line 164
    .line 165
    throw p2

    .line 166
    :cond_10
    :goto_5
    iput p2, p0, Lhj/v;->q:I

    .line 167
    .line 168
    goto :goto_7

    .line 169
    :cond_11
    sget-object v0, Lnet/time4j/g0;->M:Lnet/time4j/k0;

    .line 170
    .line 171
    if-ne p1, v0, :cond_14

    .line 172
    .line 173
    iget-boolean v0, p0, Lhj/v;->s:Z

    .line 174
    .line 175
    if-nez v0, :cond_13

    .line 176
    .line 177
    iget v0, p0, Lhj/v;->r:I

    .line 178
    .line 179
    if-eq v0, v2, :cond_13

    .line 180
    .line 181
    if-ne v0, p2, :cond_12

    .line 182
    .line 183
    goto :goto_6

    .line 184
    :cond_12
    new-instance p2, Lhj/a;

    .line 185
    .line 186
    invoke-direct {p2, p1}, Lhj/a;-><init>(Lfj/p;)V

    .line 187
    .line 188
    .line 189
    throw p2

    .line 190
    :cond_13
    :goto_6
    iput p2, p0, Lhj/v;->r:I

    .line 191
    .line 192
    :goto_7
    return-void

    .line 193
    :cond_14
    iget-object v0, p0, Lhj/v;->m:Ljava/util/Map;

    .line 194
    .line 195
    if-nez v0, :cond_15

    .line 196
    .line 197
    new-instance v0, Ljava/util/HashMap;

    .line 198
    .line 199
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 200
    .line 201
    .line 202
    iput-object v0, p0, Lhj/v;->m:Ljava/util/Map;

    .line 203
    .line 204
    :cond_15
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 205
    .line 206
    .line 207
    move-result-object p2

    .line 208
    iget-boolean v1, p0, Lhj/v;->s:Z

    .line 209
    .line 210
    if-nez v1, :cond_17

    .line 211
    .line 212
    invoke-interface {v0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 213
    .line 214
    .line 215
    move-result v1

    .line 216
    if-eqz v1, :cond_17

    .line 217
    .line 218
    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 219
    .line 220
    .line 221
    move-result-object v1

    .line 222
    invoke-virtual {p2, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 223
    .line 224
    .line 225
    move-result v1

    .line 226
    if-eqz v1, :cond_16

    .line 227
    .line 228
    goto :goto_8

    .line 229
    :cond_16
    new-instance p2, Lhj/a;

    .line 230
    .line 231
    invoke-direct {p2, p1}, Lhj/a;-><init>(Lfj/p;)V

    .line 232
    .line 233
    .line 234
    throw p2

    .line 235
    :cond_17
    :goto_8
    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 236
    .line 237
    .line 238
    return-void

    .line 239
    :cond_18
    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    .line 240
    .line 241
    .line 242
    move-result v2

    .line 243
    invoke-static {v2}, Lhj/v;->Y(I)I

    .line 244
    .line 245
    .line 246
    move-result v2

    .line 247
    iget v3, p0, Lhj/v;->p:I

    .line 248
    .line 249
    and-int/2addr v2, v3

    .line 250
    aget-object v3, v0, v2

    .line 251
    .line 252
    if-eqz v3, :cond_1e

    .line 253
    .line 254
    invoke-virtual {v3, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 255
    .line 256
    .line 257
    move-result v3

    .line 258
    if-eqz v3, :cond_1b

    .line 259
    .line 260
    iget-boolean v0, p0, Lhj/v;->s:Z

    .line 261
    .line 262
    if-nez v0, :cond_1a

    .line 263
    .line 264
    iget-object v0, p0, Lhj/v;->n:[I

    .line 265
    .line 266
    aget v0, v0, v2

    .line 267
    .line 268
    if-ne v0, p2, :cond_19

    .line 269
    .line 270
    goto :goto_9

    .line 271
    :cond_19
    new-instance p2, Lhj/a;

    .line 272
    .line 273
    invoke-direct {p2, p1}, Lhj/a;-><init>(Lfj/p;)V

    .line 274
    .line 275
    .line 276
    throw p2

    .line 277
    :cond_1a
    :goto_9
    iget-object p1, p0, Lhj/v;->n:[I

    .line 278
    .line 279
    aput p2, p1, v2

    .line 280
    .line 281
    return-void

    .line 282
    :cond_1b
    add-int/2addr v2, v1

    .line 283
    iget v3, p0, Lhj/v;->p:I

    .line 284
    .line 285
    and-int/2addr v2, v3

    .line 286
    aget-object v3, v0, v2

    .line 287
    .line 288
    if-eqz v3, :cond_1e

    .line 289
    .line 290
    invoke-virtual {v3, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 291
    .line 292
    .line 293
    move-result v3

    .line 294
    if-eqz v3, :cond_1b

    .line 295
    .line 296
    iget-boolean v0, p0, Lhj/v;->s:Z

    .line 297
    .line 298
    if-nez v0, :cond_1d

    .line 299
    .line 300
    iget-object v0, p0, Lhj/v;->n:[I

    .line 301
    .line 302
    aget v0, v0, v2

    .line 303
    .line 304
    if-ne v0, p2, :cond_1c

    .line 305
    .line 306
    goto :goto_a

    .line 307
    :cond_1c
    new-instance p2, Lhj/a;

    .line 308
    .line 309
    invoke-direct {p2, p1}, Lhj/a;-><init>(Lfj/p;)V

    .line 310
    .line 311
    .line 312
    throw p2

    .line 313
    :cond_1d
    :goto_a
    iget-object p1, p0, Lhj/v;->n:[I

    .line 314
    .line 315
    aput p2, p1, v2

    .line 316
    .line 317
    return-void

    .line 318
    :cond_1e
    aput-object p1, v0, v2

    .line 319
    .line 320
    iget-object p1, p0, Lhj/v;->n:[I

    .line 321
    .line 322
    aput p2, p1, v2

    .line 323
    .line 324
    iget p1, p0, Lhj/v;->r:I

    .line 325
    .line 326
    add-int/lit8 p2, p1, 0x1

    .line 327
    .line 328
    iput p2, p0, Lhj/v;->r:I

    .line 329
    .line 330
    iget v0, p0, Lhj/v;->q:I

    .line 331
    .line 332
    if-lt p1, v0, :cond_1f

    .line 333
    .line 334
    invoke-static {p2}, Lhj/v;->S(I)I

    .line 335
    .line 336
    .line 337
    move-result p1

    .line 338
    invoke-direct {p0, p1}, Lhj/v;->b0(I)V

    .line 339
    .line 340
    .line 341
    :cond_1f
    return-void
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

.method I(Lfj/p;Ljava/lang/Object;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lfj/p<",
            "*>;",
            "Ljava/lang/Object;",
            ")V"
        }
    .end annotation

    .line 1
    if-nez p2, :cond_0

    .line 2
    .line 3
    invoke-direct {p0, p1}, Lhj/v;->c0(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    return-void

    .line 7
    :cond_0
    invoke-interface {p1}, Lfj/p;->getType()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    const-class v1, Ljava/lang/Integer;

    .line 12
    .line 13
    if-ne v0, v1, :cond_1

    .line 14
    .line 15
    invoke-virtual {v1, p2}, Ljava/lang/Class;->cast(Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p2

    .line 19
    check-cast p2, Ljava/lang/Integer;

    .line 20
    .line 21
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 22
    .line 23
    .line 24
    move-result p2

    .line 25
    invoke-virtual {p0, p1, p2}, Lhj/v;->H(Lfj/p;I)V

    .line 26
    .line 27
    .line 28
    return-void

    .line 29
    :cond_1
    iget-object v0, p0, Lhj/v;->k:[Ljava/lang/Object;

    .line 30
    .line 31
    if-nez v0, :cond_5

    .line 32
    .line 33
    iget-object v0, p0, Lhj/v;->m:Ljava/util/Map;

    .line 34
    .line 35
    if-nez v0, :cond_2

    .line 36
    .line 37
    new-instance v0, Ljava/util/HashMap;

    .line 38
    .line 39
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 40
    .line 41
    .line 42
    iput-object v0, p0, Lhj/v;->m:Ljava/util/Map;

    .line 43
    .line 44
    :cond_2
    iget-boolean v1, p0, Lhj/v;->s:Z

    .line 45
    .line 46
    if-nez v1, :cond_4

    .line 47
    .line 48
    invoke-interface {v0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    move-result v1

    .line 52
    if-eqz v1, :cond_4

    .line 53
    .line 54
    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    invoke-virtual {p2, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    move-result v1

    .line 62
    if-eqz v1, :cond_3

    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_3
    new-instance p2, Lhj/a;

    .line 66
    .line 67
    invoke-direct {p2, p1}, Lhj/a;-><init>(Lfj/p;)V

    .line 68
    .line 69
    .line 70
    throw p2

    .line 71
    :cond_4
    :goto_0
    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    return-void

    .line 75
    :cond_5
    iget-object v1, p0, Lhj/v;->l:[Ljava/lang/Object;

    .line 76
    .line 77
    if-nez v1, :cond_6

    .line 78
    .line 79
    iget v1, p0, Lhj/v;->o:I

    .line 80
    .line 81
    new-array v1, v1, [Ljava/lang/Object;

    .line 82
    .line 83
    iput-object v1, p0, Lhj/v;->l:[Ljava/lang/Object;

    .line 84
    .line 85
    :cond_6
    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    .line 86
    .line 87
    .line 88
    move-result v1

    .line 89
    invoke-static {v1}, Lhj/v;->Y(I)I

    .line 90
    .line 91
    .line 92
    move-result v1

    .line 93
    iget v2, p0, Lhj/v;->p:I

    .line 94
    .line 95
    and-int/2addr v1, v2

    .line 96
    aget-object v2, v0, v1

    .line 97
    .line 98
    if-eqz v2, :cond_c

    .line 99
    .line 100
    invoke-virtual {v2, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 101
    .line 102
    .line 103
    move-result v2

    .line 104
    if-eqz v2, :cond_9

    .line 105
    .line 106
    iget-boolean v0, p0, Lhj/v;->s:Z

    .line 107
    .line 108
    if-nez v0, :cond_8

    .line 109
    .line 110
    iget-object v0, p0, Lhj/v;->l:[Ljava/lang/Object;

    .line 111
    .line 112
    aget-object v0, v0, v1

    .line 113
    .line 114
    invoke-virtual {p2, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 115
    .line 116
    .line 117
    move-result v0

    .line 118
    if-eqz v0, :cond_7

    .line 119
    .line 120
    goto :goto_1

    .line 121
    :cond_7
    new-instance p2, Lhj/a;

    .line 122
    .line 123
    invoke-direct {p2, p1}, Lhj/a;-><init>(Lfj/p;)V

    .line 124
    .line 125
    .line 126
    throw p2

    .line 127
    :cond_8
    :goto_1
    iget-object p1, p0, Lhj/v;->l:[Ljava/lang/Object;

    .line 128
    .line 129
    aput-object p2, p1, v1

    .line 130
    .line 131
    return-void

    .line 132
    :cond_9
    add-int/lit8 v1, v1, 0x1

    .line 133
    .line 134
    iget v2, p0, Lhj/v;->p:I

    .line 135
    .line 136
    and-int/2addr v1, v2

    .line 137
    aget-object v2, v0, v1

    .line 138
    .line 139
    if-eqz v2, :cond_c

    .line 140
    .line 141
    invoke-virtual {v2, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 142
    .line 143
    .line 144
    move-result v2

    .line 145
    if-eqz v2, :cond_9

    .line 146
    .line 147
    iget-boolean v0, p0, Lhj/v;->s:Z

    .line 148
    .line 149
    if-nez v0, :cond_b

    .line 150
    .line 151
    iget-object v0, p0, Lhj/v;->l:[Ljava/lang/Object;

    .line 152
    .line 153
    aget-object v0, v0, v1

    .line 154
    .line 155
    invoke-virtual {p2, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 156
    .line 157
    .line 158
    move-result v0

    .line 159
    if-eqz v0, :cond_a

    .line 160
    .line 161
    goto :goto_2

    .line 162
    :cond_a
    new-instance p2, Lhj/a;

    .line 163
    .line 164
    invoke-direct {p2, p1}, Lhj/a;-><init>(Lfj/p;)V

    .line 165
    .line 166
    .line 167
    throw p2

    .line 168
    :cond_b
    :goto_2
    iget-object p1, p0, Lhj/v;->l:[Ljava/lang/Object;

    .line 169
    .line 170
    aput-object p2, p1, v1

    .line 171
    .line 172
    return-void

    .line 173
    :cond_c
    aput-object p1, v0, v1

    .line 174
    .line 175
    iget-object p1, p0, Lhj/v;->l:[Ljava/lang/Object;

    .line 176
    .line 177
    aput-object p2, p1, v1

    .line 178
    .line 179
    iget p1, p0, Lhj/v;->r:I

    .line 180
    .line 181
    add-int/lit8 p2, p1, 0x1

    .line 182
    .line 183
    iput p2, p0, Lhj/v;->r:I

    .line 184
    .line 185
    iget v0, p0, Lhj/v;->q:I

    .line 186
    .line 187
    if-lt p1, v0, :cond_d

    .line 188
    .line 189
    invoke-static {p2}, Lhj/v;->S(I)I

    .line 190
    .line 191
    .line 192
    move-result p1

    .line 193
    invoke-direct {p0, p1}, Lhj/v;->b0(I)V

    .line 194
    .line 195
    .line 196
    :cond_d
    return-void
    .line 197
    .line 198
    .line 199
    .line 200
.end method

.method J(Ljava/lang/Object;)V
    .locals 0

    return-void
.end method

.method V()I
    .locals 1

    iget v0, p0, Lhj/v;->t:I

    return v0
.end method

.method a0(Lhj/v;)V
    .locals 6

    .line 1
    iget-object v0, p0, Lhj/v;->k:[Ljava/lang/Object;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_11

    .line 5
    .line 6
    iget v0, p1, Lhj/v;->o:I

    .line 7
    .line 8
    const/high16 v2, -0x80000000

    .line 9
    .line 10
    if-eq v0, v2, :cond_2

    .line 11
    .line 12
    iget v3, p0, Lhj/v;->o:I

    .line 13
    .line 14
    if-eq v3, v2, :cond_1

    .line 15
    .line 16
    iget-boolean v4, p0, Lhj/v;->s:Z

    .line 17
    .line 18
    if-nez v4, :cond_1

    .line 19
    .line 20
    if-ne v3, v0, :cond_0

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    new-instance p1, Lhj/a;

    .line 24
    .line 25
    sget-object v0, Lnet/time4j/g0;->E:Lnet/time4j/k0;

    .line 26
    .line 27
    invoke-direct {p1, v0}, Lhj/a;-><init>(Lfj/p;)V

    .line 28
    .line 29
    .line 30
    throw p1

    .line 31
    :cond_1
    :goto_0
    iput v0, p0, Lhj/v;->o:I

    .line 32
    .line 33
    :cond_2
    iget v0, p1, Lhj/v;->p:I

    .line 34
    .line 35
    if-eq v0, v2, :cond_5

    .line 36
    .line 37
    iget v3, p0, Lhj/v;->p:I

    .line 38
    .line 39
    if-eq v3, v2, :cond_4

    .line 40
    .line 41
    iget-boolean v4, p0, Lhj/v;->s:Z

    .line 42
    .line 43
    if-nez v4, :cond_4

    .line 44
    .line 45
    if-ne v3, v0, :cond_3

    .line 46
    .line 47
    goto :goto_1

    .line 48
    :cond_3
    new-instance p1, Lhj/a;

    .line 49
    .line 50
    sget-object v0, Lnet/time4j/g0;->G:Lnet/time4j/k0;

    .line 51
    .line 52
    invoke-direct {p1, v0}, Lhj/a;-><init>(Lfj/p;)V

    .line 53
    .line 54
    .line 55
    throw p1

    .line 56
    :cond_4
    :goto_1
    iput v0, p0, Lhj/v;->p:I

    .line 57
    .line 58
    :cond_5
    iget v0, p1, Lhj/v;->q:I

    .line 59
    .line 60
    if-eq v0, v2, :cond_8

    .line 61
    .line 62
    iget v3, p0, Lhj/v;->q:I

    .line 63
    .line 64
    if-eq v3, v2, :cond_7

    .line 65
    .line 66
    iget-boolean v4, p0, Lhj/v;->s:Z

    .line 67
    .line 68
    if-nez v4, :cond_7

    .line 69
    .line 70
    if-ne v3, v0, :cond_6

    .line 71
    .line 72
    goto :goto_2

    .line 73
    :cond_6
    new-instance p1, Lhj/a;

    .line 74
    .line 75
    sget-object v0, Lnet/time4j/g0;->I:Lnet/time4j/k0;

    .line 76
    .line 77
    invoke-direct {p1, v0}, Lhj/a;-><init>(Lfj/p;)V

    .line 78
    .line 79
    .line 80
    throw p1

    .line 81
    :cond_7
    :goto_2
    iput v0, p0, Lhj/v;->q:I

    .line 82
    .line 83
    :cond_8
    iget v0, p1, Lhj/v;->r:I

    .line 84
    .line 85
    if-eq v0, v2, :cond_b

    .line 86
    .line 87
    iget v3, p0, Lhj/v;->r:I

    .line 88
    .line 89
    if-eq v3, v2, :cond_a

    .line 90
    .line 91
    iget-boolean v4, p0, Lhj/v;->s:Z

    .line 92
    .line 93
    if-nez v4, :cond_a

    .line 94
    .line 95
    if-ne v3, v0, :cond_9

    .line 96
    .line 97
    goto :goto_3

    .line 98
    :cond_9
    new-instance p1, Lhj/a;

    .line 99
    .line 100
    sget-object v0, Lnet/time4j/g0;->M:Lnet/time4j/k0;

    .line 101
    .line 102
    invoke-direct {p1, v0}, Lhj/a;-><init>(Lfj/p;)V

    .line 103
    .line 104
    .line 105
    throw p1

    .line 106
    :cond_a
    :goto_3
    iput v0, p0, Lhj/v;->r:I

    .line 107
    .line 108
    :cond_b
    :goto_4
    const/4 v0, 0x3

    .line 109
    if-ge v1, v0, :cond_f

    .line 110
    .line 111
    iget-object v0, p1, Lhj/v;->n:[I

    .line 112
    .line 113
    aget v0, v0, v1

    .line 114
    .line 115
    if-eq v0, v2, :cond_e

    .line 116
    .line 117
    iget-object v3, p0, Lhj/v;->n:[I

    .line 118
    .line 119
    aget v4, v3, v1

    .line 120
    .line 121
    if-eq v4, v2, :cond_d

    .line 122
    .line 123
    iget-boolean v5, p0, Lhj/v;->s:Z

    .line 124
    .line 125
    if-nez v5, :cond_d

    .line 126
    .line 127
    if-ne v4, v0, :cond_c

    .line 128
    .line 129
    goto :goto_5

    .line 130
    :cond_c
    new-instance p1, Lhj/a;

    .line 131
    .line 132
    invoke-static {v1}, Lhj/v;->T(I)Lfj/p;

    .line 133
    .line 134
    .line 135
    move-result-object v0

    .line 136
    invoke-direct {p1, v0}, Lhj/a;-><init>(Lfj/p;)V

    .line 137
    .line 138
    .line 139
    throw p1

    .line 140
    :cond_d
    :goto_5
    aput v0, v3, v1

    .line 141
    .line 142
    :cond_e
    add-int/lit8 v1, v1, 0x1

    .line 143
    .line 144
    goto :goto_4

    .line 145
    :cond_f
    iget-object p1, p1, Lhj/v;->m:Ljava/util/Map;

    .line 146
    .line 147
    if-eqz p1, :cond_10

    .line 148
    .line 149
    invoke-interface {p1}, Ljava/util/Map;->keySet()Ljava/util/Set;

    .line 150
    .line 151
    .line 152
    move-result-object v0

    .line 153
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 154
    .line 155
    .line 156
    move-result-object v0

    .line 157
    :goto_6
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 158
    .line 159
    .line 160
    move-result v1

    .line 161
    if-eqz v1, :cond_10

    .line 162
    .line 163
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 164
    .line 165
    .line 166
    move-result-object v1

    .line 167
    check-cast v1, Lfj/p;

    .line 168
    .line 169
    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 170
    .line 171
    .line 172
    move-result-object v2

    .line 173
    invoke-virtual {p0, v1, v2}, Lhj/v;->I(Lfj/p;Ljava/lang/Object;)V

    .line 174
    .line 175
    .line 176
    goto :goto_6

    .line 177
    :cond_10
    return-void

    .line 178
    :cond_11
    iget-object v0, p1, Lhj/v;->k:[Ljava/lang/Object;

    .line 179
    .line 180
    :goto_7
    array-length v2, v0

    .line 181
    if-ge v1, v2, :cond_14

    .line 182
    .line 183
    aget-object v2, v0, v1

    .line 184
    .line 185
    if-eqz v2, :cond_13

    .line 186
    .line 187
    const-class v3, Lfj/p;

    .line 188
    .line 189
    invoke-virtual {v3, v2}, Ljava/lang/Class;->cast(Ljava/lang/Object;)Ljava/lang/Object;

    .line 190
    .line 191
    .line 192
    move-result-object v2

    .line 193
    check-cast v2, Lfj/p;

    .line 194
    .line 195
    invoke-interface {v2}, Lfj/p;->getType()Ljava/lang/Class;

    .line 196
    .line 197
    .line 198
    move-result-object v3

    .line 199
    const-class v4, Ljava/lang/Integer;

    .line 200
    .line 201
    if-ne v3, v4, :cond_12

    .line 202
    .line 203
    iget-object v3, p1, Lhj/v;->n:[I

    .line 204
    .line 205
    aget v3, v3, v1

    .line 206
    .line 207
    invoke-virtual {p0, v2, v3}, Lhj/v;->H(Lfj/p;I)V

    .line 208
    .line 209
    .line 210
    goto :goto_8

    .line 211
    :cond_12
    iget-object v3, p1, Lhj/v;->l:[Ljava/lang/Object;

    .line 212
    .line 213
    aget-object v3, v3, v1

    .line 214
    .line 215
    invoke-virtual {p0, v2, v3}, Lhj/v;->I(Lfj/p;Ljava/lang/Object;)V

    .line 216
    .line 217
    .line 218
    :cond_13
    :goto_8
    add-int/lit8 v1, v1, 0x1

    .line 219
    .line 220
    goto :goto_7

    .line 221
    :cond_14
    return-void
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

.method e0()V
    .locals 4

    .line 1
    iget-object v0, p0, Lhj/v;->k:[Ljava/lang/Object;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_1

    .line 5
    .line 6
    const/high16 v0, -0x80000000

    .line 7
    .line 8
    iput v0, p0, Lhj/v;->o:I

    .line 9
    .line 10
    iput v0, p0, Lhj/v;->p:I

    .line 11
    .line 12
    iput v0, p0, Lhj/v;->q:I

    .line 13
    .line 14
    iput v0, p0, Lhj/v;->r:I

    .line 15
    .line 16
    move v2, v1

    .line 17
    :goto_0
    const/4 v3, 0x3

    .line 18
    if-ge v2, v3, :cond_0

    .line 19
    .line 20
    iget-object v3, p0, Lhj/v;->n:[I

    .line 21
    .line 22
    aput v0, v3, v2

    .line 23
    .line 24
    add-int/lit8 v2, v2, 0x1

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    const/4 v0, 0x0

    .line 28
    iput-object v0, p0, Lhj/v;->m:Ljava/util/Map;

    .line 29
    .line 30
    goto :goto_1

    .line 31
    :cond_1
    array-length v0, v0

    .line 32
    new-array v0, v0, [Ljava/lang/Object;

    .line 33
    .line 34
    iput-object v0, p0, Lhj/v;->k:[Ljava/lang/Object;

    .line 35
    .line 36
    :goto_1
    iput v1, p0, Lhj/v;->r:I

    .line 37
    .line 38
    return-void
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
.end method

.method f0()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lhj/v;->s:Z

    return-void
.end method

.method g0(I)V
    .locals 0

    iput p1, p0, Lhj/v;->t:I

    return-void
.end method

.method public k(Lfj/p;)Ljava/lang/Object;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<V:",
            "Ljava/lang/Object;",
            ">(",
            "Lfj/p<",
            "TV;>;)TV;"
        }
    .end annotation

    .line 1
    invoke-interface {p1}, Lfj/p;->getType()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-class v1, Ljava/lang/Integer;

    .line 6
    .line 7
    const-string v2, "No value found for: "

    .line 8
    .line 9
    if-ne v0, v1, :cond_1

    .line 10
    .line 11
    invoke-direct {p0, p1}, Lhj/v;->U(Lfj/p;)I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    const/high16 v3, -0x80000000

    .line 16
    .line 17
    if-eq v1, v3, :cond_0

    .line 18
    .line 19
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    invoke-virtual {v0, p1}, Ljava/lang/Class;->cast(Ljava/lang/Object;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    return-object p1

    .line 28
    :cond_0
    new-instance v0, Lfj/r;

    .line 29
    .line 30
    new-instance v1, Ljava/lang/StringBuilder;

    .line 31
    .line 32
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    invoke-interface {p1}, Lfj/p;->name()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    invoke-direct {v0, p1}, Lfj/r;-><init>(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    throw v0

    .line 53
    :cond_1
    iget-object v1, p0, Lhj/v;->k:[Ljava/lang/Object;

    .line 54
    .line 55
    if-nez v1, :cond_3

    .line 56
    .line 57
    iget-object v0, p0, Lhj/v;->m:Ljava/util/Map;

    .line 58
    .line 59
    if-eqz v0, :cond_2

    .line 60
    .line 61
    invoke-interface {v0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    move-result v1

    .line 65
    if-eqz v1, :cond_2

    .line 66
    .line 67
    invoke-interface {p1}, Lfj/p;->getType()Ljava/lang/Class;

    .line 68
    .line 69
    .line 70
    move-result-object v1

    .line 71
    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    invoke-virtual {v1, p1}, Ljava/lang/Class;->cast(Ljava/lang/Object;)Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    return-object p1

    .line 80
    :cond_2
    new-instance v0, Lfj/r;

    .line 81
    .line 82
    new-instance v1, Ljava/lang/StringBuilder;

    .line 83
    .line 84
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 85
    .line 86
    .line 87
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 88
    .line 89
    .line 90
    invoke-interface {p1}, Lfj/p;->name()Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object p1

    .line 94
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 95
    .line 96
    .line 97
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object p1

    .line 101
    invoke-direct {v0, p1}, Lfj/r;-><init>(Ljava/lang/String;)V

    .line 102
    .line 103
    .line 104
    throw v0

    .line 105
    :cond_3
    iget-object v3, p0, Lhj/v;->l:[Ljava/lang/Object;

    .line 106
    .line 107
    if-eqz v3, :cond_6

    .line 108
    .line 109
    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    .line 110
    .line 111
    .line 112
    move-result v3

    .line 113
    invoke-static {v3}, Lhj/v;->Y(I)I

    .line 114
    .line 115
    .line 116
    move-result v3

    .line 117
    iget v4, p0, Lhj/v;->p:I

    .line 118
    .line 119
    and-int/2addr v3, v4

    .line 120
    aget-object v4, v1, v3

    .line 121
    .line 122
    if-eqz v4, :cond_6

    .line 123
    .line 124
    invoke-virtual {p1, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 125
    .line 126
    .line 127
    move-result v4

    .line 128
    if-eqz v4, :cond_4

    .line 129
    .line 130
    iget-object p1, p0, Lhj/v;->l:[Ljava/lang/Object;

    .line 131
    .line 132
    aget-object p1, p1, v3

    .line 133
    .line 134
    invoke-virtual {v0, p1}, Ljava/lang/Class;->cast(Ljava/lang/Object;)Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    move-result-object p1

    .line 138
    return-object p1

    .line 139
    :cond_4
    add-int/lit8 v3, v3, 0x1

    .line 140
    .line 141
    iget v4, p0, Lhj/v;->p:I

    .line 142
    .line 143
    and-int/2addr v3, v4

    .line 144
    aget-object v4, v1, v3

    .line 145
    .line 146
    if-eqz v4, :cond_5

    .line 147
    .line 148
    invoke-virtual {p1, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 149
    .line 150
    .line 151
    move-result v4

    .line 152
    if-eqz v4, :cond_4

    .line 153
    .line 154
    iget-object p1, p0, Lhj/v;->l:[Ljava/lang/Object;

    .line 155
    .line 156
    aget-object p1, p1, v3

    .line 157
    .line 158
    invoke-virtual {v0, p1}, Ljava/lang/Class;->cast(Ljava/lang/Object;)Ljava/lang/Object;

    .line 159
    .line 160
    .line 161
    move-result-object p1

    .line 162
    return-object p1

    .line 163
    :cond_5
    new-instance v0, Lfj/r;

    .line 164
    .line 165
    new-instance v1, Ljava/lang/StringBuilder;

    .line 166
    .line 167
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 168
    .line 169
    .line 170
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 171
    .line 172
    .line 173
    invoke-interface {p1}, Lfj/p;->name()Ljava/lang/String;

    .line 174
    .line 175
    .line 176
    move-result-object p1

    .line 177
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 178
    .line 179
    .line 180
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 181
    .line 182
    .line 183
    move-result-object p1

    .line 184
    invoke-direct {v0, p1}, Lfj/r;-><init>(Ljava/lang/String;)V

    .line 185
    .line 186
    .line 187
    throw v0

    .line 188
    :cond_6
    new-instance v0, Lfj/r;

    .line 189
    .line 190
    new-instance v1, Ljava/lang/StringBuilder;

    .line 191
    .line 192
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 193
    .line 194
    .line 195
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 196
    .line 197
    .line 198
    invoke-interface {p1}, Lfj/p;->name()Ljava/lang/String;

    .line 199
    .line 200
    .line 201
    move-result-object p1

    .line 202
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 203
    .line 204
    .line 205
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 206
    .line 207
    .line 208
    move-result-object p1

    .line 209
    invoke-direct {v0, p1}, Lfj/r;-><init>(Ljava/lang/String;)V

    .line 210
    .line 211
    .line 212
    throw v0
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

.method public m(Lfj/p;)I
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lfj/p<",
            "Ljava/lang/Integer;",
            ">;)I"
        }
    .end annotation

    invoke-direct {p0, p1}, Lhj/v;->U(Lfj/p;)I

    move-result p1

    return p1
.end method

.method public o(Lfj/p;)Z
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lfj/p<",
            "*>;)Z"
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    iget-object v1, p0, Lhj/v;->k:[Ljava/lang/Object;

    .line 6
    .line 7
    const/4 v2, 0x1

    .line 8
    if-nez v1, :cond_10

    .line 9
    .line 10
    sget-object v1, Lnet/time4j/f0;->z:Lnet/time4j/c;

    .line 11
    .line 12
    const/high16 v3, -0x80000000

    .line 13
    .line 14
    if-ne p1, v1, :cond_2

    .line 15
    .line 16
    iget-object p1, p0, Lhj/v;->n:[I

    .line 17
    .line 18
    aget p1, p1, v0

    .line 19
    .line 20
    if-eq p1, v3, :cond_1

    .line 21
    .line 22
    move v0, v2

    .line 23
    :cond_1
    return v0

    .line 24
    :cond_2
    sget-object v1, Lnet/time4j/f0;->D:Lnet/time4j/k0;

    .line 25
    .line 26
    if-ne p1, v1, :cond_4

    .line 27
    .line 28
    iget-object p1, p0, Lhj/v;->n:[I

    .line 29
    .line 30
    aget p1, p1, v2

    .line 31
    .line 32
    if-eq p1, v3, :cond_3

    .line 33
    .line 34
    move v0, v2

    .line 35
    :cond_3
    return v0

    .line 36
    :cond_4
    sget-object v1, Lnet/time4j/f0;->E:Lnet/time4j/k0;

    .line 37
    .line 38
    if-ne p1, v1, :cond_6

    .line 39
    .line 40
    iget-object p1, p0, Lhj/v;->n:[I

    .line 41
    .line 42
    const/4 v1, 0x2

    .line 43
    aget p1, p1, v1

    .line 44
    .line 45
    if-eq p1, v3, :cond_5

    .line 46
    .line 47
    move v0, v2

    .line 48
    :cond_5
    return v0

    .line 49
    :cond_6
    sget-object v1, Lnet/time4j/g0;->E:Lnet/time4j/k0;

    .line 50
    .line 51
    if-ne p1, v1, :cond_8

    .line 52
    .line 53
    iget p1, p0, Lhj/v;->o:I

    .line 54
    .line 55
    if-eq p1, v3, :cond_7

    .line 56
    .line 57
    move v0, v2

    .line 58
    :cond_7
    return v0

    .line 59
    :cond_8
    sget-object v1, Lnet/time4j/g0;->G:Lnet/time4j/k0;

    .line 60
    .line 61
    if-ne p1, v1, :cond_a

    .line 62
    .line 63
    iget p1, p0, Lhj/v;->p:I

    .line 64
    .line 65
    if-eq p1, v3, :cond_9

    .line 66
    .line 67
    move v0, v2

    .line 68
    :cond_9
    return v0

    .line 69
    :cond_a
    sget-object v1, Lnet/time4j/g0;->I:Lnet/time4j/k0;

    .line 70
    .line 71
    if-ne p1, v1, :cond_c

    .line 72
    .line 73
    iget p1, p0, Lhj/v;->q:I

    .line 74
    .line 75
    if-eq p1, v3, :cond_b

    .line 76
    .line 77
    move v0, v2

    .line 78
    :cond_b
    return v0

    .line 79
    :cond_c
    sget-object v1, Lnet/time4j/g0;->M:Lnet/time4j/k0;

    .line 80
    .line 81
    if-ne p1, v1, :cond_e

    .line 82
    .line 83
    iget p1, p0, Lhj/v;->r:I

    .line 84
    .line 85
    if-eq p1, v3, :cond_d

    .line 86
    .line 87
    move v0, v2

    .line 88
    :cond_d
    return v0

    .line 89
    :cond_e
    iget-object v1, p0, Lhj/v;->m:Ljava/util/Map;

    .line 90
    .line 91
    if-eqz v1, :cond_f

    .line 92
    .line 93
    invoke-interface {v1, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 94
    .line 95
    .line 96
    move-result p1

    .line 97
    if-eqz p1, :cond_f

    .line 98
    .line 99
    move v0, v2

    .line 100
    :cond_f
    return v0

    .line 101
    :cond_10
    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    .line 102
    .line 103
    .line 104
    move-result v3

    .line 105
    invoke-static {v3}, Lhj/v;->Y(I)I

    .line 106
    .line 107
    .line 108
    move-result v3

    .line 109
    iget v4, p0, Lhj/v;->p:I

    .line 110
    .line 111
    and-int/2addr v3, v4

    .line 112
    aget-object v4, v1, v3

    .line 113
    .line 114
    if-nez v4, :cond_11

    .line 115
    .line 116
    return v0

    .line 117
    :cond_11
    invoke-virtual {p1, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 118
    .line 119
    .line 120
    move-result v4

    .line 121
    if-eqz v4, :cond_12

    .line 122
    .line 123
    return v2

    .line 124
    :cond_12
    add-int/2addr v3, v2

    .line 125
    iget v4, p0, Lhj/v;->p:I

    .line 126
    .line 127
    and-int/2addr v3, v4

    .line 128
    aget-object v4, v1, v3

    .line 129
    .line 130
    if-nez v4, :cond_13

    .line 131
    .line 132
    return v0

    .line 133
    :cond_13
    invoke-virtual {p1, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 134
    .line 135
    .line 136
    move-result v4

    .line 137
    if-eqz v4, :cond_12

    .line 138
    .line 139
    return v2
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

.method public x()Ljava/util/Set;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Lfj/p<",
            "*>;>;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lhj/v;->k:[Ljava/lang/Object;

    .line 2
    .line 3
    if-nez v0, :cond_8

    .line 4
    .line 5
    new-instance v0, Ljava/util/HashSet;

    .line 6
    .line 7
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 8
    .line 9
    .line 10
    iget-object v1, p0, Lhj/v;->n:[I

    .line 11
    .line 12
    const/4 v2, 0x0

    .line 13
    aget v1, v1, v2

    .line 14
    .line 15
    const/high16 v2, -0x80000000

    .line 16
    .line 17
    if-eq v1, v2, :cond_0

    .line 18
    .line 19
    sget-object v1, Lnet/time4j/f0;->z:Lnet/time4j/c;

    .line 20
    .line 21
    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    :cond_0
    iget-object v1, p0, Lhj/v;->n:[I

    .line 25
    .line 26
    const/4 v3, 0x1

    .line 27
    aget v1, v1, v3

    .line 28
    .line 29
    if-eq v1, v2, :cond_1

    .line 30
    .line 31
    sget-object v1, Lnet/time4j/f0;->D:Lnet/time4j/k0;

    .line 32
    .line 33
    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    :cond_1
    iget-object v1, p0, Lhj/v;->n:[I

    .line 37
    .line 38
    const/4 v3, 0x2

    .line 39
    aget v1, v1, v3

    .line 40
    .line 41
    if-eq v1, v2, :cond_2

    .line 42
    .line 43
    sget-object v1, Lnet/time4j/f0;->E:Lnet/time4j/k0;

    .line 44
    .line 45
    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    :cond_2
    iget v1, p0, Lhj/v;->o:I

    .line 49
    .line 50
    if-eq v1, v2, :cond_3

    .line 51
    .line 52
    sget-object v1, Lnet/time4j/g0;->E:Lnet/time4j/k0;

    .line 53
    .line 54
    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    :cond_3
    iget v1, p0, Lhj/v;->p:I

    .line 58
    .line 59
    if-eq v1, v2, :cond_4

    .line 60
    .line 61
    sget-object v1, Lnet/time4j/g0;->G:Lnet/time4j/k0;

    .line 62
    .line 63
    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    :cond_4
    iget v1, p0, Lhj/v;->q:I

    .line 67
    .line 68
    if-eq v1, v2, :cond_5

    .line 69
    .line 70
    sget-object v1, Lnet/time4j/g0;->I:Lnet/time4j/k0;

    .line 71
    .line 72
    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    :cond_5
    iget v1, p0, Lhj/v;->r:I

    .line 76
    .line 77
    if-eq v1, v2, :cond_6

    .line 78
    .line 79
    sget-object v1, Lnet/time4j/g0;->M:Lnet/time4j/k0;

    .line 80
    .line 81
    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 82
    .line 83
    .line 84
    :cond_6
    iget-object v1, p0, Lhj/v;->m:Ljava/util/Map;

    .line 85
    .line 86
    if-eqz v1, :cond_7

    .line 87
    .line 88
    invoke-interface {v1}, Ljava/util/Map;->keySet()Ljava/util/Set;

    .line 89
    .line 90
    .line 91
    move-result-object v1

    .line 92
    invoke-interface {v0, v1}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    .line 93
    .line 94
    .line 95
    :cond_7
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    .line 96
    .line 97
    .line 98
    move-result-object v0

    .line 99
    return-object v0

    .line 100
    :cond_8
    new-instance v0, Lhj/v$c;

    .line 101
    .line 102
    const/4 v1, 0x0

    .line 103
    invoke-direct {v0, p0, v1}, Lhj/v$c;-><init>(Lhj/v;Lhj/v$a;)V

    .line 104
    .line 105
    .line 106
    return-object v0
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
.end method
