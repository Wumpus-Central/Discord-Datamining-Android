.class public final Lqa/x0;
.super Lx9/a;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lqa/x0;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field final k:I

.field final l:I

.field final m:[B

.field final n:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lqa/y0;

    invoke-direct {v0}, Lqa/y0;-><init>()V

    sput-object v0, Lqa/x0;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method constructor <init>(II[BZ)V
    .locals 0

    invoke-direct {p0}, Lx9/a;-><init>()V

    iput p1, p0, Lqa/x0;->k:I

    iput p2, p0, Lqa/x0;->l:I

    iput-object p3, p0, Lqa/x0;->m:[B

    iput-boolean p4, p0, Lqa/x0;->n:Z

    return-void
.end method


# virtual methods
.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 3

    .line 1
    invoke-static {p1}, Lx9/c;->a(Landroid/os/Parcel;)I

    .line 2
    .line 3
    .line 4
    move-result p2

    .line 5
    const/4 v0, 0x1

    .line 6
    iget v1, p0, Lqa/x0;->l:I

    .line 7
    .line 8
    invoke-static {p1, v0, v1}, Lx9/c;->j(Landroid/os/Parcel;II)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lqa/x0;->m:[B

    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    const/4 v2, 0x2

    .line 15
    invoke-static {p1, v2, v0, v1}, Lx9/c;->f(Landroid/os/Parcel;I[BZ)V

    .line 16
    .line 17
    .line 18
    const/4 v0, 0x3

    .line 19
    iget-boolean v1, p0, Lqa/x0;->n:Z

    .line 20
    .line 21
    invoke-static {p1, v0, v1}, Lx9/c;->c(Landroid/os/Parcel;IZ)V

    .line 22
    .line 23
    .line 24
    const/16 v0, 0x3e8

    .line 25
    .line 26
    iget v1, p0, Lqa/x0;->k:I

    .line 27
    .line 28
    invoke-static {p1, v0, v1}, Lx9/c;->j(Landroid/os/Parcel;II)V

    .line 29
    .line 30
    .line 31
    invoke-static {p1, p2}, Lx9/c;->b(Landroid/os/Parcel;I)V

    .line 32
    .line 33
    .line 34
    return-void
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
