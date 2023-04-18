.class public final Lqa/a1;
.super Lya/o;
.source "SourceFile"


# instance fields
.field private final a:Lcom/google/android/gms/common/api/internal/d;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/common/api/internal/d;)V
    .locals 0

    invoke-direct {p0}, Lya/o;-><init>()V

    iput-object p1, p0, Lqa/a1;->a:Lcom/google/android/gms/common/api/internal/d;

    return-void
.end method

.method public static d(Ljava/lang/Iterable;Lxa/b;)V
    .locals 3

    .line 1
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_4

    .line 10
    .line 11
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    check-cast v0, Lcom/google/android/gms/nearby/messages/internal/Update;

    .line 16
    .line 17
    const/4 v1, 0x1

    .line 18
    invoke-virtual {v0, v1}, Lcom/google/android/gms/nearby/messages/internal/Update;->v(I)Z

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    if-eqz v1, :cond_0

    .line 23
    .line 24
    iget-object v1, v0, Lcom/google/android/gms/nearby/messages/internal/Update;->m:Lcom/google/android/gms/nearby/messages/Message;

    .line 25
    .line 26
    invoke-virtual {p1, v1}, Lxa/b;->onFound(Lcom/google/android/gms/nearby/messages/Message;)V

    .line 27
    .line 28
    .line 29
    :cond_0
    const/4 v1, 0x2

    .line 30
    invoke-virtual {v0, v1}, Lcom/google/android/gms/nearby/messages/internal/Update;->v(I)Z

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    if-eqz v1, :cond_1

    .line 35
    .line 36
    iget-object v1, v0, Lcom/google/android/gms/nearby/messages/internal/Update;->m:Lcom/google/android/gms/nearby/messages/Message;

    .line 37
    .line 38
    invoke-virtual {p1, v1}, Lxa/b;->onLost(Lcom/google/android/gms/nearby/messages/Message;)V

    .line 39
    .line 40
    .line 41
    :cond_1
    const/4 v1, 0x4

    .line 42
    invoke-virtual {v0, v1}, Lcom/google/android/gms/nearby/messages/internal/Update;->v(I)Z

    .line 43
    .line 44
    .line 45
    move-result v1

    .line 46
    if-eqz v1, :cond_2

    .line 47
    .line 48
    iget-object v1, v0, Lcom/google/android/gms/nearby/messages/internal/Update;->m:Lcom/google/android/gms/nearby/messages/Message;

    .line 49
    .line 50
    iget-object v2, v0, Lcom/google/android/gms/nearby/messages/internal/Update;->n:Lya/m;

    .line 51
    .line 52
    invoke-virtual {p1, v1, v2}, Lxa/b;->onDistanceChanged(Lcom/google/android/gms/nearby/messages/Message;Lcom/google/android/gms/nearby/messages/Distance;)V

    .line 53
    .line 54
    .line 55
    :cond_2
    const/16 v1, 0x8

    .line 56
    .line 57
    invoke-virtual {v0, v1}, Lcom/google/android/gms/nearby/messages/internal/Update;->v(I)Z

    .line 58
    .line 59
    .line 60
    move-result v1

    .line 61
    if-eqz v1, :cond_3

    .line 62
    .line 63
    iget-object v1, v0, Lcom/google/android/gms/nearby/messages/internal/Update;->m:Lcom/google/android/gms/nearby/messages/Message;

    .line 64
    .line 65
    iget-object v2, v0, Lcom/google/android/gms/nearby/messages/internal/Update;->o:Lya/a;

    .line 66
    .line 67
    invoke-virtual {p1, v1, v2}, Lxa/b;->onBleSignalChanged(Lcom/google/android/gms/nearby/messages/Message;Lcom/google/android/gms/nearby/messages/BleSignal;)V

    .line 68
    .line 69
    .line 70
    :cond_3
    const/16 v1, 0x10

    .line 71
    .line 72
    invoke-virtual {v0, v1}, Lcom/google/android/gms/nearby/messages/internal/Update;->v(I)Z

    .line 73
    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_4
    return-void
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
.end method


# virtual methods
.method public final Y(Ljava/util/List;)V
    .locals 2

    iget-object v0, p0, Lqa/a1;->a:Lcom/google/android/gms/common/api/internal/d;

    new-instance v1, Lqa/z0;

    invoke-direct {v1, p0, p1}, Lqa/z0;-><init>(Lqa/a1;Ljava/util/List;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/common/api/internal/d;->c(Lcom/google/android/gms/common/api/internal/d$b;)V

    return-void
.end method
