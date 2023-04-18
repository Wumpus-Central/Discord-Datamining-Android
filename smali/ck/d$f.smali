.class public final Lck/d$f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Loj/d;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lck/d;->p(Lokhttp3/OkHttpClient;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0018\u0010\n\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0008H\u0016\u00a8\u0006\u000b"
    }
    d2 = {
        "ck/d$f",
        "Loj/d;",
        "Lokhttp3/Call;",
        "call",
        "Lokhttp3/Response;",
        "response",
        "",
        "onResponse",
        "Ljava/io/IOException;",
        "e",
        "onFailure",
        "okhttp"
    }
    k = 0x1
    mv = {
        0x1,
        0x4,
        0x0
    }
.end annotation


# instance fields
.field final synthetic a:Lck/d;

.field final synthetic b:Lokhttp3/Request;


# direct methods
.method constructor <init>(Lck/d;Lokhttp3/Request;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lokhttp3/Request;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lck/d$f;->a:Lck/d;

    iput-object p2, p0, Lck/d$f;->b:Lokhttp3/Request;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onFailure(Lokhttp3/Call;Ljava/io/IOException;)V
    .locals 1

    .line 1
    const-string v0, "call"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string p1, "e"

    .line 7
    .line 8
    invoke-static {p2, p1}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object p1, p0, Lck/d$f;->a:Lck/d;

    .line 12
    .line 13
    const/4 v0, 0x0

    .line 14
    invoke-virtual {p1, p2, v0}, Lck/d;->q(Ljava/lang/Exception;Lokhttp3/Response;)V

    .line 15
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
.end method

.method public onResponse(Lokhttp3/Call;Lokhttp3/Response;)V
    .locals 4

    .line 1
    const-string v0, "call"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string p1, "response"

    .line 7
    .line 8
    invoke-static {p2, p1}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p2}, Lokhttp3/Response;->p()Ltj/c;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    :try_start_0
    iget-object v0, p0, Lck/d$f;->a:Lck/d;

    .line 16
    .line 17
    invoke-virtual {v0, p2, p1}, Lck/d;->n(Lokhttp3/Response;Ltj/c;)V

    .line 18
    .line 19
    .line 20
    invoke-static {p1}, Lkotlin/jvm/internal/q;->d(Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p1}, Ltj/c;->m()Lck/d$d;

    .line 24
    .line 25
    .line 26
    move-result-object p1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1

    .line 27
    sget-object v0, Lck/e;->g:Lck/e$a;

    .line 28
    .line 29
    invoke-virtual {p2}, Lokhttp3/Response;->y()Lokhttp3/Headers;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    invoke-virtual {v0, v1}, Lck/e$a;->a(Lokhttp3/Headers;)Lck/e;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    iget-object v1, p0, Lck/d$f;->a:Lck/d;

    .line 38
    .line 39
    invoke-static {v1, v0}, Lck/d;->l(Lck/d;Lck/e;)V

    .line 40
    .line 41
    .line 42
    iget-object v1, p0, Lck/d$f;->a:Lck/d;

    .line 43
    .line 44
    invoke-static {v1, v0}, Lck/d;->k(Lck/d;Lck/e;)Z

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    if-nez v0, :cond_0

    .line 49
    .line 50
    iget-object v0, p0, Lck/d$f;->a:Lck/d;

    .line 51
    .line 52
    monitor-enter v0

    .line 53
    :try_start_1
    iget-object v1, p0, Lck/d$f;->a:Lck/d;

    .line 54
    .line 55
    invoke-static {v1}, Lck/d;->i(Lck/d;)Ljava/util/ArrayDeque;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    invoke-virtual {v1}, Ljava/util/ArrayDeque;->clear()V

    .line 60
    .line 61
    .line 62
    iget-object v1, p0, Lck/d$f;->a:Lck/d;

    .line 63
    .line 64
    const-string v2, "unexpected Sec-WebSocket-Extensions in response header"

    .line 65
    .line 66
    const/16 v3, 0x3f2

    .line 67
    .line 68
    invoke-virtual {v1, v3, v2}, Lck/d;->f(ILjava/lang/String;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 69
    .line 70
    .line 71
    monitor-exit v0

    .line 72
    goto :goto_0

    .line 73
    :catchall_0
    move-exception p1

    .line 74
    monitor-exit v0

    .line 75
    throw p1

    .line 76
    :cond_0
    :goto_0
    :try_start_2
    new-instance v0, Ljava/lang/StringBuilder;

    .line 77
    .line 78
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 79
    .line 80
    .line 81
    sget-object v1, Lpj/c;->i:Ljava/lang/String;

    .line 82
    .line 83
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 84
    .line 85
    .line 86
    const-string v1, " WebSocket "

    .line 87
    .line 88
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 89
    .line 90
    .line 91
    iget-object v1, p0, Lck/d$f;->b:Lokhttp3/Request;

    .line 92
    .line 93
    invoke-virtual {v1}, Lokhttp3/Request;->l()Lokhttp3/HttpUrl;

    .line 94
    .line 95
    .line 96
    move-result-object v1

    .line 97
    invoke-virtual {v1}, Lokhttp3/HttpUrl;->o()Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object v1

    .line 101
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 102
    .line 103
    .line 104
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object v0

    .line 108
    iget-object v1, p0, Lck/d$f;->a:Lck/d;

    .line 109
    .line 110
    invoke-virtual {v1, v0, p1}, Lck/d;->s(Ljava/lang/String;Lck/d$d;)V

    .line 111
    .line 112
    .line 113
    iget-object p1, p0, Lck/d$f;->a:Lck/d;

    .line 114
    .line 115
    invoke-virtual {p1}, Lck/d;->r()Loj/t;

    .line 116
    .line 117
    .line 118
    move-result-object p1

    .line 119
    iget-object v0, p0, Lck/d$f;->a:Lck/d;

    .line 120
    .line 121
    invoke-virtual {p1, v0, p2}, Loj/t;->onOpen(Lokhttp3/WebSocket;Lokhttp3/Response;)V

    .line 122
    .line 123
    .line 124
    iget-object p1, p0, Lck/d$f;->a:Lck/d;

    .line 125
    .line 126
    invoke-virtual {p1}, Lck/d;->u()V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 127
    .line 128
    .line 129
    goto :goto_1

    .line 130
    :catch_0
    move-exception p1

    .line 131
    iget-object p2, p0, Lck/d$f;->a:Lck/d;

    .line 132
    .line 133
    const/4 v0, 0x0

    .line 134
    invoke-virtual {p2, p1, v0}, Lck/d;->q(Ljava/lang/Exception;Lokhttp3/Response;)V

    .line 135
    .line 136
    .line 137
    :goto_1
    return-void

    .line 138
    :catch_1
    move-exception v0

    .line 139
    if-eqz p1, :cond_1

    .line 140
    .line 141
    invoke-virtual {p1}, Ltj/c;->u()V

    .line 142
    .line 143
    .line 144
    :cond_1
    iget-object p1, p0, Lck/d$f;->a:Lck/d;

    .line 145
    .line 146
    invoke-virtual {p1, v0, p2}, Lck/d;->q(Ljava/lang/Exception;Lokhttp3/Response;)V

    .line 147
    .line 148
    .line 149
    invoke-static {p2}, Lpj/c;->j(Ljava/io/Closeable;)V

    .line 150
    .line 151
    .line 152
    return-void
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
