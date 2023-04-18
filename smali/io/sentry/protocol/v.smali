.class public final Lio/sentry/protocol/v;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/sentry/b1;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/sentry/protocol/v$a;
    }
.end annotation


# instance fields
.field private k:Ljava/lang/Long;

.field private l:Ljava/lang/Integer;

.field private m:Ljava/lang/String;

.field private n:Ljava/lang/String;

.field private o:Ljava/lang/Boolean;

.field private p:Ljava/lang/Boolean;

.field private q:Ljava/lang/Boolean;

.field private r:Lio/sentry/protocol/u;

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
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static synthetic a(Lio/sentry/protocol/v;Ljava/lang/Long;)Ljava/lang/Long;
    .locals 0

    iput-object p1, p0, Lio/sentry/protocol/v;->k:Ljava/lang/Long;

    return-object p1
.end method

.method static synthetic b(Lio/sentry/protocol/v;Ljava/lang/Integer;)Ljava/lang/Integer;
    .locals 0

    iput-object p1, p0, Lio/sentry/protocol/v;->l:Ljava/lang/Integer;

    return-object p1
.end method

.method static synthetic c(Lio/sentry/protocol/v;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    iput-object p1, p0, Lio/sentry/protocol/v;->m:Ljava/lang/String;

    return-object p1
.end method

.method static synthetic d(Lio/sentry/protocol/v;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    iput-object p1, p0, Lio/sentry/protocol/v;->n:Ljava/lang/String;

    return-object p1
.end method

.method static synthetic e(Lio/sentry/protocol/v;Ljava/lang/Boolean;)Ljava/lang/Boolean;
    .locals 0

    iput-object p1, p0, Lio/sentry/protocol/v;->o:Ljava/lang/Boolean;

    return-object p1
.end method

.method static synthetic f(Lio/sentry/protocol/v;Ljava/lang/Boolean;)Ljava/lang/Boolean;
    .locals 0

    iput-object p1, p0, Lio/sentry/protocol/v;->p:Ljava/lang/Boolean;

    return-object p1
.end method

.method static synthetic g(Lio/sentry/protocol/v;Ljava/lang/Boolean;)Ljava/lang/Boolean;
    .locals 0

    iput-object p1, p0, Lio/sentry/protocol/v;->q:Ljava/lang/Boolean;

    return-object p1
.end method

.method static synthetic h(Lio/sentry/protocol/v;Lio/sentry/protocol/u;)Lio/sentry/protocol/u;
    .locals 0

    iput-object p1, p0, Lio/sentry/protocol/v;->r:Lio/sentry/protocol/u;

    return-object p1
.end method


# virtual methods
.method public i()Ljava/lang/Long;
    .locals 1

    iget-object v0, p0, Lio/sentry/protocol/v;->k:Ljava/lang/Long;

    return-object v0
.end method

.method public j()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lio/sentry/protocol/v;->p:Ljava/lang/Boolean;

    return-object v0
.end method

.method public k(Ljava/lang/Boolean;)V
    .locals 0

    iput-object p1, p0, Lio/sentry/protocol/v;->o:Ljava/lang/Boolean;

    return-void
.end method

.method public l(Ljava/lang/Boolean;)V
    .locals 0

    iput-object p1, p0, Lio/sentry/protocol/v;->p:Ljava/lang/Boolean;

    return-void
.end method

.method public m(Ljava/lang/Boolean;)V
    .locals 0

    iput-object p1, p0, Lio/sentry/protocol/v;->q:Ljava/lang/Boolean;

    return-void
.end method

.method public n(Ljava/lang/Long;)V
    .locals 0

    iput-object p1, p0, Lio/sentry/protocol/v;->k:Ljava/lang/Long;

    return-void
.end method

.method public o(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lio/sentry/protocol/v;->m:Ljava/lang/String;

    return-void
.end method

.method public p(Ljava/lang/Integer;)V
    .locals 0

    iput-object p1, p0, Lio/sentry/protocol/v;->l:Ljava/lang/Integer;

    return-void
.end method

.method public q(Lio/sentry/protocol/u;)V
    .locals 0

    iput-object p1, p0, Lio/sentry/protocol/v;->r:Lio/sentry/protocol/u;

    return-void
.end method

.method public r(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lio/sentry/protocol/v;->n:Ljava/lang/String;

    return-void
.end method

.method public s(Ljava/util/Map;)V
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

    iput-object p1, p0, Lio/sentry/protocol/v;->s:Ljava/util/Map;

    return-void
.end method

.method public serialize(Lio/sentry/z0;Lio/sentry/g0;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Lio/sentry/vendor/gson/stream/c;->k()Lio/sentry/vendor/gson/stream/c;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lio/sentry/protocol/v;->k:Ljava/lang/Long;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    const-string v0, "id"

    .line 9
    .line 10
    invoke-virtual {p1, v0}, Lio/sentry/z0;->B0(Ljava/lang/String;)Lio/sentry/z0;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    iget-object v1, p0, Lio/sentry/protocol/v;->k:Ljava/lang/Long;

    .line 15
    .line 16
    invoke-virtual {v0, v1}, Lio/sentry/vendor/gson/stream/c;->k0(Ljava/lang/Number;)Lio/sentry/vendor/gson/stream/c;

    .line 17
    .line 18
    .line 19
    :cond_0
    iget-object v0, p0, Lio/sentry/protocol/v;->l:Ljava/lang/Integer;

    .line 20
    .line 21
    if-eqz v0, :cond_1

    .line 22
    .line 23
    const-string v0, "priority"

    .line 24
    .line 25
    invoke-virtual {p1, v0}, Lio/sentry/z0;->B0(Ljava/lang/String;)Lio/sentry/z0;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    iget-object v1, p0, Lio/sentry/protocol/v;->l:Ljava/lang/Integer;

    .line 30
    .line 31
    invoke-virtual {v0, v1}, Lio/sentry/vendor/gson/stream/c;->k0(Ljava/lang/Number;)Lio/sentry/vendor/gson/stream/c;

    .line 32
    .line 33
    .line 34
    :cond_1
    iget-object v0, p0, Lio/sentry/protocol/v;->m:Ljava/lang/String;

    .line 35
    .line 36
    if-eqz v0, :cond_2

    .line 37
    .line 38
    const-string v0, "name"

    .line 39
    .line 40
    invoke-virtual {p1, v0}, Lio/sentry/z0;->B0(Ljava/lang/String;)Lio/sentry/z0;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    iget-object v1, p0, Lio/sentry/protocol/v;->m:Ljava/lang/String;

    .line 45
    .line 46
    invoke-virtual {v0, v1}, Lio/sentry/vendor/gson/stream/c;->t0(Ljava/lang/String;)Lio/sentry/vendor/gson/stream/c;

    .line 47
    .line 48
    .line 49
    :cond_2
    iget-object v0, p0, Lio/sentry/protocol/v;->n:Ljava/lang/String;

    .line 50
    .line 51
    if-eqz v0, :cond_3

    .line 52
    .line 53
    const-string v0, "state"

    .line 54
    .line 55
    invoke-virtual {p1, v0}, Lio/sentry/z0;->B0(Ljava/lang/String;)Lio/sentry/z0;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    iget-object v1, p0, Lio/sentry/protocol/v;->n:Ljava/lang/String;

    .line 60
    .line 61
    invoke-virtual {v0, v1}, Lio/sentry/vendor/gson/stream/c;->t0(Ljava/lang/String;)Lio/sentry/vendor/gson/stream/c;

    .line 62
    .line 63
    .line 64
    :cond_3
    iget-object v0, p0, Lio/sentry/protocol/v;->o:Ljava/lang/Boolean;

    .line 65
    .line 66
    if-eqz v0, :cond_4

    .line 67
    .line 68
    const-string v0, "crashed"

    .line 69
    .line 70
    invoke-virtual {p1, v0}, Lio/sentry/z0;->B0(Ljava/lang/String;)Lio/sentry/z0;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    iget-object v1, p0, Lio/sentry/protocol/v;->o:Ljava/lang/Boolean;

    .line 75
    .line 76
    invoke-virtual {v0, v1}, Lio/sentry/vendor/gson/stream/c;->i0(Ljava/lang/Boolean;)Lio/sentry/vendor/gson/stream/c;

    .line 77
    .line 78
    .line 79
    :cond_4
    iget-object v0, p0, Lio/sentry/protocol/v;->p:Ljava/lang/Boolean;

    .line 80
    .line 81
    if-eqz v0, :cond_5

    .line 82
    .line 83
    const-string v0, "current"

    .line 84
    .line 85
    invoke-virtual {p1, v0}, Lio/sentry/z0;->B0(Ljava/lang/String;)Lio/sentry/z0;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    iget-object v1, p0, Lio/sentry/protocol/v;->p:Ljava/lang/Boolean;

    .line 90
    .line 91
    invoke-virtual {v0, v1}, Lio/sentry/vendor/gson/stream/c;->i0(Ljava/lang/Boolean;)Lio/sentry/vendor/gson/stream/c;

    .line 92
    .line 93
    .line 94
    :cond_5
    iget-object v0, p0, Lio/sentry/protocol/v;->q:Ljava/lang/Boolean;

    .line 95
    .line 96
    if-eqz v0, :cond_6

    .line 97
    .line 98
    const-string v0, "daemon"

    .line 99
    .line 100
    invoke-virtual {p1, v0}, Lio/sentry/z0;->B0(Ljava/lang/String;)Lio/sentry/z0;

    .line 101
    .line 102
    .line 103
    move-result-object v0

    .line 104
    iget-object v1, p0, Lio/sentry/protocol/v;->q:Ljava/lang/Boolean;

    .line 105
    .line 106
    invoke-virtual {v0, v1}, Lio/sentry/vendor/gson/stream/c;->i0(Ljava/lang/Boolean;)Lio/sentry/vendor/gson/stream/c;

    .line 107
    .line 108
    .line 109
    :cond_6
    iget-object v0, p0, Lio/sentry/protocol/v;->r:Lio/sentry/protocol/u;

    .line 110
    .line 111
    if-eqz v0, :cond_7

    .line 112
    .line 113
    const-string v0, "stacktrace"

    .line 114
    .line 115
    invoke-virtual {p1, v0}, Lio/sentry/z0;->B0(Ljava/lang/String;)Lio/sentry/z0;

    .line 116
    .line 117
    .line 118
    move-result-object v0

    .line 119
    iget-object v1, p0, Lio/sentry/protocol/v;->r:Lio/sentry/protocol/u;

    .line 120
    .line 121
    invoke-virtual {v0, p2, v1}, Lio/sentry/z0;->F0(Lio/sentry/g0;Ljava/lang/Object;)Lio/sentry/z0;

    .line 122
    .line 123
    .line 124
    :cond_7
    iget-object v0, p0, Lio/sentry/protocol/v;->s:Ljava/util/Map;

    .line 125
    .line 126
    if-eqz v0, :cond_8

    .line 127
    .line 128
    invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    .line 129
    .line 130
    .line 131
    move-result-object v0

    .line 132
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 133
    .line 134
    .line 135
    move-result-object v0

    .line 136
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 137
    .line 138
    .line 139
    move-result v1

    .line 140
    if-eqz v1, :cond_8

    .line 141
    .line 142
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 143
    .line 144
    .line 145
    move-result-object v1

    .line 146
    check-cast v1, Ljava/lang/String;

    .line 147
    .line 148
    iget-object v2, p0, Lio/sentry/protocol/v;->s:Ljava/util/Map;

    .line 149
    .line 150
    invoke-interface {v2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 151
    .line 152
    .line 153
    move-result-object v2

    .line 154
    invoke-virtual {p1, v1}, Lio/sentry/z0;->B0(Ljava/lang/String;)Lio/sentry/z0;

    .line 155
    .line 156
    .line 157
    invoke-virtual {p1, p2, v2}, Lio/sentry/z0;->F0(Lio/sentry/g0;Ljava/lang/Object;)Lio/sentry/z0;

    .line 158
    .line 159
    .line 160
    goto :goto_0

    .line 161
    :cond_8
    invoke-virtual {p1}, Lio/sentry/vendor/gson/stream/c;->s()Lio/sentry/vendor/gson/stream/c;

    .line 162
    .line 163
    .line 164
    return-void
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
