.class final Loe/c$a;
.super Ljava/lang/Thread;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Loe/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0005\u0008\u0082\u0004\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0008\u0010\u0008\u001a\u00020\u0006H\u0016\u00a8\u0006\u000b"
    }
    d2 = {
        "Loe/c$a;",
        "Ljava/lang/Thread;",
        "",
        "tag",
        "Lhe/c;",
        "inputFrame",
        "",
        "a",
        "run",
        "<init>",
        "(Loe/c;)V",
        "litr_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x4,
        0x2
    }
.end annotation


# instance fields
.field final synthetic k:Loe/c;


# direct methods
.method public constructor <init>(Loe/c;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Loe/c$a;->k:Loe/c;

    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    return-void
.end method

.method private final a(ILhe/c;)V
    .locals 9

    .line 1
    iget-object v0, p0, Loe/c$a;->k:Loe/c;

    .line 2
    .line 3
    invoke-static {v0}, Loe/c;->f(Loe/c;)Lhe/b;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-interface {v0, p1}, Lhe/b;->c(I)Lhe/c;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    if-eqz p1, :cond_3

    .line 12
    .line 13
    iget-object v0, p1, Lhe/c;->b:Ljava/nio/ByteBuffer;

    .line 14
    .line 15
    if-eqz v0, :cond_3

    .line 16
    .line 17
    iget-object v0, p2, Lhe/c;->b:Ljava/nio/ByteBuffer;

    .line 18
    .line 19
    if-eqz v0, :cond_3

    .line 20
    .line 21
    iget-object v1, p1, Lhe/c;->c:Landroid/media/MediaCodec$BufferInfo;

    .line 22
    .line 23
    const/4 v2, 0x0

    .line 24
    iput v2, v1, Landroid/media/MediaCodec$BufferInfo;->offset:I

    .line 25
    .line 26
    iget-object v3, p2, Lhe/c;->c:Landroid/media/MediaCodec$BufferInfo;

    .line 27
    .line 28
    iget v4, v3, Landroid/media/MediaCodec$BufferInfo;->flags:I

    .line 29
    .line 30
    iput v4, v1, Landroid/media/MediaCodec$BufferInfo;->flags:I

    .line 31
    .line 32
    iget-wide v3, v3, Landroid/media/MediaCodec$BufferInfo;->presentationTimeUs:J

    .line 33
    .line 34
    invoke-virtual {v0}, Ljava/nio/Buffer;->position()I

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    iget-object v5, p0, Loe/c$a;->k:Loe/c;

    .line 39
    .line 40
    invoke-static {v5}, Loe/c;->i(Loe/c;)I

    .line 41
    .line 42
    .line 43
    move-result v5

    .line 44
    mul-int/lit8 v5, v5, 0x2

    .line 45
    .line 46
    div-int/2addr v0, v5

    .line 47
    int-to-double v5, v0

    .line 48
    iget-object v0, p0, Loe/c$a;->k:Loe/c;

    .line 49
    .line 50
    invoke-static {v0}, Loe/c;->j(Loe/c;)D

    .line 51
    .line 52
    .line 53
    move-result-wide v7

    .line 54
    mul-double/2addr v5, v7

    .line 55
    double-to-long v5, v5

    .line 56
    add-long/2addr v3, v5

    .line 57
    iput-wide v3, v1, Landroid/media/MediaCodec$BufferInfo;->presentationTimeUs:J

    .line 58
    .line 59
    iget-object v0, p1, Lhe/c;->b:Ljava/nio/ByteBuffer;

    .line 60
    .line 61
    invoke-virtual {v0}, Ljava/nio/Buffer;->limit()I

    .line 62
    .line 63
    .line 64
    move-result v0

    .line 65
    iget-object v1, p2, Lhe/c;->b:Ljava/nio/ByteBuffer;

    .line 66
    .line 67
    invoke-virtual {v1}, Ljava/nio/Buffer;->remaining()I

    .line 68
    .line 69
    .line 70
    move-result v1

    .line 71
    if-lt v0, v1, :cond_0

    .line 72
    .line 73
    iget-object v0, p1, Lhe/c;->c:Landroid/media/MediaCodec$BufferInfo;

    .line 74
    .line 75
    iget-object v1, p2, Lhe/c;->b:Ljava/nio/ByteBuffer;

    .line 76
    .line 77
    invoke-virtual {v1}, Ljava/nio/Buffer;->remaining()I

    .line 78
    .line 79
    .line 80
    move-result v1

    .line 81
    iput v1, v0, Landroid/media/MediaCodec$BufferInfo;->size:I

    .line 82
    .line 83
    const/4 v0, 0x1

    .line 84
    goto :goto_0

    .line 85
    :cond_0
    iget-object v0, p1, Lhe/c;->c:Landroid/media/MediaCodec$BufferInfo;

    .line 86
    .line 87
    iget-object v1, p1, Lhe/c;->b:Ljava/nio/ByteBuffer;

    .line 88
    .line 89
    invoke-virtual {v1}, Ljava/nio/Buffer;->limit()I

    .line 90
    .line 91
    .line 92
    move-result v1

    .line 93
    iput v1, v0, Landroid/media/MediaCodec$BufferInfo;->size:I

    .line 94
    .line 95
    iget-object v0, p1, Lhe/c;->c:Landroid/media/MediaCodec$BufferInfo;

    .line 96
    .line 97
    iget v1, v0, Landroid/media/MediaCodec$BufferInfo;->flags:I

    .line 98
    .line 99
    and-int/lit8 v1, v1, -0x5

    .line 100
    .line 101
    iput v1, v0, Landroid/media/MediaCodec$BufferInfo;->flags:I

    .line 102
    .line 103
    move v0, v2

    .line 104
    :goto_0
    iget-object v1, p1, Lhe/c;->c:Landroid/media/MediaCodec$BufferInfo;

    .line 105
    .line 106
    iget v1, v1, Landroid/media/MediaCodec$BufferInfo;->size:I

    .line 107
    .line 108
    :goto_1
    if-ge v2, v1, :cond_1

    .line 109
    .line 110
    iget-object v3, p1, Lhe/c;->b:Ljava/nio/ByteBuffer;

    .line 111
    .line 112
    iget-object v4, p2, Lhe/c;->b:Ljava/nio/ByteBuffer;

    .line 113
    .line 114
    invoke-virtual {v4}, Ljava/nio/ByteBuffer;->get()B

    .line 115
    .line 116
    .line 117
    move-result v4

    .line 118
    invoke-virtual {v3, v4}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 119
    .line 120
    .line 121
    add-int/lit8 v2, v2, 0x1

    .line 122
    .line 123
    goto :goto_1

    .line 124
    :cond_1
    if-eqz v0, :cond_2

    .line 125
    .line 126
    iget-object v0, p0, Loe/c$a;->k:Loe/c;

    .line 127
    .line 128
    invoke-static {v0}, Loe/c;->h(Loe/c;)Ljava/util/concurrent/LinkedBlockingDeque;

    .line 129
    .line 130
    .line 131
    move-result-object v0

    .line 132
    invoke-virtual {v0}, Ljava/util/concurrent/LinkedBlockingDeque;->removeFirst()Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    iget-object v0, p0, Loe/c$a;->k:Loe/c;

    .line 136
    .line 137
    invoke-static {v0}, Loe/c;->e(Loe/c;)Lqe/a;

    .line 138
    .line 139
    .line 140
    move-result-object v0

    .line 141
    iget-object p2, p2, Lhe/c;->b:Ljava/nio/ByteBuffer;

    .line 142
    .line 143
    invoke-virtual {v0, p2}, Lqe/a;->d(Ljava/nio/ByteBuffer;)V

    .line 144
    .line 145
    .line 146
    :cond_2
    iget-object p2, p0, Loe/c$a;->k:Loe/c;

    .line 147
    .line 148
    invoke-static {p2}, Loe/c;->f(Loe/c;)Lhe/b;

    .line 149
    .line 150
    .line 151
    move-result-object p2

    .line 152
    invoke-interface {p2, p1}, Lhe/b;->a(Lhe/c;)V

    .line 153
    .line 154
    .line 155
    :cond_3
    return-void
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


# virtual methods
.method public run()V
    .locals 4

    .line 1
    :cond_0
    :goto_0
    iget-object v0, p0, Loe/c$a;->k:Loe/c;

    .line 2
    .line 3
    invoke-static {v0}, Loe/c;->g(Loe/c;)Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_3

    .line 12
    .line 13
    iget-object v0, p0, Loe/c$a;->k:Loe/c;

    .line 14
    .line 15
    invoke-static {v0}, Loe/c;->h(Loe/c;)Ljava/util/concurrent/LinkedBlockingDeque;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-virtual {v0}, Ljava/util/concurrent/LinkedBlockingDeque;->peekFirst()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    check-cast v0, Lhe/c;

    .line 24
    .line 25
    if-eqz v0, :cond_0

    .line 26
    .line 27
    iget-object v1, p0, Loe/c$a;->k:Loe/c;

    .line 28
    .line 29
    invoke-static {v1}, Loe/c;->f(Loe/c;)Lhe/b;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    const-wide/16 v2, 0x0

    .line 34
    .line 35
    invoke-interface {v1, v2, v3}, Lhe/b;->f(J)I

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    if-ltz v1, :cond_1

    .line 40
    .line 41
    invoke-direct {p0, v1, v0}, Loe/c$a;->a(ILhe/c;)V

    .line 42
    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_1
    const/4 v0, -0x1

    .line 46
    if-ne v1, v0, :cond_2

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_2
    new-instance v0, Ljava/lang/StringBuilder;

    .line 50
    .line 51
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 52
    .line 53
    .line 54
    const-string v2, "Unhandled value "

    .line 55
    .line 56
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    const-string v1, " when receiving decoded input frame"

    .line 63
    .line 64
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    const-string v1, "AudioRenderer"

    .line 72
    .line 73
    invoke-static {v1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 74
    .line 75
    .line 76
    goto :goto_0

    .line 77
    :cond_3
    iget-object v0, p0, Loe/c$a;->k:Loe/c;

    .line 78
    .line 79
    invoke-static {v0}, Loe/c;->h(Loe/c;)Ljava/util/concurrent/LinkedBlockingDeque;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    invoke-virtual {v0}, Ljava/util/concurrent/LinkedBlockingDeque;->clear()V

    .line 84
    .line 85
    .line 86
    return-void
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
