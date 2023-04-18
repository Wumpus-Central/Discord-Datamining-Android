.class Lm8/r$b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lm8/r$b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator<",
        "Lm8/r$b;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/os/Parcel;)Lm8/r$b;
    .locals 1

    new-instance v0, Lm8/r$b;

    invoke-direct {v0, p1}, Lm8/r$b;-><init>(Landroid/os/Parcel;)V

    return-object v0
.end method

.method public b(I)[Lm8/r$b;
    .locals 0

    new-array p1, p1, [Lm8/r$b;

    return-object p1
.end method

.method public bridge synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lm8/r$b$a;->a(Landroid/os/Parcel;)Lm8/r$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic newArray(I)[Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lm8/r$b$a;->b(I)[Lm8/r$b;

    move-result-object p1

    return-object p1
.end method
