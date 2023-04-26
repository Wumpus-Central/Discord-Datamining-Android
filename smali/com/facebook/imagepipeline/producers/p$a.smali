.class Lcom/facebook/imagepipeline/producers/p$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La2/d;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/imagepipeline/producers/p;->h(Lcom/facebook/imagepipeline/producers/Consumer;Lcom/facebook/imagepipeline/producers/ProducerContext;)La2/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "La2/d<",
        "Lu5/e;",
        "Ljava/lang/Void;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/imagepipeline/producers/n0;

.field final synthetic b:Lcom/facebook/imagepipeline/producers/ProducerContext;

.field final synthetic c:Lcom/facebook/imagepipeline/producers/Consumer;

.field final synthetic d:Lcom/facebook/imagepipeline/producers/p;


# direct methods
.method constructor <init>(Lcom/facebook/imagepipeline/producers/p;Lcom/facebook/imagepipeline/producers/n0;Lcom/facebook/imagepipeline/producers/ProducerContext;Lcom/facebook/imagepipeline/producers/Consumer;)V
    .locals 0

    iput-object p1, p0, Lcom/facebook/imagepipeline/producers/p$a;->d:Lcom/facebook/imagepipeline/producers/p;

    iput-object p2, p0, Lcom/facebook/imagepipeline/producers/p$a;->a:Lcom/facebook/imagepipeline/producers/n0;

    iput-object p3, p0, Lcom/facebook/imagepipeline/producers/p$a;->b:Lcom/facebook/imagepipeline/producers/ProducerContext;

    iput-object p4, p0, Lcom/facebook/imagepipeline/producers/p$a;->c:Lcom/facebook/imagepipeline/producers/Consumer;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(La2/f;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/facebook/imagepipeline/producers/p$a;->b(La2/f;)Ljava/lang/Void;

    move-result-object p1

    return-object p1
.end method

.method public b(La2/f;)Ljava/lang/Void;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "La2/f<",
            "Lu5/e;",
            ">;)",
            "Ljava/lang/Void;"
        }
    .end annotation

    .line 1
    invoke-static {p1}, Lcom/facebook/imagepipeline/producers/p;->c(La2/f;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    const-string v2, "DiskCacheProducer"

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    iget-object p1, p0, Lcom/facebook/imagepipeline/producers/p$a;->a:Lcom/facebook/imagepipeline/producers/n0;

    .line 11
    .line 12
    iget-object v0, p0, Lcom/facebook/imagepipeline/producers/p$a;->b:Lcom/facebook/imagepipeline/producers/ProducerContext;

    .line 13
    .line 14
    invoke-interface {p1, v0, v2, v1}, Lcom/facebook/imagepipeline/producers/n0;->c(Lcom/facebook/imagepipeline/producers/ProducerContext;Ljava/lang/String;Ljava/util/Map;)V

    .line 15
    .line 16
    .line 17
    iget-object p1, p0, Lcom/facebook/imagepipeline/producers/p$a;->c:Lcom/facebook/imagepipeline/producers/Consumer;

    .line 18
    .line 19
    invoke-interface {p1}, Lcom/facebook/imagepipeline/producers/Consumer;->a()V

    .line 20
    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    invoke-virtual {p1}, La2/f;->n()Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-eqz v0, :cond_1

    .line 28
    .line 29
    iget-object v0, p0, Lcom/facebook/imagepipeline/producers/p$a;->a:Lcom/facebook/imagepipeline/producers/n0;

    .line 30
    .line 31
    iget-object v3, p0, Lcom/facebook/imagepipeline/producers/p$a;->b:Lcom/facebook/imagepipeline/producers/ProducerContext;

    .line 32
    .line 33
    invoke-virtual {p1}, La2/f;->i()Ljava/lang/Exception;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    invoke-interface {v0, v3, v2, p1, v1}, Lcom/facebook/imagepipeline/producers/n0;->k(Lcom/facebook/imagepipeline/producers/ProducerContext;Ljava/lang/String;Ljava/lang/Throwable;Ljava/util/Map;)V

    .line 38
    .line 39
    .line 40
    iget-object p1, p0, Lcom/facebook/imagepipeline/producers/p$a;->d:Lcom/facebook/imagepipeline/producers/p;

    .line 41
    .line 42
    invoke-static {p1}, Lcom/facebook/imagepipeline/producers/p;->d(Lcom/facebook/imagepipeline/producers/p;)Lcom/facebook/imagepipeline/producers/l0;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    iget-object v0, p0, Lcom/facebook/imagepipeline/producers/p$a;->c:Lcom/facebook/imagepipeline/producers/Consumer;

    .line 47
    .line 48
    iget-object v2, p0, Lcom/facebook/imagepipeline/producers/p$a;->b:Lcom/facebook/imagepipeline/producers/ProducerContext;

    .line 49
    .line 50
    invoke-interface {p1, v0, v2}, Lcom/facebook/imagepipeline/producers/l0;->b(Lcom/facebook/imagepipeline/producers/Consumer;Lcom/facebook/imagepipeline/producers/ProducerContext;)V

    .line 51
    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_1
    invoke-virtual {p1}, La2/f;->j()Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    check-cast p1, Lu5/e;

    .line 59
    .line 60
    if-eqz p1, :cond_2

    .line 61
    .line 62
    iget-object v0, p0, Lcom/facebook/imagepipeline/producers/p$a;->a:Lcom/facebook/imagepipeline/producers/n0;

    .line 63
    .line 64
    iget-object v3, p0, Lcom/facebook/imagepipeline/producers/p$a;->b:Lcom/facebook/imagepipeline/producers/ProducerContext;

    .line 65
    .line 66
    invoke-virtual {p1}, Lu5/e;->R()I

    .line 67
    .line 68
    .line 69
    move-result v4

    .line 70
    const/4 v5, 0x1

    .line 71
    invoke-static {v0, v3, v5, v4}, Lcom/facebook/imagepipeline/producers/p;->e(Lcom/facebook/imagepipeline/producers/n0;Lcom/facebook/imagepipeline/producers/ProducerContext;ZI)Ljava/util/Map;

    .line 72
    .line 73
    .line 74
    move-result-object v4

    .line 75
    invoke-interface {v0, v3, v2, v4}, Lcom/facebook/imagepipeline/producers/n0;->j(Lcom/facebook/imagepipeline/producers/ProducerContext;Ljava/lang/String;Ljava/util/Map;)V

    .line 76
    .line 77
    .line 78
    iget-object v0, p0, Lcom/facebook/imagepipeline/producers/p$a;->a:Lcom/facebook/imagepipeline/producers/n0;

    .line 79
    .line 80
    iget-object v3, p0, Lcom/facebook/imagepipeline/producers/p$a;->b:Lcom/facebook/imagepipeline/producers/ProducerContext;

    .line 81
    .line 82
    invoke-interface {v0, v3, v2, v5}, Lcom/facebook/imagepipeline/producers/n0;->b(Lcom/facebook/imagepipeline/producers/ProducerContext;Ljava/lang/String;Z)V

    .line 83
    .line 84
    .line 85
    iget-object v0, p0, Lcom/facebook/imagepipeline/producers/p$a;->b:Lcom/facebook/imagepipeline/producers/ProducerContext;

    .line 86
    .line 87
    const-string v2, "disk"

    .line 88
    .line 89
    invoke-interface {v0, v2}, Lcom/facebook/imagepipeline/producers/ProducerContext;->g(Ljava/lang/String;)V

    .line 90
    .line 91
    .line 92
    iget-object v0, p0, Lcom/facebook/imagepipeline/producers/p$a;->c:Lcom/facebook/imagepipeline/producers/Consumer;

    .line 93
    .line 94
    const/high16 v2, 0x3f800000    # 1.0f

    .line 95
    .line 96
    invoke-interface {v0, v2}, Lcom/facebook/imagepipeline/producers/Consumer;->c(F)V

    .line 97
    .line 98
    .line 99
    iget-object v0, p0, Lcom/facebook/imagepipeline/producers/p$a;->c:Lcom/facebook/imagepipeline/producers/Consumer;

    .line 100
    .line 101
    invoke-interface {v0, p1, v5}, Lcom/facebook/imagepipeline/producers/Consumer;->b(Ljava/lang/Object;I)V

    .line 102
    .line 103
    .line 104
    invoke-virtual {p1}, Lu5/e;->close()V

    .line 105
    .line 106
    .line 107
    goto :goto_0

    .line 108
    :cond_2
    iget-object p1, p0, Lcom/facebook/imagepipeline/producers/p$a;->a:Lcom/facebook/imagepipeline/producers/n0;

    .line 109
    .line 110
    iget-object v0, p0, Lcom/facebook/imagepipeline/producers/p$a;->b:Lcom/facebook/imagepipeline/producers/ProducerContext;

    .line 111
    .line 112
    const/4 v3, 0x0

    .line 113
    invoke-static {p1, v0, v3, v3}, Lcom/facebook/imagepipeline/producers/p;->e(Lcom/facebook/imagepipeline/producers/n0;Lcom/facebook/imagepipeline/producers/ProducerContext;ZI)Ljava/util/Map;

    .line 114
    .line 115
    .line 116
    move-result-object v3

    .line 117
    invoke-interface {p1, v0, v2, v3}, Lcom/facebook/imagepipeline/producers/n0;->j(Lcom/facebook/imagepipeline/producers/ProducerContext;Ljava/lang/String;Ljava/util/Map;)V

    .line 118
    .line 119
    .line 120
    iget-object p1, p0, Lcom/facebook/imagepipeline/producers/p$a;->d:Lcom/facebook/imagepipeline/producers/p;

    .line 121
    .line 122
    invoke-static {p1}, Lcom/facebook/imagepipeline/producers/p;->d(Lcom/facebook/imagepipeline/producers/p;)Lcom/facebook/imagepipeline/producers/l0;

    .line 123
    .line 124
    .line 125
    move-result-object p1

    .line 126
    iget-object v0, p0, Lcom/facebook/imagepipeline/producers/p$a;->c:Lcom/facebook/imagepipeline/producers/Consumer;

    .line 127
    .line 128
    iget-object v2, p0, Lcom/facebook/imagepipeline/producers/p$a;->b:Lcom/facebook/imagepipeline/producers/ProducerContext;

    .line 129
    .line 130
    invoke-interface {p1, v0, v2}, Lcom/facebook/imagepipeline/producers/l0;->b(Lcom/facebook/imagepipeline/producers/Consumer;Lcom/facebook/imagepipeline/producers/ProducerContext;)V

    .line 131
    .line 132
    .line 133
    :goto_0
    return-object v1
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
.end method
