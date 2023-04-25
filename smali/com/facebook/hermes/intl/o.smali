.class public Lcom/facebook/hermes/intl/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/facebook/hermes/intl/b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/hermes/intl/o$a;
    }
.end annotation


# instance fields
.field private a:Landroid/icu/text/DateFormat;


# direct methods
.method constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-object v0, p0, Lcom/facebook/hermes/intl/o;->a:Landroid/icu/text/DateFormat;

    .line 6
    .line 7
    return-void
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

.method private static i(Lcom/facebook/hermes/intl/b$k;Lcom/facebook/hermes/intl/b$c;Lcom/facebook/hermes/intl/b$l;Lcom/facebook/hermes/intl/b$h;Lcom/facebook/hermes/intl/b$b;Lcom/facebook/hermes/intl/b$e;Lcom/facebook/hermes/intl/b$g;Lcom/facebook/hermes/intl/b$i;Lcom/facebook/hermes/intl/b$j;Z)Ljava/lang/String;
    .locals 1

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/facebook/hermes/intl/b$k;->a()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    invoke-virtual {p1}, Lcom/facebook/hermes/intl/b$c;->a()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    invoke-virtual {p2}, Lcom/facebook/hermes/intl/b$l;->a()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    invoke-virtual {p3}, Lcom/facebook/hermes/intl/b$h;->a()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    invoke-virtual {p4}, Lcom/facebook/hermes/intl/b$b;->a()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    if-eqz p9, :cond_0

    .line 42
    .line 43
    invoke-virtual {p5}, Lcom/facebook/hermes/intl/b$e;->a()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_0
    invoke-virtual {p5}, Lcom/facebook/hermes/intl/b$e;->b()Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    :goto_0
    invoke-virtual {p6}, Lcom/facebook/hermes/intl/b$g;->a()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    invoke-virtual {p7}, Lcom/facebook/hermes/intl/b$i;->a()Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object p0

    .line 69
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    invoke-virtual {p8}, Lcom/facebook/hermes/intl/b$j;->a()Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object p0

    .line 76
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 77
    .line 78
    .line 79
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object p0

    .line 83
    return-object p0
.end method


