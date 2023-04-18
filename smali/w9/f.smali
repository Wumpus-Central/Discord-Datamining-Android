.class public Lw9/f;
.super Lx9/a;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lw9/f;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field final k:I

.field final l:I

.field m:I

.field n:Ljava/lang/String;

.field o:Landroid/os/IBinder;

.field p:[Lcom/google/android/gms/common/api/Scope;

.field q:Landroid/os/Bundle;

.field r:Landroid/accounts/Account;

.field s:[Lt9/c;

.field t:[Lt9/c;

.field u:Z

.field v:I

.field w:Z

.field private x:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lw9/h1;

    invoke-direct {v0}, Lw9/h1;-><init>()V

    sput-object v0, Lw9/f;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method constructor <init>(IIILjava/lang/String;Landroid/os/IBinder;[Lcom/google/android/gms/common/api/Scope;Landroid/os/Bundle;Landroid/accounts/Account;[Lt9/c;[Lt9/c;ZIZLjava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lx9/a;-><init>()V

    iput p1, p0, Lw9/f;->k:I

    iput p2, p0, Lw9/f;->l:I

    iput p3, p0, Lw9/f;->m:I

    const-string p2, "com.google.android.gms"

    invoke-virtual {p2, p4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_0

    iput-object p2, p0, Lw9/f;->n:Ljava/lang/String;

    goto :goto_0

    .line 2
    :cond_0
    iput-object p4, p0, Lw9/f;->n:Ljava/lang/String;

    :goto_0
    const/4 p2, 0x2

    if-ge p1, p2, :cond_2

    if-eqz p5, :cond_1

    .line 3
    invoke-static {p5}, Lw9/j$a;->d(Landroid/os/IBinder;)Lw9/j;

    move-result-object p1

    .line 4
    invoke-static {p1}, Lw9/a;->e(Lw9/j;)Landroid/accounts/Account;

    move-result-object p1

    goto :goto_1

    :cond_1
    const/4 p1, 0x0

    :goto_1
    iput-object p1, p0, Lw9/f;->r:Landroid/accounts/Account;

    goto :goto_2

    :cond_2
    iput-object p5, p0, Lw9/f;->o:Landroid/os/IBinder;

    iput-object p8, p0, Lw9/f;->r:Landroid/accounts/Account;

    :goto_2
    iput-object p6, p0, Lw9/f;->p:[Lcom/google/android/gms/common/api/Scope;

    iput-object p7, p0, Lw9/f;->q:Landroid/os/Bundle;

    iput-object p9, p0, Lw9/f;->s:[Lt9/c;

    iput-object p10, p0, Lw9/f;->t:[Lt9/c;

    iput-boolean p11, p0, Lw9/f;->u:Z

    iput p12, p0, Lw9/f;->v:I

    iput-boolean p13, p0, Lw9/f;->w:Z

    iput-object p14, p0, Lw9/f;->x:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(ILjava/lang/String;)V
    .locals 1

    .line 5
    invoke-direct {p0}, Lx9/a;-><init>()V

    const/4 v0, 0x6

    iput v0, p0, Lw9/f;->k:I

    sget v0, Lt9/g;->a:I

    iput v0, p0, Lw9/f;->m:I

    iput p1, p0, Lw9/f;->l:I

    const/4 p1, 0x1

    iput-boolean p1, p0, Lw9/f;->u:Z

    iput-object p2, p0, Lw9/f;->x:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final v()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lw9/f;->x:Ljava/lang/String;

    return-object v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    invoke-static {p0, p1, p2}, Lw9/h1;->a(Lw9/f;Landroid/os/Parcel;I)V

    return-void
.end method
