.class public Lde/c;
.super Lde/g;
.source "SourceFile"


# static fields
.field private static h:I


# instance fields
.field private f:Ljava/lang/String;

.field private g:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v0

    const/4 v1, 0x6

    invoke-virtual {v0, v1}, Ljava/util/Calendar;->getActualMaximum(I)I

    move-result v0

    sput v0, Lde/c;->h:I

    return-void
.end method

.method public constructor <init>(Lcom/henninghall/date_picker/pickers/a;Lcom/henninghall/date_picker/k;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lde/g;-><init>(Lcom/henninghall/date_picker/pickers/a;Lcom/henninghall/date_picker/k;)V

    return-void
.end method

.method private A()Ljava/util/Calendar;
    .locals 3

    .line 1
    iget-object v0, p0, Lde/g;->a:Lcom/henninghall/date_picker/k;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/henninghall/date_picker/k;->w()Ljava/util/Calendar;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p0, Lde/g;->a:Lcom/henninghall/date_picker/k;

    .line 8
    .line 9
    invoke-virtual {v1}, Lcom/henninghall/date_picker/k;->x()Ljava/util/Calendar;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/util/Calendar;->clone()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    check-cast v0, Ljava/util/Calendar;

    .line 20
    .line 21
    invoke-direct {p0, v0}, Lde/c;->E(Ljava/util/Calendar;)V

    .line 22
    .line 23
    .line 24
    goto :goto_1

    .line 25
    :cond_0
    const/4 v0, 0x5

    .line 26
    if-eqz v1, :cond_1

    .line 27
    .line 28
    invoke-virtual {v1}, Ljava/util/Calendar;->clone()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    check-cast v1, Ljava/util/Calendar;

    .line 33
    .line 34
    invoke-direct {p0, v1}, Lde/c;->E(Ljava/util/Calendar;)V

    .line 35
    .line 36
    .line 37
    const/4 v2, 0x6

    .line 38
    invoke-virtual {v1, v2}, Ljava/util/Calendar;->getActualMaximum(I)I

    .line 39
    .line 40
    .line 41
    move-result v2

    .line 42
    div-int/lit8 v2, v2, 0x2

    .line 43
    .line 44
    invoke-virtual {v1, v0, v2}, Ljava/util/Calendar;->add(II)V

    .line 45
    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_1
    invoke-direct {p0}, Lde/c;->B()Ljava/util/Calendar;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    invoke-virtual {v1}, Ljava/util/Calendar;->clone()Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    check-cast v1, Ljava/util/Calendar;

    .line 57
    .line 58
    new-instance v2, Ljava/util/Date;

    .line 59
    .line 60
    invoke-direct {v2}, Ljava/util/Date;-><init>()V

    .line 61
    .line 62
    .line 63
    invoke-virtual {v1, v2}, Ljava/util/Calendar;->setTime(Ljava/util/Date;)V

    .line 64
    .line 65
    .line 66
    sget v2, Lde/c;->h:I

    .line 67
    .line 68
    div-int/lit8 v2, v2, 0x2

    .line 69
    .line 70
    invoke-virtual {v1, v0, v2}, Ljava/util/Calendar;->add(II)V

    .line 71
    .line 72
    .line 73
    :goto_0
    move-object v0, v1

    .line 74
    :goto_1
    return-object v0
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

.method private B()Ljava/util/Calendar;
    .locals 6

    .line 1
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Lde/g;->a:Lcom/henninghall/date_picker/k;

    .line 6
    .line 7
    invoke-virtual {v1}, Lcom/henninghall/date_picker/k;->y()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    const/4 v2, 0x1

    .line 12
    if-gt v1, v2, :cond_0

    .line 13
    .line 14
    return-object v0

    .line 15
    :cond_0
    new-instance v3, Ljava/text/SimpleDateFormat;

    .line 16
    .line 17
    iget-object v4, p0, Lde/g;->a:Lcom/henninghall/date_picker/k;

    .line 18
    .line 19
    invoke-virtual {v4}, Lcom/henninghall/date_picker/k;->u()Ljava/util/Locale;

    .line 20
    .line 21
    .line 22
    move-result-object v4

    .line 23
    const-string v5, "mm"

    .line 24
    .line 25
    invoke-direct {v3, v5, v4}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    .line 29
    .line 30
    .line 31
    move-result-object v4

    .line 32
    invoke-virtual {v3, v4}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v3

    .line 36
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    .line 37
    .line 38
    .line 39
    move-result-object v3

    .line 40
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 41
    .line 42
    .line 43
    move-result v3

    .line 44
    rem-int/2addr v3, v1

    .line 45
    sub-int v4, v1, v3

    .line 46
    .line 47
    neg-int v5, v3

    .line 48
    div-int/lit8 v1, v1, 0x2

    .line 49
    .line 50
    if-le v1, v3, :cond_1

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_1
    const/4 v2, 0x0

    .line 54
    :goto_0
    if-eqz v2, :cond_2

    .line 55
    .line 56
    move v4, v5

    .line 57
    :cond_2
    const/16 v1, 0xc

    .line 58
    .line 59
    invoke-virtual {v0, v1, v4}, Ljava/util/Calendar;->add(II)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {v0}, Ljava/util/Calendar;->clone()Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    check-cast v0, Ljava/util/Calendar;

    .line 67
    .line 68
    return-object v0
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

.method private C()Ljava/util/Calendar;
    .locals 3

    .line 1
    iget-object v0, p0, Lde/g;->a:Lcom/henninghall/date_picker/k;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/henninghall/date_picker/k;->w()Ljava/util/Calendar;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p0, Lde/g;->a:Lcom/henninghall/date_picker/k;

    .line 8
    .line 9
    invoke-virtual {v1}, Lcom/henninghall/date_picker/k;->x()Ljava/util/Calendar;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    invoke-virtual {v1}, Ljava/util/Calendar;->clone()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    check-cast v0, Ljava/util/Calendar;

    .line 20
    .line 21
    invoke-direct {p0, v0}, Lde/c;->E(Ljava/util/Calendar;)V

    .line 22
    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    const/4 v1, 0x5

    .line 26
    if-eqz v0, :cond_1

    .line 27
    .line 28
    invoke-virtual {v0}, Ljava/util/Calendar;->clone()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    check-cast v0, Ljava/util/Calendar;

    .line 33
    .line 34
    invoke-direct {p0, v0}, Lde/c;->E(Ljava/util/Calendar;)V

    .line 35
    .line 36
    .line 37
    const/4 v2, 0x6

    .line 38
    invoke-virtual {v0, v2}, Ljava/util/Calendar;->getActualMaximum(I)I

    .line 39
    .line 40
    .line 41
    move-result v2

    .line 42
    neg-int v2, v2

    .line 43
    div-int/lit8 v2, v2, 0x2

    .line 44
    .line 45
    invoke-virtual {v0, v1, v2}, Ljava/util/Calendar;->add(II)V

    .line 46
    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_1
    invoke-direct {p0}, Lde/c;->B()Ljava/util/Calendar;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    invoke-virtual {v0}, Ljava/util/Calendar;->clone()Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    check-cast v0, Ljava/util/Calendar;

    .line 58
    .line 59
    sget v2, Lde/c;->h:I

    .line 60
    .line 61
    neg-int v2, v2

    .line 62
    div-int/lit8 v2, v2, 0x2

    .line 63
    .line 64
    invoke-virtual {v0, v1, v2}, Ljava/util/Calendar;->add(II)V

    .line 65
    .line 66
    .line 67
    :goto_0
    return-object v0
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

.method private D(Ljava/util/Calendar;)Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lde/g;->e:Ljava/text/SimpleDateFormat;

    invoke-virtual {p1}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method private E(Ljava/util/Calendar;)V
    .locals 2

    .line 1
    const/16 v0, 0xb

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-virtual {p1, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 5
    .line 6
    .line 7
    const/16 v0, 0xc

    .line 8
    .line 9
    invoke-virtual {p1, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 10
    .line 11
    .line 12
    const/16 v0, 0xd

    .line 13
    .line 14
    invoke-virtual {p1, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 15
    .line 16
    .line 17
    const/16 v0, 0xe

    .line 18
    .line 19
    invoke-virtual {p1, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 20
    .line 21
    .line 22
    return-void
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
.end method

.method private F(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 1
    iget-object v0, p0, Lde/g;->a:Lcom/henninghall/date_picker/k;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/henninghall/date_picker/k;->u()Ljava/util/Locale;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {v0}, Lcom/henninghall/date_picker/l;->k(Ljava/util/Locale;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    const/4 v1, 0x0

    .line 12
    invoke-virtual {p1, v1}, Ljava/lang/String;->charAt(I)C

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    invoke-static {p1}, Ljava/lang/Character;->isUpperCase(C)Z

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    if-eqz p1, :cond_0

    .line 21
    .line 22
    invoke-static {v0}, Lcom/henninghall/date_picker/l;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    :cond_0
    return-object v0
    .line 27
.end method

.method private x(Ljava/util/Calendar;)Ljava/lang/String;
    .locals 1

    invoke-direct {p0}, Lde/c;->y()Ljava/text/SimpleDateFormat;

    move-result-object v0

    invoke-virtual {p1}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method private y()Ljava/text/SimpleDateFormat;
    .locals 3

    new-instance v0, Ljava/text/SimpleDateFormat;

    invoke-direct {p0}, Lde/c;->z()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lde/g;->a:Lcom/henninghall/date_picker/k;

    invoke-virtual {v2}, Lcom/henninghall/date_picker/k;->u()Ljava/util/Locale;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    return-object v0
.end method

.method private z()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lde/g;->a:Lcom/henninghall/date_picker/k;

    invoke-virtual {v0}, Lcom/henninghall/date_picker/k;->v()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/henninghall/date_picker/g;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public e()Ljava/lang/String;
    .locals 3

    .line 1
    iget-object v0, p0, Lde/g;->a:Lcom/henninghall/date_picker/k;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/henninghall/date_picker/k;->u()Ljava/util/Locale;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {v0}, Lcom/henninghall/date_picker/g;->b(Ljava/util/Locale;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    const-string v1, "EEEE"

    .line 12
    .line 13
    const-string v2, "EEE"

    .line 14
    .line 15
    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    const-string v1, "MMMM"

    .line 20
    .line 21
    const-string v2, "MMM"

    .line 22
    .line 23
    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    return-object v0
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

.method public l()Landroid/graphics/Paint$Align;
    .locals 1

    sget-object v0, Landroid/graphics/Paint$Align;->RIGHT:Landroid/graphics/Paint$Align;

    return-object v0
.end method

.method public o()Ljava/util/ArrayList;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;"
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
    new-instance v1, Ljava/util/HashMap;

    .line 7
    .line 8
    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 9
    .line 10
    .line 11
    iput-object v1, p0, Lde/c;->g:Ljava/util/HashMap;

    .line 12
    .line 13
    invoke-direct {p0}, Lde/c;->C()Ljava/util/Calendar;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-direct {p0}, Lde/c;->A()Ljava/util/Calendar;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    :goto_0
    invoke-virtual {v1, v2}, Ljava/util/Calendar;->after(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result v3

    .line 25
    if-nez v3, :cond_1

    .line 26
    .line 27
    invoke-direct {p0, v1}, Lde/c;->D(Ljava/util/Calendar;)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    iget-object v4, p0, Lde/c;->g:Ljava/util/HashMap;

    .line 35
    .line 36
    invoke-direct {p0, v1}, Lde/c;->x(Ljava/util/Calendar;)Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v5

    .line 40
    invoke-virtual {v4, v3, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    invoke-static {v1}, Lcom/henninghall/date_picker/l;->h(Ljava/util/Calendar;)Z

    .line 44
    .line 45
    .line 46
    move-result v4

    .line 47
    if-eqz v4, :cond_0

    .line 48
    .line 49
    iput-object v3, p0, Lde/c;->f:Ljava/lang/String;

    .line 50
    .line 51
    :cond_0
    const/4 v3, 0x5

    .line 52
    const/4 v4, 0x1

    .line 53
    invoke-virtual {v1, v3, v4}, Ljava/util/Calendar;->add(II)V

    .line 54
    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_1
    return-object v0
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

.method public t(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lde/c;->f:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-direct {p0, p1}, Lde/c;->F(Ljava/lang/String;)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    return-object p1

    .line 14
    :cond_0
    iget-object v0, p0, Lde/c;->g:Ljava/util/HashMap;

    .line 15
    .line 16
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    check-cast p1, Ljava/lang/String;

    .line 21
    .line 22
    return-object p1
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
.end method

.method public v()Z
    .locals 2

    iget-object v0, p0, Lde/g;->a:Lcom/henninghall/date_picker/k;

    invoke-virtual {v0}, Lcom/henninghall/date_picker/k;->z()Lzd/b;

    move-result-object v0

    sget-object v1, Lzd/b;->m:Lzd/b;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public w()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method
