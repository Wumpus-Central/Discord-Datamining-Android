.class Landroidx/camera/core/g1$h$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ly/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/camera/core/g1$h;->b()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ly/c<",
        "Landroidx/camera/core/ImageProxy;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Landroidx/camera/core/g1$g;

.field final synthetic b:Landroidx/camera/core/g1$h;


# direct methods
.method constructor <init>(Landroidx/camera/core/g1$h;Landroidx/camera/core/g1$g;)V
    .locals 0

    iput-object p1, p0, Landroidx/camera/core/g1$h$a;->b:Landroidx/camera/core/g1$h;

    iput-object p2, p0, Landroidx/camera/core/g1$h$a;->a:Landroidx/camera/core/g1$g;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Landroidx/camera/core/ImageProxy;

    invoke-virtual {p0, p1}, Landroidx/camera/core/g1$h$a;->b(Landroidx/camera/core/ImageProxy;)V

    return-void
.end method

.method public b(Landroidx/camera/core/ImageProxy;)V
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/camera/core/g1$h$a;->b:Landroidx/camera/core/g1$h;

    .line 2
    .line 3
    iget-object v0, v0, Landroidx/camera/core/g1$h;->h:Ljava/lang/Object;

    .line 4
    .line 5
    monitor-enter v0

    .line 6
    :try_start_0
    invoke-static {p1}, Landroidx/core/util/g;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    new-instance v1, Landroidx/camera/core/m2;

    .line 10
    .line 11
    invoke-direct {v1, p1}, Landroidx/camera/core/m2;-><init>(Landroidx/camera/core/ImageProxy;)V

    .line 12
    .line 13
    .line 14
    iget-object p1, p0, Landroidx/camera/core/g1$h$a;->b:Landroidx/camera/core/g1$h;

    .line 15
    .line 16
    invoke-virtual {v1, p1}, Landroidx/camera/core/i0;->b(Landroidx/camera/core/i0$a;)V

    .line 17
    .line 18
    .line 19
    iget-object p1, p0, Landroidx/camera/core/g1$h$a;->b:Landroidx/camera/core/g1$h;

    .line 20
    .line 21
    iget v2, p1, Landroidx/camera/core/g1$h;->d:I

    .line 22
    .line 23
    add-int/lit8 v2, v2, 0x1

    .line 24
    .line 25
    iput v2, p1, Landroidx/camera/core/g1$h;->d:I

    .line 26
    .line 27
    iget-object p1, p0, Landroidx/camera/core/g1$h$a;->a:Landroidx/camera/core/g1$g;

    .line 28
    .line 29
    invoke-virtual {p1, v1}, Landroidx/camera/core/g1$g;->c(Landroidx/camera/core/ImageProxy;)V

    .line 30
    .line 31
    .line 32
    iget-object p1, p0, Landroidx/camera/core/g1$h$a;->b:Landroidx/camera/core/g1$h;

    .line 33
    .line 34
    const/4 v1, 0x0

    .line 35
    iput-object v1, p1, Landroidx/camera/core/g1$h;->b:Landroidx/camera/core/g1$g;

    .line 36
    .line 37
    iput-object v1, p1, Landroidx/camera/core/g1$h;->c:Lfc/b;

    .line 38
    .line 39
    invoke-virtual {p1}, Landroidx/camera/core/g1$h;->b()V

    .line 40
    .line 41
    .line 42
    monitor-exit v0

    .line 43
    return-void

    .line 44
    :catchall_0
    move-exception p1

    .line 45
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 46
    throw p1
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

.method public onFailure(Ljava/lang/Throwable;)V
    .locals 4

    .line 1
    iget-object v0, p0, Landroidx/camera/core/g1$h$a;->b:Landroidx/camera/core/g1$h;

    .line 2
    .line 3
    iget-object v0, v0, Landroidx/camera/core/g1$h;->h:Ljava/lang/Object;

    .line 4
    .line 5
    monitor-enter v0

    .line 6
    :try_start_0
    instance-of v1, p1, Ljava/util/concurrent/CancellationException;

    .line 7
    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    goto :goto_1

    .line 11
    :cond_0
    iget-object v1, p0, Landroidx/camera/core/g1$h$a;->a:Landroidx/camera/core/g1$g;

    .line 12
    .line 13
    invoke-static {p1}, Landroidx/camera/core/g1;->b0(Ljava/lang/Throwable;)I

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    if-eqz p1, :cond_1

    .line 18
    .line 19
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    goto :goto_0

    .line 24
    :cond_1
    const-string v3, "Unknown error"

    .line 25
    .line 26
    :goto_0
    invoke-virtual {v1, v2, v3, p1}, Landroidx/camera/core/g1$g;->f(ILjava/lang/String;Ljava/lang/Throwable;)V

    .line 27
    .line 28
    .line 29
    :goto_1
    iget-object p1, p0, Landroidx/camera/core/g1$h$a;->b:Landroidx/camera/core/g1$h;

    .line 30
    .line 31
    const/4 v1, 0x0

    .line 32
    iput-object v1, p1, Landroidx/camera/core/g1$h;->b:Landroidx/camera/core/g1$g;

    .line 33
    .line 34
    iput-object v1, p1, Landroidx/camera/core/g1$h;->c:Lfc/b;

    .line 35
    .line 36
    invoke-virtual {p1}, Landroidx/camera/core/g1$h;->b()V

    .line 37
    .line 38
    .line 39
    monitor-exit v0

    .line 40
    return-void

    .line 41
    :catchall_0
    move-exception p1

    .line 42
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 43
    throw p1
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
.end method
