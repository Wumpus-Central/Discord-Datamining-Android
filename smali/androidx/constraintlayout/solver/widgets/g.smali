.class public Landroidx/constraintlayout/solver/widgets/g;
.super Lx0/b;
.source "SourceFile"


# instance fields
.field private A0:I

.field private B0:I

.field private C0:I

.field private D0:I

.field private E0:I

.field private F0:I

.field private G0:Z

.field private H0:I

.field private I0:I

.field protected J0:Ly0/b$a;

.field K0:Ly0/b$b;

.field private y0:I

.field private z0:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lx0/b;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput v0, p0, Landroidx/constraintlayout/solver/widgets/g;->y0:I

    .line 6
    .line 7
    iput v0, p0, Landroidx/constraintlayout/solver/widgets/g;->z0:I

    .line 8
    .line 9
    iput v0, p0, Landroidx/constraintlayout/solver/widgets/g;->A0:I

    .line 10
    .line 11
    iput v0, p0, Landroidx/constraintlayout/solver/widgets/g;->B0:I

    .line 12
    .line 13
    iput v0, p0, Landroidx/constraintlayout/solver/widgets/g;->C0:I

    .line 14
    .line 15
    iput v0, p0, Landroidx/constraintlayout/solver/widgets/g;->D0:I

    .line 16
    .line 17
    iput v0, p0, Landroidx/constraintlayout/solver/widgets/g;->E0:I

    .line 18
    .line 19
    iput v0, p0, Landroidx/constraintlayout/solver/widgets/g;->F0:I

    .line 20
    .line 21
    iput-boolean v0, p0, Landroidx/constraintlayout/solver/widgets/g;->G0:Z

    .line 22
    .line 23
    iput v0, p0, Landroidx/constraintlayout/solver/widgets/g;->H0:I

    .line 24
    .line 25
    iput v0, p0, Landroidx/constraintlayout/solver/widgets/g;->I0:I

    .line 26
    .line 27
    new-instance v0, Ly0/b$a;

    .line 28
    .line 29
    invoke-direct {v0}, Ly0/b$a;-><init>()V

    .line 30
    .line 31
    .line 32
    iput-object v0, p0, Landroidx/constraintlayout/solver/widgets/g;->J0:Ly0/b$a;

    .line 33
    .line 34
    const/4 v0, 0x0

    .line 35
    iput-object v0, p0, Landroidx/constraintlayout/solver/widgets/g;->K0:Ly0/b$b;

    .line 36
    .line 37
    return-void
    .line 38
    .line 39
    .line 40
.end method


# virtual methods
.method public H0()V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    :goto_0
    iget v1, p0, Lx0/b;->x0:I

    .line 3
    .line 4
    if-ge v0, v1, :cond_1

    .line 5
    .line 6
    iget-object v1, p0, Lx0/b;->w0:[Landroidx/constraintlayout/solver/widgets/ConstraintWidget;

    .line 7
    .line 8
    aget-object v1, v1, v0

    .line 9
    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    const/4 v2, 0x1

    .line 13
    invoke-virtual {v1, v2}, Landroidx/constraintlayout/solver/widgets/ConstraintWidget;->n0(Z)V

    .line 14
    .line 15
    .line 16
    :cond_0
    add-int/lit8 v0, v0, 0x1

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_1
    return-void
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
.end method

.method public I0()Z
    .locals 1

    iget-boolean v0, p0, Landroidx/constraintlayout/solver/widgets/g;->G0:Z

    return v0
.end method

.method public c(Landroidx/constraintlayout/solver/widgets/ConstraintWidgetContainer;)V
    .locals 0

    invoke-virtual {p0}, Landroidx/constraintlayout/solver/widgets/g;->H0()V

    return-void
.end method
