.class Lk0/f$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ly/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lk0/f;->q(Lk0/j;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ly/c<",
        "Landroidx/camera/video/internal/encoder/x0;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lk0/j;

.field final synthetic b:Lk0/f;


# direct methods
.method constructor <init>(Lk0/f;Lk0/j;)V
    .locals 0

    iput-object p1, p0, Lk0/f$b;->b:Lk0/f;

    iput-object p2, p0, Lk0/f$b;->a:Lk0/j;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Landroidx/camera/video/internal/encoder/x0;

    invoke-virtual {p0, p1}, Lk0/f$b;->b(Landroidx/camera/video/internal/encoder/x0;)V

    return-void
.end method

.method public b(Landroidx/camera/video/internal/encoder/x0;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lk0/f$b;->b:Lk0/f;

    .line 2
    .line 3
    iget-boolean v1, v0, Lk0/f;->h:Z

    .line 4
    .line 5
    if-eqz v1, :cond_2

    .line 6
    .line 7
    iget-object v0, v0, Lk0/f;->k:Lk0/j;

    .line 8
    .line 9
    iget-object v1, p0, Lk0/f$b;->a:Lk0/j;

    .line 10
    .line 11
    if-eq v0, v1, :cond_0

    .line 12
    .line 13
    goto :goto_1

    .line 14
    :cond_0
    invoke-interface {p1}, Landroidx/camera/video/internal/encoder/x0;->a()Ljava/nio/ByteBuffer;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    iget-object v1, p0, Lk0/f$b;->b:Lk0/f;

    .line 19
    .line 20
    iget-object v2, v1, Lk0/f;->d:Landroid/media/AudioRecord;

    .line 21
    .line 22
    iget v1, v1, Lk0/f;->e:I

    .line 23
    .line 24
    invoke-virtual {v2, v0, v1}, Landroid/media/AudioRecord;->read(Ljava/nio/ByteBuffer;I)I

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    if-lez v1, :cond_1

    .line 29
    .line 30
    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->limit(I)Ljava/nio/Buffer;

    .line 31
    .line 32
    .line 33
    iget-object v0, p0, Lk0/f$b;->b:Lk0/f;

    .line 34
    .line 35
    invoke-virtual {v0}, Lk0/f;->g()J

    .line 36
    .line 37
    .line 38
    move-result-wide v0

    .line 39
    invoke-interface {p1, v0, v1}, Landroidx/camera/video/internal/encoder/x0;->e(J)V

    .line 40
    .line 41
    .line 42
    invoke-interface {p1}, Landroidx/camera/video/internal/encoder/x0;->d()Z

    .line 43
    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_1
    const-string v0, "AudioSource"

    .line 47
    .line 48
    const-string v1, "Unable to read data from AudioRecord."

    .line 49
    .line 50
    invoke-static {v0, v1}, Landroidx/camera/core/r1;->k(Ljava/lang/String;Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    invoke-interface {p1}, Landroidx/camera/video/internal/encoder/x0;->cancel()Z

    .line 54
    .line 55
    .line 56
    :goto_0
    iget-object p1, p0, Lk0/f$b;->b:Lk0/f;

    .line 57
    .line 58
    invoke-virtual {p1}, Lk0/f;->r()V

    .line 59
    .line 60
    .line 61
    return-void

    .line 62
    :cond_2
    :goto_1
    invoke-interface {p1}, Landroidx/camera/video/internal/encoder/x0;->cancel()Z

    .line 63
    .line 64
    .line 65
    return-void
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

.method public onFailure(Ljava/lang/Throwable;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lk0/f$b;->b:Lk0/f;

    .line 2
    .line 3
    iget-object v0, v0, Lk0/f;->k:Lk0/j;

    .line 4
    .line 5
    iget-object v1, p0, Lk0/f$b;->a:Lk0/j;

    .line 6
    .line 7
    if-eq v0, v1, :cond_0

    .line 8
    .line 9
    const-string v0, "AudioSource"

    .line 10
    .line 11
    const-string v1, "Unable to get input buffer, the BufferProvider could be transitioning to INACTIVE state."

    .line 12
    .line 13
    invoke-static {v0, v1}, Landroidx/camera/core/r1;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    iget-object v0, p0, Lk0/f$b;->b:Lk0/f;

    .line 17
    .line 18
    invoke-virtual {v0, p1}, Lk0/f;->o(Ljava/lang/Throwable;)V

    .line 19
    .line 20
    .line 21
    :cond_0
    return-void
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
