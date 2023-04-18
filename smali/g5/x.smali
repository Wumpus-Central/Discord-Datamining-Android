.class public Lg5/x;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lg5/b;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lg5/b<",
        "Landroid/icu/util/ULocale;",
        ">;"
    }
.end annotation


# instance fields
.field private a:Landroid/icu/util/ULocale;

.field private b:Landroid/icu/util/ULocale$Builder;

.field private c:Z


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method private constructor <init>(Landroid/icu/util/ULocale;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lg5/x;->b:Landroid/icu/util/ULocale$Builder;

    const/4 v0, 0x0

    .line 3
    iput-boolean v0, p0, Lg5/x;->c:Z

    .line 4
    iput-object p1, p0, Lg5/x;->a:Landroid/icu/util/ULocale;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;)V
    .locals 1

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 6
    iput-object v0, p0, Lg5/x;->a:Landroid/icu/util/ULocale;

    .line 7
    iput-object v0, p0, Lg5/x;->b:Landroid/icu/util/ULocale$Builder;

    const/4 v0, 0x0

    .line 8
    iput-boolean v0, p0, Lg5/x;->c:Z

    .line 9
    new-instance v0, Landroid/icu/util/ULocale$Builder;

    invoke-direct {v0}, Landroid/icu/util/ULocale$Builder;-><init>()V

    iput-object v0, p0, Lg5/x;->b:Landroid/icu/util/ULocale$Builder;

    .line 10
    :try_start_0
    invoke-static {v0, p1}, Lg5/v;->a(Landroid/icu/util/ULocale$Builder;Ljava/lang/String;)Landroid/icu/util/ULocale$Builder;
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    const/4 p1, 0x1

    .line 11
    iput-boolean p1, p0, Lg5/x;->c:Z

    return-void

    :catch_0
    move-exception p1

    .line 12
    new-instance v0, Lg5/j;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Lg5/j;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static i()Lg5/b;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lg5/b<",
            "Landroid/icu/util/ULocale;",
            ">;"
        }
    .end annotation

    new-instance v0, Lg5/x;

    invoke-static {}, Lg5/p;->a()Landroid/icu/util/ULocale$Category;

    move-result-object v1

    invoke-static {v1}, Lg5/q;->a(Landroid/icu/util/ULocale$Category;)Landroid/icu/util/ULocale;

    move-result-object v1

    invoke-direct {v0, v1}, Lg5/x;-><init>(Landroid/icu/util/ULocale;)V

    return-object v0
.end method

.method public static j(Ljava/lang/String;)Lg5/b;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lg5/b<",
            "Landroid/icu/util/ULocale;",
            ">;"
        }
    .end annotation

    new-instance v0, Lg5/x;

    invoke-direct {v0, p0}, Lg5/x;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method public static k(Landroid/icu/util/ULocale;)Lg5/b;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/icu/util/ULocale;",
            ")",
            "Lg5/b<",
            "Landroid/icu/util/ULocale;",
            ">;"
        }
    .end annotation

    new-instance v0, Lg5/x;

    invoke-direct {v0, p0}, Lg5/x;-><init>(Landroid/icu/util/ULocale;)V

    return-object v0
.end method

