.class public final Lgj/a$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lgj/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field private final a:Ljava/util/Map;
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

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lgj/a$b;->a:Ljava/util/Map;

    return-void
.end method

.method public constructor <init>(Lfj/x;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lfj/x<",
            "*>;)V"
        }
    .end annotation

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lgj/a$b;->a:Ljava/util/Map;

    .line 5
    sget-object v0, Lgj/a;->b:Lfj/c;

    invoke-static {p1}, Lgj/b;->a(Lfj/x;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, v0, p1}, Lgj/a$b;->g(Lfj/c;Ljava/lang/Object;)V

    return-void
.end method

.method private g(Lfj/c;Ljava/lang/Object;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<A:",
            "Ljava/lang/Object;",
            ">(",
            "Lfj/c<",
            "TA;>;TA;)V"
        }
    .end annotation

    .line 1
    if-eqz p2, :cond_0

    .line 2
    .line 3
    iget-object v0, p0, Lgj/a$b;->a:Ljava/util/Map;

    .line 4
    .line 5
    invoke-interface {p1}, Lfj/c;->name()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    new-instance p2, Ljava/lang/NullPointerException;

    .line 14
    .line 15
    new-instance v0, Ljava/lang/StringBuilder;

    .line 16
    .line 17
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 18
    .line 19
    .line 20
    const-string v1, "Missing attribute value for key: "

    .line 21
    .line 22
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    invoke-direct {p2, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    throw p2
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


# virtual methods
.method public a()Lgj/a;
    .locals 3

    new-instance v0, Lgj/a;

    iget-object v1, p0, Lgj/a$b;->a:Ljava/util/Map;

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lgj/a;-><init>(Ljava/util/Map;Lgj/a$a;)V

    return-object v0
.end method

.method public b(Lfj/c;C)Lgj/a$b;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lfj/c<",
            "Ljava/lang/Character;",
            ">;C)",
            "Lgj/a$b;"
        }
    .end annotation

    iget-object v0, p0, Lgj/a$b;->a:Ljava/util/Map;

    invoke-interface {p1}, Lfj/c;->name()Ljava/lang/String;

    move-result-object p1

    invoke-static {p2}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object p2

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object p0
.end method

.method public c(Lfj/c;I)Lgj/a$b;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lfj/c<",
            "Ljava/lang/Integer;",
            ">;I)",
            "Lgj/a$b;"
        }
    .end annotation

    .line 1
    sget-object v0, Lgj/a;->q:Lfj/c;

    .line 2
    .line 3
    if-ne p1, v0, :cond_1

    .line 4
    .line 5
    const/16 v0, 0x64

    .line 6
    .line 7
    if-lt p2, v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 11
    .line 12
    new-instance v0, Ljava/lang/StringBuilder;

    .line 13
    .line 14
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 15
    .line 16
    .line 17
    const-string v1, "Pivot year in far past not supported: "

    .line 18
    .line 19
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object p2

    .line 29
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    throw p1

    .line 33
    :cond_1
    :goto_0
    iget-object v0, p0, Lgj/a$b;->a:Ljava/util/Map;

    .line 34
    .line 35
    invoke-interface {p1}, Lfj/c;->name()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 40
    .line 41
    .line 42
    move-result-object p2

    .line 43
    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    return-object p0
    .line 47
    .line 48
    .line 49
.end method

