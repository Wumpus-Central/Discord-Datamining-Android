.class Lj2/o$a;
.super Lt2/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lj2/o;->q(Lt2/c;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lt2/c<",
        "Ll2/b;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic d:Lt2/b;

.field final synthetic e:Lt2/c;

.field final synthetic f:Ll2/b;

.field final synthetic g:Lj2/o;


# direct methods
.method constructor <init>(Lj2/o;Lt2/b;Lt2/c;Ll2/b;)V
    .locals 0

    iput-object p1, p0, Lj2/o$a;->g:Lj2/o;

    iput-object p2, p0, Lj2/o$a;->d:Lt2/b;

    iput-object p3, p0, Lj2/o$a;->e:Lt2/c;

    iput-object p4, p0, Lj2/o$a;->f:Ll2/b;

    invoke-direct {p0}, Lt2/c;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Lt2/b;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lj2/o$a;->d(Lt2/b;)Ll2/b;

    move-result-object p1

    return-object p1
.end method

.method public d(Lt2/b;)Ll2/b;
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lt2/b<",
            "Ll2/b;",
            ">;)",
            "Ll2/b;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lj2/o$a;->d:Lt2/b;

    .line 2
    .line 3
    invoke-virtual {p1}, Lt2/b;->f()F

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    invoke-virtual {p1}, Lt2/b;->a()F

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    invoke-virtual {p1}, Lt2/b;->g()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v3

    .line 15
    check-cast v3, Ll2/b;

    .line 16
    .line 17
    iget-object v3, v3, Ll2/b;->a:Ljava/lang/String;

    .line 18
    .line 19
    invoke-virtual {p1}, Lt2/b;->b()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v4

    .line 23
    check-cast v4, Ll2/b;

    .line 24
    .line 25
    iget-object v4, v4, Ll2/b;->a:Ljava/lang/String;

    .line 26
    .line 27
    invoke-virtual {p1}, Lt2/b;->d()F

    .line 28
    .line 29
    .line 30
    move-result v5

    .line 31
    invoke-virtual {p1}, Lt2/b;->c()F

    .line 32
    .line 33
    .line 34
    move-result v6

    .line 35
    invoke-virtual {p1}, Lt2/b;->e()F

    .line 36
    .line 37
    .line 38
    move-result v7

    .line 39
    invoke-virtual/range {v0 .. v7}, Lt2/b;->h(FFLjava/lang/Object;Ljava/lang/Object;FFF)Lt2/b;

    .line 40
    .line 41
    .line 42
    iget-object v0, p0, Lj2/o$a;->e:Lt2/c;

    .line 43
    .line 44
    iget-object v1, p0, Lj2/o$a;->d:Lt2/b;

    .line 45
    .line 46
    invoke-virtual {v0, v1}, Lt2/c;->a(Lt2/b;)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    move-object v2, v0

    .line 51
    check-cast v2, Ljava/lang/String;

    .line 52
    .line 53
    invoke-virtual {p1}, Lt2/b;->c()F

    .line 54
    .line 55
    .line 56
    move-result v0

    .line 57
    const/high16 v1, 0x3f800000    # 1.0f

    .line 58
    .line 59
    cmpl-float v0, v0, v1

    .line 60
    .line 61
    if-nez v0, :cond_0

    .line 62
    .line 63
    invoke-virtual {p1}, Lt2/b;->b()Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    goto :goto_0

    .line 68
    :cond_0
    invoke-virtual {p1}, Lt2/b;->g()Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    :goto_0
    check-cast p1, Ll2/b;

    .line 73
    .line 74
    iget-object v1, p0, Lj2/o$a;->f:Ll2/b;

    .line 75
    .line 76
    iget-object v3, p1, Ll2/b;->b:Ljava/lang/String;

    .line 77
    .line 78
    iget v4, p1, Ll2/b;->c:F

    .line 79
    .line 80
    iget-object v5, p1, Ll2/b;->d:Ll2/b$a;

    .line 81
    .line 82
    iget v6, p1, Ll2/b;->e:I

    .line 83
    .line 84
    iget v7, p1, Ll2/b;->f:F

    .line 85
    .line 86
    iget v8, p1, Ll2/b;->g:F

    .line 87
    .line 88
    iget v9, p1, Ll2/b;->h:I

    .line 89
    .line 90
    iget v10, p1, Ll2/b;->i:I

    .line 91
    .line 92
    iget v11, p1, Ll2/b;->j:F

    .line 93
    .line 94
    iget-boolean v12, p1, Ll2/b;->k:Z

    .line 95
    .line 96
    invoke-virtual/range {v1 .. v12}, Ll2/b;->a(Ljava/lang/String;Ljava/lang/String;FLl2/b$a;IFFIIFZ)V

    .line 97
    .line 98
    .line 99
    iget-object p1, p0, Lj2/o$a;->f:Ll2/b;

    .line 100
    .line 101
    return-object p1
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
