.class public final Li0/u;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Landroid/content/Context;

.field private final b:Li0/o0;

.field private final c:Li0/s;

.field private d:Landroidx/core/util/b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/core/util/b<",
            "Li0/i1;",
            ">;"
        }
    .end annotation
.end field

.field private e:Ljava/util/concurrent/Executor;

.field private f:Z


# direct methods
.method constructor <init>(Landroid/content/Context;Li0/o0;Li0/s;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, Li0/u;->f:Z

    .line 6
    .line 7
    invoke-static {p1}, Landroidx/camera/core/impl/utils/j;->a(Landroid/content/Context;)Landroid/content/Context;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    iput-object p1, p0, Li0/u;->a:Landroid/content/Context;

    .line 12
    .line 13
    iput-object p2, p0, Li0/u;->b:Li0/o0;

    .line 14
    .line 15
    iput-object p3, p0, Li0/u;->c:Li0/s;

    .line 16
    .line 17
    return-void
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
.end method


# virtual methods
.method a()Landroid/content/Context;
    .locals 1

    iget-object v0, p0, Li0/u;->a:Landroid/content/Context;

    return-object v0
.end method

.method b()Landroidx/core/util/b;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/core/util/b<",
            "Li0/i1;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Li0/u;->d:Landroidx/core/util/b;

    return-object v0
.end method

.method c()Ljava/util/concurrent/Executor;
    .locals 1

    iget-object v0, p0, Li0/u;->e:Ljava/util/concurrent/Executor;

    return-object v0
.end method

.method d()Li0/s;
    .locals 1

    iget-object v0, p0, Li0/u;->c:Li0/s;

    return-object v0
.end method

.method e()Li0/o0;
    .locals 1

    iget-object v0, p0, Li0/u;->b:Li0/o0;

    return-object v0
.end method

.method f()Z
    .locals 1

    iget-boolean v0, p0, Li0/u;->f:Z

    return v0
.end method

.method public g(Ljava/util/concurrent/Executor;Landroidx/core/util/b;)Li0/x0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/concurrent/Executor;",
            "Landroidx/core/util/b<",
            "Li0/i1;",
            ">;)",
            "Li0/x0;"
        }
    .end annotation

    .line 1
    const-string v0, "Listener Executor can\'t be null."

    .line 2
    .line 3
    invoke-static {p1, v0}, Landroidx/core/util/g;->h(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    const-string v0, "Event listener can\'t be null"

    .line 7
    .line 8
    invoke-static {p2, v0}, Landroidx/core/util/g;->h(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    iput-object p1, p0, Li0/u;->e:Ljava/util/concurrent/Executor;

    .line 12
    .line 13
    iput-object p2, p0, Li0/u;->d:Landroidx/core/util/b;

    .line 14
    .line 15
    iget-object p1, p0, Li0/u;->b:Li0/o0;

    .line 16
    .line 17
    invoke-virtual {p1, p0}, Li0/o0;->x0(Li0/u;)Li0/x0;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    return-object p1
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
.end method

.method public h()Li0/u;
    .locals 2

    .line 1
    iget-object v0, p0, Li0/u;->a:Landroid/content/Context;

    .line 2
    .line 3
    const-string v1, "android.permission.RECORD_AUDIO"

    .line 4
    .line 5
    invoke-static {v0, v1}, Landroidx/core/content/h;->b(Landroid/content/Context;Ljava/lang/String;)I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v1, -0x1

    .line 10
    if-eq v0, v1, :cond_0

    .line 11
    .line 12
    iget-object v0, p0, Li0/u;->b:Li0/o0;

    .line 13
    .line 14
    invoke-virtual {v0}, Li0/o0;->F()Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    const-string v1, "The Recorder this recording is associated to doesn\'t support audio."

    .line 19
    .line 20
    invoke-static {v0, v1}, Landroidx/core/util/g;->j(ZLjava/lang/String;)V

    .line 21
    .line 22
    .line 23
    const/4 v0, 0x1

    .line 24
    iput-boolean v0, p0, Li0/u;->f:Z

    .line 25
    .line 26
    return-object p0

    .line 27
    :cond_0
    new-instance v0, Ljava/lang/SecurityException;

    .line 28
    .line 29
    const-string v1, "Attempted to enable audio for recording but application does not have RECORD_AUDIO permission granted."

    .line 30
    .line 31
    invoke-direct {v0, v1}, Ljava/lang/SecurityException;-><init>(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    throw v0
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
.end method
