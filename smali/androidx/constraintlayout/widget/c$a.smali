.class public Landroidx/constraintlayout/widget/c$a;
.super Landroidx/constraintlayout/widget/ConstraintLayout$LayoutParams;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/constraintlayout/widget/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field public A0:F

.field public B0:F

.field public p0:F

.field public q0:Z

.field public r0:F

.field public s0:F

.field public t0:F

.field public u0:F

.field public v0:F

.field public w0:F

.field public x0:F

.field public y0:F

.field public z0:F


# direct methods
.method public constructor <init>(II)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Landroidx/constraintlayout/widget/ConstraintLayout$LayoutParams;-><init>(II)V

    const/high16 p1, 0x3f800000    # 1.0f

    .line 2
    iput p1, p0, Landroidx/constraintlayout/widget/c$a;->p0:F

    const/4 p2, 0x0

    .line 3
    iput-boolean p2, p0, Landroidx/constraintlayout/widget/c$a;->q0:Z

    const/4 p2, 0x0

    .line 4
    iput p2, p0, Landroidx/constraintlayout/widget/c$a;->r0:F

    .line 5
    iput p2, p0, Landroidx/constraintlayout/widget/c$a;->s0:F

    .line 6
    iput p2, p0, Landroidx/constraintlayout/widget/c$a;->t0:F

    .line 7
    iput p2, p0, Landroidx/constraintlayout/widget/c$a;->u0:F

    .line 8
    iput p1, p0, Landroidx/constraintlayout/widget/c$a;->v0:F

    .line 9
    iput p1, p0, Landroidx/constraintlayout/widget/c$a;->w0:F

    .line 10
    iput p2, p0, Landroidx/constraintlayout/widget/c$a;->x0:F

    .line 11
    iput p2, p0, Landroidx/constraintlayout/widget/c$a;->y0:F

    .line 12
    iput p2, p0, Landroidx/constraintlayout/widget/c$a;->z0:F

    .line 13
    iput p2, p0, Landroidx/constraintlayout/widget/c$a;->A0:F

    .line 14
    iput p2, p0, Landroidx/constraintlayout/widget/c$a;->B0:F

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 3

    .line 15
    invoke-direct {p0, p1, p2}, Landroidx/constraintlayout/widget/ConstraintLayout$LayoutParams;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/high16 v0, 0x3f800000    # 1.0f

    .line 16
    iput v0, p0, Landroidx/constraintlayout/widget/c$a;->p0:F

    const/4 v1, 0x0

    .line 17
    iput-boolean v1, p0, Landroidx/constraintlayout/widget/c$a;->q0:Z

    const/4 v2, 0x0

    .line 18
    iput v2, p0, Landroidx/constraintlayout/widget/c$a;->r0:F

    .line 19
    iput v2, p0, Landroidx/constraintlayout/widget/c$a;->s0:F

    .line 20
    iput v2, p0, Landroidx/constraintlayout/widget/c$a;->t0:F

    .line 21
    iput v2, p0, Landroidx/constraintlayout/widget/c$a;->u0:F

    .line 22
    iput v0, p0, Landroidx/constraintlayout/widget/c$a;->v0:F

    .line 23
    iput v0, p0, Landroidx/constraintlayout/widget/c$a;->w0:F

    .line 24
    iput v2, p0, Landroidx/constraintlayout/widget/c$a;->x0:F

    .line 25
    iput v2, p0, Landroidx/constraintlayout/widget/c$a;->y0:F

    .line 26
    iput v2, p0, Landroidx/constraintlayout/widget/c$a;->z0:F

    .line 27
    iput v2, p0, Landroidx/constraintlayout/widget/c$a;->A0:F

    .line 28
    iput v2, p0, Landroidx/constraintlayout/widget/c$a;->B0:F

    .line 29
    sget-object v0, Landroidx/constraintlayout/widget/f;->o2:[I

    invoke-virtual {p1, p2, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p1

    .line 30
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->getIndexCount()I

    move-result p2

    :goto_0
    if-ge v1, p2, :cond_c

    .line 31
    invoke-virtual {p1, v1}, Landroid/content/res/TypedArray;->getIndex(I)I

    move-result v0

    .line 32
    sget v2, Landroidx/constraintlayout/widget/f;->p2:I

    if-ne v0, v2, :cond_0

    .line 33
    iget v2, p0, Landroidx/constraintlayout/widget/c$a;->p0:F

    invoke-virtual {p1, v0, v2}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v0

    iput v0, p0, Landroidx/constraintlayout/widget/c$a;->p0:F

    goto/16 :goto_1

    .line 34
    :cond_0
    sget v2, Landroidx/constraintlayout/widget/f;->A2:I

    if-ne v0, v2, :cond_1

    .line 35
    iget v2, p0, Landroidx/constraintlayout/widget/c$a;->r0:F

    invoke-virtual {p1, v0, v2}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v0

    iput v0, p0, Landroidx/constraintlayout/widget/c$a;->r0:F

    const/4 v0, 0x1

    .line 36
    iput-boolean v0, p0, Landroidx/constraintlayout/widget/c$a;->q0:Z

    goto/16 :goto_1

    .line 37
    :cond_1
    sget v2, Landroidx/constraintlayout/widget/f;->x2:I

    if-ne v0, v2, :cond_2

    .line 38
    iget v2, p0, Landroidx/constraintlayout/widget/c$a;->t0:F

    invoke-virtual {p1, v0, v2}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v0

    iput v0, p0, Landroidx/constraintlayout/widget/c$a;->t0:F

    goto/16 :goto_1

    .line 39
    :cond_2
    sget v2, Landroidx/constraintlayout/widget/f;->y2:I

    if-ne v0, v2, :cond_3

    .line 40
    iget v2, p0, Landroidx/constraintlayout/widget/c$a;->u0:F

    invoke-virtual {p1, v0, v2}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v0

    iput v0, p0, Landroidx/constraintlayout/widget/c$a;->u0:F

    goto/16 :goto_1

    .line 41
    :cond_3
    sget v2, Landroidx/constraintlayout/widget/f;->w2:I

    if-ne v0, v2, :cond_4

    .line 42
    iget v2, p0, Landroidx/constraintlayout/widget/c$a;->s0:F

    invoke-virtual {p1, v0, v2}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v0

    iput v0, p0, Landroidx/constraintlayout/widget/c$a;->s0:F

    goto :goto_1

    .line 43
    :cond_4
    sget v2, Landroidx/constraintlayout/widget/f;->u2:I

    if-ne v0, v2, :cond_5

    .line 44
    iget v2, p0, Landroidx/constraintlayout/widget/c$a;->v0:F

    invoke-virtual {p1, v0, v2}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v0

    iput v0, p0, Landroidx/constraintlayout/widget/c$a;->v0:F

    goto :goto_1

    .line 45
    :cond_5
    sget v2, Landroidx/constraintlayout/widget/f;->v2:I

    if-ne v0, v2, :cond_6

    .line 46
    iget v2, p0, Landroidx/constraintlayout/widget/c$a;->w0:F

    invoke-virtual {p1, v0, v2}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v0

    iput v0, p0, Landroidx/constraintlayout/widget/c$a;->w0:F

    goto :goto_1

    .line 47
    :cond_6
    sget v2, Landroidx/constraintlayout/widget/f;->q2:I

    if-ne v0, v2, :cond_7

    .line 48
    iget v2, p0, Landroidx/constraintlayout/widget/c$a;->x0:F

    invoke-virtual {p1, v0, v2}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v0

    iput v0, p0, Landroidx/constraintlayout/widget/c$a;->x0:F

    goto :goto_1

    .line 49
    :cond_7
    sget v2, Landroidx/constraintlayout/widget/f;->r2:I

    if-ne v0, v2, :cond_8

    .line 50
    iget v2, p0, Landroidx/constraintlayout/widget/c$a;->y0:F

    invoke-virtual {p1, v0, v2}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v0

    iput v0, p0, Landroidx/constraintlayout/widget/c$a;->y0:F

    goto :goto_1

    .line 51
    :cond_8
    sget v2, Landroidx/constraintlayout/widget/f;->s2:I

    if-ne v0, v2, :cond_9

    .line 52
    iget v2, p0, Landroidx/constraintlayout/widget/c$a;->z0:F

    invoke-virtual {p1, v0, v2}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v0

    iput v0, p0, Landroidx/constraintlayout/widget/c$a;->z0:F

    goto :goto_1

    .line 53
    :cond_9
    sget v2, Landroidx/constraintlayout/widget/f;->t2:I

    if-ne v0, v2, :cond_a

    .line 54
    iget v2, p0, Landroidx/constraintlayout/widget/c$a;->A0:F

    invoke-virtual {p1, v0, v2}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v0

    iput v0, p0, Landroidx/constraintlayout/widget/c$a;->A0:F

    goto :goto_1

    .line 55
    :cond_a
    sget v2, Landroidx/constraintlayout/widget/f;->z2:I

    if-ne v0, v2, :cond_b

    .line 56
    iget v2, p0, Landroidx/constraintlayout/widget/c$a;->B0:F

    invoke-virtual {p1, v0, v2}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v0

    iput v0, p0, Landroidx/constraintlayout/widget/c$a;->B0:F

    :cond_b
    :goto_1
    add-int/lit8 v1, v1, 0x1

    goto/16 :goto_0

    :cond_c
    return-void
.end method
