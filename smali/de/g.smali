.class public abstract Lde/g;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field protected final a:Lcom/henninghall/date_picker/k;

.field private b:Ljava/util/Calendar;

.field private c:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public d:Lcom/henninghall/date_picker/pickers/a;

.field public e:Ljava/text/SimpleDateFormat;


# direct methods
.method public constructor <init>(Lcom/henninghall/date_picker/pickers/a;Lcom/henninghall/date_picker/k;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lde/g;->c:Ljava/util/ArrayList;

    .line 10
    .line 11
    iput-object p2, p0, Lde/g;->a:Lcom/henninghall/date_picker/k;

    .line 12
    .line 13
    iput-object p1, p0, Lde/g;->d:Lcom/henninghall/date_picker/pickers/a;

    .line 14
    .line 15
    new-instance v0, Ljava/text/SimpleDateFormat;

    .line 16
    .line 17
    invoke-virtual {p0}, Lde/g;->e()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    invoke-virtual {p2}, Lcom/henninghall/date_picker/k;->u()Ljava/util/Locale;

    .line 22
    .line 23
    .line 24
    move-result-object p2

    .line 25
    invoke-direct {v0, v1, p2}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 26
    .line 27
    .line 28
    iput-object v0, p0, Lde/g;->e:Ljava/text/SimpleDateFormat;

    .line 29
    .line 30
    invoke-virtual {p0}, Lde/g;->l()Landroid/graphics/Paint$Align;

    .line 31
    .line 32
    .line 33
    move-result-object p2

    .line 34
    invoke-interface {p1, p2}, Lcom/henninghall/date_picker/pickers/a;->setTextAlign(Landroid/graphics/Paint$Align;)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {p0}, Lde/g;->w()Z

    .line 38
    .line 39
    .line 40
    move-result p2

    .line 41
    invoke-interface {p1, p2}, Lcom/henninghall/date_picker/pickers/a;->setWrapSelectorWheel(Z)V

    .line 42
    .line 43
    .line 44
    return-void
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
.end method

.method private c(Ljava/util/ArrayList;)[Ljava/lang/String;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;)[",
            "Ljava/lang/String;"
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    check-cast v1, Ljava/lang/String;

    .line 21
    .line 22
    invoke-virtual {p0, v1}, Lde/g;->t(Ljava/lang/String;)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    const/4 p1, 0x0

    .line 31
    new-array p1, p1, [Ljava/lang/String;

    .line 32
    .line 33
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    check-cast p1, [Ljava/lang/String;

    .line 38
    .line 39
    return-object p1
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
.end method

.method private d(Ljava/util/Locale;)Ljava/text/SimpleDateFormat;
    .locals 2

    new-instance v0, Ljava/text/SimpleDateFormat;

    invoke-virtual {p0}, Lde/g;->e()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1, p1}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    return-object v0
.end method

.method private g()I
    .locals 1

    iget-object v0, p0, Lde/g;->d:Lcom/henninghall/date_picker/pickers/a;

    invoke-interface {v0}, Lcom/henninghall/date_picker/pickers/a;->getValue()I

    move-result v0

    return v0
.end method

.method private h(Ljava/util/Calendar;)I
    .locals 2

    .line 1
    iget-object v0, p0, Lde/g;->e:Ljava/text/SimpleDateFormat;

    .line 2
    .line 3
    iget-object v1, p0, Lde/g;->a:Lcom/henninghall/date_picker/k;

    .line 4
    .line 5
    invoke-virtual {v1}, Lcom/henninghall/date_picker/k;->C()Ljava/util/TimeZone;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {v0, v1}, Ljava/text/DateFormat;->setTimeZone(Ljava/util/TimeZone;)V

    .line 10
    .line 11
    .line 12
    iget-object v0, p0, Lde/g;->c:Ljava/util/ArrayList;

    .line 13
    .line 14
    iget-object v1, p0, Lde/g;->e:Ljava/text/SimpleDateFormat;

    .line 15
    .line 16
    invoke-virtual {p1}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    invoke-virtual {v1, p1}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->indexOf(Ljava/lang/Object;)I

    .line 25
    .line 26
    .line 27
    move-result p1

    .line 28
    return p1
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
.end method

.method private k(Ljava/util/Calendar;Ljava/util/Locale;)Ljava/lang/String;
    .locals 0

    invoke-direct {p0, p2}, Lde/g;->d(Ljava/util/Locale;)Ljava/text/SimpleDateFormat;

    move-result-object p2

    invoke-virtual {p1}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    move-result-object p1

    invoke-virtual {p2, p1}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method private p()V
    .locals 2

    .line 1
    iget-object v0, p0, Lde/g;->d:Lcom/henninghall/date_picker/pickers/a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-interface {v0, v1}, Lcom/henninghall/date_picker/pickers/a;->setMinValue(I)V

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, Lde/g;->d:Lcom/henninghall/date_picker/pickers/a;

    .line 8
    .line 9
    invoke-interface {v0, v1}, Lcom/henninghall/date_picker/pickers/a;->setMaxValue(I)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0}, Lde/g;->o()Ljava/util/ArrayList;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    iput-object v0, p0, Lde/g;->c:Ljava/util/ArrayList;

    .line 17
    .line 18
    iget-object v1, p0, Lde/g;->d:Lcom/henninghall/date_picker/pickers/a;

    .line 19
    .line 20
    invoke-direct {p0, v0}, Lde/g;->c(Ljava/util/ArrayList;)[Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-interface {v1, v0}, Lcom/henninghall/date_picker/pickers/a;->setDisplayedValues([Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    iget-object v0, p0, Lde/g;->d:Lcom/henninghall/date_picker/pickers/a;

    .line 28
    .line 29
    iget-object v1, p0, Lde/g;->c:Ljava/util/ArrayList;

    .line 30
    .line 31
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    add-int/lit8 v1, v1, -0x1

    .line 36
    .line 37
    invoke-interface {v0, v1}, Lcom/henninghall/date_picker/pickers/a;->setMaxValue(I)V

    .line 38
    .line 39
    .line 40
    return-void
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
.end method


# virtual methods
.method public a(Ljava/util/Calendar;)V
    .locals 1

    iget-object v0, p0, Lde/g;->d:Lcom/henninghall/date_picker/pickers/a;

    invoke-direct {p0, p1}, Lde/g;->h(Ljava/util/Calendar;)I

    move-result p1

    invoke-interface {v0, p1}, Lcom/henninghall/date_picker/pickers/a;->c(I)V

    return-void
.end method

.method public b()Ljava/lang/String;
    .locals 1

    invoke-direct {p0}, Lde/g;->g()I

    move-result v0

    invoke-virtual {p0, v0}, Lde/g;->n(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lde/g;->t(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public abstract e()Ljava/lang/String;
.end method

.method public f()I
    .locals 2

    .line 1
    iget-object v0, p0, Lde/g;->a:Lcom/henninghall/date_picker/k;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/henninghall/date_picker/k;->z()Lzd/b;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p0, Lde/g;->a:Lcom/henninghall/date_picker/k;

    .line 8
    .line 9
    iget-object v1, v1, Lcom/henninghall/date_picker/k;->p:Lcom/henninghall/date_picker/c;

    .line 10
    .line 11
    invoke-virtual {v1}, Lcom/henninghall/date_picker/c;->h()Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    const/16 v0, 0xa

    .line 18
    .line 19
    return v0

    .line 20
    :cond_0
    sget-object v1, Lde/g$a;->a:[I

    .line 21
    .line 22
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    aget v0, v1, v0

    .line 27
    .line 28
    const/4 v1, 0x1

    .line 29
    if-eq v0, v1, :cond_1

    .line 30
    .line 31
    const/4 v0, 0x5

    .line 32
    return v0

    .line 33
    :cond_1
    const/16 v0, 0xf

    .line 34
    .line 35
    return v0
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
.end method

.method i(Ljava/util/Calendar;)Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lde/g;->a:Lcom/henninghall/date_picker/k;

    invoke-virtual {v0}, Lcom/henninghall/date_picker/k;->u()Ljava/util/Locale;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Lde/g;->k(Ljava/util/Calendar;Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public j(I)Ljava/lang/String;
    .locals 2

    .line 1
    invoke-virtual {p0}, Lde/g;->v()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    iget-object p1, p0, Lde/g;->e:Ljava/text/SimpleDateFormat;

    .line 8
    .line 9
    iget-object v0, p0, Lde/g;->b:Ljava/util/Calendar;

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-virtual {p1, v0}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    return-object p1

    .line 20
    :cond_0
    iget-object v0, p0, Lde/g;->c:Ljava/util/ArrayList;

    .line 21
    .line 22
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    invoke-direct {p0}, Lde/g;->g()I

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    add-int/2addr v1, v0

    .line 31
    sub-int/2addr v1, p1

    .line 32
    rem-int/2addr v1, v0

    .line 33
    invoke-virtual {p0, v1}, Lde/g;->n(I)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    return-object p1
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
.end method

.method public abstract l()Landroid/graphics/Paint$Align;
.end method

.method public m()Ljava/lang/String;
    .locals 2

    .line 1
    invoke-virtual {p0}, Lde/g;->v()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, Lde/g;->e:Ljava/text/SimpleDateFormat;

    .line 8
    .line 9
    iget-object v1, p0, Lde/g;->b:Ljava/util/Calendar;

    .line 10
    .line 11
    invoke-virtual {v1}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-virtual {v0, v1}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    return-object v0

    .line 20
    :cond_0
    invoke-direct {p0}, Lde/g;->g()I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    invoke-virtual {p0, v0}, Lde/g;->n(I)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    return-object v0
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
.end method

.method public n(I)Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lde/g;->c:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    return-object p1
.end method

.method public abstract o()Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end method

.method public q()V
    .locals 3

    .line 1
    new-instance v0, Ljava/text/SimpleDateFormat;

    .line 2
    .line 3
    invoke-virtual {p0}, Lde/g;->e()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    iget-object v2, p0, Lde/g;->a:Lcom/henninghall/date_picker/k;

    .line 8
    .line 9
    invoke-virtual {v2}, Lcom/henninghall/date_picker/k;->u()Ljava/util/Locale;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    invoke-direct {v0, v1, v2}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lde/g;->e:Ljava/text/SimpleDateFormat;

    .line 17
    .line 18
    invoke-virtual {p0}, Lde/g;->v()Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-nez v0, :cond_0

    .line 23
    .line 24
    return-void

    .line 25
    :cond_0
    invoke-direct {p0}, Lde/g;->p()V

    .line 26
    .line 27
    .line 28
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
.end method

.method public r()V
    .locals 2

    iget-object v0, p0, Lde/g;->d:Lcom/henninghall/date_picker/pickers/a;

    invoke-virtual {p0}, Lde/g;->f()I

    move-result v1

    invoke-interface {v0, v1}, Lcom/henninghall/date_picker/pickers/a;->setItemPaddingHorizontal(I)V

    return-void
.end method

.method public s(Ljava/util/Calendar;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lde/g;->e:Ljava/text/SimpleDateFormat;

    .line 2
    .line 3
    iget-object v1, p0, Lde/g;->a:Lcom/henninghall/date_picker/k;

    .line 4
    .line 5
    invoke-virtual {v1}, Lcom/henninghall/date_picker/k;->C()Ljava/util/TimeZone;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {v0, v1}, Ljava/text/DateFormat;->setTimeZone(Ljava/util/TimeZone;)V

    .line 10
    .line 11
    .line 12
    iput-object p1, p0, Lde/g;->b:Ljava/util/Calendar;

    .line 13
    .line 14
    invoke-direct {p0, p1}, Lde/g;->h(Ljava/util/Calendar;)I

    .line 15
    .line 16
    .line 17
    move-result p1

    .line 18
    const/4 v0, -0x1

    .line 19
    if-le p1, v0, :cond_1

    .line 20
    .line 21
    iget-object v0, p0, Lde/g;->d:Lcom/henninghall/date_picker/pickers/a;

    .line 22
    .line 23
    invoke-interface {v0}, Lcom/henninghall/date_picker/pickers/a;->getValue()I

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-nez v0, :cond_0

    .line 28
    .line 29
    iget-object v0, p0, Lde/g;->d:Lcom/henninghall/date_picker/pickers/a;

    .line 30
    .line 31
    invoke-interface {v0, p1}, Lcom/henninghall/date_picker/pickers/a;->setValue(I)V

    .line 32
    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_0
    iget-object v0, p0, Lde/g;->d:Lcom/henninghall/date_picker/pickers/a;

    .line 36
    .line 37
    invoke-interface {v0, p1}, Lcom/henninghall/date_picker/pickers/a;->c(I)V

    .line 38
    .line 39
    .line 40
    :cond_1
    :goto_0
    return-void
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
.end method

.method public t(Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    return-object p1
.end method

.method public u()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lde/g;->v()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    const/16 v0, 0x8

    .line 10
    .line 11
    :goto_0
    iget-object v1, p0, Lde/g;->d:Lcom/henninghall/date_picker/pickers/a;

    .line 12
    .line 13
    invoke-interface {v1, v0}, Lcom/henninghall/date_picker/pickers/a;->setVisibility(I)V

    .line 14
    .line 15
    .line 16
    return-void
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method

.method public abstract v()Z
.end method

.method public abstract w()Z
.end method
