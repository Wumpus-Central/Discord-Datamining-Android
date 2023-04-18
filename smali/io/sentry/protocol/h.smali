.class public final Lio/sentry/protocol/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/sentry/b1;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/sentry/protocol/h$a;
    }
.end annotation


# instance fields
.field private final transient k:Ljava/lang/Thread;

.field private l:Ljava/lang/String;

.field private m:Ljava/lang/String;

.field private n:Ljava/lang/String;

.field private o:Ljava/lang/Boolean;

.field private p:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private q:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private r:Ljava/lang/Boolean;

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
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, v0}, Lio/sentry/protocol/h;-><init>(Ljava/lang/Thread;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/Thread;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lio/sentry/protocol/h;->k:Ljava/lang/Thread;

    return-void
.end method

.method static synthetic a(Lio/sentry/protocol/h;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    iput-object p1, p0, Lio/sentry/protocol/h;->l:Ljava/lang/String;

    return-object p1
.end method

.method static synthetic b(Lio/sentry/protocol/h;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    iput-object p1, p0, Lio/sentry/protocol/h;->m:Ljava/lang/String;

    return-object p1
.end method

.method static synthetic c(Lio/sentry/protocol/h;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    iput-object p1, p0, Lio/sentry/protocol/h;->n:Ljava/lang/String;

    return-object p1
.end method

.method static synthetic d(Lio/sentry/protocol/h;Ljava/lang/Boolean;)Ljava/lang/Boolean;
    .locals 0

    iput-object p1, p0, Lio/sentry/protocol/h;->o:Ljava/lang/Boolean;

    return-object p1
.end method

.method static synthetic e(Lio/sentry/protocol/h;Ljava/util/Map;)Ljava/util/Map;
    .locals 0

    iput-object p1, p0, Lio/sentry/protocol/h;->p:Ljava/util/Map;

    return-object p1
.end method

.method static synthetic f(Lio/sentry/protocol/h;Ljava/util/Map;)Ljava/util/Map;
    .locals 0

    iput-object p1, p0, Lio/sentry/protocol/h;->q:Ljava/util/Map;

    return-object p1
.end method

.method static synthetic g(Lio/sentry/protocol/h;Ljava/lang/Boolean;)Ljava/lang/Boolean;
    .locals 0

    iput-object p1, p0, Lio/sentry/protocol/h;->r:Ljava/lang/Boolean;

    return-object p1
.end method


# virtual methods
.method public h()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lio/sentry/protocol/h;->o:Ljava/lang/Boolean;

    return-object v0
.end method

.method public i(Ljava/lang/Boolean;)V
    .locals 0

    iput-object p1, p0, Lio/sentry/protocol/h;->o:Ljava/lang/Boolean;

    return-void
.end method

.method public j(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lio/sentry/protocol/h;->l:Ljava/lang/String;

    return-void
.end method

.method public k(Ljava/util/Map;)V
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

    iput-object p1, p0, Lio/sentry/protocol/h;->s:Ljava/util/Map;

    return-void
.end method

.method public serialize(Lio/sentry/z0;Lio/sentry/g0;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Lio/sentry/vendor/gson/stream/c;->k()Lio/sentry/vendor/gson/stream/c;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lio/sentry/protocol/h;->l:Ljava/lang/String;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    const-string v0, "type"

    .line 9
    .line 10
    invoke-virtual {p1, v0}, Lio/sentry/z0;->B0(Ljava/lang/String;)Lio/sentry/z0;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    iget-object v1, p0, Lio/sentry/protocol/h;->l:Ljava/lang/String;

    .line 15
    .line 16
    invoke-virtual {v0, v1}, Lio/sentry/vendor/gson/stream/c;->t0(Ljava/lang/String;)Lio/sentry/vendor/gson/stream/c;

    .line 17
    .line 18
    .line 19
    :cond_0
    iget-object v0, p0, Lio/sentry/protocol/h;->m:Ljava/lang/String;

    .line 20
    .line 21
    if-eqz v0, :cond_1

    .line 22
    .line 23
    const-string v0, "description"

    .line 24
    .line 25
    invoke-virtual {p1, v0}, Lio/sentry/z0;->B0(Ljava/lang/String;)Lio/sentry/z0;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    iget-object v1, p0, Lio/sentry/protocol/h;->m:Ljava/lang/String;

    .line 30
    .line 31
    invoke-virtual {v0, v1}, Lio/sentry/vendor/gson/stream/c;->t0(Ljava/lang/String;)Lio/sentry/vendor/gson/stream/c;

    .line 32
    .line 33
    .line 34
    :cond_1
    iget-object v0, p0, Lio/sentry/protocol/h;->n:Ljava/lang/String;

    .line 35
    .line 36
    if-eqz v0, :cond_2

    .line 37
    .line 38
    const-string v0, "help_link"

    .line 39
    .line 40
    invoke-virtual {p1, v0}, Lio/sentry/z0;->B0(Ljava/lang/String;)Lio/sentry/z0;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    iget-object v1, p0, Lio/sentry/protocol/h;->n:Ljava/lang/String;

    .line 45
    .line 46
    invoke-virtual {v0, v1}, Lio/sentry/vendor/gson/stream/c;->t0(Ljava/lang/String;)Lio/sentry/vendor/gson/stream/c;

    .line 47
    .line 48
    .line 49
    :cond_2
    iget-object v0, p0, Lio/sentry/protocol/h;->o:Ljava/lang/Boolean;

    .line 50
    .line 51
    if-eqz v0, :cond_3

    .line 52
    .line 53
    const-string v0, "handled"

    .line 54
    .line 55
    invoke-virtual {p1, v0}, Lio/sentry/z0;->B0(Ljava/lang/String;)Lio/sentry/z0;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    iget-object v1, p0, Lio/sentry/protocol/h;->o:Ljava/lang/Boolean;

    .line 60
    .line 61
    invoke-virtual {v0, v1}, Lio/sentry/vendor/gson/stream/c;->i0(Ljava/lang/Boolean;)Lio/sentry/vendor/gson/stream/c;

    .line 62
    .line 63
    .line 64
    :cond_3
    iget-object v0, p0, Lio/sentry/protocol/h;->p:Ljava/util/Map;

    .line 65
    .line 66
    if-eqz v0, :cond_4

    .line 67
    .line 68
    const-string v0, "meta"

    .line 69
    .line 70
    invoke-virtual {p1, v0}, Lio/sentry/z0;->B0(Ljava/lang/String;)Lio/sentry/z0;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    iget-object v1, p0, Lio/sentry/protocol/h;->p:Ljava/util/Map;

    .line 75
    .line 76
    invoke-virtual {v0, p2, v1}, Lio/sentry/z0;->F0(Lio/sentry/g0;Ljava/lang/Object;)Lio/sentry/z0;

    .line 77
    .line 78
    .line 79
    :cond_4
    iget-object v0, p0, Lio/sentry/protocol/h;->q:Ljava/util/Map;

    .line 80
    .line 81
    if-eqz v0, :cond_5

    .line 82
    .line 83
    const-string v0, "data"

    .line 84
    .line 85
    invoke-virtual {p1, v0}, Lio/sentry/z0;->B0(Ljava/lang/String;)Lio/sentry/z0;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    iget-object v1, p0, Lio/sentry/protocol/h;->q:Ljava/util/Map;

    .line 90
    .line 91
    invoke-virtual {v0, p2, v1}, Lio/sentry/z0;->F0(Lio/sentry/g0;Ljava/lang/Object;)Lio/sentry/z0;

    .line 92
    .line 93
    .line 94
    :cond_5
    iget-object v0, p0, Lio/sentry/protocol/h;->r:Ljava/lang/Boolean;

    .line 95
    .line 96
    if-eqz v0, :cond_6

    .line 97
    .line 98
    const-string v0, "synthetic"

    .line 99
    .line 100
    invoke-virtual {p1, v0}, Lio/sentry/z0;->B0(Ljava/lang/String;)Lio/sentry/z0;

    .line 101
    .line 102
    .line 103
    move-result-object v0

    .line 104
    iget-object v1, p0, Lio/sentry/protocol/h;->r:Ljava/lang/Boolean;

    .line 105
    .line 106
    invoke-virtual {v0, v1}, Lio/sentry/vendor/gson/stream/c;->i0(Ljava/lang/Boolean;)Lio/sentry/vendor/gson/stream/c;

    .line 107
    .line 108
    .line 109
    :cond_6
    iget-object v0, p0, Lio/sentry/protocol/h;->s:Ljava/util/Map;

    .line 110
    .line 111
    if-eqz v0, :cond_7

    .line 112
    .line 113
    invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    .line 114
    .line 115
    .line 116
    move-result-object v0

    .line 117
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 118
    .line 119
    .line 120
    move-result-object v0

    .line 121
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 122
    .line 123
    .line 124
    move-result v1

    .line 125
    if-eqz v1, :cond_7

    .line 126
    .line 127
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 128
    .line 129
    .line 130
    move-result-object v1

    .line 131
    check-cast v1, Ljava/lang/String;

    .line 132
    .line 133
    iget-object v2, p0, Lio/sentry/protocol/h;->s:Ljava/util/Map;

    .line 134
    .line 135
    invoke-interface {v2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    move-result-object v2

    .line 139
    invoke-virtual {p1, v1}, Lio/sentry/z0;->B0(Ljava/lang/String;)Lio/sentry/z0;

    .line 140
    .line 141
    .line 142
    move-result-object v1

    .line 143
    invoke-virtual {v1, p2, v2}, Lio/sentry/z0;->F0(Lio/sentry/g0;Ljava/lang/Object;)Lio/sentry/z0;

    .line 144
    .line 145
    .line 146
    goto :goto_0

    .line 147
    :cond_7
    invoke-virtual {p1}, Lio/sentry/vendor/gson/stream/c;->s()Lio/sentry/vendor/gson/stream/c;

    .line 148
    .line 149
    .line 150
    return-void
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
