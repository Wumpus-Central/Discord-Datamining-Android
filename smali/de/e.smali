.class public Lde/e;
.super Lde/g;
.source "SourceFile"


# direct methods
.method public constructor <init>(Lcom/henninghall/date_picker/pickers/a;Lcom/henninghall/date_picker/k;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lde/g;-><init>(Lcom/henninghall/date_picker/pickers/a;Lcom/henninghall/date_picker/k;)V

    return-void
.end method


# virtual methods
.method public e()Ljava/lang/String;
    .locals 1

    const-string v0, "mm"

    return-object v0
.end method

.method public l()Landroid/graphics/Paint$Align;
    .locals 1

    iget-object v0, p0, Lde/g;->a:Lcom/henninghall/date_picker/k;

    iget-object v0, v0, Lcom/henninghall/date_picker/k;->p:Lcom/henninghall/date_picker/c;

    invoke-virtual {v0}, Lcom/henninghall/date_picker/c;->h()Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Landroid/graphics/Paint$Align;->LEFT:Landroid/graphics/Paint$Align;

    goto :goto_0

    :cond_0
    sget-object v0, Landroid/graphics/Paint$Align;->RIGHT:Landroid/graphics/Paint$Align;

    :goto_0
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
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Ljava/util/ArrayList;

    .line 6
    .line 7
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 8
    .line 9
    .line 10
    const/16 v2, 0xc

    .line 11
    .line 12
    const/4 v3, 0x0

    .line 13
    invoke-virtual {v0, v2, v3}, Ljava/util/Calendar;->set(II)V

    .line 14
    .line 15
    .line 16
    :goto_0
    const/16 v4, 0x3c

    .line 17
    .line 18
    if-ge v3, v4, :cond_0

    .line 19
    .line 20
    iget-object v4, p0, Lde/g;->e:Ljava/text/SimpleDateFormat;

    .line 21
    .line 22
    invoke-virtual {v0}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    .line 23
    .line 24
    .line 25
    move-result-object v5

    .line 26
    invoke-virtual {v4, v5}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v4

    .line 30
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    iget-object v4, p0, Lde/g;->a:Lcom/henninghall/date_picker/k;

    .line 34
    .line 35
    invoke-virtual {v4}, Lcom/henninghall/date_picker/k;->y()I

    .line 36
    .line 37
    .line 38
    move-result v4

    .line 39
    invoke-virtual {v0, v2, v4}, Ljava/util/Calendar;->add(II)V

    .line 40
    .line 41
    .line 42
    iget-object v4, p0, Lde/g;->a:Lcom/henninghall/date_picker/k;

    .line 43
    .line 44
    invoke-virtual {v4}, Lcom/henninghall/date_picker/k;->y()I

    .line 45
    .line 46
    .line 47
    move-result v4

    .line 48
    add-int/2addr v3, v4

    .line 49
    goto :goto_0

    .line 50
    :cond_0
    return-object v1
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

.method public v()Z
    .locals 2

    iget-object v0, p0, Lde/g;->a:Lcom/henninghall/date_picker/k;

    invoke-virtual {v0}, Lcom/henninghall/date_picker/k;->z()Lzd/b;

    move-result-object v0

    sget-object v1, Lzd/b;->k:Lzd/b;

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public w()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method