# virtual methods
.method public a(D)Ljava/text/AttributedCharacterIterator;
    .locals 1

    iget-object v0, p0, Lcom/facebook/hermes/intl/o;->a:Landroid/icu/text/DateFormat;

    invoke-static {p1, p2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p1

    invoke-static {v0, p1}, Lg5/h1;->a(Landroid/icu/text/DateFormat;Ljava/lang/Object;)Ljava/text/AttributedCharacterIterator;

    move-result-object p1

    return-object p1
.end method

.method public b(Lg5/b;)Ljava/lang/String;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lg5/b<",
            "*>;)",
            "Ljava/lang/String;"
        }
    .end annotation

    invoke-interface {p1}, Lg5/b;->h()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/icu/util/ULocale;

    invoke-static {p1}, Lg5/y0;->a(Landroid/icu/util/ULocale;)Landroid/icu/text/NumberingSystem;

    move-result-object p1

    invoke-static {p1}, Lg5/z0;->a(Landroid/icu/text/NumberingSystem;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public c(D)Ljava/lang/String;
    .locals 2

    iget-object v0, p0, Lcom/facebook/hermes/intl/o;->a:Landroid/icu/text/DateFormat;

    new-instance v1, Ljava/util/Date;

    double-to-long p1, p1

    invoke-direct {v1, p1, p2}, Ljava/util/Date;-><init>(J)V

    invoke-static {v0, v1}, Lg5/a1;->a(Landroid/icu/text/DateFormat;Ljava/util/Date;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public d(Lg5/b;)Ljava/lang/String;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lg5/b<",
            "*>;)",
            "Ljava/lang/String;"
        }
    .end annotation

    invoke-interface {p1}, Lg5/b;->h()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/icu/util/ULocale;

    invoke-static {p1}, Lg5/k0;->a(Landroid/icu/util/ULocale;)Landroid/icu/util/Calendar;

    move-result-object p1

    invoke-static {p1}, Lg5/v0;->a(Landroid/icu/util/Calendar;)Landroid/icu/util/TimeZone;

    move-result-object p1

    invoke-static {p1}, Lg5/g1;->a(Landroid/icu/util/TimeZone;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public e(Ljava/text/AttributedCharacterIterator$Attribute;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 1
    invoke-static {}, Lg5/i1;->a()Landroid/icu/text/DateFormat$Field;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-ne p1, v0, :cond_0

    .line 6
    .line 7
    const-string p1, "weekday"

    .line 8
    .line 9
    return-object p1

    .line 10
    :cond_0
    invoke-static {}, Lg5/m1;->a()Landroid/icu/text/DateFormat$Field;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    if-ne p1, v0, :cond_1

    .line 15
    .line 16
    const-string p1, "era"

    .line 17
    .line 18
    return-object p1

    .line 19
    :cond_1
    invoke-static {}, Lg5/n1;->a()Landroid/icu/text/DateFormat$Field;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    if-ne p1, v0, :cond_2

    .line 24
    .line 25
    :try_start_0
    invoke-static {p2}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    .line 26
    .line 27
    .line 28
    const-string p1, "year"
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 29
    .line 30
    return-object p1

    .line 31
    :catch_0
    const-string p1, "yearName"

    .line 32
    .line 33
    return-object p1

    .line 34
    :cond_2
    invoke-static {}, Lg5/l0;->a()Landroid/icu/text/DateFormat$Field;

    .line 35
    .line 36
    .line 37
    move-result-object p2

    .line 38
    if-ne p1, p2, :cond_3

    .line 39
    .line 40
    const-string p1, "month"

    .line 41
    .line 42
    return-object p1

    .line 43
    :cond_3
    invoke-static {}, Lg5/m0;->a()Landroid/icu/text/DateFormat$Field;

    .line 44
    .line 45
    .line 46
    move-result-object p2

    .line 47
    if-ne p1, p2, :cond_4

    .line 48
    .line 49
    const-string p1, "day"

    .line 50
    .line 51
    return-object p1

    .line 52
    :cond_4
    invoke-static {}, Lg5/n0;->a()Landroid/icu/text/DateFormat$Field;

    .line 53
    .line 54
    .line 55
    move-result-object p2

    .line 56
    const-string v0, "hour"

    .line 57
    .line 58
    if-ne p1, p2, :cond_5

    .line 59
    .line 60
    return-object v0

    .line 61
    :cond_5
    invoke-static {}, Lg5/o0;->a()Landroid/icu/text/DateFormat$Field;

    .line 62
    .line 63
    .line 64
    move-result-object p2

    .line 65
    if-ne p1, p2, :cond_6

    .line 66
    .line 67
    return-object v0

    .line 68
    :cond_6
    invoke-static {}, Lg5/p0;->a()Landroid/icu/text/DateFormat$Field;

    .line 69
    .line 70
    .line 71
    move-result-object p2

    .line 72
    if-ne p1, p2, :cond_7

    .line 73
    .line 74
    return-object v0

    .line 75
    :cond_7
    invoke-static {}, Lg5/q0;->a()Landroid/icu/text/DateFormat$Field;

    .line 76
    .line 77
    .line 78
    move-result-object p2

    .line 79
    if-ne p1, p2, :cond_8

    .line 80
    .line 81
    return-object v0

    .line 82
    :cond_8
    invoke-static {}, Lg5/r0;->a()Landroid/icu/text/DateFormat$Field;

    .line 83
    .line 84
    .line 85
    move-result-object p2

    .line 86
    if-ne p1, p2, :cond_9

    .line 87
    .line 88
    const-string p1, "minute"

    .line 89
    .line 90
    return-object p1

    .line 91
    :cond_9
    invoke-static {}, Lg5/j1;->a()Landroid/icu/text/DateFormat$Field;

    .line 92
    .line 93
    .line 94
    move-result-object p2

    .line 95
    if-ne p1, p2, :cond_a

    .line 96
    .line 97
    const-string p1, "second"

    .line 98
    .line 99
    return-object p1

    .line 100
    :cond_a
    invoke-static {}, Lg5/k1;->a()Landroid/icu/text/DateFormat$Field;

    .line 101
    .line 102
    .line 103
    move-result-object p2

    .line 104
    if-ne p1, p2, :cond_b

    .line 105
    .line 106
    const-string p1, "timeZoneName"

    .line 107
    .line 108
    return-object p1

    .line 109
    :cond_b
    invoke-static {}, Lg5/l1;->a()Landroid/icu/text/DateFormat$Field;

    .line 110
    .line 111
    .line 112
    move-result-object p2

    .line 113
    if-ne p1, p2, :cond_c

    .line 114
    .line 115
    const-string p1, "dayPeriod"

    .line 116
    .line 117
    return-object p1

    .line 118
    :cond_c
    invoke-virtual {p1}, Ljava/text/AttributedCharacterIterator$Attribute;->toString()Ljava/lang/String;

    .line 119
    .line 120
    .line 121
    move-result-object p1

    .line 122
    const-string p2, "android.icu.text.DateFormat$Field(related year)"

    .line 123
    .line 124
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 125
    .line 126
    .line 127
    move-result p1

    .line 128
    if-eqz p1, :cond_d

    .line 129
    .line 130
    const-string p1, "relatedYear"

    .line 131
    .line 132
    return-object p1

    .line 133
    :cond_d
    const-string p1, "literal"

    .line 134
    .line 135
    return-object p1
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

.method public f(Lg5/b;)Ljava/lang/String;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lg5/b<",
            "*>;)",
            "Ljava/lang/String;"
        }
    .end annotation

    .line 1
    invoke-interface {p1}, Lg5/b;->h()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Landroid/icu/util/ULocale;

    .line 6
    .line 7
    const/4 v0, 0x3

    .line 8
    invoke-static {v0, p1}, Lg5/b1;->a(ILandroid/icu/util/ULocale;)Landroid/icu/text/DateFormat;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-static {p1}, Lg5/c1;->a(Landroid/icu/text/DateFormat;)Landroid/icu/util/Calendar;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    invoke-static {p1}, Lg5/d1;->a(Landroid/icu/util/Calendar;)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    invoke-static {p1}, Lg5/n3;->d(Ljava/lang/String;)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    return-object p1
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
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
.end method

.method public g(Lg5/b;)Lcom/facebook/hermes/intl/b$f;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lg5/b<",
            "*>;)",
            "Lcom/facebook/hermes/intl/b$f;"
        }
    .end annotation

    .line 1
    :try_start_0
    invoke-interface {p1}, Lg5/b;->h()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Landroid/icu/util/ULocale;

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    invoke-static {v0, p1}, Lg5/e1;->a(ILandroid/icu/util/ULocale;)Landroid/icu/text/DateFormat;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    check-cast p1, Landroid/icu/text/SimpleDateFormat;

    .line 13
    .line 14
    invoke-static {p1}, Lg5/f1;->a(Landroid/icu/text/SimpleDateFormat;)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    invoke-static {p1}, Lcom/facebook/hermes/intl/o$a;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    const/16 v0, 0x68

    .line 23
    .line 24
    invoke-static {v0}, Ljava/lang/String;->valueOf(C)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    invoke-virtual {p1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    if-eqz v0, :cond_0

    .line 33
    .line 34
    sget-object p1, Lcom/facebook/hermes/intl/b$f;->l:Lcom/facebook/hermes/intl/b$f;

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_0
    const/16 v0, 0x4b

    .line 38
    .line 39
    invoke-static {v0}, Ljava/lang/String;->valueOf(C)Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    invoke-virtual {p1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    if-eqz v0, :cond_1

    .line 48
    .line 49
    sget-object p1, Lcom/facebook/hermes/intl/b$f;->k:Lcom/facebook/hermes/intl/b$f;

    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_1
    const/16 v0, 0x48

    .line 53
    .line 54
    invoke-static {v0}, Ljava/lang/String;->valueOf(C)Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    invoke-virtual {p1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 59
    .line 60
    .line 61
    move-result p1

    .line 62
    if-eqz p1, :cond_2

    .line 63
    .line 64
    sget-object p1, Lcom/facebook/hermes/intl/b$f;->m:Lcom/facebook/hermes/intl/b$f;

    .line 65
    .line 66
    goto :goto_0

    .line 67
    :cond_2
    sget-object p1, Lcom/facebook/hermes/intl/b$f;->n:Lcom/facebook/hermes/intl/b$f;
    :try_end_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0

    .line 68
    .line 69
    goto :goto_0

    .line 70
    :catch_0
    sget-object p1, Lcom/facebook/hermes/intl/b$f;->n:Lcom/facebook/hermes/intl/b$f;

    .line 71
    .line 72
    :goto_0
    return-object p1
    .line 73
    .line 74
    .line 75
.end method

.method public h(Lg5/b;Ljava/lang/String;Ljava/lang/String;Lcom/facebook/hermes/intl/b$d;Lcom/facebook/hermes/intl/b$k;Lcom/facebook/hermes/intl/b$c;Lcom/facebook/hermes/intl/b$l;Lcom/facebook/hermes/intl/b$h;Lcom/facebook/hermes/intl/b$b;Lcom/facebook/hermes/intl/b$e;Lcom/facebook/hermes/intl/b$g;Lcom/facebook/hermes/intl/b$i;Lcom/facebook/hermes/intl/b$j;Lcom/facebook/hermes/intl/b$f;Ljava/lang/Object;)V
    .locals 14
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lg5/b<",
            "*>;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/facebook/hermes/intl/b$d;",
            "Lcom/facebook/hermes/intl/b$k;",
            "Lcom/facebook/hermes/intl/b$c;",
            "Lcom/facebook/hermes/intl/b$l;",
            "Lcom/facebook/hermes/intl/b$h;",
            "Lcom/facebook/hermes/intl/b$b;",
            "Lcom/facebook/hermes/intl/b$e;",
            "Lcom/facebook/hermes/intl/b$g;",
            "Lcom/facebook/hermes/intl/b$i;",
            "Lcom/facebook/hermes/intl/b$j;",
            "Lcom/facebook/hermes/intl/b$f;",
            "Ljava/lang/Object;",
            ")V"
        }
    .end annotation

    move-object v0, p0

    move-object/from16 v1, p3

    move-object/from16 v2, p14

    const-string v3, "Invalid numbering system: "

    .line 1
    sget-object v4, Lcom/facebook/hermes/intl/b$f;->k:Lcom/facebook/hermes/intl/b$f;

    if-eq v2, v4, :cond_1

    sget-object v4, Lcom/facebook/hermes/intl/b$f;->l:Lcom/facebook/hermes/intl/b$f;

    if-ne v2, v4, :cond_0

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v2, 0x1

    :goto_1
    move v13, v2

    move-object/from16 v4, p5

    move-object/from16 v5, p6

    move-object/from16 v6, p7

    move-object/from16 v7, p8

    move-object/from16 v8, p9

    move-object/from16 v9, p10

    move-object/from16 v10, p11

    move-object/from16 v11, p12

    move-object/from16 v12, p13

    .line 2
    invoke-static/range {v4 .. v13}, Lcom/facebook/hermes/intl/o;->i(Lcom/facebook/hermes/intl/b$k;Lcom/facebook/hermes/intl/b$c;Lcom/facebook/hermes/intl/b$l;Lcom/facebook/hermes/intl/b$h;Lcom/facebook/hermes/intl/b$b;Lcom/facebook/hermes/intl/b$e;Lcom/facebook/hermes/intl/b$g;Lcom/facebook/hermes/intl/b$i;Lcom/facebook/hermes/intl/b$j;Z)Ljava/lang/String;

    move-result-object v2

    .line 3
    invoke-virtual/range {p2 .. p2}, Ljava/lang/String;->isEmpty()Z

    move-result v4

    if-nez v4, :cond_2

    .line 4
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 5
    invoke-static/range {p2 .. p2}, Lg5/i;->h(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 6
    invoke-interface {p1}, Lg5/b;->d()Lg5/b;

    move-result-object v5

    const-string v6, "ca"

    .line 7
    invoke-interface {v5, v6, v4}, Lg5/b;->f(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 8
    invoke-interface {v5}, Lg5/b;->h()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/icu/util/ULocale;

    invoke-static {v4}, Lg5/k0;->a(Landroid/icu/util/ULocale;)Landroid/icu/util/Calendar;

    move-result-object v4

    goto :goto_2

    :cond_2
    const/4 v4, 0x0

    .line 9
    :goto_2
    invoke-virtual/range {p3 .. p3}, Ljava/lang/String;->isEmpty()Z

    move-result v5

    if-nez v5, :cond_4

    .line 10
    :try_start_0
    invoke-static/range {p3 .. p3}, Lg5/i;->h(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lg5/s0;->a(Ljava/lang/String;)Landroid/icu/text/NumberingSystem;

    move-result-object v5
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    if-eqz v5, :cond_3

    .line 11
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 12
    invoke-static/range {p3 .. p3}, Lg5/i;->h(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const-string v1, "nu"

    move-object v5, p1

    .line 13
    invoke-interface {p1, v1, v3}, Lg5/b;->f(Ljava/lang/String;Ljava/util/ArrayList;)V

    goto :goto_3

    .line 14
    :cond_3
    new-instance v2, Lg5/j;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v1}, Lg5/j;-><init>(Ljava/lang/String;)V

    throw v2

    .line 15
    :catch_0
    new-instance v2, Lg5/j;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v1}, Lg5/j;-><init>(Ljava/lang/String;)V

    throw v2

    :cond_4
    move-object v5, p1

    :goto_3
    if-eqz v4, :cond_5

    .line 16
    invoke-interface {p1}, Lg5/b;->h()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/icu/util/ULocale;

    .line 17
    invoke-static {v4, v2, v1}, Lg5/t0;->a(Landroid/icu/util/Calendar;Ljava/lang/String;Landroid/icu/util/ULocale;)Landroid/icu/text/DateFormat;

    move-result-object v1

    iput-object v1, v0, Lcom/facebook/hermes/intl/o;->a:Landroid/icu/text/DateFormat;

    goto :goto_4

    .line 18
    :cond_5
    invoke-interface {p1}, Lg5/b;->h()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/icu/util/ULocale;

    invoke-static {v2, v1}, Lg5/u0;->a(Ljava/lang/String;Landroid/icu/util/ULocale;)Landroid/icu/text/DateFormat;

    move-result-object v1

    iput-object v1, v0, Lcom/facebook/hermes/intl/o;->a:Landroid/icu/text/DateFormat;

    .line 19
    :goto_4
    invoke-static/range {p15 .. p15}, Lg5/i;->n(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    invoke-static/range {p15 .. p15}, Lg5/i;->j(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    .line 20
    invoke-static/range {p15 .. p15}, Lg5/i;->h(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lg5/w0;->a(Ljava/lang/String;)Landroid/icu/util/TimeZone;

    move-result-object v1

    .line 21
    iget-object v2, v0, Lcom/facebook/hermes/intl/o;->a:Landroid/icu/text/DateFormat;

    invoke-static {v2, v1}, Lg5/x0;->a(Landroid/icu/text/DateFormat;Landroid/icu/util/TimeZone;)V

    :cond_6
    return-void
.end method
