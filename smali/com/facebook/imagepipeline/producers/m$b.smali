.class Lcom/facebook/imagepipeline/producers/m$b;
.super Lcom/facebook/imagepipeline/producers/m$c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/imagepipeline/producers/m;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "b"
.end annotation


# instance fields
.field private final j:Ls5/f;

.field private final k:Ls5/e;

.field private l:I

.field final synthetic m:Lcom/facebook/imagepipeline/producers/m;


# direct methods
.method public constructor <init>(Lcom/facebook/imagepipeline/producers/m;Lcom/facebook/imagepipeline/producers/Consumer;Lcom/facebook/imagepipeline/producers/ProducerContext;Ls5/f;Ls5/e;ZI)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/imagepipeline/producers/Consumer<",
            "Lcom/facebook/common/references/CloseableReference<",
            "Lu5/c;",
            ">;>;",
            "Lcom/facebook/imagepipeline/producers/ProducerContext;",
            "Ls5/f;",
            "Ls5/e;",
            "ZI)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/facebook/imagepipeline/producers/m$b;->m:Lcom/facebook/imagepipeline/producers/m;

    .line 2
    .line 3
    move-object v0, p0

    .line 4
    move-object v1, p1

    .line 5
    move-object v2, p2

    .line 6
    move-object v3, p3

    .line 7
    move v4, p6

    .line 8
    move v5, p7

    .line 9
    invoke-direct/range {v0 .. v5}, Lcom/facebook/imagepipeline/producers/m$c;-><init>(Lcom/facebook/imagepipeline/producers/m;Lcom/facebook/imagepipeline/producers/Consumer;Lcom/facebook/imagepipeline/producers/ProducerContext;ZI)V

    .line 10
    .line 11
    .line 12
    invoke-static {p4}, Lv3/j;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    check-cast p1, Ls5/f;

    .line 17
    .line 18
    iput-object p1, p0, Lcom/facebook/imagepipeline/producers/m$b;->j:Ls5/f;

    .line 19
    .line 20
    invoke-static {p5}, Lv3/j;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    check-cast p1, Ls5/e;

    .line 25
    .line 26
    iput-object p1, p0, Lcom/facebook/imagepipeline/producers/m$b;->k:Ls5/e;

    .line 27
    .line 28
    const/4 p1, 0x0

    .line 29
    iput p1, p0, Lcom/facebook/imagepipeline/producers/m$b;->l:I

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
.end method


# virtual methods
.method protected declared-synchronized H(Lu5/e;I)Z
    .locals 3

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    invoke-super {p0, p1, p2}, Lcom/facebook/imagepipeline/producers/m$c;->H(Lu5/e;I)Z

    .line 3
    .line 4
    .line 5
    move-result v0

    .line 6
    invoke-static {p2}, Lcom/facebook/imagepipeline/producers/b;->e(I)Z

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    if-nez v1, :cond_0

    .line 11
    .line 12
    const/16 v1, 0x8

    .line 13
    .line 14
    invoke-static {p2, v1}, Lcom/facebook/imagepipeline/producers/b;->m(II)Z

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    if-eqz v1, :cond_4

    .line 19
    .line 20
    :cond_0
    const/4 v1, 0x4

    .line 21
    invoke-static {p2, v1}, Lcom/facebook/imagepipeline/producers/b;->m(II)Z

    .line 22
    .line 23
    .line 24
    move-result p2

    .line 25
    if-nez p2, :cond_4

    .line 26
    .line 27
    invoke-static {p1}, Lu5/e;->n0(Lu5/e;)Z

    .line 28
    .line 29
    .line 30
    move-result p2

    .line 31
    if-eqz p2, :cond_4

    .line 32
    .line 33
    invoke-virtual {p1}, Lu5/e;->t()Li5/c;

    .line 34
    .line 35
    .line 36
    move-result-object p2

    .line 37
    sget-object v1, Li5/b;->a:Li5/c;

    .line 38
    .line 39
    if-ne p2, v1, :cond_4

    .line 40
    .line 41
    iget-object p2, p0, Lcom/facebook/imagepipeline/producers/m$b;->j:Ls5/f;

    .line 42
    .line 43
    invoke-virtual {p2, p1}, Ls5/f;->g(Lu5/e;)Z

    .line 44
    .line 45
    .line 46
    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 47
    const/4 p2, 0x0

    .line 48
    if-nez p1, :cond_1

    .line 49
    .line 50
    monitor-exit p0

    .line 51
    return p2

    .line 52
    :cond_1
    :try_start_1
    iget-object p1, p0, Lcom/facebook/imagepipeline/producers/m$b;->j:Ls5/f;

    .line 53
    .line 54
    invoke-virtual {p1}, Ls5/f;->d()I

    .line 55
    .line 56
    .line 57
    move-result p1

    .line 58
    iget v1, p0, Lcom/facebook/imagepipeline/producers/m$b;->l:I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 59
    .line 60
    if-gt p1, v1, :cond_2

    .line 61
    .line 62
    monitor-exit p0

    .line 63
    return p2

    .line 64
    :cond_2
    :try_start_2
    iget-object v2, p0, Lcom/facebook/imagepipeline/producers/m$b;->k:Ls5/e;

    .line 65
    .line 66
    invoke-interface {v2, v1}, Ls5/e;->a(I)I

    .line 67
    .line 68
    .line 69
    move-result v1

    .line 70
    if-ge p1, v1, :cond_3

    .line 71
    .line 72
    iget-object v1, p0, Lcom/facebook/imagepipeline/producers/m$b;->j:Ls5/f;

    .line 73
    .line 74
    invoke-virtual {v1}, Ls5/f;->e()Z

    .line 75
    .line 76
    .line 77
    move-result v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 78
    if-nez v1, :cond_3

    .line 79
    .line 80
    monitor-exit p0

    .line 81
    return p2

    .line 82
    :cond_3
    :try_start_3
    iput p1, p0, Lcom/facebook/imagepipeline/producers/m$b;->l:I
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 83
    .line 84
    :cond_4
    monitor-exit p0

    .line 85
    return v0

    .line 86
    :catchall_0
    move-exception p1

    .line 87
    monitor-exit p0

    .line 88
    throw p1
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
.end method

.method protected w(Lu5/e;)I
    .locals 0

    iget-object p1, p0, Lcom/facebook/imagepipeline/producers/m$b;->j:Ls5/f;

    invoke-virtual {p1}, Ls5/f;->c()I

    move-result p1

    return p1
.end method

.method protected x()Lu5/i;
    .locals 2

    iget-object v0, p0, Lcom/facebook/imagepipeline/producers/m$b;->k:Ls5/e;

    iget-object v1, p0, Lcom/facebook/imagepipeline/producers/m$b;->j:Ls5/f;

    invoke-virtual {v1}, Ls5/f;->d()I

    move-result v1

    invoke-interface {v0, v1}, Ls5/e;->b(I)Lu5/i;

    move-result-object v0

    return-object v0
.end method
