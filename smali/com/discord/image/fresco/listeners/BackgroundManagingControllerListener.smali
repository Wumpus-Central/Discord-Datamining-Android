.class public final Lcom/discord/image/fresco/listeners/BackgroundManagingControllerListener;
.super Lcom/discord/image/fresco/listeners/ControllerListener;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\u0008\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0007\u0012\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u0007\u0012\u0008\u0008\u0002\u0010\t\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\nJ\u001c\u0010\u000b\u001a\u00020\u000c2\u0008\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016J&\u0010\u0011\u001a\u00020\u000c2\u0008\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J\u001c\u0010\u0016\u001a\u00020\u000c2\u0008\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0008\u0010\u0017\u001a\u0004\u0018\u00010\u0013H\u0016J\u0010\u0010\u0018\u001a\u00020\u000c2\u0006\u0010\u0019\u001a\u00020\u0007H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0008\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"
    }
    d2 = {
        "Lcom/discord/image/fresco/listeners/BackgroundManagingControllerListener;",
        "Lcom/discord/image/fresco/listeners/ControllerListener;",
        "draweeView",
        "Lcom/facebook/drawee/view/SimpleDraweeView;",
        "background",
        "Landroid/graphics/drawable/Drawable;",
        "showDuringRequest",
        "",
        "showAfterSuccess",
        "showAfterFail",
        "(Lcom/facebook/drawee/view/SimpleDraweeView;Landroid/graphics/drawable/Drawable;ZZZ)V",
        "onFailure",
        "",
        "id",
        "",
        "throwable",
        "",
        "onFinalImageSet",
        "imageInfo",
        "",
        "animatable",
        "Landroid/graphics/drawable/Animatable;",
        "onSubmit",
        "callerContext",
        "showBackgroundBy",
        "condition",
        "fresco_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final background:Landroid/graphics/drawable/Drawable;

.field private final draweeView:Lcom/facebook/drawee/view/SimpleDraweeView;

.field private final showAfterFail:Z

.field private final showAfterSuccess:Z

.field private final showDuringRequest:Z


# direct methods
.method public constructor <init>(Lcom/facebook/drawee/view/SimpleDraweeView;Landroid/graphics/drawable/Drawable;ZZZ)V
    .locals 1

    const-string v0, "draweeView"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "background"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Lcom/discord/image/fresco/listeners/ControllerListener;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/discord/image/fresco/listeners/BackgroundManagingControllerListener;->draweeView:Lcom/facebook/drawee/view/SimpleDraweeView;

    .line 4
    iput-object p2, p0, Lcom/discord/image/fresco/listeners/BackgroundManagingControllerListener;->background:Landroid/graphics/drawable/Drawable;

    .line 5
    iput-boolean p3, p0, Lcom/discord/image/fresco/listeners/BackgroundManagingControllerListener;->showDuringRequest:Z

    .line 6
    iput-boolean p4, p0, Lcom/discord/image/fresco/listeners/BackgroundManagingControllerListener;->showAfterSuccess:Z

    .line 7
    iput-boolean p5, p0, Lcom/discord/image/fresco/listeners/BackgroundManagingControllerListener;->showAfterFail:Z

    return-void
.end method

.method public synthetic constructor <init>(Lcom/facebook/drawee/view/SimpleDraweeView;Landroid/graphics/drawable/Drawable;ZZZILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 7

    and-int/lit8 p7, p6, 0x4

    const/4 v0, 0x1

    if-eqz p7, :cond_0

    move v4, v0

    goto :goto_0

    :cond_0
    move v4, p3

    :goto_0
    and-int/lit8 p3, p6, 0x8

    if-eqz p3, :cond_1

    const/4 p4, 0x0

    :cond_1
    move v5, p4

    and-int/lit8 p3, p6, 0x10

    if-eqz p3, :cond_2

    move v6, v0

    goto :goto_1

    :cond_2
    move v6, p5

    :goto_1
    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    .line 1
    invoke-direct/range {v1 .. v6}, Lcom/discord/image/fresco/listeners/BackgroundManagingControllerListener;-><init>(Lcom/facebook/drawee/view/SimpleDraweeView;Landroid/graphics/drawable/Drawable;ZZZ)V

    return-void
.end method

.method private final showBackgroundBy(Z)V
    .locals 1

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    iget-object p1, p0, Lcom/discord/image/fresco/listeners/BackgroundManagingControllerListener;->draweeView:Lcom/facebook/drawee/view/SimpleDraweeView;

    .line 4
    .line 5
    invoke-virtual {p1}, Lcom/facebook/drawee/view/a;->getHierarchy()Lcom/facebook/drawee/interfaces/DraweeHierarchy;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Lcom/facebook/drawee/generic/GenericDraweeHierarchy;

    .line 10
    .line 11
    iget-object v0, p0, Lcom/discord/image/fresco/listeners/BackgroundManagingControllerListener;->background:Landroid/graphics/drawable/Drawable;

    .line 12
    .line 13
    invoke-virtual {p1, v0}, Lcom/facebook/drawee/generic/GenericDraweeHierarchy;->u(Landroid/graphics/drawable/Drawable;)V

    .line 14
    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    iget-object p1, p0, Lcom/discord/image/fresco/listeners/BackgroundManagingControllerListener;->draweeView:Lcom/facebook/drawee/view/SimpleDraweeView;

    .line 18
    .line 19
    invoke-virtual {p1}, Lcom/facebook/drawee/view/a;->getHierarchy()Lcom/facebook/drawee/interfaces/DraweeHierarchy;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    check-cast p1, Lcom/facebook/drawee/generic/GenericDraweeHierarchy;

    .line 24
    .line 25
    const/4 v0, 0x0

    .line 26
    invoke-virtual {p1, v0}, Lcom/facebook/drawee/generic/GenericDraweeHierarchy;->u(Landroid/graphics/drawable/Drawable;)V

    .line 27
    .line 28
    .line 29
    :goto_0
    return-void
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
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
.end method


# virtual methods
.method public onFailure(Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 0

    iget-boolean p1, p0, Lcom/discord/image/fresco/listeners/BackgroundManagingControllerListener;->showAfterFail:Z

    invoke-direct {p0, p1}, Lcom/discord/image/fresco/listeners/BackgroundManagingControllerListener;->showBackgroundBy(Z)V

    return-void
.end method

.method public onFinalImageSet(Ljava/lang/String;Ljava/lang/Object;Landroid/graphics/drawable/Animatable;)V
    .locals 0

    iget-boolean p1, p0, Lcom/discord/image/fresco/listeners/BackgroundManagingControllerListener;->showAfterSuccess:Z

    invoke-direct {p0, p1}, Lcom/discord/image/fresco/listeners/BackgroundManagingControllerListener;->showBackgroundBy(Z)V

    return-void
.end method

.method public onSubmit(Ljava/lang/String;Ljava/lang/Object;)V
    .locals 0

    iget-boolean p1, p0, Lcom/discord/image/fresco/listeners/BackgroundManagingControllerListener;->showDuringRequest:Z

    invoke-direct {p0, p1}, Lcom/discord/image/fresco/listeners/BackgroundManagingControllerListener;->showBackgroundBy(Z)V

    return-void
.end method
