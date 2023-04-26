.class public Lcom/th3rdwave/safeareacontext/SafeAreaProvider;
.super Lcom/facebook/react/views/view/ReactViewGroup;
.source "SourceFile"

# interfaces
.implements Landroid/view/ViewTreeObserver$OnPreDrawListener;


# annotations
.annotation build Landroid/annotation/SuppressLint;
    value = {
        "ViewConstructor"
    }
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/th3rdwave/safeareacontext/SafeAreaProvider$a;
    }
.end annotation


# instance fields
.field private k:Lcom/th3rdwave/safeareacontext/SafeAreaProvider$a;

.field private l:Lcom/th3rdwave/safeareacontext/EdgeInsets;

.field private m:Lcom/th3rdwave/safeareacontext/Rect;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/facebook/react/views/view/ReactViewGroup;-><init>(Landroid/content/Context;)V

    return-void
.end method

.method private a()V
    .locals 4

    .line 1
    invoke-static {p0}, Lcom/th3rdwave/safeareacontext/c;->c(Landroid/view/View;)Lcom/th3rdwave/safeareacontext/EdgeInsets;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0}, Landroid/view/View;->getRootView()Landroid/view/View;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    check-cast v1, Landroid/view/ViewGroup;

    .line 10
    .line 11
    invoke-static {v1, p0}, Lcom/th3rdwave/safeareacontext/c;->a(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/th3rdwave/safeareacontext/Rect;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    if-eqz v1, :cond_1

    .line 18
    .line 19
    iget-object v2, p0, Lcom/th3rdwave/safeareacontext/SafeAreaProvider;->l:Lcom/th3rdwave/safeareacontext/EdgeInsets;

    .line 20
    .line 21
    if-eqz v2, :cond_0

    .line 22
    .line 23
    iget-object v3, p0, Lcom/th3rdwave/safeareacontext/SafeAreaProvider;->m:Lcom/th3rdwave/safeareacontext/Rect;

    .line 24
    .line 25
    if-eqz v3, :cond_0

    .line 26
    .line 27
    invoke-virtual {v2, v0}, Lcom/th3rdwave/safeareacontext/EdgeInsets;->a(Lcom/th3rdwave/safeareacontext/EdgeInsets;)Z

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    if-eqz v2, :cond_0

    .line 32
    .line 33
    iget-object v2, p0, Lcom/th3rdwave/safeareacontext/SafeAreaProvider;->m:Lcom/th3rdwave/safeareacontext/Rect;

    .line 34
    .line 35
    invoke-virtual {v2, v1}, Lcom/th3rdwave/safeareacontext/Rect;->a(Lcom/th3rdwave/safeareacontext/Rect;)Z

    .line 36
    .line 37
    .line 38
    move-result v2

    .line 39
    if-nez v2, :cond_1

    .line 40
    .line 41
    :cond_0
    iget-object v2, p0, Lcom/th3rdwave/safeareacontext/SafeAreaProvider;->k:Lcom/th3rdwave/safeareacontext/SafeAreaProvider$a;

    .line 42
    .line 43
    invoke-static {v2}, Lc6/a;->c(Ljava/lang/Object;)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    check-cast v2, Lcom/th3rdwave/safeareacontext/SafeAreaProvider$a;

    .line 48
    .line 49
    invoke-interface {v2, p0, v0, v1}, Lcom/th3rdwave/safeareacontext/SafeAreaProvider$a;->onInsetsChange(Lcom/th3rdwave/safeareacontext/SafeAreaProvider;Lcom/th3rdwave/safeareacontext/EdgeInsets;Lcom/th3rdwave/safeareacontext/Rect;)V

    .line 50
    .line 51
    .line 52
    iput-object v0, p0, Lcom/th3rdwave/safeareacontext/SafeAreaProvider;->l:Lcom/th3rdwave/safeareacontext/EdgeInsets;

    .line 53
    .line 54
    iput-object v1, p0, Lcom/th3rdwave/safeareacontext/SafeAreaProvider;->m:Lcom/th3rdwave/safeareacontext/Rect;

    .line 55
    .line 56
    :cond_1
    return-void
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
.end method


# virtual methods
.method protected onAttachedToWindow()V
    .locals 1

    .line 1
    invoke-super {p0}, Lcom/facebook/react/views/view/ReactViewGroup;->onAttachedToWindow()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-virtual {v0, p0}, Landroid/view/ViewTreeObserver;->addOnPreDrawListener(Landroid/view/ViewTreeObserver$OnPreDrawListener;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, Lcom/th3rdwave/safeareacontext/SafeAreaProvider;->a()V

    .line 12
    .line 13
    .line 14
    return-void
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
.end method

.method protected onDetachedFromWindow()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroid/view/ViewGroup;->onDetachedFromWindow()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-virtual {v0, p0}, Landroid/view/ViewTreeObserver;->removeOnPreDrawListener(Landroid/view/ViewTreeObserver$OnPreDrawListener;)V

    .line 9
    .line 10
    .line 11
    return-void
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
.end method

.method public onPreDraw()Z
    .locals 1

    invoke-direct {p0}, Lcom/th3rdwave/safeareacontext/SafeAreaProvider;->a()V

    const/4 v0, 0x1

    return v0
.end method

.method public setOnInsetsChangeListener(Lcom/th3rdwave/safeareacontext/SafeAreaProvider$a;)V
    .locals 0

    iput-object p1, p0, Lcom/th3rdwave/safeareacontext/SafeAreaProvider;->k:Lcom/th3rdwave/safeareacontext/SafeAreaProvider$a;

    return-void
.end method
