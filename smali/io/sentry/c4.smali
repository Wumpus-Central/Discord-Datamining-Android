.class public Lio/sentry/c4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/sentry/b1;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/sentry/c4$a;
    }
.end annotation


# instance fields
.field private final k:Lio/sentry/protocol/p;

.field private final l:Lio/sentry/e4;

.field private final m:Lio/sentry/e4;

.field private transient n:Lio/sentry/m4;

.field protected o:Ljava/lang/String;

.field protected p:Ljava/lang/String;

.field protected q:Lio/sentry/f4;

.field protected r:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private s:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lio/sentry/c4;)V
    .locals 1

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 13
    new-instance v0, Lj$/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Lj$/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object v0, p0, Lio/sentry/c4;->r:Ljava/util/Map;

    .line 14
    iget-object v0, p1, Lio/sentry/c4;->k:Lio/sentry/protocol/p;

    iput-object v0, p0, Lio/sentry/c4;->k:Lio/sentry/protocol/p;

    .line 15
    iget-object v0, p1, Lio/sentry/c4;->l:Lio/sentry/e4;

    iput-object v0, p0, Lio/sentry/c4;->l:Lio/sentry/e4;

    .line 16
    iget-object v0, p1, Lio/sentry/c4;->m:Lio/sentry/e4;

    iput-object v0, p0, Lio/sentry/c4;->m:Lio/sentry/e4;

    .line 17
    iget-object v0, p1, Lio/sentry/c4;->n:Lio/sentry/m4;

    iput-object v0, p0, Lio/sentry/c4;->n:Lio/sentry/m4;

    .line 18
    iget-object v0, p1, Lio/sentry/c4;->o:Ljava/lang/String;

    iput-object v0, p0, Lio/sentry/c4;->o:Ljava/lang/String;

    .line 19
    iget-object v0, p1, Lio/sentry/c4;->p:Ljava/lang/String;

    iput-object v0, p0, Lio/sentry/c4;->p:Ljava/lang/String;

    .line 20
    iget-object v0, p1, Lio/sentry/c4;->q:Lio/sentry/f4;

    iput-object v0, p0, Lio/sentry/c4;->q:Lio/sentry/f4;

    .line 21
    iget-object p1, p1, Lio/sentry/c4;->r:Ljava/util/Map;

    invoke-static {p1}, Lio/sentry/util/a;->b(Ljava/util/Map;)Ljava/util/Map;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 22
    iput-object p1, p0, Lio/sentry/c4;->r:Ljava/util/Map;

    :cond_0
    return-void
.end method

