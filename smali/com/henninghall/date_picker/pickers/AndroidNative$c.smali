.class Lcom/henninghall/date_picker/pickers/AndroidNative$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/NumberPicker$OnValueChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/henninghall/date_picker/pickers/AndroidNative;->setOnValueChangedListener(Lcom/henninghall/date_picker/pickers/a$a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/henninghall/date_picker/pickers/a;

.field final synthetic b:Lcom/henninghall/date_picker/pickers/AndroidNative;


# direct methods
.method constructor <init>(Lcom/henninghall/date_picker/pickers/AndroidNative;Lcom/henninghall/date_picker/pickers/a;)V
    .locals 0

    iput-object p1, p0, Lcom/henninghall/date_picker/pickers/AndroidNative$c;->b:Lcom/henninghall/date_picker/pickers/AndroidNative;

    iput-object p2, p0, Lcom/henninghall/date_picker/pickers/AndroidNative$c;->a:Lcom/henninghall/date_picker/pickers/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onValueChange(Landroid/widget/NumberPicker;II)V
    .locals 1

    .line 1
    iget-object p1, p0, Lcom/henninghall/date_picker/pickers/AndroidNative$c;->b:Lcom/henninghall/date_picker/pickers/AndroidNative;

    .line 2
    .line 3
    invoke-static {p1}, Lcom/henninghall/date_picker/pickers/AndroidNative;->g(Lcom/henninghall/date_picker/pickers/AndroidNative;)Lcom/henninghall/date_picker/pickers/a$b;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    iget-object p1, p0, Lcom/henninghall/date_picker/pickers/AndroidNative$c;->b:Lcom/henninghall/date_picker/pickers/AndroidNative;

    .line 10
    .line 11
    invoke-static {p1}, Lcom/henninghall/date_picker/pickers/AndroidNative;->g(Lcom/henninghall/date_picker/pickers/AndroidNative;)Lcom/henninghall/date_picker/pickers/a$b;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    iget-object v0, p0, Lcom/henninghall/date_picker/pickers/AndroidNative$c;->a:Lcom/henninghall/date_picker/pickers/a;

    .line 16
    .line 17
    invoke-interface {p1, v0, p2, p3}, Lcom/henninghall/date_picker/pickers/a$b;->a(Lcom/henninghall/date_picker/pickers/a;II)V

    .line 18
    .line 19
    .line 20
    :cond_0
    iget-object p1, p0, Lcom/henninghall/date_picker/pickers/AndroidNative$c;->b:Lcom/henninghall/date_picker/pickers/AndroidNative;

    .line 21
    .line 22
    invoke-static {p1}, Lcom/henninghall/date_picker/pickers/AndroidNative;->h(Lcom/henninghall/date_picker/pickers/AndroidNative;)I

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    if-nez p1, :cond_1

    .line 27
    .line 28
    iget-object p1, p0, Lcom/henninghall/date_picker/pickers/AndroidNative$c;->b:Lcom/henninghall/date_picker/pickers/AndroidNative;

    .line 29
    .line 30
    invoke-static {p1}, Lcom/henninghall/date_picker/pickers/AndroidNative;->f(Lcom/henninghall/date_picker/pickers/AndroidNative;)V

    .line 31
    .line 32
    .line 33
    :cond_1
    return-void
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
.end method
