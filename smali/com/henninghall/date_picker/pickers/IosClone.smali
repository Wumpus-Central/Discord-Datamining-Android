.class public Lcom/henninghall/date_picker/pickers/IosClone;
.super Lb2/a;
.source "SourceFile"

# interfaces
.implements Lcom/henninghall/date_picker/pickers/a;


# instance fields
.field private P0:Lcom/henninghall/date_picker/pickers/a$b;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lb2/a;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Lcom/henninghall/date_picker/pickers/IosClone;->q0()V

    .line 5
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
.end method

.method static synthetic p0(Lcom/henninghall/date_picker/pickers/IosClone;)Lcom/henninghall/date_picker/pickers/a$b;
    .locals 0

    iget-object p0, p0, Lcom/henninghall/date_picker/pickers/IosClone;->P0:Lcom/henninghall/date_picker/pickers/a$b;

    return-object p0
.end method

.method private q0()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/henninghall/date_picker/pickers/IosClone;->r0()V

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Lcom/henninghall/date_picker/pickers/IosClone;->s0()V

    .line 5
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
.end method

.method private r0()V
    .locals 0

    invoke-static {p0}, Lbe/a;->k(Lcom/henninghall/date_picker/pickers/a;)V

    return-void
.end method

.method private s0()V
    .locals 1

    new-instance v0, Lcom/henninghall/date_picker/pickers/IosClone$a;

    invoke-direct {v0, p0, p0}, Lcom/henninghall/date_picker/pickers/IosClone$a;-><init>(Lcom/henninghall/date_picker/pickers/IosClone;Lcom/henninghall/date_picker/pickers/a;)V

    invoke-super {p0, v0}, Lb2/a;->setOnValueChangeListenerInScrolling(Lb2/a$e;)V

    return-void
.end method


# virtual methods
.method public a()Z
    .locals 1

    invoke-super {p0}, Lb2/a;->O()Z

    move-result v0

    return v0
.end method

.method public getView()Landroid/view/View;
    .locals 0

    return-object p0
.end method

.method public onInitializeAccessibilityNodeInfo(Landroid/view/accessibility/AccessibilityNodeInfo;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroid/view/View;->onInitializeAccessibilityNodeInfo(Landroid/view/accessibility/AccessibilityNodeInfo;)V

    .line 2
    .line 3
    .line 4
    invoke-static {p0, p1}, Lbe/a;->i(Lcom/henninghall/date_picker/pickers/a;Landroid/view/accessibility/AccessibilityNodeInfo;)V

    .line 5
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
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 1

    .line 1
    invoke-static {p0}, Lbe/a;->j(Landroid/view/View;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-super {p0, p1}, Lb2/a;->onTouchEvent(Landroid/view/MotionEvent;)Z

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    return p1

    .line 12
    :cond_0
    const/4 p1, 0x0

    .line 13
    return p1
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
.end method

.method public setOnValueChangeListenerInScrolling(Lcom/henninghall/date_picker/pickers/a$b;)V
    .locals 0

    iput-object p1, p0, Lcom/henninghall/date_picker/pickers/IosClone;->P0:Lcom/henninghall/date_picker/pickers/a$b;

    return-void
.end method

.method public setOnValueChangedListener(Lcom/henninghall/date_picker/pickers/a$a;)V
    .locals 1

    new-instance v0, Lcom/henninghall/date_picker/pickers/IosClone$b;

    invoke-direct {v0, p0, p1}, Lcom/henninghall/date_picker/pickers/IosClone$b;-><init>(Lcom/henninghall/date_picker/pickers/IosClone;Lcom/henninghall/date_picker/pickers/a$a;)V

    invoke-super {p0, v0}, Lb2/a;->setOnValueChangedListener(Lb2/a$d;)V

    return-void
.end method

.method public setTextColor(Ljava/lang/String;)V
    .locals 3

    .line 1
    invoke-static {p1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    new-instance v1, Ljava/lang/StringBuilder;

    .line 6
    .line 7
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 8
    .line 9
    .line 10
    const-string v2, "#70"

    .line 11
    .line 12
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    const/4 v2, 0x1

    .line 16
    invoke-virtual {p1, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    invoke-static {p1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    invoke-virtual {p0, p1}, Lb2/a;->setNormalTextColor(I)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {p0, v0}, Lb2/a;->setSelectedTextColor(I)V

    .line 35
    .line 36
    .line 37
    return-void
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
