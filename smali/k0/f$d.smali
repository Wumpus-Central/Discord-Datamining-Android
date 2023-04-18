.class Lk0/f$d;
.super Landroid/media/AudioManager$AudioRecordingCallback;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lk0/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "d"
.end annotation


# instance fields
.field final synthetic a:Lk0/f;


# direct methods
.method constructor <init>(Lk0/f;)V
    .locals 0

    iput-object p1, p0, Lk0/f$d;->a:Lk0/f;

    invoke-direct {p0}, Landroid/media/AudioManager$AudioRecordingCallback;-><init>()V

    return-void
.end method

.method public static synthetic a(Lk0/f$d;Z)V
    .locals 0

    invoke-direct {p0, p1}, Lk0/f$d;->b(Z)V

    return-void
.end method

.method private synthetic b(Z)V
    .locals 1

    iget-object v0, p0, Lk0/f$d;->a:Lk0/f;

    iget-object v0, v0, Lk0/f;->j:Lk0/f$e;

    invoke-interface {v0, p1}, Lk0/f$e;->a(Z)V

    return-void
.end method


# virtual methods
.method public onRecordingConfigChanged(Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroid/media/AudioRecordingConfiguration;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-super {p0, p1}, Landroid/media/AudioManager$AudioRecordingCallback;->onRecordingConfigChanged(Ljava/util/List;)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lk0/f$d;->a:Lk0/f;

    .line 5
    .line 6
    iget-object v1, v0, Lk0/f;->i:Ljava/util/concurrent/Executor;

    .line 7
    .line 8
    if-eqz v1, :cond_1

    .line 9
    .line 10
    iget-object v0, v0, Lk0/f;->j:Lk0/f$e;

    .line 11
    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-eqz v0, :cond_1

    .line 23
    .line 24
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    check-cast v0, Landroid/media/AudioRecordingConfiguration;

    .line 29
    .line 30
    invoke-static {v0}, Ll0/c;->a(Landroid/media/AudioRecordingConfiguration;)I

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    iget-object v2, p0, Lk0/f$d;->a:Lk0/f;

    .line 35
    .line 36
    iget-object v2, v2, Lk0/f;->d:Landroid/media/AudioRecord;

    .line 37
    .line 38
    invoke-virtual {v2}, Landroid/media/AudioRecord;->getAudioSessionId()I

    .line 39
    .line 40
    .line 41
    move-result v2

    .line 42
    if-ne v1, v2, :cond_0

    .line 43
    .line 44
    invoke-static {v0}, Ll0/j;->a(Landroid/media/AudioRecordingConfiguration;)Z

    .line 45
    .line 46
    .line 47
    move-result p1

    .line 48
    iget-object v0, p0, Lk0/f$d;->a:Lk0/f;

    .line 49
    .line 50
    iget-object v0, v0, Lk0/f;->c:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 51
    .line 52
    invoke-virtual {v0, p1}, Ljava/util/concurrent/atomic/AtomicBoolean;->getAndSet(Z)Z

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    if-eq v0, p1, :cond_1

    .line 57
    .line 58
    iget-object v0, p0, Lk0/f$d;->a:Lk0/f;

    .line 59
    .line 60
    iget-object v0, v0, Lk0/f;->i:Ljava/util/concurrent/Executor;

    .line 61
    .line 62
    new-instance v1, Lk0/g;

    .line 63
    .line 64
    invoke-direct {v1, p0, p1}, Lk0/g;-><init>(Lk0/f$d;Z)V

    .line 65
    .line 66
    .line 67
    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 68
    .line 69
    .line 70
    :cond_1
    return-void
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
