.class final Lrd/o;
.super Lrd/q;
.source "SourceFile"


# instance fields
.field private final b:Ljava/lang/String;

.field private final c:I

.field private final d:Z


# direct methods
.method constructor <init>(ILjava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lrd/q;-><init>(I)V

    .line 2
    iput-object p2, p0, Lrd/o;->b:Ljava/lang/String;

    const/4 p1, 0x0

    .line 3
    iput-boolean p1, p0, Lrd/o;->d:Z

    .line 4
    iput p1, p0, Lrd/o;->c:I

    return-void
.end method

.method constructor <init>(ILjava/lang/String;I)V
    .locals 0

    .line 5
    invoke-direct {p0, p1}, Lrd/q;-><init>(I)V

    const/4 p1, 0x1

    .line 6
    iput-boolean p1, p0, Lrd/o;->d:Z

    .line 7
    iput p3, p0, Lrd/o;->c:I

    .line 8
    iput-object p2, p0, Lrd/o;->b:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method b()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lrd/o;->b:Ljava/lang/String;

    return-object v0
.end method

.method c()I
    .locals 1

    iget v0, p0, Lrd/o;->c:I

    return v0
.end method

.method d()Z
    .locals 1

    iget-boolean v0, p0, Lrd/o;->d:Z

    return v0
.end method
