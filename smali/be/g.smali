.class public Lbe/g;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lde/g;I)V
    .locals 3

    .line 1
    iget-object p1, p1, Lde/g;->d:Lcom/henninghall/date_picker/pickers/a;

    .line 2
    .line 3
    invoke-interface {p1}, Lcom/henninghall/date_picker/pickers/a;->getValue()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    invoke-interface {p1}, Lcom/henninghall/date_picker/pickers/a;->getMaxValue()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    invoke-interface {p1}, Lcom/henninghall/date_picker/pickers/a;->getWrapSelectorWheel()Z

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    add-int/2addr v0, p2

    .line 16
    if-le v0, v1, :cond_0

    .line 17
    .line 18
    if-eqz v2, :cond_1

    .line 19
    .line 20
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 21
    .line 22
    rem-int/2addr v0, v1

    .line 23
    invoke-interface {p1, v0}, Lcom/henninghall/date_picker/pickers/a;->c(I)V

    .line 24
    .line 25
    .line 26
    :cond_1
    return-void
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