.method public d(Lfj/c;Ljava/lang/Enum;)Lgj/a$b;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<A:",
            "Ljava/lang/Enum<",
            "TA;>;>(",
            "Lfj/c<",
            "TA;>;TA;)",
            "Lgj/a$b;"
        }
    .end annotation

    .line 1
    if-eqz p2, :cond_5

    .line 2
    .line 3
    iget-object v0, p0, Lgj/a$b;->a:Ljava/util/Map;

    .line 4
    .line 5
    invoke-interface {p1}, Lfj/c;->name()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-interface {v0, v1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    sget-object v0, Lgj/a;->f:Lfj/c;

    .line 13
    .line 14
    const/4 v1, 0x0

    .line 15
    if-ne p1, v0, :cond_3

    .line 16
    .line 17
    sget-object p1, Lgj/a$a;->a:[I

    .line 18
    .line 19
    const-class v0, Lgj/g;

    .line 20
    .line 21
    invoke-virtual {v0, p2}, Ljava/lang/Class;->cast(Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    check-cast v0, Lgj/g;

    .line 26
    .line 27
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    aget p1, p1, v0

    .line 32
    .line 33
    const/4 v0, 0x1

    .line 34
    if-eq p1, v0, :cond_2

    .line 35
    .line 36
    const/4 v2, 0x2

    .line 37
    if-eq p1, v2, :cond_1

    .line 38
    .line 39
    const/4 v1, 0x3

    .line 40
    if-ne p1, v1, :cond_0

    .line 41
    .line 42
    sget-object p1, Lgj/a;->i:Lfj/c;

    .line 43
    .line 44
    invoke-virtual {p0, p1, v0}, Lgj/a$b;->e(Lfj/c;Z)Lgj/a$b;

    .line 45
    .line 46
    .line 47
    sget-object p1, Lgj/a;->j:Lfj/c;

    .line 48
    .line 49
    invoke-virtual {p0, p1, v0}, Lgj/a$b;->e(Lfj/c;Z)Lgj/a$b;

    .line 50
    .line 51
    .line 52
    sget-object p1, Lgj/a;->r:Lfj/c;

    .line 53
    .line 54
    invoke-virtual {p0, p1, v0}, Lgj/a$b;->e(Lfj/c;Z)Lgj/a$b;

    .line 55
    .line 56
    .line 57
    sget-object p1, Lgj/a;->k:Lfj/c;

    .line 58
    .line 59
    invoke-virtual {p0, p1, v0}, Lgj/a$b;->e(Lfj/c;Z)Lgj/a$b;

    .line 60
    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_0
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    .line 64
    .line 65
    invoke-virtual {p2}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object p2

    .line 69
    invoke-direct {p1, p2}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    throw p1

    .line 73
    :cond_1
    sget-object p1, Lgj/a;->i:Lfj/c;

    .line 74
    .line 75
    invoke-virtual {p0, p1, v0}, Lgj/a$b;->e(Lfj/c;Z)Lgj/a$b;

    .line 76
    .line 77
    .line 78
    sget-object p1, Lgj/a;->j:Lfj/c;

    .line 79
    .line 80
    invoke-virtual {p0, p1, v1}, Lgj/a$b;->e(Lfj/c;Z)Lgj/a$b;

    .line 81
    .line 82
    .line 83
    sget-object p1, Lgj/a;->r:Lfj/c;

    .line 84
    .line 85
    invoke-virtual {p0, p1, v1}, Lgj/a$b;->e(Lfj/c;Z)Lgj/a$b;

    .line 86
    .line 87
    .line 88
    sget-object p1, Lgj/a;->k:Lfj/c;

    .line 89
    .line 90
    invoke-virtual {p0, p1, v0}, Lgj/a$b;->e(Lfj/c;Z)Lgj/a$b;

    .line 91
    .line 92
    .line 93
    goto :goto_0

    .line 94
    :cond_2
    sget-object p1, Lgj/a;->i:Lfj/c;

    .line 95
    .line 96
    invoke-virtual {p0, p1, v1}, Lgj/a$b;->e(Lfj/c;Z)Lgj/a$b;

    .line 97
    .line 98
    .line 99
    sget-object p1, Lgj/a;->j:Lfj/c;

    .line 100
    .line 101
    invoke-virtual {p0, p1, v1}, Lgj/a$b;->e(Lfj/c;Z)Lgj/a$b;

    .line 102
    .line 103
    .line 104
    sget-object p1, Lgj/a;->r:Lfj/c;

    .line 105
    .line 106
    invoke-virtual {p0, p1, v1}, Lgj/a$b;->e(Lfj/c;Z)Lgj/a$b;

    .line 107
    .line 108
    .line 109
    sget-object p1, Lgj/a;->k:Lfj/c;

    .line 110
    .line 111
    invoke-virtual {p0, p1, v1}, Lgj/a$b;->e(Lfj/c;Z)Lgj/a$b;

    .line 112
    .line 113
    .line 114
    goto :goto_0

    .line 115
    :cond_3
    sget-object v0, Lgj/a;->l:Lfj/c;

    .line 116
    .line 117
    if-ne p1, v0, :cond_4

    .line 118
    .line 119
    const-class p1, Lgj/j;

    .line 120
    .line 121
    invoke-virtual {p1, p2}, Ljava/lang/Class;->cast(Ljava/lang/Object;)Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    move-result-object p1

    .line 125
    check-cast p1, Lgj/j;

    .line 126
    .line 127
    invoke-virtual {p1}, Lgj/j;->n()Z

    .line 128
    .line 129
    .line 130
    move-result p2

    .line 131
    if-eqz p2, :cond_4

    .line 132
    .line 133
    sget-object p2, Lgj/a;->m:Lfj/c;

    .line 134
    .line 135
    invoke-virtual {p1}, Lgj/j;->l()Ljava/lang/String;

    .line 136
    .line 137
    .line 138
    move-result-object p1

    .line 139
    invoke-virtual {p1, v1}, Ljava/lang/String;->charAt(I)C

    .line 140
    .line 141
    .line 142
    move-result p1

    .line 143
    invoke-virtual {p0, p2, p1}, Lgj/a$b;->b(Lfj/c;C)Lgj/a$b;

    .line 144
    .line 145
    .line 146
    :cond_4
    :goto_0
    return-object p0

    .line 147
    :cond_5
    new-instance p2, Ljava/lang/NullPointerException;

    .line 148
    .line 149
    new-instance v0, Ljava/lang/StringBuilder;

    .line 150
    .line 151
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 152
    .line 153
    .line 154
    const-string v1, "Missing attribute value for key: "

    .line 155
    .line 156
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 157
    .line 158
    .line 159
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 160
    .line 161
    .line 162
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 163
    .line 164
    .line 165
    move-result-object p1

    .line 166
    invoke-direct {p2, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 167
    .line 168
    .line 169
    throw p2
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

.method public e(Lfj/c;Z)Lgj/a$b;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lfj/c<",
            "Ljava/lang/Boolean;",
            ">;Z)",
            "Lgj/a$b;"
        }
    .end annotation

    iget-object v0, p0, Lgj/a$b;->a:Ljava/util/Map;

    invoke-interface {p1}, Lfj/c;->name()Ljava/lang/String;

    move-result-object p1

    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p2

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object p0
.end method

.method public f(Lgj/a;)Lgj/a$b;
    .locals 1

    iget-object v0, p0, Lgj/a$b;->a:Ljava/util/Map;

    invoke-static {p1}, Lgj/a;->d(Lgj/a;)Ljava/util/Map;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    return-object p0
.end method

.method public h(Ljava/util/Locale;)Lgj/a$b;
    .locals 1

    sget-object v0, Lgj/a;->c:Lfj/c;

    invoke-direct {p0, v0, p1}, Lgj/a$b;->g(Lfj/c;Ljava/lang/Object;)V

    return-object p0
.end method

.method public i(Lnet/time4j/tz/k;)Lgj/a$b;
    .locals 1

    sget-object v0, Lgj/a;->d:Lfj/c;

    invoke-direct {p0, v0, p1}, Lgj/a$b;->g(Lfj/c;Ljava/lang/Object;)V

    return-object p0
.end method