.method public constructor <init>(Lio/sentry/protocol/p;Lio/sentry/e4;Lio/sentry/e4;Ljava/lang/String;Ljava/lang/String;Lio/sentry/m4;Lio/sentry/f4;)V
    .locals 1

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    new-instance v0, Lj$/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Lj$/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object v0, p0, Lio/sentry/c4;->r:Ljava/util/Map;

    const-string v0, "traceId is required"

    .line 5
    invoke-static {p1, v0}, Lio/sentry/util/k;->a(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lio/sentry/protocol/p;

    iput-object p1, p0, Lio/sentry/c4;->k:Lio/sentry/protocol/p;

    const-string p1, "spanId is required"

    .line 6
    invoke-static {p2, p1}, Lio/sentry/util/k;->a(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lio/sentry/e4;

    iput-object p1, p0, Lio/sentry/c4;->l:Lio/sentry/e4;

    const-string p1, "operation is required"

    .line 7
    invoke-static {p4, p1}, Lio/sentry/util/k;->a(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    iput-object p1, p0, Lio/sentry/c4;->o:Ljava/lang/String;

    .line 8
    iput-object p3, p0, Lio/sentry/c4;->m:Lio/sentry/e4;

    .line 9
    iput-object p6, p0, Lio/sentry/c4;->n:Lio/sentry/m4;

    .line 10
    iput-object p5, p0, Lio/sentry/c4;->p:Ljava/lang/String;

    .line 11
    iput-object p7, p0, Lio/sentry/c4;->q:Lio/sentry/f4;

    return-void
.end method

.method public constructor <init>(Lio/sentry/protocol/p;Lio/sentry/e4;Ljava/lang/String;Lio/sentry/e4;Lio/sentry/m4;)V
    .locals 8

    const/4 v5, 0x0

    const/4 v7, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p4

    move-object v4, p3

    move-object v6, p5

    .line 2
    invoke-direct/range {v0 .. v7}, Lio/sentry/c4;-><init>(Lio/sentry/protocol/p;Lio/sentry/e4;Lio/sentry/e4;Ljava/lang/String;Ljava/lang/String;Lio/sentry/m4;Lio/sentry/f4;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 6

    .line 1
    new-instance v1, Lio/sentry/protocol/p;

    invoke-direct {v1}, Lio/sentry/protocol/p;-><init>()V

    new-instance v2, Lio/sentry/e4;

    invoke-direct {v2}, Lio/sentry/e4;-><init>()V

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v0, p0

    move-object v3, p1

    invoke-direct/range {v0 .. v5}, Lio/sentry/c4;-><init>(Lio/sentry/protocol/p;Lio/sentry/e4;Ljava/lang/String;Lio/sentry/e4;Lio/sentry/m4;)V

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/sentry/c4;->p:Ljava/lang/String;

    return-object v0
.end method

.method public b()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/sentry/c4;->o:Ljava/lang/String;

    return-object v0
.end method

.method public c()Lio/sentry/e4;
    .locals 1

    iget-object v0, p0, Lio/sentry/c4;->m:Lio/sentry/e4;

    return-object v0
.end method

.method public d()Ljava/lang/Boolean;
    .locals 1

    .line 1
    iget-object v0, p0, Lio/sentry/c4;->n:Lio/sentry/m4;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    return-object v0

    .line 7
    :cond_0
    invoke-virtual {v0}, Lio/sentry/m4;->a()Ljava/lang/Boolean;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    return-object v0
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method

.method public e()Ljava/lang/Boolean;
    .locals 1

    .line 1
    iget-object v0, p0, Lio/sentry/c4;->n:Lio/sentry/m4;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    return-object v0

    .line 7
    :cond_0
    invoke-virtual {v0}, Lio/sentry/m4;->c()Ljava/lang/Boolean;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    return-object v0
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method

.method public f()Lio/sentry/m4;
    .locals 1

    iget-object v0, p0, Lio/sentry/c4;->n:Lio/sentry/m4;

    return-object v0
.end method

.method public g()Lio/sentry/e4;
    .locals 1

    iget-object v0, p0, Lio/sentry/c4;->l:Lio/sentry/e4;

    return-object v0
.end method

.method public h()Lio/sentry/f4;
    .locals 1

    iget-object v0, p0, Lio/sentry/c4;->q:Lio/sentry/f4;

    return-object v0
.end method

.method public i()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/sentry/c4;->r:Ljava/util/Map;

    return-object v0
.end method

.method public j()Lio/sentry/protocol/p;
    .locals 1

    iget-object v0, p0, Lio/sentry/c4;->k:Lio/sentry/protocol/p;

    return-object v0
.end method

.method public k(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lio/sentry/c4;->p:Ljava/lang/String;

    return-void
.end method

.method public l(Lio/sentry/m4;)V
    .locals 0

    iput-object p1, p0, Lio/sentry/c4;->n:Lio/sentry/m4;

    return-void
.end method

.method public m(Lio/sentry/f4;)V
    .locals 0

    iput-object p1, p0, Lio/sentry/c4;->q:Lio/sentry/f4;

    return-void
.end method

.method public n(Ljava/util/Map;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lio/sentry/c4;->s:Ljava/util/Map;

    return-void
.end method

.method public serialize(Lio/sentry/z0;Lio/sentry/g0;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Lio/sentry/vendor/gson/stream/c;->k()Lio/sentry/vendor/gson/stream/c;

    .line 2
    .line 3
    .line 4
    const-string v0, "trace_id"

    .line 5
    .line 6
    invoke-virtual {p1, v0}, Lio/sentry/z0;->B0(Ljava/lang/String;)Lio/sentry/z0;

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, Lio/sentry/c4;->k:Lio/sentry/protocol/p;

    .line 10
    .line 11
    invoke-virtual {v0, p1, p2}, Lio/sentry/protocol/p;->serialize(Lio/sentry/z0;Lio/sentry/g0;)V

    .line 12
    .line 13
    .line 14
    const-string v0, "span_id"

    .line 15
    .line 16
    invoke-virtual {p1, v0}, Lio/sentry/z0;->B0(Ljava/lang/String;)Lio/sentry/z0;

    .line 17
    .line 18
    .line 19
    iget-object v0, p0, Lio/sentry/c4;->l:Lio/sentry/e4;

    .line 20
    .line 21
    invoke-virtual {v0, p1, p2}, Lio/sentry/e4;->serialize(Lio/sentry/z0;Lio/sentry/g0;)V

    .line 22
    .line 23
    .line 24
    iget-object v0, p0, Lio/sentry/c4;->m:Lio/sentry/e4;

    .line 25
    .line 26
    if-eqz v0, :cond_0

    .line 27
    .line 28
    const-string v0, "parent_span_id"

    .line 29
    .line 30
    invoke-virtual {p1, v0}, Lio/sentry/z0;->B0(Ljava/lang/String;)Lio/sentry/z0;

    .line 31
    .line 32
    .line 33
    iget-object v0, p0, Lio/sentry/c4;->m:Lio/sentry/e4;

    .line 34
    .line 35
    invoke-virtual {v0, p1, p2}, Lio/sentry/e4;->serialize(Lio/sentry/z0;Lio/sentry/g0;)V

    .line 36
    .line 37
    .line 38
    :cond_0
    const-string v0, "op"

    .line 39
    .line 40
    invoke-virtual {p1, v0}, Lio/sentry/z0;->B0(Ljava/lang/String;)Lio/sentry/z0;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    iget-object v1, p0, Lio/sentry/c4;->o:Ljava/lang/String;

    .line 45
    .line 46
    invoke-virtual {v0, v1}, Lio/sentry/vendor/gson/stream/c;->t0(Ljava/lang/String;)Lio/sentry/vendor/gson/stream/c;

    .line 47
    .line 48
    .line 49
    iget-object v0, p0, Lio/sentry/c4;->p:Ljava/lang/String;

    .line 50
    .line 51
    if-eqz v0, :cond_1

    .line 52
    .line 53
    const-string v0, "description"

    .line 54
    .line 55
    invoke-virtual {p1, v0}, Lio/sentry/z0;->B0(Ljava/lang/String;)Lio/sentry/z0;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    iget-object v1, p0, Lio/sentry/c4;->p:Ljava/lang/String;

    .line 60
    .line 61
    invoke-virtual {v0, v1}, Lio/sentry/vendor/gson/stream/c;->t0(Ljava/lang/String;)Lio/sentry/vendor/gson/stream/c;

    .line 62
    .line 63
    .line 64
    :cond_1
    iget-object v0, p0, Lio/sentry/c4;->q:Lio/sentry/f4;

    .line 65
    .line 66
    if-eqz v0, :cond_2

    .line 67
    .line 68
    const-string v0, "status"

    .line 69
    .line 70
    invoke-virtual {p1, v0}, Lio/sentry/z0;->B0(Ljava/lang/String;)Lio/sentry/z0;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    iget-object v1, p0, Lio/sentry/c4;->q:Lio/sentry/f4;

    .line 75
    .line 76
    invoke-virtual {v0, p2, v1}, Lio/sentry/z0;->F0(Lio/sentry/g0;Ljava/lang/Object;)Lio/sentry/z0;

    .line 77
    .line 78
    .line 79
    :cond_2
    iget-object v0, p0, Lio/sentry/c4;->r:Ljava/util/Map;

    .line 80
    .line 81
    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    .line 82
    .line 83
    .line 84
    move-result v0

    .line 85
    if-nez v0, :cond_3

    .line 86
    .line 87
    const-string v0, "tags"

    .line 88
    .line 89
    invoke-virtual {p1, v0}, Lio/sentry/z0;->B0(Ljava/lang/String;)Lio/sentry/z0;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    iget-object v1, p0, Lio/sentry/c4;->r:Ljava/util/Map;

    .line 94
    .line 95
    invoke-virtual {v0, p2, v1}, Lio/sentry/z0;->F0(Lio/sentry/g0;Ljava/lang/Object;)Lio/sentry/z0;

    .line 96
    .line 97
    .line 98
    :cond_3
    iget-object v0, p0, Lio/sentry/c4;->s:Ljava/util/Map;

    .line 99
    .line 100
    if-eqz v0, :cond_4

    .line 101
    .line 102
    invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    .line 103
    .line 104
    .line 105
    move-result-object v0

    .line 106
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 107
    .line 108
    .line 109
    move-result-object v0

    .line 110
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 111
    .line 112
    .line 113
    move-result v1

    .line 114
    if-eqz v1, :cond_4

    .line 115
    .line 116
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object v1

    .line 120
    check-cast v1, Ljava/lang/String;

    .line 121
    .line 122
    iget-object v2, p0, Lio/sentry/c4;->s:Ljava/util/Map;

    .line 123
    .line 124
    invoke-interface {v2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    move-result-object v2

    .line 128
    invoke-virtual {p1, v1}, Lio/sentry/z0;->B0(Ljava/lang/String;)Lio/sentry/z0;

    .line 129
    .line 130
    .line 131
    move-result-object v1

    .line 132
    invoke-virtual {v1, p2, v2}, Lio/sentry/z0;->F0(Lio/sentry/g0;Ljava/lang/Object;)Lio/sentry/z0;

    .line 133
    .line 134
    .line 135
    goto :goto_0

    .line 136
    :cond_4
    invoke-virtual {p1}, Lio/sentry/vendor/gson/stream/c;->s()Lio/sentry/vendor/gson/stream/c;

    .line 137
    .line 138
    .line 139
    return-void
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
.end method
