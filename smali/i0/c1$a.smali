.class Li0/c1$a;
.super Lw/k;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Li0/c1;->P(Ljava/lang/String;Lj0/a;Landroid/util/Size;)Lw/k2$b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Li0/c1;


# direct methods
.method constructor <init>(Li0/c1;)V
    .locals 0

    iput-object p1, p0, Li0/c1$a;->a:Li0/c1;

    invoke-direct {p0}, Lw/k;-><init>()V

    return-void
.end method


# virtual methods
.method public b(Lw/t;)V
    .locals 2

    .line 1
    invoke-super {p0, p1}, Lw/k;->b(Lw/t;)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Li0/c1$a;->a:Li0/c1;

    .line 5
    .line 6
    iget-object v0, v0, Li0/c1;->l:Ljava/lang/Object;

    .line 7
    .line 8
    monitor-enter v0

    .line 9
    :try_start_0
    iget-object v1, p0, Li0/c1$a;->a:Li0/c1;

    .line 10
    .line 11
    iget-object v1, v1, Li0/c1;->p:Landroidx/concurrent/futures/c$a;

    .line 12
    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    invoke-interface {p1}, Lw/t;->b()Lw/s2;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    const-string v1, "androidx.camera.video.VideoCapture.streamUpdate"

    .line 20
    .line 21
    invoke-virtual {p1, v1}, Lw/s2;->c(Ljava/lang/String;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    if-eqz p1, :cond_0

    .line 26
    .line 27
    check-cast p1, Ljava/lang/Integer;

    .line 28
    .line 29
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 30
    .line 31
    .line 32
    move-result p1

    .line 33
    iget-object v1, p0, Li0/c1$a;->a:Li0/c1;

    .line 34
    .line 35
    iget-object v1, v1, Li0/c1;->p:Landroidx/concurrent/futures/c$a;

    .line 36
    .line 37
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    if-ne p1, v1, :cond_0

    .line 42
    .line 43
    iget-object p1, p0, Li0/c1$a;->a:Li0/c1;

    .line 44
    .line 45
    iget-object p1, p1, Li0/c1;->p:Landroidx/concurrent/futures/c$a;

    .line 46
    .line 47
    const/4 v1, 0x0

    .line 48
    invoke-virtual {p1, v1}, Landroidx/concurrent/futures/c$a;->c(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    iget-object p1, p0, Li0/c1$a;->a:Li0/c1;

    .line 52
    .line 53
    iput-object v1, p1, Li0/c1;->p:Landroidx/concurrent/futures/c$a;

    .line 54
    .line 55
    :cond_0
    monitor-exit v0

    .line 56
    return-void

    .line 57
    :catchall_0
    move-exception p1

    .line 58
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 59
    throw p1
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
