.class public final Lab/l;
.super Lx9/a;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lab/l;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field final k:I

.field private final l:Lt9/a;

.field private final m:Lw9/q0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lab/m;

    invoke-direct {v0}, Lab/m;-><init>()V

    sput-object v0, Lab/l;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method constructor <init>(ILt9/a;Lw9/q0;)V
    .locals 0

    invoke-direct {p0}, Lx9/a;-><init>()V

    iput p1, p0, Lab/l;->k:I

    iput-object p2, p0, Lab/l;->l:Lt9/a;

    iput-object p3, p0, Lab/l;->m:Lw9/q0;

    return-void
.end method


# virtual methods
.method public final v()Lt9/a;
    .locals 1

    iget-object v0, p0, Lab/l;->l:Lt9/a;

    return-object v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 4

    .line 1
    invoke-static {p1}, Lx9/c;->a(Landroid/os/Parcel;)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x1

    .line 6
    iget v2, p0, Lab/l;->k:I

    .line 7
    .line 8
    invoke-static {p1, v1, v2}, Lx9/c;->j(Landroid/os/Parcel;II)V

    .line 9
    .line 10
    .line 11
    iget-object v1, p0, Lab/l;->l:Lt9/a;

    .line 12
    .line 13
    const/4 v2, 0x2

    .line 14
    const/4 v3, 0x0

    .line 15
    invoke-static {p1, v2, v1, p2, v3}, Lx9/c;->n(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    .line 16
    .line 17
    .line 18
    const/4 v1, 0x3

    .line 19
    iget-object v2, p0, Lab/l;->m:Lw9/q0;

    .line 20
    .line 21
    invoke-static {p1, v1, v2, p2, v3}, Lx9/c;->n(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    .line 22
    .line 23
    .line 24
    invoke-static {p1, v0}, Lx9/c;->b(Landroid/os/Parcel;I)V

    .line 25
    .line 26
    .line 27
    return-void
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

.method public final z()Lw9/q0;
    .locals 1

    iget-object v0, p0, Lab/l;->m:Lw9/q0;

    return-object v0
.end method
