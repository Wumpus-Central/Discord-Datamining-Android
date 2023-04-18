.class Lw0/g$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lw0/g;->F(Lw0/h;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/Comparator<",
        "Lw0/h;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic k:Lw0/g;


# direct methods
.method constructor <init>(Lw0/g;)V
    .locals 0

    iput-object p1, p0, Lw0/g$a;->k:Lw0/g;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lw0/h;Lw0/h;)I
    .locals 0

    iget p1, p1, Lw0/h;->c:I

    iget p2, p2, Lw0/h;->c:I

    sub-int/2addr p1, p2

    return p1
.end method

.method public bridge synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 0

    check-cast p1, Lw0/h;

    check-cast p2, Lw0/h;

    invoke-virtual {p0, p1, p2}, Lw0/g$a;->a(Lw0/h;Lw0/h;)I

    move-result p1

    return p1
.end method