.method private l()V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lg5/x;->c:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    :try_start_0
    iget-object v0, p0, Lg5/x;->b:Landroid/icu/util/ULocale$Builder;

    .line 6
    .line 7
    invoke-static {v0}, Lg5/n;->a(Landroid/icu/util/ULocale$Builder;)Landroid/icu/util/ULocale;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iput-object v0, p0, Lg5/x;->a:Landroid/icu/util/ULocale;
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 12
    .line 13
    const/4 v0, 0x0

    .line 14
    iput-boolean v0, p0, Lg5/x;->c:Z

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :catch_0
    move-exception v0

    .line 18
    new-instance v1, Lg5/j;

    .line 19
    .line 20
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-direct {v1, v0}, Lg5/j;-><init>(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    throw v1

    .line 28
    :cond_0
    :goto_0
    return-void
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
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Lg5/x;->m()Landroid/icu/util/ULocale;

    move-result-object v0

    invoke-static {v0}, Lg5/o;->a(Landroid/icu/util/ULocale;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public b()Ljava/util/HashMap;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Lg5/x;->l()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/HashMap;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 7
    .line 8
    .line 9
    iget-object v1, p0, Lg5/x;->a:Landroid/icu/util/ULocale;

    .line 10
    .line 11
    invoke-static {v1}, Lg5/t;->a(Landroid/icu/util/ULocale;)Ljava/util/Iterator;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    if-eqz v2, :cond_0

    .line 22
    .line 23
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    check-cast v2, Ljava/lang/String;

    .line 28
    .line 29
    invoke-static {v2}, Lg5/n3;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v3

    .line 33
    iget-object v4, p0, Lg5/x;->a:Landroid/icu/util/ULocale;

    .line 34
    .line 35
    invoke-static {v4, v2}, Lg5/u;->a(Landroid/icu/util/ULocale;Ljava/lang/String;)Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    invoke-virtual {v0, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_0
    return-object v0
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
.end method

.method public c(Ljava/lang/String;)Ljava/util/ArrayList;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Lg5/x;->l()V

    .line 2
    .line 3
    .line 4
    invoke-static {p1}, Lg5/n3;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    new-instance v0, Ljava/util/ArrayList;

    .line 9
    .line 10
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 11
    .line 12
    .line 13
    iget-object v1, p0, Lg5/x;->a:Landroid/icu/util/ULocale;

    .line 14
    .line 15
    invoke-static {v1, p1}, Lg5/u;->a(Landroid/icu/util/ULocale;Ljava/lang/String;)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    if-eqz p1, :cond_0

    .line 20
    .line 21
    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    if-nez v1, :cond_0

    .line 26
    .line 27
    const-string v1, "-|_"

    .line 28
    .line 29
    invoke-virtual {p1, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    invoke-static {v0, p1}, Ljava/util/Collections;->addAll(Ljava/util/Collection;[Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    :cond_0
    return-object v0
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
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
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
.end method

.method public bridge synthetic d()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lg5/x;->n()Landroid/icu/util/ULocale;

    move-result-object v0

    return-object v0
.end method

.method public e()Lg5/b;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lg5/b<",
            "Landroid/icu/util/ULocale;",
            ">;"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Lg5/x;->l()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lg5/x;

    .line 5
    .line 6
    iget-object v1, p0, Lg5/x;->a:Landroid/icu/util/ULocale;

    .line 7
    .line 8
    invoke-direct {v0, v1}, Lg5/x;-><init>(Landroid/icu/util/ULocale;)V

    .line 9
    .line 10
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
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
.end method

.method public f()Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Lg5/x;->n()Landroid/icu/util/ULocale;

    move-result-object v0

    invoke-static {v0}, Lg5/o;->a(Landroid/icu/util/ULocale;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public g(Ljava/lang/String;Ljava/util/ArrayList;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Lg5/x;->l()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lg5/x;->b:Landroid/icu/util/ULocale$Builder;

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    new-instance v0, Landroid/icu/util/ULocale$Builder;

    .line 9
    .line 10
    invoke-direct {v0}, Landroid/icu/util/ULocale$Builder;-><init>()V

    .line 11
    .line 12
    .line 13
    iget-object v1, p0, Lg5/x;->a:Landroid/icu/util/ULocale;

    .line 14
    .line 15
    invoke-static {v0, v1}, Lg5/r;->a(Landroid/icu/util/ULocale$Builder;Landroid/icu/util/ULocale;)Landroid/icu/util/ULocale$Builder;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    iput-object v0, p0, Lg5/x;->b:Landroid/icu/util/ULocale$Builder;

    .line 20
    .line 21
    :cond_0
    :try_start_0
    iget-object v0, p0, Lg5/x;->b:Landroid/icu/util/ULocale$Builder;

    .line 22
    .line 23
    const-string v1, "-"

    .line 24
    .line 25
    invoke-static {v1, p2}, Landroid/text/TextUtils;->join(Ljava/lang/CharSequence;Ljava/lang/Iterable;)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object p2

    .line 29
    invoke-static {v0, p1, p2}, Lg5/s;->a(Landroid/icu/util/ULocale$Builder;Ljava/lang/String;Ljava/lang/String;)Landroid/icu/util/ULocale$Builder;
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 30
    .line 31
    .line 32
    const/4 p1, 0x1

    .line 33
    iput-boolean p1, p0, Lg5/x;->c:Z

    .line 34
    .line 35
    return-void

    .line 36
    :catch_0
    move-exception p1

    .line 37
    new-instance p2, Lg5/j;

    .line 38
    .line 39
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    invoke-direct {p2, p1}, Lg5/j;-><init>(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    throw p2
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
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
.end method

.method public bridge synthetic h()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lg5/x;->m()Landroid/icu/util/ULocale;

    move-result-object v0

    return-object v0
.end method

.method public m()Landroid/icu/util/ULocale;
    .locals 1

    .line 1
    invoke-direct {p0}, Lg5/x;->l()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lg5/x;->a:Landroid/icu/util/ULocale;

    .line 5
    .line 6
    return-object v0
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
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
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
.end method

.method public n()Landroid/icu/util/ULocale;
    .locals 2

    .line 1
    invoke-direct {p0}, Lg5/x;->l()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Landroid/icu/util/ULocale$Builder;

    .line 5
    .line 6
    invoke-direct {v0}, Landroid/icu/util/ULocale$Builder;-><init>()V

    .line 7
    .line 8
    .line 9
    iget-object v1, p0, Lg5/x;->a:Landroid/icu/util/ULocale;

    .line 10
    .line 11
    invoke-static {v0, v1}, Lg5/r;->a(Landroid/icu/util/ULocale$Builder;Landroid/icu/util/ULocale;)Landroid/icu/util/ULocale$Builder;

    .line 12
    .line 13
    .line 14
    invoke-static {v0}, Lg5/w;->a(Landroid/icu/util/ULocale$Builder;)Landroid/icu/util/ULocale$Builder;

    .line 15
    .line 16
    .line 17
    invoke-static {v0}, Lg5/n;->a(Landroid/icu/util/ULocale$Builder;)Landroid/icu/util/ULocale;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    return-object v0
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
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
.end method
