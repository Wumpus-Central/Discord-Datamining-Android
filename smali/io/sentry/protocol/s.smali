.class public final Lio/sentry/protocol/s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/sentry/b1;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/sentry/protocol/s$a;
    }
.end annotation


# instance fields
.field private final k:Ljava/lang/Double;

.field private final l:Ljava/lang/Double;

.field private final m:Lio/sentry/protocol/p;

.field private final n:Lio/sentry/e4;

.field private final o:Lio/sentry/e4;

.field private final p:Ljava/lang/String;

.field private final q:Ljava/lang/String;

.field private final r:Lio/sentry/f4;

.field private final s:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final t:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private u:Ljava/util/Map;
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
.method public constructor <init>(Lio/sentry/b4;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Lio/sentry/b4;->o()Ljava/util/Map;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Lio/sentry/protocol/s;-><init>(Lio/sentry/b4;Ljava/util/Map;)V

    return-void
.end method

.method public constructor <init>(Lio/sentry/b4;Ljava/util/Map;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/sentry/b4;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "span is required"

    .line 3
    invoke-static {p1, v0}, Lio/sentry/util/k;->a(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 4
    invoke-virtual {p1}, Lio/sentry/b4;->p()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lio/sentry/protocol/s;->q:Ljava/lang/String;

    .line 5
    invoke-virtual {p1}, Lio/sentry/b4;->u()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lio/sentry/protocol/s;->p:Ljava/lang/String;

    .line 6
    invoke-virtual {p1}, Lio/sentry/b4;->x()Lio/sentry/e4;

    move-result-object v0

    iput-object v0, p0, Lio/sentry/protocol/s;->n:Lio/sentry/e4;

    .line 7
    invoke-virtual {p1}, Lio/sentry/b4;->v()Lio/sentry/e4;

    move-result-object v0

    iput-object v0, p0, Lio/sentry/protocol/s;->o:Lio/sentry/e4;

    .line 8
    invoke-virtual {p1}, Lio/sentry/b4;->B()Lio/sentry/protocol/p;

    move-result-object v0

    iput-object v0, p0, Lio/sentry/protocol/s;->m:Lio/sentry/protocol/p;

    .line 9
    invoke-virtual {p1}, Lio/sentry/b4;->b()Lio/sentry/f4;

    move-result-object v0

    iput-object v0, p0, Lio/sentry/protocol/s;->r:Lio/sentry/f4;

    .line 10
    invoke-virtual {p1}, Lio/sentry/b4;->z()Ljava/util/Map;

    move-result-object v0

    invoke-static {v0}, Lio/sentry/util/a;->b(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 11
    :cond_0
    new-instance v0, Lj$/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Lj$/util/concurrent/ConcurrentHashMap;-><init>()V

    :goto_0
    iput-object v0, p0, Lio/sentry/protocol/s;->s:Ljava/util/Map;

    .line 12
    invoke-virtual {p1}, Lio/sentry/b4;->s()Ljava/lang/Double;

    move-result-object v0

    iput-object v0, p0, Lio/sentry/protocol/s;->l:Ljava/lang/Double;

    .line 13
    invoke-virtual {p1}, Lio/sentry/b4;->y()Ljava/util/Date;

    move-result-object p1

    invoke-static {p1}, Lio/sentry/h;->a(Ljava/util/Date;)D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p1

    iput-object p1, p0, Lio/sentry/protocol/s;->k:Ljava/lang/Double;

    .line 14
    iput-object p2, p0, Lio/sentry/protocol/s;->t:Ljava/util/Map;

    return-void
.end method

.method public constructor <init>(Ljava/lang/Double;Ljava/lang/Double;Lio/sentry/protocol/p;Lio/sentry/e4;Lio/sentry/e4;Ljava/lang/String;Ljava/lang/String;Lio/sentry/f4;Ljava/util/Map;Ljava/util/Map;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Double;",
            "Ljava/lang/Double;",
            "Lio/sentry/protocol/p;",
            "Lio/sentry/e4;",
            "Lio/sentry/e4;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lio/sentry/f4;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    iput-object p1, p0, Lio/sentry/protocol/s;->k:Ljava/lang/Double;

    .line 17
    iput-object p2, p0, Lio/sentry/protocol/s;->l:Ljava/lang/Double;

    .line 18
    iput-object p3, p0, Lio/sentry/protocol/s;->m:Lio/sentry/protocol/p;

    .line 19
    iput-object p4, p0, Lio/sentry/protocol/s;->n:Lio/sentry/e4;

    .line 20
    iput-object p5, p0, Lio/sentry/protocol/s;->o:Lio/sentry/e4;

    .line 21
    iput-object p6, p0, Lio/sentry/protocol/s;->p:Ljava/lang/String;

    .line 22
    iput-object p7, p0, Lio/sentry/protocol/s;->q:Ljava/lang/String;

    .line 23
    iput-object p8, p0, Lio/sentry/protocol/s;->r:Lio/sentry/f4;

    .line 24
    iput-object p9, p0, Lio/sentry/protocol/s;->s:Ljava/util/Map;

    .line 25
    iput-object p10, p0, Lio/sentry/protocol/s;->t:Ljava/util/Map;

    return-void
.end method

.method private a(Ljava/lang/Double;)Ljava/math/BigDecimal;
    .locals 2

    invoke-virtual {p1}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/math/BigDecimal;->valueOf(D)Ljava/math/BigDecimal;

    move-result-object p1

    const/4 v0, 0x6

    sget-object v1, Ljava/math/RoundingMode;->DOWN:Ljava/math/RoundingMode;

    invoke-virtual {p1, v0, v1}, Ljava/math/BigDecimal;->setScale(ILjava/math/RoundingMode;)Ljava/math/BigDecimal;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public b()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/sentry/protocol/s;->p:Ljava/lang/String;

    return-object v0
.end method

.method public c(Ljava/util/Map;)V
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

    iput-object p1, p0, Lio/sentry/protocol/s;->u:Ljava/util/Map;

    return-void
.end method

.method public serialize(Lio/sentry/z0;Lio/sentry/g0;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Lio/sentry/vendor/gson/stream/c;->k()Lio/sentry/vendor/gson/stream/c;

    .line 2
    .line 3
    .line 4
    const-string v0, "start_timestamp"

    .line 5
    .line 6
    invoke-virtual {p1, v0}, Lio/sentry/z0;->B0(Ljava/lang/String;)Lio/sentry/z0;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    iget-object v1, p0, Lio/sentry/protocol/s;->k:Ljava/lang/Double;

    .line 11
    .line 12
    invoke-direct {p0, v1}, Lio/sentry/protocol/s;->a(Ljava/lang/Double;)Ljava/math/BigDecimal;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-virtual {v0, p2, v1}, Lio/sentry/z0;->F0(Lio/sentry/g0;Ljava/lang/Object;)Lio/sentry/z0;

    .line 17
    .line 18
    .line 19
    iget-object v0, p0, Lio/sentry/protocol/s;->l:Ljava/lang/Double;

    .line 20
    .line 21
    if-eqz v0, :cond_0

    .line 22
    .line 23
    const-string v0, "timestamp"

    .line 24
    .line 25
    invoke-virtual {p1, v0}, Lio/sentry/z0;->B0(Ljava/lang/String;)Lio/sentry/z0;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    iget-object v1, p0, Lio/sentry/protocol/s;->l:Ljava/lang/Double;

    .line 30
    .line 31
    invoke-direct {p0, v1}, Lio/sentry/protocol/s;->a(Ljava/lang/Double;)Ljava/math/BigDecimal;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    invoke-virtual {v0, p2, v1}, Lio/sentry/z0;->F0(Lio/sentry/g0;Ljava/lang/Object;)Lio/sentry/z0;

    .line 36
    .line 37
    .line 38
    :cond_0
    const-string v0, "trace_id"

    .line 39
    .line 40
    invoke-virtual {p1, v0}, Lio/sentry/z0;->B0(Ljava/lang/String;)Lio/sentry/z0;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    iget-object v1, p0, Lio/sentry/protocol/s;->m:Lio/sentry/protocol/p;

    .line 45
    .line 46
    invoke-virtual {v0, p2, v1}, Lio/sentry/z0;->F0(Lio/sentry/g0;Ljava/lang/Object;)Lio/sentry/z0;

    .line 47
    .line 48
    .line 49
    const-string v0, "span_id"

    .line 50
    .line 51
    invoke-virtual {p1, v0}, Lio/sentry/z0;->B0(Ljava/lang/String;)Lio/sentry/z0;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    iget-object v1, p0, Lio/sentry/protocol/s;->n:Lio/sentry/e4;

    .line 56
    .line 57
    invoke-virtual {v0, p2, v1}, Lio/sentry/z0;->F0(Lio/sentry/g0;Ljava/lang/Object;)Lio/sentry/z0;

    .line 58
    .line 59
    .line 60
    iget-object v0, p0, Lio/sentry/protocol/s;->o:Lio/sentry/e4;

    .line 61
    .line 62
    if-eqz v0, :cond_1

    .line 63
    .line 64
    const-string v0, "parent_span_id"

    .line 65
    .line 66
    invoke-virtual {p1, v0}, Lio/sentry/z0;->B0(Ljava/lang/String;)Lio/sentry/z0;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    iget-object v1, p0, Lio/sentry/protocol/s;->o:Lio/sentry/e4;

    .line 71
    .line 72
    invoke-virtual {v0, p2, v1}, Lio/sentry/z0;->F0(Lio/sentry/g0;Ljava/lang/Object;)Lio/sentry/z0;

    .line 73
    .line 74
    .line 75
    :cond_1
    const-string v0, "op"

    .line 76
    .line 77
    invoke-virtual {p1, v0}, Lio/sentry/z0;->B0(Ljava/lang/String;)Lio/sentry/z0;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    iget-object v1, p0, Lio/sentry/protocol/s;->p:Ljava/lang/String;

    .line 82
    .line 83
    invoke-virtual {v0, v1}, Lio/sentry/vendor/gson/stream/c;->t0(Ljava/lang/String;)Lio/sentry/vendor/gson/stream/c;

    .line 84
    .line 85
    .line 86
    iget-object v0, p0, Lio/sentry/protocol/s;->q:Ljava/lang/String;

    .line 87
    .line 88
    if-eqz v0, :cond_2

    .line 89
    .line 90
    const-string v0, "description"

    .line 91
    .line 92
    invoke-virtual {p1, v0}, Lio/sentry/z0;->B0(Ljava/lang/String;)Lio/sentry/z0;

    .line 93
    .line 94
    .line 95
    move-result-object v0

    .line 96
    iget-object v1, p0, Lio/sentry/protocol/s;->q:Ljava/lang/String;

    .line 97
    .line 98
    invoke-virtual {v0, v1}, Lio/sentry/vendor/gson/stream/c;->t0(Ljava/lang/String;)Lio/sentry/vendor/gson/stream/c;

    .line 99
    .line 100
    .line 101
    :cond_2
    iget-object v0, p0, Lio/sentry/protocol/s;->r:Lio/sentry/f4;

    .line 102
    .line 103
    if-eqz v0, :cond_3

    .line 104
    .line 105
    const-string v0, "status"

    .line 106
    .line 107
    invoke-virtual {p1, v0}, Lio/sentry/z0;->B0(Ljava/lang/String;)Lio/sentry/z0;

    .line 108
    .line 109
    .line 110
    move-result-object v0

    .line 111
    iget-object v1, p0, Lio/sentry/protocol/s;->r:Lio/sentry/f4;

    .line 112
    .line 113
    invoke-virtual {v0, p2, v1}, Lio/sentry/z0;->F0(Lio/sentry/g0;Ljava/lang/Object;)Lio/sentry/z0;

    .line 114
    .line 115
    .line 116
    :cond_3
    iget-object v0, p0, Lio/sentry/protocol/s;->s:Ljava/util/Map;

    .line 117
    .line 118
    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    .line 119
    .line 120
    .line 121
    move-result v0

    .line 122
    if-nez v0, :cond_4

    .line 123
    .line 124
    const-string v0, "tags"

    .line 125
    .line 126
    invoke-virtual {p1, v0}, Lio/sentry/z0;->B0(Ljava/lang/String;)Lio/sentry/z0;

    .line 127
    .line 128
    .line 129
    move-result-object v0

    .line 130
    iget-object v1, p0, Lio/sentry/protocol/s;->s:Ljava/util/Map;

    .line 131
    .line 132
    invoke-virtual {v0, p2, v1}, Lio/sentry/z0;->F0(Lio/sentry/g0;Ljava/lang/Object;)Lio/sentry/z0;

    .line 133
    .line 134
    .line 135
    :cond_4
    iget-object v0, p0, Lio/sentry/protocol/s;->t:Ljava/util/Map;

    .line 136
    .line 137
    if-eqz v0, :cond_5

    .line 138
    .line 139
    const-string v0, "data"

    .line 140
    .line 141
    invoke-virtual {p1, v0}, Lio/sentry/z0;->B0(Ljava/lang/String;)Lio/sentry/z0;

    .line 142
    .line 143
    .line 144
    move-result-object v0

    .line 145
    iget-object v1, p0, Lio/sentry/protocol/s;->t:Ljava/util/Map;

    .line 146
    .line 147
    invoke-virtual {v0, p2, v1}, Lio/sentry/z0;->F0(Lio/sentry/g0;Ljava/lang/Object;)Lio/sentry/z0;

    .line 148
    .line 149
    .line 150
    :cond_5
    iget-object v0, p0, Lio/sentry/protocol/s;->u:Ljava/util/Map;

    .line 151
    .line 152
    if-eqz v0, :cond_6

    .line 153
    .line 154
    invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    .line 155
    .line 156
    .line 157
    move-result-object v0

    .line 158
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 159
    .line 160
    .line 161
    move-result-object v0

    .line 162
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 163
    .line 164
    .line 165
    move-result v1

    .line 166
    if-eqz v1, :cond_6

    .line 167
    .line 168
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 169
    .line 170
    .line 171
    move-result-object v1

    .line 172
    check-cast v1, Ljava/lang/String;

    .line 173
    .line 174
    iget-object v2, p0, Lio/sentry/protocol/s;->u:Ljava/util/Map;

    .line 175
    .line 176
    invoke-interface {v2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 177
    .line 178
    .line 179
    move-result-object v2

    .line 180
    invoke-virtual {p1, v1}, Lio/sentry/z0;->B0(Ljava/lang/String;)Lio/sentry/z0;

    .line 181
    .line 182
    .line 183
    invoke-virtual {p1, p2, v2}, Lio/sentry/z0;->F0(Lio/sentry/g0;Ljava/lang/Object;)Lio/sentry/z0;

    .line 184
    .line 185
    .line 186
    goto :goto_0

    .line 187
    :cond_6
    invoke-virtual {p1}, Lio/sentry/vendor/gson/stream/c;->s()Lio/sentry/vendor/gson/stream/c;

    .line 188
    .line 189
    .line 190
    return-void
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
