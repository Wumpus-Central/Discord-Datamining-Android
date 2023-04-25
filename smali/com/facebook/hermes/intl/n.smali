.class public Lcom/facebook/hermes/intl/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/facebook/hermes/intl/b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/hermes/intl/n$a;
    }
.end annotation


# instance fields
.field private a:Ljava/text/DateFormat;


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
    iput-object v0, p0, Lcom/facebook/hermes/intl/n;->a:Ljava/text/DateFormat;

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


# virtual methods
.method public a(D)Ljava/text/AttributedCharacterIterator;
    .locals 1

    iget-object v0, p0, Lcom/facebook/hermes/intl/n;->a:Ljava/text/DateFormat;

    invoke-static {p1, p2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/text/Format;->formatToCharacterIterator(Ljava/lang/Object;)Ljava/text/AttributedCharacterIterator;

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

    const-string p1, "latn"

    return-object p1
.end method

.method public c(D)Ljava/lang/String;
    .locals 2

    iget-object v0, p0, Lcom/facebook/hermes/intl/n;->a:Ljava/text/DateFormat;

    new-instance v1, Ljava/util/Date;

    double-to-long p1, p1

    invoke-direct {v1, p1, p2}, Ljava/util/Date;-><init>(J)V

    invoke-virtual {v0, v1}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

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

    check-cast p1, Ljava/util/Locale;

    invoke-static {p1}, Ljava/util/Calendar;->getInstance(Ljava/util/Locale;)Ljava/util/Calendar;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/Calendar;->getTimeZone()Ljava/util/TimeZone;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/TimeZone;->getID()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public e(Ljava/text/AttributedCharacterIterator$Attribute;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 1
    sget-object v0, Ljava/text/DateFormat$Field;->DAY_OF_WEEK:Ljava/text/DateFormat$Field;

    .line 2
    .line 3
    if-ne p1, v0, :cond_0

    .line 4
    .line 5
    const-string p1, "weekday"

    .line 6
    .line 7
    return-object p1

    .line 8
    :cond_0
    sget-object v0, Ljava/text/DateFormat$Field;->ERA:Ljava/text/DateFormat$Field;

    .line 9
    .line 10
    if-ne p1, v0, :cond_1

    .line 11
    .line 12
    const-string p1, "era"

    .line 13
    .line 14
    return-object p1

    .line 15
    :cond_1
    sget-object v0, Ljava/text/DateFormat$Field;->YEAR:Ljava/text/DateFormat$Field;

    .line 16
    .line 17
    if-ne p1, v0, :cond_2

    .line 18
    .line 19
    :try_start_0
    invoke-static {p2}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    .line 20
    .line 21
    .line 22
    const-string p1, "year"
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 23
    .line 24
    return-object p1

    .line 25
    :catch_0
    const-string p1, "yearName"

    .line 26
    .line 27
    return-object p1

    .line 28
    :cond_2
    sget-object p2, Ljava/text/DateFormat$Field;->MONTH:Ljava/text/DateFormat$Field;

    .line 29
    .line 30
    if-ne p1, p2, :cond_3

    .line 31
    .line 32
    const-string p1, "month"

    .line 33
    .line 34
    return-object p1

    .line 35
    :cond_3
    sget-object p2, Ljava/text/DateFormat$Field;->DAY_OF_MONTH:Ljava/text/DateFormat$Field;

    .line 36
    .line 37
    if-ne p1, p2, :cond_4

    .line 38
    .line 39
    const-string p1, "day"

    .line 40
    .line 41
    return-object p1

    .line 42
    :cond_4
    sget-object p2, Ljava/text/DateFormat$Field;->HOUR0:Ljava/text/DateFormat$Field;

    .line 43
    .line 44
    const-string v0, "hour"

    .line 45
    .line 46
    if-ne p1, p2, :cond_5

    .line 47
    .line 48
    return-object v0

    .line 49
    :cond_5
    sget-object p2, Ljava/text/DateFormat$Field;->HOUR1:Ljava/text/DateFormat$Field;

    .line 50
    .line 51
    if-ne p1, p2, :cond_6

    .line 52
    .line 53
    return-object v0

    .line 54
    :cond_6
    sget-object p2, Ljava/text/DateFormat$Field;->HOUR_OF_DAY0:Ljava/text/DateFormat$Field;

    .line 55
    .line 56
    if-ne p1, p2, :cond_7

    .line 57
    .line 58
    return-object v0

    .line 59
    :cond_7
    sget-object p2, Ljava/text/DateFormat$Field;->HOUR_OF_DAY1:Ljava/text/DateFormat$Field;

    .line 60
    .line 61
    if-ne p1, p2, :cond_8

    .line 62
    .line 63
    return-object v0

    .line 64
    :cond_8
    sget-object p2, Ljava/text/DateFormat$Field;->MINUTE:Ljava/text/DateFormat$Field;

    .line 65
    .line 66
    if-ne p1, p2, :cond_9

    .line 67
    .line 68
    const-string p1, "minute"

    .line 69
    .line 70
    return-object p1

    .line 71
    :cond_9
    sget-object p2, Ljava/text/DateFormat$Field;->SECOND:Ljava/text/DateFormat$Field;

    .line 72
    .line 73
    if-ne p1, p2, :cond_a

    .line 74
    .line 75
    const-string p1, "second"

    .line 76
    .line 77
    return-object p1

    .line 78
    :cond_a
    sget-object p2, Ljava/text/DateFormat$Field;->TIME_ZONE:Ljava/text/DateFormat$Field;

    .line 79
    .line 80
    if-ne p1, p2, :cond_b

    .line 81
    .line 82
    const-string p1, "timeZoneName"

    .line 83
    .line 84
    return-object p1

    .line 85
    :cond_b
    sget-object p2, Ljava/text/DateFormat$Field;->AM_PM:Ljava/text/DateFormat$Field;

    .line 86
    .line 87
    if-ne p1, p2, :cond_c

    .line 88
    .line 89
    const-string p1, "dayPeriod"

    .line 90
    .line 91
    return-object p1

    .line 92
    :cond_c
    invoke-virtual {p1}, Ljava/text/AttributedCharacterIterator$Attribute;->toString()Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object p1

    .line 96
    const-string p2, "android.icu.text.DateFormat$Field(related year)"

    .line 97
    .line 98
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 99
    .line 100
    .line 101
    move-result p1

    .line 102
    if-eqz p1, :cond_d

    .line 103
    .line 104
    const-string p1, "relatedYear"

    .line 105
    .line 106
    return-object p1

    .line 107
    :cond_d
    const-string p1, "literal"

    .line 108
    .line 109
    return-object p1
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
    check-cast p1, Ljava/util/Locale;

    .line 6
    .line 7
    const/4 v0, 0x3

    .line 8
    invoke-static {v0, p1}, Ljava/text/DateFormat;->getDateInstance(ILjava/util/Locale;)Ljava/text/DateFormat;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-virtual {p1}, Ljava/text/DateFormat;->getCalendar()Ljava/util/Calendar;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    invoke-virtual {p1}, Ljava/util/Calendar;->toString()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    return-object p1
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
    check-cast p1, Ljava/util/Locale;

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    invoke-static {v0, p1}, Ljava/text/DateFormat;->getTimeInstance(ILjava/util/Locale;)Ljava/text/DateFormat;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    check-cast p1, Ljava/text/SimpleDateFormat;

    .line 13
    .line 14
    invoke-virtual {p1}, Ljava/text/SimpleDateFormat;->toPattern()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    invoke-static {p1}, Lcom/facebook/hermes/intl/n$a;->a(Ljava/lang/String;)Ljava/lang/String;

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
    .locals 0
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

    .line 1
    invoke-virtual {p2}, Ljava/lang/String;->isEmpty()Z

    move-result p4

    if-nez p4, :cond_0

    .line 2
    new-instance p4, Ljava/util/ArrayList;

    invoke-direct {p4}, Ljava/util/ArrayList;-><init>()V

    .line 3
    invoke-static {p2}, Lg5/i;->h(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p4, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const-string p2, "ca"

    .line 4
    invoke-interface {p1, p2, p4}, Lg5/b;->f(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 5
    :cond_0
    invoke-virtual {p3}, Ljava/lang/String;->isEmpty()Z

    move-result p2

    if-nez p2, :cond_1

    .line 6
    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    .line 7
    invoke-static {p3}, Lg5/i;->h(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p2, p3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const-string p3, "nu"

    .line 8
    invoke-interface {p1, p3, p2}, Lg5/b;->f(Ljava/lang/String;Ljava/util/ArrayList;)V

    :cond_1
    const/4 p2, 0x1

    const/4 p3, 0x0

    if-nez p7, :cond_3

    if-nez p8, :cond_3

    if-eqz p9, :cond_2

    goto :goto_0

    :cond_2
    move p4, p3

    goto :goto_1

    :cond_3
    :goto_0
    move p4, p2

    :goto_1
    if-nez p10, :cond_5

    if-nez p11, :cond_5

    if-eqz p12, :cond_4

    goto :goto_2

    :cond_4
    move p2, p3

    :cond_5
    :goto_2
    if-eqz p4, :cond_6

    if-eqz p2, :cond_6

    .line 9
    invoke-interface {p1}, Lg5/b;->h()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Locale;

    .line 10
    invoke-static {p3, p3, p1}, Ljava/text/DateFormat;->getDateTimeInstance(IILjava/util/Locale;)Ljava/text/DateFormat;

    move-result-object p1

    iput-object p1, p0, Lcom/facebook/hermes/intl/n;->a:Ljava/text/DateFormat;

    goto :goto_3

    :cond_6
    if-eqz p4, :cond_7

    .line 11
    invoke-interface {p1}, Lg5/b;->h()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Locale;

    invoke-static {p3, p1}, Ljava/text/DateFormat;->getDateInstance(ILjava/util/Locale;)Ljava/text/DateFormat;

    move-result-object p1

    iput-object p1, p0, Lcom/facebook/hermes/intl/n;->a:Ljava/text/DateFormat;

    goto :goto_3

    :cond_7
    if-eqz p2, :cond_8

    .line 12
    invoke-interface {p1}, Lg5/b;->h()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Locale;

    invoke-static {p3, p1}, Ljava/text/DateFormat;->getTimeInstance(ILjava/util/Locale;)Ljava/text/DateFormat;

    move-result-object p1

    iput-object p1, p0, Lcom/facebook/hermes/intl/n;->a:Ljava/text/DateFormat;

    .line 13
    :cond_8
    :goto_3
    invoke-static {p15}, Lg5/i;->n(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_9

    invoke-static {p15}, Lg5/i;->j(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_9

    .line 14
    invoke-static {p15}, Lg5/i;->h(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lj$/util/DesugarTimeZone;->getTimeZone(Ljava/lang/String;)Ljava/util/TimeZone;

    move-result-object p1

    .line 15
    iget-object p2, p0, Lcom/facebook/hermes/intl/n;->a:Ljava/text/DateFormat;

    invoke-virtual {p2, p1}, Ljava/text/DateFormat;->setTimeZone(Ljava/util/TimeZone;)V

    :cond_9
    return-void
.end method
