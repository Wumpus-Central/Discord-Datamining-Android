.class public Lde/d;
.super Lde/g;
.source "SourceFile"


# instance fields
.field private final f:Lcom/henninghall/date_picker/f;


# direct methods
.method public constructor <init>(Lcom/henninghall/date_picker/pickers/a;Lcom/henninghall/date_picker/k;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lde/g;-><init>(Lcom/henninghall/date_picker/pickers/a;Lcom/henninghall/date_picker/k;)V

    .line 2
    .line 3
    .line 4
    new-instance p1, Lcom/henninghall/date_picker/f;

    .line 5
    .line 6
    iget-object p2, p0, Lde/g;->a:Lcom/henninghall/date_picker/k;

    .line 7
    .line 8
    invoke-direct {p1, p2}, Lcom/henninghall/date_picker/f;-><init>(Lcom/henninghall/date_picker/k;)V

    .line 9
    .line 10
    .line 11
    iput-object p1, p0, Lde/d;->f:Lcom/henninghall/date_picker/f;

    .line 12
    .line 13
    return-void
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
.end method


# virtual methods
.method public e()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lde/g;->a:Lcom/henninghall/date_picker/k;

    iget-object v0, v0, Lcom/henninghall/date_picker/k;->p:Lcom/henninghall/date_picker/c;

    invoke-virtual {v0}, Lcom/henninghall/date_picker/c;->i()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "h"

    goto :goto_0

    :cond_0
    const-string v0, "HH"

    :goto_0
    return-object v0
.end method

.method public l()Landroid/graphics/Paint$Align;
    .locals 1

    sget-object v0, Landroid/graphics/Paint$Align;->RIGHT:Landroid/graphics/Paint$Align;

    return-object v0
.end method

.method public o()Ljava/util/ArrayList;
    .locals 8
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
    move-result-object v7

    .line 5
    const/16 v1, 0x7d0

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    const/4 v3, 0x0

    .line 9
    const/4 v4, 0x0

    .line 10
    const/4 v5, 0x0

    .line 11
    const/4 v6, 0x0

    .line 12
    move-object v0, v7

    .line 13
    invoke-virtual/range {v0 .. v6}, Ljava/util/Calendar;->set(IIIIII)V

    .line 14
    .line 15
    .line 16
    new-instance v0, Ljava/util/ArrayList;

    .line 17
    .line 18
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 19
    .line 20
    .line 21
    iget-object v1, p0, Lde/g;->a:Lcom/henninghall/date_picker/k;

    .line 22
    .line 23
    iget-object v1, v1, Lcom/henninghall/date_picker/k;->p:Lcom/henninghall/date_picker/c;

    .line 24
    .line 25
    invoke-virtual {v1}, Lcom/henninghall/date_picker/c;->i()Z

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    if-eqz v1, :cond_0

    .line 30
    .line 31
    const/16 v1, 0xc

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    const/16 v1, 0x18

    .line 35
    .line 36
    :goto_0
    const/4 v2, 0x0

    .line 37
    :goto_1
    if-ge v2, v1, :cond_1

    .line 38
    .line 39
    iget-object v3, p0, Lde/g;->e:Ljava/text/SimpleDateFormat;

    .line 40
    .line 41
    invoke-virtual {v7}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    .line 42
    .line 43
    .line 44
    move-result-object v4

    .line 45
    invoke-virtual {v3, v4}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v3

    .line 49
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    const/16 v3, 0xb

    .line 53
    .line 54
    const/4 v4, 0x1

    .line 55
    invoke-virtual {v7, v3, v4}, Ljava/util/Calendar;->add(II)V

    .line 56
    .line 57
    .line 58
    add-int/lit8 v2, v2, 0x1

    .line 59
    .line 60
    goto :goto_1

    .line 61
    :cond_1
    return-object v0
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

    iget-object v0, p0, Lde/d;->f:Lcom/henninghall/date_picker/f;

    invoke-virtual {v0, p1}, Lcom/henninghall/date_picker/f;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
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
