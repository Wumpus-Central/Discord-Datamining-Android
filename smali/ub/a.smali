.class public Lub/a;
.super Landroid/graphics/drawable/Drawable;
.source "SourceFile"

# interfaces
.implements Lwb/n;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lub/a$b;
    }
.end annotation


# instance fields
.field private k:Lub/a$b;


# direct methods
.method private constructor <init>(Lub/a$b;)V
    .locals 0

    .line 3
    invoke-direct {p0}, Landroid/graphics/drawable/Drawable;-><init>()V

    .line 4
    iput-object p1, p0, Lub/a;->k:Lub/a$b;

    return-void
.end method

.method synthetic constructor <init>(Lub/a$b;Lub/a$a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lub/a;-><init>(Lub/a$b;)V

    return-void
.end method

.method public constructor <init>(Lwb/k;)V
    .locals 2

    .line 2
    new-instance v0, Lub/a$b;

    new-instance v1, Lwb/g;

    invoke-direct {v1, p1}, Lwb/g;-><init>(Lwb/k;)V

    invoke-direct {v0, v1}, Lub/a$b;-><init>(Lwb/g;)V

    invoke-direct {p0, v0}, Lub/a;-><init>(Lub/a$b;)V

    return-void
.end method


# virtual methods
.method public a()Lub/a;
    .locals 2

    .line 1
    new-instance v0, Lub/a$b;

    .line 2
    .line 3
    iget-object v1, p0, Lub/a;->k:Lub/a$b;

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lub/a$b;-><init>(Lub/a$b;)V

    .line 6
    .line 7
    .line 8
    iput-object v0, p0, Lub/a;->k:Lub/a$b;

    .line 9
    .line 10
    return-object p0
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

.method public draw(Landroid/graphics/Canvas;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lub/a;->k:Lub/a$b;

    .line 2
    .line 3
    iget-boolean v1, v0, Lub/a$b;->b:Z

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    iget-object v0, v0, Lub/a$b;->a:Lwb/g;

    .line 8
    .line 9
    invoke-virtual {v0, p1}, Lwb/g;->draw(Landroid/graphics/Canvas;)V

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void
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

.method public getConstantState()Landroid/graphics/drawable/Drawable$ConstantState;
    .locals 1

    iget-object v0, p0, Lub/a;->k:Lub/a$b;

    return-object v0
.end method

.method public getOpacity()I
    .locals 1

    iget-object v0, p0, Lub/a;->k:Lub/a$b;

    iget-object v0, v0, Lub/a$b;->a:Lwb/g;

    invoke-virtual {v0}, Lwb/g;->getOpacity()I

    move-result v0

    return v0
.end method

.method public isStateful()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public bridge synthetic mutate()Landroid/graphics/drawable/Drawable;
    .locals 1

    invoke-virtual {p0}, Lub/a;->a()Lub/a;

    move-result-object v0

    return-object v0
.end method

.method protected onBoundsChange(Landroid/graphics/Rect;)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, Landroid/graphics/drawable/Drawable;->onBoundsChange(Landroid/graphics/Rect;)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lub/a;->k:Lub/a$b;

    .line 5
    .line 6
    iget-object v0, v0, Lub/a$b;->a:Lwb/g;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->setBounds(Landroid/graphics/Rect;)V

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
.end method

.method protected onStateChange([I)Z
    .locals 4

    .line 1
    invoke-super {p0, p1}, Landroid/graphics/drawable/Drawable;->onStateChange([I)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iget-object v1, p0, Lub/a;->k:Lub/a$b;

    .line 6
    .line 7
    iget-object v1, v1, Lub/a$b;->a:Lwb/g;

    .line 8
    .line 9
    invoke-virtual {v1, p1}, Landroid/graphics/drawable/Drawable;->setState([I)Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    const/4 v2, 0x1

    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    move v0, v2

    .line 17
    :cond_0
    invoke-static {p1}, Lub/b;->b([I)Z

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    iget-object v1, p0, Lub/a;->k:Lub/a$b;

    .line 22
    .line 23
    iget-boolean v3, v1, Lub/a$b;->b:Z

    .line 24
    .line 25
    if-eq v3, p1, :cond_1

    .line 26
    .line 27
    iput-boolean p1, v1, Lub/a$b;->b:Z

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_1
    move v2, v0

    .line 31
    :goto_0
    return v2
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

.method public setAlpha(I)V
    .locals 1

    iget-object v0, p0, Lub/a;->k:Lub/a$b;

    iget-object v0, v0, Lub/a$b;->a:Lwb/g;

    invoke-virtual {v0, p1}, Lwb/g;->setAlpha(I)V

    return-void
.end method

.method public setColorFilter(Landroid/graphics/ColorFilter;)V
    .locals 1

    iget-object v0, p0, Lub/a;->k:Lub/a$b;

    iget-object v0, v0, Lub/a$b;->a:Lwb/g;

    invoke-virtual {v0, p1}, Lwb/g;->setColorFilter(Landroid/graphics/ColorFilter;)V

    return-void
.end method

.method public setShapeAppearanceModel(Lwb/k;)V
    .locals 1

    iget-object v0, p0, Lub/a;->k:Lub/a$b;

    iget-object v0, v0, Lub/a$b;->a:Lwb/g;

    invoke-virtual {v0, p1}, Lwb/g;->setShapeAppearanceModel(Lwb/k;)V

    return-void
.end method

.method public setTint(I)V
    .locals 1

    iget-object v0, p0, Lub/a;->k:Lub/a$b;

    iget-object v0, v0, Lub/a$b;->a:Lwb/g;

    invoke-virtual {v0, p1}, Lwb/g;->setTint(I)V

    return-void
.end method

.method public setTintList(Landroid/content/res/ColorStateList;)V
    .locals 1

    iget-object v0, p0, Lub/a;->k:Lub/a$b;

    iget-object v0, v0, Lub/a$b;->a:Lwb/g;

    invoke-virtual {v0, p1}, Lwb/g;->setTintList(Landroid/content/res/ColorStateList;)V

    return-void
.end method

.method public setTintMode(Landroid/graphics/PorterDuff$Mode;)V
    .locals 1

    iget-object v0, p0, Lub/a;->k:Lub/a$b;

    iget-object v0, v0, Lub/a$b;->a:Lwb/g;

    invoke-virtual {v0, p1}, Lwb/g;->setTintMode(Landroid/graphics/PorterDuff$Mode;)V

    return-void
.end method
